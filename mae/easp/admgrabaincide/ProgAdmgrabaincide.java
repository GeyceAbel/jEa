// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:58
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admgrabaincide;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admgrabaincide
// Nombre:   
// Versión:  1.4.1
// 
public class ProgAdmgrabaincide extends Program
  {
  public AppEasp easp;
  public ProgAdmgrabaincide admgrabaincide;
  // Inicio declaraciones globales
  /*
  public static String ambito=null,modulo=null,programa=null,referencia=null,numero=null,operacion=null,mensaje=null;
  public static boolean error=false;
  
  public static void main(String [] args) {
    // Conexion a la base de datos
    AppAdmon admon=new AppAdmon();
    admon.setName("ADMON");
    DataBase db=new DataBase(admon);
    db.setName("bdadmon");
    db.setCatalogs( new Catalog[] {
      new CatBdadmon()
       });
  
    admon.addDataBase(db);
    admon.connect();
    Admon.codcon=MAE.getConsulado();
    Admon.central=admon.getConfigInt("Central.codigo");
   //parametros
    if (java.lang.reflect.Array.getLength(args)>=1) 
      ambito=args[0];
    if (java.lang.reflect.Array.getLength(args)>=2) 
      modulo=args[1];
    if (java.lang.reflect.Array.getLength(args)>=3) 
      programa=args[2];
    if (java.lang.reflect.Array.getLength(args)>=4) 
      referencia=args[3];
    if (java.lang.reflect.Array.getLength(args)>=5) 
      numero=args[4];
    if (java.lang.reflect.Array.getLength(args)>=6) 
      operacion=args[5];
    if (java.lang.reflect.Array.getLength(args)>=7) 
      mensaje=args[6];
    if (java.lang.reflect.Array.getLength(args)>=8) 
      if (args[7].equals("1"))
        error=true;  
       
    new ProgAdgrabaincide().run();
    admon.disconnect();
    System.exit(1);
    }
  
  public void grabaIncidencia() {
    Admon.doMessage(Aplication.getAplication(),ambito,modulo,programa,referencia,numero,operacion,mensaje,error);
    }
  */
  // Fin declaraciones globales
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      }
    }
    
  public ProgAdmgrabaincide(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admgrabaincide=this;
    setName("admgrabaincide");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    }
  public ProgAdmgrabaincide()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    /*
    grabaIncidencia();
    return;
    */
    }
  }
  
