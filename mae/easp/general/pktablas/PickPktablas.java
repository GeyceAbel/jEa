// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090902
// Hora:             09:52:03
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pktablas;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPktablas extends PickUp
  {
  // Inicio declaraciones globales
  public String aplicacion=null;
  // Fin declaraciones globales
  // Select
  public Spkatablas spkatablas;
  // Controles
  public CtrlTadescri tadescri;
  public CtrlTatabla tatabla;
  // Selección de tablas por aplicación
  public class Spkatablas extends Select
    {
    // Tablas
    public Tablas tablas;
    // Campos
    public Field taaplic;
    public Field tadescri;
    public Field tatabla;
    class Tablas extends Table
      {
      public Tablas(Select select)
        {
        super(select);
        setName("tablas");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Spkatablas()
      {
      setName("spkatablas");
      addTable(tablas=new Tablas(this));
      addField(taaplic=new Field(this,tablas,"taaplic"));
      addField(tadescri=new Field(this,tablas,"tadescri"));
      addField(tatabla=new Field(this,tablas,"tatabla"));
      }
    public String getWhere()
      {
      if (aplicacion!=null) return "taaplic='"+aplicacion.trim()+"'";
      else return null;
      
      }
    public String getOrder()
      {
      return "tadescri";
      }
    }
    
  public class CtrlTadescri extends ControlEdit
    {
    public CtrlTadescri(Form form)
      {
      super(form);
      setName("tadescri");
      setTitle("");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(spkatablas.tadescri);
      }
    }
    
  public class CtrlTatabla extends ControlEdit
    {
    public CtrlTatabla(Form form)
      {
      super(form);
      setName("tatabla");
      setTitle("");
      setType(STRING);
      setLength(15);
      setPrintable(false);
      setField(spkatablas.tatabla);
      }
    }
    
  public PickPktablas(ControlComboBox control)
    {
    super(control);
    setName("pktablas");
    setSelect(spkatablas=new Spkatablas());
    addColumn(tadescri=new CtrlTadescri(null));
    addColumn(tatabla=new CtrlTatabla(null));
    setResultControl(tatabla);
    setDescriptionControl(tadescri);
    }
  }
  
