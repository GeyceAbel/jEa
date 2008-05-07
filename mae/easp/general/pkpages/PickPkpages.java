// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkpages;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkpages extends PickUp
  {
  // Select
  public Simpage simpage;
  // Controles
  public CtrlPanombre panombre;
  public CtrlPadesc padesc;
  // Selección formatos papel
  public class Simpage extends Select
    {
    // Tablas
    public Impage impage;
    // Campos
    public Field padesc;
    public Field panombre;
    class Impage extends Table
      {
      public Impage(Select select)
        {
        super(select);
        setName("impage");
        setOptions(READ);
        }
      }
      
    public Simpage()
      {
      setName("simpage");
      addTable(impage=new Impage(this));
      addField(padesc=new Field(this,impage,"padesc"));
      addField(panombre=new Field(this,impage,"panombre"));
      }
    }
    
  public class CtrlPanombre extends ControlEdit
    {
    public CtrlPanombre(Form form)
      {
      super(form);
      setName("panombre");
      setTitle("Nombre");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(simpage.panombre);
      }
    }
    
  public class CtrlPadesc extends ControlEdit
    {
    public CtrlPadesc(Form form)
      {
      super(form);
      setName("padesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(simpage.padesc);
      }
    }
    
  public PickPkpages(ControlComboBox control)
    {
    super(control);
    setName("pkpages");
    setSelect(simpage=new Simpage());
    addColumn(panombre=new CtrlPanombre(null));
    addColumn(padesc=new CtrlPadesc(null));
    setResultControl(panombre);
    setDescriptionControl(padesc);
    }
  }
  
