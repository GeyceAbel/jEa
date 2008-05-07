// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:59
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admimprusu;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admimprusu
// Nombre:   Impresoras por usuario
// Versión:  1.1.2
// 
public class ProgAdmimprusu extends Program
  {
  public AppEasp easp;
  public ProgAdmimprusu admimprusu;
  // Ventana
  public FormVusuarios vusuarios;
  // Selects
  public Susuarios susuarios;
  // Ventana
  public FormVimprusua vimprusua;
  // Selects
  public Simpdef simpdef;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Impresoras por usuario");
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
        setWidth(REMAINDER);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(NORTH);
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
        setLength(10);
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
      
    public FormVusuarios(ProgAdmimprusu admimprusu)
      {
      super(admimprusu);
      setName("vusuarios");
      setTitle("Usuarios");
      setLocation(new Location());
      setStates(SHOW);
      addSelect(susuarios=new Susuarios());
      addControl(uslogin=new CtrlUslogin(this));
      addControl(usnombre=new CtrlUsnombre(this));
      setSelect(susuarios);
      }
    }
    
  // Selección de usuarios
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
    }
    
  public class FormVimprusua extends MultiDataForm
    {
    // Controles
    public CtrlDetipo detipo;
    public CtrlDeimpre deimpre;
    // Acciones
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
        setAnchor(SOUTH);
        }
      }
      
    public class CtrlDetipo extends ColumnComboBox
      {
      public mae.easp.general.pktipos.PickPktipos pickup;
      public CtrlDetipo(Form form)
        {
        super(form);
        setName("detipo");
        setTitle("Tipo");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pktipos.PickPktipos(this));
        setLength(15);
        setPrintable(false);
        setField(simpdef.detipo);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlDeimpre extends ColumnComboBox
      {
      public mae.easp.general.pkimpresoras.PickPkimpresoras pickup;
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(40);
          }
        }
        
      public CtrlDeimpre(Form form)
        {
        super(form);
        setLook(new Look());
        setName("deimpre");
        setMessageHelp("Nombre de la impresora");
        setTitle("Impresora");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkimpresoras.PickPkimpresoras(this));
        setLength(80);
        setPrintable(false);
        setField(simpdef.deimpre);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVimprusua(ProgAdmimprusu admimprusu)
      {
      super(admimprusu);
      setName("vimprusua");
      setTitle("Impresoras por defecto");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(simpdef=new Simpdef());
      addControl(detipo=new CtrlDetipo(this));
      addControl(deimpre=new CtrlDeimpre(this));
      setSelect(simpdef);
      }
    }
    
  // Selección de impresoras por usuario
  public class Simpdef extends Select
    {
    // Tablas
    public Impdef impdef;
    // Campos
    public Field decodcon;
    public Field deimpre;
    public Field detipo;
    public Field deuser;
    class Impdef extends Table
      {
      public Impdef(Select select)
        {
        super(select);
        setName("impdef");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        simpdef.impdef.setCheckDuplicates(true);
        simpdef.decodcon.setValue(1);
        simpdef.deuser.setValue(vusuarios.uslogin);
        return super.onInsert();
        }
      public boolean onUpdate()
        {
        simpdef.decodcon.setValue(1);
        simpdef.deuser.setValue(vusuarios.uslogin);
        return super.onUpdate();
        }
      }
      
    public Simpdef()
      {
      setName("simpdef");
      setFather(susuarios);
      addTable(impdef=new Impdef(this));
      addField(decodcon=new Field(this,impdef,"decodcon"));
      addField(deimpre=new Field(this,impdef,"deimpre"));
      addField(detipo=new Field(this,impdef,"detipo"));
      addField(deuser=new Field(this,impdef,"deuser"));
      }
    public String getWhere()
      {
      return "DECODCON=1 and DEUSER="
             +vusuarios.uslogin.getSQLFormat();
      }
    public String getOrder()
      {
      return "DETIPO DESC";
      }
    }
    
  public ProgAdmimprusu(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admimprusu=this;
    setName("admimprusu");
    setTitle("Impresoras por usuario");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vusuarios=new FormVusuarios(this));
    addForm(vimprusua=new FormVimprusua(this));
    }
  public ProgAdmimprusu()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
