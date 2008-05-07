// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pksiglas;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPksiglas extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Ssiglas ssiglas;
  // Controles
  public CtrlVacodigo vacodigo;
  public CtrlVadesc vadesc;
  // Select de siglas tabla valors
  public class Ssiglas extends Select
    {
    // Tablas
    public Valores valores;
    // Campos
    public Field vaapl;
    public Field vacampo;
    public Field vacodigo;
    public Field vadesc;
    public Field vaorden;
    public Field vavalor;
    class Valores extends Table
      {
      public Valores(Select select)
        {
        super(select);
        setName("valores");
        setOptions(READ);
        }
      }
      
    public Ssiglas()
      {
      setName("ssiglas");
      addTable(valores=new Valores(this));
      addField(vaapl=new Field(this,valores,"vaapl"));
      addField(vacampo=new Field(this,valores,"vacampo"));
      addField(vacodigo=new Field(this,valores,"vacodigo"));
      addField(vadesc=new Field(this,valores,"vadesc"));
      addField(vaorden=new Field(this,valores,"vaorden"));
      addField(vavalor=new Field(this,valores,"vavalor"));
      }
    public String getWhere()
      {
      return "RTRIM(vaapl)='EA' and RTRIM(vacampo)='DATSIGLAS'";
      
      }
    public String getOrder()
      {
      return "vaorden";
      }
    }
    
  public class CtrlVacodigo extends ControlEdit
    {
    public CtrlVacodigo(Form form)
      {
      super(form);
      setName("vacodigo");
      setTitle("Código");
      setType(STRING);
      setMaskInput("U");
      setLength(2);
      setPrintable(false);
      setField(ssiglas.vacodigo);
      }
    }
    
  public class CtrlVadesc extends ControlEdit
    {
    public CtrlVadesc(Form form)
      {
      super(form);
      setName("vadesc");
      setTitle("Descripción");
      setType(STRING);
      setMaskInput("U");
      setLength(15);
      setPrintable(false);
      setField(ssiglas.vadesc);
      }
    }
    
  public PickPksiglas(ControlComboBox control)
    {
    super(control);
    setName("pksiglas");
    setSelect(ssiglas=new Ssiglas());
    addColumn(vacodigo=new CtrlVacodigo(null));
    addColumn(vadesc=new CtrlVadesc(null));
    setResultControl(vacodigo);
    setDescriptionControl(vadesc);
    }
  }
  
