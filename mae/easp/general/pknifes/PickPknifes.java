// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:46
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pknifes;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPknifes extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Snifes snifes;
  // Controles
  public CtrlDanifcif danifcif;
  // 
  public class Snifes extends Select
    {
    // Tablas
    public Nifes nifes;
    // Campos
    public Field danifcif;
    class Nifes extends Table
      {
      public Nifes(Select select)
        {
        super(select);
        setName("nifes");
        setOptions(READ);
        }
      }
      
    public Snifes()
      {
      setName("snifes");
      addTable(nifes=new Nifes(this));
      addField(danifcif=new Field(this,nifes,"danifcif"));
      }
    }
    
  public class CtrlDanifcif extends ControlEdit
    {
    public CtrlDanifcif(Form form)
      {
      super(form);
      setName("danifcif");
      setTitle("NIF/CIF");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(snifes.danifcif);
      }
    }
    
  public PickPknifes(ControlComboBox control)
    {
    super(control);
    setName("pknifes");
    setSelect(snifes=new Snifes());
    addColumn(danifcif=new CtrlDanifcif(null));
    setResultControl(danifcif);
    }
  }
  
