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
				actualizaEmpresa(edb, connJC);
				actualizaPCuentas(edb, connJC);
				actualizaRegistroIVA(edb, connJC);
				connJC.commit();
			}
			catch (Exception e) {
				connJC.rollback();
				throw e;
			}
		}
	}

	private void actualizaRegistroIVA(EnmascararDB e, DBConnection connJC) throws Exception {
		Selector s = new Selector (connJC);
		s.execute("Select distinct civnif from IVACABECERA where civnif is not null");
		while (s.next()) {
			String civnif = s.getString("civnif");
			Update u = new Update (connJC, "IVACABECERA");
			String newNif = e.getNifEnmascarado(civnif);
			u.valor("civnif", civnif );
			if (!u.execute("civnif="+connJC.getDB().getSQLFormat(civnif))) throw new Exception("Error al actualizar IVACABECERA "+civnif+" -- "+newNif);			
		}
		s.close();
	}

	private void actualizaPCuentas(EnmascararDB e, DBConnection connJC) throws Exception {
		Selector s = new Selector (connJC);
		s.execute("Select distinct pcunif from pcuentas where pcunif is not null");
		while (s.next()) {
			String pcunif = s.getString("pcunif");
			Update u = new Update (connJC, "PCUENTAS");
			String newNif = e.getNifEnmascarado(pcunif);
			u.valor("pcunif", newNif );
			if (!u.execute("pcunif="+connJC.getDB().getSQLFormat(pcunif))) throw new Exception("Error al actualizar PCUENTAS "+pcunif+" -- "+newNif);			
		}
		s.close();
	}

	private void actualizaEmpresa (EnmascararDB e, DBConnection connJC) throws Exception {
		Selector s = new Selector (connJC);
		s.execute("Select distinct empnif from EMPRESA where empnif is not null");
		while (s.next()) {
			String empnif = s.getString("empnif");
			Update u = new Update (connJC, "EMPRESA");
			String newNif = e.getNifEnmascarado(empnif);
			u.valor("empnif", newNif );
			if (!u.execute("empnif="+connJC.getDB().getSQLFormat(empnif))) throw new Exception("Error al actualizar EMPRESA "+empnif+" -- "+newNif);			
		}
		s.close();
	}
	
}
