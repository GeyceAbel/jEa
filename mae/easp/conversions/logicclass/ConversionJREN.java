package mae.easp.conversions.logicclass;

import java.util.Vector;

import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.general.ProgressBarForm;
import geyce.maefc.Maefc;
import geyce.maefc.Program;
import geyce.maefc.Aplication;
import geyce.maefc.Catalog;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.ErrorManager;
import geyce.maefc.Field;
import geyce.maefc.Select;
import geyce.maefc.Selector;
import geyce.maefc.Table;
import mae.easp.db.CatJrenta;
import mae.easp.db.CatEasp;
import mae.easp.db.CatModgen;
import mae.easp.general.Easp;
//

public class ConversionJREN extends ConversionLC {
	private String desdeDec;
	private String hastaDec;
	private String simulaciones;
	public mae.jrenta.auxcnvlogic2.ProgAuxcnvlogic2 prJren;
	public int nrototdec=0;
	public ConversionJREN (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA, String desdeDec, String hastaDec, String simulaciones) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
		this.desdeDec = desdeDec;
		this.hastaDec = hastaDec;
		this.simulaciones = simulaciones;

		 prJren= new mae.jrenta.auxcnvlogic2.ProgAuxcnvlogic2();
 		 if (prJren.connJRENTA == null) setConnectJRenta();
 		 if (prJren.connEA ==null)      setConnectEa();
 		 if (prJren.connModasp==null)   setConnectMod();
 		 prJren.vejecutar.connLogic2 =  prJren.vejecutar.getConexioLogic(servidor, user, passwd, nombreBD, instancia);


	}

	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
		Vector<Incidencia> vi = new Vector<Incidencia>();
		for (int ejerRen=desdeEjer;ejerRen<=hastaEjer;ejerRen++) {
			boolean bEntra=false;
			boolean bOk = true;
			prJren.desdeJrenta=false;
			prJren.progEjer = ejerRen;
			prJren.ntotal   = nrototdec;
			prJren.codigo   = de.getCodiOrigenStr();  //codi Dec
			prJren.codiCdpGeyce=de.getCodiGeyce();    //codi CDP
			prJren.dominiEA=dominio;
			prJren.userEA=Easp.usuario;
			prJren.idConversion=idConversion;
System.out.println("-- getCodiOrigenStr/codigo=["+de.getCodiOrigenStr()+"]  getCodiGeyce/CPD=["+de.getCodiGeyce()+"]"+" codi origen LG=["+de.getCodiOrigen()+"] codi desti Gyc=["+de.getCodiGeyce()+"] "+de.getRazonSocial()+" ["+ejerRen+"]");
			bOk=prJren.auxcnvlogic2.vejecutar.importarDatos();
			if (bOk){
				prJren.connJRENTA.commit();
				prJren.connEA.commit();
			}
			else {
				prJren.connJRENTA.rollback();
				prJren.connEA.rollback();
				if (prJren.auxcnvlogic2.vIncidencias != null) vi.addAll(prJren.auxcnvlogic2.vIncidencias);
			}
		}
		return vi;
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses() {
		boolean bOk = true;
		String orden =" order by Ejercicio,RENCodigo, IOF_Simulacion";
		String where ="Complementaria=0 and Ejercicio>="+desdeEjer+" and Ejercicio<="+hastaEjer;
		where+= " and Ejercicio>=2010 ";
		if (desdeDec != null && desdeDec.length()>0)  where += " and RENCodigo >='"+desdeDec+"'";
		if (hastaDec != null && hastaDec.length()>0)  where += " and RENCodigo <='"+hastaDec+"'";
		if ("N".equals(simulaciones)) where += " and IOF_Simulacion=0";
		SelectorLogic sDeclarantes2 = new SelectorLogic(connLC);
		sDeclarantes2.execute("Select distinct(RENCodigo) from REN_Declarantes where "+where+" order by RENCodigo");
		while (sDeclarantes2.next() && bOk) {
            String codigo = sDeclarantes2.getString("RENCodigo");
    		SelectorLogic sDeclarantes = new SelectorLogic(connLC);
    		sDeclarantes.execute("Select * from REN_Declarantes where RENCodigo='"+codigo+"' and "+where);
    		if (sDeclarantes.next() && bOk) {
				String nif = sDeclarantes.getString("NifDeclarado");
				String razon = null;
				String NombrePersona = sDeclarantes.getString("NombreEmpleado");
				String PrimerApellido = sDeclarantes.getString("PrimerApellidoEmpleado");
				String SegundoApellido = sDeclarantes.getString("SegundoApellidoEmpleado");
				//String estado=sDeclarantes.getString("RENEstadoCivil");
				int ejer=sDeclarantes.getint("Ejercicio");
				if ((razon == null || razon.trim().length()==0)) {
					razon = "";
					if ((NombrePersona!=null && NombrePersona.trim().length()>0)) razon += NombrePersona+" ";
					if ((PrimerApellido!=null && PrimerApellido.trim().length()>0)) razon += PrimerApellido+" ";
					if ((SegundoApellido!=null && SegundoApellido.trim().length()>0)) razon += SegundoApellido;
					razon = razon.trim();
				}
				/*
				nrototdec++;
				String id=sDeclarantes.getString("RENGuidDeclarante");
				boolean existeConjuge=false;

				SelectorLogic sC = new SelectorLogic(connLC);
	 		    sC.execute("Select * from REN_Conyuges where RENGuidDeclarante='"+id+"' order by RENGuidDeclarante");
	 		    if (sC.next()){
	 		    	String nifc=sC.getString("NifDeclarado");
	 		    	String ap1c=sC.getString("PrimerApellidoEmpleado");
	 		    	String ap2c=sC.getString("SegundoApellidoEmpleado");
	 		    	String nomc=sC.getString("NombreEmpleado");
	 		    	if (nifc!=null && ap1c!=null && nomc!=null) existeConjuge=true;
	 		    }
	 		    sC.close();
				*/
	System.out.println(""+ejer+" nif= ["+nif+"] codigo-RENCodigo= ["+codigo+" ] razon="+razon+" ");
		  	  vDadesEmpresa.addElement (new DadesEmpresa(codigo,nif,razon,getAplicGeyce()));
			//vDadesEmpresa.addElement (new DadesEmpresa(codigo,nif,razon,getAplicGeyce(),ejercicio,nsimulacio,existeConjuge));
			}
			sDeclarantes.close();
		}
		sDeclarantes2.close();
		return vDadesEmpresa;
	}

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JRENTA;
	}

	protected void finConver() {
		super.finConver();
		if ( prJren.connJRENTA != null ) prJren.connJRENTA.disconnect();
		if ( prJren.connEA != null )     prJren.connEA.disconnect();
		if ( prJren.connModasp != null ) prJren.connModasp.disconnect();
	}
	
// ++++++++++++++++++++++++++++++++++++++++++++++++++
	public boolean setConnectJRenta() {
		try {
			prJren.connJRENTA = getConnexio("jrenta",Aplication.getAplication().getDataBase() ) ;
			if ( prJren.connJRENTA != null ) return true;
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean setConnectEa() {
		try {
			prJren.connEA = getConnexio("easp",Aplication.getAplication().getDataBase() ) ;
			if ( prJren.connEA != null ) return true;
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean setConnectMod() {
		try {
			prJren.connModasp = getConnexio("modelos",Aplication.getAplication().getDataBase() ) ;
			if ( prJren.connModasp != null ) return true;
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		return false;
	}

	public static DBConnection getConnexio(String nombd, DBConnection connEA) {
		String server = connEA.getDB().getServer() ;
		String dsn = connEA.getDB().getDsn();

		return(conectaBD(nombd, connEA.getDB().getServer(), connEA.getDB().getUser(), connEA.getDB().getPassword(), connEA.getDB().getType()));
	}

	public static DBConnection conectaBD(String bdnom, String bdserver, String bduser, String bdpassword, String bdtype) {

		ErrorManager actual = Aplication.getAplication().getErrorManager();
		DataBase db=new DataBase();
		db.setName(bdnom);
		db.setMyServer(bdserver);
		db.setUser(bduser);
		db.setMyPassword(bdpassword);
		db.setType(bdtype);
		DBConnection conn=new DBConnection(db);

		if (bdnom.equals("jrenta")) {
			CatJrenta catjrenta = new CatJrenta();
			Catalog array[] = {catjrenta};
			db.setCatalogs(array);
		}
		if (bdnom.equals("modelos")) {
			CatModgen catmodgen = new CatModgen();
			Catalog array[] = {catmodgen};
			db.setCatalogs(array);
		}
		if (bdnom.equals("easp")) {
			CatEasp cateasp = new CatEasp();
			Catalog array[] = {cateasp};
			db.setCatalogs(array);
		}

		conn=new DBConnection(db);
		if (conn.connect()) {
			Aplication.getAplication().setErrorManager(actual);
			return conn;
		}
		else {
			Aplication.getAplication().setErrorManager(actual);
			return null;
		}
	}

// ++++++++++++++++++++++++++++++++++++++++++++++++++
}
