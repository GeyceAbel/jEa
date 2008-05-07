// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:07
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.zzzprsalir;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: zzzprsalir
// Nombre:   Salir
// Versión:  1.0
// 
public class ProgZzzprsalir extends Program
  {
  public AppEasp easp;
  public ProgZzzprsalir zzzprsalir;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Salir");
      }
    }
    
  public ProgZzzprsalir(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.zzzprsalir=this;
    setName("zzzprsalir");
    setTitle("Salir");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    }
  public ProgZzzprsalir()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    if (Maefc.message("¿Está seguro de que desea salir "+
                  "\nde la aplicación Conta-ASP?","Salir de Conta-ASP",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
      Aplication.getAplication().exit(); 
      return;
      }
    }
  }
  
