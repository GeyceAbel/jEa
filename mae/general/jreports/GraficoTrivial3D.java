package mae.general.jreports;

import java.io.BufferedWriter;
import java.util.LinkedHashMap;

public class GraficoTrivial3D extends Grafico {
	private String campoClave;
	private String campoValor;
	private String prefix;

	public GraficoTrivial3D(String nombre, String sql,LinkedHashMap<String, Integer> fields, String titulo, tipoSPLIT tipo, String campoClave, String campoValor, boolean es3D, int ampladaSummary, int gruixSummary) {
		super (nombre,sql,fields,titulo,tipo, ampladaSummary, gruixSummary);
		this.campoClave = campoClave;
		this.campoValor = campoValor;
		if (es3D) prefix = "3D";
		else prefix = "";
	}

	public boolean generar (BufferedWriter pw) {
		boolean bOk = true;
		try {			
			pw.write("<pie"+prefix+"Chart>");
			pw.write("<chart isShowLegend=\"true\">");
			bOk = getLineaReportElement(pw);
			pw.write("<chartTitle position=\"Top\" color=\"#006699\">");
			pw.write("<font size=\""+tamanyFontTitul+"\" isBold=\"true\"/>");
			pw.write("<titleExpression><![CDATA[\""+titulo+"\"]]></titleExpression>");
			pw.write("</chartTitle>");
			pw.write("<chartSubtitle/>");
			pw.write("<chartLegend>");
			pw.write("<font size=\""+tamanyFontLlegenda+"\"/>");
			pw.write("</chartLegend>");
			pw.write("</chart>");
			pw.write("<pieDataset>");
			pw.write("<dataset>");
			pw.write("<datasetRun subDataset=\"sds_"+nombre+"\"/>");
			pw.write("</dataset>");
			pw.write("<keyExpression><![CDATA[$F{"+campoClave+"}]]></keyExpression>");
			pw.write("<valueExpression><![CDATA[$F{"+campoValor+"}]]></valueExpression>");
			pw.write("</pieDataset>");
			pw.write("<pie"+prefix+"Plot labelFormat=\"{2}\" legendLabelFormat=\"{0} ({2})\" isCircular=\"false\">");
			pw.write("<plot/>");
			pw.write("<itemLabel>");
			pw.write("<font size=\""+tamanyFontLabel+"\"/>");
			pw.write("</itemLabel>");
			pw.write("</pie"+prefix+"Plot>");
			pw.write("</pie"+prefix+"Chart>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
}
