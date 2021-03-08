// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Mon Mar 08 11:04:15 CET 2021
// 
// Aplicaci�n: easp
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
// Versi�n:  1.0
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
private static final int USUARIO_AFINITY = 6;
private static final int PASSWD_AFINITY = 7;
private static final int PORTAL_AFINITY = 8;
private static String URL_AZURE = "agpi2dp.getpwdcdp";
private static String URL_GESDOC = "gesdoc.getcontenido";
private String xml = "";
private String gesdoc = "";
private Azure azure;
private XMLInputFactory factory;
private XMLStreamReader reader;
private java.util.HashMap<String, Client> clients = null;
private java.util.ArrayList<String> selectedRows = new java.util.ArrayList<String>();
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
					client.nif = reader.getText().toString();
				}
				else if (isValidTextNode("dominio", reader) && client != null) {
					client.dominio = reader.getText().toString();
				}
				else if (isValidTextNode("tieneportal", reader) && client != null) {
					if ("S".equals(reader.getText().toString()))
						client.tienePortal = true;
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
	for (int x = 0; x < vcdpafinity.getControlTable().getRowCount(); x++) {
		vcdpafinity.getControlTable().refreshValueAt(new Value(0), x, CHECK);
	}
	selectedRows.clear();
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

private void ordena(int col) {
	if (reOrdena) {
		boolean ordre = true;
		if (!"ASC".equals(torden[col])) {
			ordre = false;
			torden[col] = "ASC";
		}
		else {
			torden[col] = "DESC";
		}

		boolean ordenat = false;
		while (!ordenat) {
			ordenat = true;
			for (int x = 0; x < vcdpafinity.getControlTable().getRowCount() - 1; x++) {
				if (ordre && vcdpafinity.getControlTable().getValueAt(x, col).getString().toLowerCase().compareTo(vcdpafinity.getControlTable().getValueAt(x + 1, col).getString().toLowerCase()) > 0) {
					swapRows(x, x + 1);
					ordenat = false;
				}
				else if (!ordre && vcdpafinity.getControlTable().getValueAt(x, col).getString().toLowerCase().compareTo(vcdpafinity.getControlTable().getValueAt(x + 1, col).getString().toLowerCase()) < 0) {
					swapRows(x + 1, x);
					ordenat = false;
				}
			}
		}
	}
}

private void swapRows(int row, int row2) {
	Integer check = vcdpafinity.getControlTable().getValueAt(row, CHECK).getInteger();
	String cdp = vcdpafinity.getControlTable().getValueAt(row, CCDP).getString();
	String nif = vcdpafinity.getControlTable().getValueAt(row, NIF).getString();
	String nom = vcdpafinity.getControlTable().getValueAt(row, NOMBRE).getString();
	Integer altaa = vcdpafinity.getControlTable().getValueAt(row, ALTA_AFINITY).getInteger();
	String coda = vcdpafinity.getControlTable().getValueAt(row, CODIGO_AFINITY).getString();
	String usuari = vcdpafinity.getControlTable().getValueAt(row, USUARIO_AFINITY).getString();
	String pssw = vcdpafinity.getControlTable().getValueAt(row, PASSWD_AFINITY).getString();
	Integer portal = vcdpafinity.getControlTable().getValueAt(row, PORTAL_AFINITY).getInteger();
	
	vcdpafinity.getControlTable().refreshValueAt(new Value(vcdpafinity.getControlTable().getValueAt(row2, CHECK).getInteger()),row, CHECK);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(vcdpafinity.getControlTable().getValueAt(row2, CCDP).getString()),row, CCDP);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(vcdpafinity.getControlTable().getValueAt(row2, NIF).getString()),row, NIF);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(vcdpafinity.getControlTable().getValueAt(row2, NOMBRE).getString()),row, NOMBRE);
	vcdpafinity.getControlTable().refreshValueAt(new Value(vcdpafinity.getControlTable().getValueAt(row2, ALTA_AFINITY).getInteger()),row, ALTA_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(vcdpafinity.getControlTable().getValueAt(row2, CODIGO_AFINITY).getString()),row, CODIGO_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(vcdpafinity.getControlTable().getValueAt(row2, USUARIO_AFINITY).getString()),row, USUARIO_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(vcdpafinity.getControlTable().getValueAt(row2, PASSWD_AFINITY).getString()),row, PASSWD_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(new Value(vcdpafinity.getControlTable().getValueAt(row2, PORTAL_AFINITY).getInteger()),row, PORTAL_AFINITY);
	
	vcdpafinity.getControlTable().refreshValueAt(new Value(check),row2, CHECK);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(cdp),row2, CCDP);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(nif),row2, NIF);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(nom),row2, NOMBRE);
	vcdpafinity.getControlTable().refreshValueAt(new Value(altaa),row2, ALTA_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(coda),row2, CODIGO_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(usuari),row2, USUARIO_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(Value.createValue(pssw),row2, PASSWD_AFINITY);
	vcdpafinity.getControlTable().refreshValueAt(new Value(portal),row2, PORTAL_AFINITY);
}

private class Client {
	public String nif = null;
	public String dominio = "";
	public String usuario = "";
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
eliminarMarcados(ALTA_AFINITY);
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
eliminarNoMarcados(ALTA_AFINITY);
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
        public void onColumnClick(int ncol) {
  Maefc.waitCursor();
  super.onColumnClick(ncol);
  reOrdena = true;
  order = ncol;
  if (order == CCDP || order == NIF) {
  	doShow();
  }
  else if (order == NOMBRE) {
  	ordena(NOMBRE);
  }
  Maefc.restoreCursor();
}
        // Metodos
        // Controles
        public CtrlVvcheck vvcheck;
        public CtrlCdpcodi cdpcodi;
        public CtrlCdpnifcif cdpnifcif;
        public CtrlDatnombre datnombre;
        public CtrlVvaltafinity vvaltafinity;
        public CtrlVvcodafinity vvcodafinity;
        public CtrlVvusuario vvusuario;
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
                setTitle("Alta en Afinity");
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
                setTitle("C�digo de Afinity");
                setType(STRING);
                setLength(15);
                setSearchable(true);
                // SET: CONTROLEDIT
                getWebProperties().setAnchoColumnas (12);
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvusuario extends ColumnEdit
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
                
            public CtrlVvusuario(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvusuario");
                setTitle("Usuario");
                setType(STRING);
                setLength(50);
                setSearchable(true);
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
                setSearchable(true);
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
                setTitle("Portal CDP");
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
                super.onAction ();
                
if (selectedRows.size() == 0) {
	Maefc.message("No hay ning�n registro seleccionado" ,"Atenci�n",Maefc.INFORMATION_MESSAGE);
	return;
}else {
	boolean graba = false;
	java.util.ArrayList<String> nifExistents = new java.util.ArrayList<String>();
	for (String cdp : selectedRows) {
		int row = getRow(cdp);
		if (row != -1) {
		String nif = vcdpafinity.getControlTable().getValueAt(row, NIF).getString();
		if (Easp.buscaCDP(nif) == null) {
			graba = true;
			Easp.grabarDatosAfinity(nif,true);
		}
		else {
			nifExistents.add(nif);
		}
	  }
	}
	if (nifExistents.size() > 0) {
		Maefc.message("Los clientes " + nifExistents + " ya estan dados de alta en Afinity", "Atenci�n", Maefc.INFORMATION_MESSAGE);		
	}
	netejaChecks();
}
                }
            }
            
        public class LinkAgesdoc extends Action
            {
            public LinkAgesdoc(Form form)
                {
                super(form);
                setName("agesdoc");
                setTitle("&2. GESDOC");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                
int selectedRow = vcdpafinity.getControlTable().getSelectedRow();
String cdp = vcdpafinity.getControlTable().getValueAt(selectedRow, CODIGO_AFINITY).getString();
azure = new Azure(URL_GESDOC);
azure.addParametroURL("cdp", cdp);

if (azure.procesar()) {
	gesdoc = azure.getContenido();
	if (!"".equals(gesdoc)) {
		mae.easp.progesdoc.ProgProgesdoc proggesdoc = new mae.easp.progesdoc.ProgProgesdoc(easp);
		proggesdoc.cdp = cdp;
		proggesdoc.xml = gesdoc;
		proggesdoc.run();
     }	
}
else {
	Maefc.message("No se ha podido conectar con Afinity", "�Atenci�n!", Maefc.WARNING_MESSAGE);
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
            addControl(vvusuario=new CtrlVvusuario(this));
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
            
if (vvcheck.getInteger() != 1) {
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
            
datnombre.setValue(datnombre.getString() + " " + scdp.datapell1.getString() + " " + scdp.datapell2.getString());

if ((clients != null && clients.size() > 0) && clients.containsKey(cdpnifcif.getString())) {
	Client client = clients.get(cdpnifcif.getString());
	vvaltafinity.setValue(1);
	vvcodafinity.setValue(client.dominio.toString());
	vvusuario.setValue(client.usuario.toString());
	vvpasswd.setValue(client.passwd.toString());
	vvportalcdp.setValue((client.tienePortal) ? 1 : 0);		
}

if (selectedRows.contains(cdpcodi.getString())) {
	vvcheck.setValue(1);
}

            }
        public void onFocusRecord ()
            {
            super.onFocusRecord ();
            
if (vvportalcdp.getInteger() == 1) {
	agesdoc.setEnabled(true);
}
else {
	agesdoc.setEnabled(false);	
}
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
            setFrom ("cdp inner join nifes on cdp.cdpnifcif = nifes.danifcif WHERE cdp.cdpcodi LIKE '" + Easp.dominio.substring(0,6) + "%'");
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
        public String getOrder ()
            {
            if (reOrdena) {
            	if (ultimoOrdenado != order) {
            		torden[order] = "ASC";
            	}
            	else 
            {
            		if ("DESC".equals(torden[order])) torden[order] = "ASC";
            		else torden[order] = "DESC";
            	}
            	reOrdena = false;
            
            ultimoOrdenado = order;
            
            switch (order){
             case 1: return "cdp.cdpcodi "+torden[order]+", cdp.cdpnifcif";
             case 2: return "cdp.cdpnifcif "+torden[order]+",cdp.cdpcodi";
             default: return "cdp.cdpcodi "+torden[order]+",cdp.cdpnifcif "+torden[order]+"";
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
        super.onInit ();
        
azure = new Azure(URL_AZURE);

if (azure.procesar()) {
	xml = azure.getContenido();
	if (!"".equals(xml)) {
	clients = getClients(xml);	
     }	
}
else {
	Maefc.message("No se ha podido conectar con Afinity", "�Atenci�n!", Maefc.WARNING_MESSAGE);
}
        }
    }
    