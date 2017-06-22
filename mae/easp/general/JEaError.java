package mae.easp.general;

import geyce.maefc.*;

public class JEaError extends ErrorManagerDefault{

  public static boolean inError=false;

  public void error(ErrorParam param) {
    //super.error(param);

    if (JEaError.inError) return;
    else JEaError.inError=true;

    String            message = param.getMessage   ();
    Exception         ex      = param.getException ();
    Aplication        apl     = param.getAplication();
    Program           prog    = param.getProgram   ();
    DataBase          db      = param.getDB        ();
    Form              form    = param.getForm      ();
    VisualComponent   ctrl    = param.getControl   ();
    Report            report  = param.getReport    ();
    String					  codi		= (String) param.get("CODI");

    String mensaje=param.getMessage();
    String sentencia="";
    if (ex!=null) mensaje=mensaje+"\nExcepción java: "+ex.getMessage();

    System.out.print("Excepción java: "+ex.getMessage());

    }

  }
