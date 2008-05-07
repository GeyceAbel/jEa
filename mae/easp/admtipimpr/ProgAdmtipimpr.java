// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:00
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admtipimpr;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admtipimpr
// Nombre:   Tipos de impresión
// Versión:  1.1.2
// 
public class ProgAdmtipimpr extends Program
  {
  public AppEasp easp;
  public ProgAdmtipimpr admtipimpr;
  // Ventana
  public FormVimptipos vimptipos;
  // Selects
  public Simptipos simptipos;
  // Ventana
  public FormVimpgrupos vimpgrupos;
  // Selects
  public Simpgrupos simpgrupos;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Tipos de impresión");
      }
    }
    
  public class FormVimptipos extends MultiDataForm
    {
    // Controles
    public CtrlTitipo titipo;
    public CtrlTidesc tidesc;
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
      
    public class CtrlTitipo extends ColumnEdit
      {
      public CtrlTitipo(Form form)
        {
        super(form);
        setName("titipo");
        setTitle("Tipo impresora");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(simptipos.titipo);
        }
      }
      
    public class CtrlTidesc extends ColumnEdit
      {
      public CtrlTidesc(Form form)
        {
        super(form);
        setName("tidesc");
        setTitle("Descripción");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(simptipos.tidesc);
        }
      }
      
    public FormVimptipos(ProgAdmtipimpr admtipimpr)
      {
      super(admtipimpr);
      setName("vimptipos");
      setTitle("Tipos impresora");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(simptipos=new Simptipos());
      addControl(titipo=new CtrlTitipo(this));
      addControl(tidesc=new CtrlTidesc(this));
      setSelect(simptipos);
      }
    }
    
  // Selección de tipos de impresora
  public class Simptipos extends Select
    {
    // Tablas
    public Imptipos imptipos;
    // Campos
    public Field tidesc;
    public Field titipo;
    class Imptipos extends Table
      {
      public Imptipos(Select select)
        {
        super(select);
        setName("imptipos");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Simptipos()
      {
      setName("simptipos");
      addTable(imptipos=new Imptipos(this));
      addField(tidesc=new Field(this,imptipos,"tidesc"));
      addField(titipo=new Field(this,imptipos,"titipo"));
      }
    }
    
  public class FormVimpgrupos extends MultiDataForm
    {
    // Controles
    public CtrlGrimpre grimpre;
    public CtrlGrmodo grmodo;
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
      
    public class CtrlGrimpre extends ColumnComboBox
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
        
      public CtrlGrimpre(Form form)
        {
        super(form);
        setLook(new Look());
        setName("grimpre");
        setMessageHelp("Nombre de la impresora");
        setTitle("Nombre");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkimpresoras.PickPkimpresoras(this));
        setLength(80);
        setPrintable(false);
        setField(simpgrupos.grimpre);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlGrmodo extends ColumnComboBox
      {
      public CtrlGrmodo(Form form)
        {
        super(form);
        setName("grmodo");
        setTitle("Modo");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setPrintable(false);
        addItem("L/Línea a línea");
        addItem("G/Gráfica");
        setField(simpgrupos.grmodo);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVimpgrupos(ProgAdmtipimpr admtipimpr)
      {
      super(admtipimpr);
      setName("vimpgrupos");
      setTitle("Impresoras");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(simpgrupos=new Simpgrupos());
      addControl(grimpre=new CtrlGrimpre(this));
      addControl(grmodo=new CtrlGrmodo(this));
      setSelect(simpgrupos);
      }
    }
    
  // Selección de grupos de impresoras
  public class Simpgrupos extends Select
    {
    // Tablas
    public Impgrupo impgrupo;
    // Campos
    public Field grcodcon;
    public Field grimpre;
    public Field grmodo;
    public Field grtipo;
    class Impgrupo extends Table
      {
      public Impgrupo(Select select)
        {
        super(select);
        setName("impgrupo");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        simpgrupos.grcodcon.setValue(1);
        simpgrupos.grtipo.setValue(vimptipos.titipo);
        return super.onInsert();
        }
      public boolean onUpdate()
        {
        simpgrupos.grcodcon.setValue(1);
        simpgrupos.grtipo.setValue(vimptipos.titipo);
        return super.onUpdate();
        }
      }
      
    public Simpgrupos()
      {
      setName("simpgrupos");
      setFather(simptipos);
      addTable(impgrupo=new Impgrupo(this));
      addField(grcodcon=new Field(this,impgrupo,"grcodcon"));
      addField(grimpre=new Field(this,impgrupo,"grimpre"));
      addField(grmodo=new Field(this,impgrupo,"grmodo"));
      addField(grtipo=new Field(this,impgrupo,"grtipo"));
      }
    public String getWhere()
      {
      return "GRCODCON=1 and GRTIPO="+vimptipos.titipo.getSQLFormat();
      }
    }
    
  public ProgAdmtipimpr(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admtipimpr=this;
    setName("admtipimpr");
    setTitle("Tipos de impresión");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vimptipos=new FormVimptipos(this));
    addForm(vimpgrupos=new FormVimpgrupos(this));
    }
  public ProgAdmtipimpr()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
