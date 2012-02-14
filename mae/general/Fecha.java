package mae.general;

import java.util.*;
import geyce.maefc.*;

//import mae.general.*;

/** Clase que engloba funciones de utilidad asociadas a las fechas
 * @author GEYCE - Joan Vilaseca
 * @version 1.4, 13/2/2002
 * Es rectifica funcio gregorianaFecha perque no funcionava
 * S'afegeix nova funcio getHora
 * S'afegeixen funcions fechaInicioMes i fechaFinMes
 */
public class Fecha {
  /** Función que retorna true si el año es bisiesto.
   *
   * @param anyo Año del cual se desea cuestionar si es o no bisiesto
   *
   * @return true si es año bisiesto
   */
  public static boolean isBisiesto(int anyo) {
    return (anyo!=0 && (anyo%400==0 || (anyo%4==0 && anyo%100!=0)));
    }

  /** Función para devolver una fecha en formato AAAAMMDD
   *
   * @param fecha a reconvertir su formato
   *
   * @return fechaGregoriana en formato AAAAMMDD
   */
  public static String fechaGregoriana(java.util.Date fecha) {
    String sfecha=Util.formateoNumero("0000",Maefc.getYear(fecha))+
                  Util.formateoNumero("00",Maefc.getMonth(fecha)+1)+
                  Util.formateoNumero("00",Maefc.getDay(fecha));
    return sfecha;
    }

  /** Función que retorna una fecha pasándole por parámetro tres enteros; año, mes y día.
   *
   * @param anyo Año.
   * @param mes Mes.
   * @param día Día.
   *
   * @return fecha en tipo Date.
   */
  public static Date getDate(int anyo, int mes, int dia) {
    Calendar cal=Calendar.getInstance();
    cal.clear();
    cal.set(anyo,mes-1,dia);
    return cal.getTime();
    }

  /** Función que devuelve la fecha sin atributos de hora, minutos, segundos
   *
   * @param La fecha
   *
   * @return Fecha sin hora ni minutos ni segundos
   */
  public static Date senseHora(Date dia) {
    Calendar c1= Calendar.getInstance();
    Calendar c2= Calendar.getInstance();
    c1.setTime(dia);
    c2.clear();
    c2.set(Calendar.YEAR,c1.get(Calendar.YEAR));
    c2.set(Calendar.MONTH,c1.get(Calendar.MONTH));
    c2.set(Calendar.DAY_OF_MONTH,c1.get(Calendar.DAY_OF_MONTH));
    return c2.getTime();
    }

  /** Función que compara dos fechas.
   *
   * @param d1 Primera fecha.
   * @param d2 Segunda fecha.
   *
   * @return TRUE si las dos fechas son iguales o FALSE en caso contrario.
   */
    public static boolean igualDiaMesAnio(Date d1, Date d2) {
    Calendar cal1=Calendar.getInstance();
    cal1.setTime(d1);
    Calendar cal2=Calendar.getInstance();
    cal2.setTime(d2);
    if (cal1.get(Calendar.DAY_OF_MONTH)==cal2.get(Calendar.DAY_OF_MONTH) &&
        cal1.get(Calendar.MONTH)==cal2.get(Calendar.MONTH) &&
        cal1.get(Calendar.YEAR)==cal2.get(Calendar.YEAR))
      return true;
    else
      return false;
    }

  /** Función que retorna dada una fecha, su composición en letra.
   *
   * @param data Fecha.
   *
   * @return Composición de la fecha en letra.
   */
  public static String formatoTexto(Date data) {
    Calendar calendar=Calendar.getInstance();
    calendar.setTime(data);
    int numero=calendar.get(Calendar.MONTH);
    String ret="mes de "+nombreMes(numero)+" de "+calendar.get(Calendar.YEAR);
    return ret;
    }

  /** Función que retorna el nombre del mes pasándole por parámetro su número correspondiente.
   *
   * @param d1 Primera fecha.
   * @param d2 Segunda fecha.
   *
   * @return Nombre del mes en letra.<br>
   * ? si el número no pertenece al rango [1..12].
   */
  public static String nombreMes(int numero) {
    String nom[]={
      "Enero",
      "Febrero",
      "Marzo",
      "Abril",
      "Mayo",
      "Junio",
      "Julio",
      "Agosto",
      "Septiembre",
      "Octubre",
      "Noviembre",
      "Diciembre"
      };
    if (numero>=0 && numero<=11)
      return nom[numero];
    else
      return "?";
    }

  /** Función que suma un número de meses a una fecha.
   *
   * @param dia Fecha a la que se le desea sumar el número de meses.
   * @param mes Número de meses a sumar a la fecha.
   *
   * @return Fecha con el número de meses sumado.
   */
  public static Date sumaMes(Date dia, int mes) {
    Calendar calendar=Calendar.getInstance();
    calendar.setTime(dia);
    calendar.add(Calendar.MONTH,mes);
    calendar.clear(Calendar.HOUR_OF_DAY);
    calendar.clear(Calendar.MINUTE);
    calendar.clear(Calendar.SECOND);
    calendar.clear(Calendar.MILLISECOND);

    return calendar.getTime();
    }

  /** Función que retorna el mes en letra pasándole por parámetro su número correspondiente.
   *
   * @param dia Día del mes en número.
   *
   * @return El día de mes en letra.<br>
   * ? si el número no pertenece al rango [1..31].
   */
  public static String diaMesEnLetra(int dia) {
    String numero[]={
        "uno",          "dos",         "tres",       "cuatro",
        "cinco",        "seis",        "siete",      "ocho",
        "nueve",        "diez",        "once",       "doce",
        "trece",        "catorce",     "quince",     "dieciseis",
        "diecisiete",   "dieciocho",   "diecinueve", "veinte",
        "veintiuno",    "veintidos",   "veintitres", "veinticuatro",
        "veinticinco",  "veintiseis",  "veintisiete","veintiocho",
        "veintinueve",  "treinta",     "treinta y uno"
        };
    if (dia>=1 && dia<=31) return numero[dia-1];
    else return "?";
    }

  /** Función que retorna la fecha del primer día de un trimestre.
   *
   * @param trimestre Número que indica el trimestre deseado [1..4].
   * @param anyo Año del cual se desea obtener la fecha.
   *
   * @return fecha de inicio del trimestre correspondiente<br>
   * Nulo en caso de parámetros erróneos.
   */
  public static Date desdeFechaTrimestre(int trimestre,int anyo) {
    switch(trimestre) {
      case 1:
        return getDate(anyo,1,1);
      case 2:
        return getDate(anyo,4,1);
      case 3:
        return getDate(anyo,7,1);
      case 4:
        return getDate(anyo,10,1);
      default:
        return null;
      }
    }

  /** Función que retorna la fecha del primer día de un mes.
   *
   * @param mes Número que indica el mes deseado [1..12].
   * @param anyo Año del cual se desea obtener la fecha.
   *
   * @return fecha de inicio del mes correspondiente<br>
   * Nulo en caso de parámetros erróneos.
   */
  public static Date fechaInicioMes(int mes,int anyo) {
    if (mes>=1 && mes<=12)
      return getDate(anyo,mes,1);
    else
      return null;
    }

  /** Función que retorna la fecha del ultimo día de un mes.
   *
   * @param mes Número que indica el mes deseado [1..12].
   * @param anyo Año del cual se desea obtener la fecha.
   *
   * @return fecha de fin del mes correspondiente<br>
   * Nulo en caso de parámetros erróneos.
   */
  public static Date fechaFinMes(int mes,int anyo) {
    switch(mes) {
      case 1:
        return getDate(anyo,1,31);
      case 2:
        if (isBisiesto(anyo))
          return getDate(anyo,2,29);
        else
          return getDate(anyo,2,28);
      case 3:
        return getDate(anyo,3,31);
      case 4:
        return getDate(anyo,4,30);
      case 5:
        return getDate(anyo,5,31);
      case 6:
        return getDate(anyo,6,30);
      case 7:
        return getDate(anyo,7,31);
      case 8:
        return getDate(anyo,8,31);
      case 9:
        return getDate(anyo,9,30);
      case 10:
        return getDate(anyo,10,31);
      case 11:
        return getDate(anyo,11,30);
      case 12:
        return getDate(anyo,12,31);
      default:
        return null;
      }
    }

  /** Función que retorna la fecha del último día de un trimestre.
   *
   * @param trimestre Número que indica el trimestre deseado [1..4].
   * @param anyo Año del cual se desea obtener la fecha.
   *
   * @return Fecha de fin de trimestre correspondiente.<br>
   * Nulo en caso de parámetros erróneos.
   */
  public static Date hastaFechaTrimestre(int trimestre,int anyo) {
    switch(trimestre) {
      case 1:
        return getDate(anyo,3,31);
      case 2:
        return getDate(anyo,6,30);
      case 3:
        return getDate(anyo,9,30);
      case 4:
        return getDate(anyo,12,31);
      default:
        return null;
      }
    }

  /** Función que suma un número de años a una fecha.
   *
   * @param data Fecha a la que se le desea sumar el número de años.
   * @param anyos Número de años a sumar a la fecha.
   *
   * @return Fecha con el número de años sumado.
   */
  public static Date sumarAnyos(Date data,int anyos) {
    Calendar c=new GregorianCalendar();
    c.setTime(data);
    c.add(Calendar.YEAR,anyos);
    return fecha(c);
    }

  /** Función que suma un número de semanas a una fecha.
   *
   * @param fecha Fecha a la que se le desea sumar el número de semanas.
   * @param semanas Número de semanas a sumar a la fecha.
   *
   * @return Fecha con el número de semanas sumado.
   */
  public static Date sumarSemanas(Date fecha,int semanas) {
    Calendar c=new GregorianCalendar();
    c.setTime(fecha);
    c.add(Calendar.WEEK_OF_YEAR,semanas);
    return c.getTime();
    }

  /** Función que suma un número de dias a una fecha.
   *
   * @param fecha Fecha a la que se le desea sumar el número de dias.
   * @param dias Número de dias a sumar a la fecha.
   *
   * @return Fecha con el número de dias sumado.
   */
  public static Date sumarDias(Date fecha,int dias) {
    Calendar c=new GregorianCalendar();
    c.setTime(fecha);
    c.add(Calendar.DAY_OF_MONTH,dias);
    return fecha(c);
    }

  public static boolean antes(Date dia, Date inicio) {
    return dia.before(inicio);
    }

  public static boolean despues(Date dia, Date inicio) {
    return dia.after(inicio);
    }

  public static boolean fechaDentroPeriodo(Date fecha, Date inicio, Date fin) {
    return !antes(fecha,inicio) && !despues(fecha,fin);
    }

  public static int ultimoDiaMes(int any, int mes) {
    switch(mes) {
      case 1:
        return 31;
      case 2:
        if (isBisiesto(any))
          return 29;
        else
          return 28;
      case 3:
        return 31;
      case 4:
        return 30;
      case 5:
        return 31;
      case 6:
        return 30;
      case 7:
        return 31;
      case 8:
        return 31;
      case 9:
        return 30;
      case 10:
        return 31;
      case 11:
        return 30;
      case 12:
        return 31;
      default:
        return 0;
      }
    }

  public static int tipoDiaSemana(Date dia) {
    Calendar cal=Calendar.getInstance();
    cal.setTime(dia);
    int ret = cal.get(Calendar.DAY_OF_WEEK);

    return (ret+5)%7;  // Vaya trucu per fer que diumenge no sigui el primer dia de la setmana
                     // A més, la funció de Java retorna de 1-7 i jo necessito de 0-6 per
                   // poder montar arrays
    }

  public static Date restaDies(Date dia,int dies) {
    return sumarDias(dia,-dies);
    }

  /** Función que retorna la edad de una persona en una fecha concreta.
   *
   * @param fecaci Fecha de nacimiento.
   * @param fecha Fecha en la cual se desea calcular la edad.
   *
   * @return Edad de la persona en la fecha indicada.
   */
  public static int edadEnFecha(Date fenaci,Date fecha) {
    if (fenaci==null || fecha==null)
      return 0;

    Calendar cfenaci=Calendar.getInstance();
    cfenaci.setTime(fenaci);

    Calendar cfehoy=Calendar.getInstance();
    cfehoy.setTime(fecha);

    int anys=cfehoy.get(Calendar.YEAR)-cfenaci.get(Calendar.YEAR);
    if (cfenaci.get(Calendar.MONTH)>cfehoy.get(Calendar.MONTH)
        || (cfenaci.get(Calendar.MONTH)==cfehoy.get(Calendar.MONTH)
        && cfenaci.get(Calendar.DAY_OF_MONTH)>cfehoy.get(Calendar.DAY_OF_MONTH)))
      --anys;
    return anys;
    }

  /** Función que retorna la edad actual de una persona.
   *
   * @param fenaci Fecha de nacimiento.
   *
   * @return Edad actual de la persona.
   */
  public static int edad(Date fenaci) {
    return edadEnFecha(fenaci,Maefc.getDate());
  }

  /** Función para devolver una fecha a partir
   * de un string en formato gregoriano AAAAMMDD
   * @param string a reconvertir su formato
   * @return fecha
   */
  public static java.util.Date gregorianaFecha(String aaaammdd) {
    int anyo,mes,dia;
    if (aaaammdd!=null && aaaammdd.length()==8) {
      anyo=Integer.parseInt(aaaammdd.substring(0,4));
      mes=Integer.parseInt(aaaammdd.substring(4,6));
      dia=Integer.parseInt(aaaammdd.substring(6,8));
      return getDate(anyo,mes,dia);
      }
    else {
      return null;
      }
    }

  /** Función para devolver la hora a partir de una fecha y un formato
   * @param fecha fecha de la que se extrae la hora
   * @param formato formato de la hora (HH:mm:ss)
   * @return hora como String
   */
  public static String getHora(java.util.Date fecha, String formato){
    java.text.SimpleDateFormat hora=new java.text.SimpleDateFormat(formato);
    return hora.format(fecha);
    }

  /** Función para devolver la hora actual con formato hora:minutos:segundos
   * @return hora como String
   */
  public static String getHora(){
    java.text.SimpleDateFormat hora=new java.text.SimpleDateFormat("HH:mm:ss");
    return hora.format(new java.util.Date());
    }

// Metodes afegits per incorporacions de Laboral
// ==========================================================================================
  private static String mesos[] = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

  public static String enTexto(Date date) {
    return dia(date)+" de "+mesos[mes(date)] + " de " + anyo(date);
    }

  public static int anysDiferencia(Date inici, Date fi) {
    int anyInici=anyo(inici);
    int anyFi=anyo(fi);

    if  ( mes(fi)> mes(inici)  || (dia(fi)>=dia(inici) && mes(fi)>=mes(inici)) )
      return anyFi-anyInici;
    else
      return anyFi-anyInici-1;
    }

  // Devuelve los dias transcurridos entre dos fechas
  public static int diasDiferencia(Date inici, Date fi) {
    int dias=0;
    for(DiasEnumerador eenum=new DiasEnumerador(inici,fi);eenum.hasMoreElements();eenum.nextElement()) {
        dias++;
        }
    return dias;
    }

  public static Date fecha(Calendar cal) {
    return fecha(cal.getTime());
    }

  public static Date fecha(Date data) {
    return calendar(data).getTime();
    }

  public static Date hoy() {
    return fecha(new GregorianCalendar());
    }

  public static int anyo(Date data) {
     Calendar c=new GregorianCalendar();
     c.setTime(data);

     return c.get(Calendar.YEAR);
    }

  public static int mes(Date data) {
     Calendar c=new GregorianCalendar();
     c.setTime(data);

     return c.get(Calendar.MONTH);
    }

  public static int dia(Date data) {
	   Calendar c=new GregorianCalendar();
     c.setTime(data);

     return c.get(Calendar.DAY_OF_MONTH);
    }

  public static Date construyeFecha(int dia, int mes , int any) {
    return getDate(any,mes,dia);
    }

  public static Enumeration construyeDiasEnumerador(Date inici, Date fi) {
    return new DiasEnumerador(inici, fi);
    }

  public static Calendar calendar(Date data) {
    Calendar c=new GregorianCalendar();
    c.setTime(data);

    int any=c.get(Calendar.YEAR);
    int mes=c.get(Calendar.MONTH);
    int dia=c.get(Calendar.DAY_OF_MONTH);
    c.clear();
    c.set(Calendar.YEAR,any);
    c.set(Calendar.MONTH,mes);
    c.set(Calendar.DAY_OF_MONTH,dia);
    return c;
    }

  static class DiasEnumerador implements Enumeration {
    private Calendar inici;
    private Calendar fi;
    private Calendar current;

    DiasEnumerador(Date inici, Date fi) {
      this.inici   = calendar(inici);
      this.fi      = calendar(fi);
      this.current = calendar(inici);
      }

    public Object nextElement() {
      if (hasMoreElements()) {
        Date ret=current.getTime();
        current.add(Calendar.DAY_OF_MONTH,1);
        return ret;
        }
      else
        return null;
      }

    public boolean hasMoreElements() {
      return !current.after(fi);
      }
    }

  }
