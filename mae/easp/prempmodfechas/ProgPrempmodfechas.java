// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Mon Feb 03 13:06:48 CET 2020
// 
// Aplicación: easp
// 
package mae.easp.prempmodfechas;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
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
    // GLOBALES: PROGRAMA
    public int gEjercicio = 0;
public String gNif = "";
public boolean gTratarPerio = false;

int ordenacion=0;
    // Metodos
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
        // GLOBALES: VENTANA
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
        // Metodos
        // Controles
        public CtrlEmodmodelo emodmodelo;
        public CtrlEmodtipoper emodtipoper;
        public CtrlEmodfechaini emodfechaini;
        public CtrlEmodfechafin emodfechafin;
        public CtrlChasesor chasesor;
        // Acciones
        // Fieldsets
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
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlEmodtipoper extends ColumnComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlEmodtipoper(Form form)
                {
                super(form);
                setName("emodtipoper");
                setTitle("Periodicidad");
                setType(STRING);
                setLength(2);
                addItem("M/Mensual");
                addItem("T/trimestral");
                addItem("A/Anual");
                setField(sempmodelos.emodtipoper);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlEmodfechaini extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if ((emodfechaini.getDate()!=null && Fecha.anyo(emodfechaini.getDate())!=gEjercicio) || (emodfechaini.getDate()!= null && emodfechafin.getDate()!= null && Fecha.despues(emodfechaini.getDate(),emodfechafin.getDate())))
                   return false;
                else return true;
                }
            }
            
        public class CtrlEmodfechafin extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
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
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if ((emodfechafin.getDate()!=null && Fecha.anyo(emodfechafin.getDate())!=gEjercicio) || (emodfechaini.getDate()!= null && emodfechafin.getDate()!= null && Fecha.despues(emodfechaini.getDate(),emodfechafin.getDate()))) 
                   return false;
                else return true;
                }
            }
            
        public class CtrlChasesor extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChasesor(Form form)
                {
                super(form);
                setName("chasesor");
                setMessageHelp("Marcar si quien confecciona el impuesto es el asesor, si lo confecciona el cliente no marcar");
                setTitle("Confecciona asesor");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            public Object getDefault ()
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
            // SET: VENTANA
            addSelect(sempmodelos=new Sempmodelos());
            addControl(emodmodelo=new CtrlEmodmodelo(this));
            addControl(emodtipoper=new CtrlEmodtipoper(this));
            addControl(emodfechaini=new CtrlEmodfechaini(this));
            addControl(emodfechafin=new CtrlEmodfechafin(this));
            addControl(chasesor=new CtrlChasesor(this));
            setSelect(sempmodelos);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onEdit ()
            {
            if (gTratarPerio) {
            	if ("111".equals(emodmodelo.getString()) || "115".equals(emodmodelo.getString()) || "123".equals(emodmodelo.getString())) {
            		emodtipoper.setEnabled(true);
            		emodtipoper.removeAllItems();
            		emodtipoper.addItem("M/Mensual");
            		emodtipoper.addItem("T/Trimestral");
            	}
            	else {
            		emodtipoper.setEnabled(false);
            		emodtipoper.removeAllItems();
            		emodtipoper.addItem("M/Mensual");
            		emodtipoper.addItem("T/Trimestral");
            		emodtipoper.addItem("A/Anual");
            	}
            }
            super.onEdit ();
            }
        public void onInit ()
            {
            vempmodfecha.doShow();
            emodtipoper.setEnabled(gTratarPerio); 
super.onInit();
            }
        public void onBeginRecord ()
            {
            leeCheck();
            super.onBeginRecord();
            }
        }
        
    // Select empmodelos
    public class Sempmodelos extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
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
            // GLOBALES: TABLA
            // Metodos
            public Empmodelos(Select select)
                {
                super(select);
                setName("empmodelos");
                setOptions(READ | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onUpdate ()
                {
                vempmodfecha.grabaCheck();
                return super.onUpdate();
                }
            }
            
        public Sempmodelos()
            {
            setName("sempmodelos");
            // SET: SELECT
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
        // GET: SELECT
        public String getWhere ()
            {
            return "emodejercicio="+gEjercicio+" and emodnif='"+gNif+"' and emodactivo='S'";
            }
        public String getOrder ()
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
        // EVENT: SELECT
        }
        
    public ProgPrempmodfechas()
        {
        this.prempmodfechas=this;
        setName("prempmodfechas");
        setTitle("Fechas inicio/fin obligaciones");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vempmodfecha=new FormVempmodfecha(this));
        }
    public ProgPrempmodfechas(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    }
    
