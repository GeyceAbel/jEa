package mae.easp.conversions;

import geyce.maefc.*;

import java.util.Enumeration;

public class ErrorManagerConvers extends ErrorManagerDefault {
	Conversion cnv;
	String sError;
	
	ErrorManagerConvers (Conversion cnv) {
		super();
		this.cnv = cnv;
		sError = null;
	}
	
	public String getDescripcionError () {
		String ret = sError;
		sError = null;
		return ret;
	}
	
	public void error(ErrorParam param) {
		try {
			String message = param.getMessage();
			Exception ex = param.getException();
			Aplication apl = param.getAplication();
			Program prog = param.getProgram();
			DataBase db = param.getDB();
			Form form = param.getForm();
			VisualComponent ctrl = param.getControl();
			Report report = param.getReport();
			int sqlcode = param.getSQLCode();
			if (message != null)  System.err.println(message);
			if (ex != null)  {
				System.err.println(ex + ": " + ex.getMessage());				
				if (ex.getMessage()!=null) sError = ex.getMessage();
				else sError = String.valueOf(ex); 
			}
			else sError = "Error sin detallar.";
			for (Enumeration e = param.getKeys(); e.hasMoreElements();) {
				String key = (String) e.nextElement();
				Object texte = param.get(key);
				if (key != null && texte != null)  System.err.println(key + ": " + texte.toString());
			}
			if (sqlcode != 0)   System.err.println("Código BD: " + sqlcode);
			if (apl != null)    System.err.println("Aplicacion: " + apl.getName());
			if (db != null)     System.err.println("Base de Datos: " + db.getName());
			if (prog != null)   System.err.println("Programa: " + prog.getName());
			if (form != null)   System.err.println("Ventana: " + form.getName());
			if (ctrl != null)   System.err.println("Control: " + ctrl.getName());
			if (report != null) System.err.println("Listado: " + report.getName());
			if (ex != null) ex.printStackTrace(System.err);
			if (cnv.vIncidencias != null) {
				DadesEmpresa de = cnv.getDEActual();
				if (de.getCodiOrigenStr()!=null) cnv.vIncidencias.addElement(new Incidencia(de.getCodiOrigenStr(), de.getCodiGeyce(), cnv.getEjercicioEnCurso(), sError, de.getAplicOrigen(), de.getNif(), de.getRazonSocial(), cnv.idConversion));
				else cnv.vIncidencias.addElement(new Incidencia(de.getCodiOrigen(), de.getCodiGeyce(), cnv.getEjercicioEnCurso(), sError, de.getAplicOrigen(), de.getNif(), de.getRazonSocial(), cnv.idConversion));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
