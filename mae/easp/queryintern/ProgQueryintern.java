// Codigo Generado por AppJEDICASE V-15.01.00.01 NO MODIFICAR!
// Fecha y hora:     Wed Nov 20 10:05:18 CET 2019
// 
// Aplicación: easp
// 
package mae.easp.queryintern;
// 
import geyce.maefc.*;
import mae.easp.general.*;
import mae.easp.db.*;
import mae.general.*;
// 
// IMPORTS: PROGRAMA
import mae.easp.*;
// 
// Programa: queryintern
// Nombre:   Ejecutar sentencias en BBDD
// Versión:  1.0
// 
public class ProgQueryintern extends Program
    {
    public AppEasp easp;
    public ProgQueryintern queryintern;
    // GLOBALES: PROGRAMA
    private DBConnection connAplic = getAplication().getDataBase();
private DBConnection connEA = Easp.connEA;
private DBConnection connModelos = mae.modasp.general.Modasp.connModasp;
private CtrlVvselect vvselect;
private CtrlVvresultado vvresultado;
private MyForm fresultado;
private ControlTable ct;
private String resultado = null;
private java.util.LinkedHashMap<String, Integer> fields;
private java.io.File xmlDataSourceFile;

public class MyForm extends Form{
    public MyForm(Program pare) {
		super(pare);
		setPrintable(true);
		setTitle("Resultado");
	}
    	  	  
  	public void onOpened() {
  		super.onOpened();
  		carregarDades();
        if (resultado!=null) vvresultado.setValue(resultado);
    }

    public void onPrint() {
		printInfo();
    }
}

public boolean printInfo () {
    if (ct.getRowCount()<=0) return false;
    boolean bOk = createXmlDocument();
    if (bOk) {
        int tamanyFont = 6;
        int tamany = 0;
        for (int columna=0;columna<ct.getColumnCount();columna++) {
            Control ctrl = ct.getControlColumn(columna);
            if (ctrl != null && ctrl instanceof ControlValue && ctrl.isPrintable()) {
                if (((ControlValue) ctrl).getLength()>=ctrl.getTitle().length()) tamany += ((ControlValue) ctrl).getLength();
                else tamany += ctrl.getTitle().length();
            }
        }

        mae.general.jreports.JListado jl = new mae.general.jreports.JListado("controltable/fila", fields, mae.general.jreports.JListado.Orientacion.VERTICAL);
        jl.setTituloListado("Resultado ejecución sentencia SQL");
        jl.setNombreReport("Resultado ejecución sentencia SQL");

        jl.setColorPeuPagina ("#0e4b80");
        jl.setColorLineas ("#5e584e");
        jl.setAutoFillColumn(true);
        jl.sizeDetalle = tamanyFont;
        jl.sizeEncabezado = 2 * tamanyFont;	

        double widthRestante = (double)((double)jl.getColumnWidth()/(double)tamany);
        for (int columna=0;columna<ct.getColumnCount();columna++) {
            if (ct.getColumn(columna).getControlValue().isPrintable()) {
                ColumnEdit colE = (ColumnEdit) ct.getColumn(columna);
                addColumnaPF (jl, colE.getLength(), colE.getTitle().length(), colE.getTitle(), widthRestante, "columna"+columna, colE.getType(), tamanyFont);
            }
        }					
        try {
            net.sf.jasperreports.engine.data.JRXmlDataSource xmlDataSource = new net.sf.jasperreports.engine.data.JRXmlDataSource(xmlDataSourceFile,"controltable/fila");
            jl.setXmlDataSource(xmlDataSource);
            Value v = new Value();
            v.setValue(Maefc.getDate());
            jl.setFechaListado(v.getString());
            mae.general.jreports.PrintJasperWork pjw = new mae.general.jreports.PrintJasperWork (ct.getTitle(), getDataBase());
            pjw.setPestanaVISOR(false);
            if (jl.generalJRXML()){
                pjw.addListado(jl);
                pjw.dialog(queryintern);
            }				
        }
        catch (Exception e) {
            e.printStackTrace();
            bOk = false;
        }

    }
    return bOk;
	}
  
private boolean createXmlDocument() {
    try {						
        xmlDataSourceFile = java.io.File.createTempFile("RESUMEN_", ".xml");
        javax.xml.parsers.DocumentBuilderFactory docFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = docBuilder.newDocument();
        org.w3c.dom.Element root = doc.createElement("controltable");
        doc.appendChild(root);		
        
        createXmlDocumentCP (doc, root, ct);
        
        javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
        javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
        javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
        javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(xmlDataSourceFile);
        transformer.transform(source, result);
    }
    catch (Exception e) {
        e.printStackTrace();
        xmlDataSourceFile = null;
    }
    return xmlDataSourceFile != null;
}
  
private void createXmlDocumentCP(org.w3c.dom.Document doc, org.w3c.dom.Element root, ControlTable ct) {
    try {
        fields = new java.util.LinkedHashMap<String, Integer>();
        int iNFilas = ct.getRowCount();
        for (int fila=0;fila<iNFilas;fila++) {
            org.w3c.dom.Element register = doc.createElement("fila");
            root.appendChild(register);					
            for (int col=0;col<ct.getColumnCount();col++) {
                Column oCol = ct.getColumn(col);
                Value v = ct.getValueAt(fila, col);
                if (fila==0) {
                    if (oCol.getControlValue().getType() == ControlValue.DOUBLE) fields.put("columna"+col, FieldDef.DOUBLE);
                    else if (oCol.getControlValue().getType() == ControlValue.INTEGER) fields.put("columna"+col, FieldDef.INTEGER);
                    else fields.put("columna"+col, FieldDef.VARCHAR);
                }
                if (v.isNull()) {
                    org.w3c.dom.Element colum = doc.createElement("columna"+col);
                    colum.appendChild(doc.createTextNode(v.getString()));
                    register.appendChild(colum);										
                }
                else if (oCol.getControlValue().getType() == ControlValue.DOUBLE) {
                    org.w3c.dom.Element colum = doc.createElement("columna"+col);
                    colum.appendChild(doc.createTextNode(v.getString().replace(".",",")));
                    register.appendChild(colum);
                }
                else {
                    org.w3c.dom.Element colum = doc.createElement("columna"+col);
                    colum.appendChild(doc.createTextNode(v.getString()));
                    register.appendChild(colum);
                }
            }
        }
    }
    catch (Exception e) {
        e.printStackTrace();
        xmlDataSourceFile = null;
    }
}
  
private mae.general.jreports.Columna addColumnaPF (mae.general.jreports.JListado listadoJasper, int longCampo, int longTitulo, String titulo, double widthRestante, String nom, int tipo,  int tamanyFont) {
    int len = 0;
    if (longCampo>=longTitulo) len += longCampo;
    else len += longTitulo;
    mae.general.jreports.Columna col = null;
    col = listadoJasper.addColumna(titulo,0,(int)(len * widthRestante), mae.general.jreports.Columna.STRING,nom,null);
    col.getSt().setAligLeft();
    col.getTf().setAligDerecha(false);
    col.getSt().setLeftIndent(0);
    col.getSt().setRightIndent(5);
    col.getTf().setLeftIndent(0);
    col.getTf().setRightIndent(5); 					
    col.getSt().setSizeFont(tamanyFont);
    col.getTf().setSizeFont(tamanyFont);
    return col;		
}

public DBConnection getConexionActiva() {
    if (vprincipal.chaplic.getBoolean()) return connAplic;
    else if (vprincipal.chea.getBoolean()) return connEA;
    else if (vprincipal.chmodelos.getBoolean()) return connModelos;
    return null;
}
  
public void initChecksConnexio() {
    vprincipal.chaplic.setValue(new Boolean(true));
    /*
    if (getAplication() instanceof mae.easp.AppEasp) {
	    vprincipal.chea.setValue(new Boolean(true));
    }
    else if (getAplication() instanceof mae.modasp.AppModasp) {
	    vprincipal.chmodelos.setValue(new Boolean(true));
    } 
    else vprincipal.chaplic.setValue(new Boolean(true));
    */
}

public class CtrlVvselect extends ControlEditPane {
    class Look extends LookComponent {
        public Look( ) {
            super();
            setLength(85);
            setHeight(4);
        }
    }	    	
    public CtrlVvselect (Form form) {
        super(form);
        setName("vvselect");
        setMessageHelp("Sentencia");
        setTitle("Sentencia");
        setType(STRING);
        setLength(5000);
        setPrintable(false);
        setLook(new Look());
    }
}

public class CtrlVvresultado extends ControlEditPane {
    class Look extends LookComponent {
        public Look( ) {
            super();
            setLength(85);
            setHeight(4);
        }
    }	    	
    public CtrlVvresultado (Form form) {
        super(form);
        setName("vvresultado");
        setMessageHelp("Resultado");
        setTitle("Resultado");
        setType(STRING);
        setLength(5000);
        setPrintable(false);
        setLook(new Look());
    }
}

private void creaControlTable() {
    java.sql.Statement stmt;
    java.sql.ResultSet rs = null;
    vvresultado.setNull();
    resultado = null;
    DBConnection conn = null;
    fresultado = null;
    try {
        conn = getConexionActiva();
        if (conn==null) {
            resultado = "Imposible conectar con base de datos";
            return;
        }
        String q = vvselect.getString();
        if (q != null && !"".equals(q.trim())) {
            if (q.toUpperCase().contains("UPDATE")) {
                int registros = conn.executeUpdate(q);
                conn.commit();
                resultado = "("+registros+") Registros actualizados";
            } else if (q.toUpperCase().contains("DELETE")) {
                int registros = conn.executeUpdate(q);
                conn.commit();
                resultado = "("+registros+") Registros eliminados";
            } else {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(q);
                ct = new ControlTable(vprincipal);
    
                fresultado = new MyForm(queryintern);
                fresultado.setLayout(new LayoutTabbed());
                LocationWindow lw = new LocationWindow();
                lw.setWidth(800);
                lw.setHeight(600);
                fresultado.setLocation(lw);
                fresultado.setLayout(new LayoutBorder());
                fresultado.setModal(true);
    
                ControlPanel cp = new ControlPanel(fresultado);
                cp.setName("cp");
                cp.setLayout(new LayoutBorder());
                fresultado.addControl(cp);
                ct = new ControlTable(cp);
                ct.setName("ct");
                ColumnEdit col = null;
                String colName = null;
                if (rs.next()) { //Només volem els noms de les columnes, així que IF enlloc de WHILE
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        col = new ColumnEdit();
                        colName = rs.getMetaData().getColumnName(i);
                        col.setName(colName);
                        col.setTitle(colName);
                        int type = getType(rs.getMetaData().getColumnType(i));
                        int nameSize = rs.getMetaData().getColumnName(i).length();
                        int displaySize =   rs.getMetaData().getColumnDisplaySize(i);
                        if (type==Value.DATE) displaySize = 10;
                        if (displaySize > 20) displaySize = 20;
                        col.setLength(displaySize < nameSize ? nameSize : displaySize);
                        col.setType(ControlValue.STRING);
                        col.setEditable(true);
                        col.setEnabled(true);
                        col.create();
                        ct.addColumn(col);
                    }
                }
                rs.close();
                ct.setTableEditable(false);
                ct.setAutoResizeMode(ControlTable.AUTO_RESIZE_OFF);
                ct.setSelectionMode(ControlTable.SINGLE_SELECTION);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        if (conn!=null) conn.rollback();
        if (resultado==null) resultado = e.getMessage();
        try {
            if (rs!=null) rs.close();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
            if (resultado==null) resultado = e1.getMessage();
        }
    }
}

private int getType(int typeMetaData) {
    /*
    ** String typeName = rs.getMetaData().getColumnTypeName(typeMetaData); 
    ** typeName: char(1)
    ** typeName: int(4)                                                                                 
	** typeName: float(8)                                                                               
	** typeName: varchar(12)                                                                            
	** typeName: datetime(93)   
	*/
    switch (typeMetaData) {
    case 1:
        return ControlValue.STRING;     
    case 4:
        return ControlValue.INTEGER;    
    case 8:
        return ControlValue.DOUBLE;     
    case 12:
        return ControlValue.STRING;
    case 93:
        return ControlValue.DATE;
    default:
        return ControlValue.STRING;
    }
}

private void carregarDades() {
    java.sql.Statement stmt;
    java.sql.ResultSet rs = null;
    try {
        DBConnection conn = getConexionActiva();
        if (conn==null) {
        	vvresultado.setValue("Imposible conectar con la base de datos");
        	return;
        }
        String q = vvselect.getString();
        if (q != null && !"".equals(q.trim())) {

            if (q.toUpperCase().contains("UPDATE")) {
                //res
            } else if (q.toUpperCase().contains("DELETE")) {
                //res
            } else {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(q);
                ct.removeAllRows();
                int linia = 0;
                while (rs.next()) {
                    ct.addRow();
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        ct.setValueAt(Value.createValue(rs.getString(i)), linia, i - 1);
                    }
                    linia++;

                }
                rs.close();
                resultado = "("+ct.getRowCount()+") Registros seleccionados";
            }
        }

    } catch (Exception e) {
        e.printStackTrace();
        if (resultado==null) resultado = e.getMessage();
        try {
           if (rs!=null) rs.close();
        } catch (java.sql.SQLException e1) {
          e1.printStackTrace();
          if (resultado==null) resultado = e1.getMessage();
        }
    }
}

private String getHtml() {
    String page = "<html><head><title>Queryintern</title><meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"></head>";
    page += "<body bgcolor=\"#E7EBEF\" >";
    page += "<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"750\" align=\"center\">";
    page += "<tr><td colspan=\"7\" height=\"10\"></td></tr>";
    page += "<TR>";
    page += "<td align=\"Left\" valign=\"middle\" width=\"20%\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\" color=\"#003366\" >&nbsp;&nbsp;&nbsp;&nbsp;<b>Conexiones:&nbsp;&nbsp;</b></font></td>";
    page += "<td align=\"right\" valign=\"middle\" width=\"25%\" nowrap><font face=\"Arial, Helvetica, sans-serif\" size=\"3\" color=\"#003366\" >&nbsp;&nbsp;&nbsp;&nbsp;<b>Aplicaci&oacute;n activa&nbsp;"+(connAplic!=null? "("+connAplic.getDB().getType()+")":"(null)")+"&nbsp;</b></font></td>";
    page += "<td><input size=\"2\" type=\"text\" name=\"chaplic\"></td>";
    page += "<td align=\"right\" valign=\"middle\" width=\"25%\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\" color=\"#003366\" >&nbsp;&nbsp;&nbsp;&nbsp;<b>EA&nbsp;"+(connEA!=null? "("+connEA.getDB().getType()+")":"(null)")+"&nbsp;</b></font></td>";
    page += "<td><input size=\"2\" type=\"text\" name=\"chea\"></td>";
    page += "<td align=\"right\" valign=\"middle\" width=\"25%\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\" color=\"#003366\" >&nbsp;&nbsp;&nbsp;&nbsp;<b>Modelos&nbsp;"+(connModelos!=null? "("+connModelos.getDB().getType()+")":"(null)")+"&nbsp;</b></font></td>";
    page += "<td><input size=\"2\" type=\"text\" name=\"chmodelos\"></td>";
    page += "</tr>";
    page += "<tr><td colspan=\"7\" height=\"10\"></td></tr>";
    page += "</TABLE>";
    page += "<TABLE cellspacing=\"0\" cellpadding=\"0\" width=\"750\" align=\"center\">";
    page += "<TR><td align=\"left\" valign=\"middle\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\" color=\"#003366\" >&nbsp;&nbsp;&nbsp;&nbsp;<b>Sentencia</b></font></td></tr>";	
    page += "<TR><td align=\"center\"><input  width=\"750\" height=\"200\" type=\"text\" name=\"vvselect\" id=\"vvselect\" ></td></tr>";
    page += "<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<input  type=\"text\" name=\"btejecutar\" id=\"btejecutar\" ></td></tr>";
    page += "<TR><td height=\"10\"></td></tr>";
    page += "<TR><td align=\"left\" valign=\"middle\"><font face=\"Arial, Helvetica, sans-serif\" size=\"3\" color=\"#003366\" >&nbsp;&nbsp;&nbsp;&nbsp;<b>Resultado</b></font></td>";
    page += "<TR><td align=\"center\"><input  width=\"750\" height=\"150\" type=\"text\" name=\"vvresultado\" id=\"vvresultado\" ></td></tr>";
    page += "</TABLE></body></html>";
    return page;
}
    // Metodos
    // Ventana
    public FormVprincipal vprincipal;
    // Selects
    class Location extends LocationTabbed
        {
        public Location( )
            {
            super();
            setTitle("Ejecutar sentencias en BBDD");
            }
        }
        
    public class FormVprincipal extends ProcessForm
        {
        // GLOBALES: VENTANA
        // Metodos
        // Controles
        public CtrlChaplic chaplic;
        public CtrlChea chea;
        public CtrlChmodelos chmodelos;
        public CtrlBtejecutar btejecutar;
        // Acciones
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
            
        public class CtrlChaplic extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChaplic(Form form)
                {
                super(form);
                setName("chaplic");
                setTitle("");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChea extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChea(Form form)
                {
                super(form);
                setName("chea");
                setTitle("Conexión jEA");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlChmodelos extends ControlCheck
            {
            // GLOBALES: CHECKBOX
            // Metodos
            public CtrlChmodelos(Form form)
                {
                super(form);
                setName("chmodelos");
                setTitle("Conexión jModelos");
                // SET: CHECKBOX
                }
            // EVENT: CHECKBOX
            // GET: CHECKBOX
            }
            
        public class CtrlBtejecutar extends ControlButton
            {
            // GLOBALES: BOTON
            // Metodos
            public CtrlBtejecutar(Form form)
                {
                super(form);
                setName("btejecutar");
                setMessageHelp("Ejecutar sentencia en base de datos");
                setTitle("Ejecutar");
                setTitle("Ejecutar");
                // SET: BOTON
                }
            // EVENT: BOTON
            public void onClick ()
                {
                super.onClick();
                try {
                    creaControlTable();
                    if (fresultado!=null) fresultado.run();
                } catch (Exception e) {
                    e.printStackTrace();
                    if (resultado==null) resultado = e.getMessage();
                }
                if (resultado!=null) vvresultado.setValue(resultado);
                }
            // GET: BOTON
            }
            
        public FormVprincipal(ProgQueryintern queryintern)
            {
            super(queryintern);
            setName("vprincipal");
            setLocation(new Location());
            setPrintable(false);
            // SET: VENTANA
            addControl(chaplic=new CtrlChaplic(this));
            addControl(chea=new CtrlChea(this));
            addControl(chmodelos=new CtrlChmodelos(this));
            addControl(btejecutar=new CtrlBtejecutar(this));
            }
        // GET: VENTANA
        // EVENT: VENTANA
        }
        
    public ProgQueryintern()
        {
        this.queryintern=this;
        setName("queryintern");
        setTitle("Ejecutar sentencias en BBDD");
        // SET: PROGRAMA
        setLayout(new LayoutGridBag());
        setLocation(new Location());
        addForm(vprincipal=new FormVprincipal(this));
        }
    public ProgQueryintern(AppEasp easp)
        {
        this();
        this.easp=easp;
        }
    // GET: PROGRAMA
    // EVENT: PROGRAMA
    public void onInit ()
        {
        vprincipal.addControl(vvselect=new CtrlVvselect(vprincipal));
        vprincipal.addControl(vvresultado=new CtrlVvresultado(vprincipal));
        LayoutHtml lHtml = new LayoutHtml();
        lHtml.setContent(new java.io.StringReader(getHtml()));
        vprincipal.setLayout(lHtml);
        CheckGroup grup = new CheckGroup();
        grup.add(vprincipal.chaplic);
        grup.add(vprincipal.chea);
        grup.add(vprincipal.chmodelos);
        initChecksConnexio();
        super.onInit();
        }
    }
    
