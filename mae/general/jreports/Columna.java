package mae.general.jreports;

public class Columna {
	/*
	public static final int ENTERO = 1;
	public static final int STRING = 2;
	public static final int DATA = 3;
	public static final int DOUBLE = 4;
	*/
	/*
	public static final int INTEGER = 1;
	public static final int STRING = 2;
	public static final int DATE = 3;
	public static final int DOUBLE = 4;
	*/

	public static final int                   VOID         = 0x0;
	public static final int                   STRING       = 0x1;
	public static final int                   INTEGER      = 0x2;
	public static final int                   DOUBLE       = 0x3;
	public static final int                   DATE         = 0x4;
	public static final int                   IMAGE        = 0x5;
	public static final int                   BOOLEAN      = 0x6;
	public static final int                   BYTEARRAY    = 0x7;
	
	private StaticText st;
	private TextField tf;
	private JListado jl;
	private int tipo;
	private int tamany;
	private int tamanyAsignatLlistat;
	private int posIni;
	private String idCol;
	
	public Columna (JListado jlis, String literal,String expression,String nomVariable, int tipo, int tamany,int posIni) {		
		this.jl = jlis;
		this.tipo = tipo;
		this.tamany = tamany;
		this.posIni=posIni;
		addStaticText(literal);
		if(nomVariable != null){
		  addTextField(expression, tipo,nomVariable);
		  this.idCol =nomVariable; 
		}
		else {
		  addTextField(expression, tipo);
		  this.idCol = expression; 
		}
	}
	
	public int getPosIni() {
		return posIni;
	}

	public void setPosIni(int posIni) {
		this.posIni = posIni;
		st.setPosInicial(posIni);
		tf.setPosIni(posIni);
	}

	public int getTamanyAsignatLlistat() {
		return tamanyAsignatLlistat;
	}

	public void setTamanyAsignatLlistat(int tamanyAsignatLlistat) {
		this.tamanyAsignatLlistat = tamanyAsignatLlistat;
		st.setWidth(tamanyAsignatLlistat);
		tf.setWidth(tamanyAsignatLlistat);
	}

	public int getTipo() {
		return tipo;
	}

	public int getTamany() {
		return tamany;
	}

	public void setTamany(int tamany) {
		this.tamany = tamany;
	}

	public StaticText addStaticText (String literal) {
		//st = new StaticText (jl,posIni,0,tamanyAsignatLlistat,jl.getEspacioDetalle());
		st = new StaticText (jl,posIni,0,tamany,jl.getEspacioDetalle());
		//st.setAmplada(jl.getEspacioDetalle()+2);
		st.setAsignarColorFondo(false);
		st.setColorFont("#000000");
		st.setLiteral(literal);
		st.setNegreta(true);
		//st.setPosInicial(0);
		//st.setY(jl.sizeDetalle +1);
		st.setVerticalAlig("Bottom");
		st.setSizeFont(jl.sizeDetalle +1);
		st.setAligCenter();
		return st;
	}
	
	public TextField addTextField (String expression, int tipo,String nomVariable) {
		tf = new TextField (jl,posIni,0,tamany ,jl.getEspacioDetalle());
		//tf.setAmplada(jl.getEspacioDetalle());
		tf.setAsignarColorFondo(false);
		tf.setColorFont("#000000");
		//tf.setCampoSelect(expression);
		//tf.setExpression(expression);
		Variable v = new Variable(nomVariable,expression);
		tf.setVariable(v);
		tf.setNegreta(false);
		//tf.setPosIni(0);
		tf.setSizeFont(8);
		//tf.setY(0);
		tf.setAligDerecha(false);
		tf.setPattern(null);	
		tf.setLeftIndent(5);
		if (tipo == INTEGER) {
			tf.setPattern("0");
			tf.setAligDerecha(true);
			tf.setRightIndent(5);
			tf.setLeftIndent(0);
		}
		else if (tipo == DATE) {
			tf.setPattern("dd/MM/yyyy");
			tf.setAligDerecha(false);
		}
		else if (tipo == DOUBLE) {
			tf.setPattern("#,##0.00;-#,##0.00");
			tf.setAligDerecha(true);
			tf.setRightIndent(5);
			tf.setLeftIndent(0);
		}
		return tf;
	}
	
	public TextField addTextField (String expression, int tipo) {
		tf = new TextField (jl,posIni,0,tamany ,jl.getEspacioDetalle());
		//tf.setAmplada(jl.getEspacioDetalle());
		tf.setAsignarColorFondo(false);
		tf.setColorFont("#000000");
		//tf.setCampoSelect(expression);
		tf.setExpression(expression);
		tf.setNegreta(false);
		//tf.setPosIni(0);
		tf.setSizeFont(8);
		//tf.setY(0);
		tf.setAligDerecha(false);
		tf.setLeftIndent(5);
		tf.setPattern(null);		
		if (tipo == INTEGER) {
			tf.setPattern("0");
			tf.setAligDerecha(true);
			tf.setRightIndent(5);
			tf.setLeftIndent(0);
		}
		else if (tipo == DATE) {
			tf.setPattern("dd/MM/yyyy");
			tf.setAligDerecha(false);			
		}
		else if (tipo == DOUBLE) {
			tf.setPattern("#,##0.00;-#,##0.00");
			tf.setAligDerecha(true);
			tf.setRightIndent(5);
			tf.setLeftIndent(0);
		}
		return tf;
	}

	public StaticText getSt() {
		return st;
	}

	public void setSt(StaticText st) {
		this.st = st;
	}

	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}
	
	public String getIdColumn() {
		return idCol;
	}
}
