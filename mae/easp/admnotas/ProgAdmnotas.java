// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:17:00
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.admnotas;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: admnotas
// Nombre:   Gestión de Notas
// Versión:  4.9
// 
public class ProgAdmnotas extends Program
  {
  public AppEasp easp;
  public ProgAdmnotas admnotas;
  // Inicio declaraciones globales
  public String gapldestino=null;
  // Fin declaraciones globales
  // Ventana
  public FormVnotas vnotas;
  // Selects
  public Snotas snotas;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Gestión de Notas");
      }
    }
    
  public class FormVnotas extends MultiDataForm
    {
    // Controles
    public CtrlNoapldestino noapldestino;
    public CtrlNofecvenc nofecvenc;
    public CtrlNoestado noestado;
    public CtrlNofecalta nofecalta;
    public CtrlNoaplorigen noaplorigen;
    public CtrlNousorigen nousorigen;
    public CtrlNoproceso noproceso;
    public CtrlNodescripcion nodescripcion;
    public CtrlNousdestino nousdestino;
    public CtrlNofecvisto nofecvisto;
    // Acciones
    public LinkCalvisto calvisto;
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
      
    public class CtrlNoapldestino extends ColumnComboBox
      {
      public mae.easp.general.pkaplicaciones.PickPkaplicaciones pickup;
      public CtrlNoapldestino(Form form)
        {
        super(form);
        setName("noapldestino");
        setMessageHelp("Aplicación Destino");
        setTitle("Aplicación Destino");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkaplicaciones.PickPkaplicaciones(this));
        setLength(15);
        setSearchable(true);
        setDescriptionShow(false);
        setField(snotas.noapldestino);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlNofecvenc extends ColumnEdit
      {
      public CtrlNofecvenc(Form form)
        {
        super(form);
        setName("nofecvenc");
        setMessageHelp("Fecha Vencimiento");
        setTitle("Fecha Vencimiento");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(snotas.nofecvenc);
        }
      }
      
    public class CtrlNoestado extends ColumnComboBox
      {
      public CtrlNoestado(Form form)
        {
        super(form);
        setName("noestado");
        setMessageHelp("Estado");
        setTitle("Estado");
        setType(STRING);
        setMaskInput("U");
        setLength(1);
        setSearchable(true);
        addItem("P/Pendiente");
        addItem("V/Visto");
        setField(snotas.noestado);
        }
      public Object getDefault()
        {
        return "P";
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlNofecalta extends ColumnEdit
      {
      public CtrlNofecalta(Form form)
        {
        super(form);
        setName("nofecalta");
        setMessageHelp("Fecha alta");
        setTitle("Fecha alta");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(snotas.nofecalta);
        }
      public Object getDefault()
        {
        return Maefc.getDate();
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlNoaplorigen extends ColumnComboBox
      {
      public mae.easp.general.pkaplicaciones.PickPkaplicaciones pickup;
      public CtrlNoaplorigen(Form form)
        {
        super(form);
        setName("noaplorigen");
        setMessageHelp("Aplicación origen");
        setTitle("Aplicación Origen");
        setType(STRING);
        setMaskInput("U");
        setPickUp(pickup=new mae.easp.general.pkaplicaciones.PickPkaplicaciones(this));
        setLength(15);
        setSearchable(true);
        setDescriptionShow(false);
        setField(snotas.noaplorigen);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlNousorigen extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlNousorigen(Form form)
        {
        super(form);
        setName("nousorigen");
        setMessageHelp("Usuario Origen");
        setTitle("Usuario Origen");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(20);
        setSearchable(true);
        setDescriptionShow(false);
        setField(snotas.nousorigen);
        }
      public Object getDefault()
        {
        return Aplication.getAplication().getUser();
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlNoproceso extends ColumnEdit
      {
      public CtrlNoproceso(Form form)
        {
        super(form);
        setName("noproceso");
        setMessageHelp("Proceso o referencia");
        setTitle("Proceso");
        setType(STRING);
        setMaskInput("U");
        setLength(15);
        setSearchable(true);
        setField(snotas.noproceso);
        }
      }
      
    public class CtrlNodescripcion extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(70);
          setHeight(8);
          }
        }
        
      public CtrlNodescripcion(Form form)
        {
        super(form);
        setLook(new Look());
        setName("nodescripcion");
        setMessageHelp("Nota, tarea o aviso");
        setTitle("Nota");
        setType(STRING);
        setLength(512);
        setSearchable(true);
        setField(snotas.nodescripcion);
        }
      public boolean obligate()
        {
        return true;
        }
      }
      
    public class CtrlNousdestino extends ColumnComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlNousdestino(Form form)
        {
        super(form);
        setName("nousdestino");
        setMessageHelp("Usuario Destino");
        setTitle("Usuario Destino");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(20);
        setSearchable(true);
        setDescriptionShow(false);
        setField(snotas.nousdestino);
        }
      }
      
    public class CtrlNofecvisto extends ColumnEdit
      {
      public CtrlNofecvisto(Form form)
        {
        super(form);
        setName("nofecvisto");
        setMessageHelp("Fecha Visto");
        setTitle("Fecha Visto");
        setType(DATE);
        setLength(10);
        setSearchable(true);
        setField(snotas.nofecvisto);
        }
      }
      
    public class LinkCalvisto extends ActionForm
      {
      public LinkCalvisto(Form form)
        {
        super(form);
        setName("calvisto");
        setTitle("&Visto");
        setOptions(SHOW | INSERT);
        }
      public void onAction()
        {
        super.onAction();
        snotas.edit();
        snotas.nofecvisto.setValue(Maefc.getDate());
        snotas.noestado.setValue("V");
        nofecvisto.setValue(snotas.nofecvisto);
        noestado.setValue(snotas.noestado);
        snotas.save();
        snotas.commit();
        
        }
      }
      
    public FormVnotas(ProgAdmnotas admnotas)
      {
      super(admnotas);
      setName("vnotas");
      setTitle("Notas");
      setLocation(new Location());
      setStates(SHOW | SEARCH | DELETE | UPDATE | INSERT);
      addSelect(snotas=new Snotas());
      addControl(noapldestino=new CtrlNoapldestino(this));
      addControl(nofecvenc=new CtrlNofecvenc(this));
      addControl(noestado=new CtrlNoestado(this));
      addControl(nofecalta=new CtrlNofecalta(this));
      addControl(noaplorigen=new CtrlNoaplorigen(this));
      addControl(nousorigen=new CtrlNousorigen(this));
      addControl(noproceso=new CtrlNoproceso(this));
      addControl(nodescripcion=new CtrlNodescripcion(this));
      addControl(nousdestino=new CtrlNousdestino(this));
      addControl(nofecvisto=new CtrlNofecvisto(this));
      addAction(calvisto=new LinkCalvisto(this));
      setSelect(snotas);
      }
    public void onSearch()
      {
      gapldestino=null;
      super.onSearch();
      }
    }
    
  // Notas
  public class Snotas extends Select
    {
    // Tablas
    public Notas notas;
    // Campos
    public Field noapldestino;
    public Field noaplorigen;
    public Field nocodigo;
    public Field nodescripcion;
    public Field noestado;
    public Field nofecalta;
    public Field nofecvenc;
    public Field nofecvisto;
    public Field noorigen;
    public Field noproceso;
    public Field nousdestino;
    public Field nousorigen;
    class Notas extends Table
      {
      public Notas(Select select)
        {
        super(select);
        setName("notas");
        setOptions(READ | INSERT | DELETE | UPDATE);
        }
      }
      
    public Snotas()
      {
      setName("snotas");
      addTable(notas=new Notas(this));
      addField(noapldestino=new Field(this,notas,"noapldestino"));
      addField(noaplorigen=new Field(this,notas,"noaplorigen"));
      addField(nocodigo=new Field(this,notas,"nocodigo"));
      addField(nodescripcion=new Field(this,notas,"nodescripcion"));
      addField(noestado=new Field(this,notas,"noestado"));
      addField(nofecalta=new Field(this,notas,"nofecalta"));
      addField(nofecvenc=new Field(this,notas,"nofecvenc"));
      addField(nofecvisto=new Field(this,notas,"nofecvisto"));
      addField(noorigen=new Field(this,notas,"noorigen"));
      addField(noproceso=new Field(this,notas,"noproceso"));
      addField(nousdestino=new Field(this,notas,"nousdestino"));
      addField(nousorigen=new Field(this,notas,"nousorigen"));
      }
    public String getWhere()
      {
      if (gapldestino!=null)
        return "noapldestino='"+gapldestino+"'";
      else
        return null;
      }
    public String getOrder()
      {
      return "noapldestino,nofecvenc,nocodigo";
      }
    }
    
  public ProgAdmnotas()
    {
    this.admnotas=this;
    setName("admnotas");
    setTitle("Gestión de Notas");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vnotas=new FormVnotas(this));
    }
  public ProgAdmnotas(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    vnotas.setInitState(DataForm.SHOW);
    super.onInit();
    }
  }
  
