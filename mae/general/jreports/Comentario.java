package mae.general.jreports;

import java.io.BufferedWriter;

public class Comentario {
	public static enum tipoSPLIT {NINGUNO,IZQUIERDA,DERECHA,ARRIBA,ABAJO,IZQARR,IZQABA,DERARR,DERABA};
	protected tipoSPLIT tipoSplit;
	protected int ampladaSummary;
	protected int gruixSummary;	
	protected String sError;	
	private String texto;
	private String titulo;
	private boolean sinOffset;
	
	public Comentario (String titulo, String texto, tipoSPLIT tipoSplit, int ampladaSummary, int gruixSummary, JListado jl) {
		this.texto = texto;
		this.ampladaSummary = ampladaSummary;
		this.gruixSummary = gruixSummary;
		this.tipoSplit = tipoSplit;		
		this.titulo = titulo;
	}

	protected boolean generar(BufferedWriter pw) {
		boolean bOk = true;
		try {
			int offset= 20;
			if (sinOffset) offset = 0;
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
			if (titulo != null && titulo.length()>0) {
				pw.write("<staticText>");
				pw.write("<reportElement x=\""+x+"\" y=\""+y+"\" width=\""+amplada+"\" height=\""+22+"\" forecolor=\"#384B86\" />");
				pw.write("<textElement  verticalAlignment=\"Middle\">");
				pw.write("<font size=\"10\" isBold=\"true\" />");
				pw.write("</textElement>");
				pw.write("<text><![CDATA["+titulo+"]]></text>");
				pw.write("</staticText>");
				y+=22;
				gruix -= 22;
			}
			else {
				y+=5;
				gruix -= 5;
			}
			pw.write("<staticText>");
			pw.write("<reportElement x=\""+x+"\" y=\""+y+"\" width=\""+amplada+"\" height=\""+gruix+"\"/>");
			pw.write("<textElement>");
			pw.write("<font size=\"8\"/>");
			pw.write("</textElement>");			
			pw.write("<text><![CDATA["+texto+"]]></text>");
			pw.write("</staticText>");

			
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	public boolean isSinOffset() {
		return sinOffset;
	}

	public void setSinOffset(boolean sinOffset) {
		this.sinOffset = sinOffset;
	}
	

}
