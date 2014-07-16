package mae.easp.conversions.logicclass;

import java.util.Vector;
import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.FuncionesJGES;
import mae.easp.conversions.FuncionesJNOM;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.easp.general.Easp;
import mae.general.ProgressBarForm;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class ConversionJGES extends ConversionLC {
	
	public mae.jexpe.auximportalogic.ProgAuximportalogic prGes;
	private ProgressBarForm pbf;
	private FuncionesJGES funciones;
	private DBConnection dbJges;

	
	public ConversionJGES (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
		prGes= new mae.jexpe.auximportalogic.ProgAuximportalogic();
		funciones = new FuncionesJGES(connEA,dominio);
		dbJges = funciones.connJGes;
		prGes.setConnection(dbJges);
		prGes.setDataBase(dbJges.getDB());	
		prGes.converConjuntaEA = true;
		prGes.dominio = Easp.dominio;
		initPrograma();

	}

	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
	  try {
			this.pbf = pbf;
			boolean bOk = true;
			int empLC = de.getCodiOrigen();
			int empJN = de.getCodiGeyce();
			String sNifEmpresa = de.getNif();	
			prGes.pbf =pbf;
			mae.jexpe.general.logicclass.Despacho con = new mae.jexpe.general.logicclass.Despacho();
	        con.run(prGes,empLC,empJN);
	        con.runFacturas(prGes, empLC, empJN);
	        updateTableConversion(empLC, empJN);
	        prGes.getDataBase().commit();
	        pr.getDataBase().commit();
	        System.gc();
			return vIncidencias;
		  }
		  catch (Exception ex) {
			prGes.getDataBase().rollback();
	        pr.getDataBase().rollback();
		    ex.printStackTrace(); 
			return vIncidencias;
		  }
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses() {
		SelectorLogic sEmp = new SelectorLogic (connLC);
		//String sql = "SELECT distinct e.CodigoEmpresa,e.CifDni,e.Empresa,e.NombrePersona,e.PrimerApellido,e.SegundoApellido FROM Clientes c INNER JOIN Empresas e ON c.CodigoEmpresa = e.CodigoEmpresa";
		String sql = "SELECT distinct e.CodigoEmpresa,e.CifDni,e.Empresa,e.NombrePersona,e.PrimerApellido,e.SegundoApellido FROM lsysEmpresaAplicacion c INNER JOIN Empresas e ON c.CodigoEmpresa = e.CodigoEmpresa and c.CodigoAplicacion = 'GFP'";
		if (desdeEmp>0) sql += " and e.CodigoEmpresa>="+desdeEmp; 
		if (hastaEmp>0) sql += " and e.CodigoEmpresa<="+hastaEmp; 		
		sEmp.execute(sql);
		while (sEmp.next()) {
			int emp = sEmp.getint("CodigoEmpresa");
			String nif = (String)sEmp.getObject("CifDni");
			String razon = (String)sEmp.getObject("Empresa");			
			String NombrePersona = (String)sEmp.getObject("NombrePersona");
			String PrimerApellido = (String)sEmp.getObject("PrimerApellido");
			String SegundoApellido = (String)sEmp.getObject("SegundoApellido");
			if ((razon == null || razon.trim().length()==0)) {
				razon = "";
				if ((NombrePersona!=null && NombrePersona.trim().length()>0)) razon += NombrePersona+" ";
				if ((PrimerApellido!=null && PrimerApellido.trim().length()>0)) razon += PrimerApellido+" ";
				if ((SegundoApellido!=null && SegundoApellido.trim().length()>0)) razon += SegundoApellido;
				razon = razon.trim();
			}
			vDadesEmpresa.addElement (new DadesEmpresa(emp,nif,razon,APLICACION_GEYCE.JGESTION));
		}
		sEmp.close();
		return vDadesEmpresa;
	}

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JGESTION;
	}
	
	public void updateTableConversion(int codiLC, int codiJN) {
	  prGes.sseleccion.setWhere("cnvnombd = '" + nombreBD+"' and cnvcodigo = " + codiLC);
	  prGes.sseleccion.execute();
	  if(!prGes.sseleccion.isEof()) {
		prGes.sseleccion.edit();
		prGes.sseleccion.cnvseleccion.setValue("N");
		prGes.sseleccion.cnvestado.setValue("C");
		prGes.sseleccion.cnvobserva.setValue("Despacho traspasado");
		prGes.sseleccion.cnvnewcodigo.setValue(codiJN);
		prGes.sseleccion.update();
		//prGes.sseleccion.getDataBase().commit();
	  }
	}
	
	public void initPrograma() {
	  try {
		prGes.setConnection(servidor, nombreBD, user, passwd, instancia);
		prGes.iniLog();		
		prGes.vconvers.vvdesdehisto	.setValue(desdeEjer);
		prGes.vconvers.vvnombd		.setValue(nombreBD);
		prGes.snifes.setDb(dbJges);		
		prGes.scdp.setDb(dbJges);		
		prGes.sultimaincidenc.setDb(dbJges);
		prGes.sparametros.setDb(dbJges);
		prGes.sparametros.setWhere("pardominio = '"+dominio+"'   AND parusuario = '"+user+"' AND parambito = 'CONVERLOGICGES' AND parvariable = 'PARAMLOGIC' AND paragrup = 'JGESTION'");
		prGes.sparametros.execute();
		if(prGes.sparametros.isEof()) {
		  prGes.sparametros.addNew();	      
		  prGes.sparametros.pardominio     .setValue(dominio);
		  prGes.sparametros.parusuario     .setValue(user);
		  prGes.sparametros.parambito      .setValue("CONVERLOGICGES");
		  prGes.sparametros.parvariable    .setValue("PARAMLOGIC");
		  prGes.sparametros.pardesc        .setValue(user+"^"+((passwd == null || passwd.equals(""))?"":passwd)+ (desdeEjer == 0?"^":"^"+desdeEjer));
		  prGes.sparametros.paragrup       .setValue("JGESTION");
		  prGes.sparametros.parvalor       .setValue(servidor+"^"+ nombreBD+((instancia == null || instancia.equals(""))?"":"^"+instancia));
	      prGes.sparametros.insert();
		}
		prGes.cargaDespachos();
		prGes.getDataBase().commit();
	  }
	  catch(Exception ex) {
		ex.printStackTrace();
		  
	  }

	}
}
