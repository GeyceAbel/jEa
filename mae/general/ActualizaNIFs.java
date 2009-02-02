package mae.general;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import mae.easp.db.*;
import mae.easp.general.Easp;

import geyce.maefc.Catalog;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.Delete;
import geyce.maefc.FieldDef;
import geyce.maefc.Insert;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import geyce.maefc.TableDef;
import geyce.maefc.Update;

public class ActualizaNIFs 
{
	private String cdp="";
	private String oldNIF="";
	private String newNIF="";
	private Vector<DBConnection> v1 = null;
	private Vector<String> vcheck = null;
	private DBConnection connEA=null;
	private DBConnection connJNomina=null;
	private DBConnection connJEo=null;
	private DBConnection connJConta=null;
	private DBConnection connJModelos=null;
	private boolean hayIncidencia = false;
	private int numInc = 0;
	private boolean esVFISC = false;
	

	public ActualizaNIFs(String cdp, String oldNIF, String newNIF, DBConnection connEA, boolean esVFISC)
	{
		this.cdp=cdp;
		this.oldNIF=oldNIF;
		this.newNIF=newNIF;
		this.connEA=connEA;
		this.esVFISC = esVFISC;
	}
	
    public boolean updateNIF() 
    {
    	this.connJModelos = getConnexio("modelos", connEA);
    	if (!checkNifJModelos())  return false;
    	boolean execute = true;
    	String jnomina = "";
    	String jeo = "";
    	String jconta = "";
    	String aplicError = "";
    	hayIncidencia = false;
    	Selector sinc = new Selector (connEA);
    	sinc.execute("Select max(incodigo) as codi from ININCIDE");
    	if (sinc.next()) numInc = sinc.getint("codi");
    	sinc.close();
		Selector selecConnection = new Selector(connEA);
		
		selecConnection.execute("Select * from CDP where cdpcodi = '"+cdp+"'");
		
		if(selecConnection.next())
		{
			jnomina = selecConnection.getString("cdpcknomina");
			if(execute)
			{
				if(jnomina!=null && jnomina.equals("S"))
				{
					this.connJNomina = getConnexio("laboral", connEA);
					execute = CambiarNIFJNomina(this.connJNomina);
					if (!execute) aplicError = "jNomina";
				}
			}
			
			
			jeo = selecConnection.getString("cdpckeo");
			if(execute)
			{
				if(jeo!=null && jeo.equals("S"))
				{
					this.connJEo = getConnexio("jeo", connEA);
					execute = CambiarNIFJEo(this.connJEo);
					if (!execute) aplicError = "jEo";
				}
			}
			
			jconta = selecConnection.getString("cdpckconta");
			if(execute)
			{
				if(jconta!=null && jconta.equals("S"))
				{
					execute = cambiarNifJConta();
					if (!execute) aplicError = "jConta";
				}
			}
		}
		
		if(execute)
		{			
	    	execute = CambiarNIFJModelos(this.connJModelos);
	    	if (!execute) aplicError = "jModelos";
		}
		
		if(execute) {
			execute = CambiarNIFJEa(connEA);
			if (!execute) aplicError = "jEa";
		}
		
		if(execute) connEA.commit();
		else connEA.rollback();
	
    	selecConnection.close();
		
		if(execute && jnomina!=null && jnomina.equals("S"))
		{
			connJNomina.commit();
			connJNomina.disconnect();
		}
		if(!execute && jnomina!=null && jnomina.equals("S"))
		{
			connJNomina.rollback();
			connJNomina.disconnect();
		}
		
		if(execute && jeo!=null && jeo.equals("S"))
		{
			connJEo.commit();
			connJEo.disconnect();
		}
		if(!execute &&  jeo!=null && jeo.equals("S"))
		{
			connJEo.rollback();
			connJEo.disconnect();
		}
		
		if(jconta!=null && jconta.equals("S"))
		{
			Iterator<DBConnection> it1 = v1.iterator();
			while(it1.hasNext())
			{
				connJConta = it1.next();
				if(execute)
				{
					connJConta.commit();
					connJConta.disconnect();
				}
				else 
				{
					connJConta.rollback();
					connJConta.disconnect();
				}
			}
		}
			
		if(execute) connJModelos.commit();
		else connJModelos.rollback();
		
		connJModelos.disconnect();
		
		if(execute) 
		{
			if(hayIncidencia && !esVFISC) 
			{
				int resp = Maefc.message("Se han modificado los NIF/CIF correctamente, pero se han producido incidencias durante el proceso. \n\n¿Desea ver las incidencias?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION);
				if(resp == Maefc.YES_OPTION) abrirIncidencias();
			}
			else Maefc.message("Se han modificado los NIF/CIF correctamente","Atención",Maefc.INFORMATION_MESSAGE);

			

		}
		else Maefc.message("Se ha producido un error al cambiar el NIF en "+aplicError+".","Error",Maefc.ERROR_MESSAGE);

		
		return execute;
	}
    
    private void abrirIncidencias() 
    {
		mae.easp.adminciden.ProgAdminciden pr = new mae.easp.adminciden.ProgAdminciden ();
		pr.incCodi = numInc;
		pr.run();
	}

	public void grabarIncidencia(String titulo, String msg)
    {
    	hayIncidencia = true;
    	Easp.grabaIncidencia(connEA, "ActualizaNIFs", "Cambio NIF "+titulo, msg);
    }

	
	private DBConnection getConnexio(String nombd, DBConnection connEA) 
	{
		return(conectaBD(nombd, connEA.getDB().getServer(), connEA.getDB().getUser(), connEA.getDB().getPassword(), connEA.getDB().getType()));	
    }
	
	private boolean CambiarNIFJNomina(DBConnection connJNomina) 
	{
		try {
		      Update up = new Update (connJNomina,"EMPRESA");
		      up.valor("EMPNIF",newNIF);

		      if ( cdp == null || newNIF == null || newNIF.equals("") || cdp.length() < 12 ) return false;
		      int codiEmp = Integer.parseInt(cdp.substring(6,12)) ;
		      boolean ok = up.execute("EMPCODIGO = "+codiEmp);
		      if   ( ok )  return true ;
		      System.out.println("Error al  actualizar nif en jNomina tabla EMPRESA ");
		      }
		    catch  ( Exception e ) {
		      System.out.println("Error actualizando nif jNomina , Error: ["+e+"]");
		      }
		     return false ;
	}

	private boolean CambiarNIFJEo(DBConnection connJEo) 
	{
		try {
		      Update up = new Update(connJEo,"EMPRESA");
		      up.valor("EMPNIF",newNIF);

		      if ( cdp == null || newNIF == null || newNIF.equals("") || cdp.length() < 12 ) return false;
		      int codiEmp = Integer.parseInt(cdp.substring(6,12)) ;
		      boolean ok = up.execute("EMPCODIGO = "+codiEmp);
		      if   ( ok )  return true ;
		      System.out.println("Error al  actualizar nif en jEo tabla EMPRESA ");
		      }
		    catch  ( Exception e ) {
		      System.out.println("Error actualizando nif jEo , Error: ["+e+"]");
		      }
		     return false ;
	}
	
	private boolean CambiarNIFJEa(DBConnection connJEa) 
	{
		Delete d = null;
		boolean execute = true;
		Selector newNIFSelector = new Selector(connJEa.getDataBase());
		Selector oldNIFSelector = new Selector(connJEa.getDataBase());
		
		oldNIFSelector.execute("Select * from NIFES where danifcif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			/*JEA*/
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from NIFES where danifcif = '"+newNIF+"'");
			if(newNIFSelector.next())
			{
				//copiar campos danifcif viejos al cif nuevo
				Update up = new Update(connJEa, "NIFES");

				up.valor("datipo", oldNIFSelector.getString("datipo"));
				up.valor("datnombre", oldNIFSelector.getString("datnombre"));
				up.valor("datapell1", oldNIFSelector.getString("datapell1"));
				up.valor("datapell2", oldNIFSelector.getString("datapell2"));
				up.valor("datsiglas", oldNIFSelector.getString("datsiglas"));
				up.valor("datvia", oldNIFSelector.getString("datvia"));
				up.valor("datnum", oldNIFSelector.getString("datnum"));
				up.valor("datesc", oldNIFSelector.getString("datesc"));
				up.valor("datpiso", oldNIFSelector.getString("datpiso"));
				up.valor("datletra", oldNIFSelector.getString("datletra"));
				up.valor("datpobla", oldNIFSelector.getString("datpobla"));
				up.valor("datmuni", oldNIFSelector.getint("datmuni"));
				up.valor("datprov", oldNIFSelector.getint("datprov"));
				up.valor("datpais", oldNIFSelector.getint("datpais"));
				up.valor("datcpos", oldNIFSelector.getString("datcpos"));
				up.valor("dattel", oldNIFSelector.getString("dattel"));
				up.valor("datfax", oldNIFSelector.getString("datfax"));
				up.valor("datfisicajuri", oldNIFSelector.getString("datfisicajuri"));
				up.valor("datemail", oldNIFSelector.getString("datemail"));
				up.valor("datcontacto", oldNIFSelector.getString("datcontacto"));
				up.valor("datesiglas", oldNIFSelector.getString("datesiglas"));
				up.valor("datevia", oldNIFSelector.getString("datevia"));
				up.valor("datenum", oldNIFSelector.getString("datenum"));
				up.valor("dateesc", oldNIFSelector.getString("dateesc"));
				up.valor("datepiso", oldNIFSelector.getString("datepiso"));
				up.valor("dateletra", oldNIFSelector.getString("dateletra"));
				up.valor("datepobla", oldNIFSelector.getString("datepobla"));
				up.valor("datemuni", oldNIFSelector.getint("datemuni"));
				up.valor("dateprov", oldNIFSelector.getint("dateprov"));
				up.valor("datepais", oldNIFSelector.getint("datepais"));
				up.valor("datecpos", oldNIFSelector.getString("datecpos"));
				up.valor("dateatt", oldNIFSelector.getString("dateatt"));
				up.valor("dataltaen", oldNIFSelector.getString("dataltaen"));
				up.valor("datletraseti", oldNIFSelector.getString("datletraseti"));
				up.valor("datipf", oldNIFSelector.getString("datipf"));
				up.valor("datcbienes", oldNIFSelector.getString("datcbienes"));
				up.valor("datdominio", oldNIFSelector.getString("datdominio"));
				up.valor("datnacional", oldNIFSelector.getint("datnacional"));
				
				if(execute)  execute = up.execute("danifcif='"+newNIF+"'");
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJEa, "NIFES");
				i.valor("danifcif", newNIF);
				i.valor("datipo", oldNIFSelector.getString("datipo"));
				i.valor("datnombre", oldNIFSelector.getString("datnombre"));
				i.valor("datapell1", oldNIFSelector.getString("datapell1"));
				i.valor("datapell2", oldNIFSelector.getString("datapell2"));
				i.valor("datsiglas", oldNIFSelector.getString("datsiglas"));
				i.valor("datvia", oldNIFSelector.getString("datvia"));
				i.valor("datnum", oldNIFSelector.getString("datnum"));
				i.valor("datesc", oldNIFSelector.getString("datesc"));
				i.valor("datpiso", oldNIFSelector.getString("datpiso"));
				i.valor("datletra", oldNIFSelector.getString("datletra"));
				i.valor("datpobla", oldNIFSelector.getString("datpobla"));
				i.valor("datmuni", oldNIFSelector.getint("datmuni"));
				i.valor("datprov", oldNIFSelector.getint("datprov"));
				i.valor("datpais", oldNIFSelector.getint("datpais"));
				i.valor("datcpos", oldNIFSelector.getString("datcpos"));
				i.valor("dattel", oldNIFSelector.getString("dattel"));
				i.valor("datfax", oldNIFSelector.getString("datfax"));
				i.valor("datfisicajuri", oldNIFSelector.getString("datfisicajuri"));
				i.valor("datemail", oldNIFSelector.getString("datemail"));
				i.valor("datcontacto", oldNIFSelector.getString("datcontacto"));
				i.valor("datesiglas", oldNIFSelector.getString("datesiglas"));
				i.valor("datevia", oldNIFSelector.getString("datevia"));
				i.valor("datenum", oldNIFSelector.getString("datenum"));
				i.valor("dateesc", oldNIFSelector.getString("dateesc"));
				i.valor("datepiso", oldNIFSelector.getString("datepiso"));
				i.valor("dateletra", oldNIFSelector.getString("dateletra"));
				i.valor("datepobla", oldNIFSelector.getString("datepobla"));
				i.valor("datemuni", oldNIFSelector.getint("datemuni"));
				i.valor("dateprov", oldNIFSelector.getint("dateprov"));
				i.valor("datepais", oldNIFSelector.getint("datepais"));
				i.valor("datecpos", oldNIFSelector.getString("datecpos"));
				i.valor("dateatt", oldNIFSelector.getString("dateatt"));
				i.valor("dataltaen", oldNIFSelector.getString("dataltaen"));
				i.valor("datletraseti", oldNIFSelector.getString("datletraseti"));
				i.valor("datipf", oldNIFSelector.getString("datipf"));
				i.valor("datcbienes", oldNIFSelector.getString("datcbienes"));
				i.valor("datdominio", oldNIFSelector.getString("datdominio"));
				i.valor("datnacional", oldNIFSelector.getint("datnacional"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from PERFILTRIBUT where pftnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
		
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from PERFILTRIBUT where pftnif = '"+newNIF+"' and pftejercicio = "+oldNIFSelector.getint("pftejercicio"));
			if(newNIFSelector.next())
			{
				grabarIncidencia("jModelos", "Se ha eliminado el PERFIL TRIBUTARIO del pftnif = '"+oldNIF+"' and pftejercicio = "+oldNIFSelector.getint("pftejercicio"));
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJEa, "PERFILTRIBUT");
				i.valor("pftejercicio", oldNIFSelector.getint("pftejercicio"));
				i.valor("pftnif", newNIF);
				i.valor("pftgranemp", oldNIFSelector.getString("pftgranemp"));
				i.valor("pfttipoavisos", oldNIFSelector.getString("pfttipoavisos"));
				i.valor("pftemail", oldNIFSelector.getString("pftemail"));
				i.valor("pftmovil", oldNIFSelector.getString("pftmovil"));
				i.valor("pftalquileres", oldNIFSelector.getString("pftalquileres"));
				i.valor("pftintracom", oldNIFSelector.getString("pftintracom"));
				i.valor("pftintrastat", oldNIFSelector.getString("pftintrastat"));
				i.valor("pftfechafin", oldNIFSelector.getDate("pftfechafin"));
				
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		oldNIFSelector.close();
		
		if(execute) execute = UpdateNIF(connJEa, "NIFESMUF", "mufnif",(connJEa.getDB().getCatalogs())[1]);
		
		if(execute) execute = UpdateNIF(connJEa, "CDP", "cdpnifcif");
		
		if(execute) execute = UpdateNIF(connJEa, "REPRESENTANTES", "repnifcif",(connJEa.getDB().getCatalogs())[1]);
		
		if(execute) execute = UpdateNIF(connJEa, "DP", "dpnifcif");
		
		if(execute) execute = UpdateNIF(connJEa, "MIR", "mircif");
			
		if(execute) execute = UpdateNIF(connJEa, "EMPMODELOS", "emodnif",(connJEa.getDB().getCatalogs())[1]);
		
		d = new Delete(connJEa, "PERFILTRIBUT");
		if(execute) d.execute("pftnif='"+oldNIF+"'");
		
		if(execute) execute = UpdateNIF(connJEa, "AVISADO", "avinif",(connJEa.getDB().getCatalogs())[1]);
		
		return execute;
	}
	
	private DBConnection conectaBD(String bdnom, String bdserver, String bduser, String bdpassword, String bdtype) {
	    DataBase db=new DataBase();
	    db.setName(bdnom);
	    db.setMyServer(bdserver);
	    db.setUser(bduser);
	    db.setMyPassword(bdpassword);
	    db.setType(bdtype);
	    DBConnection conn=new DBConnection(db);
	    
	    if (bdnom.equals("modelos")) 
	    {
            CatModgen catmodgen = new CatModgen();
            CatModelos1 catmodelos1 = new CatModelos1();
            CatModelos2 catmodelos2 = new CatModelos2();
            Catalog array[] = {catmodelos1,catmodelos2,catmodgen};
            db.setCatalogs(array);
        }	    
	    else if (bdnom.equals("laboral")) 
	    {
            CatLaboral catlaboral = new CatLaboral();
            Catalog array[] = {catlaboral};
            db.setCatalogs(array);
        }	    
	    else if (bdnom.equals("jeo")) 
	    {
            CatJeo catjeo = new CatJeo();
            Catalog array[] = {catjeo};
            db.setCatalogs(array);
        }
	    else if (bdnom.startsWith("cta")) 
	    {
            CatCtasp catctasp = new CatCtasp();
            Catalog array[] = {catctasp};
            db.setCatalogs(array);
        }	    
	    conn=new DBConnection(db);
	    if (conn.connect()) return conn;
	    else return null;
	  }

	private boolean cambiarNifJConta() 
	{
	  boolean bOk = true;
	  v1 = new Vector<DBConnection>();
	  Selector s = new Selector (connEA);
	  s.execute("Select * from bdscargadas where bddominio='"+cdp+"'");
	  
	  while (s.next() && bOk) {
	    int numEmp = 0;
	    try {
	    	numEmp = Integer.parseInt (cdp.substring(6));
	    }
	    catch (Exception e) {
	      numEmp = 0;
	    }
	  	DBConnection conn =   conectaBD (s.getString("bdbdnom"), s.getString("bdbdserv"), s.getString("bdbduser"), s.getString("bdbdpass"), s.getString("bdtipo"));
	  	if (conn!=null && numEmp >0) {
	  	 Update up = new Update (conn,"EMPRESA");
	  	 up.valor ("empnif",newNIF);
	  	 bOk = up.execute("empcodigo="+numEmp);
	  	 v1.addElement(conn);
	  	}
	  }
	  s.close();
	  return bOk;
	}

	private boolean CambiarNIFJModelos(DBConnection connJModelos)
	{
		boolean execute = true;
		Selector newNIFSelector = new Selector(connJModelos.getDataBase());
		Selector oldNIFSelector = new Selector(connJModelos.getDataBase());
		
		oldNIFSelector.execute("Select * from MOD300 where m300nif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			/*modelos1*/
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD300 where m300dominio = '"+oldNIFSelector.getString("m300dominio")+"' and m300nif = '"+newNIF+"' and m300ejercicio = "+oldNIFSelector.getint("m300ejercicio")+" and m300periodo = '"+oldNIFSelector.getString("m300periodo")+"'");
			if(newNIFSelector.next()) {
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 300 m300dominio = '"+oldNIFSelector.getString("m300dominio")+"' and m300nif = '"+oldNIF+"' and m300ejercicio = "+oldNIFSelector.getint("m300ejercicio")+" and m300periodo = '"+oldNIFSelector.getString("m300periodo")+"' ya que existía un 300 con el nuevo NIF "+newNIF);
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD300");
				i.valor("m300dominio", oldNIFSelector.getString("m300dominio"));
				i.valor("m300nif", newNIF);
				i.valor("m300ejercicio", oldNIFSelector.getint("m300ejercicio"));
				i.valor("m300periodo", oldNIFSelector.getString("m300periodo"));
				i.valor("m300modelo", oldNIFSelector.getString("m300modelo"));
				i.valor("m300deleg", oldNIFSelector.getString("m300deleg"));
				i.valor("m300admon", oldNIFSelector.getString("m300admon"));
				i.valor("m300codadmon", oldNIFSelector.getint("m300codadmon"));
				i.valor("m300apellidos", oldNIFSelector.getString("m300apellidos"));
				i.valor("m300nombre", oldNIFSelector.getString("m300nombre"));
				i.valor("m300siglas", oldNIFSelector.getString("m300siglas"));
				i.valor("m300calle", oldNIFSelector.getString("m300calle"));
				i.valor("m300numero", oldNIFSelector.getString("m300numero"));
				i.valor("m300escalera", oldNIFSelector.getString("m300escalera"));
				i.valor("m300piso", oldNIFSelector.getString("m300piso"));
				i.valor("m300puerta", oldNIFSelector.getString("m300puerta"));
				i.valor("m300cpostal", oldNIFSelector.getString("m300cpostal"));
				i.valor("m300municipio", oldNIFSelector.getString("m300municipio"));
				i.valor("m300provincia", oldNIFSelector.getString("m300provincia"));
				i.valor("m300telefono", oldNIFSelector.getString("m300telefono"));
				i.valor("m300devivbase1", oldNIFSelector.getdouble("m300devivbase1"));
				i.valor("m300devivpor1", oldNIFSelector.getdouble("m300devivpor1"));
				i.valor("m300devivcuota1", oldNIFSelector.getdouble("m300devivcuota1"));
				i.valor("m300devivbase2", oldNIFSelector.getdouble("m300devivbase2"));
				i.valor("m300devivpor2", oldNIFSelector.getdouble("m300devivpor2"));
				i.valor("m300devivcuota2", oldNIFSelector.getdouble("m300devivcuota2"));
				i.valor("m300devivbase3", oldNIFSelector.getdouble("m300devivbase3"));
				i.valor("m300devivpor3", oldNIFSelector.getdouble("m300devivpor3"));
				i.valor("m300devivcuota3", oldNIFSelector.getdouble("m300devivcuota3"));
				i.valor("m300devrebase1", oldNIFSelector.getdouble("m300devrebase1"));
				i.valor("m300devrepor1", oldNIFSelector.getdouble("m300devrepor1"));
				i.valor("m300devrecuota1", oldNIFSelector.getdouble("m300devrecuota1"));
				i.valor("m300devrebase2", oldNIFSelector.getdouble("m300devrebase2"));
				i.valor("m300devrepor2", oldNIFSelector.getdouble("m300devrepor2"));
				i.valor("m300devrecuota2", oldNIFSelector.getdouble("m300devrecuota2"));
				i.valor("m300devrebase3", oldNIFSelector.getdouble("m300devrebase3"));
				i.valor("m300devrepor3", oldNIFSelector.getdouble("m300devrepor3"));
				i.valor("m300devrecuota3", oldNIFSelector.getdouble("m300devrecuota3"));
				i.valor("m300devadqbase", oldNIFSelector.getdouble("m300devadqbase"));
				i.valor("m300devadqquota", oldNIFSelector.getdouble("m300devadqquota"));
				i.valor("m300totcuotdev", oldNIFSelector.getdouble("m300totcuotdev"));
				i.valor("m300dedopin", oldNIFSelector.getdouble("m300dedopin"));
				i.valor("m300dedimpor", oldNIFSelector.getdouble("m300dedimpor"));
				i.valor("m300dedadq", oldNIFSelector.getdouble("m300dedadq"));
				i.valor("m300dedopinb", oldNIFSelector.getdouble("m300dedopinb"));
				i.valor("m300dedimporb", oldNIFSelector.getdouble("m300dedimporb"));
				i.valor("m300dedadqb", oldNIFSelector.getdouble("m300dedadqb"));
				i.valor("m300dedragp", oldNIFSelector.getdouble("m300dedragp"));
				i.valor("m300dedrinv", oldNIFSelector.getdouble("m300dedrinv"));
				i.valor("m300totded", oldNIFSelector.getdouble("m300totded"));
				i.valor("m300diferencia", oldNIFSelector.getdouble("m300diferencia"));
				i.valor("m300atradmonpor", oldNIFSelector.getdouble("m300atradmonpor"));
				i.valor("m300atradmon", oldNIFSelector.getdouble("m300atradmon"));
				i.valor("m300cuotcompen", oldNIFSelector.getdouble("m300cuotcompen"));
				i.valor("m300entregas", oldNIFSelector.getdouble("m300entregas"));
				i.valor("m300estydiput", oldNIFSelector.getdouble("m300estydiput"));
				i.valor("m300resultado", oldNIFSelector.getdouble("m300resultado"));
				i.valor("m300impcompen", oldNIFSelector.getdouble("m300impcompen"));
				i.valor("m300sinactiv", oldNIFSelector.getString("m300sinactiv"));
				i.valor("m300impdevol", oldNIFSelector.getdouble("m300impdevol"));
				i.valor("m300entdevol", oldNIFSelector.getString("m300entdevol"));
				i.valor("m300ofidevol", oldNIFSelector.getString("m300ofidevol"));
				i.valor("m300digidevol", oldNIFSelector.getString("m300digidevol"));
				i.valor("m300ctadevol", oldNIFSelector.getString("m300ctadevol"));
				i.valor("m300cruzefec", oldNIFSelector.getString("m300cruzefec"));
				i.valor("m300cruzadeu", oldNIFSelector.getString("m300cruzadeu"));
				i.valor("m300impingreso", oldNIFSelector.getint("m300impingreso"));
				i.valor("m300entingreso", oldNIFSelector.getString("m300entingreso"));
				i.valor("m300ofiingreso", oldNIFSelector.getString("m300ofiingreso"));
				i.valor("m300digiingreso", oldNIFSelector.getString("m300digiingreso"));
				i.valor("m300ctaingreso", oldNIFSelector.getString("m300ctaingreso"));
				i.valor("m300munifirma", oldNIFSelector.getString("m300munifirma"));
				i.valor("m300dia", oldNIFSelector.getString("m300dia"));
				i.valor("m300mes", oldNIFSelector.getString("m300mes"));
				i.valor("m300anyo", oldNIFSelector.getString("m300anyo"));
				i.valor("m300fecha", oldNIFSelector.getDate("m300fecha"));
				i.valor("m300percont", oldNIFSelector.getString("m300percont"));
				i.valor("m300telcont", oldNIFSelector.getString("m300telcont"));
				i.valor("m300observa", oldNIFSelector.getString("m300observa"));
				i.valor("m300letetiq", oldNIFSelector.getString("m300letetiq"));
				i.valor("m300exporta", oldNIFSelector.getdouble("m300exporta"));
				i.valor("m300otrasopex", oldNIFSelector.getdouble("m300otrasopex"));
				i.valor("m300opsujdev", oldNIFSelector.getdouble("m300opsujdev"));
				i.valor("m300opnosujdev", oldNIFSelector.getdouble("m300opnosujdev"));
				i.valor("m300maxdevol", oldNIFSelector.getdouble("m300maxdevol"));
				i.valor("m300adevolver", oldNIFSelector.getdouble("m300adevolver"));
				i.valor("m300acompensar", oldNIFSelector.getdouble("m300acompensar"));
				i.valor("m300tipodecl", oldNIFSelector.getString("m300tipodecl"));
				i.valor("m300cruzccc", oldNIFSelector.getString("m300cruzccc"));
				i.valor("m300formapago", oldNIFSelector.getint("m300formapago"));
				i.valor("m300regpro", oldNIFSelector.getdouble("m300regpro"));
				i.valor("m300adeducir", oldNIFSelector.getdouble("m300adeducir"));
				i.valor("m300resultliq", oldNIFSelector.getdouble("m300resultliq"));
				i.valor("m300codelec", oldNIFSelector.getString("m300codelec"));
				i.valor("m300numjustif", oldNIFSelector.getString("m300numjustif"));
				//i.valor("m300dedopinivb", oldNIFSelector.getdouble("m300dedopinivb"));
				//i.valor("m300dedopinivc", oldNIFSelector.getdouble("m300dedopinivc"));
				//i.valor("m300dedimpivb", oldNIFSelector.getdouble("m300dedimpivb"));
				//i.valor("m300dedimpivc", oldNIFSelector.getdouble("m300dedimpivc"));
				//i.valor("m300dedadqivb", oldNIFSelector.getdouble("m300dedadqivb"));
				//i.valor("m300dedadqivc", oldNIFSelector.getdouble("m300dedadqivc"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		oldNIFSelector.close();
		
		oldNIFSelector.execute("Select * from MOD3901 where m901nif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD3901 where m901dominio = '"+oldNIFSelector.getString("m901dominio")+"' and m901nif = '"+newNIF+"' and m901ejercicio = "+oldNIFSelector.getint("m901ejercicio")+" and m901periodo = '"+oldNIFSelector.getString("m901periodo")+"'");
			if(newNIFSelector.next()) {
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 390 m901dominio = '"+oldNIFSelector.getString("m901dominio")+"' and m901nif = '"+oldNIF+"' and m901ejercicio = "+oldNIFSelector.getint("m901ejercicio")+" and m901periodo = '"+oldNIFSelector.getString("m901periodo")+"' ya que existía un 390 con el nuevo NIF "+newNIF);				
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD3901");
				i.valor("m901dominio", oldNIFSelector.getString("m901dominio"));
				i.valor("m901nif", newNIF);
				i.valor("m901ejercicio", oldNIFSelector.getint("m901ejercicio"));
				i.valor("m901periodo", oldNIFSelector.getString("m901periodo"));
				i.valor("m901deleg", oldNIFSelector.getString("m901deleg"));
				i.valor("m901admon", oldNIFSelector.getString("m901admon"));
				i.valor("m901codadmon", oldNIFSelector.getint("m901codadmon"));
				i.valor("m901apellidos", oldNIFSelector.getString("m901apellidos"));
				i.valor("m901nombre", oldNIFSelector.getString("m901nombre"));
				i.valor("m901telefono", oldNIFSelector.getString("m901telefono"));
				i.valor("m901siglas", oldNIFSelector.getString("m901siglas"));
				i.valor("m901calle", oldNIFSelector.getString("m901calle"));
				i.valor("m901numero", oldNIFSelector.getString("m901numero"));
				i.valor("m901municipio", oldNIFSelector.getString("m901municipio"));
				i.valor("m901provincia", oldNIFSelector.getString("m901provincia"));
				i.valor("m901cpostal", oldNIFSelector.getString("m901cpostal"));
				i.valor("m901devexport", oldNIFSelector.getString("m901devexport"));
				i.valor("m901devjustant", oldNIFSelector.getString("m901devjustant"));				
				i.valor("m901estactpcpal", oldNIFSelector.getString("m901estactpcpal"));
				i.valor("m901estclapcpal", oldNIFSelector.getdouble("m901estclapcpal"));
				i.valor("m901estepipcpal", oldNIFSelector.getString("m901estepipcpal"));				
				i.valor("m901estactvtra1", oldNIFSelector.getString("m901estactvtra1"));
				i.valor("m901estclaotra1", oldNIFSelector.getdouble("m901estclaotra1"));
				i.valor("m901estepiotra1", oldNIFSelector.getString("m901estepiotra1"));				
				i.valor("m901estactvtra2", oldNIFSelector.getString("m901estactvtra2"));
				i.valor("m901estclaotra2", oldNIFSelector.getdouble("m901estclaotra2"));
				i.valor("m901estepiotra2", oldNIFSelector.getString("m901estepiotra2"));				
				i.valor("m901estactvtra3", oldNIFSelector.getString("m901estactvtra3"));
				i.valor("m901estclaotra3", oldNIFSelector.getdouble("m901estclaotra3"));
				i.valor("m901estepiotra3", oldNIFSelector.getString("m901estepiotra3"));				
				i.valor("m901estactvtra4", oldNIFSelector.getString("m901estactvtra4"));
				i.valor("m901estclaotra4", oldNIFSelector.getdouble("m901estclaotra4"));
				i.valor("m901estepiotra4", oldNIFSelector.getString("m901estepiotra4"));				
				i.valor("m901estactvtra5", oldNIFSelector.getString("m901estactvtra5"));
				i.valor("m901estclaotra5", oldNIFSelector.getdouble("m901estclaotra5"));
				i.valor("m901estepiotra5", oldNIFSelector.getString("m901estepiotra5"));				
				i.valor("m901estdopterc", oldNIFSelector.getString("m901estdopterc"));
				i.valor("m901estdconjnif", oldNIFSelector.getString("m901estdconjnif"));
				i.valor("m901estdconjrso", oldNIFSelector.getString("m901estdconjrso"));
				i.valor("m901repfisnif", oldNIFSelector.getString("m901repfisnif"));
				i.valor("m901repfisapell", oldNIFSelector.getString("m901repfisapell"));
				i.valor("m901repfissigla", oldNIFSelector.getString("m901repfissigla"));
				i.valor("m901repfiscalle", oldNIFSelector.getString("m901repfiscalle"));
				i.valor("m901repfisnumer", oldNIFSelector.getString("m901repfisnumer"));
				i.valor("m901repfisescal", oldNIFSelector.getString("m901repfisescal"));
				i.valor("m901repfispiso", oldNIFSelector.getString("m901repfispiso"));
				i.valor("m901repfisPuert", oldNIFSelector.getString("m901repfisPuert"));
				i.valor("m901repfistelef", oldNIFSelector.getString("m901repfistelef"));
				i.valor("m901repfismuni", oldNIFSelector.getString("m901repfismuni"));
				i.valor("m901repfisprov", oldNIFSelector.getString("m901repfisprov"));
				i.valor("m901repfiscpost", oldNIFSelector.getString("m901repfiscpost"));
				i.valor("m901repfechadec", oldNIFSelector.getDate("m901repfechadec"));
				i.valor("m901repjurfirmu", oldNIFSelector.getString("m901repjurfirmu"));
				i.valor("m901repjurfirdi", oldNIFSelector.getString("m901repjurfirdi"));
				i.valor("m901repjurfirme", oldNIFSelector.getString("m901repjurfirme"));
				i.valor("m901repjurfiran", oldNIFSelector.getString("m901repjurfiran"));
				i.valor("m901repjurapel1", oldNIFSelector.getString("m901repjurapel1"));
				i.valor("m901repjurnif1", oldNIFSelector.getString("m901repjurnif1"));
				i.valor("m901repjurfecp1", oldNIFSelector.getDate("m901repjurfecp1"));
				i.valor("m901repjurnota1", oldNIFSelector.getString("m901repjurnota1"));
				i.valor("m901repjurapel2", oldNIFSelector.getString("m901repjurapel2"));
				i.valor("m901repjurnif2", oldNIFSelector.getString("m901repjurnif2"));
				i.valor("m901repjurfecp2", oldNIFSelector.getDate("m901repjurfecp2"));
				i.valor("m901repjurnota2", oldNIFSelector.getString("m901repjurnota2"));
				i.valor("m901repjurapel3", oldNIFSelector.getString("m901repjurapel3"));
				i.valor("m901repjurnif3", oldNIFSelector.getString("m901repjurnif3"));
				i.valor("m901repjurfecp3", oldNIFSelector.getDate("m901repjurfecp3"));
				i.valor("m901repjurnota3", oldNIFSelector.getString("m901repjurnota3"));
				i.valor("m901fecha", oldNIFSelector.getDate("m901fecha"));
				i.valor("m901percont", oldNIFSelector.getString("m901percont"));
				i.valor("m901telcont", oldNIFSelector.getString("m901telcont"));
				i.valor("m901observa", oldNIFSelector.getString("m901observa"));
				i.valor("m901letetiq", oldNIFSelector.getString("m901letetiq"));
				i.valor("m901modelo", oldNIFSelector.getString("m901modelo"));
				i.valor("m901ape1", oldNIFSelector.getString("m901ape1"));
				i.valor("m901ape2", oldNIFSelector.getString("m901ape2"));
				i.valor("m901codprov", oldNIFSelector.getString("m901codprov"));
				i.valor("m901escalera", oldNIFSelector.getString("m901escalera"));
				i.valor("m901piso", oldNIFSelector.getString("m901piso"));
				i.valor("m901puerta", oldNIFSelector.getString("m901puerta"));
				i.valor("m901repfiscprov", oldNIFSelector.getint("m901repfiscprov"));
				i.valor("m901devsustitu", oldNIFSelector.getString("m901devsustitu"));
				i.valor("m901reggrup", oldNIFSelector.getString("m901reggrup"));
				i.valor("m901numgrup", oldNIFSelector.getString("m901numgrup"));
				i.valor("m901dom", oldNIFSelector.getString("m901dom"));
				i.valor("m901dep", oldNIFSelector.getString("m901dep"));
				i.valor("m901espsi", oldNIFSelector.getString("m901espsi"));
				i.valor("m901espno", oldNIFSelector.getString("m901espno"));
				i.valor("m901entdom", oldNIFSelector.getString("m901entdom"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from MOD180e where m180enif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD180e where m180edominio = '"+oldNIFSelector.getString("m180edominio")+"' and m180enif = '"+newNIF+"' and m180eejercicio = "+oldNIFSelector.getint("m180eejercicio")+" and m180eperiodo = '"+oldNIFSelector.getString("m180eperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MOD180r");
				execute = d.execute("m180rdominio = '"+oldNIFSelector.getString("m180edominio")+"' and m180rnif = '"+oldNIF+"' and m180rejercicio = "+oldNIFSelector.getint("m180eejercicio")+" and m180rperiodo = '"+oldNIFSelector.getString("m180eperiodo")+"'");
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 180-"+oldNIFSelector.getint("m180eejercicio")+"-"+oldNIF+" ya que existía un 180 con el nuevo NIF "+newNIF);
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD180e");
				i.valor("m180edominio", oldNIFSelector.getString("m180edominio"));
				i.valor("m180enif", newNIF);
				i.valor("m180eejercicio", oldNIFSelector.getint("m180eejercicio"));
				i.valor("m180eperiodo", oldNIFSelector.getString("m180eperiodo"));
				i.valor("m180edeleg", oldNIFSelector.getString("m180edeleg"));
				i.valor("m180eadmon", oldNIFSelector.getString("m180eadmon"));
				i.valor("m180ecodadmon", oldNIFSelector.getint("m180ecodadmon"));
				i.valor("m180etelefono", oldNIFSelector.getString("m180etelefono"));
				i.valor("m180eapellidos", oldNIFSelector.getString("m180eapellidos"));
				i.valor("m180esigla", oldNIFSelector.getString("m180esigla"));
				i.valor("m180ecalle", oldNIFSelector.getString("m180ecalle"));
				i.valor("m180enumero", oldNIFSelector.getString("m180enumero"));
				i.valor("m180emunicipio", oldNIFSelector.getString("m180emunicipio"));
				i.valor("m180eprovincia", oldNIFSelector.getint("m180eprovincia"));
				i.valor("m180ecpostal", oldNIFSelector.getString("m180ecpostal"));
				i.valor("m180efecha", oldNIFSelector.getDate("m180efecha"));
				i.valor("m180edecla", oldNIFSelector.getString("m180edecla"));
				i.valor("m180efirma", oldNIFSelector.getString("m180efirma"));
				i.valor("m180ecargofirm", oldNIFSelector.getString("m180ecargofirm"));
				i.valor("m180edeccomp", oldNIFSelector.getString("m180edeccomp"));
				i.valor("m180edecsust", oldNIFSelector.getString("m180edecsust"));
				i.valor("m180enrojusant", oldNIFSelector.getString("m180enrojusant"));
				i.valor("m180enrototper", oldNIFSelector.getint("m180enrototper"));
				i.valor("m180eimporte", oldNIFSelector.getdouble("m180eimporte"));
				i.valor("m180ereting", oldNIFSelector.getdouble("m180ereting"));
				i.valor("m180enumdecsop", oldNIFSelector.getint("m180enumdecsop"));
				i.valor("m180enumpersop", oldNIFSelector.getint("m180enumpersop"));
				i.valor("m180epercont", oldNIFSelector.getString("m180epercont"));
				i.valor("m180etelcont", oldNIFSelector.getString("m180etelcont"));
				i.valor("m180eobserva", oldNIFSelector.getString("m180eobserva"));
				i.valor("m180eletetiq", oldNIFSelector.getString("m180eletetiq"));
				i.valor("m180eescalera", oldNIFSelector.getString("m180eescalera"));
				i.valor("m180episo", oldNIFSelector.getString("m180episo"));
				i.valor("m180epuerta", oldNIFSelector.getString("m180epuerta"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from MOD190C where m190cnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD190C where m190cdominio = '"+oldNIFSelector.getString("m190cdominio")+"' and m190cnif = '"+newNIF+"' and m190cejercicio = "+oldNIFSelector.getint("m190cejercicio")+" and m190cperiodo = '"+oldNIFSelector.getString("m190cperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MOD190d");
				d.execute("m190ddominio = '"+oldNIFSelector.getString("m190cdominio")+"' and m190dnif = '"+oldNIF+"' and m190dejercicio = "+oldNIFSelector.getint("m190cejercicio")+" and m190dperiodo = '"+oldNIFSelector.getString("m190cperiodo")+"'");
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 190-"+oldNIFSelector.getint("m190cejercicio")+"-"+oldNIF+" ya que existía un 190 con el nuevo NIF "+newNIF);
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD190C");
				i.valor("m190cdominio", oldNIFSelector.getString("m190cdominio"));
				i.valor("m190cnif", newNIF);
				i.valor("m190cejercicio", oldNIFSelector.getint("m190cejercicio"));
				i.valor("m190cperiodo", oldNIFSelector.getString("m190cperiodo"));
				i.valor("m190cdelegacio", oldNIFSelector.getString("m190cdelegacio"));
				i.valor("m190cadmon", oldNIFSelector.getString("m190cadmon"));
				i.valor("m190ccodiadmon", oldNIFSelector.getString("m190ccodiadmon"));
				i.valor("m190crazon", oldNIFSelector.getString("m190crazon"));
				i.valor("m190ctelef", oldNIFSelector.getString("m190ctelef"));
				i.valor("m190csigla", oldNIFSelector.getString("m190csigla"));
				i.valor("m190cvia", oldNIFSelector.getString("m190cvia"));
				i.valor("m190cnumero", oldNIFSelector.getString("m190cnumero"));
				i.valor("m190cescala", oldNIFSelector.getString("m190cescala"));
				i.valor("m190cpiso", oldNIFSelector.getString("m190cpiso"));
				i.valor("m190cpuerta", oldNIFSelector.getString("m190cpuerta"));
				i.valor("m190cmuni", oldNIFSelector.getString("m190cmuni"));
				i.valor("m190cprovin", oldNIFSelector.getString("m190cprovin"));
				i.valor("m190cpostal", oldNIFSelector.getString("m190cpostal"));
				i.valor("m190ctiposop", oldNIFSelector.getString("m190ctiposop"));
				i.valor("m190cnomrel", oldNIFSelector.getString("m190cnomrel"));
				i.valor("m190cjustif", oldNIFSelector.getString("m190cjustif"));
				i.valor("m190csigno", oldNIFSelector.getString("m190csigno"));
				i.valor("m190cimpreso", oldNIFSelector.getString("m190cimpreso"));
				i.valor("m190cindivi", oldNIFSelector.getString("m190cindivi"));
				i.valor("m190ccolpre", oldNIFSelector.getString("m190ccolpre"));
				i.valor("m190ccolrete", oldNIFSelector.getString("m190ccolrete"));
				i.valor("m190ccomplem", oldNIFSelector.getString("m190ccomplem"));
				i.valor("m190csusti", oldNIFSelector.getString("m190csusti"));
				i.valor("m190cnumdecla", oldNIFSelector.getString("m190cnumdecla"));
				i.valor("m190ctotalper", oldNIFSelector.getint("m190ctotalper"));
				i.valor("m190cimppercep", oldNIFSelector.getdouble("m190cimppercep"));
				i.valor("m190cimpreten", oldNIFSelector.getdouble("m190cimpreten"));
				i.valor("m190cnumcolec", oldNIFSelector.getint("m190cnumcolec"));
				i.valor("m190cnumpercol", oldNIFSelector.getdouble("m190cnumpercol"));
				i.valor("m190cnumpresen", oldNIFSelector.getString("m190cnumpresen"));
				i.valor("m190cfecha", oldNIFSelector.getDate("m190cfecha"));
				i.valor("m190cretenedor", oldNIFSelector.getString("m190cretenedor"));
				i.valor("m190cprecolec", oldNIFSelector.getString("m190cprecolec"));
				i.valor("m190cfirmante", oldNIFSelector.getString("m190cfirmante"));
				i.valor("m190ccargofirma", oldNIFSelector.getString("m190ccargofirma"));
				i.valor("m190cpercont", oldNIFSelector.getString("m190cpercont"));
				i.valor("m190ctelcont", oldNIFSelector.getString("m190ctelcont"));
				i.valor("m190cobserva", oldNIFSelector.getString("m190cobserva"));
				i.valor("m190cletetiq", oldNIFSelector.getString("m190cletetiq"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from MOD347C where m347cnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD347C where m347cdominio = '"+oldNIFSelector.getString("m347cdominio")+"' and m347cnif = '"+newNIF+"' and m347cejercicio = "+oldNIFSelector.getint("m347cejercicio")+" and m347cperiodo = '"+oldNIFSelector.getString("m347cperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MOD347a");
				d.execute("m347adominio = '"+oldNIFSelector.getString("m347cdominio")+"' and m347anif = '"+oldNIF+"' and m347aejercicio = "+oldNIFSelector.getint("m347cejercicio")+" and m347aperiodo = '"+oldNIFSelector.getString("m347cperiodo")+"'");
				d = new Delete(connJModelos, "MOD347d");
				d.execute("m347ddominio = '"+oldNIFSelector.getString("m347cdominio")+"' and m347dnif = '"+oldNIF+"' and m347dejercicio = "+oldNIFSelector.getint("m347cejercicio")+" and m347dperiodo = '"+oldNIFSelector.getString("m347cperiodo")+"'");
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 347-"+oldNIFSelector.getint("m347cejercicio")+"-"+oldNIF+" ya que existía un 347 con el nuevo NIF "+newNIF);
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD347C");
				i.valor("m347cdominio", oldNIFSelector.getString("m347cdominio"));
				i.valor("m347cnif", newNIF);
				i.valor("m347cejercicio", oldNIFSelector.getint("m347cejercicio"));
				i.valor("m347cperiodo", oldNIFSelector.getString("m347cperiodo"));
				i.valor("m347cdelegacio", oldNIFSelector.getint("m347cdelegacio"));
				i.valor("m347cadmon", oldNIFSelector.getString("m347cadmon"));
				i.valor("m347ccodiadmon", oldNIFSelector.getint("m347ccodiadmon"));
				i.valor("m347crazon", oldNIFSelector.getString("m347crazon"));
				i.valor("m347ctelef", oldNIFSelector.getString("m347ctelef"));
				i.valor("m347csigla", oldNIFSelector.getString("m347csigla"));
				i.valor("m347cvia", oldNIFSelector.getString("m347cvia"));
				i.valor("m347cnumero", oldNIFSelector.getString("m347cnumero"));
				i.valor("m347cescala", oldNIFSelector.getString("m347cescala"));
				i.valor("m347cpiso", oldNIFSelector.getString("m347cpiso"));
				i.valor("m347cpuerta", oldNIFSelector.getString("m347cpuerta"));
				i.valor("m347cmuni", oldNIFSelector.getString("m347cmuni"));
				i.valor("m347cprovin", oldNIFSelector.getString("m347cprovin"));
				i.valor("m347cpostal", oldNIFSelector.getString("m347cpostal"));
				i.valor("m347ctiposop", oldNIFSelector.getString("m347ctiposop"));
				i.valor("m347cnomrel", oldNIFSelector.getString("m347cnomrel"));
				i.valor("m347cimpreso", oldNIFSelector.getString("m347cimpreso"));
				i.valor("m347cindivi", oldNIFSelector.getString("m347cindivi"));
				i.valor("m347ccolpre", oldNIFSelector.getString("m347ccolpre"));
				i.valor("m347ccolrete", oldNIFSelector.getString("m347ccolrete"));
				i.valor("m347ccomplem", oldNIFSelector.getString("m347ccomplem"));
				i.valor("m347csusti", oldNIFSelector.getString("m347csusti"));
				i.valor("m347cnumdecla", oldNIFSelector.getString("m347cnumdecla"));
				i.valor("m347ctotalper", oldNIFSelector.getint("m347ctotalper"));
				i.valor("m347cimpsop", oldNIFSelector.getdouble("m347cimpsop"));
				i.valor("m347ctotinmue", oldNIFSelector.getint("m347ctotinmue"));
				i.valor("m347cimplocal", oldNIFSelector.getdouble("m347cimplocal"));
				i.valor("m347cdeclarants", oldNIFSelector.getint("m347cdeclarants"));
				i.valor("m347cdeclarados", oldNIFSelector.getint("m347cdeclarados"));
				i.valor("m347cnumpre", oldNIFSelector.getString("m347cnumpre"));
				i.valor("m347cfecha", oldNIFSelector.getDate("m347cfecha"));
				i.valor("m347cdecla", oldNIFSelector.getString("m347cdecla"));
				i.valor("m347cfirmante", oldNIFSelector.getString("m347cfirmante"));
				i.valor("m347ccargofirma", oldNIFSelector.getString("m347ccargofirma"));
				i.valor("m347ctelcont", oldNIFSelector.getString("m347ctelcont"));
				i.valor("m347cpercont", oldNIFSelector.getString("m347cpercont"));
				i.valor("m347cobserva", oldNIFSelector.getString("m347cobserva"));
				i.valor("m347cletetiq", oldNIFSelector.getString("m347cletetiq"));
				i.valor("m347cnifrepre", oldNIFSelector.getString("m347cnifrepre"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from MOD193C where m193cnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD193C where m193cdominio = '"+oldNIFSelector.getString("m193cdominio")+"' and m193cnif = '"+newNIF+"' and m193cejercicio = "+oldNIFSelector.getint("m193cejercicio")+" and m193cperiodo = '"+oldNIFSelector.getString("m193cperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MOD193d");
				d.execute("m193ddominio = '"+oldNIFSelector.getString("m193cdominio")+"' and m193dnif = '"+oldNIF+"' and m193dejercicio = "+oldNIFSelector.getint("m193cejercicio")+" and m193dperiodo = '"+oldNIFSelector.getString("m193cperiodo")+"'");
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 193-"+oldNIFSelector.getint("m193cejercicio")+"-"+oldNIF+" ya que existía un 193 con el nuevo NIF "+newNIF);

			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD193C");
				i.valor("m193cdominio", oldNIFSelector.getString("m193cdominio"));
				i.valor("m193cnif", newNIF);
				i.valor("m193cejercicio", oldNIFSelector.getint("m193cejercicio"));
				i.valor("m193cperiodo", oldNIFSelector.getString("m193cperiodo"));
				i.valor("m193cdeleg", oldNIFSelector.getString("m193cdeleg"));
				i.valor("m193cadmin", oldNIFSelector.getString("m193cadmin"));
				i.valor("m193ccodadmon", oldNIFSelector.getint("m193ccodadmon"));
				i.valor("m193crazon", oldNIFSelector.getString("m193crazon"));
				i.valor("m193csoporte", oldNIFSelector.getString("m193csoporte"));
				i.valor("m193ctelefono", oldNIFSelector.getString("m193ctelefono"));
				i.valor("m193capellidos", oldNIFSelector.getString("m193capellidos"));
				i.valor("m193csiglas", oldNIFSelector.getString("m193csiglas"));
				i.valor("m193ccalle", oldNIFSelector.getString("m193ccalle"));
				i.valor("m193cnumero", oldNIFSelector.getString("m193cnumero"));
				i.valor("m193cmunicipio", oldNIFSelector.getString("m193cmunicipio"));
				i.valor("m193codprov", oldNIFSelector.getint("m193codprov"));
				i.valor("m193cprovincia", oldNIFSelector.getString("m193cprovincia"));
				i.valor("m193ccpostal", oldNIFSelector.getString("m193ccpostal"));
				i.valor("m193cfecha", oldNIFSelector.getDate("m193cfecha"));
				i.valor("m193cfirma", oldNIFSelector.getString("m193cfirma"));
				i.valor("m193ccargofirm", oldNIFSelector.getString("m193ccargofirm"));
				i.valor("m193cjustif", oldNIFSelector.getString("m193cjustif"));
				i.valor("m193cdeccomp", oldNIFSelector.getString("m193cdeccomp"));
				i.valor("m193cdecsust", oldNIFSelector.getString("m193cdecsust"));
				i.valor("m193cjustifant", oldNIFSelector.getString("m193cjustifant"));
				i.valor("m193ctotalper", oldNIFSelector.getint("m193ctotalper"));
				i.valor("m193cbase", oldNIFSelector.getdouble("m193cbase"));
				i.valor("m193cretencta", oldNIFSelector.getdouble("m193cretencta"));
				i.valor("m193creteingre", oldNIFSelector.getdouble("m193creteingre"));
				i.valor("m193cperioingre", oldNIFSelector.getdouble("m193cperioingre"));
				i.valor("m193cperioreten", oldNIFSelector.getdouble("m193cperioreten"));
				i.valor("m193cgastos", oldNIFSelector.getdouble("m193cgastos"));
				i.valor("m193cnaturaleza", oldNIFSelector.getString("m193cnaturaleza"));
				i.valor("m193cpercont", oldNIFSelector.getString("m193cpercont"));
				i.valor("m193ctelcont", oldNIFSelector.getString("m193ctelcont"));
				i.valor("m193cobserva", oldNIFSelector.getString("m193cobserva"));
				i.valor("m193cletetiq", oldNIFSelector.getString("m193cletetiq"));
				i.valor("m193csimplific", oldNIFSelector.getString("m193csimplific"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from MOD349C where m349cnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD349C where m349cdominio = '"+oldNIFSelector.getString("m349cdominio")+"' and m349cnif = '"+newNIF+"' and m349cejercicio = "+oldNIFSelector.getint("m349cejercicio")+" and m349cperiodo = '"+oldNIFSelector.getString("m349cperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MOD349d");
				d.execute("m349ddominio = '"+oldNIFSelector.getString("m349cdominio")+"' and m349dnif = '"+oldNIF+"' and m349dejercicio = "+oldNIFSelector.getint("m349cejercicio")+" and m349dperiodo = '"+oldNIFSelector.getString("m349cperiodo")+"'");
				d = new Delete(connJModelos, "MOD349r");
				d.execute("m349rdominio = '"+oldNIFSelector.getString("m349cdominio")+"' and m349rnif = '"+oldNIF+"' and m349rejercicio = "+oldNIFSelector.getint("m349cejercicio")+" and m349rperiodo = '"+oldNIFSelector.getString("m349cperiodo")+"'");
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 349-"+oldNIFSelector.getint("m349cejercicio")+"-"+oldNIFSelector.getString("m349cperiodo")+"-"+oldNIF+" ya que existía un 349 con el nuevo NIF "+newNIF);

			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD349C");
				i.valor("m349cdominio", oldNIFSelector.getString("m349cdominio"));
				i.valor("m349cnif", newNIF);
				i.valor("m349cejercicio", oldNIFSelector.getint("m349cejercicio"));
				i.valor("m349cperiodo", oldNIFSelector.getString("m349cperiodo"));
				i.valor("m349cdelegacio", oldNIFSelector.getString("m349cdelegacio"));
				i.valor("m349cadmon", oldNIFSelector.getString("m349cadmon"));
				i.valor("m349ccodiadmon", oldNIFSelector.getString("m349ccodiadmon"));
				i.valor("m349crazon", oldNIFSelector.getString("m349crazon"));
				i.valor("m349ctelefono", oldNIFSelector.getString("m349ctelefono"));
				i.valor("m349csigla", oldNIFSelector.getString("m349csigla"));
				i.valor("m349cvia", oldNIFSelector.getString("m349cvia"));
				i.valor("m349cnumero", oldNIFSelector.getString("m349cnumero"));
				i.valor("m349cescalera", oldNIFSelector.getString("m349cescalera"));
				i.valor("m349cpiso", oldNIFSelector.getString("m349cpiso"));
				i.valor("m349cpuerta", oldNIFSelector.getString("m349cpuerta"));
				i.valor("m349cmunicipio", oldNIFSelector.getString("m349cmunicipio"));
				i.valor("m349cprovincia", oldNIFSelector.getString("m349cprovincia"));
				i.valor("m349ccpostal", oldNIFSelector.getString("m349ccpostal"));
				i.valor("m349ctiposop", oldNIFSelector.getString("m349ctiposop"));
				i.valor("m349cnomrel", oldNIFSelector.getString("m349cnomrel"));
				i.valor("m349ctelefrel", oldNIFSelector.getString("m349ctelefrel"));
				i.valor("m349cimpreso", oldNIFSelector.getString("m349cimpreso"));
				i.valor("m349cindivi", oldNIFSelector.getString("m349cindivi"));
				i.valor("m349ccolpre", oldNIFSelector.getString("m349ccolpre"));
				i.valor("m349ccolrete", oldNIFSelector.getString("m349ccolrete"));
				i.valor("m349ccomplem", oldNIFSelector.getString("m349ccomplem"));
				i.valor("m349csusti", oldNIFSelector.getString("m349csusti"));
				i.valor("m349cnjustifant", oldNIFSelector.getdouble("m349cnjustifant"));
				i.valor("m349cnumope", oldNIFSelector.getdouble("m349cnumope"));
				i.valor("m349cimporte", oldNIFSelector.getdouble("m349cimporte"));
				i.valor("m349cnumoperec", oldNIFSelector.getdouble("m349cnumoperec"));
				i.valor("m349cimprectif", oldNIFSelector.getdouble("m349cimprectif"));
				i.valor("m349cnumdecsop", oldNIFSelector.getdouble("m349cnumdecsop"));
				i.valor("m349cnumpersop", oldNIFSelector.getdouble("m349cnumpersop"));
				i.valor("m349cfecha", oldNIFSelector.getDate("m349cfecha"));
				i.valor("m349cfirma", oldNIFSelector.getString("m349cfirma"));
				i.valor("m349ccargofirma", oldNIFSelector.getString("m349ccargofirma"));
				i.valor("m349cletetiq", oldNIFSelector.getString("m349cletetiq"));
				i.valor("m349cpercont", oldNIFSelector.getString("m349cpercont"));
				i.valor("m349ctelcont", oldNIFSelector.getString("m349ctelcont"));
				i.valor("m349cobserva", oldNIFSelector.getString("m349cobserva"));
				i.valor("m349ccodprov", oldNIFSelector.getint("m349ccodprov"));
				i.valor("m349ccoddeleg", oldNIFSelector.getint("m349ccoddeleg"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from MODINTC where mintcnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MODINTC where mintcdominio = '"+oldNIFSelector.getString("mintcdominio")+"' and mintcnif = '"+newNIF+"' and mintcejercicio = "+oldNIFSelector.getint("mintcejercicio")+" and mintcperiodo = '"+oldNIFSelector.getString("mintcperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MODINTD");
				d.execute("mintddominio = '"+oldNIFSelector.getString("mintcdominio")+"' and mintdnif = '"+oldNIF+"' and mintdejercicio = "+oldNIFSelector.getint("mintcejercicio")+" and mintdperiodo = '"+oldNIFSelector.getString("mintcperiodo")+"'");
				grabarIncidencia("jModelos", "Se ha eliminado el modelo INT-"+oldNIFSelector.getint("mintdejercicio")+"-"+oldNIFSelector.getString("mintcperiodo")+"-"+oldNIF+" ya que existía un INT con el nuevo NIF "+newNIF);

			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MODINTC");
				i.valor("mintcdominio", oldNIFSelector.getString("mintcdominio"));
				i.valor("mintcnif", newNIF);
				i.valor("mintcejercicio", oldNIFSelector.getint("mintcejercicio"));
				i.valor("mintcperiodo", oldNIFSelector.getString("mintcperiodo"));
				i.valor("mintcflujo", oldNIFSelector.getString("mintcflujo"));
				i.valor("mintcnumdecl", oldNIFSelector.getint("mintcnumdecl"));
				i.valor("mintctipodec", oldNIFSelector.getString("mintctipodec"));
				i.valor("mintcmoneda", oldNIFSelector.getString("mintcmoneda"));
				i.valor("mintcfechaemi", oldNIFSelector.getDate("mintcfechaemi"));
				i.valor("mintcniftercero", oldNIFSelector.getString("mintcniftercero"));
				i.valor("mintcnomtercero", oldNIFSelector.getString("mintcnomtercero"));
				i.valor("mintctotalmasa", oldNIFSelector.getdouble("mintctotalmasa"));
				i.valor("mintctotalunid", oldNIFSelector.getdouble("mintctotalunid"));
				i.valor("mintctotalfact", oldNIFSelector.getdouble("mintctotalfact"));
				i.valor("mintctotalestad", oldNIFSelector.getdouble("mintctotalestad"));
				i.valor("mintcnomnif", oldNIFSelector.getString("mintcnomnif"));
				i.valor("mintclugaremi", oldNIFSelector.getString("mintclugaremi"));
				i.valor("mintcnumtotpart", oldNIFSelector.getint("mintcnumtotpart"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		oldNIFSelector.close();
		
		/*modelos2*/
		oldNIFSelector.execute("Select * from MOD184D where m184dnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD184D where m184ddominio = '"+oldNIFSelector.getString("m184ddominio")+"' and m184dnif = '"+newNIF+"' and m184dejercicio = "+oldNIFSelector.getint("m184dejercicio")+" and m184dperiodo = '"+oldNIFSelector.getString("m184dperiodo")+"'");
			if(newNIFSelector.next()) {
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 184 m184ddominio = '"+oldNIFSelector.getString("m184ddominio")+"' and m184dnif = '"+oldNIF+"' and m184dejercicio = "+oldNIFSelector.getint("m184dejercicio")+" and m184dperiodo = '"+oldNIFSelector.getString("m184dperiodo")+"' ya que existía un 184 con el nuevo NIF "+newNIF);
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD184D");
				i.valor("m184ddominio", oldNIFSelector.getString("m184ddominio"));
				i.valor("m184dnif", newNIF);
				i.valor("m184dejercicio", oldNIFSelector.getint("m184dejercicio"));
				i.valor("m184dperiodo", oldNIFSelector.getString("m184dperiodo"));
				i.valor("m184ddeleg", oldNIFSelector.getString("m184ddeleg"));
				i.valor("m184dadmon", oldNIFSelector.getString("m184dadmon"));
				i.valor("m184dcodadmon", oldNIFSelector.getint("m184dcodadmon"));
				i.valor("m184dtelefono", oldNIFSelector.getString("m184dtelefono"));
				i.valor("m184dapellidos", oldNIFSelector.getString("m184dapellidos"));
				i.valor("m184dsigla", oldNIFSelector.getString("m184dsigla"));
				i.valor("m184dcalle", oldNIFSelector.getString("m184dcalle"));
				i.valor("m184dnumero", oldNIFSelector.getString("m184dnumero"));
				i.valor("m184dmunicipio", oldNIFSelector.getString("m184dmunicipio"));
				i.valor("m184dprovincia", oldNIFSelector.getint("m184dprovincia"));
				i.valor("m184dcpostal", oldNIFSelector.getString("m184dcpostal"));
				i.valor("m184dfecha", oldNIFSelector.getDate("m184dfecha"));
				i.valor("m184ddecla", oldNIFSelector.getString("m184ddecla"));
				i.valor("m184dfirma", oldNIFSelector.getString("m184dfirma"));
				i.valor("m184dcargofirm", oldNIFSelector.getString("m184dcargofirm"));
				i.valor("m184ddeccomp", oldNIFSelector.getString("m184ddeccomp"));
				i.valor("m184ddecsust", oldNIFSelector.getString("m184ddecsust"));
				i.valor("m184dnrojusant", oldNIFSelector.getString("m184dnrojusant"));
				i.valor("m184dnumtotreg", oldNIFSelector.getint("m184dnumtotreg"));
				i.valor("m184desptipoent", oldNIFSelector.getString("m184desptipoent"));
				i.valor("m184despactprin", oldNIFSelector.getString("m184despactprin"));
				i.valor("m184dexttipoent", oldNIFSelector.getString("m184dexttipoent"));
				i.valor("m184dextobjeto", oldNIFSelector.getString("m184dextobjeto"));
				i.valor("m184dextclvpais", oldNIFSelector.getString("m184dextclvpais"));
				i.valor("m184dextporrent", oldNIFSelector.getdouble("m184dextporrent"));
				i.valor("m184dtribregiis", oldNIFSelector.getString("m184dtribregiis"));
				i.valor("m184dimpocifra", oldNIFSelector.getdouble("m184dimpocifra"));
				i.valor("m184dnifrepre", oldNIFSelector.getString("m184dnifrepre"));
				i.valor("m184dnomprepre", oldNIFSelector.getString("m184dnomprepre"));
				i.valor("m184dsiglarepre", oldNIFSelector.getString("m184dsiglarepre"));
				i.valor("m184dcallerepre", oldNIFSelector.getString("m184dcallerepre"));
				i.valor("m184dnumrepre", oldNIFSelector.getString("m184dnumrepre"));
				i.valor("m184dmunirepre", oldNIFSelector.getString("m184dmunirepre"));
				i.valor("m184dprovrepre", oldNIFSelector.getint("m184dprovrepre"));
				i.valor("m184dcpostrepre", oldNIFSelector.getString("m184dcpostrepre"));
				i.valor("m184dpercont", oldNIFSelector.getString("m184dpercont"));
				i.valor("m184dtelcont", oldNIFSelector.getString("m184dtelcont"));
				i.valor("m184dobserva", oldNIFSelector.getString("m184dobserva"));
				i.valor("m184dletetiq", oldNIFSelector.getString("m184dletetiq"));
				i.valor("m184descalera", oldNIFSelector.getString("m184descalera"));
				i.valor("m184dpiso", oldNIFSelector.getString("m184dpiso"));
				i.valor("m184dpuerta", oldNIFSelector.getString("m184dpuerta"));
				i.valor("m184dtotardto", oldNIFSelector.getdouble("m184dtotardto"));
				i.valor("m184dtotareduc", oldNIFSelector.getdouble("m184dtotareduc"));
				i.valor("m184dtotbrdto", oldNIFSelector.getdouble("m184dtotbrdto"));
				i.valor("m184dtotcrdto", oldNIFSelector.getdouble("m184dtotcrdto"));
				i.valor("m184dtotcreduc", oldNIFSelector.getdouble("m184dtotcreduc"));
				i.valor("m184dtotdrdto", oldNIFSelector.getdouble("m184dtotdrdto"));
				i.valor("m184dtotdreduc", oldNIFSelector.getdouble("m184dtotdreduc"));
				i.valor("m184dtoterenta", oldNIFSelector.getdouble("m184dtoterenta"));
				i.valor("m184dtotfganan", oldNIFSelector.getdouble("m184dtotfganan"));
				i.valor("m184dtotfperdi", oldNIFSelector.getdouble("m184dtotfperdi"));
				i.valor("m184dtotgganan", oldNIFSelector.getdouble("m184dtotgganan"));
				i.valor("m184dtotgperdi", oldNIFSelector.getdouble("m184dtotgperdi"));
				i.valor("m184dtothrenta", oldNIFSelector.getdouble("m184dtothrenta"));
				i.valor("m184dtotibdedu", oldNIFSelector.getdouble("m184dtotibdedu"));
				i.valor("m184dtotibded1", oldNIFSelector.getdouble("m184dtotibded1"));
				i.valor("m184dtotibded2", oldNIFSelector.getdouble("m184dtotibded2"));
				i.valor("m184dtotibded3", oldNIFSelector.getdouble("m184dtotibded3"));
				i.valor("m184dtotibded4", oldNIFSelector.getdouble("m184dtotibded4"));
				i.valor("m184dtotibded5", oldNIFSelector.getdouble("m184dtotibded5"));
				i.valor("m184dtotibded6", oldNIFSelector.getdouble("m184dtotibded6"));
				i.valor("m184dtotjbdedu", oldNIFSelector.getdouble("m184dtotjbdedu"));
				i.valor("m184dtotjbded1", oldNIFSelector.getdouble("m184dtotjbded1"));
				i.valor("m184dtotjbded2", oldNIFSelector.getdouble("m184dtotjbded2"));
				i.valor("m184dtotjbded3", oldNIFSelector.getdouble("m184dtotjbded3"));
				i.valor("m184dtotjbded4", oldNIFSelector.getdouble("m184dtotjbded4"));
				i.valor("m184dtotjbded5", oldNIFSelector.getdouble("m184dtotjbded5"));
				i.valor("m184dtotjbded6", oldNIFSelector.getdouble("m184dtotjbded6"));
				i.valor("m184dtotkreten", oldNIFSelector.getdouble("m184dtotkreten"));
				i.valor("m184dtotlexren", oldNIFSelector.getdouble("m184dtotlexren"));
				i.valor("m184dissnoresid", oldNIFSelector.getString("m184dissnoresid"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
			
		oldNIFSelector.close();
		/*MODGEN*/
		oldNIFSelector.execute("Select * from MODESTADO where mesnif = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MODESTADO where mesdominio = '"+oldNIFSelector.getString("mesdominio")+"' and mesmodelo = '"+oldNIFSelector.getString("mesmodelo")+"' and mesnif = '"+newNIF+"' and mesejercicio = "+oldNIFSelector.getint("mesejercicio")+" and mesperiodo = '"+oldNIFSelector.getString("mesperiodo")+"'");			
			if(newNIFSelector.next()) {
				grabarIncidencia("jModelos", "Se ha eliminado el estado del Modelo mesdominio = '"+oldNIFSelector.getString("mesdominio")+"' and mesmodelo = '"+oldNIFSelector.getString("mesmodelo")+"' and mesnif = '"+oldNIF+"' and mesejercicio = "+oldNIFSelector.getint("mesejercicio")+" and mesperiodo = '"+oldNIFSelector.getString("mesperiodo")+"' ya que existía un Modestado con el nuevo NIF "+newNIF);
				
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MODESTADO");
				i.valor("mesdominio", oldNIFSelector.getString("mesdominio"));
				i.valor("mesmodelo", oldNIFSelector.getString("mesmodelo"));	
				i.valor("mesnif", newNIF);
				i.valor("mesejercicio", oldNIFSelector.getint("mesejercicio"));
				i.valor("mesperiodo", oldNIFSelector.getString("mesperiodo"));
				i.valor("mesestado", oldNIFSelector.getString("mesestado"));
				i.valor("mesorigen", oldNIFSelector.getString("mesorigen"));
				i.valor("mesfecha", oldNIFSelector.getDate("mesfecha"));
				i.valor("mescomment", oldNIFSelector.getString("mescomment"));
				i.valor("mesformatop", oldNIFSelector.getString("mesformatop"));
				i.valor("mesestadop", oldNIFSelector.getString("mesestadop"));
				i.valor("mesfechap", oldNIFSelector.getDate("mesfechap"));
				i.valor("meserrorp", oldNIFSelector.getString("meserrorp"));
				i.valor("mesformatom", oldNIFSelector.getString("mesformatom"));
				i.valor("mesestadom", oldNIFSelector.getString("mesestadom"));
				i.valor("mesfecham", oldNIFSelector.getDate("mesfecham"));
				i.valor("meserrorm", oldNIFSelector.getString("meserrorm"));
				i.valor("mesformatot", oldNIFSelector.getString("mesformatot"));
				i.valor("mesestadot", oldNIFSelector.getString("mesestadot"));
				i.valor("mesfechat", oldNIFSelector.getDate("mesfechat"));
				i.valor("meserrort", oldNIFSelector.getString("meserrort"));
				i.valor("mesformatos", oldNIFSelector.getString("mesformatos"));
				i.valor("mesestados", oldNIFSelector.getString("mesestados"));
				i.valor("mesfechas", oldNIFSelector.getDate("mesfechas"));
				i.valor("meserrors", oldNIFSelector.getString("meserrors"));
				i.valor("mesformatol", oldNIFSelector.getString("mesformatol"));
				i.valor("mesestadol", oldNIFSelector.getString("mesestadol"));
				i.valor("mesfechal", oldNIFSelector.getDate("mesfechal"));
				i.valor("meserrorl", oldNIFSelector.getString("meserrorl"));
				i.valor("meserror", oldNIFSelector.getString("meserror"));
				i.valor("mesficherotel", oldNIFSelector.getString("mesficherotel"));
				i.valor("mestipodecl", oldNIFSelector.getString("mestipodecl"));
				i.valor("mesbanco", oldNIFSelector.getint("mesbanco"));
				i.valor("mesficherolote", oldNIFSelector.getString("mesficherolote"));
				i.valor("mesimporteliq", oldNIFSelector.getdouble("mesimporteliq"));
				i.valor("mesimportedeuda", oldNIFSelector.getdouble("mesimportedeuda"));
				i.valor("mesnrcbanco", oldNIFSelector.getString("mesnrcbanco"));
				i.valor("mescccpago", oldNIFSelector.getString("mescccpago"));
				i.valor("mesfechaopenrc", oldNIFSelector.getDate("mesfechaopenrc"));
				i.valor("mespresentada", oldNIFSelector.getString("mespresentada"));
				i.valor("mesobserv", oldNIFSelector.getString("mesobserv"));
				i.valor("mesuser", oldNIFSelector.getString("mesuser"));
				i.valor("mescdp", oldNIFSelector.getString("mescdp"));
				i.valor("mesautomatico", oldNIFSelector.getString("mesautomatico"));
				i.valor("mesaplic", oldNIFSelector.getString("mesaplic"));
				i.valor("mesrazon", oldNIFSelector.getString("mesrazon"));
				i.valor("mesquienpres", oldNIFSelector.getString("mesquienpres"));
				i.valor("mesquienpaga", oldNIFSelector.getString("mesquienpaga"));
				i.valor("mesestacobrada", oldNIFSelector.getString("mesestacobrada"));
				i.valor("mesentregacli", oldNIFSelector.getDate("mesentregacli"));
				i.valor("mesformatok", oldNIFSelector.getString("mesformatok"));
				i.valor("mesestadok", oldNIFSelector.getString("mesestadok"));
				i.valor("mesfechak", oldNIFSelector.getDate("mesfechak"));
				i.valor("meserrork", oldNIFSelector.getString("meserrork"));
				i.valor("mesuserk", oldNIFSelector.getString("mesuserk"));
				i.valor("mesplatk", oldNIFSelector.getString("mesplatk"));
				execute = i.execute();
			}
			newNIFSelector.close();
		}
		
		oldNIFSelector.close();
		oldNIFSelector.execute("Select * from MODACTEO where MAENIF = '"+oldNIF+"'");
		
		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{
			
			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MODACTEO where MAEDOMINIO = '"+oldNIFSelector.getString("MAEDOMINIO")+"' and MAENIF = '"+newNIF+"' and MAECODIGO = "+oldNIFSelector.getint("MAECODIGO"));			
			if(newNIFSelector.next()) {
				grabarIncidencia("jModelos", "Se ha eliminado ACTEO MAEDOMINIO = '"+oldNIFSelector.getString("MAEDOMINIO")+"' and MAENIF = '"+newNIF+"' and MAECODIGO = "+oldNIFSelector.getint("MAECODIGO")+"' ya que existía una ACTEO con el nuevo NIF "+newNIF);				
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				connJModelos.getDB().getCatalogs()[2].getTable("modacteo").getColumn("maecodigo").setAutoIncrementable(false);
				Insert i = new Insert(connJModelos, "MODACTEO");
				i.valor("MAEDOMINIO", oldNIFSelector.getString("MAEDOMINIO"));
				i.valor("MAENIF", newNIF);
				i.valor("MAECODIGO", oldNIFSelector.getint("MAECODIGO"));
				i.valor("MAEEPIGRAFE", oldNIFSelector.getString("MAEEPIGRAFE"));
				i.valor("MAELETRA", oldNIFSelector.getString("MAELETRA"));
				i.valor("MAEDESCRIPCION", oldNIFSelector.getString("MAEDESCRIPCION"));
				i.valor("MAETIPOMUNI", oldNIFSelector.getString("MAETIPOMUNI"));
				i.valor("MAEHABITAN", oldNIFSelector.getString("MAEHABITAN"));
				i.valor("MAEVEHICUL", oldNIFSelector.getint("MAEVEHICUL"));
				i.valor("MAECARGA", oldNIFSelector.getString("MAECARGA"));
				i.valor("MAELOCALES", oldNIFSelector.getint("MAELOCALES"));
				i.valor("MAELOCALEXC", oldNIFSelector.getString("MAELOCALEXC"));
				i.valor("MAEDIASTEMP", oldNIFSelector.getint("MAEDIASTEMP"));
				i.valor("MAEDIAST1", oldNIFSelector.getint("MAEDIAST1"));
				i.valor("MAEDIAST2", oldNIFSelector.getint("MAEDIAST2"));
				i.valor("MAEDIAST3", oldNIFSelector.getint("MAEDIAST3"));
				i.valor("MAEDIAST4", oldNIFSelector.getint("MAEDIAST4"));
				i.valor("MAEEJERINI", oldNIFSelector.getint("MAEEJERINI"));
				i.valor("MAEHORASCONV", oldNIFSelector.getint("MAEHORASCONV"));
				i.valor("MAECEUTA", oldNIFSelector.getString("MAECEUTA"));
				i.valor("MAEPORCENATRI", oldNIFSelector.getdouble("MAEPORCENATRI"));
				i.valor("MAEMODEJER", oldNIFSelector.getint("MAEMODEJER"));
				i.valor("MAEMODPER", oldNIFSelector.getString("MAEMODPER"));
				i.valor("MAEACTIVIDAD", oldNIFSelector.getint("MAEACTIVIDAD"));
				i.valor("MAEEJERCICIO", oldNIFSelector.getint("MAEEJERCICIO"));
				i.valor("MAEFECINI", oldNIFSelector.getDate("MAEFECINI"));
				i.valor("MAEFECFIN", oldNIFSelector.getDate("MAEFECFIN"));
				i.valor("MAEENLACEJEO", oldNIFSelector.getString("MAEENLACEJEO"));
				i.valor("MAENUMTRACTO", oldNIFSelector.getint("MAENUMTRACTO"));
				i.valor("MAENUMSEMI", oldNIFSelector.getint("MAENUMSEMI"));
				execute = i.execute();
				connJModelos.getDB().getCatalogs()[2].getTable("modacteo").getColumn("maecodigo").setAutoIncrementable(true);
			}
			newNIFSelector.close();
		}
	
		
		
		oldNIFSelector.close();
		
		/*Hacemos el update de las tablas que no tienen problemas de restricciones*/
		if (execute) execute = UpdateNIFs(connJModelos);
		
		/*Borramos los campos con los NIF antiguos que previamente habiamos duplicado*/
		if (execute) execute = DeleteNIFs(connJModelos);
		
		if (execute) execute = evaluarIncidenciasJModelos ();
		return execute;
	}
	
	private boolean evaluarIncidenciasJModelos() {
		Hashtable<String,String> ht = new Hashtable<String, String>();
		Selector s = new Selector (connJModelos);
		s.execute("Select * from MODACTEO where MAENIF='"+newNIF+"'");
		while (s.next()) {
			String enlace = s.getString("MAEENLACEJEO");
			if (enlace == null) enlace = "";
			int act = s.getint("MAEACTIVIDAD");
			int ejer = s.getint("MAEEJERCICIO");
			String clave = Util.rpad(String.valueOf(act), 6);
			clave += Util.rpad(enlace.trim(), 12);
			clave += Util.rpad(String.valueOf(ejer), 4);
			String msgemp = "";
			if (enlace.length()==12) msgemp = ", empresa "+enlace.substring(0,6);
			if (ht.containsKey(clave)) {
				grabarIncidencia("jModelos", "Para el nif ["+newNIF+"] ya existen acumulados de módulos no agricolas del ejercicio "+ejer+msgemp+" y actividad "+act);
			}
			else ht.put(clave,"X");
		}
		s.close();
		return true;
	}

	private boolean UpdateNIFs(DBConnection connJModelos) 
	{
		boolean execute = true;
		
		/*modelos1*/
		//execute = UpdateNIF(connJModelos, "MOD300", "m300nif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD300DES", "m300dnif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD300PRO", "mpronif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD370", "m370nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD110", "m110nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD115", "m115nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD130", "m130nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD131", "m131nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD310", "m310nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD311", "m311nif",(connJModelos.getDB().getCatalogs())[0]);
		//if(execute) execute = UpdateNIF(connJModelos, "MOD3901", "m901nif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD3902", "m902nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD390ACT", "m90anif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD3903", "m903nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD3904", "m904nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD3925", "m925nif",(connJModelos.getDB().getCatalogs())[0]);
		//if(execute) execute = UpdateNIF(connJModelos, "MOD180e", "m180enif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD180r", "m180rnif");
		//if(execute) execute = UpdateNIF(connJModelos, "MOD190C", "m190cnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD190D", "m190dnif");
		if(execute) execute = UpdateNIF(connJModelos, "CERTIFGRAL", "cerpercepnif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "CERTIPROF", "ceppercepnif",(connJModelos.getDB().getCatalogs())[0]);
		//if(execute) execute = UpdateNIF(connJModelos, "MOD347C", "m347cnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD347D", "m347dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD347A", "m347anif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD202", "m202nif",(connJModelos.getDB().getCatalogs())[0]);
		//if(execute) execute = UpdateNIF(connJModelos, "MOD193C", "m193cnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD193D", "m193dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD123", "m123nif",(connJModelos.getDB().getCatalogs())[0]);
		//if(execute) execute = UpdateNIF(connJModelos, "MOD349C", "m349cnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD349D", "m349dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD349R", "m349rnif");
		//if(execute) execute = UpdateNIF(connJModelos, "MODINTC", "mintcnif");
		if(execute) execute = UpdateNIF(connJModelos, "MODINTD", "mintdnif");
		if(execute) execute = tratar110D_115D_349ACUM(connJModelos, "MOD110D", "m110dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD110D", "m110dnif");
		if(execute) execute = tratar110D_115D_349ACUM(connJModelos, "MOD115D", "m115dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD115D", "m115dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD300PRODES", "m300pnif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD390DES", "m390dnif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD110ACUM", "m110anif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = tratar110D_115D_349ACUM(connJModelos, "MOD349ACUM", "m349anif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD349ACUM", "m349anif");
		
		/*modelos2*/
		//if(execute) execute = UpdateNIF(connJModelos, "MOD184D", "m184dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD184E", "m184enif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD184N", "m184nnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD0361", "m0361nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0362", "m0362nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0363", "m0363nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0364", "m0364nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0365", "m0365nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0366", "m0366nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0367", "m0367nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0368", "m0368nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD0369", "m0369nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD03610", "m03610nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD03611", "m03611nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD576", "m576nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD130DES", "M130DNIF",(connJModelos.getDB().getCatalogs())[1]);
		
		/*MODGEN*/
		//if(execute) execute = UpdateNIF(connJModelos, "MODESTADO", "mesnif");
		if(execute) execute = UpdateNIF(connJModelos, "MODNIFCDP", "mncnif",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "PRESENTADOR", "prenif");
		//if(execute) execute = UpdateNIF(connJModelos, "MODACTEO", "MAENIF");
		if(execute) execute = UpdateNIF(connJModelos, "MODIRPF", "MAINIF",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "MODIVA", "MAVNIF",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "MODUNI", "MAUNIF",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "MODAGRIVA", "MAANIF",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "MODRDTOAGR", "MRANIF",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "MODINGAGR", "MNANIF",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "CODELECMAT", "cemnif");
		if(execute) execute = UpdateNIF(connJModelos, "IMPORTCFG", "imcnif",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "IMPORTHIS", "imhnif");		
		return execute;
	}
	
	private boolean UpdateNIF(DBConnection conn, String nomTaula, String nomCampNIF, Catalog catalog)
	{
		boolean execute = true;
		TableDef tb = catalog.getTable(nomTaula.toLowerCase());
		String condicion = "";
		FieldDef[] primaryKeys = tb.getPrimaryKeys();
		FieldDef primaryKey = null;
		Selector oldNIFSelector = new Selector(conn);
		
		
		oldNIFSelector.execute("Select * from "+nomTaula+" where "+nomCampNIF+" = '"+oldNIF+"'");
		
		while(oldNIFSelector.next())
		{
			for(int i = 0; i < primaryKeys.length; i++)
			{
				primaryKey = primaryKeys[i];
				condicion = condicion.concat(primaryKey.getName());
				
				if(primaryKey.getType() == FieldDef.INTEGER)
				{
					condicion = condicion.concat(" ="+oldNIFSelector.getint(primaryKey.getName()));
				}
				else if(primaryKey.getType() == FieldDef.DOUBLE)
				{
					condicion = condicion.concat(" ="+oldNIFSelector.getdouble(primaryKey.getName()));
				}
				else //String
				{
					if(nomCampNIF.trim().toLowerCase().equals(primaryKey.getName().trim().toLowerCase()))
					{
						condicion = condicion.concat(" ='"+newNIF+"'");
					}
					else
					{
						condicion = condicion.concat(" ='"+oldNIFSelector.getString(primaryKey.getName())+"'");
					}
				}
				condicion = condicion.concat(" and ");
			}
			condicion = condicion.substring(0, condicion.length()-4);
			
			Selector selector = new Selector(conn);
			selector.execute("Select * from "+nomTaula+" where "+condicion);
			
			condicion = "";
			
			for(int i = 0; i < primaryKeys.length; i++)
			{
				primaryKey = primaryKeys[i];
				condicion = condicion.concat(primaryKey.getName());
				
				if(primaryKey.getType() == FieldDef.INTEGER)
				{
					condicion = condicion.concat(" ="+oldNIFSelector.getint(primaryKey.getName()));
				}
				else if(primaryKey.getType() == FieldDef.DOUBLE)
				{
					condicion = condicion.concat(" ="+oldNIFSelector.getdouble(primaryKey.getName()));
				}
				else //String
				{
					if(nomCampNIF.trim().toLowerCase().equals(primaryKey.getName().trim().toLowerCase()))
					{
						condicion = condicion.concat(" ='"+oldNIF+"'");
					}
					else
					{
						condicion = condicion.concat(" ='"+oldNIFSelector.getString(primaryKey.getName())+"'");
					}
				}
				condicion = condicion.concat(" and ");
			}
			condicion = condicion.substring(0, condicion.length()-4);
			
			if(selector.next())
			{
				//existe una pk con el nuevo nif
				
				Delete d = new Delete(conn, nomTaula);
					
				if(execute) execute = d.execute(condicion);
				
				System.out.println("Select * from "+nomTaula+" where "+condicion);
				grabarIncidencia("jModelos", "Se ha eliminado de la tabla"+nomTaula+" el registro "+condicion+" ya que existía otro con el nuevo NIF "+newNIF);

				
			}
			else
			{
				/*Update del registro con el nuevo nif*/
				Update up = new Update(conn, nomTaula);
				
				up.valor(nomCampNIF, newNIF);
				
				if(execute) execute = up.execute(condicion);
			}
			condicion = "";
			selector.close();
		}
		oldNIFSelector.close();
		
	return execute;
	}
	
	private boolean UpdateNIF(DBConnection conn, String nomTaula, String nomCampNIF)
	{
		boolean execute = true;
		Update up = new Update(conn, nomTaula);
		up.valor(nomCampNIF, newNIF);
		
		if(nomTaula.trim().toUpperCase().equals("CDP"))
		{
			/*Se tiene que filtrar por oldNIF y por cdp*/
			execute = up.execute(nomCampNIF+"='"+oldNIF+"' and cdpcodi='"+cdp+"'");
		}
		else
		{
			execute = up.execute(nomCampNIF+"='"+oldNIF+"'");
		}
		
		return(execute);
	}
	
	private boolean DeleteNIFs(DBConnection connJModelos) 
	{
		/*modelos1*/
		Delete d = new Delete(connJModelos, "MOD300");
		boolean execute = d.execute("m300nif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MOD3901");
		if(execute)  execute = d.execute("m901nif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MOD180e");
		if(execute)  execute = d.execute("m180enif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MOD190C");
		if(execute)  execute = d.execute("m190cnif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MOD347C");
		if(execute)  execute = d.execute("m347cnif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MOD193C");
		if(execute)  execute = d.execute("m193cnif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MOD349C");
		if(execute)  execute = d.execute("m349cnif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MODINTC");
		if(execute)  execute = d.execute("mintcnif='"+oldNIF+"'");
		
		/*modelos2*/
		d = new Delete(connJModelos, "MOD184D");
		if(execute)  execute = d.execute("m184dnif='"+oldNIF+"'");
		
		/*MODGEN*/
		d = new Delete(connJModelos, "MODESTADO");
		if(execute)  execute = d.execute("mesnif='"+oldNIF+"'");
		
		d = new Delete(connJModelos, "MODACTEO");
		if(execute) execute = d.execute("MAENIF='"+oldNIF+"'");	
		
		return execute;
	}
	
	private boolean tratar110D_115D_349ACUM(DBConnection conn, String nomTaula, String nomCampNIF )
	{
		boolean execute = true;
		Selector newNIFSelector = new Selector(conn);
		
		newNIFSelector.execute("Select * from "+nomTaula+" where "+nomCampNIF+" = '"+newNIF+"'");
		if(nomTaula.trim().toUpperCase().equals("MOD110D"))
		{
			while(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m110ddominio  = '"+newNIFSelector.getString("m110ddominio")+"' and m110dnif = '"+oldNIF+"' and m110dejercicio  = "+newNIFSelector.getint("m110dejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 110-"+newNIFSelector.getint("m110dejercicio")+"-"+oldNIF+" ya que existía un desglose del 110 con el nuevo NIF "+newNIF+" (Perceptor: "+newNIFSelector.getString("m110dnifper")+")");

			}
		}
		
		if(nomTaula.trim().toUpperCase().equals("MOD115D"))
		{
			while(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m115ddominio  = '"+newNIFSelector.getString("m115ddominio")+"' and m115dnif = '"+oldNIF+"' and m115dejercicio  = "+newNIFSelector.getint("m115dejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 115-"+newNIFSelector.getint("m115dejercicio")+"-"+oldNIF+" ya que existía un desglose del 115 con el nuevo NIF "+newNIF+" (Perceptor: "+newNIFSelector.getString("m115dnifper")+")");

			}
		}
		
		if(nomTaula.trim().toUpperCase().equals("MOD349ACUM"))
		{
			while(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m349adominio  = '"+newNIFSelector.getString("m349adominio")+"' and m349anif = '"+oldNIF+"' and m349aejercicio  = "+newNIFSelector.getint("m349aejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 349-"+newNIFSelector.getint("m349aejercicio")+"-"+oldNIF+" ya que existía un desglose del 349 con el nuevo NIF "+newNIF+" (Perceptor: "+newNIFSelector.getString("m349anifcomun")+")");

			}
		}
		
		newNIFSelector.close();
		
		return execute ;
	}
	
	private boolean checkNifJModelos () {
		boolean continuar = true;
		vcheck = new Vector<String>();
		checkNif(connJModelos, "MOD300", "m300nif");
		checkNif(connJModelos, "MOD300DES", "m300dnif");
		checkNif(connJModelos, "MOD300PRO", "mpronif");
		checkNif(connJModelos, "MOD370", "m370nif");
		checkNif(connJModelos, "MOD110", "m110nif");
		checkNif(connJModelos, "MOD115", "m115nif");
		checkNif(connJModelos, "MOD130", "m130nif");
		checkNif(connJModelos, "MOD131", "m131nif");
		checkNif(connJModelos, "MOD310", "m310nif");
		checkNif(connJModelos, "MOD311", "m311nif");
		checkNif(connJModelos, "MOD3901", "m901nif");
		checkNif(connJModelos, "MOD3902", "m902nif");
		checkNif(connJModelos, "MOD390ACT", "m90anif");
		checkNif(connJModelos, "MOD3903", "m903nif");
		checkNif(connJModelos, "MOD3904", "m904nif");
		checkNif(connJModelos, "MOD3925", "m925nif");
		checkNif(connJModelos, "MOD180e", "m180enif");
		checkNif(connJModelos, "MOD180r", "m180rnif");
		checkNif(connJModelos, "MOD190C", "m190cnif");
		checkNif(connJModelos, "MOD190D", "m190dnif");
		checkNif(connJModelos, "CERTIFGRAL","cerpercepnif");
		checkNif(connJModelos, "CERTIPROF","ceppercepnif");
		checkNif(connJModelos, "MOD347C", "m347cnif");
		checkNif(connJModelos, "MOD347D", "m347dnif");
		checkNif(connJModelos, "MOD347A", "m347anif");
		checkNif(connJModelos, "MOD202", "m202nif");
		checkNif(connJModelos, "MOD193C", "m193cnif");
		checkNif(connJModelos, "MOD193D", "m193dnif");
		checkNif(connJModelos, "MOD123", "m123nif");
		checkNif(connJModelos, "MOD349C", "m349cnif");
		checkNif(connJModelos, "MOD349D", "m349dnif");
		checkNif(connJModelos, "MOD349R", "m349rnif");
		checkNif(connJModelos, "MODINTC", "mintcnif");
		checkNif(connJModelos, "MODINTD", "mintdnif");
		checkNif(connJModelos, "MOD110D", "m110dnif");
		checkNif(connJModelos, "MOD115D", "m115dnif");
		checkNif(connJModelos, "MOD300PRODES", "m300pnif");
		checkNif(connJModelos, "MOD390DES", "m390dnif");
		checkNif(connJModelos, "MOD110ACUM", "m110anif");
		checkNif(connJModelos, "MOD349ACUM", "m349anif");
		checkNif(connJModelos, "MOD184D", "m184dnif");
		checkNif(connJModelos, "MOD184E", "m184enif");
		checkNif(connJModelos, "MOD184N", "m184nnif");
		checkNif(connJModelos, "MOD0361", "m0361nif");
		checkNif(connJModelos, "MOD0362", "m0362nif");
		checkNif(connJModelos, "MOD0363", "m0363nif");
		checkNif(connJModelos, "MOD0364", "m0364nif");
		checkNif(connJModelos, "MOD0365", "m0365nif");
		checkNif(connJModelos, "MOD0366", "m0366nif");
		checkNif(connJModelos, "MOD0367", "m0367nif");
		checkNif(connJModelos, "MOD0368", "m0368nif");
		checkNif(connJModelos, "MOD0369", "m0369nif");
		checkNif(connJModelos, "MOD03610", "m03610nif");
		checkNif(connJModelos, "MOD03611", "m03611nif");
		checkNif(connJModelos, "MOD576", "m576nif");
		checkNif(connJModelos, "MOD130DES", "M130DNIF");				
		checkNif(connJModelos, "MODESTADO", "mesnif");
		checkNif(connJModelos, "MODNIFCDP", "mncnif");
		checkNif(connJModelos, "PRESENTADOR", "prenif");
		checkNif(connJModelos, "MODACTEO", "MAENIF");
		checkNif(connJModelos, "MODIRPF", "MAINIF");
		checkNif(connJModelos, "MODIVA", "MAVNIF");
		checkNif(connJModelos, "MODUNI", "MAUNIF");
		checkNif(connJModelos, "MODAGRIVA", "MAANIF");
		checkNif(connJModelos, "MODRDTOAGR", "MRANIF");
		checkNif(connJModelos, "MODINGAGR", "MNANIF");
		checkNif(connJModelos, "CODELECMAT", "cemnif");
		checkNif(connJModelos, "IMPORTCFG", "imcnif");
		checkNif(connJModelos, "IMPORTHIS", "imhnif");		
		if (vcheck.size()>0) {
			String tablas ="";
			for (int i=0;i<vcheck.size();i++) {
				tablas += vcheck.elementAt(i)+" ";
				if (((i+1) % 6)==0) tablas+="\n";
			}
			int resp = Maefc.message("Se han encontrado registros/modelos con el nuevo NIF ["+newNIF+"].\nSi existiera el mismo dato para el NIF antiguo, se eliminará esta información del NIF antiguo\ndebido a que sólo puede existir 1 sólo dato:\n"+tablas+"\n\n¿Desea continuar?","¡Atención!",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION);
			continuar = (resp==Maefc.YES_OPTION);
		}
		return continuar;
	}

	private void checkNif(DBConnection conn, String taula, String campNif) {
		Selector scheck = new Selector (conn);
		scheck.execute ("Select "+campNif+" from "+taula+" where "+campNif+"='"+newNIF+"'");
		if (scheck.next()) vcheck.addElement("["+taula+"]");
		scheck.close();
	}
}
