// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Mon Mar 25 10:58:40 CET 2019
// 
// Aplicación: easp
// 
package mae.easp.usseguridad;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: usseguridad
// Nombre:   Seguridad contraseñas
// Versión:  1.0
// 
public class ProgUsseguridad extends Program
    {
    public AppEasp easp;
    public ProgUsseguridad usseguridad;
    // GLOBALES: PROGRAMA
    // Metodos
    // Ventana
    public FormVseguridad vseguridad;
    // Selects
    public Sseguridad sseguridad;
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Seguridad contraseñas");
            }
        }
        
    public class FormVseguridad extends MonoDataForm
        {
        // GLOBALES: VENTANA
        private void leeChecks() {
	choblig.setValue("S".equals(sseguridad.segcontroblig.getString()));
	chletras.setValue("S".equals(sseguridad.seginclletras.getString()));
	chnumeros.setValue("S".equals(sseguridad.segincnumeros.getString()));
	chcarespecial.setValue("S".equals(sseguridad.seginccarespec.getString()));
	chreutilizable.setValue("S".equals(sseguridad.segreutiliza.getString()));
	chresetprimer.setValue("S".equals(sseguridad.segprimeravez.getString()));
	chsimultaneo.setValue("S".equals(sseguridad.segsesionsimul.getString()));
}
private void grabaChecks() {
	if (choblig.getBoolean()) sseguridad.segcontroblig.setValue("S");
	else sseguridad.segcontroblig.setValue("N");
	if (chletras.getBoolean()) sseguridad.seginclletras.setValue("S");
	else sseguridad.seginclletras.setValue("N");
	if (chnumeros.getBoolean()) sseguridad.segincnumeros.setValue("S");
	else sseguridad.segincnumeros.setValue("N");
	if (chcarespecial.getBoolean()) sseguridad.seginccarespec.setValue("S");
	else sseguridad.seginccarespec.setValue("N");
	if (chreutilizable.getBoolean()) sseguridad.segreutiliza.setValue("S");
	else sseguridad.segreutiliza.setValue("N");
	if (chresetprimer.getBoolean()) sseguridad.segprimeravez.setValue("S");
	else sseguridad.segprimeravez.setValue("N");
	if (chsimultaneo.getBoolean()) sseguridad.segsesionsimul.setValue("S");
	else sseguridad.segsesionsimul.setValue("N");
}
private void activaCamps() {
	boolean activa = true;
	if (!choblig.getBoolean()) {
		activa = false;
		seglongminima.setNull();
		chletras.setValue(false);
		chnumeros.setValue(false);
		chcarespecial.setValue(false);
		segcontrexpira.setNull();
		segintento.setNull();
		chresetprimer.setValue(false);
		chreutilizable.setValue(false);
	}
	 seglongminima.setEnabled(activa);
	 chletras.setEnabled(activa);
	 chnumeros.setEnabled(activa);
	 chcarespecial.setEnabled(activa);
	 segcontrexpira.setEnabled(activa);
	 segintento.setEnabled(activa);
	 chresetprimer.setEnabled(activa);	
	 chreutilizable.setEnabled(activa);	
	 activaExpira();
}
private void activaExpira() {
	boolean activa = true;
	if (!chreutilizable.getBoolean()) {
		activa = false;
		seghistorico.setNull();		
	}
	seghistorico.setEnabled(activa);	 
}
        // Metodos
        // Controles
        public CtrlChoblig choblig;
        public CtrlSeglongminima seglongminima;
        public CtrlChletras chletras;
        public CtrlChnumeros chnumeros;
        public CtrlChcarespecial chcarespecial;
        public CtrlSegcontrexpira segcontrexpira;
        public CtrlChreutilizable chreutilizable;
        public CtrlSeghistorico seghistorico;
        public CtrlSegintento segintento;
        public CtrlChresetprimer chresetprimer;
        public CtrlChsimultaneo chsimultaneo;
        public CtrlSegmaxsesion segmaxsesion;
        public CtrlSegsesinactiva segsesinactiva;
        // Acciones
        // Fieldsets
        class Location extends LocationGridBag
            {
            public Location( )
                {
                super();
                setWidth(REMAINDER);
                setHeight(REMAINDER);
                setWeightx(800.0);
                setWeighty(600.0);
                setFill(BOTH);
                setAnchor(CENTER);
                }
            }
            
        public class CtrlChoblig extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChoblig(Form form)
                {
                super(form);
                setName("choblig");
                setMessageHelp("Contraseña obligatoria");
                setTitle("Contraseña obligatoria");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public void userChange (Value v)
                {
                super.userChange (v);
                activaCamps();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlSeglongminima extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlSeglongminima(Form form)
                {
                super(form);
                setName("seglongminima");
                setMessageHelp(" Longitud mínima");
                setTitle("Longitud mínima");
                setType(INTEGER);
                setMaskInput("##");
                setMin(0);
                setMax(20);
                setLength(2);
                setSearchable(true);
                setField(sseguridad.seglongminima);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChletras extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChletras(Form form)
                {
                super(form);
                setName("chletras");
                setMessageHelp("La contraseña debe contener letras");
                setTitle("Letras");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChnumeros extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChnumeros(Form form)
                {
                super(form);
                setName("chnumeros");
                setMessageHelp("La contraseña debe contener números");
                setTitle("Números");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChcarespecial extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChcarespecial(Form form)
                {
                super(form);
                setName("chcarespecial");
                setMessageHelp("La contraseña debe contener algún caracter especial");
                setTitle("Caracteres especiales");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlSegcontrexpira extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlSegcontrexpira(Form form)
                {
                super(form);
                setName("segcontrexpira");
                setMessageHelp("Número de dias en los que expira la contraseña (0 o blanco no caduca)");
                setTitle("Numero de dias en los que expira la contraseña (0 o blanco no caduca)");
                setType(INTEGER);
                setMaskInput("###");
                setMin(0);
                setMax(365);
                setLength(10);
                setSearchable(true);
                setField(sseguridad.segcontrexpira);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChreutilizable extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChreutilizable(Form form)
                {
                super(form);
                setName("chreutilizable");
                setMessageHelp("Se pueden utilizar contraseñas que ya se habían utilizado anteriormente");
                setTitle("Se puede reutilizar");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            public void userChange (Value v)
                {
                super.userChange (v);
                activaExpira();
                }
            // GET: CHECKBOX
            }
            
        public class CtrlSeghistorico extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlSeghistorico(Form form)
                {
                super(form);
                setName("seghistorico");
                setMessageHelp(" Se permite reutilizar una contraseña de n-veces anteriores");
                setTitle("Se permite reutilizar una contraseña de n-veces anteriores");
                setType(INTEGER);
                setMaskInput("##");
                setMin(0);
                setMax(99);
                setLength(2);
                setSearchable(true);
                setField(sseguridad.seghistorico);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlSegintento extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlSegintento(Form form)
                {
                super(form);
                setName("segintento");
                setMessageHelp("Número de reintentos permitidos");
                setTitle("Número de intentos");
                setType(INTEGER);
                setMaskInput("#");
                setMin(0);
                setMax(9);
                setLength(1);
                setSearchable(true);
                setField(sseguridad.segintento);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlChresetprimer extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChresetprimer(Form form)
                {
                super(form);
                setName("chresetprimer");
                setMessageHelp("Se debe resetear la contraseña en el primer acceso");
                setTitle("Primera vez");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChsimultaneo extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChsimultaneo(Form form)
                {
                super(form);
                setName("chsimultaneo");
                setMessageHelp("Se permite varios accesos a la aplicación con el mismo usuario");
                setTitle("Usuario simultáneo");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlSegmaxsesion extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlSegmaxsesion(Form form)
                {
                super(form);
                setName("segmaxsesion");
                setMessageHelp("Después de n-horas expira la sesión. En blanco no se tendrá en cuenta");
                setTitle("Despues de n-horas expira la sesion");
                setType(INTEGER);
                setMaskInput("##");
                setMin(0);
                setMax(72);
                setLength(2);
                setSearchable(true);
                setField(sseguridad.segmaxsesion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlSegsesinactiva extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlSegsesinactiva(Form form)
                {
                super(form);
                setName("segsesinactiva");
                setMessageHelp("Después de n-minutos de inactividad expira la sesión. En blanco no se tendrá en cuenta");
                setTitle("Después de n-minutos de inactividad expira la sesión");
                setType(INTEGER);
                setMaskInput("####");
                setMin(0);
                setMax(1440);
                setLength(4);
                setSearchable(true);
                setField(sseguridad.segsesinactiva);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVseguridad(ProgUsseguridad usseguridad)
            {
            super(usseguridad);
            setName("vseguridad");
            setTitle("Seguridad contraseñas");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setStates(SHOW | UPDATE | INSERT);
            setPrintable(false);
            setUnique(true);
            // SET: VENTANA
            addSelect(sseguridad=new Sseguridad());
            addControl(choblig=new CtrlChoblig(this));
            addControl(seglongminima=new CtrlSeglongminima(this));
            addControl(chletras=new CtrlChletras(this));
            addControl(chnumeros=new CtrlChnumeros(this));
            addControl(chcarespecial=new CtrlChcarespecial(this));
            addControl(segcontrexpira=new CtrlSegcontrexpira(this));
            addControl(chreutilizable=new CtrlChreutilizable(this));
            addControl(seghistorico=new CtrlSeghistorico(this));
            addControl(segintento=new CtrlSegintento(this));
            addControl(chresetprimer=new CtrlChresetprimer(this));
            addControl(chsimultaneo=new CtrlChsimultaneo(this));
            addControl(segmaxsesion=new CtrlSegmaxsesion(this));
            addControl(segsesinactiva=new CtrlSegsesinactiva(this));
            setSelect(sseguridad);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInsert ()
            {
            super.onInsert ();
            activaCamps();
            }
        public void onBeginRecord ()
            {
            leeChecks();
            activaCamps();
            super.onBeginRecord ();
            }
        }
        
    // Select seguridad
    public class Sseguridad extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Seguridad seguridad;
        // Campos
        public Field segcodigo;
        public Field segcontroblig;
        public Field seglongminima;
        public Field seginclletras;
        public Field segincnumeros;
        public Field seginccarespec;
        public Field segcontrexpira;
        public Field segreutiliza;
        public Field seghistorico;
        public Field segintento;
        public Field segprimeravez;
        public Field segsesinactiva;
        public Field segmaxsesion;
        public Field segsesionsimul;
        class Seguridad extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Seguridad(Select select)
                {
                super(select);
                setName("seguridad");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            public boolean onInsert ()
                {
                segcodigo.setValue(1);
                vseguridad.grabaChecks();
                return super.onInsert ();
                }
            public boolean onUpdate ()
                {
                vseguridad.grabaChecks();
                return super.onUpdate ();
                }
            }
            
        public Sseguridad()
            {
            setName("sseguridad");
            // SET: SELECT
            addTable(seguridad=new Seguridad(this));
            addField(segcodigo=new Field(this,seguridad,"segcodigo"));
            addField(segcontroblig=new Field(this,seguridad,"segcontroblig"));
            addField(seglongminima=new Field(this,seguridad,"seglongminima"));
            addField(seginclletras=new Field(this,seguridad,"seginclletras"));
            addField(segincnumeros=new Field(this,seguridad,"segincnumeros"));
            addField(seginccarespec=new Field(this,seguridad,"seginccarespec"));
            addField(segcontrexpira=new Field(this,seguridad,"segcontrexpira"));
            addField(segreutiliza=new Field(this,seguridad,"segreutiliza"));
            addField(seghistorico=new Field(this,seguridad,"seghistorico"));
            addField(segintento=new Field(this,seguridad,"segintento"));
            addField(segprimeravez=new Field(this,seguridad,"segprimeravez"));
            addField(segsesinactiva=new Field(this,seguridad,"segsesinactiva"));
            addField(segmaxsesion=new Field(this,seguridad,"segmaxsesion"));
            addField(segsesionsimul=new Field(this,seguridad,"segsesionsimul"));
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public ProgUsseguridad()
        {
        this.usseguridad=this;
        setName("usseguridad");
        setTitle("Seguridad contraseñas");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vseguridad=new FormVseguridad(this));
        }
    public ProgUsseguridad(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        if (!Aplication.getAplication().getUser().toUpperCase().equals("ADMIN")) 
  Maefc.message("Sólo se permite el acceso al usuario administrador.","Aviso",Maefc.ERROR_MESSAGE);
else {
  vseguridad.setLayout(new LayoutHtml("mae/easp/html/vseguridad.html"));
  super.onInit ();
        }
        }
    }
    
