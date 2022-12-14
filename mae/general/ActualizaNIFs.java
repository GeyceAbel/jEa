package mae.general;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import mae.easp.db.*;
import mae.easp.general.Easp;
//import mae.jiss.db.CatJiss;

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
	private DBConnection connJIss=null;
	private DBConnection connJRenta=null;
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
    	String jiss = "";
    	String jrenta = "";
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

			jiss = selecConnection.getString("cdpckiss");
			if(execute)
			{
				if(jiss!=null && jiss.equals("S"))
				{
					this.connJIss = getConnexio("jiss", connEA);
					execute = CambiarNIFJIss(this.connJIss);
					if (!execute) aplicError = "jIss";
				}
			}
			jrenta = selecConnection.getString("cdpckrenta");
			if(execute)
			{
				if(jrenta!=null && jrenta.equals("S"))
				{
					this.connJRenta = getConnexio("jrenta", connEA);
					execute = CambiarNIFJRenta(this.connJRenta);
					if (!execute) aplicError = "jRenta";
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
		if(execute && jiss!=null && jiss.equals("S"))
		{
			connJIss.commit();
			connJIss.disconnect();
		}
		if(execute && jrenta!=null && jrenta.equals("S"))
		{
			connJRenta.commit();
			connJRenta.disconnect();
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
				int resp = Maefc.message("Se han modificado los NIF/CIF correctamente, pero se han producido incidencias durante el proceso. \n\n?Desea ver las incidencias?","Atenci?n",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION);
				if(resp == Maefc.YES_OPTION) abrirIncidencias();
			}
			else Maefc.message("Se han modificado los NIF/CIF correctamente","Atenci?n",Maefc.INFORMATION_MESSAGE);



		}
		else Maefc.message("Se ha producido un error al cambiar el NIF en "+aplicError+".","Error",Maefc.ERROR_MESSAGE);


		return execute;
	}

    private void abrirIncidencias()
    {
		mae.easp.adminciden.ProgAdminciden pr = new mae.easp.adminciden.ProgAdminciden ();
		pr.setConnection(connEA);
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
		// return(conectaBD(nombd, connEA.getDB().getServer(), connEA.getDB().getUser(), connEA.getDB().getPassword(), connEA.getDB().getType()));
	  return Easp.getConnexio(nombd,connEA) ;
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

	private boolean CambiarNIFJIss(DBConnection connJIss)
	{
		try {
		      if ( cdp == null || newNIF == null || newNIF.equals("") || cdp.length() < 12 ) return false;
		      Update up = new Update(connJIss,"SOCIEDADES");
		      up.valor("soccif",newNIF);
		      int codiEmp = Integer.parseInt(cdp.substring(6,12)) ;
		      boolean ok = up.execute("soccodigo = "+codiEmp);
		      if   ( ok )  return true ;
		      System.out.println("Error al  actualizar nif en jIss tabla SOCIEDADES");
		      }
		    catch  ( Exception e ) {
		      System.out.println("Error actualizando nif jIss , Error: ["+e+"]");
		      e.printStackTrace();
		      }
		     return false ;
	}
	private boolean CambiarNIFJRenta(DBConnection connJRenta)
	{
		try {
		      if ( cdp == null || newNIF == null || newNIF.equals("") || cdp.length() < 12 ) return false;
		      Update up = new Update(connJRenta,"DECLARANTE");
		      up.valor("decnifdec",newNIF);
		      boolean ok = up.execute("deccodigocdpdec = '"+cdp+"'");
		      if   ( ok )  {
			      up = new Update(connJRenta,"DECLARANTE");
			      up.valor("decnifcon",newNIF);
			      ok = up.execute("deccodigocdpcon = '"+cdp+"'");
		    	  if (ok) return true ;
		      }
		      System.out.println("Error al  actualizar nif en jRenta tabla DECLARANTE");
		      }
		    catch  ( Exception e ) {
		      System.out.println("Error actualizando nif jRenta , Error: ["+e+"]");
		      e.printStackTrace();
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

				up.valor("datfftvia  ".trim(),oldNIFSelector.getString("datfftvia  ".trim()));
				up.valor("datfvia    ".trim(),oldNIFSelector.getString("datfvia    ".trim()));
				up.valor("datftnum   ".trim(),oldNIFSelector.getString("datftnum   ".trim()));
				up.valor("datfcalnum ".trim(),oldNIFSelector.getString("datfcalnum ".trim()));
				up.valor("datfbloque ".trim(),oldNIFSelector.getString("datfbloque ".trim()));
				up.valor("datfportal ".trim(),oldNIFSelector.getString("datfportal ".trim()));
				up.valor("datfescal  ".trim(),oldNIFSelector.getString("datfescal  ".trim()));
				up.valor("datfplanta ".trim(),oldNIFSelector.getString("datfplanta ".trim()));
				up.valor("datfpuerta ".trim(),oldNIFSelector.getString("datfpuerta ".trim()));
				up.valor("datfcomp   ".trim(),oldNIFSelector.getString("datfcomp   ".trim()));
				up.valor("datflocal  ".trim(),oldNIFSelector.getString("datflocal  ".trim()));
				up.valor("datfemail  ".trim(),oldNIFSelector.getString("datfemail  ".trim()));
				up.valor("datfcodmun ".trim(),oldNIFSelector.getString("datfcodmun ".trim()));
				up.valor("datfnommun ".trim(),oldNIFSelector.getString("datfnommun ".trim()));
				up.valor("datfcpost  ".trim(),oldNIFSelector.getString("datfcpost  ".trim()));
				up.valor("datnftvia  ".trim(),oldNIFSelector.getString("datnftvia  ".trim()));
				up.valor("datnvia    ".trim(),oldNIFSelector.getString("datnvia    ".trim()));
				up.valor("datntnum   ".trim(),oldNIFSelector.getString("datntnum   ".trim()));
				up.valor("datncalnum ".trim(),oldNIFSelector.getString("datncalnum ".trim()));
				up.valor("datnbloque ".trim(),oldNIFSelector.getString("datnbloque ".trim()));
				up.valor("datnportal ".trim(),oldNIFSelector.getString("datnportal ".trim()));
				up.valor("datnescal  ".trim(),oldNIFSelector.getString("datnescal  ".trim()));
				up.valor("datnplanta ".trim(),oldNIFSelector.getString("datnplanta ".trim()));
				up.valor("datnpuerta ".trim(),oldNIFSelector.getString("datnpuerta ".trim()));
				up.valor("datncomp   ".trim(),oldNIFSelector.getString("datncomp   ".trim()));
				up.valor("datnlocal  ".trim(),oldNIFSelector.getString("datnlocal  ".trim()));
				up.valor("datnemail  ".trim(),oldNIFSelector.getString("datnemail  ".trim()));
				up.valor("datncodmun ".trim(),oldNIFSelector.getString("datncodmun ".trim()));
				up.valor("datnnommun ".trim(),oldNIFSelector.getString("datnnommun ".trim()));
				up.valor("datncpost  ".trim(),oldNIFSelector.getString("datncpost  ".trim()));
				up.valor("datnapcor  ".trim(),oldNIFSelector.getString("datnapcor  ".trim()));
				up.valor("datnpobla  ".trim(),oldNIFSelector.getString("datnpobla  ".trim()));
				up.valor("datncpost2 ".trim(),oldNIFSelector.getString("datncpost2 ".trim()));
				up.valor("datsftvia  ".trim(),oldNIFSelector.getString("datsftvia  ".trim()));
				up.valor("datsvia    ".trim(),oldNIFSelector.getString("datsvia    ".trim()));
				up.valor("datstnum   ".trim(),oldNIFSelector.getString("datstnum   ".trim()));
				up.valor("datscalnum ".trim(),oldNIFSelector.getString("datscalnum ".trim()));
				up.valor("datsbloque ".trim(),oldNIFSelector.getString("datsbloque ".trim()));
				up.valor("datsportal ".trim(),oldNIFSelector.getString("datsportal ".trim()));
				up.valor("datsescal  ".trim(),oldNIFSelector.getString("datsescal  ".trim()));
				up.valor("datsplanta ".trim(),oldNIFSelector.getString("datsplanta ".trim()));
				up.valor("datspuerta ".trim(),oldNIFSelector.getString("datspuerta ".trim()));
				up.valor("datscomp   ".trim(),oldNIFSelector.getString("datscomp   ".trim()));
				up.valor("datslocal  ".trim(),oldNIFSelector.getString("datslocal  ".trim()));
				up.valor("datsemail  ".trim(),oldNIFSelector.getString("datsemail  ".trim()));
				up.valor("datuser    ".trim(),oldNIFSelector.getString("datuser    ".trim()));
				up.valor("datgrupo   ".trim(),oldNIFSelector.getString("datgrupo   ".trim()));
				up.valor("datscodmun ".trim(),oldNIFSelector.getString("datscodmun ".trim()));
				up.valor("datsnommun ".trim(),oldNIFSelector.getString("datsnommun ".trim()));
				up.valor("datscpost  ".trim(),oldNIFSelector.getString("datscpost  ".trim()));
				up.valor("datsprov   ".trim(),oldNIFSelector.getint("datsprov   ".trim()));
				up.valor("datstel    ".trim(),oldNIFSelector.getint("datstel    ".trim()));
				up.valor("datsmovil  ".trim(),oldNIFSelector.getint("datsmovil  ".trim()));
				up.valor("datsfax    ".trim(),oldNIFSelector.getint("datsfax    ".trim()));
				up.valor("datmovil   ".trim(),oldNIFSelector.getint("datmovil   ".trim()));
				up.valor("datsnum    ".trim(),oldNIFSelector.getint("datsnum    ".trim()));
				up.valor("datnprov2  ".trim(),oldNIFSelector.getint("datnprov2  ".trim()));
				up.valor("datfprov   ".trim(),oldNIFSelector.getint("datfprov   ".trim()));
				up.valor("datfnum    ".trim(),oldNIFSelector.getint("datfnum    ".trim()));
				up.valor("datftel    ".trim(),oldNIFSelector.getint("datftel    ".trim()));
				up.valor("datfmovil  ".trim(),oldNIFSelector.getint("datfmovil  ".trim()));
				up.valor("datffax    ".trim(),oldNIFSelector.getint("datffax    ".trim()));
				up.valor("datnnum    ".trim(),oldNIFSelector.getint("datnnum    ".trim()));
				up.valor("datnprov   ".trim(),oldNIFSelector.getint("datnprov   ".trim()));
				up.valor("datntel    ".trim(),oldNIFSelector.getint("datntel    ".trim()));
				up.valor("datnmovil  ".trim(),oldNIFSelector.getint("datnmovil  ".trim()));
				up.valor("datnfax    ".trim(),oldNIFSelector.getint("datnfax    ".trim()));
				up.valor("datntel2   ".trim(),oldNIFSelector.getint("datntel2   ".trim()));
				up.valor("datnmovil2 ".trim(),oldNIFSelector.getint("datnmovil2 ".trim()));
				up.valor("datnfax2   ".trim(),oldNIFSelector.getint("datnfax2   ".trim()));

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

				i.valor("datfftvia  ".trim(),oldNIFSelector.getString("datfftvia  ".trim()));
				i.valor("datfvia    ".trim(),oldNIFSelector.getString("datfvia    ".trim()));
				i.valor("datftnum   ".trim(),oldNIFSelector.getString("datftnum   ".trim()));
				i.valor("datfcalnum ".trim(),oldNIFSelector.getString("datfcalnum ".trim()));
				i.valor("datfbloque ".trim(),oldNIFSelector.getString("datfbloque ".trim()));
				i.valor("datfportal ".trim(),oldNIFSelector.getString("datfportal ".trim()));
				i.valor("datfescal  ".trim(),oldNIFSelector.getString("datfescal  ".trim()));
				i.valor("datfplanta ".trim(),oldNIFSelector.getString("datfplanta ".trim()));
				i.valor("datfpuerta ".trim(),oldNIFSelector.getString("datfpuerta ".trim()));
				i.valor("datfcomp   ".trim(),oldNIFSelector.getString("datfcomp   ".trim()));
				i.valor("datflocal  ".trim(),oldNIFSelector.getString("datflocal  ".trim()));
				i.valor("datfemail  ".trim(),oldNIFSelector.getString("datfemail  ".trim()));
				i.valor("datfcodmun ".trim(),oldNIFSelector.getString("datfcodmun ".trim()));
				i.valor("datfnommun ".trim(),oldNIFSelector.getString("datfnommun ".trim()));
				i.valor("datfcpost  ".trim(),oldNIFSelector.getString("datfcpost  ".trim()));
				i.valor("datnftvia  ".trim(),oldNIFSelector.getString("datnftvia  ".trim()));
				i.valor("datnvia    ".trim(),oldNIFSelector.getString("datnvia    ".trim()));
				i.valor("datntnum   ".trim(),oldNIFSelector.getString("datntnum   ".trim()));
				i.valor("datncalnum ".trim(),oldNIFSelector.getString("datncalnum ".trim()));
				i.valor("datnbloque ".trim(),oldNIFSelector.getString("datnbloque ".trim()));
				i.valor("datnportal ".trim(),oldNIFSelector.getString("datnportal ".trim()));
				i.valor("datnescal  ".trim(),oldNIFSelector.getString("datnescal  ".trim()));
				i.valor("datnplanta ".trim(),oldNIFSelector.getString("datnplanta ".trim()));
				i.valor("datnpuerta ".trim(),oldNIFSelector.getString("datnpuerta ".trim()));
				i.valor("datncomp   ".trim(),oldNIFSelector.getString("datncomp   ".trim()));
				i.valor("datnlocal  ".trim(),oldNIFSelector.getString("datnlocal  ".trim()));
				i.valor("datnemail  ".trim(),oldNIFSelector.getString("datnemail  ".trim()));
				i.valor("datncodmun ".trim(),oldNIFSelector.getString("datncodmun ".trim()));
				i.valor("datnnommun ".trim(),oldNIFSelector.getString("datnnommun ".trim()));
				i.valor("datncpost  ".trim(),oldNIFSelector.getString("datncpost  ".trim()));
				i.valor("datnapcor  ".trim(),oldNIFSelector.getString("datnapcor  ".trim()));
				i.valor("datnpobla  ".trim(),oldNIFSelector.getString("datnpobla  ".trim()));
				i.valor("datncpost2 ".trim(),oldNIFSelector.getString("datncpost2 ".trim()));
				i.valor("datsftvia  ".trim(),oldNIFSelector.getString("datsftvia  ".trim()));
				i.valor("datsvia    ".trim(),oldNIFSelector.getString("datsvia    ".trim()));
				i.valor("datstnum   ".trim(),oldNIFSelector.getString("datstnum   ".trim()));
				i.valor("datscalnum ".trim(),oldNIFSelector.getString("datscalnum ".trim()));
				i.valor("datsbloque ".trim(),oldNIFSelector.getString("datsbloque ".trim()));
				i.valor("datsportal ".trim(),oldNIFSelector.getString("datsportal ".trim()));
				i.valor("datsescal  ".trim(),oldNIFSelector.getString("datsescal  ".trim()));
				i.valor("datsplanta ".trim(),oldNIFSelector.getString("datsplanta ".trim()));
				i.valor("datspuerta ".trim(),oldNIFSelector.getString("datspuerta ".trim()));
				i.valor("datscomp   ".trim(),oldNIFSelector.getString("datscomp   ".trim()));
				i.valor("datslocal  ".trim(),oldNIFSelector.getString("datslocal  ".trim()));
				i.valor("datsemail  ".trim(),oldNIFSelector.getString("datsemail  ".trim()));
				i.valor("datuser    ".trim(),oldNIFSelector.getString("datuser    ".trim()));
				i.valor("datgrupo   ".trim(),oldNIFSelector.getString("datgrupo   ".trim()));
				i.valor("datscodmun ".trim(),oldNIFSelector.getString("datscodmun ".trim()));
				i.valor("datsnommun ".trim(),oldNIFSelector.getString("datsnommun ".trim()));
				i.valor("datscpost  ".trim(),oldNIFSelector.getString("datscpost  ".trim()));
				i.valor("datsprov   ".trim(),oldNIFSelector.getint("datsprov   ".trim()));
				i.valor("datstel    ".trim(),oldNIFSelector.getint("datstel    ".trim()));
				i.valor("datsmovil  ".trim(),oldNIFSelector.getint("datsmovil  ".trim()));
				i.valor("datsfax    ".trim(),oldNIFSelector.getint("datsfax    ".trim()));
				i.valor("datmovil   ".trim(),oldNIFSelector.getint("datmovil   ".trim()));
				i.valor("datsnum    ".trim(),oldNIFSelector.getint("datsnum    ".trim()));
				i.valor("datnprov2  ".trim(),oldNIFSelector.getint("datnprov2  ".trim()));
				i.valor("datfprov   ".trim(),oldNIFSelector.getint("datfprov   ".trim()));
				i.valor("datfnum    ".trim(),oldNIFSelector.getint("datfnum    ".trim()));
				i.valor("datftel    ".trim(),oldNIFSelector.getint("datftel    ".trim()));
				i.valor("datfmovil  ".trim(),oldNIFSelector.getint("datfmovil  ".trim()));
				i.valor("datffax    ".trim(),oldNIFSelector.getint("datffax    ".trim()));
				i.valor("datnnum    ".trim(),oldNIFSelector.getint("datnnum    ".trim()));
				i.valor("datnprov   ".trim(),oldNIFSelector.getint("datnprov   ".trim()));
				i.valor("datntel    ".trim(),oldNIFSelector.getint("datntel    ".trim()));
				i.valor("datnmovil  ".trim(),oldNIFSelector.getint("datnmovil  ".trim()));
				i.valor("datnfax    ".trim(),oldNIFSelector.getint("datnfax    ".trim()));
				i.valor("datntel2   ".trim(),oldNIFSelector.getint("datntel2   ".trim()));
				i.valor("datnmovil2 ".trim(),oldNIFSelector.getint("datnmovil2 ".trim()));
				i.valor("datnfax2   ".trim(),oldNIFSelector.getint("datnfax2   ".trim()));
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

		//if(execute) execute = UpdateNIF(connJEa, "NIFESMUF", "mufnif",(connJEa.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJEa, "NIFESMUF", "mufnif",new mae.easp.db.CatEasp ());
		if(execute) execute = UpdateNIF(connJEa, "CDP", "cdpnifcif");
		//if(execute) execute = UpdateNIF(connJEa, "REPRESENTANTES", "repnifcif",(connJEa.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJEa, "REPRESENTANTES", "repnifcif",new mae.easp.db.CatEasp ());
		if(execute) execute = UpdateNIF(connJEa, "DP", "dpnifcif");
		if(execute) execute = UpdateNIF(connJEa, "MIR", "mircif");
		//if(execute) execute = UpdateNIF(connJEa, "EMPMODELOS", "emodnif",(connJEa.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJEa, "EMPMODELOS", "emodnif",new mae.easp.db.CatEasp ());


		d = new Delete(connJEa, "PERFILTRIBUT");
		if(execute) d.execute("pftnif='"+oldNIF+"'");

		//if(execute) execute = UpdateNIF(connJEa, "AVISADO", "avinif",(connJEa.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJEa, "AVISADO", "avinif",new mae.easp.db.CatEasp ());

		return execute;
	}

	private DBConnection conectaBD(String bdnom, String bdserver, String bduser, String bdpassword, String bdtype) {
	   /*
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
	    else if (bdnom.startsWith("jiss"))
	    {
	    	CatJiss catjiss = new CatJiss ();
            Catalog array[] = {catjiss};
            db.setCatalogs(array);
        }
	    conn=new DBConnection(db);
	    if (conn.connect()) return conn;
	    else return null;
	    */
	   return Easp.conectaBD(bdnom,bdserver,bduser,bdpassword,bdtype);
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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 300 m300dominio = '"+oldNIFSelector.getString("m300dominio")+"' and m300nif = '"+oldNIF+"' and m300ejercicio = "+oldNIFSelector.getint("m300ejercicio")+" and m300periodo = '"+oldNIFSelector.getString("m300periodo")+"' ya que exist?a un 300 con el nuevo NIF "+newNIF);
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
				i.valor("m300impingreso", oldNIFSelector.getdouble("m300impingreso"));
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
				i.valor("m300dedopinivb", oldNIFSelector.getdouble("m300dedopinivb"));
				i.valor("m300dedopinivc", oldNIFSelector.getdouble("m300dedopinivc"));
				i.valor("m300dedimpivb", oldNIFSelector.getdouble("m300dedimpivb"));
				i.valor("m300dedimpivc", oldNIFSelector.getdouble("m300dedimpivc"));
				i.valor("m300dedadqivb", oldNIFSelector.getdouble("m300dedadqivb"));
				i.valor("m300dedadqivc", oldNIFSelector.getdouble("m300dedadqivc"));
				i.valor("m300devmensual", oldNIFSelector.getString("m300devmensual"));
				i.valor("m300mesmodelo", oldNIFSelector.getint("m300mesmodelo"));
				i.valor("m300cruzcomp", oldNIFSelector.getString("m300cruzcomp"));
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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 390 m901dominio = '"+oldNIFSelector.getString("m901dominio")+"' and m901nif = '"+oldNIF+"' and m901ejercicio = "+oldNIFSelector.getint("m901ejercicio")+" and m901periodo = '"+oldNIFSelector.getString("m901periodo")+"' ya que exist?a un 390 con el nuevo NIF "+newNIF);
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
				i.valor("m901ultregents", oldNIFSelector.getString("m901ultregents"));
				i.valor("m901ultregentn", oldNIFSelector.getString("m901ultregentn"));
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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 180-"+oldNIFSelector.getint("m180eejercicio")+"-"+oldNIF+" ya que exist?a un 180 con el nuevo NIF "+newNIF);
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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 190-"+oldNIFSelector.getint("m190cejercicio")+"-"+oldNIF+" ya que exist?a un 190 con el nuevo NIF "+newNIF);
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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 347-"+oldNIFSelector.getint("m347cejercicio")+"-"+oldNIF+" ya que exist?a un 347 con el nuevo NIF "+newNIF);
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
		oldNIFSelector.execute("Select * from MOD340C where m340cnif = '"+oldNIF+"'");

		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{

			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD340C where m340cdominio = '"+oldNIFSelector.getString("m340cdominio")+"' and m340cnif = '"+newNIF+"' and m340cejercicio = "+oldNIFSelector.getint("m340cejercicio")+" and m340cperiodo = '"+oldNIFSelector.getString("m340cperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MOD340E");
				d.execute("m340edominio = '"+oldNIFSelector.getString("m340cdominio")+"' and m340enif = '"+oldNIF+"' and m340eejercicio = "+oldNIFSelector.getint("m340cejercicio")+" and m340eperiodo = '"+oldNIFSelector.getString("m340cperiodo")+"'");

				d = new Delete(connJModelos, "MOD340R");
				d.execute("m340rdominio = '"+oldNIFSelector.getString("m340cdominio")+"' and m340rnif = '"+oldNIF+"' and m340rejercicio = "+oldNIFSelector.getint("m340cejercicio")+" and m340rperiodo = '"+oldNIFSelector.getString("m340cperiodo")+"'");

				d = new Delete(connJModelos, "MOD340B");
				d.execute("m340bdominio = '"+oldNIFSelector.getString("m340cdominio")+"' and m340bnif = '"+oldNIF+"' and m340bejercicio = "+oldNIFSelector.getint("m340cejercicio")+" and m340bperiodo = '"+oldNIFSelector.getString("m340cperiodo")+"'");

				d = new Delete(connJModelos, "MOD340I");
				d.execute("m340idominio = '"+oldNIFSelector.getString("m340cdominio")+"' and m340inif = '"+oldNIF+"' and m340iejercicio = "+oldNIFSelector.getint("m340cejercicio")+" and m340iperiodo = '"+oldNIFSelector.getString("m340cperiodo")+"'");

				grabarIncidencia("jModelos", "Se ha eliminado el modelo 340-"+oldNIFSelector.getint("m340cejercicio")+"-"+oldNIF+" ya que exist?a un 340 con el nuevo NIF "+newNIF);
			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD340C");
				i.valor("m340cdominio", oldNIFSelector.getString("m340cdominio"));
				i.valor("m340cnif", newNIF);
				i.valor("m340cejercicio", oldNIFSelector.getint("m340cejercicio"));
				i.valor("m340cperiodo", oldNIFSelector.getString("m340cperiodo"));
				i.valor("m340crazon", oldNIFSelector.getString("m340crazon"));
				i.valor("m340cnumjustif", oldNIFSelector.getString("m340cnumjustif"));
				i.valor("m340ccomplem", oldNIFSelector.getString("m340ccomplem"));
				i.valor("m340csustitu", oldNIFSelector.getString("m340csustitu"));
				i.valor("m340cnumdecant", oldNIFSelector.getString("m340cnumdecant"));
				i.valor("m340cnumreg", oldNIFSelector.getint("m340cnumreg"));
				i.valor("m340cnifrepres", oldNIFSelector.getString("m340cnifrepres"));
				i.valor("m340ctotbase", oldNIFSelector.getdouble("m340ctotbase"));
				i.valor("m340ctotcuota", oldNIFSelector.getdouble("m340ctotcuota"));
				i.valor("m340ctotfactura", oldNIFSelector.getdouble("m340ctotfactura"));
				i.valor("m340cfecha", oldNIFSelector.getDate("m340cfecha"));
				i.valor("m340cfirma", oldNIFSelector.getString("m340cfirma"));
				i.valor("m340ccargofirm", oldNIFSelector.getString("m340ccargofirm"));
				i.valor("m340ctelcont", oldNIFSelector.getString("m340ctelcont"));
				i.valor("m340cpercont", oldNIFSelector.getString("m340cpercont"));
				i.valor("m340cobserva", oldNIFSelector.getString("m340cobserva"));
				i.valor("m340ccodeleciva", oldNIFSelector.getString("m340ccodeleciva"));
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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 193-"+oldNIFSelector.getint("m193cejercicio")+"-"+oldNIF+" ya que exist?a un 193 con el nuevo NIF "+newNIF);

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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 349-"+oldNIFSelector.getint("m349cejercicio")+"-"+oldNIFSelector.getString("m349cperiodo")+"-"+oldNIF+" ya que exist?a un 349 con el nuevo NIF "+newNIF);

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
				i.valor("m349ccambioper", oldNIFSelector.getString("m349ccambioper"));
				i.valor("m349cnifrepleg", oldNIFSelector.getString("m349cnifrepleg"));
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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo INT-"+oldNIFSelector.getint("mintdejercicio")+"-"+oldNIFSelector.getString("mintcperiodo")+"-"+oldNIF+" ya que exist?a un INT con el nuevo NIF "+newNIF);

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
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 184 m184ddominio = '"+oldNIFSelector.getString("m184ddominio")+"' and m184dnif = '"+oldNIF+"' and m184dejercicio = "+oldNIFSelector.getint("m184dejercicio")+" and m184dperiodo = '"+oldNIFSelector.getString("m184dperiodo")+"' ya que exist?a un 184 con el nuevo NIF "+newNIF);
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
				grabarIncidencia("jModelos", "Se ha eliminado el estado del Modelo mesdominio = '"+oldNIFSelector.getString("mesdominio")+"' and mesmodelo = '"+oldNIFSelector.getString("mesmodelo")+"' and mesnif = '"+oldNIF+"' and mesejercicio = "+oldNIFSelector.getint("mesejercicio")+" and mesperiodo = '"+oldNIFSelector.getString("mesperiodo")+"' ya que exist?a un Modestado con el nuevo NIF "+newNIF);

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
				i.valor("mesaplazada", oldNIFSelector.getString("mesaplazada"));

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
				grabarIncidencia("jModelos", "Se ha eliminado ACTEO MAEDOMINIO = '"+oldNIFSelector.getString("MAEDOMINIO")+"' and MAENIF = '"+newNIF+"' and MAECODIGO = "+oldNIFSelector.getint("MAECODIGO")+"' ya que exist?a una ACTEO con el nuevo NIF "+newNIF);
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
				i.valor("MAEDISC", oldNIFSelector.getString("MAEDISC"));
				execute = i.execute();
				connJModelos.getDB().getCatalogs()[2].getTable("modacteo").getColumn("maecodigo").setAutoIncrementable(true);
			}
			newNIFSelector.close();
		}



		oldNIFSelector.close();

		oldNIFSelector.execute("Select * from MOD296R where m296rnif = '"+oldNIF+"'");

		/*Hay que copiar cada uno de los registros del NIF antiguo con el NIF nuevo*/
		while(execute && oldNIFSelector.next())
		{

			/*Comprobamos que no exista el registro con el nuevo NIF*/
			newNIFSelector.execute("Select * from MOD296R where m296rdominio = '"+oldNIFSelector.getString("m296rdominio")+"' and m296rnif = '"+newNIF+"' and m296rejercicio = "+oldNIFSelector.getint("m296rejercicio")+" and m296rperiodo = '"+oldNIFSelector.getString("m296rperiodo")+"'");
			if(newNIFSelector.next())
			{
				Delete d = new Delete(connJModelos, "MOD296D");
				d.execute("m296ddominio = '"+oldNIFSelector.getString("m296rdominio")+"' and m296dnif = '"+oldNIF+"' and m296dejercicio = "+oldNIFSelector.getint("m296rejercicio")+" and m296dperiodo = '"+oldNIFSelector.getString("m296rperiodo")+"'");
				grabarIncidencia("jModelos", "Se ha eliminado el modelo 296-"+oldNIFSelector.getint("m296rejercicio")+"-"+oldNIFSelector.getString("m296rperiodo")+"-"+oldNIF+" ya que exist?a un 296 con el nuevo NIF "+newNIF);

			}
			else
			{
				/*No existe el registro con el nuevo NIF --> lo creamos*/
				Insert i = new Insert(connJModelos, "MOD296R");
				i.valor("m296rdominio", oldNIFSelector.getString("m296rdominio"));
				i.valor("m296rnif", newNIF);
				i.valor("m296rejercicio", oldNIFSelector.getint("m296rejercicio"));
				i.valor("m296rperiodo", oldNIFSelector.getString("m296rperiodo"));
				i.valor("m296rapellidos", oldNIFSelector.getString("m296rapellidos"));
				i.valor("m296rtelrelac", oldNIFSelector.getint("m296rtelrelac"));
				i.valor("m296raperelac", oldNIFSelector.getString("m296raperelac"));
				i.valor("m296riddecla", oldNIFSelector.getint("m296riddecla"));
				i.valor("m296rdecomplem", oldNIFSelector.getString("m296rdecomplem"));
				i.valor("m296rdecsustit", oldNIFSelector.getString("m296rdecsustit"));
				i.valor("m296rnumdecant", oldNIFSelector.getint("m296rnumdecant"));
				i.valor("m296rnumtotper", oldNIFSelector.getint("m296rnumtotper"));
				i.valor("m296rsigno", oldNIFSelector.getString("m296rsigno"));
				i.valor("m296rbaseret", oldNIFSelector.getdouble("m296rbaseret"));
				i.valor("m296ringracuen", oldNIFSelector.getdouble("m296ringracuen"));
				i.valor("m296ringresado", oldNIFSelector.getdouble("m296ringresado"));
				i.valor("m296rnifrepre", oldNIFSelector.getString("m296rnifrepre"));
				i.valor("m296rfecha", oldNIFSelector.getDate("m296rfecha"));
				i.valor("m296rnomfirman", oldNIFSelector.getString("m296rnomfirman"));
				i.valor("m296rcargo", oldNIFSelector.getString("m296rcargo"));
				execute = i.execute();
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
				grabarIncidencia("jModelos", "Para el nif ["+newNIF+"] ya existen acumulados de m?dulos no agricolas del ejercicio "+ejer+msgemp+" y actividad "+act);
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
		if(execute) execute = UpdateNIF(connJModelos, "MOD300DES", "m300dnif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD300PRO", "mpronif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD370", "m370nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD110", "m110nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD115", "m115nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD130", "m130nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD131", "m131nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD310", "m310nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD311", "m311nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD3902", "m902nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD390ACT", "m90anif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD3903", "m903nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD3904", "m904nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD3925", "m925nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD180r", "m180rnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD190D", "m190dnif");
		if(execute) execute = UpdateNIF(connJModelos, "CERTIFGRAL", "cerpercepnif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "CERTIPROF", "ceppercepnif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD347D", "m347dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD347A", "m347anif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD202", "m202nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD193D", "m193dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD123", "m123nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD349D", "m349dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD349R", "m349rnif");
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
		if(execute) execute = tratar110D_115D_349ACUM(connJModelos, "MOD123D", "m123dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD123D", "m123dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD216", "m216nif",(connJModelos.getDB().getCatalogs())[0]);
		if(execute) execute = tratar110D_115D_349ACUM(connJModelos, "MOD216D", "m216dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD216D", "m216dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD296D", "m296dnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD322", "m322nif",(connJModelos.getDB().getCatalogs())[0]);


		/*modelos2*/
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
		if(execute) execute = UpdateNIF(connJModelos, "MOD310DES", "m310dnif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD309", "m309nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P1", "m36p1nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P2", "m36p2anif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P2B", "m36p2bnif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P2C", "m36p2cnif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P3", "m36p3nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P4", "m36p4nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P5", "m36p5nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P6", "m36p6nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P7", "m36p7nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD036P8", "m36p8nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD340E", "m340enif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD340R", "m340rnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD340B", "m340bnif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD340I", "m340inif");
		if(execute) execute = UpdateNIF(connJModelos, "MOD308", "m308nif",(connJModelos.getDB().getCatalogs())[1]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H1", "m11nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H2", "m12nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H3", "m13nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H4", "m14nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H5", "m15nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H6", "m16nif",(connJModelos.getDB().getCatalogs())[3]);
    if(execute) execute = UpdateNIF(connJModelos, "MOD100H6D", "m16dnif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H7", "m17nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H8", "m18nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H9", "m19nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H10", "m110nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H11", "m111nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H12", "m112nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H13", "m113nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H14", "m114nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H15", "m115nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H16", "m116nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H17", "m117nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H18", "m118nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H19", "m119nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H20", "m120nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H21", "m121nif",(connJModelos.getDB().getCatalogs())[3]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD100H22", "m122nif",(connJModelos.getDB().getCatalogs())[3]);

		if(execute) execute = UpdateNIF(connJModelos, "MOD200H1", "m2001nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H2", "m2002nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H3", "m2003nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H4", "m2004nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H5", "m2005nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H6", "m2006nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H7", "m2007nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H8", "m2008nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H9", "m2009nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H10", "m2010nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H11", "m2011nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H12", "m2012nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H13", "m2013nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H14", "m2014nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H15", "m2015nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H16", "m2016nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H17", "m2017nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H18", "m2018nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H19", "m2019nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H20", "m2020nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H21", "m2021nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H22", "m2022nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H23", "m2023nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200H24", "m2024nif",(connJModelos.getDB().getCatalogs())[4]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD200HCP", "m20cpnif",(connJModelos.getDB().getCatalogs())[4]);

		if(execute) execute = UpdateNIF(connJModelos, "MOD714H1", "m71nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H2", "m72nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H3", "m73nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H4", "m74nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H5", "m75nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H6", "m76nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H7", "m77nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H8", "m78nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H9", "m79nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H10", "m710nif",(connJModelos.getDB().getCatalogs())[5]);
		if(execute) execute = UpdateNIF(connJModelos, "MOD714H11", "m711nif",(connJModelos.getDB().getCatalogs())[5]);

		if(execute) execute = UpdateNIF(connJModelos, "MOD102", "m102nif",(connJModelos.getDB().getCatalogs())[0]);

		/*MODGEN*/
		if(execute) execute = UpdateNIF(connJModelos, "MODNIFCDP", "mncnif",(connJModelos.getDB().getCatalogs())[2]);
		if(execute) execute = UpdateNIF(connJModelos, "PRESENTADOR", "prenif");
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
				grabarIncidencia("jModelos", "Se ha eliminado de la tabla"+nomTaula+" el registro "+condicion+" ya que exist?a otro con el nuevo NIF "+newNIF);


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

		d = new Delete(connJModelos, "MOD340C");
		if(execute)  execute = d.execute("m340cnif='"+oldNIF+"'");

		d = new Delete(connJModelos, "MOD193C");
		if(execute)  execute = d.execute("m193cnif='"+oldNIF+"'");

		d = new Delete(connJModelos, "MOD349C");
		if(execute)  execute = d.execute("m349cnif='"+oldNIF+"'");

		d = new Delete(connJModelos, "MOD296R");
		if(execute)  execute = d.execute("m296rnif='"+oldNIF+"'");

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
			if(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m110ddominio  = '"+newNIFSelector.getString("m110ddominio")+"' and m110dnif = '"+oldNIF+"' and m110dejercicio  = "+newNIFSelector.getint("m110dejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 110-"+newNIFSelector.getint("m110dejercicio")+"-"+oldNIF+" ya que exist?a un desglose del 110 con el nuevo NIF "+newNIF);

			}
		}

		if(nomTaula.trim().toUpperCase().equals("MOD115D"))
		{
			if(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m115ddominio  = '"+newNIFSelector.getString("m115ddominio")+"' and m115dnif = '"+oldNIF+"' and m115dejercicio  = "+newNIFSelector.getint("m115dejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 115-"+newNIFSelector.getint("m115dejercicio")+"-"+oldNIF+" ya que exist?a un desglose del 115 con el nuevo NIF "+newNIF);

			}
		}

		if(nomTaula.trim().toUpperCase().equals("MOD349ACUM"))
		{
			if(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m349adominio  = '"+newNIFSelector.getString("m349adominio")+"' and m349anif = '"+oldNIF+"' and m349aejercicio  = "+newNIFSelector.getint("m349aejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 349-"+newNIFSelector.getint("m349aejercicio")+"-"+oldNIF+" ya que exist?a un desglose del 349 con el nuevo NIF "+newNIF);

			}
		}

		if(nomTaula.trim().toUpperCase().equals("MOD123D"))
		{
			if(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m123ddominio  = '"+newNIFSelector.getString("m123ddominio")+"' and m123dnif = '"+oldNIF+"' and m123dejercicio  = "+newNIFSelector.getint("m123dejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 123-"+newNIFSelector.getint("m123dejercicio")+"-"+oldNIF+" ya que exist?a un desglose del 123 con el nuevo NIF "+newNIF);

			}
		}

		if(nomTaula.trim().toUpperCase().equals("MOD216D"))
		{
			if(newNIFSelector.next())
			{
				Delete d = new Delete(conn, nomTaula);
				if(execute) execute = d.execute("m216ddominio  = '"+newNIFSelector.getString("m216ddominio")+"' and m216dnif = '"+oldNIF+"' and m216dejercicio  = "+newNIFSelector.getint("m216dejercicio"));
				grabarIncidencia("jModelos", "Se ha eliminado el desglose del 216-"+newNIFSelector.getint("m216dejercicio")+"-"+oldNIF+" ya que exist?a un desglose del 123 con el nuevo NIF "+newNIF);

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
		checkNif(connJModelos, "MOD309", "m309nif");
		checkNif(connJModelos, "MOD308", "m308nif");
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
		checkNif(connJModelos, "MOD340C", "m340cnif");
		checkNif(connJModelos, "MOD340E", "m340enif");
		checkNif(connJModelos, "MOD340R", "m340rnif");
		checkNif(connJModelos, "MOD340B", "m340bnif");
		checkNif(connJModelos, "MOD340I", "m340inif");
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

		checkNif(connJModelos, "MOD036P1", "m36p1nif");
		checkNif(connJModelos, "MOD036P2", "m36p2anif");
		checkNif(connJModelos, "MOD036P2B", "m36p2bnif");
		checkNif(connJModelos, "MOD036P2C", "m36p2cnif");
		checkNif(connJModelos, "MOD036P3", "m36p3nif");
		checkNif(connJModelos, "MOD036P4", "m36p4nif");
		checkNif(connJModelos, "MOD036P5", "m36p5nif");
		checkNif(connJModelos, "MOD036P6", "m36p6nif");
		checkNif(connJModelos, "MOD036P7", "m36p7nif");
		checkNif(connJModelos, "MOD036P8", "m36p8nif");

		checkNif(connJModelos, "MOD576", "m576nif");
		checkNif(connJModelos, "MOD130DES", "M130DNIF");
		checkNif(connJModelos, "MOD310DES", "M310DNIF");
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
			int resp = Maefc.message("Se han encontrado registros/modelos con el nuevo NIF ["+newNIF+"].\nSi existiera el mismo dato para el NIF antiguo, se eliminar? esta informaci?n del NIF antiguo\ndebido a que s?lo puede existir 1 s?lo dato:\n"+tablas+"\n\n?Desea continuar?","?Atenci?n!",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION);
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
