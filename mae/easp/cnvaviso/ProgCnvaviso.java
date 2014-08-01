// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20140801
// Hora:             14:19:14
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.cnvaviso;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: cnvaviso
// Nombre:   Aviso
// Versión:  1.0
// 
public class ProgCnvaviso extends Program
  {
  public AppEasp easp;
  public ProgCnvaviso cnvaviso;
  // Inicio declaraciones globales
  public boolean haAceptadoCondiciones = false;
  
  
  // Fin declaraciones globales
  // Ventana
  public FormVaviso vaviso;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Aviso");
      }
    }
    
  public class FormVaviso extends ProcessForm
    {
    // Inicio declaraciones globales
    public void onOpened() {
      super.onOpened();
      haAceptadoCondiciones = false;
    }
    // Fin declaraciones globales
    // Controles
    public CtrlChok chok;
    // Acciones
    public LinkAsalir asalir;
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
      
    public class CtrlChok extends ControlCheck
      {
      public CtrlChok(Form form)
        {
        super(form);
        setName("chok");
        setMessageHelp("Acepto las condiciones de uso");
        setTitle("Acepto las condiciones de uso");
        }
      public boolean  valid()
        {
        return true;
        }
        public void userChange (Value v) {
          super.userChange(v);
          haAceptadoCondiciones = getBoolean();
        }
      public Object getDefault()
        {
        return Boolean.FALSE;
        }
      }
      
    public class LinkAsalir extends Action
      {
      public LinkAsalir(Form form)
        {
        super(form);
        setName("asalir");
        setTitle("C E R R A R     V E N T A N A");
        setOptions(SHOW | EOF);
        }
      public void onAction()
        {
        super.onAction();
        cnvaviso.exit();
        }
      }
      
    public FormVaviso(ProgCnvaviso cnvaviso)
      {
      super(cnvaviso);
      setName("vaviso");
      setLocation(new Location());
      setPrintable(false);
      addControl(chok=new CtrlChok(this));
      addAction(asalir=new LinkAsalir(this));
      }
    public void onExit()
      {
      if (!haAceptadoCondiciones) Maefc.message("Proceso cancelado por no aceptar las condiciones del traspaso.","¡Atención!",Maefc.WARNING_MESSAGE);
      super.onExit();
      }
    }
    
  public ProgCnvaviso()
    {
    this.cnvaviso=this;
    setName("cnvaviso");
    setTitle("Aviso");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vaviso=new FormVaviso(this));
    }
  public ProgCnvaviso(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    LocationWindow loc = new LocationWindow();
    loc.setWidth(790);
    loc.setHeight(495);
    setModal(true);
    setLocation(loc);
    vaviso.setLayout (new LayoutHtml ("mae/easp/html/cnvaviso.html"));
    super.onInit();
    }
  }
  
