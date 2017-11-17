package mae.general;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;

import mae.easp.general.Easp;

public class URLExec {
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
		  if (url.contains("azure") && Easp.HOST == Easp.TIPO_HOST.ORACLE) {
			  newHost = Easp.HOST_ORACLE;
			  oldHost = Easp.HOST_AZURE;
			  remCSHTML = true;
		  }
		  else if (url.contains("afinity.geyce.es") && Easp.HOST == Easp.TIPO_HOST.AZURE) {
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
	  PostMethod post = null;
	  InputStream istream = null;
	  boolean bOk = false;
	  try {
		  post = new PostMethod(miurl.toString());
		  String b64Encoded = Base64.encodeBytes(new String(Azure.getUsuario()+":"+Azure.getPassword()).getBytes("utf-8"));
		  post.setRequestHeader(new Header("Authentication", "Basic " + b64Encoded));
		  HttpClient client = new HttpClient();
		  client.getParams().setParameter("http.connection.timeout", 20 * 1000);
		  int statusCode = client.executeMethod( post );
		  if( statusCode == HttpStatus.SC_OK ) {
			  istream = post.getResponseBodyAsStream();
			  int result=istream.read();
			  setResultado(result);
			  char primchar=(char) result;
			  StringBuffer bf=new StringBuffer();
			  while (result !=-1){
				  result=istream.read();
				  if (result!=-1){
					  bf.append((char) result);
				  }
	          }
			  setPagina(primchar+bf.toString());
			  bOk = true;
		  }
		  else {
	    	  setResultado(-1);
	    	  System.out.println("Error URLExec.ejecutarURL()  ="+statusCode+"\nImposible resolver URL: "+miurl.toString());
	    	  setPagina("Error ="+statusCode+"\nImposible resolver URL: "+miurl.toString());
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
		  if (istream != null) try {istream.close();}catch (IOException e) {}
		  if (post != null) post.releaseConnection();
	  }
	  return bOk;
  }

  public static String getContenido(String url){
	  PostMethod get = null;
	  String resultado = null;
	  InputStream istream = null;
	  try {
		  url = checkHostUrl(url);
		  if (getConnection(url)) {
			  get = new PostMethod(miurl.toString());
			  String b64Encoded = Base64.encodeBytes(new String(Azure.getUsuario()+":"+Azure.getPassword()).getBytes("utf-8"));
			  get.setRequestHeader(new Header("Authentication", "Basic " + b64Encoded));
			  HttpClient client = new HttpClient();
			  client.getParams().setParameter("http.connection.timeout", 20 * 1000);
			  int statusCode = client.executeMethod( get );
			  if( statusCode == HttpStatus.SC_OK ) {
				  istream = get.getResponseBodyAsStream();
				  int result=istream.read();
				  setResultado(result);
				  char primchar=(char) result;
				  StringBuffer bf=new StringBuffer();			  
				  while (result !=-1){
					  result=istream.read();
					  if (result!=-1){
						  bf.append((char) result);
					  }
				  }
				  String cadena=primchar+bf.toString();
				  if (cadena.endsWith("\n")) resultado = cadena.substring(0,cadena.length()-1);
				  else resultado = cadena;
			  }
			  else {
		    	  setResultado(-1);
		    	  System.out.println("Error en URLExec.getcontenido()  ="+statusCode+"\nImposible resolver URL: "+miurl.toString());
		    	  setPagina("Error ="+statusCode+"\nImposible resolver URL: "+miurl.toString());
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
		  if (istream != null) try {istream.close();}catch (IOException e) {}
		  if (get != null) get.releaseConnection();
	  }
	  return resultado;
  }

//  private static HTTPResponse initResponse (URL miurl, HTTPConnection miconnec) throws IOException {
//	  HTTPResponse rsp = null;
//	  miconnec.setTimeout(7000); // 7 segons			  
//	  if (Easp.HOST == Easp.TIPO_HOST.ORACLE) rsp = miconnec.Get(miurl.getFile());
//	  else {
//		  miconnec.setAllowUserInteraction(false);
//		  NVPair[] data = null;
//		  String b64Encoded = Base64.encodeBytes(new String(Azure.getUsuario()+":"+Azure.getPassword()).getBytes("utf-8"));			
//		  NVPair[] header = new NVPair[] {
//				  new NVPair("Authentication", "Basic " + b64Encoded) 
//		  };
//		  rsp = miconnec.Post(miurl.getFile(), data, header);
//	  }
//	  return rsp;
//}

public static String getContenidoSSL(String url) {
	  PostMethod post = null;
	  String resultado = null;
	  try {
		  url = checkHostUrl(url);
		  miurl=new URL(url);
		  
		  post = new PostMethod(miurl.toString());
		  String b64Encoded = Base64.encodeBytes(new String(Azure.getUsuario()+":"+Azure.getPassword()).getBytes("utf-8"));
		  post.setRequestHeader(new Header("Authentication", "Basic " + b64Encoded));
		  HttpClient client = new HttpClient();
		  client.getParams().setParameter("http.connection.timeout", 20 * 1000);
		  int statusCode = client.executeMethod( post );
		  if( statusCode == HttpStatus.SC_OK ) resultado = post.getResponseBodyAsString();
		  else resultado = null;
	  } 
	  catch (Exception  e) {
		  System.out.println("Error al ejercutar ContenidoSSL="+e.getMessage());
		  e.printStackTrace();
		  resultado = null;
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