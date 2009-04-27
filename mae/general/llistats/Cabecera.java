package mae.general.llistats;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import geyce.maefc.Value;
import geyce.maefc.Report;
import geyce.maefc.Select;
import mae.general.Util;
import com.sun.xml.tree.XmlDocument;
import org.w3c.dom.*;

/*
import org.apache.poi.hssf.record.MergeCellsRecord;
import org.apache.poi.hssf.record.MergeCellsRecord.MergedRegion;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.*;
import org.apache.poi.hssf.util.*;
*/


public abstract class Cabecera {

	/**
	 * @uml.property  name="columnas"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" aggregation="composite" inverse="cabecera:mae.general.llistats.Columna"
	 */
	private List <Columna> columnas;
	/**
	 * @uml.property  name="roturas"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" aggregation="composite" inverse="cabecera:mae.general.llistats.Rotura"
	 */
	private List <Rotura> roturas;
	/**
	 * @uml.property  name="encabezados"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" aggregation="composite" inverse="cabecera:mae.general.llistats.Rotura"
	 */
	private List <Encabezado> encabezados;
	private int idVarListado;
	private Report reportListado;

	public Cabecera () {
    	columnas = new ArrayList <Columna>();
    	roturas = new ArrayList <Rotura>();
    	encabezados = new ArrayList <Encabezado>();
    	horizontal = false;
    	tamanyoLetra = 7;
    	idVarListado = 0;
    	idListado = "listado";
    	excel = false;
    }

    /*public Cabecera (Report r) {
    	columnas = new ArrayList <Columna>();
    	roturas = new ArrayList <Rotura>();
    	encabezados = new ArrayList <Encabezado>();
    	idVarListado = 0;
    	reportListado = r;
    }*/

    public void setReport (Report r) {
    	reportListado = r;
    }
    public Report getReport () {
    	return reportListado;
    }

	/**
	 * Getter of the property <tt>columnas</tt>
	 * @return  Returns the columnas.
	 * @uml.property  name="columnas"
	 */
	public List <Columna> getColumnas() {
		return columnas;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index  index of element to return.
	 * @return  the element at the specified position in this list.
	 * @see java.util.List#get(int)
	 * @uml.property  name="columnas"
	 */
	public Columna getColumna(int i) {
		return (Columna) columnas.get(i);
	}

	public Columna getColumna(String id) {
		boolean trobat = false;
		Columna col = null;
		for (int i=0;i<columnasSize() && !trobat;i++) {
			col = columnas.get(i);
			trobat = id.toUpperCase().equals(col.getId().toUpperCase());
		}
		return col;
	}

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 * @return  <tt>true</tt> if this list contains no elements.
	 * @see java.util.List#isEmpty()
	 * @uml.property  name="columnas"
	 */
	public boolean isColumnasEmpty() {
		return columnas.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this list contains the specified element.
	 * @param element  element whose presence in this list is to be tested.
	 * @return  <tt>true</tt> if this list contains the specified element.
	 * @see java.util.List#contains(Object)
	 * @uml.property  name="columnas"
	 */
	public boolean containsColumnas(Columna columna) {
		return columnas.contains(columna);
	}

	/**
	 * Returns the number of elements in this list.
	 * @return  the number of elements in this list.
	 * @see java.util.List#size()
	 * @uml.property  name="columnas"
	 */
	public int columnasSize() {
		return columnas.size();
	}

	/**
	 * Returns an array containing all of the elements in this list in proper sequence.
	 * @return  an array containing all of the elements in this list in proper sequence.
	 * @see java.util.List#toArray()
	 * @uml.property  name="columnas"
	 */
	public Columna[] columnasToArray() {
		return (Columna[]) columnas.toArray(new Columna[columnas.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this list are to be stored.
	 * @return  an array containing all of the elements in this list in proper sequence.
	 * @see java.util.List#toArray(Object[])
	 * @uml.property  name="columnas"
	 */
	public Columna[] columnasToArray(Columna[] columnas) {
		return (Columna[]) this.columnas.toArray(columnas);
	}

	/**
	 * Inserts the specified element at the specified position in this list (optional operation)
	 * @param index  index at which the specified element is to be inserted.
	 * @param element  element to be inserted.
	 * @see java.util.List#add(int,Object)
	 * @uml.property  name="columnas"
	 */
	public void addColumna(int index, Columna columna) {
		columna.setVarListado(nextIdVarListado());
		columnas.add(index, columna);
	}

	/**
	 * Appends the specified element to the end of this list (optional operation).
	 * @param element  element to be appended to this list.
	 * @return  <tt>true</tt> (as per the general contract of the <tt>Collection.add</tt> method).
	 * @see java.util.List#add(Object)
	 * @uml.property  name="columnas"
	 */
	public boolean addColumna(Columna columna) {
		columna.setVarListado(nextIdVarListado());
		return columnas.add(columna);
	}

	/**
	 * Removes the element at the specified position in this list (optional operation).
	 * @param index  the index of the element to removed.
	 * @return  the element previously at the specified position.
	 * @see java.util.List#remove(int)
	 * @uml.property  name="columnas"
	 */
	public Columna removeColumna(int index) {
		return columnas.remove(index);
	}

	/**
	 * Removes the first occurrence in this list of the specified element  (optional operation).
	 * @param element  element to be removed from this list, if present.
	 * @return  <tt>true</tt> if this list contained the specified element.
	 * @see java.util.List#remove(Object)
	 * @uml.property  name="columnas"
	 */
	public boolean removeColumna(Columna columna) {
		return columnas.remove(columna);
	}

	/**
	 * Removes all of the elements from this list (optional operation).
	 * @see java.util.List#clear()
	 * @uml.property  name="columnas"
	 */
	public void clearColumnas() {
		columnas.clear();
	}

	/**
	 * Setter of the property <tt>columnas</tt>
	 * @param columnas  the columnas to set.
	 * @uml.property  name="columnas"
	 */
	public void setColumnas(List <Columna> columnas) {
		this.columnas = columnas;
	}
	public void setColumna(int index, Columna col) {
		this.columnas.set(index, col);
	}

	/**
	 * Getter of the property <tt>encabezados</tt>
	 * @return  Returns the encabezados.
	 * @uml.property  name="encabezados"
	 */
	public List <Encabezado> getEncabezados() {
		return encabezados;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index  index of element to return.
	 * @return  the element at the specified position in this list.
	 * @see java.util.List#get(int)
	 * @uml.property  name="encabezados"
	 */
	public Encabezado getEncabezado(int i) {
		return encabezados.get(i);
	}

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 * @return  <tt>true</tt> if this list contains no elements.
	 * @see java.util.List#isEmpty()
	 * @uml.property  name="encabezados"
	 */
	public boolean isEncabezadosEmpty() {
		return encabezados.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this list contains the specified element.
	 * @param element  element whose presence in this list is to be tested.
	 * @return  <tt>true</tt> if this list contains the specified element.
	 * @see java.util.List#contains(Object)
	 * @uml.property  name="encabezados"
	 */
	public boolean containsEncabezados(Encabezado enc) {
		return encabezados.contains(enc);
	}

	/**
	 * Returns the number of elements in this list.
	 * @return  the number of elements in this list.
	 * @see java.util.List#size()
	 * @uml.property  name="encabezados"
	 */
	public int encabezadosSize() {
		return encabezados.size();
	}

	/**
	 * Returns an array containing all of the elements in this list in proper sequence.
	 * @return  an array containing all of the elements in this list in proper sequence.
	 * @see java.util.List#toArray()
	 * @uml.property  name="encabezados"
	 */
	public Encabezado[] encabezadosToArray() {
		return (Encabezado[]) encabezados.toArray(new Encabezado[encabezados.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this list are to be stored.
	 * @return  an array containing all of the elements in this list in proper sequence.
	 * @see java.util.List#toArray(Object[])
	 * @uml.property  name="encabezados"
	 */
	public Encabezado[] encabezadosToArray(Encabezado[] encabezados) {
		return (Encabezado[]) this.encabezados.toArray(encabezados);
	}

	/**
	 * Inserts the specified element at the specified position in this list (optional operation)
	 * @param index  index at which the specified element is to be inserted.
	 * @param element  element to be inserted.
	 * @see java.util.List#add(int,Object)
	 * @uml.property  name="encabezados"
	 */
	public void addEncabezado(int index, Encabezado enc) {
		enc.setVarListado(nextIdVarListado());
		encabezados.add(index, enc);
	}

	/**
	 * Appends the specified element to the end of this list (optional operation).
	 * @param element  element to be appended to this list.
	 * @return  <tt>true</tt> (as per the general contract of the <tt>Collection.add</tt> method).
	 * @see java.util.List#add(Object)
	 * @uml.property  name="encabezados"
	 */
	public boolean addEncabezado(Encabezado enc) {
		enc.setVarListado(nextIdVarListado());
		return encabezados.add(enc);
	}

	/**
	 * Removes the element at the specified position in this list (optional operation).
	 * @param index  the index of the element to removed.
	 * @return  the element previously at the specified position.
	 * @see java.util.List#remove(int)
	 * @uml.property  name="encabezados"
	 */
	public Encabezado removeEncabezado(int index) {
		return encabezados.remove(index);
	}

	/**
	 * Removes the first occurrence in this list of the specified element  (optional operation).
	 * @param element  element to be removed from this list, if present.
	 * @return  <tt>true</tt> if this list contained the specified element.
	 * @see java.util.List#remove(Object)
	 * @uml.property  name="encabezados"
	 */
	public boolean removeEncabezado(Encabezado enc) {
		return encabezados.remove(enc);
	}

	/**
	 * Removes all of the elements from this list (optional operation).
	 * @see java.util.List#clear()
	 * @uml.property  name="encabezados"
	 */
	public void clearEncabezado() {
		encabezados.clear();
	}

	/**
	 * Setter of the property <tt>columnas</tt>
	 * @param columnas  the columnas to set.
	 * @uml.property  name="encabezados"
	 */
	public void setEncabezado(List <Encabezado> encabezados) {
		this.encabezados = encabezados;
	}
	public void setEncabezado(int index, Encabezado enc) {
		this.encabezados.set(index, enc);
	}


	/**
	 * Getter of the property <tt>roturas</tt>
	 * @return  Returns the roturas.
	 * @uml.property  name="roturas"
	 */
	public List <Rotura> getRoturas() {
		return roturas;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index  index of element to return.
	 * @return  the element at the specified position in this list.
	 * @see java.util.List#get(int)
	 * @uml.property  name="roturas"
	 */
	public Rotura getRotura(int i) {
		return (Rotura) roturas.get(i);
	}

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 * @return  <tt>true</tt> if this list contains no elements.
	 * @see java.util.List#isEmpty()
	 * @uml.property  name="roturas"
	 */
	public boolean isRoturasEmpty() {
		return roturas.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this list contains the specified element.
	 * @param element  element whose presence in this list is to be tested.
	 * @return  <tt>true</tt> if this list contains the specified element.
	 * @see java.util.List#contains(Object)
	 * @uml.property  name="roturas"
	 */
	public boolean containsRotura(Rotura rotura) {
		return roturas.contains(rotura);
	}

	/**
	 * Returns the number of elements in this list.
	 * @return  the number of elements in this list.
	 * @see java.util.List#size()
	 * @uml.property  name="roturas"
	 */
	public int roturasSize() {
		return roturas.size();
	}

	/**
	 * Returns an array containing all of the elements in this list in proper sequence.
	 * @return  an array containing all of the elements in this list in proper sequence.
	 * @see java.util.List#toArray()
	 * @uml.property  name="roturas"
	 */
	public Rotura[] roturasToArray() {
		return (Rotura[]) roturas.toArray(new Rotura[roturas.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this list are to be stored.
	 * @return  an array containing all of the elements in this list in proper sequence.
	 * @see java.util.List#toArray(Object[])
	 * @uml.property  name="roturas"
	 */
	public Rotura[] roturasToArray(Rotura[] roturas) {
		return (Rotura[]) this.roturas.toArray(roturas);
	}

	/**
	 * Inserts the specified element at the specified position in this list (optional operation)
	 * @param index  index at which the specified element is to be inserted.
	 * @param element  element to be inserted.
	 * @see java.util.List#add(int,Object)
	 * @uml.property  name="roturas"
	 */
	public void addRotura(int index, Rotura rotura) {
		rotura.setVarListado(nextIdVarListado());
		roturas.add(index, rotura);
	}

	/**
	 * Appends the specified element to the end of this list (optional operation).
	 * @param element  element to be appended to this list.
	 * @return  <tt>true</tt> (as per the general contract of the <tt>Collection.add</tt> method).
	 * @see java.util.List#add(Object)
	 * @uml.property  name="roturas"
	 */
	public boolean addRotura(Rotura rotura) {
		rotura.setVarListado(nextIdVarListado());
		return roturas.add(rotura);
	}

	/**
	 * Removes the element at the specified position in this list (optional operation).
	 * @param index  the index of the element to removed.
	 * @return  the element previously at the specified position.
	 * @see java.util.List#remove(int)
	 * @uml.property  name="roturas"
	 */
	public Object removeRotura(int index) {
		return roturas.remove(index);
	}

	/**
	 * Removes the first occurrence in this list of the specified element  (optional operation).
	 * @param element  element to be removed from this list, if present.
	 * @return  <tt>true</tt> if this list contained the specified element.
	 * @see java.util.List#remove(Object)
	 * @uml.property  name="roturas"
	 */
	public boolean removeRotura(Rotura rotura) {
		return roturas.remove(rotura);
	}

	/**
	 * Removes all of the elements from this list (optional operation).
	 * @see java.util.List#clear()
	 * @uml.property  name="roturas"
	 */
	public void clearRoturas() {
		roturas.clear();
	}

	/**
	 * Setter of the property <tt>roturas</tt>
	 * @param roturas  the roturas to set.
	 * @uml.property  name="roturas"
	 */
	public void setRotura(List <Rotura> roturas) {
		this.roturas = roturas;
	}

	private String titulo1;
	private String titulo_corto;
	private Date fecha;
	private int paginaInicial;
	private boolean saltPagina;
	private Select selectListado;
	private boolean horizontal;
	private int tamanyoLetra;
	private XmlDocumentConstruct xml;
	private String idListado;
	private boolean repiteTitulo;
	private int numRoturaRep;
	private boolean excel;


	public void setRepiteTitulo (boolean b) {
		repiteTitulo = b;
	}

	public boolean getRepiteTitulo () {
		return repiteTitulo;
	}

	public String getIdListado () {
		return idListado;
	}
	public void setIdListado (String s) {
		idListado=s;
	}

	public void setTamanyoLetra (int i) {
		tamanyoLetra = i;
	}
	public int getTamanyoLetra () {
		return tamanyoLetra;
	}

	public void setNumRoturaRep (int i) {
		numRoturaRep = i;
	}
	public int getNumRoturaRep () {
		return numRoturaRep;
	}

	public void setHorizontal (boolean b) {
		horizontal = b;
	}

	public boolean getHorizontal () {
		return horizontal;
	}

	public void setSelect (Select sel) {
		selectListado = sel;
	}
	public Select getSelect () {
		return selectListado;
	}
	public void setSaltPagina (boolean b) {
		saltPagina = b;
	}

	public boolean getSaltPagina () {
		return saltPagina;
	}

	public Rotura newRotura(String titol, int [] cols, String under) {
		Rotura rot = new Rotura();
        rot.setTitulo(titol);
        rot.setPintaUnderline(true);
        rot.setSaltPagina(false);
        rot.setPosInicial(10);
        
        int numRotura = roturasSize();
        reportListado.addReportData(rot.initDesc(reportListado));
        addRotura(numRotura,rot);
        if (cols!=null) {
          for (int i=0;i<cols.length;i++) {
        	newTotal (numRotura,cols[i],under);
          }
        }
		return (getRotura(roturasSize()-1));
	}
	public void newTotal (int numRotura, int numColumna,String under) {
		TotalColumna total = new TotalColumna();
		total.setUnderline(under);
		total.setColumna(getColumna(numColumna));
		total.setOrden(numColumna);
    total.setEsContador(false);
		reportListado.addReportData(total.initValor(reportListado));
		getRotura(numRotura).addTotal(getRotura(numRotura).totalesSize(),total,nextIdVarListado());
	}

	public Encabezado newEncabezado (String lit, int posInicial, boolean literalBold) {
        Encabezado enc = new Encabezado();
        enc.setPosInicial(posInicial);
        enc.setLiteral(lit);
        enc.setLiteralBold(literalBold);
        reportListado.addReportData(enc.initValor(reportListado));
        addEncabezado(encabezadosSize(), enc);
        return (getEncabezado(encabezadosSize()-1));
	}
	/*
	public Columna newColumna (Field field, String id) {
		return newColumna(field,id,1);
	}
	public Columna newColumna (Field field, String id, int offset) {
        Columna cl = new Columna();
        cl.setId(id);
        reportListado.addReportData(cl.initValor(reportListado,field));
        cl.setLongitud(field.getDef().getLength());
        cl.setTitulo (field.getName());
        switch (field.getDef().getType()) {
            case geyce.maefc.Value.STRING:
        		cl.setTipoString();
        		cl.setTipoExcelString();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        	case geyce.maefc.Value.DATE:
        		cl.setTipoString();
        		cl.setTipoExcelDate();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        	case geyce.maefc.Value.DOUBLE:
        		cl.setTipoDecimal();
        		cl.setTipoExcelMoneda();
        		cl.setAliRight();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		cl.setMascara ("##,###,##0.00");
        		cl.setMascara0("-");
        		break;
        	case geyce.maefc.Value.INTEGER:
        		cl.setTipoEntero();
        		cl.setTipoExcelInt();
        		cl.setAliRight();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		cl.setMascara ("####");
        		cl.setMascara0(" ");
        		break;
        	default:
        		cl.setTipoString();
        		cl.setTipoExcelString();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        }
        addColumna(columnasSize(),cl);
        return getColumna(columnasSize()-1);
	}

	public Columna newColumna (ControlValue cv, String id) {
		return newColumna(cv,id,1);
	}
	public Columna newColumna (ControlValue cv, String id, int offset) {
        Columna cl = new Columna();
        cl.setId(id);
        reportListado.addReportData(cl.initValor(reportListado,cv));
        cl.setLongitud(cv.getLength());
        cl.setTitulo (cv.getTitle());
        switch (cv.getType()) {
            case geyce.maefc.Value.STRING:
        		cl.setTipoString();
        		cl.setTipoExcelString();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        	case geyce.maefc.Value.DATE:
        		cl.setTipoString();
        		cl.setTipoExcelDate();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        	case geyce.maefc.Value.DOUBLE:
        		cl.setTipoDecimal();
        		cl.setTipoExcelMoneda();
        		cl.setAliRight();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		cl.setMascara ("##,###,##0.00");
        		cl.setMascara0("-");
        		break;
        	case geyce.maefc.Value.INTEGER:
        		cl.setTipoEntero();
        		cl.setTipoExcelInt();
        		cl.setAliRight();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		cl.setMascara ("####");
        		cl.setMascara0(" ");
        		break;
        	default:
        		cl.setTipoString();
        		cl.setTipoExcelString();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        }
        addColumna(columnasSize(),cl);
        return getColumna(columnasSize()-1);
	}
	*/
	public Columna newColumna (int tipo, String id, int longitud, String titulo) {
		if (columnasSize()==0) return newColumna(tipo,id,longitud, titulo, 0);
		else return newColumna(tipo,id,longitud, titulo, 1);
	}
	public Columna newColumna (int tipo, String id, int longitud, String titulo, int offset) {
        Columna cl = new Columna();
        cl.setId(id);
        reportListado.addReportData(cl.initValor(reportListado));
        cl.setLongitud(longitud);
        cl.setTitulo (titulo);
        switch (tipo) {
            case Columna.TIPO_STRING:
        		cl.setTipoString();
        		cl.setTipoExcelString();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        	case Columna.TIPO_DECIMAL:
        		cl.setTipoDecimal();
        		cl.setTipoExcelMoneda();
        		cl.setAliRight();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		cl.setMascara ("##,###,##0.00");
        		cl.setMascara0("-");
        		break;
        	case Columna.TIPO_PORCEN:
        		cl.setTipoDecimal();
        		cl.setTipoExcelPorcen();
        		cl.setAliRight();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		cl.setMascara ("##.00");
        		cl.setMascara0(" ");
        		break;
        	case Columna.TIPO_ENTERO:
        		cl.setTipoEntero();
        		cl.setTipoExcelInt();
        		cl.setAliRight();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		cl.setMascara ("####");
        		cl.setMascara0(" ");
        		break;
        	default:
        		cl.setTipoString();
        		cl.setTipoExcelString();
        		cl.setAliLeft();
        		cl.setUnderTitulo("-");
        		cl.setPosIni(getLongitudLinea()+offset);
        		break;
        }
        addColumna(columnasSize(),cl);
        return getColumna(columnasSize()-1);
	}


	public void setTitulo1(String titulo1) {
		this.titulo1 = titulo1;
	}
	public void setTituloCorto(String titulo1) {
		this.titulo_corto = titulo1;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setPaginaInicial(int pagina) {
		if (pagina<=0) pagina = 1;
		paginaInicial = pagina;
	}
	public String getTituloCorto() {
		  return titulo_corto;
	}
	public String getTitulo1() {
	  return titulo1;
	}
	public String getFechaTexto() {
		Value v = new Value();
		v.setValue(fecha);
		return v.getString();
		}
	public Date getFecha() {
	  return fecha;
	}
	public int getPaginaInicial() {
	  return paginaInicial;
	}

	public void setIdVarListado (int i) {
		idVarListado = i;
	}
	public int getIdVarListado () {
		return idVarListado;
	}
	public int nextIdVarListado () {
		setIdVarListado(getIdVarListado()+1);
		return getIdVarListado();
	}


	public void initRoturas() {
		for (int i=0;i<roturasSize();i++) {
			getRotura(i).setActivada(false);
			getRotura(i).initTotales();
		}
	}

	public void activarRoturas() {
		for (int i=0;i<roturasSize();i++) {
			getRotura(i).setActivada(true);
		}
	}

	public void resetColumnas() {
		for (int j=0;j<columnasSize();j++) {
			getColumna(j).resetColumna();
		}
	}


	public void obtenirSeguent() {};

	public void llenarColumnas() {};

	public void comparadoresRoturas() {};

	public boolean checkRoturas() {
		boolean rotura = false;
		for (int i=roturas.size()-1; i>=0; i--) {
			if (rotura) {
				getRotura(i).setActivada(true);
			} else {
				rotura = getRotura(i).checkRotura();
			}
		}
		return rotura;
	}
	public void acumularTotales() {
		for (int i=0;i<roturasSize();i++) {
			getRotura(i).acumulaTotales();
		}
	}
	public int getLongitudLinea() {
		int longitud = 0;
		int ultimaCol = columnasSize()-1;
		if (ultimaCol>=0) {
			longitud = getColumna(ultimaCol).getPosIni() + getColumna(ultimaCol).getLongitud();
		}
		return longitud;
	}
	public boolean hayTituloSuperior() {
		boolean hayTituloSuperior = false;
		for (int i=0;i<columnasSize() && !hayTituloSuperior;i++) {
			hayTituloSuperior = (getColumna(i).getTituloSuperior().length()>0);
		}
		return hayTituloSuperior;
	}
	private void generaBloqueRepeticion (Element cond) {
	    xml.addBr(cond);
		for (int i=0;i<encabezadosSize();i++) {
			if (getEncabezado(i).getRepetido()) {
		      	xml.addTab(cond, getEncabezado(i).getPosInicial());
		       	if (getEncabezado(i).getLiteralBold()) xml.bold(cond, xml.Text(getEncabezado(i).getLiteral()));
		       	else xml.addText(cond, getEncabezado(i).getLiteral());
		       	xml.addVar(cond, getEncabezado(i).getVarListado(), false);
		       	xml.addBr(cond);
			}
		}
	    xml.addBr(cond);
	    xml.addBr(cond);
        boolean hayTituloSuperior = hayTituloSuperior();
        if (hayTituloSuperior) {
        	for (int i=0;i<columnasSize();i++) {
        		xml.addTab(cond,getColumna(i).getPosIni());
        		xml.bold(cond,xml.addText(cond, getColumna(i).getFormatoTituloSuperior()));
            }
   	        xml.addBr(cond);
        }
        for (int i=0;i<columnasSize();i++) {
    		xml.addTab(cond,getColumna(i).getPosIni());
    		xml.bold(cond,xml.addText(cond, getColumna(i).getFormatoTitulo()));
          }
        xml.addBr(cond);
        for (int i=0;i<columnasSize();i++) {
        	xml.addTab(cond,getColumna(i).getPosIni());
        	xml.bold(cond,xml.addText(cond, getColumna(i).getFormatoUnderlineTitulo()));
        }
	    xml.addBr(cond);
	    xml.addBr(cond);
	}
	private void generaBloqueDetalle (Element detail) {
		Element block2;
		Element detail2;
		block2 = xml.addBlock(detail, 2);
		detail2 = xml.addDetail(block2);
		if (getRepiteTitulo()) {
			Element condrepeat = xml.addCond(detail2, 21);
			generaBloqueRepeticion(condrepeat);
		}
        for (int i=0;i<columnasSize();i++) {
        	xml.addTab(detail2, getColumna(i).getPosIni());
        	xml.addVar(detail2, getColumna(i).getVarListado(), getColumna(i).getLongitud(), false);
        }
        xml.addBr(detail2);       
	}
	private void generaPageHeader(Element blockheader) {
    	int posPagina = getLongitudLinea() - 7;
		int posTitul = (getLongitudLinea() - getTitulo1().length())/2;
		if (posTitul<0) posTitul = 0;
		Value f = new Value();
		f.setValue(getFecha());
	    xml.addText(blockheader,f.getString());
	    xml.addTab(blockheader, posTitul);
	    xml.bold(blockheader, xml.Text(getTitulo1().toUpperCase()));
	    xml.addTab(blockheader, posPagina);
	    xml.addText(blockheader, "Pág: ");
	    xml.addSysVar(blockheader, "pagenumber");
	    xml.addBr(blockheader);
	    xml.addText(blockheader, Util.rpt("_", getLongitudLinea()));
	    xml.addBr(blockheader);
	    xml.addBr(blockheader);
	    boolean encabezadoPintado = false;
	    for (int i=0;i<encabezadosSize();i++) {
	    	if (!getEncabezado(i).getRepetido()) {
	          encabezadoPintado = true;
  	      	  xml.addTab(blockheader, getEncabezado(i).getPosInicial());
	       	  if (getEncabezado(i).getLiteralBold()) xml.bold(blockheader, xml.Text(getEncabezado(i).getLiteral()));
	       	  else xml.addText(blockheader, getEncabezado(i).getLiteral());
	       	  xml.addVar(blockheader, getEncabezado(i).getVarListado(), false);
	       	  xml.addBr(blockheader);
	    	}
	    }
	    if (encabezadoPintado) {
	    	xml.addText(blockheader, Util.rpt("_", getLongitudLinea()));
	    	xml.addBr(blockheader);
	    	xml.addBr(blockheader);
	    }
	    for (int i=0;i<encabezadosSize();i++) {
	    	if (getEncabezado(i).getRepetido()) {
  	      	  xml.addTab(blockheader, getEncabezado(i).getPosInicial());
	       	  if (getEncabezado(i).getLiteralBold()) xml.bold(blockheader, xml.Text(getEncabezado(i).getLiteral()));
	       	  else xml.addText(blockheader, getEncabezado(i).getLiteral());
	       	  xml.addVar(blockheader, getEncabezado(i).getVarListado(), false);
	       	  xml.addBr(blockheader);	       	  
	    	}
	    }

	    xml.addBr(blockheader);
        boolean hayTituloSuperior = hayTituloSuperior();
        if (hayTituloSuperior) {
        	for (int i=0;i<columnasSize();i++) {
        		xml.addTab(blockheader,getColumna(i).getPosIni());
        		xml.bold(blockheader,xml.addText(blockheader, getColumna(i).getFormatoTituloSuperior()));
            }
   	        xml.addBr(blockheader);
       }
      for (int i=0;i<columnasSize();i++) {
    	xml.addTab(blockheader,getColumna(i).getPosIni());
    	xml.bold(blockheader,xml.addText(blockheader, getColumna(i).getFormatoTitulo()));
      }
      xml.addBr(blockheader);
      for (int i=0;i<columnasSize();i++) {
       	xml.addTab(blockheader,getColumna(i).getPosIni());
       	xml.bold(blockheader,xml.addText(blockheader, getColumna(i).getFormatoUnderlineTitulo()));
         }
      xml.addBr(blockheader);
      xml.addBr(blockheader);
	}
	private void generaCondicionesRoturas (Element detail) {
		int id = 4;
        Element cond;
        for (int i=0;i<roturasSize();i++) {
        	cond = xml.addCond(detail, id);
        	if (getRotura(i).getPintaUnderline()) {
        		//xml.addText(cond, ".");
        		for (int j=0;j<getRotura(i).totalesSize();j++) {
            		if (getRotura(i).getTotal(j).getColumna()!=null) {
            			xml.addTab(cond, getRotura(i).getTotal(j).getColumna().getPosIni());
            			xml.addText(cond, getRotura(i).getTotal(j).getFormatoUnderline());
            		}
        		}
        		xml.addBr(cond);
        	}

        	//xml.addText(cond, ".");
        	//xml.addTab(cond, getRotura(i).getPosInicial());
        	//xml.addText(cond, getRotura(i).getTitulo());
        	//xml.addVar(cond, getRotura(i).getVarListado(),false);
        	boolean roturaPintada = false;
      		for (int j=0;j<getRotura(i).totalesSize();j++) {
           		if (getRotura(i).getTotal(j).getColumna()!=null) {
           			if (!roturaPintada && (getRotura(i).getPosInicial() < getRotura(i).getTotal(j).getColumna().getPosIni())) {
           	        	xml.addTab(cond, getRotura(i).getPosInicial());
           	        	xml.addText(cond, getRotura(i).getTitulo());
           	        	xml.addVar(cond, getRotura(i).getVarListado(),false);
           	        	roturaPintada = true;
           			}
           			xml.addTab(cond, getRotura(i).getTotal(j).getColumna().getPosIni());
           			xml.addVar(cond, getRotura(i).getTotal(j).getVarListado(), getRotura(i).getTotal(j).getColumna().getLongitud(), false);
           		}
       		}
   			if (!roturaPintada) {
   	        	xml.addTab(cond, getRotura(i).getPosInicial());
   	        	xml.addText(cond, getRotura(i).getTitulo());
   	        	xml.addVar(cond, getRotura(i).getVarListado(),false);
   	        	roturaPintada = true;
   			}
      		xml.addBr(cond);
       		if (getRotura(i).getDejarLineaBlanca()) xml.addBr(cond);
        	id++;
        }
	}
	public String getTipoExcel (int idTipo) {
		String tipo="STRING";
		switch (idTipo) {
		  case Columna.TIPO_EXCEL_DATE:
			tipo = "DATE";
	      break;
		  case Columna.TIPO_EXCEL_DOUBLE:
			tipo = "DOUBLE";
		  break;
		  case Columna.TIPO_EXCEL_INT:
			  tipo = "INT";
		  break;
		  case Columna.TIPO_EXCEL_MONEDA:
			  tipo = "MONEDA";
		  break;
		  case Columna.TIPO_EXCEL_PORC:
			  tipo = "PORCEN";
		  break;
		  case Columna.TIPO_EXCEL_STRING:
			  tipo = "STRING";
		  break;

		}
		return tipo;
	}
    public void montaExcel() {
	    Element informe = xml.getInforme();
	    Element excel = xml.addExcel(informe);
	    Element              block;
	    Element              blockheader;
	    Element              blockfooter;
	    Element              detail;
	    Element condXLS = xml.addCond(excel, 100);
	    block = xml.addBlock(excel, 1);
	    blockheader = xml.addPageHeader(block);
	    blockfooter = xml.addBlockFooter(block);
	    //detail = xml.addDetail(block);
	    xml.addText(blockheader, xml.Text("<"+getIdListado()+">"));
        xml.addText(blockheader, xml.Text("<titulo>" + getTitulo1().toUpperCase() + "</titulo>"));
        xml.addText(blockheader, xml.Text("<tituloexcel>" + getTituloCorto() + "</tituloexcel>"));
        xml.addText(blockheader, xml.Text("<fechaimpresion>" + getFechaTexto() + "</fechaimpresion>"));
        xml.addText(blockheader, xml.Text("<encabezados>"));
        for (int i=0;i<encabezadosSize();i++) {
        	if (!getEncabezado(i).getRepetido() && !getEncabezado(i).isNoVisualizarEnExcel()) {
        		xml.addText(blockheader, xml.Text("<encabezado literal=\""+getEncabezado(i).getLiteral()+"\" valor=\""));
        		xml.addVar(blockheader, getEncabezado(i).getVarListado(), true);
        		xml.addText(blockheader, xml.Text("\"/>"));
        	}
	    }
        for (int i=0;i<encabezadosSize();i++) {
        	if (getEncabezado(i).getRepetido() && !getEncabezado(i).isNoVisualizarEnExcel()) {
        		xml.addText(blockheader, xml.Text("<encabezado literal=\""+getEncabezado(i).getLiteral()+"\" valor=\""));
        		xml.addVar(blockheader, getEncabezado(i).getVarListado(), true);
        		xml.addText(blockheader, xml.Text("\"/>"));
        	}
	    }
	    xml.addText(blockheader, xml.Text("</encabezados>"));

	    if (hayTituloSuperior()) {
		    xml.addText(blockheader, xml.Text("<columnassup>"));
	        for (int i=0;i<columnasSize();i++) {
	        	xml.addText(blockheader, "<columnasup>"+getColumna(i).getTituloSuperior()+"</columnasup>");
	        }
	        xml.addText(blockheader, xml.Text("</columnassup>"));
	    }
	    xml.addText(blockheader, xml.Text("<columnas>"));
        for (int i=0;i<columnasSize();i++) {
        	String tipo = getTipoExcel(getColumna(i).getTipoExcel());
	    	xml.addText(blockheader, xml.Text("<columna tipo=\""+tipo+"\" valor=\""+getColumna(i).getTitulo()+"\"/>"));
        }
        xml.addText(blockheader, xml.Text("</columnas>"));
	    detail = xml.addDetail(block);
	    Element block2 = xml.addBlock(detail, 2);
	    Element detail2 = xml.addDetail(block2);
		if (getRepiteTitulo()) {
			Element condrepeat = xml.addCond(detail2, 21);
	        xml.addText(condrepeat, xml.Text("<encabezados>"));
	        for (int i=0;i<encabezadosSize();i++) {
	        	if (getEncabezado(i).getRepetido() && !getEncabezado(i).isNoVisualizarEnExcel()) {
	        		xml.addText(condrepeat, xml.Text("<encabezado literal=\""+getEncabezado(i).getLiteral()+"\" valor=\""));
	        		xml.addVar(condrepeat, getEncabezado(i).getVarListado(), true);
	        		xml.addText(condrepeat, xml.Text("\"/>"));
	        	}
		    }
		    xml.addText(condrepeat, xml.Text("</encabezados>"));
		    xml.addBr(condrepeat);
		    if (hayTituloSuperior()) {
			    xml.addText(condrepeat, xml.Text("<columnassup>"));
		        for (int i=0;i<columnasSize();i++) {
		        	xml.addText(condrepeat, "<columnasup>"+getColumna(i).getTituloSuperior()+"</columnasup>");
		        }
		        xml.addText(condrepeat, xml.Text("</columnassup>"));
		    }
		    xml.addText(condrepeat, xml.Text("<columnas>"));
	        for (int i=0;i<columnasSize();i++) {
	        	String tipo = getTipoExcel(getColumna(i).getTipoExcel());
		    	xml.addText(condrepeat, xml.Text("<columna tipo=\""+tipo+"\" valor=\""+getColumna(i).getTitulo()+"\"/>"));
	        }
	        xml.addText(condrepeat, xml.Text("</columnas>"));
	        xml.addBr(condrepeat);
		}
	    xml.addText(blockheader, xml.Text("<detalle>"));
	    xml.addText(detail2, xml.Text("<fila>"));
        for (int i=0;i<columnasSize();i++) {
    		xml.addText(detail2, "<valor>");
    		xml.addVar(detail2, getColumna(i).getVarListado(), true);
    		xml.addText(detail2, "</valor>");
        }
        xml.addText(detail2, xml.Text("</fila>"));
        xml.addBr(detail2);
        int numbloc = 4;
        for (int i=0;i<roturasSize();i++) {
        	Element cond = xml.addCond(detail, numbloc);
        	xml.addText(cond,"<rotura inicol=\""+getRotura(i).getIniColDescExcel()+"\" fincol=\""+getRotura(i).getFinColDescExcel()+"\"");
        	xml.addText(cond," desc=\""+getRotura(i).getTitulo());
        	xml.addVar(cond, getRotura(i).getVarListado(), true);
        	xml.addText(cond,"\">");
        	for (int j=0;j<getRotura(i).totalesSize();j++) {
        		xml.addText(cond, xml.Text("<total columna=\""+getRotura(i).getTotal(j).getOrden()+"\" valor=\""));
        		xml.addVar(cond, getRotura(i).getTotal(j).getVarListado(), true);
        		xml.addText(cond, xml.Text("\"/>"));
        	}
        	xml.addText(cond,"</rotura>");
        	xml.addBr(cond);
        	numbloc++;
        }
        // ***************************************
        Element cond = xml.addCond(detail, 3);
        xml.addText(cond,"</detalle>");
	    xml.addText(cond,"</"+getIdListado()+">");
	    xml.addText(cond, xml.Text("<"+getIdListado()+">"));
        xml.addText(cond, xml.Text("<titulo>" + getTitulo1().toUpperCase() + "</titulo>"));
        xml.addText(cond, xml.Text("<tituloexcel>" + getTituloCorto() + "</tituloexcel>"));
        xml.addText(cond, xml.Text("<fechaimpresion>" + getFechaTexto() + "</fechaimpresion>"));
        xml.addText(cond, xml.Text("<encabezados>"));
        for (int i=0;i<encabezadosSize();i++) {
	    	xml.addText(cond, xml.Text("<encabezado literal=\""+getEncabezado(i).getLiteral()+"\" valor=\""));
	    	xml.addVar(cond, getEncabezado(i).getVarListado(), true);
	       	xml.addText(cond, xml.Text("\"/>"));
	    }
	    xml.addText(cond, xml.Text("</encabezados>"));

	    if (hayTituloSuperior()) {
		    xml.addText(cond, xml.Text("<columnassup>"));
	        for (int i=0;i<columnasSize();i++) {
	        	xml.addText(cond, "<columnasup>"+getColumna(i).getTituloSuperior()+"</columnasup>");
	        }
	        xml.addText(cond, xml.Text("</columnassup>"));
	    }
	    xml.addText(cond, xml.Text("<columnas>"));
        for (int i=0;i<columnasSize();i++) {
        	String tipo = getTipoExcel(getColumna(i).getTipoExcel());
	    	xml.addText(cond, xml.Text("<columna tipo=\""+tipo+"\" valor=\""+getColumna(i).getTitulo()+"\"/>"));
        }
        xml.addText(cond, xml.Text("</columnas>"));
        xml.addText(cond,"<detalle>");
        // *****************************************
        xml.addText(blockfooter,"</detalle>");
	    xml.addText(blockfooter,"</"+getIdListado()+">");
	}
	private XmlDocument createXmlDocumentJeo() {
	    Element              block;
	    Element              blockheader;
	    Element              detail;
	    if (getHorizontal()) xml.landscape();
	    //xml.normal();
	    xml.fontSize(getTamanyoLetra());
	    block = xml.addBlock(1);
	    blockheader = xml.addPageHeader(block);
	    generaPageHeader(blockheader);
	    detail = xml.addDetail(block);
	    generaBloqueDetalle(detail);
	    generaCondicionesRoturas(detail);  // Blocs restants
	    Element cond3 = xml.addBlock(detail, 3);
	    xml.addPage(cond3);
	    montaExcel();
	    return xml.getXmlDocument();
	}
	public void generarXMLMemoria () {
		xml  = new XmlDocumentConstruct();
		XmlDocument xmlDocument = createXmlDocumentJeo();
		getReport().setXmlDocument(xmlDocument);

		try {
		xmlDocument.write(System.out);
		}
		catch (Exception e) {}

	}

	public boolean finalListado () {
		return selectListado.isEof();
	}
	public void siguienteRegistro() {
		selectListado.next();
	}
	public boolean printLineaDetalle () {
		return true;
	}
	public boolean pinta = false;
	public boolean onRecord (int bloc) {
	      boolean retorn=false;
	      switch (bloc) {
	      	case 100:
	      		excel = true;
	      		break;
	        case 1:
	          if (finalListado()) {
	            retorn=false;
	            }
	          else {
	            retorn=true;
	            omplirDadesCabecera();     //Implementar en la clase llistat
	            }
	          break;
	        case 21:
	        	if (!finalListado() && getRepiteTitulo()) {
	        	  retorn = pinta;
	        	  pinta = false;
	        	}	        	
	        	break;
	        case 2:
	          if (finalListado()) {
	            retorn=false;
	            activarRoturas();
	          }
	          else {
	        	boolean rotura = checkRoturas();
	        	if (!rotura) {
	              asignaValorsSelect();       //Implementar en la clase llistat
	              acumularTotales();  //Es Opcional d'implementar, depen del tipo de rotures.
	              siguienteRegistro(); //Es Opcional d'implementar, depen del tipo de llistats.
	              asignaRoturas();    //Implementar en la clase llistat
	              if (printLineaDetalle()) {
	            	  retorn = true;
	              }
	              else {
	                retorn=false;
	                if (finalListado()) activarRoturas();
	              }
	        	}
	            else retorn = false;
	          }
	          break;
	        case 3:
	        	retorn = false;
	        	if (getSaltPagina()) {
	        		setSaltPagina(false);
	        		if (!finalListado()) {
	        			omplirDadesCabecera();
	        			retorn = true;
	        			pinta = false;
	        		}
	        	}
	        	break;
	        default: // Total Agrupacio 1
	        	int protura = bloc-4;
	            if (!getRotura(protura).isActivada()) {
	              retorn=false;
	            }
	            else {
	            	if (getRepiteTitulo()) {
	            		if (protura==getNumRoturaRep()) pinta = true;
	            	}
	            	if (!getRotura(protura).isBlank()) {
	            		if (getRotura(protura).isResetNumPage())
	            			getReport().setPageNumber(getPaginaInicial()-1);
	            		if (!getSaltPagina()) setSaltPagina(getRotura(protura).getSaltPagina());
	            		getRotura(protura).clearRotura();
	            		retorn=true;
	            	}
	            	else {
	            		getRotura(protura).clearRotura();
	            		retorn = false;
	            	}
	            }
	            break;
	        }
	      //System.out.println ("case ["+bloc+"] ["+retorn+"]");
	      return retorn;
	}
	public void valorColumna (String id, String valor) {
		boolean trobat = false;
		for (int i=0;i<columnasSize()&& !trobat;i++) {
			Columna col = getColumna(i);
			if (col.getId().toUpperCase().equals(id.toUpperCase())) {
				col.setValor(valor);
				trobat = true;
			}
		}
	}
	public void valorColumna (String id, int valor) {
		boolean trobat = false;
		for (int i=0;i<columnasSize()&& !trobat;i++) {
			Columna col = getColumna(i);
			if (col.getId().toUpperCase().equals(id.toUpperCase())) {
				col.setValor(valor);
				trobat = true;
			}
		}
	}
	public void valorColumna (String id, double valor) {
		boolean trobat = false;
		for (int i=0;i<columnasSize()&& !trobat;i++) {
			Columna col = getColumna(i);
			if (col.getId().toUpperCase().equals(id.toUpperCase())) {
				col.setValor(valor);
				trobat = true;
			}
		}
	}
	/*public void generaFicheroXLS () {
		try {
			HSSFWorkbook wb = new HSSFWorkbook();
			generaFicheroXLS (wb);
			FileOutputStream fileOut = new FileOutputStream("workbook.xls");
			wb.write(fileOut);
			fileOut.close();
		}
    	catch (Exception e) {
	    		System.out.println("Error ["+e+"]");
	    	}
	}
	public void generaFicheroXLS (HSSFWorkbook wb)  {
    	try {
    		int numeroColumnes = columnasSize();
    		HSSFSheet sheet = wb.createSheet(getTituloCorto());
   			Region r = new Region (0,(short)0,0,(short)numeroColumnes);
   			sheet.addMergedRegion(r);
    		HSSFRow titol = sheet.createRow(0);
  			HSSFCell cell = titol.createCell((short)0);
  			HSSFRichTextString valor = new HSSFRichTextString(getTitulo1());
  			cell.setCellValue(valor);

    	}
    	catch (Exception e) {
    		System.out.println("Error ["+e+"]");
    	}
    }*/
	public void initListado() {
		initListado(true);
	}
	public void initListado(boolean resetNumPage) {
		if (resetNumPage) asignaNumInicialPagina();
		asignaRoturasInicial();
	}

	public void asignaNumInicialPagina() {
		reportListado.setPageNumber(getPaginaInicial());
	}
	public abstract void asignaRoturasInicial();
	public abstract void omplirDadesCabecera();
	public abstract void asignaRoturas();
	public abstract void asignaValorsSelect ();

	public boolean isExcel() {
		return excel;
	}

	public void setExcel(boolean excel) {
		this.excel = excel;
	}

}
