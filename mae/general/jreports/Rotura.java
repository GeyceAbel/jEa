package mae.general.jreports;

import java.util.List;

public class Rotura {
	private int anchura;
	private int sizeFont;
	private String nombre;
	private String agruparPor;
	private boolean negreta;
	private boolean italic;
	private boolean aligDerecha;
	private JListado jl;
	private String sum;
	private boolean saltoPagina;
	private String colorFons;
	private String colorFont;
	private boolean asignarColorFondo;

	private String groupHeaderName;
	private String titul;
	private int posIniciTitul = 0;
	private int widthTitul;
	private String printWhen;
	// private boolean esVar;
	// private boolean esCampo;
	// private boolean esExpr;
	private boolean printGroupHeader = false;
	// java.util.List<Integer> columnes;
	java.util.List<Totalizar> totales;
	// private String expression;
	private String backGroundHeaderColor = "#D3DFE2";
	// private String backGroundHeaderColor = "#CAC3A2";
	private int headerHeight;
	private boolean igualIndent;
	private boolean textoRoturaEsExpresion;
	private String expresionVariables;
	private boolean noImprimirSiTotalesEsCero = false;
	private boolean sinRectangulo;
	private int posX = 0;
	private int posY = 0;
	private List<Integer> columnasTotalesActivas;

	/*
	 * public Rotura (JListado jl, java.util.List<Integer> columnes, String nombre,
	 * String agruparPor,String titol) { anchura = 15; negreta = true; this.nombre =
	 * nombre; this.agruparPor = agruparPor; this.columnes = columnes; this.jl = jl;
	 * sizeFont = jl.sizeDetalle+1; aligDerecha = true; sum = "Sum"; saltoPagina =
	 * false; printWhen = this.jl.getPrintWhenDetalle(); asignarColorFondo = false;
	 * colorFont = "#000000"; this.titul = titol; headerHeight = 15; //setEsCampo();
	 * }
	 */
	public Rotura(JListado jl, java.util.List<Totalizar> totales, String nombre, String agruparPor, String titol) {
		anchura = 15;
		negreta = true;
		italic = false;
		this.nombre = nombre;
		this.agruparPor = agruparPor;
		this.totales = totales;
		this.jl = jl;
		sizeFont = jl.sizeDetalle + 1;
		aligDerecha = true;
		sum = "Sum";
		saltoPagina = false;
		printWhen = this.jl.getPrintWhenDetalle();
		asignarColorFondo = false;
		// colorFont = "#000000";
		colorFont = "#0e4b80";
		this.titul = titol;
		headerHeight = 15;
		igualIndent = false;
		textoRoturaEsExpresion = false;
		expresionVariables = null;
		noImprimirSiTotalesEsCero = false;
		sinRectangulo = false;
		posX = 0;
		posY = 0;
		// setEsCampo();
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public boolean isSinRectangulo() {
		return sinRectangulo;
	}

	public void setSinRectangulo(boolean sinRectangulo) {
		this.sinRectangulo = sinRectangulo;
	}

	public boolean isTextoRoturaEsExpresion() {
		return textoRoturaEsExpresion;
	}

	public void setTextoRoturaEsExpresion(boolean textoRoturaEsExpresion) {
		this.textoRoturaEsExpresion = textoRoturaEsExpresion;
	}

	public boolean isIgualIndent() {
		return igualIndent;
	}

	public void setIgualIndent(boolean igualIndent) {
		this.igualIndent = igualIndent;
	}

	public String getPrintWhen() {
		return printWhen;
	}

	public void setPrintWhen(String printWhen) {
		this.printWhen = printWhen;
	}

	public void setTitul(String titul, int posIniciTitul, int widthTitul) {
		this.titul = titul;
		this.posIniciTitul = posIniciTitul;
		this.widthTitul = widthTitul;
	}

	public void setGroupHeaderName(String groupHeaderName) {
		printGroupHeader = true;
		this.groupHeaderName = groupHeaderName;
	}

	public String getGroupHeaderName() {
		return groupHeaderName;
	}

	public boolean isPrintGroupHeader() {
		return printGroupHeader;
	}

	public boolean isSaltoPagina() {
		return saltoPagina;
	}

	public void setSaltoPagina(boolean saltoPagina) {
		this.saltoPagina = saltoPagina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAgruparPor() {
		return agruparPor;
	}

	public void setAgruparPor(String agruparPor) {
		this.agruparPor = agruparPor;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public int getSizeFont() {
		return sizeFont;
	}

	public void setSizeFont(int sizeFont) {
		this.sizeFont = sizeFont;
	}

	public boolean isNegreta() {
		return negreta;
	}

	public void setNegreta(boolean negreta) {
		this.negreta = negreta;
	}

	public boolean isItalic() {
		return italic;
	}

	public void setItalic(boolean italic) {
		this.italic = italic;
	}

	public boolean isAligDerecha() {
		return aligDerecha;
	}

	public void setAligDerecha(boolean aligDerecha) {
		this.aligDerecha = aligDerecha;
	}

	/*
	 * public java.util.List<Integer> getColumnes() { return columnes; }
	 * 
	 * public void setColumnes(java.util.List<Integer> columnes) { this.columnes =
	 * columnes; }
	 */
	public java.util.List<Totalizar> getTotales() {
		return totales;
	}

	public void setTotalizar(java.util.List<Totalizar> totales) {
		this.totales = totales;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getTitul() {
		return titul;
	}

	public int getPosIniciTitul() {
		return posIniciTitul;
	}

	public int getWidthTitul() {
		return widthTitul;
	}

	public String getColorFons() {
		return colorFons;
	}

	public void setColorFons(String colorFons) {
		asignarColorFondo = true;
		this.colorFons = colorFons;
	}

	public String getColorFont() {
		return colorFont;
	}

	public void setColorFont(String colorFont) {
		this.colorFont = colorFont;
	}

	public boolean isAsignarColorFondo() {
		return asignarColorFondo;
	}

	public void setAsignarColorFondo(boolean asignarColorFondo) {
		this.asignarColorFondo = asignarColorFondo;
	}

	public void setBackGroundHeaderColor(String color) {
		this.backGroundHeaderColor = color;
	}

	public String getBackGroundHeaderColor() {
		return backGroundHeaderColor;
	}

	public void setHeaderHeight(int height) {
		this.headerHeight = height;
	}

	public int getHeaderHeight() {
		return headerHeight;
	}

	public String getExpresionVariables() {
		return expresionVariables;
	}

	public void setExpresionVariables(String expresionVariables) {
		this.expresionVariables = expresionVariables;
	}

	public boolean isNoImprimirSiTotalesEsCero() {
		return noImprimirSiTotalesEsCero;
	}

	public void setNoImprimirSiTotalesEsCero(boolean noImprimirSiTotalesEsCero) {
		this.noImprimirSiTotalesEsCero = noImprimirSiTotalesEsCero;
	}

	public List<Integer> getColumnasTotalesActivas() {
		return columnasTotalesActivas;
	}

	public void setColumnasTotalesActivas(List<Integer> columnasTotalesActivas) {
		this.columnasTotalesActivas = columnasTotalesActivas;
	}

	/*
	 * public boolean isEsVar() { return esVar; }
	 * 
	 * public void setEsVar() { this.esVar = true; esExpr = false; esCampo = false;
	 * }
	 * 
	 * public boolean isEsCampo() { return esCampo; }
	 * 
	 * public void setEsCampo() { this.esCampo = true; esVar = false; esExpr =
	 * false; }
	 * 
	 * public boolean isEsExpr() { return esExpr; }
	 * 
	 * public void setEsExpr() { this.esExpr = true; esVar = false; esCampo = false;
	 * }
	 * 
	 */

}
