// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:01
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.praltanifes;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: praltanifes
// Nombre:   Alta de Clientes desde GEyCE Token
// Versión:  1.0
// 
public class ProgPraltanifes extends Program
  {
  public AppEasp easp;
  public ProgPraltanifes praltanifes;
  // Ventana
  public FormValtanifes valtanifes;
  // Selects
  // Ventana
  public FormVerrores verrores;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Alta de Clientes desde GEyCE Token");
      }
    }
    
  public class FormValtanifes extends ProcessForm
    {
    // Controles
    public CtrlChreemplazar chreemplazar;
    // Acciones
    public LinkBtprocesar btprocesar;
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(630.0);
        setWeighty(360.0);
        setFill(BOTH);
        setAnchor(CENTER);
        }
      }
      
    public class CtrlChreemplazar extends ControlCheck
      {
      public CtrlChreemplazar(Form form)
        {
        super(form);
        setName("chreemplazar");
        setMessageHelp("Reemplazar datos de cliente en caso de existir");
        setTitle("Reemplazar Datos Cliente");
        }
      }
      
    public class LinkBtprocesar extends Action
      {
      public LinkBtprocesar(Form form)
        {
        super(form);
        setName("btprocesar");
        setTitle("&1. Procesar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        String retorn=Igcdp.AltaNifesCdp(praltanifes,chreemplazar.getBoolean());
        
        if ( retorn!=null ) {
          Maefc.message("Se ha producido algún error durante el proceso \nA continuación se abrirá una ventana con el detalle de los errores","Atención !",Maefc.ERROR_MESSAGE);
          verrores.vverror.setValue(retorn);
          verrores.open();
          }
        else 
          Maefc.message("El proceso ha finalizado correctamente","Atención !",Maefc.INFORMATION_MESSAGE);
        }
      }
      
    public FormValtanifes(ProgPraltanifes praltanifes)
      {
      super(praltanifes);
      setName("valtanifes");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      addControl(chreemplazar=new CtrlChreemplazar(this));
      addAction(btprocesar=new LinkBtprocesar(this));
      }
    }
    
  public class FormVerrores extends ProcessForm
    {
    // Controles
    public CtrlVverror vverror;
    // Acciones
    public LinkIrcerrar ircerrar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(740);
        setHeight(462);
        setTitle("Errores");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVverror extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setHorizontalAlignment(CENTER);
          setLength(65);
          setHeight(23);
          }
        }
        
      public CtrlVverror(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vverror");
        setTitle("");
        setType(STRING);
        setLength(2000);
        setEnabled(false);
        setPrintable(false);
        }
      }
      
    public class LinkIrcerrar extends Action
      {
      public LinkIrcerrar(Form form)
        {
        super(form);
        setName("ircerrar");
        setTitle("&1. Cerrar");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        verrores.exit();
        }
      }
      
    public FormVerrores(ProgPraltanifes praltanifes)
      {
      super(praltanifes);
      setName("verrores");
      setTitle("Errores");
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vverror=new CtrlVverror(this));
      addAction(ircerrar=new LinkIrcerrar(this));
      }
    }
    
  public ProgPraltanifes()
    {
    this.praltanifes=this;
    setName("praltanifes");
    setTitle("Alta de Clientes desde GEyCE Token");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(valtanifes=new FormValtanifes(this));
    addForm(verrores=new FormVerrores(this));
    }
  public ProgPraltanifes(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    /*
    LocationMDI loc=new LocationMDI();
    loc.setWidth(570);
    loc.setHeight(255);
    setLocation(loc);
    */
    super.onInit();
    }
  }
  
