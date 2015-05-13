// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20150512
// Hora:             17:01:31
// Driver BD:        ODBC
// Base de Datos:    bdeaspprog
// 
// Aplicación: easp - Entorno de aplicaciones para AGP
// Versión:    4.1
// 
package mae.easp.prempmodfechas;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
import mae.easp.*;
// 
// Programa: prempmodfechas
// Nombre:   Fechas inicio/fin obligaciones
// Versión:  1.0
// 
public class ProgPrempmodfechas extends Program
  {
  public AppEasp easp;
  public ProgPrempmodfechas prempmodfechas;
  // Inicio declaraciones globales
  public int gEjercicio = 0;
  public String gNif = "";
  
  int ordenacion=0;
  // Fin declaraciones globales
  // Ventana
  public FormVempmodfecha vempmodfecha;
  // Selects
  public Sempmodelos sempmodelos;
  class Location extends LocationTabbed
    {
    public Location( )
      {
      super();
      setTitle("Fechas inicio/fin obligaciones");
      }
    }
    
  public class FormVempmodfecha extends MultiDataForm
    {
    // Inicio declaraciones globales
    public void onSelection(){
        super.onSelection();
        doEdit();
    }
    public void onColumnClick(int ncol) {
      Maefc.waitCursor();
      super.onColumnClick(ncol);
      ordenacion=ncol;
      doShow();
      Maefc.restoreCursor();
      }
    private void grabaCheck() {
       if (chasesor.getBoolean()) sempmodelos.emodpreasesor.setValue("S");
       else sempmodelos.emodpreasesor.setValue("N");
    }
    private void leeCheck(){
       chasesor.setValue("S".equals(sempmodelos.emodpreasesor.getString()));
    }
    // Fin declaraciones globales
    // Controles
    public CtrlEmodmodelo emodmodelo;
    public CtrlEmodfechaini emodfechaini;
    public CtrlEmodfechafin emodfechafin;
    public CtrlChasesor chasesor;
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
        }
      }
      
    public class CtrlEmodmodelo extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(6);
          }
        }
        
      public CtrlEmodmodelo(Form form)
        {
        super(form);
        setLook(new Look());
        setName("emodmodelo");
        setTitle("Modelo");
        setType(STRING);
        setLength(5);
        setEnabled(false);
        setField(sempmodelos.emodmodelo);
        }
      }
      
    public class CtrlEmodfechaini extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(12);
          }
        }
        
      public CtrlEmodfechaini(Form form)
        {
        super(form);
        setLook(new Look());
        setName("emodfechaini");
        setMessageHelp("Indicar la fecha de inicio de la obligación");
        setTitle("Fecha inicio obligación");
        setType(DATE);
        setLength(10);
        setField(sempmodelos.emodfechaini);
        }
      public boolean  valid()
        {
        if ((emodfechaini.getDate()!=null && Fecha.anyo(emodfechaini.getDate())!=gEjercicio) || (emodfechaini.getDate()!= null && emodfechafin.getDate()!= null && Fecha.despues(emodfechaini.getDate(),emodfechafin.getDate())))
           return false;
        else return true;
        }
      }
      
    public class CtrlEmodfechafin extends ColumnEdit
      {
      class Look extends LookComponent
        {
        public Look( )
          {
          super();
          setLength(12);
          }
        }
        
      public CtrlEmodfechafin(Form form)
        {
        super(form);
        setLook(new Look());
        setName("emodfechafin");
        setMessageHelp("Indicar la fecha de fin de la obligación.");
        setTitle("Fecha fin obligación");
        setType(DATE);
        setLength(10);
        setField(sempmodelos.emodfechafin);
        }
      public boolean  valid()
        {
        if ((emodfechafin.getDate()!=null && Fecha.anyo(emodfechafin.getDate())!=gEjercicio) || (emodfechaini.getDate()!= null && emodfechafin.getDate()!= null && Fecha.despues(emodfechaini.getDate(),emodfechafin.getDate()))) 
           return false;
        else return true;
        }
      }
      
    public class CtrlChasesor extends ColumnCheck
      {
      public CtrlChasesor(Form form)
        {
        super(form);
        setName("chasesor");
        setMessageHelp("Marcar si quien confecciona el impuesto es el asesor, si lo confecciona el cliente no marcar");
        setTitle("Confecciona asesor");
        }
      public Object getDefault()
        {
        return true;
        }
      }
      
    public FormVempmodfecha(ProgPrempmodfechas prempmodfechas)
      {
      super(prempmodfechas);
      setName("vempmodfecha");
      setTitle("Relación modelos");
      setLocation(new Location());
      setStates(SHOW | UPDATE);
      addSelect(sempmodelos=new Sempmodelos());
      addControl(emodmodelo=new CtrlEmodmodelo(this));
      addControl(emodfechaini=new CtrlEmodfechaini(this));
      addControl(emodfechafin=new CtrlEmodfechafin(this));
      addControl(chasesor=new CtrlChasesor(this));
      setSelect(sempmodelos);
      }
    public void onInit()
      {
      vempmodfecha.doShow();
      super.onInit();
      }
    public void onBeginRecord()
      {
      leeCheck();
      super.onBeginRecord();
      
      }
    }
    
  // Select empmodelos
  public class Sempmodelos extends Select
    {
    // Tablas
    public Empmodelos empmodelos;
    // Campos
    public Field emodactivo;
    public Field emodejercicio;
    public Field emodfechafin;
    public Field emodfechaini;
    public Field emodmodelo;
    public Field emodnif;
    public Field emodpreasesor;
    public Field emodtipoper;
    class Empmodelos extends Table
      {
      public Empmodelos(Select select)
        {
        super(select);
        setName("empmodelos");
        setOptions(READ | UPDATE);
        }
      public boolean onUpdate()
        {
        vempmodfecha.grabaCheck();
        return super.onUpdate();
        }
      }
      
    public Sempmodelos()
      {
      setName("sempmodelos");
      addTable(empmodelos=new Empmodelos(this));
      addField(emodactivo=new Field(this,empmodelos,"emodactivo"));
      addField(emodejercicio=new Field(this,empmodelos,"emodejercicio"));
      addField(emodfechafin=new Field(this,empmodelos,"emodfechafin"));
      addField(emodfechaini=new Field(this,empmodelos,"emodfechaini"));
      addField(emodmodelo=new Field(this,empmodelos,"emodmodelo"));
      addField(emodnif=new Field(this,empmodelos,"emodnif"));
      addField(emodpreasesor=new Field(this,empmodelos,"emodpreasesor"));
      addField(emodtipoper=new Field(this,empmodelos,"emodtipoper"));
      }
    public String getWhere()
      {
      return "emodejercicio="+gEjercicio+" and emodnif='"+gNif+"' and emodactivo='S'";
      }
    public String getOrder()
      {
      switch(ordenacion) {
        case 0: 
             return "emodmodelo";
        case 1:
            return "emodfechaini";
        case 2:
            return "emodfechafin";
        case 3:
             return "emodpreasesor";
      }
      return "emodtipoper";
      }
    }
    
  public ProgPrempmodfechas()
    {
    this.prempmodfechas=this;
    setName("prempmodfechas");
    setTitle("Fechas inicio/fin obligaciones");
    setLayout(new LayoutGridBag());
    setLocation(new Location());
    addForm(vempmodfecha=new FormVempmodfecha(this));
    }
  public ProgPrempmodfechas(AppEasp easp)
    {
    this();
    this.easp=easp;
    }
  }
  
