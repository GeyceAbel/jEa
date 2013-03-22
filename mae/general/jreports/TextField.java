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
	
	public void setPrintWhen(String printWhen) {
		this.printWhen = printWhen;
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
	
}
