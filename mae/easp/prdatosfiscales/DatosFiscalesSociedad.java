package mae.easp.prdatosfiscales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import geyce.maefc.DBConnection;
import geyce.maefc.Delete;
import geyce.maefc.Insert;
import geyce.maefc.Maefc;

public class DatosFiscalesSociedad {
	private File f;
	private int paramEjer;
	private String paramNif;
	private DBConnection connEA;
	private String linea;
	private boolean hayIncidencias;
	private String sError;
	private List<Domicilio> lDom;
	private List<DatosCensales> lDatosCensales;
	private HashMap<String,String> hmActividades;
	private List<PeriodoImpositivoYCNAE> lPeriodoYCNAE;
	private List<Caracteres> lCaracteres;
	private List<Administradores> lAdministradores;
	private List<EntidadesParticipa> lEntidadesParticipa;
	private List<PersonasYEntParticipan> lPersonasYEntParticipan;
	private List<SecreYRepre> lSecreYRepre;
	private List<PagoFraccionado> lPagoFraccionado;
	private List<VolumenOperaciones> lVolumenOperaciones;
	
	public DatosFiscalesSociedad(File f, int paramEjer, String paramNif, DBConnection connEA){
		this.f = f;
		this.paramEjer = paramEjer;
		this.paramNif = paramNif;
		this.connEA = connEA;
	}
	
	private void initVariables(){
		hayIncidencias = false;
		sError = null;
		initActividades();
		lDom = new ArrayList<Domicilio>();
		lDatosCensales = new ArrayList<DatosCensales>();
		lPeriodoYCNAE = new ArrayList<PeriodoImpositivoYCNAE>();
		lCaracteres = new ArrayList<Caracteres>();
		lAdministradores = new ArrayList<Administradores>();
		lEntidadesParticipa = new ArrayList<EntidadesParticipa>();
		lPersonasYEntParticipan = new ArrayList<PersonasYEntParticipan>();
		lSecreYRepre = new ArrayList<SecreYRepre>();
		lPagoFraccionado = new ArrayList<PagoFraccionado>();
		lVolumenOperaciones = new ArrayList<VolumenOperaciones>();
		
	}
	
	private void initActividades(){
		hmActividades = new HashMap<String,String>();
		hmActividades.put("A01","Alquiler de locales");
		hmActividades.put("A02","Ganadería independiente");
		hmActividades.put("A03","Empresarial");
		hmActividades.put("A04","Artística o deportiva");
		hmActividades.put("A05","Profesional");
		hmActividades.put("B01","Agrícola");
		hmActividades.put("B02","Ganadera");
		hmActividades.put("B03","Forestal");
		hmActividades.put("B04","Producción mejillón");
		hmActividades.put("B05","Pesquera");
	}
		
	public boolean leer(){
		boolean bOk = true;
		initVariables();
		if (f.exists()){
			FileInputStream filein = null;
			InputStreamReader read = null;
			BufferedReader in = null;
			try{
				filein = new FileInputStream(f);
				read = new InputStreamReader(filein);
				in = new BufferedReader(read);
				linea = in.readLine();
				//if (!("0DFIS"+paramEjer).equals(linea)){
				//	
				//}
				while (linea!=null){
					if (bOk) bOk = leerDatosDomicilio();
					if (bOk) bOk = leerDatosCensales();
					if (bOk) bOk = leerPeriodoYCNAE();
					if (bOk) bOk = leerCaracteres();
					if (bOk) bOk = leerAdmins();
					if (bOk) bOk = leerEntidadesParticipa();
					if (bOk) bOk = leerPersonasYEntParticipan();
					if (bOk) bOk = leerSecreYRepre();
					if (bOk) bOk = leerPagosFraccionados();
					if (bOk) bOk = leerVolumenOperaciones();
					linea = in.readLine();
				}
			}
			catch(Exception ex){
				mostrarIncidencia();
				ex.printStackTrace();
				
			}
			finally {
				try{
					if (in != null) in.close();
	    			if (read != null) read.close();
	    			if (filein != null) filein.close();
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		}
		
		return bOk;
	}
	
	public boolean grabar(){
		boolean bOk = true;
		if (bOk) bOk = grabarDomicilios();
		if (bOk) bOk = grabarDatosCensales();
		if (bOk) bOk = grabarPeriodoYCNAE();
		if (bOk) bOk = grabarCaracteres();
		if (bOk) bOk = grabarAdmins();
		if (bOk) bOk = grabarEntidadesParticipa();
		if (bOk) bOk = grabarPersonasYEntParticipan();
		if (bOk) bOk = grabarSecreYRepre();
		if (bOk) bOk = grabarPagosFraccionados();
		if (bOk) bOk = grabarVolumenOperaciones();
		
		if (bOk){
			connEA.commit();
			Maefc.message("Datos fiscales grabados con éxito");
		}
		else {
			connEA.rollback();
			Maefc.message("Error grabando datos fiscales:\n"+"- "+sError);
		}
		return bOk;
	}
	
	private boolean leerDatosDomicilio(){
		if (linea.startsWith("2DOM")){
			Domicilio d = new Domicilio();
			d.nif = paramNif;
			d.ejercicio = paramEjer;
			d.codigo = parserString(1,8);
			d.tipoDom = parserString(8, 10);
			if ("20".equals(d.tipoDom)){
				d.tipoVia = parserString(10, 15);
				d.codVia = parserString(15,20);
				d.nombreViaL = parserString(20,70);
				d.nombreViaC = parserString(70,95);
				d.tipoNum = parserString(95,98);
				d.numero = parserString(98,103);
				d.califNum = parserString(103,106);
				d.bloque = parserString(106,109);
				d.portal = parserString(109,112);
				d.escalera = parserString(112,115);
				d.piso = parserString(115,118);
				d.puerta = parserString(118,121);
				d.complDom = parserString(121,161);
				d.poblacion = parserString(161,191);
				d.codpos = parserString(191,196);
				d.codMuni = parserString(196,201);
				d.muni = parserString(201,231);
				d.codProv = parserDouble(231,233).intValue();
				d.prov = parserString(233,253);
				d.refcat = parserString(253,273);
			}
			else if ("21".equals(d.tipoDom)){
				d.dom21 = parserString(10,60);
				d.complDom21 = parserString(60,100);
				d.poblacion21 = parserString(100,130);
				d.codpos21 = parserString(130,140);
				d.provReg21 = parserString(140,170);
				d.pais21 = parserString(170,200);
				d.codPais21 = parserString(200,202);
				d.nacional21 = parserString(202,204);
			}
			lDom.add(d);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarDomicilios(){
		boolean bOk = true;
		Delete del = new Delete(connEA,"DFSDOMICILIO");
		if (bOk) bOk = del.execute("dfdejer="+paramEjer+" AND dfdnif='"+paramNif+"'");
		for (Domicilio d : lDom){
			if (bOk){
				Insert in = new Insert(connEA, "DFSDOMICILIO");
				in.valor("dfdejer", d.ejercicio);
				in.valor("dfdnif", d.nif);
				in.valor("dfdcodigo", d.codigo);
				in.valor("dfdtipodom", d.tipoDom);
				if ("20".equals(d.tipoDom)){
					in.valor("dfdtipovia", d.tipoVia);
					in.valor("dfdcodvia", d.codVia);
					in.valor("dfdnomvial", d.nombreViaL);
					in.valor("dfdnomviac", d.nombreViaC);
					in.valor("dfdtiponum", d.tipoNum);
					in.valor("dfdcalifnum", d.califNum);
					in.valor("dfdbloque", d.bloque);
					in.valor("dfdportal", d.portal);
					in.valor("dfdescalera", d.escalera);
					in.valor("dfdpiso", d.piso);
					in.valor("dfdpuerta", d.puerta);
					in.valor("dfdcomplem", d.complDom);
					in.valor("dfdpoblacion", d.poblacion);
					in.valor("dfdcodpos", d.codpos);
					in.valor("dfdcodmuni", d.codMuni);
					in.valor("dfdmuni", d.muni);
					in.valor("dfdcodprov", d.codProv);
					in.valor("dfdprov", d.prov);
					in.valor("dfdrefcat", d.refcat);
				}
				else if ("21".equals(d.tipoDom)){
					in.valor("dfd21address", d.dom21);
					in.valor("dfd21compl", d.complDom21);
					in.valor("dfd21pobla", d.poblacion21);
					in.valor("dfd21codpos", d.codpos21);
					in.valor("dfd21provre", d.provReg21);
					in.valor("dfd21pais", d.pais21);
					in.valor("dfd21codpais", d.codPais21);
					in.valor("dfd21nacional", d.nacional21);
				}
				bOk = in.execute();
				if (!bOk) {
					hayIncidencias = true;
					sError = d.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerDatosCensales(){
		if (linea.startsWith("2AE")){
			DatosCensales dc = new DatosCensales();
			dc.ejercicio = paramEjer;
			dc.nif = paramNif;
			dc.codigo = parserString(1, 8);
			dc.codAct = parserString(8, 11);
			dc.descAct = getActividad(dc.codAct);
			dc.grupoIAE = parserString(11, 16);
			dc.codCNAE = parserString(16, 21);
			
			lDatosCensales.add(dc);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarDatosCensales(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSCENSALES");
		if (bOk) bOk = del.execute("dfcejer="+paramEjer+" AND dfcnif='"+paramNif+"'");
		for (DatosCensales dc : lDatosCensales){
			if (bOk) {
				Insert in = new Insert(connEA, "DFSCENSALES");
				in.valor("dfcejer", paramEjer);
				in.valor("dfcnif", paramNif);
				in.valor("dfccodigo", dc.codigo);
				in.valor("dfccodact", dc.codAct);
				in.valor("dfcdescact", dc.descAct); 
				in.valor("dfcgrupoiae", dc.grupoIAE);
				in.valor("dfccodcnae", dc.codCNAE);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = dc.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerPeriodoYCNAE(){
		if (linea.startsWith("2MD1")){
			PeriodoImpositivoYCNAE per = new PeriodoImpositivoYCNAE();
			per.ejercicio = paramEjer;
			per.nif = paramNif;
			per.codigo = parserString(1,8);
			String strFec = parserString(8,16);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			sdf.setLenient(false);
			if (strFec!=null && strFec.trim().length()==8){
				try {
					per.fechaini = sdf.parse(strFec);
				} catch (ParseException e) {
					System.out.println(e.getMessage());
				}
			}
			strFec = parserString(16,24);
			if (strFec!=null && strFec.trim().length()==8){
				try {
					per.fechafin = sdf.parse(strFec);
				} catch (ParseException e) {
					System.out.println(e.getMessage());
				}
			}
			per.tipo = parserString(24,25);
			per.CNAE = parserString(25,30); 
			lPeriodoYCNAE.add(per);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarPeriodoYCNAE(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSPERIODOYCNAE");
		if (bOk) bOk = del.execute("dfpejer="+paramEjer+" AND dfpnif='"+paramNif+"'");
		for (PeriodoImpositivoYCNAE per : lPeriodoYCNAE){
			if (bOk) {
				Insert in = new Insert(connEA, "DFSPERIODOYCNAE");
				in.valor("dfpejer", paramEjer);
				in.valor("dfpnif", paramNif);
				in.valor("dfpcodigo", per.codigo);
				in.valor("dfpfecini", per.fechaini);
				in.valor("dfpfecfin", per.fechafin); 
				in.valor("dfptipoper", per.tipo);
				in.valor("dfpcnae2009", per.CNAE);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = per.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerCaracteres(){
		if (linea.startsWith("2MD2")){
			Caracteres car = new Caracteres();
			car.ejercicio = paramEjer;
			car.nif = paramNif;
			car.codigo = parserString(1,8);
			car.codCaracterMarcado = parserString(8,13);
			lCaracteres.add(car);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarCaracteres(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSCARACTERES");
		if (bOk) bOk = del.execute("dfcejer="+paramEjer+" AND dfcnif='"+paramNif+"'");
		for (Caracteres car : lCaracteres){
			if (bOk){
				Insert in = new Insert(connEA, "DFSCARACTERES");
				in.valor("dfcejer", paramEjer);
				in.valor("dfcnif", paramNif);
				in.valor("dfccodigo", car.codigo);
				in.valor("dfccaracter", car.codCaracterMarcado);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = car.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerAdmins(){
		if (linea.startsWith("2MD4")){
			Administradores admin = new Administradores();
			admin.ejercicio = paramEjer;
			admin.nif = paramNif;
			admin.codigo = parserString(1,8);
			admin.nifAdmin = parserString(8,17);
			admin.tipoPersona = parserString(17,18);
			admin.nombreRazon = parserString(18,78);
			lAdministradores.add(admin);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarAdmins(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSADMINS");
		if (bOk) bOk = del.execute("dfaejer="+paramEjer+" AND dfanif='"+paramNif+"'");
		for (Administradores admin : lAdministradores){
			if (bOk){
				Insert in = new Insert(connEA, "DFSADMINS");
				in.valor("dfaejer", paramEjer);
				in.valor("dfanif", paramNif);
				in.valor("dfacodigo", admin.codigo);
				in.valor("dfanifadmin", admin.nifAdmin);
				in.valor("dfatiponif", admin.tipoPersona);
				in.valor("dfanombre", admin.nombreRazon);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = admin.codigo;
				}
			}
		}
		return bOk;
	}
	
	
	private boolean leerEntidadesParticipa(){
		if (linea.startsWith("2MD5")){
			EntidadesParticipa ent = new EntidadesParticipa();
			ent.ejercicio = paramEjer;
			ent.nif = paramNif;
			ent.codigo = parserString(1,8);
			ent.nifOEquiv = parserString(8,28);
			ent.nombreRazon = parserString(28,88);
			ent.provPais = parserString(88,90);
			ent.porcPart = parserDouble(90,95);
			ent.totalNominal = parserDouble(95,112);
			ent.valorLibros = parserDouble(112,129);
			ent.dividendos = parserDouble(129,146);
			lEntidadesParticipa.add(ent);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarEntidadesParticipa(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSENTIDPART");
		if (bOk) bOk = del.execute("dfeejer="+paramEjer+" AND dfenif='"+paramNif+"'");
		for (EntidadesParticipa ent : lEntidadesParticipa){
			if (bOk){
				Insert in = new Insert(connEA, "DFSENTIDPART");
				in.valor("dfeejer", paramEjer);
				in.valor("dfenif", paramNif);
				in.valor("dfecodigo", ent.codigo);
				in.valor("dfeentnifid", ent.nifOEquiv);
				in.valor("dfenombre", ent.nombreRazon);
				in.valor("dfeprovpais", ent.provPais);
				in.valor("dfeporcpart", ent.porcPart);
				in.valor("dfevalornom", ent.totalNominal);
				in.valor("dfevalorlib", ent.valorLibros);
				in.valor("dfeingrdivej", ent.dividendos);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = ent.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerPersonasYEntParticipan(){
		if (linea.startsWith("2MD6")){
			PersonasYEntParticipan pep = new PersonasYEntParticipan();
			pep.ejercicio = paramEjer;
			pep.nif = paramNif;
			pep.codigo = parserString(1,8);
			pep.nifParticipa = parserString(8,17);
			pep.tipoPersona = parserString(17,18);
			pep.esRepre = parserString(18,19);
			pep.nombreRazon = parserString(19,79);
			pep.provPais = parserString(79,81);
			pep.valorNominal = parserDouble(81,98);
			pep.porcPart = parserDouble(98,103);
			lPersonasYEntParticipan.add(pep);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarPersonasYEntParticipan(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSPERSPART");
		if (bOk) bOk = del.execute("dfpejer="+paramEjer+" AND dfpnif='"+paramNif+"'");
		for (PersonasYEntParticipan pep : lPersonasYEntParticipan){
			if (bOk){
				Insert in = new Insert(connEA, "DFSPERSPART");
				in.valor("dfpejer", paramEjer);
				in.valor("dfpnif", paramNif);
				in.valor("dfpcodigo", pep.codigo);
				in.valor("dfppersnif", pep.nifParticipa);
				in.valor("dfptiponif", pep.tipoPersona);
				in.valor("dfpesrepre", pep.esRepre);
				in.valor("dfpnombre", pep.nombreRazon);
				in.valor("dfpprovpais", pep.provPais);
				in.valor("dfpvalornom", pep.valorNominal);
				in.valor("dfpporcpart", pep.porcPart);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = pep.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerSecreYRepre(){
		if (linea.startsWith("2MD8")){
			SecreYRepre syr = new SecreYRepre();
			syr.ejercicio = paramEjer;
			syr.nif = paramNif;
			syr.codigo = parserString(1,8);
			syr.nifPerso = parserString(8,17);
			syr.nombrePerso = parserString(17,77);
			syr.funcion = parserString(77,78);
			String strFec = parserString(78,86);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			sdf.setLenient(false);
			if (strFec!=null && strFec.trim().length()==8){
				try {
					syr.fechaFirma = sdf.parse(strFec);
				} catch (ParseException e) {
					System.out.println(e.getMessage());
				}
			}
			lSecreYRepre.add(syr);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarSecreYRepre(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSSECREREPRE");
		if (bOk) bOk = del.execute("dfsejer="+paramEjer+" AND dfsnif='"+paramNif+"'");
		for (SecreYRepre syr : lSecreYRepre){
			if (bOk){
				Insert in = new Insert(connEA, "DFSSECREREPRE");
				in.valor("dfsejer", paramEjer);
				in.valor("dfsnif", paramNif);
				in.valor("dfscodigo", syr.codigo);
				in.valor("dfspersnif", syr.nifPerso);
				in.valor("dfsnombre", syr.nombrePerso);
				in.valor("dfsfuncion", syr.funcion);
				in.valor("dfsfecfirma", syr.fechaFirma);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = syr.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerPagosFraccionados(){
		if (linea.startsWith("2PF")){
			PagoFraccionado pf = new PagoFraccionado();
			pf.ejercicio = paramEjer;
			pf.nif = paramNif;
			pf.codigo = parserString(1,8);
			pf.modelo = parserString(8,11);
			pf.tipo = parserString(11,12);
			pf.periodo = parserString(12,14);
			pf.delegacion = parserString(14,16);
			pf.justificante = parserString(16,29);
			pf.importe = parserDouble(29,42);
			lPagoFraccionado.add(pf);
			return sError == null;
		}
		return true;
	}
	
	private boolean grabarPagosFraccionados(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSPAGOSFRAC");
		if (bOk) bOk = del.execute("dfpejer="+paramEjer+" AND dfpnif='"+paramNif+"'");
		for (PagoFraccionado pf : lPagoFraccionado){
			if (bOk){
				Insert in = new Insert(connEA, "DFSPAGOSFRAC");
				in.valor("dfpejer", paramEjer);
				in.valor("dfpnif", paramNif);
				in.valor("dfpcodigo", pf.codigo);
				in.valor("dfpmodelo", pf.modelo);
				in.valor("dfptipo", pf.tipo);
				in.valor("dfpperiodo", pf.periodo);
				in.valor("dfpdeleg", pf.delegacion);
				in.valor("dfpjustif", pf.justificante);
				in.valor("dfpimporte", pf.importe);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = pf.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerVolumenOperaciones(){
		if (linea.startsWith("2TRN")){
			VolumenOperaciones vo390 = new VolumenOperaciones();
			vo390.ejercicio = paramEjer;
			vo390.nif = paramNif;
			vo390.codigo = parserString(1,8);
			vo390.modelo = "390";
			vo390.totalVolumen = parserDouble(8,23);
			lVolumenOperaciones.add(vo390);
			return sError == null;
		}
		else if (linea.startsWith("2TRT")){
			VolumenOperaciones vo303 = new VolumenOperaciones();
			vo303.ejercicio = paramEjer;
			vo303.nif = paramNif;
			vo303.codigo = parserString(1,8);
			vo303.modelo = "303";
			vo303.totalVolumen = parserDouble(8,23);
			lVolumenOperaciones.add(vo303);
		}
		else if (linea.startsWith("2TRV")){
			VolumenOperaciones vo322 = new VolumenOperaciones();
			vo322.ejercicio = paramEjer;
			vo322.nif = paramNif;
			vo322.codigo = parserString(1,8);
			vo322.modelo = "322";
			vo322.totalVolumen = parserDouble(8,23);
			lVolumenOperaciones.add(vo322);
		}
		return true;
	}
	
	private boolean grabarVolumenOperaciones(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "DFSVOLOPER");
		if (bOk) bOk = del.execute("dfvejer="+paramEjer+" AND dfvnif='"+paramNif+"'");
		for (VolumenOperaciones vo : lVolumenOperaciones){
			if (bOk){
				Insert in = new Insert(connEA, "DFSVOLOPER");
				in.valor("dfvejer", paramEjer);
				in.valor("dfvnif", paramNif);
				in.valor("dfvcodigo", vo.codigo);
				in.valor("dfvmodelo", vo.modelo);
				in.valor("dfvtotvol", vo.totalVolumen);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = vo.codigo;
				}
			}
		}
		return bOk;
	}
	
	private boolean leerTODO(){
//		if (linea.startsWith("")){
//			.add();
//			return sError == null;
//		}
		return true;
	}
	
	private boolean grabarTODO(){
		boolean bOk = true;
		Delete del = new Delete(connEA, "TODO");
		if (bOk) bOk = del.execute("");
//		for (){
//			if (bOk){
//				Insert in = new Insert(connEA, "TODO");
//				bOk = in.execute();
//				if (!bOk){
//					hayIncidencias = true;
//					sError = .codigo;
//				}
//			}
//		}
		return bOk;
	}
	
	private void mostrarIncidencia(){
		//TODO
		Maefc.message("TODO");
	}
	
	private String parserString(int ini, int fin) {
		return parserString(null, ini, fin);
	}
	
	private String parserString(String campo, int ini, int fin) {
		String s = null;
		if (linea.length()>=fin) {
			try {
				s = linea.substring(ini, fin);
			}
			catch (Exception e) {
				e.printStackTrace();
				hayIncidencias = true;
				if (sError==null || "".equals(sError)) {
					if (campo==null) sError = e.getMessage();
					else sError = campo+" ["+s+"]";
				}
			}
		}
		return s;
	}
	
	private Double parserDouble(int ini, int fin) {
		return parserDouble(null, ini, fin);
	}
	
	private Double parserDouble(String campo, int ini, int fin) {
		Double d = new Double(0);
		String s = null;
		if (linea.length()>=fin) {
			try {
				s = linea.substring(ini, fin); 
				if (s!=null && s.trim().length()>0) d = Double.parseDouble(s);
			}
			catch (Exception e) {
				e.printStackTrace();
				hayIncidencias = true;
				if (sError==null || "".equals(sError)) {
					if (campo==null) sError = e.getMessage();
					else sError = campo+" ["+s+"]";
				}
			}
		}
		return d;
	}
	
	class Domicilio {
		int ejercicio;
		String nif;
		String codigo;
		String tipoDom;
		String tipoVia;
		String codVia;
		String nombreViaL;
		String nombreViaC;
		String tipoNum;
		String numero;
		String califNum;
		String bloque;
		String portal;
		String escalera;
		String piso;
		String puerta;
		String complDom;
		String poblacion;
		String codpos;
		String codMuni;
		String muni;
		int codProv;
		String prov;
		String refcat;
		String dom21;
		String complDom21;
		String poblacion21;
		String codpos21;
		String provReg21;
		String pais21;
		String codPais21;
		String nacional21;
		
	}
	
	class DatosCensales {
		int ejercicio;
		String nif;
		String codigo;
		String codAct;
		String descAct;
		String grupoIAE;
		String codCNAE;
	}
	
	class PeriodoImpositivoYCNAE{
		int ejercicio;
		String nif;
		String codigo;
		Date fechaini;
		Date fechafin;
		String tipo;
		String CNAE;
	}
	
	class Caracteres{
		int ejercicio;
		String nif;
		String codigo;
		String codCaracterMarcado;
	}
	
	class Administradores{
		int ejercicio;
		String nif;
		String codigo;
		String nifAdmin;
		String tipoPersona;
		String nombreRazon;
	}
	
	class EntidadesParticipa{
		int ejercicio;
		String nif;
		String codigo;
		String nifOEquiv;
		String nombreRazon;
		String provPais;
		double porcPart;
		double totalNominal;
		double valorLibros;
		double dividendos;
	}
	
	class PersonasYEntParticipan{
		int ejercicio;
		String nif;
		String codigo;
		String nifParticipa;
		String tipoPersona;
		String esRepre;
		String nombreRazon;
		String provPais;
		double valorNominal;
		double porcPart;
	}
	
	class SecreYRepre{
		int ejercicio;
		String nif;
		String codigo;
		String nifPerso;
		String nombrePerso;
		String funcion;
		Date fechaFirma;
	}
	
	class PagoFraccionado{
		int ejercicio;
		String nif;
		String codigo;
		String modelo;
		String tipo;
		String periodo;
		String delegacion;
		String justificante;
		double importe;
	}
	
	class VolumenOperaciones{
		int ejercicio;
		String nif;
		String codigo;
		String modelo;
		double totalVolumen;
	}
	
	class TODO{
		int ejercicio;
		String nif;
		String codigo;
	}
	
	private String getActividad(String cod){
		String desc = null;
		if (hmActividades.containsKey(cod)){
			desc = hmActividades.get(cod);
		}
		return desc;
	}
	
	public static String getPeriodoDesc(String tipoPer){
		if ("1".equals(tipoPer)){
			return "Ejercicio económico de 12 meses de duración, que coincida con el año natural";
		}
		if ("2".equals(tipoPer)){
			return "Ejercicio económico de 12 meses de duración, que no coincida con el año natural";
		}
		if ("3".equals(tipoPer)){
			return "Ejercicio económico de duración inferior a 12 meses";
		}
		return null;
	}
	
	public static String getCaracterMarcadoDesc(String codigo){
		if("00001".equals(codigo)) return "Entidad sin ánimo de lucro acogida régimen fiscal Título II Ley 49/2002";
		if("00002".equals(codigo)) return "Entidad parcialmente exenta";
		if("00003".equals(codigo)) return "Sociedad de inversión de capital variable o fondo de inversión de carácter financiero";
		if("00004".equals(codigo)) return "Sociedad de inversión inmobiliaria o fondo de inversión inmobiliaria";
		if("00005".equals(codigo)) return "Comunidades titulares de montes vecinales en mano común";
		if("00006".equals(codigo)) return "Incentivos entidad de reducida dimensión(Cap. XI, Tít. VII LIS)";
		if("00007".equals(codigo)) return "Imputación en base imp. rentas positivas art. 100 LIS";
		if("00009".equals(codigo)) return "Entidad dominante de grupo fiscal";
		if("00010".equals(codigo)) return "Entidad dependiente de grupo fiscal";
		if("00011".equals(codigo)) return "Entidad de tenencia de valores extranjeros";
		if("00012".equals(codigo)) return "SOCIMI";
		if("00013".equals(codigo)) return "Agrupación de interés económico española o Unión temporal de empresas";
		if("00014".equals(codigo)) return "Agrupación europea de interés económico";
		if("00015".equals(codigo)) return "Entidad ZEC";
		if("00016".equals(codigo)) return "Opción art. 46.2 LIS";
		if("00017".equals(codigo)) return "Cooperativa protegida";
		if("00018".equals(codigo)) return "Cooperativa especialmente protegida";
		if("00019".equals(codigo)) return "Resto cooperativas";
		if("00020".equals(codigo)) return "Otros regímenes especiales";
		if("00021".equals(codigo)) return "Establecimiento permanente";
		if("00022".equals(codigo)) return "Régimen entid. navieras en función del tonelaje";
		if("00023".equals(codigo)) return "Gran empresa";
		if("00024".equals(codigo)) return "Entidad de crédito";
		if("00025".equals(codigo)) return "Entidad aseguradora";
		if("00026".equals(codigo)) return "Entidad inactiva";
		if("00027".equals(codigo)) return "Base imponible negativa o cero";
		if("00028".equals(codigo)) return "Tribut. conjunta Estado/Diput. Cdad. Foraless";
		if("00029".equals(codigo)) return "Régimen especial Canarias";
		if("00030".equals(codigo)) return "Transmisión elementos patrimoniales arts. 27.2.d) y 77.1 LIS";
		if("00031".equals(codigo)) return "Entidades de capital-riesgo";
		if("00032".equals(codigo)) return "Sociedad de desarrollo industrial regional";
		if("00033".equals(codigo)) return "Régimen especial minería";
		if("00034".equals(codigo)) return "Régimen especial hidrocarburos";
		if("00035".equals(codigo)) return "Aplicación rég. especial fusiones, escisiones, aportaciones activos y canjes valores (Cap. VII, Tít VII)";
		if("00036".equals(codigo)) return "Sociedad de garantía recíproca o de reafianzamiento";
		if("00038".equals(codigo)) return "Entidad dedicada al arrend. de viviendas";
		if("00039".equals(codigo)) return "Entidad que forma parte de un grupo mercantil (art. 42 del Cód. Comercio)";
		if("00043".equals(codigo)) return "Obligación información DT 5ª RIS";
		if("00045".equals(codigo)) return "Inversiones anticipadas-reserva inversionesen Canarias (art. 27.11 Ley 19/1994)";
		if("00046".equals(codigo)) return "Entidad en rég. de atribución de rentas constituída en el extranjero con presencia en territorio español";
		if("00047".equals(codigo)) return "Entidades sometidas a la normativa foral";
		if("00048".equals(codigo)) return "Fondo de pensiones Real Decreto Legislativo 1/2002, de 29 de noviembre";
		if("00049".equals(codigo)) return "Regímenes especiales de normativa foral";
		if("00057".equals(codigo)) return "Régimen fiscal salida SOCIMI";
		if("00058".equals(codigo)) return "Mutua de seguros o Mutualidad de previsión social";
		if("00059".equals(codigo)) return "Opciones arts. 39.2 y 39.3 LIS";
		if("00060".equals(codigo)) return "Fondos o activos de titulización";
		if("00062".equals(codigo)) return "Rég. fiscal de operaciones de aportación de activos a sociedades para la gestión de activos (Ley 8/2012)";
		if("00063".equals(codigo)) return "Tipo gravamen reducido para entid. de nueva creación (DT 22ª LIS)";
		if("00064".equals(codigo)) return "Régimen fiscal entrada SOCIMI";
		if("00065".equals(codigo)) return "Bonificación personal investigador (RD 475/2014)";
		if("00066".equals(codigo)) return "Entidad patrimonial";
		if("00067".equals(codigo)) return "Opción régimen transitorio de la reducción de ingresos procedentes de determinados activos intangibles (DT 20ª LIS)";
		if("00070".equals(codigo)) return "Compensación bases imponibles negativas para entidades de nueva creación (art. 26.3 LIS)";
		if("00071".equals(codigo)) return "Tipo gravamen reducido para entid. de nueva creación (art. 29.1 LIS)";
		if("00072".equals(codigo)) return "Extinción de entidad";
		if("00073".equals(codigo)) return "Opción del 0,7% de la cuota íntegra para fines sociales (DA 103ª Ley 6/2018)";
		return null;
	}
	
	public static String getTipoPagoFraccionado(String codigo){
		if ("I".equals(codigo)) return "Ingreso";
		if ("N".equals(codigo)) return "Negativa";
		if ("C".equals(codigo)) return "Compensación";
		if ("D".equals(codigo)) return "Solic. devolución";
		if ("F".equals(codigo)) return "Formalización";
		if ("A".equals(codigo)) return "Aplazamiento";
		if ("M".equals(codigo)) return "Impos. pago";
		if ("S".equals(codigo)) return "Solic. Compens.";
		if ("E".equals(codigo)) return "Prop. D. I. Ex";
		if ("G".equals(codigo)) return "Ingreso CCT";
		if ("V".equals(codigo)) return "Devoluc. CCT";
		return null;
	}
}

