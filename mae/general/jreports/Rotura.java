package mae.general.jreports;

public class Rotura {
	private int anchura;
	private int sizeFont;
	private String nombre;
	private String agruparPor;
	private boolean negreta;
	private boolean aligDerecha;
	private JListado jl;
	private String sum;
	private boolean saltoPagina;
	private String colorFons;
	private String colorFont;
	private boolean asignarColorFondo;
	
	private String titul;
	private int posIniciTitul;
	private int widthTitul;
	private String printWhen;
	private boolean esVar;
	private boolean esCampo;
	private boolean esExpr;
	int [] columnes;
	
	public Rotura (JListado jl, int [] columnes, String nombre, String agruparPor) {
		anchura = 15;
		negreta = true;
		this.nombre = nombre;
		this.agruparPor = agruparPor;
		this.columnes = columnes;
		this.jl = jl;
		sizeFont = jl.sizeDetalle+1;
		aligDerecha = true;
		sum = "Sum";
		saltoPagina = false;
		printWhen = this.jl.getPrintWhenDetalle();
		asignarColorFondo = false;
		colorFont = "#000000";
		setEsCampo();
	}

	public String getPrintWhen() {
		return printWhen;
	}

	public void setPrintWhen(String printWhen) {
		this.printWhen = printWhen;
	}

	public void setTitul (String titul, int posIniciTitul, int widthTitul) {
		this.titul = titul;
		this.posIniciTitul = posIniciTitul;
		this.widthTitul = widthTitul;
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

	public boolean isAligDerecha() {
		return aligDerecha;
	}

	public void setAligDerecha(boolean aligDerecha) {
		this.aligDerecha = aligDerecha;
	}

	public int[] getColumnes() {
		return columnes;
	}

	public void setColumnes(int[] columnes) {
		this.columnes = columnes;
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
		asignarColorFondo =true;
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

	public boolean isEsVar() {
		return esVar;
	}

	public void setEsVar() {
		this.esVar = true;
		esExpr = false;
		esCampo = false;
	}

	public boolean isEsCampo() {
		return esCampo;
	}

	public void setEsCampo() {
		this.esCampo = true;
		esVar = false;
		esExpr = false;
	}

	public boolean isEsExpr() {
		return esExpr;
	}

	public void setEsExpr() {
		this.esExpr = true;
		esVar = false;
		esCampo = false;
	}

}
