package mae.easp.conversions;

import java.util.Vector;

import mae.easp.general.Easp;
import mae.general.ProgressBarForm;
import mae.modasp.general.Modasp;
import geyce.maefc.Aplication;
import geyce.maefc.DBConnection;
import geyce.maefc.ErrorManager;
import geyce.maefc.Insert;
import geyce.maefc.Program;
import geyce.maefc.Selector;

public abstract class Conversion {
	public static enum APLICACION_ORIGEN {LOGICCLASS};
	public static enum APLICACION_GEYCE {JCONTA,JEO,JISS,JRENTA,JNOMINA,JGESTION};
	public static int CODIGO_EMPRESA_NO_ASIGNADA = -1;

	protected DBConnection connEA;
	protected DBConnection connModasp;
	protected String sError;
	protected Vector <DadesEmpresa> vDadesEmpresa;
	protected Vector <Incidencia> vIncidencias;
	protected int desdeEmp;
	protected int hastaEmp;
	protected int desdeEjer;
	protected int hastaEjer;
	protected int idConversion;
	protected String dominio;
	protected Program pr;
	protected APLICACION_ORIGEN aplicOrigen;
	protected APLICACION_GEYCE aplicGeyce;
	public DadesEmpresa deEnProceso;
	protected int ejercicioEnProceso;
	protected ErrorManagerConvers emc;

	private ErrorManager emInicial;
	
	public Conversion (Program pr, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, int idConversion, DBConnection connEA) {
		this.pr = pr;
		this.desdeEmp = desdeEmp;
		this.hastaEmp = hastaEmp;
		this.desdeEjer = desdeEjer;
		this.hastaEjer = hastaEjer;
		this.connEA= connEA;
		this.idConversion = idConversion;
		this.ejercicioEnProceso = 0;
		sError = null;
		vDadesEmpresa = new Vector<DadesEmpresa>();
		vIncidencias = new Vector<Incidencia>();
		dominio = Easp.dominio;		
		aplicOrigen = getAplicOrigen();
		aplicGeyce = getAplicGeyce();
	}

	public String getError() {
		return sError;
	}

	public boolean hayError() {
		return sError != null;
	}
	
	public DadesEmpresa getDEActual() {
		return deEnProceso;
	}
	
	public int getEjercicioEnCurso () {
		return ejercicioEnProceso;
	}
	
	public boolean convertir () {
		ProgressBarForm pbf=new ProgressBarForm(pr,"Conversi?n "+aplicOrigen.toString()+" - "+aplicGeyce.toString()+" ...",true,true,true) {
			public void job() {
				setPercent(0);
				setSecondaryPercent(0);
				String sql = "Select * from CODCNVOTRAPLL where cclccocodi="+idConversion+" and cclsel='S' and ";
				if (aplicGeyce == APLICACION_GEYCE.JCONTA) sql += "ccltraspjco='S'";
				else if (aplicGeyce == APLICACION_GEYCE.JEO) sql += "ccltraspjeo='S'";
				else if (aplicGeyce == APLICACION_GEYCE.JISS) sql += "ccltraspjsoc='S'";
				else if (aplicGeyce == APLICACION_GEYCE.JRENTA) sql += "ccltraspjre='S'";
				else if (aplicGeyce == APLICACION_GEYCE.JNOMINA) sql += "ccltraspjnom='S'";
				else if (aplicGeyce == APLICACION_GEYCE.JGESTION) sql += "ccltraspjges='S'";
				sql += " order by cclcodiorigen";
				Selector s = new Selector (connEA);
				s.execute(sql);
				vDadesEmpresa = new Vector<DadesEmpresa>();
				setState ("Preparando Conversi?n "+aplicGeyce+" ... ");
				while (s.next()) {
					int cclcodiorigen  = s.getint("cclcodiorigen");
				    String cclcodiorigens = s.getString("cclcodiorigens");
				    String cclnombre = s.getString("cclnombre");
				    String cclnif = s.getString("cclnif");
				    int cclcodigeyce = s.getint("cclcodigeyce");  
				    DadesEmpresa de = null;
				    if (cclcodiorigens != null && cclcodiorigens.length()>0) de = new DadesEmpresa(cclcodiorigens, cclnif, cclnombre, aplicGeyce);
				    else de = new DadesEmpresa(cclcodiorigen, cclnif, cclnombre, aplicGeyce);
				    de.setCodiGeyce(cclcodigeyce);
				    vDadesEmpresa.addElement(de);
				}
				s.close();				
				for (int i=0; i<vDadesEmpresa.size();i++) {
					setPercent(i*100/vDadesEmpresa.size());
					deEnProceso = vDadesEmpresa.elementAt(i);
					if (deEnProceso.getCodiOrigenStr()!=null) setState ("Conversi?n "+aplicGeyce+" ["+deEnProceso.getCodiOrigenStr()+"] -- ["+deEnProceso.getCodiGeyce()+"]");
					else setState ("Conversi?n "+aplicGeyce+" ["+deEnProceso.getCodiOrigen()+"] -- ["+deEnProceso.getCodiGeyce()+"]");
					Vector<Incidencia> vInTmp = convertirEmpresa (deEnProceso, this);
					if (vInTmp != null) vIncidencias.addAll(vInTmp);
				}
				
				if (vIncidencias != null && vIncidencias.size()>0) procesarIncidencias ();
				exit ();
			}
		};
		pbf.setFormWidth(800);
		pbf.setEnabledCancel(false);
		pbf.setSecondaryAuto(false);
		
		sError = null;
		vIncidencias.removeAllElements();
		iniConver();
		
		pbf.launch();
		
		finConver();
		return vIncidencias.size()>0;
	}

	protected void finConver() {
		if (connModasp != null) connModasp.disconnect();		
		Aplication.getAplication().setErrorManager(emInicial);
	}

	protected void iniConver() {		
		connModasp = Modasp.getConnModasp();
		emInicial = Aplication.getAplication().getErrorManager();
		emc = new ErrorManagerConvers(this);
		Aplication.getAplication().setErrorManager(emc);
	}

	public void procesarIncidencias() {
		for (int j=0;j<vIncidencias.size();j++) {
			Incidencia in = vIncidencias.elementAt(j);
			Insert i = new Insert (connEA,"CODCNVINCIDEN");
			i.valor ("ccicodi",0);
			i.valor ("ccicodigeyce",in.empresaDestino);
			i.valor ("ccicodiorigen",in.empresaOrigen);
			i.valor ("ccicodiorigens",in.empresaOrigenStr);
			i.valor ("cciejercicio",in.ejercicio);
			i.valor ("cciccocodi",in.idConversion);
			i.valor ("ccimsg",in.msg);
			i.valor ("ccinif",in.nif);
			i.valor ("ccinombre",in.nom);
			i.valor ("cciaplic",in.aplicacio.toString());
			i.execute();
		}
		connEA.commit();
	}

	protected abstract Vector<Incidencia> convertirEmpresa (DadesEmpresa de, ProgressBarForm pbf);
	public abstract Vector<DadesEmpresa> initEmpreses ();
	public abstract APLICACION_ORIGEN getAplicOrigen();
	public abstract APLICACION_GEYCE getAplicGeyce();



}
