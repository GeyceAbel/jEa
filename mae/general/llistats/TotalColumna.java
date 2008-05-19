package mae.general.llistats;

import mae.general.Numero;
import mae.general.Util;
import geyce.maefc.Report;
import geyce.maefc.ReportData;
import geyce.maefc.Value;


public class TotalColumna {
	private String underline;
	private Value valor;
	private ReportData valorListado;
	private int orden;
	
	
	private int var_listado;
    public void setVarListado (int i) {
    	var_listado =i;
	}
	public int getVarListado () {
		return var_listado;
	}
    
	public void setOrden(int i) {
		orden = i;
	}
	public int getOrden() {
		return orden;
	}
	  
	public TotalColumna(){		
		underline = "=";		
	}
	
	public ReportData initValor(Report r) {
		valor = new Value();
		valor.setNull();
		valorListado = new ReportData(r);
		valorListado.setNull();
		return valorListado;
	}
	/**
	 * @uml.property  name="columna"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="totalColumna:mae.general.llistats.Columna"
	 */
	private Columna columna = null;

	/**
	 * Getter of the property <tt>columna</tt>
	 * @return  Returns the columna.
	 * @uml.property  name="columna"
	 */
	public Columna getColumna() {
		return columna;
	}

	/**
	 * Setter of the property <tt>columna</tt>
	 * @param columna  The columna to set.
	 * @uml.property  name="columna"
	 */
	public void setColumna(Columna columna) {
		this.columna = columna;
	}

	public void init() {
		valor.setNull();
		valorListado.setNull();
	}
	
	public double getValor() {
		return valor.getDouble();
	}
	public void setValor(double d) {
		valor.setValue(d);
		valorListado.setValue(getFormatoValor());
	}	

	
	public void acumulaColumna() {
		if (getColumna()!=null) {
			double d = getValor();
			d += getColumna().getValor().getDouble();
			setValor(d);
		}
	}

	public void setUnderline (String s) {
		underline =s;
	}
    public String getUnderline () {
    	return underline;
	}			
    public String getFormatoUnderline() {
	    String tmp = getUnderline();
	    if (getColumna()!=null) {
	    	tmp = Util.rpt(getUnderline(), getColumna().getLongitud());
	    }
	    return tmp;
	  }    
	public String getFormatoValor() {
	    String tmp = "";
	    if (getColumna()!=null) {
		    if (getColumna().getTipoColumna() == Columna.TIPO_DECIMAL) {
		      tmp = Numero.formatConCero(valor.getDouble(),getColumna().getMascara(),getColumna().getMascara0());
		    }
		    else if (getColumna().getTipoColumna() == Columna.TIPO_STRING) {
		    	tmp = valor.getString();
		    }            
		    else if (getColumna().getTipoColumna() == Columna.TIPO_ENTERO) {    	
		      tmp = Numero.formatConCero(valor.getInteger(),getColumna().getMascara(),getColumna().getMascara0());
		    }    
		    
		    if (getColumna().getAlineado() == Columna.ALIG_RIGHT) {
		      tmp = Util.lpad(tmp,getColumna().getLongitud());
		    }
		    else if (getColumna().getAlineado() == Columna.ALIG_LEFT) {
		      tmp = Util.rpad(tmp,getColumna().getLongitud());
		    }
	    }
		    return tmp;
	 }	
	
}
