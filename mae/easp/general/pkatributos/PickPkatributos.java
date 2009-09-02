// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090902
// Hora:             09:52:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkatributos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkatributos extends PickUp
  {
  // Select
  public Spkatributos spkatributos;
  // Controles
  public CtrlAtatrib atatrib;
  public CtrlAtdesc atdesc;
  // Selección de atributos
  public class Spkatributos extends Select
    {
    // Tablas
    public Impatrib impatrib;
    // Campos
    public Field atatrib;
    public Field atdesc;
    class Impatrib extends Table
      {
      public Impatrib(Select select)
        {
        super(select);
        setName("impatrib");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Spkatributos()
      {
      setName("spkatributos");
      addTable(impatrib=new Impatrib(this));
      addField(atatrib=new Field(this,impatrib,"atatrib"));
      addField(atdesc=new Field(this,impatrib,"atdesc"));
      }
    }
    
  public class CtrlAtatrib extends ControlEdit
    {
    public CtrlAtatrib(Form form)
      {
      super(form);
      setName("atatrib");
      setTitle("Atributo");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(spkatributos.atatrib);
      }
    }
    
  public class CtrlAtdesc extends ControlEdit
    {
    public CtrlAtdesc(Form form)
      {
      super(form);
      setName("atdesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(spkatributos.atdesc);
      }
    }
    
  public PickPkatributos(ControlComboBox control)
    {
    super(control);
    setName("pkatributos");
    setSelect(spkatributos=new Spkatributos());
    addColumn(atatrib=new CtrlAtatrib(null));
    addColumn(atdesc=new CtrlAtdesc(null));
    setResultControl(atatrib);
    setDescriptionControl(atdesc);
    }
  }
  
