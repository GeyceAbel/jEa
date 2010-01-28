// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20100128
// Hora:             10:22:48
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.uspusers;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: uspusers
// Nombre:   Gestión de usuarios
// Versión:  1.3.3
// 
public class ProgUspusers extends Program
  {
  public AppEasp easp;
  public ProgUspusers uspusers;
  // Ventana
  public FormVusuarios vusuarios;
  // Selects
  public Susuarios susuarios;
  public Susagrup susagrup;
  // Ventana
  public FormVgrupos vgrupos;
  // Selects
  public Sgrupos sgrupos;
  public Spertenece spertenece;
  // Ventana
  public FormDatos datos;
  // Selects
  // Ventana
  public FormVcontrasenya vcontrasenya;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Gestión de usuarios");
      }
    }
    
  public class FormVusuarios extends MultiDataForm
    {
    // Inicio declaraciones globales
    boolean todos=false;
    
    public boolean existeUser(){
      Select select=new Select(getDataBase());
      Table usuario=new Table(select,"usuario");
      Field codcon=new Field(select,usuario,"uscodcon");
      Field login=new Field(select,usuario,"uslogin");
      select.setWhere("uscodcon="+Easp.sede+
                    " and uslogin="+uslogin.getSQLFormat());
      select.execute();
      return !select.isEof();
      }
    
    public boolean crearTodos(){
      Select susgrupo=new Select(getDataBase());
      Table usgrupo=new Table(susgrupo,"usgrupo");
      Field usggrupo=new Field(susgrupo,usgrupo,"usggrupo");
      Field usgdescr=new Field(susgrupo,usgrupo,"usgdescr");
      usggrupo.setValue("Todos");
      usgdescr.setValue("Todos los usuarios");
      return usgrupo.insert();
      }
    
    public boolean existeTodos(){
      Select susgrupo=new Select(getDataBase());
      Table usgrupo=new Table(susgrupo,"usgrupo");
      Field usggrupo=new Field(susgrupo,usgrupo,"usggrupo");
      Field usgdescr=new Field(susgrupo,usgrupo,"usgdescr");
      susgrupo.execute();
      return !susgrupo.isEof();
      }
    
    public boolean eliminaUsuario(int codcon, String grupo, String login){
      Select susagrup=new Select(getDataBase());
      Table usagrup=new Table(susagrup,"usagrup");
      Field usacodco=new Field(susagrup,usagrup,"usacodco");
      Field usagrupo=new Field(susagrup,usagrup,"usagrupo");
      Field usalogin=new Field(susagrup,usagrup,"usalogin");
      susagrup.setWhere("usacodco="+Easp.sede+" and usagrupo='"+grupo+
                        "' and usalogin='"+login+"'");
      susagrup.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
      if (!susagrup.isEof()) return usagrup.delete();
      else return false;
      }
    
    public boolean eliminaPermiso(int codcon, String login, String recurso){
      Select suspermlo=new Select(getDataBase());
      Table uspermlo=new Table(suspermlo,"uspermlo");
      Field uslcodco=new Field(suspermlo, uspermlo,"uslcodco");
      Field usluser=new Field(suspermlo, uspermlo,"usluser");
      Field uslrecurso=new Field(suspermlo, uspermlo,"uslrecurso");
      suspermlo.setWhere("uslcodco="+Easp.sede+" and usluser='"+login+"' and uslrecurso='"+
                        recurso+"'");
      suspermlo.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
      if (!suspermlo.isEof()) return uspermlo.delete();
      else return false;
      }
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlUslogin uslogin;
    public CtrlUsnombre usnombre;
    // Acciones
    public LinkIradatos iradatos;
    public LinkIracontrasenya iracontrasenya;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(WEST);
        }
      }
      
    public class CtrlUslogin extends ColumnEdit
      {
      public CtrlUslogin(Form form)
        {
        super(form);
        setName("uslogin");
        setTitle("Login");
        setType(STRING);
        setProtect(true);
        setLength(25);
        setSearchable(true);
        setField(susuarios.uslogin);
        }
      }
      
    public class CtrlUsnombre extends ColumnEdit
      {
      public CtrlUsnombre(Form form)
        {
        super(form);
        setName("usnombre");
        setTitle("Nombre");
        setType(STRING);
        setLength(45);
        setSearchable(true);
        setField(susuarios.usnombre);
        }
      }
      
    public class LinkIradatos extends ActionForm
      {
      public LinkIradatos(Form form)
        {
        super(form);
        setName("iradatos");
        setTitle("Datos personales");
        setOptions(SHOW);
        }
      }
      
    public class LinkIracontrasenya extends ActionForm
      {
      public LinkIracontrasenya(Form form)
        {
        super(form);
        setName("iracontrasenya");
        setTitle("Contraseña");
        setOptions(SHOW);
        }
      public void onAction()
        {
        if (!Aplication.getAplication().getUser().toUpperCase().equals(uslogin.getString().toUpperCase()) 
            && susagrup.isEof() 
            && !Aplication.getAplication().getUser().toUpperCase().equals("ADMIN"))
          Maefc.message("No permitido","Aviso",Maefc.ERROR_MESSAGE);
        else {
          vcontrasenya.setInitState(DataForm.UPDATE);
          super.onAction();
          }
        }
      }
      
    public FormVusuarios(ProgUspusers uspusers)
      {
      super(uspusers);
      setName("vusuarios");
      setTitle("Usuarios");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(susuarios=new Susuarios());
      addSelect(susagrup=new Susagrup());
      addControl(uslogin=new CtrlUslogin(this));
      addControl(usnombre=new CtrlUsnombre(this));
      addAction(iradatos=new LinkIradatos(this));
      addAction(iracontrasenya=new LinkIracontrasenya(this));
      setSelect(susuarios);
      }
    public void onInit()
      {
      vusuarios.setInitState(DataForm.SHOW);
      super.onInit();
      }
    public boolean onOkInsert()
      {
      if (existeUser()){
        Maefc.message("El usuario ya existe !");
        return false;
        }
      else{
        // Comprobar que existe grupo todos sino crearlo
        if (!existeTodos() && !crearTodos()) return false;
      
        // Añadirlo en grupo todos
        Select susagrup=new Select(getDataBase());
        Table usagrup=new Table(susagrup,"usagrup");
        Field usacodco=new Field(susagrup,usagrup,"usacodco");
        Field usagrupo=new Field(susagrup,usagrup,"usagrupo");
        Field usalogin=new Field(susagrup,usagrup,"usalogin");
        usacodco.setValue(Easp.sede);
        usagrupo.setValue("Todos");
        usalogin.setValue(uslogin.getString());
        return (super.onOkInsert() && usagrup.insert());
        }
      
      
      }
    public boolean onOkDelete()
      {
      Select susagrup=new Select(getDataBase());
      Table usagrup=new Table(susagrup,"usagrup");
      Field usacodco=new Field(susagrup,usagrup,"usacodco");
      Field usagrupo=new Field(susagrup,usagrup,"usagrupo");
      Field usalogin=new Field(susagrup,usagrup,"usalogin");
      susagrup.setWhere("usacodco="+Easp.sede+" and usalogin="+uslogin.getSQLFormat());
      susagrup.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
      
      //Borrar usuario de los grupos a los que estuviera
      while(!susagrup.isEof()){
        if (!eliminaUsuario(Easp.sede,usagrupo.getString(),usalogin.getString())) return false;
        susagrup.next();  
        }
      
      //Borrar los posibles permisos que tuviera asignados
      Select suspermlo=new Select(getDataBase());
      Table uspermlo=new Table(suspermlo,"uspermlo");
      Field uslcodco=new Field(suspermlo, uspermlo,"uslcodco");
      Field usluser=new Field(suspermlo, uspermlo,"usluser");
      Field uslrecurso=new Field(suspermlo, uspermlo,"uslrecurso");
      suspermlo.setWhere("uslcodco="+Easp.sede+" and usluser="+uslogin.getSQLFormat());
      suspermlo.executeLock();//Bloqueos: no desbloquear, forma parte de transaccion
        
      while(!suspermlo.isEof()){
        if (!eliminaPermiso(Easp.sede,usluser.getString(),uslrecurso.getString())) return false;
        suspermlo.next();  
        }
      
      return super.onOkDelete();
      }
    }
    
  // Selección de usuarios
  public class Susuarios extends Select
    {
    // Tablas
    public Usuario usuario;
    // Campos
    public Field uscargo;
    public Field uscodcon;
    public Field uscodpos;
    public Field usdepart;
    public Field usdirec;
    public Field usemail;
    public Field usfirma;
    public Field usfoto;
    public Field uslogin;
    public Field usnombre;
    public Field uspasswd;
    public Field uspoblac;
    public Field usseccio;
    public Field ustelef;
    public Field ustelefp;
    public Field ustelmp;
    public Field usremoto;
    class Usuario extends Table
      {
      public Usuario(Select select)
        {
        super(select);
        setName("usuario");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        uscodcon.setValue(Easp.sede);
        return super.onInsert();
        }
      }
      
    public Susuarios()
      {
      setName("susuarios");
      addTable(usuario=new Usuario(this));
      addField(uscargo=new Field(this,usuario,"uscargo"));
      addField(uscodcon=new Field(this,usuario,"uscodcon"));
      addField(uscodpos=new Field(this,usuario,"uscodpos"));
      addField(usdepart=new Field(this,usuario,"usdepart"));
      addField(usdirec=new Field(this,usuario,"usdirec"));
      addField(usemail=new Field(this,usuario,"usemail"));
      addField(usfirma=new Field(this,usuario,"usfirma"));
      addField(usfoto=new Field(this,usuario,"usfoto"));
      addField(uslogin=new Field(this,usuario,"uslogin"));
      addField(usnombre=new Field(this,usuario,"usnombre"));
      addField(uspasswd=new Field(this,usuario,"uspasswd"));
      addField(uspoblac=new Field(this,usuario,"uspoblac"));
      addField(usseccio=new Field(this,usuario,"usseccio"));
      addField(ustelef=new Field(this,usuario,"ustelef"));
      addField(ustelefp=new Field(this,usuario,"ustelefp"));
      addField(ustelmp=new Field(this,usuario,"ustelmp"));
      addField(usremoto=new Field(this,usuario,"usremoto"));
      }
    public String getOrder()
      {
      return "uscodcon,uslogin asc";
      }
    }
    
  // 
  public class Susagrup extends Select
    {
    // Tablas
    public Usagrup usagrup;
    // Campos
    public Field usacodco;
    public Field usagrupo;
    public Field usalogin;
    class Usagrup extends Table
      {
      public Usagrup(Select select)
        {
        super(select);
        setName("usagrup");
        setOptions(READ);
        }
      }
      
    public Susagrup()
      {
      setName("susagrup");
      addTable(usagrup=new Usagrup(this));
      addField(usacodco=new Field(this,usagrup,"usacodco"));
      addField(usagrupo=new Field(this,usagrup,"usagrupo"));
      addField(usalogin=new Field(this,usagrup,"usalogin"));
      }
    public String getWhere()
      {
      return "usacodco="+Easp.sede
            +" and usagrupo='Administradores'"
            +" and usalogin="+Value.getSQLFormat(Aplication.getAplication().getUser());
      }
    }
    
  public class FormVgrupos extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onSelection() {
      super.onSelection();
      calasignar.doAction();
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlChasignado chasignado;
    public CtrlUsggrupo usggrupo;
    public CtrlUsgdescr usgdescr;
    // Acciones
    public LinkCalasignar calasignar;
    public LinkIrpermge irpermge;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlChasignado extends ColumnCheck
      {
      public CtrlChasignado(Form form)
        {
        super(form);
        setName("chasignado");
        setMessageHelp("Indica si el usuario pertenece al grupo");
        setTitle("A");
        }
      }
      
    public class CtrlUsggrupo extends ColumnEdit
      {
      public CtrlUsggrupo(Form form)
        {
        super(form);
        setName("usggrupo");
        setMessageHelp("Nombre del grupo");
        setTitle("Grupo");
        setType(STRING);
        setLength(15);
        setField(sgrupos.usggrupo);
        }
      }
      
    public class CtrlUsgdescr extends ColumnEdit
      {
      public CtrlUsgdescr(Form form)
        {
        super(form);
        setName("usgdescr");
        setMessageHelp("Descripción del grupo");
        setTitle("Descripción");
        setType(STRING);
        setLength(30);
        setField(sgrupos.usgdescr);
        }
      }
      
    public class LinkCalasignar extends ActionForm
      {
      public LinkCalasignar(Form form)
        {
        super(form);
        setName("calasignar");
        setTitle("Asig./Desas.");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
          if (chasignado.getBoolean()) {
            spertenece.delete();
            spertenece.commit();
            chasignado.setValue(false);
            }
          else {
            spertenece.insert();
            spertenece.commit();
            chasignado.setValue(true);
            }
        
        }
      }
      
    public class LinkIrpermge extends Action
      {
      public LinkIrpermge(Form form)
        {
        super(form);
        setName("irpermge");
        setTitle("Permisos Generales");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        mae.easp.usppermisos.ProgUsppermisos prog=new mae.easp.usppermisos.ProgUsppermisos(easp);
        prog.vggrupo=usggrupo.getString();
        prog.run();
        }
      }
      
    public FormVgrupos(ProgUspusers uspusers)
      {
      super(uspusers);
      setName("vgrupos");
      setTitle("Grupos");
      setLocation(new Location());
      setStates(SHOW);
      addSelect(sgrupos=new Sgrupos());
      addSelect(spertenece=new Spertenece());
      addControl(chasignado=new CtrlChasignado(this));
      addControl(usggrupo=new CtrlUsggrupo(this));
      addControl(usgdescr=new CtrlUsgdescr(this));
      addAction(calasignar=new LinkCalasignar(this));
      addAction(irpermge=new LinkIrpermge(this));
      setSelect(sgrupos);
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      if (spertenece.usagrupo.isNull()) {
      //  calasignar.setTitle("&1.----Asignar");
        chasignado.setValue(false);
        }
      else {
      //  calasignar.setTitle("&1.-Desasignar");
        chasignado.setValue(true);
        }
      }
    }
    
  // Grupos del sistema
  public class Sgrupos extends Select
    {
    // Tablas
    public Usgrupo usgrupo;
    // Campos
    public Field usgdescr;
    public Field usggrupo;
    class Usgrupo extends Table
      {
      public Usgrupo(Select select)
        {
        super(select);
        setName("usgrupo");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sgrupos()
      {
      setName("sgrupos");
      setFather(susuarios);
      addTable(usgrupo=new Usgrupo(this));
      addField(usgdescr=new Field(this,usgrupo,"usgdescr"));
      addField(usggrupo=new Field(this,usgrupo,"usggrupo"));
      }
    public String getOrder()
      {
      return "usggrupo asc";
      }
    }
    
  // Verifica si el usuario pertenece al grupo
  public class Spertenece extends Select
    {
    // Tablas
    public Usagrup usagrup;
    // Campos
    public Field usacodco;
    public Field usagrupo;
    public Field usalogin;
    class Usagrup extends Table
      {
      public Usagrup(Select select)
        {
        super(select);
        setName("usagrup");
        setOptions(READ | INSERT | DELETE);
        }
      public boolean onInsert()
        {
        usacodco.setValue(susuarios.uscodcon);
        usagrupo.setValue(sgrupos.usggrupo);
        usalogin.setValue(susuarios.uslogin);
        return super.onInsert();
        }
      }
      
    public Spertenece()
      {
      setName("spertenece");
      setFather(sgrupos);
      addTable(usagrup=new Usagrup(this));
      addField(usacodco=new Field(this,usagrup,"usacodco"));
      addField(usagrupo=new Field(this,usagrup,"usagrupo"));
      addField(usalogin=new Field(this,usagrup,"usalogin"));
      }
    public String getWhere()
      {
      return "usacodco="+Easp.sede
             +" and usagrupo="+sgrupos.usggrupo.getSQLFormat()
             +" and usalogin="+susuarios.uslogin.getSQLFormat();
      }
    }
    
  public class FormDatos extends MonoDataForm
    {
    // Controles
    public CtrlTitulo titulo;
    public CtrlUsdirec usdirec;
    public CtrlUscodpos uscodpos;
    public CtrlUspoblac uspoblac;
    public CtrlUstelefp ustelefp;
    public CtrlUstelmp ustelmp;
    public CtrlTitulo2 titulo2;
    public CtrlUsseccio usseccio;
    public CtrlUsdepart usdepart;
    public CtrlUscargo uscargo;
    public CtrlUstelef ustelef;
    public CtrlUsemail usemail;
    public CtrlUsfirma usfirma;
    public CtrlUsremoto usremoto;
    // Acciones
    public LinkIrpermlo irpermlo;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(600);
        setHeight(400);
        setTitle("Datos del usuario");
        setModal(true);
        setLocation(SOUTH);
        }
      }
      
    public class CtrlTitulo extends ControlLabel
      {
      public CtrlTitulo(Form form)
        {
        super(form);
        setName("titulo");
        setTitle("Datos personales :");
        }
      }
      
    public class CtrlUsdirec extends ControlEdit
      {
      public CtrlUsdirec(Form form)
        {
        super(form);
        setName("usdirec");
        setTitle("Dirección");
        setType(STRING);
        setLength(45);
        setSearchable(true);
        setPrintable(false);
        setField(susuarios.usdirec);
        }
      }
      
    public class CtrlUscodpos extends ControlEdit
      {
      public CtrlUscodpos(Form form)
        {
        super(form);
        setName("uscodpos");
        setTitle("Código postal");
        setType(STRING);
        setLength(10);
        setField(susuarios.uscodpos);
        }
      }
      
    public class CtrlUspoblac extends ControlEdit
      {
      public CtrlUspoblac(Form form)
        {
        super(form);
        setName("uspoblac");
        setTitle("Población");
        setType(STRING);
        setLength(45);
        setField(susuarios.uspoblac);
        }
      }
      
    public class CtrlUstelefp extends ControlEdit
      {
      public CtrlUstelefp(Form form)
        {
        super(form);
        setName("ustelefp");
        setTitle("Teléfono particular");
        setType(STRING);
        setLength(15);
        setField(susuarios.ustelefp);
        }
      }
      
    public class CtrlUstelmp extends ControlEdit
      {
      public CtrlUstelmp(Form form)
        {
        super(form);
        setName("ustelmp");
        setTitle("Tel. Móvil Particular");
        setType(STRING);
        setLength(15);
        setField(susuarios.ustelmp);
        }
      }
      
    public class CtrlTitulo2 extends ControlLabel
      {
      public CtrlTitulo2(Form form)
        {
        super(form);
        setName("titulo2");
        setTitle("Datos empresa :");
        }
      }
      
    public class CtrlUsseccio extends ControlEdit
      {
      public CtrlUsseccio(Form form)
        {
        super(form);
        setName("usseccio");
        setTitle("Sección");
        setType(STRING);
        setLength(25);
        setField(susuarios.usseccio);
        }
      }
      
    public class CtrlUsdepart extends ControlEdit
      {
      public CtrlUsdepart(Form form)
        {
        super(form);
        setName("usdepart");
        setTitle("Departamento");
        setType(STRING);
        setLength(25);
        setField(susuarios.usdepart);
        }
      }
      
    public class CtrlUscargo extends ControlEdit
      {
      public CtrlUscargo(Form form)
        {
        super(form);
        setName("uscargo");
        setTitle("Cargo");
        setType(STRING);
        setLength(25);
        setField(susuarios.uscargo);
        }
      }
      
    public class CtrlUstelef extends ControlEdit
      {
      public CtrlUstelef(Form form)
        {
        super(form);
        setName("ustelef");
        setTitle("Télefono");
        setType(STRING);
        setLength(25);
        setField(susuarios.ustelef);
        }
      }
      
    public class CtrlUsemail extends ControlEdit
      {
      public CtrlUsemail(Form form)
        {
        super(form);
        setName("usemail");
        setTitle("Dirección electrónica");
        setType(STRING);
        setLength(50);
        setField(susuarios.usemail);
        }
      }
      
    public class CtrlUsfirma extends ControlEdit
      {
      public CtrlUsfirma(Form form)
        {
        super(form);
        setName("usfirma");
        setTitle("Firma digital");
        setType(STRING);
        setLength(25);
        setField(susuarios.usfirma);
        }
      }
      
    public class CtrlUsremoto extends ControlComboBox
      {
      public CtrlUsremoto(Form form)
        {
        super(form);
        setName("usremoto");
        setMessageHelp("Usuario Remoto");
        setTitle("Remoto");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("S/SI");
        addItem("N/NO");
        setField(susuarios.usremoto);
        }
      }
      
    public class LinkIrpermlo extends Action
      {
      public LinkIrpermlo(Form form)
        {
        super(form);
        setName("irpermlo");
        setTitle("Permisos Locales");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        mae.easp.usppermisoslo.ProgUsppermisoslo prog=new mae.easp.usppermisoslo.ProgUsppermisoslo(easp);
        prog.vgcodcon=Easp.sede;
        prog.vgusuario=vusuarios.uslogin.getString();
        prog.run();
        }
      }
      
    public FormDatos(ProgUspusers uspusers)
      {
      super(uspusers);
      setName("datos");
      setTitle("Datos del usuario");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setModal(true);
      setUnique(true);
      addControl(titulo=new CtrlTitulo(this));
      addControl(usdirec=new CtrlUsdirec(this));
      addControl(uscodpos=new CtrlUscodpos(this));
      addControl(uspoblac=new CtrlUspoblac(this));
      addControl(ustelefp=new CtrlUstelefp(this));
      addControl(ustelmp=new CtrlUstelmp(this));
      addControl(titulo2=new CtrlTitulo2(this));
      addControl(usseccio=new CtrlUsseccio(this));
      addControl(usdepart=new CtrlUsdepart(this));
      addControl(uscargo=new CtrlUscargo(this));
      addControl(ustelef=new CtrlUstelef(this));
      addControl(usemail=new CtrlUsemail(this));
      addControl(usfirma=new CtrlUsfirma(this));
      addControl(usremoto=new CtrlUsremoto(this));
      addAction(irpermlo=new LinkIrpermlo(this));
      setSelect(susuarios);
      }
    }
    
  public class FormVcontrasenya extends MonoDataForm
    {
    // Inicio declaraciones globales
    public void onOpened() {
      super.onOpened();
      doEdit();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlUspasswd uspasswd;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(400);
        setHeight(250);
        setTitle("Contraseña");
        setModal(true);
        setLocation(SOUTH);
        }
      }
      
    public class CtrlUspasswd extends ControlEdit
      {
      public CtrlUspasswd(Form form)
        {
        super(form);
        setName("uspasswd");
        setMessageHelp("Contraseña");
        setTitle("Contraseña");
        setType(STRING);
        setMaskInput("*");
        setLength(10);
        setPrintable(false);
        setField(susuarios.uspasswd);
        }
      }
      
    public FormVcontrasenya(ProgUspusers uspusers)
      {
      super(uspusers);
      setName("vcontrasenya");
      setTitle("Contraseña");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addControl(uspasswd=new CtrlUspasswd(this));
      setSelect(susuarios);
      }
    public void onExit()
      {
      if (getNumState()!=DataForm.SHOW)
        onCancel();
      super.onExit();
      }
    }
    
  public ProgUspusers()
    {
    this.uspusers=this;
    setName("uspusers");
    setTitle("Gestión de usuarios");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vusuarios=new FormVusuarios(this));
    addForm(vgrupos=new FormVgrupos(this));
    addForm(datos=new FormDatos(this));
    addForm(vcontrasenya=new FormVcontrasenya(this));
    vusuarios.iradatos.setForm(datos);
    vusuarios.iracontrasenya.setForm(vcontrasenya);
    }
  public ProgUspusers(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
