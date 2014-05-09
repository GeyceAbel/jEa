package mae.general.jreports;

public class StaticText {
	private String colorFons;
	private String colorFont;
	private boolean asignarColorFondo;
	private int posInicial;
	private boolean negreta;
	private String literal;
	private JListado jl;
	private int y;
	private int amplada;
	private int width;
	private boolean aligLeft;
	private boolean aligRight;
	private boolean aligCenter;
	private int sizeFont;
	private String verticalAlig;
	private int leftIndent =0;
	private int rightIndent=0;
	private boolean underline;
	private StaticText () {
		
	}
	
	public StaticText (JListado jlis, int x, int y, int width, int height) {
		this.jl = jlis;
		posInicial = 0;
		negreta = true;
		literal = "";
		this.posInicial=x;
		this.y=y;
		this.width= width;
		this.amplada =height;
		asignarColorFondo = false;
		colorFont = "#000000";
		verticalAlig = "Top";
		setAligLeft();
		underline = false;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
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
	
	public String getColorFons() {
		return colorFons;
	}
	public String getColorFont() {
		return colorFont;
	}
	public void setColorFons(String col) {
		asignarColorFondo = true;
		this.colorFons = col;
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
	public int getPosInicial() {
		return posInicial;
	}
	public void setPosInicial(int posInicial) {
		this.posInicial = posInicial;
	}
	public boolean isNegreta() {
		return negreta;
	}
	public void setNegreta(boolean negreta) {
		this.negreta = negreta;
	}
	public String getLiteral() {
		return literal;
	}
	public void setLiteral(String literal) {
		this.literal = literal;
	}

	public boolean isAligLeft() {
		return aligLeft;
	}

	public void setAligLeft() {
		this.aligLeft = true;
		aligCenter = false;
		aligRight = false;
	}

	public boolean isAligRight() {
		return aligRight;
	}

	public void setAligRight() {
		this.aligRight = true;
		aligLeft = false;
		aligCenter = false;
	}

	public boolean isAligCenter() {
		return aligCenter;
	}

	public void setAligCenter() {
		this.aligCenter = true;
		aligLeft = false;
		aligRight = false;		
	}

	public int getSizeFont() {
		return sizeFont;
	}

	public void setSizeFont(int sizeFont) {
		this.sizeFont = sizeFont;
	}

	public String getVerticalAlig() {
		return verticalAlig;
	}

	public void setVerticalAlig(String verticalAlig) {
		this.verticalAlig = verticalAlig;
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
	
	public StaticText getCopia() {
		StaticText sttmp = new StaticText ();
		sttmp.colorFons = colorFons;
		sttmp.colorFont = colorFont;
		sttmp.asignarColorFondo = asignarColorFondo;
		sttmp.posInicial = posInicial;
		sttmp.negreta = negreta;
		sttmp.literal = literal;
		sttmp.jl = jl;
		sttmp.amplada = amplada;
		sttmp.y = y;
		sttmp.width = width;
		sttmp.aligLeft = aligLeft;
		sttmp.aligRight = aligRight;
		sttmp.aligCenter = aligCenter;
		sttmp.sizeFont = sizeFont;
		sttmp.verticalAlig = verticalAlig;
		sttmp.leftIndent = leftIndent;
		sttmp.rightIndent = rightIndent;
		return sttmp;
	}

	public void setUnderline(boolean under) {
		underline = under;		
	}

	public boolean isUnderLine() {
		return underline;
	}
	
	
}
