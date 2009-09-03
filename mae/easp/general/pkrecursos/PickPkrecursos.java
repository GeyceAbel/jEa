// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:46
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkrecursos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkrecursos extends PickUp
  {
  // Inicio declaraciones globales
  public String vvwhere=null;
  // Fin declaraciones globales
  // Select
  public Srecursos srecursos;
  // Controles
  public CtrlUserecurso userecurso;
  public CtrlUsedescr usedescr;
  // Eventos
  public class Srecursos extends Select
    {
    // Tablas
    public Usrecursos usrecursos;
    // Campos
    public Field usedescr;
    public Field userecurso;
    class Usrecursos extends Table
      {
      public Usrecursos(Select select)
        {
        super(select);
        setName("usrecursos");
        setOptions(READ);
        }
      }
      
    public Srecursos()
      {
      setName("srecursos");
      addTable(usrecursos=new Usrecursos(this));
      addField(usedescr=new Field(this,usrecursos,"usedescr"));
      addField(userecurso=new Field(this,usrecursos,"userecurso"));
      }
    public String getWhere()
      {
      return vvwhere;
      }
    }
    
  public class CtrlUserecurso extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(45);
        }
      }
      
    public CtrlUserecurso(Form form)
      {
      super(form);
      setLook(new Look());
      setName("userecurso");
      setTitle("Recurso");
      setType(STRING);
      setLength(80);
      setPrintable(false);
      setField(srecursos.userecurso);
      }
    }
    
  public class CtrlUsedescr extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(35);
        }
      }
      
    public CtrlUsedescr(Form form)
      {
      super(form);
      setLook(new Look());
      setName("usedescr");
      setMessageHelp("Descripción");
      setTitle("Descripción");
      setType(STRING);
      setLength(55);
      setPrintable(false);
      setField(srecursos.usedescr);
      }
    }
    
  public PickPkrecursos(ControlComboBox control)
    {
    super(control);
    setName("pkrecursos");
    setSelect(srecursos=new Srecursos());
    addColumn(userecurso=new CtrlUserecurso(null));
    addColumn(usedescr=new CtrlUsedescr(null));
    setResultControl(userecurso);
    setDescriptionControl(usedescr);
    }
  }
  
