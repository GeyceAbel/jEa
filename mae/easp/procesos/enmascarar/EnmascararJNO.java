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
				if (edb.debug()) System.out.println("Enmascarando laboral");
				actualizaEmpresa(edb, connJN);
				actualizaTrabajador(edb, connJN);
				actualizaUnifam(edb, connJN);
				connJN.commit();
				connJN.disconnect();
			}
			catch (Exception e) {
				connJN.rollback();
				connJN.disconnect();
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
		e.actualizarTabla(e, connJN, "EMPRESA", "empnif", "empnombre");
	}
	
	private void actualizaTrabajador (EnmascararDB e, DBConnection connJN) throws Exception {
		e.actualizarTabla(e, connJN, "TRABAJADOR", "tranif", "tranombre");
	}
	
	private void actualizaUnifam (EnmascararDB e, DBConnection connJN) throws Exception {
		e.actualizarTabla(e, connJN, "TRAUNIFAM", "trudni", "trunombre");
	}
}
