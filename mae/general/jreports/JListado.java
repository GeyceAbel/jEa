package mae.general.jreports;

import geyce.maefc.DBConnection;
import geyce.maefc.Field;
import geyce.maefc.FieldDef;
import geyce.maefc.Select;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import net.sf.jasperreports.engine.data.JRXmlDataSource;

import mae.general.jreports.Totalizar.Calculation;

public class JListado {

	public enum Orientacion { VERTICAL, HORIZONTAL} ;
	public enum whenNoData {BLANK_PAGE,NO_PAGES,ALL_SECTIONS_NO_DETAIL,NO_DATA_SECTION};

	private String queryString;
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
	private List <StaticText> columnasSup;
	private List <Rotura> roturas;
	private List <Totalizar> totales;
	private List <Parametro> xmlParameter;
	private List <Group> groups;
	//private List <JasperObject> detailGroup;
	
	
	private Band detail;



	public DBConnection conn;
	public String rutaFicheroJRXML;
	public int posActualColumnHeader =0;
	protected String sError;
	private StaticText stTitulo;
	public int sizeDetalle;
	public int sizeTitulo;
	public int sizeEncabezado;
	private String printWhenDetalle;
	private int espacioEntreColumnas;
	private int espacioDetalle;
	private Vector<String> grupos;
	private Vector<Band> dummyExtraFirstBands;
	private Vector<Band> dummyExtraBands;
	private String fechaListado;
	private String colorLineas;
	private String colorPeuPagina;
	private HashMap<String, Object> parametros;
	public boolean sinDataSource;
	public Orientacion orientacionPapel;
	private int rightWidthPosicion;
	private boolean autoFillColumns;
	private boolean viewTotalesFinales = true;
	private boolean titolColumnasEncabezado=false;
	public int minHeightToStartNewPage;
	private int titleHeight;
	private String nombreReport;
	private String nombreVariablePaginaInicial;
	private LinkedHashMap<String, Integer> fields;
	private boolean isXmlDataSource = false;
	private JRXmlDataSource xmlDataSource;
	public Vector<String> vPropiedadesExcel;
	public boolean propiedadesExcelAutomaticas;
	public boolean ignoreDuplicatePIEkey = true;
	public Vector <Variable> vExtraVariables;
	public boolean paginarExcel = true;
	private whenNoData sinDatos;
	public Vector <ExtraBand> vDetailExtraBand;
	public boolean bSinColor = false;
	public int sizePageHeader = 0;
	public int posFinEncabezado = 0;
	public boolean afegirStyle1 = false;
	public Summary sumario;
	public Object relListadoObj;
	public InputStream isJrxml;

	public JListado (Select slistado, Orientacion or) {
		rutaFicheroJRXML = null;
		orientacionPapel = or;
		this.slistado = slistado;
		queryString = slistado.getSQL();
		setDefaultParameters();
		fields = new LinkedHashMap<String, Integer> ();
		for (int i=0;i<slistado.getNumColumns();i++) {
			Field f = slistado.getColumn(i);
			fields.put(f.getName(), f.getType());
		}
		dummyExtraBands = new Vector<Band>();
		dummyExtraFirstBands = new Vector<Band>();
		vPropiedadesExcel = new Vector<String> ();
		vExtraVariables = new Vector<Variable> ();
		vDetailExtraBand = new Vector<ExtraBand>();
		propiedadesExcelAutomaticas = true;
		paginarExcel = true;
		bSinColor = false;
		afegirStyle1 = false;
	}

	public JListado (String queryString, LinkedHashMap<String, Integer> fields, Orientacion or) {
		rutaFicheroJRXML = null;
		orientacionPapel = or;
		this.queryString = queryString;
		setDefaultParameters();
		this.fields = fields;
		dummyExtraBands = new Vector<Band>();
		dummyExtraFirstBands = new Vector<Band>();
		vPropiedadesExcel = new Vector<String> ();
		vExtraVariables = new Vector<Variable> ();
		vDetailExtraBand = new Vector<ExtraBand>();
		propiedadesExcelAutomaticas = true;
		paginarExcel = true;
		bSinColor = false;
		afegirStyle1=false;
	}

	public void setDefaultParameters() {
		encabezados = new ArrayList <Encabezado>();
		columnas = new ArrayList <Columna>();
		columnasSup = new ArrayList <StaticText> ();
		roturas = new ArrayList <Rotura>();
		totales = new ArrayList<Totalizar>();
		xmlParameter = new ArrayList<Parametro>();
		groups = new ArrayList<Group>();
		//detailGroup = new ArrayList<JasperObject>();
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
		nombreReport = "ReportAutomatico";
		setPapel();
	}

	public void setXmlDataSource(JRXmlDataSource dataSourceXml) {
		this.isXmlDataSource=true;
		xmlDataSource = dataSourceXml;
		xmlDataSource.setDatePattern("dd-MM-yyyy");
		xmlDataSource.setNumberPattern("#,##0.##");
	}

	public JRXmlDataSource getXmlDataSource() {
		return xmlDataSource;
	}

	public String getNombreVariablePaginaInicial() {
		return nombreVariablePaginaInicial;
	}

	public void setNombreVariablePaginaInicial(String nombreVariablePaginaInicial) {
		this.nombreVariablePaginaInicial = nombreVariablePaginaInicial;
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
			margeninf = 30;
			margenizq = 20;
			margender = 20;
			pagewidth = 595;
			pageheight = 842;
		}
		columnWidth = (pagewidth-margender-margenizq);
		rightWidthPosicion = pagewidth - margender;
	}

	public void setPapel(int iz, int de, int su, int inf) {
		pageheight = 842;
		pagewidth = 595;
		if(orientacionPapel == Orientacion.HORIZONTAL) {
			pagewidth = 842;
			pageheight = 595;
		}
		margensup = su;
		margeninf = inf;
		margenizq = iz;
		margender = de;
		columnWidth = (pagewidth-margender-margenizq);
		rightWidthPosicion = pagewidth - margender;
	}

	public void setPageSize(int width, int height) {
		pageheight = height;
		pagewidth = width;
		columnWidth = (pagewidth-margender-margenizq);
		rightWidthPosicion = pagewidth - margender;
	}

	public void setMargin(int left, int right, int up, int down) {
		margensup = up;
		margeninf = down;
		margenizq = left;
		margender = right;
	}

	public boolean isXmlDataSource() {
		return isXmlDataSource;
	}

	public String getNombreReport() {
		return nombreReport;
	}

	public void setNombreReport(String nombreReport) {
		this.nombreReport = nombreReport;
	}

	public JListado (String rutaJRXML) {
		this.rutaFicheroJRXML= rutaJRXML;
		parametros = new HashMap<String, Object>();
		sinDataSource = false;
		paginarExcel = true;
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

	public void addGroup(Group group) {
		groups.add(group);
	}
	
	public Parametro addParametro(String nom,String expression,String tipus,Object parametro, boolean isImport) {
		Parametro p = new Parametro(nom, expression, tipus, isImport);
		xmlParameter.add(p);
		parametros.put(nom,parametro);
		return p;
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

	public StaticText addColumnaSuperior(String literal,int x, int y, int tamany) {
		StaticText st = new StaticText (this,x,0,tamany,getEspacioDetalle());
		st.setAsignarColorFondo(false);
		st.setColorFont("#000000");
		st.setLiteral(literal);
		st.setNegreta(true);
		st.setVerticalAlig("Bottom");
		st.setSizeFont(sizeDetalle +1);
		st.setAligCenter();
		columnasSup.add(st);
		return st;
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

	public Parametro getParameter (int index) {
		return xmlParameter.get(index);
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

	public Rotura addRotura (String nombre, String agruparPor,String titol,boolean totalizar) {
		Rotura r = null;
		if (totalizar) r = new Rotura(this, totales, nombre, agruparPor,titol);
		else r = new Rotura(this, new ArrayList<Totalizar>(), nombre, agruparPor,titol);
		roturas.add(r);

		return r;
	}
	
	public Rotura addRotura (String nombre, String agruparPor,String titol, List<Totalizar> tles) {
		Rotura r = new Rotura(this, tles, nombre, agruparPor,titol);
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

	public String getTituloListado() {
		return stTitulo.getLiteral();
	}
	public void setTituloListado (String tit) {
		stTitulo = new StaticText(this,(0-margenizq),0,rightWidthPosicion,titleHeight);
		stTitulo.setAligRight();
		stTitulo.setRightIndent(20);
		stTitulo.setNegreta(true);
		stTitulo.setSizeFont(sizeTitulo);
		stTitulo.setLiteral(tit);
		stTitulo.setColorFons("#006699");
		stTitulo.setColorFont("#FFFFFF");
	}
	public void setTituloListado (String tit, String coloFons, String colorLletra) {
		stTitulo = new StaticText(this,(0-margenizq),0,rightWidthPosicion,titleHeight);
		stTitulo.setAligRight();
		stTitulo.setRightIndent(20);
		stTitulo.setNegreta(true);
		stTitulo.setSizeFont(sizeTitulo);
		stTitulo.setLiteral(tit);
		stTitulo.setColorFons(coloFons);
		stTitulo.setColorFont(colorLletra);
	}

	public void addGrupo (String nombre, String expression) {
		String def = "<group name=\""+nombre+"\"><groupExpression>"+expression+"</groupExpression></group>";
		grupos.addElement(def);
	}
	public boolean generalJRXMLStream () {
		boolean bOk = true;
		if (isJrxml == null) {
			BufferedWriter pw = null;
			ByteArrayOutputStream ba = new ByteArrayOutputStream();
			OutputStreamWriter osr = null;
			try {
				osr = new OutputStreamWriter(ba,"UTF-8");
				pw = new BufferedWriter(osr);
				bOk = generalJRXML(pw);
				if (bOk) isJrxml = new ByteArrayInputStream(ba.toByteArray());

			}
			catch (Exception e) {
				bOk = false;
				sError = "Error inesperado:"+e;
				e.printStackTrace();
			}
			finally {
				try  {
					if (pw!=null) pw.close();
					if (osr!=null) osr.close();
					if (ba!=null) ba.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return bOk;
	}
	public boolean generalJRXML () {
		return generalJRXML (false);
	}
	public boolean generalJRXML (boolean esWeb) {
		boolean bOk = false;
		if (esWeb) return true;
		try {
			File fjrxml = File.createTempFile("JRXML_", ".jrxml");
			BufferedWriter pw = new BufferedWriter(new OutputStreamWriter (new FileOutputStream(fjrxml),"UTF8"));
			bOk = generalJRXML(pw);
			rutaFicheroJRXML = fjrxml.getAbsolutePath();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return bOk;
	}
	
	public boolean generalJRXML (BufferedWriter pw) {
		boolean bOk = true;
		try {

			if (bOk) bOk = generarCabecera (pw);
			if(getNumParameters() > 0) {
				if (bOk) bOk = generarImportaciones (pw);
			}
			if (bOk && afegirStyle1) bOk = generarStyle(pw);
			if (bOk) bOk = generarSubDataSet (pw);
			if (sumario!= null && sumario.hayGraficos()) {
				for (int i=0;i<sumario.graficos.size();i++) {
					Grafico gr = sumario.graficos.get(i);
					if (bOk) bOk = gr.generarSubDataSet (pw);
				}
			}
			if(getNumParameters() > 0) {
				if (bOk) bOk = generarParametros (pw);
			}
			if (bOk) bOk = generarParametroPaginaInicial (pw);
			if (bOk) bOk = generarQueryString (pw);
			if (bOk) bOk = generarFields (pw);
			if (bOk) bOk = generarVariablesColumnas (pw);
			if (bOk) bOk = generarVariablesRoturas (pw);
			if (bOk) bOk = generarVariablesTotales (pw);
			if (bOk) bOk = generarExtraVariables (pw);
			
			
			
			//initTamanyoColumnes ();
			if(viewTotalesFinales)
				if (bOk) bOk = generarTotalesFooter (pw);
			if (bOk) bOk = generarRoturas (pw);
			if (bOk && !getTitolColumnasEncabezado()) bOk = generarDummyHeader(pw);
			if (bOk) bOk = generarGrupos(pw);
			if (bOk) bOk = generarGroups (pw);
			//if (bOk) bOk = generarBandBackground (pw);
			if (bOk) bOk = generarBandTitle (pw);
			if (bOk) bOk = generarPageHeader (pw);
			//if (bOk) bOk = generarColumnHeader (pw);
			if (bOk) {
				if(detail != null)
				  bOk = generarDetailEspecifico (pw);
				else 
				  bOk = generarDetail (pw);
			}
			//if (bOk) bOk = generarColumnFooter (pw);
			if (bOk) bOk = generarPageFooter (pw);
			if (sumario != null && sumario.haySummary()) sumario.generarSumary(pw);
			if (bOk) bOk = generarFinal (pw);
		}
		catch (Exception e) {
			bOk = false;
			sError = "Error inesperado:"+e;
			e.printStackTrace();
		}
		finally {
			try  {
				if (pw!=null) pw.close();				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bOk;
	}

	protected boolean generarParametroPaginaInicial(BufferedWriter pw) {
		boolean bOk = true;
		try {
			if (nombreVariablePaginaInicial!=null) {
				pw.write("<parameter name=\""+nombreVariablePaginaInicial+"\" class=\"java.lang.Integer\" isForPrompting=\"false\">");
				pw.write("<defaultValueExpression><![CDATA[0]]></defaultValueExpression>");
				pw.write("</parameter>");
			}
		}
		catch (IOException e) {
			bOk = false;
			sError = e.getMessage();
		}
		return bOk;
	}
	private boolean generarStyle(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<style name=\"style1\" forecolor=\"#000000\" >");
			pw.write("  <box topPadding=\"0\" leftPadding=\"0\" bottomPadding=\"0\" rightPadding=\"0\">");
			pw.write("    <topPen lineWidth=\"0.5\" lineColor=\"#CCCCCC\"/>");
			pw.write("    <leftPen lineWidth=\"0.5\" lineColor=\"#CCCCCC\"/>");
			pw.write("    <bottomPen lineWidth=\"0.5\" lineColor=\"#CCCCCC\"/>");
			pw.write("    <rightPen lineWidth=\"0.5\" lineColor=\"#CCCCCC\"/>");
			pw.write("  </box>");
      pw.write("</style>");
// caldra treure aquest tro?
/* quan posem els estils servira exemple
      pw.write("<style name=\"style1\">");
      pw.write("   <conditionalStyle>");
      pw.write("              <conditionExpression><![CDATA[$F{lisdiputacion}.equals(\"S\")]]></conditionExpression>");
      pw.write("     <style forecolor=\"#119348\" fontSize=\"8\"/>");
      pw.write("   </conditionalStyle>");
      pw.write("   <conditionalStyle> ");
      pw.write("              <conditionExpression><![CDATA[$F{lisdiputacion}.equals(\"N\")]]></conditionExpression>");
      pw.write("              <style forecolor=\"#0A5DAF\" fontSize=\"12\"/>");
      pw.write("   </conditionalStyle>");
      pw.write("</style>");*/

		}
		catch (IOException e) {
			bOk = false;
			sError = e.getMessage();
		}
		return bOk;
	}

	
	protected void generaJasperObject(JasperObject jo, BufferedWriter pw) throws Exception{
		if(jo instanceof TextField) {
			generaTextField((TextField)jo,pw);
		}		
	}
	
	
	protected void generaTextField(TextField tf, BufferedWriter pw) throws Exception{
		  pw.write("<textField " + (tf.isStretchWithOverflow()?"isStretchWithOverflow=\"true\"":"") + "  isBlankWhenNull=" +(tf.isBlankWhenNull()?"\"true\"":"\"false\"") + ">");
		  pw.write("<reportElement x=\"" + tf.getPosIni() + "\" y=\"" + tf.getY() + "\" width=\"" + tf.getWidth() + "\" height=\"" + tf.getAmplada() +"\">");
		  pw.write("<property name=\"net.sf.jasperreports.export.xls.auto.fit.column\" value=\"true\"/>");
		  pw.write("<property name=\"net.sf.jasperreports.print.keep.full.text\" value=\"true\"/>");
		  pw.write("</reportElement>");
		  pw.write("<textElement textAlignment=\"" + tf.getTextAlignement() + "\" verticalAlignment=\""+ tf.getVerticalAlig()  +"\">");
		  pw.write("<font size=\"" + tf.getSizeFont() 
		  		  + "\" isBold=\"" + (tf.isNegreta()?"true":"false") + "\" " 
		          +  (tf.isItalic()?" isItalic=\"true\"":"")
		          +  (tf.isUnderLined()?" isUnderline=\"true\"":"")
		          +getFontName(true, false)+"/>");
		  pw.write("<paragraph leftIndent=\""+tf.getLeftIndent()+"\"/>");
		  pw.write("</textElement>");
		  pw.write("<textFieldExpression>" + tf.getExpression() + "</textFieldExpression>");
		  pw.write("</textField>");
	}
	
	protected boolean generarGroups(BufferedWriter pw) {
		boolean bOk = true;
		try {
		  for (Group tempGroup : groups) {
			  pw.write("<group name=\""+tempGroup.getGroupName()+"\""+" isStartNewPage=\"" + (tempGroup.isStartInNewPage()?"\"true\"":"\"false\"") + "\" "+" isReprintHeaderOnEachPage=\"" + (tempGroup.isReprintHeaderOnEachPage()?"\"true\"":"\"false\"") + "\" minHeightToStartNewPage=\""+ tempGroup.getMinHeightToStartNewPage() +"\">");
			  if(tempGroup.getGroupExpresion() != null )
			    pw.write("<groupExpression>" + tempGroup.getGroupExpresion() + "</groupExpression>");
			  if(tempGroup.isHasGroupHeader()) {
				  pw.write("<groupHeader>");
				  for(Band headerBand: tempGroup.bandsHeader) {
					  pw.write("<band height=\""+headerBand.getHeight()+"\">");
					  if(headerBand.getPrintWhen() != null)
						  pw.write("<printWhenExpression>" + headerBand.getPrintWhen()  + "</printWhenExpression>");
					  for(TextField tf: headerBand.getTextFields()) {
						  generaTextField(tf,pw);
					  }					  
					  pw.write("</band>");
				  }				  
				  pw.write("</groupHeader>");
			  }
			  if(tempGroup.isHasGroupFooter()) {
				  pw.write("<groupFooter>");
				  for(Band footerBand: tempGroup.bandsFooter) {
					  pw.write("<band height=\""+footerBand.getHeight()+"\">");
					  if(footerBand.getPrintWhen() != null)
						  pw.write("<printWhenExpression>" + footerBand.getPrintWhen()  + "</printWhenExpression>");
					  for(TextField tf: footerBand.getTextFields()) {
						  generaTextField(tf,pw);
					  }					  
					  pw.write("</band>");				  
				  }
				  pw.write("</groupFooter>");
			  }				
			  pw.write("</group>");
		  }
		}
		catch(Exception ex) {
			bOk = false;
			sError = ex.getMessage();
		}
		return bOk;
	}
	
	protected boolean generarGrupos(BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<grupos.size();i++) pw.write(grupos.elementAt(i));
		}
		catch (IOException e) {
			bOk = false;
			sError = e.getMessage();
		}
		return bOk;
	}

	private boolean generarRoturas (BufferedWriter pw) {
		boolean bOk = true;
		try {
			int leftIndentTitol=10;
			for (int i=getNumRoturas()-1;i>=0;i--) {
				//for (int i=0; i<getNumRoturas();i++) {
				Rotura r = getRotura(i);
				String saltPage = "";
				if (r.isSaltoPagina()) saltPage = " isStartNewPage=\"true\" ";
				pw.write("<group name=\""+r.getNombre()+"\""+saltPage+" isReprintHeaderOnEachPage=\"true\" minHeightToStartNewPage=\""+ minHeightToStartNewPage +"\">");
				pw.write("<groupExpression><![CDATA["+r.getAgruparPor()+"]]></groupExpression>");
				pw.write("<groupHeader>");
				if(!r.isPrintGroupHeader()) {
					pw.write("<band/>");
				}
				else {
					pw.write("<band height=\""+r.getHeaderHeight()+"\">");
					pw.write("<frame>");
					pw.write("<reportElement mode=\"Opaque\" x=\"" + r.getPosX() + "\" y=\""+r.getPosY()+"\" width=\"" + columnWidth + "\" height=\"" + (r.getHeaderHeight() - r.getPosY()) + "\" backcolor=\"" + r.getBackGroundHeaderColor() + "\"/>");
					pw.write("<textField>");
					pw.write("<reportElement x=\"0\" y=\"0\" width=\"" + columnWidth + "\" height=\"" + (r.getHeaderHeight()-r.getPosY()) +"\"/>");
					pw.write("<textElement textAlignment=\"Left\" verticalAlignment=\"Middle\">");
					pw.write("<font size=\"" + r.getSizeFont() + "\" isBold=\"true\" "+getFontName(true, false)+"/>");
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
				else if (r.isNoImprimirSiTotalesEsCero()) {
					String printWhen = "";
					java.util.List<Totalizar> totals = r.getTotales();
					for (int c=0;c<totals.size();c++) {
						Columna col = totals.get(c).getColumna();
						String nom = "";
						if (col.getTf().isExpression()) nom = "tot"+i+col.getTf().getExpression();
						else if (col.getTf().esVariable()) nom = "tot"+i+col.getTf().getVariable().getNom();
						if (printWhen.length()>0) printWhen += " || ";
						printWhen += "($V{"+nom+"}!=null && $V{"+nom+"}!=0)";
					}
					pw.write("<printWhenExpression><![CDATA["+printWhen+"]]></printWhenExpression>");
				}





				java.util.List<Totalizar> totals = r.getTotales();
				if(!r.isSinRectangulo() && totals.size()>0) {
					pw.write("<rectangle radius=\"2\">");
					pw.write("<reportElement x=\"0\" y=\"0\" width=\"" + posActualColumnHeader +"\" height=\"" + (r.getHeaderHeight()+2) + "\" forecolor=\"" + r.getBackGroundHeaderColor() + "\"/>");
					pw.write("<graphicElement>");
					pw.write("<pen lineWidth=\"2.0\"/>");
					pw.write("</graphicElement>");
					pw.write("</rectangle>");
				}
				for (int c=0;c<totals.size();c++) {
					Columna col = totals.get(c).getColumna();
					TextField tf = new TextField(this,col.getPosIni(),1,col.getTamany(),r.getAnchura());
					tf.setAligDerecha(r.isAligDerecha());
					tf.setSizeFont(sizeDetalle+1);
					tf.setNegreta(r.isNegreta());
					tf.setItalic(r.isItalic());
					if(col.getTipo() == mae.general.jreports.Columna.DOUBLE)
						tf.setPattern("#,##0.00;-#,##0.00");
					tf.setColorFons(r.getColorFons());
					tf.setColorFont(r.getColorFont());
					tf.setAsignarColorFondo(r.isAligDerecha());
					if (r.isIgualIndent()) {
						tf.setRightIndent(col.getTf().getRightIndent());
						tf.setLeftIndent(col.getTf().getLeftIndent());

					}
					else {
						tf.setRightIndent(5);
					}
					String nom = "";
					tf.setVerticalAlig("Middle");
					if (col.getTf().isExpression()) nom = "tot"+i+col.getTf().getExpression();
					else if (col.getTf().esVariable()) nom = "tot"+i+col.getTf().getVariable().getNom();
					Variable v = new Variable(nom);
					tf.setVariable(v);
					if (r.getColumnasTotalesActivas() == null || r.getColumnasTotalesActivas().contains(c)) {
						generarTextField(pw, tf);
					}
				}
				if (r.getTitul()!=null && r.getTitul().trim().length()>0) {
					int widthTitol= 0;
					if (r.getWidthTitul()>0) widthTitol =r.getWidthTitul();
					else if (totals.size()>0) widthTitol=totals.get(0).getColumna().getTf().getPosIni();

					/*
					StaticText st = new StaticText(this,r.getPosIniciTitul(),1,widthTitol,r.getAnchura());
					st.setLiteral(r.getTitul());
					if (r.isAligDerecha()) st.setAligRight();
					st.setSizeFont(sizeDetalle+1);
					st.setRightIndent(15);
					st.setNegreta(r.isNegreta());
					st.setVerticalAlig("Middle");
					st.setColorFont(r.getColorFont());
					generarStaticText(pw, st);
					 */

					TextField tf = new TextField(this, r.getPosIniciTitul(), 1, widthTitol, r.getAnchura());
					tf.setEsExpresionCompleta(true);
					if (r.isTextoRoturaEsExpresion()) {
						tf.setExpression(r.getTitul());
					}
					else tf.setExpression("\""+r.getTitul()+"\"");
					if (r.isAligDerecha()) tf.setAligDerecha(true);
					tf.setSizeFont(sizeDetalle+1);
					tf.setRightIndent(15);
					if (r.isSinRectangulo() ){
						tf.setRightIndent(0);
						tf.setAligDerecha(false);
					}

					tf.setNegreta(r.isNegreta());
					tf.setItalic(r.isItalic());
					tf.setVerticalAlig("Middle");
					tf.setColorFont(r.getColorFont());
					generarTextField(pw, tf);

				}
				pw.write("</band>");
				pw.write("</groupFooter>");
				pw.write("</group>");
				leftIndentTitol++;
			}

		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	private boolean generarExtraDetail (BufferedWriter pw, ExtraBand eb) {
		boolean bOk = true;
		try {
			pw.write("<band height=\""+(eb.getColumnes().elementAt(0).getTf().getAmplada())+"\" splitType=\"Stretch\">");
			if (eb.getPrintWhen()!=null && eb.getPrintWhen().length()>0) pw.write("<printWhenExpression>"+eb.getPrintWhen()+"</printWhenExpression>");
			for (int i=0;i<eb.getColumnes().size();i++) {
				Columna c = eb.getColumnes().elementAt(i);
				generarTextField(pw, c.getTf());
			}
			pw.write("</band>");
		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	private boolean generarExtraDetail (BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<vDetailExtraBand.size();i++) generarExtraDetail (pw, vDetailExtraBand.elementAt(i));
		}
		catch (Exception e) {
			e.printStackTrace();
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	private boolean generarDetailEspecifico(BufferedWriter pw) {
		boolean bOk = true;
		try {			
			pw.write("<detail>");
			pw.write("<band height=\""+ detail.height+"\" splitType=\""+ detail.getSplitType() + "\">");
			if (detail.printWhen!=null && detail.printWhen.length()>0) pw.write("<printWhenExpression>"+detail.printWhen+"</printWhenExpression>");
			for (JasperObject jasperObject : detail.getJasperObject()) {
				generaJasperObject(jasperObject, pw);
			}
			pw.write("</band>");
			pw.write("</detail>");
			
			

		}
		catch (Exception e) {
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
				generarExtraDetail(pw);
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

	private boolean generarDummyHeader (BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<group name=\"dummy\" isReprintHeaderOnEachPage=\"true\" minHeightToStartNewPage=\""+minHeightToStartNewPage+"\">");
			pw.write("<groupHeader>");
			for (int i=0;i<dummyExtraFirstBands.size();i++) {
				generarExtraBand (pw,dummyExtraFirstBands.elementAt(i));
			}
			boolean hayColumnaSuperior = columnasSup.size()>0;
			if (hayColumnaSuperior) pw.write("<band height=\""+ (2*espacioDetalle+1) +"\">");
			else pw.write("<band height=\""+ (espacioDetalle+1) +"\">");
			if (getNumColumnas()>0) {
				for (int i=0;i<columnasSup.size();i++) {
					StaticText st = columnasSup.get(i);
					generarStaticText(pw, st);
				}
				for (int i=0;i<getNumColumnas();i++) {
					Columna c = getColumna(i);
					if (hayColumnaSuperior) c.getSt().setY(espacioDetalle);
					generarStaticText(pw, c.getSt());
				}
				pw.write("<line>");
				if (hayColumnaSuperior) pw.write("<reportElement x=\"0\" y=\""+(2*espacioDetalle)+"\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
				else pw.write("<reportElement x=\"0\" y=\""+espacioDetalle+"\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
				pw.write("</line>");
			}
			pw.write("</band>");
			for (int i=0;i<dummyExtraBands.size();i++) {
				generarExtraBand (pw,dummyExtraBands.elementAt(i));
			}
			pw.write("</groupHeader>");
			pw.write("</group>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	private void generarExtraBand (BufferedWriter pw, Band band) {
		try {
			pw.write("<band height=\""+band.getHeight()+"\">");
			if (band.getPrintWhen()!=null) pw.write("<printWhenExpression><![CDATA["+band.getPrintWhen()+"]]></printWhenExpression>");
			for (int j=0;j<band.getNumStatics();j++) {
				StaticText st = band.getStatic(j);
				generarStaticText(pw, st);
			}
			for (int j=0;j<band.getNumFields();j++) {
				TextField tf = band.getFields(j);
				generarTextField(pw, tf);
			}
			pw.write("</band>");
		}
		catch (Exception e) {
			sError = ""+e;
		}
	}
	public void addDummyExtraBand (Band b) {
		dummyExtraBands.addElement(b);
	}
	public void addDummyExtraFirstBand (Band b) {
		dummyExtraFirstBands.addElement(b);
	}

	protected boolean generarQueryString(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<queryString language=\"" + (isXmlDataSource?"xPath":"SQL") + "\">");
			pw.write("<![CDATA["+queryString+"]]>");
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
		else if (t == Columna.DATE ) tipo = "java.util.Date";
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
					pw.write("<variable name=\""+nom+"\" class=\"" + totals.get(c).getTipoClass() + "\" resetType=\"Group\" resetGroup=\""+r.getNombre()+"\" calculation=\""+totals.get(c).getTipoTotal()+"\">");
					if (col.getFormulaTotal()!=null && col.getFormulaTotal().length()>0) {
						pw.write("<variableExpression><![CDATA["+col.getFormulaTotal()+"]]></variableExpression>");
					}
					else if (r.getExpresionVariables()!=null && r.getExpresionVariables().length()>0) {
						String expvar = r.getExpresionVariables();
						expvar = expvar.replace("@@columna@@", expr);
						pw.write("<variableExpression><![CDATA["+expvar+"]]></variableExpression>");
					}
					else pw.write("<variableExpression><![CDATA["+expr+"]]></variableExpression>");
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


	protected boolean generarVariablesColumnas (BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<getNumColumnas();i++) {
				Columna c = getColumna(i);
				if (c.getTf().esVariable()) {
					String resetType = c.getTf().getVariable().getResetType();
					if (resetType == null || resetType.length()==0) resetType = "None";
					String resetGroup = c.getTf().getVariable().getResetGroup();
					if (resetGroup == null || resetGroup.length()==0) resetGroup = "";
					else resetGroup =  " resetGroup=\""+resetGroup+"\"";

					pw.write("<variable name=\""+c.getTf().getVariable().getNom()+"\" class=\""+getTipoFieldColumna(c.getTipo())+"\" resetType=\""+resetType+"\""+resetGroup+">");
					pw.write("<variableExpression><"+c.getTf().getVariable().getExpression()+"></variableExpression>");
					String initialValue = c.getTf().getVariable().getInitialValue();
					if (initialValue != null && initialValue.length()>0) pw.write("<initialValueExpression><![CDATA["+initialValue+"]]></initialValueExpression>");
					pw.write("</variable>");
				}
			}
			for (int z=0;z<encabezados.size();z++) {
				Encabezado e = encabezados.get(z);
				if(e.getTf().esVariable()) {
					String resetType = e.getTf().getVariable().getResetType();
					if (resetType == null || resetType.length()==0) resetType = "None";
					String resetGroup = e.getTf().getVariable().getResetGroup();
					if (resetGroup == null || resetGroup.length()==0) resetGroup = "";
					else resetGroup =  " resetGroup=\""+resetGroup+"\"";

					pw.write("<variable name=\""+e.getTf().getVariable().getNom()+"\" class=\""+getTipoFieldColumna(e.getTipo())+"\" resetType=\""+resetType+"\""+resetGroup+">");
					pw.write("<variableExpression><"+e.getTf().getVariable().getExpression()+"></variableExpression>");
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

	protected boolean generarExtraVariables (BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<vExtraVariables.size();i++) {
				Variable v = vExtraVariables.elementAt(i);
				String resetType = v.getResetType();
				if (resetType == null || resetType.length()==0) resetType = "None";
				String resetGroup = v.getResetGroup();
				if (resetGroup == null || resetGroup.length()==0) resetGroup = "";
				else resetGroup =  " resetGroup=\""+resetGroup+"\"";

				pw.write("<variable name=\""+v.getNom()+"\" class=\""+getTipoFieldColumna(v.getTipo())+"\" calculation=\"Sum\" resetType=\""+resetType+"\""+resetGroup+">");
				pw.write("<variableExpression><"+v.getExpression()+"></variableExpression>");
				String initialValue = v.getInitialValue();
				if (initialValue != null && initialValue.length()>0) pw.write("<initialValueExpression><![CDATA["+initialValue+"]]></initialValueExpression>");
				pw.write("</variable>");
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	/*
	private boolean generarFieldsOld(BufferedWriter pw) {
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
	 */
	protected boolean generarFields(BufferedWriter pw) {
		boolean bOk = true;
		try {
			Set<Entry<String, Integer>> set = fields.entrySet();
			Iterator<Entry<String, Integer>> it = set.iterator();
			while (it.hasNext()) {
				Map.Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
				if(!isXmlDataSource)
					pw.write("<field name=\""+entry.getKey()+"\" class=\""+getTipoField(entry.getValue())+"\"/>");
				else {
					pw.write("<field name=\""+entry.getKey()+"\" class=\""+getTipoField(entry.getValue())+"\">");
					pw.write("<fieldDescription><![CDATA[" +entry.getKey() + "]]></fieldDescription>");
					pw.write("</field>");
				}
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	/*
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
	 */
	protected boolean generarSubDataSet(BufferedWriter pw) {
		boolean bOk = true;
		try {
			if(slistado != null)
				pw.write("<subDataset name=\""+slistado.getName()+"\">");
			else
				pw.write("<subDataset name=\"byQuery\">");
			pw.write("<queryString language=\"" + (isXmlDataSource?"xPath":"SQL") + "\">");
			pw.write("<![CDATA["+queryString+"]]>");
			pw.write("</queryString>");
			Set<Entry<String, Integer>> set = fields.entrySet();
			Iterator<Entry<String, Integer>> it = set.iterator();
			while (it.hasNext()) {
				Map.Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
				pw.write("<field name=\""+entry.getKey()+"\" class=\""+getTipoField(entry.getValue())+"\"/>");
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
		else if (t == FieldDef.DATE ) tipo = "java.util.Date";
		return tipo;
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

	protected boolean generarPageHeader (BufferedWriter pw) {
		boolean bOk = true;
		boolean hayColumnaSuperior = columnasSup.size()>0;
		try {
			pw.write("<pageHeader>");
			int maxCol = 0;
			if (getTitolColumnasEncabezado()) {
				if (getNumColumnas()>0) {
					for (int i=0;i<getNumColumnas();i++) {
						if (maxCol<getColumna(i).getSt().getAmplada()) maxCol = getColumna(i).getSt().getAmplada();
					}
					maxCol += 10;
				}
			}
			int alzada= getTamanyoPageHeader()+espacioDetalle+maxCol;
			if (hayColumnaSuperior) alzada = getTamanyoPageHeader()+2*espacioDetalle+maxCol;
			if (sizePageHeader!=0) alzada = sizePageHeader;
			pw.write("<band height=\""+alzada+"\" splitType=\"Stretch\">");

			int posFinEncab = 0;
			String mo = "Opaque";
			if (bSinColor) {
				mo = "Transparent";
				stTitulo.setColorFont("#000000");
				stTitulo.setColorFons("#FFFFFF");
				stTitulo.setVerticalAlig("Middle");
				stTitulo.setAmplada(stTitulo.getAmplada()-1);
			}
			generarStaticText(pw, stTitulo);
			if (bSinColor) {
				pw.write("<line>");
				pw.write("<reportElement x=\"0\" y=\""+stTitulo.getAmplada()+"\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
				pw.write("</line>");
				stTitulo.setAmplada(stTitulo.getAmplada()+1);
			}
			if (getNumEncabezados()>0) {
				int y = stTitulo.getAmplada();
				for (int i=0;i<getNumEncabezados();i++) {
					Encabezado e = getEncabezado(i);
					pw.write("<frame>");
					pw.write("<reportElement mode=\""+mo+"\" x=\"" + e.getPosIniEnc() + "\" y=\""+ y + "\" width=\"" + rightWidthPosicion + "\" height=\""+e.getAmplada()+"\" backcolor=\"" + e.getBgColor() + "\"/>");
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
					posFinEncab = y;
				}
				if (bSinColor) {
					pw.write("<line>");
					pw.write("<reportElement x=\"0\" y=\""+posFinEncab+"\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
					pw.write("</line>");
					posFinEncab++;
				}
			}

			if (getTitolColumnasEncabezado()) {
				if (posFinEncabezado!=0) posFinEncab = posFinEncabezado;
				pw.write("<frame>");
				pw.write("<reportElement mode=\""+mo+"\" x=\"0\" y=\""+(posFinEncab+1)+"\" width=\""+rightWidthPosicion+"\" height=\"5\" backcolor=\"#FFFFFF\"/>");
				pw.write("</frame>");
				if (getNumColumnas()>0) {
					int amplada = 0;
					for (int i=0;i<columnasSup.size();i++) {
						StaticText st = columnasSup.get(i);
						if (st.getAmplada()>amplada) amplada = st.getAmplada();
						generarStaticText(pw, st,posFinEncab+5);
					}

					for (int i=0;i<getNumColumnas();i++) {
						Columna c = getColumna(i);
						generarStaticText(pw, c.getSt(),posFinEncab+5+amplada);
					}
					pw.write("<line>");
					pw.write("<reportElement x=\"0\" y=\""+(posFinEncab+maxCol+amplada)+"\" width=\""+columnWidth+"\" height=\"1\"  forecolor=\""+colorLineas+"\" />");
					pw.write("</line>");
				}
			}
			pw.write("</band>");
			pw.write("</pageHeader>");
		}
		catch (Exception e) {
			sError = ""+e;
			e.printStackTrace();
			bOk = false;
		}
		return bOk;
	}

	protected void generarStaticText (BufferedWriter pw, StaticText st)throws Exception {
		generarStaticText (pw, st,0);
	}

	protected void generarStaticText (BufferedWriter pw, StaticText st, int incrementarY     ) throws Exception {
		pw.write("<staticText>");
		String tran = "";
		if (st.isAsignarColorFondo()) tran = "mode=\"Opaque\" backcolor=\""+st.getColorFons()+"\" ";
		pw.write("<reportElement forecolor=\""+st.getColorFont()+"\" x=\""+st.getPosInicial()+"\" y=\""+(st.getY()+incrementarY)+"\" width=\""+st.getWidth()+"\" height=\""+st.getAmplada()+"\" "+tran+">");

		pw.write("<property name=\"net.sf.jasperreports.export.xls.auto.fit.column\" value=\"true\"/>");
		//pw.write("<property name=\"net.sf.jasperreports.export.xls.wrap.text\" value=\"true\"/>");
		pw.write("<property name=\"net.sf.jasperreports.print.keep.full.text\" value=\"true\"/>");
		pw.write("</reportElement>");
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

		String under = "";
		if (st.isUnderLine()) under = " isUnderline=\"true\"";
		if (st.isNegreta()) pw.write("<font isBold=\"true\" size=\""+st.getSizeFont()+"\" "+under+" "+getFontName(st.isNegreta(), false)+"/>");
		else pw.write("<font isBold=\"false\" size=\""+st.getSizeFont()+"\" "+under+" "+getFontName(st.isNegreta(), false)+"/>");
		pw.write(indent);
		//pw.write("<paragraph rightIndent=\""+espacioEntreColumnas+"\"/>");
		pw.write("</textElement>");
		pw.write("<text><![CDATA["+st.getLiteral()+"]]></text>");
		pw.write("</staticText>");
	}

	private void generarTextField (BufferedWriter pw, TextField tf) throws Exception {
		String pattern = "";
		if (tf.getPattern()!=null) pattern = " pattern=\""+tf.getPattern()+"\" ";
		String repeVal = " ";
		if (!tf.isPrintValoresRepetidos()) repeVal = " isPrintRepeatedValues=\"false\" ";
		String evaluation = "";
		if (tf.esVariable() && tf.getVariable().getEvaluationTime()!=null) evaluation = " evaluationTime=\""+tf.getVariable().getEvaluationTime()+"\" ";
		String isStretchWithOverflow="";
		if (tf.isStretchWithOverflow())isStretchWithOverflow=" isStretchWithOverflow=\"true\" ";
		pw.write("<textField isBlankWhenNull=\"true\""+pattern + evaluation + isStretchWithOverflow+">");
		String tran = "";
		if (tf.isAsignarColorFondo()) tran = "mode=\"Opaque\" backcolor=\""+tf.getColorFons()+"\" ";
		String estilo = "";
		if (!"".equals(tf.getStyle())) estilo = " style=\""+tf.getStyle()+"\" ";
    pw.write("<reportElement"+repeVal+estilo+"forecolor=\""+tf.getColorFont()+"\" x=\""+tf.getPosIni()+"\" y=\""+tf.getY()+"\" width=\""+tf.getWidth()+"\" height=\""+tf.getAmplada()+"\" "+tran+">");
/* aixo seria perque funciones correctament els estils
    if ("".equals(estilo)) pw.write("<reportElement"+repeVal+estilo+"forecolor=\""+tf.getColorFont()+"\" x=\""+tf.getPosIni()+"\" y=\""+tf.getY()+"\" width=\""+tf.getWidth()+"\" height=\""+tf.getAmplada()+"\" "+tran+">");
    else pw.write("<reportElement"+repeVal+estilo+" x=\""+tf.getPosIni()+"\" y=\""+tf.getY()+"\" width=\""+tf.getWidth()+"\" height=\""+tf.getAmplada()+"\" "+tran+">");*/
		pw.write("<property name=\"net.sf.jasperreports.export.xls.auto.fit.column\" value=\"true\"/>");
		pw.write("<property name=\"net.sf.jasperreports.print.keep.full.text\" value=\"true\"/>");
    pw.write("<property name=\"net.sf.jasperreports.text.truncate.at.char\" value=\"true\"/>");
		if (tf.getPrintWhen()!=null && tf.getPrintWhen().length()>0) {
			pw.write("<printWhenExpression>"+tf.getPrintWhen()+"</printWhenExpression>");
		}


		pw.write("</reportElement>");
		String indent ="";
		if (tf.isAligDerecha())  {
			pw.write("<textElement textAlignment=\"Right\" verticalAlignment=\""+tf.getVerticalAlig()+"\">");
			indent="<paragraph rightIndent=\""+tf.getRightIndent()+"\"/>";
			//pw.write("<paragraph rightIndent=\""+tf.getRightIndent()+"\"/>");
		}else if(tf.isCentered()) {
			pw.write("<textElement textAlignment=\"Center\" verticalAlignment=\""+tf.getVerticalAlig()+"\">");
			//indent="<paragraph rightIndent=\""+tf.getRightIndent()+"\"/>";
			//pw.write("<paragraph rightIndent=\""+tf.getRightIndent()+"\"/>");
		}
		else {
			pw.write("<textElement textAlignment=\"Left\" verticalAlignment=\""+tf.getVerticalAlig()+"\">");
			indent="<paragraph leftIndent=\""+tf.getLeftIndent()+"\"/>";
			//pw.write("<paragraph rightIndent=\""+tf.getLeftIndent()+"\"/>");
		}

		String italic = "";
//		if (tf.isItalic()) italic = " fontName=\"Arial\" pdfFontName=\"Arial\" isItalic=\"true\" pdfEncoding=\"Cp1250\" isPdfEmbedded=\"true\"";
		if (tf.isItalic()) italic = " isItalic=\"true\"";
		if (tf.isNegreta()) pw.write("<font isBold=\"true\" size=\""+tf.getSizeFont()+"\" "+italic+" "+getFontName(tf.isNegreta(),tf.isItalic())+" />");
		else pw.write("<font isBold=\"false\" size=\""+tf.getSizeFont()+"\" "+getFontName(tf.isNegreta(),tf.isItalic())+" "+italic+" />");
		//pw.write("<paragraph rightIndent=\""+espacioEntreColumnas+"\"/>");
		pw.write(indent);
		pw.write("</textElement>");
		if (tf.isEsExpresionCompleta()) pw.write("<textFieldExpression><![CDATA["+tf.getExpression()+"]]></textFieldExpression>");
		else if (tf.isExpression()) pw.write("<textFieldExpression><![CDATA[$F{"+tf.getExpression()+"}]]></textFieldExpression>");
		else if (tf.esVariable()) pw.write("<textFieldExpression><![CDATA[$V{"+tf.getVariable().getNom()+"}]]></textFieldExpression>");
		pw.write("</textField>");
	}

	private String getFontName(boolean negreta, boolean italic) {
		String nom = "Helvetica";
		if (negreta && italic) nom = "Helvetica-BoldOblique";
		else if (negreta) nom = "Helvetica-Bold";
		else if (italic) nom = "Helvetica-Oblique";
		return " pdfFontName=\""+nom+"\"";
	}

	public int getNumEncabezados() {
		return encabezados.size();
	}

	public int getNumColumnas() {
		return columnas.size();
	}

	public int getNumRoturas() {
		return roturas.size();
	}

	protected int getNumParameters() {
		return xmlParameter.size();
	}

	public int getNumTotales() {
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
					pw.write("<font isBold=\"true\" size=\""+col.getSt().getSizeFont()+"\"  "+getFontName(true, false)+"/>");
					pw.write("</textElement>");
					pw.write("<text><![CDATA[" + t.getTitol() + "]]></text>");
					pw.write("</staticText>");


					String pattern = "";
					if (t.getTipo() == Columna.DOUBLE) pattern = " pattern=\""+"#,##0.00;-#,##0.00"+"\" ";
					pw.write("<textField isBlankWhenNull=\"true\""+pattern+">");
					pw.write("<reportElement x=\"" + col.getPosIni() + "\" y=\"" + (espacioDetalle*2) + "\" width=\"" + col.getSt().getWidth() + "\" height=\"" + espacioDetalle + "\" forecolor=\""+ t.getColorFont() + "\"/>");
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
					pw.write("<font isBold=\"true\" size=\""+col.getTf().getSizeFont()+"\" "+getFontName(true, false)+"/>");
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

	protected boolean generarFinal(BufferedWriter pw) {
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

	protected boolean generarPageFooter(BufferedWriter pw) {
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
				st.setSizeFont(sizeDetalle);
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
			tf2.setSizeFont(sizeDetalle);
			tf2.setAligDerecha(true);
			tf2.setColorFont(colorPeuPagina);
			//Variable v = new Variable("PAGE_NUMBER");
			//tf2.setVariable(v);
			tf2.setEsExpresionCompleta(true);
			if (nombreVariablePaginaInicial != null) tf2.setExpression("$V{PAGE_NUMBER}+$P{"+nombreVariablePaginaInicial+"}");
			else tf2.setExpression("$V{PAGE_NUMBER}");
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
	protected boolean generarBandTitle(BufferedWriter pw) {
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

	protected boolean generarCabecera(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			pw.write("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\""+nombreReport+"\" language=\"groovy\" pageWidth=\""+pagewidth+"\" pageHeight=\""+pageheight+"\" " + tipoTratamientoSinDatos() + (orientacionPapel == Orientacion.HORIZONTAL?" orientation=\"Landscape\"":"") + " columnWidth=\""+columnWidth+"\" leftMargin=\""+margenizq+"\" rightMargin=\""+margender+"\" topMargin=\""+margensup+"\" bottomMargin=\""+margeninf+"\" isSummaryWithPageHeaderAndFooter=\"true\" >");
			pw.write("<property name=\"ireport.zoom\" value=\"2.0\"/>");
			pw.write("<property name=\"ireport.x\" value=\"0\"/>");
			pw.write("<property name=\"ireport.y\" value=\"0\"/>");
			if (propiedadesExcelAutomaticas) {
				for(int i=0; i<roturas.size();i++) {
					Rotura r = roturas.get(i);
					pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.band." + ((i*2)+10) +"\" value=\"groupFooter\"/>");
					pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.group." + ((i*2)+10) +"\" value=\"" + r.getNombre() +"\"/>");
					pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.band." + (((i*2)+1)+10) +"\" value=\"groupHeader\"/>");
					pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.group." + (((i*2)+1)+10) +"\" value=\"" + r.getNombre() +"\"/>");

				}
				pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.band.3\" value=\"pageFooter\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.band.4\" value=\"pageHeader\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.band.5\" value=\"groupFooter\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.group.5\" value=\"totales\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.keep.first.band.dummy\" value=\"groupHeader\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.csv.exclude.origin.keep.first.group.dummy\" value=\"dummy\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.xls.exclude.origin.band.2\" value=\"pageFooter\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.xls.remove.empty.space.between.rows\" value=\"true\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.xls.remove.empty.space.between.columns\" value=\"true\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.xls.white.page.background\" value=\"false\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.xls.detect.cell.type\" value=\"true\"/>");

				pw.write("<property name=\"net.sf.jasperreports.export.character.encoding\" value=\"ISO-8859-1\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.xls.collapse.row.span\" value=\"true\"/>");
				pw.write("<property name=\"net.sf.jasperreports.export.xls.wrap.text\" value=\"true\"/>");
				//pw.write("<property name=\"net.sf.jasperreports.export.csv.record.delimiter\" value=\"&#x0D;&#x0A;\"/>");
			}
			for (int i=0;i<vPropiedadesExcel.size();i++) {
				pw.write(vPropiedadesExcel.elementAt(i));
			}
			if (ignoreDuplicatePIEkey) pw.write("<property name=\"net.sf.jasperreports.chart.pie.ignore.duplicated.key\" value=\"true\"/>");

		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	protected boolean generarImportaciones(BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<getNumParameters();i++) {
				Parametro p = getParameter(i);
				if(p.isImport())
					pw.write("<import value=\"" + p.getTipus() + "\"/>");
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	protected boolean generarParametros(BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<getNumParameters();i++) {
				Parametro p = getParameter(i);
				pw.write("<parameter name=\"" + p.getName() + "\" class=\"" + p.getTipus() + "\">");
				if (p.getExpression()!=null) pw.write("<defaultValueExpression><" + p.getExpression() + "></defaultValueExpression>");
				pw.write("</parameter>");
			}
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

	public void setViewTotalesFinales(boolean viewTotalesFinales) {
		this.viewTotalesFinales = viewTotalesFinales;
	}
	public void setTitleHeight(int height) {
		this.titleHeight = height;
	}
	public void setTitolColumnasEncabezado(boolean titolColumnasEncabezado) {
		this.titolColumnasEncabezado = titolColumnasEncabezado;
	}
	public boolean getTitolColumnasEncabezado() {
		return titolColumnasEncabezado;
	}

	public void setWhenNoData(whenNoData noData) {
		sinDatos = noData;
	}
	public whenNoData getWhenNoData() {
		return sinDatos;
	}
	private String tipoTratamientoSinDatos() {
		if(sinDatos == null) return "";
		else if(sinDatos == whenNoData.NO_PAGES) return"";
		else if(sinDatos == whenNoData.BLANK_PAGE) return"whenNoDataType=\"BlankPage\"";
		else if(sinDatos == whenNoData.ALL_SECTIONS_NO_DETAIL) return"whenNoDataType=\"AllSectionsNoDetail\"";
		else if(sinDatos == whenNoData.NO_DATA_SECTION) return"whenNoDataType=\"NoDataSection\"";
		else return "";
	}

	public DBConnection getConnection() {
		return conn;
	}
	public void setConnection(DBConnection conn) {
		this.conn = conn;
	}

	public String formatearLiteral(String valor) {
		String valortmp = valor.replace("\"","\\\"");
		return valortmp;
	}
	
	public Band getDetail() {
		return detail;
	}

	public void setDetailBand(Band detail) {
		this.detail = detail;
	}
}
