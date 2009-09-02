// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090901
// Hora:             13:33:27
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkprovincia;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkprovincia extends PickUp
  {
  // Select
  public Sprovincia sprovincia;
  // Controles
  public CtrlPvcodigo pvcodigo;
  public CtrlPvdesc pvdesc;
  // Selección Provincia
  public class Sprovincia extends Select
    {
    // Tablas
    public Provincia provincia;
    // Campos
    public Field pvcodigo;
    public Field pvcomuni;
    public Field pvdesc;
    class Provincia extends Table
      {
      public Provincia(Select select)
        {
        super(select);
        setName("provincia");
        setOptions(READ);
        }
      }
      
    public Sprovincia()
      {
      setName("sprovincia");
      addTable(provincia=new Provincia(this));
      addField(pvcodigo=new Field(this,provincia,"pvcodigo"));
      addField(pvcomuni=new Field(this,provincia,"pvcomuni"));
      addField(pvdesc=new Field(this,provincia,"pvdesc"));
      }
    }
    
  public class CtrlPvcodigo extends ControlEdit
    {
    public CtrlPvcodigo(Form form)
      {
      super(form);
      setName("pvcodigo");
      setTitle("Código Provincia");
      setType(INTEGER);
      setLength(10);
      setEnabled(false);
      setPrintable(false);
      setField(sprovincia.pvcodigo);
      }
    }
    
  public class CtrlPvdesc extends ControlEdit
    {
    public CtrlPvdesc(Form form)
      {
      super(form);
      setName("pvdesc");
      setTitle("Nombre");
      setType(STRING);
      setLength(20);
      setEnabled(false);
      setPrintable(false);
      setField(sprovincia.pvdesc);
      }
    }
    
  public PickPkprovincia(ControlComboBox control)
    {
    super(control);
    setName("pkprovincia");
    setSelect(sprovincia=new Sprovincia());
    addColumn(pvcodigo=new CtrlPvcodigo(null));
    addColumn(pvdesc=new CtrlPvdesc(null));
    setResultControl(pvcodigo);
    setDescriptionControl(pvdesc);
    }
  }
  
