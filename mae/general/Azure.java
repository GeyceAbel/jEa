package mae.general;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;

public class Azure {
	public enum TIPO_HOST { ORACLE, LOCALHOST, AZURE} ;
	public static TIPO_HOST HOST = TIPO_HOST.ORACLE;
	
	private final String PROTOCOL = "http://";
	private final String HOST_AZURE 	 = "afinity.azurewebsites.net/";
	private final String HOST_LOCALHOST  = "localhost:52373/";
	private final String HOST_ORACLE 	 = "afinity.geyce.es/";

	private final String SITE 	 = "pls/agpi/";
	private final int TIMEOUT = 5; //Seconds

	private String function;
	private String urlAzure;
	private String contenido;
	private String error;

	public Azure (String function) {
		this(function,null);
	}

	public Azure(String function, String params) {
		this.urlAzure = PROTOCOL + getRealHost() + SITE + function;
		if (HOST == TIPO_HOST.LOCALHOST || HOST == TIPO_HOST.AZURE) this.urlAzure+=".cshtml";
		this.function = function;
		if (params != null && params.trim().length()>0) this.urlAzure += "?"+params;
	}

	public boolean procesar () {
		boolean bOk = true;
		try {
			System.out.println (urlAzure);
			contenido = null;
			error = null;
			HttpClient client = new HttpClient();
			client.getParams().setParameter("http.socket.timeout", TIMEOUT * 1000);
			client.getParams().setParameter("http.connection.timeout", TIMEOUT * 1000);
			client.getParams().setParameter("http.connection-manager.timeout", new Long(TIMEOUT * 1000));
			client.getParams().setParameter("http.protocol.head-body-timeout", TIMEOUT * 1000);
			PostMethod method = new PostMethod( urlAzure );
			int statusCode = client.executeMethod( method );
			if( statusCode == HttpStatus.SC_OK ) contenido = method.getResponseBodyAsString();
			else {
				contenido = null;
				error = "Error al procesar ("+function+"): "+method.getStatusText();
			}			
			bOk = contenido != null;
			if (bOk) contenido = contenido.trim();
		}
		catch( Exception e ) {
			bOk = false;
			error = "Error incontrolado al procesar ("+function+"): "+e.getMessage();
			e.printStackTrace();
		}
		return bOk;
	}	
	
	private String getRealHost() {
		String host = HOST_ORACLE;
		if (HOST == TIPO_HOST.AZURE) host = HOST_AZURE;
		else if (HOST == TIPO_HOST.LOCALHOST) host = HOST_LOCALHOST;
		return host;
	}
	
	public String getContenido() {
		return contenido;
	}

	public String getError() {
		return error;
	}
}
