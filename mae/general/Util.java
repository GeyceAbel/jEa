package mae.general;

import java.util.*;
import geyce.maefc.*;

import mae.general.*;

import geyce.ig.*;
import java.io.*;
import java.text.*;

/** Clase que engloba funciones útiles de ámbito general
 * @author GEYCE - Oriol Jiménez
 * @version 1.3, 29/4/2002
 * S'inclou la funcio sch i es revisa un error de la funcio formateoNumero que no feia rpad
 * S'incorpora la funció OEMtoAnsi per a traduïr caracter que no son compatibles
 * també es modifica valorNumCampo per a que pugui tractar camps Moneda
 */
public class Util {
  /** Función para dar formato string a un número
   * @param formato Formato a convertir
   * @param numero Numero a convertir
   * @return Cadena string formateada
   */
  public static String formateoNumero(String formato,int numero) {
    java.text.DecimalFormat format=new java.text.DecimalFormat(formato);
    return Util.lpad(format.format((long)numero),formato.length());
    }

  /** Función para rellenar a blancos un string hasta una longitud
   * @param cadena de caracteres origen a rellenar
   * @param longitud del string a devolver rellenado a espacios
   * @return cadenaResultado que corresponde a la cadena más los espacios indicados
   */
  public static String rpad(String cadena,int longitud) {
    String cadenaResultado=cadena;
    for (int i=cadenaResultado.length();i<longitud;++i)
       cadenaResultado+=" ";
    return cadenaResultado;
    }

  /** Función para verificar que un string es numerico
   * @param cadena a repasar
   * @return true si es numerico
   */
  public static boolean isNumero(String cadena) {
    for (int i=0;i<cadena.length();i++)
      if (cadena.charAt(i)<'0' || cadena.charAt(i)>'9')
        return false;
    return true;
    }

  /** Función que retorna una cadena con la primera letra en mayúscula, y el resto en minúsculas.
   * Si se trata de un conjunto de partículas, retorna la primera letra de cada una en mayúscula y
   * el resto en minúscula.
   * @param buffer que contiene la cadena a tratar.
   * @return cadena con la primera letra de cada partícula en mayúscula y el resto minúscula.
   */
  public static String firstUpper(String buffer) {
    StringBuffer result=new StringBuffer();
    boolean primera=true;
    for (int i=0;i<buffer.length();i++) {
      char letra=buffer.charAt(i);
      if (letra==' ' || letra=='.') {
        primera=true;
        result.append(letra);
        }
      else {
        if (primera) {
          result.append(Character.toUpperCase(letra));
          primera=false;
          }
        else {
          result.append(Character.toLowerCase(letra));
          }
        }
      }
    return result.toString();
  }
  /** Función que genera el código de la referencia de respuesta
   * a una consulta (SIAC,VISION)
   *
   * @return  referencia
   */
  public static String calcularefresp() {
    int segundos;
    String tmp;

    segundos=(int)System.currentTimeMillis()/1000;
    java.util.Random aleatorio=new java.util.Random(segundos);
    tmp=Util.formateoNumero("000000",Math.abs(aleatorio.nextInt())%10000);
    return("ESPB"+formateoNumero("000000000",segundos)+tmp);
    }

  public static String getFormato(int numero,String formato) {
    java.text.DecimalFormat format=new java.text.DecimalFormat(formato);
    return format.format((long)numero);
    }

  public static String generaRefcon(DBConnection db, int codcon){
    String refcon="";
    Date hoy=Maefc.getDate();
    Select select=new Select(db);
    Table contador=new Table(select,"contador");
    Field ctcodcon=new Field(select,contador,"ctcodcon");
    Field ctanio=new Field(select,contador,"ctanio");
    Field ctrefcon=new Field(select,contador,"ctrefcon");
    select.setWhere("ctanio="+Maefc.getYear(hoy)+" and ctcodcon="+codcon);
    select.execute();

    if (!select.isEof()){
      String n="0001";
      String fechahoy=formateoNumero("0000",Maefc.getYear(hoy))+
                      formateoNumero("00",Maefc.getMonth(hoy))+
                      formateoNumero("00",Maefc.getDay(hoy));
      if (!ctrefcon.isNull() && ctrefcon.getString().length()>=8 &&
          ctrefcon.getString().substring(0,8).equals(fechahoy))
        n=formateoNumero("0000",Integer.getInteger(ctrefcon.getString().substring(8)).intValue()+1);
      ctrefcon.setValue(fechahoy+n);
      if (select.update()) refcon="ESP"+formateoNumero("0000",codcon)+fechahoy.substring(2)+n+"00";
      else refcon=null;
      }
    return refcon;
    }

  /** Función para repetir una cadena hasta el numero de veces indicado en parametro veces
   * @param cadena de caracteres a repetir
   * @param veces en que hay que repetir la cadena
   * @return cadenaResultado que corresponde a la cadena resultante
   */
  public static String rpt(String cadena,int veces) {
    String cadenaResultado="";
    for (int i=0;i<veces;++i)
       cadenaResultado+=cadena;
    return cadenaResultado;
    }

   /** Función para buscar un caracter en una cadena i devolver la posicion donde se halle o -1
   * @param cadena de caracteres origen donde buscar
   * @param car caracter que hay que buscar
   * @return cadenaResultado que corresponde a la cadena más los espacios indicados
   */
  public static int sch(String cadena,char car) {
    for (int i=0;i<cadena.length();++i)
      if (cadena.charAt(i)==car)
        return i;
    return -1;
    }

   /** Función para rellenar a blancos por la izquiera un string hasta una longitud
   * @param cadena de caracteres origen a rellenar
   * @param longitud del string a devolver rellenado a espacios
   * @return cadenaResultado que corresponde a la cadena más los espacios indicados
   */
  public static String lpad(String cadena,int longitud) {
    String cadenaResultado="";
    for (int i=cadena.length();i<longitud;++i)
       cadenaResultado+=" ";
    return cadenaResultado+cadena;
    }

  public static String OEMtoAnsi(String input) {
    try {
      return new String(input.getBytes(),"Cp850");
      }
    catch(UnsupportedEncodingException ex) {
      System.out.println("Se ha producido un error al tratar de pasar el código OEM al ANSI");
      return input;
      }
    }

//      case 160:
//        numASC=225; // a tancada
//      case 8218:
//        numASC=233; // e tancada
//      case 161:
//        numASC=237; // i tancada
//      case 162:
//        numASC=243; // o tancada
//      case 163:
//        numASC=250; // u tancada
//      case 8230:
//        numASC=224; // a oberta
//      case 352:
//        numASC=232; // e oberta
//      case 8226:
//        numASC=242; // o oberta
//      case 8212:
//        numASC=249; // u oberta
//      case 8222:
//        numASC=228; // a dieresi
//      case 8240:
//        numASC=235; // e dieresi
//      case 8249:
//        numASC=239; // i dieresi
//      case 65533:
//        numASC=252; // u dieresi
//      case 8221:
//        numASC=246; // o dieresi
//      case 381:
//        numASC=196; // A dieresi
//      case 211:
//        numASC=69; // E dieresi
//      case 216:
//        numASC=73; // I dieresi
//      case 8482:
//        numASC=214; // O dieresi
//      case 353:
//        numASC=220; // U dieresi
//      case 181:
//        numASC=193; // A tancada
//      case 214:
//        numASC=205; // I tancada
//      case 224:
//        numASC=211; // O tancada
//      case 233:
//        numASC=218; // U tancada
//      case 183:
//        numASC=192; // A oberta
//      case 212:
//        numASC=200; // E oberta
//      case 222:
//        numASC=204; // I oberta
//      case 227:
//        numASC=210; // O oberta
//      case 235:
//        numASC=217; // U iberta
//      case 199:
//        numASC=128; // c trencada mayuscula
//      case 8225:
//        numASC=231; // c trencada minuscula
//      case 164:
//        numASC=241; // enye minuscula
//      case 165:
//        numASC=209; // enye mayuscula
//      case 166:
//        numASC=170; // a petita
//      case 167:
//        numASC=186; // o petita
//      case 173:
//        numASC=161; // admiracio obrir
//      case 168:
//        numASC=191; // interrogant obrir
//      }
//    char numASCI=(char)numASC;
//    return String.valueOf(numASCI);

  public static String AnsiToOEM(String input) {
    try {
      return new String(input.getBytes("Cp850"));
      }
    catch(UnsupportedEncodingException ex) {
      System.out.println("Se ha producido un error al tratar de pasar el código ANSI al OEM");
      return input;
      }
    }

  /** Convierte los intros y otros caracteres a un formato mas inteligible
   * @param origen, texto que se va a convertir.
   * @return la cadena de texto ya convertida.
   */
   public static String parserOEM(String origen){
      StringBuffer sb=new StringBuffer();
      origen=AnsiToOEM(origen.toLowerCase());
      for (int i=0;i< origen.length();i++){
        if (origen.charAt(i) < 32)
          sb.append(".");
        else if (origen.charAt(i)==133)
          sb.append("à");
        else if (origen.charAt(i)==135)
          sb.append("ç");
        else if (origen.charAt(i)==138)
          sb.append("è");
        else if (origen.charAt(i)==149)
          sb.append("ò");
        else
          sb.append(origen.charAt(i));
      }
        return sb.toString();
     }
  //-----TRABAJO CON INDEXADAS--------
  public static IgServer server;
  //=====Procesos comunes=======
  public static boolean obreServidor(String n){
      try {
        server=new IgServer(n);
        }
      catch(geyce.ig.IgException e) {
System.out.println("Error: "+e);
        return false;
        }
      return true;
      }

  public static boolean obreServidor(String n,int port){
      try {
        server=new IgServer(n,port);
        }
      catch(IgException e) {
        return false;
        }
      return true;
      }

  public static boolean tancaServidor(){
      try {
        if (server!=null)
          server.close();
        }
      catch(IgException e) {
        return false;
        }
      return true;
      }

  public static boolean tancaFitxer(IgFile file) {
    try {
      if (file!=null)
        file.close();
      }
    catch(IgException e) {
      return false;
      }
    return true;
    }

  public static int valorIntCampo(IgCamp c){
    try {
      if (c.getStringValue().trim().equals(""))
        return 0;
      else {
        return Integer.parseInt(c.getStringValue().trim());
      }
      }
    catch(IgException e) {
      System.out.println("Error(1)="+e);
      return 0;
      }
    }
  public static double valorNumCampo(IgCamp c){
    try {
      double v=0;
      if (c.getTipus()==IgCamp.MONEY)
        v=c.getMoneyValue();
      else if (c.getTipus()==IgCamp.NUMERIC)
        v=c.getDoubleValue();
      return v;
      }
    catch(IgException e) {
      System.out.println("Error(1)="+e);
      return 0;
      }
    }

//  public static double valorNumCampo(IgCamp c){
//    try {
//      String valor=c.getStringValue().trim();
//      valor=valor.replace(',','.');
//      if (valor.equals(""))
//        return 0;
//      else
//        return Double.parseDouble(valor);
//      }
//    catch(IgException e) {
//      System.out.println("Error(1)="+e);
//      return 0;
//      }
//    }

  public static boolean buscar(int n, IgFile file) {
    try {
      file.read(n);
      }
    catch(IgException e) {
      return false;
      }
    return true;
    }

  public static boolean eliminar(IgFile file) {
    try {
      file.delete();
      }
    catch(IgException e) {
      System.out.println("error "+e);
      return false;
      }
    return true;
    }

  public static String getValor(IgCamp c) {
    try {
      return OEMtoAnsi(c.getStringValue());
      }
    catch(IgException e) {
      System.out.println("Error(2)= "+e);
      return null;
      }
    }

  public static String getValorNull(IgCamp c) {
    try {
      String s=OEMtoAnsi(c.getStringValue());
      if (s.trim().equals(""))
        return null;
      else
        return s.trim();
      }
    catch(IgException e) {
      System.out.println("Error(2)= "+e);
      return null;
      }
    }
  public static boolean first(IgFile file) {
    try {
      file.read(IgFile.IGFIRST);
      }
    catch(IgException e) {
      return false;
      }
    return true;
    }

  public static boolean next(IgFile file) {
    try {
      file.read(IgFile.IGNEXT);
      }
    catch(IgException e) {
      return false;
      }
    return true;
    }
  //=====Fin procesos comunes===

  /** Función que retorna un número de caracteres por la derecha
   * @param cadena de texto
   * @param nCar número de caracteres que se desea que retorne
   * @return la cadena deseada
   */
  public static String right(String cadena,int nCar){
       return cadena.substring(cadena.length()-nCar);
  }

  public static boolean esMayusculas(String buffer) {
    boolean primera=true;
    for (int i=0;i<buffer.length();i++) {
      char letra=buffer.charAt(i);
      if (letra==' ' || letra=='.') {
        primera=true;
        }
      else {
        if (primera && Character.isUpperCase(letra))
            primera=true;
        else
            return false;
          }
      }
      return true;
    }

  /** Función que retorna una cadena de números aleatorios
   * @param digitos (nº de dígitos del numero generado)
   * @return la cadena numérica
   */
  public static String generarNum(int digitos){
    String n="";
    java.util.Random r=new java.util.Random();
    for (int i=0;i < digitos;i++)
      n+=String.valueOf(Math.abs(r.nextInt())%10);
    return n;
    }

	/* Funció que crida a la funció de calculo de digito de control, pero només en el cas
   * de que tots els camps estiguin omplerts i que siguin numerics
   **/
  public static boolean digitoIncorrecto(String entidad, String ofi, String cta, String dc, String tipo) {
  if (!"".equals(entidad) && !"".equals(ofi) && !"".equals(cta) && !"".equals(dc)) {
    int digitoControlReal=digitoControl(Integer.parseInt(entidad),Integer.parseInt(ofi),Long.parseLong(cta));
    if (Integer.parseInt(dc)!=digitoControlReal) {
      Maefc.message("El dígito de control de la cuenta "+tipo+" es incorrecto, debería ser "+digitoControlReal,"Datos incorrectos",Maefc.WARNING_MESSAGE);
      return true;
      }
    }
  return false;
  }

  /** Función que calcula el digito de control
   **/
  public static int digitoControl(int entidad,int oficina,long cuenta) {
     String primeraLista = "00"+Numero.format(entidad,"0000")+Numero.format(oficina,"0000");
     String segundaLista = Numero.format(cuenta,"0000000000");
     int a=0,b=0,a1=0,b1=0;
     int m[]={1,2,4,8,5,10,9,7,3,6};
     for (int i=0;i < 10;i++) {
       a = a+(m[i]*Integer.parseInt(primeraLista.substring(i,i+1)));
       b = b+(m[i]*Integer.parseInt(segundaLista.substring(i,i+1)));
       }
     a1=11-a%11;
     if (a1 == 10 || a1 == 11)
       a1 = 11-a1;
     b1=11-b%11;
     if (b1 == 10 || b1 == 11)
       b1 = 11-b1;
     return Integer.parseInt(String.valueOf(a1)+String.valueOf(b1));
    }

	//========Cálculo de NIFes y CIFes

  /** Se encarga de calcular la letra del NIF de un DNI.
   * @param dni DNI del Nacional.
   * @return la letra correspondiente en caso afirmativo o nada en caso de error.
   */
  static final String aux= "TRWAGMYFPDXBNJZSQVHLCKE";
  public static String letraDNI(String dni) {
    if (dni==null || dni.equals(""))
      return "";
    try {
      return String.valueOf(aux.charAt((int)Long.parseLong(dni) % 23));
      }
    catch(NumberFormatException e) {
      return null;
      }
    }

	/** Se encarga de comprobar si la cadena introducida es un NIF correcto
	 * Se llama desde la función esCIF, aunque puede ser independiente.
   * @param nif cadena que contiene el NIF que se va a validar
   * @return número.
   * Si es 0 es correcto
   * Si es 1 se trata de un DNI (cadena numérica)
   * Si es 2 hay una letra y no está ni en el primero ni en el último char
   * Si es 3 la letra del NIF no está bien calculada
   * Si es 9 el primer caracter es un letra (puede ser un CIF)
   */
   public static int esNIF(String nif) {
    if (isNumero(nif))//si todo es un número
      return 1;
    else if (!isNumero(nif.substring(0,1)))//si el primer caracter no es un nº
      return 9; //se debe tratar de un CIF
    else {  //si el último caracter
       String lastChar=right(nif,1);
			 //si el último caracter es un numero y  el primero también,
			 //  debe haber una letra entre medio  o todos menos el último no son numéricos
			 String numdni=nif.substring(0,nif.length()-1);
			 if (isNumero(lastChar) || !isNumero(numdni))
         return 2;
       String numNif=formateoNumero("00000000",Integer.parseInt(numdni));
       String letraNif=letraDNI(numNif);
       if (lastChar.equals(letraNif))
         return 0;                    //ultimo caracter es una letra y está bien
       else
         return 3;                    //ultimo caracter es una letra y está mal
       }
    }

	/** Función que elimina los caracteres especiales que haya de por medio del
	 * cif o nif
   * @param cif cadena que contiene el CIF o NIF que se va a limpiar
   * @return el CIF o NIF sin espacios ni simbolos raros entre medio
   */
	private static String limpiarCIF(String cif) {
		String CIF = "";
		for (int i=0; i < cif.length();i++){
       char letra=cif.charAt(i);
       if (letra!=' ' && letra!='.' && letra!='-' && letra!='/' && letra!=',')
          CIF += cif.substring(i,i+1);
       }
    return CIF.trim();
	  }

  /** Se encarga de comprobar si la cadena introducida es un CIF o NIF correcto
   * @param cif cadena que contiene el CIF o NIF que se va a validar
   * @return el CIF o NIF formateado o la cadena introducida y un mensaje
   * de error si no es correcto
   */
  public static String esCIF(String cif) {
		//se limpia el nif o cif
		String CIF = limpiarCIF(cif);
    //si se trata de un NIF devuelve el NIF arreglado
    if (isNumero(CIF)){
      if (CIF.length() > 8){
         Maefc.message("Número demasiado largo.\nRevise la sintaxis del NIF","NIF incorrecto",Maefc.INFORMATION_MESSAGE);
         return CIF;
         }
      else if (Maefc.message("Se ha introducido un número de DNI"+
        "\n¿Desea añadir la letra del NIF a este DNI?","Conversión de DNI a NIF",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
        String  dni=formateoNumero("00000000",Integer.parseInt(CIF));
        return dni+letraDNI(dni);
        }
      else
        return CIF;
      }
		 try {
		 	//=================NIF===================
			//ya que el NIF no es totalmente numérico, se comprueba si es un NIF
		 		int dnif=esNIF(CIF);
		 		switch (dnif){
     	   case 0:  //es correcto
     	    return CIF;
     	  case 2:  //hay una letra y no está ni en el primero ni en el último char
     	    Maefc.message("Revise la sintaxis del CIF/NIF\n","CIF/NIF incorrecto",Maefc.INFORMATION_MESSAGE);
     	    return CIF;
     	  case 3:  //la letra del NIF (letra final) no está bien calculada
     	    String d=CIF.substring(0,CIF.length()-1);
     	    if (isNumero(d)){
     	       String dni2=formateoNumero("00000000",Integer.parseInt(d));
		 					String letra=letraDNI(dni2);
     	       if (Maefc.message("La letra del NIF debería ser "+letra+"."+
     	         "\n¿Desea cambiar la letra del NIF?","NIF incorrecto",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
     	         return dni2+letra;
     	         }
     	       else
     	         return CIF;
     	      }
     	   }

				//PRIMERA LETRA
				String firstChar=CIF.substring(0,1);
				 //=================CIF especial con letras a ambos lados=========================
		 		//Se toma la primera letra como si fuera 0 y se valida como NIF
				// SE TRATA DEL CASO EN QUE EL PRIMER CARACTER ES UNA LETRA
				// DIFERENTE X y acaba en letra (y el resto es numérico)
		 		if (!isNumero(firstChar) && !firstChar.equals("X") && !isNumero(CIF.substring(CIF.length()-1))){
		 			if (!isNumero(CIF.substring(1,CIF.length()-1)))
		 				 Maefc.message("Un CIF nunca puede contener letras que no se encuentren al principio o al final","CIF incorrecto",Maefc.INFORMATION_MESSAGE);
					System.out.println("Este cif es correcto y es de tipo especial");
		 			return CIF;
		 		  }

		 		 //=================NIE=========================
		 		//NIE. Nif intracomunitario
		 		if (!isNumero(firstChar) && !isNumero(CIF.substring(1,2))){
		 			if (!isNumero(CIF.substring(2,3)))
		 				 Maefc.message("Un CIF nunca puede empezar por 3 letras","CIF incorrecto",Maefc.INFORMATION_MESSAGE);
		 			System.out.println("CIF tipo NIE:"+CIF);
		 			return CIF;
		 		  }

			// si es tracta d'un NIE tipus X de longitud no superior a 9
     	 if (firstChar.equals("X") && CIF.length() <= 9){
     	     //se controla que el 8 caracter sea numérico
     	     if (isNumero(CIF.substring(CIF.length()-1))) {
     	       if (Maefc.message("A este NIE le falta la letra."+
     	         "\n¿Desea añadirla?","Añadir letra al NIE",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
     	         //String  dcif="0"+CIF.substring(1,8);
     	         //return dcif+letraDNI(dcif);
		 						return CIF+letraDNI(CIF.substring(1));
     	         }
     	       }
					 else {
						 //validarlletra en cas que sigui NIE
						 String letracontrol=letraDNI(CIF.substring(1,CIF.length()-1));
						 if (!CIF.substring(CIF.length()-1).equals(letracontrol) )
     	       		if (Maefc.message("La letra de control de este NIE es incorrecta."+
     	       		  "\n¿Desea cambiarla?","Cambiar letra del NIE",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
		 				 				return CIF.substring(0,CIF.length()-1)+letracontrol;
     	       		  }
					   }
     	   return CIF;
     	   }
			//===================CIF=========================  X01949511P
			if (CIF.length()!=9){
     	 //Se controla si el CIF es tipo X no es CIF sino NIF
     	 if (firstChar.equals("P") || firstChar.equals("S")){
		 			if (isNumero(CIF.substring(CIF.length()-1)))
     	   	Maefc.message("Un CIF no puede empezar por P ó S y acabar en número.",
     	   	     "CIF incorrecto",Maefc.INFORMATION_MESSAGE);
		 			//return calculoCIFx(CIF);
		 			return CIF;
     	   }
     	 else  {
				 if (firstChar.equals("X")) {
				   if (esNIF(CIF.substring(1))!=0)
				     Maefc.message("La estructura del NIE es errónea. ",
     	                     "NIE incorrecto",Maefc.INFORMATION_MESSAGE);
				   }
				 else
				   Maefc.message("La estructura del CIF es errónea "+
     	       "\nUn CIF consta de una letra y 8 números.","CIF incorrecto",Maefc.INFORMATION_MESSAGE);
     	   return CIF;
     	   }
     	 }
    	else {//se trata de un CIF de nueve caracteres
     	 if (firstChar.equals("P") || firstChar.equals("S")) {
		 			if (isNumero(CIF.substring(8,9)))
     	   	Maefc.message("Un CIF no puede empezar por P ó S y acabar en número.",
     	   	     "CIF incorrecto",Maefc.INFORMATION_MESSAGE);
		 			//return calculoCIFx(CIF);
		 			return CIF;
     	   }
     	 else {
     	   return calcularCIF(CIF);
     	   }
     	 }
		 }
		catch (IndexOutOfBoundsException e){
			System.out.println("Error:"+e.getMessage());
			return CIF;
		  }
    }

  /** Hace el cálculo del CIF con una estructura correcta
   * @param CIF cadena que contiene el CIF que se va a validar
   * @return el CIF formateado y un texto explicativo en caso de error
   */
  public static String calcularCIF(String CIF){
    if (!isNumero(CIF.substring(1,9))) {
      Maefc.message("Los caracteres 2-9 deben ser numéricos.",
           "CIF incorrecto",Maefc.INFORMATION_MESSAGE);
      return CIF;
      }
    //el primer caracter debe ser un alfanumérico de los de esta lista
    String pchar=CIF.substring(0,1);
    String lcif="ABCDEFGHQKLM";
    if(lcif.indexOf(pchar) < 0){
      Maefc.message("La letra del CIF no es correcta, "+
           "\nla letra debe ser una de éstas:"+
           "\nABCDEFGHKLMQ","CIF incorrecto",Maefc.INFORMATION_MESSAGE);
      return CIF;
      }
    else {
      //num son los guarismos sobre los que se van a hacer los cálculos
      String num=CIF.substring(1,CIF.length()-1);
      //ultdig es el dígito de control
      int ultdig=Integer.parseInt(CIF.substring(CIF.length()-1,CIF.length()));//Character.getNumericValue(num.charAt(num.length()-1));
      //se procede con el cálculo del CIF
      int primcol=0,segcol=0;
      for (int i=0;i<num.length();i+=2){
          //se cogen los números y se dividen en dos columnas:
          //1ª columna con numeros impares y 2ª columna con números pares
          //se multimplica por dos cada uno de los números de la primera
          //columna y luego se suman sus dígitos. Por último, se suman todos
          //resultados de esta primera columna
          primcol+=Integer.parseInt(formateoNumero("00",Integer.parseInt(num.substring(i,i+1))*2).substring(0,1))+Integer.parseInt(Util.formateoNumero("00",Integer.parseInt(num.substring(i,i+1))*2).substring(1,2));
          //el condicional sierve para controlar que solo se haga el cálculo
          //con los números pares 2,4 y 6
          //Se suman los números de la segunda columna
          if (i < 5)
            segcol+=Integer.parseInt(num.substring(i+1,i+2));
          }
      //se suman los números de la columna 1 y 2
      int resulcol=primcol+segcol;
      //Se suman los dígitos del resultado. La diferencia entre este número
      //y la decena superior es el llamado dígito de control
      //que se guardará en tmpultdig
      int tmpultdig=(Integer.parseInt(formateoNumero("00",resulcol).substring(0,1))*10)+10-resulcol;
      if (tmpultdig==10)
          tmpultdig=0;
      //si el dígito de control calculado no se corresponde con el
      //último número del CIF, se informa de que el CIF es erróneo y si se desea cambiar
      if (tmpultdig!=ultdig){
        if (Maefc.message("El ultimo digito del CIF de la Sociedad es incorrecto. Debería ser un "+tmpultdig+"."+
          "\n¿Desea que se modifique el dígito de control?","Cambiar Dígito de Control",Maefc.QUESTION_MESSAGE,Maefc.YES_NO_OPTION)==Maefc.YES_OPTION) {
          return CIF.substring(0,8)+tmpultdig;
          }
        else
         return CIF;
        }
      return CIF;
      }
    }
	//fin

  }

