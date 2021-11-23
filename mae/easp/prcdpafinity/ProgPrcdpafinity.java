// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Tue Nov 23 12:59:58 CET 2021
// 
// Aplicación: easp
// 
package mae.easp.prcdpafinity;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import javax.xml.stream.*;
import mae.easp.*;
// 
// Programa: prcdpafinity
// Nombre:   Clientes Afinity
// Versión:  1.0
// 
public class ProgPrcdpafinity extends Program
    {
    public AppEasp easp;
    public ProgPrcdpafinity prcdpafinity;
    // GLOBALES: PROGRAMA
    private static final int CHECK = 0;
private static final int CCDP = 1;
private static final int NIF = 2;
private static final int NOMBRE = 3;
private static final int ALTA_AFINITY = 4;
private static final int CODIGO_AFINITY = 5;
private static final int MAIL_AFINITY = 6;
private static final int PASSWD_AFINITY = 7;
private static final int PORTAL_AFINITY = 8;
private static String URL_AZURE = "agpi2dp.getpwdcdp";
private static String URL_GESDOC = "gesdoc.getcontenido";
private String xml = "";
private Azure azure;
private XMLInputFactory factory;
private XMLStreamReader reader;
private java.util.HashMap<String, Client> clients = null;
private java.util.ArrayList<String> selectedRows = new java.util.ArrayList<String>();
private java.util.ArrayList<String> filtre = new java.util.ArrayList<String>();
private int order = -1;
private int ultimoOrdenado = -1;
private String[] torden;
private boolean reOrdena = false;

private void eliminarNoMarcados(int columna) {
	int rowS = vcdpafinity.getControlTable().getSelectedRow();
	while (!checkNoMarcados(columna)) {
		for (int x = 0; x < vcdpafinity.getControlTable().getRowCount(); x++) {
			if (vcdpafinity.getControlTable().getValueAt(x, columna).getInteger() != 1) {
				vcdpafinity.getControlTable().removeRow(x);
			}
		}
	}

	vcdpafinity.getControlTable().refreshTable();
	vcdpafinity.getControlTable().setSelectedRow(rowS);
}

private boolean checkNoMarcados(int columna) {
	int x = 0;
	boolean check = true;
	if (vcdpafinity.getControlTable().getRowCount() > 0) {
		do {
			if (vcdpafinity.getControlTable().getValueAt(x, columna).getInteger() != 1) {
				check = false;
			}
			x++;
		} while (check && x < vcdpafinity.getControlTable().getRowCount());
	}
	return check;
}

private void eliminarMarcados(int columna) {
	int rowS = vcdpafinity.getControlTable().getSelectedRow();
	while (!checkMarcados(columna)) {
		for (int x = 0; x < vcdpafinity.getControlTable().getRowCount(); x++) {
			if (vcdpafinity.getControlTable().getValueAt(x, columna).getInteger() == 1) {
				vcdpafinity.getControlTable().removeRow(x);
			}
		}
	}

	vcdpafinity.getControlTable().refreshTable();
	vcdpafinity.getControlTable().setSelectedRow(rowS);
}

private boolean checkMarcados(int columna) {
	int x = 0;
	boolean check = true;
	if (vcdpafinity.getControlTable().getRowCount() > 0) {
		do {
			if (vcdpafinity.getControlTable().getValueAt(x, columna).getInteger() == 1) {
				check = false;
			}
			x++;
		} while (check && x < vcdpafinity.getControlTable().getRowCount());
	}
	return check;
}

private java.util.HashMap<String, Client> getClients(String xml) {
	factory = XMLInputFactory.newInstance();
	java.util.HashMap<String, Client> clients = new java.util.HashMap<String, Client>();
	Client client = null;
	
	try {
		
		reader = factory.createXMLStreamReader(new java.io.StringReader(xml));
		
		while (reader.hasNext()) {
			
			int event = reader.next();
			
			if (event == XMLStreamReader.START_ELEMENT) {
				
				if ("cliente".equals(reader.getName().toString())) {
					client = new Client();
				}
				else if (isValidTextNode("nif", reader) && client != null) {
					String nif = reader.getText().toString();
					if (nif!=null) nif = nif.toUpperCase();
					client.nif = nif;
				}
				else if (isValidTextNode("dominio", reader) && client != null) {
					client.dominio = reader.getText().toString();
				}
				else if (isValidTextNode("tieneportal", reader) && client != null) {
					if ("S".equals(reader.getText().toString()))
						client.tienePortal = true;
				}
				else if (isValidTextNode("email", reader) && client != null) {
					client.mail = reader.getText().toString();
				}
				else if (isValidTextNode("usuario", reader) && client != null) {
					client.usuario = reader.getText().toString();
				}				
				else if (isValidTextNode("passwd", reader) && client != null) {
					client.passwd = reader.getText().toString();
				}
			}
			else if (event == XMLStreamReader.END_ELEMENT) {
				if ("cliente".equals(reader.getName().toString()) && client != null) {
					if (client.nif != null)
						clients.put(client.nif.toString(), client);					
					client = null;
				}
			}
		}
		
		reader.close();
	} catch (XMLStreamException e) {
		e.printStackTrace();
	}
	
	return clients;
}

private boolean isValidTextNode(String node, XMLStreamReader reader) throws XMLStreamException {
	if (node.equals(reader.getName().toString()) && reader.next() == XMLStreamReader.CHARACTERS)
		return true;
	else 
		return false;
}

private void netejaChecks() {
	int rowS = vcdpafinity.getControlTable().getSelectedRow();
	for (int x = 0; x < vcdpafinity.getControlTable().getRowCount(); x++) {
		vcdpafinity.getControlTable().refreshValueAt(new Value(0), x, CHECK);
	}
	selectedRows.clear();
	vcdpafinity.getControlTable().refreshTable();
	vcdpafinity.getControlTable().setSelectedRow(rowS);
}

private void ompleChecks() {
	int rowS = vcdpafinity.getControlTable().getSelectedRow();
	selectedRows.clear();
	for (int x = 0; x < vcdpafinity.getControlTable().getRowCount(); x++) {
		if (vcdpafinity.getControlTable().getValueAt(x, ALTA_AFINITY).getInteger() != 1) {
			vcdpafinity.getControlTable().setSelectedRow(x);
			vcdpafinity.vvcheck.setValue(1);
			selectedRows.add(vcdpafinity.cdpcodi.getString());
		}		
	}
	vcdpafinity.getControlTable().refreshTable();
	vcdpafinity.getControlTable().setSelectedRow(rowS);
}

private int getRow(String cdp) {
	int row = -1;
	for (int x = 0; x < vcdpafinity.getControlTable().getRowCount(); x++) {
		if (cdp.equals(vcdpafinity.getControlTable().getValueAt(x, CCDP).getString())) {
			row = x;
			break;
		}
	}
	return row;
}

 public void initActionSelectAll() {
     if (vcdpafinity.iaselall == null) {
		vcdpafinity.iaselall = new IconAction(vcdpafinity, "Selec. todos", "Selec. todos", null, "Selec. todos") {
			public void onAction() {
				ompleChecks();
			}
		};
     }
}

public void initActionDesSelectAll() {
     if (vcdpafinity.iadesall == null) {
		vcdpafinity.iadesall = new IconAction(vcdpafinity, "Desec. todos", "Desc. todos", null, "Desc. todos") {
			public void onAction() {
				netejaChecks();
			}
		};
     }
}

public void create() {
	super.create();
	initActionSelectAll();
	initActionDesSelectAll();
	vcdpafinity.iaselall.create();
	vcdpafinity.iadesall.create();
}

private void cargarClients() {
	ProgressBarForm pbf = new ProgressBarForm(this, "Consultando clientes...") {
			
	@Override
	public void job() {
		setPercent(0);
		azure = new Azure(URL_AZURE);
		if (azure.procesar()) {
			setPercent(40);
			xml = azure.getContenido();
			setPercent(60);
			if (!"".equals(xml)) {
				clients = getClients(xml);	
				setPercent(80);
				exit();
		    }	
			else {
				Maefc.message("No se ha podido conectar con Afinity", "¡Atención!", Maefc.WARNING_MESSAGE);
				exit();
			}
		}
		else {
			Maefc.message("No se ha podido conectar con Afinity", "¡Atención!", Maefc.WARNING_MESSAGE);
			exit();
		}
	}
};

pbf.setFormWidth(600);
pbf.setEnabledCancel(false);
pbf.setSecondaryAuto(false);
pbf.launch();

}

private class Client {
	public String nif = null;
	public String dominio = "";
	public String usuario = "";
	public String mail = "";
	public String passwd = "";
	public boolean tienePortal = false;
}
    // Metodos
    // Ventana
    public FormVcdpafaccion vcdpafaccion;
    // Selects
    // Ventana
    public FormVcdpafinity vcdpafinity;
    // Selects
    public Scdp scdp;
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Clientes Afinity");
            }
        }
        
    public class FormVcdpafaccion extends ProcessForm
        {
        // GLOBALES: VENTANA
        private void afegirFiltre(boolean altaAfinity) {
	int alta = (altaAfinity) ? 1 : 0;
	for (int x = 0; x < vcdpafinity.getControlTable().getRowCount(); x++) {
		if (vcdpafinity.getControlTable().getValueAt(x, ALTA_AFINITY).getInteger() == alta) {
			filtre.add(vcdpafinity.getControlTable().getValueAt(x, CCDP).getString());
		}
	}
}
        // Metodos
        // Controles
        // Acciones
        public LinkAvertodos avertodos;
        public LinkAverpdtsa averpdtsa;
        public LinkAvdadoa avdadoa;
        // Fieldsets
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                setLocation(TOP);
                }
            }
            
        public class LinkAvertodos extends Action
            {
            public LinkAvertodos(Form form)
                {
                super(form);
                setName("avertodos");
                setTitle("&1. Ver todos");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                vcdpafinity.doShow();
                }
            }
            
        public class LinkAverpdtsa extends Action
            {
            public LinkAverpdtsa(Form form)
                {
                super(form);
                setName("averpdtsa");
                setTitle("&2. Ver pendientes de alta");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                vcdpafinity.doShow();
afegirFiltre(false);
vcdpafinity.doShow();
filtre.clear();
                }
            }
            
        public class LinkAvdadoa extends Action
            {
            public LinkAvdadoa(Form form)
                {
                super(form);
                setName("avdadoa");
                setTitle("&3. Ver dados de alta");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                vcdpafinity.doShow();
afegirFiltre(true);
vcdpafinity.doShow();
filtre.clear();
                }
            }
            
        public FormVcdpafaccion(ProgPrcdpafinity prcdpafinity)
            {
            super(prcdpafinity);
            setName("vcdpafaccion");
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addAction(avertodos=new LinkAvertodos(this));
            addAction(averpdtsa=new LinkAverpdtsa(this));
            addAction(avdadoa=new LinkAvdadoa(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVcdpafinity extends MultiDataForm
        {
        // GLOBALES: VENTANA
        IconAction iadesall;
IconAction iaselall;

public StringBuffer sb = null;

public void onColumnClick(int ncol) {
  Maefc.waitCursor();
  super.onColumnClick(ncol);
  reOrdena = true;
  order = ncol;
  if (order == CCDP || order == NIF || order == NOMBRE) {
  	doShow();
  }
  Maefc.restoreCursor();
}

private boolean generaReport(StringBuffer message, java.io.File file) {
	try (java.io.PrintWriter pw = new java.io.PrintWriter(file)) {
		pw.write(message.toString());
	} catch (java.io.FileNotFoundException e) {
		return false;
	}
	return true;
}
        // Metodos
        // Controles
        public CtrlVvcheck vvcheck;
        public CtrlCdpcodi cdpcodi;
        public CtrlCdpnifcif cdpnifcif;
        public CtrlDatnombre datnombre;
        public CtrlVvaltafinity vvaltafinity;
        public CtrlVvcodafinity vvcodafinity;
        public CtrlVvmail vvmail;
        public CtrlVvpasswd vvpasswd;
        public CtrlVvportalcdp vvportalcdp;
        // Acciones
        public LinkAaltafinity aaltafinity;
        public LinkAgesdoc agesdoc;
        // Fieldsets
        class Location extends LocationSplit
            {
            public Location( )
                {
                super();
                setLocation(BOTTOM);
                }
            }
            
        public class CtrlVvcheck extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlVvcheck(Form form)
                {
                super(form);
                setName("vvcheck");
                setTitle("");
                setType(INTEGER);
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlCdpcodi extends ColumnEdit
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
                
            public CtrlCdpcodi(Form form)
                {
                super(form);
                setLook(new Look());
                setName("cdpcodi");
                setTitle("CDP");
                setType(STRING);
                setLength(12);
                setSearchable(true);
                setField(scdp.cdpcodi);
                // SET: CONTROLEDIT
                getWebProperties().setAnchoColumnas (12);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlCdpnifcif extends ColumnEdit
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
                
            public CtrlCdpnifcif(Form form)
                {
                super(form);
                setLook(new Look());
                setName("cdpnifcif");
                setTitle("NIF");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                setField(scdp.cdpnifcif);
                // SET: CONTROLEDIT
                getWebProperties().setAnchoColumnas (10);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlDatnombre extends ColumnEdit
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
                
            public CtrlDatnombre(Form form)
                {
                super(form);
                setLook(new Look());
                setName("datnombre");
                setTitle("Nombre");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setField(scdp.datnombre);
                // SET: CONTROLEDIT
                getWebProperties().setAnchoColumnas (50);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvaltafinity extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlVvaltafinity(Form form)
                {
                super(form);
                setName("vvaltafinity");
                setMessageHelp("Esta dado de alta en afinityweb");
                setTitle("");
                setType(INTEGER);
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlVvcodafinity extends ColumnEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(15);
                    }
                }
                
            public CtrlVvcodafinity(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvcodafinity");
                setTitle("Código de Afinity");
                setType(STRING);
                setLength(15);
                // SET: CONTROLEDIT
                getWebProperties().setAnchoColumnas (12);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvmail extends ColumnEdit
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
                
            public CtrlVvmail(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvmail");
                setTitle("EMail");
                setType(STRING);
                setLength(50);
                // SET: CONTROLEDIT
                getWebProperties().setAnchoColumnas (25);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvpasswd extends ColumnEdit
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
                
            public CtrlVvpasswd(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvpasswd");
                setTitle("Password");
                setType(STRING);
                setLength(25);
                // SET: CONTROLEDIT
                getWebProperties().setAnchoColumnas (15);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvportalcdp extends ColumnCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlVvportalcdp(Form form)
                {
                super(form);
                setName("vvportalcdp");
                setMessageHelp("Tiene Portal CDP");
                setTitle("Portal");
                setType(INTEGER);
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class LinkAaltafinity extends Action
            {
            public LinkAaltafinity(Form form)
                {
                super(form);
                setName("aaltafinity");
                setTitle("&1. Alta en Afinity Web");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction();
                
                if (selectedRows.size() == 0) {
                	Maefc.message("No hay ningún registro seleccionado", "Atención", Maefc.INFORMATION_MESSAGE);
                	return;
                } else {
                	String msg = "Este proceso dará de alta en AfinityWeb los clientes seleccionados.\nAl finalizar el proceso se abrirá una relación de clientes con el dominio-contraseña asignados.\n\nParalelamente tiene la opción de notificar automáicamente por email los datos de acceso.";
                	String[] opcions = { "Continuar y notificar por eMail", "Continuar y NO notificar", "Cancelar" };
                	int resp = Maefc.messageConNuevosBotones(msg, "Alta en AfinityWeb", Maefc.QUESTION_MESSAGE, opcions);
                	if (resp == 1 || resp == 2) {
                		final boolean conMail = (resp == 1);
                		ProgressBarForm pbf = new ProgressBarForm(getProgram(), "Dando de alta en Afinity...") {
                
                			@Override
                			public void job() {
                				setPercent(0);
                				int x = 0;
                				sb = new StringBuffer("Reporte Alta Afinity\n\n");
                				java.util.ArrayList<String> nifExistents = new java.util.ArrayList<String>();
                				for (String cdp : selectedRows) {
                					setPercent((x++ / selectedRows.size()) * 100);
                					int row = getRow(cdp);
                					if (row != -1) {
                						String nif = vcdpafinity.getControlTable().getValueAt(row, NIF).getString();
                						String nom = vcdpafinity.getControlTable().getValueAt(row, NOMBRE).getString();
                						String codAf = Easp.buscaCDP(nif);
                						if (codAf == null) {
                							Easp.grabarDatosAfinity(nif, false, conMail);
                							if (Easp.mensajeSesion != null)
                								sb.append("Cliente " + nif + "-" + nom + ": " + Easp.mensajeSesion + "\n");
                						} else
                							nifExistents.add(nif + "-" + nom + " (" + codAf + ")");
                					}
                				}
                				if (nifExistents.size() > 0) {
                					for (String s : nifExistents)
                						sb.append("Cliente " + s + " ya esta dado de alta en Afinity\n");
                				}
                				exit();
                			}
                		};
                
                		pbf.setFormWidth(600);
                		pbf.setEnabledCancel(false);
                		pbf.setSecondaryAuto(false);
                		pbf.launch();
                
                		netejaChecks();
                		cargarClients();
                		doShow();
                		if (sb != null) {
                			java.io.File report;
                			try {
                				report = java.io.File.createTempFile("ReportAfinity", ".txt");
                				if (generaReport(sb, report)) {
                					Maefc.message("Se ha generado un reporte del proceso de alta afinity", "Información", Maefc.INFORMATION_MESSAGE);
                					java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                					desktop.open(report);
                				}
                			} catch (java.io.IOException e) {
                				e.printStackTrace();
                			}
                			sb = null;
                		}
                	}
                }
                }
            }
            
        public class LinkAgesdoc extends Action
            {
            public LinkAgesdoc(Form form)
                {
                super(form);
                setName("agesdoc");
                setTitle("&2. Gestión Documental");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                
int selectedRow = vcdpafinity.getControlTable().getSelectedRow();
String cdp = vcdpafinity.getControlTable().getValueAt(selectedRow, CODIGO_AFINITY).getString();
String nombrecdp = vcdpafinity.getControlTable().getValueAt(selectedRow, NOMBRE).getString();
azure = new Azure(URL_GESDOC);
azure.addParametroURL("cdp", cdp);

if (azure.procesar()) {
	String gesdoc = azure.getContenido();
	if (!"".equals(gesdoc)) {
		mae.easp.progesdoc.ProgProgesdoc proggesdoc = new mae.easp.progesdoc.ProgProgesdoc(easp);
		proggesdoc.cdp = cdp;
		proggesdoc.xml = gesdoc;
		proggesdoc.nombrecdp = nombrecdp;
		proggesdoc.run();
     }	
}
else {
	Maefc.message("No se ha podido conectar con Afinity", "¡Atención!", Maefc.WARNING_MESSAGE);
	return;
}

                }
            }
            
        public FormVcdpafinity(ProgPrcdpafinity prcdpafinity)
            {
            super(prcdpafinity);
            setName("vcdpafinity");
            setTitle("Clientes Afinity");
            setLocation(new Location());
            setStates(SHOW | SEARCH);
            // SET: VENTANA
            addSelect(scdp=new Scdp());
            addControl(vvcheck=new CtrlVvcheck(this));
            addControl(cdpcodi=new CtrlCdpcodi(this));
            addControl(cdpnifcif=new CtrlCdpnifcif(this));
            addControl(datnombre=new CtrlDatnombre(this));
            addControl(vvaltafinity=new CtrlVvaltafinity(this));
            addControl(vvcodafinity=new CtrlVvcodafinity(this));
            addControl(vvmail=new CtrlVvmail(this));
            addControl(vvpasswd=new CtrlVvpasswd(this));
            addControl(vvportalcdp=new CtrlVvportalcdp(this));
            addAction(aaltafinity=new LinkAaltafinity(this));
            addAction(agesdoc=new LinkAgesdoc(this));
            setSelect(scdp);
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onSelection ()
            {
            super.onSelection ();
            
if (vvcheck.getInteger() != 1 && vvaltafinity.getInteger() != 1) {
	selectedRows.add(vcdpafinity.getControlTable().getValueAt(vcdpafinity.getControlTable().getSelectedRow(), CCDP).getString());
	vvcheck.setValue(1);
}
else {
	selectedRows.remove((vcdpafinity.getControlTable().getValueAt(vcdpafinity.getControlTable().getSelectedRow(), CCDP).getString()));
	vvcheck.setValue(0);
}
            }
        public void onInit ()
            {
            setInitState(DataForm.SHOW);
            torden = new String[4];
            for (int i=1;i<torden.length;i++) torden[i] = "DESC";
            super.onInit ();
            }
        public void onBeginRecord ()
            {
            super.onBeginRecord ();
            
datnombre.setValue(scdp.datapell1.getString() + " " + scdp.datapell2.getString() + " " + datnombre.getString());

if ((clients != null && clients.size() > 0) && cdpnifcif.getString()!=null && clients.containsKey(cdpnifcif.getString().toUpperCase())) {
	Client client = clients.get(cdpnifcif.getString().toUpperCase());
	vvaltafinity.setValue(1);
	vvcodafinity.setValue(client.dominio);
	vvmail.setValue(client.mail);
	vvpasswd.setValue(client.passwd);
	vvportalcdp.setValue((client.tienePortal) ? 1 : 0);		
}
vvcheck.setValue(selectedRows.contains(cdpcodi.getString()) ? 1 : 0);
agesdoc.setEnabled(vvportalcdp.getBoolean());

if (vvmail.getString().length() == 0) vvmail.setValue(scdp.datemail);
            }
        }
        
    // 
    public class Scdp extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        public Cdp cdp;
        public Nifes nifes;
        // Campos
        public Field cdpcodi;
        public Field danifcif;
        public Field cdpnifcif;
        public Field datipo;
        public Field cdppwd;
        public Field datnombre;
        public Field cdpaeatdele;
        public Field datapell1;
        public Field cdpaeatadm;
        public Field datapell2;
        public Field cdpagpi;
        public Field datsiglas;
        public Field cdppwdacc;
        public Field datvia;
        public Field cdpcknomina;
        public Field datnum;
        public Field cdpckconta;
        public Field datesc;
        public Field cdpckeo;
        public Field datpiso;
        public Field cdpckiss;
        public Field datletra;
        public Field cdpckgestion;
        public Field datpobla;
        public Field cdpckrenta;
        public Field datmuni;
        public Field cdpcdprel;
        public Field datprov;
        public Field cdpref;
        public Field datpais;
        public Field cdpbdcomunomina;
        public Field datcpos;
        public Field cdpbdcomuconta;
        public Field dattel;
        public Field cdpbdcomueo;
        public Field datfax;
        public Field cdpbdcomuiss;
        public Field datfisicajuri;
        public Field cdpbdcomurenta;
        public Field datemail;
        public Field cdpbdestanomina;
        public Field datcontacto;
        public Field cdpbdestaconta;
        public Field datesiglas;
        public Field cdpbdestaeo;
        public Field datevia;
        public Field cdpbdestaiss;
        public Field datenum;
        public Field cdpbdestarenta;
        public Field dateesc;
        public Field cdpobserv;
        public Field datepiso;
        public Field cdpdominio;
        public Field dateletra;
        public Field cdpresponsable;
        public Field datepobla;
        public Field cdpsiifacil;
        public Field datemuni;
        public Field cdpomiterel;
        public Field dateprov;
        public Field datepais;
        public Field datecpos;
        public Field dateatt;
        public Field dataltaen;
        public Field datletraseti;
        public Field datipf;
        public Field datcbienes;
        public Field datdominio;
        public Field datnacional;
        public Field datfftvia;
        public Field datfvia;
        public Field datftnum;
        public Field datfnum;
        public Field datfcalnum;
        public Field datfbloque;
        public Field datfportal;
        public Field datfescal;
        public Field datfplanta;
        public Field datfpuerta;
        public Field datfcomp;
        public Field datflocal;
        public Field datfemail;
        public Field datfprov;
        public Field datfcodmun;
        public Field datfnommun;
        public Field datfcpost;
        public Field datftel;
        public Field datfmovil;
        public Field datffax;
        public Field datnftvia;
        public Field datnvia;
        public Field datntnum;
        public Field datnnum;
        public Field datncalnum;
        public Field datnbloque;
        public Field datnportal;
        public Field datnescal;
        public Field datnplanta;
        public Field datnpuerta;
        public Field datncomp;
        public Field datnlocal;
        public Field datnemail;
        public Field datnprov;
        public Field datncodmun;
        public Field datnnommun;
        public Field datncpost;
        public Field datntel;
        public Field datnmovil;
        public Field datnfax;
        public Field datnapcor;
        public Field datnpobla;
        public Field datnprov2;
        public Field datncpost2;
        public Field datntel2;
        public Field datnmovil2;
        public Field datnfax2;
        public Field datsftvia;
        public Field datsvia;
        public Field datstnum;
        public Field datsnum;
        public Field datscalnum;
        public Field datsbloque;
        public Field datsportal;
        public Field datsescal;
        public Field datsplanta;
        public Field datspuerta;
        public Field datscomp;
        public Field datslocal;
        public Field datsemail;
        public Field datsprov;
        public Field datscodmun;
        public Field datsnommun;
        public Field datscpost;
        public Field datstel;
        public Field datsmovil;
        public Field datsfax;
        public Field datmovil;
        public Field datuser;
        public Field datgrupo;
        public Field datnombreant;
        public Field datapell1ant;
        public Field datapell2ant;
        class Cdp extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Cdp(Select select)
                {
                super(select);
                setName("cdp");
                setOptions(READ | INSERT | DELETE | UPDATE);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        class Nifes extends Table
            {
            // GLOBALES: TABLA
            // Metodos
            public Nifes(Select select)
                {
                super(select);
                setName("nifes");
                setOptions(READ | INSERT | DELETE | UPDATE);
                setJoinType(Join.INNER);
                // SET: TABLA
                }
            // GET: TABLA
            // EVENT: TABLA
            }
            
        public Scdp()
            {
            setName("scdp");
            // SET: SELECT
            setFrom ("cdp inner join nifes on cdp.cdpnifcif = nifes.danifcif");
            addTable(cdp=new Cdp(this));
            addTable(nifes=new Nifes(this));
            addField(cdpcodi=new Field(this,cdp,"cdpcodi"));
            addField(danifcif=new Field(this,nifes,"danifcif"));
            addField(cdpnifcif=new Field(this,cdp,"cdpnifcif"));
            addField(datipo=new Field(this,nifes,"datipo"));
            addField(cdppwd=new Field(this,cdp,"cdppwd"));
            addField(datnombre=new Field(this,nifes,"datnombre"));
            addField(cdpaeatdele=new Field(this,cdp,"cdpaeatdele"));
            addField(datapell1=new Field(this,nifes,"datapell1"));
            addField(cdpaeatadm=new Field(this,cdp,"cdpaeatadm"));
            addField(datapell2=new Field(this,nifes,"datapell2"));
            addField(cdpagpi=new Field(this,cdp,"cdpagpi"));
            addField(datsiglas=new Field(this,nifes,"datsiglas"));
            addField(cdppwdacc=new Field(this,cdp,"cdppwdacc"));
            addField(datvia=new Field(this,nifes,"datvia"));
            addField(cdpcknomina=new Field(this,cdp,"cdpcknomina"));
            addField(datnum=new Field(this,nifes,"datnum"));
            addField(cdpckconta=new Field(this,cdp,"cdpckconta"));
            addField(datesc=new Field(this,nifes,"datesc"));
            addField(cdpckeo=new Field(this,cdp,"cdpckeo"));
            addField(datpiso=new Field(this,nifes,"datpiso"));
            addField(cdpckiss=new Field(this,cdp,"cdpckiss"));
            addField(datletra=new Field(this,nifes,"datletra"));
            addField(cdpckgestion=new Field(this,cdp,"cdpckgestion"));
            addField(datpobla=new Field(this,nifes,"datpobla"));
            addField(cdpckrenta=new Field(this,cdp,"cdpckrenta"));
            addField(datmuni=new Field(this,nifes,"datmuni"));
            addField(cdpcdprel=new Field(this,cdp,"cdpcdprel"));
            addField(datprov=new Field(this,nifes,"datprov"));
            addField(cdpref=new Field(this,cdp,"cdpref"));
            addField(datpais=new Field(this,nifes,"datpais"));
            addField(cdpbdcomunomina=new Field(this,cdp,"cdpbdcomunomina"));
            addField(datcpos=new Field(this,nifes,"datcpos"));
            addField(cdpbdcomuconta=new Field(this,cdp,"cdpbdcomuconta"));
            addField(dattel=new Field(this,nifes,"dattel"));
            addField(cdpbdcomueo=new Field(this,cdp,"cdpbdcomueo"));
            addField(datfax=new Field(this,nifes,"datfax"));
            addField(cdpbdcomuiss=new Field(this,cdp,"cdpbdcomuiss"));
            addField(datfisicajuri=new Field(this,nifes,"datfisicajuri"));
            addField(cdpbdcomurenta=new Field(this,cdp,"cdpbdcomurenta"));
            addField(datemail=new Field(this,nifes,"datemail"));
            addField(cdpbdestanomina=new Field(this,cdp,"cdpbdestanomina"));
            addField(datcontacto=new Field(this,nifes,"datcontacto"));
            addField(cdpbdestaconta=new Field(this,cdp,"cdpbdestaconta"));
            addField(datesiglas=new Field(this,nifes,"datesiglas"));
            addField(cdpbdestaeo=new Field(this,cdp,"cdpbdestaeo"));
            addField(datevia=new Field(this,nifes,"datevia"));
            addField(cdpbdestaiss=new Field(this,cdp,"cdpbdestaiss"));
            addField(datenum=new Field(this,nifes,"datenum"));
            addField(cdpbdestarenta=new Field(this,cdp,"cdpbdestarenta"));
            addField(dateesc=new Field(this,nifes,"dateesc"));
            addField(cdpobserv=new Field(this,cdp,"cdpobserv"));
            addField(datepiso=new Field(this,nifes,"datepiso"));
            addField(cdpdominio=new Field(this,cdp,"cdpdominio"));
            addField(dateletra=new Field(this,nifes,"dateletra"));
            addField(cdpresponsable=new Field(this,cdp,"cdpresponsable"));
            addField(datepobla=new Field(this,nifes,"datepobla"));
            addField(cdpsiifacil=new Field(this,cdp,"cdpsiifacil"));
            addField(datemuni=new Field(this,nifes,"datemuni"));
            addField(cdpomiterel=new Field(this,cdp,"cdpomiterel"));
            addField(dateprov=new Field(this,nifes,"dateprov"));
            addField(datepais=new Field(this,nifes,"datepais"));
            addField(datecpos=new Field(this,nifes,"datecpos"));
            addField(dateatt=new Field(this,nifes,"dateatt"));
            addField(dataltaen=new Field(this,nifes,"dataltaen"));
            addField(datletraseti=new Field(this,nifes,"datletraseti"));
            addField(datipf=new Field(this,nifes,"datipf"));
            addField(datcbienes=new Field(this,nifes,"datcbienes"));
            addField(datdominio=new Field(this,nifes,"datdominio"));
            addField(datnacional=new Field(this,nifes,"datnacional"));
            addField(datfftvia=new Field(this,nifes,"datfftvia"));
            addField(datfvia=new Field(this,nifes,"datfvia"));
            addField(datftnum=new Field(this,nifes,"datftnum"));
            addField(datfnum=new Field(this,nifes,"datfnum"));
            addField(datfcalnum=new Field(this,nifes,"datfcalnum"));
            addField(datfbloque=new Field(this,nifes,"datfbloque"));
            addField(datfportal=new Field(this,nifes,"datfportal"));
            addField(datfescal=new Field(this,nifes,"datfescal"));
            addField(datfplanta=new Field(this,nifes,"datfplanta"));
            addField(datfpuerta=new Field(this,nifes,"datfpuerta"));
            addField(datfcomp=new Field(this,nifes,"datfcomp"));
            addField(datflocal=new Field(this,nifes,"datflocal"));
            addField(datfemail=new Field(this,nifes,"datfemail"));
            addField(datfprov=new Field(this,nifes,"datfprov"));
            addField(datfcodmun=new Field(this,nifes,"datfcodmun"));
            addField(datfnommun=new Field(this,nifes,"datfnommun"));
            addField(datfcpost=new Field(this,nifes,"datfcpost"));
            addField(datftel=new Field(this,nifes,"datftel"));
            addField(datfmovil=new Field(this,nifes,"datfmovil"));
            addField(datffax=new Field(this,nifes,"datffax"));
            addField(datnftvia=new Field(this,nifes,"datnftvia"));
            addField(datnvia=new Field(this,nifes,"datnvia"));
            addField(datntnum=new Field(this,nifes,"datntnum"));
            addField(datnnum=new Field(this,nifes,"datnnum"));
            addField(datncalnum=new Field(this,nifes,"datncalnum"));
            addField(datnbloque=new Field(this,nifes,"datnbloque"));
            addField(datnportal=new Field(this,nifes,"datnportal"));
            addField(datnescal=new Field(this,nifes,"datnescal"));
            addField(datnplanta=new Field(this,nifes,"datnplanta"));
            addField(datnpuerta=new Field(this,nifes,"datnpuerta"));
            addField(datncomp=new Field(this,nifes,"datncomp"));
            addField(datnlocal=new Field(this,nifes,"datnlocal"));
            addField(datnemail=new Field(this,nifes,"datnemail"));
            addField(datnprov=new Field(this,nifes,"datnprov"));
            addField(datncodmun=new Field(this,nifes,"datncodmun"));
            addField(datnnommun=new Field(this,nifes,"datnnommun"));
            addField(datncpost=new Field(this,nifes,"datncpost"));
            addField(datntel=new Field(this,nifes,"datntel"));
            addField(datnmovil=new Field(this,nifes,"datnmovil"));
            addField(datnfax=new Field(this,nifes,"datnfax"));
            addField(datnapcor=new Field(this,nifes,"datnapcor"));
            addField(datnpobla=new Field(this,nifes,"datnpobla"));
            addField(datnprov2=new Field(this,nifes,"datnprov2"));
            addField(datncpost2=new Field(this,nifes,"datncpost2"));
            addField(datntel2=new Field(this,nifes,"datntel2"));
            addField(datnmovil2=new Field(this,nifes,"datnmovil2"));
            addField(datnfax2=new Field(this,nifes,"datnfax2"));
            addField(datsftvia=new Field(this,nifes,"datsftvia"));
            addField(datsvia=new Field(this,nifes,"datsvia"));
            addField(datstnum=new Field(this,nifes,"datstnum"));
            addField(datsnum=new Field(this,nifes,"datsnum"));
            addField(datscalnum=new Field(this,nifes,"datscalnum"));
            addField(datsbloque=new Field(this,nifes,"datsbloque"));
            addField(datsportal=new Field(this,nifes,"datsportal"));
            addField(datsescal=new Field(this,nifes,"datsescal"));
            addField(datsplanta=new Field(this,nifes,"datsplanta"));
            addField(datspuerta=new Field(this,nifes,"datspuerta"));
            addField(datscomp=new Field(this,nifes,"datscomp"));
            addField(datslocal=new Field(this,nifes,"datslocal"));
            addField(datsemail=new Field(this,nifes,"datsemail"));
            addField(datsprov=new Field(this,nifes,"datsprov"));
            addField(datscodmun=new Field(this,nifes,"datscodmun"));
            addField(datsnommun=new Field(this,nifes,"datsnommun"));
            addField(datscpost=new Field(this,nifes,"datscpost"));
            addField(datstel=new Field(this,nifes,"datstel"));
            addField(datsmovil=new Field(this,nifes,"datsmovil"));
            addField(datsfax=new Field(this,nifes,"datsfax"));
            addField(datmovil=new Field(this,nifes,"datmovil"));
            addField(datuser=new Field(this,nifes,"datuser"));
            addField(datgrupo=new Field(this,nifes,"datgrupo"));
            addField(datnombreant=new Field(this,nifes,"datnombreant"));
            addField(datapell1ant=new Field(this,nifes,"datapell1ant"));
            addField(datapell2ant=new Field(this,nifes,"datapell2ant"));
            }
        // GET: SELECT
        public String getWhere ()
            {
            String where = "cdp.cdpcodi LIKE '" + Easp.dominio.substring(0,6) + "%'";
            if (filtre.size() > 0) {
            	where += " AND cdp.cdpcodi IN(";
            	for (String codi : filtre) {
            		where += "'" + codi + "',";
            	}
            	return where.substring(0, where.length() - 1) + ")";
            }
            else {
            	return where;
            }
            }
        public String getOrder ()
            {
            if (reOrdena && order<=3) {
            	if (ultimoOrdenado != order) {
            		torden[order] = "ASC";
            	} else {
            		if ("DESC".equals(torden[order]))
            			torden[order] = "ASC";
            		else
            			torden[order] = "DESC";
            	}
            	reOrdena = false;
            
            	ultimoOrdenado = order;
            
            	switch (order) {
            	case 1:
            		return "cdp.cdpcodi " + torden[order] + ", cdp.cdpnifcif, nifes.datapell1, nifes.datapell2, nifes.datnombre";
            	case 2:
            		return "cdp.cdpnifcif " + torden[order] + ",cdp.cdpcodi, nifes.datapell1, nifes.datapell2, nifes.datnombre";
            	case 3:
            		return " nifes.datapell1 " + torden[order] + ", nifes.datapell2, nifes.datnombre, cdp.cdpcodi, cdp.cdpnifcif";
            	default:
            		return "cdp.cdpcodi " + torden[order] + ",cdp.cdpnifcif " + torden[order] + " , nifes.datapell1 " + torden[order] + ", nifes.datapell2 " + torden[order] + ", nifes.datnombre " + torden[order] + "";
            	}
            }
            return "cdp.cdpcodi";
            }
        // EVENT: SELECT
        }
        
    public ProgPrcdpafinity(AppEasp easp)
        {
        super(easp);
        this.easp=easp;
        this.prcdpafinity=this;
        setName("prcdpafinity");
        setTitle("Clientes Afinity");
        // SET: PROGRAMA
        setLayout(new LayoutSplit(LayoutSplit.VERTICAL,0.10));
        setLocation(new Location());
        addForm(vcdpafaccion=new FormVcdpafaccion(this));
        addForm(vcdpafinity=new FormVcdpafinity(this));
        }
    public ProgPrcdpafinity()
        {
        this((AppEasp) Aplication.getAplication());
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        if (!Aplication.getAplication().getUser().toUpperCase().equals("ADMIN")) {
  Maefc.message("Sólo se permite la entrada al administrador","Aviso",Maefc.WARNING_MESSAGE);
  exit();
  }
else {
	super.onInit ();
        	cargarClients();
}
        }
    }
    
