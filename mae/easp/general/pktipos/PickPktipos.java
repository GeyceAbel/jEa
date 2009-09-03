// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:45
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pktipos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPktipos extends PickUp
  {
  // Select
  public Spktipos spktipos;
  // Controles
  public CtrlTitipo titipo;
  public CtrlTidesc tidesc;
  // Tipos
  public class Spktipos extends Select
    {
    // Tablas
    public Imptipos imptipos;
    // Campos
    public Field tidesc;
    public Field titipo;
    class Imptipos extends Table
      {
      public Imptipos(Select select)
        {
        super(select);
        setName("imptipos");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Spktipos()
      {
      setName("spktipos");
      addTable(imptipos=new Imptipos(this));
      addField(tidesc=new Field(this,imptipos,"tidesc"));
      addField(titipo=new Field(this,imptipos,"titipo"));
      }
    }
    
  public class CtrlTitipo extends ControlEdit
    {
    public CtrlTitipo(Form form)
      {
      super(form);
      setName("titipo");
      setTitle("Tipo");
      setType(STRING);
      setLength(10);
      setPrintable(false);
      setField(spktipos.titipo);
      }
    }
    
  public class CtrlTidesc extends ControlEdit
    {
    public CtrlTidesc(Form form)
      {
      super(form);
      setName("tidesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(spktipos.tidesc);
      }
    }
    
  public PickPktipos(ControlComboBox control)
    {
    super(control);
    setName("pktipos");
    setSelect(spktipos=new Spktipos());
    addColumn(titipo=new CtrlTitipo(null));
    addColumn(tidesc=new CtrlTidesc(null));
    setResultControl(titipo);
    setDescriptionControl(tidesc);
    }
  }
  
