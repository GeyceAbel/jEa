// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090902
// Hora:             09:52:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkcampos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkcampos extends PickUp
  {
  // Inicio declaraciones globales
  public String vgaplicacion=null;
  public String vgtabla=null;
  // Fin declaraciones globales
  // Select
  public Spkcampos spkcampos;
  // Controles
  public CtrlCadescri cadescri;
  public CtrlCacampo cacampo;
  // Selección de campos por aplicacion y tabla
  public class Spkcampos extends Select
    {
    // Tablas
    public Campos campos;
    // Campos
    public Field cacampo;
    public Field cadescri;
    class Campos extends Table
      {
      public Campos(Select select)
        {
        super(select);
        setName("campos");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Spkcampos()
      {
      setName("spkcampos");
      addTable(campos=new Campos(this));
      addField(cacampo=new Field(this,campos,"cacampo"));
      addField(cadescri=new Field(this,campos,"cadescri"));
      }
    public String getWhere()
      {
      if (vgaplicacion!=null && vgtabla!=null)
        return "caaplic='"+vgaplicacion.trim()+"' and catabla='"+vgtabla.trim()+"'" ;
      else 
        return null;
      }
    public String getOrder()
      {
      return "cadescri";
      }
    }
    
  public class CtrlCadescri extends ControlEdit
    {
    public CtrlCadescri(Form form)
      {
      super(form);
      setName("cadescri");
      setTitle("Descripción");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(spkcampos.cadescri);
      }
    }
    
  public class CtrlCacampo extends ControlEdit
    {
    public CtrlCacampo(Form form)
      {
      super(form);
      setName("cacampo");
      setTitle("Campo");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(spkcampos.cacampo);
      }
    }
    
  public PickPkcampos(ControlComboBox control)
    {
    super(control);
    setName("pkcampos");
    setSelect(spkcampos=new Spkcampos());
    addColumn(cadescri=new CtrlCadescri(null));
    addColumn(cacampo=new CtrlCacampo(null));
    setResultControl(cacampo);
    setDescriptionControl(cadescri);
    }
  }
  
