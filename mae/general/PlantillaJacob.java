package mae.general;

import geyce.maefc.DataForm;
import geyce.maefc.Maefc;
import geyce.maefc.Select;

import java.io.File;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import mae.easp.general.Easp;
import mae.general.PrintingDialogQuery.Icon;




public class PlantillaJacob extends Thread {
	private File fileTemplate;
	private ActiveXComponent oWord = null;
	private DataSource dataSource;
	private String urlTemplate;
	private PrintingDialogQuery	pd;
	//private File fileDocumentSave;
	private int typeDocument;  //0=letters  1=labels  2=sobres
	private boolean cancela=false;
	private boolean printDirecto=false;
	private int saveAs = 16;
	private String filePdf;
	private boolean overwritePDF;
	private double versionWord;
	private boolean openPdfFileAfterFinish = true;
	private String printer;
	private boolean showPrintDialog=true;
	
	/* tipus de format per a saveAS*/
    public static int  wdFormatDocument                    =  0;
    public static int  wdFormatDocument97                  =  0;
    public static int  wdFormatDocumentDefault             = 16;
    public static int  wdFormatDOSText                     =  4;
    public static int  wdFormatDOSTextLineBreaks           =  5;
    public static int  wdFormatEncodedText                 =  7;
    public static int  wdFormatFilteredHTML                = 10;
    public static int  wdFormatFlatXML                     = 19;
    public static int  wdFormatFlatXMLMacroEnabled         = 20;
    public static int  wdFormatFlatXMLTemplate             = 21;
    public static int  wdFormatFlatXMLTemplateMacroEnabled = 22;
    public static int  wdFormatHTML                        =  8;
    public static int  wdFormatPDF                         = 17;
    public static int  wdFormatRTF                         =  6;
    public static int  wdFormatTemplate                    =  1;
    public static int  wdFormatTemplate97                  =  1;
    public static int  wdFormatText                        =  2;
    public static int  wdFormatTextLineBreaks              =  3;
    public static int  wdFormatUnicodeText                 =  7;
    public static int  wdFormatWebArchive                  =  9;
    public static int  wdFormatXML                         = 11;
    public static int  wdFormatXMLDocument                 = 12;
    public static int  wdFormatXMLDocumentMacroEnabled     = 13;
    public static int  wdFormatXMLTemplate                 = 14;
    public static int  wdFormatXMLTemplateMacroEnabled     = 15;
    public static int  wdFormatXPS                         = 18;
    public static int  wdFormatOfficeDocumentTemplate      = 23;
    public static int  wdFormatMediaWiki                   = 24;
	
	/**
	 * Constructor plantilla sense origen de dades associat
	 */

	public PlantillaJacob (String urlTemplate) {
	  this.urlTemplate=urlTemplate;
	  if (urlTemplate!=null) {
		File file=new File(urlTemplate);
		if (file.exists()) this.urlTemplate = file.getAbsolutePath();
	  }	  
	}
	
	public PlantillaJacob (String urlTemplate, int documentType) {
	  this.urlTemplate=urlTemplate;
	  this.typeDocument = documentType;
	  if (urlTemplate!=null) {
		File file=new File(urlTemplate);
		if (file.exists()) this.urlTemplate = file.getAbsolutePath();
	  }
	}
	
	
	public PlantillaJacob(String fileDataSource, String typeTemplate) throws Exception {
		//fileDataSource = new File(urlSource);
		dataSource = new DataSource();
		dataSource.setUrlSource(fileDataSource);
		dataSource.dataType= dataSource.checkTypeDataSource(fileDataSource);
		dataSource.typeObjectTemplate= typeTemplate;
	}
	
	/**
	 * Constructor per crear un objecte plantilla a partir d'una select contruint un fitxer
	 * @param select 
	 * @param fileDataSource
	 * @param typeDataSource  //tipus de plantilla (QUERY, EXPEDIENT, CLIENT, TREBALLADOR, EMPRESA, ETC...)
	 */
	public PlantillaJacob (Select select, String fileDataSource, String typeTemplate) throws Exception {
		dataSource = new DataSource(fileDataSource, select, typeTemplate);
	}
	
	/**
   * Constructor per crear un objecte plantilla a partir d'una Clase Rows contruint un fitxer
   * @param select 
   * @param fileDataSource
   * @param typeDataSource  //tipus de plantilla (QUERY, EXPEDIENT, CLIENT, TREBALLADOR, EMPRESA, ETC...)
   */
  public PlantillaJacob (Rows rows, String fileDataSource, String typeTemplate) throws Exception {
    dataSource = new DataSource(fileDataSource, rows, typeTemplate);
    }
  
	
	/**
	 * Constructor per a crear un objecte plantilla a partir de una base de dades
	 * @param select
	 * @param dataBase
	 * @param user
	 * @param password
	 */
	public PlantillaJacob (Select select, String dataBase, String user, String password,String typeTemplate) throws Exception{
		dataSource = new DataSource(dataBase, select,typeTemplate);		
	}
	
	public PlantillaJacob (DataForm window,String fileDataSource, String typeTemplate) throws Exception{		
		//insertControl(window);
		dataSource = new DataSource(fileDataSource, window ,typeTemplate);
	}
	
	public DataSource getDataSource() {
	  return dataSource;	  
	}


	
	public void setDataSource (String origenDades) throws Exception{
		dataSource = new DataSource();
		dataSource.setUrlSource(origenDades);
		//dataSource.dataType= dataSource.checkTypeDataSource(origenDades.getAbsolutePath());
	}
	
	public void newDataSource(File fileDataSource) throws Exception{
	  dataSource = new DataSource();
	  dataSource.setFileDataSource(fileDataSource);
	}
	
	public void openTemplate() {
	  try {
		Maefc.waitCursor();
		desempaquetaDll();
		oWord = new ActiveXComponent("Word.Application"); 
		Dispatch oDocuments = oWord.getProperty("Documents").toDispatch();
		Dispatch oDocument;
		boolean existTemplate = existePlantilla();
		if(existTemplate)
		  oDocument = Dispatch.call(oDocuments, "Open", urlTemplate).toDispatch();
		/*si no existeix el template, el creem*/
		else {
		  oDocument = Dispatch.call(oDocuments, "Add").toDispatch();
		  Dispatch.call(oDocument, "SaveAs",new File(urlTemplate).getAbsolutePath());
		}
		if(dataSource != null) {
		  Dispatch activeDocument = oWord.getProperty("ActiveDocument").toDispatch();
		  Dispatch mailmerge = Dispatch.get(activeDocument,"MailMerge").toDispatch();
		  //If necessary, specify the target document's type
		    //mailmerge.setMainDocumentType(0); 
		              // wdFormLetters=0,  wdNotAMergeDocument = -1,
		              // wdMailingLabels = 1, wdEnvelopes = 2, wdCatalog = 3
		  
		  Dispatch.put(mailmerge,"MainDocumentType",typeDocument);
		  Dispatch.call(mailmerge, "OpenDataSource",dataSource.getUrlSource(),0,new Variant(false), new Variant(false),new Variant(true),new Variant(false),new Variant(""),new Variant(""),false,new Variant(""),new Variant(""),new Variant(""),new Variant(""),new Variant(""));
		  if(!existTemplate && typeDocument ==1) {
		    Dispatch.call(mailmerge,"ShowWizard",2,false,true, false,false,false,false);  
		  }
		  oWord.setProperty("Visible", new Variant(true));
		  Maefc.restoreCursor();
		  //boolean isSaveOnExit = true;
		  //Dispatch.call(oDocument, "Close", new Variant(isSaveOnExit));
		}
	  }
	  catch(Exception ex) {
	    if (oWord!=null) {
		  oWord.invoke("Quit", new Variant(0));  
		  oWord=null;
	      //Dispatch.call(oDocument, "Close", new Variant(false));
	    }
	    Maefc.restoreCursor();
        Maefc.message("Error al combinar: P�ngase en contacto con GEYCE","�Error!",Maefc.ERROR_MESSAGE);
        System.out.println("Error al combinar:" + ex.getMessage());
        ex.printStackTrace();
	  }
	}
	
	public void run() {
	  try {	
		Maefc.waitCursor();
		desempaquetaDll();
		//oWord = new ActiveXComponent("Word.Application"); 
		Dispatch oDocuments = oWord.getProperty("Documents").toDispatch();		
		oWord.setProperty("Visible", new Variant(false));
		pd.setLabelText("Abriendo plantilla...");		
		Dispatch oDocument = Dispatch.call(oDocuments, "Open", urlTemplate).toDispatch();	
		Dispatch activeDocument = oWord.getProperty("ActiveDocument").toDispatch();
		Dispatch mailmerge = Dispatch.get(activeDocument,"MailMerge").toDispatch();
		Dispatch.put(mailmerge,"MainDocumentType",typeDocument);
		pd.setLabelText("Abriendo origen de datos...");
		Dispatch.call(mailmerge, "OpenDataSource",dataSource.getUrlSource(),0,new Variant(false), new Variant(false),new Variant(true),new Variant(false),new Variant(""),new Variant(""),false,new Variant(""),new Variant(""),new Variant(""),new Variant(""),new Variant(""));
		pd.setLabelText("Combinando...");
		Dispatch.call(mailmerge,"Execute",true);
		pd.setLabelText("Finalizando...");
		Dispatch.call(oDocument,"Activate");
		Dispatch.call(oDocument,"Close",new Variant(0));				
		//oWord.setProperty("Visible", new Variant(true));
		
		//save to pdf			
		if(saveAs == wdFormatPDF) {
		  if(versionWord>12.0) {  //versions 2007 o superiors
		    Dispatch activeDocumentToPdf = oWord.getProperty("ActiveDocument").toDispatch();		  
		    Dispatch.call(activeDocumentToPdf,"SaveAs",filePdf,wdFormatPDF);
		    Dispatch.call(activeDocumentToPdf,"Activate");
		    Dispatch.call(activeDocumentToPdf,"Close",new Variant(0));
		    if (oWord!=null) {
  		      oWord.invoke("Quit", new Variant(0)); 
		      oWord=null;
		    }
		    if(openPdfFileAfterFinish) {
		    	Process p = Runtime
     			   .getRuntime()
     			   .exec("rundll32 url.dll,FileProtocolHandler " + filePdf);
     			p.waitFor();	
		    }
		  }
		  else { //versions 2003 o inferiors
			PdfCreator pdfCreator = new PdfCreator(); 
            boolean tienePdfCreator = false;
		    try {
		       tienePdfCreator = pdfCreator.checkPrinters("PDFCreator") ;
	        }
	        catch (Exception e ) {
		    }
	        if ( !tienePdfCreator ) {
	          if ( Maefc.message("No tiene instalado el PDFCreator \n \n Para Utilizar esta opci�n es necesario tenerlo instalado. \n \n � Desea Descargar ahora el programa de instalaci�n del PDFCreator ?","Atenci�n",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION ) {
	        	Runtime rt = Runtime.getRuntime();
	        	rt.exec( "rundll32 url.dll,FileProtocolHandler " + "http://www.pdfforge.org/");
	            //JExpe.abrirExplorer("http://www.pdfforge.org/",false);
	          }
	          return ;  
	        }
	        
	        Dispatch activeDocumentToPdf = oWord.getProperty("ActiveDocument").toDispatch();
	        File fileSaveDoc = new File(filePdf.replace(".pdf", ".doc"));
	        File fileSavePdf = new File(filePdf);
	        
		    Dispatch.call(activeDocumentToPdf,"SaveAs",fileSaveDoc.getAbsolutePath(),wdFormatDocumentDefault);
		    Dispatch.call(activeDocumentToPdf,"Activate");
		    Dispatch.call(activeDocumentToPdf,"Close",new Variant(0));
		    if (oWord!=null) {
  		      oWord.invoke("Quit", new Variant(0)); 
		      oWord=null;
		    }
	        boolean creado = pdfCreator.creaPDF(fileSaveDoc.getParent()+"\\", fileSaveDoc.getName(), fileSavePdf.getParent()+"\\", fileSavePdf.getName(),true ) ;
	        fileSaveDoc.delete();
	        if(creado && openPdfFileAfterFinish) {
	        	Process p = Runtime
	     			   .getRuntime()
	     			   .exec("rundll32 url.dll,FileProtocolHandler " + fileSavePdf.getAbsolutePath());
	     			p.waitFor();	
	        }
		  }
		}
		
		if(printDirecto) {
		  pd.setLabelText("Imprimiendo...");
		  Dispatch activeDocumentToPrint = oWord.getProperty("ActiveDocument").toDispatch();
		  String currentPrinter = oWord.getProperty("ActivePrinter").toString();
		  oWord.setProperty("ActivePrinter", printer);
		  oWord.setProperty("WindowState", 1);
		  Dispatch.call(activeDocumentToPrint,"PrintOut",new Variant(false));
		  oWord.setProperty("ActivePrinter", currentPrinter);
		  Dispatch.call(activeDocumentToPrint,"Activate");
		  Dispatch.call(activeDocumentToPrint,"Close",new Variant(0));
		  if (oWord!=null) {
		    oWord.invoke("Quit", new Variant(0)); 
		    oWord=null;
		  }
		}
		
		Maefc.restoreCursor();
	  }
	  catch (Exception ex){
	    if (oWord!=null && !cancela) {
		  oWord.invoke("Quit", new Variant(0));  
		  oWord = null;
		  ex.printStackTrace();
		  Maefc.restoreCursor();
		  Maefc.message("Error al combinar: " + ex.getMessage(),"�Error!",Maefc.ERROR_MESSAGE);
		}
	  }
	}
	
	public void executeMerge() {
	  try {	
		oWord = new ActiveXComponent("Word.Application"); 
		String oVersion = oWord.getProperty("Version").toString();
		versionWord = Double.parseDouble(oVersion);
		System.out.println("Version office = " + oVersion);
		cancela = false;		
		Icon icon = Icon.WORD;
		if(saveAs == wdFormatPDF) icon = Icon.PDF;
	    pd = new PrintingDialogQuery (this,icon);
	    pd.setTitle("Combinando documentos");
	    if(showPrintDialog)
	      pd.show();
	    else run();
	    if (oWord!=null)
	      oWord.setProperty("Visible", new Variant(true));
	  }
	  catch(Exception ex) {
		if (oWord!=null) {
		  oWord.invoke("Quit", new Variant(0));  
		  oWord=null;
		}
	    ex.printStackTrace();
	    System.out.println("Error  : " + ex.getMessage());
	  }
	   
	}
	
	public void tanca() {
	  if (oWord!=null) {
		oWord.invoke("Quit", new Variant(0)); 
		oWord =null;
	  }	  
	  cancela=true;
	}

	public boolean setFileTemplate(String urlTemplate) throws Exception{
	  this.urlTemplate = urlTemplate;
	  fileTemplate = new java.io.File(urlTemplate);
	  if(!fileTemplate.exists()) {
		  Easp.creaDirect(fileTemplate.getParent());
	    fileTemplate.createNewFile();
	    return true;
	  }
	  return false;
	}
	
	public File getFileTemplate() {
	  return fileTemplate;
	}

	public boolean existePlantilla() throws Exception {
	  File file=new File(urlTemplate);
	  return file.exists(); 
	}
	
	private void desempaquetaDll() throws Exception {
	  String destino=System.getProperty("user.dir")+"\\";
	  java.io.File fileDll=new java.io.File("jacob-1.17-M2-x86.dll");
	  if (!fileDll.exists()) {
	    Easp.setFileFromjar(destino,"jacob-1.17-M2-x86.dll",destino+"jacob-1.17-M2-x86.dll");
	    }
	  fileDll=new java.io.File("jacob-1.17-M2-x64.dll");
	  if (!fileDll.exists()) {
	    Easp.setFileFromjar(destino,"jacob-1.17-M2-x64.dll",destino+"jacob-1.17-M2-x64.dll");
	    }	
	}

	public void setPrintDirectly (boolean isPrint,String printer) {
		printDirecto=isPrint;
		this.printer=printer;
	}
	
	public void saveAs (int typeFile) {
		this.saveAs=typeFile;
	}
	
	public void savePdf(String urlPdf,boolean openPdfFileAfterFinish) {
		this.filePdf= urlPdf;
		this.saveAs = wdFormatPDF;
		this.openPdfFileAfterFinish =openPdfFileAfterFinish;
	}
	
	public void setShowPrintDialog(boolean show) {
		this.showPrintDialog = show;
	}
	
	public void setOpenFileAfterMerge(boolean openFile) {
		this.openPdfFileAfterFinish = openFile;
	}
	
  
}


 