// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20141111
// Hora:             17:17:29
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
  boolean bdjconta     = false;
  
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
    sUser = vexportbd.vvuser.getString();
    sPasswd = vexportbd.vvpasswd.getString();
    
    String serverTmp = sServidor;
    if (!vexportbd.vvinstancia.isNull()) serverTmp += "\\"+vexportbd.vvinstancia.getString();
    
    boolean resultBDEasp    = true ; 
    boolean resultBDModelos = true ;
    boolean resultBDLaboral = true ;
    boolean resultBDJEO     = true;
    boolean resultBDJISS    = true;
    boolean resultBDJRENTA  = true;
    boolean resultBDJCONTA  = true;
  
    if ( bdeasp )                                        resultBDEasp    = traspasaBDAcc2SQL("easp"   ,serverTmp,sUser,sPasswd);
    if ( resultBDEasp && bdmodelos )                     resultBDModelos = traspasaBDAcc2SQL("modelos",serverTmp,sUser,sPasswd);
    if ( resultBDEasp && resultBDModelos && bdlaboral )  resultBDLaboral = traspasaBDAcc2SQL("laboral",serverTmp,sUser,sPasswd); 
    if ( resultBDEasp && resultBDModelos && bdjeo )   resultBDJEO = traspasaBDAcc2SQL("jeo",serverTmp,sUser,sPasswd); 
    if ( resultBDEasp && resultBDModelos && bdjiss )  resultBDJISS = traspasaBDAcc2SQL("jiss",serverTmp,sUser,sPasswd); 
    if ( resultBDEasp && resultBDModelos && bdjrenta )resultBDJRENTA = traspasaBDAcc2SQL("jrenta",serverTmp,sUser,sPasswd); 
    if ( resultBDEasp && resultBDModelos && bdjconta ){
      DBConnection connEAtmp = getConexionEa ("easp", serverTmp, sUser,sPasswd, "sqlserver");
      if (connEAtmp != null) {
        for (int ejerActivo = 2002; resultBDJCONTA && ejerActivo<(Maefc.getYear(Maefc.getDate())+4); ejerActivo++) {
          String ubiCtaspEEEE = sHome+"ctasp"+ejerActivo+".mdb";
          if (Easp.existeFichero(ubiCtaspEEEE)) { 
            resultBDJCONTA = traspasaBDAcc2SQL("ctasp"+ejerActivo,serverTmp,sUser,sPasswd) && actualizaBDSCargadas (9999, ejerActivo,connEAtmp, serverTmp, vexportbd.vvinstancia.getString(), vexportbd.vvpuerto.getInteger() ); 
          }
        }
        connEAtmp.commit();
        connEAtmp.disconnect();
      }
    }
    boolean result = resultBDEasp && resultBDModelos && resultBDLaboral && resultBDJEO && resultBDJISS && resultBDJRENTA && resultBDJCONTA;
  
    if ( result ) {
  
      String serverTmp2 = sServidor;
      if (!vexportbd.vvinstancia.isNull() && vexportbd.vvpuerto.getInteger()>0) serverTmp2 += ":"+vexportbd.vvpuerto.getString();
  
      if ( bdeasp )    {
        conver.setRegistre (Easp.dominio,"EAB"    ,Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);    
  
        Selector sbds = new Selector(Easp.connEA);
        sbds.execute("Select bdnombre,bdversio from bds where bdnombre = 'bdexpe' ");
        if ( sbds.next() ) {
           double version = sbds.getdouble("bdversio");
           if ( version >= 13  ) {
             conver.setRegistre (Easp.dominio,"JGES"    ,Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);    
             }
          }  
        sbds.close();
  
        // vip REVISAR ESTO APPAU - APJORDI  15/09/05 
        String url = "http://afinity.geyce.es/pls/agpi/starterdp.getContratado?domini="+Easp.dominio+"&apli=JCONTA";
        String aplicJconta =URLExec.getContenido(url);
        if ((aplicJconta != null && aplicJconta.startsWith("JCONTA")) || bdjconta) {
           conver.setRegistre (Easp.dominio,"JCONTA"    ,Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);
        }
      }
      if ( bdmodelos )  conver.setRegistre (Easp.dominio,"JMOD"   ,Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);    
      if ( bdlaboral )  conver.setRegistre (Easp.dominio,"JNOM",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);    
      if ( bdjeo )  conver.setRegistre (Easp.dominio,"JEO",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);    
      if ( bdjiss )  conver.setRegistre (Easp.dominio,"JISS",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);    
      if ( bdjrenta )  conver.setRegistre (Easp.dominio,"JRENTA",Aplication.getAplication().getConfig("CONTAB.HOME"),"sqlserver",serverTmp2);    
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
  
  private DBConnection getConexionEa ( String sNom, String sServer, String sUser, String sPasswd,String sTipus) {
    DataBase db=new DataBase();
    db.setName(sNom);
    db.setMyServer(sServer);
    db.setUser(sUser);
    db.setMyPassword(sPasswd);
    db.setType(sTipus);
    CatEasp cateasp = new CatEasp();
    Catalog array[] = {cateasp};
    db.setCatalogs(array);
  
    DBConnection conn = new DBConnection(db);
    try {
      if (conn.connect()) return conn;
      else return null;
    }
    catch (Exception e) {
      return null;
    }
  } 
  
  
  private boolean actualizaBDSCargadas (int iCodiEmp, int iCodiEjer, DBConnection conEA, String ser, String ins, int pue) {
    boolean bOk = true;
    String dp=Aplication.getAplication().getParameter("Dominio");
    String sDominio = dp.substring(0,6)+Util.formateoNumero("000000",iCodiEmp);
    Select sbds        = new Select(conEA);
    Table tbdscargadas = new Table(sbds,"bdscargadas");
    Field bdaplic      = new Field(sbds,tbdscargadas,"bdaplic");
    Field bddominio    = new Field(sbds,tbdscargadas,"bddominio");
    Field bdejer       = new Field(sbds,tbdscargadas,"bdejer");
    Field bdbdnom      = new Field(sbds,tbdscargadas,"bdbdnom");
    Field bdtipo       = new Field(sbds,tbdscargadas,"bdtipo");
    Field bdbduser     = new Field(sbds,tbdscargadas,"bdbduser");
    Field bdbdpass     = new Field(sbds,tbdscargadas,"bdbdpass");
    Field bdbdserv     = new Field(sbds,tbdscargadas,"bdbdserv");
    sbds.setWhere ("bdaplic='contaasp' and bdejer="+iCodiEjer+" and bddominio='"+sDominio+"'");
    sbds.execute();
    if (sbds.isEof()) bOk = false;
    else {
      sbds.edit();
      bdbdnom.setValue  ("ctasp"+iCodiEjer);
      bdtipo.setValue ("sqlserver");
      bdbduser.setValue (conver.getUser());
      bdbdpass.setValue (conver.getPassword());
      if (ins != null && ins.length()>0 && pue>0) bdbdserv.setValue (ser+":"+pue);
      else bdbdserv.setValue (ser);
      bOk = sbds.update();            
    }
    return bOk;
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
    public CtrlVvinstancia vvinstancia;
    public CtrlVvpuerto vvpuerto;
    public CtrlVvuser vvuser;
    public CtrlVvpasswd vvpasswd;
    public CtrlVvbdaccess vvbdaccess;
    public CtrlCheasp cheasp;
    public CtrlChmodelos chmodelos;
    public CtrlChlaboral chlaboral;
    public CtrlChestimacion chestimacion;
    public CtrlChjiss chjiss;
    public CtrlChjrenta chjrenta;
    public CtrlChjconta chjconta;
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
      
    public class CtrlVvinstancia extends ControlEdit
      {
      public CtrlVvinstancia(Form form)
        {
        super(form);
        setName("vvinstancia");
        setTitle("Instancia");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        }
      public void onChange()
        {
        super.onChange();
        }
        public void userChange (Value v) {
          super.userChange (v);
          if (isNull()) {
            vvpuerto.setEnabled(true);
            vvpuerto.setEnabled(false);
          }
          else vvpuerto.setEnabled(true);
        }
      }
      
    public class CtrlVvpuerto extends ControlEdit
      {
      public CtrlVvpuerto(Form form)
        {
        super(form);
        setName("vvpuerto");
        setTitle("Puerto Instancia");
        setType(INTEGER);
        setLength(4);
        setEnabled(false);
        setPrintable(false);
        }
      public boolean obligate()
        {
        return !vvinstancia.isNull();
        }
      }
      
    public class CtrlVvuser extends ControlEdit
      {
      public CtrlVvuser(Form form)
        {
        super(form);
        setName("vvuser");
        setTitle("Usuario");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        }
      public Object getDefault()
        {
        return Aplication.getAplication().getConfig("DataBase.sqlserver.user");
        }
      }
      
    public class CtrlVvpasswd extends ControlEdit
      {
      public CtrlVvpasswd(Form form)
        {
        super(form);
        setName("vvpasswd");
        setTitle("Password");
        setType(STRING);
        setLength(20);
        setPrintable(false);
        }
      public Object getDefault()
        {
        return Aplication.getAplication().getConfig("DataBase.sqlserver.password");
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
      
    public class CtrlChjconta extends ControlCheck
      {
      public CtrlChjconta(Form form)
        {
        super(form);
        setName("chjconta");
        setTitle("BD JCONTA (2002 - ACT)");
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
      addControl(vvinstancia=new CtrlVvinstancia(this));
      addControl(vvpuerto=new CtrlVvpuerto(this));
      addControl(vvuser=new CtrlVvuser(this));
      addControl(vvpasswd=new CtrlVvpasswd(this));
      addControl(vvbdaccess=new CtrlVvbdaccess(this));
      addControl(cheasp=new CtrlCheasp(this));
      addControl(chmodelos=new CtrlChmodelos(this));
      addControl(chlaboral=new CtrlChlaboral(this));
      addControl(chestimacion=new CtrlChestimacion(this));
      addControl(chjiss=new CtrlChjiss(this));
      addControl(chjrenta=new CtrlChjrenta(this));
      addControl(chjconta=new CtrlChjconta(this));
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
    locw.setWidth(640);
    locw.setHeight(320);
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
    vexportbd.chjconta.setEnabled(false);
    
    if ( desdeAplic == null ) {
      bdeasp    =  Easp.existeFichero(sHome+"easp.mdb");
      bdmodelos =  Easp.existeFichero(sHome+"modelos.mdb");
      bdlaboral =  Easp.existeFichero(sHome+"laboral.mdb");
      bdjeo     =  Easp.existeFichero(sHome+"jeo.mdb");
      bdjiss    =  Easp.existeFichero(sHome+"jiss.mdb");
      bdjrenta    =  Easp.existeFichero(sHome+"jrenta.mdb");
      bdjconta    =  Easp.existeFichero(sHome+"ctasp"+Maefc.getYear(Maefc.getDate())+".mdb");
      vexportbd.cheasp.setValue(bdeasp);
      vexportbd.chmodelos.setValue(bdmodelos);
      vexportbd.chlaboral.setValue(bdlaboral);
      vexportbd.chestimacion.setValue(bdjeo);
      vexportbd.chjiss.setValue(bdjiss);
      vexportbd.chjrenta.setValue(bdjrenta);
      vexportbd.chjconta.setValue(bdjconta);
      }
    else {
      bdeasp  = desdeAplic.equals("easp");
      bdmodelos =  desdeAplic.equals("modelos") ;
      bdlaboral =  desdeAplic.equals("laboral") ;
      bdjeo     =  desdeAplic.equals("jeo");
      bdjiss     =  desdeAplic.equals("jiss");
      bdjrenta     =  desdeAplic.equals("jrenta");
      bdjconta     =  desdeAplic.equals("jconta");
      vexportbd.cheasp.setValue(desdeAplic.equals("easp"));
      vexportbd.chmodelos.setValue(desdeAplic.equals("modelos"));
      vexportbd.chlaboral.setValue(desdeAplic.equals("laboral"));  
      vexportbd.chestimacion.setValue(desdeAplic.equals("jeo"));  
      vexportbd.chjiss.setValue(desdeAplic.equals("jiss"));  
      vexportbd.chjrenta.setValue(desdeAplic.equals("jrenta"));  
      vexportbd.chjconta.setValue(desdeAplic.equals("jconta"));  
    
      vexportbd.cheasp.setVisible(desdeAplic.equals("easp"));
      vexportbd.chmodelos.setVisible(desdeAplic.equals("modelos"));
      vexportbd.chlaboral.setVisible(desdeAplic.equals("laboral"));  
      vexportbd.chestimacion.setVisible(desdeAplic.equals("jeo"));
      vexportbd.chjiss.setVisible(desdeAplic.equals("jiss"));  
      vexportbd.chjrenta.setVisible(desdeAplic.equals("jrenta"));  
      vexportbd.chjconta.setVisible(desdeAplic.equals("jconta"));  
      }
    
    vexportbd.vvservidor.setValue(Aplication.getAplication().getConfig("SERVIDOR") );
    vexportbd.vvbdaccess.setValue(sHome);
    
    }
  }
  
