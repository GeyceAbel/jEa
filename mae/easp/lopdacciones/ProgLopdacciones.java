// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:00
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.lopdacciones;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: lopdacciones
// Nombre:   LOPD - Control de Accesos
// Versión:  1.0
// 
public class ProgLopdacciones extends Program
  {
  public AppEasp easp;
  public ProgLopdacciones lopdacciones;
  // Inicio declaraciones globales
  
  public boolean  esEmpresa = false ;
  public String aplic = ""  ;
  public String user  = ""  ;
  
  
  // Fin declaraciones globales
  // Ventana
  public FormVlopdacc vlopdacc;
  // Selects
  public Slopdacc slopdacc;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("LOPD - Control de Accesos");
      }
    }
    
  public class FormVlopdacc extends MultiDataForm
    {
    // Controles
    public CtrlLopdaaplic lopdaaplic;
    public CtrlLopdaejer lopdaejer;
    public CtrlLopdauser lopdauser;
    public CtrlLopdapuesto lopdapuesto;
    public CtrlLopdafechaacc lopdafechaacc;
    public CtrlLopdahoraacc lopdahoraacc;
    public CtrlLopdatipacc lopdatipacc;
    public CtrlLopdaprogram lopdaprogram;
    public CtrlLopdadescprog lopdadescprog;
    public CtrlLopdacodicdp lopdacodicdp;
    public CtrlLopdanif lopdanif;
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
        setAnchor(CENTER);
        }
      }
      
    public class CtrlLopdaaplic extends ColumnEdit
      {
      public CtrlLopdaaplic(Form form)
        {
        super(form);
        setName("lopdaaplic");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(slopdacc.lopdaaplic);
        }
      }
      
    public class CtrlLopdaejer extends ColumnEdit
      {
      public CtrlLopdaejer(Form form)
        {
        super(form);
        setName("lopdaejer");
        setMessageHelp("Ejercicio");
        setTitle("Ejer.");
        setType(INTEGER);
        setLength(4);
        setSearchable(true);
        setField(slopdacc.lopdaejer);
        }
      }
      
    public class CtrlLopdauser extends ColumnEdit
      {
      public CtrlLopdauser(Form form)
        {
        super(form);
        setName("lopdauser");
        setTitle("Usuario");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(slopdacc.lopdauser);
        }
      }
      
    public class CtrlLopdapuesto extends ColumnEdit
      {
      public CtrlLopdapuesto(Form form)
        {
        super(form);
        setName("lopdapuesto");
        setTitle("Puesto");
        setType(STRING);
        setLength(45);
        setSearchable(true);
        setField(slopdacc.lopdapuesto);
        }
      }
      
    public class CtrlLopdafechaacc extends ColumnEdit
      {
      public CtrlLopdafechaacc(Form form)
        {
        super(form);
        setName("lopdafechaacc");
        setTitle("Fecha Acceso");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(slopdacc.lopdafechaacc);
        }
      }
      
    public class CtrlLopdahoraacc extends ColumnEdit
      {
      public CtrlLopdahoraacc(Form form)
        {
        super(form);
        setName("lopdahoraacc");
        setTitle("Hora Acceso");
        setType(STRING);
        setLength(8);
        setField(slopdacc.lopdahoraacc);
        }
      }
      
    public class CtrlLopdatipacc extends ColumnComboBox
      {
      public CtrlLopdatipacc(Form form)
        {
        super(form);
        setName("lopdatipacc");
        setMessageHelp("Tipo de Acceso");
        setTitle("Tipo");
        setType(STRING);
        setLength(1);
        addItem("C/Consulta");
        addItem("M/Modificación");
        addItem("A/Alta ");
        addItem("B/Baja ");
        addItem("I/Impresión ");
        setField(slopdacc.lopdatipacc);
        }
      }
      
    public class CtrlLopdaprogram extends ColumnEdit
      {
      public CtrlLopdaprogram(Form form)
        {
        super(form);
        setName("lopdaprogram");
        setTitle("Programa");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(slopdacc.lopdaprogram);
        }
      }
      
    public class CtrlLopdadescprog extends ColumnEdit
      {
      public CtrlLopdadescprog(Form form)
        {
        super(form);
        setName("lopdadescprog");
        setTitle("Descripción");
        setType(STRING);
        setLength(50);
        setField(slopdacc.lopdadescprog);
        }
      }
      
    public class CtrlLopdacodicdp extends ColumnEdit
      {
      public CtrlLopdacodicdp(Form form)
        {
        super(form);
        setName("lopdacodicdp");
        setTitle("Código CDP");
        setType(STRING);
        setLength(12);
        setSearchable(true);
        setField(slopdacc.lopdacodicdp);
        }
      }
      
    public class CtrlLopdanif extends ColumnEdit
      {
      public CtrlLopdanif(Form form)
        {
        super(form);
        setName("lopdanif");
        setMessageHelp("NIF");
        setTitle("NIF");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(slopdacc.lopdanif);
        }
      }
      
    public FormVlopdacc(ProgLopdacciones lopdacciones)
      {
      super(lopdacciones);
      setName("vlopdacc");
      setLocation(new Location());
      setStates(SHOW | SEARCH);
      addSelect(slopdacc=new Slopdacc());
      addControl(lopdaaplic=new CtrlLopdaaplic(this));
      addControl(lopdaejer=new CtrlLopdaejer(this));
      addControl(lopdauser=new CtrlLopdauser(this));
      addControl(lopdapuesto=new CtrlLopdapuesto(this));
      addControl(lopdafechaacc=new CtrlLopdafechaacc(this));
      addControl(lopdahoraacc=new CtrlLopdahoraacc(this));
      addControl(lopdatipacc=new CtrlLopdatipacc(this));
      addControl(lopdaprogram=new CtrlLopdaprogram(this));
      addControl(lopdadescprog=new CtrlLopdadescprog(this));
      addControl(lopdacodicdp=new CtrlLopdacodicdp(this));
      addControl(lopdanif=new CtrlLopdanif(this));
      setSelect(slopdacc);
      }
    public void onInit()
      {
      if (aplic != null && !aplic.equals("") ) {
        vlopdacc.setInitState(DataForm.SHOW);
        }
      super.onInit();
      }
    public void onSearch()
      {
      aplic = null ;
      super.onSearch();
      
      }
    }
    
  // 
  public class Slopdacc extends Select
    {
    // Tablas
    public Lopdacc lopdacc;
    // Campos
    public Field lopdaaplic;
    public Field lopdacodicdp;
    public Field lopdacodigo;
    public Field lopdadescprog;
    public Field lopdaejer;
    public Field lopdafechaacc;
    public Field lopdahoraacc;
    public Field lopdanif;
    public Field lopdaprogram;
    public Field lopdapuesto;
    public Field lopdatipacc;
    public Field lopdauser;
    class Lopdacc extends Table
      {
      public Lopdacc(Select select)
        {
        super(select);
        setName("lopdacc");
        setOptions(READ);
        }
      }
      
    public Slopdacc()
      {
      setName("slopdacc");
      addTable(lopdacc=new Lopdacc(this));
      addField(lopdaaplic=new Field(this,lopdacc,"lopdaaplic"));
      addField(lopdacodicdp=new Field(this,lopdacc,"lopdacodicdp"));
      addField(lopdacodigo=new Field(this,lopdacc,"lopdacodigo"));
      addField(lopdadescprog=new Field(this,lopdacc,"lopdadescprog"));
      addField(lopdaejer=new Field(this,lopdacc,"lopdaejer"));
      addField(lopdafechaacc=new Field(this,lopdacc,"lopdafechaacc"));
      addField(lopdahoraacc=new Field(this,lopdacc,"lopdahoraacc"));
      addField(lopdanif=new Field(this,lopdacc,"lopdanif"));
      addField(lopdaprogram=new Field(this,lopdacc,"lopdaprogram"));
      addField(lopdapuesto=new Field(this,lopdacc,"lopdapuesto"));
      addField(lopdatipacc=new Field(this,lopdacc,"lopdatipacc"));
      addField(lopdauser=new Field(this,lopdacc,"lopdauser"));
      }
    public String getWhere()
      {
      if ( aplic != null && !aplic.equals("") ) {
        return "lopdaaplic = '"+aplic+"'" ;
        }
      else return null ;
      
      }
    public String getOrder()
      {
      return " lopdafechaacc DESC , lopdahoraacc DESC " ;
      }
    }
    
  public ProgLopdacciones()
    {
    this.lopdacciones=this;
    setName("lopdacciones");
    setTitle("LOPD - Control de Accesos");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vlopdacc=new FormVlopdacc(this));
    }
  public ProgLopdacciones(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
