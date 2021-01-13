package mae.easp.procesos.enmascarar;

import java.util.Hashtable;

import geyce.maefc.DBConnection;
import geyce.maefc.Delete;
import geyce.maefc.Insert;
import geyce.maefc.Selector;
import geyce.maefc.Update;
import mae.general.Util;

public class EnmascararDB {
	private Hashtable<String, DatosNif> htRelacionNifes;
	private long ultimoNif;
	private DBConnection connEA;
	private EnmascararJCO ejco;
	private EnmascararJNO ejno;

	public EnmascararDB(DBConnection connEA) {
		this.connEA = connEA;
		htRelacionNifes = new Hashtable<String, DatosNif>();
		ultimoNif = 0;
		ejco = new EnmascararJCO(connEA);
		ejno = new EnmascararJNO(connEA);

	}

	public void proceso () throws Exception {
		try {
			Selector s = new Selector (connEA);
			s.execute("Select distinct cdpnifcif from CDP");
			while (s.next()) enmascararNif(s.getString("cdpnifcif"));
			s.close();

			ejco.iniciarProceso(this);
			ejno.iniciarProceso(this);

			eliminarNifesNoDuplicados();
			if (debug()) System.out.println("antes commit EA");
			connEA.commit();
			System.out.println("PROCESO FINALIZADO CORRECTAMENTE");
		}
		catch (Exception e) {
			connEA.rollback();
			throw e;
		}

	}
	private void eliminarNifesNoDuplicados() throws Exception {
		Delete d = new Delete (connEA,"NIFES");
		if (!d.execute("datdominio is null or datdominio<>'DUPLICADO'")) throw new Exception ("Error al eliminar NIF No duplicados");
	}

	protected DatosNif getNifEnmascarado (String nif) throws Exception {
		DatosNif nifEnm = null;
		if (nif != null && nif.trim().length()>0) {
			nifEnm = htRelacionNifes.get(nif);
			if (nifEnm == null) nifEnm = enmascararNif (nif);
		}
		return nifEnm;
	}

	private DatosNif enmascararNif(String nif) throws Exception {
		DatosNif nifPropuesto = new DatosNif();
		if (esNifDuplicado(nif)) { //Per si repetim el enmascarament que no enmascari un nif ja enmascarat previament. Ho sabem pq datdominio = DUPLICADO
			nifPropuesto = new DatosNif();
			nifPropuesto.nif = nif;
			nifPropuesto.nom = getNombreNif(nif);
			htRelacionNifes.put(nif,nifPropuesto);
		}
		else {
			ultimoNif++;
			boolean trobat = false;
			while (!trobat) {
				nifPropuesto = componerNif(nif);
				if (!existeNif(nifPropuesto.nif)) {
					duplicarNif(nif, nifPropuesto);
					actualizarDependencias(nif, nifPropuesto);
					eliminarNif(nif);
					htRelacionNifes.put(nif,nifPropuesto);
					trobat = true;
				}
				else ultimoNif++;
			}
		}
		if (debug()) System.out.println(nif+" --> "+nifPropuesto.nif);
		return nifPropuesto;

	}

	private void actualizarDependencias(String nif, DatosNif dnPropuesto) throws Exception {
		Update u = new Update(connEA, "NIFESMUF");
		u.valor("mufnif", dnPropuesto.nif);
		if (!u.execute("mufnif="+connEA.getDB().getSQLFormat(nif))) throw new Exception ("Error al actualizar NIFESMUF "+nif+" -- "+dnPropuesto.nif);

		u = new Update(connEA, "CDP");
		u.valor("cdpnifcif", dnPropuesto.nif);
		if (!u.execute("cdpnifcif="+connEA.getDB().getSQLFormat(nif))) throw new Exception ("Error al actualizar CDP "+nif+" -- "+dnPropuesto.nif);

		u = new Update(connEA, "REPRESENTANTES");
		u.valor("repnifcif", dnPropuesto.nif);
		if (!u.execute("repnifcif="+connEA.getDB().getSQLFormat(nif))) throw new Exception ("Error al actualizar REPRESENTANTES "+nif+" -- "+dnPropuesto.nif);

		u = new Update(connEA, "DP");
		u.valor("dpnifcif", dnPropuesto.nif);
		if (!u.execute("dpnifcif="+connEA.getDB().getSQLFormat(nif))) throw new Exception ("Error al actualizar DP "+nif+" -- "+dnPropuesto.nif);
	}

	private void duplicarNif(String nif, DatosNif nifPropuesto) throws Exception {
		Insert i = new Insert(connEA, "NIFES");
		i.valor("danifcif",nifPropuesto.nif);
		i.valor("datdominio","DUPLICADO");
		i.valor("datapell1",nifPropuesto.nom);

		Selector s = new Selector (connEA);
		s.execute("Select * from NIFES where danifcif="+connEA.getDB().getSQLFormat(nif));
		boolean existe = s.next();
		if (existe) {
			i.valor("datipo",s.getString("datipo"));
			i.valor("datsiglas",s.getString("datsiglas"));
			i.valor("datvia",s.getString("datvia"));
			i.valor("datnum",s.getString("datnum"));
			i.valor("datesc",s.getString("datesc"));
			i.valor("datpiso",s.getString("datpiso"));
			i.valor("datletra",s.getString("datletra"));
			i.valor("datpobla",s.getString("datpobla"));
			i.valor("datmuni",s.getString("datmuni"));
			i.valor("datprov",s.getString("datprov"));
			i.valor("datpais",s.getString("datpais"));
			i.valor("datcpos",s.getString("datcpos"));
			i.valor("dattel",s.getString("dattel"));
			i.valor("datfax",s.getString("datfax"));
			i.valor("datfisicajuri",s.getString("datfisicajuri"));
			i.valor("datemail",s.getString("datemail"));
			i.valor("datcontacto",s.getString("datcontacto"));
			i.valor("datesiglas",s.getString("datesiglas"));
			i.valor("datevia",s.getString("datevia"));
			i.valor("datenum",s.getString("datenum"));
			i.valor("dateesc",s.getString("dateesc"));
			i.valor("datepiso",s.getString("datepiso"));
			i.valor("dateletra",s.getString("dateletra"));
			i.valor("datepobla",s.getString("datepobla"));
			i.valor("datemuni",s.getString("datemuni"));
			i.valor("dateprov",s.getString("dateprov"));
			i.valor("datepais",s.getString("datepais"));
			i.valor("datecpos",s.getString("datecpos"));
			i.valor("dateatt",s.getString("dateatt"));
			i.valor("dataltaen",s.getString("dataltaen"));
			i.valor("datletraseti",s.getString("datletraseti"));
			i.valor("datipf",s.getString("datipf"));
			i.valor("datcbienes",s.getString("datcbienes"));
			i.valor("datnacional",s.getString("datnacional"));
			i.valor("datfftvia",s.getString("datfftvia"));
			i.valor("datfvia",s.getString("datfvia"));
			i.valor("datftnum",s.getString("datftnum"));
			i.valor("datfnum",s.getString("datfnum"));
			i.valor("datfcalnum",s.getString("datfcalnum"));
			i.valor("datfbloque",s.getString("datfbloque"));
			i.valor("datfportal",s.getString("datfportal"));
			i.valor("datfescal",s.getString("datfescal"));
			i.valor("datfplanta",s.getString("datfplanta"));
			i.valor("datfpuerta",s.getString("datfpuerta"));
			i.valor("datfcomp",s.getString("datfcomp"));
			i.valor("datflocal",s.getString("datflocal"));
			i.valor("datfemail",s.getString("datfemail"));
			i.valor("datfprov",s.getString("datfprov"));
			i.valor("datfcodmun",s.getString("datfcodmun"));
			i.valor("datfnommun",s.getString("datfnommun"));
			i.valor("datfcpost",s.getString("datfcpost"));
			i.valor("datftel",s.getString("datftel"));
			i.valor("datfmovil",s.getString("datfmovil"));
			i.valor("datffax",s.getString("datffax"));
			i.valor("datnftvia",s.getString("datnftvia"));
			i.valor("datnvia",s.getString("datnvia"));
			i.valor("datntnum",s.getString("datntnum"));
			i.valor("datnnum",s.getString("datnnum"));
			i.valor("datncalnum",s.getString("datncalnum"));
			i.valor("datnbloque",s.getString("datnbloque"));
			i.valor("datnportal",s.getString("datnportal"));
			i.valor("datnescal",s.getString("datnescal"));
			i.valor("datnplanta",s.getString("datnplanta"));
			i.valor("datnpuerta",s.getString("datnpuerta"));
			i.valor("datncomp",s.getString("datncomp"));
			i.valor("datnlocal",s.getString("datnlocal"));
			i.valor("datnemail",s.getString("datnemail"));
			i.valor("datnprov",s.getString("datnprov"));
			i.valor("datncodmun",s.getString("datncodmun"));
			i.valor("datnnommun",s.getString("datnnommun"));
			i.valor("datncpost",s.getString("datncpost"));
			i.valor("datntel",s.getString("datntel"));
			i.valor("datnmovil",s.getString("datnmovil"));
			i.valor("datnfax",s.getString("datnfax"));
			i.valor("datnapcor",s.getString("datnapcor"));
			i.valor("datnpobla",s.getString("datnpobla"));
			i.valor("datnprov2",s.getString("datnprov2"));
			i.valor("datncpost2",s.getString("datncpost2"));
			i.valor("datntel2",s.getString("datntel2"));
			i.valor("datnmovil2",s.getString("datnmovil2"));
			i.valor("datnfax2",s.getString("datnfax2"));
			i.valor("datsftvia",s.getString("datsftvia"));
			i.valor("datsvia",s.getString("datsvia"));
			i.valor("datstnum",s.getString("datstnum"));
			i.valor("datsnum",s.getString("datsnum"));
			i.valor("datscalnum",s.getString("datscalnum"));
			i.valor("datsbloque",s.getString("datsbloque"));
			i.valor("datsportal",s.getString("datsportal"));
			i.valor("datsescal",s.getString("datsescal"));
			i.valor("datsplanta",s.getString("datsplanta"));
			i.valor("datspuerta",s.getString("datspuerta"));
			i.valor("datscomp",s.getString("datscomp"));
			i.valor("datslocal",s.getString("datslocal"));
			i.valor("datsemail",s.getString("datsemail"));
			i.valor("datsprov",s.getString("datsprov"));
			i.valor("datscodmun",s.getString("datscodmun"));
			i.valor("datsnommun",s.getString("datsnommun"));
			i.valor("datscpost",s.getString("datscpost"));
			i.valor("datstel",s.getString("datstel"));
			i.valor("datsmovil",s.getString("datsmovil"));
			i.valor("datsfax",s.getString("datsfax"));
			i.valor("datmovil",s.getString("datmovil"));
			i.valor("datuser",s.getString("datuser"));
			i.valor("datgrupo",s.getString("datgrupo"));
		}
		else {
			i.valor("datipo","D");
		}
		s.close();
		if (!i.execute()) throw new Exception ("Error al grabar el NIF ["+nifPropuesto+"]");
	}

	private void eliminarNif(String nif) throws Exception {
		Delete d = new Delete (connEA,"NIFES");
		if (!d.execute("danifcif="+connEA.getDB().getSQLFormat(nif))) throw new Exception ("Error al eliminar NIF ["+nif+"]");
	}

	protected boolean existeNif(String nif) {
		Selector s = new Selector (connEA);
		s.execute("Select danifcif from NIFES where danifcif="+connEA.getDB().getSQLFormat(nif));
		boolean existe = s.next();
		s.close();
		return existe;
	}
	
	private String getNombreNif (String nif) {
		String n = "JOHN DOE NONE";
		Selector s = new Selector (connEA);
		s.execute("Select datapell1 from NIFES where danifcif="+connEA.getDB().getSQLFormat(nif));
		if (s.next()) n = s.getString("datapell1");
		s.close();
		return n;
	}


	private boolean esNifDuplicado(String nif) {
		Selector s = new Selector (connEA);
		s.execute("Select danifcif from NIFES where danifcif="+connEA.getDB().getSQLFormat(nif)+" and datdominio='DUPLICADO'");
		boolean existe = s.next();
		s.close();
		return existe;
	}

	private DatosNif componerNif(String nif) {
		String nifC = Util.rpt("0", 8 - String.valueOf(ultimoNif).length()) + String.valueOf(ultimoNif);
		nifC += Util.letraDNI(nifC);
		DatosNif dn = new DatosNif();
		dn.nif = nifC;
		dn.nom = "JOHN DOE "+ultimoNif;
		return dn;
	}

	protected boolean debug () {
		return true;
	}
	
	protected void actualizarTabla (EnmascararDB e, DBConnection connPr, String tabla, String camponif, String camponombre) throws Exception {
		Selector s = new Selector (connPr);
		s.execute("Select distinct "+camponif+" from "+tabla+" where "+camponif+" is not null and "+camponif+"<>''");
		while (s.next()) {
			String nif = s.getString(camponif);
			if (nif != null && nif.trim().length()>0) {
				Update u = new Update (connPr, tabla);
				DatosNif newNif = e.getNifEnmascarado(nif);
				u.valor(camponif, newNif.nif );
				if (camponombre != null) u.valor(camponombre, newNif.nom );
				if (!u.execute(camponif+"="+connPr.getDB().getSQLFormat(nif))) throw new Exception("Error al actualizar "+tabla+" "+nif+" -- "+newNif.nom);
			}
		}
		s.close();
	}
}
