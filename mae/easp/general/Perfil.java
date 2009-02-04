package mae.easp.general;

import geyce.maefc.*;
import mae.general.*;
import java.util.*;
import java.io.*;


public class Perfil {
	private final int NO_AUTO_COMMIT = 0;
	private final int AUTO_COMMIT = 1;
	private String nif;
	private int ejer;
  private int autoCommit;
  private DBConnection connPerfil=null;

  Select sperfil ;
  Table tperfil   ;
  Field fdejercicio  ;
  Field fdnif        ;
  Field fdgranemp       ;
  Field fdtipoavisos ;
  Field fdemail      ;
  Field fdmovil      ;
  Field fdalquileres ;
  Field fdintracom   ;
  Field fdintrastat  ;
  Field fdfechafin   ;
  Field fdregdevmen  ;

  public Perfil (DBConnection db,String nif, int ejer) {
    connPerfil  = db;
    this.nif = nif;
    this.ejer= ejer;
    sperfil     =new Select(connPerfil);
    tperfil     =new Table(sperfil,"PERFILTRIBUT");
    fdejercicio   =new Field(sperfil,tperfil,"pftejercicio");
    fdnif         =new Field(sperfil,tperfil,"pftnif");
    fdgranemp     =new Field(sperfil,tperfil,"pftgranemp");
    fdtipoavisos  =new Field(sperfil,tperfil,"pfttipoavisos");
    fdemail       =new Field(sperfil,tperfil,"pftemail");
    fdmovil       =new Field(sperfil,tperfil,"pftmovil");
    fdalquileres  =new Field(sperfil,tperfil,"pftalquileres");
    fdintracom    =new Field(sperfil,tperfil,"pftintracom");
    fdintrastat   =new Field(sperfil,tperfil,"pftintrastat");
    fdfechafin    =new Field (sperfil,tperfil,"pftfechafin");
    fdregdevmen   =new Field (sperfil,tperfil,"pftregdevmen");
    autoCommit = AUTO_COMMIT;
  }

  public void setAutoCommit() {
    autoCommit = AUTO_COMMIT;
  }
  public void remAutoCommit() {
    autoCommit = NO_AUTO_COMMIT;
  }
  public boolean isAutoCommit() {
    return (autoCommit == AUTO_COMMIT);
  }
  public void actualizarPerfil () {
    connPerfil.commit();
  }
  public void desactualizaPerfil () {
    connPerfil.rollback();
  }

  public boolean hasPerfil() {
    sperfil.setWhere("pftejercicio="+ejer+" and pftnif='"+nif+"'");
    sperfil.execute();
    return !sperfil.isEof();
  }

  public boolean newPerfil() {
  	boolean bOk = true;
  	if (!hasPerfil()) {
  		sperfil.addNew();
  		fdejercicio.setValue(ejer);
  		fdnif.setValue(nif);
  		bOk = sperfil.insert();
  	}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();
  	return bOk;
  }

  public boolean newPerfil(String granemp, String regdevol) {
  	boolean bOk = true;
  	if (!hasPerfil()) {
  		sperfil.addNew();
  		fdejercicio.setValue(ejer);
  		fdnif.setValue(nif);
  		fdgranemp.setValue(granemp);
  		fdtipoavisos.setValue("1");
  		fdalquileres.setValue("N");
  		fdintracom.setValue("0");
  		fdintrastat.setNull();
      fdfechafin.setNull();
      fdregdevmen.setValue(regdevol);
  		bOk = sperfil.insert();
  	}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();
  	return bOk;
  }

  public boolean newPerfil(String granemp, String tipoavisos, String email, String movil, String alquiler, String intracom, String intrastat, java.util.Date fechafin, String regDev) {
  	boolean bOk = true;
  	if (!hasPerfil()) {
  		sperfil.addNew();
  		fdejercicio.setValue(ejer);
  		fdnif.setValue(nif);
			if (granemp!=null && (granemp.trim().length()>0)) fdgranemp.setValue(granemp);
			else fdgranemp.setNull();
			if (tipoavisos!=null && (tipoavisos.trim().length()>0)) fdtipoavisos.setValue(tipoavisos);
			else fdtipoavisos.setNull();
			if (email!=null && (email.trim().length()>0)) fdemail.setValue(email);
			else fdemail.setNull();
			if (movil!=null && (movil.trim().length()>0)) fdmovil.setValue(movil);
			else fdmovil.setNull();
			if (alquiler!=null && (alquiler.trim().length()>0)) fdalquileres.setValue(alquiler);
			else fdalquileres.setNull();
			if (intracom!=null && (intracom.trim().length()>0)) fdintracom.setValue(intracom);
			else fdintracom.setNull();
			if (intrastat!=null && (intrastat.trim().length()>0)) fdintrastat.setValue(intrastat);
			else fdintrastat.setNull();
			if (fechafin!=null ) fdfechafin.setValue(fechafin);
			else fdfechafin.setNull();
      if (regDev!=null && (regDev.trim().length()>0))
         fdregdevmen.setValue(regDev);
      else fdregdevmen.setValue("N");
  		bOk = sperfil.insert();
  	}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();
  	return bOk;
  }
  public boolean setPerfil(String granemp, String tipoavisos, String email, String movil, String alquiler, String intracom, String intrastat, String fechafin, String regDev) {
  	boolean bOk = true;
  	if (hasPerfil()) {
  		sperfil.edit();
			if (granemp!=null && (granemp.trim().length()>0)) fdgranemp.setValue(granemp);
			else fdgranemp.setNull();
			if (tipoavisos!=null && (tipoavisos.trim().length()>0)) fdtipoavisos.setValue(tipoavisos);
			else fdtipoavisos.setNull();
			if (email!=null && (email.trim().length()>0)) fdemail.setValue(email);
			else fdemail.setNull();
			if (movil!=null && (movil.trim().length()>0)) fdmovil.setValue(movil);
			else fdmovil.setNull();
			if (alquiler!=null && (alquiler.trim().length()>0)) fdalquileres.setValue(alquiler);
			else fdalquileres.setNull();
			if (intracom!=null && (intracom.trim().length()>0)) fdintracom.setValue(intracom);
			else fdintracom.setNull();
			if (intrastat!=null && (intrastat.trim().length()>0)) fdintrastat.setValue(intrastat);
			else fdintrastat.setNull();
			if (fechafin!=null && (fechafin.trim().length()>0)) fdfechafin.setValue(fechafin);
			else fdfechafin.setNull();
      if (regDev!=null && (regDev.trim().length()>0)) fdregdevmen.setValue(regDev);
      else fdregdevmen.setValue("N");
  		bOk = sperfil.update();
  	}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();
  	return bOk;
  }

  public PerfilTributario getPerfilTributario () {
  	if (hasPerfil()) {
      return new PerfilTributario (fdgranemp.getString(),fdalquileres.getString(),fdintracom.getString(),fdintrastat.getString(),fdfechafin.getDate(),fdregdevmen.getString());
    }
    else return null;
  }
  public boolean setPerfilTributario (String granemp, String alquil, String com, String stat, java.util.Date fecha, String regDev) {
  	boolean bOk = true;
  	if (hasPerfil()) {
  		sperfil.edit();
  		fdgranemp.setValue(granemp);
  		fdalquileres.setValue(alquil);
  		fdintracom.setValue(com);
  		fdintrastat.setValue(stat);
  		fdfechafin.setValue(fecha);
      fdregdevmen.setValue(regDev);
      bOk = sperfil.update();
    }
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

    return bOk;
  }
  public boolean setFechaPerfilTributario (java.util.Date fecha) {
  	boolean bOk = true;
  	if (hasPerfil()) {
  		sperfil.edit();
  		fdfechafin.setValue(fecha);
      bOk = sperfil.update();
    }
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

    return bOk;
  }
  public boolean setMailPerfilTributario (String m) {
  	boolean bOk = true;
  	if (hasPerfil()) {
  		sperfil.edit();
  		fdemail.setValue(m);
      bOk = sperfil.update();
    }
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

    return bOk;
  }

  public boolean remPerfil() {
  	boolean bOk = true;
  	if (hasPerfil()) {
  		try {
        connPerfil.executeUpdate("DELETE FROM EMPMODELOS WHERE emodejercicio="+ejer+" AND emodnif='"+nif+"'");
        connPerfil.executeUpdate("DELETE FROM PERFILTRIBUT WHERE pftejercicio="+ejer+" AND pftnif='"+nif+"'");
      }
      catch (Exception e) {
      	bOk = false;
      }
  	}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();
  	return bOk;
  }

  public boolean hasModelo(int modelo,String tipo) {
    Select svfdecmod=new Select(connPerfil);
    Table tbdecmod=new Table(svfdecmod,"EMPMODELOS");
    Field fdmodelo      =new Field(svfdecmod,tbdecmod,"emodmodelo");
    Field fdtipoper     =new Field(svfdecmod,tbdecmod,"emodtipoper");
    svfdecmod.setWhere("emodejercicio="+ejer+
                       " and emodnif='"+nif+"'"+
                       " and emodmodelo='"+modelo+"'"+
                       " and emodtipoper='"+tipo+"'"+
                       " and emodactivo='S'");
    svfdecmod.execute();
    return !svfdecmod.isEof();
  }


  public Vector getModelos() {
    Select svfdecmod=new Select(connPerfil);
    Table tbdecmod=new Table(svfdecmod,"EMPMODELOS");
    Field fdmodelo      =new Field(svfdecmod,tbdecmod,"emodmodelo");
    Field fdtipoper     =new Field(svfdecmod,tbdecmod,"emodtipoper");
    svfdecmod.setWhere("emodejercicio="+ejer+
                       " and emodnif='"+nif+"'"+
                       " and emodactivo='S'");
    svfdecmod.execute();
    Vector vc=new Vector();
    while (!svfdecmod.isEof()) {
      vc.addElement(fdmodelo.getString());
      vc.addElement(fdtipoper.getString());
      svfdecmod.next();
      }
    return vc;
    }

  public boolean setModelo(String modelo, String tipoper) {
  	boolean bOk = true;
    Select sempmodelos=new Select(connPerfil);
    Table tempmodelos=new Table(sempmodelos,"EMPMODELOS");
    Field fdemodejer     =new Field(sempmodelos,tempmodelos,"emodejercicio");
    Field fdemodnif      =new Field(sempmodelos,tempmodelos,"emodnif");
    Field fdemodmodelo   =new Field(sempmodelos,tempmodelos,"emodmodelo");
    Field fdemodtipoper     =new Field(sempmodelos,tempmodelos,"emodtipoper");
    Field fdemodactivo      =new Field(sempmodelos,tempmodelos,"emodactivo");
    sempmodelos.setWhere("emodejercicio="+ejer+
                       " and emodnif='"+nif+"'"+
                       " and emodmodelo='"+modelo+"'");
    sempmodelos.execute();
    if (sempmodelos.isEof()) {
      sempmodelos.addNew();
      fdemodejer.setValue(ejer);
      fdemodnif.setValue(nif);
      fdemodmodelo.setValue(modelo);
      fdemodtipoper.setValue(tipoper);
      fdemodactivo.setValue("S");
      bOk = sempmodelos.insert();
    }
		else {
	    sempmodelos.edit();
      fdemodtipoper.setValue(tipoper);
      fdemodactivo.setValue("S");
      bOk = sempmodelos.update();
		}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

		return bOk;
  }

  public boolean remModelo(String modelo, String tipoper) {
  	boolean bOk = true;
    Select sempmodelos=new Select(connPerfil);
    Table tempmodelos=new Table(sempmodelos,"EMPMODELOS");
    Field fdemodejer     =new Field(sempmodelos,tempmodelos,"emodejercicio");
    Field fdemodnif      =new Field(sempmodelos,tempmodelos,"emodnif");
    Field fdemodmodelo   =new Field(sempmodelos,tempmodelos,"emodmodelo");
    Field fdemodtipoper     =new Field(sempmodelos,tempmodelos,"emodtipoper");
    Field fdemodactivo      =new Field(sempmodelos,tempmodelos,"emodactivo");
    sempmodelos.setWhere("emodejercicio="+ejer+
                       " and emodnif='"+nif+"'"+
                       " and emodtipoper='"+tipoper+"'"+
                       " and emodmodelo='"+modelo+"'");
    sempmodelos.execute();
    if (!sempmodelos.isEof()) {
	    sempmodelos.edit();
      fdemodactivo.setValue("N");
      bOk = sempmodelos.update();
		}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

		return bOk;
  }

  public boolean remModelo(String modelo) {
  	boolean bOk = true;
    Select sempmodelos=new Select(connPerfil);
    Table tempmodelos=new Table(sempmodelos,"EMPMODELOS");
    Field fdemodejer     =new Field(sempmodelos,tempmodelos,"emodejercicio");
    Field fdemodnif      =new Field(sempmodelos,tempmodelos,"emodnif");
    Field fdemodmodelo   =new Field(sempmodelos,tempmodelos,"emodmodelo");
    Field fdemodtipoper     =new Field(sempmodelos,tempmodelos,"emodtipoper");
    Field fdemodactivo      =new Field(sempmodelos,tempmodelos,"emodactivo");
    sempmodelos.setWhere("emodejercicio="+ejer+
                       " and emodnif='"+nif+"'"+
                       " and emodmodelo='"+modelo+"'");
    sempmodelos.execute();
    while (!sempmodelos.isEof() && bOk) {
	    sempmodelos.edit();
      fdemodactivo.setValue("N");
      bOk = sempmodelos.update();
      sempmodelos.next();
		}
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

		return bOk;
  }

  public PerfilAvisos getPerfilAvisos() {
  	if (hasPerfil()) {
      return new PerfilAvisos(fdtipoavisos.getInteger(),fdemail.getString(),fdmovil.getString());
    }
    else return null;
  }

  public boolean setPerfilAvisos(int tipo,String mail,String movil) {
  	boolean bOk = true;
  	if (hasPerfil()) {
      sperfil.edit();
      fdtipoavisos.setValue(tipo);
      fdemail.setValue(mail);
      fdmovil.setValue(movil);
      bOk = sperfil.update();
    }
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

    return bOk;
  }

  public boolean setPerfilAvisos(PerfilAvisos pa) {
  	boolean bOk = true;
  	if (hasPerfil()) {
      sperfil.edit();
      fdtipoavisos.setValue(pa.tipo);
      fdemail.setValue(pa.mail);
      fdmovil.setValue(pa.movil);
      bOk = sperfil.update();
    }
  	if (bOk && isAutoCommit()) connPerfil.commit();
  	else if (isAutoCommit())  connPerfil.rollback();

    return bOk;
  }
  }
