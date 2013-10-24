package mae.easp.general;

import geyce.maefc.*;
import mae.general.*;

import java.io.File;

public class Mir {
	private int empresa;
	private String nif;
	private String desc;
	private String tipoDoc;
	private String fichero;
	private String fichero_afinity;
	private String aplic;
	private String errorEnvio;

	private Select smir ;
	private Table  tbmir ;
	private Field fdmircodi       ; // mircodi      INTEGER NOT NULL DEFAULT AUTOINCREMENT ,
	private Field fdmircdp        ; // mircdp       VARCHAR(12),
	private Field fdmircif        ; // mircif       CHAR(15),
	private Field fdmiractivado   ; // miractivado  CHAR(1),
	private Field fdmirestado     ; // mirestado    CHAR(1),
	private Field fdmirfechacrea  ; // mirfechacrea  DATE,
	private Field fdmirfechaenvio ; // mirfechaenvio DATE,
	private Field fdmirdesc       ; // mirdesc      VARCHAR(100),
	private Field fdmiraplic      ; // miraplic     VARCHAR(15),
	private Field fdmirtipdoc     ; // mirtipdoc    VARCHAR(6),
	private Field fdmirtipfile    ; // mirtipfile   VARCHAR(3),
	private Field fdmirmcodemp    ; // mirmcodemp      INTEGER,
	private Field fdmirubicacion  ; // mirubicacion VARCHAR(200),

	public Mir(int empresa, String nif, String desc, String tipoDoc, String fichero, String aplic) {
		this.empresa = empresa;
		this.nif = nif;
		if (desc!=null && desc.length()>30) this.desc = desc.substring(0,30);
		else this.desc = desc;
		if (tipoDoc!=null && tipoDoc.length()>15) this.tipoDoc = tipoDoc.substring(0,15);
		else this.tipoDoc = tipoDoc;	  
		this.fichero = fichero;
		if (aplic==null) this.aplic = "JEA";
		else this.aplic = aplic;
		this.errorEnvio = null;
	}

	public String getErrorEnvio () {
		return errorEnvio;
	}

	public int registraMir(boolean enviado ) {
		int codi = 0;
		String codigoCDP = getCDPMIR();
		if ( codigoCDP == null ) return codi ;
		if ( smir == null ) cargaSelectMir();
		smir.addNew();
		fdmirmcodemp         .setValue(empresa);  // mirmcodemp      INTEGER,
		fdmircif         .setValue(nif);  // mirmcodemp      INTEGER,
		fdmircdp.setValue(Easp.dominio.substring(0,6)+Numero.format(empresa,"000000"));  // mircdp       VARCHAR(12),
		if ( !enviado ) {
			fdmiractivado.setValue("S");  // miractivado  CHAR(1),
			fdmirestado.setValue("P");  // mirestado    CHAR(1),
		}
		else {
			fdmiractivado.setNull();  // miractivado  CHAR(1),
			fdmirestado.setValue("E");  // mirestado    CHAR(1),
			fdmirfechaenvio.setValue(Maefc.getDate() );
		}
		fdmirfechacrea.setValue(Maefc.getDate() );  // mirfechacrea  DATE,    
		fdmirdesc.setValue(desc);  // mirdesc      VARCHAR(100),
		fdmiraplic.setValue(aplic);  // miraplic     VARCHAR(15),
		fdmirtipdoc.setValue(tipoDoc);  // mirtipdoc    VARCHAR(6),
		fdmirubicacion.setValue(fichero);  // mirubicacion VARCHAR(200),
		if (fichero!=null && fichero.length()>3) fdmirtipfile.setValue(fichero.substring(fichero.length()-3,fichero.length()));  // mirtipfile   VARCHAR(3),
		if ( smir.insert() ) {
			codi = fdmircodi.getInteger();
			smir.commit();
		}
		else {
			errorEnvio = "No se ha podido grabar el envio eMir a la tabla local de gestion e-MIR.";
			smir.rollback();
		}
		return codi;
	}

	private void cargaSelectMir() {
		smir               = new Select(Easp.connEA);
		tbmir              = new Table ( smir, "MIR"  ) ;
		fdmircodi          = new Field(smir,tbmir,"MIRCODI") ;
		fdmircdp           = new Field(smir,tbmir,"MIRCDP") ;
		fdmircif           = new Field(smir,tbmir,"MIRCIF") ;
		fdmiractivado      = new Field(smir,tbmir,"MIRACTIVADO") ;
		fdmirestado        = new Field(smir,tbmir,"MIRESTADO") ;
		fdmirfechacrea     = new Field(smir,tbmir,"MIRFECHACREA") ;
		fdmirfechaenvio    = new Field(smir,tbmir,"MIRFECHAENVIO") ;
		fdmirdesc          = new Field(smir,tbmir,"MIRDESC") ;
		fdmiraplic         = new Field(smir,tbmir,"MIRAPLIC") ;
		fdmirtipdoc        = new Field(smir,tbmir,"MIRTIPDOC") ;
		fdmirtipfile       = new Field(smir,tbmir,"MIRTIPFILE") ;
		fdmirmcodemp       = new Field(smir,tbmir,"MIRMCODEMP") ;
		fdmirubicacion     = new Field(smir,tbmir,"MIRUBICACION") ;
	}

	public boolean send()  {
		String fechaCrea = Util.formateoNumero("00",Maefc.getDay(Maefc.getDate()))+"/"+Util.formateoNumero("00",1+Maefc.getMonth(Maefc.getDate()))+"/"+Util.formateoNumero("0000",Maefc.getYear(Maefc.getDate()));
		return send ("*",fechaCrea);
	}

	public boolean sendandpub ()  {
		boolean bOk = true;
		String fechaCrea = Util.formateoNumero("00",Maefc.getDay(Maefc.getDate()))+"/"+Util.formateoNumero("00",1+Maefc.getMonth(Maefc.getDate()))+"/"+Util.formateoNumero("0000",Maefc.getYear(Maefc.getDate()));
		if (bOk) bOk = send ("*",fechaCrea);
		if (bOk) bOk = (registraMir(true) != 0);
		return bOk;
	}

	public boolean send (String fechaCrea)  {
		return send ("*",fechaCrea);
	}

	private String getPrefixe () {
		return Easp.getPrefixeNow();
	}
	
	private boolean send( String usuario, String fechaCrea)  {
		boolean bOk = true ;    
		errorEnvio = null;
		File f = new File(fichero);
		//this.fichero_afinity = codCDPAfinity+"_"+f.getName();
		//fichero_afinity = java.util.UUID.randomUUID().toString()+"_"+f.getName();
		fichero_afinity = getPrefixe()+"_"+f.getName();		
		if (fichero_afinity.length()>80) {
			errorEnvio = "Nombre del fichero demasiado largo.";
			bOk = false;
		}
		else {
			try {		  
				String codCDPAfinity = getCDPMIR();
				if (codCDPAfinity!=null && codCDPAfinity.length()>0) {
					String rutaLocal = System.getProperty("user.dir")+"\\EnviosEMIR\\"+codCDPAfinity;
					String ficheroLocal = rutaLocal+"\\"+fichero_afinity;
					Easp.creaDirect(rutaLocal);
					Easp.copyFile (fichero,ficheroLocal);
					this.fichero = ficheroLocal;
					if (bOk) bOk = enviaFitMIRHTTP(codCDPAfinity);
					if (bOk) bOk = creaRegWebMIR(codCDPAfinity,fichero_afinity,aplic,tipoDoc,tipoDoc,desc,usuario, fechaCrea);
				}
				else {
					String sCodiCDP = Easp.dominio.substring(0,6)+Util.formateoNumero("000000",empresa);
					errorEnvio = "No esta dado de alta en Afinity el cliente "+sCodiCDP+".";
					bOk = false;
				}
			}
			catch (Exception e) {
				bOk = false;
				errorEnvio = e.getMessage();
				e.printStackTrace();
			}
		}
		return bOk;
	}

	public String getFicheroEnviado () {
		return fichero;
	}
	
	private boolean creaRegWebMIR(String codCDPAfinity, String fitDesti, String prod, String ambito, String titulo, String desc, String usuario, String fechaCrea) {
		boolean bOk=false;
		if (fitDesti.length()>80) fitDesti = fitDesti.substring(0,80);
		if (titulo.length()>30) titulo = titulo.substring(0,30);	  
		String fechahoy=Util.formateoNumero("00",Maefc.getDay(Maefc.getDate()))+"-"+
				Util.formateoNumero("00",1+Maefc.getMonth(Maefc.getDate()))+"-"+
				Util.formateoNumero("0000",Maefc.getYear(Maefc.getDate()));
		String dns="http://afinity.geyce.es/pls/agpi/agpi2dp.";
		//String dns= URL_AFINITY+HOME_SERVER_NODO+"agpi2dp.";
		String url=dns+"AgpiAltaPDF?"+
				"ppupdp="+Easp.dominio+
				"&ppupiden="+fitDesti+
				"&ppupclientedp="+codCDPAfinity+
				"&ppupproducto="+prod+
				"&ppupambito="+ambito+
				"&ppuptitulo="+parserURL(titulo)+
				"&ppupdesc="+parserURL(desc)+
				"&ppupfechacre="+fechaCrea+
				"&ppupfechapub="+fechahoy+
				"&ppupejer="+Maefc.getYear(Maefc.getDate())+
				"&ppupperiodo=0"+
				"&ppupusuario="+usuario+
				"&desdeToken=N";
		bOk = URLExec.procesarURL(url);
		if (!bOk) {
			String sCodiCDP = Easp.dominio.substring(0,6)+Util.formateoNumero("000000",empresa);
			errorEnvio = sCodiCDP+" error al crear el registro WEB del envio.";
		}
		return bOk;
	}

	private String parserURL(String origen){
		StringBuffer sb=new StringBuffer();
		for (int i=0;i< origen.length();i++){
			if (origen.charAt(i)==' ') sb.append("%20");
			else if (origen.charAt(i)=='=') sb.append("%3D");
			else if (origen.charAt(i)=='?') sb.append("%3F");
			else if (origen.charAt(i)=='&') sb.append("%26");
			else if (origen.charAt(i)=='+') sb.append("%2B");
			else sb.append(origen.charAt(i));
		}
		return sb.toString();
	}

	public boolean tieneMir() {
		boolean bOk = true;
		if (getCDPMIR() == null) {
			bOk = false;
			String sCodiCDP = Easp.dominio.substring(0,6)+Util.formateoNumero("000000",empresa);
			errorEnvio = "No esta dado de alta en Afinity el cliente "+sCodiCDP+".";		  
		}
		return bOk;
	}


	private String getCDPMIR() {
		String codigoCDP = null ;
		String sNif=null;
		String sCodiCDP = Easp.dominio.substring(0,6)+Util.formateoNumero("000000",empresa);

		System.out.println("sCodiCDP: ["+sCodiCDP+"]");

		sNif = getNif (sCodiCDP,Easp.connEA);
		if (sNif != null) {
			String sDns="http://afinity.geyce.es/pls/agpi/agpi2dp.";
			String sUrl = sDns+"getCDPfromNif?codiDP="+sCodiCDP.substring(0,6)+"000000&nifcif="+sNif;
			String sCodiCDPOK = URLExec.getContenido(sUrl);
			if ( sCodiCDPOK!= null && sCodiCDPOK.trim().length() == 12 ) {
				codigoCDP=sCodiCDPOK;
				return codigoCDP ;
			}
			else { //ERROR AL BUSCAR NIF A AGPI
				System.out.println("ERROR AL BUSCAR NIF En AGPI: Empresa ["+empresa+"] Nif: ["+sNif+"]");
				return null ;
			}
		}
		else { //ERROR NIF NO TROBAT A LA TAULA EA.CDP
			System.out.println("ERROR NIF NO ENCONTRADO EN LA TABLA EA.CDP Empresa ["+empresa+"] Nif: ["+sNif+"]");
			return null ;
		}
	}

	private boolean enviaFitMIRHTTP(String codCDPAfinity) {
		boolean bOk = true;
		try {
			File f = new File(fichero);  
			if (f.exists()) {
				AGPIConnect agpicon = new AGPIConnect();
				if (agpicon.findRemoteFile(codCDPAfinity+"/PDF", fichero_afinity)) {
					agpicon.deleteRemoteFile(codCDPAfinity+"/PDF", fichero_afinity);
				}
				bOk = agpicon.uploadFile (null , codCDPAfinity,"PDF", fichero_afinity, fichero);
				if (!bOk) {
					String sCodiCDP = Easp.dominio.substring(0,6)+Util.formateoNumero("000000",empresa);
					errorEnvio = sCodiCDP+" error al enviar el fichero.";
				}
			}
			else {
				bOk = false;
				errorEnvio = "No se ha encontrado el fichero local a enviar.\n\nFichero: ["+f.getAbsolutePath()+"]";
			}
		}
		catch (Exception exc) {
			String sCodiCDP = Easp.dominio.substring(0,6)+Util.formateoNumero("000000",empresa);
			errorEnvio = sCodiCDP+" error desconocido al enviar el fichero.\n"+exc;
			exc.printStackTrace();
			return false;
		}
		return bOk;
	}


	/*
	 * OBTE EL NIF a partir del CDP i del camp cdpcdprel (Relacionado con)
	 */
	private static String getNif (String sCodiCDP, DBConnection connEA) {
		String sNif = null;
		String sCDPtmp;
		Selector selCDP = new Selector (connEA);
		String sSql = "select cdpnifcif,cdpcdprel from cdp where cdpcodi='" + sCodiCDP + "'";
		selCDP.execute(sSql);
		if (selCDP.next()) {
			sCDPtmp = selCDP.getString("cdpcdprel");
			if (sCDPtmp == null) sNif = selCDP.getString("cdpnifcif");
			else {
				selCDP.close();
				sSql = "select cdpnifcif,cdpcdprel from cdp where cdpcodi='" + sCDPtmp + "'";
				selCDP.execute(sSql);
				if (selCDP.next()) sNif = selCDP.getString("cdpnifcif");
			}
		}
		selCDP.close();
		return sNif;
	}


}
