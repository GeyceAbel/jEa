// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090903
// Hora:             14:02:46
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkprovincias;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkprovincias extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Sprovincias sprovincias;
  // Controles
  public CtrlPvdesc pvdesc;
  public CtrlPvcodigo pvcodigo;
  public CtrlCmdesc cmdesc;
  // 
  public class Sprovincias extends Select
    {
    // Tablas
    public Provincia provincia;
    public Comuniauton comuniauton;
    // Campos
    public Field cmcodigo;
    public Field cmdesc;
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
      
    class Comuniauton extends Table
      {
      public Comuniauton(Select select)
        {
        super(select);
        setName("comuniauton");
        setOptions(READ);
        setJoinType(Join.LEFT | Join.OUTER);
        }
      }
      
    public Sprovincias()
      {
      setName("sprovincias");
      addTable(provincia=new Provincia(this));
      addTable(comuniauton=new Comuniauton(this));
      addField(cmcodigo=new Field(this,comuniauton,"cmcodigo"));
      addField(cmdesc=new Field(this,comuniauton,"cmdesc"));
      addField(pvcodigo=new Field(this,provincia,"pvcodigo"));
      addField(pvcomuni=new Field(this,provincia,"pvcomuni"));
      addField(pvdesc=new Field(this,provincia,"pvdesc"));
      }
    public String getOrder()
      {
      return "pvdesc";
      }
    }
    
  public class CtrlPvdesc extends ControlEdit
    {
    public CtrlPvdesc(Form form)
      {
      super(form);
      setName("pvdesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(20);
      setPrintable(false);
      setField(sprovincias.pvdesc);
      }
    }
    
  public class CtrlPvcodigo extends ControlEdit
    {
    public CtrlPvcodigo(Form form)
      {
      super(form);
      setName("pvcodigo");
      setTitle("Codigo");
      setType(INTEGER);
      setLength(2);
      setPrintable(false);
      setField(sprovincias.pvcodigo);
      }
    }
    
  public class CtrlCmdesc extends ControlEdit
    {
    public CtrlCmdesc(Form form)
      {
      super(form);
      setName("cmdesc");
      setMessageHelp("Comunidad Autónoma");
      setTitle("Com. Aut.");
      setType(STRING);
      setLength(50);
      setPrintable(false);
      setField(sprovincias.cmdesc);
      }
    }
    
  public PickPkprovincias(ControlComboBox control)
    {
    super(control);
    setName("pkprovincias");
    setSelect(sprovincias=new Sprovincias());
    addColumn(pvdesc=new CtrlPvdesc(null));
    addColumn(pvcodigo=new CtrlPvcodigo(null));
    addColumn(cmdesc=new CtrlCmdesc(null));
    setResultControl(pvcodigo);
    setDescriptionControl(pvdesc);
    }
  }
  
