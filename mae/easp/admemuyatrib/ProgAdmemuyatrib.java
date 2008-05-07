// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:58
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admemuyatrib;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admemuyatrib
// Nombre:   Configuración de emulaciones y de atributos
// Versión:  1.0
// 
public class ProgAdmemuyatrib extends Program
  {
  public AppEasp easp;
  public ProgAdmemuyatrib admemuyatrib;
  // Ventana
  public FormVemulaciones vemulaciones;
  // Selects
  public Semula semula;
  // Ventana
  public FormVatributos vatributos;
  // Selects
  public Satributos satributos;
  // Ventana
  public FormVsecuencias vsecuencias;
  // Selects
  public Ssecuencias ssecuencias;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Configuración de emulaciones y de atributos");
      }
    }
    
  public class FormVemulaciones extends MultiDataForm
    {
    // Controles
    public CtrlEmemul ememul;
    public CtrlEmdesc emdesc;
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
        setAnchor(WEST);
        }
      }
      
    public class CtrlEmemul extends ColumnEdit
      {
      public CtrlEmemul(Form form)
        {
        super(form);
        setName("ememul");
        setMessageHelp("Nombre de la emulación");
        setTitle("Nombre");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(semula.ememul);
        }
      }
      
    public class CtrlEmdesc extends ColumnEdit
      {
      public CtrlEmdesc(Form form)
        {
        super(form);
        setName("emdesc");
        setMessageHelp("Descripción de la emulación");
        setTitle("Descripción");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(semula.emdesc);
        }
      }
      
    public FormVemulaciones(ProgAdmemuyatrib admemuyatrib)
      {
      super(admemuyatrib);
      setName("vemulaciones");
      setTitle("Emulaciones");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(semula=new Semula());
      addControl(ememul=new CtrlEmemul(this));
      addControl(emdesc=new CtrlEmdesc(this));
      setSelect(semula);
      }
    }
    
  // Seleccion de emulaciones
  public class Semula extends Select
    {
    // Tablas
    public Impemul impemul;
    // Campos
    public Field emdesc;
    public Field ememul;
    class Impemul extends Table
      {
      public Impemul(Select select)
        {
        super(select);
        setName("impemul");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Semula()
      {
      setName("semula");
      addTable(impemul=new Impemul(this));
      addField(emdesc=new Field(this,impemul,"emdesc"));
      addField(ememul=new Field(this,impemul,"ememul"));
      }
    }
    
  public class FormVatributos extends MultiDataForm
    {
    // Controles
    public CtrlAtatrib atatrib;
    public CtrlAtdesc atdesc;
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
        setAnchor(EAST);
        }
      }
      
    public class CtrlAtatrib extends ColumnEdit
      {
      public CtrlAtatrib(Form form)
        {
        super(form);
        setName("atatrib");
        setMessageHelp("Nombre del atributo");
        setTitle("Atributo");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(satributos.atatrib);
        }
      }
      
    public class CtrlAtdesc extends ColumnEdit
      {
      public CtrlAtdesc(Form form)
        {
        super(form);
        setName("atdesc");
        setTitle("Descripción");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(satributos.atdesc);
        }
      }
      
    public FormVatributos(ProgAdmemuyatrib admemuyatrib)
      {
      super(admemuyatrib);
      setName("vatributos");
      setTitle("Atributos");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(satributos=new Satributos());
      addControl(atatrib=new CtrlAtatrib(this));
      addControl(atdesc=new CtrlAtdesc(this));
      setSelect(satributos);
      }
    }
    
  // Selección de atributos
  public class Satributos extends Select
    {
    // Tablas
    public Impatrib impatrib;
    // Campos
    public Field atatrib;
    public Field atdesc;
    class Impatrib extends Table
      {
      public Impatrib(Select select)
        {
        super(select);
        setName("impatrib");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Satributos()
      {
      setName("satributos");
      addTable(impatrib=new Impatrib(this));
      addField(atatrib=new Field(this,impatrib,"atatrib"));
      addField(atdesc=new Field(this,impatrib,"atdesc"));
      }
    }
    
  public class FormVsecuencias extends MultiDataForm
    {
    // Controles
    public CtrlEaatrib eaatrib;
    public CtrlEaactiva eaactiva;
    public CtrlEadesact eadesact;
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
      
    public class CtrlEaatrib extends ColumnComboBox
      {
      public mae.easp.general.pkatributos.PickPkatributos pickup;
      public CtrlEaatrib(Form form)
        {
        super(form);
        setName("eaatrib");
        setTitle("Atributo");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkatributos.PickPkatributos(this));
        setLength(15);
        setPrintable(false);
        setField(ssecuencias.eaatrib);
        }
      }
      
    public class CtrlEaactiva extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          }
        }
        
      public CtrlEaactiva(Form form)
        {
        super(form);
        setLook(new Look());
        setName("eaactiva");
        setTitle("Secuencia activa");
        setType(STRING);
        setLength(255);
        setPrintable(false);
        setField(ssecuencias.eaactiva);
        }
      }
      
    public class CtrlEadesact extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          }
        }
        
      public CtrlEadesact(Form form)
        {
        super(form);
        setLook(new Look());
        setName("eadesact");
        setTitle("Secuencia desactiva");
        setType(STRING);
        setLength(255);
        setPrintable(false);
        setField(ssecuencias.eadesact);
        }
      }
      
    public FormVsecuencias(ProgAdmemuyatrib admemuyatrib)
      {
      super(admemuyatrib);
      setName("vsecuencias");
      setTitle("Secuencias");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(ssecuencias=new Ssecuencias());
      addControl(eaatrib=new CtrlEaatrib(this));
      addControl(eaactiva=new CtrlEaactiva(this));
      addControl(eadesact=new CtrlEadesact(this));
      setSelect(ssecuencias);
      }
    }
    
  // 
  public class Ssecuencias extends Select
    {
    // Tablas
    public Impematr impematr;
    // Campos
    public Field eaactiva;
    public Field eaatrib;
    public Field eadesact;
    public Field eaemul;
    class Impematr extends Table
      {
      public Impematr(Select select)
        {
        super(select);
        setName("impematr");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        ssecuencias.eaemul.setValue(vemulaciones.ememul);
        return super.onInsert();
        }
      }
      
    public Ssecuencias()
      {
      setName("ssecuencias");
      setFather(semula);
      addTable(impematr=new Impematr(this));
      addField(eaactiva=new Field(this,impematr,"eaactiva"));
      addField(eaatrib=new Field(this,impematr,"eaatrib"));
      addField(eadesact=new Field(this,impematr,"eadesact"));
      addField(eaemul=new Field(this,impematr,"eaemul"));
      }
    public String getWhere()
      {
      return "eaemul="+vemulaciones.ememul.getSQLFormat();
      }
    }
    
  public ProgAdmemuyatrib(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admemuyatrib=this;
    setName("admemuyatrib");
    setTitle("Configuración de emulaciones y de atributos");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vemulaciones=new FormVemulaciones(this));
    addForm(vatributos=new FormVatributos(this));
    addForm(vsecuencias=new FormVsecuencias(this));
    }
  public ProgAdmemuyatrib()
    {
    this((AppEasp) Aplication.getAplication());
    }
  }
  
