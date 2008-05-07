// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:06
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.usppermisos;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: usppermisos
// Nombre:   Control de acceso por grupo
// Versión:  1.0
// 
public class ProgUsppermisos extends Program
  {
  public AppEasp easp;
  public ProgUsppermisos usppermisos;
  // Inicio declaraciones globales
  public String vggrupo=null;
  // Fin declaraciones globales
  // Ventana
  public FormVgrupos vgrupos;
  // Selects
  public Sgrupos sgrupos;
  // Ventana
  public FormVaplicacion vaplicacion;
  // Selects
  public Saplicaciones saplicaciones;
  // Ventana
  public FormVpositivos vpositivos;
  // Selects
  public Spermisosgep spermisosgep;
  // Ventana
  public FormVnegativos vnegativos;
  // Selects
  public Spermisosgen spermisosgen;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Control de acceso por grupo");
      }
    }
    
  public class FormVgrupos extends MultiDataForm
    {
    // Controles
    public CtrlUsggrupo usggrupo;
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
      
    public class CtrlUsggrupo extends ColumnEdit
      {
      public CtrlUsggrupo(Form form)
        {
        super(form);
        setName("usggrupo");
        setMessageHelp("Grupo del sistema");
        setTitle("Grupo");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sgrupos.usggrupo);
        }
      }
      
    public FormVgrupos(ProgUsppermisos usppermisos)
      {
      super(usppermisos);
      setName("vgrupos");
      setTitle("Grupos");
      setLocation(new Location());
      setStates(SHOW);
      addSelect(sgrupos=new Sgrupos());
      addControl(usggrupo=new CtrlUsggrupo(this));
      setSelect(sgrupos);
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
        setOptions(READ);
        }
      }
      
    public Sgrupos()
      {
      setName("sgrupos");
      addTable(usgrupo=new Usgrupo(this));
      addField(usgdescr=new Field(this,usgrupo,"usgdescr"));
      addField(usggrupo=new Field(this,usgrupo,"usggrupo"));
      }
    public String getWhere()
      {
      if (vggrupo!=null)
        return "usggrupo='"+vggrupo+"'";
      else
        return null;
      }
    public String getOrder()
      {
      return "usggrupo";
      }
    }
    
  public class FormVaplicacion extends MultiDataForm
    {
    // Controles
    public CtrlApaplic apaplic;
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
      
    public class CtrlApaplic extends ColumnEdit
      {
      public CtrlApaplic(Form form)
        {
        super(form);
        setName("apaplic");
        setMessageHelp("Aplicación");
        setTitle("Aplicación");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(saplicaciones.apaplic);
        }
      }
      
    public FormVaplicacion(ProgUsppermisos usppermisos)
      {
      super(usppermisos);
      setName("vaplicacion");
      setTitle("Aplicación");
      setLocation(new Location());
      setStates(SHOW);
      addSelect(saplicaciones=new Saplicaciones());
      addControl(apaplic=new CtrlApaplic(this));
      setSelect(saplicaciones);
      }
    }
    
  // Aplicaciones
  public class Saplicaciones extends Select
    {
    // Tablas
    public Apl apl;
    // Campos
    public Field apaplic;
    public Field apdesc;
    class Apl extends Table
      {
      public Apl(Select select)
        {
        super(select);
        setName("apl");
        setOptions(READ);
        }
      }
      
    public Saplicaciones()
      {
      setName("saplicaciones");
      setFather(sgrupos);
      addTable(apl=new Apl(this));
      addField(apaplic=new Field(this,apl,"apaplic"));
      addField(apdesc=new Field(this,apl,"apdesc"));
      }
    }
    
  public class FormVpositivos extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
      usprecurso.pickup.vvwhere="not exists (SELECT * FROM uspermge WHERE uspgrupo="+
                              sgrupos.usggrupo.getSQLFormat()+
                              " and uspermge.usprecurso=usrecursos.userecurso"+
                              " and uspposne='+') and usrecursos.userecurso like '"+
                              saplicaciones.apaplic.getString().toUpperCase()+"%'";
      usprecurso.pickup.refresh();
      super.onInsert();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlUsprecurso usprecurso;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(1);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(4.0);
        setFill(BOTH);
        setAnchor(SOUTHWEST);
        }
      }
      
    public class CtrlUsprecurso extends ColumnComboBox
      {
      public mae.easp.general.pkrecursos.PickPkrecursos pickup;
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(45);
          }
        }
        
      public CtrlUsprecurso(Form form)
        {
        super(form);
        setLook(new Look());
        setName("usprecurso");
        setTitle("Recurso");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkrecursos.PickPkrecursos(this));
        setLength(80);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisosgep.usprecurso);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVpositivos(ProgUsppermisos usppermisos)
      {
      super(usppermisos);
      setName("vpositivos");
      setTitle("Permisos aceptados");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisosgep=new Spermisosgep());
      addControl(usprecurso=new CtrlUsprecurso(this));
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
        uspgrupo.setValue(sgrupos.usggrupo);
        uspposne.setValue("+");
        return super.onInsert();
        }
      }
      
    public Spermisosgep()
      {
      setName("spermisosgep");
      setFather(saplicaciones);
      addTable(uspermge=new Uspermge(this));
      addField(uspgrupo=new Field(this,uspermge,"uspgrupo"));
      addField(uspposne=new Field(this,uspermge,"uspposne"));
      addField(usprecurso=new Field(this,uspermge,"usprecurso"));
      }
    public String getWhere()
      {
      return "uspgrupo="+sgrupos.usggrupo.getSQLFormat()+
             " and usprecurso like '"+saplicaciones.apaplic.getString().toUpperCase()+"%'"+
             " and uspposne='+'";
      }
    public String getOrder()
      {
      return "usprecurso";
      }
    }
    
  public class FormVnegativos extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onInsert(){
      usprecurso.pickup.vvwhere="not exists (SELECT * FROM uspermge WHERE uspgrupo="+
                              sgrupos.usggrupo.getSQLFormat()+
                              " and uspermge.usprecurso=usrecursos.userecurso"+
                              " and uspposne='-') and usrecursos.userecurso like '"+
                              saplicaciones.apaplic.getString().toUpperCase()+"%'";
      usprecurso.pickup.refresh();
      super.onInsert();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlUsprecurso usprecurso;
    // Acciones
    class Location extends LocationGridBag
      {
      public Location( )
        {
        super();
        setWidth(REMAINDER);
        setHeight(REMAINDER);
        setWeightx(1.0);
        setWeighty(4.0);
        setFill(BOTH);
        setAnchor(SOUTHEAST);
        }
      }
      
    public class CtrlUsprecurso extends ColumnComboBox
      {
      public mae.easp.general.pkrecursos.PickPkrecursos pickup;
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(45);
          }
        }
        
      public CtrlUsprecurso(Form form)
        {
        super(form);
        setLook(new Look());
        setName("usprecurso");
        setTitle("Recurso");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkrecursos.PickPkrecursos(this));
        setLength(80);
        setPrintable(false);
        setDescriptionShow(false);
        setField(spermisosgen.usprecurso);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public FormVnegativos(ProgUsppermisos usppermisos)
      {
      super(usppermisos);
      setName("vnegativos");
      setTitle("Permisos denegados");
      setLocation(new Location());
      setStates(SHOW | DELETE | INSERT);
      addSelect(spermisosgen=new Spermisosgen());
      addControl(usprecurso=new CtrlUsprecurso(this));
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
        uspgrupo.setValue(sgrupos.usggrupo);
        uspposne.setValue("-");
        return super.onInsert();
        }
      }
      
    public Spermisosgen()
      {
      setName("spermisosgen");
      setFather(saplicaciones);
      addTable(uspermge=new Uspermge(this));
      addField(uspgrupo=new Field(this,uspermge,"uspgrupo"));
      addField(uspposne=new Field(this,uspermge,"uspposne"));
      addField(usprecurso=new Field(this,uspermge,"usprecurso"));
      }
    public String getWhere()
      {
      return "uspgrupo="+sgrupos.usggrupo.getSQLFormat()+
             " and usprecurso like '"+saplicaciones.apaplic.getString().toUpperCase()+"%'"+
             " and uspposne='-'";
      }
    public String getOrder()
      {
      return "usprecurso";
      }
    }
    
  public ProgUsppermisos()
    {
    this.usppermisos=this;
    setName("usppermisos");
    setTitle("Control de acceso por grupo");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vgrupos=new FormVgrupos(this));
    addForm(vaplicacion=new FormVaplicacion(this));
    addForm(vpositivos=new FormVpositivos(this));
    addForm(vnegativos=new FormVnegativos(this));
    }
  public ProgUsppermisos(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
