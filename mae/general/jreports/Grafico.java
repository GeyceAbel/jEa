package mae.general.jreports;

import geyce.maefc.FieldDef;

import java.io.BufferedWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public abstract class Grafico {
	public static enum tipoSPLIT {NINGUNO,IZQUIERDA,DERECHA,ARRIBA,ABAJO,IZQARR,IZQABA,DERARR,DERABA};
	protected String nombre;
	protected String sql;
	protected LinkedHashMap<String, Integer> fields;	
	protected String sError;	
	protected String titulo;
	protected tipoSPLIT tipoSplit;
	protected int ampladaSummary;
	protected int gruixSummary;	
	protected int tamanyFontTitul;
	protected int tamanyFontLlegenda;
	protected int tamanyFontLabel;
	
	public Grafico(String nombre, String sql,LinkedHashMap<String, Integer> fields, String titulo, tipoSPLIT tipoSplit, int ampladaSummary, int gruixSummary) {
		this.nombre = nombre;
		this.sql = sql;
		this.fields = fields;
		this.titulo = titulo;
		this.ampladaSummary = ampladaSummary;
		this.gruixSummary = gruixSummary;
		this.tipoSplit = tipoSplit;
		
		tamanyFontTitul = 14;
		tamanyFontLlegenda = 7;
		tamanyFontLabel = 6;
	}

	public boolean generarSubDataSet(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<subDataset name=\"sds_"+nombre+"\">");
			pw.write("<queryString language=\"SQL\">");
			pw.write("<![CDATA["+sql+"]]>");
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
		else if (t == FieldDef.DATE ) tipo = "java.sql.Timestamp";
		return tipo;
	}
	
	protected boolean getLineaReportElement(BufferedWriter pw) {
		boolean bOk = true;
		try {
			int offset = 20;
			int x = 0;
			int y = offset;
			int amplada = ampladaSummary;
			int gruix = gruixSummary - offset;
			if (tipoSplit == tipoSPLIT.ARRIBA) gruix /=2;
			else if (tipoSplit == tipoSPLIT.ABAJO) {
				gruix /=2;
				y = gruix+offset;
			}
			else if (tipoSplit == tipoSPLIT.IZQUIERDA) {
				amplada /=2;
			}
			else if (tipoSplit == tipoSPLIT.DERECHA) {
				amplada /=2;
				x = amplada;
			}
			else if (tipoSplit == tipoSPLIT.IZQARR) {
				amplada /=2;
				gruix /=2;
			}
			else if (tipoSplit == tipoSPLIT.IZQABA) {
				amplada /=2;
				gruix /=2;
				y = gruix+offset;
			}
			else if (tipoSplit == tipoSPLIT.DERARR) {
				amplada /=2;
				gruix /=2;
				x = amplada;
			}
			else if (tipoSplit == tipoSPLIT.DERABA) {
				amplada /=2;
				gruix /=2;
				x = amplada;
				y = gruix+offset;
			}				
			pw.write("<reportElement x=\""+x+"\" y=\""+y+"\" width=\""+amplada+"\" height=\""+gruix+"\"/>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	public abstract boolean generar (BufferedWriter pw);

	public int getAmpladaSummary() {
		return ampladaSummary;
	}

	public void setAmpladaSummary(int ampladaSummary) {
		this.ampladaSummary = ampladaSummary;
	}

	public int getTamanyFontTitul() {
		return tamanyFontTitul;
	}

	public void setTamanyFontTitul(int tamanyFontTitul) {
		this.tamanyFontTitul = tamanyFontTitul;
	}

	public int getTamanyFontLlegenda() {
		return tamanyFontLlegenda;
	}

	public void setTamanyFontLlegenda(int tamanyFontLlegenda) {
		this.tamanyFontLlegenda = tamanyFontLlegenda;
	}

	public int getTamanyFontLabel() {
		return tamanyFontLabel;
	}

	public void setTamanyFontLabel(int tamanyFontLabel) {
		this.tamanyFontLabel = tamanyFontLabel;
	}

}
