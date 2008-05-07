// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkbds;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkbds extends PickUp
  {
  // Select
  public Sbds sbds;
  // Controles
  public CtrlBdnombre bdnombre;
  // 
  public class Sbds extends Select
    {
    // Tablas
    public Bds bds;
    // Campos
    public Field bdnombre;
    class Bds extends Table
      {
      public Bds(Select select)
        {
        super(select);
        setName("bds");
        setOptions(READ);
        }
      }
      
    public Sbds()
      {
      setName("sbds");
      addTable(bds=new Bds(this));
      addField(bdnombre=new Field(this,bds,"bdnombre"));
      }
    }
    
  public class CtrlBdnombre extends ControlEdit
    {
    public CtrlBdnombre(Form form)
      {
      super(form);
      setName("bdnombre");
      setTitle("Nombre");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(sbds.bdnombre);
      }
    }
    
  public PickPkbds(ControlComboBox control)
    {
    super(control);
    setName("pkbds");
    setSelect(sbds=new Sbds());
    addColumn(bdnombre=new CtrlBdnombre(null));
    setResultControl(bdnombre);
    }
  }
  
