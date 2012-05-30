package mae.general;

import geyce.maefc.*;
import mae.easp.general.Easp;
import org.jawin.COMException;
import org.jawin.DispatchPtr;
import org.jawin.win32.Ole32;


import java.io.File;
import javax.print.*;
import java.awt.print.PrinterJob;


public class PdfCreator {
  private DispatchPtr app;
  private String savePdf;
  private String docFile;
  private String sDirectory;
  private String sDirectoryPdf;
  public boolean openBeforePrint=false;
  
  public PdfCreator() {
    
    }
  
  public boolean  creaPDF(String directoryDoc,String fileDoc, String directoryPdf,String filePdf) {
    docFile= fileDoc;
    savePdf=filePdf;
    sDirectory=directoryDoc;
    sDirectoryPdf=directoryPdf;
    createPdf();
    return true ;
	//printPDF();
  }
  /**
   * Crea un pdf a partir del document passat al constructor
   */
  private void createPdf() {
    try {
      //chech for pdfCreator printer
      if(checkPrinters("PDFCreator")) {
    	DispatchPtr classPdf = new DispatchPtr("PDFCreator.clsPDFCreator");	
    	classPdf.put("cVisible",false);
    	//check for unclosed instances of pdfCretor
  		boolean start = (Boolean)classPdf.invoke("cStart","/NoProcessingAtStartup");
  		if(start == false) {
  			//force to start pdfCreator
  			start = (Boolean)classPdf.invoke("cStart","/NoProcessingAtStartup",new Boolean(true));
  		    //classPdf.put("cVisible",false);  	
  		}
  		//config pdfCreator Options
  		configPrint(classPdf);
  		printPdf(classPdf);
  		//closePdf(classPdf);
      }
      else {
        //no PDFCreator printer. Show message and try to install it.
    	  
      }
    }
    catch(Exception ex) {
      System.out.println("Error al crear el fichero pdf :" + ex.getMessage());
      ex.printStackTrace();
    }
  }
  private void closePdf(DispatchPtr classPdf) throws Exception {
	  classPdf.invoke("cClose");  
	  classPdf.invoke("Nothing");
  }
  
  private void configPrint(DispatchPtr classPdf) throws Exception {
	  //Dim opt As PDFCreator.clsPDFCreatorOptions
	  classPdf.invoke("cClearLogfile");
	  DispatchPtr opt = new DispatchPtr("PDFCreator.clsPDFCreatorOptions");	
	  opt = (DispatchPtr) classPdf.get("cOptions");
	  opt.put("UseAutosave",1);
	  opt.put("UseAutosaveDirectory",1);
	  opt.put("AutosaveDirectory",sDirectoryPdf);
	  opt.put("AutosaveFileName",savePdf);
	  opt.put("AutosaveFormat",0);
	  opt.put("NoConfirmMessageSwitchingDefaultprinter",true);
	  opt.put("Logging",true);
	  classPdf.put("cOptions",opt);
	  classPdf.invoke("cSaveOptions",opt);
	  //classPdf.invoke("cSaveOptionsToFile","C:\\Documents and Settings\\apxavier\\Escritorio\\opt.txt");
	  //classPdf.invoke("cClearCache");
	 
	  
  }
  
  public void printPdf(DispatchPtr classPdf) throws Exception {
	try {
		Maefc.waitCursor(); 
		classPdf.put("cPrinterStop",new Boolean(true));
		//Ole32.CoInitialize();
	    DispatchPtr app = new DispatchPtr("Word.Application");
	    //app.put("Visible", false);
	    app.put("Visible", false);
		DispatchPtr documents = (DispatchPtr)app.get("Documents");
		DispatchPtr word = (DispatchPtr) documents.invoke("Open", sDirectory+docFile);			
		
		
		DispatchPtr dp = (DispatchPtr) app.get("ActiveDocument");
		
		//tratar 
		
		String currentPrinter = (String) app.get("ActivePrinter");
		app.put("ActivePrinter","PDFCreator");
		DispatchPtr printDocPdf = (DispatchPtr) dp.invoke("PrintOut", new Boolean(false));
		app.put("ActivePrinter",currentPrinter);
		classPdf.put("cPrinterStop",new Boolean(false));
		

		DispatchPtr dp3 = (DispatchPtr) word.invoke("Close",0);
		classPdf.invoke("cClose"); 
		app.invoke("Quit", new Integer(0));		
		Maefc.restoreCursor();
	  
	}
    finally {
	  if (app!=null)
		app.invoke("Quit", new Integer(0));
	  // Desinicialitzar OLE
	  //Ole32.CoUninitialize();
	  Maefc.restoreCursor();
    }
	  
	  
		//Set word = CreateObject("Word.Application")
		//Set word = wdo.Documents

	
	/*With Dialogs(wdDialogFilePrintSetup)
   .Printer = "HP DeskJet 670C Series v11.0 on LPT2:"
   .DoNotSetAsSysDefault =  True
   .Execute
	End With
	*/
	/*
		DispatchPtr printSetupTermp = (DispatchPtr) app.get("Dialogs");
		//DispatchPtr printSetupTermp2 = (DispatchPtr) printSetupTermp.invoke("wdDialogFilePrintSetup");
		DispatchPtr setupPrint = (DispatchPtr) printSetupTermp.get("Item");
		//DispatchPtr setupPrint2 = (DispatchPtr) printSetupTermp.get("wdDialogFilePrintSetup");
		//' Remember current active printer
		DispatchPtr printSetup = (DispatchPtr) app.get("WordBasic");
		DispatchPtr prevPrinter = (DispatchPtr) printSetup.invoke("FilePrintSetup","TS Printer PDF",new Integer(1));		
		//Set sPrevPrinter = wdo.ActivePrinter

		// Select the PDFCreator as your printer
		//documents.put("ActivePrinter","PDFCreator");
		//word.ActivePrinter = "PDFCreator"

		// Open the Word document
		//Set document = docs.Open(sMyDocumentFile)

		// Print the document file to the PDFCreator
		
		//word.ActiveDocument.PrintOut
		DispatchPtr printDocPdf = (DispatchPtr) dp.invoke("PrintOut");
		DispatchPtr dp3 = (DispatchPtr) word.invoke("Close",0);
		
		//word.put("ActivePrinter",prevPrinter);
		app.invoke("Quit",new Integer(0));
		//document.Close WdDoNotSaveChanges
		//word.ActivePrinter = sPrevPrinter
		//word.Quit WdDoNotSaveChanges
		 * 
	 */

    
  }
  
  private boolean checkPrinters(String Printer) throws Exception 
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

      // check for no printers
      /*
      if (ps.length == 0)
      {
          System.out.println ("<No Printers>");
      }

      System.out.println ();
      */
  }
  
  
  
}
