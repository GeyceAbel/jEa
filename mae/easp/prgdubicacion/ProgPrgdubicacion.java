// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Thu Jun 10 13:46:33 CEST 2021
// 
// Aplicación: easp
// 
package mae.easp.prgdubicacion;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import java.util.ArrayList;
import javax.xml.stream.*;
import mae.easp.progesdoc.DirectoryElement;
import javax.swing.tree.DefaultMutableTreeNode;
import mae.easp.*;
// 
// Programa: prgdubicacion
// Nombre:   Ubicación remota
// Versión:  1.0
// 
public class ProgPrgdubicacion extends Program
    {
    public AppEasp easp;
    public ProgPrgdubicacion prgdubicacion;
    // GLOBALES: PROGRAMA
    private static final String INFO_CDP_URL = "gesdoc.getinfocdp";
private Azure azure = null;
private XMLInputFactory factory;
private XMLStreamReader reader;
private ArrayList<DirectoryElement> directoris = null;
private javax.swing.tree.DefaultTreeModel treeModel;
private CtrlArbre arbre;
private TreeTableNode raiz;
private javax.swing.JTree jt;


public String cdp = null;
public String xml = null;

public mae.general.jreports.UbicacionGD ubicSelec = null; // param sortida

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

  }
  public void onSelection() {
   	super.onSelection();
   	vdirectoriorem.aselecdir.doAction();
  }
}

private class MyRenderer extends javax.swing.tree.DefaultTreeCellRenderer {
	
    private static final long serialVersionUID = 1L;

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
	String nom = null;
	String fcreacion = null;
	String usuario = null;
	private TreeElement(DirectoryElement element) {
		this.id = element.getId();
				
		this.nom = element.getNom();
		this.fcreacion = element.getFechaCrea();
		this.usuario = element.getUsuari();

		addElement(this.nom);
		addElement(this.fcreacion);
	}

	public int getId() {
		return id;
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


private void crearArbol(boolean test) {
  montarArbol(directoris);
  jt=arbre.getJTree();
  treeModel = new javax.swing.tree.DefaultTreeModel(raiz);
  jt.setModel(treeModel);
  jt.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
  javax.swing.ToolTipManager.sharedInstance().registerComponent(jt);
  jt.setCellRenderer(new MyRenderer());
  treeModel.reload((DefaultMutableTreeNode) treeModel.getRoot());
}
    // Metodos
    // Ventana
    public FormVdirectoriorem vdirectoriorem;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Ubicación remota");
            }
        }
        
    public class FormVdirectoriorem extends ProcessForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        // Acciones
        public LinkAselecdir aselecdir;
        // Fieldsets
        class Location extends LocationBorder
            {
            public Location( )
                {
                super();
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
                TreeElement elementSelected = null;
DefaultMutableTreeNode node = (DefaultMutableTreeNode) jt.getLastSelectedPathComponent();
if (node != null) {
	Object nodeInfo = node.getUserObject();
	elementSelected = (TreeElement) nodeInfo;
}

if (elementSelected != null) {
	int resp = Maefc.message ("¿Desea seleccionar "+elementSelected+" como la ubicación destino?","Ubicación gestión documental",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION);
	if (resp == Maefc.YES_OPTION) {
	     ubicSelec = new mae.general.jreports.UbicacionGD (elementSelected.id, elementSelected.nom);
		prgdubicacion.exit();
	}
	else elementSelected = null;
}
else Maefc.message("No hay ningún directorio remoto seleccionado","Atención",Maefc.WARNING_MESSAGE);

                }
            }
            
        public FormVdirectoriorem(ProgPrgdubicacion prgdubicacion)
            {
            super(prgdubicacion);
            setName("vdirectoriorem");
            setLayout(new LayoutBorder());
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addAction(aselecdir=new LinkAselecdir(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        public void onOpened ()
            {
            super.onOpened ();
            crearArbol(true);
            }
        }
        
    public ProgPrgdubicacion()
        {
        this.prgdubicacion=this;
        setName("prgdubicacion");
        setTitle("Ubicación remota");
        // SET: PROGRAMA
        setLayout(new LayoutBorder());
        setLocation(new Location());
        addForm(vdirectoriorem=new FormVdirectoriorem(this));
        }
    public ProgPrgdubicacion(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        if (cdp == null || "".equals(cdp)) {
        	Maefc.message("Imposible recuperar los datos del cliente en el servidor AFINITY", "¡Atención!", Maefc.WARNING_MESSAGE);
        	exit();
        } else {
        	LocationWindow lw = new LocationWindow(LocationWindow.CENTER);
	lw.setWidth(620);
	lw.setHeight(400);
	setLocation(lw);
	setModal(true);
	azure = new Azure(INFO_CDP_URL);
        	azure.addParametroURL("cdp", cdp);
        
        	if (azure.procesar()) {
        		xml = azure.getContenido();
        		directoris = getDirectorios(xml);
        		vdirectoriorem.addControl(arbre=new CtrlArbre(vdirectoriorem));
		raiz = new TreeTableNode();
		arbre.setRoot(raiz);
		super.onInit ();

	} else {
        		Maefc.message("Imposible recuperar los datos del cliente en el servidor AFINITY", "¡Atención!", Maefc.WARNING_MESSAGE);
        		exit();
        	}
        }


        }
    }
    
