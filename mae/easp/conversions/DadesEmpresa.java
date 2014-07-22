package mae.easp.conversions;

import java.util.Vector;

import mae.easp.conversions.Conversion.APLICACION_GEYCE;
import mae.easp.conversions.Conversion;

public class DadesEmpresa {	
	private int codiOrigen;
	private String codiOrigenStr;
	private int codiGeyce;
	private String nif;
	private String razonSocial;
	private APLICACION_GEYCE aplicOrigen;
	private Vector <APLICACION_GEYCE> vAplicOrigen;
	private boolean codigoOrigenString;
	
	public DadesEmpresa(int codiLC, String nif, String razonSocial, APLICACION_GEYCE aplicOrigen) {
		this.codiOrigen = codiLC;
		this.nif = nif;
		this.razonSocial = razonSocial;
		vAplicOrigen = new Vector<APLICACION_GEYCE>();
		vAplicOrigen.addElement(aplicOrigen);
		this.aplicOrigen = aplicOrigen;
		codiGeyce = Conversion.CODIGO_EMPRESA_NO_ASIGNADA;
		codigoOrigenString = false;
	}

	public DadesEmpresa(String codiLC, String nif, String razonSocial, APLICACION_GEYCE aplicOrigen) {
		this.codiOrigenStr = codiLC;
		this.nif = nif;
		this.razonSocial = razonSocial;
		vAplicOrigen = new Vector<APLICACION_GEYCE>();
		vAplicOrigen.addElement(aplicOrigen);
		this.aplicOrigen = aplicOrigen;
		codiGeyce = Conversion.CODIGO_EMPRESA_NO_ASIGNADA;
		codigoOrigenString = true;
	}

	public int getCodiOrigen() {
		return codiOrigen;
	}

	public int getCodiGeyce() {
		return codiGeyce;
	}

	public void setCodiGeyce(int codiGeyce) {
		this.codiGeyce = codiGeyce;
	}

	public String getNif() {
		return nif;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void addAplicacionAConvertir (APLICACION_GEYCE aplic) {
		vAplicOrigen.addElement(aplic);
	}

	public boolean seConvierteAplicacion (APLICACION_GEYCE aplic) {
		return vAplicOrigen.contains(aplic);
	}
	
	public APLICACION_GEYCE getAplicOrigen() {
		return aplicOrigen;
	}

	public String getCodiOrigenStr() {
		return codiOrigenStr;
	}

	public boolean esCodigoOrigenString() {
		return codigoOrigenString;
	}
	
}
