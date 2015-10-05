package mae.general;

import java.io.File;
import java.io.IOException;

import mae.easp.general.Easp;
import mae.easp.general.Easp.TIPO_HOST;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;


public class Azure {

	private final String PROTOCOL = "http://";
	private final String SITE 	 = "pls/agpi/";
	private final int TIMEOUT = 30; //Seconds
	private final long MB_MAXIMOS = 15; //Tamany màxim de fitxer.

	private String urlAzure;
	private String contenido;
	private String error;
	private File fichero;
	
	public Azure (String function) {
		this(function,null, null);
	}

	public Azure (String function, String parametros) {
		this(function,parametros, null);
	}

	public Azure (String function, String parametros, File f) {		
		this.urlAzure = PROTOCOL + getRealHost() + SITE + function;
		this.fichero = f;
		if (Easp.HOST == TIPO_HOST.LOCALHOST || Easp.HOST == TIPO_HOST.AZURE) this.urlAzure+=".cshtml";
		if (parametros != null && parametros.trim().length()>0) this.urlAzure += "?"+parametros;
		
	}

	public boolean procesar () {
		boolean bOk = true;
		HttpClient client = null;
		PostMethod post = null;
		try {
			post = new PostMethod(urlAzure);			
			if (fichero != null && fichero.exists()) {
				if (fichero.length() > MB_MAXIMOS * 1024 * 1024) {
					bOk = false;
					error = "Fichero demasiado grande: "+(Numero.redondeo((double)fichero.length()/(double)1024))+" KBytes";					
				}
				else {
					Part [] partsFile = {new FilePart(fichero.getName(), fichero)};
					post.setRequestEntity( new MultipartRequestEntity(partsFile, post.getParams()) );
				}
			}
			if (bOk) {
				client = new HttpClient();
				setParamsConection(client);
				bOk = executeConnection(client,post);
			}
		}
		catch( Exception e ) {
			bOk = false;
			error = "Error incontrolado al procesar ("+urlAzure+"): \n"+e.getMessage();
			e.printStackTrace();
		}
		finally {
		      if (post != null) post.releaseConnection();
		  }
		return bOk;
	}

	private void setParamsConection (HttpClient client) {
		client.getParams().setParameter("http.connection.timeout", TIMEOUT * 1000); // temps per fer la conexio
		//client.getParams().setParameter("http.socket.timeout", TIMEOUT * 1000);  // Temps de resposta del request
	}

	private boolean executeConnection ( HttpClient client, PostMethod post) throws HttpException, IOException {
		boolean bOk = true;
		int statusCode = client.executeMethod( post );
		if( statusCode == HttpStatus.SC_OK ) contenido = post.getResponseBodyAsString();
		else {
			contenido = null;
			error = "Error al procesar ("+urlAzure+"): \n"+post.getStatusText();
		}			
		bOk = contenido != null;			
		return bOk;
	}

	private String getRealHost() {
		String host = Easp.HOST_ORACLE;
		if (Easp.HOST == TIPO_HOST.AZURE) host = Easp.HOST_AZURE;
		else if (Easp.HOST == TIPO_HOST.LOCALHOST) host = Easp.HOST_LOCALHOST;
		return host;
	}

	public String getContenido() {
		if (contenido != null) contenido = contenido.trim();
		return contenido;
	}

	public String getError() {
		return (error!=null?error:"");
	}

}
