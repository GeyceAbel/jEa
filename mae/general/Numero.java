package mae.general;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/** Clase que engloba funciones �tiles para n�meros
 * @author GEYCE - Manel Torres
 * @version 1.1, 1/6/2001
 */
public class Numero {
	public static boolean NEW_ROUND_METHOD = false;

  /** Funci�n para redondear doubles
   *
   * @param numero y el redondeo a utilizar
   *
   * @return numero
   */
	
	//APJORDI 30/12/2019 NO esta provat a casa client.
	//                   El que esta clar, es que la funcio actual round no formata be el numero 12.345 
	//                   Hauria de ser a 2 decimals 12.35 i retorna 12.34
    public static double new_round (double numero, int digitos) {
		BigDecimal bdn = BigDecimal.valueOf(numero);
		bdn = bdn.setScale(digitos, BigDecimal.ROUND_HALF_UP);
		return bdn.doubleValue();
    }
    
    static public double actual_round (double n, int i) {
		  double pot=Math.pow(10,i);
		  return Math.floor(((n*pot) + 0.5d))/pot;
    }
    
  static public double round(double n, int i) {
	  if (NEW_ROUND_METHOD) return new_round(n, i);
	  else return actual_round (n,i);
    }

  /** Funci�n para redondear doubles con dos decimales
   *
   * @param numero
   *
   * @return numero
   */
  static public double redondeo(double importe) {
    return round(importe,2);
    }

  /** Funci�n para redondear doubles con tres decimales
   *
   * @param numero
   *
   * @return numero redondeado a 3 decimales
   */
  static public double redondeoCambio(double valor) {
    return round(valor,3);
    }

  /** Funci�n para comparar dos doubles despreciando los �ltimos decimales
   *
   * @param a
   * @param b
   * @return true o false
   */
  static public boolean doubleEquals(double a,double b) {
    if (a>b-0.000001 && a<b+0.000001)
      return true;
    else
      return false;
    }

  /** Funci�n para formatear num�ricos
   *
   * @param n valor a redondear
   * @param masc m�scara del formateo
   *
   * @return valor String formateado
   */
  static public String format(double n, String masc) {
    DecimalFormat d=new DecimalFormat(masc);
    return Util.lpad(d.format(n),masc.length());
    }

  /** Funci�n para formatear num�ricos con trato especial para los ceros
   *
   * @param n valor a redondear
   * @param masc m�scara del formateo
   * @param cero string asociado a valores 0
   *
   * @return valor String formateado
   */
  static public String formatConCero(double n, String masc, String cero) {
    if (doubleEquals(n,0))
      return cero;
    DecimalFormat d=new DecimalFormat(masc);
    return Util.lpad(d.format(n),masc.length());
    }
  }
