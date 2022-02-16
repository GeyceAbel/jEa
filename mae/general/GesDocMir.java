package mae.general;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import geyce.maefc.Aplication;
import geyce.maefc.DBConnection;
import geyce.maefc.Report;
import geyce.maefc.Selector;
import mae.easp.general.Easp;
import mae.general.jreports.GesDoc;
import mae.general.jreports.IEtiquetaGD;



public class GesDocMir extends GesDoc {
	
	private int empresa;
	private int periodo;
	private String nif;
	private DBConnection conn;
	private String subtitulo;
	private String script;
	private Report informe;
	private String urlFile;
	private String mailToSend;
	private String dominioAfinity;
	private boolean fileSend;
	//private TIPOETI tipolis;
	private String descripcionFichero;
	public ArrayList<IEtiquetaGD> lEtiquetas = new ArrayList<IEtiquetaGD>();
	public boolean  isPortalCdp = false;
	
	private String ubicacionGD;


	public String getUbicacionGD() {
		return ubicacionGD;
	}



	public void setUbicacionGD(String ubicacionGD) {
		this.ubicacionGD =  super.getUbicacionGD()+"\\" + nif +"\\" + ubicacionGD;
	}



	public GesDocMir (DBConnection conn,int empresa, String nif, String subtitulo,TIPOETI tipolis) {
		this.empresa = empresa;
		this.nif = nif;
		this.conn = conn;
		//this.tipolis = tipolis;
		this.setSubtitulo(subtitulo);
		
		Selector s = new Selector (Easp.connEA);
		s.execute("select datemail from NIFES where danifcif='"+nif+"'");
		if (s.next()) 
			setMailToSend(s.getString("datemail"));
		s.close();
		
		this.setDominioAfinity(getCDPAfinity());
		setEtiquetas();
		lEtiquetas.add(getEtiqueta(ETIQUETAS.TIPO, tipolis.toString()));
		ubicacionGD = super.getUbicacionGD();
		
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
			if ( sCodiCDPOK!= null && sCodiCDPOK.trim().length() == 12 ) {
				cdpafinity = sCodiCDPOK;
				isPortalCdp = true;
			}
			else {
				Azure az1 = new Azure ("agpi2dp.getCDPfromNif");
				az1.addParametroURL("codiDP", Easp.dominio.substring(0,6)+"000000");
				az1.addParametroURL("nifcif", sNif);
				if (az1.procesar()) sCodiCDPOK = az1.getContenido();
				if ( sCodiCDPOK!= null && sCodiCDPOK.trim().length() == 12 ) {
					cdpafinity = sCodiCDPOK;
					isPortalCdp = false;
				}
			}
		}
		return cdpafinity;
	}
	
	
	
	public Report getInforme() {
		return informe;
	}



	public void setInforme(Report informe) {
		this.informe = informe;
	}

	/**
	 * @return the urlFile
	 */
	public String getUrlFile() {
		return urlFile;
	}



	/**
	 * @param urlFile the urlFile to set
	 */
	public void setUrlFile(String urlFile) {
		this.urlFile = urlFile;
		File f = new File(urlFile);
		
		String info = f.getName();
		info+=" Empresa ["+getEmpresa()+" ("+getNif()+")]";		
		if (subtitulo != null) info +="  ["+subtitulo+"]";
		descripcionFichero = info;
	}

	public String getScript() {
		return script;
	}



	public void setScript(String script) {
		this.script = script;
	}




	
	
	
	@Override
	public int getEjercicio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombreFichero() {
	  return null;
	}

	public List<IEtiquetaGD> setEtiquetas() {
		lEtiquetas.add(getEtiqueta(ETIQUETAS.CDP,dominioAfinity));
		//if(getEjercicio() != 0) lEtiquetas.add(getEtiqueta(ETIQUETAS.EJERCICIO, getEjercicio()));
		lEtiquetas.add(getEtiqueta(ETIQUETAS.APLICACION, getAplicacion().toString()));
		lEtiquetas.add(getEtiqueta(ETIQUETAS.NIF, nif));
		lEtiquetas.add(getEtiqueta(ETIQUETAS.EMPRESA, empresa));
		//if (getPeriodoInicial() != null) lEtiquetas.add(getEtiqueta(ETIQUETAS.PERIODO, getPeriodo2D(getPeriodoInicial())));
		//if (getPeriodoFinal() != null) lEtiquetas.add(getEtiqueta(ETIQUETAS.PERIODOFINAL, getPeriodo2D(getPeriodoFinal())));

		return lEtiquetas;
	}
	
	@Override
	public List<IEtiquetaGD> getEtiquetas() {
		return lEtiquetas;
	}

	@Override
	public int getEmpresa() {
		// TODO Auto-generated method stub
		return empresa;
	}

	@Override
	public String getNif() {
		// TODO Auto-generated method stub
		return nif;
	}

	@Override
	public DBConnection getConexionApl() {
		// TODO Auto-generated method stub
		return conn;
	}

	@Override
	public APLETI getAplicacion() {
		// TODO Auto-generated method stub
		switch(Aplication.getAplication().getName()) {
		  case "laboral":return APLETI.JNOMINA;
		  case "jconta":return APLETI.JCONTA;
		  default: return APLETI.JCONTA;
		}
	}

	@Override
	public boolean esExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TIPOPERIODO getPeriodoInicial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TIPOPERIODO getPeriodoFinal() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getMailToSend() {
		if(mailToSend == null) {
			return "";
		}
		return mailToSend;
	}



	public void setMailToSend(String mailToSend) {
		this.mailToSend = mailToSend;
	}



	public String getSubtitulo() {
		return subtitulo;
	}



	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}



	public String getDominioAfinity() {
		return dominioAfinity;
	}



	public void setDominioAfinity(String dominioAfinity) {
		this.dominioAfinity = dominioAfinity;
	}



	public int getPeriodo() {
		return periodo;
	}



	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}



	public boolean isFileSend() {
		return fileSend;
	}



	public void setFileSend(boolean fileSend) {
		this.fileSend = fileSend;
	}


	@Override
	public String getDescripciónFichero() {
		return descripcionFichero;
	}



	public void setDescripcionFichero(String descripcionFichero) {
		this.descripcionFichero = descripcionFichero;
	}



	public String getDescripcionFichero() {
		return descripcionFichero;
	}

}
