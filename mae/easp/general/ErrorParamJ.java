package mae.easp.general;

import geyce.maefc.*;

import java.util.Hashtable;

public class ErrorParamJ extends Hashtable{

	public ErrorParamJ(ErrorParam param){
		try {
			if (param != null){
				put(ErrorManager.APLICATION, param.getAplication().getName());
				Program prog = param.getProgram();
				if (prog != null && prog.getName()!=null){
					put(ErrorManager.PROGRAM, prog.getName());
				}
				Form form = param.getForm();
				if (form != null && form.getName()!=null) {
					put(ErrorManager.FORM, form.getName());
				}
		        VisualComponent ctrl = param.getControl();
		        if (ctrl != null && ctrl.getName()!=null){
		        	put(ErrorManager.CONTROL, ctrl.getName());
		        }
		        Report report = param.getReport();
		        if (report != null && report.getName()!=null){
		        	put(ErrorManager.REPORT, report.getName());
		        }
		        DataBase db = param.getDB();
		        if (db!=null && db.getName()!=null){
		        	put(ErrorManager.DATABASE, db.getName());
		        }
		        String mens = param.getMessage();
		    	if (mens!=null){
		    		put(ErrorManager.MESSAGE, mens);
		    	}
		        String sentencia = (String) param.get("Sentencia");
		    	if (sentencia!=null){
		    		put("SQLMessage", sentencia);
		    	}
		    	
		    	Exception ex = param.getException();
		    	if (ex!=null){
		    		//put(ErrorManager.EXCEPTION, ex);
	                java.io.StringWriter sw = new java.io.StringWriter();
	                java.io.PrintWriter pw = new java.io.PrintWriter(sw);
	                /*
	                if (ex instanceof java.sql.SQLException) {
	                    java.sql.SQLException sqlex = (java.sql.SQLException) ex;
	                    for (sqlex = sqlex.getNextException(); sqlex != null; sqlex = sqlex.getNextException()) {
	                        pw.println(sqlex.getMessage());
	                    }
	                    ex.printStackTrace(pw);
	                    pw.flush();
	    		        String sqlm = sw.toString();
	    		    	if (sqlm!=null){
	    		    		if (sqlm.length() > 2000){
	    		    			sqlm = sqlm.substring(0,2000);
	    		    		}
	    		    		put("SQLMessage", sqlm);
	    		    	}
	                } else {*/
	                	ex.printStackTrace(pw);
	                    pw.flush();
	    		        String stack = sw.toString();
	    		    	if (stack!=null){
	    		    		if (stack.length() > 2000){
	    		    			stack = stack.substring(0,2000);
	    		    		}
	    		    		put("StackTrace", stack);
	    		    	}
	                //}
		    	}
		    	
		    	if (ex!=null){
			        String excepMensaje = ex.getMessage();
			    	if (excepMensaje!=null){
			    		put("ExceptionMessage", excepMensaje);
			    	}
		    	}
		    	
		    	Integer type = new Integer(param.getErrorType());
		    	if (type.intValue() > 0){
		    		put(ErrorManager.TYPE, type);
		    	}
		    	Integer sql =  new Integer(param.getSQLCode());
		    	if (sql.intValue() > 0){
		    		put(ErrorManager.SQLCODE, sql);
		    	}
	    	}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
