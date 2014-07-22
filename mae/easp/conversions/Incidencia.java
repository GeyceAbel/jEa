package mae.easp.conversions;

import geyce.maefc.DBConnection;
import geyce.maefc.Delete;
import mae.easp.conversions.Conversion.APLICACION_GEYCE;

public class Incidencia {
	int empresaOrigen;
	String empresaOrigenStr;
	int empresaDestino;      
	int ejercicio;
	String msg;
	Conversion.APLICACION_GEYCE aplicacio;
	String nif;
	String nom;
	int idConversion;

	public Incidencia(int empresaOrigen, int empresaDestino, int ejercicio, String msg, APLICACION_GEYCE aplicacio, String nif, String nom, int idConversion) {
		this.empresaOrigen = empresaOrigen;
		this.empresaDestino = empresaDestino;
		this.msg = msg;
		this.aplicacio = aplicacio;
		this.nif = nif;
		this.nom = nom;
		this.idConversion = idConversion;
		this.ejercicio = ejercicio;
	}

	public Incidencia(String empresaOrigenStr, int empresaDestino, int ejercicio, String msg, APLICACION_GEYCE aplicacio, String nif, String nom, int idConversion) {
		this.empresaOrigenStr = empresaOrigenStr;
		this.empresaDestino = empresaDestino;
		this.msg = msg;
		this.aplicacio = aplicacio;
		this.nif = nif;
		this.nom = nom;
		this.idConversion = idConversion;
		this.ejercicio = ejercicio;
	}
	
	public static boolean eliminarIncidencias (int idConversion, DBConnection connEA) {
		boolean bOk = true;
		Delete d = new Delete (connEA,"CODCNVINCIDEN");
		bOk = d.execute("cciccocodi="+idConversion);
		if (bOk) connEA.commit();
		return bOk;
	}
}
