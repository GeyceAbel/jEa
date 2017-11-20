/** Clase utilizada para control de acceso a aplicaciones (LogIn)
 * @author GEYCE S.A.- Eduard Roige
 * @client MAE
 * @version 1.0, 6/7/2000
 */
package mae.general;

import java.sql.*;
import java.io.FileInputStream;
import java.util.Properties;
import geyce.maefc.*;
import mae.modasp.db.CatEasp;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;

public class Login implements LoginListener{
	private DBConnection dbc;
	private LoginDialog ld=null;
	private String localDomain=null;
	private Aplication apl=null;
	private String dominio=null;	

	Login(Aplication apl, String rutaLogo){
		SystemView.setGui(true);
		//Leemos .properties
		properties(apl);

		ld=new LoginDialog(this,apl, rutaLogo);
		//Personalizamos el formulario de Login
		ld.setNameFrame("Identificación acceso "+apl.getTitle());
		ld.setNameLogin("Usuario :");
		ld.setMnemonicLogin('U');
		ld.setNamePassword("Contraseña :");
		ld.setMnemonicPassword('o');
		ld.setNameAccept(" Entrar ");
		ld.setNameCancel("Cancelar");
		inicializa();
		ld.setUsuarios(getUsuarios());
		ld.setUsuario(getUserDefault());
		ld.show();
	}

	//Leemos .properties
	private void properties(Aplication apl){
		this.apl=apl;
		//    MAE.setConsulado(1);
	}

	//Conectamos con la base de datos de Admon.
	private boolean conecta(){
		DataBase db=new DataBase();
		CatEasp cateasp = new CatEasp();
	    Catalog array[] = {
	    		cateasp
	      };
	    db.setCatalogs(array);
		db.setName("bdeasp");
		dbc=new DBConnection(db);
		if (dbc.connect()) return true;
		else return false;
	}


	//Recuperamos información en que dominio de consulado estamos y cual es la central.
	private void inicializa(){
		dominio=getDominio();
		if (!conecta()){
			cancel();
		}
	}

	public String getDominio() {
		dominio=Aplication.getAplication().getParameter("Dominio");
		if (dominio!=null && dominio.length() > 6)
			dominio=dominio.substring(0,6)+"000000";
		else dominio="999999000000";
		return dominio;
	}

	/**
	 * @return   usuarios
	 */
	private String[] getUsuarios(){
		try {
			Statement st=dbc.createStatement();
			ResultSet rsc=dbc.executeQuery(st,"select count(*) from USUARIO", false);
			String [] users=null;
			if (rsc.next())  {
				Statement stc=dbc.createStatement();
				ResultSet rs=dbc.executeQuery(stc,"select USLOGIN from USUARIO", false);
				users= new String[rsc.getInt(1)];
				int cont=0;
				while (rs.next()) {
					users[cont]=rs.getString("USLOGIN").trim();
					cont++;
				}
				rs.close();
			}
			rsc.close();
			return users;
		}
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Se ha producido la siguiente excepción:\n"+
					e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			cancel();
			return null;
		}
	}


	/**
	 * Comprueba si el usuario existe en Admon. Si existe devolvemos true, sino false.
	 *
	 * @return   boolean
	 */
	public boolean accept() {
		try {
			Statement st=dbc.createStatement();
			String funcio="UPPER";
			if (dbc.getDB().getType().equals("access"))  funcio="UCASE";
			String mylogin=ld.getLogin().toUpperCase();
			ResultSet rs=dbc.executeQuery(st,"select USPASSWD from USUARIO where "+funcio+"(USLOGIN)='"+mylogin+"'", false);
			if (rs.next()) {
				String pass=rs.getString("USPASSWD");
				rs.close();
				if ((pass!=null && pass.toUpperCase().equals(ld.getPassword().toUpperCase())) || (pass==null && ld.getPassword().equals(""))) {
					apl.setTitle(apl.getTitle()+" ("+mylogin.trim()+")");
					apl.setUser(mylogin.trim());
					setUserDefault(ld.getLogin());
					dbc.disconnect();
					return true;
				}
			}
		}
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, "Se ha producido la siguiente excepción:\n"+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			cancel();
			return false;
		}
		return false;
	}

	/**
	 * Cuando se cancele el formulario cerraremos la conexión a la base de datos
	 * y saldremos al sistema.
	 */
	public void cancel(){
		if (dbc.isConnected()) dbc.disconnect();
		Aplication.getAplication().exit();
	}


	public void open(){
		ld.abrir();
	}

	private String getUserDefault() {
		String machine = null;
		try {
			machine = java.net.InetAddress.getLocalHost().getHostName();
			//System.out.println("mi maquina es:"+machine);
		}
		catch (Exception ex){
			System.out.println("Error al acceder al nombre de máquina:"+ex.getMessage());
		}
		try {
			Statement st=dbc.createStatement();
			ResultSet rs=dbc.executeQuery(st,"select parusuario from parametros where "+
					"pardominio = '"+dominio+"' And parvalor = '"+machine+
					"' And parvariable = 'TERMINAL' And parambito = 'PERFIL USUARIO'", false);
			String user=null;
			if (rs.next()) {
				user=rs.getString("parusuario");
				rs.close();
			}
			st.close();
			return user;
		}
		catch (SQLException e ) {
			System.out.println("Error de SQL en getUserDefault:"+e.getMessage());
			return null ; // return "Admon";
		}
	}

	private void setUserDefault(String userLogin) {
		String machine=null;
		try {
			machine = java.net.InetAddress.getLocalHost().getHostName();
		}
		catch (Exception em) {
			System.out.println("Error al resolver la máquina("+machine+"):"+em.getMessage());
		}

		if ( machine == null ) return ;

		//APJORDI: Feia coses rares quan guardava el ultim usuari. ho simplifico
		
		Delete d = new Delete (dbc, "parametros");
		boolean bOk = d.execute("pardominio = '"+dominio+"' AND parvalor ='"+machine+"' AND parvariable = 'TERMINAL' AND parambito = 'PERFIL USUARIO'");
		if (bOk) {
			Insert in = new Insert (dbc, "parametros");
			in.valor("pardominio", dominio);
			in.valor("parusuario", userLogin);
			in.valor("parambito", "PERFIL USUARIO");
			in.valor("parvariable", "TERMINAL");
			in.valor("pardesc", "Nombre del Equipo/Terminal ultimo acceso");
			in.valor("paragrup", "JEA");
			in.valor("parvalor", machine);
			in.valor("parespecific", "N");
			bOk = in.execute();
		}
		if (bOk) dbc.commit();
		else dbc.rollback();

		
		/*
		
		String sentencia="SELECT parvalor FROM parametros WHERE pardominio = '"+dominio+"' AND parusuario = '"+userLogin+"' AND parvariable = 'TERMINAL' AND parambito = 'PERFIL USUARIO'";

		Statement stselect=null;
		Statement stgravar=null;
		try {
			stselect=dbc.createStatement(true);

			ResultSet rs=dbc.executeQuery(stselect,sentencia,true);
			int result=0;
			String valor=null;
			if (!rs.next()) { //fer l'insert
				stgravar=dbc.createStatement();
				sentencia="delete from parametros WHERE pardominio = '"+dominio+"' AND parvalor ='"+machine+"' AND parvariable = 'TERMINAL' AND parambito = 'PERFIL USUARIO'";
				//borrar reg on sigui la mateixa máquina
				result=dbc.executeUpdate(stgravar,sentencia,true);
				if (result > 0) dbc.commit();
				sentencia="insert into parametros (pardominio, parusuario,parambito,parvariable,pardesc,paragrup,parvalor,parespecific) "+
						"values ('"+dominio+"','"+userLogin+"','PERFIL USUARIO','TERMINAL','Nombre del Equipo/Terminal ultimo acceso',"+
						"'JEA','"+machine+"','N')";
				result=dbc.executeUpdate(stgravar,sentencia,true);
				if (result > 0) dbc.commit();
			}
			else  { //se actualiza la máquina
				valor=rs.getString("parvalor");
				if (!machine.equals(valor)) {
					sentencia="update parametros set parvalor='"+machine+"' where pardominio='"+dominio+
							"' and parusuario='"+userLogin+"' and parambito='PERFIL USUARIO' and parvariable='TERMINAL'";
					stgravar=dbc.createStatement();
					result=dbc.executeUpdate(stgravar,sentencia,true);
					if (result > 0) dbc.commit();
				}
			}
		}
		catch(SQLException ex) {
			System.out.println("Error de SQL:"+ex.getMessage());
			dbc.rollback();
		}
		finally {
			try {
				if (stselect!=null) stselect.close();
				if (stgravar!=null) stgravar.close();
			}
			catch(SQLException ex2) {
				System.out.println("Error al cerrar :"+ex2.getMessage());
			}
		}
		
		*/

	}



	/**
	 * Este método es llamado directamente desde las aplicaciones generadas por JEDICASE.
	 */
	public static void logIn(Aplication apl){
		//Login login=new Login(apl); 5-1-2001:
		apl.run();
	}

	//5-1-2001:
	public static void showLogIn(Aplication apl){
		showLogIn(apl, null);
	}
	public static void showLogIn(Aplication apl, String rutaLogo){
		Login login=new Login(apl, rutaLogo);
	}

	public static void showLogInAGPI(Aplication apl){
		//aquest serà un login diferent que demanarà
		// domini, usuari i contrassenya,
		// i verificarà amb VirtualFiscControl.verifyLogin
	}

}
