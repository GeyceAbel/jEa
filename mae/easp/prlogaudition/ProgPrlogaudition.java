// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20171121
// Hora:             11:36:21
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prlogaudition;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prlogaudition
// Nombre:   Log de uso
// Versión:  1.0
// 
public class ProgPrlogaudition extends Program
  {
  public AppEasp easp;
  public ProgPrlogaudition prlogaudition;
  // Inicio declaraciones globales
  private int ordenacion = -1;
  DBConnection connAudition = null;
  private boolean initConnection() {
    boolean bOk = false;
    String ubicFitxerDesti = System.getProperty("user.dir")+"\\adt\\";
    String nomFitxerDesti = "adtgyc_"+Aplication.getAplication().getName()+"_"+Maefc.getYear(Maefc.getDate())+".mdb";
    DataBase db=new DataBase();
    db.setName(nomFitxerDesti.substring(0, nomFitxerDesti.length()-4));
    db.setMyServer(ubicFitxerDesti);
    db.setType("access");
    Catalog caudition = new CatalogAudition ();
    Catalog array[] = {caudition};
    db.setCatalogs(array);
    connAudition = new DBConnection(db);
    try {
      bOk = connAudition.connectEx();
     setConnection (connAudition);
    }
    catch (Exception e) {
      e.printStackTrace();
      connAudition = null;
      bOk = false;
    }
    return bOk;
  }
  
  // Fin declaraciones globales
  // Ventana
  public FormVlog vlog;
  // Selects
  public Saudition saudition;
  // Ventana
  public FormVdetalle vdetalle;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Log de uso");
      }
    }
    
  public class FormVlog extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onColumnClick( int row) {
      Maefc.waitCursor();
      super.onColumnClick(row);
      ordenacion = row;
      doShow();
      Maefc.restoreCursor();
    
    }
    
    // Fin declaraciones globales
    // Controles
    public CtrlAprfecha aprfecha;
    public CtrlAprtime aprtime;
    public CtrlAprnombrepc aprnombrepc;
    public CtrlAprusuario aprusuario;
    public CtrlApraccion apraccion;
    public CtrlAprtipo aprtipo;
    public CtrlAprprogram aprprogram;
    public CtrlAprventana aprventana;
    public CtrlAprdesc aprdesc;
    public CtrlAprinfo aprinfo;
    // Acciones
    public LinkAdetalle adetalle;
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
        setAnchor(CENTER);
        }
      }
      
    public class CtrlAprfecha extends ColumnEdit
      {
      public CtrlAprfecha(Form form)
        {
        super(form);
        setName("aprfecha");
        setTitle("Fecha");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(saudition.aprfecha);
        }
      }
      
    public class CtrlAprtime extends ColumnEdit
      {
      public CtrlAprtime(Form form)
        {
        super(form);
        setName("aprtime");
        setTitle("Hora");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(saudition.aprtime);
        }
      }
      
    public class CtrlAprnombrepc extends ColumnEdit
      {
      public CtrlAprnombrepc(Form form)
        {
        super(form);
        setName("aprnombrepc");
        setTitle("Nombre PC");
        setType(STRING);
        setLength(50);
        setSearchable(true);
        setField(saudition.aprnombrepc);
        }
      }
      
    public class CtrlAprusuario extends ColumnEdit
      {
      public CtrlAprusuario(Form form)
        {
        super(form);
        setName("aprusuario");
        setTitle("Usuario");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setField(saudition.aprusuario);
        }
      }
      
    public class CtrlApraccion extends ColumnEdit
      {
      public CtrlApraccion(Form form)
        {
        super(form);
        setName("apraccion");
        setTitle("Acción");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setField(saudition.apraccion);
        }
      }
      
    public class CtrlAprtipo extends ColumnEdit
      {
      public CtrlAprtipo(Form form)
        {
        super(form);
        setName("aprtipo");
        setTitle("Tipo");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setField(saudition.aprtipo);
        }
      }
      
    public class CtrlAprprogram extends ColumnEdit
      {
      public CtrlAprprogram(Form form)
        {
        super(form);
        setName("aprprogram");
        setTitle("Programa");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setField(saudition.aprprogram);
        }
      }
      
    public class CtrlAprventana extends ColumnEdit
      {
      public CtrlAprventana(Form form)
        {
        super(form);
        setName("aprventana");
        setTitle("Ventana");
        setType(STRING);
        setLength(25);
        setSearchable(true);
        setField(saudition.aprventana);
        }
      }
      
    public class CtrlAprdesc extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          }
        }
        
      public CtrlAprdesc(Form form)
        {
        super(form);
        setLook(new Look());
        setName("aprdesc");
        setTitle("Descripción");
        setType(STRING);
        setLength(200);
        setSearchable(true);
        setField(saudition.aprdesc);
        }
      }
      
    public class CtrlAprinfo extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(10);
          }
        }
        
      public CtrlAprinfo(Form form)
        {
        super(form);
        setLook(new Look());
        setName("aprinfo");
        setTitle("Datos");
        setType(STRING);
        setLength(4000);
        setSearchable(true);
        setField(saudition.aprinfo);
        }
      }
      
    public class LinkAdetalle extends Action
      {
      public LinkAdetalle(Form form)
        {
        super(form);
        setName("adetalle");
        setTitle("&1. Detalle");
        setOptions(SHOW);
        }
      public void onAction()
        {
        vdetalle.open();
        }
      }
      
    public FormVlog(ProgPrlogaudition prlogaudition)
      {
      super(prlogaudition);
      setName("vlog");
      setTitle("Log de uso");
      setLocation(new Location());
      setStates(SHOW | SEARCH);
      addSelect(saudition=new Saudition());
      addControl(aprfecha=new CtrlAprfecha(this));
      addControl(aprtime=new CtrlAprtime(this));
      addControl(aprnombrepc=new CtrlAprnombrepc(this));
      addControl(aprusuario=new CtrlAprusuario(this));
      addControl(apraccion=new CtrlApraccion(this));
      addControl(aprtipo=new CtrlAprtipo(this));
      addControl(aprprogram=new CtrlAprprogram(this));
      addControl(aprventana=new CtrlAprventana(this));
      addControl(aprdesc=new CtrlAprdesc(this));
      addControl(aprinfo=new CtrlAprinfo(this));
      addAction(adetalle=new LinkAdetalle(this));
      setSelect(saudition);
      }
    public void onInit()
      {
      setInitState(DataForm.SHOW);
      super.onInit();
      }
    public void onExit()
      {
      if (connAudition != null) connAudition.disconnect();
      super.onExit();
      }
    }
    
  // 
  public class Saudition extends Select
    {
    // Tablas
    public Auditionpr auditionpr;
    // Campos
    public Field apraccion;
    public Field apraplication;
    public Field aprcodi;
    public Field aprdesc;
    public Field aprfecha;
    public Field aprinfo;
    public Field aprnombrepc;
    public Field aprpackage;
    public Field aprprogram;
    public Field aprtime;
    public Field aprtipo;
    public Field aprusuario;
    public Field aprventana;
    class Auditionpr extends Table
      {
      public Auditionpr(Select select)
        {
        super(select);
        setName("auditionpr");
        setOptions(READ);
        }
      }
      
    public Saudition()
      {
      setName("saudition");
      addTable(auditionpr=new Auditionpr(this));
      addField(apraccion=new Field(this,auditionpr,"apraccion"));
      addField(apraplication=new Field(this,auditionpr,"apraplication"));
      addField(aprcodi=new Field(this,auditionpr,"aprcodi"));
      addField(aprdesc=new Field(this,auditionpr,"aprdesc"));
      addField(aprfecha=new Field(this,auditionpr,"aprfecha"));
      addField(aprinfo=new Field(this,auditionpr,"aprinfo"));
      addField(aprnombrepc=new Field(this,auditionpr,"aprnombrepc"));
      addField(aprpackage=new Field(this,auditionpr,"aprpackage"));
      addField(aprprogram=new Field(this,auditionpr,"aprprogram"));
      addField(aprtime=new Field(this,auditionpr,"aprtime"));
      addField(aprtipo=new Field(this,auditionpr,"aprtipo"));
      addField(aprusuario=new Field(this,auditionpr,"aprusuario"));
      addField(aprventana=new Field(this,auditionpr,"aprventana"));
      }
    public String getOrder()
      {
      if (ordenacion>0) return vlog.getControlTable().getColumn(ordenacion).getControlValue().getName()+",aprcodi desc";
      else return "aprcodi desc";
      }
    }
    
  public class FormVdetalle extends MonoDataForm
    {
    // Controles
    public CtrlAprpackage aprpackage;
    public CtrlAprinfo aprinfo;
    // Acciones
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(700);
        setHeight(300);
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlAprpackage extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          }
        }
        
      public CtrlAprpackage(Form form)
        {
        super(form);
        setLook(new Look());
        setName("aprpackage");
        setTitle("Package");
        setType(STRING);
        setLength(100);
        setSearchable(true);
        setField(saudition.aprpackage);
        }
      }
      
    public class CtrlAprinfo extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          setHeight(6);
          }
        }
        
      public CtrlAprinfo(Form form)
        {
        super(form);
        setLook(new Look());
        setName("aprinfo");
        setTitle("Datos");
        setType(STRING);
        setLength(4000);
        setSearchable(true);
        setField(saudition.aprinfo);
        }
      }
      
    public FormVdetalle(ProgPrlogaudition prlogaudition)
      {
      super(prlogaudition);
      setName("vdetalle");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW);
      setPrintable(false);
      setModal(true);
      setUnique(true);
      addControl(aprpackage=new CtrlAprpackage(this));
      addControl(aprinfo=new CtrlAprinfo(this));
      setSelect(saudition);
      }
    }
    
  public ProgPrlogaudition()
    {
    this.prlogaudition=this;
    setName("prlogaudition");
    setTitle("Log de uso");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vlog=new FormVlog(this));
    addForm(vdetalle=new FormVdetalle(this));
    }
  public ProgPrlogaudition(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    saudition.setModifier("TOP 5000");
    if (initConnection ()) super.onInit();
    else {
      Maefc.message ("Imposible conectar con el LOG de Auditoria","¡Atención!",Maefc.WARNING_MESSAGE);
      exit();
    }
    }
  public void onExit()
    {
    if (connAudition != null) connAudition.disconnect();
    super.onExit();
    }
  }
  
