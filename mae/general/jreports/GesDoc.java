package mae.general.jreports;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import geyce.maefc.DBConnection;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import mae.easp.general.Easp;
import mae.general.Azure;
import mae.general.Numero;

public abstract class GesDoc implements IGesDoc {


	public GesDoc () {
	}

	public abstract int getEmpresa();
	public abstract String getNif();
	public abstract DBConnection getConexionApl();
	public abstract APLETI getAplicacion();
	public abstract boolean esExcel();
	public abstract TIPOPERIODO getPeriodoInicial();
	public abstract TIPOPERIODO getPeriodoFinal();

	public List<IEtiquetaGD> getEtiquetas() {
		List<IEtiquetaGD> lEtiquetas = new ArrayList<IEtiquetaGD>();
		lEtiquetas.add(getEtiqueta(ETIQUETAS.CDP,getCDPAfinity()));
		if(getEjercicio() != 0) lEtiquetas.add(getEtiqueta(ETIQUETAS.EJERCICIO, getEjercicio()));
		lEtiquetas.add(getEtiqueta(ETIQUETAS.APLICACION, getAplicacion().toString()));
		lEtiquetas.add(getEtiqueta(ETIQUETAS.NIF, getNif()));
		lEtiquetas.add(getEtiqueta(ETIQUETAS.EMPRESA, getEmpresa()));
		if (getPeriodoInicial() != null) lEtiquetas.add(getEtiqueta(ETIQUETAS.PERIODO, getPeriodo2D(getPeriodoInicial())));
		if (getPeriodoFinal() != null) lEtiquetas.add(getEtiqueta(ETIQUETAS.PERIODOFINAL, getPeriodo2D(getPeriodoFinal())));

		return lEtiquetas;
	}

	public static IEtiquetaGD getEtiqueta (ETIQUETAS eti, int valor) {
		return getEtiqueta(eti, String.valueOf(valor));
	}

	public static IEtiquetaGD getEtiqueta (final ETIQUETAS eti, final String valor) {
		return new IEtiquetaGD() {
			@Override
			public String getValor() {
				return valor;
			}

			@Override
			public ETIQUETAS getIdentificador() {
				return eti;
			}
		};
	}

	public String getUbicacionGD() {
		String ap = "Fiscal";
		if (getAplicacion() == APLETI.JNOMINA) ap = "Laboral";
		else if (getAplicacion() == APLETI.JMODELOS) ap = "ModelosAEAT";
		else if (getAplicacion() == APLETI.JEO) ap = "Estimacion";
		ap += "\\"+getNif()+((getEjercicio() != 0)?"\\"+getEjercicio():"");

		return ap;
	};

	public String getNombre() {
		return Easp.nombreEmpresa(getNif());
	}

	public String getNifRelacionado () {
		String sNif = null;
		String sCodiCDP = Easp.dominio.substring(0,6)+Numero.format(getEmpresa(),"000000");
		String sCDPtmp;
		Selector selCDP = new Selector (Easp.connEA);
		String sSql = "select cdpnifcif,cdpcdprel from cdp where cdpcodi='" + sCodiCDP + "'";
		selCDP.execute(sSql);
		if (selCDP.next()) {
			sCDPtmp = selCDP.getString("cdpcdprel");
			if (sCDPtmp == null) {
				sNif = selCDP.getString("cdpnifcif");
			}
			else {
				selCDP.close();
				sSql = "select cdpnifcif,cdpcdprel from cdp where cdpcodi='" + sCDPtmp + "'";
				selCDP.execute(sSql);
				if (selCDP.next()) {
					sNif = selCDP.getString("cdpnifcif");
				}
			}
		}
		selCDP.close();
		return sNif;
	}

	public String getCDPAfinity () {
		String cdpafinity = null;
		String sNif = getNifRelacionado ();
		if (sNif != null) {
			String sCodiCDPOK = "";
			Azure az = new Azure ("agpi2dp.getCDPfromNifPortal");
			az.addParametroURL("codiDP", Easp.dominio.substring(0,6)+"000000");
			az.addParametroURL("nifcif", sNif);
			if (az.procesar()) sCodiCDPOK = az.getContenido();
			if ( sCodiCDPOK!= null && sCodiCDPOK.trim().length() == 12 ) cdpafinity = sCodiCDPOK;
		}
		return cdpafinity;
	}

	public String getPeriodo2D (TIPOPERIODO tp) {
		if (tp == TIPOPERIODO.ENERO) return "01";
		else if (tp == TIPOPERIODO.FEBRERO) return "02";
		else if (tp == TIPOPERIODO.MARZO) return "03";
		else if (tp == TIPOPERIODO.ABRIL) return "04";
		else if (tp == TIPOPERIODO.MAYO) return "05";
		else if (tp == TIPOPERIODO.JUNIO) return "06";
		else if (tp == TIPOPERIODO.JULIO) return "07";
		else if (tp == TIPOPERIODO.AGOSTO) return "08";
		else if (tp == TIPOPERIODO.SEPTIEMBRE) return "09";
		else if (tp == TIPOPERIODO.OCTUBRE) return "10";
		else if (tp == TIPOPERIODO.NOVIEMBRE) return "11";
		else if (tp == TIPOPERIODO.DICIEMBRE) return "12";
		else if (tp == TIPOPERIODO.TRIM1) return "1T";
		else if (tp == TIPOPERIODO.TRIM2) return "2T";
		else if (tp == TIPOPERIODO.TRIM3) return "3T";
		else if (tp == TIPOPERIODO.TRIM4) return "4T";
		else if (tp == TIPOPERIODO.PER1) return "1P";
		else if (tp == TIPOPERIODO.PER2) return "2P";
		else if (tp == TIPOPERIODO.PER3) return "3P";
		else if (tp == TIPOPERIODO.ANUAL) return "0A";
		else if (tp == TIPOPERIODO.INICIAL) return "INI";
		else if (tp == TIPOPERIODO.FINAL) return "FIN";
		return "--";
	}

	public static TIPOPERIODO getPeridodo(Date d) {	
		if (d != null) return getPeridodo (String.valueOf((1+Maefc.getMonth(d))));
		else return TIPOPERIODO.ANUAL;
	}

	public static TIPOPERIODO getPeridodo(int i) {	
		return getPeridodo (String.valueOf(i));
	}

	public static TIPOPERIODO getPeridodo(String val) {	
		TIPOPERIODO tp = null;
		if ("00".equals(val) || "0".equals(val)) tp= TIPOPERIODO.INICIAL;
		else if ("13".equals(val)) tp= TIPOPERIODO.FINAL;
		else if ("14".equals(val)) tp= TIPOPERIODO.FINAL;
		else if ("01".equals(val) || "1".equals(val)) tp= TIPOPERIODO.ENERO;
		else if ("02".equals(val) || "2".equals(val)) tp= TIPOPERIODO.FEBRERO;
		else if ("03".equals(val) || "3".equals(val)) tp= TIPOPERIODO.MARZO;
		else if ("04".equals(val) || "4".equals(val)) tp= TIPOPERIODO.ABRIL;
		else if ("05".equals(val) || "5".equals(val)) tp= TIPOPERIODO.MAYO;
		else if ("06".equals(val) || "6".equals(val)) tp= TIPOPERIODO.JUNIO;
		else if ("07".equals(val) || "7".equals(val)) tp= TIPOPERIODO.JULIO;
		else if ("08".equals(val) || "8".equals(val)) tp= TIPOPERIODO.AGOSTO;
		else if ("09".equals(val) || "9".equals(val)) tp= TIPOPERIODO.SEPTIEMBRE;
		else if ("10".equals(val)) tp= TIPOPERIODO.OCTUBRE;
		else if ("11".equals(val)) tp= TIPOPERIODO.NOVIEMBRE;
		else if ("12".equals(val)) tp= TIPOPERIODO.DICIEMBRE;
		else if ("1T".equals(val)) tp= TIPOPERIODO.TRIM1;
		else if ("2T".equals(val)) tp= TIPOPERIODO.TRIM2;
		else if ("3T".equals(val)) tp= TIPOPERIODO.TRIM3;
		else if ("4T".equals(val)) tp= TIPOPERIODO.TRIM4;
		else if ("1P".equals(val)) tp= TIPOPERIODO.PER1;
		else if ("2P".equals(val)) tp= TIPOPERIODO.PER2;
		else if ("3P".equals(val)) tp= TIPOPERIODO.PER3;
		else if ("0A".equals(val)) tp= TIPOPERIODO.ANUAL;

		return tp;
	}

	public static void send (String cdp, String nombrefit, String descfit, String tipofit, boolean enviarMail, String mail, String ubicaciongd, int ubicaciongd_user, List<IEtiquetaGD> leti, File f) throws Exception {
		JsonObject jo = creaJson(cdp, nombrefit, descfit, tipofit, enviarMail, mail, ubicaciongd, ubicaciongd_user, leti);
		
		Azure az = new Azure ("gesdoc.uploadfile", null, f, jo);

		if (!az.procesar()) throw new Exception ("No se ha podido subier el fichero a la GesDoc: "+az.getError());
	}

	public static void sendPDF (String cdp, String nombrefit, String descfit, String ubicaciongd, List<IEtiquetaGD> leti, File f) throws Exception {
		send (cdp, nombrefit, descfit, "pdf", false, null, ubicaciongd, 0, leti, f);
	}

	public static void sendXLSX (String cdp, String nombrefit, String descfit, String ubicaciongd, List<IEtiquetaGD> leti, File f) throws Exception {
		send (cdp, nombrefit, descfit, "xlsx", false, null, ubicaciongd, 0, leti, f);
	}

	public static void sendXLS (String cdp, String nombrefit, String descfit, String ubicaciongd, List<IEtiquetaGD> leti, File f) throws Exception {
		send (cdp, nombrefit, descfit, "xls", false, null, ubicaciongd, 0, leti, f);
	}

	private static JsonObject creaJson (String cdp, String nombrefit, String descfit, String tipofit, boolean enviarMail, String mail, String ubicaciongd, int ubicaciongd_user, List<IEtiquetaGD> leti) {
		JsonObjectBuilder builder = Json.createObjectBuilder();
		JsonArrayBuilder arrdetBuilder = Json.createArrayBuilder();

		for (IEtiquetaGD e : leti) {
			JsonObjectBuilder detBuilder = Json.createObjectBuilder();
			detBuilder.add("clave", e.getIdentificador().toString());
			detBuilder.add("valor", e.getValor());
			arrdetBuilder.add(detBuilder);
		}
		builder.add("etiquetas", arrdetBuilder);
		builder.add("cdp", cdp);
		builder.add("nombrefit", nombrefit);
		builder.add("descfit", descfit);
		builder.add("tipofit", tipofit);
		builder.add("sendmail", enviarMail);
		builder.add("mail", mail);
		if (ubicaciongd_user > 0) builder.add("iddir",ubicaciongd_user);
		else builder.add("iddir", 0);
		builder.add("ubic", ubicaciongd);
		builder.add("usr", Easp.usuario);

		return builder.build();
	}
}
