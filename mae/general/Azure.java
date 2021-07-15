package mae.general;

import geyce.maefc.Aplication;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.json.JsonObject;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import mae.easp.general.Easp;
import mae.easp.general.Easp.TIPO_HOST;

public class Azure {	
	private static final String PROTOCOL = "https://";
	private final String SITE 	 = "pls/agpi/";
	private int TIMEOUT = 30; //Seconds
	private final long MB_MAXIMOS = 50; //Tamany màxim de fitxer.
	private int numeroReintentos;
	private String contenido;
	private byte [] contenidoBinario;
	private String error;
	private File fichero;
	private int statusCode;
	private String encoding;
	private List<NameValuePair> lparametros;
	private String funcion;
	private JsonObject json;
	
	public Azure (String function) {
		this(function,null);
	}

	public Azure (String function, List<NameValuePair> lparams) {
		this(function,lparams, null, null);
	}

	public Azure (String funcion, List<NameValuePair> lparams, File f) {
		this (funcion, lparams, f, null);
	}

	public Azure (String funcion, List<NameValuePair> lparams, JsonObject json) {
		this (funcion, lparams, null, json);
	}

	public Azure (String funcion, List<NameValuePair> lparams, File f, JsonObject json) {
		this.funcion = funcion;
		this.fichero = f;
		this.lparametros = lparams;
		this.json = json;
		numeroReintentos = 1;
	}

	public void addParametroURL (String nombre, String valor) {
		addParametroURL(new AzureParameter(nombre,valor));
	}
	
	public void addParametroURL (String nombre, int valor) {
		addParametroURL(new AzureParameter(nombre,String.valueOf(valor)));
	}	
	
	public void addParametroURL (String nombre, double valor) {
		addParametroURL(new AzureParameter(nombre,String.valueOf(valor)));
	}
	
	public void addParametroURL (NameValuePair nvp) {
		if (lparametros == null) lparametros = new ArrayList<NameValuePair> ();
		lparametros.add(nvp);		
	}

	private String getUrlAzure () {
		String dominiotmp = Easp.dominio;
		if (dominiotmp == null) dominiotmp = Aplication.getAplication().getParameter("Dominio");
		String urlaz = PROTOCOL + getRealHost() + SITE + funcion +".cshtml?dominiojToken="+dominiotmp;
		if (lparametros != null && lparametros.size()>0) urlaz +="&"+URLEncodedUtils.format(lparametros, "utf-8");
		System.out.println("URLAZURE ["+urlaz+"]");
		return urlaz;
	}

	private void initProcesar () {
		statusCode = HttpStatus.SC_NOT_FOUND;
		contenido = null;
		contenidoBinario = null;
	}

	public boolean procesar () {
		boolean bOk = true;
		CloseableHttpClient client =  createHttpClient (numeroReintentos);
		HttpPost post = null;
		try {
			initProcesar();
			post = new HttpPost(getUrlAzure ());
			if ((fichero != null && fichero.exists()) || json != null) {
				if (fichero != null && fichero.length() > MB_MAXIMOS * 1024 * 1024) {
					bOk = false;
					error = "Fichero demasiado grande: "+(Numero.redondeo((double)fichero.length()/(double)1024))+" KBytes";
				}
				else {
					MultipartEntityBuilder mpart = MultipartEntityBuilder.create();
					if (fichero != null) {
						FileBody fileBody = new FileBody(fichero, ContentType.DEFAULT_BINARY);
						mpart.addPart(fichero.getName(), fileBody);
					}
					if (json != null) mpart.addTextBody("characterProfile", json.toString(), ContentType.APPLICATION_JSON);
					post.setEntity(mpart.build());
				}
			}
			if (bOk) bOk = executeConnection(client,post);
		}
		catch( Exception e ) {
			bOk = false;
			error = "Error incontrolado al procesar ("+funcion+"): \n"+e.getMessage();
			e.printStackTrace();
		}
		finally {
			if (post != null) post.releaseConnection();
			if (client != null) try {client.close();} catch (IOException e) {}
		}
		return bOk;
	}

	public CloseableHttpClient createHttpClient () {
		return createHttpClient (0);
	}
	
	public CloseableHttpClient createHttpClient (final int numreintentos) {
		String b64Encoded = "";
		try {
			b64Encoded = Base64.encodeBytes(new String(getUsuario()+":"+getPassword()).getBytes("utf-8"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		CloseableHttpClient client =  HttpClientBuilder.create()
				.setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(TIMEOUT * 1000).build())
				.setRetryHandler(new DefaultHttpRequestRetryHandler(numreintentos, false))
				.setDefaultHeaders(Arrays.asList(new BasicHeader("Authentication", "Basic " + b64Encoded)))
				.build();
				
		return client;
	}

	public boolean procesarFile (File f) {
		return procesarFile(f, null);
	}

	public boolean procesarFile (File f, ProgressBarForm pbf) {
		boolean bOk = true;
		CloseableHttpClient client =  createHttpClient (numeroReintentos);
		HttpPost post = null;
		FileOutputStream fos = null;
		try {
			initProcesar ();
			post = new HttpPost(getUrlAzure());
			if (executeConnection (client,post)) {
				fos = new FileOutputStream(f.getAbsolutePath());
				fos.write (contenidoBinario);
			}
			else bOk = false;
		}
		catch (Exception e) {
			bOk = false;
			if (error == null) error = "Error Incontrolado al recibir fichero";
			error += "\n"+e.getMessage();
			e.printStackTrace();
		}
		finally {
			if (fos != null) try {fos.close();} catch (IOException e) {}
			if (post != null) post.releaseConnection();
			if (client != null) try {client.close();} catch (IOException e) {}
		}
		return bOk;
	}
	
	public static byte[] parseHttpResponse(HttpResponse response) throws UnsupportedOperationException, IOException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		int nRead;
		byte[] data = new byte[1024];
		while ((nRead = response.getEntity().getContent().read(data, 0, data.length)) != -1) {
			buffer.write(data, 0, nRead);
		}
		buffer.flush();
		byte [] b = buffer.toByteArray();
		buffer.close();
		return b;
	}

	private boolean executeConnection ( CloseableHttpClient client, HttpPost post) throws HttpException, IOException {
		boolean bOk = true;
		HttpResponse response = client.execute( post );
		statusCode = response.getStatusLine().getStatusCode();
		if( statusCode == HttpStatus.SC_OK ) {
			contenidoBinario = parseHttpResponse (response);
			contenido = new String (contenidoBinario);
			if (getEncoding() != null) {
				try {
					contenido = new String (contenidoBinario,Charset.forName(getEncoding()));
				}
				catch (Exception e) {}
			}
		}
		else {
			contenido = null;
			error = "Error al procesar ("+funcion+"): \n("+statusCode+") "+response.getStatusLine().getReasonPhrase();
		}			
		bOk = contenido != null;			
		return bOk;
	}

	public static String getRealHost() {
		String host = Easp.HOST_AZURE;
		if (Easp.HOST == TIPO_HOST.AZUREPRE) host = Easp.HOST_AZUREPRE;
		else if (Easp.HOST == TIPO_HOST.AZUREDEV) host = Easp.HOST_AZUREDEV;
		else if (Easp.HOST == TIPO_HOST.LOCALHOST) host = Easp.HOST_LOCALHOST;	
		return host;
	}

	public String getContenido() {
		if (contenido != null) contenido = contenido.trim();
		return contenido;
	}

	public byte[] getContenidoBinario() {
		return contenidoBinario;
	}
	
	public long getTamanyoBinario () {
		return contenidoBinario != null ? contenidoBinario.length : 0;
	}

	public String getError() {
		return (error!=null?error:"");
	}

	public int getStatusCode() {
		return statusCode;
	}

	public int getNumeroReintentos () {
		return numeroReintentos;
	}

	public void setNumeroReintentos (int _numeroReintentos) {
		numeroReintentos = _numeroReintentos;
	}
	
	public static String getUsuario() {
		return Aplication.getAplication().getParameter("User");
	}

	public static String getPassword() {
		return Aplication.getAplication().getConfig("MD5");
	}
	
	public static String getProtocol() {
		return PROTOCOL;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String enconding) {
		this.encoding = enconding;
	}
	
	
	public int getTIMEOUT() {
		return TIMEOUT;
	}

	public void setTIMEOUT(int tIMEOUT) {
		TIMEOUT = tIMEOUT;
	}

}
