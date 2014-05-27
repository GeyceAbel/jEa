package mae.easp.conversions.logicclass;

import java.util.Vector;

import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.general.ProgressBarForm;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class ConversionJISS extends ConversionLC {

	public ConversionJISS (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
	}

	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
		return null;
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses() {
        String where = " empresaestimaciones=0 and (IOF_SocPeriodos.Ejercicio>="+desdeEjer+" and IOF_SocPeriodos.Ejercicio<="+hastaEjer+")";
        if (desdeEmp>0) where += " and Empresas.CodigoEmpresa>="+desdeEmp;
        if (hastaEmp>0) where += " and Empresas.CodigoEmpresa<="+hastaEmp;
        SelectorLogic sEmpresas = new SelectorLogic (connLC);
        sEmpresas.execute("Select *,Empresas.codigoempresa as codi from Empresas INNER JOIN IOF_SocPeriodos on IOF_SocPeriodos.CodigoEmpresa=Empresas.CodigoEmpresa where "+where+" order by Empresas.CodigoEmpresa");
        while (sEmpresas.next()) {
           int codEmp = sEmpresas.getint("Codi");
           String nif = sEmpresas.getString("CifDni");
           String nombreCompleto = sEmpresas.getString("Empresa");
           DadesEmpresa de = new DadesEmpresa(codEmp,nif,nombreCompleto,APLICACION_GEYCE.JISS);
           if (!vDadesEmpresa.contains(de)) vDadesEmpresa.addElement (de);
        }
        sEmpresas.close();
		return vDadesEmpresa;
	}

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JISS;
	}
	
	
}
