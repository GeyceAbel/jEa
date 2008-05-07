// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:07
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.usppermisoslo;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: usppermisoslo
// Nombre:   Control de acceso por usuario
// Versión:  1.0
// 
public class ProgUsppermisoslo extends Program
  {
  public AppEasp easp;
  public ProgUsppermisoslo usppermisoslo;
  // Inicio declaraciones globales
  public int vgcodcon=0;
  public String vgusuario=null;
  
  // Fin declaraciones globales
  // Ventana
  public FormVusuarios vusuarios;
  // Selects
  public Susuarios susuarios;
  // Ventana
  public FormVaplicacion vaplicacion;
  // Selects
  public Saplicaciones saplicaciones;
  // Ventana
  public FormVpositivos vpositivos;
  // Selects
  public Spermisoslop spermisoslop;
  // Ventana
  public FormVnegativos vnegativos;
  // Selects
  public Spermisoslon spermisoslon;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Control de acceso por usuario");
      }
    }
    
  public class FormVusuarios extends MultiDataForm
    {
    // Controles
    public CtrlUslogin uslogin;
    public CtrlUsnombre usnombre;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(NORTHWEST);
        }
      }
      
    public class CtrlUslogin extends ColumnEdit
      {
      public CtrlUslogin(Form form)
        {
        super(form);
        setName("uslogin");
        setMessageHelp("Login o nombre abreviado del usuario");
        setTitle("Login");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setPrintable(false);
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
        setPrintable(false);
        setField(susuarios.usnombre);
        }
      }
      
    public FormVusuarios(ProgUsppermisoslo usppermisoslo)
      {
      super(usppermisoslo);
      setName("vusuarios");
      setTitle("Usuarios");
      setLocation(new Location());
      setStates(SHOW | SEARCH);
      addSelect(susuarios=new Susuarios());
      addControl(uslogin=new CtrlUslogin(this));
      addControl(usnombre=new CtrlUsnombre(this));
      setSelect(susuarios);
      }
    }
    
  // Usuarios
  public class Susuarios extends Select
    {
    // Tablas
    public Usuario usuario;
    // Campos
    public Field uscodcon;
    public Field uslogin;
    public Field usnombre;
    class Usuario extends Table
      {
      public Usuario(Select select)
        {
        super(select);
        setName("usuario");
        setOptions(READ);
        }
      }
      
    public Susuarios()
      {
      setName("susuarios");
      addTable(usuario=new Usuario(this));
      addField(uscodcon=new Field(this,usuario,"uscodcon"));
      addField(uslogin=new Field(this,usuario,"uslogin"));
      addField(usnombre=new Field(this,usuario,"usnombre"));
      }
    public String getWhere()
      {
      if (vgusuario!=null)
        return "uscodcon="+Easp.sede+" and uslogin='"+vgusuario+"'";
      else return null;
      }
    public String getOrder()
      {
      return "uscodcon,uslogin";
      }
    }
    
  public class FormVaplicacion extends MultiDataForm
    {
    // Controles
    public CtrlApaplic apaplic;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(NORTHEAST);
        }
      }
      
    public class CtrlApaplic extends ColumnEdit
      {
      public CtrlApaplic(Form form)
        {
        super(form);
        setName("apaplic");
        setMessageHelp("Aplicación");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(saplicaciones.apaplic);
        }
      }
      
    public FormVaplicacion(ProgUsppermisoslo usppermisoslo)
      {
      super(usppermisoslo);
      setName("vaplicacion");
      setTitle("Aplicación");
      setLocation(new Location());
      setStates(SHOW);
      addSelect(saplicaciones=new Saplicaciones());
      addControl(apaplic=new CtrlApaplic(this));
      setSelect(saplicaciones);
      }
    }
    
  // Aplicaciones
  public class Saplicaciones extends Select
    {
    // Tablas
    public Apl apl;
    // Campos
    public Field apaplic;
    public Field apdesc;
    class Apl extends Table
      {
      public Apl(Select select)
        {
        super(select);
        setName("apl");
        setOptions(READ);
        }
      }
      
    public Saplicaciones()
      {
      setName("saplicaciones");
      setFather(susuarios);
      addTable(apl=new Apl(this));
      addField(apaplic=new Field(this,apl,"apaplic"));
      addField(apdesc=new Field(this,apl,"apdesc"));
      }
    }
    
  public class FormVpositivos extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
      uslrecurso.pickup.vvwhere="not exists(SELECT * FROM uspermlo where uslcodco="+
                           susuarios.uscodcon.getSQLFormat()+
                           " and usrecursos.userecurso=uspermlo.uslrecurso and usluser="+
                           susuarios.uslogin.getSQLFormat()+
                           " and uslposne='+') and usrecursos.userecurso like '"+
                           saplicaciones.apaplic.getString().toUpperCase()+"%'";
      uslrecurso.pickup.refresh();
      super.onInsert();
      }
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlUslrecurso uslrecurso;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(4.0);
        setFill(BOTH);
        setAnchor(SOUTHWEST);
        }
      }
      
    public class CtrlUslrecurso extends ColumnComboBox
      {
      public mae.easp.general.pkrecursos.PickPkrecursos pickup;
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(45);
          }
        }
        
      public CtrlUslrecurso(Form form)
        {
        super(form);
        setLook(new Look());
        setName("uslrecurso");
        setTitle("Recurso");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkrecursos.PickPkrecursos(this));
        setLength(80);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisoslop.uslrecurso);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVpositivos(ProgUsppermisoslo usppermisoslo)
      {
      super(usppermisoslo);
      setName("vpositivos");
      setTitle("Permisos aceptados");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisoslop=new Spermisoslop());
      addControl(uslrecurso=new CtrlUslrecurso(this));
      setSelect(spermisoslop);
      }
    }
    
  // Permisos generales
  public class Spermisoslop extends Select
    {
    // Tablas
    public Uspermlo uspermlo;
    // Campos
    public Field uslcodco;
    public Field uslposne;
    public Field uslrecurso;
    public Field usluser;
    class Uspermlo extends Table
      {
      public Uspermlo(Select select)
        {
        super(select);
        setName("uspermlo");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        uslcodco.setValue(susuarios.uscodcon);
        usluser.setValue(susuarios.uslogin);
        uslposne.setValue("+");
        return super.onInsert();
        }
      }
      
    public Spermisoslop()
      {
      setName("spermisoslop");
      setFather(saplicaciones);
      addTable(uspermlo=new Uspermlo(this));
      addField(uslcodco=new Field(this,uspermlo,"uslcodco"));
      addField(uslposne=new Field(this,uspermlo,"uslposne"));
      addField(uslrecurso=new Field(this,uspermlo,"uslrecurso"));
      addField(usluser=new Field(this,uspermlo,"usluser"));
      }
    public String getWhere()
      {
      return "uslcodco="+Easp.sede+
             " and usluser="+susuarios.uslogin.getSQLFormat()+
             " and uslrecurso like '"+saplicaciones.apaplic.getString().toUpperCase()+"%'"+
             " and uslposne='+'";
      }
    public String getOrder()
      {
      return "uslrecurso";
      }
    }
    
  public class FormVnegativos extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
      uslrecurso.pickup.vvwhere="not exists(SELECT * FROM uspermlo where uslcodco="+
                           susuarios.uscodcon.getSQLFormat()+
                           " and usrecursos.userecurso=uspermlo.uslrecurso and usluser="+
                           susuarios.uslogin.getSQLFormat()+
                           " and uslposne='-') and usrecursos.userecurso like '"+
                           saplicaciones.apaplic.getString().toUpperCase()+"%'";
      uslrecurso.pickup.refresh();
      super.onInsert();
      }
    
    
    // Fin declaraciones globales
    // Controles
    public CtrlUslrecurso uslrecurso;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(4.0);
        setFill(BOTH);
        setAnchor(SOUTHEAST);
        }
      }
      
    public class CtrlUslrecurso extends ColumnComboBox
      {
      public mae.easp.general.pkrecursos.PickPkrecursos pickup;
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(45);
          }
        }
        
      public CtrlUslrecurso(Form form)
        {
        super(form);
        setLook(new Look());
        setName("uslrecurso");
        setTitle("Recurso");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkrecursos.PickPkrecursos(this));
        setLength(80);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisoslon.uslrecurso);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVnegativos(ProgUsppermisoslo usppermisoslo)
      {
      super(usppermisoslo);
      setName("vnegativos");
      setTitle("Permisos denegados");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisoslon=new Spermisoslon());
      addControl(uslrecurso=new CtrlUslrecurso(this));
      setSelect(spermisoslon);
      }
    }
    
  // Permisos locales negativos
  public class Spermisoslon extends Select
    {
    // Tablas
    public Uspermlo uspermlo;
    // Campos
    public Field uslcodco;
    public Field uslposne;
    public Field uslrecurso;
    public Field usluser;
    class Uspermlo extends Table
      {
      public Uspermlo(Select select)
        {
        super(select);
        setName("uspermlo");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        uslcodco.setValue(susuarios.uscodcon);
        usluser.setValue(susuarios.uslogin);
        uslposne.setValue("-");
        return super.onInsert();
        }
      }
      
    public Spermisoslon()
      {
      setName("spermisoslon");
      setFather(saplicaciones);
      addTable(uspermlo=new Uspermlo(this));
      addField(uslcodco=new Field(this,uspermlo,"uslcodco"));
      addField(uslposne=new Field(this,uspermlo,"uslposne"));
      addField(uslrecurso=new Field(this,uspermlo,"uslrecurso"));
      addField(usluser=new Field(this,uspermlo,"usluser"));
      }
    public String getWhere()
      {
      return "uslcodco="+Easp.sede+
             " and usluser="+susuarios.uslogin.getSQLFormat()+
             " and uslrecurso like '"+saplicaciones.apaplic.getString().toUpperCase()+"%'"+
             " and uslposne='-'";
      }
    public String getOrder()
      {
      return "uslrecurso";
      }
    }
    
  public ProgUsppermisoslo()
    {
    this.usppermisoslo=this;
    setName("usppermisoslo");
    setTitle("Control de acceso por usuario");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vusuarios=new FormVusuarios(this));
    addForm(vaplicacion=new FormVaplicacion(this));
    addForm(vpositivos=new FormVpositivos(this));
    addForm(vnegativos=new FormVnegativos(this));
    }
  public ProgUsppermisoslo(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    if (vgusuario!=null) {
      vusuarios.setInitState(DataForm.SHOW);
      vusuarios.searchAction.setEnabled(false);
      }
    super.onInit();
    }
  }
  
