// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20111110
// Hora:             19:04:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.insprexportbd;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: insprexportbd
// Nombre:   Exportación de Base de Datos Microsoft Access hacia  Microsoft SQL Server
// Versión:  1.0
// 
public class ProgInsprexportbd extends Program
  {
  public AppEasp easp;
  public ProgInsprexportbd insprexportbd;
  // Inicio declaraciones globales
  public String desdeAplic = null ;
  
  boolean bdmodelos = false ;
  boolean bdeasp    = false ;
  boolean bdlaboral = false ;
  boolean bdjeo     = false;
  boolean bdjiss     = false;
  boolean bdjrenta     = false;
  
  String sServidor;
  String sBdtmp;
  String sBdAccess;
  String sUser;
  String sPasswd;
  boolean bOk;
  ConverSQLBD conver;
  
  String sHome = Aplication.getAplication().getConfig("Home");
  String sOrigenAcctmp;
  String sDestinoSQLtmp;
  String sServtmp;
  String sUsertmp;
  String sPasswdtmp;
  
  public void proces() {
  
    sServidor = vexportbd.vvservidor.getString();
    sUser = Aplication.getAplication().getConfig("DataBase.sqlserver.user");
    sPasswd = Aplication.getAplication().getConfig("DataBase.sqlserver.password");
    
    boolean resultBDEasp    = true ; 
    boolean resultBDModelos = true ;
    boolean resultBDLaboral = true ;
    boolean resultBDJEO     = true;
    boolean resultBDJISS    = true;
    boolean resultBDJRENTA  = true;
  
    if ( bdeasp )                                        resultBDEasp    = traspasaBDAcc2SQL("easp"   ,sServidor,sUser,sPasswd);
    if ( resultBDEasp && bdmodelos )                     resultBDModelos = traspasaBDAcc2SQL("modelos",sServidor,sUser,sPasswd);
    if ( resultBDEasp && resultBDModelos && bdlaboral )  resultBDLaboral = traspasaBDAcc2SQL("laboral",sServidor,sUser,sPasswd); 
    if ( resultBDEasp && resultBDModelos && bdjeo )   resultBDJEO = traspasaBDAcc2SQL("jeo",sServidor,sUser,sPasswd); 
    if ( resultBDEasp && resultBDModelos && bdjiss )  resultBDJISS = traspasaBDAcc2SQL("jiss",sServidor,sUser,sPasswd); 
    if ( resultBDEasp && resultBDModelos && bdjrenta )resultBDJRENTA = traspasaBDAcc2SQL("jrenta",sServidor,sUser,sPasswd); 
  
    boolean result = resultBDEasp && resultBDModelos && resultBDLaboral && resultBDJEO && resultBDJISS && resultBDJRENTA;
  
    if ( result ) {
      if ( bdeasp )    {
        conver.setRegistre (Easp.dominio,"EAB"    ,Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",sServidor);    
        // vip REVISAR ESTO APPAU - APJORDI  15/09/05 
        String url = "http://afinity.geyce.es/pls/agpi/starterdp.getContratado?domini="+Easp.dominio+"&apli=JCONTA";
        String aplicJconta =URLExec.getContenido(url);
        if (aplicJconta != null && aplicJconta.startsWith("JCONTA")) {
           conver.setRegistre (Easp.dominio,"JCONTA"    ,Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",sServidor);
           }
        }
      if ( bdmodelos )  conver.setRegistre (Easp.dominio,"JMOD"   ,Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",sServidor);    
      if ( bdlaboral )  conver.setRegistre (Easp.dominio,"JNOM",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",sServidor);    
      if ( bdjeo )  conver.setRegistre (Easp.dominio,"JEO",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",sServidor);    
      if ( bdjiss )  conver.setRegistre (Easp.dominio,"JISS",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",sServidor);    
      if ( bdjrenta )  conver.setRegistre (Easp.dominio,"JRENTA",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",sServidor);    
      Maefc.message ("La exportación ha finalizado correctamente.\nEs necesario que cierre todos los programas de GEyCE (jToken,jEA,jModelos .... )  para que los cambios tengan efecto.");
      }
    else {
      Maefc.message ("Se han producido errores.\nSolucione las incidencias y ejecute de nuevo el proceso.");
      }
    
      
    }
  
  public boolean traspasaBDAcc2SQL (String sDestinoSQL,String sServ, String sUser, String sPasswd) { 
      String sOrigenAcc = vexportbd.vvbdaccess.getString()+sDestinoSQL+".mdb";
      boolean bOk = true;
      sOrigenAcctmp  = sOrigenAcc;
      sDestinoSQLtmp = sDestinoSQL;
      sServtmp  = sServ;
      sBdtmp    =  sDestinoSQL;
      sUsertmp  = sUser;
      sPasswdtmp= sPasswd;
      System.out.println ("Conver: ["+sServtmp+"] ["+sBdtmp+"] ["+sUsertmp+"] ["+sPasswdtmp+"]");
      if (Easp.existeFichero(sOrigenAcc)) {
          ProgressBarForm pbf=new ProgressBarForm(this,"Access ("+sOrigenAcctmp+") - SQL Server ("+sDestinoSQLtmp+")",true,true,true) {    
          public void job() {
              conver = new ConverSQLBD (sServtmp, sDestinoSQLtmp, sOrigenAcctmp, sUsertmp, sPasswdtmp);
              conver.setPBF (this);
              conver.creaDB();                     
              exit();
          }
          };
          pbf.setFormWidth(800);
          pbf.setFormHeight(350);
          pbf.setEnabledCancel(true);
          pbf.launch();       
          if (!parserError()) {
          }
          else bOk = false;
      }
      else {
          bOk = false;
          Maefc.message ("No se encuentra la Base de datos Access ["+sOrigenAcc+"]");
      }
      return bOk;
  }
  
  
  
  public boolean parserError () {
      if (conver.getError() == conver.NO_ERR) return false;
      else {
          if (conver.getError() == conver.ERR_DB_EXISTE) {
              Maefc.message ("La Base de Datos "+sBdtmp+" ya esta creada.");
          }
          else if (conver.getError() == conver.ERR_BD_ACCESS_NO_EXISTE) {
              Maefc.message ("La Base de Datos "+sBdtmp+".mdb no existe.");
          }
          else if (conver.getError() == conver.ERR_SQL_NO_INSTALADO) {
              Maefc.message ("No se ha detectado ninguna instalación de SQL Server.");
          }
          else if (conver.getError() == conver.ERR_CONECTAR_SQLSERVER) {
              Maefc.message ("No se puede conectar con el servidor SQLSERVER ubicado en "+sServidor);
          }
          else if (conver.getError() == conver.ERR_DESCONOCIDO) {
              Maefc.message ("Se ha producido el siguiente error :\n   "+partirString(conver.getDescError()));
          }
          else {
              Maefc.message ("Se ha producido un error desconocido. Pongase en contacto con GEyCE.");
          }
          return true;
      }
  }
  
  public String partirString (String s) {
    String sTmp="";
    java.util.StringTokenizer st = new java.util.StringTokenizer(s);
    int i=0;
    String stemp;
    while (st.hasMoreTokens()) {
        i++;
        stemp = st.nextToken();
        if (i==15) {
            sTmp+=stemp+"\n";
            i=0;
        }
        else {
            sTmp+=stemp+" ";
        }
    }
    return sTmp;
  }
  
  // Fin declaraciones globales
  // Ventana
  public FormVexportbd vexportbd;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Exportación de Base de Datos Microsoft Access hacia  Microsoft SQL Server");
      }
    }
    
  public class FormVexportbd extends ProcessForm
    {
    // Controles
    public CtrlVvservidor vvservidor;
    public CtrlVvbdaccess vvbdaccess;
    public CtrlCheasp cheasp;
    public CtrlChmodelos chmodelos;
    public CtrlChlaboral chlaboral;
    public CtrlChestimacion chestimacion;
    public CtrlChjiss chjiss;
    public CtrlChjrenta chjrenta;
    // Acciones
    public LinkAcejecutar acejecutar;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlVvservidor extends ControlEdit
      {
      public CtrlVvservidor(Form form)
        {
        super(form);
        setName("vvservidor");
        setMessageHelp("Servidor SQL Server");
        setTitle("Servidor SQL Server");
        setType(STRING);
        setLength(40);
        setPrintable(false);
        }
      }
      
    public class CtrlVvbdaccess extends ControlEdit
      {
      public CtrlVvbdaccess(Form form)
        {
        super(form);
        setName("vvbdaccess");
        setMessageHelp("Ubicación BD Origen");
        setTitle("Ubicación BD Origen");
        setType(STRING);
        setLength(60);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class CtrlCheasp extends ControlCheck
      {
      public CtrlCheasp(Form form)
        {
        super(form);
        setName("cheasp");
        setTitle("BD EASP");
        }
      }
      
    public class CtrlChmodelos extends ControlCheck
      {
      public CtrlChmodelos(Form form)
        {
        super(form);
        setName("chmodelos");
        setTitle("BD MODELOS");
        }
      }
      
    public class CtrlChlaboral extends ControlCheck
      {
      public CtrlChlaboral(Form form)
        {
        super(form);
        setName("chlaboral");
        setTitle("BD LABORAL");
        }
      }
      
    public class CtrlChestimacion extends ControlCheck
      {
      public CtrlChestimacion(Form form)
        {
        super(form);
        setName("chestimacion");
        setTitle("BD ESTIMACION");
        }
      }
      
    public class CtrlChjiss extends ControlCheck
      {
      public CtrlChjiss(Form form)
        {
        super(form);
        setName("chjiss");
        setTitle("BD JSOCIEDADES");
        }
      }
      
    public class CtrlChjrenta extends ControlCheck
      {
      public CtrlChjrenta(Form form)
        {
        super(form);
        setName("chjrenta");
        setTitle("BD JRENTA");
        }
      }
      
    public class LinkAcejecutar extends Action
      {
      public LinkAcejecutar(Form form)
        {
        super(form);
        setName("acejecutar");
        setTitle("&1. Ejecutar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT | EOF);
        }
      public void onAction()
        {
        super.onAction();
        
        proces();
        
        }
      }
      
    public FormVexportbd(ProgInsprexportbd insprexportbd)
      {
      super(insprexportbd);
      setName("vexportbd");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      addControl(vvservidor=new CtrlVvservidor(this));
      addControl(vvbdaccess=new CtrlVvbdaccess(this));
      addControl(cheasp=new CtrlCheasp(this));
      addControl(chmodelos=new CtrlChmodelos(this));
      addControl(chlaboral=new CtrlChlaboral(this));
      addControl(chestimacion=new CtrlChestimacion(this));
      addControl(chjiss=new CtrlChjiss(this));
      addControl(chjrenta=new CtrlChjrenta(this));
      addAction(acejecutar=new LinkAcejecutar(this));
      }
    }
    
  public ProgInsprexportbd()
    {
    this.insprexportbd=this;
    setName("insprexportbd");
    setTitle("Exportación de Base de Datos Microsoft Access hacia  Microsoft SQL Server");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vexportbd=new FormVexportbd(this));
    }
  public ProgInsprexportbd(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    LocationWindow locw=new LocationWindow();
    locw.setWidth(590);
    locw.setHeight(300);
    locw.setLocation(locw.CENTER);
    setLocation(locw);
    
    String tipo = Easp.getTipoBD(Easp.dominio) ;
    if ( tipo!= null && tipo.equals("sqlserver") && desdeAplic==null) {
      Maefc.message ("La base de datos de jEA ya esta exportada a Microsoft SQL Server","Atención",Maefc.WARNING_MESSAGE);
      return ;
      }
    
    super.onInit();
    
    vexportbd.cheasp.setEnabled(false);
    vexportbd.chmodelos.setEnabled(false);
    vexportbd.chlaboral.setEnabled(false);
    vexportbd.chestimacion.setEnabled(false);
    vexportbd.chjiss.setEnabled(false);
    vexportbd.chjrenta.setEnabled(false);
    
    if ( desdeAplic == null ) {
      bdeasp    =  Easp.existeFichero(sHome+"easp.mdb");
      bdmodelos =  Easp.existeFichero(sHome+"modelos.mdb");
      bdlaboral =  Easp.existeFichero(sHome+"laboral.mdb");
      bdjeo     =  Easp.existeFichero(sHome+"jeo.mdb");
      bdjiss    =  Easp.existeFichero(sHome+"jiss.mdb");
      bdjrenta    =  Easp.existeFichero(sHome+"jrenta.mdb");
      vexportbd.cheasp.setValue(bdeasp);
      vexportbd.chmodelos.setValue(bdmodelos);
      vexportbd.chlaboral.setValue(bdlaboral);
      vexportbd.chestimacion.setValue(bdjeo);
      vexportbd.chjiss.setValue(bdjiss);
      vexportbd.chjrenta.setValue(bdjrenta);
      }
    else {
      bdeasp  = desdeAplic.equals("easp");
      bdmodelos =  desdeAplic.equals("modelos") ;
      bdlaboral =  desdeAplic.equals("laboral") ;
      bdjeo     =  desdeAplic.equals("jeo");
      bdjiss     =  desdeAplic.equals("jiss");
      bdjrenta     =  desdeAplic.equals("jrenta");
      vexportbd.cheasp.setValue(desdeAplic.equals("easp"));
      vexportbd.chmodelos.setValue(desdeAplic.equals("modelos"));
      vexportbd.chlaboral.setValue(desdeAplic.equals("laboral"));  
      vexportbd.chestimacion.setValue(desdeAplic.equals("jeo"));  
      vexportbd.chjiss.setValue(desdeAplic.equals("jiss"));  
      vexportbd.chjrenta.setValue(desdeAplic.equals("jrenta"));  
    
      vexportbd.cheasp.setVisible(desdeAplic.equals("easp"));
      vexportbd.chmodelos.setVisible(desdeAplic.equals("modelos"));
      vexportbd.chlaboral.setVisible(desdeAplic.equals("laboral"));  
      vexportbd.chestimacion.setVisible(desdeAplic.equals("jeo"));
      vexportbd.chjiss.setVisible(desdeAplic.equals("jiss"));  
      vexportbd.chjrenta.setVisible(desdeAplic.equals("jrenta"));  
      }
    
    vexportbd.vvservidor.setValue(Aplication.getAplication().getConfig("SERVIDOR") );
    vexportbd.vvbdaccess.setValue(sHome);
    
    }
  }
  
