package mae.general.jreports;

import geyce.maefc.Field;
import geyce.maefc.FieldDef;
import geyce.maefc.Select;
import groovy.swing.factory.VGlueFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import mae.general.jreports.Totalizar.Calculation;
import mae.modasp.general.Modasp.Amortizacion;


public class JListado {
	
	public enum Orientacion { VERTICAL, HORIZONTAL} ;
	
	private String sql;
	private Select slistado;
	private int margensup;
	private int margeninf;
	private int margenizq;
	private int margender;
	private int pagewidth;
	private int pageheight;
	private int columnWidth;	
	
	private List <Encabezado> encabezados;
	private List <Columna> columnas;
	private List <Rotura> roturas;
	private List <Totalizar> totales;
	
	public String rutaFicheroJRXML;
	public int posActualColumnHeader =0;
	private String sError;
	private StaticText stTitulo;
	public int sizeDetalle;
	public int sizeTitulo;
	public int sizeEncabezado;
	private String printWhenDetalle;
	private int espacioEntreColumnas;
	private int espacioDetalle;
	private Vector<String> grupos;
	private String fechaListado;
	private String colorLineas;
	private String colorPeuPagina;
	private HashMap<String, Object> parametros;
	public boolean sinDataSource;
	private Orientacion orientacionPapel;
	private int rightWidthPosicion;
	private boolean autoFillColumns;
	private boolean viewTotalesFinales = true;
	private int minHeightToStartNewPage;
	private int titleHeight;
	
	public JListado (Select slistado, Orientacion or) {
		rutaFicheroJRXML = null;
		orientacionPapel = or;
		this.slistado = slistado;
		sql = slistado.getSQL();
		encabezados = new ArrayList <Encabezado>();
		columnas = new ArrayList <Columna>();
		roturas = new ArrayList <Rotura>();
		totales = new ArrayList<Totalizar>();
		sizeDetalle = 8;
		sizeEncabezado = 10;
		sizeTitulo = 18;
		espacioEntreColumnas = 4;
		espacioDetalle = 11;
		colorLineas = "#000000";
		colorPeuPagina = "#000000";
		minHeightToStartNewPage = 40;
		grupos = new Vector<String>();
		sinDataSource = false;
		parametros = new HashMap<String, Object>();
		titleHeight = 40;
		setPapel();
	}
	
	private void setPapel() {
		if(orientacionPapel == Orientacion.HORIZONTAL) {
			margensup = 20;
			margeninf = 20;
			margenizq = 20;
			margender = 20;	
			pagewidth = 842;
			pageheight = 595;
		}
		else {
			margensup = 30;
			margeninf = 20;
			margenizq = 30;
			margender = 20;	
			pagewidth = 595;
			pageheight = 842;
		}
		columnWidth = (pagewidth-margender-margenizq);
		rightWidthPosicion = pagewidth - margender;
	}
	
	public JListado (String rutaJRXML) {
		this.rutaFicheroJRXML= rutaJRXML; 
		parametros = new HashMap<String, Object>();
		sinDataSource = false;
	}

	public void addParameter (String clau, String valor) {
		parametros.put(clau, valor);
	}
	
	public  HashMap<String, Object> getParameters () {
		return parametros;
	}
	
	public Encabezado addEncabezado() {
		Encabezado enc = new Encabezado(this);
		encabezados.add(enc);
		return enc;
	}
	
	public Columna addColumna(String literal,int posInicial, int tamany, int tipo, String expression,String nomVariable) {
		int posIni;
		if(autoFillColumns) posIni = posActualColumnHeader;
		else posIni = posInicial;
		Columna col = new Columna(this, literal, expression, nomVariable,tipo, tamany,posIni);
		columnas.add(col);
		posActualColumnHeader +=tamany;
		return col;		
	}
	
	public Columna addColumna (Columna col) {
		columnas.add(col);
		return col;
	}
	
	public Columna getColumna (int index) {
		return columnas.get(index);
	}
	
	public Rotura addRotura (Rotura r) {
		roturas.add(r);
		return r;
	}
	
	public Rotura getRotura (int index) {
		return roturas.get(index);
	}
	
	public Totalizar getTotales (int index) {
		return totales.get(index);
	}
/*
	public Rotura addRotura (java.util.List<Integer> columnes, String nombre, String agruparPor,String titol) {
		Rotura r = new Rotura(this, columnes, nombre, agruparPor,titol);
		roturas.add(r);
		return r;
	}
	*/
	public Rotura addRotura (String nombre, String agruparPor,String titol) {
		Rotura r = new Rotura(this, totales, nombre, agruparPor,titol);
		roturas.add(r);
		return r;
	}
	
	/*
	public Totalizar addTotalizar (String titulo,String nombreVariable,String expresionVariable,Calculation tipoCalculo) {
		Totalizar t = new Totalizar(titulo, nombreVariable, expresionVariable,tipoCalculo);
		totales.add(t);
		return t;
	}
	*/
	
	public Totalizar addTotalizar (String titulo,Columna col,Calculation tipoCalculo) {
		Totalizar t = new Totalizar(titulo, col,tipoCalculo);
		totales.add(t);
		return t;
	}
	
	public int getColumnWidth() {
		return columnWidth;
	}

	public void setColumnWidth(int columnWidth) {
		this.columnWidth = columnWidth;
	}

	public Encabezado addEncabezado (Encabezado enc) {
		encabezados.add(enc);
		return enc;
	}

	public Encabezado getEncabezado(int index) {
		return encabezados.get(index);
	}
	
	public int getMargensup() {
		return margensup;
	}

	public int getSizeDetalle() {
		return sizeDetalle;
	}

	public void setSizeDetalle(int sizeDetalle) {
		this.sizeDetalle = sizeDetalle;
	}

	public int getSizeTitulo() {
		return sizeTitulo;
	}

	public void setSizeTitulo(int sizeTitulo) {
		this.sizeTitulo = sizeTitulo;
	}

	public int getSizeEncabezado() {
		return sizeEncabezado;
	}

	public void setSizeEncabezado(int sizeEncabezado) {
		this.sizeEncabezado = sizeEncabezado;
	}

	public void setMargensup(int margensup) {
		this.margensup = margensup;
	}

	public int getMargeninf() {
		return margeninf;
	}

	public void setMargeninf(int margeninf) {
		this.margeninf = margeninf;
	}

	public int getMargenizq() {
		return margenizq;
	}

	public void setMargenizq(int margenizq) {
		this.margenizq = margenizq;
	}

	public int getMargender() {
		return margender;
	}

	public String getPrintWhenDetalle() {
		return printWhenDetalle;
	}

	public void setPrintWhenDetalle(String printWhenDetalle) {
		this.printWhenDetalle = printWhenDetalle;
	}

	public void setMargender(int margender) {
		this.margender = margender;
	}

	public void setTituloListado (String tit) {
		//stTitulo = new StaticText(this,-20,0,columnWidth,23);
		stTitulo = new StaticText(this,(0-margenizq),0,rightWidthPosicion,titleHeight);
		//stTitulo.setPosInicial(0);
		//stTitulo.setY(0);
		//stTitulo.setWidth(columnWidth);
		stTitulo.setAligRight();
		stTitulo.setRightIndent(20);
		stTitulo.setNegreta(true);
		stTitulo.setSizeFont(sizeTitulo);
		stTitulo.setLiteral(tit);
		stTitulo.setColorFons("#006699");
		stTitulo.setColorFont("#FFFFFF");
		//stTitulo.setWidth(columnWidth);
		//stTitulo.setAmplada(23);
	}
	
	public void addGrupo (String nombre, String expression) {
		String def = "<group name=\""+nombre+"\"><groupExpression>"+expression+"</groupExpression></group>";
		grupos.addElement(def);
	}
	
	public boolean generalJRXML () {
		boolean bOk = true;
			File fjrxml = null;
			BufferedWriter pw = null;
		try {
			fjrxml = File.createTempFile("JRXML_", ".jrxml");
			//fjrxml = new File("projasper.jrxml");
			
			pw = new BufferedWriter(new OutputStreamWriter (new FileOutputStream(fjrxml),"UTF8"));			
			
			if (bOk) bOk = generarCabecera (pw);			
			if (bOk) bOk = generarSubDataSet (pw);
			if (bOk) bOk = generarQueryString (pw);
			if (bOk) bOk = generarFields (pw);
			if (bOk) bOk = generarVariablesColumnas (pw);
			if (bOk) bOk = generarVariablesRoturas (pw);	
			if (bOk) bOk = generarVariablesTotales (pw);
			//initTamanyoColumnes ();
			if(viewTotalesFinales)
			  if (bOk) bOk = generarTotalesFooter (pw);
			if (bOk) bOk = generarRoturas (pw);
			if (bOk) bOk = generarDummyHeader(pw);
			//if (bOk) bOk = generarBandBackground (pw);
			if (bOk) bOk = generarBandTitle (pw);
			if (bOk) bOk = generarPageHeader (pw);
			//if (bOk) bOk = generarColumnHeader (pw);			
			if (bOk) bOk = generarDetail (pw);
			//if (bOk) bOk = generarColumnFooter (pw);
			if (bOk) bOk = generarPageFooter (pw);	
			if (bOk) bOk = generarFinal (pw);
			if (bOk) rutaFicheroJRXML = fjrxml.getAbsolutePath();
		}
		catch (Exception e) {
			bOk = false;
			sError = "Error inesperado:"+e;
			e.printStackTrace();
		}
		finally {
			try  {
				if (pw!=null) pw.close();		
				fjrxml = null;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bOk;
	}
	
	private boolean generarRoturas (BufferedWriter pw) {
		boolean bOk = true;
		try {
			int leftIndentTitol=10;
			for (int i=getNumRoturas()-1;i>=0;i--) {
				Rotura r = getRotura(i);
				String saltPage = "";
				if (r.isSaltoPagina()) saltPage = " isStartNewPage=\"true\" ";
				pw.write("<group name=\""+r.getNombre()+"\""+saltPage+" isReprintHeaderOnEachPage=\"true\" minHeightToStartNewPage=\""+ minHeightToStartNewPage +"\">");				
				//if (r.isEsCampo()) {
					//pw.write("<groupExpression><![CDATA[$F{"+r.getAgruparPor()+"}]]></groupExpression>");
				//}
				//else if (r.isEsVar()) {
					//pw.write("<groupExpression><![CDATA[$V{"+r.getAgruparPor()+"}]]></groupExpression>");
				//}
				//else if (r.isEsExpr()) {
					pw.write("<groupExpression><![CDATA["+r.getAgruparPor()+"]]></groupExpression>");
				//}
				pw.write("<groupHeader>");
				if(!r.isPrintGroupHeader()) {
				  pw.write("<band/>");
				}
				else {
					pw.write("<band height=\""+r.getHeaderHeight()+"\">");
					pw.write("<frame>");
					pw.write("<reportElement mode=\"Opaque\" x=\"0\" y=\"0\" width=\"" + columnWidth + "\" height=\"" + r.getHeaderHeight() + "\" backcolor=\"" + r.getBackGroundHeaderColor() + "\"/>");
					pw.write("<textField>");
					pw.write("<reportElement x=\"0\" y=\"0\" width=\"" + columnWidth + "\" height=\"" + r.getHeaderHeight() +"\"/>");
					pw.write("<textElement textAlignment=\"Left\" verticalAlignment=\"Middle\">");
					pw.write("<font size=\"" + r.getSizeFont() + "\" isBold=\"true\"/>");
					pw.write("<paragraph leftIndent=\""+leftIndentTitol+"\"/>");
					pw.write("</textElement>");
					pw.write("<textFieldExpression><![CDATA[" + r.getGroupHeaderName() +"]]></textFieldExpression>");
					pw.write("</textField>");
					pw.write("</frame>");					
					pw.write("</band>");
				}
				pw.write("</groupHeader>");			
				pw.write("<groupFooter>");
				pw.write("<band height=\""+(r.getAnchura()+espacioDetalle)+"\">");
				if (r.getPrintWhen()!=null && r.getPrintWhen().length()>0) pw.write("<printWhenExpression>"+r.getPrintWhen()+"</printWhenExpression>");
				//int [] cols = r.getColumnes();
				
		    	pw.write("<rectangle radius=\"2\">"); 
		    	pw.write("<reportElement x=\"0\" y=\"0\" width=\"" + posActualColumnHeader +"\" height=\"" + r.getHeaderHeight() + "\" forecolor=\"" + r.getBackGroundHeaderColor() + "\"/>"); 
		    	pw.write("<graphicElement>"); 
		    	pw.write("<pen lineWidth=\"2.0\"/>");
		    	pw.write("</graphicElement>");
		    	pw.write("</rectangle>");
				
				
				java.util.List<Totalizar> totals = r.getTotales();
				for (int c=0;c<totals.size();c++) {
					Columna col = totals.get(c).getColumna();
					//TextField tf = new TextField(this,col.getPosIni(),0,col.getTamanyAsignatLlistat(),r.getAnchura());
					TextField tf = new TextField(this,col.getPosIni(),0,col.getTamany(),r.getAnchura());
					tf.setAligDerecha(r.isAligDerecha());
					tf.setSizeFont(sizeDetalle+1);
					tf.setNegreta(r.isNegreta());
					//tf.setPosIni(col.getPosIni());
					//tf.setY(0);
					//tf.setWidth(col.getTamanyAsignatLlistat());
					//tf.setAmplada(r.getAnchura());
					if(col.getTipo() == mae.general.jreports.Columna.DOUBLE)
					  tf.setPattern("#,##0.00;-#,##0.00");
					tf.setColorFons(r.getColorFons());
					tf.setColorFont(r.getColorFont());
					tf.setAsignarColorFondo(r.isAligDerecha());
					tf.setRightIndent(5);
					tf.setVerticalAlig("Middle");
					String nom = "";
					if (col.getTf().isExpression()) nom = "tot"+i+col.getTf().getExpression();
					else if (col.getTf().esVariable()) nom = "tot"+i+col.getTf().getVariable().getNom();
					Variable v = new Variable(nom);
					tf.setVariable(v);
					generarTextField(pw, tf);
					//generarTextField(pw, col.getTf());
				}
				if (r.getTitul()!=null && r.getTitul().trim().length()>0) {
					//StaticText st = new StaticText(this);
					//int posIniTitol=r.getPosIniciTitul();
					//int firstCol = r.getColumnes()[0]-1;
					//int firstCol = r.getColumnes().get(0)-1;
					//int widthTitol=columnas.get(firstCol).getTf().getPosIni();
					int widthTitol=totals.get(0).getColumna().getTf().getPosIni();
					//StaticText st = new StaticText(this,r.getPosIniciTitul(),0,r.getWidthTitul(),r.getAnchura());
					StaticText st = new StaticText(this,r.getPosIniciTitul(),0,widthTitol,r.getAnchura());
					st.setLiteral(r.getTitul());
					if (r.isAligDerecha()) st.setAligRight();
					st.setSizeFont(sizeDetalle+1);
					st.setRightIndent(15);
					st.setNegreta(r.isNegreta());
					st.setVerticalAlig("Middle");
					//st.setPosInicial(r.getPosIniciTitul());
					//st.setY(0);
					//st.setWidth(r.getWidthTitul());
					//st.setAmplada(r.getAnchura());
					//st.setColorFons(r.getColorFons());
					st.setColorFont(r.getColorFont());
					//st.setAsignarColorFondo(r.isAligDerecha());
					generarStaticText(pw, st);
				}
				pw.write("</band>");				
				pw.write("</groupFooter>");
				pw.write("</group>");
				leftIndentTitol++;
			}
			for (int i=0;i<grupos.size();i++) pw.write(grupos.elementAt(i));			
		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	private boolean generarDetail (BufferedWriter pw) {
		boolean bOk = true;
		try {
			if (getNumColumnas()>0) {
				pw.write("<detail>");
				pw.write("<band height=\""+(getColumna(0).getTf().getAmplada())+"\" splitType=\"Stretch\">");
				if (printWhenDetalle!=null && printWhenDetalle.length()>0) pw.write("<printWhenExpression>"+printWhenDetalle+"</printWhenExpression>");
				for (int i=0;i<getNumColumnas();i++) {
					Columna c = getColumna(i);
					generarTextField(pw, c.getTf());
				}
				pw.write("</band>");
				pw.write("</detail>");			
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	/*
	private boolean initTamanyoColumnes () {
		boolean bOk = true;
		try {
			if (getNumColumnas()>0) {
				Columna col = getColumna(0);
				int tamanyColumna = col.getSt().getY() + col.getSt().getAmplada()+3;
				int x = 0;
				int tamanyTotalColumnas = getTamanyColumnas();
				for (int i=0;i<getNumColumnas();i++) {
					Columna c = getColumna(i);
					int tamanyCol = c.getTamany();
					if (c.getTamanyAsignatLlistat()==0) c.setTamanyAsignatLlistat(columnWidth * tamanyCol / tamanyTotalColumnas);
					c.setPosIni(x);
					x+=c.getTamanyAsignatLlistat();
				}
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
*/
	/*
	private boolean generarColumnHeader (BufferedWriter pw) {
		boolean bOk = true;
		try {
			if (getNumColumnas()>0) {
				Columna col = getColumna(0);
				int tamanyColumna = col.getSt().getY() + col.getSt().getAmplada()+3;
				pw.write("<columnHeader>");
				pw.write("<band height=\""+(tamanyColumna+3)+"\" splitType=\"Stretch\">");
				//int x = 0;
				//int tamanyTotalColumnas = getTamanyColumnas();
				for (int i=0;i<getNumColumnas();i++) {
					Columna c = getColumna(i);
					//int tamanyCol = c.getTamany();
					//if (c.getTamanyAsignatLlistat()==0) c.setTamanyAsignatLlistat(columnWidth * tamanyCol / tamanyTotalColumnas);
					//c.setPosIni(x);
					generarStaticText(pw, c.getSt());
					//x+=c.getTamanyAsignatLlistat();
				}
				pw.write("<line>");
				pw.write("<reportElement x=\"0\" y=\""+tamanyColumna+"\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
				pw.write("</line>");
				pw.write("</band>");
				pw.write("</columnHeader>");			
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	*/
	private boolean generarDummyHeader (BufferedWriter pw) {
	  boolean bOk = true;		
	  try {
		pw.write("<group name=\"dummy\" isReprintHeaderOnEachPage=\"true\" minHeightToStartNewPage=\""+minHeightToStartNewPage+"\">");	
		pw.write("<groupHeader>");
		pw.write("<band height=\""+ (espacioDetalle+1) +"\">");
		  if (getNumColumnas()>0) {
			//Columna col = getColumna(0);
			//int tamanyColumna = col.getTamany();
			for (int i=0;i<getNumColumnas();i++) {
		  	  Columna c = getColumna(i);
			  generarStaticText(pw, c.getSt());			
		    }
			pw.write("<line>");
			pw.write("<reportElement x=\"0\" y=\""+espacioDetalle+"\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
			pw.write("</line>");
			pw.write("</band>");
			pw.write("</groupHeader>");
			pw.write("</group>");
		  }
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	private int getTamanyColumnas() {
		int t = 0;
		for (int i=0;i<getNumColumnas();i++) t += getColumna(i).getTamany();
		return t;
	}

	private boolean generarQueryString(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<queryString>");
			pw.write("<![CDATA["+sql+"]]>");
			pw.write("</queryString>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	private String getTipoFieldColumna(int t) {
		String tipo = "java.lang.String";
		if (t == Columna.DOUBLE ) tipo = "java.lang.Double";
		else if (t == Columna.INTEGER ) tipo = "java.lang.Integer";
		else if (t == Columna.DATE ) tipo = "java.sql.Timestamp";
		return tipo;		
	}
/*
	private boolean generarVariablesRoturas (BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<getNumRoturas();i++) {
				Rotura r = getRotura(i);
				int [] cols = r.getColumnes();
				for (int c=0;c<cols.length;c++) {
					Columna col = getColumna(cols[c]-1);
					String nom = "";
					String expr = "";
					if (col.getTf().esCampoSelect()) {
						nom = "tot"+i+col.getTf().getCampoSelect();
						expr = "$F{"+col.getTf().getCampoSelect()+"}";
					}
					else if (col.getTf().esVariable()) {
						nom = "tot"+i+col.getTf().getVariable().getNom();
						expr = "$V{"+col.getTf().getVariable().getNom()+"}";
					}
					pw.write("<variable name=\""+nom+"\" class=\"java.lang.Double\" resetType=\"Group\" resetGroup=\""+r.getNombre()+"\" calculation=\""+r.getSum()+"\">");
					pw.write("<variableExpression><![CDATA["+expr+"]]></variableExpression>");
					pw.write("</variable>");
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	*/
	private boolean generarVariablesRoturas (BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<getNumRoturas();i++) {
				Rotura r = getRotura(i);
				//int [] cols = r.getColumnes();
				java.util.List<Totalizar> totals = r.getTotales();
				for (int c=0;c<totals.size();c++) {
					Columna col = totals.get(c).getColumna();
					String nom = "";
					String expr = "";
					if (col.getTf().isExpression()) {
						nom = "tot"+i+col.getTf().getExpression();
						expr = "$F{"+col.getTf().getExpression()+"}";
					}
					else if (col.getTf().esVariable()) {
						nom = "tot"+i+col.getTf().getVariable().getNom();
						expr = "$V{"+col.getTf().getVariable().getNom()+"}";
					}
					pw.write("<variable name=\""+nom+"\" class=\"java.lang.Double\" resetType=\"Group\" resetGroup=\""+r.getNombre()+"\" calculation=\""+r.getSum()+"\">");
					pw.write("<variableExpression><![CDATA["+expr+"]]></variableExpression>");
					pw.write("</variable>");
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	private boolean generarVariablesTotales (BufferedWriter pw) {
		boolean bOk = true;
		try {
		  for (int i=0;i<getNumTotales();i++) {
			Totalizar t = getTotales(i);
			Columna col = t.getColumna();
			String nom = "";
		    String expr = "";
		    if (col.getTf().isExpression()) {
	  		  nom = "totFinal"+i+col.getTf().getExpression();
			  expr = "$F{"+col.getTf().getExpression()+"}";
			}
			else if (col.getTf().esVariable()) {
			  nom = "totFinal"+i+col.getTf().getVariable().getNom();
			  expr = "$V{"+col.getTf().getVariable().getNom()+"}";
			}
			pw.write("<variable name=\""+nom+"\" class=\""+ t.getTipoClass() + "\" calculation=\""+t.getTipoTotal()+"\">");
			pw.write("<variableExpression><![CDATA["+expr+"]]></variableExpression>");
			pw.write("</variable>");			
		  }
		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	
	private boolean generarVariablesColumnas (BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<getNumColumnas();i++) {
				Columna c = getColumna(i);
				if (c.getTf().esVariable()) {
					pw.write("<variable name=\""+c.getTf().getVariable().getNom()+"\" class=\""+getTipoFieldColumna(c.getTipo())+"\" resetType=\"None\">");
					pw.write("<variableExpression><"+c.getTf().getVariable().getExpression()+"></variableExpression>");
					pw.write("</variable>");					
				}
			}
			for (int z=0;z<encabezados.size();z++) {
				Encabezado e = encabezados.get(z);
				if(e.getTf().esVariable()) {
					pw.write("<variable name=\""+e.getTf().getVariable().getNom()+"\" class=\""+getTipoFieldColumna(e.getTipo())+"\" resetType=\"None\">");
					pw.write("<variableExpression><"+e.getTf().getVariable().getExpression()+"></variableExpression>");
					pw.write("</variable>");	
				}
			}
			
			
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	private boolean generarFields(BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<slistado.getNumColumns();i++) {
				Field f = slistado.getColumn(i);
				pw.write("<field name=\""+f.getName()+"\" class=\""+getTipoField(f)+"\"/>");
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	
	private boolean generarSubDataSet(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<subDataset name=\""+slistado.getName()+"\">");		
			pw.write("<queryString language=\"SQL\">");
			pw.write("<![CDATA["+sql+"]]>");
			pw.write("</queryString>");		
			for (int i=0;i<slistado.getNumColumns();i++) {
				Field f = slistado.getColumn(i);
				pw.write("<field name=\""+f.getName()+"\" class=\""+getTipoField(f)+"\"/>");
			}
			pw.write("</subDataset>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	

	private String getTipoField(int t) {
		String tipo = "java.lang.String";
		if (t == FieldDef.INTEGER ) tipo = "java.lang.Integer";
		else if (t == FieldDef.DOUBLE || t == FieldDef.MONEY || t == FieldDef.FLOAT ) tipo = "java.lang.Double";
		else if (t == FieldDef.DATE ) tipo = "java.sql.Timestamp";
		return tipo;		
	}
	
	private String getTipoField(Field f) {
		return getTipoField(f.getType());
	}
	
	private int getTamanyoEncabezado() {
		int total = 0;
		for (int i=0;i<getNumEncabezados();i++) {
			Encabezado e = getEncabezado(i);
			total += e.getAmplada();
		}
		return total; 		
	}
	
	public int getTamanyoPageHeader() {
		int total = getTamanyoEncabezado ();
		//return stTitulo.getAmplada() + total + 8 + 2; 
		return stTitulo.getAmplada() + total; 
	}
	
	private boolean generarPageHeader (BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<pageHeader>");
			pw.write("<band height=\""+(getTamanyoPageHeader()+espacioDetalle)+"\" splitType=\"Stretch\">");
			
			generarStaticText(pw, stTitulo);
			if (getNumEncabezados()>0) {
				int y = stTitulo.getAmplada();
				for (int i=0;i<getNumEncabezados();i++) {
				  Encabezado e = getEncabezado(i);
				  pw.write("<frame>");
				  pw.write("<reportElement mode=\"Opaque\" x=\"" + e.getPosIniEnc() + "\" y=\""+ y + "\" width=\"" + rightWidthPosicion + "\" height=\""+getTamanyoEncabezado()+"\" backcolor=\"" + e.getBgColor() + "\"/>");
				  for(int z=0;z<e.getComponentes().size();z++) {
					if(e.getComponentes().get(z) instanceof TextField) {
					  TextField tf1 = (TextField)e.getComponentes().get(z);
					  generarTextField(pw, tf1);
					}
					else if (e.getComponentes().get(z) instanceof StaticText) { 
					  StaticText st1 = (StaticText)e.getComponentes().get(z);
					  generarStaticText(pw, st1);	
					}
				  }				  
				  pw.write("</frame>");
				  y += e.getAmplada();
				}
			}
			pw.write("</band>");
			pw.write("</pageHeader>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	

	private void generarStaticText (BufferedWriter pw, StaticText st) throws Exception {
		pw.write("<staticText>");
		String tran = "";
		if (st.isAsignarColorFondo()) tran = "mode=\"Opaque\" backcolor=\""+st.getColorFons()+"\" ";
		pw.write("<reportElement forecolor=\""+st.getColorFont()+"\" x=\""+st.getPosInicial()+"\" y=\""+st.getY()+"\" width=\""+st.getWidth()+"\" height=\""+st.getAmplada()+"\" "+tran+"/>");

		String indent="";
		if (st.isAligCenter()) {
			pw.write("<textElement textAlignment=\"Center\"  verticalAlignment=\""+st.getVerticalAlig()+"\" >");
		}
		else if (st.isAligRight())  {
			pw.write("<textElement textAlignment=\"Right\" verticalAlignment=\""+st.getVerticalAlig()+"\">");
			indent="<paragraph rightIndent=\""+st.getRightIndent()+"\"/>";
			//pw.write("<paragraph rightIndent=\""+st.getRightIndent()+"\"/>");
		}
		else{
			pw.write("<textElement textAlignment=\"Left\" verticalAlignment=\""+st.getVerticalAlig()+"\">");
			indent="<paragraph leftIndent=\""+st.getLeftIndent()+"\"/>";
			//pw.write("<paragraph leftIndent=\""+st.getLeftIndent()+"\"/>");
		}
		
		if (st.isNegreta()) pw.write("<font isBold=\"true\" size=\""+st.getSizeFont()+"\" />");
		else pw.write("<font isBold=\"false\" size=\""+st.getSizeFont()+"\" />");
		pw.write(indent);
		//pw.write("<paragraph rightIndent=\""+espacioEntreColumnas+"\"/>");
		pw.write("</textElement>");				
		pw.write("<text><![CDATA["+st.getLiteral()+"]]></text>");
		pw.write("</staticText>");						
	}

	private void generarTextField (BufferedWriter pw, TextField tf) throws Exception {	
		String pattern = "";
		if (tf.getPattern()!=null) pattern = " pattern=\""+tf.getPattern()+"\" ";
		String evaluation = "";
		if (tf.esVariable() && tf.getVariable().getEvaluationTime()!=null) evaluation = " evaluationTime=\""+tf.getVariable().getEvaluationTime()+"\" ";
		pw.write("<textField isBlankWhenNull=\"true\""+pattern+evaluation+">");
		String tran = "";
		if (tf.isAsignarColorFondo()) tran = "mode=\"Opaque\" backcolor=\""+tf.getColorFons()+"\" ";				
		pw.write("<reportElement forecolor=\""+tf.getColorFont()+"\" x=\""+tf.getPosIni()+"\" y=\""+tf.getY()+"\" width=\""+tf.getWidth()+"\" height=\""+tf.getAmplada()+"\" "+tran+">");
		if (tf.getPrintWhen()!=null && tf.getPrintWhen().length()>0) {
			pw.write("<printWhenExpression>"+tf.getPrintWhen()+"</printWhenExpression>");	
		}
		pw.write("</reportElement>");
	    String indent ="";
		if (tf.isAligDerecha())  {
			pw.write("<textElement textAlignment=\"Right\">");
			indent="<paragraph rightIndent=\""+tf.getRightIndent()+"\"/>";
			//pw.write("<paragraph rightIndent=\""+tf.getRightIndent()+"\"/>");
		}
		else {
			pw.write("<textElement textAlignment=\"Left\">");
			indent="<paragraph leftIndent=\""+tf.getLeftIndent()+"\"/>";
			//pw.write("<paragraph rightIndent=\""+tf.getLeftIndent()+"\"/>");
		}
		
		
		if (tf.isNegreta()) pw.write("<font isBold=\"true\" size=\""+tf.getSizeFont()+"\"/>");
		else pw.write("<font isBold=\"false\" size=\""+tf.getSizeFont()+"\"/>");
		//pw.write("<paragraph rightIndent=\""+espacioEntreColumnas+"\"/>");
		pw.write(indent);
		pw.write("</textElement>");
		if (tf.isExpression()) pw.write("<textFieldExpression><![CDATA[$F{"+tf.getExpression()+"}]]></textFieldExpression>"); 
		else if (tf.esVariable()) pw.write("<textFieldExpression><![CDATA[$V{"+tf.getVariable().getNom()+"}]]></textFieldExpression>"); 
		pw.write("</textField>");
	}
	
	private int getNumEncabezados() {
		return encabezados.size();
	}
	
	private int getNumColumnas() {
		return columnas.size();
	}
	
	private int getNumRoturas() {
		return roturas.size();
	}
	
	private int getNumTotales() {
		return totales.size();
	}
	
	private boolean generarTotalesFooter(BufferedWriter pw) {
	  boolean bOk = true;
	  if(totales.size() >0) {
	    try {
	      pw.write("<group name=\"totales\">");
	      pw.write("<groupExpression><![CDATA[$P{REPORT_CONTEXT}]]></groupExpression>");
	      pw.write("<groupFooter>");
	      pw.write("<band height=\"" + (espacioDetalle*4) + "\">");
	      for(int z=0;z<totales.size();z++) {
	    	Totalizar t = totales.get(z);
	    	Columna col = t.getColumna();
	    	String nom = "";
	    	if (col.getTf().isExpression()) nom = "totFinal"+z+col.getTf().getExpression();
			else if (col.getTf().esVariable()) nom = "totFinal"+z+col.getTf().getVariable().getNom();
	    	pw.write("<rectangle radius=\"2\">"); 
	    	pw.write("<reportElement x=\"" + col.getPosIni() + "\" y=\"" + espacioDetalle + "\" width=\"" + col.getSt().getWidth() +"\" height=\"" + (espacioDetalle*2) + "\" forecolor=\"" + t.getBackGroundColor() + "\"/>"); 
	    	pw.write("<graphicElement>"); 
	    	pw.write("<pen lineWidth=\"2.0\"/>");
	    	pw.write("</graphicElement>");
	    	pw.write("</rectangle>");
	    	
	    	
	    	pw.write("<staticText>");
	    	pw.write("<reportElement mode=\"Opaque\" x=\"" + col.getPosIni() + "\" y=\"" + espacioDetalle + "\" width=\"" + col.getSt().getWidth() + "\" height=\"" + espacioDetalle + "\" forecolor=\"#000000\" backcolor=\"" + t.getBackGroundColor() + "\"/>");
	    	pw.write("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	    	pw.write("<font isBold=\"true\" size=\""+col.getSt().getSizeFont()+"\"/>");
	    	pw.write("</textElement>");
	    	pw.write("<text><![CDATA[" + t.getTitol() + "]]></text>");	    	
	    	pw.write("</staticText>");
	    	
	    	
	    	String pattern = "";
			if (t.getTipo() == Columna.DOUBLE) pattern = " pattern=\""+"#,##0.00;-#,##0.00"+"\" ";			
			pw.write("<textField isBlankWhenNull=\"true\""+pattern+">");
	    	pw.write("<reportElement x=\"" + col.getPosIni() + "\" y=\"" + (espacioDetalle*2) + "\" width=\"" + col.getSt().getWidth() + "\" height=\"" + espacioDetalle + "\"/>");
		    String indent ="";
			if (col.getTf().isAligDerecha())  {
				pw.write("<textElement textAlignment=\"Right\">");
				indent="<paragraph rightIndent=\""+col.getTf().getRightIndent()+"\"/>";
				//pw.write("<paragraph rightIndent=\""+tf.getRightIndent()+"\"/>");
			}
			else {
				pw.write("<textElement textAlignment=\"Left\">");
				indent="<paragraph rightIndent=\""+col.getTf().getLeftIndent()+"\"/>";
				//pw.write("<paragraph rightIndent=\""+tf.getLeftIndent()+"\"/>");
			}			
			pw.write("<font isBold=\"true\" size=\""+col.getTf().getSizeFont()+"\"/>");
			pw.write(indent);
			pw.write("</textElement>");
			pw.write("<textFieldExpression><![CDATA[$V{"+nom+"}]]></textFieldExpression>"); 
	    	pw.write("</textField>");
	      }	    
	      pw.write("</band>");
	      pw.write("</groupFooter>");
	      pw.write("</group>");
	      
	      
	  	

		
	      

	    }
	    catch (Exception e) {
		  sError = ""+e;
		  bOk = false;
	    }
	  }
	  return bOk;	
	}
	
	private boolean generarFinal(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("</jasperReport>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	private boolean generarBandBackground(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<background>");
			pw.write("<band splitType=\"Stretch\"/>");
			pw.write("</background>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}	
	
	private boolean generarColumnFooter(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<columnFooter>");
			pw.write("<band height=\"4\" splitType=\"Stretch\"/>");
			pw.write("</columnFooter>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	private boolean generarPageFooter(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<pageFooter>");
			pw.write("<band height=\"27\" splitType=\"Stretch\" >");
			pw.write("<line>");
			pw.write("<reportElement x=\"0\" y=\"0\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
			pw.write("</line>");
			if (fechaListado != null && fechaListado.length()>0) {
				//StaticText st = new StaticText(this);
				StaticText st = new StaticText(this,0,1,100,26);
				st.setLiteral(fechaListado);
				st.setAligCenter();
				//st.setPosInicial(1);
				//st.setY(sizeEncabezado);
				//st.setWidth(100);
				//st.setAmplada(17);
				st.setSizeFont(sizeEncabezado);
				st.setNegreta(false);
				st.setAligLeft();
				st.setColorFont(colorPeuPagina);
				generarStaticText(pw, st);
			}
			
			TextField tf2 = new TextField(this,(columnWidth - 22),1,22,26);
			//tf2.setPosIni(columnWidth - 22);
			//tf2.setY(sizeEncabezado);
			//tf2.setWidth(22);
			//tf2.setAmplada(17);
			tf2.setSizeFont(sizeEncabezado);
			tf2.setAligDerecha(true);
			tf2.setColorFont(colorPeuPagina);
			Variable v = new Variable("PAGE_NUMBER");
			tf2.setVariable(v);
			generarTextField(pw, tf2);
			pw.write("</band>");
			pw.write("</pageFooter>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}	
	private boolean generarBandTitle(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<title>");
			pw.write("<band splitType=\"Stretch\"/>");
			pw.write("</title>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	private boolean generarCabecera(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			pw.write("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"ReportAutomatico\" language=\"groovy\" pageWidth=\""+pagewidth+"\" pageHeight=\""+pageheight+"\" columnWidth=\""+columnWidth+"\" leftMargin=\""+margenizq+"\" rightMargin=\""+margender+"\" topMargin=\""+margensup+"\" bottomMargin=\""+margeninf+"\">");
			pw.write("<property name=\"ireport.zoom\" value=\"2.0\"/>");
			pw.write("<property name=\"ireport.x\" value=\"0\"/>");
			pw.write("<property name=\"ireport.y\" value=\"0\"/>");
			
			//pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.band.1\" value=\"pageHeader\"/>");
			
			pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.keep.first.band.1\" value=\"pageHeader\"/>");
			pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.keep.first.band.2\" value=\"groupHeader\"/>");
			pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.keep.first.group.2\" value=\"dummy\"/>");
			pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.band.2\" value=\"pageFooter\"/>");
			
			for (int i=0;i<getNumRoturas();i++) {
			  Rotura r = getRotura(i);
			  pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.band." + (i+3) + "\" value=\"groupHeader\"/>");
			  pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.group." + (i+3) + "\" value=\"" + r.getNombre() + "\"/>");
  			  //pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.keep.first.band.1\" value=\"columnHeader\"/>");
			  //pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.keep.first.band.2\" value=\"pageHeader\"/>");
			
			}
			pw.write("<property name=\"net.sf.jasperreports.export.xls.white.page.background\" value=\"false\"/>");
			pw.write("<property name=\"net.sf.jasperreports.export.xls.remove.empty.space.between.rows\" value=\"false\"/>");
			pw.write("<property name=\"net.sf.jasperreports.export.xls.remove.empty.space.between.columns\" value=\"false\"/>");

			
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	public int getEspacioEntreColumnas() {
		return espacioEntreColumnas;
	}

	public void setEspacioEntreColumnas(int espacioEntreColumnas) {
		this.espacioEntreColumnas = espacioEntreColumnas;
	}

	public String getError () {
		return sError;
	}

	public StaticText getStTitulo() {
		return stTitulo;
	}

	public void setStTitulo(StaticText stTitulo) {
		this.stTitulo = stTitulo;
	}

	public String getFechaListado() {
		return fechaListado;
	}

	public void setFechaListado(String fechaListado) {
		this.fechaListado = fechaListado;
	}

	public String getColorLineas() {
		return colorLineas;
	}

	public void setColorLineas(String colorLineas) {
		this.colorLineas = colorLineas;
	}

	public int getEspacioDetalle() {
		return espacioDetalle;
	}

	public void setEspacioDetalle(int espacioDetalle) {
		this.espacioDetalle = espacioDetalle;
	}

	public String getColorPeuPagina() {
		return colorPeuPagina;
	}

	public void setColorPeuPagina(String colorPeuPagina) {
		this.colorPeuPagina = colorPeuPagina;
	}
	
	public int getRightWidthPosicion() {
		return rightWidthPosicion;
	}
	
	public void setAutoFillColumn( Boolean controlAutoColumn) {
		this.autoFillColumns = controlAutoColumn;
	}
	
	public void setTotalesGrand(boolean viewTotalesFinales) {
		this.viewTotalesFinales = viewTotalesFinales;
	}
	public void setTitleHeight(int height) {
		this.titleHeight = height;
	}
}
