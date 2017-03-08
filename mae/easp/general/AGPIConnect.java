package mae.easp.general;

import mae.general.*;
import geyce.maefc.*;
import mae.admon.general.*;
import mae.easp.general.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.util.zip.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class AGPIConnect {
	private final String HTTP_SERVLET="http://afinity.geyce.es/servlets/com.geyce.AGPIUpload";
	private final String PACKAGE_AGPI2DP="http://afinity.geyce.es/pls/agpi/agpi2dp.";
	private final String URL_AGPI     ="http://afinity.geyce.es/agpi/home/";
	private final double TEST_FILE_SIZE =100;
	public final int NO_ERROR        = 0;
	public final int ERR_BORRAR_AGPI = 1;
	public final int ERR_PARAMS_NULL = 2;
	public final int ERR_PARAMS_VOID = 3;
	public final int ERR_SERVLET     = 4;
	public final int ERR_DESCONOCIDO = 5;
	private int iError;
	private String sError;
	private double dTimeDownload;
	private double dVelDownload;
	private double dTimeUpload;
	private double dVelUpload;
	public  double dTimeEst;
	public  double dVelEst;
	private boolean bTest;
	private String sCDPTest;
	private String sUserDirTest;
	private Program prog;
	private long lTamanyoADescargar;

	
	public AGPIConnect () {
		setError (NO_ERROR);
		dTimeDownload = 0;
		dTimeUpload = 0;		
		dVelDownload = 0;
		dVelUpload = 0;				
		dVelEst = 0;
		dTimeEst = 0;			
		lTamanyoADescargar = 0;
		prog = null;	
	}
	private void setError (int iE) {
		setError (iE,null);
	}
	private void setError (int iE, String sD) {
		switch (iE) {
			case NO_ERROR:
				sError = "";
				break;
			case ERR_BORRAR_AGPI:
				sError ="Error al borrar fichero remoto en el servidor AFINITY.";
				break;
			case ERR_PARAMS_NULL:
				sError ="Parametros de entrada nulos.";
				break;
			case ERR_PARAMS_VOID:
				sError ="Parametros de entrada vacios.";
				break;
			case ERR_SERVLET:
				if (sD != null) sError = sD;
				else sError ="Error desconocido en el servlet.";
				break;				
			case ERR_DESCONOCIDO:
				if (sD != null) sError = sD;
				else sError ="Error desconocido.";
				break;				
		}
	}
	private void addError (String sErr) {sError=sErr+"\n"+sError;}
	public int getError() {return iError;}
	public boolean isError() {return iError!=NO_ERROR;}
	public String getDescError() {return sError;}
	public long getTamanyoADescargar() {return lTamanyoADescargar;}
	
	
	
	// Busca si el Fitxer Desti existeix en el Servidor de la AGPI (de la carpeta home/<codiCDP>)
	public boolean findRemoteFile (String sCDP, String sArchivo) {
		boolean bOk = false;
		setError (NO_ERROR);		
		if (sCDP == null || sArchivo == null) {
			bOk = false;
			setError(ERR_PARAMS_NULL);
			return bOk;
		}
		if (sCDP.trim().length() == 0 || sArchivo.trim().length() == 0) {
			bOk = false;
			setError(ERR_PARAMS_VOID);
			return bOk;
		}				
		bOk = URLExec.procesarURL(PACKAGE_AGPI2DP+"existeFichero?codi="+sCDP+"&nom="+sArchivo);				
		return bOk;
	}
	
	// Borra el Fitxer Desti del Servidor de la AGPI (de la carpeta home/<codiCDP>)
	public boolean deleteRemoteFile (String sCDP, String sArchivo) {		
		boolean bOk = false;
		setError (NO_ERROR);
		if (sCDP == null || sArchivo == null) {
			bOk = false;
			setError(ERR_PARAMS_NULL);
			return bOk;
		}
		if (sCDP.trim().length() == 0 || sArchivo.trim().length() == 0) {
			bOk = false;
			setError(ERR_PARAMS_VOID);
			return bOk;
		}						
		bOk = URLExec.procesarURL(PACKAGE_AGPI2DP+"borrarZIPConta?dp_cdp="+sCDP+"&archivo="+sArchivo);
		if (!bOk) iError=ERR_BORRAR_AGPI;
		return bOk;
	}
	
	
	// DE CLIENT CAP A AFINITY	
	public boolean uploadFile (ProgressBarForm pbf , String sCDP, String sDestino, String sPathOrigen) {
			return uploadFile (pbf,sCDP,null,sDestino,sPathOrigen);
	}
	public boolean uploadFile (ProgressBarForm pbf , String sCDP, String sCarpeta, String sDestino, String sPathOrigen) {
		setError(NO_ERROR);
		boolean bOk = false;
		try {
			if (sCDP == null || sDestino == null || sPathOrigen == null) {
				bOk = false;
				setError(ERR_PARAMS_NULL);
				return bOk;
			}
			if (sCDP.trim().length() == 0 || sDestino.trim().length() == 0 || sPathOrigen.trim().length() == 0) {
				bOk = false;
				setError(ERR_PARAMS_VOID);
				return bOk;
			}				
			URL url = new URL(HTTP_SERVLET);
			String boundary = MultiPartFormOutputStream.createBoundary();
			URLConnection urlConn = MultiPartFormOutputStream.createConnection(url);
			urlConn.setRequestProperty("Accept", "*/*");
			urlConn.setRequestProperty("Content-Type", MultiPartFormOutputStream.getContentType(boundary));
			urlConn.setRequestProperty("Connection", "Keep-Alive");
			urlConn.setRequestProperty("Cache-Control", "no-cache");
			MultiPartFormOutputStream out = new MultiPartFormOutputStream(urlConn.getOutputStream(), boundary);
			out.writeField("nombre", sDestino);
			out.writeField("destino", sCDP);
			if (sCarpeta!=null && sCarpeta.trim().length()>0) out.writeField("carpeta", sCarpeta); 		
			File f=new File(sPathOrigen);
			//bar.setMaximum((int)f.length());
			//System.out.println ("dTimeEst["+dTimeEst+"]["+dVelEst+"]");
		  if (pbf != null) {
		  	// Hauriem de fer una estimacio del temps. (Sempre i kuan hagin executat el test conection)		  	
		  	if (dTimeEst != 0 && dVelEst !=0) {
		  		pbf.setState("Subiendo fichero. Tiempo Estimado "+(int)dTimeEst+" segundos.");
		  		//pbf.setSecondaryAutoMilli ((int)(dTimeEst*1000));
		  	}		  	
		  }
			out.writeFile("myFile", "text/plain", f);
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			String line = "";
		  String sRespServ="";
		  int i=0;		
			while ((line = in.readLine()) != null) {
				if (sRespServ.length()>0) sRespServ+="\n";		  	
				sRespServ+=line;
			  System.out.println(++i+"."+line);  				
			}			
		 	if (sRespServ.length()==0) setError (ERR_SERVLET,"Sin respuesta del Servlet");
		 	else {
		 		if (sRespServ.length()>=2 && sRespServ.substring(0,2).toUpperCase().equals("OK")) bOk = true;
		 		else {
		 			bOk = false;
		 			setError (ERR_SERVLET,sRespServ);
		 		}
		 	}
			in.close();
		}
		catch (Exception e) {
			setError (ERR_DESCONOCIDO,"ERROR "+e);
		}
		return bOk;
	}

	// Desde AFINITY A CLIENT
  public boolean downloadFile(ProgressBarForm pbf , String sCDP, String sOrigen, String sPathDest) {
  	boolean bOk;
  	setError (NO_ERROR);
  	if (sCDP == null || sPathDest == null || sOrigen == null) {
  		bOk = false;
		setError(ERR_PARAMS_NULL);
		return bOk;
  	}
  	if (sCDP.trim().length() == 0 || sPathDest.trim().length() == 0 || sOrigen.trim().length() == 0) {
  		bOk = false;
  		setError(ERR_PARAMS_VOID);
  		return bOk;
  	}						  	
    try{
    	bOk = false;
    	String sURL = URL_AGPI+sCDP+"/"+sOrigen;
    	URL url = new URL(sURL);
    	URLConnection urlConn = url.openConnection();
    	FileOutputStream someReader  =new FileOutputStream(sPathDest);
    	int iContpbf=0;
    	int iReaded=0;
    	if (pbf!=null) {
    		pbf.setSecondaryAuto(false);
    		pbf.setSecondaryPercent(0);
    		pbf.setState("Descargando Fichero "+sPathDest);
    	}
    	byte[] buffer=new byte[1024];
    	InputStream in=urlConn.getInputStream();      
    	lTamanyoADescargar = urlConn.getContentLength();
		int iNumBuffer = 0;
		if (lTamanyoADescargar>0) iNumBuffer = (int)(lTamanyoADescargar/1024);
		if (pbf!=null && iNumBuffer>0) pbf.setState("Descargando Fichero ["+iNumBuffer+"K] "+sPathDest);
		do {
			int llegits=in.read(buffer);			
			if (llegits<=0) break;			
			someReader.write(buffer,0,llegits);
			iContpbf++;
			int result = 0;
			if (iNumBuffer>0) result=(int)(100*(iContpbf)/(iNumBuffer));
			if (pbf!=null) pbf.setSecondaryPercent(result);				
		} 
		while(true);           
		in.close();
		someReader.close();
		bOk = true;
    	}
    	catch (Exception e){
    		System.out.println("Error downloadFile "+e);
    		sError = "Error al descargar fichero.\n"+e;
    		bOk = false;
    	}
    	return bOk;
  	}
		
// FI CLASSE		
}