package mae.general;

import geyce.maefc.*;
import java.util.*;
import java.net.*;
//import java.lang.*;
import java.io.*;
import HTTPClient.*;


public class URLExec {
  // String url1="http://armagedon/pls/agpi/agpi2dp.AgpiGetCDPs?dp=123456000000";
  //public static final String DNSAGPI2DP="http://armagedon/pls/agpi/agpi2dp.";
  private static URL miurl;
  private static HTTPConnection  miconnec;
  private static int resultado=0;
  private static String pagina=null;

  public static boolean getConnection(String url){
	  try {
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
			  return cadena.substring(0,cadena.length()-1);
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