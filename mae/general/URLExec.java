package mae.general;

import java.net.*;
import java.io.*;

import mae.easp.general.Easp;
import HTTPClient.*;


public class URLExec {
  private static URL miurl;
  private static HTTPConnection  miconnec;
  private static int resultado=0;
  private static String pagina=null;

  private static String checkHostUrl (String url) {
	  String urlParseada = url;
	  System.out.println("checkHostUrl IN ["+url+"]");
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
		  else if (url.contains("afinity.geyce.es") && Easp.HOST == Easp.TIPO_HOST.LOCALHOST) {
			  newHost = Easp.HOST_LOCALHOST;
			  oldHost = Easp.HOST_ORACLE;			  
		  }
		  if (newHost != null && oldHost != null) {
			  urlParseada = urlParseada.replace(oldHost, newHost);
			  if (remCSHTML) urlParseada = urlParseada.replace(".cshtml", "");
			  if (addCSHTML) urlParseada = urlParseada.replace("?", ".cshtml?");
		  }
		  
	  }
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
	  HTTPResponse rsp=null;
	  try {
		  StringBuffer bf=new StringBuffer();
		  miconnec=new HTTPConnection(miurl);
		  miconnec.setTimeout(7000); // 7 segons
		  rsp=miconnec.Get(miurl.getFile());
		  InputStream istream=rsp.getInputStream();
		  int result=istream.read();
		  setResultado(result);
		  char primchar=(char) result;
		  while (result !=-1){
			  result=istream.read();
			  if (result!=-1){
				  bf.append((char) result);
			  }
          }
		  setPagina(primchar+bf.toString());
		  return true;
      } catch (Exception  e){
    	  setResultado(-1);
    	  System.out.println("Error URLExec.ejecutarURL()  ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  setPagina("Error ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  return false;
      }
  }

  public static String getContenido(String url){
	  HTTPResponse rsp=null;
	  try {
		  url = checkHostUrl(url);
		  if (getConnection(url)) {
			  StringBuffer bf=new StringBuffer();
			  miconnec=new HTTPConnection(miurl);
			  miconnec.setTimeout(7000); // 7 segons
			  rsp=miconnec.Get(miurl.getFile());
			  InputStream istream=rsp.getInputStream();
			  int result=istream.read();
			  setResultado(result);
			  char primchar=(char) result;
			  while (result !=-1){
				  result=istream.read();
				  if (result!=-1){
					  bf.append((char) result);
				  }
			  }
			  String cadena=primchar+bf.toString();
			  if (cadena.endsWith("\n")) return cadena.substring(0,cadena.length()-1);
			  else return cadena;
		  } else {
			  return null;
		  }
      } catch (Exception  e){
    	  setResultado(-1);
    	  System.out.println("Error en URLExec.getcontenido()  ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  setPagina("Error ="+e+"\nImposible resolver URL: "+miurl.toString());
    	  return null;
      }
  }

  public static String getContenidoSSL(String url) {
	  HTTPResponse rsp=null;
	  try {
		  url = checkHostUrl(url);
		  miurl=new URL(url);
		  miconnec=new HTTPConnection(miurl);
		  miconnec.setTimeout(7000); // 7 segons
		  rsp=miconnec.Get(miurl.getFile());
		  BufferedReader in = new BufferedReader(new InputStreamReader(rsp.getInputStream()));
		  String line;
		  StringBuffer sb = new StringBuffer();
		  while ((line = in.readLine()) != null) {
			  sb.append(line);
		  }
		  in.close();
		  return sb.toString();
	  } catch (Exception  e){
		  System.out.println("Error al ejercutar ContenidoSSL="+e.getMessage());
		  return null;
      }
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
	  if (!conexion || !execucio || resultado!=48){
		  return false;
      } else {
    	  return true;
      }
    /*
    if (!getConnection(url)){
      Maefc.message("CONEXION: "+getPagina());
      return false;
      }
    else if (!ejecutarURL()){
      Maefc.message("EJECUCION: "+getPagina());
      return false;
      }
    else if (getResultado()!=48){ //48 es el código ascci del 0
      Maefc.message("RESULTADO: "+getPagina());
      return false;
      }
    else
      return true;
      */
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

    //-------------------------------------------------------- fi de la classe
}