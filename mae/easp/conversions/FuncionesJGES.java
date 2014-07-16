package mae.easp.conversions;

import geyce.maefc.Aplication;
import geyce.maefc.Catalog;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.ErrorManager;

import mae.easp.db.CatEasp;
import mae.easp.db.CatJexpe;



public class FuncionesJGES {
	DBConnection connEA;
	String dominio;
	public DBConnection connJGes=null;

	public FuncionesJGES(DBConnection connEA, String dominio) {
		this.connEA = connEA;
		this.dominio = dominio;
		if(connJGes == null) 
			setConnectJGestion();		
	}


  public static DBConnection getConnexio(String nombd, DBConnection connEA) {
    String server = connEA.getDB().getServer() ;
  	String dsn = connEA.getDB().getDsn();
	  	
    return(conectaBD(nombd, connEA.getDB().getServer(), connEA.getDB().getUser(), connEA.getDB().getPassword(), connEA.getDB().getType())); 
  }
	  
  public static DBConnection conectaBD(String bdnom, String bdserver, String bduser, String bdpassword, String bdtype) {
     ErrorManager actual = Aplication.getAplication().getErrorManager();
    //mae.jexpe.general.JExpeError errorManager = new mae.jexpe.general.JExpeError();
    //Aplication.getAplication().setErrorManager(errorManager);		  	
    DataBase db=new DataBase();
    db.setName(bdnom);
    db.setMyServer(bdserver);
    db.setUser(bduser);
    db.setMyPassword(bdpassword);
    db.setType(bdtype);
    DBConnection conn=new DBConnection(db);
   
    if (bdnom.equals("easp")) {
      CatJexpe catexpe = new CatJexpe();
      CatEasp cateasp = new CatEasp();
      Catalog array[] = {catexpe,cateasp};
      db.setCatalogs(array);
    }     

    
    conn=new DBConnection(db);
    // return null ;
    if (conn.connect()) {
    	Aplication.getAplication().setErrorManager(actual);
    	return conn;
    }
    else {
    	Aplication.getAplication().setErrorManager(actual);
    	return null;
    }    
  }
		  
  public boolean setConnectJGestion() {
  	try {
  		connJGes = getConnexio("easp",Aplication.getAplication().getDataBase() ) ;
  		if ( connJGes != null ) return true;
  	}
  	catch (Exception e ) {
  		//Easp.debug("Error conectandoo BD");
  	  e.printStackTrace();
  	}
  	return false;
  }


}
