// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Mon Dec 30 12:58:41 CET 2019
// 
// Aplicación: easp
// 
package mae.easp.usdeblquser;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: usdeblquser
// Nombre:   Desbloquear usuario
// Versión:  1.0
// 
public class ProgUsdeblquser extends Program
    {
    public AppEasp easp;
    public ProgUsdeblquser usdeblquser;
    // GLOBALES: PROGRAMA
    // Metodos
    // Ventana
    public FormVdesbloquear vdesbloquear;
    // Selects
    public Simpuser simpuser;
    public Sushistorico sushistorico;
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Desbloquear usuario");
            }
        }
        
    public class FormVdesbloquear extends ProcessForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlVvusuario vvusuario;
        // Acciones
        public LinkAcdesbloquar acdesbloquar;
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
                setAnchor(CENTER);
                }
            }
            
        public class CtrlVvusuario extends ControlComboBox
            {
            public mae.easp.general.pkusuarios.PickPkusuarios pickup;
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvusuario(Form form)
                {
                super(form);
                setName("vvusuario");
                setTitle("Usuario");
                setType(STRING);
                setPickUp(pickup=new mae.easp.general.pkusuarios.PickPkusuarios(this));
                setLength(15);
                setPrintable(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAcdesbloquar extends Action
            {
            public LinkAcdesbloquar(Form form)
                {
                super(form);
                setName("acdesbloquar");
                setTitle("&1. Desbloquear");
                // SET: ACCION
                setOptions(SEARCH | SHOW | UPDATE | INSERT);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                if (vvusuario.getString()==null || "".equals(vvusuario.getString().trim())) {
	Maefc.message("Debe informar el usuario.");
}	
else {  
                  simpuser.execute();
                  while ( !simpuser.isEof() ) {
                      simpuser.delete();
                      simpuser.next();
                  }
                  simpuser.commit();
                  sushistorico.execute();
  if (!sushistorico.isEof()) {
  	sushistorico.edit();
  	sushistorico.uhreintento.setValue(0);
  	sushistorico.save();
  	sushistorico.commit();
  }
  Maefc.message("Proceso finalizado") ;
                  usdeblquser.exit();
                }
                }
            }
            
        public FormVdesbloquear(ProgUsdeblquser usdeblquser)
            {
            super(usdeblquser);
            setName("vdesbloquear");
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addSelect(simpuser=new Simpuser());
            addSelect(sushistorico=new Sushistorico());
            addControl(vvusuario=new CtrlVvusuario(this));
            addAction(acdesbloquar=new LinkAcdesbloquar(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Simpuser extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Impuser impuser;
        // Campos
        public Field imuaplicacion;
        public Field imucodigo;
        public Field imufecha;
        public Field imuhora;
        public Field imumachine;
        public Field imuusuario;
        class Impuser extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Impuser(Select select)
                {
                super(select);
                setName("impuser");
                setOptions(READ | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Simpuser()
            {
            setName("simpuser");
            // SET: SELECT
            addTable(impuser=new Impuser(this));
            addField(imuaplicacion=new Field(this,impuser,"imuaplicacion"));
            addField(imucodigo=new Field(this,impuser,"imucodigo"));
            addField(imufecha=new Field(this,impuser,"imufecha"));
            addField(imuhora=new Field(this,impuser,"imuhora"));
            addField(imumachine=new Field(this,impuser,"imumachine"));
            addField(imuusuario=new Field(this,impuser,"imuusuario"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "imuusuario='"+vdesbloquear.vvusuario.getString()+"'";
            }
        // EVENT: SELECT
        }
        
    // Select ushistorico
    public class Sushistorico extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Ushistorico ushistorico;
        // Campos
        public Field uhcodcon;
        public Field uhlogin;
        public Field uhfecha;
        public Field uhhora;
        public Field uhpasswd;
        public Field uhmd5;
        public Field uhprimera;
        public Field uhreintento;
        class Ushistorico extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Ushistorico(Select select)
                {
                super(select);
                setName("ushistorico");
                setOptions(READ | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sushistorico()
            {
            setName("sushistorico");
            // SET: SELECT
            addTable(ushistorico=new Ushistorico(this));
            addField(uhcodcon=new Field(this,ushistorico,"uhcodcon"));
            addField(uhlogin=new Field(this,ushistorico,"uhlogin"));
            addField(uhfecha=new Field(this,ushistorico,"uhfecha"));
            addField(uhhora=new Field(this,ushistorico,"uhhora"));
            addField(uhpasswd=new Field(this,ushistorico,"uhpasswd"));
            addField(uhmd5=new Field(this,ushistorico,"uhmd5"));
            addField(uhprimera=new Field(this,ushistorico,"uhprimera"));
            addField(uhreintento=new Field(this,ushistorico,"uhreintento"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            return "uhcodcon=1 and uhlogin='"+vdesbloquear.vvusuario.getString()+"'";
            }
        public String getOrder ()
            {
            return "uhfecha desc, uhhora desc";
            }
        // EVENT: SELECT
        }
        
    public ProgUsdeblquser()
        {
        this.usdeblquser=this;
        setName("usdeblquser");
        setTitle("Desbloquear usuario");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vdesbloquear=new FormVdesbloquear(this));
        }
    public ProgUsdeblquser(AppEasp easp)
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
        else super.onInit ();
        }
    }
    
