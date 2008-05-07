// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkemulaciones;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkemulaciones extends PickUp
  {
  // Select
  public Spkemulaciones spkemulaciones;
  // Controles
  public CtrlEmemul ememul;
  public CtrlEmdesc emdesc;
  // Selección de emulaciones
  public class Spkemulaciones extends Select
    {
    // Tablas
    public Impemul impemul;
    // Campos
    public Field emdesc;
    public Field ememul;
    class Impemul extends Table
      {
      public Impemul(Select select)
        {
        super(select);
        setName("impemul");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Spkemulaciones()
      {
      setName("spkemulaciones");
      addTable(impemul=new Impemul(this));
      addField(emdesc=new Field(this,impemul,"emdesc"));
      addField(ememul=new Field(this,impemul,"ememul"));
      }
    }
    
  public class CtrlEmemul extends ControlEdit
    {
    public CtrlEmemul(Form form)
      {
      super(form);
      setName("ememul");
      setTitle("Emulaciones");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(spkemulaciones.ememul);
      }
    }
    
  public class CtrlEmdesc extends ControlEdit
    {
    public CtrlEmdesc(Form form)
      {
      super(form);
      setName("emdesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(spkemulaciones.emdesc);
      }
    }
    
  public PickPkemulaciones(ControlComboBox control)
    {
    super(control);
    setName("pkemulaciones");
    setSelect(spkemulaciones=new Spkemulaciones());
    addColumn(ememul=new CtrlEmemul(null));
    addColumn(emdesc=new CtrlEmdesc(null));
    setResultControl(ememul);
    setDescriptionControl(emdesc);
    }
  }
  
