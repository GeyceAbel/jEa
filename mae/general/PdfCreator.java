package mae.general;

import geyce.maefc.*;
import mae.general.Fecha;
import org.jawin.DispatchPtr;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.PrinterName;


import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import java.awt.print.PrinterJob;

public class PdfCreator {
  private DispatchPtr app;
  private DispatchPtr defaultOptions;
  private String savePdf;
  private String docFile;
  private String sDirectory;
  private String sDirectoryPdf;
  public boolean openBeforePrint=false;
  public boolean closePdfCreator = false ;
  
  public long milesimasDeEspera = 50000 ;
  public boolean mostrarXivatos = true ;
  private int iniNumJobsCola=0;
  private DispatchPtr classPdf ;
  
  public double  margenSuperior = 0.0 ; 
  public double  margenInferior = 0.0 ; 
  
  public PdfCreator() {
    
    }

  public boolean  creaPDF(String directoryDoc,String fileDoc, String directoryPdf,String filePdf) {
  	return creaPDF(directoryDoc,fileDoc,directoryPdf,filePdf,false);
    }
  
  
  
  
  public boolean  creaPDF(String directoryDoc,String fileDoc, String directoryPdf,String filePdf,boolean esperar_A_queTermine ) {
  	boolean retorn = false ;
  	
    docFile= fileDoc;
    savePdf=filePdf;
    sDirectory=directoryDoc;
    sDirectoryPdf=directoryPdf;
    
    if (mostrarXivatos ) System.out.println("");
    if (mostrarXivatos ) System.out.println("001   path: ["+directoryDoc+"]  fichero: ["+fileDoc+"] ficheroDest: ["+filePdf+"]  ["+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss:SSS")+"]");
    
    
    createPdf();
    
    if ( esperar_A_queTermine ) {
    	
      java.io.File fileDest=new java.io.File(directoryDoc+filePdf);
      java.util.Date fechaOrig = Maefc.getDateTime() ;
      long tiempoIni = System.currentTimeMillis();
      
      if (mostrarXivatos ) System.out.println("002   path: ["+directoryDoc+"]  fichero: ["+fileDoc+"] ficheroDest: ["+filePdf+"]  ["+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss:SSS")+"]");
      
      
      long segundos = 0 ;     
      boolean printa2 = true ;
      boolean  printa3 = true ;
      while ( !fileDest.exists() && (  segundos >= 0 &&  segundos < milesimasDeEspera ) ) {
      	
      	if ( printa2 && mostrarXivatos ) System.out.println("003     Existe Detino : ["+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss:SSS")+"] canWrite: ["+fileDest.canWrite()+"]");
      	//segundos = milesimasDiferencia(fechaOrig, Maefc.getDateTime() ) ;
      	segundos = milesimasDiferencia(tiempoIni, System.currentTimeMillis() ) ;
      	printa2 = false ;
      	boolean printa = true ;

      	while ( !fileDest.canWrite() && (  segundos > 0 &&  segundos < milesimasDeEspera ) )  {

      		if ( printa  && mostrarXivatos ) System.out.println("004             fichero enUso: ["+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss:SSS")+"]");
      		printa = false ;
      		//segundos = milesimasDiferencia(fechaOrig, Maefc.getDateTime() ) ;
      		segundos = milesimasDiferencia(tiempoIni, System.currentTimeMillis() ) ;
          }

      	if  ( printa3 && mostrarXivatos ) System.out.println("005          fin de fichero en Uso: ["+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss:SSS")+"] segundos: ["+segundos+"]");      
      	printa3 = false ;

      	if ( fileDest.exists() && fileDest.canWrite() ) {
      	
      		if ( mostrarXivatos ) System.out.println("006                 Ok Fichero creado correctamente : ["+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss:SSS")+"] segundos: ["+segundos+"]");      		
      		
      		retorn = true ;

      	  }
        }

      if ( mostrarXivatos ) System.out.println("007                    fin de no existe fichero: ["+Fecha.getHora(Maefc.getDateTime(),"HH:mm:ss:SSS")+"] segundos: ["+segundos+"]");      
      if ( mostrarXivatos ) System.out.println("");
      
      if ( fileDest.exists() ) retorn = true ;
      }
    	
      return retorn ;    	
      }
    
    
  public long milesimasDiferencia(long tiempoIni, long tiempoFin) {
    return tiempoFin - tiempoIni;
    
  }
  
  /**
   * Crea un pdf a partir del document passat al constructor
   */
  private void createPdf() {
    try {
      //chech for pdfCreator printer
      if ( classPdf == null ) {
    	  classPdf = new DispatchPtr("PDFCreator.clsPDFCreator");	
    	  classPdf.put("cVisible",false);
      }
      //check for unclosed instances of pdfCretor
  	  boolean start = (Boolean)classPdf.invoke("cStart","/NoProcessingAtStartup");
  	  if(start == false) {
  		//force to start pdfCreator
  		start = (Boolean)classPdf.invoke("cStart","/NoProcessingAtStartup",new Boolean(true));
  		//classPdf.put("cVisible",false);  	
  	  }
  	  //config pdfCreator Options
  	  Maefc.waitCursor(); 
  	  configPrint(classPdf);
  	  printPdf(classPdf);
  	  Maefc.restoreCursor();      
    }
    catch(Exception ex) {
      System.out.println("Error al crear el fichero pdf :" + ex.getMessage());
      ex.printStackTrace();
    }
  }
  
  private void configPrint(DispatchPtr classPdf) throws Exception {
	  //Dim opt As PDFCreator.clsPDFCreatorOptions
	  classPdf.invoke("cClearLogfile");	  
	  /*
	  if(!(Boolean)classPdf.invoke("cProfileExists","Geyce")) {
		  System.out.println("No existe profile Geyce, se crea uno");
		  classPdf.invoke("cAddProfile","Geyce");
	  }
	  */
	  
	  
	  
	  DispatchPtr opt = new DispatchPtr("PDFCreator.clsPDFCreatorOptions");
	  //defaultOptions = new DispatchPtr("PDFCreator.clsPDFCreatorOptions");
	  //defaultOptions = (DispatchPtr) classPdf.get("cOptions");
	  
	  
	  
	  opt = (DispatchPtr) classPdf.get("cOptions");
	  opt.put("UseAutosave",1);
	  opt.put("UseAutosaveDirectory",1);
	  opt.put("AutosaveDirectory",sDirectoryPdf);
	  opt.put("AutosaveFileName",savePdf);
	  opt.put("AutosaveFormat",0);
	  opt.put("NoConfirmMessageSwitchingDefaultprinter",true);
	  opt.put("Logging",true);
	  classPdf.put("cOptions",opt);
	  
	  //classPdf.invoke("cSaveOptions",opt,"Geyce");
	  //classPdf.invoke("cSaveOptionsToFile","C:\\Documents and Settings\\apxavier\\Escritorio\\opt.txt");
	  //classPdf.invoke("cClearCache");
	 
	  
  }
  
  public void printPdf(DispatchPtr classPdf) throws Exception {
	try {
		
		classPdf.put("cPrinterStop",new Boolean(true));	
		iniNumJobsCola = (Integer)classPdf.get("cCountOfPrintjobs");
		//classPdf.put("cPrinterStop",new Boolean(true));
	    DispatchPtr app = new DispatchPtr("Word.Application");
	    app.put("Visible", false);
		DispatchPtr documents = (DispatchPtr)app.get("Documents");
		DispatchPtr word = (DispatchPtr) documents.invoke("Open", sDirectory+docFile);
		DispatchPtr dp = (DispatchPtr) app.get("ActiveDocument");
		//tratar 
		String currentPrinter = (String) app.get("ActivePrinter");
		app.put("ActivePrinter","PDFCreator");
		//opcions al word
		// margenInferior = 36.18;		
		  
		if  ( margenSuperior > 0.0 || margenInferior  > 0.0 ) {	
		  try {
			DispatchPtr pagesetup = (DispatchPtr) word.get("PageSetup");			
			if  ( margenSuperior > 0.0 ) pagesetup.put("TopMargin" ,margenSuperior);			
			if ( margenInferior  > 0.0 ) pagesetup.put("BottomMargin",margenInferior );
		  }
		  catch ( Exception e ) {
			System.out.println("Error propoerties Margin: ["+e+"]");			
		  }
		}
		
		
		DispatchPtr printDocPdf = (DispatchPtr) dp.invoke("PrintOut", new Boolean(false));
		
		app.put("ActivePrinter",currentPrinter);	
		
		//wait or invoke in arrays				
		while(queuedJobCount("PDFCreator")!=0) {
			//System.out.println("Esperando a la impresora word  ["+queuedJobCount("PDFCreator")+"]");
		}		
		iniNumJobsCola++;
		
		while((Integer)classPdf.get("cCountOfPrintjobs") != iniNumJobsCola) {
			//System.out.println("ordenes= [" + (Integer)classPdf.get("cCountOfPrintjobs") + "]     cola pdfCreator = [" + iniNumJobsCola + "]");
		}
		classPdf.put("cPrinterStop",new Boolean(false));		
		while((Integer)classPdf.get("cCountOfPrintjobs") != 0) {
			//System.out.println("Esperando cola de impresion  ["+System.currentTimeMillis()+"]");
			//System.out.println(queuedJobCount("PDFCreator"));
		}
		DispatchPtr dp3 = (DispatchPtr) word.invoke("Close",0);
		classPdf.put("cPrinterStop",new Boolean(true));
		//if ( closePdfCreator ) classPdf.invoke("cClose"); 
		app.invoke("Quit", new Integer(0));		
		
	  
	}
    finally {
	  if (app!=null)
		app.invoke("Quit", new Integer(0));
	  Maefc.restoreCursor();
    }
    
  }

  
  
  public void close() {
	try {
	  classPdf.invoke("cClose");
	  killProcess("PDFCreator.exe");
	}
	catch (Exception ex ) {
      System.out.println("Error close pdfCreator : " +ex);	
    }
  }

 
  public int queuedJobCount (String printName)throws Exception {
	  String attributeValue ="0";
	  
	  /*
	  PrintService printer = PrintServiceLookup.lookupDefaultPrintService();
	   */
	  PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);

      // buscar por el nombre de la impresora (nombre que le diste en tu S.O.)
      // en "aset" puedes agregar mas atributos de busqueda
      AttributeSet aset = new HashAttributeSet();
      aset.add(new PrinterName(printName, null));
      //aset.add(ColorSupported.SUPPORTED); // si quisieras buscar ademas las que soporten color
      AttributeSet att=null;
      services = PrintServiceLookup.lookupPrintServices(null, aset);
      for (PrintService printService : services)      
	    att = printService.getAttributes();
    		  //PrintServiceAttributeSet printServiceAttributeSet =printService.getAttributes();
	  for (Attribute a : att.toArray()) {

	    String attributeName;  

	    attributeName = a.getName();
	    if(attributeName.equals("queued-job-count")) {
	      attributeValue = att.get(a.getClass()).toString();
	      break;
	    }
	  }
	  return Integer.valueOf(attributeValue);
  }
  
  public boolean checkPrinters(String Printer) throws Exception 
  {
      boolean check = false;
      // List printers
      PrintService [] ps = PrinterJob.lookupPrintServices();
      for (int count = 0; count < ps.length; ++count)
      {
    	  if(Printer.equals(ps [count].getName())) {
    		  check =true;
    		  break;
    	  }          
      }
      return check;
  } 
  
  public void killProcess(String serviceName)  throws Exception{
	if(isProcessRunning(serviceName))  
	  Runtime.getRuntime().exec("taskkill /IM " + serviceName);
  }
  
  public boolean isProcessRunning(String serviceName) throws Exception {
	Process p = Runtime.getRuntime().exec("tasklist");
	java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));
	String line;
	while ((line = reader.readLine()) != null) {	   
	  if (line.contains(serviceName)) {
	    return true;
	  }
	}
	return false;
  }


}
