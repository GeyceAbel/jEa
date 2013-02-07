package mae.general.jreports;

public class Columna {
	public static final int ENTERO = 1;
	public static final int STRING = 2;
	public static final int DATA = 3;
	public static final int DOUBLE = 4;
	
	private StaticText st;
	private TextField tf;
	private JListado jl;
	private int tipo;
	private int tamany;
	private int tamanyAsignatLlistat;
	private int posIni;
	
	public Columna (JListado jlis, String literal, String campoSelect, int tipo, int tamany) {		
		this.jl = jlis;
		this.tipo = tipo;
		this.tamany = tamany;
		addStaticText(literal);
		addTextField(campoSelect, tipo);
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
		st = new StaticText (jl);
		st.setAmplada(jl.getEspacioDetalle()+2);
		st.setAsignarColorFondo(false);
		st.setColorFont("#000000");
		st.setLiteral(literal);
		st.setNegreta(true);
		st.setPosInicial(0);
		st.setY(jl.sizeDetalle +1);
		st.setVerticalAlig("Bottom");
		st.setSizeFont(jl.sizeDetalle +1);
		return st;
	}
	
	public TextField addTextField (String campoSelect, int tipo) {
		tf = new TextField (jl);
		tf.setAmplada(jl.getEspacioDetalle());
		tf.setAsignarColorFondo(false);
		tf.setColorFont("#000000");
		tf.setCampoSelect(campoSelect);
		tf.setNegreta(false);
		tf.setPosIni(0);
		tf.setSizeFont(8);
		tf.setY(0);
		tf.setAligDerecha(false);
		tf.setPattern(null);		
		if (tipo == ENTERO) {
			tf.setPattern("0");
			tf.setAligDerecha(true);
		}
		else if (tipo == DATA) {
			tf.setPattern("dd/MM/yyyy");
			tf.setAligDerecha(false);
		}
		else if (tipo == DOUBLE) {
			tf.setPattern("#,##0.00;-#,##0.00");
			tf.setAligDerecha(true);
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
}
