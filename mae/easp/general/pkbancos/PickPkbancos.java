// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:45
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkbancos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkbancos extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Sbancos sbancos;
  // Controles
  public CtrlBndesc bndesc;
  public CtrlBncodigo bncodigo;
  // 
  public class Sbancos extends Select
    {
    // Tablas
    public Banco banco;
    // Campos
    public Field bncodigo;
    public Field bndesc;
    class Banco extends Table
      {
      public Banco(Select select)
        {
        super(select);
        setName("banco");
        setOptions(READ);
        }
      }
      
    public Sbancos()
      {
      setName("sbancos");
      addTable(banco=new Banco(this));
      addField(bncodigo=new Field(this,banco,"bncodigo"));
      addField(bndesc=new Field(this,banco,"bndesc"));
      }
    public String getOrder()
      {
      return "bndesc";
      }
    }
    
  public class CtrlBndesc extends ControlEdit
    {
    public CtrlBndesc(Form form)
      {
      super(form);
      setName("bndesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(50);
      setPrintable(false);
      setField(sbancos.bndesc);
      }
    }
    
  public class CtrlBncodigo extends ControlEdit
    {
    public CtrlBncodigo(Form form)
      {
      super(form);
      setName("bncodigo");
      setMessageHelp("Código del banco");
      setTitle("Código");
      setType(INTEGER);
      setMaskInput("9999");
      setLength(4);
      setPrintable(false);
      setField(sbancos.bncodigo);
      }
    }
    
  public PickPkbancos(ControlComboBox control)
    {
    super(control);
    setName("pkbancos");
    setSelect(sbancos=new Sbancos());
    addColumn(bndesc=new CtrlBndesc(null));
    addColumn(bncodigo=new CtrlBncodigo(null));
    setResultControl(bncodigo);
    setDescriptionControl(bndesc);
    }
  }
  
