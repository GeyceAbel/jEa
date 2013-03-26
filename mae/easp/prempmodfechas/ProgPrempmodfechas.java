// Codigo Generado por MAEFCASE V-4.0 NO MODIFICAR!
// Fecha:            20130326
// Hora:             12:27:48
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
    
    // Fin declaraciones globales
    // Controles
    public CtrlEmodmodelo emodmodelo;
    public CtrlEmodfechaini emodfechaini;
    public CtrlEmodfechafin emodfechafin;
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
      public CtrlEmodmodelo(Form form)
        {
        super(form);
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
      public CtrlEmodfechaini(Form form)
        {
        super(form);
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
      public CtrlEmodfechafin(Form form)
        {
        super(form);
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
      setSelect(sempmodelos);
      }
    public void onInit()
      {
      vempmodfecha.doShow();
      super.onInit();
      }
    }
    
  // Select empmodelos
  public class Sempmodelos extends Select
    {
    // Tablas
    public Empmodelos empmodelos;
    // Campos
    public Field emodejercicio;
    public Field emodnif;
    public Field emodmodelo;
    public Field emodtipoper;
    public Field emodactivo;
    public Field emodfechaini;
    public Field emodfechafin;
    class Empmodelos extends Table
      {
      public Empmodelos(Select select)
        {
        super(select);
        setName("empmodelos");
        setOptions(READ | UPDATE);
        }
      }
      
    public Sempmodelos()
      {
      setName("sempmodelos");
      addTable(empmodelos=new Empmodelos(this));
      addField(emodejercicio=new Field(this,empmodelos,"emodejercicio"));
      addField(emodnif=new Field(this,empmodelos,"emodnif"));
      addField(emodmodelo=new Field(this,empmodelos,"emodmodelo"));
      addField(emodtipoper=new Field(this,empmodelos,"emodtipoper"));
      addField(emodactivo=new Field(this,empmodelos,"emodactivo"));
      addField(emodfechaini=new Field(this,empmodelos,"emodfechaini"));
      addField(emodfechafin=new Field(this,empmodelos,"emodfechafin"));
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
  
