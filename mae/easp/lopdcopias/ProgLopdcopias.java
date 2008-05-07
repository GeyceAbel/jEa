// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:00
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.lopdcopias;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: lopdcopias
// Nombre:   LOPD -  Control de Copias de Seguridad
// Versión:  1.0
// 
public class ProgLopdcopias extends Program
  {
  public AppEasp easp;
  public ProgLopdcopias lopdcopias;
  // Inicio declaraciones globales
  
  
  public boolean  esEmpresa = false ;
  public String aplic = ""  ;
  // Fin declaraciones globales
  // Ventana
  public FormVlopdcop vlopdcop;
  // Selects
  public Slopdcop slopdcop;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("LOPD -  Control de Copias de Seguridad");
      }
    }
    
  public class FormVlopdcop extends MultiDataForm
    {
    // Controles
    public CtrlLopdcfecha lopdcfecha;
    public CtrlLopdchora lopdchora;
    public CtrlLopdctipo lopdctipo;
    public CtrlLopdsoporte lopdsoporte;
    public CtrlLopdcaplic lopdcaplic;
    public CtrlLopdcambito lopdcambito;
    public CtrlLopdcdestino lopdcdestino;
    public CtrlLopdcuser lopdcuser;
    public CtrlLopdcfecdevolu lopdcfecdevolu;
    public CtrlLopdcfecdestru lopdcfecdestru;
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
      
    public class CtrlLopdcfecha extends ColumnEdit
      {
      public CtrlLopdcfecha(Form form)
        {
        super(form);
        setName("lopdcfecha");
        setTitle("Fecha");
        setType(DATE);
        setProtect(true);
        setLength(10);
        setSearchable(true);
        setField(slopdcop.lopdcfecha);
        }
      public Object getDefault()
        {
        return Maefc.getDate();
        
        }
      }
      
    public class CtrlLopdchora extends ColumnEdit
      {
      public CtrlLopdchora(Form form)
        {
        super(form);
        setName("lopdchora");
        setTitle("Hora");
        setType(STRING);
        setProtect(true);
        setLength(8);
        setSearchable(true);
        setField(slopdcop.lopdchora);
        }
      public Object getDefault()
        {
        return Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss");
        }
      }
      
    public class CtrlLopdctipo extends ColumnComboBox
      {
      public CtrlLopdctipo(Form form)
        {
        super(form);
        setName("lopdctipo");
        setTitle("Tipo");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setRestricted(false);
        addItem("C/Copia");
        addItem("S/Soporte");
        setField(slopdcop.lopdctipo);
        }
      }
      
    public class CtrlLopdsoporte extends ColumnEdit
      {
      public CtrlLopdsoporte(Form form)
        {
        super(form);
        setName("lopdsoporte");
        setTitle("Soporte");
        setType(STRING);
        setLength(15);
        setSearchable(true);
        setField(slopdcop.lopdsoporte);
        }
      }
      
    public class CtrlLopdcaplic extends ColumnComboBox
      {
      public mae.easp.general.pkaplicaciones.PickPkaplicaciones pickup;
      public CtrlLopdcaplic(Form form)
        {
        super(form);
        setName("lopdcaplic");
        setTitle("Aplicación");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkaplicaciones.PickPkaplicaciones(this));
        setLength(15);
        setSearchable(true);
        setRestricted(false);
        setDescriptionShow(false);
        setField(slopdcop.lopdcaplic);
        }
      }
      
    public class CtrlLopdcambito extends ColumnEdit
      {
      public CtrlLopdcambito(Form form)
        {
        super(form);
        setName("lopdcambito");
        setTitle("Ambito");
        setType(STRING);
        setLength(30);
        setSearchable(true);
        setField(slopdcop.lopdcambito);
        }
      }
      
    public class CtrlLopdcdestino extends ColumnEdit
      {
      public CtrlLopdcdestino(Form form)
        {
        super(form);
        setName("lopdcdestino");
        setTitle("Destino");
        setType(STRING);
        setLength(30);
        setSearchable(true);
        setField(slopdcop.lopdcdestino);
        }
      }
      
    public class CtrlLopdcuser extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlLopdcuser(Form form)
        {
        super(form);
        setName("lopdcuser");
        setTitle("Usuario");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(15);
        setSearchable(true);
        setDescriptionShow(false);
        setField(slopdcop.lopdcuser);
        }
      }
      
    public class CtrlLopdcfecdevolu extends ColumnEdit
      {
      public CtrlLopdcfecdevolu(Form form)
        {
        super(form);
        setName("lopdcfecdevolu");
        setTitle("Fecha Devolución");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(slopdcop.lopdcfecdevolu);
        }
      }
      
    public class CtrlLopdcfecdestru extends ColumnEdit
      {
      public CtrlLopdcfecdestru(Form form)
        {
        super(form);
        setName("lopdcfecdestru");
        setMessageHelp("Fecha Destrucción");
        setTitle("Fecha Destrucción");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(slopdcop.lopdcfecdestru);
        }
      }
      
    public FormVlopdcop(ProgLopdcopias lopdcopias)
      {
      super(lopdcopias);
      setName("vlopdcop");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(slopdcop=new Slopdcop());
      addControl(lopdcfecha=new CtrlLopdcfecha(this));
      addControl(lopdchora=new CtrlLopdchora(this));
      addControl(lopdctipo=new CtrlLopdctipo(this));
      addControl(lopdsoporte=new CtrlLopdsoporte(this));
      addControl(lopdcaplic=new CtrlLopdcaplic(this));
      addControl(lopdcambito=new CtrlLopdcambito(this));
      addControl(lopdcdestino=new CtrlLopdcdestino(this));
      addControl(lopdcuser=new CtrlLopdcuser(this));
      addControl(lopdcfecdevolu=new CtrlLopdcfecdevolu(this));
      addControl(lopdcfecdestru=new CtrlLopdcfecdestru(this));
      setSelect(slopdcop);
      }
    public void onInit()
      {
      if (aplic != null && !aplic.equals("") ) {
        vlopdcop.setInitState(DataForm.SHOW);
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
  public class Slopdcop extends Select
    {
    // Tablas
    public Lopdcop lopdcop;
    // Campos
    public Field lopdcambito;
    public Field lopdcaplic;
    public Field lopdccodigo;
    public Field lopdcdestino;
    public Field lopdcfecdestru;
    public Field lopdcfecdevolu;
    public Field lopdcfecha;
    public Field lopdchora;
    public Field lopdctipo;
    public Field lopdcuser;
    public Field lopdsoporte;
    class Lopdcop extends Table
      {
      public Lopdcop(Select select)
        {
        super(select);
        setName("lopdcop");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Slopdcop()
      {
      setName("slopdcop");
      addTable(lopdcop=new Lopdcop(this));
      addField(lopdcambito=new Field(this,lopdcop,"lopdcambito"));
      addField(lopdcaplic=new Field(this,lopdcop,"lopdcaplic"));
      addField(lopdccodigo=new Field(this,lopdcop,"lopdccodigo"));
      addField(lopdcdestino=new Field(this,lopdcop,"lopdcdestino"));
      addField(lopdcfecdestru=new Field(this,lopdcop,"lopdcfecdestru"));
      addField(lopdcfecdevolu=new Field(this,lopdcop,"lopdcfecdevolu"));
      addField(lopdcfecha=new Field(this,lopdcop,"lopdcfecha"));
      addField(lopdchora=new Field(this,lopdcop,"lopdchora"));
      addField(lopdctipo=new Field(this,lopdcop,"lopdctipo"));
      addField(lopdcuser=new Field(this,lopdcop,"lopdcuser"));
      addField(lopdsoporte=new Field(this,lopdcop,"lopdsoporte"));
      }
    public String getWhere()
      {
      if ( aplic != null && !aplic.equals("") ) {
        return "lopdcaplic = '"+aplic+"'" ;
        }
      else return null ;
      
      }
    public String getOrder()
      {
      return "lopdcfecha DESC , lopdchora DESC";
      }
    }
    
  public ProgLopdcopias()
    {
    this.lopdcopias=this;
    setName("lopdcopias");
    setTitle("LOPD -  Control de Copias de Seguridad");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vlopdcop=new FormVlopdcop(this));
    }
  public ProgLopdcopias(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    
    if ( esEmpresa ) {
      vlopdcop.lopdcaplic.removeAllItems();
      vlopdcop.lopdcaplic.addItem("VirtualFISC");
      vlopdcop.lopdcaplic.addItem("VirtualLAB");
      vlopdcop.lopdcaplic.addItem("VirtualOFFICE");
      }
    
    super.onInit();
    }
  }
  
