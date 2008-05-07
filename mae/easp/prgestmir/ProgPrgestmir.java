// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:04
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prgestmir;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prgestmir
// Nombre:   Gestión de documentos MIR
// Versión:  1.0
// 
public class ProgPrgestmir extends Program
  {
  public AppEasp easp;
  public ProgPrgestmir prgestmir;
  // Inicio declaraciones globales
  public String where() {
    return null ; 
    }
  
  public String aplic = null ;
  // Fin declaraciones globales
  // Ventana
  public FormVgestmir vgestmir;
  // Selects
  public Smir smir;
  // Ventana
  public FormVbuscar vbuscar;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Gestión de documentos MIR");
      }
    }
    
  public class FormVgestmir extends MultiDataForm
    {
    // Controles
    public CtrlVvactivado vvactivado;
    public CtrlMircdp mircdp;
    public CtrlMiraplic miraplic;
    public CtrlMirestado mirestado;
    public CtrlMirdesc mirdesc;
    public CtrlMirubicacion mirubicacion;
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
      
    public class CtrlVvactivado extends ColumnCheck
      {
      public CtrlVvactivado(Form form)
        {
        super(form);
        setName("vvactivado");
        setTitle("Act");
        }
      }
      
    public class CtrlMircdp extends ColumnComboBox
      {
      public mae.easp.general.pkcdp.PickPkcdp pickup;
      public CtrlMircdp(Form form)
        {
        super(form);
        setName("mircdp");
        setTitle("CDP");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkcdp.PickPkcdp(this));
        setLength(12);
        setSearchable(true);
        setPrintable(false);
        setField(smir.mircdp);
        }
      }
      
    public class CtrlMiraplic extends ColumnEdit
      {
      public CtrlMiraplic(Form form)
        {
        super(form);
        setName("miraplic");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setPrintable(false);
        setField(smir.miraplic);
        }
      }
      
    public class CtrlMirestado extends ColumnComboBox
      {
      public CtrlMirestado(Form form)
        {
        super(form);
        setName("mirestado");
        setTitle("Estado");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setPrintable(false);
        addItem("E/Enviado");
        addItem("P/Pendiente");
        setField(smir.mirestado);
        }
      }
      
    public class CtrlMirdesc extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          }
        }
        
      public CtrlMirdesc(Form form)
        {
        super(form);
        setLook(new Look());
        setName("mirdesc");
        setTitle("Descripción");
        setType(STRING);
        setLength(100);
        setSearchable(true);
        setPrintable(false);
        setField(smir.mirdesc);
        }
      }
      
    public class CtrlMirubicacion extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(45);
          }
        }
        
      public CtrlMirubicacion(Form form)
        {
        super(form);
        setLook(new Look());
        setName("mirubicacion");
        setTitle("Fichero");
        setType(STRING);
        setLength(200);
        setSearchable(true);
        setPrintable(false);
        setField(smir.mirubicacion);
        }
      }
      
    public FormVgestmir(ProgPrgestmir prgestmir)
      {
      super(prgestmir);
      setName("vgestmir");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE);
      setPrintable(false);
      addSelect(smir=new Smir());
      addControl(vvactivado=new CtrlVvactivado(this));
      addControl(mircdp=new CtrlMircdp(this));
      addControl(miraplic=new CtrlMiraplic(this));
      addControl(mirestado=new CtrlMirestado(this));
      addControl(mirdesc=new CtrlMirdesc(this));
      addControl(mirubicacion=new CtrlMirubicacion(this));
      setSelect(smir);
      }
    public void onInit()
      {
      super.onInit();
      setInitState(DataForm.SHOW);
      
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      
      if ( smir.miractivado.getString().equals("S") )
        vvactivado.setValue(true);
      else 
        vvactivado.setValue(false);
      }
    }
    
  // 
  public class Smir extends Select
    {
    // Tablas
    public Mir mir;
    // Campos
    public Field miractivado;
    public Field miraplic;
    public Field mircdp;
    public Field mircif;
    public Field mircodi;
    public Field mirdesc;
    public Field mirestado;
    public Field mirmcodemp;
    public Field mirnomcodcen;
    public Field mirnomcodtra;
    public Field mirubicacion;
    class Mir extends Table
      {
      public Mir(Select select)
        {
        super(select);
        setName("mir");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Smir()
      {
      setName("smir");
      addTable(mir=new Mir(this));
      addField(miractivado=new Field(this,mir,"miractivado"));
      addField(miraplic=new Field(this,mir,"miraplic"));
      addField(mircdp=new Field(this,mir,"mircdp"));
      addField(mircif=new Field(this,mir,"mircif"));
      addField(mircodi=new Field(this,mir,"mircodi"));
      addField(mirdesc=new Field(this,mir,"mirdesc"));
      addField(mirestado=new Field(this,mir,"mirestado"));
      addField(mirmcodemp=new Field(this,mir,"mirmcodemp"));
      addField(mirnomcodcen=new Field(this,mir,"mirnomcodcen"));
      addField(mirnomcodtra=new Field(this,mir,"mirnomcodtra"));
      addField(mirubicacion=new Field(this,mir,"mirubicacion"));
      }
    public String getWhere()
      {
      return where() ;
      }
    }
    
  public class FormVbuscar extends ProcessForm
    {
    // Controles
    public CtrlVvcdp vvcdp;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setTitle("Buscar documentos MIR");
        setModal(true);
        }
      }
      
    public class CtrlVvcdp extends ControlLabel
      {
      public CtrlVvcdp(Form form)
        {
        super(form);
        setName("vvcdp");
        setTitle("CDP");
        setPrintable(false);
        }
      }
      
    public FormVbuscar(ProgPrgestmir prgestmir)
      {
      super(prgestmir);
      setName("vbuscar");
      setTitle("Buscar documentos MIR");
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvcdp=new CtrlVvcdp(this));
      }
    }
    
  public ProgPrgestmir()
    {
    this.prgestmir=this;
    setName("prgestmir");
    setTitle("Gestión de documentos MIR");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vgestmir=new FormVgestmir(this));
    addForm(vbuscar=new FormVbuscar(this));
    }
  public ProgPrgestmir(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
