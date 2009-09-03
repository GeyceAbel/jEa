// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:46
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkvalores;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkvalores extends PickUp
  {
  // Inicio declaraciones globales
  public String filtro=null;
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Svalores svalores;
  // Controles
  public CtrlVacodigo vacodigo;
  public CtrlVadesc vadesc;
  // 
  public class Svalores extends Select
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
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Svalores()
      {
      setName("svalores");
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
      return "RTRIM(vaapl)='EA' and RTRIM(vacampo)='"+filtro+"'";
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
      setLength(15);
      setPrintable(false);
      setField(svalores.vacodigo);
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
      setField(svalores.vadesc);
      }
    }
    
  public PickPkvalores(ControlComboBox control)
    {
    super(control);
    setName("pkvalores");
    setSelect(svalores=new Svalores());
    addColumn(vacodigo=new CtrlVacodigo(null));
    addColumn(vadesc=new CtrlVadesc(null));
    setResultControl(vacodigo);
    setDescriptionControl(vadesc);
    }
  }
  
