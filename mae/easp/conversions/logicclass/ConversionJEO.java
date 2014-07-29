package mae.easp.conversions.logicclass;

import java.util.Vector;

import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.easp.conversions.FuncionesJEO;
import mae.general.ProgressBarForm;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class ConversionJEO extends ConversionLC {
  private boolean chestimaciones = false;
  private boolean chmercantil = false;
  private boolean chmodelos = false;
	private ProgressBarForm pbf;
  private FuncionesJEO funciones;
  private DBConnection dbJEO;
  public mae.jeo.auxlogicclass.ProgAuxlogicclass prJeo;

  public ConversionJEO (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA, boolean chestimaciones, boolean chmercantil, boolean chmodelos) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
    this.chestimaciones = chestimaciones;
    this.chmercantil = chmercantil;
    this.chmodelos = chmodelos;
    funciones = new FuncionesJEO(connEA,dominio);
    prJeo= new mae.jeo.auxlogicclass.ProgAuxlogicclass();
    dbJEO = funciones.connJEO;
    prJeo.setConnection(dbJEO);
    mae.jeo.general.Jeo.connJEO = funciones.connJEO;
    mae.jeo.general.Jeo.connEA = connEA;
    mae.jeo.general.Jeo.dominio = dominio;

    prJeo.setDataBase(dbJEO.getDB());
    prJeo.vejecutar.converConjuntaEA = true;
    prJeo.vejecutar.emc = emc;
    prJeo.vejecutar.desdeEjercicio = desdeEjer;
    prJeo.vejecutar.hastaEjercicio = hastaEjer;
	  initPrograma();
	}

	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {

     boolean bOk = true;
     int empLC = de.getCodiOrigen();
     int empJC = de.getCodiGeyce();
     String sNifEmpresa = de.getNif();
     Vector<Incidencia> vIncidencias = new Vector<Incidencia>();
     sError = "";
     prJeo.vejecutar.connLogic = connLC;
     mae.jeo.general.Jeo.connModasp = connModasp;
     mae.jeo.general.Jeo.connJEO = funciones.connJEO;
     prJeo.vejecutar.emc = emc;
     prJeo.vejecutar.vvempresa .setValue(de.getCodiOrigen());
     prJeo.vejecutar.vvhastaempre .setValue(de.getCodiOrigen());
     prJeo.vejecutar.chestimaciones .setValue(chestimaciones);
     prJeo.vejecutar.chmercantil .setValue(chmercantil);
     prJeo.vejecutar.chmodelos .setValue(chmodelos);
     //prJeo.vejecutar.altaRegConversion (de.getCodiOrigen(),de.getRazonSocial(), de.getNif(), de.getCodiGeyce());
     prJeo.vejecutar.pbf = pbf;
     if (prJeo.vejecutar.traspasoEA (empLC, empJC)) {
        mae.jeo.general.Jeo.connJEO.commit();
        mae.jeo.general.Jeo.connEA.commit();
        mae.jeo.general.Jeo.connModasp.commit();
     }
     else {
        mae.jeo.general.Jeo.connJEO.rollback();
        mae.jeo.general.Jeo.connEA.rollback();
        mae.jeo.general.Jeo.connModasp.rollback();
        vIncidencias.addElement(new Incidencia (empLC,empJC,0,prJeo.vejecutar.sError,APLICACION_GEYCE.JEO,de.getNif(),de.getRazonSocial(),idConversion));
    }
		return vIncidencias;
	}

	public Vector<DadesEmpresa> initEmpreses() {
    String where = "";
    if (chestimaciones && !chmercantil) where = " empresaestimaciones=-1 ";
    else if (chmercantil && !chestimaciones) where = " sociedadmercantil=-1 ";
    else where = "(empresaestimaciones=-1 or sociedadmercantil=-1)";
		if (desdeEmp>0) where += " and CodigoEmpresa>="+desdeEmp;
		if (hastaEmp>0) where += " and CodigoEmpresa<="+hastaEmp;
		SelectorLogic sEmpresas = new SelectorLogic (connLC);
		sEmpresas.execute("Select * from Empresas where "+where+" order by CodigoEmpresa");
		while (sEmpresas.next()) {
			int codEmp = sEmpresas.getint("CodigoEmpresa");
			String nif = sEmpresas.getString("CifDni");
			String nombreCompleto = sEmpresas.getString("Empresa");
			vDadesEmpresa.addElement (new DadesEmpresa(codEmp,nif,nombreCompleto,APLICACION_GEYCE.JEO));
		}
		sEmpresas.close();
		return vDadesEmpresa;
	}

	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JEO;
	}

	protected void initPrograma() {
      prJeo.vejecutar.connLogic = connLC;
      prJeo.vejecutar.assignaEquivCtas();
      prJeo.vejecutar.borraTablaConver();
      prJeo.vejecutar.vvempresa .setValue(desdeEmp);
      prJeo.vejecutar.vvhastaempre .setValue(hastaEmp);
      prJeo.vejecutar.chestimaciones .setValue(chestimaciones);
      prJeo.vejecutar.chmercantil .setValue(chmercantil);
      prJeo.vejecutar.chmodelos .setValue(chmodelos);
	}
	protected void finConver() {
		super.finConver();
    if (dbJEO!=null) dbJEO.disconnect();
	}

}
