package mae.general;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import mae.easp.general.Easp;

public class URLExec_Deprecated {
  private static URL miurl;
  private static int resultado=0;
  private static String pagina=null;

  private static String checkHostUrl (String url) {
	  String urlParseada = url;
	  System.out.println("checkHostUrl IN ["+url+"]");
	  if (urlParseada.toLowerCase().startsWith("http://")) urlParseada = "https://"+urlParseada.substring(7);
	  if (url != null && url.trim().length()>0) {
		  String newHost = null;
		  String oldHost = null;
		  boolean addCSHTML = true;
		  boolean remCSHTML = false;
		  url = url.trim().toLowerCase();
		  if (url.contains("afinity.geyce.es") && Easp.HOST == Easp.TIPO_HOST.AZURE) {
			  newHost = Easp.HOST_AZURE;
			  oldHost = Easp.HOST_ORACLE;				
		  }
		  else if (url.contains("afinity.geyce.es") && Easp.HOST == Easp.TIPO_HOST.AZUREMSDN) {
			  newHost = Easp.HOST_AZUREMSDN;
			  oldHost = Easp.HOST_ORACLE;				
		  }
		  else if (url.contains("afinity.geyce.es") && Easp.HOST == Easp.TIPO_HOST.LOCALHOST) {
			  newHost = Easp.HOST_LOCALHOST;
			  oldHost = Easp.HOST_ORACLE;			  
		  }
		  if (newHost != null && oldHost != null) {
			  urlParseada = urlParseada.replace(oldHost, newHost);
			  if (remCSHTML) urlParseada = urlParseada.replace(".cshtml", "");
			  if (addCSHTML) {
				  if (urlParseada.contains("?")) urlParseada = urlParseada.replace("?", ".cshtml?dominiojToken="+Easp.dominio+"&");
				  else urlParseada = urlParseada + ".cshtml?dominiojToken="+Easp.dominio;
			  }
		  }
		  
	  }
	  if (urlParseada.contains("\\")) urlParseada = urlParseada.replace("\\", "%5C");
	  System.out.println("checkHostUrl OUT ["+urlParseada+"]");
	  return urlParseada;
  }
  
  public static boolean getConnection(String url){	  
	  try {
		  url = checkHostUrl(url);
		  miurl=new URL(url);
		  return true;
      } catch (MalformedURLException  e){
    	  System.out.println("Error en URLExec.getConnection() ="+e+" al tratar de acceder a la URL: "+url);
    	  setPagina("Error ="+e+" al tratar de acceder a la URL: "+url);
    	  return false;
      }
  }
  

  public static boolean ejecutarURL(){
	  HttpPost post = null;
	  CloseableHttpClient client = null;
	  boolean bOk = false;
	  try {
		  post = new HttpPost (miurl.toString());
		  client = Azure.createHttpClient();
		  HttpResponse response = client.execute(post);		  
		  if( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK ) {
			  byte[] c = Azure.parseHttpResponse(response);
			  setResultado(c [0]);
			  setPagina(new String (c));
			  bOk = true;
		  }
		  else {
	    	  setResultado(-1);
	    	  System.out.println("Error URLExec.ejecutarURL()\n ("+response.getStatusLine().getStatusCode()+") "+response.getStatusLine().getReasonPhrase()+"\nImposible resolver URL: "+miurl.toString());
	    	  setPagina("Error URLExec.ejecutarURL()\n ("+response.getStatusLine().getStatusCode()+") "+response.getStatusLine().getReasonPhrase()+"\nImposible resolver URL: "+miurl.toString());
	    	  bOk = false;
		  }
      } 
	  catch (Exception  e){
    	  setResultado(-1);
    	  System.out.println("Error URLExec.ejecutarURL()  ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  setPagina("Error ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  bOk = false;
      }
	  finally {
		  if (post != null) post.releaseConnection();
		  if (client != null) try {client.close();} catch (IOException e) {}
	  }
	  return bOk;
  }

  public static String getContenido(String url){
	  HttpPost post = null;
	  CloseableHttpClient client = null;
	  String resultado = null;
	  try {
		  url = checkHostUrl(url);
		  if (getConnection(url)) {
			  post = new HttpPost (miurl.toString());
			  client = Azure.createHttpClient();		
			  HttpResponse response = client.execute(post);		  
			  if( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK ) {
				  byte[] c = Azure.parseHttpResponse(response);
				  setResultado(c [0]);
				  String cadena = new String (c);
				  if (cadena.endsWith("\n")) resultado = cadena.substring(0,cadena.length()-1);
				  else resultado = cadena;
			  }			  
			  else {
		    	  setResultado(-1);
		    	  System.out.println("Error URLExec.getContenido()\n ("+response.getStatusLine().getStatusCode()+") "+response.getStatusLine().getReasonPhrase()+"\nImposible resolver URL: "+miurl.toString());
		    	  setPagina("Error URLExec.getContenido()\n ("+response.getStatusLine().getStatusCode()+") "+response.getStatusLine().getReasonPhrase()+"\nImposible resolver URL: "+miurl.toString());
		    	  resultado = null;
		      }
		  } 
		  else resultado = null;
      } 
	  catch (Exception  e){
    	  setResultado(-1);
    	  System.out.println("Error en URLExec.getcontenido()  ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  setPagina("Error ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  e.printStackTrace();
    	  resultado = null;
      }
	  finally {
		  if (post != null) post.releaseConnection();
		  if (client != null) try {client.close();} catch (IOException e) {}
	  }
	  return resultado;
  }

public static String getContenidoSSL(String url) {
	  HttpPost post = null;
	  CloseableHttpClient client = null;
	  String resultado = null;
	  try {
		  url = checkHostUrl(url);
		  miurl=new URL(url);
		  post = new HttpPost (miurl.toString());
		  client = Azure.createHttpClient();	
		  HttpResponse response = client.execute(post);		  
		  if( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK ) {
			  byte[] c = Azure.parseHttpResponse(response);
			  resultado = new String (c);
		  }			  		  
		  else resultado = null;
	  } 
	  catch (Exception  e) {
		  System.out.println("Error al ejercutar ContenidoSSL="+e.getMessage());
		  e.printStackTrace();
		  resultado = null;
      }
	  finally {
		  if (post != null) post.releaseConnection();
		  if (client != null) try {client.close();} catch (IOException e) {}
	  }
	  return resultado;
  }

  public static int getContador(){
	  System.out.println("getpagina=["+getPagina()+"]");
	  return Integer.parseInt(getPagina().substring(2,getPagina().length()));
  }

  public static boolean procesarURL(String url){
	  url = checkHostUrl(url);
	  boolean conexion=getConnection(url);
	  boolean execucio=ejecutarURL();
	  int resultado=getResultado();
	  System.out.println("Al procesar URL:"+url);
	  System.out.println("Conexion:"+conexion+" ejecucion:"+execucio+" resultado:"+resultado);
	  if (!conexion || !execucio || resultado!=48) return false;
      return true;
  }

  public static boolean fileExist(String url){
	  url = checkHostUrl(url);
	  if (!getConnection(url) || !ejecutarURL() || getResultado()!=49){
		  return false;
	  }  else {
		  return true;
	  }
  }

  private static void setResultado(int r){
	  resultado=r;
  }

  public static int getResultado(){
	  return resultado;
  }

  private static void setPagina(String p){
	  pagina=p;
  }

  public static String getPagina(){
	  return pagina;
  }
}