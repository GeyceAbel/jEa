// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20091007
// Hora:             13:26:59
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.zzzprmenuprogs;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: zzzprmenuprogs
// Nombre:   Inicio
// Versión:  1.1
// 
public class ProgZzzprmenuprogs extends Program
  {
  public AppEasp easp;
  public ProgZzzprmenuprogs zzzprmenuprogs;
  // Ventana
  public FormVmenu vmenu;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Inicio");
      }
    }
    
  public class FormVmenu extends ProcessForm
    {
    // Controles
    // Acciones
    class Location extends LocationBorder
      {
      public Location( )
        {
        super();
        }
      }
      
    public FormVmenu(ProgZzzprmenuprogs zzzprmenuprogs)
      {
      super(zzzprmenuprogs);
      setName("vmenu");
      setLayout(new LayoutGridBag());
      setLocation(new Location());
      setPrintable(false);
      }
    }
    
  public ProgZzzprmenuprogs()
    {
    this.zzzprmenuprogs=this;
    setName("zzzprmenuprogs");
    setTitle("Inicio");
    setLayout(new LayoutBorder());
    setLocation(new Location());
    addForm(vmenu=new FormVmenu(this));
    }
  public ProgZzzprmenuprogs(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    ((LocationTabbed)zzzprmenuprogs.getLocation()).setExitIcon(false);
    vmenu.setLayout(new LayoutHtml("mae/easp/html/zzzprmenuprogs_vmenu.html"));
    super.onInit();
    
    }
  }
  
