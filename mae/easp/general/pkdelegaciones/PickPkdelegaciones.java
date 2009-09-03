// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:46
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkdelegaciones;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkdelegaciones extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Sdelegaciones sdelegaciones;
  // Controles
  public CtrlDhdesc dhdesc;
  public CtrlDhcodigo dhcodigo;
  // 
  public class Sdelegaciones extends Select
    {
    // Tablas
    public Delhacienda delhacienda;
    // Campos
    public Field dhcodigo;
    public Field dhdesc;
    class Delhacienda extends Table
      {
      public Delhacienda(Select select)
        {
        super(select);
        setName("delhacienda");
        setOptions(READ);
        }
      }
      
    public Sdelegaciones()
      {
      setName("sdelegaciones");
      addTable(delhacienda=new Delhacienda(this));
      addField(dhcodigo=new Field(this,delhacienda,"dhcodigo"));
      addField(dhdesc=new Field(this,delhacienda,"dhdesc"));
      }
    public String getOrder()
      {
      return "dhdesc";
      }
    }
    
  public class CtrlDhdesc extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(41);
        }
      }
      
    public CtrlDhdesc(Form form)
      {
      super(form);
      setLook(new Look());
      setName("dhdesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(50);
      setPrintable(false);
      setField(sdelegaciones.dhdesc);
      }
    }
    
  public class CtrlDhcodigo extends ControlEdit
    {
    public CtrlDhcodigo(Form form)
      {
      super(form);
      setName("dhcodigo");
      setTitle("Codigo");
      setType(INTEGER);
      setLength(3);
      setPrintable(false);
      setField(sdelegaciones.dhcodigo);
      }
    }
    
  public PickPkdelegaciones(ControlComboBox control)
    {
    super(control);
    setName("pkdelegaciones");
    setSelect(sdelegaciones=new Sdelegaciones());
    addColumn(dhdesc=new CtrlDhdesc(null));
    addColumn(dhcodigo=new CtrlDhcodigo(null));
    setResultControl(dhcodigo);
    setDescriptionControl(dhdesc);
    }
  }
  
