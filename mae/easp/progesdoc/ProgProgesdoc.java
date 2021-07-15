// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Wed Jun 16 17:21:54 CEST 2021
// 
// Aplicación: easp
// 
package mae.easp.progesdoc;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.xml.stream.*;
import mae.easp.*;
// 
// Programa: progesdoc
// Nombre:   Gestión Documental
// Versión:  1.0
// 
public class ProgProgesdoc extends Program
    {
    public AppEasp easp;
    public ProgProgesdoc progesdoc;
    // GLOBALES: PROGRAMA
    private ProgressBarForm pbf=null;
  private boolean bOk = true;
  private String sError = null;
  private javax.swing.tree.DefaultTreeModel treeModel;
  
  private CtrlArbre arbre;
  private TreeTableNode raiz;
  private javax.swing.JTree jt;
  private boolean bModificado = false;

  private java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
  private ArrayList<Element> elements;
  private Azure azure;  
  private XMLInputFactory factory;
  private XMLStreamReader reader;
  private static final String URL_FITXER_GESDOC = "gesdoc.getfile";
  private static String URL_GESDOC = "gesdoc.getcontenido";

  public String xml = "";
  public String cdp = "";
  public String nombrecdp = "";

private String getSize(long size) {
if (size <= 0) {
	return "0";
}
else if (size < 1024) {
	return size + " B";
}
else if (size < 1048576) {
	return size / 1024 + " kB";
}
else {
	return size / 1048576 + " MB";
}
}

private Element getAttributes(Element element, XMLStreamReader reader) throws XMLStreamException {
	int x = 0;
	while ( x < reader.getAttributeCount()) {
		if ("id".equals(reader.getAttributeName(x).toString())) {
			element.setId(Integer.parseInt(reader.getAttributeValue(x).toString()));
		}
		else if ("iddir".equals(reader.getAttributeName(x).toString())) {
			element.setParentId(Integer.parseInt(reader.getAttributeValue(x).toString()));
		}
		x++;
	}
	return element;
}

private ArrayList<Element> getElements(String xml) {
	ArrayList<Element> elem = new ArrayList<Element>();
	factory = XMLInputFactory.newInstance();
	Element element = null;
	
	try {
		
		reader = factory.createXMLStreamReader(new java.io.StringReader(xml));
		
		while (reader.hasNext()) {
			
			int event = reader.next();
			
			if (event == XMLStreamReader.START_ELEMENT) {
				if ("directorio".equals(reader.getName().toString())) {
					element = new DirectoryElement();
					element = getAttributes(element, reader);
					element = getDirectory((DirectoryElement) element, reader);
					elem.add(element);
					element = null;
				}
				else if ("fichero".equals(reader.getName().toString())) {
					element = new FileElement();
					element = getAttributes(element, reader);
					element = getFile((FileElement) element, reader);
					elem.add(element);
					element = null;
				}
			}
		}
		
		reader.close();
	} catch (XMLStreamException e) {
		e.printStackTrace();
	}
	
	return elem;
}

private DirectoryElement getDirectory(DirectoryElement directory, XMLStreamReader reader) throws XMLStreamException {

	Element element = null;
	
	while (reader.hasNext()) {
			
		int event = reader.next();

		if (event == XMLStreamReader.START_ELEMENT) {
			if ("directorio".equals(reader.getName().toString())) {
				element = new DirectoryElement();
				element = getAttributes(element, reader);
				element = getDirectory((DirectoryElement) element, reader);
				directory.addElement(element);
			}
			else if ("fichero".equals(reader.getName().toString())) {
				element = new FileElement();
				element = getAttributes(element, reader);
				element = getFile((FileElement) element, reader);
				directory.addElement(element);
			}
			else if (isValidTextNode("nombre", reader)) {
				directory.setNom(reader.getText().toString());
			}
			else if (isValidTextNode("usuario", reader)) {
				directory.setUsuari(reader.getText().toString());
			}
			else if (isValidTextNode("fechacrea", reader)) {
				directory.setFechaCrea(reader.getText().toString());
			}
		}
		else if (event == XMLStreamReader.END_ELEMENT) {
			if ("directorio".equals(reader.getName().toString())) {
				return directory;
			}
		}
	}

	return directory;
}

private FileElement getFile(FileElement file, XMLStreamReader reader) throws XMLStreamException {
	
	while (reader.hasNext()) {
			
		int event = reader.next();

		if (event == XMLStreamReader.START_ELEMENT) {
			if (isValidTextNode("nombre", reader)) {
				file.setNom(reader.getText().toString());
			}
			else if (isValidTextNode("desc", reader)) {
				file.setDesc(reader.getText().toString());
			}
			else if (isValidTextNode("usuario", reader)) {
				file.setUsuari(reader.getText().toString());
			}
			else if (isValidTextNode("fechacrea", reader)) {
				file.setFechaCrea(reader.getText().toString());
			}
			else if (isValidTextNode("mime", reader)) {
				file.setTipus(reader.getText().toString());
			}
			else if (isValidTextNode("size", reader)) {
				file.setSize(Long.parseLong(reader.getText().toString()));
			}
			else if (isValidTextNode("fechalectura", reader)) {
				file.setFlectura(reader.getText().toString());
			}
			else if (isValidTextNode("idstorage", reader)) {
				file.setIdStorage(reader.getText().toString());
			}
		}
		else if (event == XMLStreamReader.END_ELEMENT) {
			if ("fichero".equals(reader.getName().toString())) {
				return file;
			}
		}
	}
	return file;
}

private boolean isValidTextNode(String node, XMLStreamReader reader) throws XMLStreamException {
	if (node.equals(reader.getName().toString()) && reader.next() == XMLStreamReader.CHARACTERS)
		return true;
	else 
		return false;
}

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

    ColumnEdit columna6=new ColumnEdit((ControlTable)null);
    columna6.setTitle("Fecha lectura");
    columna6.setType(ColumnEdit.STRING);
    columna6.setLength(20);
    columna6.create();
    addColumn(columna6);

    ColumnEdit columna9=new ColumnEdit((ControlTable)null);
    columna9.setTitle("Tamaño");
    columna9.setType(ColumnEdit.STRING);
    columna9.setLength(10);
    columna9.create();
    addColumn(columna9);
  }
  public void onRowSelectionChanged() {
   	super.onRowSelectionChanged();
  }
}

private class MyRenderer extends javax.swing.tree.DefaultTreeCellRenderer {

    public MyRenderer() {

    }

    public java.awt.Component getTreeCellRendererComponent(javax.swing.JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
      boolean esDir = false;
      if (value != null && value.toString() != null && value.toString().contains("!-DIR-!")) {
    	  esDir = true;
    	  value = value.toString().replaceAll("!-DIR-!", "");
      }
      super.getTreeCellRendererComponent( tree, value, sel, expanded, leaf, row,hasFocus);
      if (!esDir) {
    	  setFont (getFont().deriveFont(java.awt.Font.PLAIN));
    	  setIcon(null);
      }
      else {    	  
    	  setFont (getFont().deriveFont(java.awt.Font.BOLD));
    	  setIcon(new javax.swing.ImageIcon("mae/easp/images/folderf.png"));
      }
      
      return this;
    }    
 }

private class TreeElement extends TreeArray {
	int id = 0;
	int idParent = 0;
	String nom = null;
	String tipo = null;
	String desc = null;
	String fcreacion = null;
	String flectura = null;
	String usuario = null;
	String tamano = null;
	String idstorage = null;
	private TreeElement(Element element) {
		this.id = element.getId();
		this.idParent = element.getParentId();
		this.nom = element.getNom();
		this.fcreacion = element.getFechaCrea();
		this.usuario = element.getUsuari();

		if (element instanceof FileElement) {
			FileElement filee = (FileElement) element;			
			this.tipo = filee.getTipus();
			this.desc = filee.getDesc();
			this.flectura = filee.getFlectura();
			this.tamano = getSize(filee.getSize());
			this.idstorage = filee.getIdStorage(); 
		}
		else {
			this.nom = "!-DIR-!" + this.nom;
		}
		
		addElement(this.nom);
		addElement(this.fcreacion);
		addElement(this.flectura);
		addElement(this.tamano);
	}

	public String toString() {
		return (String) elementAt(0);
	}
}

private void montarArbol(TreeTableNode pare, DirectoryElement directory) {
	if (directory.getElements() != null) {
		for (Element e : directory.getElements()) {
			TreeTableNode fill = new TreeTableNode(new TreeElement(e));
			pare.add(fill);
			if (e instanceof DirectoryElement)
				montarArbol(fill, (DirectoryElement) e);
		}
	}
}

private void montarArbol(ArrayList<Element> elements){	
	for (Element e : elements) {
		TreeTableNode fill = new TreeTableNode(new TreeElement(e));
		raiz.add(fill);
		if (e instanceof DirectoryElement)
			montarArbol(fill, (DirectoryElement) e);
	}
 }

 public void initActionRefresh() {
     if (vgesdoc.iarefresh == null) {
		vgesdoc.iarefresh = new IconAction(vgesdoc, "Actualizar", "Actualizar", null, "Actualizar") {
			public void onAction() {
				refrescaFitxers();
			}
		};
     }
}

private void refrescaFitxers() {
	azure = new Azure(URL_GESDOC);
	azure.addParametroURL("cdp", cdp);
	
	if (azure.procesar()) {
		xml = azure.getContenido();
		if (!"".equals(xml)) {
			elements = getElements(xml);
			vgesdoc.refrescarArbol();
	     }	
	}
	else {
		Maefc.message("No se ha podido conectar con Afinity", "¡Atención!", Maefc.WARNING_MESSAGE);
		return;
	}
}

public void create() {
	super.create();
	initActionRefresh();
	vgesdoc.iarefresh.create();
}
    // Metodos
    // Ventana
    public FormVgesdoc vgesdoc;
    // Selects
    public Sselect sselect;
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Gestión Documental");
            }
        }
        
    public class FormVgesdoc extends ProcessForm
        {
        // GLOBALES: VENTANA
        private TreeElement elementSelected = null;

IconAction iarefresh;

public void onOpened() {
  super.onOpened();
  bModificado = false;
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
  montarArbol(elements);
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

		    if (node != null && node.isLeaf()) {
		    	   Object nodeInfo = node.getUserObject();
		        elementSelected = (TreeElement) nodeInfo;
		        obreFitxer();
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
	    if (node != null && node.isLeaf()) {
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

private void obreFitxer() {
	if (elementSelected.id != 0) {
	azure = new Azure(URL_FITXER_GESDOC);
	azure.addParametroURL("cdp", cdp);
	azure.addParametroURL("id", elementSelected.id);
	
	if (azure.procesar()) {
		byte[] contingut = azure.getContenidoBinario();
		if (!"".equals(contingut.toString())) {
			File f;
			try {
				f = File.createTempFile(
						(elementSelected.nom.contains(".") ? elementSelected.nom.substring(0, elementSelected.nom.lastIndexOf(".")) : elementSelected.nom), 
							(elementSelected.nom.contains(".")) ? elementSelected.nom.substring(elementSelected.nom.lastIndexOf("."), elementSelected.nom.length()) : ".txt");
				try (java.io.FileOutputStream pw = new java.io.FileOutputStream(f);) {
					pw.write(contingut);
				}
				
				java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
				desktop.open(f);
			} catch (java.io.IOException e) {
				e.printStackTrace();
			}
	     }	
	}
	else {
		Maefc.message("No se ha podido conectar con Afinity", "¡Atención!", Maefc.WARNING_MESSAGE);
		return;
	}
}
else {
	Maefc.message("No hay ningún fichero seleccionado", "¡Atención!", Maefc.WARNING_MESSAGE);
	return;
}
}
        // Metodos
        // Controles
        // Acciones
        public LinkAofitxer aofitxer;
        public LinkAafichero aafichero;
        // Fieldsets
        class Location extends LocationBorder
            {
            public Location( )
                {
                super();
                setLocation(CENTER);
                }
            }
            
        public class LinkAofitxer extends Action
            {
            public LinkAofitxer(Form form)
                {
                super(form);
                setName("aofitxer");
                setTitle("&1. Abrir fichero");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                obreFitxer();
                }
            }
            
        public class LinkAafichero extends Action
            {
            public LinkAafichero(Form form)
                {
                super(form);
                setName("aafichero");
                setTitle("&2. Subir fichero");
                // SET: ACCION
                setOptions(SHOW);
                }
            // EVENT: ACCION
            public void onAction ()
                {
                super.onAction ();
                
mae.easp.pradfitxerafin.ProgPradfitxerafin prog = new mae.easp.pradfitxerafin.ProgPradfitxerafin(easp);
prog.cdp = cdp;
prog.setModal(true);
LocationWindow loc=new LocationWindow();
loc.setWidth(600);
loc.setHeight(400);
loc.setLocation(loc.CENTER);
prog.setLocation(loc);
prog.run();
iarefresh.doAction();
                }
            }
            
        public FormVgesdoc(ProgProgesdoc progesdoc)
            {
            super(progesdoc);
            setName("vgesdoc");
            setTitle("Gesdoc");
            setLayout(new LayoutBorder());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addSelect(sselect=new Sselect());
            addAction(aofitxer=new LinkAofitxer(this));
            addAction(aafichero=new LinkAafichero(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    // 
    public class Sselect extends Select
        {
        // Tablas
        // GLOBALES: SELECT
        // Metodos
        // Campos
        public Sselect()
            {
            setName("sselect");
            // SET: SELECT
            }
        // GET: SELECT
        // EVENT: SELECT
        }
        
    public ProgProgesdoc(AppEasp easp)
        {
        super(easp);
        this.easp=easp;
        this.progesdoc=this;
        setName("progesdoc");
        setTitle("Gestión Documental");
        // SET: PROGRAMA
        setLayout(new LayoutBorder());
        setLocation(new Location());
        addForm(vgesdoc=new FormVgesdoc(this));
        }
    public ProgProgesdoc()
        {
        this((AppEasp) Aplication.getAplication());
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        //System.out.println(xml);
        vgesdoc.setTitle(cdp+" - "+nombrecdp);
        elements = getElements(xml);
        vgesdoc.addControl(arbre=new CtrlArbre(vgesdoc));
        raiz = new TreeTableNode();
        arbre.setRoot(raiz);
        initActionRefresh();
        super.onInit();
        }
    }
    
