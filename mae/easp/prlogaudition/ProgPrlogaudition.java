// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Wed Mar 13 15:22:28 CET 2019
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
private boolean filtroUsuario = false;
private String nomPC = Easp.getNomPC();


private boolean initConnection() {
     DBConnection connAudition = null;
	if (Aplication.getAplication().getAudition() instanceof DefaultAuditionProgram) {
		DefaultAuditionProgram dap = (DefaultAuditionProgram) Aplication.getAplication().getAudition();
		connAudition = dap.getConexion();
		setConnection(connAudition);
	}
	return connAudition != null;
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
        public void onColumnClick( int row) {
  Maefc.waitCursor();
  super.onColumnClick(row);
  ordenacion = row;
  doShow();
  Maefc.restoreCursor();

}
        // Metodos
        // Controles
        public CtrlAprfecha aprfecha;
        public CtrlAprtime aprtime;
        public CtrlAprnombrepc aprnombrepc;
        public CtrlAprusuario aprusuario;
        public CtrlApraccion apraccion;
        public CtrlAprtipo aprtipo;
        public CtrlAprprogram aprprogram;
        public CtrlAprventana aprventana;
        public CtrlAprdesc aprdesc;
        public CtrlAprinfo aprinfo;
        // Acciones
        public LinkAdetalle adetalle;
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
            public CtrlAprnombrepc(Form form)
                {
                super(form);
                setName("aprnombrepc");
                setTitle("Nombre PC");
                setType(STRING);
                setLength(50);
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
            // SET: VENTANA
            addSelect(saudition=new Saudition());
            addControl(aprfecha=new CtrlAprfecha(this));
            addControl(aprtime=new CtrlAprtime(this));
            addControl(aprnombrepc=new CtrlAprnombrepc(this));
            addControl(aprusuario=new CtrlAprusuario(this));
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
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            super.onInit();
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
        public String getWhere ()
            {
            String where = "apraplication='"+Aplication.getAplication().getName()+"'"; 
if (filtroUsuario) where += " and aprusuario='"+Aplication.getAplication().getUser()+"' and aprnombrepc='"+nomPC+"'";
            return where;
            }
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
            setSelect(saudition);
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
        Selector sgrupos = new Selector(Easp.connEA);
        sgrupos.execute("Select * from usagrup where usagrupo = 'Administradores' and usalogin = '"+Aplication.getAplication().getUser()+"'");
        filtroUsuario = !sgrupos.next();
        sgrupos.close();
        saudition.setModifier("TOP 5000");
        if (initConnection ()) super.onInit();
        else {
          Maefc.message ("Imposible conectar con el LOG de Auditoria","¡Atención!",Maefc.WARNING_MESSAGE);
          exit();
        }
        }
    }
    
