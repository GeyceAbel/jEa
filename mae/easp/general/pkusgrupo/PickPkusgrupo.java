// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090902
// Hora:             09:52:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkusgrupo;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkusgrupo extends PickUp
  {
  // Inicio declaraciones globales
  public String vvwhere=null;
  // Fin declaraciones globales
  // Select
  public Susgrupo susgrupo;
  // Controles
  public CtrlUsgdescr usgdescr;
  public CtrlUsggrupo usggrupo;
  // Grupos disponibles
  public class Susgrupo extends Select
    {
    // Tablas
    public Usgrupo usgrupo;
    // Campos
    public Field usgdescr;
    public Field usggrupo;
    class Usgrupo extends Table
      {
      public Usgrupo(Select select)
        {
        super(select);
        setName("usgrupo");
        setOptions(READ);
        }
      }
      
    public Susgrupo()
      {
      setName("susgrupo");
      addTable(usgrupo=new Usgrupo(this));
      addField(usgdescr=new Field(this,usgrupo,"usgdescr"));
      addField(usggrupo=new Field(this,usgrupo,"usggrupo"));
      }
    public String getWhere()
      {
      if (vvwhere!=null) return vvwhere+" and usggrupo<>'TODOS'";
      else return "usggrupo<>'TODOS'";
      }
    public String getOrder()
      {
      return "usgdescr";
      }
    }
    
  public class CtrlUsgdescr extends ControlEdit
    {
    public CtrlUsgdescr(Form form)
      {
      super(form);
      setName("usgdescr");
      setMessageHelp("Descripción");
      setTitle("Descripción");
      setType(STRING);
      setLength(30);
      setPrintable(false);
      setField(susgrupo.usgdescr);
      }
    }
    
  public class CtrlUsggrupo extends ControlEdit
    {
    public CtrlUsggrupo(Form form)
      {
      super(form);
      setName("usggrupo");
      setMessageHelp("Grupo");
      setTitle("Grupo");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(susgrupo.usggrupo);
      }
    }
    
  public PickPkusgrupo(ControlComboBox control)
    {
    super(control);
    setName("pkusgrupo");
    setSelect(susgrupo=new Susgrupo());
    addColumn(usgdescr=new CtrlUsgdescr(null));
    addColumn(usggrupo=new CtrlUsggrupo(null));
    setResultControl(usggrupo);
    setDescriptionControl(usgdescr);
    }
  }
  
