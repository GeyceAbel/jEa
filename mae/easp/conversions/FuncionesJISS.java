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
import mae.easp.db.CatJiss;
import mae.easp.general.Easp;
import mae.general.Numero;



public class FuncionesJISS {
	DBConnection connEA;
	String dominio;
  public DBConnection connJISS=null;

  public FuncionesJISS(DBConnection connEA, String dominio) {
		this.connEA = connEA;
		this.dominio = dominio;
    if(connJISS == null) setConnectJISS();

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

  public static DBConnection getConnexio(String nombd, DBConnection connEA) {
    String server = connEA.getDB().getServer() ;
  	String dsn = connEA.getDB().getDsn();

    return(conectaBD(nombd, connEA.getDB().getServer(), connEA.getDB().getUser(), connEA.getDB().getPassword(), connEA.getDB().getType()));
  }

  public static DBConnection conectaBD(String bdnom, String bdserver, String bduser, String bdpassword, String bdtype) {


    ErrorManager actual = Aplication.getAplication().getErrorManager();
    DataBase db=new DataBase();
    db.setName(bdnom);
    db.setMyServer(bdserver);
    db.setUser(bduser);
    db.setMyPassword(bdpassword);
    db.setType(bdtype);
    DBConnection conn=new DBConnection(db);

    if (bdnom.equals("jiss")) {
      CatJiss catjiss = new CatJiss();
      Catalog array[] = {catjiss};
      db.setCatalogs(array);
    }


    conn=new DBConnection(db);
    if (conn.connect()) {
    	Aplication.getAplication().setErrorManager(actual);
    	return conn;
    }
    else {
    	Aplication.getAplication().setErrorManager(actual);
    	return null;
    }
  }

  public boolean setConnectJISS() {
  	try {
      connJISS = getConnexio("jiss",Aplication.getAplication().getDataBase() ) ;
      if ( connJISS!= null ) return true;
  	}
  	catch (Exception e ) {
  	  e.printStackTrace();
  	}
  	return false;
  }


}
