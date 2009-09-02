// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090901
// Hora:             13:33:27
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkmuni347;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkmuni347 extends PickUp
  {
  // Inicio declaraciones globales
  public int provincia=0;
  
  
  // Fin declaraciones globales
  // Select
  public Smuni347 smuni347;
  // Controles
  public CtrlMu7provmuni mu7provmuni;
  public CtrlMu7desc mu7desc;
  // 
  public class Smuni347 extends Select
    {
    // Tablas
    public Muni347 muni347;
    // Campos
    public Field mu7codmuni;
    public Field mu7codprov;
    public Field mu7desc;
    public Field mu7muniant;
    public Field mu7provmuni;
    class Muni347 extends Table
      {
      public Muni347(Select select)
        {
        super(select);
        setName("muni347");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Smuni347()
      {
      setName("smuni347");
      addTable(muni347=new Muni347(this));
      addField(mu7codmuni=new Field(this,muni347,"mu7codmuni"));
      addField(mu7codprov=new Field(this,muni347,"mu7codprov"));
      addField(mu7desc=new Field(this,muni347,"mu7desc"));
      addField(mu7muniant=new Field(this,muni347,"mu7muniant"));
      addField(mu7provmuni=new Field(this,muni347,"mu7provmuni"));
      }
    public String getWhere()
      {
      if (provincia!=0) return "mu7codprov="+provincia;
      else return null;
      }
    public String getOrder()
      {
      if (provincia!=0) return "mu7desc";
      else  return "mu7provmuni";
      }
    }
    
  public class CtrlMu7provmuni extends ControlEdit
    {
    public CtrlMu7provmuni(Form form)
      {
      super(form);
      setName("mu7provmuni");
      setTitle("Código");
      setType(STRING);
      setLength(5);
      setPrintable(false);
      setField(smuni347.mu7provmuni);
      }
    }
    
  public class CtrlMu7desc extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(30);
        }
      }
      
    public CtrlMu7desc(Form form)
      {
      super(form);
      setLook(new Look());
      setName("mu7desc");
      setTitle("Nombre del municipio");
      setType(STRING);
      setLength(50);
      setPrintable(false);
      setField(smuni347.mu7desc);
      }
    }
    
  public PickPkmuni347(ControlComboBox control)
    {
    super(control);
    setName("pkmuni347");
    setSelect(smuni347=new Smuni347());
    addColumn(mu7provmuni=new CtrlMu7provmuni(null));
    addColumn(mu7desc=new CtrlMu7desc(null));
    setDescriptionControl(mu7desc);
    }
  }
  
