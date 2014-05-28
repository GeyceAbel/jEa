package mae.easp.conversions.logicclass;

import java.util.Vector;
import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.general.ProgressBarForm;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class ConversionJREN extends ConversionLC {

	public ConversionJREN (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
	}

	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
		return null;
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses() {
		return vDadesEmpresa;
	}

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JRENTA;
	}
	
	
}
