// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkmunicipios;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkmunicipios extends PickUp
  {
  // Inicio declaraciones globales
  public int provincia=0;
  
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Smunicipios smunicipios;
  // Controles
  public CtrlMudesc mudesc;
  public CtrlMucodigo mucodigo;
  public CtrlMuprov muprov;
  // 
  public class Smunicipios extends Select
    {
    // Tablas
    public Municipio municipio;
    // Campos
    public Field mucodigo;
    public Field mudesc;
    public Field muprov;
    class Municipio extends Table
      {
      public Municipio(Select select)
        {
        super(select);
        setName("municipio");
        setOptions(READ);
        }
      }
      
    public Smunicipios()
      {
      setName("smunicipios");
      addTable(municipio=new Municipio(this));
      addField(mucodigo=new Field(this,municipio,"mucodigo"));
      addField(mudesc=new Field(this,municipio,"mudesc"));
      addField(muprov=new Field(this,municipio,"muprov"));
      }
    public String getWhere()
      {
      if (provincia!=0)
        return "muprov="+provincia;
      else
        return null;
      }
    public String getOrder()
      {
      return "mudesc";
      }
    }
    
  public class CtrlMudesc extends ControlEdit
    {
    class Look extends LookComponent
      {
      public Look( )
        {
        super();
        setLength(20);
        }
      }
      
    public CtrlMudesc(Form form)
      {
      super(form);
      setLook(new Look());
      setName("mudesc");
      setTitle("Descripción");
      setType(STRING);
      setLength(50);
      setPrintable(false);
      setField(smunicipios.mudesc);
      }
    }
    
  public class CtrlMucodigo extends ControlEdit
    {
    public CtrlMucodigo(Form form)
      {
      super(form);
      setName("mucodigo");
      setMessageHelp("Código municipio");
      setTitle("Codigo");
      setType(INTEGER);
      setLength(5);
      setPrintable(false);
      setField(smunicipios.mucodigo);
      }
    }
    
  public class CtrlMuprov extends ControlEdit
    {
    public CtrlMuprov(Form form)
      {
      super(form);
      setName("muprov");
      setMessageHelp("Código de la provincia");
      setTitle("Provincia");
      setType(INTEGER);
      setLength(2);
      setPrintable(false);
      setField(smunicipios.muprov);
      }
    }
    
  public PickPkmunicipios(ControlComboBox control)
    {
    super(control);
    setName("pkmunicipios");
    setSelect(smunicipios=new Smunicipios());
    addColumn(mudesc=new CtrlMudesc(null));
    addColumn(mucodigo=new CtrlMucodigo(null));
    addColumn(muprov=new CtrlMuprov(null));
    setResultControl(mucodigo);
    setDescriptionControl(mudesc);
    }
  }
  
