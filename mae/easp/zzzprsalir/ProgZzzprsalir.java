// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:07
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicaci�n: easp - Entorno de aplicaciones para AGP
// Versi�n:    4.1
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
// Versi�n:  1.0
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
    if (Maefc.message("�Est� seguro de que desea salir "+
                  "\nde la aplicaci�n Conta-ASP?","Salir de Conta-ASP",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
      Aplication.getAplication().exit(); 
      return;
      }
    }
  }
  
