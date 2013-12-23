package mae.general;

import geyce.maefc.DataForm;
import geyce.maefc.Maefc;
import geyce.maefc.Select;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import mae.easp.general.Easp;


public class PlantillaJacob extends Thread {
	private File fileTemplate;
	private ActiveXComponent oWord = null;
	private DataSource dataSource;
	private String urlTemplate;
	private PrintingDialogQuery	pd;
	//private File fileDocumentSave;
	private int typeDocument;  //0=letters  1=labels  2=sobres
	private boolean cancela=false;
	
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
		  Dispatch.call(mailmerge, "OpenDataSource",dataSource.getUrlSource(),0,false, false,true,false,new Variant(""),new Variant(""),false,new Variant(""),new Variant(""),new Variant(""),new Variant(""),new Variant(""));
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
	      //Dispatch.call(oDocument, "Close", new Variant(false));
	    }
	    Maefc.restoreCursor();
        Maefc.message("Error al combinar: Póngase en contacto con GEYCE","¡Error!",Maefc.ERROR_MESSAGE);
        System.out.println("Error al combinar:" + ex.getMessage());
        ex.printStackTrace();
	  }
	}
	
	public void run() {
	  try {	
		Maefc.waitCursor();
		desempaquetaDll();
		oWord = new ActiveXComponent("Word.Application"); 
		Dispatch oDocuments = oWord.getProperty("Documents").toDispatch();
		oWord.setProperty("Visible", new Variant(false));
		pd.setLabelText("Abriendo plantilla...");
		Dispatch oDocument = Dispatch.call(oDocuments, "Open", urlTemplate).toDispatch();	
		Dispatch activeDocument = oWord.getProperty("ActiveDocument").toDispatch();
		Dispatch mailmerge = Dispatch.get(activeDocument,"MailMerge").toDispatch();
		Dispatch.put(mailmerge,"MainDocumentType",typeDocument);
		pd.setLabelText("Abriendo origen de datos...");
		Dispatch.call(mailmerge, "OpenDataSource",dataSource.getUrlSource(),0,false, false,true,false,new Variant(""),new Variant(""),false,new Variant(""),new Variant(""),new Variant(""),new Variant(""),new Variant(""));
		pd.setLabelText("Combinando...");
		Dispatch.call(mailmerge,"Execute",true);
		pd.setLabelText("Finalizando...");
		Dispatch.call(oDocument,"Activate");
		Dispatch.call(oDocument,"Close",new Variant(0));				
		//oWord.setProperty("Visible", new Variant(true));
		Maefc.restoreCursor();
	  }
	  catch (Exception ex){
	    if (oWord!=null && !cancela) {
		  oWord.invoke("Quit", new Variant(0));  
		  oWord = null;
		  ex.printStackTrace();
		  Maefc.restoreCursor();
		  Maefc.message("Error al combinar: Póngase en contacto con GEYCE","¡Error!",Maefc.ERROR_MESSAGE);
		}
	  }
	}
	
	public void executeMerge() {
	  try {	
		cancela = false;
	    pd = new PrintingDialogQuery (this);
	    pd.setTitle("Combinando documentos");
	    pd.show();
	    if (oWord!=null)
	      oWord.setProperty("Visible", new Variant(true));
	  }
	  catch(Exception ex) {
		if (oWord!=null) {
		  oWord.invoke("Quit", new Variant(0));  
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

	
  
}


 