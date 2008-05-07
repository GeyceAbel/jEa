// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkimpresoras;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkimpresoras extends PickUp
  {
  // Inicio declaraciones globales
  public String vgtipo=null;
  // Fin declaraciones globales
  // Select
  public Spkimpresoras spkimpresoras;
  // Controles
  public CtrlImnombre imnombre;
  public CtrlImdesc imdesc;
  // Selección de impresoras
  public class Spkimpresoras extends Select
    {
    // Tablas
    public Impresor impresor;
    // Campos
    public Field imdesc;
    public Field imnombre;
    class Impresor extends Table
      {
      public Impresor(Select select)
        {
        super(select);
        setName("impresor");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Spkimpresoras()
      {
      setName("spkimpresoras");
      addTable(impresor=new Impresor(this));
      addField(imdesc=new Field(this,impresor,"imdesc"));
      addField(imnombre=new Field(this,impresor,"imnombre"));
      }
    public String getWhere()
      {
      String sentencia="imcodcon="+Easp.sede;
      if (vgtipo!=null)
        sentencia=sentencia+" and imtipo='"+vgtipo+"'";
      return sentencia;
      
      }
    }
    
  public class CtrlImnombre extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(40);
        }
      }
      
    public CtrlImnombre(Form form)
      {
      super(form);
      setLook(new Look());
      setName("imnombre");
      setTitle("Nombre");
      setType(STRING);
      setLength(80);
      setPrintable(false);
      setField(spkimpresoras.imnombre);
      }
    }
    
  public class CtrlImdesc extends ControlEdit
    {
    public CtrlImdesc(Form form)
      {
      super(form);
      setName("imdesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(spkimpresoras.imdesc);
      }
    }
    
  public PickPkimpresoras(ControlComboBox control)
    {
    super(control);
    setName("pkimpresoras");
    setSelect(spkimpresoras=new Spkimpresoras());
    addColumn(imnombre=new CtrlImnombre(null));
    addColumn(imdesc=new CtrlImdesc(null));
    setResultControl(imnombre);
    setDescriptionControl(imdesc);
    }
  }
  
