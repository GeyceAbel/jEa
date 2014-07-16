package mae.easp.conversions;

import java.util.StringTokenizer;

import geyce.maefc.Aplication;
import geyce.maefc.Catalog;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.ErrorManager;
import geyce.maefc.Field;
import geyce.maefc.Select;
import geyce.maefc.Selector;
import geyce.maefc.Table;
import mae.easp.db.CatLaboral;
import mae.easp.general.Easp;
import mae.contaasp.db.CatCtasp;
import mae.general.Numero;



public class FuncionesJNOM {
	DBConnection connEA;
	String dominio;
	public DBConnection connJNomina=null;

	public FuncionesJNOM(DBConnection connEA, String dominio) {
		this.connEA = connEA;
		this.dominio = dominio;
		if(connJNomina == null) 
			setConnectJNomina();
		
	}

	public DBConnection getConectionJCO_ACCESS ( String sNomBD, String sUbicacion) {
		DataBase db=new DataBase();
		db.setName(sNomBD);
		db.setMyServer(sUbicacion);
		db.setType("access");
		CatCtasp catctasp = new CatCtasp();
		Catalog array[] = {catctasp};
		db.setCatalogs(array);
		DBConnection conn=new DBConnection(db);
		try {
			if (conn.connect()) return conn;
			else return null;
		}
		catch (Exception e) {
			return null;
		}
	}

	public int copiarFichero(String fileIni, String fileFin, boolean rewrite) {
		java.io.BufferedInputStream filein=null;
		java.io.BufferedOutputStream fileout=null;
		try {
			java.io.File fileOri=new java.io.File(fileIni);
			java.io.File fileDest=new java.io.File(fileFin);
			Easp.creaDirect(fileOri.getParent());
			Easp.creaDirect(fileDest.getParent());			
			if (!fileOri.exists())	return -1; //no existe el fichero origen
			if (!rewrite && fileDest.exists()) {
				return -2; //el fichero de destino ya existe y no se debe sobreescribir
			}
			else  {
				filein=new java.io.BufferedInputStream(new java.io.FileInputStream(fileOri));
				fileout=new java.io.BufferedOutputStream(new java.io.FileOutputStream(fileDest));
				do{
					int byt=filein.read();
					if (byt==-1) break;
					fileout.write(byt);
				} while (true);
			}
			return 1;    //copia correcta
		}
		catch (Exception e){
			System.out.println(e);
			return -3;      //error al tratar de copiar el fichero
		}
		finally {
			try {
				if(filein != null) filein.close();
				if(fileout != null) {
					fileout.flush();
					fileout.close();
				}
			}
			catch (Exception e){
				System.out.println(e);
			}
		}
	}

	public DBConnection getConexionCtasp ( int emp, int ejer) {
		DBConnection db = null;
		Selector s = new Selector (connEA);
		s.execute("Select * from bdscargadas where bdaplic='contaasp' and bddominio='"+dominio.substring(0,6)+Numero.format(emp, "000000")+"' and bdejer="+ejer);
		if (s.next()) db = getConexionCtasp(s.getString("bdbdnom"), s.getString("bdbdserv"), s.getString("bdbduser"), s.getString("bdbdpass"), s.getString("bdtipo"));
		s.close();
		return db;
	}

	public DBConnection getConexionCtasp ( String sNom, String sServer, String sUser, String sPasswd,String sTipus) {
		DataBase db=new DataBase();
		db.setName(sNom);
		db.setMyServer(sServer);
		db.setUser(sUser);
		db.setMyPassword(sPasswd);
		db.setType(sTipus);
		CatCtasp catctasp = new CatCtasp();
		Catalog array[] = {catctasp};
		db.setCatalogs(array);

		DBConnection conn=new DBConnection(db);
		try {
			if (conn.connectEx()) return conn;
			else return null;
		}
		catch (Exception e) {
			return null;
		}
	}  

	public String[] separaNom(String nom) {
		String composicio [] = {"","",""};
		if (nom!=null && !"".equals(nom.trim())) {
			int npos = mae.general.Util.sch(nom,',');
			if (npos!=-1) {
				String apellidos = nom.substring(0,npos);
				StringTokenizer st = new StringTokenizer (apellidos," ");
				while (st.hasMoreTokens()) {
					String sTmp = st .nextToken();
					if ("".equals(composicio[0])) composicio[0] = sTmp;
					else if ("".equals(composicio[1])) composicio[1] = sTmp;
				}
				composicio[2] = nom.substring(npos+1).trim();
			}
			else {
				StringTokenizer st = new StringTokenizer (nom," ");
				while (st.hasMoreTokens()) {
					String sTmp = st .nextToken();
					if ("".equals(composicio[0])) composicio[0] = sTmp;
					else if ("".equals(composicio[1])) composicio[1] = sTmp;
					else if ("".equals(composicio[2])) composicio[2] = sTmp;
				}
			}
		}

		return composicio;
	}

  public String nombreEmpresa(String nifcif) {
	if (nifcif==null) return null;
	Select snifes   = new Select(connEA);
	Table tnifes    = new Table(snifes,"nifes");
	Field datnombre = new Field(snifes,tnifes,"datnombre");
	Field datapell1 = new Field(snifes,tnifes,"datapell1");
	Field datapell2 = new Field(snifes,tnifes,"datapell2");
	snifes.setWhere("danifcif='"+nifcif+"'");
	snifes.execute();
	if (snifes.isEof())
		return null;
	else {
		if (datnombre.isNull())
			return datapell1.getString();
		else
			return datapell1.getString()+" "+datapell2.getString()+", "+datnombre.getString();
	}
  }

	public boolean checkBDSql (int ejercicio) {
        boolean conectaOk = true;
        DBConnection conntmp = getConexionCtasp ( 9999, ejercicio );
        conectaOk = (conntmp != null);
        if (conectaOk) {
            conectaOk = "sqlserver".equals(conntmp.getDB().getType());
            conntmp.disconnect ();
        }
        return conectaOk;
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
   
    if (bdnom.equals("laboral")) {
      CatLaboral catlaboral = new CatLaboral();
      Catalog array[] = {catlaboral};
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
		  
  public boolean setConnectJNomina() {
  	try {
  		connJNomina = getConnexio("laboral",Aplication.getAplication().getDataBase() ) ;
  		if ( connJNomina != null ) return true;
  	}
  	catch (Exception e ) {
  		//Easp.debug("Error conectandoo BD");
  	  e.printStackTrace();
  	}
  	return false;
  }


}
