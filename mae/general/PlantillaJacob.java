package mae.general;

import geyce.maefc.DataForm;
import geyce.maefc.Maefc;
import geyce.maefc.Select;

import java.io.File;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
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
	private int typeDocument;  //0=letters  1=labels  2=sobres  4=emails
	private boolean cancela=false;
	private boolean printDirecto=false;
	private int saveAs = 999;
	private String fileSaveAs;
	private boolean overwritePDF;
	private String oVersion;
	private String oBuild;
	//private double versionWord;
	private boolean openPdfFileAfterFinish = true;
	private String printer;
	private boolean showPrintDialog=true;
	private String password = null;
	private boolean esEmail = false;
	private String esSubject = "";
	private File fileDocumentSave;
	
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
    
    
    public static int  wdSendToEmail					   = 2 ;
    public static int  wdMailFormat					  	   = 1 ;
	
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
		ComThread.InitMTA();
		oWord = new ActiveXComponent("Word.Application"); 
		Dispatch oDocuments = oWord.getProperty("Documents").toDispatch();
		Dispatch oDocument;
		boolean existTemplate = existePlantilla();
		if(existTemplate)
		  oDocument = Dispatch.call(oDocuments, "Open", urlTemplate,new Variant(false)).toDispatch();
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
        Maefc.message("Error al combinar: Póngase en contacto con GEYCE","¡Error!",Maefc.ERROR_MESSAGE);
        System.out.println("Error al combinar:" + ex.getMessage());
        ex.printStackTrace();
	  }
	  finally {
		ComThread.Release();  
	  }
	}
	
	
	public void run() {
	  try {		  
		Maefc.waitCursor();	
		
		//ComThread.InitMTA();
		//oWord = new ActiveXComponent("Word.Application"); 
		//oVersion = oWord.getProperty("Version").toString();
		//versionWord = Double.parseDouble(oVersion);
		//oBuild = oWord.getProperty("Build").toString();
		//System.out.println("Version word = " + oBuild);
		
		//oWord = new ActiveXComponent("Word.Application"); 
		Dispatch oDocuments = oWord.getProperty("Documents").toDispatch();		
		oWord.setProperty("Visible", new Variant(false));
		pd.setLabelText("Abriendo plantilla...");		
		Dispatch oDocument = Dispatch.call(oDocuments, "Open", urlTemplate,new Variant(false)).toDispatch();	
		Dispatch activeDocument = oWord.getProperty("ActiveDocument").toDispatch();
		
		
		if(password != null)
		    Dispatch.put(activeDocument, "WritePassword", new Variant(password));
		Dispatch mailmerge = Dispatch.get(activeDocument,"MailMerge").toDispatch();
		Dispatch.put(mailmerge,"MainDocumentType",typeDocument);
		
		//Dispatch.put(mailmerge,"MainDocumentType",4);
		
		
		
		pd.setLabelText("Abriendo origen de datos...");
		Dispatch.call(mailmerge, "OpenDataSource",dataSource.getUrlSource(),0,new Variant(false), new Variant(false),new Variant(true),new Variant(false),new Variant(""),new Variant(""),false,new Variant(""),new Variant(""),new Variant(""),new Variant(""),new Variant(""));
		//
		
		if(esEmail){
			Dispatch.put(mailmerge, "Destination", wdSendToEmail);
			Dispatch.put(mailmerge, "MailFormat", wdMailFormat);
			Dispatch.put(mailmerge, "MailAddressFieldName", "email");
			Dispatch.put(mailmerge, "MailSubject", esSubject);
		}
			pd.setLabelText("Combinando...");
			Dispatch.call(mailmerge,"Execute",true);
			pd.setLabelText("Finalizando...");
			Dispatch.call(oDocument,"Activate");
			
			Dispatch.call(oDocument,"Close",new Variant(0));
			//oWord.setProperty("Visible", new Variant(true));
			
			//Dispatch activeDocument2 = oWord.getProperty("ActiveDocument").toDispatch();
			/*
			Dispatch mailEnvelope = Dispatch.get(activeDocument,"MailEnvelope").toDispatch();
			Dispatch item = Dispatch.get(mailEnvelope,"Item").toDispatch();
			Dispatch.put(item,"Subject","Hola a todos");
			Dispatch recipents = Dispatch.get(item,"Recipients").toDispatch();
			Dispatch.call(recipents,"Add","sergio.ramon@geyce.es");
			Dispatch.call(item,"Send");*/
				
			//oWord.setProperty("Visible", new Variant(true));
			
			//save to pdf		
			if(saveAs != 999) {
			  boolean creado =false;
				Dispatch activeDocumentOpen = oWord.getProperty("ActiveDocument").toDispatch();
			    if(saveAs != wdFormatPDF ) {		      
			      saveActiveDocumentAS(activeDocumentOpen, fileSaveAs, saveAs);
			      creado = true;
			    }
			    else {
			      String[] tokensVersion = oBuild.split("[.]");
				  int versionOutlook1 = Integer.parseInt(tokensVersion[0]);
				  int versionOutlook2 = Integer.parseInt(tokensVersion[1]);
				  int versionOutlook3 = Integer.parseInt(tokensVersion[2]);
				  if((versionOutlook1==12 && versionOutlook3>6424) || versionOutlook1>=13 ) {
				  //if(false){
					//versions 2007 o superiors
					  saveActiveDocumentAS(activeDocumentOpen, fileSaveAs, saveAs);
					  creado = true;
				  }
				  else {
					//versions 2003 o inferiors
					PdfCreator pdfCreator = new PdfCreator(); 
		            boolean tienePdfCreator = false;
				    try {
				       tienePdfCreator = pdfCreator.checkPrinters("PDFCreator") ;
			        }
			        catch (Exception e ) {
				    }
			        if ( !tienePdfCreator ) {
			          if ( Maefc.message("No tiene instalado el PDFCreator \n \n Para Utilizar esta opción es necesario tenerlo instalado. \n \n ¿ Desea Descargar ahora el programa de instalación del PDFCreator ?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION ) {
			        	Runtime rt = Runtime.getRuntime();
			        	rt.exec( "rundll32 url.dll,FileProtocolHandler " + "http://www.pdfforge.org/");
			            //JExpe.abrirExplorer("http://www.pdfforge.org/",false);
		              }
			          return ;  
			        }
			        File fileSaveDoc = File.createTempFile("pdfCreator", ".doc");
			        //File fileSaveDoc = new File(fileSaveAs.replace(".pdf", ".doc"));
			        File fileSavePdf = new File(fileSaveAs);				        
			        saveActiveDocumentAS(activeDocumentOpen, fileSaveDoc.getAbsolutePath(), wdFormatDocument);
				    if (oWord!=null) {
		  		      oWord.invoke("Quit", new Variant(0)); 
				      oWord=null;
				    }
			        creado = pdfCreator.creaPDF(fileSaveDoc.getParent()+"\\", fileSaveDoc.getName(), fileSavePdf.getParent()+"\\", fileSavePdf.getName(),true ) ;		        
			        fileSaveDoc.deleteOnExit();
			        pdfCreator.close();
				  }
			    }
			    if (oWord!=null) {
	  		      oWord.invoke("Quit", new Variant(0)); 
			      oWord=null;
			      ComThread.Release();
			    }
			    if(creado && openPdfFileAfterFinish) {
			    	Process p = Runtime
	     			   .getRuntime()
	     			   .exec("rundll32 url.dll,FileProtocolHandler " + fileSaveAs);
	     			p.waitFor();	
			    }		    
			}
			/*
			if(saveAs == wdFormatPDF) {			
			  String[] tokensVersion = oVersion.split("[.]");
			  int versionOutlook1 = Integer.parseInt(tokensVersion[0]);
			  int versionOutlook2 = Integer.parseInt(tokensVersion[1]);
			  //int versionOutlook3 = Integer.parseInt(tokensVersion[2]);
			  //if(versionWord>12.0) {  //versions 2007 o superiors
			  if((versionOutlook1>11 && versionOutlook2>6424) || versionOutlook1>=12 ) {  //versions 2007 o superiors
			    Dispatch activeDocumentToPdf = oWord.getProperty("ActiveDocument").toDispatch();		  
			    Dispatch.call(activeDocumentToPdf,"SaveAs",fileSaveAs,wdFormatPDF);
			    Dispatch.call(activeDocumentToPdf,"Activate");
			    Dispatch.call(activeDocumentToPdf,"Close",new Variant(0));
			    if (oWord!=null) {
	  		      oWord.invoke("Quit", new Variant(0)); 
			      oWord=null;
			    }
			    if(openPdfFileAfterFinish) {
			    	Process p = Runtime
	     			   .getRuntime()
	     			   .exec("rundll32 url.dll,FileProtocolHandler " + fileSaveAs);
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
		          if ( Maefc.message("No tiene instalado el PDFCreator \n \n Para Utilizar esta opción es necesario tenerlo instalado. \n \n ¿ Desea Descargar ahora el programa de instalación del PDFCreator ?","Atención",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION) == Maefc.YES_OPTION ) {
		        	Runtime rt = Runtime.getRuntime();
		        	rt.exec( "rundll32 url.dll,FileProtocolHandler " + "http://www.pdfforge.org/");
		            //JExpe.abrirExplorer("http://www.pdfforge.org/",false);
		          }
		          return ;  
		        }
		        
		        Dispatch activeDocumentToPdf = oWord.getProperty("ActiveDocument").toDispatch();
		        File fileSaveDoc = new File(fileSaveAs.replace(".pdf", ".doc"));
		        File fileSavePdf = new File(fileSaveAs);
		        
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
			
			*/
			
			else if(printDirecto) {
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
			else 
				if(esEmail){
					 oWord.invoke("Quit", new Variant(0));
				}else{
					oWord.setProperty("Visible", new Variant(true));
				}
			  
			Maefc.restoreCursor();
		  }
		  catch (Exception ex){
		    if (oWord!=null && !cancela) {
			  oWord.invoke("Quit", new Variant(0));  
			  oWord = null;
			  ComThread.Release();
			  ex.printStackTrace();
			  Maefc.restoreCursor();
			  Maefc.message("Error al combinar: " + ex.getMessage(),"¡Error!",Maefc.ERROR_MESSAGE);
			}
		  }
	  
	}
	
	public void executeMerge() {
	  try {	
		desempaquetaDll();
		ComThread.InitMTA();
		oWord = new ActiveXComponent("Word.Application"); 
		oVersion = oWord.getProperty("Version").toString();
		//versionWord = Double.parseDouble(oVersion);
		oBuild = oWord.getProperty("Build").toString();
		System.out.println("Version word = " + oBuild);
		cancela = false;		
		Icon icon = Icon.WORD;
		if(saveAs == wdFormatPDF) icon = Icon.PDF;
	    pd = new PrintingDialogQuery (this,icon);
	    pd.setTitle("Combinando documentos");
	    if(showPrintDialog)
	      pd.show();
	    else run();
	    //if (oWord!=null)
	      //oWord.setProperty("Visible", new Variant(true));
	  }
	  catch(Exception ex) {
		ex.printStackTrace();
		if (oWord!=null) {
		  oWord.invoke("Quit", new Variant(0));  
		  oWord=null;
		}
	    ex.printStackTrace();
	    System.out.println("Error  : " + ex.getMessage());
	  }
	  finally {
		//if(saveAs==999 && !printDirecto) 
		  ComThread.Release();
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
	
	private void desempaquetaDll() {
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
	
	public void saveAs (int typeFile,String urlPdf,boolean openPdfFileAfterFinish) {
		this.saveAs=typeFile;
		this.fileSaveAs= urlPdf;
		this.openPdfFileAfterFinish =openPdfFileAfterFinish;
	}
	/*
	public void savePdf(String urlPdf,boolean openPdfFileAfterFinish) {
		this.filePdf= urlPdf;
		this.saveAs = wdFormatPDF;
		this.openPdfFileAfterFinish =openPdfFileAfterFinish;
	}
	*/
	public void setShowPrintDialog(boolean show) {
		this.showPrintDialog = show;
	}
	
	public void setOpenFileAfterMerge(boolean openFile) {
		this.openPdfFileAfterFinish = openFile;
	}
	
	public void setPassword(String password) {
		this.password= password;
	}
	
	private void saveActiveDocumentAS(Dispatch activeDocument,String fileSaveAs,int format) throws Exception {
	    Dispatch.call(activeDocument,"SaveAs",fileSaveAs,format);
	    Dispatch.call(activeDocument,"Activate");
	    Dispatch.call(activeDocument,"Close",new Variant(0));	
	}
  
	public void setTypeDocument(int type) {
		this.typeDocument = type;
	}
	
	public void setEmail(boolean isMergeEmail) {
		this.esEmail = isMergeEmail;
	}
	
	public void setSubject(String subject){
		this.esSubject = subject;
	}
	/*
	public void createDocumentSave(String url) throws Exception{
		  fileDocumentSave = new java.io.File(url);
			if(!fileDocumentSave.exists()) {
		     JExpe.creaDirect(fileDocumentSave.getParent());
		     fileDocumentSave.createNewFile();
			}
		}
		*/
}


 