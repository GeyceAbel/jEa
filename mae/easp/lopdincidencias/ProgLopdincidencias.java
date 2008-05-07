// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:01
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.lopdincidencias;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: lopdincidencias
// Nombre:   LOPD  - Control de Incidencias
// Versión:  1.0
// 
public class ProgLopdincidencias extends Program
  {
  public AppEasp easp;
  public ProgLopdincidencias lopdincidencias;
  // Inicio declaraciones globales
  
  public boolean esEmpresa = false ;
  public String aplic = ""  ;
  // Fin declaraciones globales
  // Ventana
  public FormVlopdinci vlopdinci;
  // Selects
  public Slopdinci slopdinci;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("LOPD  - Control de Incidencias");
      }
    }
    
  public class FormVlopdinci extends MultiDataForm
    {
    // Controles
    public CtrlLopdifecha lopdifecha;
    public CtrlLopdihora lopdihora;
    public CtrlLopditipo lopditipo;
    public CtrlLopdiaplic lopdiaplic;
    public CtrlLopdiuserorig lopdiuserorig;
    public CtrlLopdifechaleid lopdifechaleid;
    public CtrlLopdiuserdest lopdiuserdest;
    public CtrlLopdiconsecuen lopdiconsecuen;
    public CtrlLopdileido lopdileido;
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
      
    public class CtrlLopdifecha extends ColumnEdit
      {
      public CtrlLopdifecha(Form form)
        {
        super(form);
        setName("lopdifecha");
        setTitle("Fecha");
        setType(DATE);
        setProtect(true);
        setLength(10);
        setSearchable(true);
        setField(slopdinci.lopdifecha);
        }
      public Object getDefault()
        {
        return Maefc.getDate();
        
        }
      }
      
    public class CtrlLopdihora extends ColumnEdit
      {
      public CtrlLopdihora(Form form)
        {
        super(form);
        setName("lopdihora");
        setTitle("Hora");
        setType(STRING);
        setProtect(true);
        setLength(8);
        setSearchable(true);
        setField(slopdinci.lopdihora);
        }
      public Object getDefault()
        {
        return Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss");
        
        }
      }
      
    public class CtrlLopditipo extends ColumnEdit
      {
      public CtrlLopditipo(Form form)
        {
        super(form);
        setName("lopditipo");
        setMessageHelp("Tipo Incidencia");
        setTitle("Tipo");
        setType(STRING);
        setLength(20);
        setSearchable(true);
        setField(slopdinci.lopditipo);
        }
      }
      
    public class CtrlLopdiaplic extends ColumnComboBox
      {
      public mae.easp.general.pkaplicaciones.PickPkaplicaciones pickup;
      public CtrlLopdiaplic(Form form)
        {
        super(form);
        setName("lopdiaplic");
        setTitle("Aplicación");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkaplicaciones.PickPkaplicaciones(this));
        setLength(15);
        setSearchable(true);
        setRestricted(false);
        setDescriptionShow(false);
        setField(slopdinci.lopdiaplic);
        }
      }
      
    public class CtrlLopdiuserorig extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlLopdiuserorig(Form form)
        {
        super(form);
        setName("lopdiuserorig");
        setMessageHelp("Usuario Origen");
        setTitle("Usu. Origen");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(15);
        setSearchable(true);
        setField(slopdinci.lopdiuserorig);
        }
      }
      
    public class CtrlLopdifechaleid extends ColumnEdit
      {
      public CtrlLopdifechaleid(Form form)
        {
        super(form);
        setName("lopdifechaleid");
        setTitle("Fecha Leido");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(slopdinci.lopdifechaleid);
        }
      }
      
    public class CtrlLopdiuserdest extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlLopdiuserdest(Form form)
        {
        super(form);
        setName("lopdiuserdest");
        setMessageHelp("Usuario Destino");
        setTitle("Usu. Destino");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(15);
        setSearchable(true);
        setField(slopdinci.lopdiuserdest);
        }
      }
      
    public class CtrlLopdiconsecuen extends ColumnEdit
      {
      public CtrlLopdiconsecuen(Form form)
        {
        super(form);
        setName("lopdiconsecuen");
        setTitle("Consecuencias");
        setType(STRING);
        setLength(70);
        setField(slopdinci.lopdiconsecuen);
        }
      }
      
    public class CtrlLopdileido extends ColumnComboBox
      {
      public CtrlLopdileido(Form form)
        {
        super(form);
        setName("lopdileido");
        setTitle("Leido");
        setType(STRING);
        setLength(1);
        setSearchable(true);
        setDescriptionShow(false);
        addItem("S/Si");
        addItem("N/No");
        setField(slopdinci.lopdileido);
        }
      }
      
    public FormVlopdinci(ProgLopdincidencias lopdincidencias)
      {
      super(lopdincidencias);
      setName("vlopdinci");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(slopdinci=new Slopdinci());
      addControl(lopdifecha=new CtrlLopdifecha(this));
      addControl(lopdihora=new CtrlLopdihora(this));
      addControl(lopditipo=new CtrlLopditipo(this));
      addControl(lopdiaplic=new CtrlLopdiaplic(this));
      addControl(lopdiuserorig=new CtrlLopdiuserorig(this));
      addControl(lopdifechaleid=new CtrlLopdifechaleid(this));
      addControl(lopdiuserdest=new CtrlLopdiuserdest(this));
      addControl(lopdiconsecuen=new CtrlLopdiconsecuen(this));
      addControl(lopdileido=new CtrlLopdileido(this));
      setSelect(slopdinci);
      }
    public void onInit()
      {
      if (aplic != null && !aplic.equals("") ) {
        vlopdinci.setInitState(DataForm.SHOW);
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
  public class Slopdinci extends Select
    {
    // Tablas
    public Lopdinci lopdinci;
    // Campos
    public Field lopdiaplic;
    public Field lopdicodigo;
    public Field lopdiconsecuen;
    public Field lopdifecha;
    public Field lopdifechaleid;
    public Field lopdihora;
    public Field lopdileido;
    public Field lopditipo;
    public Field lopdiuserdest;
    public Field lopdiuserorig;
    class Lopdinci extends Table
      {
      public Lopdinci(Select select)
        {
        super(select);
        setName("lopdinci");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Slopdinci()
      {
      setName("slopdinci");
      addTable(lopdinci=new Lopdinci(this));
      addField(lopdiaplic=new Field(this,lopdinci,"lopdiaplic"));
      addField(lopdicodigo=new Field(this,lopdinci,"lopdicodigo"));
      addField(lopdiconsecuen=new Field(this,lopdinci,"lopdiconsecuen"));
      addField(lopdifecha=new Field(this,lopdinci,"lopdifecha"));
      addField(lopdifechaleid=new Field(this,lopdinci,"lopdifechaleid"));
      addField(lopdihora=new Field(this,lopdinci,"lopdihora"));
      addField(lopdileido=new Field(this,lopdinci,"lopdileido"));
      addField(lopditipo=new Field(this,lopdinci,"lopditipo"));
      addField(lopdiuserdest=new Field(this,lopdinci,"lopdiuserdest"));
      addField(lopdiuserorig=new Field(this,lopdinci,"lopdiuserorig"));
      }
    public String getWhere()
      {
      if ( aplic != null && !aplic.equals("") ) {
        return "lopdiaplic = '"+aplic+"'" ;
        }
      else return null ;
      
      }
    public String getOrder()
      {
      return "lopdifecha DESC , lopdifecha DESC " ;
      }
    }
    
  public ProgLopdincidencias()
    {
    this.lopdincidencias=this;
    setName("lopdincidencias");
    setTitle("LOPD  - Control de Incidencias");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vlopdinci=new FormVlopdinci(this));
    }
  public ProgLopdincidencias(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    if ( esEmpresa ) {
      vlopdinci.lopdiaplic.removeAllItems();
      vlopdinci.lopdiaplic.addItem("VirtualFISC");
      vlopdinci.lopdiaplic.addItem("VirtualLAB");
      vlopdinci.lopdiaplic.addItem("VirtualOFFICE");
      }
    
    super.onInit();
    
    
    }
  }
  
