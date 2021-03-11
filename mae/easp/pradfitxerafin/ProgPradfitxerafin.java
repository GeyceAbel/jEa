// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu Mar 11 09:07:54 CET 2021
// 
// Aplicación: easp
// 
package mae.easp.pradfitxerafin;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: pradfitxerafin
// Nombre:   Adjuntar fichero Afinity
// Versión:  1.0
// 
public class ProgPradfitxerafin extends Program
    {
    public AppEasp easp;
    public ProgPradfitxerafin pradfitxerafin;
    // GLOBALES: PROGRAMA
    private Azure azure = null;
public String cdp = null;
public static final String CARPETES_AFINITY_URL = "gesdoc.getinfocdp";
    // Metodos
    // Ventana
    public FormVadfitxerafin vadfitxerafin;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Adjuntar fichero Afinity");
            }
        }
        
    public class FormVadfitxerafin extends ProcessForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlVvfitxer vvfitxer;
        public CtrlVvchooser vvchooser;
        public CtrlVvdirremoto vvdirremoto;
        public CtrlVvetiquetas vvetiquetas;
        // Acciones
        public LinkApuja apuja;
        // Fieldsets
        public FSetFs1 fs1;
        public FSetFs2 fs2;
        public FSetFs3 fs3;
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(1);
                setHeight(1);
                setTitle("Adjuntar fichero Afinity");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlVvfitxer extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvfitxer(Form form)
                {
                super(form);
                setName("vvfitxer");
                setTitle("");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvchooser extends ControlButton
            {
            // GLOBALES: BOTON
            // Metodos
            public CtrlVvchooser(Form form)
                {
                super(form);
                setName("vvchooser");
                setTitle("");
                // SET: BOTON
                }
            // EVENT: BOTON
            public void onClick ()
                {
                super.onClick ();
                
javax.swing.JFileChooser chooser = new javax.swing.JFileChooser(System.getProperty("user.home"));
chooser.showOpenDialog(null);
                }
            // GET: BOTON
            }
            
        public class CtrlVvdirremoto extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdirremoto(Form form)
                {
                super(form);
                setName("vvdirremoto");
                setTitle("Directorio remoto");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvetiquetas extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvetiquetas(Form form)
                {
                super(form);
                setName("vvetiquetas");
                setTitle("Etiquetas");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkApuja extends Action
            {
            public LinkApuja(Form form)
                {
                super(form);
                setName("apuja");
                setTitle("&1. Subir fichero");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                setTitulo("Origen y destino");
                addControl(vvfitxer);
                addControl(vvchooser);
                getWebProperties().setAnchoColumnas (12);
                getWebProperties().setNumCols (2);
                }
            }
            
        public class FSetFs2 extends Fieldset
            {
            public FSetFs2(Form form)
                {
                super(form);
                setTitulo("Directorio remoto");
                addControl(vvdirremoto);
                }
            }
            
        public class FSetFs3 extends Fieldset
            {
            public FSetFs3(Form form)
                {
                super(form);
                setTitulo("Etiquetas");
                addControl(vvetiquetas);
                }
            }
            
        public FormVadfitxerafin(ProgPradfitxerafin pradfitxerafin)
            {
            super(pradfitxerafin);
            setName("vadfitxerafin");
            setTitle("Adjuntar fichero Afinity");
            setLocation(new Location());
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            setFildsetMax (LayoutFieldset.TIPOMAXIMIZAR.AMBOS);
            addControl(vvfitxer=new CtrlVvfitxer(this));
            addControl(vvchooser=new CtrlVvchooser(this));
            addControl(vvdirremoto=new CtrlVvdirremoto(this));
            addControl(vvetiquetas=new CtrlVvetiquetas(this));
            addAction(apuja=new LinkApuja(this));
            addFieldset(fs1=new FSetFs1(this));
            addFieldset(fs2=new FSetFs2(this));
            addFieldset(fs3=new FSetFs3(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setLayout(new LayoutFieldset(this));
            super.onInit ();
            }
        public void onInitFieldset ()
            {
            super.onInitFieldset ();
            System.out.println("dwdwdawjkdawjikdhaw");
            }
        }
        
    public ProgPradfitxerafin(AppEasp easp)
        {
        super(easp);
        this.easp=easp;
        this.pradfitxerafin=this;
        setName("pradfitxerafin");
        setTitle("Adjuntar fichero Afinity");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vadfitxerafin=new FormVadfitxerafin(this));
        }
    public ProgPradfitxerafin()
        {
        this((AppEasp) Aplication.getAplication());
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    }
    
