package mae.general.llistats;

import java.util.ArrayList;
import java.util.List;

import geyce.maefc.Report;
import geyce.maefc.ReportData;

public class Rotura {
	/**
	 * @uml.property  name="totales"
	 * @uml.associationEnd  multiplicity="(0 -1)" aggregation="composite" inverse="rotura:mae.general.llistats.TotalColumna"
	 */
	private List <TotalColumna> totales;
	public Rotura () {
		totales = new ArrayList<TotalColumna>();
		pintaUnderline = false;
		posInicial = 0;
		clearRotura = false;
		saltPagina = false;
		automatica = true;
		dejarLineaBlanca = true;
		resetNumPage = false;
	}
	/**
	 * Getter of the property <tt>totales</tt>
	 * @return  Returns the totales.
	 * @uml.property  name="totales"
	 */
	public List <TotalColumna> getTotales() {
		return totales;
	}
	public TotalColumna getTotal(int index) {
		return (TotalColumna) totales.get(index);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="totales"
	 */
	public boolean isTotalesEmpty() {
		return totales.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element.
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="totales"
	 */
	public boolean containsTotales(TotalColumna totalColumna) {
		return totales.contains(totalColumna);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="totales"
	 */
	public int totalesSize() {
		return totales.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="totales"
	 */
	public TotalColumna[] totalesToArray() {
		return (TotalColumna[]) totales.toArray(new TotalColumna[totales.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="totales"
	 */
	public TotalColumna[] totalesToArray(TotalColumna[] totales) {
		return (TotalColumna[]) this.totales.toArray(totales);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation).
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="totales"
	 */
	public boolean addTotal(TotalColumna totalColumna, int id) {
		totalColumna.setVarListado(id);
		return totales.add(totalColumna);
	}
	public void addTotal(int index, TotalColumna totalColumna, int id) {
		totalColumna.setVarListado(id);
		totales.add(index, totalColumna);
	}

	/**
	 * Setter of the property <tt>totales</tt>
	 * @param totales  the totales to set.
	 * @uml.property  name="totales"
	 */
	public void setTotales(List <TotalColumna> totales) {
		this.totales = totales;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param index  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="totales"
	 */
	public TotalColumna removeTotales(int index) {
		return totales.remove(index);
	}

	public void setTotal(int index, TotalColumna totalColumna) {
		this.totales.set(index, totalColumna);
	}
	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="totales"
	 */
	public void clearTotales() {
		totales.clear();
	}

	private String titulo;
	private String agrupacionAnterior;
	private String agrupacionActual;
	private boolean activada;
	private boolean clearRotura;
	private boolean pintaUnderline;
	private int posInicial;
	private boolean saltPagina;
	private boolean automatica;
	private boolean siempreVisible;
	private ReportData descRotura;
	private boolean dejarLineaBlanca;
	private int iniColDescExcel;
	private int finColDescExcel;
	public boolean resetNumPage;

	private int var_listado;
    public void setVarListado (int i) {
    	var_listado =i;
	}
	public int getVarListado () {
		return var_listado;
	}

	public boolean isResetNumPage() {
		return resetNumPage;
	}
	public void setResetNumPage(boolean resetNumPage) {
		this.resetNumPage = resetNumPage;
	}
	public int getIniColDescExcel() {
		return iniColDescExcel;
	}
	public void setIniColDescExcel(int iniColDescExcel) {
		this.iniColDescExcel = iniColDescExcel;
	}
	public int getFinColDescExcel() {
		return finColDescExcel;
	}
	public void setFinColDescExcel(int finColDescExcel) {
		this.finColDescExcel = finColDescExcel;
	}
	public void setDescRotura(String s) {
		descRotura.setValue(s);
	}
	public void setDescRotura(int i) {
		descRotura.setValue(i);
	}
	public void setDescRotura(double d) {
		descRotura.setValue(d);
	}
	public void setDescRotura(java.util.Date d) {
		descRotura.setValue(d);
	}
	public ReportData getDescRotura() {
		return descRotura;
	}
	public ReportData initDesc(Report r) {
		descRotura = new ReportData(r);
		descRotura.setNull();
		return descRotura;
	}
	public void setDejarLineaBlanca (boolean b) {
		dejarLineaBlanca = b;
	}

	public boolean getDejarLineaBlanca () {
		return dejarLineaBlanca;
	}
	public void setAutomatica (boolean b) {
		automatica = b;
	}

	public boolean getAutomatica () {
		return automatica;
	}
	public void setSiempreVisible (boolean b) {
		siempreVisible = b;
	}

	public boolean getSiempreVisible () {
		return siempreVisible;
	}

	public void setSaltPagina (boolean b) {
		saltPagina = b;
	}

	public boolean getSaltPagina () {
		return saltPagina;
	}
	public void setPosInicial (int i) {
		posInicial =i;
	}
	public int getPosInicial () {
		return posInicial;
	}

	public boolean getPintaUnderline () {
		return pintaUnderline;
	}
	public void setPintaUnderline (boolean b) {
		pintaUnderline = b;
	}

	public void setClearRotura (boolean b) {
		clearRotura = b;
	}
	public boolean getClearRotura () {
		return clearRotura;
	}
	public void clearRotura() {
		setClearRotura(true);
        setActivada(false);
        setAgrupacionAnterior(getAgrupacionActual());
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAgrupacionAnterior() {
		return agrupacionAnterior;
	}

	public void setAgrupacionAnterior(String agrupacion) {
		this.agrupacionAnterior = agrupacion;
	}
	public String getAgrupacionActual() {
		return agrupacionActual;
	}
	public void setAgrupacionActual(String agrupacion) {
		this.agrupacionActual = agrupacion;
	}

	public boolean checkRotura() {
		if (agrupacionActual != null && !agrupacionActual.equals(agrupacionAnterior)) {
			setActivada(true);
		} else {
			setActivada(false);
		}
		return isActivada();
	}

	public boolean isActivada() {
		return activada;
	}

	public void setActivada(boolean activada) {
		this.activada = activada;
	}

	public void initTotales() {
		for (int i=0;i<totalesSize();i++) {
			getTotal(i).init();
		}
	}
	public boolean isBlank() {
		if (getSiempreVisible()) return false;
		boolean buida = true;
		for (int i=0;(i<totalesSize());i++) {
			if (buida) buida = (getTotal(i).getValor()==0);
		}
		return buida;
	}

	public void acumulaTotales() {
		for (int i=0;i<totalesSize();i++) {
			if (getClearRotura()) {
				getTotal(i).init();
			}
			getTotal(i).acumulaColumna();
		}
		if (getClearRotura()) setClearRotura(false);
	}


}
