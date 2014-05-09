package mae.general.jreports;

import java.io.BufferedWriter;
import java.util.LinkedHashMap;

public class GraficoBarras3D extends Grafico {
	private String campoSerie;
	private String campoCategoria;
	private String campoValor;

	public GraficoBarras3D(String nombre, String sql,LinkedHashMap<String, Integer> fields, String titulo, tipoSPLIT tipo, String campoSerie, String campoCategoria, String campoValor, int ampladaSummary, int gruixSummary) {
		super (nombre,sql,fields,titulo,tipo, ampladaSummary, gruixSummary);
		this.campoSerie = campoSerie;
		this.campoCategoria = campoCategoria;
		this.campoValor = campoValor;
	}

	public boolean generar (BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<bar3DChart>");
			pw.write("<chart isShowLegend=\"true\">");
			bOk = getLineaReportElement (pw);
			pw.write("<chartTitle position=\"Top\" color=\"#006699\">");
			pw.write("<font size=\""+tamanyFontTitul+"\" isBold=\"true\"/>");
			pw.write("<titleExpression><![CDATA[\""+titulo+"\"]]></titleExpression>");
			pw.write("</chartTitle>");
			pw.write("<chartSubtitle/>");
			pw.write("<chartLegend>");
			pw.write("<font size=\""+tamanyFontLlegenda+"\"/>");
			pw.write("</chartLegend>");
			pw.write("</chart>");
			pw.write("<categoryDataset>");
			pw.write("<dataset>");
			pw.write("<datasetRun subDataset=\"sds_"+nombre+"\"/>");
			pw.write("</dataset>");
			pw.write("<categorySeries>");
			pw.write("<seriesExpression><![CDATA[$F{"+campoSerie+"}]]></seriesExpression>");
			pw.write("<categoryExpression><![CDATA[$F{"+campoCategoria+"}]]></categoryExpression>");
			pw.write("<valueExpression><![CDATA[$F{"+campoValor+"}]]></valueExpression>");
			pw.write("</categorySeries>");
			pw.write("</categoryDataset>");
			pw.write("<bar3DPlot>");
			pw.write("<plot/>");
			pw.write("<itemLabel/>");
			pw.write("<categoryAxisFormat>");
			pw.write("<axisFormat>");
			pw.write("<labelFont>");
			pw.write("<font size=\""+tamanyFontLabel+"\"/>");
			pw.write("</labelFont>");
			pw.write("<tickLabelFont>");
			pw.write("<font size=\""+tamanyFontLabel+"\"/>");
			pw.write("</tickLabelFont>");
			pw.write("</axisFormat>");
			pw.write("</categoryAxisFormat>");
			pw.write("</bar3DPlot>");
			pw.write("</bar3DChart>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
}
