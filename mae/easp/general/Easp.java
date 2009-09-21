package mae.easp.general;

import mae.general.*;
import mae.jeo.general.Jeo;
import geyce.maefc.*;
import mae.easp.*;
import mae.easp.db.*;
import mae.admon.general.*;
import java.util.*;
import java.text.*;
import java.io.*;

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
  public static String versionAplicacion="6.9";
  public static String versionFecha="Setiembre/2009";
  public static String versionBDEA="6.9";

  //Constantes
  public final static int IVA=16;

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
    java.io.File fileDll=new java.io.File("maefc0108.dll");
    if (!fileDll.exists()) {
      setFileFromjar(destino,"maefc0108.dll",destino+"maefc0108.dll");
      }



    // String carpetaini=Aplication.getAplication().getConfig("carpetaexcel");
    // setFileFromjar(carpetaini,"exportexcel.vbs",carpetaini+"exportexcel.vbs");




    return true;
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



    return true;
    }

  public static DBConnection getConnEA() {
    CatEasp cateasp;
    DataBase db=new DataBase();
    db.setName("bdeasp");
    cateasp = new CatEasp();
    CatAdmon catadmon;
    catadmon = new CatAdmon();
	Catalog array[] = {
      cateasp,catadmon
      };
    db.setCatalogs(array);
    connEA = new DBConnection(db);
    if (connEA.connect())
      return connEA;
    else
      return null;
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
		inmodulo.setValue("jea");
		inprog.setValue(programa);
		inopera.setValue(operacion);
		inmensa.setValue(mensaje);
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
	  return bOk;
  }

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
		  u.valor("datpobla",snif.getString("datflocal"));
		  u.valor("datcpos",snif.getString("datfcpost"));
		  u.valor("dattel",snif.getString("datftel"));
		  u.valor("datfax",snif.getString("datffax"));
		  u.valor("datmovil",snif.getString("datfmovil"));
		  String mail = snif.getString("datfemail");
	      if (mail!=null && mail.length()>30) u.valor("datemail",mail.substring(0,30));
	      else u.valor("datemail",mail);
	      int iprov = 0;
	      try {iprov=Integer.parseInt(snif.getString("datfprov"));}
	      catch (Exception e) { }
	      String muni = snif.getString("datfcodmun");
		  u.valor("datprov",iprov);
	      Selector s2 = new Selector (Easp.connEA);
	      s2.execute("Select * from MUNI347 where mu7codprov="+iprov+" and mu7provmuni='"+muni+"'");
	      if (s2.next()) u.valor("datmuni",s2.getString("mu7muniant"));
	      s2.close();
	      bOk = u.execute("danifcif='"+nif+"'");
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

  /** Función que lee de un secuencial que hay dentro de un jar
   * @param bd conexión a la bd
   * @param jar nombre y ruta del jar
   * @param txts[] array de ficheros txt que se van a leer
   * @param carpeta nombre de la carpeta que contiene los txt
   * @param pbf que es el progressbarform de la finestra principal
   * @return true si no ha dado error de lectura, ni al abrir el jar
   **/
    public static boolean leerSecuencial(DBConnection bd, String txts[],String carpeta, String nomjar, ProgressBarForm pbf) {
      InsertadorDeRegistres iReg= new InsertadorDeRegistres();
			iReg.setjar(nomjar);
      boolean result=false;
      for (int i=0;i< txts.length;i++) {
        if ( pbf!=null )  {
          pbf.setPercent(0);
          }
        result=iReg.leerFicheroSecuencial(bd,carpeta,txts[i],pbf);
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
    snifes.setWhere("(datdominio='"+dominio+"' or datdominio='999999000000') and danifcif='"+nif+"'");
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
          Maefc.message("Se ha generado un nuevo cliente de Afinity con los siguientes parámetros:\n"+
                  "\nCódigo de cliente: "+cdpcodi.getString()+
                  "\nUsuario:           ADMINISTRADOR"+
                  "\nContraseña:        "+passw+
                  "\n\nComunique al cliente que para acceder a la información desde Afinity debe conectarse a:\n"+
                  "\nhttp://afinity.geyce.es\n"+
                  "\n\nAl entrar en el área de sólo clientes, deberá introducir un Nombre de Usuario\n"+
                  "y una Contraseña. Estos dos parámetros serán:\n"+
                  "\nNombre de Usuario: "+cdpcodi.getString()+
                  "\nContraseña:        "+passw,"Información",Maefc.INFORMATION_MESSAGE);
          }
        }
    return true;
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
		String dns=URL_AFINITY+"/pls/agpi/agpi2dp.";

		String url=dns+"AgpiAltaCDP?pdp="+codiDP+"&pdatcodigo="+cdp+"&pdatipo=C&pdatnombre="+parserURL(nombre)+
		           "&pdatapell1="+parserURL(ape1)+"&pdatapell2="+parserURL(ape2)+"&pdatnifcif="+nif+
		           "&pdatsiglas="+siglas+"&pdatvia="+parserURL(via)+"&pdatnum="+parserURL(num)+
							 "&pdatesc="+parserURL(esc)+"&pdatpiso="+parserURL(piso)+"&pdatletra="+parserURL(letra)+
							 "&pdatpobla="+parserURL(pobla)+"&pdatmuni="+muni+"&pdatprov="+prov+"&pdatcpos="+cp+
							 "&pdattel="+tel+"&pdatfax="+fax+"&pdatfisicajuri="+fj+"&pdatemail="+parserURL(email)+
							 "&pdatcontacto="+parserURL(contacto)+"&puspwd="+pwd+"&altafromprg="+altafromprg;
    return URLExec.procesarURL(url);
	  }

  public static String buscaCDP(String nif) {
    String codCDP=null;
		String dns=URL_AFINITY+"/pls/agpi/agpi2dp.";
    String url = dns+"getCDPfromNif?codiDP="+dominio+"&nifcif="+nif;
    codCDP = URLExec.getContenido(url);
    if ( codCDP== null || codCDP.trim().length() != 12 ) {
      codCDP = null ;
      System.out.println("CDP no encontrado en tabla cdp de la base de Datos Afinity ");
      }
    return codCDP;
    }


  public static String getTipoBD(String sDominio ) {
    String dns=URL_AFINITY+"/pls/agpi/agpi2dp.";
    String url = dns+"gettipobd?pcod="+sDominio;
    return URLExec.getContenido(url);
  }

  public static java.util.Hashtable <String,String> parametresAplic(String sDominio, String sServei) {

	java.util.Hashtable <String,String> htParametres = new java.util.Hashtable <String,String> ();
    String url = URL_AFINITY+"/pls/agpi/agpi2dp.getURLConnect?pcod="+sDominio+"&pservicio="+sServei;
    String contingut = URLExec.getContenido(url);
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


/** Convierte según qué caracteres a un código que se pueda utilizar
    * en una URL
   * @param origen, texto que se va a convertir.
   * @return la cadena de texto ya convertida.
   */
   public static String parserURL(String origen){
      StringBuffer sb=new StringBuffer();
      for (int i=0;i< origen.length();i++){
        if (origen.charAt(i)==' ')
          sb.append("%20");
        else if (origen.charAt(i)=='=')
          sb.append("%3D");
        else if (origen.charAt(i)=='?')
          sb.append("%3F");
        else if (origen.charAt(i)=='&')
          sb.append("%26");
        else if (origen.charAt(i)=='+')
          sb.append("%2B");
        else
          sb.append(origen.charAt(i));
        }
        return sb.toString();
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
	  try {
		  String pathExplorer = "c:\\Archivos de Programa\\Internet Explorer\\IEXPLORE.EXE";
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
	   }
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
  private String parserLiniaSQL(String linia) {
    if (!cancelarConversion) {
      linia=ponerFechas(linia);
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
  public String ponerFechas(String linia) {
    StringBuffer sb= new StringBuffer(linia);
    String tipoBD = Aplication.getAplication().getDataBase().getDB().getType().toUpperCase() ;
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
  public boolean insertarLinia(DBConnection bd, String linia, String tabla) {
    try {
      if (cancelarConversion) return false;
      bd.executeUpdate("INSERT INTO "+tabla+" VALUES ("+parserLiniaSQL(linia)+")");
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

  /** Función que lee de un fichero secuencial con nombre de tabla
   * @param bd base de datos a la que se conecta
   * @param carpeta nombre de la carpeta dentro del zip donde está
   * el secuencial
   * @param tabla nombre de la tabla (fichero secuencial)
   * @return true si se ha podido leer correctamente y se ha podido
   * insertar la línea o si no existe el fichero
   **/
  public boolean leerFicheroSecuencial(DBConnection bd,String carpeta,String tabla,ProgressBarForm pbf) {
System.out.println("leerFicheroSecuencial : fichero ["+tabla+"]");
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
          if (!insertarLinia(bd,str,tabla)) return false;
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
  abstract public boolean insertarLinia(DBConnection bd,String linia, String tabla);




  }
