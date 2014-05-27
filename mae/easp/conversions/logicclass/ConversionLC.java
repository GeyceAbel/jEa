package mae.easp.conversions.logicclass;

import mae.easp.conversions.Conversion;
import mae.easp.conversions.logicclass.db.DBConnectionLogic;
import geyce.maefc.DBConnection;
import geyce.maefc.DataBase;
import geyce.maefc.Program;

public abstract class ConversionLC extends Conversion {
	protected String servidor;
	protected String instancia;
	protected String nombreBD;
	protected String user;
	protected String passwd;
	protected DBConnectionLogic connLC;

	public ConversionLC (Program pr,int desdeEmp, int hastaEmp, int desdeEjer, int hastaEjer, DBConnection connEA, String servidor, String instancia, String nombreBD, String user, String passwd, int idConversion) {
		super (pr,desdeEmp,hastaEmp,desdeEjer,hastaEjer,idConversion,connEA);
		this.servidor = servidor;
		this.instancia = instancia;
		this.nombreBD = nombreBD;
		this.user = user;
		this.passwd = passwd;
		initConectionLogic();
	}

	private boolean initConectionLogic ( ) {
		boolean bOk = false;
		DataBase db = new DataBase();
		db.setType("sqlserver");
		db.setMyServer(servidor);
		db.setName(nombreBD);    
		connLC = new DBConnectionLogic(db);
		connLC.setUser(user);
		connLC.setPassword(passwd);
		connLC.setServer(servidor);
		connLC.setDataBaseName(nombreBD);
		connLC.setInstance(instancia);
		try {
			if (connLC.connectEx()) {
				bOk = true;
				System.out.println("\nConexion establecida con: \""+ servidor +"\"");
			}
			else sError = "Error al conectar con el servidor de Base de Datos.";
		}
		catch (Exception e) {
			sError = "Error al conectar con el servidor de Base de Datos.\n\nRevise los datos de conexión.";
			e.printStackTrace ();
		}
		return bOk;
	}
	
	public void desconetarConexionLogic () {
		if (connLC != null) connLC.disconnect();
		connLC = null;
	}
	
	@Override
	public APLICACION_ORIGEN getAplicOrigen() {
		return APLICACION_ORIGEN.LOGICCLASS;
	}

	protected void iniConver() {
		super.iniConver();
		if (connLC == null) initConectionLogic ();		
	}

	protected void finConver() {
		super.finConver();
		desconetarConexionLogic ();	
	}
}
