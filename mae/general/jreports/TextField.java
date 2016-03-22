package mae.general.jreports;


public class TextField {
	private boolean negreta;
	private String colorFons;
	private String colorFont;
	private boolean asignarColorFondo;
	private int posIni;
	private String pattern;
	private boolean aligDerecha;
	private int sizeFont;
	//private String campoSelect;
	private Variable variable;
	private JListado jl;
	private int y;
	private int amplada;
	private int width;
	private String printWhen;
	private int leftIndent = 0;
	private int rightIndent = 0;
	private String expression;
	private String verticalAlig;
	private boolean printValoresRepetidos;
	private boolean esExpresionCompleta;
	private boolean isStretchWithOverflow=false;
	private boolean centered = false;

private String style = "";


	private TextField () {

	}

	public TextField (JListado jlis,int x, int y, int width, int height)  {
		this.jl = jlis;
		negreta = false;
		asignarColorFondo = false;
		colorFont = "#000000";
		//posIni = 0;
		pattern = null;
		aligDerecha = false;
		sizeFont = 8;
		//campoSelect = null;
		variable = null;
		this.posIni =x;
		this.amplada=height;
		this.y=y;
		this.width=width;
		verticalAlig = "Top";
		printValoresRepetidos = true;
		esExpresionCompleta = false;
    style = "";
		//y = 0;
		//amplada = 13;
	}
	/*
	public TextField (JListado jlis)  {
		this.jl = jlis;
		negreta = false;
		asignarColorFondo = false;
		colorFont = "#000000";
		posIni = 0;
		pattern = null;
		aligDerecha = false;
		sizeFont = 8;
		campoSelect = null;
		variable = null;
		y = 0;
		amplada = 13;
	}
	*/

	public String getPrintWhen() {
		return printWhen;
	}

	public boolean isEsExpresionCompleta() {
		return esExpresionCompleta;
	}

	public void setEsExpresionCompleta(boolean esExpresionCompleta) {
		this.esExpresionCompleta = esExpresionCompleta;
	}

	public boolean isPrintValoresRepetidos() {
		return printValoresRepetidos;
	}

	public void setPrintValoresRepetidos(boolean printValoresRepetidos) {
		this.printValoresRepetidos = printValoresRepetidos;
	}

	public void setPrintWhen(String printWhen) {
		this.printWhen = printWhen;
	}

  public void setStyle (String style) {
    this.style = style;
  }
  public String getStyle() {
    return style;
  }
	public boolean esVariable () {
		return variable != null;
	}
	/*
	public boolean esCampoSelect () {
		return campoSelect != null;
	}
	*/

	public boolean isExpression() {
		return expression !=null;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
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
	public int getPosIni() {
		return posIni;
	}
	public void setPosIni(int posIni) {
		this.posIni = posIni;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public boolean isAligDerecha() {
		return aligDerecha;
	}
	public void setAligDerecha(boolean aligDerecha) {
		this.aligDerecha = aligDerecha;
	}
	/*
	public String getCampoSelect() {
		return campoSelect;
	}

	public void setCampoSelect(String campoSelect) {
		this.campoSelect = campoSelect;
		variable = null;
	}
	*/
	
	public boolean isCentered() {		
		return centered;
	}

	public void setCentered(boolean centered) {
		if(centered) aligDerecha = centered;
		this.centered = centered;
	}
		
	public void setVariable(Variable v) {
		expression = null;
		this.variable = v;
	}

	public Variable getVariable() {
		return variable;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAmplada() {
		return amplada;
	}
	public void setAmplada(int amplada) {
		this.amplada = amplada;
	}

	public int getLeftIndent() {
		return leftIndent;
	}
	public int getRightIndent() {
		return rightIndent;		
	}
	public void setLeftIndent(int leftIndent) {
	  this.leftIndent = leftIndent;
	}
	public void setRightIndent(int rightIndent) {
	  this.rightIndent = rightIndent;
	}
	
	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	public String getExpression() {
		return expression;
	}
	
	public String getVerticalAlig() {
		return verticalAlig;
	}

	public void setVerticalAlig(String verticalAlig) {
		this.verticalAlig = verticalAlig;
	}
	
	public void setStretchWithOverflow(boolean isStretchWithOverflow) {
		this.isStretchWithOverflow= isStretchWithOverflow; 
	}
	
	public boolean isStretchWithOverflow() {
		return isStretchWithOverflow; 
	}
	public TextField getCopia() {
		TextField tftmp = new TextField ();
		tftmp.negreta = negreta;
		tftmp.colorFons = colorFons;
		tftmp.colorFont = colorFont;
		tftmp.asignarColorFondo = asignarColorFondo;
		tftmp.posIni = posIni;
		tftmp.pattern = pattern;
		tftmp.aligDerecha = aligDerecha;
		tftmp.sizeFont = sizeFont;
		tftmp.variable = variable;
		tftmp.jl = jl;
		tftmp.y = y;
		tftmp.amplada = amplada;
		tftmp.width = width;
		tftmp.printWhen = printWhen;
		tftmp.leftIndent = leftIndent;
		tftmp.rightIndent = rightIndent;
		tftmp.expression = expression;
		tftmp.verticalAlig = verticalAlig;
		tftmp.printValoresRepetidos = printValoresRepetidos;
		tftmp.esExpresionCompleta = esExpresionCompleta;
		tftmp.isStretchWithOverflow = isStretchWithOverflow;
		return tftmp;
	}
}
