package mae.general;

import geyce.maefc.*;

import mae.easp.general.Easp;

import org.jawin.COMException;
import org.jawin.DispatchPtr;
import org.jawin.Variant;
import org.jawin.win32.Ole32;
import java.io.File;
import java.util.ArrayList;
import java.util.Vector;

public class Plantilla {

	private File fileTemplate;
	private DispatchPtr app = null;
	private DataSource dataSource;
	private String urlTemplate;
	private File fileDocumentSave;
	
	/**
	 * Constructor plantilla sense origen de dades associat
	 */
	public Plantilla () {
	}
	
	public Plantilla (String urlTemplate) {
	  this.urlTemplate=urlTemplate;
	}
	
	
	public Plantilla(String fileDataSource, String typeTemplate) throws Exception {
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
	public Plantilla (Select select, String fileDataSource, String typeTemplate) throws Exception {
		dataSource = new DataSource(fileDataSource, select, typeTemplate);
	}
	
	/**
	 * Constructor per a crear un objecte plantilla a partir de una base de dades
	 * @param select
	 * @param dataBase
	 * @param user
	 * @param password
	 */
	public Plantilla (Select select, String dataBase, String user, String password,String typeTemplate) throws Exception{
		dataSource = new DataSource(dataBase, select,typeTemplate);		
	}
	
	public Plantilla (DataForm window,String fileDataSource, String typeTemplate) throws Exception{		
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
	
	public void openTemplate() throws Exception{
	  try {			
		Ole32.CoInitialize();
	    DispatchPtr app = new DispatchPtr("Word.Application");
	    app.put("Visible", true);
		DispatchPtr documents = (DispatchPtr)app.get("Documents");
		DispatchPtr word = (DispatchPtr) documents.invoke("Open", urlTemplate);
		if(dataSource != null) {
		  DispatchPtr mailmerge = (DispatchPtr) word.get("MailMerge");		
		  DispatchPtr source = (DispatchPtr) mailmerge.invoke("OpenDataSource",dataSource.getUrlSource());	
		}
		Ole32.CoUninitialize();
	  }
	  finally {		
		// Sortir de word sense gravar
		if (app!=null)
			app.invoke("Quit", new Integer(0));
		// Desinicialitzar OLE
		Ole32.CoUninitialize();
	  }
	}
	
	public void executeMerge() throws Exception{
	  try {	
		Maefc.waitCursor();  
		Ole32.CoInitialize();
	    DispatchPtr app = new DispatchPtr("Word.Application");
	    app.put("Visible", false);
		DispatchPtr documents = (DispatchPtr)app.get("Documents");
		DispatchPtr word = (DispatchPtr) documents.invoke("Open", urlTemplate);		
		DispatchPtr mailmerge = (DispatchPtr) word.get("MailMerge");
	    DispatchPtr source = (DispatchPtr) mailmerge.invoke("OpenDataSource",dataSource.getUrlSource());	
	    //source.invoke("ConfirmConversions","false");
	    //mailmerge.invoke("Destination",new Integer(0));
		DispatchPtr combine = (DispatchPtr) mailmerge.invoke("Execute");
		DispatchPtr dp = (DispatchPtr) app.get("ActiveDocument");
			
		dp.invoke("SaveAs", fileDocumentSave.getAbsolutePath());
		app.invoke("Quit",new Integer(0));		
		Ole32.CoUninitialize();
		Maefc.restoreCursor();
		abrirFichero(fileDocumentSave.getAbsolutePath());	  
	  }
	  catch (Exception ex){
		Ole32.CoUninitialize();
		ex.printStackTrace();
		Maefc.restoreCursor();
		Maefc.message("Error: " + "Asegurese de que el fichero " + urlTemplate + "\n no esté en uso por otra aplicación o usuario.","¡Error!",Maefc.ERROR_MESSAGE);
	  }
	  finally {		
		// Sortir de word sense gravar
		if (app!=null)
			app.invoke("Quit", new Integer(0));
		// Desinicialitzar OLE
		Ole32.CoUninitialize();
		Maefc.restoreCursor();
	  }
	}
	
	public void createDocumentSave(String url) throws Exception{
	  fileDocumentSave = new java.io.File(url);
		if(!fileDocumentSave.exists()) {
			Easp.creaDirect(fileDocumentSave.getParent());
	     fileDocumentSave.createNewFile();
		}
	}
	
	public File getDocumentSave() {
	  return fileDocumentSave;
	}
	
	public void newTemplate() throws Exception{
		Maefc.waitCursor();
		Ole32.CoInitialize();
	    DispatchPtr app = new DispatchPtr("Word.Application");
	    app.put("Visible", false);
		DispatchPtr documents = (DispatchPtr)app.get("Documents");
		DispatchPtr word = (DispatchPtr) documents.invoke("Add");	
		word.invoke("SaveAs", new File(urlTemplate).getAbsolutePath());
		app.invoke("Quit");
		Ole32.CoUninitialize();
		Maefc.restoreCursor();
	 /* finally {		
		// Sortir de word sense gravar
		if (app!=null)
			app.invoke("Quit", new Integer(0));
		// Desinicialitzar OLE
		Ole32.CoUninitialize();
	  }		*/
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
	
	private static void abrirFichero(String url) {
	    try{
	      int retorn=Windows.ShellExecute("open",url,null,null,Windows.SW_SHOWNORMAL);
	      
	      if ( retorn == 2 ) {
	      	abrirExplorer(url,false);
	      	return ;
	        }
	      if (retorn > 32) return;
	      else {
	        switch (retorn) {
	          case 0:  System.out.println("Sistema Operativo con problemas de memoria ");
	            break;
	          case Windows.ERROR_FILE_NOT_FOUND:  System.out.println("El fichero no existe");
	            break;
	          case Windows.ERROR_PATH_NOT_FOUND:  System.out.println("La ruta del fichero no es correcta");
	            break;
	          case Windows.SE_ERR_NOASSOC:  System.out.println("No hay ninguna aplicación asociada a la extensión de este fichero. Este error ocurrirá además si se trata de imprimir un fichero que no es imprimible");
	            break;
	          }
	        }
	      }
	    catch(Exception e ) {
	      System.out.println("Error Windows.ShellExecute: ["+e+"]");
	      }
	  }
	
	 private static void abrirExplorer(String url,boolean modal ) {
	    try {
	      String pathExplorer = "c:\\Archivos de Programa\\Internet Explorer\\IEXPLORE.EXE";
	      
	      if (!existeFichero(pathExplorer)) pathExplorer= "c:\\Program Files\\Internet Explorer\\IEXPLORE.EXE";
	      
	      if (!existeFichero(pathExplorer)) pathExplorer=Easp.getParam("PATHEXPLORER","GENERAL");
	      
	      if (!existeFichero(pathExplorer)) {
	        Maefc.message("No tiene instalado Microsoft Internet Explorer en su ubicación por defecto.\nPóngase en contacto con Geyce para poder utilizar esta opción.\n\nGracias.");
	        // pathExplorer=Easp.getParam("PATHEXPLORER","GENERAL");
	        }
	      String [] params=new String[]{pathExplorer,url};
	      if ( modal ) {
	        Process p=Runtime.getRuntime().exec(params);
	        p.waitFor();
	        }
	      else {
	        Process p=Runtime.getRuntime().exec(params);
	        }
	      }
	    catch (SecurityException ex) {
	      System.out.println("Error security exception:"+ex);
	      }
	    catch (java.io.IOException e) {
	      System.out.println("Error ioexception:"+e);
	      }
	    catch (InterruptedException iex) {
	      System.out.println("Error InterruptedException:"+iex);
	      }
	    catch (Exception  e2) {
	      System.out.println("Error exception:"+e2);
	      }
	  }
	
	 private static boolean existeFichero(String archivo) {
	   try {
	     File file=new File(archivo);
	     return file.exists();
	     }
	   catch (SecurityException se) {
	     System.out.println("Error al localizar el fichero "+archivo+" "+se);
	     return false;
	     }
	   }
	 
	 public boolean existePlantilla() throws Exception {
	   File file=new File(urlTemplate);
	   return file.exists(); 
	 }
	 
     public boolean fileAsociation() throws Exception{
	   fileTemplate = new java.io.File(urlTemplate);
	   if(!fileTemplate.exists()) {
		  Easp.creaDirect(fileTemplate.getParent());
	      this.newTemplate();
	      return true;
	    }
	    return false;
      }
}