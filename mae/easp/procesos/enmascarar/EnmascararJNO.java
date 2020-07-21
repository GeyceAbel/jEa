package mae.easp.procesos.enmascarar;

import geyce.maefc.Catalog;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.Selector;
import geyce.maefc.Update;
import mae.easp.db.CatLaboral;

public class EnmascararJNO implements EnmascararApicacion {
	
	private DBConnection connEA;
	
	public EnmascararJNO (DBConnection connEA) {
		this.connEA = connEA;
	}

	public void iniciarProceso(EnmascararDB edb) throws Exception {
		DBConnection connJN = getConexion();
		if (connJN != null) {
			try {
				actualizaEmpresa(edb, connJN);
				actualizaTrabajador(edb, connJN);
				actualizaUnifam(edb, connJN);
				connJN.commit();
			}
			catch (Exception e) {
				connJN.rollback();
				throw e;
			}
		}
	}

	private DBConnection getConexion () throws Exception {
		DataBase db=new DataBase();
		db.setName("laboral");
		db.setMyServer(connEA.getDB().getServer());
		db.setUser(connEA.getDB().getUser());
		db.setMyPassword(connEA.getDB().getPassword());
		db.setType(connEA.getDB().getType());
		Catalog c = new CatLaboral();
		Catalog array[] = {c};
		db.setCatalogs(array);

		DBConnection conn=new DBConnection(db);
		try {
			if (conn.connectEx()) return conn;
			else throw new Exception("Imposible conectar con la BBDD laboral");
		}
		catch (Exception e) {
			throw e;
		}
	}  


	private void actualizaEmpresa (EnmascararDB e, DBConnection connJN) throws Exception {
		Selector s = new Selector (connJN);
		s.execute("Select distinct empnif from EMPRESA where empnif is not null");
		while (s.next()) {
			String empnif = s.getString("empnif");
			Update u = new Update (connJN, "EMPRESA");
			String newNif = e.getNifEnmascarado(empnif);
			u.valor("empnif", newNif );
			if (!u.execute("empnif="+connJN.getDB().getSQLFormat(empnif))) throw new Exception("Error al actualizar EMPRESA "+empnif+" -- "+newNif);			
		}
		s.close();
	}
	
	private void actualizaTrabajador (EnmascararDB e, DBConnection connJN) throws Exception {
		Selector s = new Selector (connJN);
		s.execute("Select distinct tranif from TRABAJADOR where tranif is not null");
		while (s.next()) {
			String tranif = s.getString("tranif");
			Update u = new Update (connJN, "TRABAJADOR");
			String newNif = e.getNifEnmascarado(tranif);
			u.valor("empnif", newNif );
			if (!u.execute("empnif="+connJN.getDB().getSQLFormat(tranif))) throw new Exception("Error al actualizar TRABAJADOR "+tranif+" -- "+newNif);			
		}
		s.close();
	}
	
	private void actualizaUnifam (EnmascararDB e, DBConnection connJN) throws Exception {
		Selector s = new Selector (connJN);
		s.execute("Select distinct tranif from TRAUNIFAM where tranif is not null");
		while (s.next()) {
			String trudni = s.getString("trudni");
			Update u = new Update (connJN, "TRAUNIFAM");
			String newNif = e.getNifEnmascarado(trudni);
			u.valor("trudni", newNif );
			if (!u.execute("trudni="+connJN.getDB().getSQLFormat(trudni))) throw new Exception("Error al actualizar TRAUNIFAM "+trudni+" -- "+newNif);			
		}
		s.close();
	}
}
