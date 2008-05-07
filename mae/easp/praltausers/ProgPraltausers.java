// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:01
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.praltausers;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: praltausers
// Nombre:   Importación usuarios Afinity
// Versión:  1.0
// 
public class ProgPraltausers extends Program
  {
  public AppEasp easp;
  public ProgPraltausers praltausers;
  // Ventana
  public FormValtausers valtausers;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Importación usuarios Afinity");
      }
    }
    
  public class FormValtausers extends ProcessForm
    {
    // Controles
    public CtrlCoddp coddp;
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
      
    public class CtrlCoddp extends ControlEdit
      {
      public CtrlCoddp(Form form)
        {
        super(form);
        setName("coddp");
        setTitle("código DP");
        setType(STRING);
        setLength(12);
        setEnabled(false);
        setPrintable(false);
        }
      public Object getDefault()
        {
        return Easp.dominio;
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
        UsersAfinity usersAfinity = new UsersAfinity(Easp.dominio);
        usersAfinity.run(praltausers);
        
        }
      }
      
    public FormValtausers(ProgPraltausers praltausers)
      {
      super(praltausers);
      setName("valtausers");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      addControl(coddp=new CtrlCoddp(this));
      addAction(btprocesar=new LinkBtprocesar(this));
      }
    }
    
  public ProgPraltausers()
    {
    this.praltausers=this;
    setName("praltausers");
    setTitle("Importación usuarios Afinity");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(valtausers=new FormValtausers(this));
    }
  public ProgPraltausers(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
