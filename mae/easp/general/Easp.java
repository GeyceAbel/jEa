package mae.easp.general;

import mae.general.*;
import mae.modasp.general.Modasp;
import geyce.maefc.*;
import mae.easp.*;
import mae.easp.db.*;
import mae.admon.general.*;

import java.util.*;
import java.text.*;
import java.io.*;
import java.net.URI;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

//import com.jnetdirect.jsql.i;

public class Easp {
  public static AppEasp easp;
  public static DBConnection connEA=null;
    // Login efectuado
  public static String dominio=null;
  public static String usuario=null;
  public static int sede=1;

  public static String codiCDP=null;
  public static String codiDP=null;
  public static String nifCDP=null;

  //variables de versiones
  public static String versionAplicacion="9.8";
  public static String versionFecha="Abril/2018";
  public static String versionBDEA="15.7";

  public static enum TIPO_HOST { LOCALHOST, AZURE, AZUREMSDN};
  public static TIPO_HOST HOST = TIPO_HOST.AZURE;
  public static final String HOST_AZURE 	 = "afinityprod.azurewebsites.net/";
  public static final String HOST_AZUREPRE 	 = "afinityprod-afinitypre.azurewebsites.net/";
  public static final String HOST_AZUREMSDN  = "afinity.azurewebsites.net/";
  public static final String HOST_LOCALHOST  = "localhost:52373/";
  public static final String HOST_ORACLE 	 = "afinity.geyce.es/";

  //Constantes
  public final static int IVA=16;

  public static boolean errorCheckBds = false;

  public static boolean securityMD5 = false;

  public static boolean isLocalDB(){
    return !(Aplication.getAplication().getConfig("BDAFINITY").equals("SI"));
	  }


  public static boolean init() {
    // Datos que se deben iniciar
    easp=(AppEasp) Aplication.getAplication();
    connEA=Aplication.getAplication().getDataBase();
    if (usuario==null) {
      usuario=Aplication.getAplication().getUser();
      }
    if (usuario!=null)
      usuario=usuario.toUpperCase();

    String destino=System.getProperty("user.dir")+"\\";
    java.io.File fileDll=new java.io.File("maefc0110.dll");
    if (!fileDll.exists()) {
      setFileFromjar(destino,"maefc0110.dll",destino+"maefc0110.dll");
      }
    asignaResolucioInicial();
    return true;
    }

  public static String getUrlDocVersion(String url, String aplic) {
    if (url != null) url = url.toLowerCase();
	  String retorn = url;
	  if ( esAzure() )
            retorn = retorn.replace("afinity.geyce.es/agpi/home/999999999999/administrador/", "afinityprod.blob.core.windows.net/documentos/");
     return retorn;
  }

  public static boolean initUser() {
    if (usuario==null)
      usuario=Aplication.getAplication().getUser();

    if (usuario==null)
			usuario=Aplication.getAplication().getParameter("Usuario");
		else
      usuario=usuario.toUpperCase();

    // Datos de la tabla DP
		if (dominio==null) {
		  dominio=Aplication.getAplication().getParameter("Dominio");
		  if (dominio!=null && dominio.length() > 6) {
			  //dominio=dominio.substring(0,6)+"000000"; //per quan estem a e-modelos
				codiDP=dominio;
			  }
		  else {
    		codiDP=getDPCodi();
				if (codiDP==null) {
    			Maefc.message("No se encuentra grabada la ficha general del Despacho.\n\nCumplimente los datos mínimos requeridos antes de continuar.","Aviso",Maefc.WARNING_MESSAGE);
    			runFichaDP();
    			codiDP=getDPCodi();
    			}
    		if (codiDP==null) {
    			Maefc.message("No es posible arrancar la aplicación\nsin la ficha del Despacho correctamente cumplimentada.","Aviso",Maefc.WARNING_MESSAGE);
    			return false;
    		  }
				dominio=codiDP;
				}
		  }
     else if ( codiDP == null ) codiDP = dominio;
//    if (dominio==null) {
//      dominio=codiDP;
//      }

    System.out.println("Dominio: ["+dominio+"] ");
    System.out.println("codiDP : ["+codiDP+"] ");

		Admon.connAdmon=connEA;

    // Control de versió BDEA
    System.out.println("Controlando versión bd EA...");
    if (!versionValid(getVersionBD("bdeasp"),versionBDEA))
      runConversio();
    // Si no ha convertit
    if (!versionValid(getVersionBD("bdeasp"),versionBDEA)) {
      System.out.println("Cancelado proceso de conversión EA");
      return false;
      }

    String destinoPlantillas=System.getProperty("user.dir")+"\\plantillas\\";
    java.io.File filePlantillas=new java.io.File("query.xls");
    if (!filePlantillas.exists()) {
      setFileFromjar(destinoPlantillas,"query.xls",destinoPlantillas+"query.xls");
      }
    HOST = TIPO_HOST.AZURE;
    System.out.println("**************** HOST JEA = "+Easp.HOST);

    return true;
    }


  public static DBConnection connAGPI=null;

  public static DBConnection getConnAGPI() {
    CatXagpi catxagpi;
    DataBase db=new DataBase();
    db.setName("bdxagpi");
    db.setUser("agpi");
    db.setPassword("McCartney");
    catxagpi = new CatXagpi();
    Catalog array[] = {catxagpi};
    db.setCatalogs(array);
    db.setType("oracle");
    connAGPI=new DBConnection(db);
    if (connAGPI.connect()) return connAGPI;
    else  return null;
    }


  public static DBConnection getConnEA() {
    CatEasp cateasp;
    DataBase db=new DataBase();
    db.setName("bdeasp");
    cateasp = new CatEasp();
    CatAdmon catadmon;
    catadmon = new CatAdmon();
    CatJexpe catExpe ;
    catExpe = new CatJexpe();
	Catalog array[] = {
      cateasp,catadmon,catExpe
      };
    db.setCatalogs(array);
    connEA = new DBConnection(db);
    if (connEA.connect())
      return connEA;
    else
      return null;
    }

  public static void avisoErroresLevesjModelos() {

    DBConnection connJModelos = null ;

    int erroresLevesDetectados =  0 ;
    boolean encontradoAlgunErrror = false ;
    int numInc = 0;

    java.io.FileInputStream  filein  ;
    java.io.InputStreamReader read ;
    java.io.BufferedReader   in ;
    String cadena = "" ;

    try {

      Selector sinc = new Selector (connEA);
      sinc.execute("Select max(incodigo) as codi from ININCIDE");
      if (sinc.next()) numInc = sinc.getint("codi")+1;
      sinc.close();

       Select sinincide    = new Select(connEA);
       Table  tbinincide   = new Table(sinincide,"inincide");
       Field  fdincodigo   = new Field(sinincide,tbinincide,"INCODIGO");
       // Field  fdinsede     = new Field(sinincide,tbinincide,"INSEDE");
       // Field  fdinusuari   = new Field(sinincide,tbinincide,"INUSUARI");
       // Field  fdinpuesto   = new Field(sinincide,tbinincide,"INPUESTO");
       //        Field  fdininstan   = new Field(sinincide,tbinincide,"ININSTAN");
       // Field  fdinambito   = new Field(sinincide,tbinincide,"INAMBITO");
       // Field  fdinmodulo   = new Field(sinincide,tbinincide,"INMODULO");
       // Field  fdinprog     = new Field(sinincide,tbinincide,"INPROG");
       // Field  fdinrefer    = new Field(sinincide,tbinincide,"INREFER");
       // Field  fdinnumer    = new Field(sinincide,tbinincide,"INNUMER");
       // Field  fdinopera    = new Field(sinincide,tbinincide,"INOPERA");
       // Field  fdinmensa    = new Field(sinincide,tbinincide,"INMENSA");

       sinincide.setWhere("INMODULO = 'REVI.14_2T' and inusuari = '"+usuario+"'");
       sinincide.execute() ;

       if ( sinincide.isEof()  ) {
         System.out.println("01 Detectando Errores Leves");
        connJModelos = getConnexio("modelos", connEA);
        System.out.println("02");
        if ( connJModelos != null  ) {
          System.out.println("03");
          Selector smodestado = new Selector(connJModelos) ;
          smodestado.execute("Select * from modestado where mesejercicio = 2014 and   mesperiodo = '2T' and mesestadot = 'TT'");
          while ( smodestado.next() ) {
            String nif = smodestado.getString("mesnif");
            String modelo = smodestado.getString("mesmodelo");

            String ficheroRespuesta = smodestado.getString("mesficherotel") ;

            if ( ficheroRespuesta != null && !ficheroRespuesta.equals("") && Easp.existeFichero(ficheroRespuesta) ) {
              filein=new java.io.FileInputStream(ficheroRespuesta);
              read=new java.io.InputStreamReader(filein);
              in=new java.io.BufferedReader(read);

              cadena = in.readLine();
              boolean encontradoError = false ;
              while (cadena!=null && !encontradoError ) {

                if ( cadena.contains("<title>Error - Pagina de errores leves"))  {
                  erroresLevesDetectados++;
                  String msg = "Revisar Res. Mod: ["+modelo+"] Ejer: 2014 Peri: 2T CIF: ["+nif+"] con Errores leves";
                  System.out.println(msg+" Detectados: ["+erroresLevesDetectados+"]");
                  grabaIncidencia(connEA, msg, msg, msg,"REVI.14_2T",nif,modelo);
                  encontradoError = true ;
                  encontradoAlgunErrror = true ;
                  }

                cadena = in.readLine();
                }

              in.close();
              filein.close();
              }

            }
          System.out.println("04");
          smodestado.close();
          }
        }

       System.out.println("05 Total ErroresLeves Detectados: ["+erroresLevesDetectados+"]");
       if ( connJModelos != null  ) connJModelos.disconnect() ;
       System.out.println("06");

       if ( erroresLevesDetectados > 0 || encontradoAlgunErrror )  {
         System.out.println("07");
         String aviso= "En el nuevo sistema de presentación directa de declaraciones, y utilizando el proceso     \n"+
                       "de  presentación masiva de declaraciones desde  \"Estado y obtención de declaraciones\",   \n"+
                       "hemos detectado que en algún modelo, cuando existían ERRORES LEVES, la declaración  \n"+
                       "quedaba como presentada en la aplicación pero no en la Web de la AEAT.  \n  \n"+
                       "Hemos efectuado un análisis de sus declaraciones y hemos obtenido el siguiente resultado. \n \n"+
                       "Se ha encontrado "+erroresLevesDetectados+" Declaraciones que constan como presentadas pero que contienen ERRORES  \n"+
                       "LEVES y podrían no estar presentadas. \n \n"+
                       "A continuación se abrirá una pantalla con el detalles de los posibles modelos afectados.  \n"+
                       "Es muy importante que imprima esta relación y revise si el modelo esta presentado .";

         System.out.println("08");
         Maefc.message(aviso,"ATENCIÓN: Rogamos lea Atentamente este mensaje.",Maefc.WARNING_MESSAGE ) ;
         System.out.println("09");
         connEA.commit() ;
         System.out.println("10");
         mae.easp.adminciden.ProgAdminciden pr = new mae.easp.adminciden.ProgAdminciden ();
         pr.incCodi = numInc;
         pr.setConnection(connEA);
         pr.setModal(true);
         LocationWindow loc=new LocationWindow();
         loc.setWidth(950);
         loc.setHeight(600);
         loc.setLocation(LocationWindow.CENTER) ;
         pr.setLocation(loc);
         pr.run();
         System.out.println("11");
         }
       System.out.println("12");
      }
    catch(Exception e ) {
      System.out.println("Error detectando errores leves");
      }

    System.out.println("13");
    }


  public static DBConnection getConnexio(String nombd, DBConnection connEA)
  {
    return(conectaBD(nombd, connEA.getDB().getServer(), connEA.getDB().getUser(), connEA.getDB().getPassword(), connEA.getDB().getType()));
    }


  public static DBConnection conectaBD(String bdnom, String bdserver, String bduser, String bdpassword, String bdtype) {
    DataBase db=new DataBase();
    db.setName(bdnom);
    db.setMyServer(bdserver);
    db.setUser(bduser);
    db.setMyPassword(bdpassword);
    db.setType(bdtype);
    DBConnection conn=new DBConnection(db);

    if (bdnom.equals("modelos"))
    {
          CatModgen catmodgen = new CatModgen();
          CatModelos1 catmodelos1 = new CatModelos1();
          CatModelos2 catmodelos2 = new CatModelos2();
          CatModelo100 catmodelo100 = new CatModelo100();
          CatModelo200 catmodelo200 = new CatModelo200();
          CatModelo714 catmodelo714 = new CatModelo714();
          Catalog array[] = {catmodelos1,catmodelos2,catmodgen,catmodelo100,catmodelo200,catmodelo714};
          db.setCatalogs(array);
      }
    else if (bdnom.equals("laboral"))
    {
          CatLaboral catlaboral = new CatLaboral();
          Catalog array[] = {catlaboral};
          db.setCatalogs(array);
      }
    else if (bdnom.equals("jeo"))
    {
          CatJeo catjeo = new CatJeo();
          Catalog array[] = {catjeo};
          db.setCatalogs(array);
      }
    else if (bdnom.startsWith("cta"))
    {
          CatCtasp catctasp = new CatCtasp();
          Catalog array[] = {catctasp};
          db.setCatalogs(array);
      }
    else if (bdnom.startsWith("jiss"))
    {
      CatJiss catjiss = new CatJiss ();
          Catalog array[] = {catjiss};
          db.setCatalogs(array);
      }
    else if (bdnom.startsWith("jrenta"))
    {
      CatJrenta catjrenta = new CatJrenta ();
          Catalog array[] = {catjrenta};
          db.setCatalogs(array);
      }
    conn=new DBConnection(db);
    if (conn.connect()) return conn;
    else return null;
  }



  public static boolean crearSesion(String tarifa,String usuario, String aplicacion , boolean verMensaje,boolean soloAvisar ) {

	try {

	  String version =  getVersionBD("bdeasp") ;
      if ( Double.valueOf(version).doubleValue() < 7.6 ) return true ;

      //APJORDI 12/05/2017
      //Primer de tot borrem totes les sessions d'aquel PC, ja que sino s'acumulaven (si obria 2 sessions desde el mateix PC)
      cerrarSesion(aplicacion, usuario);

      Select ssesiones         = new Select(connEA);
      Table tbsesiones         = new Table(ssesiones,"sesiones");
      Field fdsescodigo        = new Field(ssesiones,tbsesiones,"sescodigo");
      Field fdsesmachine       = new Field(ssesiones,tbsesiones,"sesmachine");
      Field fdsesusuario       = new Field(ssesiones,tbsesiones,"sesusuario");
      Field fdsesfecha         = new Field(ssesiones,tbsesiones,"sesfecha");
      Field fdseshora          = new Field(ssesiones,tbsesiones,"seshora");
      Field fdsesaplicacion    = new Field(ssesiones,tbsesiones,"sesaplicacion");
      Field fdsespermitido     = new Field(ssesiones,tbsesiones,"sespermitido");


      Select simpuserctrl          = new Select(connEA);
      Table tbimpuserctrl          = new Table(simpuserctrl,"impuser");
      Field fdimumachinectrl       = new Field(simpuserctrl,tbimpuserctrl,"imumachine");
      Field fdimuaplicacionctrl    = new Field(simpuserctrl,tbimpuserctrl,"imuaplicacion");

      String nomPC = usuario ;
      nomPC = java.net.InetAddress.getLocalHost().getHostName() ;
      Date fechaGrabacio = Maefc.getDate();
      int sesiones = 0 ;

      simpuserctrl.setDistinct(true);
      simpuserctrl.setWhere("imuaplicacion = '"+aplicacion+"' and imumachine <> '"+nomPC+"'");
      simpuserctrl.execute();
      sesiones = simpuserctrl.getNumRows();
      String detalleSesiones = "" ;
      String detallePL = null;
      int i = 1 ;
      while ( !simpuserctrl.isEof()  ) {
    	detalleSesiones+= "     "+i+" - "+fdimumachinectrl.getString()+"  \n";
    	if (detallePL==null) detallePL =  fdimumachinectrl.getString();
    	else detallePL += ","+fdimumachinectrl.getString();
    	i++;
    	simpuserctrl.next();
        }

      int licencias = -1 ;
      if      ( tarifa != null && tarifa.length() == 10 && tarifa.endsWith("0") ) licencias = 100 ;
      else if ( tarifa != null && tarifa.length() == 10 && tarifa.endsWith("1") ) licencias = 4 ;
      else if ( tarifa != null && tarifa.length() == 10 && tarifa.endsWith("2") ) licencias = 8 ;
      else if ( tarifa != null && tarifa.length() == 10 && tarifa.endsWith("7") ) licencias = 1 ;
      else if ( tarifa != null && tarifa.length() == 10 && tarifa.endsWith("8") ) licencias = 2 ;

      int numMax=0;
      String nmaxusers=Aplication.getAplication().getConfig("NMAXUSERS");
      if (nmaxusers!=null && nmaxusers.length()>0) {
        numMax=Integer.parseInt(nmaxusers);
        }

      if ( numMax > 0 && licencias > 0 && numMax > licencias ) licencias = numMax ;



      boolean superaLicencias = false ;
      if ( licencias > 0 &&  sesiones >= licencias ) superaLicencias = true  ;

      ssesiones.addNew();
      fdsesmachine    .setValue(nomPC);
      fdsesusuario    .setValue(usuario);
      fdsesfecha      .setValue(fechaGrabacio);
      Date horaGrab = Maefc.getDateTime();
      fdseshora       .setValue(Fecha.getHora(horaGrab,"HH:mm:ss") );
      if ( !superaLicencias ) fdsespermitido  .setValue("S");
      else                    fdsespermitido  .setValue("N");
      fdsesaplicacion .setValue(aplicacion);
      ssesiones.insert();

      // Nuevo , si tiene licencia de 4 se le permitira 5 licencias 6 ya no
      // if ( superaLicencias  ) {
      if ( superaLicencias  && !( !soloAvisar && licencias == 4 && sesiones == 4) ) {
    	  if ( verMensaje ) {
    	    String desSesion = "sesiones abiertas";
    	    if ( sesiones == 1 ) desSesion = "sesión abierta";

    	    String desLicencia = " de "+licencias+" Puestos de trabajo. ";
    	    if ( licencias == 1 )desLicencia = " de 1 Puesto de trabajo.";
    	    String referencia = Fecha.fechaGregoriana(fechaGrabacio)+Fecha.getHora(horaGrab,"HHmmss")+ Numero.format( ((int)(Math.random()*1000)),"000") ;
    	    String msg = "Excedido el número máximo de usuarios establecido en su Licencia de Uso. \n \n"+
    		           "Se han detectado "+sesiones+" "+desSesion+" de la aplicación de "+aplicacion+". \n"+
    		           "En la actualidad su Licencia de Uso es  "+desLicencia+" \n \n"+
    		           "Detalle de ordenadores con sesión abierta: \n"+
    		           detalleSesiones+"\n";

    	    // Nuevo , si tiene 8 licencias contratadas ,se avisara , pero siempre se dejará acceder a la aplicación

      	  if ( soloAvisar || licencias == 8 ) {
      		  msg+= "Temporalmente puede seguir trabajando con la aplicación. Si en el futuro prevé\n"+
      		         "utilizar más puestos de trabajo de los que tiene contratados contacte con el  \n"+
    		           "departamento comercial de GEYCE AGP S.L. para ampliar su Licencia de Uso. \n"+
    		           "Teléfono: 902 365 741    email: comercial@geyce.es ";
    	      }
    	    else {
            msg+= "Si desea utilizar más puestos de trabajo de los que tiene contratados contacte con el  \n"+
                  "departamento comercial de GEYCE AGP S.L. para ampliar su Licencia de Uso. \n"+
                  "Teléfono: 902 365 741    email: comercial@geyce.es ";
    	      }

      	  try {
//    		    String url = "pcliente="+codiDP;
//    		    url += "&preferencia="+referencia;
//    		    url += "&pmachine="+nomPC;
//    		    url += "&pusuario="+usuario;
//    		    url += "&paplicacion="+aplicacion;
//    		    if (soloAvisar) url += "&ppermitido=S";
//    		    else url += "&ppermitido=N";
//    		    if (tarifa!=null) url += "&ptarifa="+tarifa;
//    		    else url += "&ptarifa=NoDefinida";
//    		    url += "&ppuestosper="+licencias;
//    		    url += "&ppuestosocu="+sesiones;
//    		    url += "&pnomspcocu="+detallePL;
    		    Azure az = new Azure ("CONTROLLIC.grabaraviso");
    		    az.addParametroURL("pcliente", codiDP);
    		    az.addParametroURL("preferencia", referencia);
    		    az.addParametroURL("pmachine", nomPC);
    		    az.addParametroURL("pusuario", usuario);
    		    az.addParametroURL("paplicacion", aplicacion);
    		    az.addParametroURL("ppermitido", soloAvisar?"S":"N");
    		    az.addParametroURL("ptarifa", tarifa!=null?tarifa:"NoDefinida");
    		    az.addParametroURL("ppuestosper", licencias);
    		    az.addParametroURL("ppuestosocu", sesiones);
    		    az.addParametroURL("pnomspcocu", detallePL);
    		    az.procesar();
    	      }
    	    catch (Exception e) {
    		    e.printStackTrace();
    	    }
    	  Maefc.message(msg,"Control de Licencias de Uso ",Maefc.WARNING_MESSAGE);
    	  }
      // Si tiene licencia de 8 , siempre se permitirá acceder y solo se avisará
    	if ( !soloAvisar && licencias < 8) {
        ssesiones.insert() ;
        return false ;
      	}
       }


      Select simpuser          = new Select(connEA);
      Table tbimpuser          = new Table(simpuser,"impuser");
      Field fdimucodigo        = new Field(simpuser,tbimpuser,"imucodigo");
      Field fdimumachine       = new Field(simpuser,tbimpuser,"imumachine");
      Field fdimuusuario       = new Field(simpuser,tbimpuser,"imuusuario");
      Field fdimufecha         = new Field(simpuser,tbimpuser,"imufecha");
      Field fdimuhora          = new Field(simpuser,tbimpuser,"imuhora");
      Field fdimuaplicacion    = new Field(simpuser,tbimpuser,"imuaplicacion");


      simpuser.addNew();
      fdimumachine    .setValue(nomPC);
      fdimuusuario    .setValue(usuario);
      fdimufecha      .setValue(Maefc.getDate());
      fdimuhora       .setValue(Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss") );
      fdimuaplicacion .setValue(aplicacion);
      simpuser.insert() ;
      simpuser.commit();

      return true ;
	  }
    catch(Exception e ) {
    	e.printStackTrace();
      return true ;
      }

    }

  public static boolean cerrarSesion(String aplicacion,String usuario ) {
	try {
      Select simpuser          = new Select(connEA);
      Table tbimpuser          = new Table(simpuser,"impuser");
      Field fdimucodigo        = new Field(simpuser,tbimpuser,"imucodigo");
      Field fdimumachine       = new Field(simpuser,tbimpuser,"imumachine");
      Field fdimuusuario       = new Field(simpuser,tbimpuser,"imuusuario");
      Field fdimufecha         = new Field(simpuser,tbimpuser,"imufecha");
      Field fdimuhora          = new Field(simpuser,tbimpuser,"imuhora");
      Field fdimuaplicacion    = new Field(simpuser,tbimpuser,"imuaplicacion");


      String nomPC = usuario ;
      nomPC = java.net.InetAddress.getLocalHost().getHostName() ;

      simpuser.setWhere("imuaplicacion = '"+aplicacion+"' and imumachine = '"+nomPC+"'");
      simpuser.execute();
      if ( !simpuser.isEof() ) {
    	while ( !simpuser.isEof() ) {
    	  simpuser.delete();
    	  simpuser.next();
          }
    	simpuser.commit();
        }
	  }
	catch (Exception e ) {};

	return true;
    }


  /**
   * Devuelve la versión xx o yy o zz de un formato de versión xx.yy.zz según el parámetro
   * @param   versio  Versión a desglosar
   * @param   i       indica 1 si es vol xx, 2 si es vol yy i 3 si es vol zz
   *
   * @return  int  Valor de la versión según posición i
   */
  private static int getVerNN(String versio,int i) {
    if (versio==null || versio.equals(""))
      return 0;
    int xx=0;
    int yy=0;
    int zz=0;
    String ver=null;

    StringTokenizer tz=new StringTokenizer(versio,".");
    ver=tz.nextToken();
    if (Util.isNumero(ver))
      xx=Integer.parseInt(ver);
    if (tz.hasMoreTokens()) {
      ver=tz.nextToken();
      if (Util.isNumero(ver))
        yy=Integer.parseInt(ver);
      }
    if (tz.hasMoreTokens()) {
      ver=tz.nextToken();
      if (Util.isNumero(ver))
        zz=Integer.parseInt(ver);
      }
    switch(i) {
      case 1:
        return xx;
      case 2:
        return yy;
      case 3:
        return zz;
      }
    return 0;
    }

  /**
   * Devuelve true si la versión del producto es igual o posterior a la versión a comprobar
   * @param   verProducto    Versión del producto
   * @param   verCompatible  Versión a comprobar
   *
   * @return  true si verProducto>=verCompatible. Ejemplo: "1.5.1" < "2.2" > "2.1.5"
   */
  public static boolean versionValid(String verProducto, String verCompatible)
  {
    int pxx,pyy,pzz;

    pxx=getVerNN(verProducto,1);
    pyy=getVerNN(verProducto,2);
    pzz=getVerNN(verProducto,3);

    int cxx,cyy,czz;

    cxx=getVerNN(verCompatible,1);
    cyy=getVerNN(verCompatible,2);
    czz=getVerNN(verCompatible,3);
// Maefc.message("pxx="+pxx+"\n"+"pyy="+pyy+"\n"+"pzz="+pzz+"\n"+"cxx="+cxx+"\n"+"cyy="+cyy+"\n"+"czz="+czz,"debug");
    if (cxx==0 || cxx<pxx)
      return true;
    if (cxx==pxx && (cyy==0 || cyy<pyy))
      return true;
    if (cxx==pxx && cyy==pyy && (czz==0 || czz<=pzz))
      return true;
    return false;
  }

  public static boolean controlVersionFC(String jedifc) {
    if (!versionValid(JediFC.getVersion(),jedifc)) {
      System.out.println("Version de JEDIFC incompatible. Póngase en contacto con GEYCE,S.A.");
      Maefc.message("Versión de JediFC incompatible.\n\nJediFC="+JediFC.getVersion()+" y se esperaba como mínimo una "+jedifc+".\n\nPóngase en contacto con GEYCE,S.A.","Error",Maefc.ERROR_MESSAGE);
      return false;
      }
    else
      return true;
    }

  public static boolean controlVersionEA(String versionEsperada) {
    if (!versionValid(versionAplicacion,versionEsperada)) {
      System.out.println("Version de EA incompatible. Póngase en contacto con GEYCE,S.A.");
      Maefc.message("Versión de EA incompatible.\n\nEASP="+versionAplicacion+" y se esperaba como mínimo una "+versionEsperada+".\n\nPóngase en contacto con GEYCE,S.A.","Error",Maefc.ERROR_MESSAGE);
      return false;
      }
    else
      return true;
    }

  public static void grabaIncidencia(DBConnection dbc, String programa,String operacion, String mensaje){
    grabaIncidencia(dbc,programa,operacion,mensaje,"jea",null,null);
    }

	public static void grabaIncidencia(DBConnection dbc, String programa,String operacion, String mensaje,String modulo,String refer,String numer){
		Select sinincide=new Select(dbc);
		Table inincide=new Table(sinincide,"inincide");
		Field incodigo=new Field(sinincide,inincide,"incodigo");
		Field insede=new Field(sinincide,inincide,"insede");
		Field inusuari=new Field(sinincide,inincide,"inusuari");
		Field inpuesto=new Field(sinincide,inincide,"inpuesto");
		Field ininstan=new Field(sinincide,inincide,"ininstan");
		Field inambito=new Field(sinincide,inincide,"inambito");
		Field inmodulo=new Field(sinincide,inincide,"inmodulo");
		Field inprog=new Field(sinincide,inincide,"inprog");
		Field inrefer=new Field(sinincide,inincide,"inrefer");
		Field innumer=new Field(sinincide,inincide,"innumer");
		Field inopera=new Field(sinincide,inincide,"inopera");
		Field inmensa=new Field(sinincide,inincide,"inmensa");
		insede.setValue(1);
		inusuari.setValue(Aplication.getAplication().getUser());
		inpuesto.setValue(Aplication.getAplication().getAdmon().getHostAddress());
		ininstan.getDef().setDateTime(true);
		ininstan.setValue(new java.sql.Timestamp(new java.util.Date().getTime()));
		inambito.setValue("APLICATIVO");
		inmodulo.setValue(modulo);
		inprog.setValue(programa);
		inopera.setValue(operacion);
		inmensa.setValue(mensaje);

		if ( refer != null && !refer.equals("") ) inrefer.setValue(refer) ;
		if ( numer != null && !numer.equals("") ) innumer.setValue(numer) ;

		sinincide.insert();
	}

	public static String getTipoLicencia (String aplic, String tarifa)  {
		String lic = "No definida";
		if (tarifa!=null && tarifa.length()==10) {
			if (tarifa.endsWith("320") || tarifa.endsWith("007") || tarifa.endsWith("327")) lic = "Monousuario";
			else if (tarifa.endsWith("000") || tarifa.endsWith("330")) lic = "Multiusuario";
			else if (tarifa.endsWith("008") || tarifa.endsWith("328")) lic = "2 usuarios";
			else if (tarifa.endsWith("001") || tarifa.endsWith("331")) lic = "4 usuarios";
			else if (tarifa.endsWith("002") || tarifa.endsWith("332")) lic = "8 usuarios";
		}
		return lic;
	}
public static boolean copyFile(String fitOri , String fitDest ) {
  java.io.File wfile;
  java.io.File wfile2;
  try {
    wfile=new java.io.File(fitOri);
    wfile2=new java.io.File(fitDest);

    if ( copyFile(wfile,wfile2) ) return true;
    else return false;
    }
  catch (Exception e ) {
    System.out.println("error: "+e);
    return false;
    }
  }

public static boolean copyFile(File in, File out)  {
  if ( copyFile(in,out,false) ) return true;
  else return false;
  }


public static boolean copyFile(File in, File out,boolean msg)  {
  try {
    creaDirect(in.getParent());
    creaDirect(out.getParent());
    java.io.FileInputStream fis  = new FileInputStream(in);
    java.io.FileOutputStream fos = new FileOutputStream(out);
    byte[] buf = new byte[1024];
    int i = 0;
    while((i=fis.read(buf))!=-1) {
      fos.write(buf, 0, i);
      }
    fis.close();
    fos.close();
    }
  catch ( Exception e ) {
    if ( msg ) Maefc.message("Error en función copyfile : "+e );
    return false;
    }
  return true;
  }

/*** funcion para crear directorio  **/
public static boolean  creaDirect(String ruta, String any, String modelo )  {
    boolean retorn=true;
    try {
      java.io.File direct=new java.io.File(ruta);
      if (!direct.isDirectory()) {
        if (!direct.mkdirs()) {
          retorn=false;
          }
        }
     }
  catch(Exception e) {
       System.out.println("error al escribir:"+e);
       retorn=false;
       }
  return retorn;
  }

public static boolean  creaDirect(String ruta)  {
    boolean retorn=true;
    try {
      java.io.File direct=new java.io.File(ruta);
      if (!direct.isDirectory()) {
        if (!direct.mkdirs()) {
          retorn=false;
          }
        }
     }
  catch(Exception e) {
       System.out.println("error al escribir:"+e);
       retorn=false;
       }
  return retorn;
  }


public static boolean controlBDAplic(String bd, String pathFileBase ) {

    /*
    String tipoBD   = Aplication.getAplication().getConfig("DataBase.type");
    String tipoBDEA = getTipoBD();
    if
    if ( bdaplicacion.equals("bdmodasp" ) ) {
      }
    else if ( bdaplicacion.equals("bdlaboral" ) ) {
      }
    */





  DataBase db=new DataBase();
  db.setName(bd);
  DBConnection dbConn = new DBConnection(db);
  if ( db != null  ) {
    String pp = dbConn.getDB().getDsn();
    int caracter = pp.toLowerCase().lastIndexOf("dbq=");
    if ( caracter > 0 ) {
      String rutaBD= pp.substring(caracter+4,pp.length());
      String rutaBD_BASE = System.getProperty("user.dir")+"\\"+pathFileBase;

      if ( !existeFichero(rutaBD)  && existeFichero(rutaBD_BASE) ) {
        System.out.println("copio fitxers orig: ["+rutaBD_BASE+"]  dest:["+rutaBD+"]");
        copyFile(rutaBD_BASE,rutaBD);
        }


      /* Atencion VIP , falta programar  si no existe base datos aplicacion ni basedatosBASE , mensaje para que haga reinstalar base de datos*/
      }
    }
  return true;
  }

  public static boolean isPassMD5() {
     return ("SI".equals(Aplication.getAplication().getConfig("esMD5")) || "Si".equals(Aplication.getAplication().getConfig("esMD5")) || "si".equals(Aplication.getAplication().getConfig("esMD5")));
  }
  public static boolean isErnestYoung() {
      boolean isEY = false;
      if ("100593000000".equals(dominio) || "100594000000".equals(dominio) || "100588000000".equals(dominio)) isEY = true;
      return isEY;
  }

static class ErrorManagerVersion implements ErrorManager{
  public   int RUNTIME_EXCEPTION;
  public   int UNKNOWN_EXCEPTION;
  public   int COMMIT_EXCEPTION;
  public   int ROLLBACK_EXCEPTION;
  public   int DRIVER_SQL_EXCEPTION;
  public   int DSN_SQL_EXCEPTION;
  public   int CONNECT_SQL_EXCEPTION;
  public   int CLOSE_SQL_EXCEPTION;
  public   int LOCK_SQL_EXCEPTION;
  public   int STATEMENT_SQL_EXCEPTION;
  public   int PREPARED_STATEMENT_SQL_EXCEPTION;
  public   int NUMBER_FORMAT_EXCEPTION;
  public   int EXEC_EXCEPTION;
  public   int IO_EXCEPTION;
  public   int NOFIELD_EXCEPTION;
  public   int NOTABLE_EXCEPTION;
  public   int XML_EXCEPTION;
  public   int APL_EXCEPTION;
  public   int KEY_LOCK_EXCEPTION;
  public   java.lang.String MESSAGE;
  public   java.lang.String EXCEPTION;
  public   java.lang.String APLICATION;
  public   java.lang.String PROGRAM;
  public   java.lang.String FORM;
  public   java.lang.String CONTROL;
  public   java.lang.String REPORT;
  public   java.lang.String DATABASE;
  public   java.lang.String SQLCODE;
  public   java.lang.String TYPE;

  public  String bdaplicacion;
  public DBConnection connEA;
  public boolean isGet;
  public String nuevaVersion;
  public boolean update ;
  public DBConnection dbConn;
  public ErrorManagerVersion(String bdaplicacion , DBConnection connEA , boolean isGet , String nuevaVersion, DBConnection dbConn ) {
    this.bdaplicacion  = bdaplicacion;
    this.connEA        = connEA;
    this.isGet         = isGet;
    this.nuevaVersion  = nuevaVersion;
    this.dbConn        = dbConn;
    }

  public   String version;
  public void error(geyce.maefc.ErrorParam error ) {
    version = null;

    if ( isGet ) {
      if ( bdaplicacion.toLowerCase().equals("bdctasp") )  version = "2.5" ;
      else                                                 version = Easp.getVersionBD(bdaplicacion);
      //version = "3.5";
       System.out.println("  error  version EA : ["+version+"]********************");
      try {
        int res=dbConn.getDataBase().executeUpdate("CREATE TABLE BDS ( bdnombre CHAR(15) NOT NULL , bdversio   VARCHAR(5),PRIMARY KEY (bdnombre));");
        dbConn.commit();
        res=dbConn.getDataBase().executeUpdate("INSERT INTO BDS ( bdnombre,bdversio) VALUES ('"+bdaplicacion+"' , '"+version+"' );");
        dbConn.commit();
        }
      catch (Exception e ) { System.out.println("  error create BDS 1 : ["+e+"]********************"); };
      }
    else {
      try {
        update = Easp.setVersionBD(bdaplicacion,nuevaVersion);
        // int res=dbConn.getDataBase().executeUpdate("CREATE TABLE BDS ( bdnombre   CHAR(15) NOT NULL , bdversio   VARCHAR(5),PRIMARY KEY (bdnombre));");
        // dbConn.commit();
        int res=dbConn.getDataBase().executeUpdate("INSERT INTO BDS ( bdnombre,bdversio) VALUES ('"+bdaplicacion+"' ,"+nuevaVersion+" );");
        dbConn.commit();
        }
      catch (Exception e ) { /* System.out.println("  error create BDS 2 : ["+e+"] ********************"); */ };
       System.out.println("  error  update : ["+update+"]********************");
      }
    }
  }


  /**
   * Devuelve la versión de la BD de una aplicación pasada como parámetro
   * @param   bdaplicacion    Nombre de la bd de la aplicación
   *
   * @return  version       Contenido del campo de la tabla BDS de EA asociado a bdaplicacion o null si no se encuentra
   */
  public static String getVersionBD(String bdaplicacion) {
    setRegAPLaboral();
    setRegAPJeo();
    Select select=new Select(connEA);
    Table bds=new Table(select,"bds");
    Field bdnombre=new Field(select,bds,"bdnombre");
    Field bdversio=new Field(select,bds,"bdversio");
    select.setWhere("bdnombre like '"+bdaplicacion+"%'");
    select.execute();
// System.out.println("  getVersion1 0001 *************** aplicacion ["+bdaplicacion+"]  version: ["+bdversio.getString()+"]");
    if (!select.isEof()) return bdversio.getString();
    else return null;
    }

  public static void setRegAPLaboral() {
    try {
      Select sApl=new Select(connEA);
      Table tbApl=new Table(sApl,"apl");
      Field fdapaplic     =new Field(sApl,tbApl,"apaplic");
      Field fdapdesc      =new Field(sApl,tbApl,"apdesc");
      Field fdapbdnom     =new Field(sApl,tbApl,"apbdnom");
      sApl.setWhere("apaplic = 'LABORAL' and apbdnom = 'bdlaboral' ");
      sApl.execute();
      if ( sApl.isEof() ) {
        connEA.getDataBase().executeUpdate("INSERT INTO APL( APAPLIC , APDESC , APBDNOM ) VALUES  ('LABORAL','Aplicación Gestión Laboral - ASP','bdlaboral' ) ; ");
        connEA.commit();
        System.out.println("insert en setRegAPLLaboral() ");
        }
      }
    catch (Exception e ) {
      System.out.println("Error en setRegAPLLaboral() ");
      }
    }

  public static void setRegAPJeo() {
    try {
      Select sApl=new Select(connEA);
      Table tbApl=new Table(sApl,"apl");
      Field fdapaplic     =new Field(sApl,tbApl,"apaplic");
      Field fdapdesc      =new Field(sApl,tbApl,"apdesc");
      Field fdapbdnom     =new Field(sApl,tbApl,"apbdnom");
      sApl.setWhere("apaplic = 'JEO' and apbdnom = 'bdjeo' ");
      sApl.execute();
      if ( sApl.isEof() ) {
        connEA.getDataBase().executeUpdate("INSERT INTO APL( APAPLIC , APDESC , APBDNOM ) VALUES  ('JEO','Estimación e IVA','bdjeo' ) ; ");
        connEA.commit();
        System.out.println("insert en setRegAPJeo() ");
        }
      }
    catch (Exception e ) {
      System.out.println("Error en setRegAPJeo() ");
      }
    }

  public static String getVersionBD(String bdaplicacion,DBConnection dbConn) {
    setRegAPLaboral();
    setRegAPJeo();

    ErrorManager defaultErrorManager=Aplication.getAplication().getErrorManager();
    String tmpVersion = getVersionBDAplic(bdaplicacion,dbConn) ;
    Aplication.getAplication().setErrorManager(defaultErrorManager);
      //  System.out.println("  getVersion2 0002 *  tmp version ["+tmpVersion+"] *************");
    return tmpVersion;
    }

  public static String getVersionBDAplic(String bdaplicacion,DBConnection dbConn) {
    ErrorManagerVersion errorManagerGetVersion =  new ErrorManagerVersion(bdaplicacion,connEA,true,null,dbConn);
    Aplication.getAplication().setErrorManager(errorManagerGetVersion);
    try {
      Select select=new Select(dbConn);
      Table bds=new Table(select,"bds");
      Field bdnombre=new Field(select,bds,"bdnombre");
      Field bdversio=new Field(select,bds,"bdversio");
      select.setWhere("bdnombre like '"+bdaplicacion+"%'");
      select.execute();
      if (!select.isEof()) {
         // System.out.println("  getVersionBDAplic 0001 ********************");
        return bdversio.getString();
        }
      else {
         // System.out.println("  getVersionBDAplic 0002 ********************");
        return errorManagerGetVersion.version;
        }
      }
    catch(Exception e ) {
       // System.out.println(" catch    getVersionBDAplic ["+e+"]");
      return errorManagerGetVersion.version;
      }
    }


  /**
   * Cambia la versión de la BD de una aplicación pasada como parámetro
   * @param   bdaplicacion    Nombre de la bd de la aplicación
   *
   * @return  true       Si consigue efectuar la actualización
   */
  public static boolean setVersionBD(String bdaplicacion,String version) {
    Select select=new Select(connEA);
    Table bds=new Table(select,"bds");
    Field bdnombre=new Field(select,bds,"bdnombre");
    Field bdversio=new Field(select,bds,"bdversio");
    select.setWhere("bdnombre='"+bdaplicacion+"'");
    select.executeLock();
    if (!select.isEof()) {
      bdversio.setValue(version);
      return select.update();
      }
    else
      return false;
    }

  public static boolean setVersionBD(String bdaplicacion,String version,DBConnection dbConn) {
    ErrorManager defaultErrorManager=Aplication.getAplication().getErrorManager();
    boolean tmpVersion = setVersionBDAplic(bdaplicacion,version,dbConn) ;
    Aplication.getAplication().setErrorManager(defaultErrorManager);
    return tmpVersion;
    }

  public static boolean setVersionBDAplic(String bdaplicacion,String version,DBConnection dbConn) {
    ErrorManagerVersion errorManagerGetVersion =  new ErrorManagerVersion(bdaplicacion,connEA,false,version,dbConn);
    Aplication.getAplication().setErrorManager(errorManagerGetVersion);
    try {
      Select select=new Select(dbConn);
      Table bds=new Table(select,"bds");
      Field bdnombre=new Field(select,bds,"bdnombre");
      Field bdversio=new Field(select,bds,"bdversio");
      select.setWhere("bdnombre='"+bdaplicacion+"'");
      select.executeLock();
      if (!select.isEof()) {
        bdversio.setValue(version);
        return select.update();
        }
      else
        return errorManagerGetVersion.update;
      }
    catch(Exception e ) {
      System.out.println(" catch    setVersionBDAplic ["+e+"]");
      return errorManagerGetVersion.update;
      }
    }

public static String cargoRepresentante(String tipoCargo ) {
    if      ( tipoCargo == null )     return  "" ;
    else if ( tipoCargo.equals("A") ) return "Apoderado";
    else if ( tipoCargo.equals("C") ) return "Consejero Delegado";
    else if ( tipoCargo.equals("F") ) return "Firma";
    else if ( tipoCargo.equals("G") ) return "Director Gerente";
    else if ( tipoCargo.equals("M") ) return "Administradores Mancomunados";
    else if ( tipoCargo.equals("O") ) return "Administrador concursal";
    else if ( tipoCargo.equals("P") ) return "Presidente";
    else if ( tipoCargo.equals("R") ) return "Responsable RRHH";
    else if ( tipoCargo.equals("S") ) return "Socio";
    else if ( tipoCargo.equals("T") ) return "Titular";
    return "" ;
    }



  public static void runFichaGeneral(String apl,String codiCDP,String nifcif, boolean alta){
    runFichaGeneral(apl,codiCDP,nifcif,alta,false);
    }

  public static void runFichaGeneral(String apl,String codiCDP,String nifcif, boolean alta, boolean esDP){
    mae.easp.prclfichagener.ProgPrclfichagener pr= new mae.easp.prclfichagener.ProgPrclfichagener();
    pr.setConnection(connEA);
    pr.setModal(true);
		LocationMDI locmdi=new LocationMDI();
    locmdi.setWidth(800);
    locmdi.setHeight(500);
    pr.setLocation(locmdi);
    pr.aplicacion=apl;
    pr.codiCDP=codiCDP;
    pr.vnifcif=nifcif;
    pr.alta=alta;
    pr.esDP=esDP;
    pr.run();
    }

  public static void runFichaGeneralNIF(String apl,String codiCDP,String nifcif, boolean alta, boolean esDP){
    mae.easp.prtratamnifes.ProgPrtratamnifes pr= new mae.easp.prtratamnifes.ProgPrtratamnifes();
    pr.setConnection(connEA);
    pr.setModal(true);
    LocationWindow loc=new LocationWindow();
    loc.setWidth(800);
		  loc.setHeight(500);
		//else
		//	loc.setHeight(380);
    pr.setLocation(loc);
    pr.aplicacion=apl;
    pr.codiCDP=codiCDP;
    pr.vnifcif=nifcif;
    pr.alta=alta;
    if (alta) pr.modo=1;
    pr.esDP=esDP;
    pr.run();
    }

  public static void runClienteCDP(String apl,String codiCDP,String nifcif, boolean alta){
    mae.easp.prtratamcdp.ProgPrtratamcdp pr= new mae.easp.prtratamcdp.ProgPrtratamcdp();
    pr.setConnection(connEA);
    pr.setModal(true);
    LocationWindow loc=new LocationWindow();
    loc.setWidth(700);
    loc.setHeight(250);
    pr.setLocation(loc);
    pr.aplicacion=apl;
    pr.codiCDP=codiCDP;
    pr.vnifcif=nifcif;
    pr.alta=alta;
    if (alta) pr.modo=1;
    else pr.modo=20;
    pr.run();
    }


  public static void runFichaDP(){
    mae.easp.prfichadp.ProgPrfichadp pr= new mae.easp.prfichadp.ProgPrfichadp();
    pr.setConnection(connEA);
    pr.setModal(true);
    LocationWindow loc=new LocationWindow();
    loc.setWidth(400);
    loc.setHeight(250);
    pr.setLocation(loc);
    pr.run();
    }

  public static String getDPCodi(){
    Select sdp  =new Select(connEA);
    Table tbdp  = new Table(sdp,"dp");
    Field fdcodigo  = new Field(sdp,tbdp,"dpcodigo");
    sdp.execute();
    if (sdp.isEof()){
			return null;
		  }
    else {
      String c=fdcodigo.getString();
      if (c.length()!=12){
        Maefc.message("El código del DP es erróneo. Debe teber 12 dígitos."+
          "\nRevise el código desde la Ficha del DP.","Código erróneo",Maefc.INFORMATION_MESSAGE);
        return null;
        }
      else return c;
      }
    }

//-----------------------------------------------------------------------------------------------------------

public static Date esFecha (String s){
  try {
    DateFormat dt = DateFormat.getDateInstance(DateFormat.SHORT);
    return dt.parse(s);
    }
  catch(ParseException p){
    return null;
    }
  }

  /** Devuele el nombre de la empresa o persona física
   * @param nifcif, código de NIF para personas físicas o CIF para empresas
   * @return nombre completo compuesto
   */
  public static String nombreEmpresa(String nifcif) {
    Select snifes   = new Select(connEA);
    Table tnifes    = new Table(snifes,"nifes");
    Field datnombre = new Field(snifes,tnifes,"datnombre");
    Field datapell1 = new Field(snifes,tnifes,"datapell1");
    Field datapell2 = new Field(snifes,tnifes,"datapell2");
    snifes.setWhere("danifcif='"+nifcif+"'");
    snifes.execute();
    if (snifes.isEof())
      return null;
    else {
      if (datnombre.isNull())
        return datapell1.getString();
      else
        return datapell1.getString()+" "+datapell2.getString()+", "+datnombre.getString();
      }
    }

  public static String componerCliente(String nom, String ape1, String ape2){
    if (nom==null || nom.equals("")) return ape1.trim();
    else {
      if (ape2==null || ape2.equals(""))
        return ape1.trim()+", "+nom.trim();
      else
        return ape1.trim()+" "+ape2.trim()+", "+nom.trim();
      }
    }

  /** Se encarga de calcular la letra del NIF de un DNI.
   * @param dni DNI del Nacional.
   * @return la letra correspondiente en caso afirmativo o nada en caso de error.
   */
  static final String aux= "TRWAGMYFPDXBNJZSQVHLCKE";
  public static String letraDNI(String dni) {
    if (dni==null || dni.equals(""))
      return "";
    try {
      return String.valueOf(aux.charAt((int)Long.parseLong(dni) % 23));
      }
    catch(NumberFormatException e) {
      return null;
      }
    }

  /** Función que retorna un número de caracteres por la derecha
   * @param cadena de texto
   * @param nCar número de caracteres que se desea que retorne
   * @return la cadena deseada
   */
  public static String right(String cadena,int nCar){
       return cadena.substring(cadena.length()-nCar);
  }

  public static boolean esMayusculas(String buffer) {
    boolean primera=true;
    for (int i=0;i<buffer.length();i++) {
      char letra=buffer.charAt(i);
      if (letra==' ' || letra=='.') {
        primera=true;
        }
      else {
        if (primera && Character.isUpperCase(letra))
            primera=true;
        else
            return false;
          }
      }
      return true;
    }

  public static boolean actualizarDomicilioEnvio (String nif) {
	  boolean bOk = true;
	  Selector snif = new Selector (connEA);
	  snif.execute("Select * from NIFES where danifcif='"+nif+"'");
	  if (snif.next()) {
		  String via = snif.getString("datevia");
		  if (via!=null && via.trim().length()>0) {
			  Update u = new Update (connEA,"NIFES");
			  u.setNull("datnftvia");
			  Selector s = new Selector (connEA);
			  s.execute("Select * from TIPOVIAS where tvscodant='"+snif.getString("datesiglas")+"'");
			  if (s.next()) u.valor("datnftvia",s.getString("tvscodigo"));
			  s.close();
			  u.valor("datnvia",via);
			  if (snif.getString("datntnum")==null) u.valor("datntnum","NUM");
			  u.setNull("datnnum");
			  u.setNull("datnportal");
		      try {
		    	  u.valor("datnnum",Integer.parseInt(snif.getString("datenum")));
		      }
		      catch(Exception e) { }
			  u.valor("datnescal",snif.getString("dateesc"));
			  u.valor("datnpuerta",snif.getString("dateletra"));
			  u.setNull("datnplanta");
			  String piso = snif.getString("datepiso");
		      if (piso!=null && piso.length()>3) u.valor("datnplanta",piso.substring(0,3));
		      else u.valor("datnplanta",piso);
			  u.valor("datnlocal",snif.getString("datepobla"));
			  u.valor("datncpost",snif.getString("datecpos"));
		      //u.setNull("datntel");
		      //u.setNull("datnfax");
			  //u.valor("datnmovil",snif.getString("datmovil"));
		      //try {u.valor("datntel",Integer.parseInt(snif.getString("dattel")));}
		      //catch(Exception e) {}
		      //try {u.valor("datnfax",Integer.parseInt(snif.getString("datfax")));}
		      //catch(Exception e) {}
		      //u.valor("datnemail",snif.getString("datemail"));
		      String sprov = snif.getString("dateprov");
		      String smuni = snif.getString("datemuni");
			  u.valor("datnprov",sprov);
		      u.setNull("datncodmun");
		      u.setNull("datnnommun");
		      Selector s2 = new Selector (Easp.connEA);
		      s2.execute("Select * from MUNI347 where mu7codprov="+sprov+" and mu7muniant="+smuni);
		      if (s2.next()) {
				  u.valor("datncodmun",s2.getString("mu7provmuni"));
				  u.valor("datnnommun",s2.getString("mu7desc"));
		      }
		      s2.close();
		      bOk = u.execute("danifcif='"+nif+"'");
		  }
	  }
	  return bOk;
  }

  public static boolean actualizarDomicilioFiscal (String nif) {
	  boolean bOk = true;
	  Selector snif = new Selector (connEA);
	  snif.execute("Select * from NIFES where danifcif='"+nif+"'");
	  if (snif.next()) {
		  Update u = new Update (connEA,"NIFES");
		  u.setNull("datfftvia");
		  Selector s = new Selector (connEA);
		  s.execute("Select * from TIPOVIAS where tvscodant='"+snif.getString("datsiglas")+"'");
		  if (s.next()) u.valor("datfftvia",s.getString("tvscodigo"));
		  s.close();
		  u.valor("datfvia",snif.getString("datvia"));
		  if (snif.getString("datftnum")==null) u.valor("datftnum","NUM");
		  u.setNull("datfnum");
		  u.setNull("datfportal");
	      try {
	    	  u.valor("datfnum",Integer.parseInt(snif.getString("datnum")));
	      }
	      catch(Exception e) { }
		  u.valor("datfescal",snif.getString("datesc"));
		  u.valor("datfpuerta",snif.getString("datletra"));
		  u.setNull("datfplanta");
		  String piso = snif.getString("datpiso");
	      if (piso!=null && piso.length()>3) u.valor("datfplanta",piso.substring(0,3));
	      else u.valor("datfplanta",piso);
		  u.valor("datflocal",snif.getString("datpobla"));
		  u.valor("datfcpost",snif.getString("datcpos"));
	      u.setNull("datftel");
	      u.setNull("datffax");
		  u.valor("datfmovil",snif.getString("datmovil"));
	      try {u.valor("datftel",Integer.parseInt(snif.getString("dattel")));}
	      catch(Exception e) {}
	      try {u.valor("datffax",Integer.parseInt(snif.getString("datfax")));}
	      catch(Exception e) {}
	      u.valor("datfemail",snif.getString("datemail"));
	      String sprov = snif.getString("datprov");
	      String smuni = snif.getString("datmuni");
		  u.valor("datfprov",sprov);
	      u.setNull("datfcodmun");
	      u.setNull("datfnommun");
	      Selector s2 = new Selector (Easp.connEA);
	      s2.execute("Select * from MUNI347 where mu7codprov="+sprov+" and mu7muniant="+smuni);
	      if (s2.next()) {
			  u.valor("datfcodmun",s2.getString("mu7provmuni"));
			  u.valor("datfnommun",s2.getString("mu7desc"));
	      }
	      s2.close();
	      bOk = u.execute("danifcif='"+nif+"'");
	  }
	  snif.close();
	  return bOk;
  }
  /*
   APJORDI: ACtualitza la taula muni347 el codi anterior de municipi
  public static void actualizarMunicipio () {
	  boolean bOk = true;
	  Selector s = new Selector (connEA);
	  s.execute("Select * from municipio order by muprov,mucodigo");
	  while (s.next() && bOk) {
		  int muprov = s.getint("muprov");
		  int mucodigo = s.getint("mucodigo");
		  String mudesc = s.getString("mudesc");
		  if (mudesc!=null && mudesc.trim().length()>0) {
			  mudesc = mudesc.trim().toUpperCase();
			  Selector s2 = new Selector (connEA);
			  s2.execute("Select * from MUNI347 where mu7codprov="+muprov+" and LEFT(UCase([mu7desc]),20)="+connEA.getDB().getSQLFormat(mudesc));
			  if (s2.next()) {
				  int mu7codprov = s2.getint("mu7codprov");
				  int mu7codmuni = s2.getint("mu7codmuni");
				  Update u = new Update(connEA,"MUNI347");
				  u.valor("mu7muniant", mucodigo);
				  bOk = u.execute("mu7codprov="+mu7codprov+" and mu7codmuni="+mu7codmuni);
			  }
			  s2.close();
		  }
	  }
	  s.close();
	  if (bOk) {
		  connEA.commit();
		  Maefc.message("OK");
	  }
	  else {
		  connEA.rollback();
		  Maefc.message("NO OK");
	  }
  }
  */
  public static boolean actualizarDomicilioAfiliacion (String nif) {
	  boolean bOk = true;
	  Selector snif = new Selector (connEA);
	  snif.execute("Select * from NIFES where danifcif='"+nif+"'");
	  if (snif.next()) {
		  Update u = new Update (connEA,"NIFES");
		  u.setNull("datsiglas");
		  Selector s = new Selector (connEA);
		  s.execute("Select * from TIPOVIAS where tvscodigo='"+snif.getString("datfftvia")+"'");
		  if (s.next()) u.valor("datsiglas",s.getString("tvscodant"));
		  s.close();
		  String via = snif.getString("datfvia");
          String viaA=snif.getString("datvia");

		  if (via!=null && via.length()>45) u.valor("datvia",via.substring(0,45));
		  else u.valor("datvia",via);
		  u.valor("datnum",snif.getString("datfnum"));
		  String esc = snif.getString("datfescal");
		  if (esc!=null && esc.length()>2) u.valor("datesc",esc.substring(0,2));
		  else u.valor("datesc",esc);
		  String por = snif.getString("datfpuerta");
		  if (por!=null && por.length()>2) u.valor("datletra",por.substring(0,2));
		  else u.valor("datletra",por);
		  u.valor("datpiso",snif.getString("datfplanta"));
      if (snif.getString("datflocal")==null || snif.getString("datflocal").trim().equals(""))
    	  u.valor("datpobla",snif.getString("datfnommun"));
      else
    	  u.valor("datpobla",snif.getString("datflocal"));

		  u.valor("datcpos",snif.getString("datfcpost"));
		  u.valor("dattel",snif.getString("datftel"));
		  u.valor("datfax",snif.getString("datffax"));
		  u.valor("datmovil",snif.getString("datfmovil"));
	      u.valor("datemail",snif.getString("datfemail"));
	      int iprov = 0;
	      try {iprov=Integer.parseInt(snif.getString("datfprov"));}
	      catch (Exception e) { }
	      String muni = snif.getString("datfcodmun");
		  u.valor("datprov",iprov);
	      Selector s2 = new Selector (Easp.connEA);
	      s2.execute("Select * from MUNI347 where mu7codprov="+iprov+" and mu7provmuni='"+muni+"'");
	      if (s2.next()) {
	    	  String mant = s2.getString("mu7muniant");
	    	  if (mant!=null && mant.trim().length()>0) u.valor("datmuni",mant.trim());
	      }
	      s2.close();
          //
	      String [] opcions = {"No","Si"};
          opcions[0] = "No";
          opcions[1] = "Si";
          boolean bOk2=true;
          String apliLaboral="";
          if (viaA!=null){
        	 Selector sCdp=new Selector (connEA);
        	 sCdp.execute("Select cdpcknomina from CDP where cdpnifcif='"+nif+"'");
             if (sCdp.next()) apliLaboral=sCdp.getString("cdpcknomina");
        	 sCdp.close();

             String texte="Ya existe información grabada en el"+"\n"+" 'Domicilio afilación' (Resto datos)"+"\n";
             if ("S".equals(apliLaboral)) texte=texte+"Recuerde que jNómina utiliza el de afiliación"+"\n"+"¿Desea que se actualice? ";
             else texte=texte+"¿Desea que se actualice? ";
             // retorn==1 No retorn==2 Si
             int retorn = Easp.messageConNuevosBotones(texte,"Datos afiliación",Maefc.INFORMATION_MESSAGE,opcions);
             if (retorn==1) bOk2=false;
          }
          if(bOk2)  bOk = u.execute("danifcif='"+nif+"'");
	  }
	  return bOk;
  }


  public static String firstUpper(String buffer) {
    StringBuffer result=new StringBuffer();
    boolean primera=true;
    for (int i=0;i<buffer.length();i++) {
      char letra=buffer.charAt(i);
      if (letra==' ' || letra=='.') {
        primera=true;
        result.append(letra);
        }
      else {
        if (primera) {
          result.append(Character.toUpperCase(letra));
          primera=false;
          }
        else {
          result.append(Character.toLowerCase(letra));
          }
        }
      }
    return result.toString();
  }


  /** Se encarga de comprobar si la cadena introducida es un NIF correcto
   * @param nif cadena que contiene el NIF que se va a validar
   * @return número.
   * Si es 0 es correcto
   * Si es 1 se trata de un DNI (cadena numérica)
   * Si es 2 hay una letra y no está ni en el primero ni en el último char
   * Si es 3 la letra del NIF no está bien calculada
   * Si es 9 el primer caracter es un letra (puede ser un CIF)
   */
   public static int esNIF(String nif) {
    if (Util.isNumero(nif))//si todo es un número
      return 1;
    else if (!Util.isNumero(nif.substring(0,1)))//si el primer caracter no es un nº
      return 9; //se debe tratar de un CIF
    else {  //si el último caracter
       String lastChar=right(nif,1);
       if (Util.isNumero(lastChar))
         return 2;
       String numNif=Util.formateoNumero("00000000",Integer.parseInt(nif.substring(0,nif.length()-1)));
       String letraNif=letraDNI(numNif);
       if (lastChar.equals(letraNif))
         return 0;
       else
         return 3;
       }
    }

  /** Se encarga de comprobar si la cadena introducida es un CIF o NIF correcto
   * @param cif cadena que contiene el CIF o NIF que se va a validar
   * @return el CIF o NIF formateado o la cadena introducida y un mensaje
   * de error si no es correcto
   */
  public static String esCIF(String cif){
    String CIF = "";
    //se eliminan los caracteres especiales que haya de por medio
    for (int i=0; i < cif.length();i++){
       char letra=cif.charAt(i);
       if (letra!=' ' && letra!='.' && letra!='-' && letra!='/' && letra!=',')
          CIF += cif.substring(i,i+1);
       }
    //cif = CIF.trim();
    //eliminar los espacios a ambos lados
    CIF = CIF.trim();
    //si se trata de un NIF devuelve el NIF arreglado
    if (Util.isNumero(CIF)){
      if (CIF.length() > 8){
         if (Maefc.message("Número demasiado largo.\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
           return cif;
         else
           return null;
         }
      else
//        if (Maefc.message("Se ha introducido un número de DNI"+
//        "\n¿Desea añadir la letra del NIF a este DNI?","Conversión de DNI a NIF",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
        if (true) {
        String  dni=Util.formateoNumero("00000000",Integer.parseInt(CIF));
        return dni+letraDNI(dni);
        }
      else
        return null;
      }

    int dnif=esNIF(CIF);
    switch (dnif){
       case 0:
         return CIF;
       case 2:
         if (Maefc.message("Revise la sintaxis del CIF/NIF\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
           return CIF;
         else
           return null;
       case 3:
         String d=CIF.substring(0,CIF.length()-1);
         if (Util.isNumero(d)){
            String dni2=Util.formateoNumero("00000000",Integer.parseInt(d));
/*
            if (Maefc.message("La letra del NIF debería ser "+letraDNI(dni2)+"."+
              "\n¿Desea cambiar la letra del NIF?","NIF incorrecto",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
              return dni2+letraDNI(dni2);
              }
            else
 */
            if (Maefc.message("La letra del NIF debería ser "+letraDNI(dni2)+".\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
              return CIF;
            else
              return null;
           }
        }
    // si la longitud del CIF es diferente de 9 debe ser de tipo P, S o X o será incorrecto
    if (CIF.length()!=9){
      // Se controla si el CIF es tipo X
      if (CIF.length()==8 &&  ( CIF.substring(0,1).equals("X") || CIF.substring(0,1).equals("Y") || CIF.substring(0,1).equals("Z")  ) ){
        //se controla que el 9 caracter sea numérico
        if (Util.isNumero(CIF.substring(7,8))) {
//          if (Maefc.message("El CIF es de tipo X (extranjero)."+
//            "\n¿Desea que se convierta a NIF?","convertir de CIF a NIF",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
            if (true) {
            String  dcif="0"+CIF.substring(1,8);
            return dcif+letraDNI(dcif);
            }
          }
        if (Maefc.message("La estructura del CIF es errónea.\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
          return CIF;
        else
          return null;
        }
      else if (CIF.substring(0,1).equals("P") || CIF.substring(0,1).equals("S")){
        return calculoCIFx(CIF);
        }
      else  {
        if (Maefc.message("La estructura del CIF es errónea.\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
          return CIF;
        else
          return null;
        }
      }
    else {//se trata de un CIF de nueve caracteres
      String ultchar=CIF.substring(8,9);
      if (CIF.substring(0,1).equals("P") || CIF.substring(0,1).equals("S")) {
        return calculoCIFx(CIF);
        }
      else {
        return calcularCIF(CIF);
        }
      }
    }

  /** Hace el cálculo del CIF cuando es de tipo especial (P o S)
   * @param CIF cadena que contiene el CIF que se va a validar
   * @return el CIF formateado y un texto explicativo en caso de error
   */
  public static String calculoCIFx(String CIF){
      String ultchar="";
      int dc=0;
      //control será el caracter de control
      char control;
      if (CIF.length() !=9){
        if (CIF.length()==8){
          ultchar=CIF.substring(7,8);
          control=(char)(65+Integer.parseInt(ultchar));
          if (Util.isNumero(ultchar)){
//            if (Maefc.message("Este tipo de CIF debe tener una letra de control al final."+
//                "\n¿Desea añadir la letra de control "+control+"?","Calcular letra control CIF",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION){
            if (true) {
              return CIF+control;
              }
            else
              return null;
            }
          }
        }
      else {
         ultchar=CIF.substring(8,9);
         control=(char)(65+Integer.parseInt(CIF.substring(7,8)));
         if (!ultchar.equals(String.valueOf(control))){
/*
            if (Maefc.message("Este CIF es de una corporación local "+
                        "\no un organismo público y la letra de control es errónea."+
                        "\nLa letra debería ser "+control+"."+
                        "\n¿Desea cambiarla?","CIF erróneo",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION){
              return CIF.substring(0,CIF.length()-1)+control;
              }
            else
*/
            if (Maefc.message("Este CIF es de una corporación local "+
                          "\no un organismo público y la letra de control es errónea."+
                          "\nLa letra debería ser "+control+".\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
              return CIF;
            else
              return null;
           }
         else
           return CIF;
         }
       if (Maefc.message("La estructura de este CIF no es correcta. "+
          "\nFaltan o sobran números, demasiadas letras, etc..\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
         return CIF;
       else
         return null;
      }


  /** Hace el cálculo del CIF con una estructura correcta
   * @param CIF cadena que contiene el CIF que se va a validar
   * @return el CIF formateado y un texto explicativo en caso de error
   */
  public static String calcularCIF(String CIF){
    if (!Util.isNumero(CIF.substring(1,9))) {
      if (Maefc.message("Los caracteres 2-9 deben ser numéricos.\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
        return CIF;
      else
        return null;
      }
    //el primer caracter debe ser un alfanumérico de los de esta lista
    String pchar=CIF.substring(0,1);
    String lcif="ABCDEFGHQKLM";
    if(lcif.indexOf(pchar) < 0){
      if (Maefc.message("La letra del CIF no es correcta, "+
           "\nla letra debe ser una de éstas:"+
           "\nABCDEFGHQKLM).\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
        return CIF;
      else
        return null;
      }
    else {
      //num son los guarismos sobre los que se van a hacer los cálculos
      String num=CIF.substring(1,CIF.length()-1);
      //ultdig es el dígito de control
      int ultdig=Integer.parseInt(CIF.substring(CIF.length()-1,CIF.length()));//Character.getNumericValue(num.charAt(num.length()-1));
      //se procede con el cálculo del CIF
      int primcol=0,segcol=0;
      for (int i=0;i<num.length();i+=2){
          //se cogen los números y se dividen en dos columnas:
          //1ª columna con numeros impares y 2ª columna con números pares
          //se multimplica por dos cada uno de los números de la primera
          //columna y luego se suman sus dígitos. Por último, se suman todos
          //resultados de esta primera columna
          primcol+=Integer.parseInt(Util.formateoNumero("00",Integer.parseInt(num.substring(i,i+1))*2).substring(0,1))+Integer.parseInt(Util.formateoNumero("00",Integer.parseInt(num.substring(i,i+1))*2).substring(1,2));
          //el condicional sierve para controlar que solo se haga el cálculo
          //con los números pares 2,4 y 6
          //Se suman los números de la segunda columna
          if (i < 5)
            segcol+=Integer.parseInt(num.substring(i+1,i+2));
          }
      //se suman los números de la columna 1 y 2
      int resulcol=primcol+segcol;
      //Se suman los dígitos del resultado. La diferencia entre este número
      //y la decena superior es el llamado dígito de control
      //que se guardará en tmpultdig
      int tmpultdig=(Integer.parseInt(Util.formateoNumero("00",resulcol).substring(0,1))*10)+10-resulcol;
      if (tmpultdig==10)
          tmpultdig=0;
      //si el dígito de control calculado no se corresponde con el
      //último número del CIF, se informa de que el CIF es erróneo y si se desea cambiar
      if (tmpultdig!=ultdig){
/*
        if (Maefc.message("El ultimo digito del CIF de la Sociedad es incorrecto. Debería ser un "+tmpultdig+"."+
          "\n¿Desea que se modifique el dígito de control?","Cambiar Dígito de Control",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
          return CIF.substring(0,8)+tmpultdig;
          }
        else
 */
        if (Maefc.message("El último dígito del CIF de la Sociedad es incorrecto. Debería ser un "+tmpultdig+".\n\n¿Desea continuar?","NIF incorrecto",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION)
          return CIF;
        else
          return null;
        }
      return CIF;
      }
    }

// funcio per borrar de una taula amb codi de empresa
  public static void BorraEmpresaTabla(DBConnection db,String tabla, String clave,int empresa){
    boolean fer = true;
    try {
      int result=db.executeUpdate("DELETE FROM "+tabla+" WHERE "+tabla+"."+clave+"= "+empresa);
      }
    catch (Exception e) {
      fer = false;
      }
    if (fer)
      db.commit();
    else
      db.rollback();
    }

// funcio per borrar de una taula amb codi de empresa i exercici
  public static void BorraEmpresaEjercicioTabla(DBConnection db,String tabla, String claveempresa,String claveejercicio,int empresa,int ejercicio){
    boolean fer = true;
    try {
      int result=db.executeUpdate("DELETE FROM "+tabla+" WHERE "+tabla+"."+claveempresa+"= "+empresa+" and "+tabla+"."+claveejercicio+"= "+ejercicio);
      }
    catch (Exception e) {
      fer = false;
      }
    if (fer)
      db.commit();
    else
      db.rollback();
    }
//----------------------------------------------------------------------------------------------------------------------------

  /** Función que genera un número aleatorio de x dígitos
   * @param digitos número de dígitos de la cadena númerica
   * @return la cadena numérica creada
   **/
   public static String generarNum(int digitos){
     String n="";
     Random r=new Random();
     for (int i=0;i < digitos;i++) {
         n+=String.valueOf(Math.abs(r.nextInt())%10);
         // n+=String.valueOf(r.nextInt(10));
         }
     return n;
     }

  /* Funcio que crida a la funció de calculo de digito de control, pero només en el cas
   * de que tots els camps estiguin omplerts i que siguin numerics
   **/
  public static boolean digitoIncorrecto(String entidad, String ofi, String cta, String dc, String tipo) {
  if (!"".equals(entidad) && !"".equals(ofi) && !"".equals(cta) && !"".equals(dc)) {
    int digitoControlReal=digitoControl(Integer.parseInt(entidad),Integer.parseInt(ofi),Long.parseLong(cta));
    if (Integer.parseInt(dc)!=digitoControlReal) {
      Maefc.message("El dígito de control de la cuenta "+tipo+" es incorrecto, debería ser "+digitoControlReal,"Datos incorrectos",Maefc.WARNING_MESSAGE);
      return true;
      }
    }
  return false;
  }

  /** Función que calcula el digito de control
   **/
  public static int digitoControl(int entidad,int oficina,long cuenta) {
     String primeraLista = "00"+Numero.format(entidad,"0000")+Numero.format(oficina,"0000");
     String segundaLista = Numero.format(cuenta,"0000000000");
     int a=0,b=0,a1=0,b1=0;
     int m[]={1,2,4,8,5,10,9,7,3,6};
     for (int i=0;i < 10;i++) {
       a = a+(m[i]*Integer.parseInt(primeraLista.substring(i,i+1)));
       b = b+(m[i]*Integer.parseInt(segundaLista.substring(i,i+1)));
       }
     a1=11-a%11;
     if (a1 == 10 || a1 == 11)
       a1 = 11-a1;
     b1=11-b%11;
     if (b1 == 10 || b1 == 11)
       b1 = 11-b1;
     return Integer.parseInt(String.valueOf(a1)+String.valueOf(b1));
    }

  public static void runConversio() {
    System.out.println("Controlando versión EA...");
    if (!versionValid(getVersionBD("bdeasp"),versionBDEA)) {
      System.out.println("Se detecta versión incompatible de EA. Se enlaza con conversion.");
      System.out.println("Se espera "+versionBDEA+" y se halla "+Easp.getVersionBD("bdeasp"));
      mae.easp.insprconver.ProgInsprconver pr=new mae.easp.insprconver.ProgInsprconver(easp);
      pr.setConnection(connEA);
      pr.setModal(true);
      LocationWindow loc=new LocationWindow();
      loc.setWidth(520);
      loc.setHeight(160);
      pr.setLocation(loc);
      pr.run();
      }
    }


  /**
   * inserta o actualiza el valor de un parámetro
   * @param   dominio dominio con el que se ha entrado en la aplicación
   * @return  true       Si consigue efectuar la actualización
   */
  public static boolean setParam(String ambito, String variable, String valor, String desc, String agrup, String especific) {
		Select sparam=new Select(connEA);
    Table  tbparam = new Table(sparam,"parametros");
    Field  fdvalor = new Field(sparam,tbparam,"parvalor");
		Field  fddominio = new Field(sparam,tbparam,"pardominio");
		Field  fdusuario = new Field(sparam,tbparam,"parusuario");
		Field  fdambito = new Field(sparam,tbparam,"parambito");
		Field  fdvariable = new Field(sparam,tbparam,"parvariable");
		Field  fddesc = new Field(sparam,tbparam,"pardesc");
		Field  fdagrup = new Field(sparam,tbparam,"paragrup");
		Field  fdespecific = new Field(sparam,tbparam,"parespecific");
    chivato("dominio = "+dominio+"; parusuario = "+usuario+"; parvariable = "+variable+"; parambito="+ambito,0);
		String strWhere = " pardominio = '"+dominio+"' And parusuario = '"+usuario+"' And parvariable = '"+variable+"' And parambito='"+ambito+"'";
    sparam.setWhere(strWhere);
    sparam.execute();
    if (!sparam.isEof()) {
			sparam.edit();
			fdvalor.setValue(valor);
		  }
		else {
			sparam.addNew();
			fddominio.setValue(dominio);
			fdusuario.setValue(usuario);
			fdambito.setValue(ambito);
			fdvariable.setValue(variable);
			fdvalor.setValue(valor);
			fddesc.setValue(desc);
			fdagrup.setValue(agrup);
			fdespecific.setValue(especific);
		  }
		if (sparam.save()){
			sparam.commit();
			return true;
		  }
		else {
			sparam.rollback();
			return false;
		  }
    }

  /**
   * inserta o actualiza el valor de un parámetro
   * @param   dominio dominio con el que se ha entrado en la aplicación
   * @return  true       Si consigue efectuar la actualización
   */
  public static boolean setParam(String usuario, String ambito, String variable, String valor, String desc, String agrup, String especific) {
		Select sparam=new Select(connEA);
    Table  tbparam = new Table(sparam,"parametros");
    Field  fdvalor = new Field(sparam,tbparam,"parvalor");
		Field  fddominio = new Field(sparam,tbparam,"pardominio");
		Field  fdusuario = new Field(sparam,tbparam,"parusuario");
		Field  fdambito = new Field(sparam,tbparam,"parambito");
		Field  fdvariable = new Field(sparam,tbparam,"parvariable");
		Field  fddesc = new Field(sparam,tbparam,"pardesc");
		Field  fdagrup = new Field(sparam,tbparam,"paragrup");
		Field  fdespecific = new Field(sparam,tbparam,"parespecific");
    chivato("dominio = "+dominio+"; parusuario = "+usuario+"; parvariable = "+variable+"; parambito="+ambito,0);
		String strWhere = " pardominio = '"+dominio+"' And parusuario = '"+usuario+"' And parvariable = '"+variable+"' And parambito='"+ambito+"'";
    sparam.setWhere(strWhere);
    sparam.execute();
    if (!sparam.isEof()) {
			sparam.edit();
			fdvalor.setValue(valor);
		  }
		else {
			sparam.addNew();
			fddominio.setValue(dominio);
			fdusuario.setValue(usuario);
			fdambito.setValue(ambito);
			fdvariable.setValue(variable);
			fdvalor.setValue(valor);
			fddesc.setValue(desc);
			fdagrup.setValue(agrup);
			fdespecific.setValue(especific);
		  }
		if (sparam.save()){
			sparam.commit();
			return true;
		  }
		else {
			sparam.rollback();
			return false;
		  }
    }

  public static String getParam(String variable,String ambito) {
		try {
			Select sparam  = new Select(connEA);
    	Table  tbparam = new Table(sparam,"parametros");
    	Field  fdvalor = new Field(sparam,tbparam,"parvalor");
    	String strWhere = " pardominio = '"+dominio+"' And parusuario = '"+usuario+"' And parvariable = '"+variable+"' And parambito='"+ambito+"'";
    	sparam.setWhere(strWhere);
			sparam.execute();
    	if ( !sparam.isEof() && fdvalor.getString().trim().length() > 0 ) {
    	  return fdvalor.getString();
    	  }
    	strWhere = " pardominio = '"+dominio+"' And parusuario = 'ADMINGEYCE' And parvariable = '"+variable+"' And parambito='"+ambito+"'";
    	sparam.setWhere(strWhere);
    	sparam.execute();
    	if ( !sparam.isEof() && fdvalor.getString().trim().length() > 0 ) {
    	  return fdvalor.getString();
    	  }

    	strWhere = " pardominio = '999999999999' And parusuario = 'ADMINGEYCE' And parvariable = '"+variable+"' And parambito='"+ambito+"'";
    	sparam.setWhere(strWhere);
    	sparam.execute();
    	if ( !sparam.isEof() && fdvalor.getString().trim().length() > 0 ) {
    	  return fdvalor.getString();
    	  }
    	return null;
			}
		catch (Exception e) {
			System.out.println("Error en getParam: "+e.getMessage());
			return null;
		  }
    }

  public static String cutrpad(String cadena,int longitud) {
    if ( cadena==null ) cadena="";
    String cadenaResultado=cadena;
    for (int i=cadenaResultado.length();i<longitud;++i)
       cadenaResultado+=" ";
    return cadenaResultado.substring(0,longitud);
    }

  public static String getPathGeyce() {
    String retorn="c:\\geyce\\";
    String home = Aplication.getAplication().getConfig("Home").toUpperCase();
    if ( home!=null && home.trim().length() > 0  ) {
     int pos = home.indexOf("CONTAASP");
     if ( pos > 0 ) {
       retorn = home.substring(0,pos);
       }
     }
    return retorn;
    }


  /** Función que determina si un fichero existe
   * @param archivo archivo con ruta que se va a buscar
   * @return true si existe el fichero
   **/
  public static boolean existeFichero(String archivo) {
    try {
      File file=new File(archivo);
      return file.exists();
      }
    catch (SecurityException se) {
      System.out.println("Error al mirar si existe el fichero "+archivo+" "+se);
      return false;
      }
    }

  public static void chivato(String chiv, int vDisp ) {
    if ( vDisp > 0 )   {
      System.out.println(chiv);
      Maefc.warning(chiv,"dbquerylock");
      if (vDisp == 2) Maefc.message(chiv);
      }
    }

  /** Función que lee fa compatible versions antigues de leer un secuencial que hay dentro de un jar
   * @return true si no ha dado error de lectura, ni al abrir el jar
   **/
    public static boolean leerSecuencial(DBConnection bd, String txts[],String carpeta, String nomjar) {
      return leerSecuencial(bd,txts,carpeta,nomjar,null);
      }
    public static boolean leerSecuencial(DBConnection bd, String txts[],String carpeta, String nomjar, ProgressBarForm pbf) {
      return leerSecuencial(bd,txts,carpeta,nomjar,pbf, null);
      }

  /** Función que lee de un secuencial que hay dentro de un jar
   * @param bd conexión a la bd
   * @param jar nombre y ruta del jar
   * @param txts[] array de ficheros txt que se van a leer
   * @param carpeta nombre de la carpeta que contiene los txt
   * @param pbf que es el progressbarform de la finestra principal
   * @return true si no ha dado error de lectura, ni al abrir el jar
   **/
    public static boolean leerSecuencial(DBConnection bd, String txts[],String carpeta, String nomjar, ProgressBarForm pbf, int ultimReg []) {
      InsertadorDeRegistres iReg= new InsertadorDeRegistres();
			iReg.setjar(nomjar);
      boolean result=false;
      for (int i=0;i< txts.length;i++) {
        if ( pbf!=null )  {
          pbf.setPercent(0);
          }
        if (ultimReg!=null) result=iReg.leerFicheroSecuencial(bd,carpeta,txts[i],pbf,ultimReg[i]);
        else result=iReg.leerFicheroSecuencial(bd,carpeta,txts[i],pbf,0);
        if(!result) break;
        }
      System.out.println("Estado de cancelar conversion:"+iReg.cancelarConversion);
      return result;
      }



  public static String URL_AFINITY = "http://afinity.geyce.es" ; // "http://172.27.15.180";
  public static boolean grabarDatosAfinity(String nif ,boolean infoMsg) {
    Select snifes     = new Select(connEA);
    Table  tbnifes    = new Table(snifes,"nifes");
    Table  tbcdp      = new Table(snifes,"cdp");
    Field cdpcodi       = new Field(snifes,tbcdp,"cdpcodi");
    Field cdppwd        = new Field(snifes,tbcdp,"cdppwd");
    Field cdpaeatdele   = new Field(snifes,tbcdp,"cdpaeatdele");
    Field cdpaeatadm    = new Field(snifes,tbcdp,"cdpaeatadm");
    Field danifcif      = new Field(snifes,tbnifes,"danifcif");
    Field datfisicajuri = new Field(snifes,tbnifes,"datfisicajuri");
    Field datnombre     = new Field(snifes,tbnifes,"datnombre");
    Field datapell1     = new Field(snifes,tbnifes,"datapell1");
    Field datapell2     = new Field(snifes,tbnifes,"datapell2");
    Field datsiglas     = new Field(snifes,tbnifes,"datsiglas");
    Field datvia        = new Field(snifes,tbnifes,"datvia");
    Field datnum        = new Field(snifes,tbnifes,"datnum");
    Field datpuerta     = new Field(snifes,tbnifes,"datletra");
    Field datesc        = new Field(snifes,tbnifes,"datesc");
    Field datletra      = new Field(snifes,tbnifes,"datletra");
    Field datpiso       = new Field(snifes,tbnifes,"datpiso");
    Field datpobla      = new Field(snifes,tbnifes,"datpobla");
    Field datcpos       = new Field(snifes,tbnifes,"datcpos");
    Field dattel        = new Field(snifes,tbnifes,"dattel");
    Field datfax        = new Field(snifes,tbnifes,"datfax");
    Field datmuni       = new Field(snifes,tbnifes,"datmuni");
    Field datprov       = new Field(snifes,tbnifes,"datprov");
    Field letetiq       = new Field(snifes,tbnifes,"datletraseti");
    Field datemail      = new Field(snifes,tbnifes,"datemail");
    Field datcontacto   = new Field(snifes,tbnifes,"datcontacto");
    snifes.setFrom("(nifes INNER JOIN cdp ON nifes.danifcif=cdp.cdpnifcif)");
    snifes.setWhere("danifcif='"+nif+"'");
    snifes.execute();
    if ( snifes.isEof() ) {
      if ( infoMsg ) Maefc.message("No se ha podido generar un nuevo CDP");
      return false;
      }

    String passw=Util.generarNum(6);
      if (!grabarDatosAfinity(cdpcodi.getString(),danifcif.getString(),datfisicajuri.getString(),
              passw,datnombre.getString(), datapell1.getString(),
              datapell2.getString(),datsiglas.getString(),
              datvia.getString(),datnum.getString(),datesc.getString(),
              datpiso.getString(),datletra.getString(),
              datpobla.getString(),datcpos.getString(),
              datmuni.getInteger(), datprov.getInteger(),
              dattel.getString(),datfax.getString(),
              datcontacto.getString(),datemail.getString(),"S")) {
          if ( infoMsg ) Maefc.message("No se ha podido generar un nuevo CDP");
          return false;
          }
      else {
        if ( infoMsg ) {
          	String cdpcdpcdp =buscaCDP(danifcif.getString());
			if ( cdpcdpcdp==null ) cdpcdpcdp=cdpcodi.getString();
          Maefc.message("Se ha generado un nuevo cliente de Afinity con los siguientes parámetros:\n"+
                  "\nCódigo de cliente: "+cdpcdpcdp+
                  "\nUsuario:           ADMINISTRADOR"+
                  "\nContraseña:        "+passw+
                  "\n\nComunique al cliente que para acceder a la información desde Afinity debe conectarse a:\n"+
                  "\nhttp://afinity.geyce.es\n"+
                  "\n\nAl entrar en el área de sólo clientes, deberá introducir un Nombre de Usuario\n"+
                  "y una Contraseña. Estos dos parámetros serán:\n"+
                  "\nNombre de Usuario: "+cdpcdpcdp+
                  "\nContraseña:        "+passw,"Información",Maefc.INFORMATION_MESSAGE);
          }
        }
    return true;
    }

  public static String buscaCDP(String nif) {
	  String codCDP=null;
	  Azure az = new Azure ("agpi2dp.getCDPfromNif");
	  az.addParametroURL("codiDP", dominio);
	  az.addParametroURL("nifcif", nif);
	  if (az.procesar()) codCDP = az.getContenido();
	  if ( codCDP== null || codCDP.trim().length() != 12 ) {
		  codCDP = null ;
	      System.out.println("CDP no encontrado en tabla cdp de la base de Datos Afinity ");
	  }
	  return codCDP;
  }


  public static String getFecha(Date fecha ) {
    if ( fecha == null ) return "" ;
    else                 return Fecha.fechaGregoriana(fecha).substring(6,8)+"-"+Fecha.fechaGregoriana(fecha).substring(4,6)+"-"+Fecha.fechaGregoriana(fecha).substring(0,4) ;
    }


  public static boolean grabaUsoAfinity(String dominio, String aplic, String coddato, int ejer,int peri,String nomUser, int datoint1 , int datoint2 , int datoint3 , double datodou1 , double datodou2 , double datodou3 , String datostr1 , String datostr2 , String datostr3 , Date datodat1 , Date datodat2 , Date datodat3  ){
    try {
      String nomPC = nomUser ; nomPC = java.net.InetAddress.getLocalHost().getHostName() ;
      String dns=URL_AFINITY+"/pls/agpi/";
      String procedure = "logusos.setUso";

      String parametres = "pcdp="+dominio+
                                     "&paplic="+aplic+
                                     "&pcoddato="+coddato+
                                     "&pmachine="+nomPC+
                                     "&pusuario="+nomUser+
                                     "&pejer="+ejer+
                                     "&pperi="+peri+
                                     "&pdatoint1="+datoint1+
                                     "&pdatoint2="+datoint2+
                                     "&pdatoint3="+datoint3+
                                     "&pdatodou1="+datodou1+
                                     "&pdatodou2="+datodou2+
                                     "&pdatodou3="+datodou3+
                                     "&pdatostr1="+datostr1+
                                     "&pdatostr2="+datostr2+
                                     "&pdatostr3="+datostr3+
                                     "&pdatodat1="+getFecha(datodat1)+
                                     "&pdatodat2="+getFecha(datodat2)+
                                     "&pdatodat3 ="+getFecha(datodat3);


    Azure az0 = new Azure (procedure);
    az0.addParametroURL("pcdp", dominio);
    az0.addParametroURL("paplic", aplic);
    az0.addParametroURL("pcoddato", coddato);
    az0.addParametroURL("pmachine", nomPC);
    az0.addParametroURL("pusuario", nomUser);
    az0.addParametroURL("pejer", ejer);
    az0.addParametroURL("pperi", peri);
    az0.addParametroURL("pdatoint1", datoint1);
    az0.addParametroURL("pdatoint2", datoint2);
    az0.addParametroURL("pdatoint3", datoint3);
    az0.addParametroURL("pdatodou1", datodou1);
    az0.addParametroURL("pdatodou2", datodou2);
    az0.addParametroURL("pdatodou3", datodou3);
    az0.addParametroURL("pdatostr1", datostr1);
    az0.addParametroURL("pdatostr2", datostr2);
    az0.addParametroURL("pdatostr3", datostr3);
    az0.addParametroURL("pdatodat1", getFecha(datodat1));
    az0.addParametroURL("pdatodat2", getFecha(datodat2));
    az0.addParametroURL("pdatodat3", getFecha(datodat3));
    return az0.procesar();
    }
  catch(Exception e ) {
    System.out.println("Error 13 : "+e);
    }
  return false;
  }

  public static boolean getUsos(String dominio, String aplic,String producto , DBConnection connDB, String nomUser  ){
    try {
      // APPAU , Programar aqui la futura fucnion getUso , que a partir de la procedure getUso se podra ejecutar X veces la funcion setUso
      // int datoint1 , int datoint2 , int datoint3 , double datodou1 , double datodou2 , double datodou3 , String datostr1 , String datostr2 , String datostr3 , Date datodat1 , Date datodat2 , Date datodat3


      // System.out.println(" Ini: "+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss") );

      InputStream stream;

        try {
          Azure az1 = new Azure ("logusos.getUsos" );
          az1.addParametroURL ("pcdp",dominio);
          az1.addParametroURL ("paplic",aplic);
          az1.addParametroURL ("pproduc",producto);

            String contenido = "" ;
            if (az1.procesar())  {
              contenido = az1.getContenido();
              if (contenido.indexOf("<error>")>0) {
                  String error = contenido.substring((contenido.indexOf("<error>")+7),contenido.indexOf("</error>"));
                  String mensaje ="Error 13 : " + error ;
                  Maefc.message(mensaje ,"Error",Maefc.ERROR_MESSAGE);
              }
              else {

                DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = builderFactory.newDocumentBuilder();
                stream = new ByteArrayInputStream(contenido.getBytes());
                Document doc = builder.parse(stream);
                XPath xPath = XPathFactory.newInstance().newXPath();
                String expression2 = "/logs/log";
                NodeList titleList = (NodeList) xPath.compile(expression2).evaluate(doc, XPathConstants.NODESET);
                int totalesConvenios=titleList.getLength();
                for ( int i = 0; i < totalesConvenios; i++ ) {
                  NodeList cccAux = titleList.item(i).getChildNodes();
                  String uscaplic        = getString ( cccAux.item(1    ) ) ;
                  String uscdominio      = getString ( cccAux.item(3    ) ) ;
                  String uscproducto     = getString ( cccAux.item(5    ) ) ;
                  String usccoddato      = getString ( cccAux.item(7    ) ) ;
                  String uscfechaini     = getString ( cccAux.item(9    ) ) ;
                  String uscfechafin     = getString ( cccAux.item(11   ) ) ;
                  String usctipo         = getString ( cccAux.item(13   ) ) ;
                  String uscsentencia    = getString ( cccAux.item(15   ) ) ;
                  String uscrecorre      = getString ( cccAux.item(17   ) ) ;
                  String uscborraejer    = getString ( cccAux.item(19   ) ) ;
                  String uscborraperi    = getString ( cccAux.item(21   ) ) ;
                  String uscdesde        = getString ( cccAux.item(23   ) ) ;
                  String uschasta        = getString ( cccAux.item(25   ) ) ;
                  String uscprogram      = getString ( cccAux.item(27   ) ) ;
                  String uscventana      = getString ( cccAux.item(29   ) ) ;
                  String uscaccion       = getString ( cccAux.item(31   ) ) ;
                  String usctipoau       = getString ( cccAux.item(33   ) ) ;
                  getUso(connDB,usuario,uscaplic,dominio ,uscproducto,usccoddato,uscfechaini,uscfechafin,usctipo,uscsentencia,uscrecorre,uscborraejer,uscborraperi,uscdesde,uschasta,uscprogram,uscventana,uscaccion ,usctipoau ) ;
                  }
                }
              }
          }
        catch(Exception ex) {
          ex.printStackTrace();
          System.out.println("Error 14:"+ex.getMessage());
          }
        }
    catch(Exception e ) {
      System.out.println("Error 14b : "+e);
      }

    // System.out.println(" Fin: "+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss") );

     return false;
     }


  public static void getUso(DBConnection connDB ,String usuario ,String uscaplic  , String uscdominio , String uscproducto, String usccoddato, String uscfechaini, String uscfechafin, String usctipo , String uscsentencia , String uscrecorre , String uscborraejer , String uscborraperi , String uscdesde, String uschasta , String uscprogram , String uscventana , String uscaccion ,    String usctipoau ) {
    ErrorManager actual = Aplication.getAplication().getErrorManager();
    try {
    if ( usctipo != null && usctipo.equals("S") && uscsentencia != null && !uscsentencia.equals("") ) { // Tipo Sentencia

      mae.easp.general.JEaError errorManager = new mae.easp.general.JEaError();
      Aplication.getAplication().setErrorManager(errorManager);

      Selector selector = new Selector(connDB);
      selector.execute(uscsentencia);
      while ( selector.next() ) {

        int datoint1 = 0 ; int datoint2 = 0 ; int datoint3 = 0 ;
        double datodou1 = 0.0 ; double datodou2 = 0.0 ; double datodou3 = 0.0 ;
        String datostr1 = "" ; String datostr2 = "" ; String datostr3 = "" ;
        Date datodat1 = null ; Date datodat2 = null ; Date datodat3 = null ;

        int numint = 1 ; int numdou = 1 ; int numstr = 1 ; int numdat = 1 ;

        for ( int i = 0 ; i < selector.getColumnCount() ; i++ ) {
          int tipo = selector.getColumnType(i+1) ;
          // System.out.println("coddato: ["+usccoddato+"] campo: ["+i+"] Tipo: ["+tipo+"] sentencia: ["+uscsentencia+"]");

            if      ( tipo == 4 && numint == 1 )  { numint++; datoint1 = selector.getint(i+1); }
            else if ( tipo == 4 && numint == 2 )  { numint++; datoint2 = selector.getint(i+1); }
            else if ( tipo == 4 && numint == 3 )  { numint++; datoint3 = selector.getint(i+1); }
            else if ( tipo == 8 && numdou == 1 )  { numdou++; datodou1 = selector.getdouble(i+1);  }
            else if ( tipo == 8 && numdou == 2 )  { numdou++; datodou2 = selector.getdouble(i+1);  }
            else if ( tipo == 8 && numdou == 3 )  { numdou++; datodou3 = selector.getdouble(i+1);  }
            else if ( tipo == 93 && numdat == 1 ) { numdat++; datodat1 = selector.getDate(i+1); }
            else if ( tipo == 93 && numdat == 2 ) { numdat++; datodat2 = selector.getDate(i+1); }
            else if ( tipo == 93 && numdat == 3 ) { numdat++; datodat3 = selector.getDate(i+1); }
            else if ( tipo == 4 && numdou == 1 )  { numdou++; datodou1 = selector.getint(i+1); }
            else if ( tipo == 4 && numdou == 2 )  { numdou++; datodou2 = selector.getint(i+1); }
            else if ( tipo == 4 && numdou == 3 )  { numdou++; datodou3 = selector.getint(i+1); }
            else if ( numstr == 1 )               { numstr++; datostr1 = selector.getString(i+1); }
            else if ( numstr == 2 )               { numstr++; datostr2 = selector.getString(i+1); }
            else if ( numstr == 3 )               { numstr++; datostr3 = selector.getString(i+1); }

          }

        // String horaini = Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss") ;

        int tipoWhereExtra = 0 ;
        if      ( uscborraperi != null && uscborraperi.equals("1") ) tipoWhereExtra = 13;
        else if ( uscborraperi != null && uscborraperi.equals("2") ) tipoWhereExtra = 14;
        else if ( uscborraperi != null && uscborraperi.equals("3") ) tipoWhereExtra = 15;
        else if ( uscborraperi != null && uscborraperi.equals("4") ) tipoWhereExtra = 16;

        grabaUsoAfinity(uscdominio, uscaplic, usccoddato, 0, tipoWhereExtra , usuario , datoint1, datoint2, datoint3, datodou1, datodou2, datodou3, datostr1, datostr2, datostr3, datodat1, datodat2, datodat3);

        // System.out.println("     subIni:  ["+horaini+"] subFin: "+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss") );
        // System.out.println("             datoint1: ["+datoint1+"] datoint2: ["+datoint2+"] datoint3: ["+datoint3+"] datodou1: ["+datodou1+"] datodou2: ["+datodou2+"] datodou3: ["+datodou3+"]  datostr1: ["+datostr1+"] datostr2: ["+datostr2+"] datostr3: ["+datostr3+"]  datodat1: ["+datodat1+"] datodat2: ["+datodat2+"] datodat3: ["+datodat3+"]");
        // System.out.println("");

        if ( uscrecorre == null || !uscrecorre.equals("S") ) {
          break;
          }
        }

      selector.close() ;


      }
    else if ( usctipo != null && usctipo.equals("U")) { //Tipo Uso/Audition

      }


    }
    catch(Exception e ) {
      System.out.println("Error 5: ["+e+"]");
      }

    Aplication.getAplication().setErrorManager(actual);

    }



  public static java.util.Date getDate(org.w3c.dom.Node node) {
    java.util.Date retorn = null ;
    try {
      String fec = "" ;
      if  ( node != null &&  node.getFirstChild() != null ) {
        fec = node.getFirstChild().getNodeValue();
        if ( fec != null && !fec.equals("") && fec.length() == 10 ) {
          retorn =  Fecha.construyeFecha( Integer.parseInt(fec.substring(0, 2)), Integer.parseInt(fec.substring(3, 5)) , Integer.parseInt(fec.substring(6)) )  ;
        }
      }
    }
    catch(Exception e ) {
      return null ;
    }
    return retorn ;
  }


  public static String getString(org.w3c.dom.Node node) {
    String retorn = null ;
    try {
      String fec = "" ;
      if  ( node != null &&  node.getFirstChild() != null ) {
        retorn = node.getFirstChild().getNodeValue();
      }
    }
    catch(Exception e ) {
      return null ;
    }
    return retorn ;
  }



	/**Funció per gravar les taules de datgen, clientedp, usuario, contratado i Uso a Afinity
	 * amb les dades del cdp. Crida a una procedure que s'encarrega de gravar
	 * @param cdp, codigo del cdp
	 * @param nif, nif del cdp
	 * @param fj, string que determina si es de tipo fisica o juridica
	 * @param pwd, la contraseña para el accesos a afinity
	 * @param nombre, nombre del dp
	 * @param ape1, primer apellido o razón social
	 * @param ape2, segundo apellido
	 * @param siglas, siglas del tipo de vía
	 * @param via, nombre de la vía
	 * @param num, número de la vía
	 * @param esc, número o letra de la escalera (si tiene)
	 * @param piso, número o letra del piso
	 * @param letra, letra del piso
	 * @param pobla, población en la que se encuentra
	 * @param cp, código postal
	 * @param muni, código numérico del municipio
	 * @param prov, código numérico de la provincia
	 * @param tel, número de teléfono
	 * @param fax, número del fax
	 * @param contacto, persona de contacto
	 * @param email, email del cdp
	 * @return true si el procedure de afinity ha ido bien
	 * */
	public static boolean grabarDatosAfinity(String cdp, String nif, String fj, String pwd,
	                                         String nombre, String ape1, String ape2,
																					 String siglas, String via, String num,
																					 String esc, String piso, String letra,
																					 String pobla, String cp, int muni, int prov,
																					 String tel, String fax, String contacto, String email, String altafromprg){
		//String dns="http://afinity.geyce.es/pls/agpi/agpi2dp.";
		String dns=URL_AFINITY+"/pls/agpi/";
        String nombreAfinity = (nombre+" "+ape1+" "+ape2).trim();
        String procedure = "agpi2dp.AgpiAltaCDP";
        String parametres = "?pdp="+codiDP+"&pdatcodigo="+cdp+"&pdatipo=C&pdatnombre="+
		           			"&pdatapell1="+nombreAfinity+"&pdatapell2="+"&pdatnifcif="+nif+
		           			"&pdatsiglas="+siglas+"&pdatvia="+via+"&pdatnum="+num+
							"&pdatesc="+esc+"&pdatpiso="+piso+"&pdatletra="+letra+
							"&pdatpobla="+pobla+"&pdatmuni="+muni+"&pdatprov="+prov+"&pdatcpos="+cp+
							"&pdattel="+tel+"&pdatfax="+fax+"&pdatfisicajuri="+fj+"&pdatemail="+email+
							"&pdatcontacto="+contacto+"&puspwd="+pwd+"&altafromprg="+altafromprg;
        if (esAzure()) {
        	nombreAfinity = (nombre+" "+ape1+" "+ape2).trim();
        	parametres = "?pdp="+codiDP+"&pdatcodigo="+cdp+"&pdatipo=C&pdatnombre="+
           			"&pdatapell1="+nombreAfinity+"&pdatapell2="+"&pdatnifcif="+nif+
           			"&pdatsiglas="+siglas+"&pdatvia="+via+"&pdatnum="+num+
					"&pdatesc="+esc+"&pdatpiso="+piso+"&pdatletra="+letra+
					"&pdatpobla="+pobla+"&pdatmuni="+muni+"&pdatprov="+prov+"&pdatcpos="+cp+
					"&pdattel="+tel+"&pdatfax="+fax+"&pdatfisicajuri="+fj+"&pdatemail="+email+
					"&pdatcontacto="+contacto+"&puspwd="+pwd+"&altafromprg="+altafromprg;
        }
		Azure az0 = new Azure (procedure);
		az0.addParametroURL ("pdp",codiDP);
		az0.addParametroURL ("pdatcodigo",cdp);
		az0.addParametroURL ("pdatipo","C");
		az0.addParametroURL ("pdatnombre","");
		az0.addParametroURL ("pdatapell1",nombreAfinity);
		az0.addParametroURL ("pdatapell2","");
		az0.addParametroURL ("pdatnifcif",nif);
		az0.addParametroURL ("pdatsiglas",siglas);
		az0.addParametroURL ("pdatvia",via);
		az0.addParametroURL ("pdatnum",num);
		az0.addParametroURL ("pdatesc",esc);
		az0.addParametroURL ("pdatpiso",piso);
		az0.addParametroURL ("pdatletra",letra);
		az0.addParametroURL ("pdatpobla",pobla);
		az0.addParametroURL ("pdatmuni",muni);
		az0.addParametroURL ("pdatprov",prov);
		az0.addParametroURL ("pdatcpos",cp);
		az0.addParametroURL ("pdattel",tel);
		az0.addParametroURL ("pdatfax",fax);
		az0.addParametroURL ("pdatfisicajuri",fj);
		az0.addParametroURL ("pdatemail",email);
		az0.addParametroURL ("pdatcontacto",contacto);
		az0.addParametroURL ("puspwd",pwd);
		az0.addParametroURL ("altafromprg",altafromprg);
        return az0.procesar();
	  }


  public static String getTipoBD(String sDominio ) {
	  String resu="";
	  Azure az = new Azure ("agpi2dp.gettipobd");
	  az.addParametroURL ("pcod",sDominio);
	  if (az.procesar()) resu = az.getContenido();
	  return resu;
  }

  public static java.util.Hashtable <String,String> parametresAplic(String sDominio, String sServei) {

	java.util.Hashtable <String,String> htParametres = new java.util.Hashtable <String,String> ();

	String contingut ="";
    Azure az = new Azure ("agpi2dp.getURLConnect");
    az.addParametroURL ("pcod",sDominio);
    az.addParametroURL ("pservicio",sServei);
    if (az.procesar()) contingut = az.getContenido();

    int pini=1;
    int pfin=1;
    if (contingut!=null && !contingut.trim().equals("")) {
    	int i=0;
    	boolean noHeAcabat=true;
    	while (noHeAcabat) {
    		pfin = contingut.indexOf("@#",pini);
    		if (pfin<0)
    			noHeAcabat=false;
    		else {
    			++i;
  	    		String tmpSubstring = contingut.substring(pini,pfin);
        		pini=pfin+2;
		        switch(i) {
		           case 3:
		             htParametres.put("SERVER",tmpSubstring);
		             break;
		           case 4:
		             htParametres.put("TIPO",tmpSubstring);
		             break;
		           case 11:
		             htParametres.put("USER",tmpSubstring);
		             break;
		           case 12:
		             htParametres.put("PASSWORD",tmpSubstring);
		             break;
		        }
//		        ++i;
    		}
        }
    }
    return htParametres;
  }

  /**
   * inserta Acciones en la Tabla LOPDACC
   */
  public static boolean setAccionLOPD(String aplic , int ejer , String user , String tipoAccion , String program , String programDesc , String cdpcodi , String nif  ) {
    Select slopdacc   = new Select(connEA);
    Table  tblopdacc  = new Table(slopdacc    , "lopdacc");
    Field  fdlopdacodigo          = new Field(slopdacc,tblopdacc  , "lopdacodigo"    );
    Field  fdlopdaaplic           = new Field(slopdacc,tblopdacc  , "lopdaaplic"     );
    Field  fdlopdaejer            = new Field(slopdacc,tblopdacc  , "lopdaejer"      );
    Field  fdlopdauser            = new Field(slopdacc,tblopdacc  , "lopdauser"      );
    Field  fdlopdapuesto          = new Field(slopdacc,tblopdacc  , "lopdapuesto"    );
    Field  fdlopdafechaacc        = new Field(slopdacc,tblopdacc  , "lopdafechaacc"  );
    Field  fdlopdahoraacc         = new Field(slopdacc,tblopdacc  , "lopdahoraacc"   );
    Field  fdlopdatipacc          = new Field(slopdacc,tblopdacc  , "lopdatipacc"    );
    Field  fdlopdaprogram         = new Field(slopdacc,tblopdacc  , "lopdaprogram"   );
    Field  fdlopdadescprog        = new Field(slopdacc,tblopdacc  , "lopdadescprog"  );
    Field  fdlopdacodicdp         = new Field(slopdacc,tblopdacc  , "lopdacodicdp"   );
    Field  fdlopdanif             = new Field(slopdacc,tblopdacc  , "lopdanif"       );

    slopdacc.addNew();
    fdlopdaaplic      .setValue(aplic);
    fdlopdaejer       .setValue(ejer);
    fdlopdauser       .setValue(user);
    try {
     fdlopdapuesto     .setValue(java.net.InetAddress.getLocalHost().getHostName());
      }
    catch(Exception e ) { fdlopdapuesto     .setNull(); };
    fdlopdafechaacc   .setValue(Maefc.getDate() );
    fdlopdahoraacc    .setValue(Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss")  );
    fdlopdatipacc     .setValue(tipoAccion);
    fdlopdaprogram    .setValue(program);
    fdlopdadescprog   .setValue(programDesc);
    fdlopdacodicdp    .setValue(cdpcodi);
    fdlopdanif        .setValue(nif);
    slopdacc.insert();
    slopdacc.commit();
    return true;
    }



   public static boolean setFileFromjar(String directorioDestino, String fichero, String ficheroDestino){
      try {
        //si no se encuentra el fichero para extraer se abandona
        InputStream in=obreFitxerDeDinsElJar(fichero);
        if (in==null) {
          System.out.println("El fichero "+fichero +" no se ha podido extraer. ");
          return false;
          }
        //si no existe el directorio de extracción, se crea
        java.io.File direct=new java.io.File(directorioDestino);
        if (!direct.isDirectory()) {
          if (!direct.mkdirs()) {
            System.out.println("El fichero "+fichero +" no se ha podido extraer . ");
            return false;
            }
          }
        FileOutputStream out = new FileOutputStream(ficheroDestino);
        byte[]  buf = new byte[1024];
        int  n;
        while((n = in.read(buf)) > 0) {
          out.write(buf, 0, n);
          }
        out.close();
        in.close();
        return true;
        }
      catch (Exception e) {
        System.out.println("El fichero "+fichero +" no se ha podido extraer. Error: ["+e+"]");
        return false;
        }
      }

  public static InputStream obreFitxerDeDinsElJar(String fitxer) {
    return ZipFileReader.obreFitxerDeDinsElJar(fitxer);
    }


  public static void abrirExplorer(String url,boolean modal ) {
    mae.modasp.general.Modasp.abrirExplorer (url,modal);/*
	  try {
		  String pathExplorer = "c:\\Archivos de Programa\\Internet Explorer\\IEXPLORE.EXE";

		  if (!existeFichero(pathExplorer)) pathExplorer= "c:\\Program Files\\Internet Explorer\\IEXPLORE.EXE";

		  try {
        String param = Easp.getParam("PATHEXPLORER","GENERAL");
        if ( param != null &&  existeFichero(param) ) {
          pathExplorer = param ;
          }
        }
      catch (  Exception eeee ) {
        System.out.println("Error abrirExplorer PathExplorer : ["+eeee+"]");
        }


		  if (!existeFichero(pathExplorer)) {
			  Maefc.message("No tiene instalado Microsoft Internet Explorer en su ubicación por defecto.\nPóngase en contacto con Geyce para poder utilizar esta opción.\n\nGracias.");
		  }
		  String [] params=new String[]{pathExplorer,url};
	      if ( modal ) {
	    	  Process p=Runtime.getRuntime().exec(params);
	    	  p.waitFor();
	      } else {
	    	  Process p=Runtime.getRuntime().exec(params);
	      }
	   } catch (SecurityException ex) {
		   System.out.println("Error security exception:"+ex);
	   } catch (java.io.IOException e) {
		   System.out.println("Error ioexception:"+e);
	   } catch (InterruptedException iex) {
		   System.out.println("Error InterruptedException:"+iex);
	   } catch (Exception  e2) {
		   System.out.println("Error exception:"+e2);
     }                                                    */
   }

  public static void abrirFichero (String destino) {
	  try {
		  int ret = Windows.ShellExecute("open", destino, null, null, Windows.SW_SHOWNORMAL);
		  if (ret <= 32) {
			  switch (ret) {
	      		case Windows.ERROR_FILE_NOT_FOUND:
	      			ErrorManagerDefault.generalEx(null, "Archivo " + destino + " no se encuentra");
	      			break;
	      		case Windows.ERROR_PATH_NOT_FOUND:
	      			ErrorManagerDefault.generalEx(null, "Carpeta " + destino + " no se encuentra");
	      			break;
	      		default:
	      			ErrorManagerDefault.generalEx(null, "Error al abrir el archivo");
	      			break;
			  }
		  }
	  }
	  catch (Exception ex) {
	      ErrorManagerDefault.generalEx(ex, "No ha sido posible abrir el borrador del modelo");
	  }
  }

  public static void abrirFicheroConMsg (String destino) {
	  try {
		  int ret = Windows.ShellExecute("open", destino, null, null, Windows.SW_SHOWNORMAL);
		  if (ret <= 32) {
			  switch (ret) {
	      		case Windows.ERROR_FILE_NOT_FOUND:
	      			Maefc.message("Archivo " + destino + " no se encuentra","¡Atención!");
	      			break;
	      		case Windows.ERROR_PATH_NOT_FOUND:
	      			Maefc.message("Carpeta " + destino + " no se encuentra","¡Atención!");
	      			break;
	      		default:
	      			Maefc.message("Error al abrir el archivo","¡Atención!");
	      			break;
			  }
		  }
	  }
	  catch (Exception ex) {
		  Maefc.message("No ha sido posible abrir el fichero del modelo","¡Atención!");
	  }
  }

/* ++++++++++++++++++++  Gestió d'errors  +++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

  private static String stackTrace = null;
  /* Funció que monta l'html que dóna format a la finestra detalle
   * @param vdetalle, finestra on es coloquen els controls
   * @return String, l'html dins un buffer
  */
  public static String stringHTMLError(Form vdetalle){
      try {
          final StringBuffer salida = new StringBuffer();
          salida.append("<html>");
          salida.append("<head>");
          salida.append("<title>Detalle de la incidencia</title>");
          salida.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
          salida.append("</head>");
          salida.append("<body bgcolor=\"#e0efef\" topmargin=\"10\">");
          salida.append("<form>");
          salida.append("<table cellspacing=\"0\" cellpadding=\"1\" border=\"0\" width=\"100%\">");
          salida.append("<tr><td align=\"center\" bgcolor=\"#205080\">");
          salida.append("<table cellspacing=\"0\" cellpadding=\"1\" border=\"0\" width=\"100%\">");
          salida.append("<tr>");
          salida.append("<td bgcolor=\"#e0efef\" align=\"center\">");
          salida.append("<table width=\"100%\" align=\"center\" cellpadding=\"1\" cellspacing=\"1\">");
  	    	new ControlValueIterator(vdetalle) {
              public boolean action(ControlValue c) {
                  salida.append("<tr>");
                  salida.append("<td bgcolor=\"#C4CEE1\" width=\"15%\" valign=\"top\" nowrap>&nbsp;&nbsp;<font face=\"arial\" size=\"2\">"+c.getTitle()+"</font>&nbsp;</td>");
                  salida.append("<td bgcolor=\"#FFFFEF\" width=\"85%\"><input name=\""+c.getName()+"\" type=\"text\"></td>");
                  salida.append("</tr>");
                  return true;
              }
    	    }.run();
          salida.append("</table>");
          salida.append("</td></tr></table></td></tr></table>");
          salida.append("</form>");
          salida.append("</body>");
          salida.append("</html>");
          return salida.toString();
    	} catch (Exception e){
          System.out.println("Error al montar el HTML:"+e.getMessage());
  		return null;
    	}
  }

  /* Funció que crea un control per a la finestra vdetalle
   * @param nomField, nom del camp
   * param titol, títol del control en castellà
   * @param size, longitut del control. si supera els
   * 80 caracters, el control serà un ControlEditPane
   * @param valor, valor del control
   * @param vdetalle, finestra on es coloquen els controls
  */
  private static void crearControles(String nomField, String titol, int size, String valor, Form vdetalle){
      try{
          if (size > 80){
              ControlEditPane ctr = new ControlEditPane(vdetalle);
              vdetalle.addControl(ctr);
              ctr.setName(nomField);
              ctr.setTitle(titol);
              ctr.setType(Value.STRING);
              ctr.setEnabled(false);
              ctr.setPrintable(true);
              ctr.setLength(size);
              int s = (size / 80) + 1;
              ctr.setLook(new LookCtr(s));
              ctr.setBackground(new java.awt.Color(250,250,250));
              ctr.setValue(valor);
          } else {
              ControlEdit ctr=new ControlEdit(vdetalle);
              vdetalle.addControl(ctr);
              ctr.setName(nomField);
              ctr.setTitle(titol);
              ctr.setType(Value.STRING);
              ctr.setEnabled(false);
              ctr.setPrintable(true);
              ctr.setLength(size);
              ctr.setBackground(new java.awt.Color(250,250,250));
              ctr.setValue(valor);
          }
      } catch(Exception e){
          System.out.println("Error al crear control:"+nomField+"."+e.getMessage());
      }
  }

  /* Class pensada per a quan sigui necessari tenir un control
   * que permeti més d'una linia d'edició  (ControlEditPane)
   */
  static class LookCtr extends LookComponent  {
      /* El cosntructor reb l'alçada del control
       * @param alz, número de linies a mostrar*/
      public LookCtr(int alz) {
          super();
          setLength(58);
          setHeight(alz);
      }
  }

  /* Funció que recorre la hash d'elemets d'errorParamJ
   * per a crear cadascún dels controls que hi haurà a la
   * finestra vdetalle
   * @param epara, element en l' ErrorManager
   * @param vdetalle, finestra on es coloquen els controls
  */
  public static void colocarControlesDetalle(ErrorParamJ epara, Form vdetalle, String context){
      for(java.util.Enumeration e = epara.keys() ; e.hasMoreElements();){
          String campo = (String) e.nextElement();
          Object obj = epara.get(campo);
          String elemento = getElemento(campo);
          String valor = null;
          if (obj != null){
              if (campo.equals("StackTrace")){
            	  setStack((String) obj);
              } else if(obj instanceof Integer){
                  if (campo.equals("Type")){
                      valor = String.valueOf(obj) + ". Tipo de Error";
                  } else {
                      valor = String.valueOf(obj) + ". Error de SQL";
                  }
              } else {
                  valor = (String) obj;
              }
              if (valor != null){
                  crearControles(campo, elemento, valor.length(), valor, vdetalle);
              }
          }
      }
      if (context != null && !context.equals("")){
          crearControles("contexto", "Contexto", context.length(), context, vdetalle);
      }
  }

  /* Funció que assigna el valor de la variable stackTrace
   * @param st, cadena amb el texte de la pila
  */
  public static void setStack(String st){
      stackTrace = st;
  }

  /* Funció que retorna el valor de la variable stackTrace
   * @return String, cadena amb el texte de la pila
  */
  public static String getStack(){
      return stackTrace;
  }

  /* Funció que retorna el texte en castellà de l'element
   * de l'ErrorManager
   * @param texto, element en l' ErrorManager
   * @return String, títol en castellà de l'element
  */
  public static String getElemento(String texto){
      String ret ="";
  	if (texto.equals("Message")){
          ret = "Mensaje";
  	} else if (texto.equals("Program")){
          ret = "Programa";
      } else if (texto.equals("Aplication")){
          ret = "Aplicación";
      } else if (texto.equals("Form")){
          ret = "Módulo";
      } else if (texto.equals("Control")){
          ret = "Casilla";
      } else if (texto.equals("Report")){
          ret = "Informe";
      } else if (texto.equals("DataBase")){
          ret = "Base de Datos";
      } else if (texto.equals("SQLCode")){
          ret = "Código SQL";
      } else if (texto.equals("Type")){
          ret = "Tipo de error";
      } else if (texto.equals("SQLMessage")){
          ret = "Error SQL";
      } else if (texto.equals("ExceptionMessage")){
          ret = "Excepción";
      } else {
          ret = texto;
      }
      return ret;
  }

//Funció que monta finestra del message de MAEFC pero s'ha canviat per dir-li els botons que s'ha de mostrar
//i es passa com a opcion
public static int messageConNuevosBotones(String message, String titol, int icono, String  [] opcions)
 {
   java.awt.Component frame = geyce.maefc.swing.WSystemView.getTopComponent();
   if (frame != null)
   {
     javax.swing.JOptionPane meu = new javax.swing.JOptionPane();
     meu.setMessage(message);
     meu.setMessageType(icono);
     meu.setOptions(opcions);
     javax.swing.JDialog dlg = meu.createDialog(frame, titol);

     dlg.addWindowListener(new java.awt.event.WindowAdapter()
     {
       public void windowOpened(java.awt.event.WindowEvent e)
       {
         final javax.swing.JDialog d = (javax.swing.JDialog) e.getSource();

         javax.swing.JRootPane root = javax.swing.SwingUtilities.getRootPane(d);
         if (root != null)
         {
           javax.swing.AbstractAction nextControl = new javax.swing.AbstractAction()
           {
             public void actionPerformed(java.awt.event.ActionEvent event)
             {
               java.awt.Component c = d.getFocusOwner();
               geyce.maefc.swing.WView.nextControl(c);
             }
           };
           javax.swing.AbstractAction prevControl = new javax.swing.AbstractAction()
           {
             public void actionPerformed(java.awt.event.ActionEvent event)
             {
               java.awt.Component c = d.getFocusOwner();
               geyce.maefc.swing.WView.previousControl(c);
             }
           };
           javax.swing.AbstractAction enter = new javax.swing.AbstractAction()
           {
             public void actionPerformed(java.awt.event.ActionEvent event)
             {
               java.awt.Component c = d.getFocusOwner();
               if (c instanceof javax.swing.JButton)
               {
                 ((javax.swing.JButton) c).doClick();
               }
             }
           };

           root.registerKeyboardAction(nextControl, javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, 0), javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
           root.registerKeyboardAction(prevControl, javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, 0), javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
           root.registerKeyboardAction(enter, javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0), javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
           root.setDefaultButton(null);
         }
       }
     });

     dlg.setVisible(true);
     dlg.dispose();
     Object selectedValue = meu.getValue();

     if (selectedValue == null)
       return javax.swing.JOptionPane.CLOSED_OPTION;
     int opcioSeleccionada = 0;
     for (int i=0;i<opcions.length;i++) {
       if (opcions[i].toString().equals(selectedValue.toString()))
         opcioSeleccionada = i+1;
     }
     if (opcioSeleccionada!=0)
       return opcioSeleccionada;
     else
       return javax.swing.JOptionPane.CLOSED_OPTION;
   }
   else
   {
     System.out.println(titol + ": " + message);
     return javax.swing.JOptionPane.OK_OPTION;
   }

 }
 //------------------

public static void asignaResolucioInicial() {
   java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
   double width = screenSize.getWidth();
   double height = screenSize.getHeight();
   int pantallaWidth = 1024;
   int pantallaHeight = 768;
   if (width<pantallaWidth || height<pantallaHeight) {
	   ((javax.swing.JFrame)((geyce.maefc.swing.WViewAplication)Aplication.getAplication().getView()).getComponentView()).setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
   }
   else {
	   ((javax.swing.JFrame)((geyce.maefc.swing.WViewAplication)Aplication.getAplication().getView()).getComponentView()).setSize(pantallaWidth, pantallaHeight);
	   Maefc.center((java.awt.Component)((javax.swing.JFrame)((geyce.maefc.swing.WViewAplication)Aplication.getAplication().getView()).getComponentView()));
   }
}


public static String getNomPC() {
    String nomPC = "PC-DESCONOCIDO";
    try {
       nomPC = java.net.InetAddress.getLocalHost().getHostName();
      }
    catch(Exception e ) {
      }
    return Modasp.cutrpad(nomPC,25).trim();
}


public static String getPrefixeNow() {
	SimpleDateFormat hora=new SimpleDateFormat("HHmmss");
	return Fecha.fechaGregoriana(Maefc.getDate())+hora.format(new Date());
}


public static boolean esAzure() {
	return HOST == TIPO_HOST.AZURE;
}


public static void setSecurityMD5 (boolean security) {
	securityMD5 = security;
}

public static boolean isSecurityMD5 () {
	return securityMD5;
}


 } //fin classe EASP

 //classe per insertar registres (degudament formatats)
 //provinents d'un seqüencial
 class InsertadorDeRegistres extends ZipFileReader {
  String jar;
  InsertadorDeRegistres(String jar) {
    this.jar=jar;
    }
  InsertadorDeRegistres() {
    this.jar="modasp.jar";
    }

  /** Función de asignación del jar
   * @param jar nombre y ruta del jar
   **/
  public void setjar(String jar) {
    this.jar=jar;
    }

  /** Función que retorna el nombre y ruta del jar  **/
  public String getJar() {
    return jar;
    }

  /** Función que abre el jar
   * @return true si se ha podido abrir
   **/
  public boolean obrirJar() {
    return obrir(jar);
    }

  /** Función que retorna la línia del secuencial
   * @param linia
   * @return la linia
   **/
  public String getLinia(String linia) {
    try {
      return linia;
      }
    catch(Exception e) {
      e.printStackTrace();
      return null;
      }
    }


  /** Función que parsea la linia del secuencial para que se puedan
   * hacer inserts. Esta función llama al parser de fechas y de nulls
   * @param linia del secuencial que se va a parsear
   **/
  private String parserLiniaSQL(DBConnection connIR, String linia) {
    if (!cancelarConversion) {
      linia=ponerFechas(connIR, linia);
      if (!cancelarConversion)
        linia=ponerNulls(linia);
      }
    return linia;
    }

  /** Función que pone nulls en una linia de un secuencial a
   * aquellos campos que no tienen contenido
   * @param linia del secuencial que se va a parsear
   * @return la linea con los campos vacíos a null
   **/
  public String ponerNulls(String linia) {
    StringBuffer sb= new StringBuffer(linia);
    int pos=0;
    int desde=0;
    do {
      pos=sb.toString().indexOf(",,",desde);
      if (pos == -1) break;
      sb.insert(pos+1,"null");
      desde=pos+4;
      }
     while (true);
    if (sb.toString().substring(0,1).equals(","))
      sb.insert(0,"null");
    if (sb.toString().endsWith(","))
      sb.append("null");
    return sb.toString();
    }


  /** Función que valida el formato de fecha y les pone #
   * @param linia del secuencial que se va a parsear
   * @return la linea con los campos de fecha parseados con #
   **/
  private String ponerFechas(DBConnection coonnIR, String linia) {
    StringBuffer sb= new StringBuffer(linia);
    String tipoBD = null;
    tipoBD=coonnIR.getDB().getType().toUpperCase() ;
    
    int inici=0;
    int fincampo=0;
    if (sb.toString().substring(0,1).equals(",")) inici++;
    do {
      if (cancelarConversion) break;
      if ((fincampo=sb.toString().indexOf(",",inici))== -1)    break;
      if (fincampo > inici && isDate(sb.toString().substring(inici,fincampo-1))){
        if ( tipoBD.equals("ACCESS") ) {
          sb.insert(inici,"#");
          sb.insert(fincampo+1,"#");
          }
        else {
          String fecha = "'"+sb.toString().substring(inici+3,inici+5)+"-"+sb.toString().substring(inici,inici+3)+sb.toString().substring(inici+6,inici+10)+"'" ;
          sb.delete(inici,fincampo);
          sb.insert(inici,fecha);
          }
        }
      inici=fincampo+1;
      }

    while (true);
    if (isDate(sb.toString().substring(inici))) {
      if ( tipoBD.equals("ACCESS") ) {
        sb.insert(inici,"#");
        sb.insert(fincampo+1,"#");
        }
      else {
        String fecha = "'"+sb.toString().substring(inici+3,inici+5)+"-"+sb.toString().substring(inici,inici+3)+sb.toString().substring(inici+6,inici+10)+"'" ;
        sb.delete(inici,fincampo);
        sb.insert(inici,fecha);
        }
      }
    return sb.toString();
    }


  /*
  public String ponerFechas(String linia) {
    StringBuffer sb= new StringBuffer(linia);
    int inici=0;
    int fincampo=0;
    if (sb.toString().substring(0,1).equals(",")) inici++;
    do {
      if (cancelarConversion) break;
      if ((fincampo=sb.toString().indexOf(",",inici))== -1)    break;
      if (fincampo > inici && isDate(sb.toString().substring(inici,fincampo-1))){
        sb.insert(inici,"#");
        sb.insert(fincampo+1,"#");
        }
      inici=fincampo+1;
      }
    while (true);
    if (isDate(sb.toString().substring(inici))) {
      sb.insert(inici,"#");
      sb.append("#");
      }
    return sb.toString();
    }
  */

  public boolean cancelarConversion=false; //variable global que permite cancelar la conversión

  /** Función determina si un string es una fecha de formato
   * mes-dia-año. si el primer grupo no es un mes se cancela la
   * conversión
   * @param fecha string de fecha
   * @return true si es una fecha con formato mes-dia-año
   **/
  public boolean isDate(String fecha) {
    try {
      SimpleDateFormat dataformat=  new SimpleDateFormat ("MM-dd-yyyy");
      Date dfecha = dataformat.parse(fecha);
      if (!primeroEsMes(fecha)){
        cancelarConversion=true;
        return false;
        }
      return true;
      }
    catch (ParseException p) {
      return false;
      }
    }



  /** Función que determina si el primer elemento de una cadena
   * fecha es un mes
   * @param fecha string de fecha
   * @return true si el primer elemento es un mes posible
   **/
  public boolean primeroEsMes(String fecha) {
    return  Integer.parseInt(fecha.substring(0,fecha.indexOf("-"))) < 13;
    }

  /** Función que hace un insert en la bd de la tabla indicada
   * @param bd la conexión de la bd en la que se hace el insert
   * @param linia grupo de valores que se van a insertar
   * @param tabla nombre de la tabla en la que se insertan valores
   * @return true si procede la inserción. si se cancela la
   * conversión o se produce un error durante la inserción, false
   **/
  public boolean insertarLinia(DBConnection bd, String linia, String tabla, int nReg) {
    try {
      if (cancelarConversion) return false;
      String valorLinea = parserLiniaSQL(bd, linia);
      if (nReg>0) {
          int pos = Util.sch(valorLinea,',');
          if (pos!=-1 ) valorLinea = String.valueOf(nReg)+","+valorLinea.substring(pos+1);
      }
      System.out.println("INSERT INTO "+tabla+" VALUES ("+valorLinea+")");
      bd.executeUpdate("INSERT INTO "+tabla+" VALUES ("+valorLinea+")");
      return true;
      }
    catch(Exception e) {
      e.printStackTrace();
      System.out.println("No se ha podido hacer el insert");
      return false;
      }
    }


  }


 //clase para leer del contenido de ficheros secuenciales que hay en
 //un fichero comprimido (zip, jar, tar, etc.)
abstract class ZipFileReader {
  java.util.zip.ZipFile zipfile;
  java.io.InputStreamReader read;
  java.io.BufferedReader in;
  java.util.zip.ZipEntry entry;

  /** Función que abre el fichero comprimido
   * @param zip ubicación y nombre del zip
   * @return true si se ha podido abrir
   **/
  public boolean obrir(String zip) {
    try {
      java.io.File filezip= new java.io.File(zip);
      if (!filezip.exists()) return false;
      zipfile = new java.util.zip.ZipFile(filezip);
      return true;
      }
    catch(Exception e) {
      System.out.println("EXCEPTION: No se ha podido abrir el JAR ("+e+")");
      return false;
      }
    }


  /** Función cierra el fichero zip abierto   **/
  public void tancar() {
    try {
      zipfile.close();
      //System.out.println("Se cierra el zip");
      }
    catch(Exception e) {
      e.printStackTrace();
      }
    }

  public boolean leerFicheroSecuencial(DBConnection bd,String carpeta,String tabla,ProgressBarForm pbf) {
      return leerFicheroSecuencial(bd,carpeta,tabla, pbf,0);
  }

  /** Función que lee de un fichero secuencial con nombre de tabla
   * @param bd base de datos a la que se conecta
   * @param carpeta nombre de la carpeta dentro del zip donde está
   * el secuencial
   * @param tabla nombre de la tabla (fichero secuencial)
   * @return true si se ha podido leer correctamente y se ha podido
   * insertar la línea o si no existe el fichero
   **/
  public boolean leerFicheroSecuencial(DBConnection bd,String carpeta,String tabla,ProgressBarForm pbf, int ultimReg) {
System.out.println("leerFicheroSecuencial : fichero ["+tabla+"]");
    boolean reAssigna = false;
    if (ultimReg>0) reAssigna = true;
    try {
      if (pbf!=null)
        pbf.setState("Actualizando "+tabla+"...");
      InputStream inst=obreFitxerDeDinsElJar(carpeta+"/"+tabla+".txt");
      /*
      // ****** añadido para pruebas para que lea los ficheros de disco y no de jar o zip  *********
      if (inst==null) {
        try {
          inst =new java.io.FileInputStream(carpeta+"/"+tabla+".txt");
          }
        catch(Exception e) {
          System.out.println("Error : ["+e+"]");
          }
        }
      // **************************************************************************************
      */
      if (inst==null) return true;
      String str="";
      try {
        // java.io.File ar=new java.io.File(carpeta+"/"+tabla+".txt");
        read=new java.io.InputStreamReader(inst);
        in=new java.io.BufferedReader(read);
        int lenfit = inst.available();

        int contpbf=1;
        while ((str = in.readLine())!= null) {
          // if (pbf!=null && ar.length() > 0 ) {
           if (pbf!=null && lenfit > 0 ) {
            contpbf+=str.length();
            // System.out.println("ar.length()  : ["+ar.length()+"]  contpbf() : ["+contpbf+"]  ");
            // int result=(int)(100*(contpbf)/(ar.length()));
             int result=(int)(100*(contpbf)/(lenfit));
            pbf.setPercent(result);
           }
           int nouNro = 0;
           if (reAssigna) {
              ++ultimReg;
              nouNro = ultimReg;
           }
          if (!insertarLinia(bd,str,tabla,nouNro)) return false;
          }
        in.close();
        read.close();
        }
      catch (Exception e) {
        System.out.println("EXCEPTION: Error incontrolado "+e);
        return false;
        }
      return true;
      }
    catch(IllegalStateException  ie) {
      System.out.println("EXCEPTION: Error al leer fichero ERROR:"+ie);
      return false;
      }
    }

  /** Función que lee de un fichero secuencial sin pbf
   * @param bd base de datos a la que se conecta
   * @param carpeta nombre de la carpeta dentro del zip donde está
   * el secuencial
   * @param tabla nombre de la tabla (fichero secuencial)
   * @return true si se ha podido leer correctamente y se ha podido
   * insertar la línea o si no existe el fichero
   **/
  public boolean leerFicheroSecuencial(DBConnection bd,String carpeta,String tabla) {
    return leerFicheroSecuencial(bd,carpeta,tabla,null);
    }

  /*
  // Se modifica esta funcion esto solo servia para JAVA de SUN
  private InputStream obreFitxerDeDinsElJar(String fitxer) {
    try {
      return Aplication.getAplication().getClass().getClassLoader().getResourceAsStream(fitxer);
      }
    catch(Exception exi) {
      return null;
      }
    }
   */

  public static InputStream obreFitxerDeDinsElJar(String fitxer) {
    try {
      if ( isJavaMicrosoft() ) {
        return ClassLoader.getSystemResourceAsStream(fitxer);
        }
      else   {
        return Aplication.getAplication().getClass().getClassLoader().getResourceAsStream(fitxer);
        }
      }
    catch(Exception exi) {
      System.out.println("Error en el ClassLoader de "+fitxer+":"+exi);
      return null;
      }
  }


  /** Función que determina si la aplicación es de entorno Microsof o Javasun
   * @return true si es de Microsoft o false si es de SUN
   **/
  public static boolean isJavaMicrosoft(){
    return Aplication.getAplication().getConfig("MICROSOFT").equals("SI");
    }





  abstract public String getLinia(String linia);
  abstract public boolean insertarLinia(DBConnection bd,String linia, String tabla, int nReg);


  }
