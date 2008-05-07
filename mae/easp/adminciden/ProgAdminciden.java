// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20071203
// Hora:             18:16:59
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.adminciden;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: adminciden
// Nombre:   Log de incidencias
// Versión:  4.1
// 
public class ProgAdminciden extends Program
  {
  public AppEasp easp;
  public ProgAdminciden adminciden;
  // Inicio declaraciones globales
  public boolean vienededef=false;
  public String ambito=null;
  public String modulo=null;
  public String refer=null;
  
  
  // Fin declaraciones globales
  // Ventana
  public FormVincidencias vincidencias;
  // Selects
  public Sinciden sinciden;
  // Ventana
  public FormVinciplus vinciplus;
  // Selects
  public Sdetalle sdetalle;
  // Ventana
  public FormVfiltro vfiltro;
  // Selects
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Log de incidencias");
      }
    }
    
  public class FormVincidencias extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void quitarFiltro(){
      quitar.setEnabled(false);
      sinciden.setWhere(null);
      sinciden.execute();
      vfiltro.vvinusuari.setNull();
      vfiltro.vvinambito.setNull();
      vfiltro.vvinmodulo.setNull();
      vfiltro.vvinprog.setNull();
      vfiltro.vvinrefer.setNull();
      vfiltro.vvinnumer.setNull();
      }
    // Fin declaraciones globales
    // Controles
    public CtrlInusuari inusuari;
    public CtrlInpuesto inpuesto;
    public CtrlVinstante vinstante;
    public CtrlInambito inambito;
    public CtrlInmodulo inmodulo;
    public CtrlInprog inprog;
    public CtrlInrefer inrefer;
    public CtrlInnumer innumer;
    // Acciones
    public LinkBuscardef buscardef;
    public LinkFiltrar filtrar;
    public LinkQuitar quitar;
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
        setAnchor(CENTER);
        }
      }
      
    public class CtrlInusuari extends ColumnEdit
      {
      public CtrlInusuari(Form form)
        {
        super(form);
        setName("inusuari");
        setMessageHelp("Usuario que ha provocador la incidencia");
        setTitle("Usuario");
        setType(STRING);
        setLength(25);
        setField(sinciden.inusuari);
        }
      }
      
    public class CtrlInpuesto extends ColumnEdit
      {
      public CtrlInpuesto(Form form)
        {
        super(form);
        setName("inpuesto");
        setMessageHelp("Hostname del equipo o IP Adress");
        setTitle("Puesto");
        setType(STRING);
        setLength(15);
        setPrintable(false);
        setField(sinciden.inpuesto);
        }
      }
      
    public class CtrlVinstante extends ColumnEdit
      {
      public CtrlVinstante(Form form)
        {
        super(form);
        setName("vinstante");
        setMessageHelp("Fecha y hora en que se ha producido la incidencia");
        setTitle("Instante");
        setType(STRING);
        setLength(20);
        }
      }
      
    public class CtrlInambito extends ColumnEdit
      {
      public CtrlInambito(Form form)
        {
        super(form);
        setName("inambito");
        setTitle("Ambito");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(sinciden.inambito);
        }
      }
      
    public class CtrlInmodulo extends ColumnEdit
      {
      public CtrlInmodulo(Form form)
        {
        super(form);
        setName("inmodulo");
        setTitle("Módulo");
        setType(STRING);
        setLength(10);
        setSearchable(true);
        setField(sinciden.inmodulo);
        }
      }
      
    public class CtrlInprog extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          }
        }
        
      public CtrlInprog(Form form)
        {
        super(form);
        setLook(new Look());
        setName("inprog");
        setTitle("Programa");
        setType(STRING);
        setLength(80);
        setField(sinciden.inprog);
        }
      }
      
    public class CtrlInrefer extends ColumnEdit
      {
      public CtrlInrefer(Form form)
        {
        super(form);
        setName("inrefer");
        setTitle("Etiqueta referencia");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        setField(sinciden.inrefer);
        }
      }
      
    public class CtrlInnumer extends ColumnEdit
      {
      public CtrlInnumer(Form form)
        {
        super(form);
        setName("innumer");
        setTitle("Código error");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        setField(sinciden.innumer);
        }
      }
      
    public class LinkBuscardef extends Action
      {
      public LinkBuscardef(Form form)
        {
        super(form);
        setName("buscardef");
        setTitle("Buscar definición");
        setOptions(SEARCH | SHOW | UPDATE | INSERT);
        }
      public void onAction()
        {
        mae.easp.admdeferr.ProgAdmdeferr prog=new mae.easp.admdeferr.ProgAdmdeferr();
        prog.vienedeinc=true;
        prog.ambito=inambito.getString();
        prog.modulo=inmodulo.getString();
        prog.refer=inrefer.getString();
        prog.vdeferrors.setInitState(DataForm.SHOW);
        prog.run();
        super.onAction();
        }
      }
      
    public class LinkFiltrar extends ActionForm
      {
      public LinkFiltrar(Form form)
        {
        super(form);
        setName("filtrar");
        setTitle("Aplicar Filtro");
        setOptions(SHOW | EOF);
        }
      }
      
    public class LinkQuitar extends Action
      {
      public LinkQuitar(Form form)
        {
        super(form);
        setName("quitar");
        setTitle("Quitar Filtro");
        setOptions(SHOW | EOF);
        }
      public void onAction()
        {
        if (sinciden.getWhere()!=null) quitarFiltro();
        }
      }
      
    public FormVincidencias(ProgAdminciden adminciden)
      {
      super(adminciden);
      setName("vincidencias");
      setTitle("Incidencias");
      setLocation(new Location());
      setStates(SHOW);
      setPrintable(false);
      addSelect(sinciden=new Sinciden());
      addControl(inusuari=new CtrlInusuari(this));
      addControl(inpuesto=new CtrlInpuesto(this));
      addControl(vinstante=new CtrlVinstante(this));
      addControl(inambito=new CtrlInambito(this));
      addControl(inmodulo=new CtrlInmodulo(this));
      addControl(inprog=new CtrlInprog(this));
      addControl(inrefer=new CtrlInrefer(this));
      addControl(innumer=new CtrlInnumer(this));
      addAction(buscardef=new LinkBuscardef(this));
      addAction(filtrar=new LinkFiltrar(this));
      addAction(quitar=new LinkQuitar(this));
      setSelect(sinciden);
      }
    public void onInit()
      {
      quitar.setEnabled(false);
      sinciden.ininstan.getDef().setDateTime(true);
      super.onInit();
      }
    public void onBeginRecord()
      {
      java.text.SimpleDateFormat frm=new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
      vincidencias.vinstante.setValue(frm.format(sinciden.ininstan.getDate()));
      super.onBeginRecord();
      
      }
    }
    
  // Selección de incidencias
  public class Sinciden extends Select
    {
    // Tablas
    public Inincide inincide;
    // Campos
    public Field inambito;
    public Field incodigo;
    public Field ininstan;
    public Field inmensa;
    public Field inmodulo;
    public Field innumer;
    public Field inopera;
    public Field inprog;
    public Field inpuesto;
    public Field inrefer;
    public Field insede;
    public Field inusuari;
    class Inincide extends Table
      {
      public Inincide(Select select)
        {
        super(select);
        setName("inincide");
        setOptions(READ);
        }
      }
      
    public Sinciden()
      {
      setName("sinciden");
      addTable(inincide=new Inincide(this));
      addField(inambito=new Field(this,inincide,"inambito"));
      addField(incodigo=new Field(this,inincide,"incodigo"));
      addField(ininstan=new Field(this,inincide,"ininstan"));
      addField(inmensa=new Field(this,inincide,"inmensa"));
      addField(inmodulo=new Field(this,inincide,"inmodulo"));
      addField(innumer=new Field(this,inincide,"innumer"));
      addField(inopera=new Field(this,inincide,"inopera"));
      addField(inprog=new Field(this,inincide,"inprog"));
      addField(inpuesto=new Field(this,inincide,"inpuesto"));
      addField(inrefer=new Field(this,inincide,"inrefer"));
      addField(insede=new Field(this,inincide,"insede"));
      addField(inusuari=new Field(this,inincide,"inusuari"));
      }
    public String getOrder()
      {
      return "insede asc, incodigo desc";
      }
    }
    
  public class FormVinciplus extends MonoDataForm
    {
    // Controles
    public CtrlInopera inopera;
    public CtrlInmensa inmensa;
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
        setAnchor(SOUTH);
        }
      }
      
    public class CtrlInopera extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          setHeight(3);
          }
        }
        
      public CtrlInopera(Form form)
        {
        super(form);
        setLook(new Look());
        setName("inopera");
        setMessageHelp("Uso que ha desencadenado el error");
        setTitle("Operación");
        setType(STRING);
        setLength(1024);
        setField(sdetalle.inopera);
        }
      }
      
    public class CtrlInmensa extends ControlEditPane
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(60);
          setHeight(3);
          }
        }
        
      public CtrlInmensa(Form form)
        {
        super(form);
        setLook(new Look());
        setName("inmensa");
        setTitle("Mensaje error");
        setType(STRING);
        setLength(1024);
        setField(sdetalle.inmensa);
        }
      }
      
    public FormVinciplus(ProgAdminciden adminciden)
      {
      super(adminciden);
      setName("vinciplus");
      setTitle("Detalle");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setStates(SHOW);
      setUnique(true);
      addSelect(sdetalle=new Sdetalle());
      addControl(inopera=new CtrlInopera(this));
      addControl(inmensa=new CtrlInmensa(this));
      setSelect(sinciden);
      }
    }
    
  // Detalle incidencia
  public class Sdetalle extends Select
    {
    // Tablas
    public Inincide inincide;
    // Campos
    public Field inmensa;
    public Field inopera;
    class Inincide extends Table
      {
      public Inincide(Select select)
        {
        super(select);
        setName("inincide");
        setOptions(READ);
        }
      }
      
    public Sdetalle()
      {
      setName("sdetalle");
      setFather(sinciden);
      addTable(inincide=new Inincide(this));
      addField(inmensa=new Field(this,inincide,"inmensa"));
      addField(inopera=new Field(this,inincide,"inopera"));
      }
    public String getWhere()
      {
      return "incodigo="+sinciden.incodigo.getSQLFormat()+" and insede="+sinciden.insede.getSQLFormat()+" and inusuari="
             +sinciden.inusuari.getSQLFormat()+" and inpuesto="+sinciden.inpuesto.getSQLFormat()
             +"and ininstan="+sinciden.ininstan.getSQLFormat();
      }
    }
    
  public class FormVfiltro extends ProcessForm
    {
    // Inicio declaraciones globales
    public boolean algunCriterio(){
      return (!vvinusuari.isNull() || !vvinambito.isNull() ||
              !vvinmodulo.isNull() || !vvinprog.isNull() ||
              !vvinrefer.isNull() || !vvinnumer.isNull());
      }
    
    public String filtro(){
      String where=null;
      
      if (!vvinusuari.isNull()){
        if (where!=null) where=where+" and ";
        else where="";
        where=where+"inusuari="+vvinusuari.getSQLFormat();
        }
      if (!vvinambito.isNull()){
        if (where!=null) where=where+" and ";
        else where="";
        where=where+"inambito="+vvinambito.getSQLFormat();
        }
      if (!vvinmodulo.isNull()){
        if (where!=null) where=where+" and ";
        else where="";
        where=where+"inmodulo="+vvinmodulo.getSQLFormat();
        }
      if (!vvinprog.isNull()){
        if (where!=null) where=where+" and ";
        else where="";
        where=where+"inprog="+vvinprog.getSQLFormat();
        }
      if (!vvinrefer.isNull()){
        if (where!=null) where=where+" and ";
        else where="";
        where=where+"inrefer="+vvinrefer.getSQLFormat();
        }
      if (!vvinnumer.isNull()){
        if (where!=null) where=where+" and ";
        else where="";
        where=where+"innumer="+vvinnumer.getSQLFormat();
        }
      return where;
      }
    // Fin declaraciones globales
    // Controles
    public CtrlVvinusuari vvinusuari;
    public CtrlVvinambito vvinambito;
    public CtrlVvinmodulo vvinmodulo;
    public CtrlVvinprog vvinprog;
    public CtrlVvinrefer vvinrefer;
    public CtrlVvinnumer vvinnumer;
    // Acciones
    public LinkAceptar aceptar;
    public LinkCancelar cancelar;
    class Location extends LocationWindow
      {
      public Location( )
        {
        super();
        setWidth(600);
        setHeight(250);
        setTitle("Filtro");
        setModal(true);
        setLocation(CENTER);
        }
      }
      
    public class CtrlVvinusuari extends ControlComboBox
      {
      public mae.easp.general.pkusuarios.PickPkusuarios pickup;
      public CtrlVvinusuari(Form form)
        {
        super(form);
        setName("vvinusuari");
        setTitle("Usuario");
        setType(STRING);
        setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
        setLength(15);
        setPrintable(false);
        setDescriptionShow(false);
        }
      }
      
    public class CtrlVvinambito extends ControlEdit
      {
      public CtrlVvinambito(Form form)
        {
        super(form);
        setName("vvinambito");
        setTitle("Ámbito");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        }
      }
      
    public class CtrlVvinmodulo extends ControlEdit
      {
      public CtrlVvinmodulo(Form form)
        {
        super(form);
        setName("vvinmodulo");
        setTitle("Módulo");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        }
      }
      
    public class CtrlVvinprog extends ControlEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(50);
          }
        }
        
      public CtrlVvinprog(Form form)
        {
        super(form);
        setLook(new Look());
        setName("vvinprog");
        setTitle("Programa");
        setType(STRING);
        setLength(80);
        setPrintable(false);
        }
      }
      
    public class CtrlVvinrefer extends ControlEdit
      {
      public CtrlVvinrefer(Form form)
        {
        super(form);
        setName("vvinrefer");
        setTitle("Etiqueta");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        }
      }
      
    public class CtrlVvinnumer extends ControlEdit
      {
      public CtrlVvinnumer(Form form)
        {
        super(form);
        setName("vvinnumer");
        setTitle("Código error");
        setType(STRING);
        setLength(10);
        setPrintable(false);
        }
      }
      
    public class LinkAceptar extends Action
      {
      public LinkAceptar(Form form)
        {
        super(form);
        setName("aceptar");
        setTitle("Aceptar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        String where=filtro();
        
        if (!algunCriterio())
          Maefc.message("Rellene algún criterio de filtrado");
        else if (where!=null && !where.equals(sinciden.getWhere())){
          sinciden.setWhere(filtro());
          sinciden.execute();
          if (sinciden.isEof()){
            Maefc.message("No existen cambios para los criterios de filtrado");
            vincidencias.quitarFiltro();
            }
          else{ 
            vfiltro.exit();
            vincidencias.quitar.setEnabled(true);
            } 
          }
        else vfiltro.exit();
        }
      }
      
    public class LinkCancelar extends Action
      {
      public LinkCancelar(Form form)
        {
        super(form);
        setName("cancelar");
        setTitle("Cancelar");
        setOptions(SHOW);
        }
      public void onAction()
        {
        vfiltro.exit();
        }
      }
      
    public FormVfiltro(ProgAdminciden adminciden)
      {
      super(adminciden);
      setName("vfiltro");
      setTitle("Filtro");
      setLayout(new LayoutAligned());
      setLocation(new Location());
      setPrintable(false);
      setModal(true);
      addControl(vvinusuari=new CtrlVvinusuari(this));
      addControl(vvinambito=new CtrlVvinambito(this));
      addControl(vvinmodulo=new CtrlVvinmodulo(this));
      addControl(vvinprog=new CtrlVvinprog(this));
      addControl(vvinrefer=new CtrlVvinrefer(this));
      addControl(vvinnumer=new CtrlVvinnumer(this));
      addAction(aceptar=new LinkAceptar(this));
      addAction(cancelar=new LinkCancelar(this));
      }
    public void onInit()
      {
      vvinusuari.setNull();
      vvinambito.setNull();
      vvinmodulo.setNull();
      vvinprog.setNull();
      vvinrefer.setNull();
      vvinnumer.setNull();
      super.onInit();
      }
    }
    
  public ProgAdminciden()
    {
    this.adminciden=this;
    setName("adminciden");
    setTitle("Log de incidencias");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vincidencias=new FormVincidencias(this));
    addForm(vinciplus=new FormVinciplus(this));
    addForm(vfiltro=new FormVfiltro(this));
    vincidencias.filtrar.setForm(vfiltro);
    }
  public ProgAdminciden(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  public void onInit()
    {
    if (vienededef)
      sinciden.setWhere("inambito='"+ambito+"' and inmodulo='"+modulo+
                        "' and inrefer='"+refer+"'");
    super.onInit();
    }
  }
  
