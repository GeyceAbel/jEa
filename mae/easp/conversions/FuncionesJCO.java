package mae.easp.conversions;

import java.util.Date;
import java.util.StringTokenizer;
import geyce.maefc.Aplication;
import geyce.maefc.Catalog;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.Delete;
import geyce.maefc.Field;
import geyce.maefc.Insert;
import geyce.maefc.Maefc;
import geyce.maefc.Select;
import geyce.maefc.Selector;
import geyce.maefc.Table;
import geyce.maefc.Update;
import mae.easp.db.CatCtasp;
import mae.easp.general.Easp;
import mae.easp.general.Perfil;
import mae.general.Fecha;
import mae.general.Numero;
import mae.general.ProgressBarForm;
import mae.general.Util;

public class FuncionesJCO {
	DBConnection connEA;
	String dominio;

	public FuncionesJCO(DBConnection connEA, String dominio) {
		this.connEA = connEA;
		this.dominio = dominio;
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

	public int getNextIRPF(DBConnection dbJCta) {
		int num = 0;
		Selector sirpf = new Selector (dbJCta);
		sirpf.execute("Select max(irpcodigo) as num from IRPF");
		if (sirpf.next()) num = sirpf.getint("num");
		sirpf.close();
		num++;
		return num;
	}

	public int getNextIVA (DBConnection dbJCta) {
		int num = 0;
		Selector sirpf = new Selector (dbJCta);
		sirpf.execute("Select max(ivacodigo) as num from IVA");
		if (sirpf.next()) num = sirpf.getint("num");
		sirpf.close();
		num++;
		return num;
	}

	public boolean checkLongitudNumerica (DBConnection conn, int emp, int ejer) {
		boolean bOk = true;

		String alfa = "A";
		int longitud = 12;
		Selector spcu = new Selector (conn);
		spcu.execute("Select * from pcuentas where pcuempresa="+emp+" and pcuejercicio="+ejer+" and pcusubcuenta<>'0'");
		boolean primer = true;
		int longant = 0;
		int longini = 0;
		boolean sortir = false;
		while (!sortir && spcu.next()) {
			longini = spcu.getString("pcusubcuenta").length();
			if (primer) {
				longant = longini;
				primer = false;
			}
			else {
				if (longini!=longant) {
					alfa = "A";
					longitud = 12;
					sortir = true;
				}
				else {
					alfa = "N";
					longitud = longini;
				}
			}
		}
		spcu.close();
		Update u = new Update (conn,"EMPRESA");
		u.valor ("emplonsub",longitud);
		u.valor ("emptipocta",alfa);
		bOk = u.execute("empcodigo="+emp);       
		if (bOk && "N".equals(alfa)) {
			Update u2 = new Update (conn,"pcuentas");
			u2.valor ("pculongitud",longitud);
			bOk = u2.execute("pcuempresa="+emp+" and pcuejercicio="+ejer);       
		}
		return bOk;
	}

	public boolean rehacerPerfil (DBConnection connJC, int empresa,int ejercicio) {
		boolean bOk = true;
		Selector s = new Selector (connJC);
		s.execute("Select * from EMPRESA where empcodigo="+empresa);
		if (s.next()) {
			String empnif = s.getString("empnif");
			String empivamensual = s.getString("empivamensual");
			String empexporta = s.getString("empexporta");
			String empgranemp = s.getString("empgranemp");

			String sGranEmpresa = "N";
			if ("S".equals(empgranemp)) sGranEmpresa="S";
			String sRegDev = "N";
			if ("S".equals(empexporta) || "S".equals(empivamensual)) sRegDev="S";
			mae.easp.general.Perfil perfil = new Perfil(connEA, empnif, ejercicio);
			if (!perfil.hasPerfil()) {
				perfil.remAutoCommit();
				perfil.newPerfil(sGranEmpresa,sRegDev);
				if (sRegDev.equals("S")) {
					perfil.setModelo("303","M");
					perfil.setModelo("340","M");
					perfil.setModelo("390","A");
					perfil.setModelo("347","A");
					if (!Util.esCIFdePersonaFisica (empnif)) {
						perfil.setModelo("111","M");
						perfil.setModelo("190","A");      
						perfil.setModelo("200","A");
						perfil.setModelo("202","P");
					}
				}
				else if (sGranEmpresa.equals("S")) { 
					perfil.setModelo("303","M");
					perfil.setModelo("340","M");
					perfil.setModelo("390","A");
					perfil.setModelo("111","M");
					perfil.setModelo("190","A");
					perfil.setModelo("200","A");
					perfil.setModelo("218","P");
					perfil.setModelo("347","A");
				}
				else {
					perfil.setModelo("347","A");    
					perfil.setModelo("303","T");    
					perfil.setModelo("390","A");
					if (!Util.esCIFdePersonaFisica (empnif)) {
						perfil.setModelo("111","T");
						perfil.setModelo("190","A");      
						perfil.setModelo("200","A");
						perfil.setModelo("202","P");
					}
				}
				if (Util.esCIFdePersonaFisica (empnif)) perfil.setModelo("100","A");
				perfil.setFechaPerfilTributario(Fecha.getDate(ejercicio,12,31));
			}
		}
		s.close();
		return bOk;	
	}

	public boolean reconstruccionAcumulados (DBConnection dbJCta, int ejercicio, int codiJC, int codiLC, boolean estaCerrado, int asientoCE, int asientoCC, ProgressBarForm pbf) {
		boolean bOk = true;
		pbf.setSecondaryPercent(0);
		if (codiLC>0) pbf.setState("Convirtiendo LC: "+codiLC+"  JC:"+codiJC+" ("+ejercicio+")  -  Reconstruccion Acumulados");		
		else pbf.setState("Reconstruyendo Acumulados...");		
		String where = "pcaempresa ="+codiJC+" and pcaejercicio ="+ejercicio;
		Delete dpca = new Delete (dbJCta,"PCACUMULADOS");
		bOk = dpca.execute(where);
		if (bOk) {
			int numActual = 0;
			int mes = 0;		    
			Selector stotal = new Selector (dbJCta);
			stotal.execute ("select count(*) as total from ASIENTOS where asiempresa="+codiJC+" and asiejercicio="+ejercicio);
			int total = 0;
			if (stotal.next()) total = stotal.getint("total");
			stotal.close();			
			Selector srecons2 = new Selector (dbJCta);
			srecons2.execute ("select * from ASIENTOS where asiempresa="+codiJC+" and asiejercicio="+ejercicio+" order by asiasiento");
			while (bOk && srecons2.next()) {
				pbf.setSecondaryPercent((++numActual)*100/total);
				int asidiario = srecons2.getint("asidiario");
				int asiasiento = srecons2.getint("asiasiento");
				Date asifecha = srecons2.getDate("asifecha");
				String asicuenta = srecons2.getString("asicuenta");
				String asisubcuenta = srecons2.getString("asisubcuenta");
				String asidebehaber = srecons2.getString("asidebehaber");
				double asiimporte = srecons2.getdouble("asiimporte");
				if (asiasiento == 1) mes = 0;
				else if (estaCerrado && asiasiento==asientoCE) mes = 13;
				else if (estaCerrado && asidiario>=60 && asiasiento==(asientoCE+1)) mes = 13;
				else if (estaCerrado && asiasiento==asientoCC) mes = 14;
				else if (estaCerrado && asidiario>=60 && asiasiento==(asientoCC+1)) mes = 14;
				else mes = Maefc.getMonth(asifecha)+1;				
				if ((asidiario>=1 && asidiario <= 60) ) {
					bOk = setAcumulado(dbJCta,ejercicio,codiJC,"1",asicuenta,"0",asidebehaber,asiimporte,mes);
					bOk = setAcumulado(dbJCta,ejercicio,codiJC,"1",asicuenta,asisubcuenta,asidebehaber,asiimporte,mes);
				}
				if (((asidiario>=1 && asidiario <= 30) || (asidiario>=60) ) ) {
					bOk = setAcumulado(dbJCta,ejercicio,codiJC,"2",asicuenta,"0",asidebehaber,asiimporte,mes);
					bOk = setAcumulado(dbJCta,ejercicio,codiJC,"2",asicuenta,asisubcuenta,asidebehaber,asiimporte,mes);
				}
			}
			srecons2.close();
		}
		return bOk;
	}


	public boolean setAcumulado(DBConnection dbJCta, int ejercicio, int codiJC, String ofireal,String cta,String sbcta,String debehaber,double importe, int mes){
		boolean bOk = true;
		Selector slgacum = new Selector (dbJCta);
		slgacum.execute ("Select * from PCACUMULADOS where pcaempresa ="+codiJC+" and pcaejercicio ="+ejercicio+" and pcacuenta ='"+cta+"'"
				+" and pcasubcuenta ='"+sbcta+"' and pcatipoacum='"+ofireal+"'");
		if (!slgacum.next()) {
			Insert ipca = new Insert (dbJCta,"PCACUMULADOS");
			ipca.valor("pcaempresa",codiJC);
			ipca.valor("pcaejercicio",ejercicio);
			ipca.valor("pcacuenta",cta);
			ipca.valor("pcasubcuenta",sbcta);
			ipca.valor("pcatipoacum",ofireal);
			switch (mes) {
			case 0:
				if (debehaber.equals("D")) ipca.valor("pcadebeapert",importe);
				else ipca.valor("pcahaberapert",importe);
				break;
			case 13:
				if (debehaber.equals("D")) ipca.valor("pcadebecieejer",importe);
				else ipca.valor("pcahabercieejer",importe);
				break;
			case 14:
				if (debehaber.equals("D")) ipca.valor("pcadebeciecon",importe);
				else ipca.valor("pcahaberciecon",importe);
				break;
			default:
				if (debehaber.equals("D")) ipca.valor("pcadebe"+mes,importe);
				else ipca.valor("pcahaber"+mes,importe);
				break;
			}
			bOk = ipca.execute();
		}
		else {
			Update upca = new Update (dbJCta,"PCACUMULADOS");
			switch (mes) {
			case 0:
				if (debehaber.equals("D")) upca.valor("pcadebeapert",importe+slgacum.getdouble("pcadebeapert"));
				else upca.valor("pcahaberapert",importe+slgacum.getdouble("pcahaberapert"));
				break;
			case 13:
				if (debehaber.equals("D")) upca.valor("pcadebecieejer",importe+slgacum.getdouble("pcadebecieejer"));
				else upca.valor("pcahabercieejer",importe+slgacum.getdouble("pcahabercieejer"));
				break;
			case 14:
				if (debehaber.equals("D")) upca.valor("pcadebeciecon",importe+slgacum.getdouble("pcadebeciecon"));
				else upca.valor("pcahaberciecon",importe+slgacum.getdouble("pcahaberciecon"));
				break;
			default:
				if (debehaber.equals("D")) upca.valor("pcadebe"+mes,importe+slgacum.getdouble("pcadebe"+mes));
				else upca.valor("pcahaber"+mes,importe+slgacum.getdouble("pcahaber"+mes));
				break;
			}
			bOk = upca.execute("pcaempresa ="+codiJC+" and pcaejercicio ="+ejercicio+" and pcacuenta ='"+cta+"'"
					+" and pcasubcuenta ='"+sbcta+"' and pcatipoacum='"+ofireal+"'");
		}
		slgacum.close();
		return bOk;
	}

	public boolean eliminarCuentasEstructura (int emp, int ejer, boolean esPyme, DBConnection dbJCta) {
		boolean bOk = true;
		String cta="";
		java.util.Vector <String> vCtaElim = new java.util.Vector <String> ();
		String struct = "NPG";
		if (esPyme) struct = "NPP";
		Selector scheckcuenta = new Selector (dbJCta);
		scheckcuenta.execute("Select * from pcuentas where pcuempresa="+emp+" and pcuejercicio="+ejer+" and pcusubcuenta='0'");  
		while (scheckcuenta.next()){
			cta=scheckcuenta.getString("pcucuenta");
			Selector scheckestruct = new Selector (dbJCta);
			scheckestruct.execute("Select * from estructura where estcodigo='"+struct+"' and esttipo='C' and RIGHT(estelemento,4)='"+cta+"'");  
			boolean noestaasig = !scheckestruct.next();
			scheckestruct.close();
			if (noestaasig) {
				Selector stieneas = new Selector (dbJCta);
				stieneas.execute("Select * from ASIENTOS where asiempresa="+emp+" and asiejercicio="+ejer+" and asicuenta='"+cta+"'");  
				boolean tieneas = stieneas.next();
				stieneas.close();
				if (!tieneas) {
					Selector stienein = new Selector (dbJCta);
					stienein.execute("Select * from PCINMOV where pciempresa="+emp+" and pciejercicio="+ejer+" and (pcicuenta='"+cta+"' or pcictadot='"+cta+"' or pcictaamort='"+cta+"') ");  
					boolean tienein = stienein.next();
					stienein.close();
					if (!tienein) vCtaElim.addElement(cta);
				}
			}
		}
		scheckcuenta.close();
		for (int i=0;i<vCtaElim.size() && bOk;i++) {
			String ctaelim = vCtaElim.elementAt(i);
			Delete d = new Delete (dbJCta,"PCUENTAS");
			bOk = d.execute("pcuempresa="+emp+" and pcuejercicio="+ejer+" and pcucuenta='"+ctaelim+"'");

		}
		return bOk;
	}

	public boolean actualizarSeries (int empJconta, int iEjer, DBConnection dbJCta) {
		boolean bOk = true;
		Selector s = new Selector (dbJCta);
		s.execute("Select civserie,civemirep,max(civregistro) as num from ivacabecera where civempresa="+empJconta+" and civejercicio="+iEjer+" group by civserie,civemirep");
		while (bOk && s.next()) {
			String serie = s.getString("civserie");
			if (serie==null ||serie.trim().length()==0) serie = " ";
			String emirep = s.getString("civemirep");
			String campo = "seremitida";
			if (emirep.equals("S")) campo="serecibida";

			int num = s.getint("num");
			Selector ss = new Selector (dbJCta);
			ss.execute("Select * from SERIES where serserie='"+serie+"' and serempresa="+empJconta+" and serejercicio="+iEjer);
			if (ss.next()) {
				Update u = new Update (dbJCta,"SERIES");
				u.valor(campo,num);
				u.execute("serserie='"+serie+"' and serempresa="+empJconta+" and serejercicio="+iEjer);
			}
			else {
				Insert i = new Insert (dbJCta,"SERIES");
				i.valor("serempresa",empJconta);
				i.valor("serejercicio",iEjer);
				i.valor("serserie",serie);
				i.valor(campo,num);
				bOk = i.execute();
			}    
			ss.close();
		}
		s.close();
		return bOk;
	}

	public String getHome() {
		String home = null;
		if ("access".equals(connEA.getDB().getType())) home = connEA.getDB().getServer();
		else {
			Selector sbdscargadas = new Selector (connEA);
			sbdscargadas.execute("SELECT * from BDSCARGADAS where bdtipo='access' and left(bddominio,6)='"+dominio.substring(0,6)+"' order by bdejer DESC");
			if (sbdscargadas.next()) home = sbdscargadas.getString("bdbdserv");
			else home = Aplication.getAplication().getConfig("HOME");			
			sbdscargadas.close();
		}
		if (home!=null && home.trim().length()>0) {
			home = home.trim();
			if (!home.endsWith("\\")) home = home+"\\";
		}
		else home = null;
		return home;
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
}
