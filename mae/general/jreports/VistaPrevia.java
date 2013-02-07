package mae.general.jreports;

import geyce.maefc.DBConnection;
import geyce.maefc.ErrorManagerDefault;
import geyce.maefc.Maefc;
import geyce.maefc.Windows;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.fill.AsynchronousFillHandle;
import net.sf.jasperreports.engine.fill.AsynchronousFilllListener;
import net.sf.jasperreports.view.JasperViewer;


public class VistaPrevia {
	private PrintingDialog pd;
	private String fichero;
	private DBConnection con;
	private String titulo;
	private JasperPrint jprint;
	private HashMap<String, Object> parametros;
	private JREmptyDataSource jrEmptyDataSource;


	public VistaPrevia(String fichero, DBConnection con, String titulo) {
		this.fichero = fichero;
		this.con = con;
	    this.titulo = titulo;
	    parametros = new HashMap<String, Object>();
    }
	
	public VistaPrevia(String rutaFicheroJRXML, JREmptyDataSource jrEmptyDataSource, String titulo) {
		this.fichero = rutaFicheroJRXML;
		this.jrEmptyDataSource = jrEmptyDataSource;
	    this.titulo = titulo;
	    parametros = new HashMap<String, Object>();
	    this.con = null;
	}

	public void setParameter ( HashMap<String, Object> parametros ) {
		this.parametros = parametros;
	}
	
	public void addParameter (String clau, String valor) {
		parametros.put(clau, valor);
	}
	
    public void compile() {
        try {
            JasperReport report = JasperCompileManager.compileReport(fichero);
            report.paginaActual = 0;
            AsynchronousFillHandle handle = null;
            if (con == null) handle = AsynchronousFillHandle.createHandle(report,parametros, jrEmptyDataSource);
            else handle = AsynchronousFillHandle.createHandle(report,parametros, con.getConnection());
            AsynchronousFilllListener listener = new AsynchronousFilllListener() {
				public void reportFinished(JasperPrint jp) {
					setJprint(jp);
					pd.close();
				}
				public void reportFillError(Throwable ex) {
				}
				public void reportCancelled() {
				}
			};			
            handle.addListener(listener);

            pd = new PrintingDialog (handle);            
            pd.setTitle(titulo);
            report.labelGenerando = pd.pagina;
            pd.show();
        } 
        catch (JRException jRException) {
        	System.out.println(jRException.getMessage());
        }
    }

	public JasperPrint getJprint() {
		return jprint;
	}

	public void setJprint(JasperPrint jprint) {
		this.jprint = jprint;
	}
}

