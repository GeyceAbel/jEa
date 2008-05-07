// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:58
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admaplic;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admaplic
// Nombre:   Aplicaciones Disponibles
// Versión:  1.3.1
// 
public class ProgAdmaplic extends Program
  {
  public AppEasp easp;
  public ProgAdmaplic admaplic;
  // Ventana
  public FormVentana ventana;
  // Selects
  public Saplic saplic;
  // Ventana
  public FormVsql vsql;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Aplicaciones Disponibles");
      }
    }
    
  public class FormVentana extends MultiDataForm
    {
    // Controles
    public CtrlApaplic apaplic;
    public CtrlApbdnom apbdnom;
    public CtrlApdesc apdesc;
    // Acciones
    public LinkIrarunsql irarunsql;
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
      
    public class CtrlApaplic extends ColumnEdit
      {
      public CtrlApaplic(Form form)
        {
        super(form);
        setName("apaplic");
        setMessageHelp("Nombre de la aplicación");
        setTitle("Aplicación");
        setType(STRING);
        setMaskInput("U");
        setProtect(true);
        setLength(15);
        setPrintable(false);
        setField(saplic.apaplic);
        }
      }
      
    public class CtrlApbdnom extends ColumnEdit
      {
      public CtrlApbdnom(Form form)
        {
        super(form);
        setName("apbdnom");
        setTitle("Base Datos");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(saplic.apbdnom);
        }
      }
      
    public class CtrlApdesc extends ColumnEdit
      {
      public CtrlApdesc(Form form)
        {
        super(form);
        setName("apdesc");
        setMessageHelp("Descripción");
        setTitle("Descripción");
        setType(STRING);
        setLength(45);
        setPrintable(false);
        setField(saplic.apdesc);
        }
      }
      
    public class LinkIrarunsql extends ActionForm
      {
      public LinkIrarunsql(Form form)
        {
        super(form);
        setName("irarunsql");
        setTitle("Lanzar Sentencia SQL Manual");
        setOptions(SHOW);
        }
      }
      
    public FormVentana(ProgAdmaplic admaplic)
      {
      super(admaplic);
      setName("ventana");
      setTitle("Definición de aplicaciones");
      setLocation(new Location());
      setStates(SHOW | DELETE | UPDATE | INSERT);
      addSelect(saplic=new Saplic());
      addControl(apaplic=new CtrlApaplic(this));
      addControl(apbdnom=new CtrlApbdnom(this));
      addControl(apdesc=new CtrlApdesc(this));
      addAction(irarunsql=new LinkIrarunsql(this));
      setSelect(saplic);
      }
    }
    
  // Selección de aplicaciones disponibles
  public class Saplic extends Select
    {
    // Tablas
    public Apl apl;
    // Campos
    public Field apaplic;
    public Field apbdnom;
    public Field apdesc;
    class Apl extends Table
      {
      public Apl(Select select)
        {
        super(select);
        setName("apl");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Saplic()
      {
      setName("saplic");
      addTable(apl=new Apl(this));
      addField(apaplic=new Field(this,apl,"apaplic"));
      addField(apbdnom=new Field(this,apl,"apbdnom"));
      addField(apdesc=new Field(this,apl,"apdesc"));
      }
    }
    
  public class FormVsql extends ProcessForm
    {
    // Controles
    public CtrlVanyo vanyo;
    public CtrlVoperacion voperacion;
    public CtrlVtabla vtabla;
    public CtrlVsentencia vsentencia;
    // Acciones
    public LinkCalejecutar calejecutar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(800);
        setHeight(500);
        setTitle("SQL Manual");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVanyo extends ControlEdit
      {
      public CtrlVanyo(Form form)
        {
        super(form);
        setName("vanyo");
        setMessageHelp("Año si procede");
        setTitle("Año");
        setType(INTEGER);
        setMaskInput("9999");
        setLength(4);
        setPrintable(false);
        }
      }
      
    public class CtrlVoperacion extends ControlComboBox
      {
      public CtrlVoperacion(Form form)
        {
        super(form);
        setName("voperacion");
        setMessageHelp("Tipo de sentencia");
        setTitle("Operación");
        setType(STRING);
        setMaskInput("U");
        setLength(12);
        setPrintable(false);
        setDescriptionShow(false);
        addItem("INSERT INTO/");
        addItem("UPDATE/");
        addItem("DELETE FROM/");
        }
      public void onChange()
        {
        super.onChange();
        vsentencia.setValue(getString()+" "+vtabla.getString()+" ");
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVtabla extends ControlComboBox
      {
      public mae.easp.general.pktablas.PickPktablas pickup;
      public CtrlVtabla(Form form)
        {
        super(form);
        setName("vtabla");
        setMessageHelp("Escoger tabla");
        setTitle("Tabla");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pktablas.PickPktablas(this));
        setLength(15);
        setPrintable(false);
        setRestricted(false);
        setDescriptionShow(false);
        }
      public void onChange()
        {
        super.onChange();
        vsentencia.setValue(voperacion.getString()+" "+vtabla.getString()+" ");
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlVsentencia extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(65);
          setHeight(15);
          }
        }
        
      public CtrlVsentencia(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vsentencia");
        setMessageHelp("Cuerpo de la sentencia");
        setTitle("Sentencia");
        setType(STRING);
        setLength(4000);
        setPrintable(false);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class LinkCalejecutar extends Action
      {
      public LinkCalejecutar(Form form)
        {
        super(form);
        setName("calejecutar");
        setTitle("Ejecutar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        super.onAction();
        String sql=vsentencia.getString();
        
        DataBase db=new DataBase();
        if (vanyo.isNull())
          db.setName(ventana.apbdnom.getString()); 
        else
          db.setName(ventana.apbdnom.getString()+vanyo.getString()); 
        DBConnection conn=new DBConnection(db); 
        if (conn.connect()) { 
          int result=conn.runSQLUpdate(sql,
                                   voperacion.getString().charAt(0),
                                   vtabla.getString(),
                                   1,
                                   null,
                                   false);
          if (result==0) {
            conn.rollback();
            getDataBase().rollback();
            Maefc.message("Esta operación no modifica ninguna fila de la BD","Información");
            }
          else {
            if (Maefc.message("Esta operación ha afectado a "+result+" filas.\n\n¿Desea actualizar definitivamente la Base de Datos (commit)?","Aviso",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
              conn.commit();
              getDataBase().commit();
              Maefc.message("Operación realizada","Información");
              }
            else {
              conn.rollback();
              getDataBase().commit();
              Maefc.message("Operación cancelada","Cancelación",Maefc.ERROR_MESSAGE);
              }
            }
          conn.disconnect(); 
          } 
        
        }
      }
      
    public FormVsql(ProgAdmaplic admaplic)
      {
      super(admaplic);
      setName("vsql");
      setTitle("SQL Manual");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vanyo=new CtrlVanyo(this));
      addControl(voperacion=new CtrlVoperacion(this));
      addControl(vtabla=new CtrlVtabla(this));
      addControl(vsentencia=new CtrlVsentencia(this));
      addAction(calejecutar=new LinkCalejecutar(this));
      }
    public void onInit()
      {
      vtabla.pickup.aplicacion=ventana.apbdnom.getString();
      vtabla.refresh();
      super.onInit();
      }
    }
    
  public ProgAdmaplic(AppEasp easp)
    {
    super(easp);
    this.easp=easp;
    this.admaplic=this;
    setName("admaplic");
    setTitle("Aplicaciones Disponibles");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(ventana=new FormVentana(this));
    addForm(vsql=new FormVsql(this));
    ventana.irarunsql.setForm(vsql);
    }
  public ProgAdmaplic()
    {
    this((AppEasp) Aplication.getAplication());
    }
  public void onInit()
    {
    if (!Aplication.getAplication().getUser().toUpperCase().equals("ADMIN")) {
      Maefc.message("Sólo se permite la entrada al administrador","Aviso",Maefc.WARNING_MESSAGE);
      exit();
      }
    else
      super.onInit();
    
    }
  }
  
