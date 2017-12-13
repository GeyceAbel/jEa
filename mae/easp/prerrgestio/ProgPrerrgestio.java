// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20171213
// Hora:             17:14:24
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prerrgestio;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prerrgestio
// Nombre:   Gestión de Errores
// Versión:  1.0
// 
public class ProgPrerrgestio extends Program
  {
  public AppEasp easp;
  public ProgPrerrgestio prerrgestio;
  // Inicio declaraciones globales
  public  ErrorParam param   = null;
  public  String message     = null;
  public  String contexto    = null;
  public  String tituloApli  = null;
  private ErrorParamJ     eparam  = null;
  private String modulo   = null;
  private String aplicacion = null;
  private String programa = null;
  private boolean esAzure = false;
  
  /* funció que crea els objectes d'ErrorParam
   * si no existeix 
   */
  private void initErrorParam(){
      param = new ErrorParam(new Exception(), "");
  }
  
  /* Funció que codifica un texte en UTF-8 per a poder passar-lo
   * per URL (per tema accents, espais, intros, etc.
   * @param texte, texte que es codificarà
   * @return String, cadena codificada o "" en cas que el texte sigui null
  */
  private String codificar(String texte) throws java.io.UnsupportedEncodingException {
      if (texte == null){
          return "";
      } else {
          return java.net.URLEncoder.encode(texte,"UTF-8");
      }
  }
  
  /* Funció que retorna el nom de la aplicació que es guarda 
   * a la BD
   * @param apli, nom de la aplicació que ve donat pel getAplication
   * @return String, nom que es guardarà a la taula Partes
  */
  private String getNomAplicacio(String apli){
      String nom = apli;
      if (apli.equals("EASP")){
          nom = "EA";
      } else  if (apli.equals("MODASP")){
          nom = "JMODELOS";
          if (tituloApli != null 
              && tituloApli.startsWith("VirtualFISC")){
              nom = "TELFISC";
          }
      } else if (apli.equals("NOMASP")){
          nom = "JNOMINA";
          if (tituloApli != null 
              && tituloApli.startsWith("VirtualLAB")){
              nom = "TELLAB";
          }
      } else if (apli.equals("CONTAASP")){
          nom = "JCONTA";
      } else if (apli.equals("RRHH")){
          nom = "JRRHH";
      } 
      return nom;
  }
  
  /* Funció que obté, a través d'una procedure d'oracle,
   * la resposta a un parte segons el seu contexto
   * @param contexto, codi de contexto pel qual es filtrarà
   * @return String, la resposta si l'ha trobat o un texte que 
   * indica que no existeix resposta o no hi ha contexto
  */
  private String getRespuesta(String contexto){
      if (contexto == null){
          return "<NO>";// SE HA ESPECIFICADO EL CONTEXTO DEL ERROR>\n\n"
               //+ "Pulse sobre el botón Problemas / Soluciones "
               //+ "documentados para localizar una posible solución.\nGracias.";
      }
      String resu = "";
      Azure az = new Azure ("starterdp.getSolContexto","contexto="+contexto);
      if (az.procesar()) resu = az.getContenido();
      return resu;
  }
  // Fin declaraciones globales
  // Ventana
  public FormVincidencia vincidencia;
  // Selects
  // Ventana
  public FormVdatos vdatos;
  // Selects
  // Ventana
  public FormVdetalle vdetalle;
  // Selects
  // Ventana
  public FormVstacktrace vstacktrace;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Gestión de Errores");
      }
    }
    
  public class FormVincidencia extends ProcessForm
    {
    // Controles
    public CtrlVvaplicacion vvaplicacion;
    public CtrlVvmensaje vvmensaje;
    public CtrlVvsolucion vvsolucion;
    public CtrlBotdetalles botdetalles;
    // Acciones
    public LinkAcsoldocum acsoldocum;
    public LinkAcenviarcon acenviarcon;
    public LinkAccontinuar accontinuar;
    public LinkAcsalir acsalir;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlVvaplicacion extends ControlLabel
      {
      public CtrlVvaplicacion(Form form)
        {
        super(form);
        setName("vvaplicacion");
        setMessageHelp("Alpicación");
        setTitle("aplicacion");
        }
      }
      
    public class CtrlVvmensaje extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(55);
          setHeight(3);
          }
        }
        
      public CtrlVvmensaje(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvmensaje");
        setMessageHelp("Mensaje de error");
        setTitle("Mensaje");
        setType(STRING);
        setLength(4000);
        setEnabled(false);
        }
      }
      
    public class CtrlVvsolucion extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(65);
          setHeight(8);
          }
        }
        
      public CtrlVvsolucion(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvsolucion");
        setMessageHelp("Posible solución");
        setTitle("Solución");
        setType(STRING);
        setLength(4000);
        setEnabled(false);
        }
      }
      
    public class CtrlBotdetalles extends ControlButton
      {
      public CtrlBotdetalles(Form form)
        {
        super(form);
        setName("botdetalles");
        setMessageHelp("Detalle de error");
        setTitle("Detalles...");
        setTitle("Detalles...");
        }
      public void onClick()
        {
        super.onClick();
        eparam = new ErrorParamJ(param,false);
        vdetalle=new FormVdetalle(prerrgestio);
        Easp.colocarControlesDetalle(eparam, vdetalle, contexto);
        LayoutHtml lhtml=new LayoutHtml();
        lhtml.setContent(new java.io.StringReader(Easp.stringHTMLError(vdetalle)));
        vdetalle.setLayout(lhtml);
        vdetalle.run();
        }
      }
      
    public class LinkAcsoldocum extends Action
      {
      public LinkAcsoldocum(Form form)
        {
        super(form);
        setName("acsoldocum");
        setTitle("&1. Problemas / Soluciones documentados");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        String filtro="";
        if (aplicacion != null){
            filtro = "apli="+aplicacion;
        }
        if (programa != null){
            filtro += "&program="+programa;
        }
        if (modulo != null){
           filtro += "&modul="+modulo;
        }
        
        Easp.abrirExplorer("http://"+Azure.getRealHost()+"pls/agpi/starterdp.getSolucionesDoc?"+filtro,false);
        //Easp.abrirExplorer("http://afinity.geyce.es/pls/agpi/starterdp.getSolucionesDoc?"+filtro,true);
        }
      }
      
    public class LinkAcenviarcon extends Action
      {
      public LinkAcenviarcon(Form form)
        {
        super(form);
        setName("acenviarcon");
        setTitle("&2. Enviar consulta al Servicio Técnico");
        setOptions(SEARCH | SHOW | UPDATE | INSERT | EOF);
        }
      public void onAction()
        {
        super.onAction();
        vdatos.open();
        
        }
      }
      
    public class LinkAccontinuar extends Action
      {
      public LinkAccontinuar(Form form)
        {
        super(form);
        setName("accontinuar");
        setTitle("&3. Cerrar  ventana de Incidencia");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        prerrgestio.exit();
        }
      }
      
    public class LinkAcsalir extends Action
      {
      public LinkAcsalir(Form form)
        {
        super(form);
        setName("acsalir");
        setTitle("&4. Salir");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        prerrgestio.exit();
        Aplication.getAplication().exit();
        }
      }
      
    public FormVincidencia(ProgPrerrgestio prerrgestio)
      {
      super(prerrgestio);
      setName("vincidencia");
      setTitle("Incidencia");
      setLocation(new Location());
      addControl(vvaplicacion=new CtrlVvaplicacion(this));
      addControl(vvmensaje=new CtrlVvmensaje(this));
      addControl(vvsolucion=new CtrlVvsolucion(this));
      addControl(botdetalles=new CtrlBotdetalles(this));
      addAction(acsoldocum=new LinkAcsoldocum(this));
      addAction(acenviarcon=new LinkAcenviarcon(this));
      addAction(accontinuar=new LinkAccontinuar(this));
      addAction(acsalir=new LinkAcsalir(this));
      }
    }
    
  public class FormVdatos extends ProcessForm
    {
    // Inicio declaraciones globales
    private boolean checkControles(){
        if (vvambito.isNull()){
            Maefc.message("'Departamento' campo obligatorio.\nPor favor, seleccione "
                        + "el departamento al cual\nva dirigida la "
                        + "consulta.\nGracias","Campo obligatorio"
                        ,Maefc.INFORMATION_MESSAGE);
            vvambito.activate();
            return false;
        } 
        if (vvtxtconsulta.isNull()){
            Maefc.message("'Texto' campo obligatorio.\nPor favor, escriba el motivo "
                        + "de su consulta en este campo.\nGracias"
                        ,"Campo obligatorio",Maefc.INFORMATION_MESSAGE);
            vvtxtconsulta.activate();
            return false;
        }
        if (vvcontacto.isNull()){
            Maefc.message("'Contacto' campo obligatorio.\nPor favor, indíquenos el "
                        + "nombre de la persona con la cual debemos contactar.\nGracias"
                        ,"Campo obligatorio",Maefc.INFORMATION_MESSAGE);
            vvcontacto.activate();
            return false;
        }
        if (vvtelefono.isNull()){
            Maefc.message("'Teléfono' campo obligatorio.\nPor favor, indíquenos el "
                        + "número de teléfono mediante el cual podremos "
                        + "contactar con usted.\nGracias"
                        ,"Campo obligatorio",Maefc.INFORMATION_MESSAGE);
            vvtelefono.activate();
            return false;
        }
        return true;
    }
    
    private String getDepartamento(String apli){
        String dep = null;
        if (apli.equals("JRRHH") || apli.equals("JNOMINA")
            || apli.equals("TELLAB")){
            dep = "LABORAL";
        } else if (apli.equals("JEO") || apli.equals("JCONTA")
                || apli.equals("ECONTA") || apli.equals("TELFISC") 
                || apli.equals("JMODELOS")){
            dep = "FISCAL";
        } else if (apli.equals("JEA") || apli.equals("AGPI")){
            dep = "SISTEMAS";
        }
        return dep;
    }
    // Fin declaraciones globales
    // Controles
    public CtrlVvmensaje vvmensaje;
    public CtrlVvaplicacion vvaplicacion;
    public CtrlVvambito vvambito;
    public CtrlVvtipologia vvtipologia;
    public CtrlVvidioma vvidioma;
    public CtrlVvtxtconsulta vvtxtconsulta;
    public CtrlVvcontacto vvcontacto;
    public CtrlVvtelefono vvtelefono;
    public CtrlVvemail vvemail;
    // Acciones
    public LinkAcconsulta acconsulta;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(750);
        setHeight(460);
        setTitle("Datos de la consulta");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvmensaje extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          setHeight(2);
          }
        }
        
      public CtrlVvmensaje(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvmensaje");
        setMessageHelp("Mensaje de la incidencia");
        setTitle("");
        setType(STRING);
        setLength(4000);
        setEnabled(false);
        }
      }
      
    public class CtrlVvaplicacion extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setBackground(Look.color(243,243,213));
          }
        }
        
      public CtrlVvaplicacion(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvaplicacion");
        setMessageHelp("Nombre de la aplicación que ha generado el error");
        setTitle("Aplicación");
        setType(STRING);
        setLength(8);
        setEnabled(false);
        }
      }
      
    public class CtrlVvambito extends ControlComboBox
      {
      public CtrlVvambito(Form form)
        {
        super(form);
        setName("vvambito");
        setMessageHelp("Ámbito departamental al que pertence la consulta");
        setTitle("Departamento");
        setType(STRING);
        setMaskInput("U");
        setLength(8);
        setDescriptionShow(false);
        addItem("COMER/COMERCIAL");
        addItem("FORMACIO/CURSOS");
        addItem("QUALITAT/DIRECTOR CALIDAD");
        addItem("FISCAL/FISCAL Y CONTABLE");
        addItem("LABORAL/LABORAL Y GESTIÓN DESPACHO");
        addItem("ADMIN/PERSONAL ADMINISTRATIVO DE GEYCE");
        addItem("SISTEMAS/SISTEMAS Y ENTORNO APLICACIONES");
        }
      }
      
    public class CtrlVvtipologia extends ControlComboBox
      {
      public CtrlVvtipologia(Form form)
        {
        super(form);
        setName("vvtipologia");
        setMessageHelp("Tipo de consulta");
        setTitle("Tipología");
        setType(STRING);
        setLength(15);
        setDescriptionShow(false);
        addItem("Consulta");
        addItem("Sugerencia");
        addItem("Error");
        addItem("Reclamación");
        }
      }
      
    public class CtrlVvidioma extends ControlComboBox
      {
      public CtrlVvidioma(Form form)
        {
        super(form);
        setName("vvidioma");
        setMessageHelp("Idioma en el que desea se le conteste la consulta");
        setTitle("Idioma");
        setType(STRING);
        setMaskInput("U");
        setLength(3);
        setDescriptionShow(false);
        addItem("ESP/Castellano");
        addItem("CAT/Catalán");
        }
      }
      
    public class CtrlVvtxtconsulta extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          setHeight(7);
          }
        }
        
      public CtrlVvtxtconsulta(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvtxtconsulta");
        setMessageHelp("Texto descriptivo de la consulta");
        setTitle("Texto");
        setType(STRING);
        setLength(4000);
        }
      }
      
    public class CtrlVvcontacto extends ControlEdit
      {
      public CtrlVvcontacto(Form form)
        {
        super(form);
        setName("vvcontacto");
        setMessageHelp("Persona de contacto");
        setTitle("Contacto");
        setType(STRING);
        setLength(40);
        }
      }
      
    public class CtrlVvtelefono extends ControlEdit
      {
      public CtrlVvtelefono(Form form)
        {
        super(form);
        setName("vvtelefono");
        setMessageHelp("Télefono al que el Servicio Técnico llamará");
        setTitle("Teléfono");
        setType(INTEGER);
        setLength(15);
        }
      }
      
    public class CtrlVvemail extends ControlEdit
      {
      public CtrlVvemail(Form form)
        {
        super(form);
        setName("vvemail");
        setMessageHelp("Email al que el servicio Técnico puedrá contactar con usted");
        setTitle("Email");
        setType(STRING);
        setLength(50);
        }
      }
      
    public class LinkAcconsulta extends Action
      {
      public LinkAcconsulta(Form form)
        {
        super(form);
        setName("acconsulta");
        setTitle("&1. Enviar consulta");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        if (!checkControles()){
            return;
        }
        try {
            eparam = new ErrorParamJ(param,true);
            java.io.ByteArrayOutputStream byt=new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream out=new java.io.ObjectOutputStream(byt);
            out.writeObject(eparam);
            out.flush();
            byte[] bytes = byt.toByteArray();
            out.close();
            String str = mae.general.Base64.encodeBytes(bytes); //new sun.misc.BASE64Encoder().encode(bytes);
            //String str = new String(bytes);
            String str8 = codificar(str);
            String email = "";
            if (!vvemail.isNull()){
                email = vvemail.getString();
            }
            String codi = Aplication.getAplication().getParameter("Dominio");
            String progs = "";    
            if (programa != null){
                progs = "&fprograma="+programa;
            } 
            if (modulo != null){
                progs += "&fmodulo="+modulo;
            }
            String ctxt = "";
            if (contexto != null){
                ctxt = "&contexto="+contexto;
            }
            String parametros = "fcod="+codi
                                +"&faplicacion="+aplicacion + progs
                                +"&ftipologia="+vvtipologia.getString()
                                +ctxt
                                +"&fcontacto="+codificar(vvcontacto.getString())
                                +"&ftelefono="+vvtelefono.getString()
                                +"&fmail="+codificar(email)
                                +"&fidioma="+vvidioma.getString()
                                +"&fambito="+vvambito.getString()
                                +"&ftexto="+codificar(vvtxtconsulta.getString())
                                +"&error="+str8;
           
                   String result = "";
                    Azure az = new Azure ("starterdp.ENVIARCONSULTA",parametros);
                    if (az.procesar()) result = az.getContenido();
            if(result.startsWith("-1")){
                Maefc.message("Error enviando consulta técnica.\nPóngase en contacto con su servicio técnico.\n"+result.substring(3),"Error envío",Maefc.ERROR_MESSAGE);
            } else {
                Maefc.message("Consulta técnica enviada: "+result,"Información",Maefc.INFORMATION_MESSAGE);
                vdatos.exit();
            }
        } catch(Exception e) {
            e.printStackTrace();
            Maefc.message("Error "+e.getMessage());
        }
        }
      }
      
    public FormVdatos(ProgPrerrgestio prerrgestio)
      {
      super(prerrgestio);
      setName("vdatos");
      setTitle("Datos de la consulta");
      setLocation(new Location());
      setModal(true);
      addControl(vvmensaje=new CtrlVvmensaje(this));
      addControl(vvaplicacion=new CtrlVvaplicacion(this));
      addControl(vvambito=new CtrlVvambito(this));
      addControl(vvtipologia=new CtrlVvtipologia(this));
      addControl(vvidioma=new CtrlVvidioma(this));
      addControl(vvtxtconsulta=new CtrlVvtxtconsulta(this));
      addControl(vvcontacto=new CtrlVvcontacto(this));
      addControl(vvtelefono=new CtrlVvtelefono(this));
      addControl(vvemail=new CtrlVvemail(this));
      addAction(acconsulta=new LinkAcconsulta(this));
      }
    public void onInit()
      {
      super.onInit();
      vvmensaje.setValue(message);
      vvaplicacion.setValue(aplicacion);
      vvtipologia.setValue("Consulta");
      vvambito.setValue(getDepartamento(aplicacion));
      vvidioma.setValue("ESP");
      
      }
    }
    
  public class FormVdetalle extends ProcessForm
    {
    // Controles
    // Acciones
    public LinkAcstack acstack;
    public LinkAccerrar accerrar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(800);
        setHeight(450);
        setTitle("Detalle de la incidencia");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class LinkAcstack extends Action
      {
      public LinkAcstack(Form form)
        {
        super(form);
        setName("acstack");
        setTitle("&1. Información técnica");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        vstacktrace.open();
        }
      }
      
    public class LinkAccerrar extends Action
      {
      public LinkAccerrar(Form form)
        {
        super(form);
        setName("accerrar");
        setTitle("&2. Cerrar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        vdetalle.exit();
        }
      }
      
    public FormVdetalle(ProgPrerrgestio prerrgestio)
      {
      super(prerrgestio);
      setName("vdetalle");
      setTitle("Detalle de la incidencia");
      setLocation(new Location());
      setModal(true);
      addAction(acstack=new LinkAcstack(this));
      addAction(accerrar=new LinkAccerrar(this));
      }
    public void onExit()
      {
      super.onExit();
      Easp.setStack(null);
      }
    }
    
  public class FormVstacktrace extends ProcessForm
    {
    // Controles
    public CtrlVvstack vvstack;
    // Acciones
    public LinkAccerrarst accerrarst;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(760);
        setHeight(450);
        setTitle("Líneas de secuencia de error");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvstack extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(62);
          setHeight(20);
          }
        }
        
      public CtrlVvstack(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvstack");
        setMessageHelp("Stack Trace");
        setTitle("");
        setType(STRING);
        setLength(4000);
        setEnabled(false);
        }
      }
      
    public class LinkAccerrarst extends Action
      {
      public LinkAccerrarst(Form form)
        {
        super(form);
        setName("accerrarst");
        setTitle("&1. Cerrar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        vstacktrace.exit();
        }
      }
      
    public FormVstacktrace(ProgPrerrgestio prerrgestio)
      {
      super(prerrgestio);
      setName("vstacktrace");
      setTitle("Líneas de secuencia de error");
      setLocation(new Location());
      setModal(true);
      addControl(vvstack=new CtrlVvstack(this));
      addAction(accerrarst=new LinkAccerrarst(this));
      }
    public void onInit()
      {
      super.onInit();
      vvstack.setValue(Easp.getStack());
      }
    }
    
  public ProgPrerrgestio()
    {
    this.prerrgestio=this;
    setName("prerrgestio");
    setTitle("Gestión de Errores");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vincidencia=new FormVincidencia(this));
    addForm(vdatos=new FormVdatos(this));
    addForm(vdetalle=new FormVdetalle(this));
    addForm(vstacktrace=new FormVstacktrace(this));
    }
  public ProgPrerrgestio(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    setConnection(Easp.connEA);
    esAzure = ("S".equals(Aplication.getAplication().getConfig("EsAzure"))); 
    if (esAzure) vincidencia.acsoldocum.setEnabled(false);
    vdatos.setLayout(new LayoutHtml("mae/easp/html/prerrorgestio_vdatos.html"));
    vstacktrace.setLayout(new LayoutHtml("mae/easp/html/prerrorgestio_vstacktrace.html"));
    String solucion = getRespuesta(contexto);
    if (solucion.equals("<NO>")){
        vincidencia.setLayout(new LayoutHtml("mae/easp/html/prerrorgestio_vincidencia2.html"));
    } else {
        vincidencia.setLayout(new LayoutHtml("mae/easp/html/prerrorgestio_vincidencia.html"));
    }
    super.onInit();
    
    if (param == null){
        initErrorParam();
    } 
    aplicacion = getNomAplicacio(param.getAplication().getName().toUpperCase());
    if ("LABORAL".equals(aplicacion)) aplicacion ="JNOMINA";  
    tituloApli = param.getAplication().getTitle();
    vincidencia.acsalir.setTitle("&4. Salir de "+aplicacion);
    vincidencia.vvaplicacion.setTitle(aplicacion);
    message = param.getMessage();
    vincidencia.vvmensaje.setValue(message);
    vincidencia.vvsolucion.setValue(solucion);
    Program pr = param.getProgram();
    if ( pr != null && pr.getName() != null){
        programa = pr.getName();
    }
    Form fr = param.getForm();
    if ( fr != null && fr.getName() != null){
        modulo = fr.getName();
    }
    }
  }
  
