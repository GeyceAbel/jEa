package mae.general.llistats;

import geyce.maefc.Report;
import geyce.maefc.ReportData;


public class Encabezado {
	private int posInicial;	
	private ReportData valor;
	private String literal;	
	private int var_listado;
	private boolean literalBold;
	private boolean repetido;
	private boolean noVisualizarEnExcel;

    public void setRepetido (boolean b) {
    	repetido = b;
	}
	public boolean getRepetido () {
		return repetido;
	}
	
    public void setLiteralBold (boolean b) {
    	literalBold = b;
	}
	public boolean getLiteralBold () {
		return literalBold;
	}
	
	public void setLiteral (String s) {
    	literal = s;
	}
	public String getLiteral () {
		return literal;
	}

	public void setPosInicial (int i) {
    	posInicial =i;
	}
	public int getPosInicial () {
		return posInicial;
	}
	
    public void setVarListado (int i) {
    	var_listado =i;
	}
	public int getVarListado () {
		return var_listado;
	}
  	  
	public Encabezado(){		
		posInicial = 0;
		literalBold = true;
		literal = "";
		repetido = false;
		noVisualizarEnExcel = false;
	}
	
	public ReportData initValor(Report r) {
		valor = new ReportData(r);
		valor.setNull();
		return valor;
	}

	public void init() {
		valor.setNull();
		valor.setNull();
	}
	
	public String getValor() {
		return valor.getString();
	}
	public void setValor(String s) {
		valor.setValue(s);
	}
	public boolean isNoVisualizarEnExcel() {
		return noVisualizarEnExcel;
	}
	public void setNoVisualizarEnExcel(boolean noVisualizarEnExcel) {
		this.noVisualizarEnExcel = noVisualizarEnExcel;
	}		
}
