// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:45
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkaplicaciones;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkaplicaciones extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Saplicaciones saplicaciones;
  // Controles
  public CtrlApaplic apaplic;
  public CtrlApdesc apdesc;
  // Selección de aplicaciones disponibles
  public class Saplicaciones extends Select
    {
    // Tablas
    public Apl apl;
    // Campos
    public Field apaplic;
    public Field apdesc;
    class Apl extends Table
      {
      public Apl(Select select)
        {
        super(select);
        setName("apl");
        setOptions(READ);
        }
      }
      
    public Saplicaciones()
      {
      setName("saplicaciones");
      addTable(apl=new Apl(this));
      addField(apaplic=new Field(this,apl,"apaplic"));
      addField(apdesc=new Field(this,apl,"apdesc"));
      }
    }
    
  public class CtrlApaplic extends ControlEdit
    {
    public CtrlApaplic(Form form)
      {
      super(form);
      setName("apaplic");
      setMessageHelp("Código de la aplicación");
      setTitle("Código");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(saplicaciones.apaplic);
      }
    }
    
  public class CtrlApdesc extends ControlEdit
    {
    public CtrlApdesc(Form form)
      {
      super(form);
      setName("apdesc");
      setMessageHelp("Descripción");
      setTitle("Descripción");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(saplicaciones.apdesc);
      }
    }
    
  public PickPkaplicaciones(ControlComboBox control)
    {
    super(control);
    setName("pkaplicaciones");
    setSelect(saplicaciones=new Saplicaciones());
    addColumn(apaplic=new CtrlApaplic(null));
    addColumn(apdesc=new CtrlApdesc(null));
    setResultControl(apaplic);
    setDescriptionControl(apdesc);
    }
  }
  
