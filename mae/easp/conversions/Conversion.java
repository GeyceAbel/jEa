package mae.easp.conversions;

import java.util.Vector;

import mae.easp.general.Easp;
import mae.general.ProgressBarForm;
import mae.modasp.general.Modasp;
import geyce.maefc.DBConnection;
import geyce.maefc.Insert;
import geyce.maefc.Program;

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

	public Conversion (Program pr, int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, int idConversion, DBConnection connEA) {
		this.pr = pr;
		this.desdeEmp = desdeEmp;
		this.hastaEmp = hastaEmp;
		this.desdeEjer = desdeEjer;
		this.hastaEjer = hastaEjer;
		this.connEA= connEA;
		this.idConversion = idConversion;
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

	public boolean convertir () {
		ProgressBarForm pbf=new ProgressBarForm(pr,"Conversión "+aplicOrigen.toString()+" - "+aplicGeyce.toString()+" ...",true,true,true) {
			public void job() {
				setPercent(0);
				setSecondaryPercent(0);
				for (int i=0; i<vDadesEmpresa.size();i++) {
					setPercent(i*100/vDadesEmpresa.size());
					DadesEmpresa de = vDadesEmpresa.elementAt(i);
					Vector<Incidencia> vInTmp = convertirEmpresa (de, this);
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
	}

	protected void iniConver() {		
		connModasp = Modasp.getConnModasp();
	}

	private void procesarIncidencias() {
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
