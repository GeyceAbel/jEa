package mae.general.jreports;

import java.awt.Image;
import java.util.Vector;

import net.sf.jasperreports.view.JasperViewer;

import mae.easp.general.Easp;
import mae.modasp.general.Modasp;
import geyce.maefc.Aplication;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class PrintJasperWork {
	public PrintJasperDialog        dialog;
	public DBConnection conn;
	protected Vector <JasperViewer> vjv = new Vector<JasperViewer>();
	private boolean pestanaPDF=true;
	private boolean pestanaEXCEL=true;
	private boolean pestanaVISOR=true;
	private boolean pestanaImpresora=true;
	private boolean pestanaDOCX=true;
	protected Vector <JListado> vTarea;
	protected String destino;
	protected boolean abrir;
	protected boolean horizontal;
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
	protected boolean EXCEL_WHITE_BACKGROUND;
	protected boolean EXCEL_EMPTY_SPACE_ROWS;
	protected boolean EXCEL_EMPTY_SPACE_COL;
	

	private void showPanels(){
     	 for (int j=0;j<vjv.size();j++) {
         	   vjv.elementAt(j).setVisible(true);
         	 }
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

	public PrintJasperWork(String titulo,DBConnection conn) {
		vTarea = new Vector<JListado>();
		this.titulo = titulo;
		this.conn = conn;		
		this.tituloVistaPrevia = "Vista Previa";
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
	
	public void setExcelWhiteBackground(boolean whiteBackground) {
		this.EXCEL_WHITE_BACKGROUND = whiteBackground;
	}
	
	public void setExcelEmptySpaceRows(boolean emptySpaceRows) {
		this.EXCEL_EMPTY_SPACE_ROWS = emptySpaceRows;
	}
	
	public void setExcelEmptySpaceCol(boolean emptySpaceCol) {
		this.EXCEL_EMPTY_SPACE_COL = emptySpaceCol;
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
		horizontal = false;
		margenSuperior = 2;
		margenInferior = 1;
		margenIzquierdo = 2;
		margenDerecho = 1;
		tamañoLetra = 8;
		modifValores = true;
		iconoVistaPrevia = "/"+Aplication.getAplication().getIcon().getFileName();		
		//pestanaPDF = true;
		//pestanaEXCEL = true;
		//pestanaVISOR = true;
		//pestanaImpresora = true;
		//pestanaDOCX = true;
	}

	public void setVistapreviaTitulo(String title) {
		this.tituloVistaPrevia = title;
	}

	public PrintJasperDialog createDialog(Program prog) {
		PrintJasperDialog dialog = new PrintJasperDialog(this, prog);
		dialog.setpPDF(pestanaPDF);
		dialog.setpEXCEL(pestanaEXCEL);
		dialog.setpVISOR(pestanaVISOR);
		dialog.setpImpresora(pestanaImpresora);
		dialog.setpDOCX(pestanaDOCX);
		return dialog;
	}

	public void addListado (JListado listado) {
		vTarea.addElement(listado);
	}
}
