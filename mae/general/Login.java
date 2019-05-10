/** Clase utilizada para control de acceso a aplicaciones (LogIn)
 * @author GEYCE S.A.- Eduard Roige
 * @client MAE
 * @version 1.0, 6/7/2000
 */
package mae.general;

import java.sql.*;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Properties;

import geyce.maefc.*;
import mae.easp.general.Easp;
import mae.easp.general.Seguridad;
import mae.easp.db.CatEasp;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;

public class Login implements LoginListener{
	private static final double SECURITY_MIN_VERSION_BD = 15.7;
	private static final double TABLASEGURIDAD_MIN_VERSION_BD = 16.0;
	private DBConnection dbc;
	private LoginDialog ld=null;
	private String localDomain=null;
	private Aplication apl=null;
	private String dominio=null;
	private boolean security;
	private String rutaLogo=null;
	private boolean loginOk;
	private boolean fromReconnect;
	private Seguridad seguridad;
	private double hoursShutdown;
	private double minutsReconnect;

	Login(Aplication apl, String rutaLogo){
		this (apl, rutaLogo, false);
	}

	Login(Aplication apl, String rutaLogo, boolean security){
		this (apl, rutaLogo, false, false);
	}

	Login(Aplication apl, String rutaLogo, boolean security, boolean fromReconnect){
		SystemView.setGui(true);
		this.rutaLogo = rutaLogo;
		this.security = security;
		this.loginOk = false;
		this.fromReconnect = fromReconnect;
		//Leemos .properties
		properties(apl);

		ld=new LoginDialog(this,apl, rutaLogo,security);
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
		ld.setConnexio(dbc);
		ld.show();
	}
	private boolean existeTablaSeguridad() {
		boolean existe = false;
		Selector s = new Selector (dbc);
		s.execute("Select bdversio from BDS where bdnombre='bdeasp'");
		if (s.next()) {
			String v = s.getString("bdversio");
			existe = Numero.redondeo(Double.parseDouble(v)) >=  Numero.redondeo(TABLASEGURIDAD_MIN_VERSION_BD);
		}
		s.close();
		return existe;
	}

	private void checkSecurity() {
		System.out.println("Check Login MD5: "+security);
		if (security) {
			Selector s = new Selector (dbc);
			s.execute("Select bdversio from BDS where bdnombre='bdeasp'");
			if (s.next()) {
				String v = s.getString("bdversio");
				security = Numero.redondeo(Double.parseDouble(v)) >=  Numero.redondeo(SECURITY_MIN_VERSION_BD);
			}
			else security = false;
			s.close();
			Seguridad seguridad = new Seguridad(dbc,Easp.sede);
			hoursShutdown = seguridad.getHorasSesion();
			minutsReconnect = seguridad.getMinutosInactiva();
			if (!fromReconnect) apl.setLoginListener(this);
		}
		Easp.setSecurityMD5 (security);
		System.out.println("Login MD5: "+security);
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
		db.setMyServer(Aplication.getDB().getServer());
		db.setUser(Aplication.getDB().getUser());
		db.setMyPassword(Aplication.getDB().getPassword());
		db.setType(Aplication.getDB().getType());
		dbc=new DBConnection(db);
		if (dbc.connect()) return true;
		else return false;
	}


	//Recuperamos información en que dominio de consulado estamos y cual es la central.
	private void inicializa(){
		dominio=getDominio();
		if (!conecta()) cancel();
		else checkSecurity();
	}

	public LoginDialog getLoginDialogo() {
		return ld;
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
			loginOk = false;
			Statement st=dbc.createStatement();
			String funcio="UPPER";
			if (dbc.getDB().getType().equals("access"))  funcio="UCASE";
			String mylogin=ld.getLogin().toUpperCase();
			String passwdField = "USPASSWD";
			if (security) passwdField = "USMD5";
			ResultSet rs=dbc.executeQuery(st,"select "+passwdField+" from USUARIO where "+funcio+"(USLOGIN)='"+mylogin+"'", false);
			if (rs.next()) {
				String pass=rs.getString(passwdField);
				rs.close();
        if (existeTablaSeguridad()) {
           Seguridad seguridad = new Seguridad(dbc,Easp.sede);
           if (seguridad.ctrlReIntentos() && seguridad.ctrlReintentos(Easp.sede,ld.getLogin())) {
               Easp.usuarioBloqueado = true;
               cancel();
           }
        }
				if (passwordOK(pass)) {
					loginOk = true;
					apl.setTitle(apl.getTitle()+" ("+mylogin.trim()+")");
					apl.setUser(mylogin.trim());
					setUserDefault(ld.getLogin());
					boolean creaSesio = true;
					if (existeTablaSeguridad()) {
						if (!fromReconnect)	creaSesio = mae.easp.general.Easp.crearSesion(Aplication.getAplication().getConfig("Tarifa"),mylogin,Aplication.getAplication().getName(), true,false,dbc );
						ld.setCodUsuario(mylogin);
            if (!creaSesio)
							ld.setMensajeErrorSinDominio(mae.easp.general.Easp.mensajeSesion);
            else if (existeTablaSeguridad()) {
                    Seguridad seguridad = new Seguridad(dbc,Easp.sede);
                 	seguridad.setReintentos(Easp.sede,ld.getLogin(),0);
            }
					}
					if (creaSesio) dbc.disconnect();
					return creaSesio;
				}
				else {
          if (existeTablaSeguridad()) {
						Seguridad seguridad = new Seguridad(dbc,Easp.sede);
						if (seguridad.ctrlReIntentos()) {
              if (!Easp.usuarioBloqueado) {
                  seguridad.setAutoCommit();
                  seguridad.setReintentos(Easp.sede,ld.getLogin());
                  if (seguridad.ctrlReintentos(Easp.sede,ld.getLogin())) {
                     Easp.usuarioBloqueado = true;
                     cancel();
                  }
              }
						}

					}
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

	private boolean passwordOK (String pass) {
		boolean ok = false;
		if (pass==null && ld.getPassword().equals("")) ok = true;
		else if (security) ok = pass!=null && pass.equals(ld.getPasswordMD5());
		else ok = pass!=null && pass.toUpperCase().equals(ld.getPassword().toUpperCase());

		return ok;
	}

	/**
	 * Cuando se cancele el formulario cerraremos la conexión a la base de datos
	 * y saldremos al sistema.
	 */
	public void cancel(){
		loginOk = false;
		if (Easp.usuarioBloqueado)
			JOptionPane.showMessageDialog(null,"El usuario está bloqueado, contacte con el administrador.","Acceso",JOptionPane.ERROR_MESSAGE );
		if (dbc.isConnected()) dbc.disconnect();
		if (!fromReconnect) Aplication.getAplication().exit();
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
			ResultSet rs=dbc.executeQuery(st,"select parvalor from parametros where "+
					"pardominio = '"+dominio+"' And parusuario = '"+machine+
					"' And parvariable = 'TERMINAL' And parambito = 'PERFIL USUARIO'", false);
			String user=null;
			if (rs.next()) {
				user=rs.getString("parvalor");
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
		boolean bOk = d.execute("pardominio = '"+dominio+"' AND parusuario ='"+machine+"' AND parvariable = 'TERMINAL' AND parambito = 'PERFIL USUARIO'");
		if (bOk) {
			Insert in = new Insert (dbc, "parametros");
			in.valor("pardominio", dominio);
			in.valor("parusuario", machine);
			in.valor("parambito", "PERFIL USUARIO");
			in.valor("parvariable", "TERMINAL");
			in.valor("pardesc", "Nombre del Equipo/Terminal ultimo acceso");
			in.valor("paragrup", "JEA");
			in.valor("parvalor", userLogin);
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
	public static Login showLogIn(Aplication apl){
		return showLogIn(apl, null);
	}
	public static Login showLogIn(Aplication apl, String rutaLogo){
		return showLogIn (apl, rutaLogo, false);
	}
	public static Login showLogIn(Aplication apl, String rutaLogo, boolean security){
		return showLogIn (apl, rutaLogo, security, false);
	}

	public static Login showLogIn(Aplication apl, String rutaLogo, boolean security, boolean fromReconnect){
		Login login=new Login(apl, rutaLogo, security, fromReconnect);
		return login;
	}

	public static void showLogInAGPI(Aplication apl){
		//aquest serà un login diferent que demanarà
		// domini, usuari i contrassenya,
		// i verificarà amb VirtualFiscControl.verifyLogin
	}

	public static String encryptMD5 (String passwd) {
		String md5 = null;
		if (passwd != null && passwd.trim().length()>0) {
			try {
				passwd = passwd.trim().toUpperCase();
				MessageDigest mdEnc = MessageDigest.getInstance("MD5");
				mdEnc.update(passwd.getBytes(), 0, passwd.length());
				md5 = new BigInteger(1, mdEnc.digest()).toString(16).toUpperCase();
			}
			catch (Exception ex) {
				ex.printStackTrace();
				md5 = null;
			}
		}
		return md5;
	}

	@Override
	public double getHoursShutdown() {
		 return hoursShutdown;
	}

	@Override
	public double getMinutsReconnect() {
		 return minutsReconnect;
	}

	@Override
	public boolean runLogin() {
		Login l = Login.showLogIn(apl, rutaLogo, security, true);
		return l.isLogged();
	}

	private boolean isLogged() {
		return loginOk;
	}
}
