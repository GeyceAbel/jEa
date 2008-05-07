// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkadministracio;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkadministracio extends PickUp
  {
  // Inicio declaraciones globales
  public int delegacion=0;
  
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Sadministracion sadministracion;
  // Controles
  public CtrlAhdesc ahdesc;
  public CtrlAhcodigo ahcodigo;
  // 
  public class Sadministracion extends Select
    {
    // Tablas
    public Admhacienda admhacienda;
    // Campos
    public Field ahcodigo;
    public Field ahdele;
    public Field ahdesc;
    class Admhacienda extends Table
      {
      public Admhacienda(Select select)
        {
        super(select);
        setName("admhacienda");
        setOptions(READ);
        }
      }
      
    public Sadministracion()
      {
      setName("sadministracion");
      addTable(admhacienda=new Admhacienda(this));
      addField(ahcodigo=new Field(this,admhacienda,"ahcodigo"));
      addField(ahdele=new Field(this,admhacienda,"ahdele"));
      addField(ahdesc=new Field(this,admhacienda,"ahdesc"));
      }
    public String getWhere()
      {
      if (delegacion!=0)
        return "ahdele="+delegacion;
      else
        return null;
      }
    public String getOrder()
      {
      return "ahdesc,ahdele,ahcodigo";
      }
    }
    
  public class CtrlAhdesc extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(40);
        }
      }
      
    public CtrlAhdesc(Form form)
      {
      super(form);
      setLook(new Look());
      setName("ahdesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(50);
      setPrintable(false);
      setField(sadministracion.ahdesc);
      }
    }
    
  public class CtrlAhcodigo extends ControlEdit
    {
    public CtrlAhcodigo(Form form)
      {
      super(form);
      setName("ahcodigo");
      setTitle("Codigo");
      setType(INTEGER);
      setLength(3);
      setPrintable(false);
      setField(sadministracion.ahcodigo);
      }
    }
    
  public PickPkadministracio(ControlComboBox control)
    {
    super(control);
    setName("pkadministracio");
    setSelect(sadministracion=new Sadministracion());
    addColumn(ahdesc=new CtrlAhdesc(null));
    addColumn(ahcodigo=new CtrlAhcodigo(null));
    setResultControl(ahcodigo);
    setDescriptionControl(ahdesc);
    }
  }
  
