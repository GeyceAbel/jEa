package mae.general.jreports;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Vector;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

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
	public boolean mirMasivo =false;
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
	public ArrayList<Object> relacionEmpresas;
	public File resultEnvioEmir;
	protected String prefixNomFitxer;
	protected String titolMir;
	public int extraPercentWithColumnExcel;
	public short tamanyMinimFontExcel;
	public boolean editarExcelAlFinalizar;
	
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
	
	public void setPestanaEMIRMasivo (ArrayList<Object> relacionEmpresas, String aplicacio,String titolMir,String prefixNomFitxer) throws Exception {
		this.pestanaEMIR = true;
		this.relacionEmpresas = relacionEmpresas;
		this.aplicacio = aplicacio;
		this.mirMasivo = true;
		this.prefixNomFitxer = prefixNomFitxer;
	    this.titolMir = titolMir;		
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
		extraPercentWithColumnExcel = 0;
		tamanyMinimFontExcel = 0;
		editarExcelAlFinalizar = false;
	}
	
	public PrintJasperWork(String titulo,File xmlDataSourceFile,String nodeLoop) {
		vTarea = new Vector<JListado>();
		this.titulo = titulo;
		this.xmlDataSourceFile = xmlDataSourceFile;	
		this.xmlNodeLoop = nodeLoop;
		this.tituloVistaPrevia = "Vista Previa";
		multiPaginaExcel = false;
		extraPercentWithColumnExcel = 0;
		tamanyMinimFontExcel = 0;
		editarExcelAlFinalizar = false;
	}
	
	public Vector<JListado> getListados () {
		return vTarea;
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
	  
	  String usuario = Easp.usuario ;
	  
	  try {
	    if ( usuario == null || usuario.equals("") ) {   
	      usuario = mae.general.Fecha.getHora(geyce.maefc.Maefc.getDateTime(),"HHmmss");
	      }
	    }
	  catch(Exception e) {
	    
	   }
	  
		destino=System.getProperty("user.dir")+"\\listado_"+Easp.getNomPC()+"_"+usuario;
		
	  destino = destino.toLowerCase();
	  destino = destino.replace("ñ", "n");
	  destino = destino.replace("á", "a");
	  destino = destino.replace("à", "a");
	  destino = destino.replace("é", "e");
	  destino = destino.replace("è", "e");
	  destino = destino.replace("í", "i");
	  destino = destino.replace("ì", "i");
	  destino = destino.replace("ó", "o");
	  destino = destino.replace("ò", "o");
	  destino = destino.replace("ú", "u");
	  destino = destino.replace("ù", "u");
		
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
	
	public JListado runBackgroundList (Program pr) {
		setDefaults();
		PrintJasperPanelPDFQuer panel = new PrintJasperPanelPDFQuer (this);
		panel.creaControls();
		return panel.getListado();
	}
	
	public double addPercentWithExcelColumn () {
		return extraPercentWithColumnExcel;
	}
	
	public short getTamanyMinimFontExcel () {
		return tamanyMinimFontExcel;
	}
	
	protected int endOfRow(HSSFSheet sheet) { 
		int lastRowNum = sheet.getLastRowNum(); 
		if (lastRowNum> 0) return (lastRowNum + 1); 
		else return sheet.getPhysicalNumberOfRows()> 0 ? 1 : 0; 
	} 

	protected int endOfColumn(HSSFSheet sheet) { 
		int rowCount = endOfRow(sheet); 
		int maxCellNum = 0; 
		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) { 
			HSSFRow row = sheet.getRow(rowIndex); 
			if (row != null) maxCellNum = Math.max(maxCellNum, row.getLastCellNum()); 
		} 
		return maxCellNum; 
	} 

	public void editXLS2000 (String ruta) {
		try {
			FileInputStream inp = new FileInputStream(ruta);
			HSSFWorkbook wb = new HSSFWorkbook(inp); 					
			if (getTamanyMinimFontExcel()>0) {
				for (int i=0;i<wb.getNumberOfSheets();i++) {			        	
					HSSFSheet sheet = wb.getSheetAt(i);
					int numRows = endOfRow(sheet);
					int numCols = endOfColumn(sheet);
					for (int j=0;j<numRows;j++) {
						HSSFRow row = sheet.getRow(j);
						for (int k=0;k<numCols;k++) {
							HSSFCell cell = row.getCell(k);
							if (cell != null) {
								HSSFCellStyle style = cell.getCellStyle();
								if (style != null) {
									HSSFFont font = style.getFont(wb);
									if (font != null && font.getFontHeightInPoints()<getTamanyMinimFontExcel()) {
										font.setFontHeightInPoints(getTamanyMinimFontExcel());
									}
								}
							}
						}
					}
					if (numRows>0 && numCols>0) {
						HSSFCell cell = sheet.getRow(0).getCell(numCols);
						if (cell == null) cell = sheet.getRow(0).createCell(numCols);
						if (cell != null) {
							cell.setCellType(CellType.BLANK);
							sheet.setColumnHidden(numCols, false);
							sheet.setColumnWidth(numCols, 2000);		
						}
					}
					for (int k=0;k<numCols;k++) sheet.autoSizeColumn(k);
				}
			}
			if (addPercentWithExcelColumn() > 0) {
				for (int i=0;i<wb.getNumberOfSheets();i++) {			        	
					HSSFSheet sheet = wb.getSheetAt(i);						
					int numCols = endOfColumn(sheet);					
					for (int j=0;j<numCols;j++) {
						sheet.setColumnWidth(j, sheet.getColumnWidth(j) + (int)(addPercentWithExcelColumn() * sheet.getColumnWidth(j) / 100));							
					}			        	
				}
			}
			FileOutputStream fous =  new FileOutputStream(ruta);
			wb.write(fous);
			fous.close();
			inp.close();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void editXLS2007 (String ruta) {
	}
	
	/*	 
	protected int endOfRow(XSSFSheet sheet) { 
		int lastRowNum = sheet.getLastRowNum(); 
		if (lastRowNum> 0) return (lastRowNum + 1); 
		else return sheet.getPhysicalNumberOfRows()> 0 ? 1 : 0; 
	} 

	protected int endOfColumn(XSSFSheet sheet) { 
		int rowCount = endOfRow(sheet); 
		int maxCellNum = 0; 
		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) { 
			XSSFRow row = sheet.getRow(rowIndex); 
			if (row != null) maxCellNum = Math.max(maxCellNum, row.getLastCellNum()); 
		} 
		return maxCellNum; 
	} 
	 
	public void editXLS2007 (String ruta) {
		try {
			FileInputStream inp = new FileInputStream(ruta);
			XSSFWorkbook wb = new XSSFWorkbook(inp); 					
			if (getTamanyMinimFontExcel()>0) {
				for (int i=0;i<wb.getNumberOfSheets();i++) {			        	
					XSSFSheet sheet = wb.getSheetAt(i);
					int numRows = endOfRow(sheet);
					int numCols = endOfColumn(sheet);
					for (int j=0;j<numRows;j++) {
						XSSFRow row = sheet.getRow(j);
						for (int k=0;k<numCols;k++) {
							XSSFCell cell = row.getCell(k);
							if (cell != null) {
								XSSFCellStyle style = cell.getCellStyle();
								if (style != null) {
									XSSFFont font = style.getFont();
									if (font != null && font.getFontHeightInPoints()<getTamanyMinimFontExcel()) {
										font.setFontHeightInPoints(getTamanyMinimFontExcel());
									}
								}
							}
						}
					}
					if (numRows>0 && numCols>0) {
						XSSFCell cell = sheet.getRow(0).getCell(numCols);
						if (cell == null) cell = sheet.getRow(0).createCell(numCols);
						if (cell != null) {
							cell.setCellType(XSSFCell.CELL_TYPE_BLANK);
							sheet.setColumnHidden(numCols, false);
							sheet.setColumnWidth(numCols, 2000);		
						}
					}
					for (int k=0;k<numCols;k++) sheet.autoSizeColumn(k);
				}
			}
			if (addPercentWithExcelColumn() > 0) {
				for (int i=0;i<wb.getNumberOfSheets();i++) {			        	
					XSSFSheet sheet = wb.getSheetAt(i);						
					int numCols = endOfColumn(sheet);					
					for (int j=0;j<numCols;j++) {
						sheet.setColumnWidth(j, sheet.getColumnWidth(j) + (int)(addPercentWithExcelColumn() * sheet.getColumnWidth(j) / 100));							
					}			        	
				}
			}
			FileOutputStream fous =  new FileOutputStream(ruta);
			wb.write(fous);
			fous.close();
			inp.close();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	protected void editXLS(String ruta, boolean esExcel2007) {
		if (esExcel2007) editXLS2007(ruta);
		else editXLS2000(ruta);
	}
}
