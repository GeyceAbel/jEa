// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:07
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.uspusuarios;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: uspusuarios
// Nombre:   Gestión de grupos
// Versión:  1.0
// 
public class ProgUspusuarios extends Program
  {
  public AppEasp easp;
  public ProgUspusuarios uspusuarios;
  // Ventana
  public FormVgrupos vgrupos;
  // Selects
  public Sgrupos sgrupos;
  // Ventana
  public FormVusuarios vusuarios;
  // Selects
  public Susuarios susuarios;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Gestión de grupos");
      }
    }
    
  public class FormVgrupos extends MultiDataForm
    {
    // Controles
    public CtrlUsggrupo usggrupo;
    public CtrlUsgdescr usgdescr;
    // Acciones
    public LinkIrpermge irpermge;
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        setLocation(LEFT);
        }
      }
      
    public class CtrlUsggrupo extends ColumnEdit
      {
      public CtrlUsggrupo(Form form)
        {
        super(form);
        setName("usggrupo");
        setMessageHelp("Nombre del grupo");
        setTitle("Grupo");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sgrupos.usggrupo);
        }
      }
      
    public class CtrlUsgdescr extends ColumnEdit
      {
      public CtrlUsgdescr(Form form)
        {
        super(form);
        setName("usgdescr");
        setMessageHelp("Descripción del grupo");
        setTitle("Descripción");
        setType(STRING);
        setLength(30);
        setPrintable(false);
        setField(sgrupos.usgdescr);
        }
      }
      
    public class LinkIrpermge extends Action
      {
      public LinkIrpermge(Form form)
        {
        super(form);
        setName("irpermge");
        setTitle("Permisos Generales");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        mae.easp.usppermisos.ProgUsppermisos prog=new mae.easp.usppermisos.ProgUsppermisos(easp);
        prog.vggrupo=usggrupo.getString();
        prog.run();
        }
      }
      
    public FormVgrupos(ProgUspusuarios uspusuarios)
      {
      super(uspusuarios);
      setName("vgrupos");
      setTitle("Grupos");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(sgrupos=new Sgrupos());
      addControl(usggrupo=new CtrlUsggrupo(this));
      addControl(usgdescr=new CtrlUsgdescr(this));
      addAction(irpermge=new LinkIrpermge(this));
      setSelect(sgrupos);
      }
    public void onBeginRecord()
      {
      super.onBeginRecord();
      if (usggrupo.getString().equals("Todos")) deleteAction.setEnabled(false);
      else deleteAction.setEnabled(true);
      }
    }
    
  // Grupos del sistema
  public class Sgrupos extends Select
    {
    // Tablas
    public Usgrupo usgrupo;
    // Campos
    public Field usgdescr;
    public Field usggrupo;
    class Usgrupo extends Table
      {
      public Usgrupo(Select select)
        {
        super(select);
        setName("usgrupo");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Sgrupos()
      {
      setName("sgrupos");
      addTable(usgrupo=new Usgrupo(this));
      addField(usgdescr=new Field(this,usgrupo,"usgdescr"));
      addField(usggrupo=new Field(this,usgrupo,"usggrupo"));
      }
    public String getOrder()
      {
      return "usggrupo asc";
      }
    }
    
  public class FormVusuarios extends MultiDataForm
    {
    // Controles
    public CtrlUslogin uslogin;
    public CtrlUsnombre usnombre;
    // Acciones
    public LinkIrpermlo irpermlo;
    class Location extends LocationSplit
      {
      public Location( )
        {
        super();
        setLocation(RIGHT);
        }
      }
      
    public class CtrlUslogin extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlUslogin(Form form)
        {
        super(form);
        setName("uslogin");
        setMessageHelp("Login del usuario");
        setTitle("Login");
        setType(STRING);
        setProtect(true);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(25);
        setPrintable(false);
        setDescriptionShow(false);
        setField(susuarios.uslogin);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlUsnombre extends ColumnEdit
      {
      public CtrlUsnombre(Form form)
        {
        super(form);
        setName("usnombre");
        setMessageHelp("Nombre completo");
        setTitle("Nombre");
        setType(STRING);
        setLength(45);
        setEnabled(false);
        setPrintable(false);
        setField(susuarios.usnombre);
        }
      }
      
    public class LinkIrpermlo extends Action
      {
      public LinkIrpermlo(Form form)
        {
        super(form);
        setName("irpermlo");
        setTitle("Permisos Locales");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        mae.easp.usppermisoslo.ProgUsppermisoslo prog=new mae.easp.usppermisoslo.ProgUsppermisoslo(easp);
        prog.vgcodcon=Easp.sede;
        prog.vgusuario=uslogin.getString();
        prog.run();
        }
      }
      
    public FormVusuarios(ProgUspusuarios uspusuarios)
      {
      super(uspusuarios);
      setName("vusuarios");
      setTitle("Usuarios");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(susuarios=new Susuarios());
      addControl(uslogin=new CtrlUslogin(this));
      addControl(usnombre=new CtrlUsnombre(this));
      addAction(irpermlo=new LinkIrpermlo(this));
      setSelect(susuarios);
      }
    }
    
  // Usuarios
  public class Susuarios extends Select
    {
    // Tablas
    public Usagrup usagrup;
    public Usuario usuario;
    // Campos
    public Field usacodco;
    public Field usagrupo;
    public Field usalogin;
    public Field uscodcon;
    public Field uslogin;
    public Field usnombre;
    public Field uspasswd;
    class Usagrup extends Table
      {
      public Usagrup(Select select)
        {
        super(select);
        setName("usagrup");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        usacodco.setValue(Easp.sede);
        usagrupo.setValue(vgrupos.usggrupo);
        usalogin.setValue(uslogin);
        return super.onInsert();
        }
      }
      
    class Usuario extends Table
      {
      public Usuario(Select select)
        {
        super(select);
        setName("usuario");
        setOptions(READ);
        }
      public boolean onInsert()
        {
        uscodcon.setValue(Easp.sede);
        return super.onInsert();
        }
      }
      
    public Susuarios()
      {
      setName("susuarios");
      setFather(sgrupos);
      addTable(usagrup=new Usagrup(this));
      addTable(usuario=new Usuario(this));
      addField(usacodco=new Field(this,usagrup,"usacodco"));
      addField(usagrupo=new Field(this,usagrup,"usagrupo"));
      addField(usalogin=new Field(this,usagrup,"usalogin"));
      addField(uscodcon=new Field(this,usuario,"uscodcon"));
      addField(uslogin=new Field(this,usuario,"uslogin"));
      addField(usnombre=new Field(this,usuario,"usnombre"));
      addField(uspasswd=new Field(this,usuario,"uspasswd"));
      }
    public String getWhere()
      {
      String where="usagrupo="+sgrupos.usggrupo.getSQLFormat();
      return where;
      }
    public String getOrder()
      {
      return "usacodco,usalogin asc";
      }
    }
    
  public ProgUspusuarios()
    {
    this.uspusuarios=this;
    setName("uspusuarios");
    setTitle("Gestión de grupos");
    setLayout(new LayoutSplit(LayoutSplit.HORIZONTAL,0.75));
    setLocation(new Location());
    addForm(vgrupos=new FormVgrupos(this));
    addForm(vusuarios=new FormVusuarios(this));
    }
  public ProgUspusuarios(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
