package mae.general;

import java.util.*;
import mae.easp.general.Easp;
import geyce.maefc.*;

import java.io.*;


public class DataSource {
	public static final int DATAFILE =1;
	public static final int DATABASE =2;
	public static final int DATASHEET =3;
	public static final int DATASQLSERVER =4;
	
	public static final int WINDOW= 10;
	public static final int SELECT = 11;
	
	//public Array fieldsList;
	public String typeObjectTemplate;
	private String urlSource =null;
	public Select select;	
	public int dataType;
	private File fileDataSource;
	public ArrayList<ControlValue> controls;
	public Rows rows ;
	private DataForm panel; //finestra amb els controls i dades que pasem
	public int typeWindowSelect;//si l'origen de dades s'ha muntat a partir d'una finestra o d'una select.
	private int numMergeFields = 0; //numero de camps de la finestra o select de combinació.
	
	public DataSource() {

	}
	
	
	public DataSource (String absolutePath, Rows asociatedRows, String typeTemplate) {
    this.urlSource = absolutePath;
    // this.select = asociatedSelect;
    this.dataType=checkTypeDataSource(absolutePath);
    this.rows = asociatedRows ;
    this.typeObjectTemplate= typeTemplate;
    this.typeWindowSelect = SELECT;
    if(dataType == DATAFILE) {
      checkDataSource();
    }
    //faltar implementar per als altres tipus de origens de dades.
  }
  
	
	public DataSource (String absolutePath, Select asociatedSelect, String typeTemplate) {
		this.urlSource = absolutePath;
		this.select = asociatedSelect;
		this.dataType=checkTypeDataSource(absolutePath);
		this.typeObjectTemplate= typeTemplate;
		this.typeWindowSelect = SELECT;
		if(dataType == DATAFILE) {
			checkDataSource();
		}
		//faltar implementar per als altres tipus de origens de dades.
	}
	
	public DataSource (String absolutePath,DataForm window, String typeTemplate) {
		this.urlSource = absolutePath;
		this.panel = window;
		insertControl();
		this.dataType=checkTypeDataSource(absolutePath);
		this.typeObjectTemplate= typeTemplate;	
		this.typeWindowSelect = WINDOW;
		if(dataType == DATAFILE) {
			checkDataSource();
		}
		//faltar implementar per als altres tipus de origens de dades.
	}
	
	private void insertControl(){
	  controls = new ArrayList<ControlValue>();
	  //controls = new ControlValue[panel.];
      new ControlValueIterator(panel) {    	
    	int i =0;
        public boolean action(ControlValue c) {        	
          controls.add(c);
          i++;
          return true;
        }
      }.run();      
	}
	
	public String getTypeObjectTemplate () {
		return typeObjectTemplate;
	}
	

	public void setFileDataSource(File fileSource) throws Exception {
		this.fileDataSource = fileSource;
		this.urlSource = fileSource.getAbsolutePath();
	}
	
	
	
	public void checkDataSource() {
	  try {
	    fileDataSource = new File(urlSource);
	    if(!fileDataSource.exists()) {
	    	Easp.creaDirect(fileDataSource.getParent());
	      fileDataSource.createNewFile();
	    }
	    if(select != null) {
    	  select.execute();
		  if(select.getNumRows() >0) {  //hi ha resultats a la select -> monta el fitxer		  
		    mountDataFile(false); 
		  }
	    }
	    else if(controls != null) {
	      mountControls(false);
	    }
      else if(rows != null) {
        mountRows(false);
      }
	  }
	  catch(Exception ex) {
    	System.out.println("Error ioexception:"+ex);
    	Maefc.message("Error ioexception:"+ex,"Error",Maefc.ERROR_MESSAGE);  
	  }
	}
		
	public File getFileSource() {
	  if(urlSource != null) return fileDataSource;
	  else return null;	  
	}
	
	public String getUrlSource() {
	  if(urlSource != null) return urlSource;
	  else return null;	  
	}
	
	public void setUrlSource(String absolutePath) throws Exception {
	  urlSource = absolutePath;	  
	  fileDataSource = new File(urlSource);
      if(!fileDataSource.exists()) {
	   	Easp.creaDirect(fileDataSource.getParent());
	    fileDataSource.createNewFile();
	  }
	}
	
	public Integer checkTypeDataSource(String absolutePath){
	  if (absolutePath.contains(".txt")) return DATAFILE;
	  if (absolutePath.contains(".mdb")) return DATABASE;
	  if (absolutePath.contains(".xls")) return DATASHEET;	 
	  if (absolutePath.contains(".csv")) return DATAFILE;
	  else return null;
	}
	
	public void mountControls(boolean append){		
	  //BufferedWriter out = new BufferedWriter(new FileWriter(fileDataSource));
	  int numRows= panel.getNumRows();
	  PrintWriter fileout=null;
	  try {
	  fileout = new PrintWriter(new BufferedWriter(new FileWriter(fileDataSource,append)));
	  String cadena ="";	  
	  numMergeFields = controls.size();
	  for(int i=0;i<controls.size();i++){		
	    if(controls.get(i).getTitle()==null)
		  cadena +="\""+"\"" + ";";   
		else
	      cadena +="\""+controls.get(i).getTitle()+"\"" + (i+1==controls.size()?"":";");
	  }	  
	  fileout.println(cadena);	  
	  for(int x=0 ; x<numRows ; x++){
		panel.setCurrentRow(x);
		insertControl();
		cadena="";
	    for(int z=0;z<controls.size();z++) {
	      if(controls.get(z).getValue()==null)
	        cadena +="\""+"\"" + (z+1==controls.size()?"":";");
	      else
	      cadena +="\""+controls.get(z).getValue()+"\"" + (z+1==controls.size()?"":";");
	    }
	    fileout.println(cadena);
	  }
	  fileout.flush();
	  fileout.close();
	  }
   	  catch (java.io.IOException e) {
    	System.out.println("Error ioexception:"+e);
    	Maefc.message("Error ioexception:"+e,"Error",Maefc.ERROR_MESSAGE);
    	fileout.close();
	  }
	  catch (NullPointerException npe) {
	    System.out.println("El argumento no es valido:"+npe);
	    fileout.close();
	  }
	  catch (Exception ex) {
		System.out.println("DataSource exception:"+ex);  
		fileout.close();
	  }
	}
	
	public void mountRows(boolean append){   
    //BufferedWriter out = new BufferedWriter(new FileWriter(fileDataSource));
    int numRows= rows.cantidad() ;
    PrintWriter fileout=null;
    try {
    fileout = new PrintWriter(new BufferedWriter(new FileWriter(fileDataSource,append)));
    String cadena ="";    
    numMergeFields =  rows.obtiene(0).cantidad()  ;
    for(int i=0;i<rows.obtiene(0).cantidad();i++){   
      // if(rows.obtiene(0).obtiene(i).nombre==null)
      cadena +="\""+rows.obtiene(0).obtiene(i).nombre+"\"" + (i+1==rows.obtiene(0).cantidad()?"":";");
      }   
    fileout.println(cadena);    
    for(int x=0 ; x<numRows ; x++){

    cadena="";
      for(int z=0;z<rows.obtiene(x).cantidad() ;z++) {
        String valor = rows.obtiene(x).obtiene(z).valor ;
        if(valor==null)
          cadena +="\""+"\"" + (z+1==rows.obtiene(x).cantidad()?"":";");
        else
        cadena +="\""+valor+"\"" + (z+1==rows.obtiene(x).cantidad()?"":";");
      }
      fileout.println(cadena);
    }
    fileout.flush();
    fileout.close();
    }
      catch (java.io.IOException e) {
      System.out.println("Error ioexception:"+e);
      Maefc.message("Error ioexception:"+e,"Error",Maefc.ERROR_MESSAGE);
      fileout.close();
    }
    catch (NullPointerException npe) {
      System.out.println("El argumento no es valido:"+npe);
      fileout.close();
    }
    catch (Exception ex) {
    System.out.println("DataSource exception:"+ex);  
    fileout.close();
    }
  }
	
	
	private void mountDataFile(boolean append){		
		  //BufferedWriter out = new BufferedWriter(new FileWriter(fileDataSource));
		  PrintWriter fileout=null;
		  try {
		  fileout = new PrintWriter(new BufferedWriter(new FileWriter(fileDataSource,append)));
		  String cadena ="";
		  numMergeFields = select.getNumColumns();
		  for(int i=0;i<select.getNumColumns();i++){			
		    cadena +="\""+select.getColumn(i).getName()+"\"" + (i+1==select.getNumColumns()?"":";");  
		  }	  
		  fileout.println(cadena);	  
		  while(!select.isEof()){
			cadena="";
		    for(int z=0;z<select.getNumColumns();z++) {
		      if(select.getColumn(z).isNull() || select.getColumn(z).getStringValue().equals(""))
		        cadena +="\""+"\"" + (z+1==select.getNumColumns()?"":";");   
		      else
		      cadena +="\""+select.getColumn(z).getStringValue().trim()+"\"" + (z+1==select.getNumColumns()?"":";");   
		    }
		    fileout.println(cadena);
		    select.next();
		  }
		  fileout.flush();
		  fileout.close();
		  }
	   	  catch (java.io.IOException e) {
	    	System.out.println("Error ioexception:"+e);
	    	Maefc.message("Error ioexception:"+e,"Error",Maefc.ERROR_MESSAGE);
	    	fileout.close();
		  }
		  catch (NullPointerException npe) {
		    System.out.println("El argumento no es valido:"+npe);
		    fileout.close();
		  }
		  catch (Exception ex) {
			System.out.println("DataSource exception:"+ex);  
			fileout.close();
		  }
		}
	
	public int getNumFields() throws Exception {
		BufferedReader br = new BufferedReader( new FileReader(urlSource));
		int tokenNumber = 0;		
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, ";");
		if(!line.equals("") && line != null && !line.contains(";"))
		  tokenNumber = 1;
		else {
		  while(st.hasMoreTokens())
	 	  {
		    tokenNumber++;	
		    st.nextToken();
		  }
		}
		numMergeFields = tokenNumber;
	  return numMergeFields;
	}
	
	//funcion que enlaza el final de un archivo con nuevos datos (selects)
	public void appendSelect(Select newSelect) throws Exception {
		this.select = newSelect;
		select.execute();
		if(select.getNumRows() >0)
		  mountDataFile(true);
	}
}