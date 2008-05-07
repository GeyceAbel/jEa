// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:52
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.general.pkusuarios;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
public class PickPkusuarios extends PickUp
  {
  // Inicio declaraciones globales
  public int codcon=0;
  public String vvwhere=null;
  
  public void setSelect(Select select) {
    super.setSelect(select);
    select.setDb(Easp.connEA);
    }
  
  // Fin declaraciones globales
  // Select
  public Susuarios susuarios;
  // Controles
  public CtrlUslogin uslogin;
  public CtrlUsnombre usnombre;
  // Selección de usuarios
  public class Susuarios extends Select
    {
    // Tablas
    public Usuario usuario;
    // Campos
    public Field uscodcon;
    public Field uslogin;
    public Field usnombre;
    class Usuario extends Table
      {
      public Usuario(Select select)
        {
        super(select);
        setName("usuario");
        setOptions(READ);
        }
      }
      
    public Susuarios()
      {
      setName("susuarios");
      addTable(usuario=new Usuario(this));
      addField(uscodcon=new Field(this,usuario,"uscodcon"));
      addField(uslogin=new Field(this,usuario,"uslogin"));
      addField(usnombre=new Field(this,usuario,"usnombre"));
      }
    public String getWhere()
      {
      String w=null;
      if (vvwhere!=null) w=vvwhere;
      if (codcon!=0){
        if (w!=null) w=w+" and uscodcon="+codcon;
        else w="uscodcon="+codcon;
        }
      return w;
      
      }
    public String getOrder()
      {
      return "uslogin";
      }
    }
    
  public class CtrlUslogin extends ControlEdit
    {
    public CtrlUslogin(Form form)
      {
      super(form);
      setName("uslogin");
      setTitle("Login");
      setType(STRING);
      setLength(10);
      setPrintable(false);
      setField(susuarios.uslogin);
      }
    }
    
  public class CtrlUsnombre extends ControlEdit
    {
    public CtrlUsnombre(Form form)
      {
      super(form);
      setName("usnombre");
      setTitle("Nombre");
      setType(STRING);
      setLength(45);
      setPrintable(false);
      setField(susuarios.usnombre);
      }
    }
    
  public PickPkusuarios(ControlComboBox control)
    {
    super(control);
    setName("pkusuarios");
    setSelect(susuarios=new Susuarios());
    addColumn(uslogin=new CtrlUslogin(null));
    addColumn(usnombre=new CtrlUsnombre(null));
    setResultControl(uslogin);
    setDescriptionControl(usnombre);
    }
  }
  
