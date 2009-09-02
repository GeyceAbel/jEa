// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20090902
// Hora:             09:52:04
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkpaises;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkpaises extends PickUp
  {
  // Inicio declaraciones globales
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Spaises spaises;
  // Controles
  public CtrlPidesc pidesc;
  public CtrlPicodigo picodigo;
  public CtrlPicodigoaeat picodigoaeat;
  public CtrlPicodigoss picodigoss;
  // 
  public class Spaises extends Select
    {
    // Tablas
    public Pais pais;
    // Campos
    public Field picodigo;
    public Field picodigoaeat;
    public Field picodigoss;
    public Field pidesc;
    class Pais extends Table
      {
      public Pais(Select select)
        {
        super(select);
        setName("pais");
        setOptions(READ);
        }
      }
      
    public Spaises()
      {
      setName("spaises");
      addTable(pais=new Pais(this));
      addField(picodigo=new Field(this,pais,"picodigo"));
      addField(picodigoaeat=new Field(this,pais,"picodigoaeat"));
      addField(picodigoss=new Field(this,pais,"picodigoss"));
      addField(pidesc=new Field(this,pais,"pidesc"));
      }
    public String getOrder()
      {
      return "pidesc";
      }
    }
    
  public class CtrlPidesc extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(20);
        }
      }
      
    public CtrlPidesc(Form form)
      {
      super(form);
      setLook(new Look());
      setName("pidesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(50);
      setPrintable(false);
      setField(spaises.pidesc);
      }
    }
    
  public class CtrlPicodigo extends ControlEdit
    {
    public CtrlPicodigo(Form form)
      {
      super(form);
      setName("picodigo");
      setTitle("Codigo");
      setType(INTEGER);
      setLength(3);
      setPrintable(false);
      setField(spaises.picodigo);
      }
    }
    
  public class CtrlPicodigoaeat extends ControlEdit
    {
    public CtrlPicodigoaeat(Form form)
      {
      super(form);
      setName("picodigoaeat");
      setMessageHelp("Codificación por AEAT");
      setTitle("AEAT");
      setType(INTEGER);
      setMaskInput("999");
      setLength(3);
      setPrintable(false);
      setField(spaises.picodigoaeat);
      }
    }
    
  public class CtrlPicodigoss extends ControlEdit
    {
    public CtrlPicodigoss(Form form)
      {
      super(form);
      setName("picodigoss");
      setMessageHelp("Codigo país según Seguridad Social");
      setTitle("SS");
      setType(INTEGER);
      setMaskInput("999");
      setLength(3);
      setPrintable(false);
      setField(spaises.picodigoss);
      }
    }
    
  public PickPkpaises(ControlComboBox control)
    {
    super(control);
    setName("pkpaises");
    setSelect(spaises=new Spaises());
    addColumn(pidesc=new CtrlPidesc(null));
    addColumn(picodigo=new CtrlPicodigo(null));
    addColumn(picodigoaeat=new CtrlPicodigoaeat(null));
    addColumn(picodigoss=new CtrlPicodigoss(null));
    setResultControl(picodigo);
    setDescriptionControl(pidesc);
    }
  }
  
