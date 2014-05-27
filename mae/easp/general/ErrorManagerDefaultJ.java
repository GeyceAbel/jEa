package mae.easp.general;
import geyce.maefc.*;
import java.util.Enumeration;

public class ErrorManagerDefaultJ implements ErrorManager{
	public boolean saltarErrores;

	public static void showError(String contexto) {
		ErrorParam param = new ErrorParam(null, "");
		param.putErrorType(APL_EXCEPTION);
		param.put("CONTEXT", contexto);
		Aplication.getAplication().getErrorManager().error(param);
	}

	static public void showError(String contexto, String message) {
		ErrorParam param = new ErrorParam(null, message);
		param.putErrorType(APL_EXCEPTION);
		param.put("CONTEXT", contexto);
		Aplication.getAplication().getErrorManager().error(param);
	}

	public static void showError(String contexto, String message, Exception ex) {
		ErrorParam param = new ErrorParam(ex, message);
		param.putErrorType(APL_EXCEPTION);
		param.put("CONTEXT", contexto);
		System.out.println(Aplication.getAplication().getErrorManager().getClass().getName());
		Aplication.getAplication().getErrorManager().error(param);
	}

	public void error(ErrorParam param){
		try   {
			if (!saltarErrores && SystemView.isGui()){
				mae.easp.prerrgestio.ProgPrerrgestio pge = new 	mae.easp.prerrgestio.ProgPrerrgestio();
				pge.setModal(true);
				LocationWindow loc=new LocationWindow();
				loc.setWidth(800);
				loc.setHeight(450);
				pge.setLocation(loc);
				pge.param = param;
				pge.contexto = (String)param.get("CONTEXT");
				pge.run();
			} 
			else {
				String message = param.getMessage();
				Exception ex = param.getException();
				Aplication apl = param.getAplication();
				Program prog = param.getProgram();
				DataBase db = param.getDB();
				Form form = param.getForm();
				VisualComponent ctrl = param.getControl();
				Report report = param.getReport();
				int sqlcode = param.getSQLCode();
				if (message != null){
					System.err.println(message);
				}
				if (ex != null) {
					System.err.println(ex + ": " + ex.getMessage());
				}
				for (Enumeration e = param.getKeys(); e.hasMoreElements();) {
					String key = (String) e.nextElement();
					Object texte = param.get(key);
					if (key != null && texte != null){
						System.err.println(key + ": " + texte.toString());
					}
				}
				if (sqlcode != 0){
					System.err.println("Código BD: " + sqlcode);
				}
				if (apl != null){
					System.err.println("Aplicacion: " + apl.getName());
				}
				if (db != null){
					System.err.println("Base de Datos: " + db.getName());
				}
				if (prog != null){
					System.err.println("Programa: " + prog.getName());
				}
				if (form != null){
					System.err.println("Ventana: " + form.getName());
				}
				if (ctrl != null){
					System.err.println("Control: " + ctrl.getName());
				}
				if (report != null){
					System.err.println("Listado: " + report.getName());
				}
				if (ex != null){
					ex.printStackTrace(System.err);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}


