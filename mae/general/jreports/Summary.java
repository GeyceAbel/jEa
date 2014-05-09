package mae.general.jreports;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class Summary {
	public List <Grafico> graficos;
	public List <Comentario> comentarios;
	public int gruix;
	private String sError;
	
	public Summary (int amplada) {
		this.gruix = amplada;
		graficos = new ArrayList <Grafico>();
		comentarios = new ArrayList <Comentario>();
	}
	
	public Grafico addGrafico (Grafico grf) {
		graficos.add(grf);
		return grf;
	}
	
	public Comentario addComentario (Comentario c) {
		comentarios.add(c);
		return c;
	}
	
	public String getError (String error) {
		return sError;
	}
	
	public boolean haySummary () {
		return hayGraficos() || hayComentarios();
	}
	
	public boolean hayGraficos () {
		return graficos.size()>0;
	}
	
	public boolean hayComentarios () {
		return comentarios.size()>0;
	}

	public boolean generarSumary (BufferedWriter pw) {
		boolean bOk = true;
		if (haySummary()) {
			if (bOk) bOk = generarInicio(pw);
			if (bOk && hayGraficos()) bOk = generarGraficos(pw);
			if (bOk && hayComentarios()) bOk = generarComentarios(pw);
			if (bOk) bOk = generarFinal(pw);
		}
		return bOk;
	}
	
	private boolean generarGraficos(BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<graficos.size();i++) {
				Grafico gr = graficos.get(i);
				if (bOk) bOk = gr.generar (pw);
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}
	
	private boolean generarComentarios (BufferedWriter pw) {
		boolean bOk = true;
		try {
			for (int i=0;i<comentarios.size();i++) {
				Comentario co = comentarios.get(i);
				if (bOk) bOk = co.generar (pw);
			}
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	private boolean generarFinal(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("</band>");			
			pw.write("</summary>");
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	private boolean generarInicio(BufferedWriter pw) {
		boolean bOk = true;
		try {
			pw.write("<summary>");
			pw.write("<band height=\""+gruix+"\">");			
		}
		catch (Exception e) {
			sError = ""+e;
			bOk = false;
		}
		return bOk;
	}

	public int getGruix() {
		return gruix;
	}

	public void setGruix(int gruix) {
		this.gruix = gruix;
	}

}
