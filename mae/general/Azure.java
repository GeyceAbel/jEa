package mae.general;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

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
	private final long MB_MAXIMOS = 15; //Tamany m�xim de fitxer.

	private String urlAzure;
	private String contenido;
	private InputStream contenidoBinario;
	private long tamanyoBinario;
	private String error;
	private File fichero;
	private int statusCode;

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

	private void initProcesar () {
		statusCode = HttpStatus.SC_NOT_FOUND;
		contenido = null;
		contenidoBinario = null;
		tamanyoBinario = 0;
	}
	
	public boolean procesar () {
		boolean bOk = true;
		HttpClient client = null;
		PostMethod post = null;				
		try {
			initProcesar();
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

	public boolean procesarFile (File f) {
		return procesarFile(f, null);
	}
	
	public boolean procesarFile (File f, ProgressBarForm pbf) {		
		boolean bOk = true;
		HttpClient client = null;
		PostMethod post = null;
		FileOutputStream fos = null;
		try {
			initProcesar ();
			post = new PostMethod(urlAzure);			
			client = new HttpClient();
			setParamsConection(client);
			if (executeConnectionBinary(client,post)) {
				fos = new FileOutputStream(f.getAbsolutePath());
				if (pbf!=null) {
					pbf.setSecondaryAuto(false);
					pbf.setSecondaryPercent(0);
					pbf.setState("Descargando Fichero "+f.getName());
				}
				int iContpbf=0;
				byte[] buffer=new byte[1024];
				int kilobytes = (int)(tamanyoBinario/1024);
				if (pbf!=null && kilobytes>0) pbf.setState("Descargando Fichero ["+kilobytes+"K] "+f.getName());
				do {
					int llegits = contenidoBinario.read(buffer);	
					if (llegits<=0) break;	
					if (llegits <1024) {
						int o = 0;
						o++;
					}
					fos.write (buffer,0,llegits);
					if (pbf!=null && kilobytes>0 ) pbf.setSecondaryPercent ((int)(100*(++iContpbf)/(kilobytes)));
				} 
				while(true);   
				System.out.println ("Volum Afinity-Azure ("+tamanyoBinario+")  <--->  Volum Descarregat ("+f.length()+")");
				if (tamanyoBinario != f.length() ) {
					bOk = false;
					error = "No se ha descargado la totalidad del fichero zip.\n\n Vuelva a ejecutar el proceso de recepci�n.";
					f.delete();
				}
			}
		}
		catch (Exception e) {
			bOk = false;
			if (error == null) error = "Error Incontrolado al recibir fichero";
			error += "\n"+e.getMessage();
			e.printStackTrace();
		}
		finally {
			if (contenidoBinario != null) try {contenidoBinario.close();} catch (IOException e) {}
			if (fos != null) try {fos.close();} catch (IOException e) {}
			if (post != null) post.releaseConnection();
		}
		return bOk;
	}

	private void setParamsConection (HttpClient client) {
		client.getParams().setParameter("http.connection.timeout", TIMEOUT * 1000); // temps per fer la conexio
		//client.getParams().setParameter("http.socket.timeout", TIMEOUT * 1000);  // Temps de resposta del request
	}

	private boolean executeConnectionBinary ( HttpClient client, PostMethod post) throws HttpException, IOException {
		boolean bOk = true;
		statusCode = client.executeMethod( post );
		if( statusCode == HttpStatus.SC_OK ) {
			contenidoBinario = post.getResponseBodyAsStream();
			tamanyoBinario = post.getResponseContentLength();
		}
		else {
			contenidoBinario = null;
			error = "Error al procesar ("+urlAzure+"): \n"+post.getStatusText();
		}			
		bOk = contenidoBinario != null;			
		return bOk;
	}
	
	private boolean executeConnection ( HttpClient client, PostMethod post) throws HttpException, IOException {
		boolean bOk = true;
		statusCode = client.executeMethod( post );
		post.getResponseContentLength();
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

	public InputStream getContenidoBinario() {
		return contenidoBinario;
	}
	
	public long getTamanyoBinario () {
		return tamanyoBinario;
	}

	public void closeBinari() {
		if (contenidoBinario != null) {
			try {
				contenidoBinario.close();
			}
			catch (Exception e) {
			}
		}
	}

	public String getError() {
		return (error!=null?error:"");
	}

	public int getStatusCode() {
		return statusCode;
	}

}
