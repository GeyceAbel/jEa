package mae.easp.conversions.logicclass;

import java.util.Vector;

import mae.easp.conversions.DadesEmpresa;
import mae.easp.conversions.Incidencia;
import mae.easp.conversions.logicclass.db.SelectorLogic;
import mae.general.ProgressBarForm;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class ConversionJREN extends ConversionLC {
	private String desdeDec;
	private String hastaDec;
	private String simulaciones;

	public ConversionJREN (Program pr,int idConversion, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, String servidor, String instancia, String nombreBD, String user, String passwd, DBConnection connEA, String desdeDec, String hastaDec, String simulaciones) {
		super (pr,desdeEmp, hastaEmp, desdeEjer, hastaEjer, connEA, servidor, instancia, nombreBD, user, passwd, idConversion);
		this.desdeDec = desdeDec;
		this.hastaDec = hastaDec;
		this.simulaciones = simulaciones;
	}

	@Override
	protected Vector<Incidencia> convertirEmpresa(DadesEmpresa de, ProgressBarForm pbf) {
		return null;
	}

	@Override
	public Vector<DadesEmpresa> initEmpreses() {
		boolean bOk = true;
		String orden =" order by RENCodigo, IOF_Simulacion";  
		String where ="Complementaria=0 and Ejercicio>="+desdeEjer+" and Ejercicio<="+hastaEjer;          
		if (desdeDec != null && desdeDec.length()>0)  where += " and RENCodigo >='"+desdeDec+"'";
		if (hastaDec != null && hastaDec.length()>0)  where += " and RENCodigo <='"+hastaDec+"'";
		if ("N".equals(simulaciones)) where += " and IOF_Simulacion=0";  
		SelectorLogic sDeclarantes = new SelectorLogic(connLC);  
		sDeclarantes.execute("Select * from REN_Declarantes where "+where+orden);
		while (sDeclarantes.next() && bOk) {
			String nif = sDeclarantes.getString("NifDeclarado");
            String codigo = sDeclarantes.getString("RENCodigo");
			String razon = null;			
			String NombrePersona = sDeclarantes.getString("NombreEmpleado");
			String PrimerApellido = sDeclarantes.getString("PrimerApellidoEmpleado");
			String SegundoApellido = sDeclarantes.getString("SegundoApellidoEmpleado");
			if ((razon == null || razon.trim().length()==0)) {
				razon = "";
				if ((NombrePersona!=null && NombrePersona.trim().length()>0)) razon += NombrePersona+" ";
				if ((PrimerApellido!=null && PrimerApellido.trim().length()>0)) razon += PrimerApellido+" ";
				if ((SegundoApellido!=null && SegundoApellido.trim().length()>0)) razon += SegundoApellido;
				razon = razon.trim();
			}
			vDadesEmpresa.addElement (new DadesEmpresa(codigo,nif,razon,getAplicGeyce()));
		}
		sDeclarantes.close();
		return vDadesEmpresa;
	}

	@Override
	public APLICACION_GEYCE getAplicGeyce() {
		return APLICACION_GEYCE.JRENTA;
	}


}
