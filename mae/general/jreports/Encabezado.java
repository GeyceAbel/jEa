package mae.general.jreports;

public class Encabezado {
	private StaticText st;
	private JListado jl;
	private TextField tf;

	public Encabezado(JListado jl,String literal, String campoSelect, int tipo) {		
		this.jl = jl;
		addStaticText(literal);
		addTextField(campoSelect, tipo);
	}

	public Encabezado(JListado jl,String literal) {		
		this.jl = jl;
		addStaticText(literal);
	}
	
	
	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}

	public StaticText addStaticText (String literal) {
		st = new StaticText (jl);
		st.setAmplada(13);
		st.setAsignarColorFondo(false);
		st.setColorFont("#000000");
		st.setLiteral(literal);
		st.setNegreta(true);
		st.setPosInicial(2 * (jl.getMargenizq()));
		st.setSizeFont(jl.sizeEncabezado);
		st.setAligLeft();
		return st;
	}

	public TextField addTextField (String campoSelect, int tipo) {
		tf = new TextField (jl);
		tf.setAmplada(13);
		tf.setAsignarColorFondo(false);
		tf.setColorFont("#000000");
		tf.setCampoSelect(campoSelect);
		tf.setNegreta(false);
		tf.setPosIni(5 * (jl.getMargenizq())  );
		tf.setSizeFont(jl.sizeEncabezado);
		tf.setAligDerecha(false);
		tf.setPattern(null);
		if (tipo == Columna.ENTERO) {
			tf.setPattern("0");
			tf.setAligDerecha(true);
		}
		else if (tipo == Columna.DATA) {
			tf.setPattern("dd/MM/yyyy");
			tf.setAligDerecha(false);
		}
		else if (tipo == Columna.DOUBLE) {
			tf.setPattern("#,##0.00;-#,##0.00");
			tf.setAligDerecha(true);
		}
		return tf;
	}
	
	public void autoWidth() {
		if (st!=null && st.getWidth()==0) st.setWidth(jl.getColumnWidth() - 2*st.getPosInicial());
		if (tf!=null && tf.getWidth()==0) {
			tf.setWidth(jl.getColumnWidth() - 2*tf.getPosIni());
		}
	}

	public StaticText getSt() {
		return st;
	}

	public void setSt(StaticText st) {
		this.st = st;
	}
}
