// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:58
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admdeferr;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admdeferr
// Nombre:   Definición de códigos de error
// Versión:  1.0
// 
public class ProgAdmdeferr extends Program
  {
  public AppEasp easp;
  public ProgAdmdeferr admdeferr;
  // Inicio declaraciones globales
  public boolean vienedeinc=false;
  public String ambito=null;
  public String modulo=null;
  public String refer=null;
  // Fin declaraciones globales
  // Ventana
  public FormVdeferrors vdeferrors;
  // Selects
  public Sinerrcod sinerrcod;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Definición de códigos de error");
      }
    }
    
  public class FormVdeferrors extends MonoDataForm
    {
    // Controles
    public CtrlErambito erambito;
    public CtrlErmodulo ermodulo;
    public CtrlErprog erprog;
    public CtrlErrefer errefer;
    public CtrlLineablanco1 lineablanco1;
    public CtrlErnumer ernumer;
    public CtrlErcritic ercritic;
    public CtrlIncidenci incidenci;
    public CtrlErdescri erdescri;
    public CtrlEropcion eropcion;
    public CtrlErsoluci ersoluci;
    public CtrlErexec erexec;
    // Acciones
    public LinkTest test;
    public LinkIncidencias incidencias;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        }
      }
      
    public class CtrlErambito extends ControlComboBox
      {
      public CtrlErambito(Form form)
        {
        super(form);
        setName("erambito");
        setTitle("Ámbito");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setPrintable(false);
        setDescriptionShow(false);
        addItem("HARDWARE");
        addItem("PLATAFORMA");
        addItem("GEYCE");
        addItem("APLICATIVO");
        addItem("OFIMATICA");
        setField(sinerrcod.erambito);
        }
      }
      
    public class CtrlErmodulo extends ControlEdit
      {
      public CtrlErmodulo(Form form)
        {
        super(form);
        setName("ermodulo");
        setTitle("Módulo");
        setType(STRING);
        setMaskInput("U");
        setLength(10);
        setSearchable(true);
        setPrintable(false);
        setField(sinerrcod.ermodulo);
        }
      }
      
    public class CtrlErprog extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          }
        }
        
      public CtrlErprog(Form form)
        {
        super(form);
        setLook(new Look());
        setName("erprog");
        setMessageHelp("Programa o fabricante");
        setTitle("Programa");
        setType(STRING);
        setLength(80);
        setSearchable(true);
        setPrintable(false);
        setField(sinerrcod.erprog);
        }
      }
      
    public class CtrlErrefer extends ControlEdit
      {
      public CtrlErrefer(Form form)
        {
        super(form);
        setName("errefer");
        setMessageHelp("Etiqueta de referencia");
        setTitle("Referencia");
        setType(STRING);
        setMaskInput("U");
        setLength(10);
        setSearchable(true);
        setPrintable(false);
        setField(sinerrcod.errefer);
        }
      }
      
    public class CtrlLineablanco1 extends ControlLabel
      {
      public CtrlLineablanco1(Form form)
        {
        super(form);
        setName("lineablanco1");
        setTitle("");
        setPrintable(false);
        }
      }
      
    public class CtrlErnumer extends ControlEdit
      {
      public CtrlErnumer(Form form)
        {
        super(form);
        setName("ernumer");
        setTitle("Código de error");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        setField(sinerrcod.ernumer);
        }
      }
      
    public class CtrlErcritic extends ControlComboBox
      {
      public CtrlErcritic(Form form)
        {
        super(form);
        setName("ercritic");
        setTitle("Nivel de gravedad");
        setType(STRING);
        setLength(1);
        setPrintable(false);
        setComboEditable(false);
        addItem("A/Aviso");
        addItem("E/Error");
        addItem("C/Error crítico");
        setField(sinerrcod.ercritic);
        }
      public void onChange()
        {
        super.onChange();
        if (getString().equals("E") || getString().equals("E")){
          eropcion.setValue(-1);
          eropcion.setEnabled(false);
          }
        else
          eropcion.setEnabled(true);
        }
      }
      
    public class CtrlIncidenci extends ControlCheck
      {
      public CtrlIncidenci(Form form)
        {
        super(form);
        setName("incidenci");
        setMessageHelp("Indica si hay que registrar la incidencia");
        setTitle("Registrar incidencia");
        }
      public Object getDefault()
        {
        return new Boolean(false);
        }
      }
      
    public class CtrlErdescri extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          setHeight(3);
          }
        }
        
      public CtrlErdescri(Form form)
        {
        super(form);
        setLook(new Look());
        setName("erdescri");
        setTitle("Descripción");
        setType(STRING);
        setLength(1024);
        setPrintable(false);
        setField(sinerrcod.erdescri);
        }
      }
      
    public class CtrlEropcion extends ControlComboBox
      {
      public CtrlEropcion(Form form)
        {
        super(form);
        setName("eropcion");
        setMessageHelp("Opciones que se le dan al usuario en caso de nivel A");
        setTitle("Opciones");
        setType(INTEGER);
        setLength(10);
        setPrintable(false);
        setComboEditable(false);
        addItem("-1/ACEPTAR");
        addItem("0/SI_NO");
        addItem("1/SI_NO_CANCELAR");
        addItem("2/ACEPTAR_CANCELAR");
        setField(sinerrcod.eropcion);
        }
      }
      
    public class CtrlErsoluci extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          setHeight(3);
          }
        }
        
      public CtrlErsoluci(Form form)
        {
        super(form);
        setLook(new Look());
        setName("ersoluci");
        setMessageHelp("Solución a causa del problema");
        setTitle("Solucion");
        setType(STRING);
        setLength(1024);
        setPrintable(false);
        setField(sinerrcod.ersoluci);
        }
      }
      
    public class CtrlErexec extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          }
        }
        
      public CtrlErexec(Form form)
        {
        super(form);
        setLook(new Look());
        setName("erexec");
        setMessageHelp("Ejecutable a invocar al producirse la incidencia");
        setTitle("Ejecutable");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        setField(sinerrcod.erexec);
        }
      }
      
    public class LinkTest extends Action
      {
      public LinkTest(Form form)
        {
        super(form);
        setName("test");
        setTitle("Test");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        mae.admon.general.Admon.testMessage(erambito.getString(),ermodulo.getString(),erprog.getString(),
                          errefer.getString(),ernumer.getString(),"operacion",erdescri.getString(),
                          ersoluci.getString(),ercritic.getString(),eropcion.getInteger());
        super.onAction();
        }
      }
      
    public class LinkIncidencias extends Action
      {
      public LinkIncidencias(Form form)
        {
        super(form);
        setName("incidencias");
        setTitle("Incidencias asociadas");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        mae.easp.adminciden.ProgAdminciden prog=new mae.easp.adminciden.ProgAdminciden();
        prog.vienededef=true;
        prog.ambito=erambito.getString();
        prog.modulo=ermodulo.getString();
        prog.refer=errefer.getString();
        prog.vincidencias.setInitState(DataForm.SHOW);
        prog.run();
        super.onAction();
        }
      }
      
    public FormVdeferrors(ProgAdmdeferr admdeferr)
      {
      super(admdeferr);
      setName("vdeferrors");
      setTitle("Definición de errores");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(sinerrcod=new Sinerrcod());
      addControl(erambito=new CtrlErambito(this));
      addControl(ermodulo=new CtrlErmodulo(this));
      addControl(erprog=new CtrlErprog(this));
      addControl(errefer=new CtrlErrefer(this));
      addControl(lineablanco1=new CtrlLineablanco1(this));
      addControl(ernumer=new CtrlErnumer(this));
      addControl(ercritic=new CtrlErcritic(this));
      addControl(incidenci=new CtrlIncidenci(this));
      addControl(erdescri=new CtrlErdescri(this));
      addControl(eropcion=new CtrlEropcion(this));
      addControl(ersoluci=new CtrlErsoluci(this));
      addControl(erexec=new CtrlErexec(this));
      addAction(test=new LinkTest(this));
      addAction(incidencias=new LinkIncidencias(this));
      setSelect(sinerrcod);
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      if (sinerrcod.erincide.getString().equals("S"))
        incidenci.setValue(true);
      else if (sinerrcod.erincide.getString().equals("N"))
        incidenci.setValue(false);
      
      }
    }
    
  // 
  public class Sinerrcod extends Select
    {
    // Tablas
    public Inerrcod inerrcod;
    // Campos
    public Field erambito;
    public Field ercodigo;
    public Field ercritic;
    public Field erdescri;
    public Field erexec;
    public Field erincide;
    public Field ermodulo;
    public Field ernumer;
    public Field eropcion;
    public Field erprog;
    public Field errefer;
    public Field ersoluci;
    class Inerrcod extends Table
      {
      public Inerrcod(Select select)
        {
        super(select);
        setName("inerrcod");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        if (vdeferrors.incidenci.getBoolean())
          erincide.setValue("SI");
        else
          erincide.setValue("NO");
        return super.onInsert();
        }
      public boolean onUpdate()
        {
        if (vdeferrors.incidenci.getBoolean())
          erincide.setValue("SI");
        else
          erincide.setValue("NO");
        return super.onUpdate();
        }
      }
      
    public Sinerrcod()
      {
      setName("sinerrcod");
      addTable(inerrcod=new Inerrcod(this));
      addField(erambito=new Field(this,inerrcod,"erambito"));
      addField(ercodigo=new Field(this,inerrcod,"ercodigo"));
      addField(ercritic=new Field(this,inerrcod,"ercritic"));
      addField(erdescri=new Field(this,inerrcod,"erdescri"));
      addField(erexec=new Field(this,inerrcod,"erexec"));
      addField(erincide=new Field(this,inerrcod,"erincide"));
      addField(ermodulo=new Field(this,inerrcod,"ermodulo"));
      addField(ernumer=new Field(this,inerrcod,"ernumer"));
      addField(eropcion=new Field(this,inerrcod,"eropcion"));
      addField(erprog=new Field(this,inerrcod,"erprog"));
      addField(errefer=new Field(this,inerrcod,"errefer"));
      addField(ersoluci=new Field(this,inerrcod,"ersoluci"));
      }
    public String getWhere()
      {
      if (vienedeinc)
        return "erambito='"+ambito+"' and ermodulo='"+modulo+"' and errefer='"+refer+"'";
      else
        return null;
      }
    public String getOrder()
      {
      return "erambito,ermodulo,erprog,errefer";
      }
    }
    
  public ProgAdmdeferr(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admdeferr=this;
    setName("admdeferr");
    setTitle("Definición de códigos de error");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vdeferrors=new FormVdeferrors(this));
    }
  public ProgAdmdeferr()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    super.onInit();
    if (vienedeinc && sinerrcod.isEof()){
      exit();
      Maefc.message("No hay definición de error asociada");
      }
    }
  }
  
