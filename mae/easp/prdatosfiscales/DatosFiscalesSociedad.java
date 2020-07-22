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
import geyce.maefc.TableDef;
import geyce.maefc.FieldDef;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import mae.general.ProgressBarForm;
import mae.general.Util;

public class DatosFiscalesSociedad {
	private File f;
	private int paramEjer;
	private String paramNif;
	private DBConnection connEA;
	private ProgressBarForm pbf;
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
	private List<RendimientosTrabajo> lRendimientosTrabajo;
	private List<DeduccionesBasesNegReservas> lDeduccionesBasesNegReservas;
	private HashMap<Integer,String[]> hmBIN;
	private HashMap<Integer,String[]> hmCN;
	private HashMap<Integer,String[]> hmDI1;
	private HashMap<Integer,String[]> hmDI2;
	private HashMap<Integer,String[]> hmDI3;
	private HashMap<Integer,String[]> hmDI4;
	private HashMap<Integer,String[]> hmBEN;
	private HashMap<Integer,String[]> hmPER;
	private HashMap<Integer,String[]> hmCAN;
	private HashMap<Integer,String[]> hmACT;
	private HashMap<Integer,String[]> hmDON;
	private HashMap<Integer,String[]> hmMT1;
	private HashMap<Integer,String[]> hmMT2;
	private HashMap<Integer,String[]> hmNIV;
	private HashMap<Integer,String[]> hmDNI;
	private HashMap<Integer,String[]> hmCAP;
	private HashMap<Integer,String[]> hmGFP;
	private HashMap<Integer,String[]> hmLBO;
	private HashMap<Integer,String[]> hmRIC;
	private List<Donaciones> lDonaciones;
	private List<MultasDGT> lMultasDGT;
	private List<RendimientosCtasBancarias> lRendimientosCtasBancarias;
	private List<Sancion> lSanciones;



	public DatosFiscalesSociedad(File f, int paramEjer, String paramNif, DBConnection connEA, ProgressBarForm pbf){
		this.f = f;
		this.paramEjer = paramEjer;
		this.paramNif = paramNif;
		this.connEA = connEA;
		this.pbf = pbf;
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
		lRendimientosTrabajo = new ArrayList<RendimientosTrabajo>();
		lDeduccionesBasesNegReservas = new ArrayList<DeduccionesBasesNegReservas>();
		lDonaciones = new ArrayList<Donaciones>();
		lMultasDGT = new ArrayList<MultasDGT>();
		lRendimientosCtasBancarias = new ArrayList<RendimientosCtasBancarias>();
		lSanciones = new ArrayList<Sancion>();

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

	private void initBIN(){
		//Bases imponibles negativas pendientes de compensar de ejercicios anteriores
		//pos inicial, anyoded, casilla M200 IS.2018, casilla M200 IS.2019
		hmBIN = new HashMap<Integer,String[]>();
		hmBIN.put(8,  new String[]{"1997", "00548","00640"});
		hmBIN.put(21, new String[]{"1998", "00645","00643"});
		hmBIN.put(34, new String[]{"1999", "00648","00646"});
		hmBIN.put(47, new String[]{"2000", "00651","00649"});
		hmBIN.put(60, new String[]{"2001", "00654","00652"});
		hmBIN.put(73, new String[]{"2002", "00657","00655"});
		hmBIN.put(86, new String[]{"2002", "00660","00658"});
		hmBIN.put(99, new String[]{"2004", "00663","00661"});
		hmBIN.put(112,new String[]{"2005", "00666","00664"});
		hmBIN.put(125,new String[]{"2005", "00669","00667"});
		hmBIN.put(138,new String[]{"2007", "00748","00743"});
		hmBIN.put(151,new String[]{"2008", "00277","00275"});
		hmBIN.put(164,new String[]{"2009", "00610","00608"});
		hmBIN.put(177,new String[]{"2010", "00706","00704"});
		hmBIN.put(190,new String[]{"2011", "00015","00013"});
		hmBIN.put(203,new String[]{"2012", "00727","00725"});
		hmBIN.put(216,new String[]{"2013", "00536","00534"});
		hmBIN.put(229,new String[]{"2014", "00699","00607"});
		hmBIN.put(242,new String[]{"2015", "01047","01045"});
		hmBIN.put(255,new String[]{"2016", "01521","01519"});
		hmBIN.put(268,new String[]{"2017", "01594","01592"});
		hmBIN.put(281,new String[]{"2018", "00552","01825"});
		hmBIN.put(294,new String[]{"2018", "01330","01825"});
	}

	private void initCN(){
		//Cuotas negativas cooperativas pendientes de compensar ejercicios anteriores
		hmCN = new HashMap<Integer,String[]>();
		hmCN.put(8,   new String[]{"2000","01224","00673"});
		hmCN.put(21,  new String[]{"2001","00678","00676"});
		hmCN.put(34,  new String[]{"2002","00681","00679"});
		hmCN.put(47,  new String[]{"2003","00684","00682"});
		hmCN.put(60,  new String[]{"2004","00687","00685"});
		hmCN.put(73,  new String[]{"2005","00690","00688"});
		hmCN.put(86,  new String[]{"2006","00693","00691"});
		hmCN.put(99,  new String[]{"2007","00672","00623"});
		hmCN.put(112, new String[]{"2008","00281","00279"});
		hmCN.put(125, new String[]{"2009","00900","00587"});
		hmCN.put(138, new String[]{"2010","00100","00059"});
		hmCN.put(151, new String[]{"2011","00019","00017"});
		hmCN.put(164, new String[]{"2012","00777","00772"});
		hmCN.put(177, new String[]{"2013","00909","00907"});
		hmCN.put(190, new String[]{"2014","00912","00910"});
		hmCN.put(203, new String[]{"2015","00937","00935"});
		hmCN.put(216, new String[]{"2016","01513","01511"});
		hmCN.put(229, new String[]{"2017","01769","01767"});
		hmCN.put(242, new String[]{"2018","00560","02113"});
		hmCN.put(255, new String[]{"2018","01331","02113"});
	}

	private void initDI1(){
		//Deducciones doble imposición interna RDL 4/2004
		hmDI1 = new HashMap<Integer,String[]>();
		hmDI1.put(8,   new String[]{"2008","00848","00104"});
		hmDI1.put(21,  new String[]{"2009","00284","00106"});
		hmDI1.put(34,  new String[]{"2010","00707","00108"});
		hmDI1.put(47,  new String[]{"2011","00300","00110"});
		hmDI1.put(60,  new String[]{"2012","00027","00112"});
		hmDI1.put(73,  new String[]{"2013","00716","00114"});
		hmDI1.put(86,  new String[]{"2014","00738","00735"});
	}

	private void initDI2(){
		//Deducciones doble imposición internacional RDL 4/2004
		hmDI2 = new HashMap<Integer,String[]>();
		hmDI2.put(8,   new String[]{"2005","00639","00153"});
		hmDI2.put(21,  new String[]{"2006","00197","00154"});
		hmDI2.put(34,  new String[]{"2007","00287","00155"});
		hmDI2.put(47,  new String[]{"2008","00827","00156"});
		hmDI2.put(60,  new String[]{"2009","00003","00157"});
		hmDI2.put(73,  new String[]{"2010","00030","00158"});
		hmDI2.put(86,  new String[]{"2011","00719","00159"});
		hmDI2.put(99,  new String[]{"2012","00724","00720"});
		hmDI2.put(112, new String[]{"2013","00742","00739"});
		hmDI2.put(125, new String[]{"2014","00137","00134"});
	}
	private void initDI3(){
		//Deducciones doble imposición interna DT 23ª.1 LIS
		hmDI3 = new HashMap<Integer,String[]>();
		hmDI3.put(8,   new String[]{"2015","00121","00101"});
		hmDI3.put(21,  new String[]{"2016","00126","00122"});
		hmDI3.put(34,  new String[]{"2017","01599","01595"});
		hmDI3.put(47,  new String[]{"2018","01347","01828"});

	}

	private void initDI4(){
		//Deducciones doble imposición internacional LIS
		hmDI4 = new HashMap<Integer,String[]>();
		hmDI4.put(8,   new String[]{"2015","01053","01054"});
		hmDI4.put(21,  new String[]{"2016","01352","01348"});
		hmDI4.put(34,  new String[]{"2017","01774","01770"});
		hmDI4.put(47,  new String[]{"2018","00174","01833"});

	}

	private void initBEN(){
		//Deducciones disposición transitoria 24ª.7 LIS y ART. 42 RDL 4/2004
		hmBEN = new HashMap<Integer,String[]>();
		hmBEN.put(8,   new String[]{"2004","00934","00932"});
		hmBEN.put(21,  new String[]{"2005","00299","00297"});
		hmBEN.put(34,  new String[]{"2006","00092","00090"});
		hmBEN.put(47,  new String[]{"2007","00006","00004"});
		hmBEN.put(60,  new String[]{"2008","00033","00031"});
		hmBEN.put(73,  new String[]{"2009","00024","00022"});
		hmBEN.put(86,  new String[]{"2010","00042","00040"});
		hmBEN.put(99,  new String[]{"2011","00140","00138"});
		hmBEN.put(112, new String[]{"2012","00143","00141"});
		hmBEN.put(125, new String[]{"2013","00190","00188"});
		hmBEN.put(138, new String[]{"2014","00805","00803"});
		hmBEN.put(151, new String[]{"2015","01057","01055"});
		hmBEN.put(164, new String[]{"2016","00709","00700"});
		hmBEN.put(177, new String[]{"2017","01355","01353"});
		hmBEN.put(190, new String[]{"2018","01840","01775"});

	}

	private void initPER(){
		//Deducciones disposición transitoria 24ª.1 LIS
		hmPER = new HashMap<Integer,String[]>();
		hmPER.put(8,   new String[]{"2014","00754","00749"});
		hmPER.put(21,  new String[]{"2015","00757","00752"});
		hmPER.put(34,  new String[]{"2016","00760","00755"});
		hmPER.put(47,  new String[]{"2017","00763","00758"});
		hmPER.put(60,  new String[]{"2018","00784","00761 "});

	}

	private void initCAN(){
		//Deducciones inversión en Canarias
		hmCAN = new HashMap<Integer,String[]>();
		hmCAN.put(8,  new String[]{"2010", "01356","00854"});
		hmCAN.put(21, new String[]{"2011", "00859","00857"});
		hmCAN.put(34, new String[]{"2012", "00862","00860"});
		hmCAN.put(47, new String[]{"2013", "00865","00863"});
		hmCAN.put(60, new String[]{"2014", "00885","00883"});
		hmCAN.put(73, new String[]{"2015", "00790","00785"});
		hmCAN.put(86, new String[]{"2016", "01359","01357"});
		hmCAN.put(99, new String[]{"2017", "01780","01778"});
		hmCAN.put(112,new String[]{"2018", "02118","00852"});
		hmCAN.put(125,new String[]{"2001", "00873","00871"});
		hmCAN.put(138,new String[]{"2002", "00876","00874"});
		hmCAN.put(151,new String[]{"2003", "00879","00877"});
		hmCAN.put(164,new String[]{"2004", "00882","00880"});
		hmCAN.put(177,new String[]{"2005", "00870","00866"});
		hmCAN.put(190,new String[]{"2006", "00941","00939"});
		hmCAN.put(203,new String[]{"2007", "00193","00191"});
		hmCAN.put(216,new String[]{"2008", "00701","00613"});
		hmCAN.put(229,new String[]{"2009", "00011","00200"});
		hmCAN.put(242,new String[]{"2010", "00039","00037"});
		hmCAN.put(255,new String[]{"2011", "00046","00044"});
		hmCAN.put(268,new String[]{"2012", "00530","00528"});
		hmCAN.put(281,new String[]{"2013", "00146","00144"});
		hmCAN.put(294,new String[]{"2014", "00149","00147"});
		hmCAN.put(307,new String[]{"2015", "00242","00240"});
		hmCAN.put(320,new String[]{"2016", "01060","01058"});
		hmCAN.put(333,new String[]{"2017", "00806","00791"});
		hmCAN.put(346,new String[]{"2018", "02124","01781"});
		hmCAN.put(359,new String[]{"2018", "02127","02119"});

	}

	private void initACT(){
		//Deducciones para incentivar determinadas actividades (Cap. IV Tit. VI y DT 24ª.3 LIS)
		hmACT = new HashMap<Integer,String[]>();
		hmACT.put(8,  new String[]{"2001", "00788","00786"});
		hmACT.put(21, new String[]{"2002", "00833","00766"});
		hmACT.put(34, new String[]{"2003", "00897","00198"});
		hmACT.put(47, new String[]{"2004", "00290","00288"});
		hmACT.put(60, new String[]{"2005", "00468","00466"});
		hmACT.put(73, new String[]{"2006", "00586","00061"});
		hmACT.put(86, new String[]{"2007", "00478","00472"});
		hmACT.put(99, new String[]{"2008", "00182","00180"});
		hmACT.put(112,new String[]{"2009", "00533","00531"});
		hmACT.put(125,new String[]{"2010", "00947","00945"});
		hmACT.put(138,new String[]{"2011", "00962","00960"});
		hmACT.put(151,new String[]{"2012", "00186","00183"});
		hmACT.put(164,new String[]{"2013", "00968","00966"});
		hmACT.put(177,new String[]{"2013", "00459","00457"});
		hmACT.put(190,new String[]{"2013", "00462","00460"});
		hmACT.put(203,new String[]{"2014", "01065","01063"});
		hmACT.put(216,new String[]{"2014", "01068","01066"});
		hmACT.put(229,new String[]{"2014", "01071","01069"});
		hmACT.put(242,new String[]{"2015", "00815","00813"});
		hmACT.put(255,new String[]{"2015", "00507","00986"});
		hmACT.put(268,new String[]{"2015", "00594","00557"});
		hmACT.put(281,new String[]{"2016", "01616","01614"});
		hmACT.put(294,new String[]{"2016", "01619","01617"});
		hmACT.put(307,new String[]{"2016", "01622","01620"});
		hmACT.put(320,new String[]{"2017", "01849","01847"});
		hmACT.put(333,new String[]{"2017", "01852","01850"});
		hmACT.put(346,new String[]{"2017", "01855","01853"});
		hmACT.put(359,new String[]{"2018", "00809 + 01077 + 00965 + 00751 + 00797 + 00889 + 01371 + 02192 + 00636","02218"});
		hmACT.put(372,new String[]{"2018", "00800","02221"});
		hmACT.put(385,new String[]{"2018", "00713","02224"});
		hmACT.put(398,new String[]{"2018", "00830","00828"});

	}

	private void initDON(){
		//Deducción donativos a entidades sin fines de lucro. Ley 49/2002
		hmDON = new HashMap<Integer,String[]>();
		hmDON.put(8,  new String[]{"2009", "00010","00008"});
		hmDON.put(21, new String[]{"2010", "00036","00034"});
		hmDON.put(34, new String[]{"2011", "00203","00201"});
		hmDON.put(47, new String[]{"2012", "00906","00904"});
		hmDON.put(60, new String[]{"2013", "00992","00990"});
		hmDON.put(73, new String[]{"2014", "00999","00997"});
		hmDON.put(86, new String[]{"2015", "00248","00246"});
		hmDON.put(99, new String[]{"2016", "00995","00993"});
		hmDON.put(112,new String[]{"2017", "01436","01434"});
		hmDON.put(125,new String[]{"2018", "01952","01718"});

	}

	private void initMT1(){
		//Deducción por reversión de medidas temporales (DT 37ª.1 LIS)
		hmMT1 = new HashMap<Integer,String[]>();
		hmMT1.put(8,  new String[]{"2015", "01169","01167"});
		hmMT1.put(21, new String[]{"2016", "01441","01439"});
		hmMT1.put(34, new String[]{"2017", "01445","01443"});
		hmMT1.put(47, new String[]{"2018", "01956","01722"});

	}

	private void initMT2(){
		//Deducción por reversión de medidas temporales (DT 37ª.2 LIS)
		hmMT2 = new HashMap<Integer,String[]>();
		hmMT2.put(8,  new String[]{"2015", "01181","01179"});
		hmMT2.put(21, new String[]{"2016", "01450","01448"});
		hmMT2.put(34, new String[]{"2017", "01454","01452"});
		hmMT2.put(47, new String[]{"2018", "01960","01726"});

	}

	private void initNIV(){
		//Reserva de nivelación (reducción en base imponible)
		hmNIV = new HashMap<Integer,String[]>();
		hmNIV.put(8,  new String[]{"2015", "01143","01141"});
		hmNIV.put(21, new String[]{"2016", "01146","01144"});
		hmNIV.put(34, new String[]{"2017", "01457","01455"});
		hmNIV.put(47, new String[]{"2018", "01731","01961"});

	}

	private void initDNI(){
		//Reserva de nivelación (dotación reserva)
		hmDNI = new HashMap<Integer,String[]>();
		hmDNI.put(8,  new String[]{"2015", "01152","01150"});
		hmDNI.put(21, new String[]{"2016", "01156","01154"});
		hmDNI.put(34, new String[]{"2017", "01460","01458"});
		hmDNI.put(47, new String[]{"2018", "01966","01732"});

	}

	private void initCAP(){
		//Reserva de capitalización
		hmCAP = new HashMap<Integer,String[]>();
		hmCAP.put(8,  new String[]{"2017", "01472","01134"});
		hmCAP.put(21, new String[]{"2018", "01987","01470"});

	}

	private void initGFP(){
		//Limitación en la deducibilidad de gastos financieros. Gastos financieros pendientes de deducir
		hmGFP = new HashMap<Integer,String[]>();
		hmGFP.put(8,  new String[]{"2012", "01191","01188"});
		hmGFP.put(21, new String[]{"2013", "01196","01193"});
		hmGFP.put(34, new String[]{"2014", "01201","01198"});
		hmGFP.put(47, new String[]{"2015", "01205","01202"});
		hmGFP.put(60, new String[]{"2015", "01206","01203"});
		hmGFP.put(73, new String[]{"2016", "01210","01462"});
		hmGFP.put(86, new String[]{"2016", "01211","01463"});
		hmGFP.put(99, new String[]{"2017", "01465","01736"});
		hmGFP.put(112,new String[]{"2017", "01466","01737"});
		hmGFP.put(125,new String[]{"2018", "01980","01977"});
		hmGFP.put(138,new String[]{"2018", "01981","01978"});

	}

	private void initLBO(){
		//Pendiente de adición por límite beneficio operativo no aplicado
		hmLBO = new HashMap<Integer,String[]>();
		hmLBO.put(8,  new String[]{"2014", "00537","00273"});
		hmLBO.put(21, new String[]{"2015", "00957","00955"});
		hmLBO.put(34, new String[]{"2016", "01219","01217"});
		hmLBO.put(47, new String[]{"2017", "01469","01467"});
		hmLBO.put(60, new String[]{"2018", "01984","01741"});

	}

	private void initRIC(){
		//Régimen especial de la reserva para inversiones en Canarias (Ley 19/1994)
		hmRIC = new HashMap<Integer,String[]>();
		hmRIC.put(8,  new String[]{"2015", "00048","00089"});
		hmRIC.put(21, new String[]{"2016", "00527","00097"});
		hmRIC.put(34, new String[]{"2017", "00925","00524"});
		hmRIC.put(47, new String[]{"2018", "00996","00922"});

	}



	public boolean leer(){
		boolean bOk = true;
		initVariables();
		if (f.exists()){
			FileInputStream filein = null;
			InputStreamReader read = null;
			BufferedReader in = null;
			try{
				pbf.setSecondaryPercent(0);
				pbf.setState("Leyendo datos fiscales");
				filein = new FileInputStream(f);
				read = new InputStreamReader(filein);
				in = new BufferedReader(read);
				linea = in.readLine();
				while (linea!=null){
					if      (bOk && linea.startsWith("2DOM")) bOk = leerDatosDomicilio();
					else if (bOk && linea.startsWith("2AE"))  bOk = leerDatosCensales();
					else if (bOk && linea.startsWith("2MD1")) bOk = leerPeriodoYCNAE();
					else if (bOk && linea.startsWith("2MD2")) bOk = leerCaracteres();
					else if (bOk && linea.startsWith("2MD4")) bOk = leerAdmins();
					else if (bOk && linea.startsWith("2MD5")) bOk = leerEntidadesParticipa();
					else if (bOk && linea.startsWith("2MD6")) bOk = leerPersonasYEntParticipan();
					else if (bOk && linea.startsWith("2MD8")) bOk = leerSecreYRepre();
					else if (bOk && linea.startsWith("2PF"))  bOk = leerPagosFraccionados();
					else if (bOk && linea.startsWith("2TR"))  bOk = leerVolumenOperaciones();
					else if (bOk && linea.startsWith("2RTA")) bOk = leerRendimientosTrabajo();
					else if (bOk && linea.startsWith("2DN"))  bOk = leerDonaciones();
					else if (bOk && linea.startsWith("2MTR")) bOk = leerMultasDGT();
					else if (bOk && linea.startsWith("2CB"))  bOk = leerRendimientosCtasBancarias();
					else if (bOk && linea.startsWith("2SRN")) bOk = leerSanciones();
					else if (bOk)                             bOk = leerDeduccionesBasesNegReservas();
					linea = in.readLine();
				}
				pbf.setSecondaryPercent(100);
				pbf.setPercent(30);
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
		pbf.setState("Grabando datos fiscales");
		pbf.setSecondaryPercent(20);
		if (bOk) bOk = eliminarDatosAnteriores();
		if (bOk) bOk = grabarDomicilios();
		if (bOk) bOk = grabarDatosCensales();
		if (bOk) bOk = grabarPeriodoYCNAE();
		pbf.setSecondaryPercent(40);
		if (bOk) bOk = grabarCaracteres();
		if (bOk) bOk = grabarAdmins();
		if (bOk) bOk = grabarEntidadesParticipa();
		if (bOk) bOk = grabarPersonasYEntParticipan();
		pbf.setSecondaryPercent(60);
		if (bOk) bOk = grabarSecreYRepre();
		if (bOk) bOk = grabarPagosFraccionados();
		if (bOk) bOk = grabarVolumenOperaciones();
		if (bOk) bOk = grabarRendimientosTrabajo();
		if (bOk) bOk = grabarDonaciones();
		pbf.setSecondaryPercent(80);
		if (bOk) bOk = grabarMultasDGT();
		if (bOk) bOk = grabarRendimientosCtasBancarias();
		if (bOk) bOk = grabarSanciones();
		if (bOk) bOk = grabarDeduccionesBasesNegReservas();
		pbf.setSecondaryPercent(100);
		pbf.setPercent(100);
		if (bOk){
			connEA.commit();

		}
		else {
			connEA.rollback();

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
				d.codProv = parserInteger(231,233);
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

	private boolean eliminarDatosAnteriores(){
		boolean bOk = true;
		Delete del = new Delete(connEA,"DFSDOMICILIO");
		if (bOk) bOk = del.execute("dfdejer="+paramEjer+" AND dfdnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSCENSALES");
		if (bOk) bOk = del.execute("dfcejer="+paramEjer+" AND dfcnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSPERIODOYCNAE");
		if (bOk) bOk = del.execute("dfpejer="+paramEjer+" AND dfpnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSCARACTERES");
		if (bOk) bOk = del.execute("dfcejer="+paramEjer+" AND dfcnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSADMINS");
		if (bOk) bOk = del.execute("dfaejer="+paramEjer+" AND dfanif='"+paramNif+"'");
		del = new Delete(connEA, "DFSENTIDPART");
		if (bOk) bOk = del.execute("dfeejer="+paramEjer+" AND dfenif='"+paramNif+"'");
		del = new Delete(connEA, "DFSPERSPART");
		if (bOk) bOk = del.execute("dfpejer="+paramEjer+" AND dfpnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSSECREREPRE");
		if (bOk) bOk = del.execute("dfsejer="+paramEjer+" AND dfsnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSPAGOSFRAC");
		if (bOk) bOk = del.execute("dfpejer="+paramEjer+" AND dfpnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSVOLOPER");
		if (bOk) bOk = del.execute("dfvejer="+paramEjer+" AND dfvnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSRDTOTRAB");
		if (bOk) bOk = del.execute("dfrejer="+paramEjer+" AND dfrnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSDEDUCYBASES");
		if (bOk) bOk = del.execute("dfdejer="+paramEjer+" AND dfdnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSDONACIONES");
		if (bOk) bOk = del.execute("dfdejer="+paramEjer+" AND dfdnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSMULTASDGT");
		if (bOk) bOk = del.execute("dfmejer="+paramEjer+" AND dfmnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSRDTOCTASBAN");
		if (bOk) bOk = del.execute("dfrejer="+paramEjer+" AND dfrnif='"+paramNif+"'");
		del = new Delete(connEA, "DFSSANCIONES");
		if (bOk) bOk = del.execute("dfsejer="+paramEjer+" AND dfsnif='"+paramNif+"'");
		return bOk;
	}

	private boolean grabarDomicilios(){
		boolean bOk = true;
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

	private boolean leerRendimientosTrabajo(){
		if (linea.startsWith("2RTA")){
			RendimientosTrabajo rt = new RendimientosTrabajo();
			rt.ejercicio = paramEjer;
			rt.nif = paramNif;
			rt.codigo = parserString(1,8);
			rt.nifPagador = parserString(8,17);
			rt.nombre = parserString(17,57);
			rt.clave = parserString(57,59);
			rt.retribDinerarias = parserDouble(59,72);
			rt.retenciones = parserDouble(72,85);
			rt.especie = parserDouble(85,98);
			rt.ingCta = parserDouble(98,111);
			rt.ingCtaReper = parserDouble(111,124);
			rt.gastosDeduc = parserDouble(124,137);
			rt.reducciones = parserDouble(137,150);
			lRendimientosTrabajo.add(rt);
			return sError == null;
		}
		return true;
	}

	private boolean grabarRendimientosTrabajo(){
		boolean bOk = true;
		for (RendimientosTrabajo rt : lRendimientosTrabajo){
			if (bOk){
				Insert in = new Insert(connEA, "DFSRDTOTRAB");
				in.valor("dfrejer", paramEjer);
				in.valor("dfrnif", paramNif);
				in.valor("dfrcodigo", rt.codigo);
				in.valor("dfrnifpaga", rt.nifPagador);
				in.valor("dfrnombre", rt.nombre);
				in.valor("dfrclave", rt.clave);
				in.valor("dfrdinera", rt.retribDinerarias);
				in.valor("dfrreten", rt.retenciones);
				in.valor("dfrespecie", rt.especie);
				in.valor("dfringcta", rt.ingCta);
				in.valor("dfringctarep", rt.ingCtaReper);
				in.valor("dfrgastosded", rt.gastosDeduc);
				in.valor("dfrreduc", rt.reducciones);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = rt.codigo;
				}
			}
		}
		return bOk;
	}

	private boolean leerDeduccionesBasesNegReservas(){
		HashMap<Integer,String[]> hmTmp = new HashMap<Integer,String[]>();
		DeduccionesBasesNegReservas ded = new DeduccionesBasesNegReservas();
		ded.codigo = parserString(1,8);
		if (linea.startsWith("2BIN")){
			ded.tipoDed = "BIN";
			if (hmBIN==null) initBIN();
			hmTmp = hmBIN;
		}
		else if (linea.startsWith("2CN")){
			ded.tipoDed = "CN";
			if (hmCN==null) initCN();
			hmTmp = hmCN;
		}
		else if (linea.startsWith("2DI1")){
			ded.tipoDed = "DI1";
			if (hmDI1==null) initDI1();
			hmTmp = hmDI1;
		}
		else if (linea.startsWith("2DI2")){
			ded.tipoDed = "DI2";
			if (hmDI2==null) initDI2();
			hmTmp = hmDI2;
		}
		else if (linea.startsWith("2DI3")){
			ded.tipoDed = "DI3";
			if (hmDI3==null) initDI3();
			hmTmp = hmDI3;
		}
		else if (linea.startsWith("2DI4")){
			ded.tipoDed = "DI4";
			if (hmDI4==null) initDI4();
			hmTmp = hmDI4;
		}
		else if (linea.startsWith("2BEN")){
			ded.tipoDed = "BEN";
			if (hmBEN==null) initBEN();
			hmTmp = hmBEN;
		}
		else if (linea.startsWith("2PER")){
			ded.tipoDed = "PER";
			if (hmPER==null) initPER();
			hmTmp = hmPER;
		}
		else if (linea.startsWith("2CAN")){
			ded.tipoDed = "CAN";
			if (hmCAN==null) initCAN();
			hmTmp = hmCAN;
		}
		else if (linea.startsWith("2ACT")){
			ded.tipoDed = "ACT";
			if (hmACT==null) initACT();
			hmTmp = hmACT;
		}
		else if (linea.startsWith("2DON")){
			ded.tipoDed = "DON";
			if (hmDON==null) initDON();
			hmTmp = hmDON;
		}
		else if (linea.startsWith("2MT1")){
			ded.tipoDed = "MT1";
			if (hmMT1==null) initMT1();
			hmTmp = hmMT1;
		}
		else if (linea.startsWith("2MT2")){
			ded.tipoDed = "MT2";
			if (hmMT2==null) initMT2();
			hmTmp = hmMT2;
		}
		else if (linea.startsWith("2NIV")){
			ded.tipoDed = "NIV";
			if (hmNIV==null) initNIV();
			hmTmp = hmNIV;
		}
		else if (linea.startsWith("2DNI")){
			ded.tipoDed = "DNI";
			if (hmDNI==null) initDNI();
			hmTmp = hmDNI;
		}
		else if (linea.startsWith("2CAP")){
			ded.tipoDed = "CAP";
			if (hmCAP==null) initCAP();
			hmTmp = hmCAP;
		}
		else if (linea.startsWith("2GFP")){
			ded.tipoDed = "GFP";
			if (hmGFP==null) initGFP();
			hmTmp = hmGFP;
		}
		else if (linea.startsWith("2LBO")){
			ded.tipoDed = "LBO";
			if (hmLBO==null) initLBO();
			hmTmp = hmLBO;
		}
		else if (linea.startsWith("2RIC")){
			ded.tipoDed = "RIC";
			if (hmRIC==null) initRIC();
			hmTmp = hmRIC;
		}


		for (Integer posIni : hmTmp.keySet()){
			DeduccionesBasesNegReservas dedTmp = new DeduccionesBasesNegReservas();
			dedTmp.ejercicio = paramEjer;
			dedTmp.nif = paramNif;
			dedTmp.codigo = ded.codigo;
			dedTmp.tipoDed = ded.tipoDed;
			dedTmp.anyoDed = Integer.valueOf(hmTmp.get(posIni)[0]);
			dedTmp.casEjerAnt = hmTmp.get(posIni)[1];
			dedTmp.casEjer    = hmTmp.get(posIni)[2];
			dedTmp.importe    = parserDouble(posIni,posIni+13);
			lDeduccionesBasesNegReservas.add(dedTmp);
		}

		return sError == null;
	}

	private boolean grabarDeduccionesBasesNegReservas(){
		boolean bOk = true;
		for (DeduccionesBasesNegReservas ded : lDeduccionesBasesNegReservas){
			if (bOk){
				Insert in = new Insert(connEA, "DFSDEDUCYBASES");
				in.valor("dfdejer", paramEjer);
				in.valor("dfdnif", paramNif);
				in.valor("dfdcodigo", ded.codigo);
				in.valor("dfdtipoded", ded.tipoDed);
				in.valor("dfdanyded", ded.anyoDed);
				in.valor("dfdcasejer", ded.casEjer);
				in.valor("dfdcasejerant", ded.casEjerAnt);
				in.valor("dfdimporte", ded.importe);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = ded.codigo;
				}
			}
		}
		return bOk;
	}

	private boolean leerSanciones(){
		if (linea.startsWith("2SRN")){
			Sancion sa = new Sancion();
			sa.ejercicio = paramEjer;
			sa.nif = paramNif;
			sa.codigo = parserString(1,8);
			sa.concepto = parserString(8,48);
			sa.descripcion = parserString(48,118);
			sa.sancion = parserDouble(118,131);
			sa.recargoOrigen = parserDouble(131,144);
			sa.recargoApremio = parserDouble(144,157);
			sa.importeCalculado = parserDouble(157,170);
			lSanciones.add(sa);
			return sError == null;
		}
		return true;
	}

	private boolean grabarSanciones(){
		boolean bOk = true;
		for (Sancion sa: lSanciones){
			Insert in = new Insert(connEA, "DFSSANCIONES");
			in.valor("dfsejer", paramEjer);
			in.valor("dfsnif", paramNif);
			in.valor("dfscodigo", sa.codigo);
			in.valor("dfsconcepto", sa.concepto);
			in.valor("dfsdesc", sa.descripcion);
			in.valor("dfssancion", sa.sancion);
			in.valor("dfsrecargoo", sa.recargoOrigen);
			in.valor("dfsrecargoa", sa.recargoApremio);
			in.valor("dfscalculado", sa.importeCalculado);
			bOk = in.execute();
			if (!bOk){
				hayIncidencias = true;
				sError = sa.codigo;
			}
		}
		return bOk;
	}

	private boolean leerDonaciones(){
		if (linea.startsWith("2DN")){
			Donaciones don = new Donaciones();
			don.ejercicio = paramEjer;
			don.nif = paramNif;
			don.codigo = parserString(1,8);
			don.nifEnt= parserString(8,17);
			don.nombre= parserString(17,57);
			don.tipo= parserString(57,58);
			don.clave= parserString(58,59);
			don.importe= parserDouble(59,72);
			don.recur= parserString(72,73);
			lDonaciones.add(don);
			return sError == null;
		}
		return true;
	}

	private boolean grabarDonaciones(){
		boolean bOk = true;
		for (Donaciones don : lDonaciones){
			if (bOk){
				Insert in = new Insert(connEA, "DFSDONACIONES");
				in.valor("dfdejer", paramEjer);
				in.valor("dfdnif", paramNif);
				in.valor("dfdcodigo", don.codigo);
				in.valor("dfdnifent", don.nifEnt);
				in.valor("dfdnombre", don.nombre);
				in.valor("dfdtipo", don.tipo);
				in.valor("dfdclave", don.clave);
				in.valor("dfdimporte", don.importe);
				in.valor("dfdrecur", don.recur);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = don.codigo;
				}
			}
		}
		return bOk;
	}

	private boolean leerMultasDGT(){
		if (linea.startsWith("2MTR")){
			MultasDGT multa = new MultasDGT();
			multa.ejercicio = paramEjer;
			multa.nif = paramNif;
			multa.codigo = parserString(1,8);
			multa.ejerMulta = parserInteger(8,12);
			multa.matricula = parserString(12,22);
			multa.totalVoluntaria = parserDouble(22,35);
			multa.recargoApremio = parserDouble(35,48);
			multa.totalEjecutiva = parserDouble(48,61);
			lMultasDGT.add(multa);
			return sError == null;
		}
		return true;
	}

	private boolean grabarMultasDGT(){
		boolean bOk = true;
		for (MultasDGT multa : lMultasDGT){
			if (bOk){
				Insert in = new Insert(connEA, "DFSMULTASDGT");
				in.valor("dfmejer", paramEjer);
				in.valor("dfmnif", paramNif);
				in.valor("dfmcodigo", multa.codigo);
				in.valor("dfmejermulta", multa.ejerMulta);
				in.valor("dfmmatricula", multa.matricula);
				in.valor("dfmtvolunta", multa.totalVoluntaria);
				in.valor("dfmrecargoa", multa.recargoApremio);
				in.valor("dfmtejecut", multa.totalEjecutiva);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = multa.codigo;
				}
			}
		}
		return bOk;
	}

	private boolean leerRendimientosCtasBancarias(){
		if (linea.startsWith("2CB")){
			RendimientosCtasBancarias rdtoCtas = new RendimientosCtasBancarias();
			rdtoCtas.ejercicio = paramEjer;
			rdtoCtas.nif = paramNif;
			rdtoCtas.codigo = parserString(1,8);
			rdtoCtas.nifPaga = parserString(8,17);
			rdtoCtas.nombre = parserString(17,57);
			rdtoCtas.cuenta = parserString(57,67);
			rdtoCtas.tipo = parserString(67,68);
			rdtoCtas.titulares = parserString(68,71);
			rdtoCtas.rdtoDinerario = parserDouble(71,84);
			rdtoCtas.reten = parserDouble(84,97);
			rdtoCtas.rdtoEspecie = parserDouble(97,110);
			rdtoCtas.ingCta = parserDouble(110,123);
			lRendimientosCtasBancarias.add(rdtoCtas);
			return sError == null;
		}
		return true;
	}

	private boolean grabarRendimientosCtasBancarias(){
		boolean bOk = true;
		for (RendimientosCtasBancarias rdtoCtas : lRendimientosCtasBancarias){
			if (bOk){
				Insert in = new Insert(connEA, "DFSRDTOCTASBAN");
				in.valor("dfrejer", paramEjer);
				in.valor("dfrnif", paramNif);
				in.valor("dfrcodigo", rdtoCtas.codigo);
				in.valor("dfrnifpaga", rdtoCtas.nifPaga);
				in.valor("dfrnombre", rdtoCtas.nombre);
				in.valor("dfrcuenta", rdtoCtas.cuenta);
				in.valor("dfrtipo", rdtoCtas.tipo);
				in.valor("dfrtitulares", rdtoCtas.titulares);
				in.valor("dfrrdtodiner", rdtoCtas.rdtoDinerario);
				in.valor("dfrreten", rdtoCtas.reten);
				in.valor("dfrrdtoespec", rdtoCtas.rdtoEspecie);
				in.valor("dfringcta", rdtoCtas.ingCta);
				bOk = in.execute();
				if (!bOk){
					hayIncidencias = true;
					sError = rdtoCtas.codigo;
				}
			}
		}
		return bOk;
	}

	public void mostrarIncidencia(){
		Maefc.message("Error procesando datos fiscales:\n"+"- "+sError);
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
				if (s!=null && s.trim().length()>0) {
					if (s.startsWith("N")) s = s.substring(1); //Ens quedem valor absolut
					d = Double.parseDouble(s)/100; //2 posicions finals per 2 decimals
				}
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

	private Integer parserInteger(int ini, int fin) {
		return parserInteger(null, ini, fin);
	}

	private Integer parserInteger(String campo, int ini, int fin) {
		Integer i = new Integer(0);
		String s = null;
		if (linea.length()>=fin) {
			try {
				s = linea.substring(ini, fin);
				if (s!=null && s.trim().length()>0) i = Integer.parseInt(s);
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
		return i;
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

	class RendimientosTrabajo{
		int ejercicio;
		String nif;
		String codigo;
		String nifPagador;
		String nombre;
		String clave;
		double retribDinerarias;
		double retenciones;
		double especie;
		double ingCta;
		double ingCtaReper;
		double gastosDeduc;
		double reducciones;
	}

	class DeduccionesBasesNegReservas {
		int ejercicio;
		String nif;
		String codigo;
		String tipoDed;
		int anyoDed;
		String casEjer;
		String casEjerAnt;
		double importe;
	}

	class Donaciones{
		int ejercicio;
		String nif;
		String codigo;
		String nifEnt;
		String nombre;
		String tipo;
		String clave;
		double importe;
		String recur;
	}

	class MultasDGT{
		int ejercicio;
		String nif;
		String codigo;
		int ejerMulta;
		String matricula;
		double totalVoluntaria;
		double recargoApremio;
		double totalEjecutiva;

	}

	class RendimientosCtasBancarias{
		int ejercicio;
		String nif;
		String codigo;
		String nifPaga;
		String nombre;
		String cuenta;
		String tipo;
		String titulares;
		double rdtoDinerario;
		double reten;
		double rdtoEspecie;
		double ingCta;
	}

	class Sancion{
		int ejercicio;
		String nif;
		String codigo;
		String concepto;
		String descripcion;
		double sancion;
		double recargoOrigen;
		double recargoApremio;
		double importeCalculado;
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

	public static String getTipoPersona(String tipo){
		if ("F".equals(tipo)) return "Física";
		if ("J".equals(tipo)) return "Jurídica";
		if ("O".equals(tipo)) return "Otra";
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

	public static String getTipoDonativo(String tipo){
		if ("X".equals(tipo)) return "Especie";
		return "Dineraria";
	}

	public static String getClaveDonativo(String clave){
		if ("A".equals(clave)) return "Donativo";
		if ("B".equals(clave)) return "Donativo";
		if ("F".equals(clave)) return "Cuota";
		if ("G".equals(clave)) return "Donativo";
		return "Donativo";

	}

	public static String getRecurrenciaDonativo(String tipo){
		if ("0".equals(tipo)) return "Sin contenido";
		if ("1".equals(tipo)) return "No recurrente";
		if ("2".equals(tipo)) return "Recurrente";
		return null;
	}

	public static String getClavePagador(String clave){
		if ("E1".equals(clave)) return "Consejero"; //E1, E2, E3, E4 = Consejero
		if ("E2".equals(clave)) return "Consejero";
		if ("E3".equals(clave)) return "Consejero";
		if ("E4".equals(clave)) return "Consejero";
		return null;
	}

	public static String getFuncionSecreRepre(String funcion){
		if ("S".equals(funcion)) return "Secretario del Consejo de Administración";
		if ("R".equals(funcion)) return "Representante Legal";
		return null;
	}

	public static String getTipoCuentaBancaria(String tipo){
		if ("1".equals(tipo)) return "Cuenta corriente";
		if ("2".equals(tipo)) return "Cuenta ahorro";
		if ("3".equals(tipo)) return "Impos. A plazo";
		if ("4".equals(tipo)) return "Cuenta financ.";
		if ("5".equals(tipo)) return "Cuenta crédito";
		if ("6".equals(tipo)) return "Contr. Financ. atip.";
		return null;
	}

  public static double getImportePagoFracc(DBConnection connModelos,int ejer,String nif,String modelo,String periodo) {
     double pago = 0;
     if (periodo!=null && !"".equals(periodo.trim()) && periodo.length()>1) {
        Selector s = new Selector(connModelos);
        s.execute("Select mesimporteliq from modestado where mesmodelo='"+modelo+"' and mesnif='"+nif+"' and mesejercicio="+ejer+" and mesperiodo='"+periodo.substring(0,1)+"P'");
        if (s.next()) pago = s.getdouble("mesimporteliq");
        s.close();
     }
     return pago;
  }
  public static double getImporteNeto(DBConnection connJISS, int ejer, int codSoc) {
    double impNeto = 0;
    boolean socFinanciera = false;
    boolean socAseguradora = false;
    Selector ssociedad = new Selector(connJISS);
    ssociedad.execute("Select socent_credito,socgrupocredito,socent_aseg,socgrupoasegura from sociedades where socejeraplic="+ejer+" and soccodigo="+codSoc);
    if (ssociedad.next()) {
          if ("S".equals(ssociedad.getString("socent_credito")) || "S".equals(ssociedad.getString("socgrupocredito"))) socFinanciera = true;
          if ("S".equals(ssociedad.getString("socent_aseg")) || "S".equals(ssociedad.getString("socgrupoasegura"))) socAseguradora = true;
    }
    ssociedad.close();
    Selector scta = new Selector(connJISS);
    if (socFinanciera) {
        scta.execute("Select crecrimpneto from CTARTDOENTCRED where crecrejeraplic="+ejer+" and crecrsociedad="+codSoc);
        if (scta.next()) impNeto = scta.getdouble("crecrimpneto");
    }
    else if (socAseguradora) {
        scta.execute("Select creatimpneto from CTARTDOENTASEGT  where createjeraplic="+ejer+" and creatsociedad="+codSoc);
        if (scta.next()) impNeto = scta.getdouble("creatimpneto");
    }
    else {
        scta.execute("Select deimp_neto_cifr from CTARESULTADO where deejeraplic="+ejer+" and desociedad="+codSoc);
        if (scta.next()) impNeto = scta.getdouble("deimp_neto_cifr");
    }
    scta.close();
    return impNeto;
  }

  public static double getVolOper(DBConnection connModelos,int ejer,String nif,String modelo) {
     double volOper = 0;
     if ("390".equals(modelo)) {
        Selector sModelos = new Selector(connModelos);
        sModelos.execute("Select m903voloptotvol from MOD3903 where m903nif='"+nif+"' and m903ejercicio="+ejer+" and m903periodo='0A'");
        if (sModelos.next()) volOper = sModelos.getdouble("m903voloptotvol");
        sModelos.close();
     }
     else if ("303".equals(modelo)) {
        Selector sModelos = new Selector(connModelos);
        sModelos.execute("Select m300exototal from MOD300 where m300nif='"+nif+"' and m300ejercicio="+ejer+" and (m300periodo='12' or m300periodo='4T') and m300modelo='303'");
        if (sModelos.next()) volOper = sModelos.getdouble("m300exototal");
        sModelos.close();
     }
     else if ("322".equals(modelo)) {
        Selector sModelos = new Selector(connModelos);
        sModelos.execute("Select m322exototal from MOD322 where m322nif='"+nif+"' and m322ejercicio="+ejer+" and m322periodo='12'");
        if (sModelos.next()) volOper = sModelos.getdouble("m322exototal");
        sModelos.close();
     }
     return volOper;
  }
  public static double getBasesNeg(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impBase = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select compdte_ini_ej from COMPENPERDIDAS where comejeraplic="+ejer+" and comsociedad="+codSoc+" and comanyo="+ejerDed);
    if (s.next()) impBase = s.getdouble("compdte_ini_ej");
    s.close();
    return impBase;
  }
  public static double getCuotaNeg(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impCuota = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select cocpdte_ini_ej from COMPPERDCOOPERA where cocejeraplic="+ejer+" and cocsociedad="+codSoc+" and cocanyo="+ejerDed);
    if (s.next()) impCuota = s.getdouble("cocpdte_ini_ej");
    s.close();
    return impCuota;
  }
  public static double getDImpInterna(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select sum(dddsaldo) as total from DOBLEIMPDIVIDEN where dddejeraplic="+ejer+" and dddsociedad="+codSoc+" and dddanyo="+ejerDed);
    if (s.next()) impDed = s.getdouble("total");
    s.close();
    s.execute("Select sum(ddpsaldo) as total from DOBLEIMPPLUSVAL where ddpejeraplic="+ejer+" and ddpsociedad="+codSoc+" and ddpanyo="+ejerDed);
    if (s.next()) impDed += s.getdouble("total");
    s.close();
    return impDed;
  }
  public static double getDImpInternacional(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select sum(ddisaldo) as total from DINTERNACIONIMP where ddiejeraplic="+ejer+" and ddisociedad="+codSoc+" and ddianyo="+ejerDed);
    if (s.next()) impDed = s.getdouble("total");
    s.close();
    s.execute("Select sum(ddvsaldo) as total from DINTERNACIONDIV where ddvejeraplic="+ejer+" and ddvsociedad="+codSoc+" and ddvanyo="+ejerDed);
    if (s.next()) impDed += s.getdouble("total");
    s.close();
    return impDed;
  }
  public static double getDed247(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select sum(dresaldo) as total from DEDREINVERSION where dreejeraplic="+ejer+" and dresociedad="+codSoc+" and dreanyo="+ejerDed);
    if (s.next()) impDed = s.getdouble("total");
    s.close();
    return impDed;
  }
  public static double getDed241(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select diipd_saldo from DEDINVERSION where diiejeraplic="+ejer+" and diisociedad="+codSoc+" and diianyo="+ejerDed);
    if (s.next()) impDed = s.getdouble("diipd_saldo");
    s.close();
    return impDed;
  }
  public static double getDedCan(DBConnection connJISS, int ejer, int codSoc, int ejerDed, int nCasella) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select * from DEDINVCANARIAS where dicejeraplic="+ejer+" and dicsociedad="+codSoc+" and dicanyo="+ejerDed);
    if (s.next()) {
        if (nCasella==854 || nCasella==857 || nCasella==860 || nCasella==863 || nCasella==883 || nCasella==785 || nCasella==1357 || nCasella==1778 || nCasella==852)
            impDed = s.getdouble("dicaf_saldo");
        else if (nCasella==2119) {
            impDed = s.getdouble("dicce_go_saldo")+s.getdouble("dicid_go_saldo")+s.getdouble("dicct_go_saldo")+s.getdouble("dicpc_go_saldo")+s.getdouble("dicpd_go_saldo")+
                     s.getdouble("dicem1_go_saldo")+s.getdouble("dicem2_go_saldo")+s.getdouble("dictao_go_saldo")+s.getdouble("dicgpp_go_saldo")+s.getdouble("dicpev_go_saldo");
        }
        else {
            impDed = s.getdouble("dicid_saldo")+s.getdouble("dicpc_saldo")+s.getdouble("dicbic_saldo")+s.getdouble("dicee_saldo")+s.getdouble("dicfor_prof_sal")+s.getdouble("dicpma_mat_sald")+
                     s.getdouble("dicpd_saldo")+s.getdouble("diced_saldo")+s.getdouble("dicempleo_saldo")+s.getdouble("dicinter_saldo")+s.getdouble("dictrans_saldo")+s.getdouble("dicaip_saldo")+
                     s.getdouble("dicgua_saldo")+s.getdouble("dicapd_saldo")+s.getdouble("dicema43_saldo")+s.getdouble("dicced43_saldo")+s.getdouble("dicbfos_saldo")+s.getdouble("dicpce_saldo")+
                     s.getdouble("dictao_saldo")+s.getdouble("dicgpp_saldo")+s.getdouble("dicpev_saldo");
        }
    }
    s.close();
    return impDed;
  }
  public static double getDedActiv(DBConnection connJISS, int ejer, int codSoc, int ejerDed, int nCasella) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select * from DEDINVERSION where diiejeraplic="+ejer+" and diisociedad="+codSoc+" and diianyo="+ejerDed);
    if (s.next()) {
           TableDef DedInt = (new mae.easp.db.CatJiss()).getTable("dedinversion");
           int nCamps = DedInt.getColumns().length;
           for (int i=2;i<nCamps;i++) {
                FieldDef field = DedInt.getColumns()[i];
                String nom = field.getName();
                if (nom.endsWith("saldo") && !"diipd_saldo".equals(nom)) {
                    if (ejerDed>2012 && "diiid_saldo".equals(nom) && (nCasella==457 || nCasella==1066 || nCasella==986 || nCasella==1617 || nCasella==1850 || nCasella==2221))
                        impDed += s.getdouble(i);
                    else if (ejerDed>2012 && "diiinter_saldo".equals(nom) && (nCasella==460 || nCasella==1069 || nCasella==557 || nCasella==1620 || nCasella==1853 || nCasella==2224))
                        impDed += s.getdouble(i);
                    else impDed += s.getdouble(i);
                }
           }
    }
    s.close();
    if (ejerDed<2013 || nCasella ==966 || nCasella==1063 || nCasella==813 || nCasella==1614 || nCasella==1847 || nCasella==2218) {
       s.execute("Select * from DEDINTGRAL where digejeraplic="+ejer+" and digsociedad="+codSoc+" and diganyo="+ejerDed);
       if (s.next()) {
           TableDef DedInt = (new mae.easp.db.CatJiss()).getTable("dedintgral");
           int nCamps = DedInt.getColumns().length;
           for (int i=2;i<nCamps;i++) {
                FieldDef field = DedInt.getColumns()[i];
                if (field.getName().endsWith("saldo")) impDed += s.getdouble(i);
           }
       }
       s.close();
       s.execute("Select * from DEDINTGRAL2 where dig2ejeraplic="+ejer+" and dig2sociedad="+codSoc+" and dig2anyo="+ejerDed);
       if (s.next()) {
           TableDef DedInt = (new mae.easp.db.CatJiss()).getTable("dedintgral2");
           int nCamps = DedInt.getColumns().length;
           for (int i=2;i<nCamps;i++) {
                FieldDef field = DedInt.getColumns()[i];
                if (field.getName().endsWith("saldo")) impDed += s.getdouble(i);
           }
       }
       s.close();
       s.execute("Select * from DEDINTGRAL3 where dig3ejeraplic="+ejer+" and dig3sociedad="+codSoc+" and dig3anyo="+ejerDed);
       if (s.next()) {
           TableDef DedInt = (new mae.easp.db.CatJiss()).getTable("dedintgral3");
           int nCamps = DedInt.getColumns().length;
           for (int i=2;i<nCamps;i++) {
                FieldDef field = DedInt.getColumns()[i];
                if (field.getName().endsWith("saldo")) impDed += s.getdouble(i);
           }
       }
       s.close();
    }
    return impDed;
  }
  public static double getDedDona(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select sum(ddosaldo_anteri) as total from DEDDONACIONES where ddoejeraplic="+ejer+" and ddosociedad="+codSoc+" and ddoanyo="+ejerDed);
    if (s.next()) impDed = s.getdouble("total");
    s.close();
    return impDed;
  }
  public static double getDed371_2(DBConnection connJISS, int ejer, int codSoc, int ejerDed, int article) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select sum(drtsaldoini) as total from DEDREVERSION where drtejeraplic="+ejer+" and drtsociedad="+codSoc+" and drtanyo="+ejerDed+" and drtarticulo="+article);
    if (s.next()) impDed = s.getdouble("total");
    s.close();
    return impDed;
  }
  public static double getRedResNivel(DBConnection connJISS, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select rrdreduccion from RESNIVELADISMIN where rrdejercicio="+ejerDed+" and rrdsociedad="+codSoc);
    if (s.next()) impDed = s.getdouble("rrdreduccion");
    s.close();
    return impDed;
  }
  public static double getDotResNivel(DBConnection connJISS, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select rrddotreserva from RESNIVELADISMIN where rrdejercicio="+ejerDed+" and rrdsociedad="+codSoc);
    if (s.next()) impDed = s.getdouble("rrddotreserva");
    s.close();
    return impDed;
  }
  public static double getRedResCapital(DBConnection connJISS,int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select rrcsaldoini from REDRESCAPITALIZ where rrcejeraplic="+ejer+" and rrcanyo="+ejerDed+" and rrcsociedad="+codSoc);
    if (s.next()) impDed = s.getdouble("rrcsaldoini");
    s.close();
    return impDed;
  }
  public static double getGasFinan(DBConnection connJISS, int ejer, int codSoc, int ejerDed, int nCasella) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select * from COMPGASTFINPDTE where fpcejeraplic="+ejer+" and fpcsociedad="+codSoc+" and fpcanyo="+ejerDed);
    if (s.next()) {
        if (ejerDed<2014 || nCasella==1203 || nCasella==1463 || nCasella==1737 || nCasella==1978) impDed = s.getdouble("fpcpdte_ini_ej");
        else impDed = s.getdouble("fpcpdte_ini_e2");
    }
    s.close();
    return impDed;
  }
  public static double getBfoPdte(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select cbopdte_ini_ej from COMPENBFOOPERA where cboejeraplic="+ejer+" and cbosociedad="+codSoc+" and cboanyo="+ejerDed);
    if (s.next()) impDed = s.getdouble("cbopdte_ini_ej");
    s.close();
    return impDed;
  }
  public static double getRIC(DBConnection connJISS, int ejer, int codSoc, int ejerDed) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select ricimporte_dota from RIC where ricejeraplic="+ejer+" and ricsociedad="+codSoc+" and ricanyo="+ejerDed);
    if (s.next()) impDed = s.getdouble("ricimporte_dota");
    s.close();
    return impDed;
  }
  public static double getGastoDonativo(DBConnection connJISS, int ejer, int codSoc) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select dcagasto_donati from DETALLECORECC where dcejeraplic="+ejer+" and dcsociedad="+codSoc);
    if (s.next()) impDed = s.getdouble("dcagasto_donati");
    s.close();
    return impDed;
  }
  public static double getMultasSancion(DBConnection connJISS, int ejer, int codSoc) {
    double impDed = 0;
    Selector s = new Selector(connJISS);
    s.execute("Select dc2amultas from DETALLECOREC2 where dc2ejeraplic="+ejer+" and dc2sociedad="+codSoc);
    if (s.next()) impDed = s.getdouble("dc2amultas");
    s.close();
    return impDed;
  }
}
