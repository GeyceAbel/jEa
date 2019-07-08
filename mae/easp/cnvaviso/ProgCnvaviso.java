// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Mon Jul 08 14:08:36 CEST 2019
// 
// Aplicación: easp
// 
package mae.easp.cnvaviso;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: cnvaviso
// Nombre:   Aviso
// Versión:  1.0
// 
public class ProgCnvaviso extends Program
    {
    public AppEasp easp;
    public ProgCnvaviso cnvaviso;
    // GLOBALES: PROGRAMA
    public boolean haAceptadoCondiciones = false;
    // Metodos
    // Ventana
    public FormVaviso vaviso;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Aviso");
            }
        }
        
    public class FormVaviso extends ProcessForm
        {
        // GLOBALES: VENTANA
        public void onOpened() {
  super.onOpened();
  haAceptadoCondiciones = false;
}
        // Metodos
        // Controles
        public CtrlChok chok;
        // Acciones
        public LinkAsalir asalir;
        // Fieldsets
        public FSetF1 f1;
        public FSetF2 f2;
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
            
        public class CtrlChok extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChok(Form form)
                {
                super(form);
                setName("chok");
                setMessageHelp("Acepto las condiciones de uso");
                setTitle("Acepto las condiciones de uso");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public boolean valid ()
                {
                return true;
                }
                public void userChange (Value v) {
                  super.userChange(v);
                  haAceptadoCondiciones = getBoolean();
                }
            // GET: CHECKBOX
            public Object getDefault ()
                {
                return Boolean.FALSE;
                }
            }
            
        public class LinkAsalir extends Action
            {
            public LinkAsalir(Form form)
                {
                super(form);
                setName("asalir");
                setTitle("C E R R A R     V E N T A N A");
                // SET: ACCION
                setOptions(SHOW | EOF);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                cnvaviso.exit();
                }
            }
            
        public class FSetF1 extends Fieldset
            {
            public FSetF1(Form form)
                {
                super(form);
                getWebProperties().setYPad (20);
                getWebProperties().setSizeSeparacionB (0);
                }
            }
            
        public class FSetF2 extends Fieldset
            {
            public FSetF2(Form form)
                {
                super(form);
                getWebProperties().setNumCols (2);
                getWebProperties().setCheckInv (true);
                getWebProperties().setSizeSeparacionT (0);
                }
            }
            
        public FormVaviso(ProgCnvaviso cnvaviso)
            {
            super(cnvaviso);
            setName("vaviso");
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addControl(chok=new CtrlChok(this));
            addAction(asalir=new LinkAsalir(this));
            addFieldset(f1=new FSetF1(this));
            addFieldset(f2=new FSetF2(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onExit ()
            {
            if (!haAceptadoCondiciones) Maefc.message("Proceso cancelado por no aceptar las condiciones del traspaso.","¡Atención!",Maefc.WARNING_MESSAGE);
            super.onExit();
            }
        public void onInitFieldset ()
            {
            java.awt.Font f = new java.awt.Font("", java.awt.Font.BOLD, 1);
                        
            ControlLabel l = new ControlLabel(this);
            l.setTitle("CONSIDERACIONES DEL TRASPASO DE DATOS");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            l = new ControlLabel(this);
            l.setTitle("<HTML>Lea detenidamente las condiciones del presente documento antes de utilizar esta opción.</HTML>");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            l = new ControlLabel(this);
            l.setTitle("<HTML>GEYCE AGP Software pone a su disposición esta utilidad enfocada a facilitar una migración de los datos de su antiguo<BR>programa a nuestra aplicación.</HTML>");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            l = new ControlLabel(this);
            l.setTitle("<HTML>Aunque esta opción automatiza la tarea de traspasar los datos, y puede llevar un validador de los cálculos, es<BR>necesaria la supervisión del usuario final para confirmar la veracidad y buen fin de los datos traspasados.</HTML>");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            l = new ControlLabel(this);
            l.setTitle("<HTML>Este proceso puede repetirse tantas veces como se desee, pero deberá tener en cuenta que la información anterior<BR>existente en la aplicación de GEYCE en cuestión, será eliminada.</HTML>");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            l = new ControlLabel(this);
            l.setTitle("<HTML>Le recordamos que considere la conveniencia de disponer de <font color=\"#FF0000\">copias de seguridad</font> actualizadas, tanto de la Base de<BR>Datos de la aplicación origen como de la aplicación destino GEyCE antes de ejecutar este proceso.</HTML>");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            l = new ControlLabel(this);
            l.setTitle("<HTML>GEYCE AGP Software no puede garantizar el traspaso íntegro y exacto de los datos ya que no se tiene el control del<BR>origen de los mismos y por lo tanto no puede ser responsable de los efectos que dicho traspaso de datos pueda<BR>efectuar, directa o indirectamente en el uso de la aplicación.</HTML>");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            l = new ControlLabel(this);
            l.setTitle("<HTML>El usuario final es quien deberá efectuar las pruebas necesarias en la aplicación antes de efectuar el traspaso<BR>definitivo.</HTML>");
            l.setFont(f);
            l.setShowFSRight(true);
            f1.addControl(l);
            
            f2.addControl(chok);
            
            l = new ControlLabel(this);
            l.setTitle("He leído y acepto las condiciones del traspaso.");
            l.setFont(f);
            l.setForeground(java.awt.Color.RED);
            l.setShowFSRight(true);
            f2.addControl(l);
            
            super.onInitFieldset ();
            }
        }
        
    public ProgCnvaviso()
        {
        this.cnvaviso=this;
        setName("cnvaviso");
        setTitle("Aviso");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vaviso=new FormVaviso(this));
        }
    public ProgCnvaviso(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        LocationWindow loc = new LocationWindow();
        loc.setWidth(790);
        loc.setHeight(515);
        setModal(true);
        setLocation(loc);
        vaviso.setLayout (new LayoutHtml ("mae/easp/html/cnvaviso.html"));
        super.onInit();
        }
    }
    
