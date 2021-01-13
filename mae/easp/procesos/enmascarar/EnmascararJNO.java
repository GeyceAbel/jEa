package mae.easp.procesos.enmascarar;

import geyce.maefc.Catalog;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.Insert;
import geyce.maefc.Selector;
import geyce.maefc.Update;
import mae.easp.db.CatLaboral;
import mae.general.Numero;

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
	
	public void generarNifCentrosTrabajo (EnmascararDB edb) throws Exception {
		DBConnection connJN = getConexion();
		if (connJN != null) {
			try {
				if (edb.debug()) System.out.println("Enmascarando laboral");
				generarNifCentrosTrabajo(edb, connJN);
				connEA.commit();
				connJN.disconnect();
			}
			catch (Exception e) {
				connEA.rollback();
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
	
	private void generarNifCentrosTrabajo (EnmascararDB e, DBConnection connJN) throws Exception {
		Selector s = new Selector(connJN);
		s.execute("Select * from CENTROS order by cencodiemp");
		while (s.next()) {
			int cencodiemp = s.getint("cencodiemp");
			int cencodigo = s.getint("cencodigo");
			String nif = "NOM"+Numero.format(cencodiemp, "000000")+Numero.format(cencodigo, "000000");
			if (e.debug()) System.out.println("Generando Centro trabajo "+nif);
			if (!e.existeNif(nif)) {
				Insert i = new Insert(connEA, "NIFES");
				i.valor("danifcif",nif);
				i.valor("datdominio","DUPLICADO");
				i.valor("datapell1","CENTRO "+Numero.format(cencodiemp, "000000")+" "+Numero.format(cencodigo, "000000"));
				i.valor("datipo","N");
				i.valor("datsiglas","CL");
				i.valor("datvia","VIA");
				i.valor("datnum",123);
				i.valor("datpobla","Poblacion");
				i.valor("datprov",8);
				if (!i.execute()) throw new Exception ("Error al grabar el NIF ["+nif+"]");
			}
		}
		s.close();
	}
}
