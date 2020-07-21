package mae.easp.procesos.enmascarar;

import geyce.maefc.DBConnection;
import geyce.maefc.Selector;
import geyce.maefc.Update;
import mae.easp.conversions.FuncionesJCO;
import mae.easp.general.Easp;

public class EnmascararJCO implements EnmascararApicacion {
	
	private DBConnection connEA;
	
	public EnmascararJCO (DBConnection connEA) {
		this.connEA = connEA;
	}

	public void iniciarProceso(EnmascararDB e) throws Exception {
		Selector sbds = new Selector(connEA);
		sbds.execute("Select distinct bdtipo, bdbdnom, bdbduser,bdbdpass, bdbdserv from BDSCargadas where bdaplic='contaasp'");
		while (sbds.next()) {
		    String bdtipo = sbds.getString("bdtipo");
		    String bdbdnom = sbds.getString("bdbdnom");
		    String bdbduser = sbds.getString("bdbduser");
		    String bdbdpass = sbds.getString("bdbdpass");
		    String bdbdserv = sbds.getString("bdbdserv");
			enmascararCtasp (bdtipo,bdbdnom,bdbdserv,bdbduser,bdbdpass, e);
		}
		sbds.close();
	}

	private void enmascararCtasp (String tipo, String nom, String server, String user, String pass, EnmascararDB edb) throws Exception {
		FuncionesJCO fj = new FuncionesJCO(connEA, Easp.dominio);
		DBConnection connJC = fj.getConexionCtasp(nom, server, user, pass, tipo);
		if (connJC != null) {
			try {
				if (edb.debug()) System.out.println("Enmascarando "+nom);
				actualizaEmpresa(edb, connJC);
				actualizaPCuentas(edb, connJC);
				actualizaRegistroIVA(edb, connJC);
				connJC.commit();
				connJC.disconnect();
			}
			catch (Exception e) {
				connJC.rollback();
				connJC.disconnect();
				throw e;
			}
		}
	}

	private void actualizaRegistroIVA(EnmascararDB e, DBConnection connJC) throws Exception {
		e.actualizarTabla(e, connJC, "IVACABECERA", "civnif", "civdesc");
	}

	private void actualizaPCuentas(EnmascararDB e, DBConnection connJC) throws Exception {
		e.actualizarTabla(e, connJC, "PCUENTAS", "pcunif", "pcudesc");
	}

	private void actualizaEmpresa (EnmascararDB e, DBConnection connJC) throws Exception {
		e.actualizarTabla(e, connJC, "EMPRESA", "empnif", null);
	}
	
}
