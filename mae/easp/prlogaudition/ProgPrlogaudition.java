// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Wed Jun 01 10:57:12 CEST 2022
// 
// Aplicación: easp
// 
package mae.easp.prlogaudition;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: prlogaudition
// Nombre:   Log de uso
// Versión:  1.0
// 
public class ProgPrlogaudition extends Program
    {
    public AppEasp easp;
    public ProgPrlogaudition prlogaudition;
    // GLOBALES: PROGRAMA
    private int ordenacion = -1;
private int ordenacionant = -1;
private int ordenacionantant = -1;
private boolean filtroUsuario = false;
private String nomPC = Easp.getNomPC();
private DBConnection connAudition = null;
private DBConnection connAnt = null;
private DBConnection connAntAnt = null;
private boolean esSQL = "SQLSERVER".equals(Aplication.getDB().getType().toUpperCase());

/*
 * Parametres del procés
 */
private boolean loganterior = true;
private boolean loganterioranterior = true;
public boolean totesAplicacions = false;
public String aplicatiu = null;

private Aplication getApp() {
	Aplication appAud;
	if (esSQL || aplicatiu == null) {
		appAud = Aplication.getAplication();
	}
	else {
		appAud = new Aplication();
		appAud.setName(aplicatiu);
	}
	return appAud;
}

private boolean initConnection() {
	DefaultAuditionProgram dap;
	if (esSQL || (aplicatiu == null && Aplication.getAplication().getAudition() instanceof DefaultAuditionProgram))
		dap = (DefaultAuditionProgram) Aplication.getAplication().getAudition();
	else 
		dap = new DefaultAuditionProgram(getApp(), Maefc.getYear(Maefc.getDate()));
	connAudition = dap.getConexion();
	saudition.setDb(connAudition);
	return connAudition != null;
}

private boolean initConnectionAnt() {
	DefaultAuditionProgram dap = new DefaultAuditionProgram(getApp(), Maefc.getYear(Maefc.getDate()) - 1);
	dap.initAudition();
	connAnt = dap.getConexion();
	sauditionant.setDb(connAnt);
	return connAnt != null;
}

private boolean initConnectionAntAnt() {
	DefaultAuditionProgram dap = new DefaultAuditionProgram(getApp(), Maefc.getYear(Maefc.getDate()) - 2);
	dap.initAudition();
	connAntAnt = dap.getConexion();
	sauditionantant.setDb(connAntAnt);
	return connAntAnt != null;
}

public void onOpened() {
	super.onOpened();	
	if (filtroUsuario)
		Maefc.message("Para ver el registro de uso de todos los usuarios deberá entrar con un usuario del grupo [Administradores].\nEn caso contrario, únicamente verá el registro del usuario/pc [" + Aplication.getAplication().getUser() + "/" + nomPC + "]", "¡Atención!");
}
    // Metodos
    // Ventana
    public FormVlog vlog;
    // Selects
    public Saudition saudition;
    // Ventana
    public FormVdetalle vdetalle;
    // Selects
    // Ventana
    public FormVlogant vlogant;
    // Selects
    public Sauditionant sauditionant;
    // Ventana
    public FormVlogantant vlogantant;
    // Selects
    public Sauditionantant sauditionantant;
    // Ventana
    public FormVdetalleant vdetalleant;
    // Selects
    // Ventana
    public FormVdetalleantant vdetalleantant;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Log de uso");
            }
        }
        
    public class FormVlog extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlAprfecha aprfecha;
        public CtrlAprtime aprtime;
        public CtrlAprnombrepc aprnombrepc;
        public CtrlAprusuario aprusuario;
        public CtrlApraplication apraplication;
        public CtrlApraccion apraccion;
        public CtrlAprtipo aprtipo;
        public CtrlAprprogram aprprogram;
        public CtrlAprventana aprventana;
        public CtrlAprdesc aprdesc;
        public CtrlAprinfo aprinfo;
        // Acciones
        public LinkAdetalle adetalle;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setTitle("Log de uso");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlAprfecha extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAprfecha(Form form)
                {
                super(form);
                setName("aprfecha");
                setTitle("Fecha");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setField(saudition.aprfecha);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprtime extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAprtime(Form form)
                {
                super(form);
                setName("aprtime");
                setTitle("Hora");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(saudition.aprtime);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprnombrepc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(35);
                    }
                }
                
            public CtrlAprnombrepc(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprnombrepc");
                setTitle("Nombre PC");
                setType(STRING);
                setLength(35);
                setSearchable(true);
                setField(saudition.aprnombrepc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprusuario extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAprusuario(Form form)
                {
                super(form);
                setName("aprusuario");
                setTitle("Usuario");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(saudition.aprusuario);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlApraplication extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlApraplication(Form form)
                {
                super(form);
                setLook(new Look());
                setName("apraplication");
                setTitle("Aplicación");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(saudition.apraplication);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlApraccion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlApraccion(Form form)
                {
                super(form);
                setName("apraccion");
                setTitle("Acción");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(saudition.apraccion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprtipo extends ColumnComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAprtipo(Form form)
                {
                super(form);
                setName("aprtipo");
                setTitle("Tipo");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                addItem("OPENPANEL");
                addItem("OPENPRG");
                addItem("OPENFRM");
                addItem("CLICKBTN");
                addItem("CLICKACT");
                addItem("DELETEREG");
                addItem("ALTAREG");
                addItem("MODIFREG");
                addItem("SAVEREG");
                setField(saudition.aprtipo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprprogram extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAprprogram(Form form)
                {
                super(form);
                setName("aprprogram");
                setTitle("Programa");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(saudition.aprprogram);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprventana extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlAprventana(Form form)
                {
                super(form);
                setName("aprventana");
                setTitle("Ventana");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(saudition.aprventana);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprdesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(50);
                    }
                }
                
            public CtrlAprdesc(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprdesc");
                setTitle("Descripción");
                setType(STRING);
                setLength(200);
                setSearchable(true);
                setField(saudition.aprdesc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprinfo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlAprinfo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprinfo");
                setTitle("Datos");
                setType(STRING);
                setLength(4000);
                setSearchable(true);
                setField(saudition.aprinfo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAdetalle extends Action
            {
            public LinkAdetalle(Form form)
                {
                super(form);
                setName("adetalle");
                setTitle("&1. Detalle");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                setConnection(connAudition);
                vdetalle.setSelect(saudition);
                vdetalle.open();
                }
            }
            
        public FormVlog(ProgPrlogaudition prlogaudition)
            {
            super(prlogaudition);
            setName("vlog");
            setTitle("Log de uso");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(saudition=new Saudition());
            addControl(aprfecha=new CtrlAprfecha(this));
            addControl(aprtime=new CtrlAprtime(this));
            addControl(aprnombrepc=new CtrlAprnombrepc(this));
            addControl(aprusuario=new CtrlAprusuario(this));
            addControl(apraplication=new CtrlApraplication(this));
            addControl(apraccion=new CtrlApraccion(this));
            addControl(aprtipo=new CtrlAprtipo(this));
            addControl(aprprogram=new CtrlAprprogram(this));
            addControl(aprventana=new CtrlAprventana(this));
            addControl(aprdesc=new CtrlAprdesc(this));
            addControl(aprinfo=new CtrlAprinfo(this));
            addAction(adetalle=new LinkAdetalle(this));
            setSelect(saudition);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onColumnClick (int ncol)
            {
            Maefc.waitCursor();
            super.onColumnClick(ncol);
            ordenacion = ncol;
            doShow();
            Maefc.restoreCursor();
            }
        }
        
    // 
    public class Saudition extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Auditionpr auditionpr;
        // Campos
        public Field apraccion;
        public Field apraplication;
        public Field aprdesc;
        public Field aprfecha;
        public Field aprinfo;
        public Field aprnombrepc;
        public Field aprpackage;
        public Field aprprogram;
        public Field aprtime;
        public Field aprtipo;
        public Field aprusuario;
        public Field aprventana;
        class Auditionpr extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Auditionpr(Select select)
                {
                super(select);
                setName("auditionpr");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Saudition()
            {
            setName("saudition");
            // SET: SELECT
            addTable(auditionpr=new Auditionpr(this));
            addField(apraccion=new Field(this,auditionpr,"apraccion"));
            addField(apraplication=new Field(this,auditionpr,"apraplication"));
            addField(aprdesc=new Field(this,auditionpr,"aprdesc"));
            addField(aprfecha=new Field(this,auditionpr,"aprfecha"));
            addField(aprinfo=new Field(this,auditionpr,"aprinfo"));
            addField(aprnombrepc=new Field(this,auditionpr,"aprnombrepc"));
            addField(aprpackage=new Field(this,auditionpr,"aprpackage"));
            addField(aprprogram=new Field(this,auditionpr,"aprprogram"));
            addField(aprtime=new Field(this,auditionpr,"aprtime"));
            addField(aprtipo=new Field(this,auditionpr,"aprtipo"));
            addField(aprusuario=new Field(this,auditionpr,"aprusuario"));
            addField(aprventana=new Field(this,auditionpr,"aprventana"));
            }
        // GET: SELECT
        public String getOrder ()
            {
            if (ordenacion>0) return vlog.getControlTable().getColumn(ordenacion).getControlValue().getName()+",aprcodi desc";
            else return "aprcodi desc";
            }
        // EVENT: SELECT
        }
        
    public class FormVdetalle extends MonoDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlAprpackage aprpackage;
        public CtrlAprinfo aprinfo;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(700);
                setHeight(300);
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlAprpackage extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(60);
                    }
                }
                
            public CtrlAprpackage(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprpackage");
                setTitle("Package");
                setType(STRING);
                setLength(100);
                setSearchable(true);
                setField(saudition.aprpackage);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprinfo extends ControlEditPane
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(50);
                    setHeight(6);
                    }
                }
                
            public CtrlAprinfo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprinfo");
                setTitle("Datos");
                setType(STRING);
                setLength(4000);
                setSearchable(true);
                setField(saudition.aprinfo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdetalle(ProgPrlogaudition prlogaudition)
            {
            super(prlogaudition);
            setName("vdetalle");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setStates(SHOW);
            setPrintable(false);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
            addControl(aprpackage=new CtrlAprpackage(this));
            addControl(aprinfo=new CtrlAprinfo(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVlogant extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlAprfecha aprfecha;
        public CtrlAprtime aprtime;
        public CtrlAprnombrepc aprnombrepc;
        public CtrlAprusuario aprusuario;
        public CtrlApraplication apraplication;
        public CtrlApraccion apraccion;
        public CtrlAprtipo aprtipo;
        public CtrlAprprogram aprprogram;
        public CtrlAprventana aprventana;
        public CtrlAprdesc aprdesc;
        public CtrlAprinfo aprinfo;
        // Acciones
        public LinkAdetalle adetalle;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlAprfecha extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlAprfecha(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprfecha");
                setTitle("Fecha");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setField(sauditionant.aprfecha);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprtime extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlAprtime(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprtime");
                setTitle("Hora");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sauditionant.aprtime);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprnombrepc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(35);
                    }
                }
                
            public CtrlAprnombrepc(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprnombrepc");
                setTitle("Nombre PC");
                setType(STRING);
                setLength(35);
                setSearchable(true);
                setField(sauditionant.aprnombrepc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprusuario extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprusuario(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprusuario");
                setTitle("Usuario");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionant.aprusuario);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlApraplication extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlApraplication(Form form)
                {
                super(form);
                setLook(new Look());
                setName("apraplication");
                setTitle("Aplicación");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sauditionant.apraplication);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlApraccion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlApraccion(Form form)
                {
                super(form);
                setLook(new Look());
                setName("apraccion");
                setTitle("Acción");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionant.apraccion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprtipo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprtipo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprtipo");
                setTitle("Tipo");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionant.aprtipo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprprogram extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprprogram(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprprogram");
                setTitle("Programa");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionant.aprprogram);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprventana extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprventana(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprventana");
                setTitle("Ventana");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionant.aprventana);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprdesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprdesc(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprdesc");
                setTitle("Descripción");
                setType(STRING);
                setLength(200);
                setSearchable(true);
                setField(sauditionant.aprdesc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprinfo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprinfo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprinfo");
                setTitle("Datos");
                setType(STRING);
                setLength(4000);
                setSearchable(true);
                setField(sauditionant.aprinfo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAdetalle extends Action
            {
            public LinkAdetalle(Form form)
                {
                super(form);
                setName("adetalle");
                setTitle("&1. Detalle");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                vdetalleant.open();
                }
            }
            
        public FormVlogant(ProgPrlogaudition prlogaudition)
            {
            super(prlogaudition);
            setName("vlogant");
            setTitle("Log de uso");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sauditionant=new Sauditionant());
            addControl(aprfecha=new CtrlAprfecha(this));
            addControl(aprtime=new CtrlAprtime(this));
            addControl(aprnombrepc=new CtrlAprnombrepc(this));
            addControl(aprusuario=new CtrlAprusuario(this));
            addControl(apraplication=new CtrlApraplication(this));
            addControl(apraccion=new CtrlApraccion(this));
            addControl(aprtipo=new CtrlAprtipo(this));
            addControl(aprprogram=new CtrlAprprogram(this));
            addControl(aprventana=new CtrlAprventana(this));
            addControl(aprdesc=new CtrlAprdesc(this));
            addControl(aprinfo=new CtrlAprinfo(this));
            addAction(adetalle=new LinkAdetalle(this));
            setSelect(sauditionant);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onColumnClick (int ncol)
            {
            Maefc.waitCursor();
            super.onColumnClick(ncol);
            ordenacionant = ncol;
            doShow();
            Maefc.restoreCursor();
            }
        }
        
    // 
    public class Sauditionant extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Auditionpr auditionpr;
        // Campos
        public Field apraccion;
        public Field apraplication;
        public Field aprdesc;
        public Field aprfecha;
        public Field aprinfo;
        public Field aprnombrepc;
        public Field aprpackage;
        public Field aprprogram;
        public Field aprtime;
        public Field aprtipo;
        public Field aprusuario;
        public Field aprventana;
        class Auditionpr extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Auditionpr(Select select)
                {
                super(select);
                setName("auditionpr");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sauditionant()
            {
            setName("sauditionant");
            // SET: SELECT
            addTable(auditionpr=new Auditionpr(this));
            addField(apraccion=new Field(this,auditionpr,"apraccion"));
            addField(apraplication=new Field(this,auditionpr,"apraplication"));
            addField(aprdesc=new Field(this,auditionpr,"aprdesc"));
            addField(aprfecha=new Field(this,auditionpr,"aprfecha"));
            addField(aprinfo=new Field(this,auditionpr,"aprinfo"));
            addField(aprnombrepc=new Field(this,auditionpr,"aprnombrepc"));
            addField(aprpackage=new Field(this,auditionpr,"aprpackage"));
            addField(aprprogram=new Field(this,auditionpr,"aprprogram"));
            addField(aprtime=new Field(this,auditionpr,"aprtime"));
            addField(aprtipo=new Field(this,auditionpr,"aprtipo"));
            addField(aprusuario=new Field(this,auditionpr,"aprusuario"));
            addField(aprventana=new Field(this,auditionpr,"aprventana"));
            }
        // GET: SELECT
        public String getOrder ()
            {
            if (ordenacionant>0) return vlogant.getControlTable().getColumn(ordenacionant).getControlValue().getName()+",aprcodi desc";
            else return "aprcodi desc";
            }
        // EVENT: SELECT
        }
        
    public class FormVlogantant extends MultiDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlAprfecha aprfecha;
        public CtrlAprtime aprtime;
        public CtrlAprnombrepc aprnombrepc;
        public CtrlAprusuario aprusuario;
        public CtrlApraplication apraplication;
        public CtrlApraccion apraccion;
        public CtrlAprtipo aprtipo;
        public CtrlAprprogram aprprogram;
        public CtrlAprventana aprventana;
        public CtrlAprdesc aprdesc;
        public CtrlAprinfo aprinfo;
        // Acciones
        public LinkAdetalle adetalle;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                }
            }
            
        public class CtrlAprfecha extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlAprfecha(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprfecha");
                setTitle("Fecha");
                setType(DATE);
                setLength(10);
                setSearchable(true);
                setField(sauditionantant.aprfecha);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprtime extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    }
                }
                
            public CtrlAprtime(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprtime");
                setTitle("Hora");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sauditionantant.aprtime);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprnombrepc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(35);
                    }
                }
                
            public CtrlAprnombrepc(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprnombrepc");
                setTitle("Nombre PC");
                setType(STRING);
                setLength(35);
                setSearchable(true);
                setField(sauditionantant.aprnombrepc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprusuario extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprusuario(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprusuario");
                setTitle("Usuario");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionantant.aprusuario);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlApraplication extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlApraplication(Form form)
                {
                super(form);
                setLook(new Look());
                setName("apraplication");
                setTitle("Aplicación");
                setType(STRING);
                setLength(10);
                setSearchable(true);
                setField(sauditionantant.apraplication);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlApraccion extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlApraccion(Form form)
                {
                super(form);
                setLook(new Look());
                setName("apraccion");
                setTitle("Acción");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionantant.apraccion);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprtipo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprtipo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprtipo");
                setTitle("Tipo");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionantant.aprtipo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprprogram extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprprogram(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprprogram");
                setTitle("Programa");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionantant.aprprogram);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprventana extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprventana(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprventana");
                setTitle("Ventana");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(sauditionantant.aprventana);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprdesc extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprdesc(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprdesc");
                setTitle("Descripción");
                setType(STRING);
                setLength(200);
                setSearchable(true);
                setField(sauditionantant.aprdesc);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprinfo extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(25);
                    }
                }
                
            public CtrlAprinfo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprinfo");
                setTitle("Datos");
                setType(STRING);
                setLength(4000);
                setSearchable(true);
                setField(sauditionantant.aprinfo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAdetalle extends Action
            {
            public LinkAdetalle(Form form)
                {
                super(form);
                setName("adetalle");
                setTitle("&1. Detalle");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                vdetalleantant.open();
                }
            }
            
        public FormVlogantant(ProgPrlogaudition prlogaudition)
            {
            super(prlogaudition);
            setName("vlogantant");
            setTitle("Log de uso");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            setModal(true);
            // SET: VENTANA
            addSelect(sauditionantant=new Sauditionantant());
            addControl(aprfecha=new CtrlAprfecha(this));
            addControl(aprtime=new CtrlAprtime(this));
            addControl(aprnombrepc=new CtrlAprnombrepc(this));
            addControl(aprusuario=new CtrlAprusuario(this));
            addControl(apraplication=new CtrlApraplication(this));
            addControl(apraccion=new CtrlApraccion(this));
            addControl(aprtipo=new CtrlAprtipo(this));
            addControl(aprprogram=new CtrlAprprogram(this));
            addControl(aprventana=new CtrlAprventana(this));
            addControl(aprdesc=new CtrlAprdesc(this));
            addControl(aprinfo=new CtrlAprinfo(this));
            addAction(adetalle=new LinkAdetalle(this));
            setSelect(sauditionantant);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onColumnClick (int ncol)
            {
            Maefc.waitCursor();
            super.onColumnClick(ncol);
            ordenacionantant = ncol;
            doShow();
            Maefc.restoreCursor();
            }
        }
        
    // 
    public class Sauditionantant extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Auditionpr auditionpr;
        // Campos
        public Field apraccion;
        public Field apraplication;
        public Field aprdesc;
        public Field aprfecha;
        public Field aprinfo;
        public Field aprnombrepc;
        public Field aprpackage;
        public Field aprprogram;
        public Field aprtime;
        public Field aprtipo;
        public Field aprusuario;
        public Field aprventana;
        class Auditionpr extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Auditionpr(Select select)
                {
                super(select);
                setName("auditionpr");
                setOptions(READ);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Sauditionantant()
            {
            setName("sauditionantant");
            // SET: SELECT
            addTable(auditionpr=new Auditionpr(this));
            addField(apraccion=new Field(this,auditionpr,"apraccion"));
            addField(apraplication=new Field(this,auditionpr,"apraplication"));
            addField(aprdesc=new Field(this,auditionpr,"aprdesc"));
            addField(aprfecha=new Field(this,auditionpr,"aprfecha"));
            addField(aprinfo=new Field(this,auditionpr,"aprinfo"));
            addField(aprnombrepc=new Field(this,auditionpr,"aprnombrepc"));
            addField(aprpackage=new Field(this,auditionpr,"aprpackage"));
            addField(aprprogram=new Field(this,auditionpr,"aprprogram"));
            addField(aprtime=new Field(this,auditionpr,"aprtime"));
            addField(aprtipo=new Field(this,auditionpr,"aprtipo"));
            addField(aprusuario=new Field(this,auditionpr,"aprusuario"));
            addField(aprventana=new Field(this,auditionpr,"aprventana"));
            }
        // GET: SELECT
        public String getOrder ()
            {
            if (ordenacionantant>0) return vlogantant.getControlTable().getColumn(ordenacionantant).getControlValue().getName()+",aprcodi desc";
            else return "aprcodi desc";
            }
        // EVENT: SELECT
        }
        
    public class FormVdetalleant extends MonoDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlAprpackage aprpackage;
        public CtrlAprinfo aprinfo;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(700);
                setHeight(300);
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlAprpackage extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(60);
                    }
                }
                
            public CtrlAprpackage(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprpackage");
                setTitle("Package");
                setType(STRING);
                setLength(100);
                setSearchable(true);
                setField(sauditionant.aprpackage);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprinfo extends ControlEditPane
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(50);
                    setHeight(6);
                    }
                }
                
            public CtrlAprinfo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprinfo");
                setTitle("Datos");
                setType(STRING);
                setLength(4000);
                setSearchable(true);
                setField(sauditionant.aprinfo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdetalleant(ProgPrlogaudition prlogaudition)
            {
            super(prlogaudition);
            setName("vdetalleant");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setStates(SHOW);
            setPrintable(false);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
            addControl(aprpackage=new CtrlAprpackage(this));
            addControl(aprinfo=new CtrlAprinfo(this));
            setSelect(sauditionant);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVdetalleantant extends MonoDataForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlAprpackage aprpackage;
        public CtrlAprinfo aprinfo;
        // Acciones
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(700);
                setHeight(300);
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlAprpackage extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(60);
                    }
                }
                
            public CtrlAprpackage(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprpackage");
                setTitle("Package");
                setType(STRING);
                setLength(100);
                setSearchable(true);
                setField(sauditionantant.aprpackage);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlAprinfo extends ControlEditPane
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(50);
                    setHeight(6);
                    }
                }
                
            public CtrlAprinfo(Form form)
                {
                super(form);
                setLook(new Look());
                setName("aprinfo");
                setTitle("Datos");
                setType(STRING);
                setLength(4000);
                setSearchable(true);
                setField(sauditionantant.aprinfo);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public FormVdetalleantant(ProgPrlogaudition prlogaudition)
            {
            super(prlogaudition);
            setName("vdetalleantant");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setStates(SHOW);
            setPrintable(false);
            setModal(true);
            setUnique(true);
            // SET: VENTANA
            addControl(aprpackage=new CtrlAprpackage(this));
            addControl(aprinfo=new CtrlAprinfo(this));
            setSelect(sauditionantant);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public ProgPrlogaudition()
        {
        this.prlogaudition=this;
        setName("prlogaudition");
        setTitle("Log de uso");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vlog=new FormVlog(this));
        addForm(vdetalle=new FormVdetalle(this));
        addForm(vlogant=new FormVlogant(this));
        addForm(vlogantant=new FormVlogantant(this));
        addForm(vdetalleant=new FormVdetalleant(this));
        addForm(vdetalleantant=new FormVdetalleantant(this));
        }
    public ProgPrlogaudition(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        if (aplicatiu==null && "easp".equals(Aplication.getAplication().getName()) )
           totesAplicacions = true;
        if (totesAplicacions && aplicatiu != null) {
        	//Es dona prioritat al filtre
        	totesAplicacions = false;
        }
        
        if (!esSQL && totesAplicacions) {
        	Maefc.message ("Imposible consultar todos los aplicativos con ACCESS","¡Atención!",Maefc.WARNING_MESSAGE);
          	exit();
        }
        
        if (!esSQL && aplicatiu != null) {
        	aplicatiu = null;
        	Maefc.message ("Imposible consultar un aplicativo con ACCESS","¡Atención!",Maefc.WARNING_MESSAGE);
          	exit();
        }
        
        Selector sgrupos = new Selector(Easp.connEA);
        sgrupos.execute("Select * from usagrup where usagrupo = 'Administradores' and usalogin = '"+Aplication.getAplication().getUser()+"'");
        filtroUsuario = !sgrupos.next();
        sgrupos.close();
        saudition.setModifier("TOP 5000");
        sauditionant.setModifier("TOP 5000");
        sauditionantant.setModifier("TOP 5000");
        String where = "";
        if (filtroUsuario) {
        	where +=" aprusuario='"+Aplication.getAplication().getUser()+"' and aprnombrepc='"+nomPC+"' ";
        }
        if (esSQL) {
        	if (aplicatiu != null) {
        		where += ((!"".equals(where)) ? "and" : "") + " apraplication= '" + aplicatiu + "'";	
        	}
        	else if (!totesAplicacions) {
        		where += ((!"".equals(where)) ? "and" : "") + " apraplication= '" + Aplication.getAplication().getName() + "'";
        	}
        }
        
        setLayout(new LayoutTabbed());
        LocationTabbed loc;
        
        String query = "SELECT aprcodi FROM AUDITIONPR " + (!"".equals(where) ? "WHERE " + where : "");
        
        if (initConnection()) {
        	Selector sl = new Selector(connAudition);
        	sl.execute(query);
        	if (sl.next()) {
        		vlog.setModal(false);
        		loc=new LocationTabbed();
        		loc.setTitle("Log de uso " + (Maefc.getYear(Maefc.getDate())));
        		loc.setExitIcon(false);
        		vlog.setLocation(loc);
        		vlog.setInitState(DataForm.SHOW);
        	}	
        	sl.close();
        }
        
        if (loganterior && initConnectionAnt()) {
        	Selector sl = new Selector(connAnt);
        	sl.execute(query);
        	if (sl.next()) {
        		vlogant.setModal(false);
        		loc=new LocationTabbed();
        		loc.setTitle("Log de uso " + (Maefc.getYear(Maefc.getDate()) - 1));
        		loc.setExitIcon(false);
        		vlogant.setLocation(loc);
        		vlogant.setInitState(DataForm.SHOW);
        	}	
        	sl.close();
        }
        
        if (loganterioranterior && initConnectionAntAnt()) {
        	Selector sl = new Selector(connAntAnt);
        	sl.execute(query);
        	if (sl.next()) {
        			vlogantant.setModal(false);
        			loc=new LocationTabbed();
        			loc.setTitle("Log de uso " + (Maefc.getYear(Maefc.getDate()) - 2));
        			loc.setExitIcon(false);
        			vlogantant.setLocation(loc);
        			vlogantant.setInitState(DataForm.SHOW);
        	}	
        	sl.close();
        }
        
        if (vlog.isModal() && vlogant.isModal() && vlogantant.isModal()) {
        	Maefc.message("No hay datos para mostrar", "¡Atención!", Maefc.WARNING_MESSAGE);
        	exit();
        }	
        
        if (!"".equals(where)) {
        	saudition.setWhere(where);
        	sauditionant.setWhere(where);
        	sauditionantant.setWhere(where);
        }
        
        setConnection(connAudition);
        super.onInit();
        }
    public void onExit ()
        {
        if (connAnt != null) connAnt.disconnect();
        if (connAntAnt != null) connAntAnt.disconnect();
        super.onExit ();
        }
    }
    
