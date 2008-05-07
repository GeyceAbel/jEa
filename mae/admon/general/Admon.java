  // Clase:       Admon
// Autor:       Eduard Roige, I+D GEYCE S.A.

package mae.admon.general;

import java.util.*;
import java.sql.*;
import java.security.Principal;
import java.security.acl.*;
import sun.security.acl.*;
import java.io.*;

import geyce.maefc.*;

import mae.admon.*;

public class Admon {
  public static Error error=new Error();
  public static boolean inError=false;
  public static DBConnection connAdmon=null;
  private static String user=Aplication.getAplication().getUser();
  // Funciones o valores comunes o generales de Admon
  public static int codcon;
  public static int central;

  public static boolean init() {
    codcon=1;
    central=1;
			//
    //grabación forzada para evitar que una modificación sobre RBDCTRAP con la aplicación admon se quede bloqueada
    //es necesario hacer una modificación en alguna tabla para que FC carge las tablas replicables.
    Error.grabaIncidencia(Aplication.getAplication(),"APLICATIVO",Aplication.getAplication().getName(),"init","","","","Inicio de la aplicación ADMON");
    return true;
    }

  /**
   * Muestra el mensaje asociado a los parametros. Usar si error definido en Admon.
   *
   * @param   apl   Objeto aplication: p. ej sivico.
   * @param   ambito   Ambito del error: hw, plataforma, geyce, aplicativo y ofimatica.
   * @param   modulo   Modulo dentro del ambito: por ejemplo Sivico o Sigeco.
   * @param   programa   Programa o fabricante.
   * @param   referencia   Etiqueta de referencia: por ej. ER_NOMEM.
   * @param   operacion   Operacion que ha provocado el error: p. ej. sdatos.insert().
   * @param   mensaje   Mensaje que debe aparecer. Si hay definido mensaje en Admon se concatena.
   * @param   error   Pasar true si se quiere mostrar la descripcion del error. False en caso contrario.
   *
   * @return  int  Respuesta que ha pulsado el usuario (solo en el caso de errores de nivel
   *               de gravedad "A").
   */
  public static int doMessage(Aplication apl, String ambito, String modulo, String programa,
                              String referencia, String operacion, String mensaje,
                              boolean error){
    return Admon.error.doMessage(apl,ambito,modulo,programa,referencia,null,operacion,mensaje,error);
    }

  /**
   * Muestra el mensaje asociado a los parametros. Usar en nivel de gravedad "A" y si error
   * definido en Admon.
   *
   * @param   ambito   Ambito del error: hw, plataforma, geyce, aplicativo y ofimatica.
   * @param   modulo   Modulo dentro del ambito: por ejemplo Sivico o Sigeco.
   * @param   programa   Programa o fabricante.
   * @param   referencia   Etiqueta de referencia: por ej. ER_NOMEM.
   * @param   operacion   Operacion que ha provocado el error: p. ej. sdatos.insert().
   * @param   mensaje   Mensaje que debe aparecer. Si hay definido mensaje en Admon se concatena.
   * @param   error   Pasar true si se quiere mostrar la descripcion del error. False en caso contrario.
   *
   * @return  int  Respuesta que ha pulsado el usuario (solo en el caso de errores de nivel
   *               de gravedad "A").
   */
  public static int doMessage(String ambito, String modulo, String programa,
                              String referencia, String operacion, String mensaje, boolean error){
    return Admon.error.doMessage(null,ambito,modulo,programa,referencia,null,operacion,mensaje,error);
    }


  /**
   * Muestra el mensaje asociado a los parametros. Usar si el error no esta definido en Admon.
   *
   * @param   apl   Objeto aplication: p. ej sivico. Se usa en criticidad "E" o "C".
   * @param   ambito   Ambito del error: hw, plataforma, geyce, aplicativo y ofimatica.
   * @param   modulo   Modulo dentro del ambito: por ejemplo Sivico o Sigeco.
   * @param   programa   Programa o fabricante.
   * @param   referencia   Etiqueta de referencia: por ej. ER_NOMEM.
   * @param   numero   Codigo de error: p. ej 2.
   * @param   operacion   Operacion que ha provocado el error: p. ej. sdatos.insert().
   * @param   mensaje   Mensaje que debe aparecer. Si hay definido mensaje en Admon se concatena.
   * @param   error   Pasar true si se quiere mostrar la descripcion del error. False en caso contrario.
   *
   * @return  int  Respuesta que ha pulsado el usuario (solo en el caso de errores de nivel
   *               de gravedad "A").
   */
  public static int doMessage(Aplication apl,String ambito, String modulo, String programa,
                              String referencia, String numero, String operacion,
                              String mensaje, boolean error){
    return Admon.error.doMessage(apl,ambito,modulo,programa,referencia,numero,operacion,mensaje,error);
    }

  public void showMessages(boolean showMessages){
    error.showMessages(showMessages);
    }

  public static void testMessage(String ambito, String modulo, String programa,
                    String referencia, String numero,String operacion, String mensaje,
                    String solucion, String gravedad, int opciones){
    error.testMessage(ambito,modulo,programa,referencia,numero,operacion,mensaje,
                      solucion,gravedad,opciones);
    }


  public static Error getErrorManager(){
		return error;
    }
 }


//class Error implements ErrorManager{ //Queda pendent implementar-la jo plenament
class Error extends ErrorManagerDefault{
  private boolean showMessages=true;

  public void showMessages(boolean showMessages){
    this.showMessages=showMessages;
    }

  public void error(ErrorParam param) {
		try {
			super.error(param);

    	if (Admon.inError) return;
    	else Admon.inError=true;

    	String            message = param.getMessage   ();
    	Exception         ex      = param.getException ();
    	Aplication        apl     = param.getAplication();
    	Program           prog    = param.getProgram   ();
    	DataBase          db      = param.getDB        ();
    	Form              form    = param.getForm      ();
    	VisualComponent   ctrl    = param.getControl   ();
    	Report            report  = param.getReport    ();

    	String mensaje=param.getMessage();
    	String sentencia="";
    	if (ex!=null) mensaje=mensaje+"\nExcepción java: "+ex.getMessage();
    	String name="desconocido";
    	if (prog!=null) name=prog.getName();
    	if (param.get("Sentencia")!=null) sentencia=(String) param.get("Sentencia");
    	grabaIncidencia(Aplication.getAplication(),"APLICATIVO",Aplication.getAplication().getName(),name,"","",sentencia,mensaje);
		  }
		catch(Exception ex) {
			ex.printStackTrace();
		  }
    }

  /*public void error(ErrorParam param){
    //Pendent
    System.out.println("error() dins admon.java");
    String mensaje=referencia;
    if (param.get("Program")!=null)
      mensaje=mensaje+"Program:"+((Program) param.get("Program")).getName()+"\n";
    if (param.get("Form")!=null)
      mensaje=mensaje+"Form:"+((Form) param.get("Form")).getName()+"\n";
    if (param.get("Report")!=null)
      mensaje=mensaje+"Report:"+((Report) param.get("Report")).getName()+"\n";
    if (param.get("Control")!=null)
      mensaje=mensaje+"Control:"+((Control) param.get("Control")).getName()+"\n";
    if (param.get("Select")!=null)
      mensaje=mensaje+"Select:"+((Select) param.get("Select")).getName()+"\n";
    if (param.get("Sentencia")!=null)
      mensaje=mensaje+"Sentencia:"+param.get("Sentencia")+"\n";
    if (param.get("Clave")!=null)
      mensaje=mensaje+"Clave:"+param.get("Clave")+"\n";
    if (param.get("DataBase")!=null)
      mensaje=mensaje+"DataBase:"+((DataBase) param.get("DataBase")).getName()+"\n";
    if (param.get("Exception")!=null){
      Exception e=(Exception) param.get("Exception");
      StringWriter writer=new StringWriter();
      PrintWriter swriter=new PrintWriter(writer);

      if (e instanceof SQLException) {
        SQLException ex=(SQLException) e;
        for(;ex!=null;ex=ex.getNextException()) {
          swriter.println(ex+" "+ex.getMessage());
          }
        }
      e.printStackTrace(swriter);
      swriter.flush();
      mensaje=mensaje+writer.toString()+"\n";
      }
    Maefc.message(mensaje);
    }*/
  public static void grabaIncidencia(Aplication apl, String ambito, String modulo, String programa,
                    String referencia, String numero, String operacion, String mensaje){
    DBConnection dbtemp=null;
    DBConnection dbc=new DBConnection(Aplication.getAplication().getAdmon().getDB());
    dbtemp=Aplication.getAplication().getDataBase();
    Aplication.getAplication().setDataBase(Admon.connAdmon);
    if (dbc.connect()){
      Select sinincide=new Select(dbc);
      Table inincide=new Table(sinincide,"inincide");
      Field incodigo=new Field(sinincide,inincide,"incodigo");
      Field insede=new Field(sinincide,inincide,"insede");
      Field inusuari=new Field(sinincide,inincide,"inusuari");
      Field inpuesto=new Field(sinincide,inincide,"inpuesto");
      Field ininstan=new Field(sinincide,inincide,"ininstan");
      Field inambito=new Field(sinincide,inincide,"inambito");
      Field inmodulo=new Field(sinincide,inincide,"inmodulo");
      Field inprog=new Field(sinincide,inincide,"inprog");
      Field inrefer=new Field(sinincide,inincide,"inrefer");
      Field innumer=new Field(sinincide,inincide,"innumer");
      Field inopera=new Field(sinincide,inincide,"inopera");
      Field inmensa=new Field(sinincide,inincide,"inmensa");

      insede.setValue(1);
      inusuari.setValue(apl.getUser());
      inpuesto.setValue(apl.getAdmon().getHostAddress());
      ininstan.getDef().setDateTime(true);
      ininstan.setValue(new java.sql.Timestamp(new java.util.Date().getTime()));
//      ininstan.setValue(Maefc.getDateTime());
      inambito.setValue(ambito);
      inmodulo.setValue(modulo);
      inprog.setValue(programa);
      inrefer.setValue(referencia);
      innumer.setValue(numero);
      inopera.setValue(operacion);
      inmensa.setValue(mensaje);

      if (!sinincide.insert()){
        System.out.println("SE HA PRODUCIDO UN ERROR GRABANDO LA INCIDENCIA");
        sinincide.rollback();
        }
      else{
        sinincide.commit();
        Admon.inError=false;
        }
      dbc.disconnect();
      Aplication.getAplication().setDataBase(dbtemp);
      }
    }


  private static void invocaEjecutable(String nombre){
    try{
      Runtime rt=Runtime.getRuntime();
      rt.exec(nombre);
      }
    catch(Exception e){
      System.out.println(e.getMessage());
      }
    }

  /**
   * Muestra el mensaje asociado a los parametros. Usar si error definido en Admon.
   *
   * @param   apl   Objeto aplication: p. ej sivico.
   * @param   ambito   Ambito del error: hw, plataforma, geyce, aplicativo y ofimatica.
   * @param   modulo   Modulo dentro del ambito: por ejemplo Sivico o Sigeco.
   * @param   programa   Programa o fabricante.
   * @param   referencia   Etiqueta de referencia: por ej. ER_NOMEM.
   * @param   operacion   Operacion que ha provocado el error: p. ej. sdatos.insert().
   * @param   mensaje   Mensaje que debe aparecer. Si hay definido mensaje en Admon se concatena.
   * @param   error   Pasar true si se quiere mostrar la descripcion del error. False en caso contrario.
   *
   * @return  int  Respuesta que ha pulsado el usuario (solo en el caso de errores de nivel
   *               de gravedad "A").
   */
  public static int doMessage(Aplication apl, String ambito, String modulo, String programa,
                              String referencia, String operacion, String mensaje,
                              boolean error){
    return doMessage(apl,ambito,modulo,programa,referencia,null,operacion,mensaje,error);
    }

  /**
   * Muestra el mensaje asociado a los parametros. Usar en nivel de gravedad "A" y si error
   * definido en Admon.
   *
   * @param   ambito   Ambito del error: hw, plataforma, geyce, aplicativo y ofimatica.
   * @param   modulo   Modulo dentro del ambito: por ejemplo Sivico o Sigeco.
   * @param   programa   Programa o fabricante.
   * @param   referencia   Etiqueta de referencia: por ej. ER_NOMEM.
   * @param   operacion   Operacion que ha provocado el error: p. ej. sdatos.insert().
   * @param   mensaje   Mensaje que debe aparecer. Si hay definido mensaje en Admon se concatena.
   * @param   error   Pasar true si se quiere mostrar la descripcion del error. False en caso contrario.
   *
   * @return  int  Respuesta que ha pulsado el usuario (solo en el caso de errores de nivel
   *               de gravedad "A").
   */
  public static int doMessage(String ambito, String modulo, String programa,
                              String referencia, String operacion, String mensaje, boolean error){
    return doMessage(null,ambito,modulo,programa,referencia,null,operacion,mensaje,error);
    }


  /**
   * Muestra el mensaje asociado a los parametros. Usar si el error no esta definido en Admon.
   *
   * @param   apl   Objeto aplication: p. ej sivico. Se usa en criticidad "E" o "C".
   * @param   ambito   Ambito del error: hw, plataforma, geyce, aplicativo y ofimatica.
   * @param   modulo   Modulo dentro del ambito: por ejemplo Sivico o Sigeco.
   * @param   programa   Programa o fabricante.
   * @param   referencia   Etiqueta de referencia: por ej. ER_NOMEM.
   * @param   numero   Codigo de error: p. ej 2.
   * @param   operacion   Operacion que ha provocado el error: p. ej. sdatos.insert().
   * @param   mensaje   Mensaje que debe aparecer. Si hay definido mensaje en Admon se concatena.
   * @param   error   Pasar true si se quiere mostrar la descripcion del error. False en caso contrario.
   *
   * @return  int  Respuesta que ha pulsado el usuario (solo en el caso de errores de nivel
   *               de gravedad "A").
   */
  public static int doMessage(Aplication apl,String ambito, String modulo, String programa,
                              String referencia, String numero, String operacion,
                              String mensaje, boolean error){
    int respuesta=0;
    Select serrcod=new Select(Admon.connAdmon);
    Table errcod=new Table(serrcod,"inerrcod");
    Field erambito=new Field(serrcod,errcod,"erambito");
    Field ermodulo=new Field(serrcod,errcod,"ermodulo");
    Field errefer=new Field(serrcod,errcod,"errefer");
    Field ernumer=new Field(serrcod,errcod,"ernumer");
    Field erdescri=new Field(serrcod,errcod,"erdescri");
    Field erincide=new Field(serrcod,errcod,"erincide");
    Field ersoluci=new Field(serrcod,errcod,"ersoluci");
    Field ercritic=new Field(serrcod,errcod,"ercritic");
    Field eropcion=new Field(serrcod,errcod,"eropcion");
    Field erexec=new Field(serrcod,errcod,"erexec");

    serrcod.setWhere("ERAMBITO='"+ambito+"' AND ERMODULO='"+modulo
                      +"' AND ERREFER='"+referencia+"'");
    serrcod.execute();
    if (!serrcod.isEof()){
      // Error encontrado
      if (erincide.getString().equals("S")) grabaIncidencia(apl,ambito,modulo,programa,referencia,numero,operacion,mensaje);
      if (mensaje==null) mensaje="";
      respuesta=implementaMessage(ambito,modulo,programa,referencia,ernumer.getString(),operacion
                                  ,erdescri.getString()+mensaje,ersoluci.getString(),ercritic.getString(),
                                  eropcion.getInteger(),error);

      if (!ercritic.getString().equals("A")){
        if (ercritic.getString().equals("C")){
          // Pendiente GRABAR REGISTRO EN AVISOS
          if (apl!=null) apl.exit();
          }
        if (!erexec.isNull()) invocaEjecutable(erexec.getString());
        }
      }
    else{
      // Error no encontrado
      implementaMessage(ambito,modulo,programa,referencia,numero,operacion,mensaje,error);
      grabaIncidencia(apl,ambito,modulo,programa,referencia,numero,operacion,mensaje);
      if (apl!=null) apl.exit();
      }
    return respuesta;
    }

  private static String treuReturns(String cadena){
    String retorn="";
    for (int i=0;i<cadena.length();i++){
      if (cadena.charAt(i)=='\n')
        retorn=retorn+"<p>";
      else retorn=retorn+cadena.charAt(i);
      }
    return retorn;
    }

  private static String obtieneMensaje(String ambito, String modulo, String programa,
                    String referencia, String numero,String operacion, String mensaje,
                    boolean error){
    String texto;

    if (error){
      texto="<html><i>En el entorno :</i><table><tr><td><b><font color="+'"'+"Green"+'"'
            +"> AMBITO</font></td><td><b><font color="+'"'+"Blue"+'"'+">"+ambito+"</font></b></td></tr><tr><td><b><font color="+'"'+"Green"+'"'
            +"> MODULO</font></b></td><td><b><font color="+'"'+"Blue"+'"'+">"+modulo+"</font></b><td></tr><tr><td><b><font color="+'"'+"Green"+'"'+
            "> PROGRAMA</font></b></td><td><b><font color="+'"'+"Blue"+'"'+">"+programa+"</font></b></td></tr></table><i>La operacion </i>["
            +operacion+"] <i>ha provocado el siguiente error :</i><table><tr><td><b><font color="+'"'+
            "Green"+'"'+"> REFERENCIA </font></b></td><td><b><font color="+'"'+"Blue"+'"'+">"+referencia+"</font></b></td></tr>";
      if (numero!=null && !numero.equals(""))
        texto=texto+"<tr><td><b><font color="+'"'+"Green"+'"'+"> NUMERO</font></b></td><td><b><font color="+'"'+"Blue"+'"'+">"+numero+"</font></b><td></tr></table>";
      else
        texto=texto+"</table>";
      }
    else
      texto="<html>";

    if (mensaje!=null && !mensaje.equals(""))
      texto=texto+treuReturns(mensaje);
//    texto+="<p>Para solucionar el problema, p&oacute;ngase en contacto con <a href=http://afinity.geyce.es/pls/agpi/p_intern.main?pruta=AY2 target=_blank>Geyce S.A.</a></p>";
    return texto;
    }

  private static int implementaMessage(String ambito, String modulo, String programa,
                    String referencia, String numero,String operacion, String mensaje,
                    String solucion, String gravedad, int opciones,boolean error){

    int icono,retorn=0;
    if (gravedad!=null && gravedad.equals("A"))
      icono=Maefc.WARNING_MESSAGE;
    else icono=Maefc.ERROR_MESSAGE;

    String texto=obtieneMensaje(ambito,modulo,programa,referencia,numero,operacion,mensaje,error);
    if (solucion!=null && !solucion.equals(""))
      texto=texto+"<p><p><font color="+'"'+"Blue"+'"'+">"+"Soluci&oacute;n :</font> "+
            treuReturns(solucion)+"</html>";
    else
      texto=texto+"</html>";
    if (opciones==-1)
      Maefc.message(texto,"incidencia",icono);
    else
      retorn=Maefc.message(texto,"incidencia",icono,opciones);
    return retorn;
    }

  private static void implementaMessage(String ambito, String modulo, String programa,
                      String referencia, String numero,String operacion, String mensaje,
                      boolean error){
    String texto=obtieneMensaje(ambito,modulo,programa,referencia,numero,operacion,mensaje,error);
    Maefc.message(texto,"Incidencia",Maefc.ERROR_MESSAGE);
    }

  public static void testMessage(String ambito, String modulo, String programa,
                    String referencia, String numero,String operacion, String mensaje,
                    String solucion, String gravedad, int opciones){
    implementaMessage(ambito,modulo,programa,referencia,numero,operacion,mensaje,solucion,gravedad,opciones,true);
    }
  }
