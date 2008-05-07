// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:06
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.uspermrecursos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: uspermrecursos
// Nombre:   Accesos por recurso
// Versión:  1.3.1
// 
public class ProgUspermrecursos extends Program
  {
  public AppEasp easp;
  public ProgUspermrecursos uspermrecursos;
  // Ventana
  public FormVrecursos vrecursos;
  // Selects
  public Srecursos srecursos;
  // Ventana
  public FormVgrupospos vgrupospos;
  // Selects
  public Spermisosgep spermisosgep;
  // Ventana
  public FormVgruposneg vgruposneg;
  // Selects
  public Spermisosgen spermisosgen;
  // Ventana
  public FormVuserpos vuserpos;
  // Selects
  public Spermisoslop spermisoslop;
  // Ventana
  public FormVuserneg vuserneg;
  // Selects
  public Spermisoslon spermisoslon;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Accesos por recurso");
      }
    }
    
  public class FormVrecursos extends MultiDataForm
    {
    // Controles
    public CtrlUserecurso userecurso;
    public CtrlUsedescr usedescr;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(NORTH);
        }
      }
      
    public class CtrlUserecurso extends ColumnEdit
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
        setMaskInput("U");
        setLength(80);
        setSearchable(true);
        setPrintable(false);
        setField(srecursos.userecurso);
        }
      }
      
    public class CtrlUsedescr extends ColumnEdit
      {
      public CtrlUsedescr(Form form)
        {
        super(form);
        setName("usedescr");
        setTitle("Descripción");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        setField(srecursos.usedescr);
        }
      }
      
    public FormVrecursos(ProgUspermrecursos uspermrecursos)
      {
      super(uspermrecursos);
      setName("vrecursos");
      setTitle("Recursos");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | INSERT);
      addSelect(srecursos=new Srecursos());
      addControl(userecurso=new CtrlUserecurso(this));
      addControl(usedescr=new CtrlUsedescr(this));
      setSelect(srecursos);
      }
    }
    
  // Selección de recursos
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
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onDelete()
        {
        
        uspermrecursos.spermisosgep.uspermge.delete();
        uspermrecursos.spermisosgen.uspermge.delete();
        uspermrecursos.spermisoslop.uspermlo.delete();
        uspermrecursos.spermisoslon.uspermlo.delete();
        return super.onDelete();
        
        }
      }
      
    public Srecursos()
      {
      setName("srecursos");
      addTable(usrecursos=new Usrecursos(this));
      addField(usedescr=new Field(this,usrecursos,"usedescr"));
      addField(userecurso=new Field(this,usrecursos,"userecurso"));
      }
    public String getOrder()
      {
      return "userecurso";
      }
    }
    
  public class FormVgrupospos extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
    //  uspgrupo.pickup.where="not exists (select * from uspermge where usgrupo.usggrupo=uspermge.uspgrupo and usprecurso="+
    //                       srecursos.userecurso.getSQLFormat()+" and uspposne='+')";
      uspgrupo.pickup.vvwhere="not exists (select * from uspermge where usgrupo.usggrupo=uspermge.uspgrupo and usprecurso="+
                           srecursos.userecurso.getSQLFormat()+")";
    
      uspgrupo.pickup.refresh();
      super.onInsert();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlUspgrupo uspgrupo;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(NORTHWEST);
        }
      }
      
    public class CtrlUspgrupo extends ColumnComboBox
      {
      public mae.easp.general.pkusgrupo.PickPkusgrupo pickup;
      public CtrlUspgrupo(Form form)
        {
        super(form);
        setName("uspgrupo");
        setTitle("Grupo");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusgrupo.PickPkusgrupo(this));
        setLength(15);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisosgep.uspgrupo);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVgrupospos(ProgUspermrecursos uspermrecursos)
      {
      super(uspermrecursos);
      setName("vgrupospos");
      setTitle("Recurso permitido a grupos");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisosgep=new Spermisosgep());
      addControl(uspgrupo=new CtrlUspgrupo(this));
      setSelect(spermisosgep);
      }
    }
    
  // Permisos generales
  public class Spermisosgep extends Select
    {
    // Tablas
    public Uspermge uspermge;
    // Campos
    public Field uspgrupo;
    public Field uspposne;
    public Field usprecurso;
    class Uspermge extends Table
      {
      public Uspermge(Select select)
        {
        super(select);
        setName("uspermge");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        usprecurso.setValue(srecursos.userecurso);
        uspposne.setValue("+");
        return super.onInsert();
        }
      }
      
    public Spermisosgep()
      {
      setName("spermisosgep");
      setFather(srecursos);
      addTable(uspermge=new Uspermge(this));
      addField(uspgrupo=new Field(this,uspermge,"uspgrupo"));
      addField(uspposne=new Field(this,uspermge,"uspposne"));
      addField(usprecurso=new Field(this,uspermge,"usprecurso"));
      }
    public String getWhere()
      {
      return "usprecurso="+srecursos.userecurso.getSQLFormat()+
             " and uspposne='+'";
      
      }
    public String getOrder()
      {
      return "uspgrupo";
      }
    }
    
  public class FormVgruposneg extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
    //  uspgrupo.pickup.where="not exists (select * from uspermge where usgrupo.usggrupo=uspermge.uspgrupo and usprecurso="+
    //                       srecursos.userecurso.getSQLFormat()+" and uspposne='-')";
      uspgrupo.pickup.vvwhere="not exists (select * from uspermge where usgrupo.usggrupo=uspermge.uspgrupo and usprecurso="+
                           srecursos.userecurso.getSQLFormat()+")";
    
      uspgrupo.pickup.refresh();
      super.onInsert();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlUspgrupo uspgrupo;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(1);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(NORTHEAST);
        }
      }
      
    public class CtrlUspgrupo extends ColumnComboBox
      {
      public mae.easp.general.pkusgrupo.PickPkusgrupo pickup;
      public CtrlUspgrupo(Form form)
        {
        super(form);
        setName("uspgrupo");
        setTitle("Grupo");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusgrupo.PickPkusgrupo(this));
        setLength(15);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisosgen.uspgrupo);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVgruposneg(ProgUspermrecursos uspermrecursos)
      {
      super(uspermrecursos);
      setName("vgruposneg");
      setTitle("Recurso denegado a grupos");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisosgen=new Spermisosgen());
      addControl(uspgrupo=new CtrlUspgrupo(this));
      setSelect(spermisosgen);
      }
    }
    
  // Permisos generales negativos
  public class Spermisosgen extends Select
    {
    // Tablas
    public Uspermge uspermge;
    // Campos
    public Field uspgrupo;
    public Field uspposne;
    public Field usprecurso;
    class Uspermge extends Table
      {
      public Uspermge(Select select)
        {
        super(select);
        setName("uspermge");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        usprecurso.setValue(srecursos.userecurso);
        uspposne.setValue("-");
        return super.onInsert();
        }
      }
      
    public Spermisosgen()
      {
      setName("spermisosgen");
      setFather(srecursos);
      addTable(uspermge=new Uspermge(this));
      addField(uspgrupo=new Field(this,uspermge,"uspgrupo"));
      addField(uspposne=new Field(this,uspermge,"uspposne"));
      addField(usprecurso=new Field(this,uspermge,"usprecurso"));
      }
    public String getWhere()
      {
      return "usprecurso="+srecursos.userecurso.getSQLFormat()+
             " and uspposne='-'";
      }
    public String getOrder()
      {
      return "uspgrupo";
      }
    }
    
  public class FormVuserpos extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
    //  usluser.pickup.where="not exists (select * from uspermlo WHERE usluser=usuario.uslogin and uslrecurso="+
    //                       srecursos.userecurso.getSQLFormat()+" and uslposne='+')";
      usluser.pickup.vvwhere="not exists (select * from uspermlo WHERE usluser=usuario.uslogin and uslrecurso="+
                           srecursos.userecurso.getSQLFormat()+")";
    
      usluser.pickup.refresh();
      super.onInsert();
      }
    
    public void onOpened(){
      super.onOpened();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlUsluser usluser;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(SOUTHWEST);
        }
      }
      
    public class CtrlUsluser extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlUsluser(Form form)
        {
        super(form);
        setName("usluser");
        setTitle("Usuario");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(25);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisoslop.usluser);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVuserpos(ProgUspermrecursos uspermrecursos)
      {
      super(uspermrecursos);
      setName("vuserpos");
      setTitle("Recurso permitido a usuarios");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisoslop=new Spermisoslop());
      addControl(usluser=new CtrlUsluser(this));
      setSelect(spermisoslop);
      }
    }
    
  // Permisos generales
  public class Spermisoslop extends Select
    {
    // Tablas
    public Uspermlo uspermlo;
    // Campos
    public Field uslcodco;
    public Field uslposne;
    public Field uslrecurso;
    public Field usluser;
    class Uspermlo extends Table
      {
      public Uspermlo(Select select)
        {
        super(select);
        setName("uspermlo");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        uslcodco.setValue(Easp.sede);
        uslrecurso.setValue(srecursos.userecurso);
        uslposne.setValue("+");
        return super.onInsert();
        }
      }
      
    public Spermisoslop()
      {
      setName("spermisoslop");
      setFather(srecursos);
      addTable(uspermlo=new Uspermlo(this));
      addField(uslcodco=new Field(this,uspermlo,"uslcodco"));
      addField(uslposne=new Field(this,uspermlo,"uslposne"));
      addField(uslrecurso=new Field(this,uspermlo,"uslrecurso"));
      addField(usluser=new Field(this,uspermlo,"usluser"));
      }
    public String getWhere()
      {
      String where="uslrecurso="+srecursos.userecurso.getSQLFormat()+
                   " and uslposne='+'";
      return where;
      }
    public String getOrder()
      {
      return "usluser";
      }
    }
    
  public class FormVuserneg extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
    //  usluser.pickup.where="not exists (select * from uspermlo WHERE usluser=usuario.uslogin and uslrecurso="+
    //                       srecursos.userecurso.getSQLFormat()+" and uslposne='-')";
      usluser.pickup.vvwhere="not exists (select * from uspermlo WHERE usluser=usuario.uslogin and uslrecurso="+
                           srecursos.userecurso.getSQLFormat()+")";
    
      usluser.pickup.refresh();
      super.onInsert();
      }
    
    // Fin declaraciones globales
    // Controles
    public CtrlUsluser usluser;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(1.0);
        setFill(BOTH);
        setAnchor(SOUTHEAST);
        }
      }
      
    public class CtrlUsluser extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlUsluser(Form form)
        {
        super(form);
        setName("usluser");
        setTitle("Usuario");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(25);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisoslon.usluser);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVuserneg(ProgUspermrecursos uspermrecursos)
      {
      super(uspermrecursos);
      setName("vuserneg");
      setTitle("Recurso denegado a usuarios");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisoslon=new Spermisoslon());
      addControl(usluser=new CtrlUsluser(this));
      setSelect(spermisoslon);
      }
    }
    
  // Permisos locales negativos
  public class Spermisoslon extends Select
    {
    // Tablas
    public Uspermlo uspermlo;
    // Campos
    public Field uslcodco;
    public Field uslposne;
    public Field uslrecurso;
    public Field usluser;
    class Uspermlo extends Table
      {
      public Uspermlo(Select select)
        {
        super(select);
        setName("uspermlo");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      public boolean onInsert()
        {
        uslcodco.setValue(Easp.sede);
        uslrecurso.setValue(srecursos.userecurso);
        uslposne.setValue("-");
        return super.onInsert();
        }
      }
      
    public Spermisoslon()
      {
      setName("spermisoslon");
      setFather(srecursos);
      addTable(uspermlo=new Uspermlo(this));
      addField(uslcodco=new Field(this,uspermlo,"uslcodco"));
      addField(uslposne=new Field(this,uspermlo,"uslposne"));
      addField(uslrecurso=new Field(this,uspermlo,"uslrecurso"));
      addField(usluser=new Field(this,uspermlo,"usluser"));
      }
    public String getWhere()
      {
      String where="uslrecurso="+srecursos.userecurso.getSQLFormat()+
                   " and uslposne='-'";
      return where;
      }
    public String getOrder()
      {
      return "usluser";
      }
    }
    
  public ProgUspermrecursos()
    {
    this.uspermrecursos=this;
    setName("uspermrecursos");
    setTitle("Accesos por recurso");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vrecursos=new FormVrecursos(this));
    addForm(vgrupospos=new FormVgrupospos(this));
    addForm(vgruposneg=new FormVgruposneg(this));
    addForm(vuserpos=new FormVuserpos(this));
    addForm(vuserneg=new FormVuserneg(this));
    }
  public ProgUspermrecursos(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
