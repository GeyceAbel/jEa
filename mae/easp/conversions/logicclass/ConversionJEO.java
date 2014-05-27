package mae.easp.conversions.logicclass;

import java.util.Vector;

import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.general.ProgressBarForm;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class ConversionJEO extends ConversionLC {

	public ConversionJEO (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
	}


	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
		return null;
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses() {
		String where = "empresaestimaciones=-1";
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

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JEO;
	}
	
	
}
