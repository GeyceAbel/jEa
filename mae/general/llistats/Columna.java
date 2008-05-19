package mae.general.llistats;
import mae.general.*;
import geyce.maefc.ControlValue;
import geyce.maefc.Field;
import geyce.maefc.ReportDataControl;
import geyce.maefc.ReportDataField;
import geyce.maefc.Value;
import geyce.maefc.ReportData;
import geyce.maefc.Report;

public final class Columna {	
	public static final int TIPO_STRING = 1;	
	public static final int TIPO_ENTERO = 2;
	public static final int TIPO_DECIMAL= 3;
	public static final int TIPO_PORCEN = 4;
	public static final int TIPO_EXCEL_STRING = 1;	
	public static final int TIPO_EXCEL_DATE = 2;
	public static final int TIPO_EXCEL_INT = 3;
	public static final int TIPO_EXCEL_PORC = 4;
	public static final int TIPO_EXCEL_DOUBLE = 5;
	public static final int TIPO_EXCEL_MONEDA = 6;
	public static final int ALIG_LEFT   = 1;
	public static final int ALIG_RIGHT  = 2;

	private String id;
	private String titulo;
	private String tituloSuperior;
	private int longitud;
	private int posIni;
	private int tipo_columna;
	private int tipo_excel;
	private int tipo_alineado;
    private ReportData valorListado;
    private Value valor;
	private String underline_titulo;
	private String mascara;
	private String mascara0;
	private int var_listado;
	
	Columna () {			
		tituloSuperior = "";		
	}
	
	public void resetColumna() {
		valor.setNull();
		valorListado.setNull();
	}
	public ReportData initValor(Report r) {
		valorListado = new ReportData(r);
		valorListado.setNull();
		valor = new Value();
		valor.setNull();
		return valorListado;
	}
	public ReportData initValor(Report r, Field f) {
		valorListado = new ReportDataField(r,f);
		valorListado.setNull();
		valor = new Value();
		valor.setNull();
		return valorListado;
	}
	public ReportData initValor(Report r, ControlValue cv) {
		valorListado = new ReportDataControl (r,cv);
		valorListado.setNull();
		valor = new Value();
		valor.setNull();
		return valorListado;
	}	

  public String getFormatoTitulo() {
    String tmp = "";
    tmp = Util.rpad(titulo,longitud);
    return tmp;
  }
  
  public String getFormatoTituloSuperior() {
	    String tmp = "";
	    tmp = Util.rpad(tituloSuperior,longitud);
	    return tmp;
	  }  
  
  public String getFormatoUnderlineTitulo() {
	    String tmp = "";
	    tmp = Util.rpt(getUnderTitulo(), getLongitud());
	    return tmp;
	  }
  
  public String getFormatoValor() {
    String tmp = "";
    if (tipo_columna == TIPO_DECIMAL) {
      tmp = Numero.formatConCero(valor.getDouble(),mascara,mascara0);
    }
    else if (tipo_columna == TIPO_STRING) {
      tmp = valor.getString();
    }    
    else if (tipo_columna == TIPO_ENTERO) {    	
      tmp = Numero.formatConCero(valor.getInteger(),mascara,mascara0);
    }    
        
    if (tipo_alineado == ALIG_RIGHT) {
      tmp = Util.lpad(tmp,longitud);
    }
    else if (tipo_alineado == ALIG_LEFT) {
      tmp = Util.rpad(tmp,longitud);
    }            
    return tmp;
  }

	public int getPosIni () {
		return posIni;
	}
	public void setPosIni (int i) {
		posIni = i;
	}
	public int getLongitud () {
		return longitud;
	}
	public void setLongitud (int i) {
		longitud = i;
	}
	public int getTipoColumna() {
		return tipo_columna;
	}
	public void setTipoEntero() {
	  tipo_columna=TIPO_ENTERO;
	}
	public void setTipoDecimal() {
	  tipo_columna=TIPO_DECIMAL;
	}	
	public void setTipoString() {
	  tipo_columna=TIPO_STRING;
	}
	public void setTipoExcelMoneda() {
	  tipo_excel=TIPO_EXCEL_MONEDA;
	}
	public void setTipoExcelInt() {
		  tipo_excel=TIPO_EXCEL_INT;
		}
	public void setTipoExcelDouble() {
		  tipo_excel=TIPO_EXCEL_DOUBLE;
		}
	public void setTipoExcelPorcen() {
		  tipo_excel=TIPO_EXCEL_PORC;
		}
	public void setTipoExcelString() {
		  tipo_excel=TIPO_EXCEL_STRING;
		}
	public void setTipoExcelDate() {
		  tipo_excel=TIPO_EXCEL_DATE;
		}
	public int getTipoExcel () {
		return tipo_excel;
	}
	
	public int getAlineado () {
		return tipo_alineado;
	}
	public void setAliRight () {
	  tipo_alineado = ALIG_RIGHT;
	}
	public void setAliLeft () {
	  tipo_alineado = ALIG_LEFT;
	}

		
	public Value getValor() {
	  return valor;		
	}
		
  public void setValor (double d) {  	
		valor.setValue(d);
		valorListado.setValue(getFormatoValor());
	}	
  public void setValor (int i) {
		valor.setValue(i);
		valorListado.setValue(getFormatoValor());
	}
	public void setValor (String s) {
		valor.setValue(s);
		valorListado.setValue(getFormatoValor());
	}
  public void setValor (java.util.Date f) {
		valor.setValue(f);
		valorListado.setValue(getFormatoValor());
	}

	public void setUnderTitulo (String s) {
	  underline_titulo =s;
	}
  public String getUnderTitulo () {
	  return underline_titulo;
	}		
  public void setVarListado (int s) {
		  var_listado =s;
		}
	  public int getVarListado () {
		  return var_listado;
		}	  
				
  public void setMascara (String s) {
	if (s==null) s="";
	mascara =s;
	if (mascara.length()>longitud) longitud=mascara.length();		
  }
  public String getMascara () {
	  return mascara;
	}		
	public void setMascara0 (String s) {
		if (s==null) s="";
	  mascara0 =s;
	  if (mascara0.length()>longitud) longitud=mascara0.length();		
	}
  public String getMascara0 () {
	  return mascara0;
	}		
	
	public void setId (String  s) {
	  id =s;
	}
  public String getId () {
	  return id;
	}
	public void setTitulo (String s) {		
		if (s==null) s="";
	  titulo =s;
	  if (titulo.length()>longitud) longitud=titulo.length();
	}
  public String getTitulo () {
	  return titulo;
	}	
	public void setTituloSuperior (String s) {		
		if (s==null) s="";
	  tituloSuperior =s;
	  if (tituloSuperior.length()>longitud) longitud=tituloSuperior.length();
	}
  public String getTituloSuperior () {
	  return tituloSuperior;
	}	
}
