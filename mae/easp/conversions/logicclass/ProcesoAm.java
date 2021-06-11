package mae.easp.conversions.logicclass;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import geyce.maefc.Aplication;
import geyce.maefc.DBConnection;
import geyce.maefc.Delete;
import geyce.maefc.Insert;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import mae.easp.general.Easp;

public class ProcesoAm {
	private DBConnection connJCO;
	private int empresa;
	private int ejercicio;
	private final List<String> dominiosGIE = Arrays.asList(new String[]{"101139000000", "888888000000"});
	private final int EJER_AMORT_NO_BORRAR = 2021; 
	
	public ProcesoAm (DBConnection connJCO, int empresa, int ejercicio) {
		this.connJCO = connJCO;
		this.empresa = empresa;
		this.ejercicio = ejercicio;
	}

	public DBConnection getConnJCO() {
		return connJCO;
	}

	public int getEmpresa() {
		return empresa;
	}

	public int getEjercicio() {
		return ejercicio;
	}

	private boolean tieneDatos (DBConnection conn) {
		Selector s = new Selector (conn);
		s.execute("Select pciempresa from PCINMOV where pciempresa="+empresa);
		boolean tiene = s.next();
		s.close();
		return tiene;
	}
	
	public boolean tieneDatosJCO() {
		return tieneDatos (connJCO);
	}

	public boolean tieneDatosEA() {
		return tieneDatos (Easp.connEA);
	}
	
	public boolean traspasarEA_HEA(int idlog) {
		boolean bOk = idlog>0;
		Selector spci = new Selector (Easp.connEA);
		spci.execute("Select * from PCINMOV where pciempresa="+empresa+" order by pcielemento");
		while (spci.next() && bOk) {
			int    pcielemento    = spci.getint("pcielemento    ".trim());
			int    pciempresa     = spci.getint("pciempresa    ".trim());
			int    pciejercicio   = spci.getint("pciejercicio  ".trim());
			String pcicuenta      = spci.getString("pcicuenta     ".trim());
			String pcisubcuenta   = spci.getString("pcisubcuenta  ".trim());			
			int    pciarticulo    = spci.getint("pciarticulo   ".trim());
			int    pcicodigoamor  = spci.getint("pcicodigoamor ".trim());
			int    pciperapli     = spci.getint("pciperapli    ".trim());
			int    pciunidades    = spci.getint("pciunidades   ".trim());
			String pcitipoamort   = spci.getString("pcitipoamort  ".trim());
			String pcidesc        = spci.getString("pcidesc       ".trim());
			String pcisubctaamort = spci.getString("pcisubctaamort".trim());
			String pciregistro    = spci.getString("pciregistro   ".trim());
			String pcictadot      = spci.getString("pcictadot     ".trim());
			String pcisubctadot   = spci.getString("pcisubctadot  ".trim());
			String pcictaamort    = spci.getString("pcictaamort   ".trim());
			String pcinuevousado  = spci.getString("pcinuevousado ".trim());
			String pciobser       = spci.getString("pciobser      ".trim());
			double pcicoste       = spci.getdouble("pcicoste      ".trim());
			double pciadquis      = spci.getdouble("pciadquis     ".trim());
			double pcihoras       = spci.getdouble("pcihoras      ".trim());
			double pcicoefapli    = spci.getdouble("pcicoefapli   ".trim());
			double pcireserva     = spci.getdouble("pcireserva    ".trim());
			double pcinoamort     = spci.getdouble("pcinoamort    ".trim());
			Date   pcifecalta     = spci.getDate("pcifecalta    ".trim());
			Date   pcifecbaja     = spci.getDate("pcifecbaja    ".trim());
			Date   pcifecplan     = spci.getDate("pcifecplan    ".trim());
			int    pcicodini      = spci.getint("pcicodini    ".trim());
			String pcifradoc     = spci.getString("pcifradoc");
			Date   pcifrafecha    = spci.getDate("pcifrafecha");
			double pcifratotal    = spci.getdouble("pcifratotal");
			double pcifrabase     = spci.getdouble("pcifrabase");
			double pcifracuota    = spci.getdouble("pcifracuota");
			double pcifraporc     = spci.getdouble("pcifraporc");
			String pcinifprov     = spci.getString("pcinifprov");
			String pcinomprov     = spci.getString("pcinomprov");
			String pcicausabaja   = spci.getString("pcicausabaja");
			String pciproyecto    = spci.getString("pciproyecto");
			String pcideparta     = spci.getString("pcideparta");
			int pcianyosreg       = spci.getint("pcianyosreg");
			int pcidivisor        = spci.getint("pcidivisor");
			double pcicoefdefi    = spci.getdouble("pcicoefdefi");
			
			Insert ipci = new Insert (Easp.connEA,"PCINMOVHIS");
			ipci.valor("pcihelemento",0);
			ipci.valor("pcihempresa",pciempresa);
			ipci.valor("pcihejercicio",pciejercicio);
			ipci.valor("pcihcuenta",pcicuenta);
			ipci.valor("pcihsubcuenta",pcisubcuenta);
			ipci.valor("pciharticulo",pciarticulo);
			ipci.valor("pcihcodigoamor",pcicodigoamor);
			if (pciperapli!=0) ipci.valor("pcihperapli",pciperapli);
			if (pciunidades!=0) ipci.valor("pcihunidades",pciunidades);
			ipci.valor("pcihtipoamort",pcitipoamort);
			ipci.valor("pcihdesc",pcidesc);
			ipci.valor("pcihsubctaamort",pcisubctaamort);
			ipci.valor("pcihregistro",pciregistro);
			ipci.valor("pcihctadot",pcictadot);
			ipci.valor("pcihsubctadot",pcisubctadot);
			ipci.valor("pcihctaamort",pcictaamort);
			ipci.valor("pcihnuevousado",pcinuevousado);
			ipci.valor("pcihobser",pciobser);
			if (pcicoste!=0) ipci.valor("pcihcoste",pcicoste);
			if (pciadquis!=0) ipci.valor("pcihadquis",pciadquis);
			if (pcihoras!=0) ipci.valor("pcihhoras",pcihoras);
			if (pcicoefapli!=0) ipci.valor("pcihcoefapli",pcicoefapli);
			if (pcireserva!=0) ipci.valor("pcihreserva",pcireserva);
			if (pcinoamort!=0) ipci.valor("pcihnoamort",pcinoamort);
			ipci.valor("pcihfecalta",pcifecalta);
			ipci.valor("pcihfecbaja",pcifecbaja);
			ipci.valor("pcihfecplan",pcifecplan);
			ipci.valor("pcihlog",idlog);
			ipci.valor("pcihcodini",pcicodini);
			ipci.valor("pcihfradoc", pcifradoc);
			ipci.valor("pcihfrafecha", pcifrafecha);
			if (pcifratotal!=0) ipci.valor("pcihfratotal", pcifratotal);
			if (pcifrabase!=0) ipci.valor("pcihfrabase", pcifrabase);
			if (pcifracuota!=0) ipci.valor("pcihfracuota", pcifracuota);
			if (pcifraporc!=0) ipci.valor("pcihfraporc", pcifraporc);
			ipci.valor("pcihnifprov", pcinifprov);
			ipci.valor("pcihnomprov", pcinomprov);
			ipci.valor("pcihcausabaja", pcicausabaja);
			ipci.valor("pcihproyecto", pciproyecto);
			ipci.valor("pcihdeparta", pcideparta);
			if (pcianyosreg!=0) ipci.valor("pcihanyosreg", pcianyosreg);
			if (pcidivisor!=0) ipci.valor("pcihdivisor", pcidivisor);
			if (pcicoefdefi!=0) ipci.valor("pcihcoefdefi", pcicoefdefi);
			bOk = ipci.execute();
			
			if (bOk) {
				Selector spcm = new Selector (Easp.connEA);
				spcm.execute("Select * from PCMORANUAL where pcmelemento="+pcielemento+" order by pcmamorejer");
				int pcmelemento = ipci.getField("pcihelemento").getInteger();
				while (spcm.next() && bOk) {
					int pcmamorejer          = spcm.getint("pcmamorejer");
					String pcmtipo           = spcm.getString("pcmtipo");
					double pcmcoefamort      = spcm.getdouble("pcmcoefamort");
					double pcmamortanual     = spcm.getdouble("pcmamortanual");
					double pcmamortacum      = spcm.getdouble("pcmamortacum");
					double pcmamortpdte      = spcm.getdouble("pcmamortpdte");
					double pcmcuotaapli      = spcm.getdouble("pcmcuotaapli");
					Date   pcmultfecha       = spcm.getDate("pcmultfecha");
					Insert ipcm = new Insert (Easp.connEA,"PCMORANUALHIS");
					ipcm.valor("pcmhelemento",pcmelemento);
					ipcm.valor("pcmhamorejer",pcmamorejer);
					ipcm.valor("pcmhtipo",pcmtipo);
					if (pcmcoefamort!=0)  ipcm.valor("pcmhcoefamort",pcmcoefamort);
					if (pcmamortanual!=0) ipcm.valor("pcmhamortanual",pcmamortanual);
					if (pcmamortacum!=0)  ipcm.valor("pcmhamortacum",pcmamortacum);
					if (pcmamortpdte!=0)  ipcm.valor("pcmhamortpdte",pcmamortpdte);
					if (pcmcuotaapli!=0)  ipcm.valor("pcmhcuotaapli",pcmcuotaapli);
					ipcm.valor("pcmhultfecha",pcmultfecha);
					bOk = ipcm.execute();
				}
				spcm.close();
				
			}
		}
		spci.close();
		return bOk;
	}

	private boolean eliminar (DBConnection conn) {
		boolean bOk = true;
		Delete dpcm = new Delete (conn,"PCMORANUAL");
		String query = "pcmelemento in (Select pcielemento from PCINMOV where pciempresa="+empresa+")";
		if (dominiosGIE.contains(Easp.dominio)) query = "pcmelemento in (Select pcielemento from PCINMOV where pciempresa="+empresa+" AND  YEAR(pcifecalta)<"+EJER_AMORT_NO_BORRAR+")";
		bOk = dpcm.execute(query);
		Delete dpci = new Delete (conn,"PCINMOV");
		query = "pciempresa="+empresa;
		if (dominiosGIE.contains(Easp.dominio)) query = "pciempresa="+empresa+" AND YEAR(pcifecalta)<"+EJER_AMORT_NO_BORRAR;
		if (bOk) bOk = dpci.execute(query);
		return bOk;
	}
	
	public boolean eliminarEA() {
		return eliminar (Easp.connEA);
	}
	
	public int generarLog (String origen) {
		Insert ins = new Insert (Easp.connEA,"PCINMOVLOG");
		ins.valor("pcilcodi",0);
		ins.valor("pcilrempresa", empresa);
		ins.valor("pcilrfecha", Maefc.getDate());
		ins.valor("pcilruser", Aplication.getAplication().getUser());
		ins.valor("pcilprcorigen",origen);
		if (!ins.execute()) return -1;
		return ins.getField("pcilcodi").getInteger();
	}

}

