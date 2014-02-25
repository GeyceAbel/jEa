package mae.general.jreports;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Vector;

import net.sf.jasperreports.view.JasperViewer;

import mae.easp.general.Easp;
import geyce.maefc.Aplication;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class PrintJasperWork {
	public PrintJasperDialog        dialog;
	public DBConnection conn;
	public File xmlDataSourceFile;
	public String xmlNodeLoop;
	protected Vector <JasperViewer> vjv = new Vector<JasperViewer>();
	private boolean pestanaPDF=true;
	private boolean pestanaEXCEL=true;
	private boolean pestanaVISOR=true;
	private boolean pestanaImpresora=true;
	private boolean pestanaDOCX=true;
	private boolean pestanaTXT=false;
	private boolean pestanaEMIR=false;
	protected Vector <JListado> vTarea;
	protected String destino;
	protected boolean abrir;	
	protected double margenSuperior;
	protected double margenInferior;
	protected double margenIzquierdo;
	protected double margenDerecho;
	protected int tamañoLetra;
	protected boolean modifValores;
	protected String titulo;
	protected String tituloVistaPrevia;
	protected String iconoVistaPrevia;	
	private boolean showDialeg =true; 
	protected boolean isVistaPrevia=false;
	public String  parametroPaginaInicial;
	public boolean multiPaginaExcel = false;
    public LinkedHashMap<String,String[]> fieldsNameLength;
    public boolean horizontal=false;
	protected int empresa;
	protected String aplicacio;
	private boolean isQuery=false;
    
	
	private void showPanels(){
     	 for (int j=0;j<vjv.size();j++) {
         	   vjv.elementAt(j).setVisible(true);
         	 }
	}

	public void setQuery(boolean isQuery) {
		this.isQuery = isQuery;
	}
	
	public boolean isQuery() {
		return isQuery;
	}
	
	public void setPestanaPDF(boolean pestanaPDF) {
		this.pestanaPDF = pestanaPDF;
	}

	public void setPestanaEXCEL(boolean pestanaEXCEL) {
		this.pestanaEXCEL = pestanaEXCEL;
	}

	public void setPestanaVISOR(boolean pestanaVISOR) {
		this.pestanaVISOR = pestanaVISOR;
	}

	public void setPestanaImpresora(boolean pestanaImpresora) {
		this.pestanaImpresora = pestanaImpresora;
	}

	public void setPestanaDOCX(boolean pestanaDOCX) {
		this.pestanaDOCX = pestanaDOCX;
	}
	
	public void setPestanaEMIR (int empresa, String aplicacio) {
		this.pestanaEMIR = true;
		this.empresa = empresa;
		this.aplicacio = aplicacio;
	}
	
	public void setPestanaTXT(boolean pestanaTXT,LinkedHashMap<String,String[]> fieldsNameLength,File xmlFileDataSource) {
		this.pestanaTXT = pestanaTXT;
		this.fieldsNameLength = fieldsNameLength;
		xmlDataSourceFile = xmlFileDataSource;
	}

	public PrintJasperWork(String titulo,DBConnection conn) {
		vTarea = new Vector<JListado>();
		this.titulo = titulo;
		this.conn = conn;		
		this.tituloVistaPrevia = "Vista Previa";
		multiPaginaExcel = false;
	}
	
	public PrintJasperWork(String titulo,File xmlDataSourceFile,String nodeLoop) {
		vTarea = new Vector<JListado>();
		this.titulo = titulo;
		this.xmlDataSourceFile = xmlDataSourceFile;	
		this.xmlNodeLoop = nodeLoop;
		this.tituloVistaPrevia = "Vista Previa";
		multiPaginaExcel = false;
	}

	public void dialog (Program program) {
		setDefaults();
		dialog = this.createDialog(program);
		dialog.showDialog();
		if(isVistaPrevia)
		  showPanels();
	}
	
	public boolean isShowDialeg(){
		return showDialeg;
	}

	public void vistaPrevia() {
		showDialeg =false;
		PrintJasperPanelVisor panel = new  PrintJasperPanelVisor(this);
		panel.onImprimir();
		showPanels();		
	}

	private void setDefaults() {
		destino=System.getProperty("user.dir")+"\\listado_"+Easp.getNomPC();
		abrir = true;
		//horizontal = false;
		margenSuperior = 1;
		margenInferior = 1;
		margenIzquierdo = 1;
		margenDerecho = 1;
		tamañoLetra = 8;
		modifValores = true;
		iconoVistaPrevia = "/"+Aplication.getAplication().getIcon().getFileName();		
	}

	public void setVistapreviaTitulo(String title) {
		this.tituloVistaPrevia = title;
	}

	public PrintJasperDialog createDialog(Program prog) {
		PrintJasperDialog dialog = new PrintJasperDialog(this, prog,isQuery);
		dialog.setpPDF(pestanaPDF);
		dialog.setpEXCEL(pestanaEXCEL);
		dialog.setpVISOR(pestanaVISOR);
		dialog.setpImpresora(pestanaImpresora);
		dialog.setpDOCX(pestanaDOCX);
		dialog.setpTXT(pestanaTXT);
		dialog.setpEMIR(pestanaEMIR);
		//dialog.setQuery(isQuery);
		return dialog;
	}

	public void addListado (JListado listado) {
		vTarea.addElement(listado);
	}

	public boolean runBackgroundExcel(Program pr, String nombre) {
		PrintJasperPanelXLS panel = new PrintJasperPanelXLS (this);
		panel.creaControls();
		panel.destino.setValue(nombre);
		return panel.onGenerar(true);
	}

	public boolean runBackgroundPdf (Program pr, String nombre) {
		PrintJasperPanelPDF panel = new PrintJasperPanelPDF (this);
		panel.creaControls();
		panel.destino.setValue(nombre);
		return panel.onImprimir(true);
	}
}
