// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:46
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pktipovias;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPktipovias extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Stipovias stipovias;
  // Controles
  public CtrlTvscodigo tvscodigo;
  public CtrlTvsdesc tvsdesc;
  // 
  public class Stipovias extends Select
    {
    // Tablas
    public Tipovias tipovias;
    // Campos
    public Field tvscodant;
    public Field tvscodigo;
    public Field tvsdesc;
    class Tipovias extends Table
      {
      public Tipovias(Select select)
        {
        super(select);
        setName("tipovias");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Stipovias()
      {
      setName("stipovias");
      addTable(tipovias=new Tipovias(this));
      addField(tvscodant=new Field(this,tipovias,"tvscodant"));
      addField(tvscodigo=new Field(this,tipovias,"tvscodigo"));
      addField(tvsdesc=new Field(this,tipovias,"tvsdesc"));
      }
    public String getOrder()
      {
      return "tvscodigo";
      }
    }
    
  public class CtrlTvscodigo extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(8);
        }
      }
      
    public CtrlTvscodigo(Form form)
      {
      super(form);
      setLook(new Look());
      setName("tvscodigo");
      setTitle("Código");
      setType(STRING);
      setLength(5);
      setPrintable(false);
      setField(stipovias.tvscodigo);
      }
    }
    
  public class CtrlTvsdesc extends ControlEdit
    {
    public CtrlTvsdesc(Form form)
      {
      super(form);
      setName("tvsdesc");
      setTitle("Desc.");
      setType(STRING);
      setLength(30);
      setPrintable(false);
      setField(stipovias.tvsdesc);
      }
    }
    
  public PickPktipovias(ControlComboBox control)
    {
    super(control);
    setName("pktipovias");
    setSelect(stipovias=new Stipovias());
    addColumn(tvscodigo=new CtrlTvscodigo(null));
    addColumn(tvsdesc=new CtrlTvsdesc(null));
    setResultControl(tvscodigo);
    setDescriptionControl(tvsdesc);
    }
  }
  
