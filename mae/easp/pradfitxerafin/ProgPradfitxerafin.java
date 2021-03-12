// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Fri Mar 12 13:04:17 CET 2021
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
import java.util.ArrayList;
import javax.xml.stream.*;
import javax.json.*;
import mae.easp.progesdoc.DirectoryElement;
import javax.swing.tree.DefaultMutableTreeNode;
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
    private static final String INFO_CDP_URL = "gesdoc.getinfocdp";
private static final String UPLOAD_FILE_URL = "gesdoc.uploadfile";
private Azure azure = null;
private XMLInputFactory factory;
private XMLStreamReader reader;
private ArrayList<DirectoryElement> directoris = null;
private ArrayList<Element> etiquetas = null;
private java.util.Map<String,String> novaetiqueta = new java.util.HashMap<String,String>();
  
public String cdp = null;
public String xml = null;

private boolean uploadFile() {
	azure = new Azure(UPLOAD_FILE_URL, null, new java.io.File(vadfitxerafin.vvfichero.getString()));
	azure.addParametroURL("cdp",cdp);
	if (vdirectoriorem.elementSelected != null) {	
		azure.addParametroURL("iddir",vdirectoriorem.elementSelected.id);
	}
	if (novaetiqueta.size() > 0) {
		azure.addParametroURL("etiqueta", creaJson(novaetiqueta).toString());
	}
	return azure.procesar();
}

private JsonObject creaJson(java.util.Map<String, String> mapa) {
	JsonObjectBuilder builder = Json.createObjectBuilder();
	for (java.util.Map.Entry<String, String> eti : mapa.entrySet()) {
		builder.add(eti.getKey(), eti.getValue());
	}
	return builder.build();
}

private EtiquetaElement buscaEtiqueta(String nom) {
	int x = 0;
	EtiquetaElement element = null;
	do {
		if (etiquetas.get(x) instanceof FamiliaElement) {
		element = ((FamiliaElement) etiquetas.get(x)).buscaEtiqueta(nom);
		}
		x++;
	} while (element == null && x < etiquetas.size());
	return element;
}

private Element getElement(Element parentElement, XMLStreamReader reader) throws XMLStreamException {
	Element element = null;

	while (reader.hasNext()) {
			
		int event = reader.next();
		
		if (event == XMLStreamReader.START_ELEMENT) {

			if (isValidTextNode("nombre", reader)) {
				parentElement.setNombre(reader.getText().toString());
			}
			else if (isValidTextNode("desc", reader)) {
				parentElement.setDesc(reader.getText().toString());
			}
			else if ("etiqueta".equals(reader.getName().toString()) && parentElement instanceof FamiliaElement) {
				element = new EtiquetaElement();
				element = getAttributes(element, reader);
				element = getElement(element, reader);
				((FamiliaElement) parentElement).addElement(element);
				element = null;
			}		
		}
		else if (event == XMLStreamReader.END_ELEMENT) { 
			if ("familia".equals(reader.getName().toString())) {
				return parentElement;
			}
			else if ("etiqueta".equals(reader.getName().toString())) {
				return parentElement;
			}
		}
	}
	return parentElement;
}

private ArrayList<Element> getEtiquetas(String xml) {
	ArrayList<Element> etiquetas = new ArrayList<Element>();
	factory = XMLInputFactory.newInstance();
	Element element = null;
	
	try {
		
		reader = factory.createXMLStreamReader(new java.io.StringReader(xml));
		
		while (reader.hasNext()) {
			
			int event = reader.next();
			
			if (event == XMLStreamReader.START_ELEMENT) {
			     if ("familia".equals(reader.getName().toString())) {
					element = new FamiliaElement();
					element = getAttributes(element, reader);
					element = getElement(element, reader);
					etiquetas.add(element);
					element = null;
				}
				else if ("etiqueta".equals(reader.getName().toString())) {
					element = new EtiquetaElement();
					element = getAttributes(element, reader);
					element = getElement(element, reader);
					etiquetas.add(element);
					element = null;
				}
			}
		}
		
		reader.close();
	} catch (XMLStreamException e) {
		e.printStackTrace();
	}
	
	return etiquetas;
}

private DirectoryElement getDirectori(DirectoryElement parentDirectory, XMLStreamReader reader) throws XMLStreamException {
	DirectoryElement directory = null;

	while (reader.hasNext()) {
			
		int event = reader.next();
		
		if (event == XMLStreamReader.START_ELEMENT) {

			if (isValidTextNode("nombre", reader)) {
				parentDirectory.setNom(reader.getText().toString());
			}
			else if (isValidTextNode("fechacrea", reader)) {
				parentDirectory.setFechaCrea(reader.getText().toString());
			}
			else if (isValidTextNode("usuario", reader)) {
				parentDirectory.setUsuari(reader.getText().toString());
			}
			else if ("directorio".equals(reader.getName().toString())) {
				directory = new DirectoryElement();
				directory = getAttributes(directory, reader);
				directory = getDirectori(directory, reader);
				parentDirectory.addElement(directory);
				directory = null;
			}		
		}
		else if (event == XMLStreamReader.END_ELEMENT) { 
			if ("directorio".equals(reader.getName().toString())) {
				return parentDirectory;
			}
		}
	}
	return parentDirectory;
}

private ArrayList<DirectoryElement> getDirectorios(String xml) {
	ArrayList<DirectoryElement> directorios = new ArrayList<DirectoryElement>();
	factory = XMLInputFactory.newInstance();
	DirectoryElement directori = null;
	try {
		
		reader = factory.createXMLStreamReader(new java.io.StringReader(xml));
		
		while (reader.hasNext()) {
			
			int event = reader.next();
			
			if (event == XMLStreamReader.START_ELEMENT) {
				if ("directorio".equals(reader.getName().toString())) {
					directori = new DirectoryElement();
					directori = getAttributes(directori, reader);
					directori = getDirectori(directori, reader);
					directorios.add(directori);
					directori = null;
				}
			}
		}
		
		reader.close();
	} catch (XMLStreamException e) {
		e.printStackTrace();
	}
	
	return directorios;
}

private DirectoryElement getAttributes(DirectoryElement element, XMLStreamReader reader) throws XMLStreamException {
	int x = 0;
	while ( x < reader.getAttributeCount()) {
		if ("id".equals(reader.getAttributeName(x).toString())) {
			element.setId(Integer.parseInt(reader.getAttributeValue(x).toString()));
		}
		x++;
	}
	return element;
}

private Element getAttributes(Element element, XMLStreamReader reader) throws XMLStreamException {
	int x = 0;
	while ( x < reader.getAttributeCount()) {
		if ("id".equals(reader.getAttributeName(x).toString())) {
			element.setId(Integer.parseInt(reader.getAttributeValue(x).toString()));
		}
		x++;
	}
	return element;
}

private boolean isValidTextNode(String node, XMLStreamReader reader) throws XMLStreamException {
	if (node.equals(reader.getName().toString()) && reader.next() == XMLStreamReader.CHARACTERS)
		return true;
	else 
		return false;
}
    // Metodos
    // Ventana
    public FormVadfitxerafin vadfitxerafin;
    // Selects
    // Ventana
    public FormVetiquetas vetiquetas;
    // Selects
    // Ventana
    public FormVdirectoriorem vdirectoriorem;
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
        public CtrlVvfichero vvfichero;
        public CtrlVvbrowse vvbrowse;
        public CtrlVvdirectorio vvdirectorio;
        public CtrlVvbrowsedir vvbrowsedir;
        public CtrlVvetiquetas vvetiquetas;
        // Acciones
        public LinkAafichero aafichero;
        public LinkAetiqueta aetiqueta;
        public LinkAeliminaret aeliminaret;
        // Fieldsets
        public FSetFs1 fs1;
        public FSetFs2 fs2;
        public FSetFs3 fs3;
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
            
        public class CtrlVvfichero extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvfichero(Form form)
                {
                super(form);
                setName("vvfichero");
                setTitle("Fichero a subir");
                setType(STRING);
                setProtect(true);
                setLength(60);
                setSearchable(true);
                setEnabled(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public boolean valid ()
                {
                if ("".equals(getString()))
                	return false;
                else {
                	java.io.File f = new java.io.File(getString());
                	if (f.exists())
                		return true;
                	else 
                		return false;
                }
                }
            }
            
        public class CtrlVvbrowse extends ControlButton
            {
            // GLOBALES: BOTON
            // Metodos
            public CtrlVvbrowse(Form form)
                {
                super(form);
                setName("vvbrowse");
                setTitle("Examinar");
                setTitle("Examinar");
                // SET: BOTON
                }
            // EVENT: BOTON
            public void onClick ()
                {
                super.onClick ();
                
javax.swing.JFileChooser chooser = new javax.swing.JFileChooser(System.getProperty("user.home"));
chooser.setDialogTitle("Seleccionar el fichero a subir a Afinity");
if (chooser.showOpenDialog(null) == javax.swing.JFileChooser.APPROVE_OPTION) {
	vvfichero.setValue(chooser.getSelectedFile().getAbsolutePath());
}

                }
            // GET: BOTON
            }
            
        public class CtrlVvdirectorio extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            public CtrlVvdirectorio(Form form)
                {
                super(form);
                setName("vvdirectorio");
                setTitle("Directorio destino");
                setType(STRING);
                setProtect(true);
                setLength(40);
                setSearchable(true);
                setEnabled(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvbrowsedir extends ControlButton
            {
            // GLOBALES: BOTON
            // Metodos
            public CtrlVvbrowsedir(Form form)
                {
                super(form);
                setName("vvbrowsedir");
                setTitle("Examinar");
                setTitle("Examinar");
                // SET: BOTON
                }
            // EVENT: BOTON
            public void onClick ()
                {
                super.onClick ();
                
vdirectoriorem.directoris = directoris;
vdirectoriorem.open();
                }
            // GET: BOTON
            }
            
        public class CtrlVvetiquetas extends ControlEditPane
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(10);
                    setHeight(20);
                    }
                }
                
            public CtrlVvetiquetas(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvetiquetas");
                setTitle("");
                setType(STRING);
                setProtect(true);
                setLength(99999);
                setSearchable(true);
                setEnabled(false);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAafichero extends Action
            {
            public LinkAafichero(Form form)
                {
                super(form);
                setName("aafichero");
                setTitle("&1. Subir fichero");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            }
            
        public class LinkAetiqueta extends Action
            {
            public LinkAetiqueta(Form form)
                {
                super(form);
                setName("aetiqueta");
                setTitle("&2. Añadir etiqueta");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                vetiquetas.loadComboBoxes(etiquetas);
vetiquetas.open();
                }
            }
            
        public class LinkAeliminaret extends Action
            {
            public LinkAeliminaret(Form form)
                {
                super(form);
                setName("aeliminaret");
                setTitle("&3. Eliminar etiquetas");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                
vvetiquetas.setValue("");
novaetiqueta.clear();
                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                setTitulo("Selección de fichero local");
                addControl(vvfichero);
                addControl(vvbrowse);
                getWebProperties().setNumCols (2);
                }
            }
            
        public class FSetFs2 extends Fieldset
            {
            public FSetFs2(Form form)
                {
                super(form);
                setTitulo("Directorio remoto de destino");
                addControl(vvdirectorio);
                addControl(vvbrowsedir);
                getWebProperties().setNumCols (2);
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
            setLayout(new LayoutAligned());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            setFildsetMax (LayoutFieldset.TIPOMAXIMIZAR.AMBOS);
            addControl(vvfichero=new CtrlVvfichero(this));
            addControl(vvbrowse=new CtrlVvbrowse(this));
            addControl(vvdirectorio=new CtrlVvdirectorio(this));
            addControl(vvbrowsedir=new CtrlVvbrowsedir(this));
            addControl(vvetiquetas=new CtrlVvetiquetas(this));
            addAction(aafichero=new LinkAafichero(this));
            addAction(aetiqueta=new LinkAetiqueta(this));
            addAction(aeliminaret=new LinkAeliminaret(this));
            addFieldset(fs1=new FSetFs1(this));
            addFieldset(fs2=new FSetFs2(this));
            addFieldset(fs3=new FSetFs3(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public class FormVetiquetas extends ProcessForm
        {
        // GLOBALES: VENTANA
        private void loadComboBoxes(ArrayList<Element> etiquetas) {
	vvfamilia.removeAllItems();
	vvetiqueta.removeAllItems();
	
	for (int x = 0; x < etiquetas.size(); x++) {
		Element e = etiquetas.get(x);
		if (e instanceof FamiliaElement) {
			vvfamilia.addItem(e.getNombre());
			if (x == 0 && ((FamiliaElement) e).hasElements()) {
				for (Element e2 : ((FamiliaElement) e).getElements()) {
					vvetiqueta.addItem(e2.getNombre());
				}	
			}
		}
	}
	vvfamilia.onSelectedIndex(0);
	vvetiqueta.onSelectedIndex(0);
}

private void refreshEtiqueta(String familia) {
	vvetiqueta.removeAllItems();

	for (Element e : etiquetas) {
		if (e.getNombre().equals(familia) && e instanceof FamiliaElement && ((FamiliaElement) e).hasElements()) {
			for (Element e2 : ((FamiliaElement) e).getElements()) {
				vvetiqueta.addItem(e2.getNombre());
			}	
		}
	}
	vvetiqueta.onSelectedIndex(0);
}
        // Metodos
        // Controles
        public CtrlVvfamilia vvfamilia;
        public CtrlVvetiqueta vvetiqueta;
        public CtrlVvvalor vvvalor;
        // Acciones
        public LinkAañade aañade;
        // Fieldsets
        public FSetFs1 fs1;
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(230);
                setHeight(200);
                setTitle("Etiquetas");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class CtrlVvfamilia extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(20);
                    }
                }
                
            public CtrlVvfamilia(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvfamilia");
                setTitle("Familia");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setComboEditable(false);
                setDescriptionShow(false);
                addItem("");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            public void userChange (Value v)
                {
                super.userChange (v);
                refreshEtiqueta(getString());
                }
            }
            
        public class CtrlVvetiqueta extends ControlComboBox
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(20);
                    }
                }
                
            public CtrlVvetiqueta(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvetiqueta");
                setTitle("Etiqueta");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                setComboEditable(false);
                setDescriptionShow(false);
                addItem("");
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class CtrlVvvalor extends ControlEdit
            {
            // GLOBALES: CONTROLEDIT
            // Metodos
            class Look extends LookComponent
                {
                public Look( )
                    {
                    super();
                    setLength(20);
                    }
                }
                
            public CtrlVvvalor(Form form)
                {
                super(form);
                setLook(new Look());
                setName("vvvalor");
                setTitle("Valor");
                setType(STRING);
                setLength(25);
                setSearchable(true);
                // SET: CONTROLEDIT
                }
            // GET: CONTROLEDIT
            // EVENT: CONTROLEDIT
            }
            
        public class LinkAañade extends Action
            {
            public LinkAañade(Form form)
                {
                super(form);
                setName("aañade");
                setTitle("&1. Añadir");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                
if ("".equals(vvvalor.getString())) {
	Maefc.message("No se puede añadir un valor vacio", "¡Atención!", Maefc.WARNING_MESSAGE);
}
else {
	EtiquetaElement element = buscaEtiqueta(vvetiqueta.getString());
	if (element != null) {
		novaetiqueta.put(Integer.toString(element.getId()), vvvalor.getString());
		vadfitxerafin.vvetiquetas.setValue(vadfitxerafin.vvetiquetas.getString() + vvfamilia.getString() + " - " + vvetiqueta.getString() + " - " + vvvalor.getString() + "\n");
		vetiquetas.exit();
	}
}

                }
            }
            
        public class FSetFs1 extends Fieldset
            {
            public FSetFs1(Form form)
                {
                super(form);
                addControl(vvfamilia);
                addControl(vvetiqueta);
                addControl(vvvalor);
                getWebProperties().setAnchoColumnas (20);
                getWebProperties().setNumCols (1);
                getWebProperties().setYPad (10);
                }
            }
            
        public FormVetiquetas(ProgPradfitxerafin pradfitxerafin)
            {
            super(pradfitxerafin);
            setName("vetiquetas");
            setTitle("Etiquetas");
            setLocation(new Location());
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            setFildsetMax (LayoutFieldset.TIPOMAXIMIZAR.AMBOS);
            addControl(vvfamilia=new CtrlVvfamilia(this));
            addControl(vvetiqueta=new CtrlVvetiqueta(this));
            addControl(vvvalor=new CtrlVvvalor(this));
            addAction(aañade=new LinkAañade(this));
            addFieldset(fs1=new FSetFs1(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            setLayout(new LayoutFieldset(this));
            super.onInit ();
            }
        }
        
    public class FormVdirectoriorem extends ProcessForm
        {
        // GLOBALES: VENTANA
        private javax.swing.tree.DefaultTreeModel treeModel;
private CtrlArbre arbre;
private TreeTableNode raiz;
private javax.swing.JTree jt;
private boolean bModificado = false;
private TreeElement elementSelected = null;
public ArrayList<DirectoryElement> directoris = null;
private class CtrlArbre extends ControlTreeTable {
  public CtrlArbre(Form form) {
    super(form);
    setName("arbre");
    setLocation(LocationBorder.locationBorderCenter);

    ColumnEdit columna2=new ColumnEdit((ControlTable)null);
    columna2.setTitle("Nombre");
    columna2.setType(ColumnEdit.STRING);
    columna2.setLength(60);
    columna2.create();
    addColumn(columna2);

    ColumnEdit columna5=new ColumnEdit((ControlTable)null);
    columna5.setTitle("Fecha creación");
    columna5.setType(ColumnEdit.STRING);
    columna5.setLength(20);
    columna5.create();
    addColumn(columna5);

    ColumnEdit columna8=new ColumnEdit((ControlTable)null);
    columna8.setTitle("Usuario");
    columna8.setType(ColumnEdit.STRING);
    columna8.setLength(40);
    columna8.create();
    addColumn(columna8);
  }
  public void onRowSelectionChanged() {
   	super.onRowSelectionChanged();
  }
}

private class MyRenderer extends javax.swing.tree.DefaultTreeCellRenderer {

    public MyRenderer() {

    }

    public java.awt.Component getTreeCellRendererComponent(javax.swing.JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
      super.getTreeCellRendererComponent( tree, value, sel, expanded, leaf, row,hasFocus);
	 setIcon(new javax.swing.ImageIcon("mae/easp/images/folderf.png"));
      if (leaf) {
    	  setFont (getFont().deriveFont(java.awt.Font.PLAIN));
      }
      else {    	  
    	  setFont (getFont().deriveFont(java.awt.Font.BOLD));
      }
      
      return this;
    }    
 }

private class TreeElement extends TreeArray {
	int id = 0;
	int idParent = 0;
	String nom = null;
	String fcreacion = null;
	String usuario = null;
	private TreeElement(DirectoryElement element) {
		this.id = element.getId();
		this.idParent = element.getParentId();
		this.nom = element.getNom();
		this.fcreacion = element.getFechaCrea();
		this.usuario = element.getUsuari();

		addElement(this.nom);
		addElement(this.fcreacion);
		addElement(this.usuario);
	}

	public String toString() {
		return (String) elementAt(0);
	}
}

private void montarArbol(TreeTableNode pare, DirectoryElement directory) {
	if (directory.getElements() != null) {
		for (mae.easp.progesdoc.Element d : directory.getElements()) {
			DirectoryElement direc = (DirectoryElement) d;
			TreeTableNode fill = new TreeTableNode(new TreeElement(direc));
			pare.add(fill);
			montarArbol(fill, direc);
		}
	}
}

private void montarArbol(ArrayList<DirectoryElement> directoris){	
	for (DirectoryElement d : directoris) {
		TreeTableNode fill = new TreeTableNode(new TreeElement(d));
		raiz.add(fill);
		montarArbol(fill, d);
	}
}

public void onOpened() {
  super.onOpened();
  bModificado = false;
  elementSelected = null;
  crearArbol(true);
}

private void refrescarArbol () {
  int numOrig = jt.getRowForPath(jt.getSelectionPath());
  java.util.Vector <Integer> v = new java.util.Vector <Integer>();
  java.util.Enumeration <javax.swing.tree.TreePath> e = jt.getExpandedDescendants(new javax.swing.tree.TreePath(raiz));
  while (e.hasMoreElements()) {
    javax.swing.tree.TreePath tp = e.nextElement();
    int row = jt.getRowForPath(tp);
    v.addElement(new Integer(row));
  }
  dropTree();
  crearArbol(false);
  jt.repaint();
  java.util.Collections.sort(v);
  for (int i=0;i<v.size();i++) {
    int row = v.elementAt(i).intValue();
    jt.expandPath(jt.getPathForRow(row));
  }
  jt.setSelectionRow(numOrig); 
  arbre.refresh();
}

private void crearArbol(boolean test) {
  montarArbol(directoris);
  jt=arbre.getJTree();
  treeModel = new javax.swing.tree.DefaultTreeModel(raiz);
  jt.setModel(treeModel);
  jt.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
  javax.swing.ToolTipManager.sharedInstance().registerComponent(jt);
  jt.setCellRenderer(new MyRenderer());
  jt.addMouseListener(new java.awt.event.MouseListener() {
	
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {}
	
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		if (e.getClickCount() == 2) {
      	    DefaultMutableTreeNode node = (DefaultMutableTreeNode) jt.getLastSelectedPathComponent();
      	    if (node != null) {
		    	   Object nodeInfo = node.getUserObject();
		        elementSelected = (TreeElement) nodeInfo;
      	    }
		}
	}
	
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {}
	
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {}
	
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {}
   });
   jt.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
	@Override
	public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) jt.getLastSelectedPathComponent();
	    if (node != null) {
	    	   Object nodeInfo = node.getUserObject();
	        elementSelected = (TreeElement) nodeInfo;
	    } 
	}
   });
  treeModel.reload((DefaultMutableTreeNode) treeModel.getRoot());
}

private void dropTree() {
  TreeTableNode node1;
  for (int i=0;i<raiz.getChildCount();i++) {
    node1=(TreeTableNode)raiz.getChildAt(i);
    node1.removeAllChildren();
  }
  raiz.removeAllChildren();
}
        // Metodos
        // Controles
        // Acciones
        public LinkAselecdir aselecdir;
        // Fieldsets
        class Location extends LocationWindow
            {
            public Location( )
                {
                super();
                setWidth(600);
                setHeight(400);
                setTitle("Directorio Remoto");
                setModal(true);
                setLocation(CENTER);
                }
            }
            
        public class LinkAselecdir extends Action
            {
            public LinkAselecdir(Form form)
                {
                super(form);
                setName("aselecdir");
                setTitle("&1. Seleccionar");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                
if (elementSelected != null) {
	vadfitxerafin.vvdirectorio.setValue(elementSelected.nom.toString());
	vdirectoriorem.exit();
}
else {
	Maefc.message("No hay ningún directorio remoto seleccionado","Atención",Maefc.WARNING_MESSAGE);
}

                }
            }
            
        public FormVdirectoriorem(ProgPradfitxerafin pradfitxerafin)
            {
            super(pradfitxerafin);
            setName("vdirectoriorem");
            setTitle("Directorio Remoto");
            setLayout(new LayoutBorder());
            setLocation(new Location());
            setPrintable(false);
            setModal(true);
            // SET: VENTANA
            addAction(aselecdir=new LinkAselecdir(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onInit ()
            {
            addControl(arbre=new CtrlArbre(this));
            raiz = new TreeTableNode();
            arbre.setRoot(raiz);
            super.onInit ();
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
        addForm(vetiquetas=new FormVetiquetas(this));
        addForm(vdirectoriorem=new FormVdirectoriorem(this));
        }
    public ProgPradfitxerafin()
        {
        this((AppEasp) Aplication.getAplication());
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onOpened ()
        {
        super.onOpened ();
        if (cdp == null) {
	exit();
}

        }
    public void onInit ()
        {
        if (cdp == null || "".equals(cdp)) {
        	Maefc.message("Imposible recuperar los datos del cliente en el servidor AFINITY", "¡Atención!", Maefc.WARNING_MESSAGE);
          	exit();
        }
        else {
        	vadfitxerafin.setLayout(new LayoutFieldset(vadfitxerafin));
          vadfitxerafin.setTitle("CDP " + cdp);
          
          azure = new Azure(INFO_CDP_URL);
          azure.addParametroURL("cdp", cdp);
          	
          if (azure.procesar()) {
          	xml = azure.getContenido();
          	etiquetas = getEtiquetas(xml);
          	directoris = getDirectorios(xml);
          }
          else {
          	Maefc.message("Imposible recuperar los datos del cliente en el servidor AFINITY", "¡Atención!", Maefc.WARNING_MESSAGE);
              	exit();
          }
          
          super.onInit ();
        }
        }
    }
    
