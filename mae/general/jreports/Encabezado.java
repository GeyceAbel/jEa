package mae.general.jreports;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRExpressionChunk;
import net.sf.jasperreports.engine.design.JRDesignFrame;

public class Encabezado {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StaticText st;
	private JListado jl;
	private TextField tf;
	private String bgColor="#006699";
	private List<Object> componentes;
	private String colorFont = "#FFFFFF";
	private int amplada;
	private int width;	
	private int sizeFont =10;
	private int tipo;
	private int posIni;

	public Encabezado(JListado jl,String literal, String campoSelect, int tipo) {
		this.jl = jl;
		addStaticText(literal);
		addTextField(campoSelect, tipo);
	}
/*
	public Encabezado(JListado jl,String literal) {		
		this.jl = jl;
		addStaticText(literal);
	}
	*/
	public Encabezado(JListado jl) {	
	  componentes = new ArrayList<Object>();
	  this.jl = jl;	
	  amplada = 15;
	  //width = jl.getColumnWidth();
	  width = jl.getRightWidthPosicion();
	  posIni = (0-jl.getMargenizq());
	}
	
	public void setBgColor(String color) {
		this.bgColor = color;
	}
	
	public String getBgColor() {
		return bgColor;
	}
	
	public void setAmplada(int amplada) {
		this.amplada = amplada;
	}
	
	public int getAmplada() {
		return amplada;
	}
	
	public void addNewStaticText(String literal) {
	  componentes.add(addStaticText(literal));
	}
	
	public void addNewTextField(String campoSelect,int tipo, String nomVariable) {
	  this.tipo = tipo;
	  if(nomVariable != null)
	    componentes.add(addTextField(campoSelect, tipo, nomVariable));
	  else
		componentes.add(addTextField(campoSelect, tipo));
	}
	
	public List<Object> getComponentes() {
		return componentes;
	}
	/*
	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}
    */
	private StaticText addStaticText (String literal) {
		st = new StaticText (jl,0,0,width,amplada);
		//st.setAmplada(amplada);
		st.setAsignarColorFondo(false);
		st.setColorFont(colorFont);
		st.setLiteral(literal);
		st.setNegreta(true);
		//st.setPosInicial(2 * (jl.getMargenizq()));
		tf.setLeftIndent(jl.getMargenizq() + 10);
		st.setSizeFont(sizeFont);
		st.setAligLeft();
		//st.setWidth(width);
		return st;
	}

	public TextField addTextField (String expression, int tipo,String nomVariable) {
		tf = new TextField (jl,0,0,width ,amplada);
		//tf.setAmplada(jl.getEspacioDetalle());
		tf.setAsignarColorFondo(false);
		tf.setColorFont(colorFont);
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
		tf.setLeftIndent(jl.getMargenizq() + 10);
		if (tipo == Columna.INTEGER) {
			tf.setPattern("0");
			tf.setAligDerecha(true);
			tf.setRightIndent(2);
		}
		else if (tipo == Columna.DATE) {
			tf.setPattern("dd/MM/yyyy");
			//tf.setAligDerecha(false);
		}
		else if (tipo == Columna.DOUBLE) {
			tf.setPattern("#,##0.00;-#,##0.00");
			tf.setAligDerecha(true);
			tf.setRightIndent(2);
		}
		return tf;
	}
	
	private TextField addTextField (String expression, int tipo) {
		tf = new TextField (jl,0,0,width,amplada);
		//tf.setAmplada(amplada);
		tf.setAsignarColorFondo(false);
		tf.setColorFont("#000000");
		tf.setExpression(expression);
		//tf.setCampoSelect(expression);
		tf.setNegreta(false);
		//tf.setPosIni(5 * (jl.getMargenizq())  );
		tf.setLeftIndent(jl.getMargenizq() + 10);
		tf.setSizeFont(sizeFont);
		tf.setAligDerecha(false);
		tf.setPattern(null);
		//tf.setWidth(width);
		if (tipo == Columna.INTEGER) {
			tf.setPattern("0");
			tf.setAligDerecha(true);
			tf.setRightIndent(2);
		}
		else if (tipo == Columna.DATE) {
			tf.setPattern("dd/MM/yyyy");
			tf.setAligDerecha(false);
		}
		else if (tipo == Columna.DOUBLE) {
			tf.setPattern("#,##0.00;-#,##0.00");
			tf.setAligDerecha(true);
			tf.setRightIndent(2);
		}
		return tf;
	}
	
	public void autoWidth() {
		if (st!=null && st.getWidth()==0) st.setWidth(jl.getColumnWidth() - 2*st.getPosInicial());
		if (tf!=null && tf.getWidth()==0) {
			tf.setWidth(jl.getColumnWidth() - 2*tf.getPosIni());
		}
	}
	public void setSizeFont(int sizeFont) {
	  this.sizeFont = sizeFont;	 
	}
	
	

	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setColorFont(String colorFont) {
	  this.colorFont = colorFont;
	}
	public int getPosIniEnc() {
		return posIni;
	}
	
	public void setPosIni(int posIni) {
		this.posIni = posIni;
	}

}
