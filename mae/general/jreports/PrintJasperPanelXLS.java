package mae.general.jreports;

import geyce.maefc.ControlButton;
import geyce.maefc.ControlCheck;
import geyce.maefc.ControlEdit;
import geyce.maefc.LayoutHtml;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Maefc;
import geyce.maefc.Value;
import geyce.maefc.VisualComponent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.ExporterInputItem;
import net.sf.jasperreports.export.SimpleCsvExporterConfiguration;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleExporterInputItem;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

public class PrintJasperPanelXLS extends PrintJasperPanel
{
	public ControlEdit     destino;
	public ControlButton   examinarDestino;
	public ControlButton   crear;
	public ControlCheck    abrir;
	public ControlCheck    csv;
	public ControlCheck    chxlsx;
	private PrintJasperWork job;

	public PrintJasperPanelXLS(PrintJasperWork job) {
		super();
		this.job = job;
	}

	public VisualComponent getComponent()
	{
		setLayout(new LayoutHtml("mae/general/jreports/PrintPanelExcel.html"));
		creaControls();
		destino.setValue(job.destino+".xls");
		abrir.setValue(job.abrir);
		return this;
	}

	public VisualComponent getTabComponent()
	{
		VisualComponent control = getComponent();
		LocationTabbed loc = new LocationTabbed();
		loc.setExitIcon(false);
		loc.setTitle("Excel");
		loc.setIcon(Maefc.getImageIcon("geyce/maefc/images/exceltab.gif"));
		control.setLocation(loc);
		return control;
	}

	protected void creaControls()
	{
		// Fitxer dest?
		destino = new ControlEdit(this)
		{
			public boolean valid()
			{
				int punt = destino.getString().lastIndexOf(".");
				String extensio="";
				if(csv.getBoolean())extensio="CSV";
				else if (chxlsx.getBoolean()) extensio="XLSX";
				else extensio="XLS";				 
				if (punt < 0 || !destino.getString().substring(punt + 1).toUpperCase().equals(extensio))
				{
					setMessageWarning("La extensi?n del archivo de salida tiene que ser ."+extensio);
					return false;
				}
				else
					return true;
			}
		};
		destino.setName("vvdestino");
		destino.setType(ControlEdit.STRING);
		destino.setLength(256);
		destino.setViewLength(63);
		destino.setObligate(true);
		addControl(destino);

		// But? Examinar
		examinarDestino = new ControlButton(this)
		{
			public void onClick()
			{
				seleccionarArchivoSalida();
			}
		};
		examinarDestino.setName("vvexaminardestino");
		examinarDestino.setTitle("Examinar...");
		examinarDestino.setMnemonic('x');
		addControl(examinarDestino);



		// Abrir al finalizar
		abrir = new ControlCheck(this);
		abrir.setName("vvabrir");
		addControl(abrir);

		// csv
		csv = new ControlCheck(this) {
			public void userChange(Value v) {
				if(v.getBoolean()) destino.setValue(destino.getString().replace(".xls", ".csv"));
				else destino.setValue(destino.getString().replace(".csv", ".xls"));
				super.userChange(v);
				this.show();
			}
		};
		csv.setName("vvformatocsv");
		addControl(csv);
		// chxlsx
		chxlsx = new ControlCheck(this) {
			public void userChange(Value v) {
				if(v.getBoolean()) destino.setValue(destino.getString().replace(".xls", ".xlsx"));
				else destino.setValue(destino.getString().replace(".xlsx", ".xls"));
				super.userChange(v);
				this.show();
			}
		};		
		chxlsx.setName("chxlsx");
		addControl(chxlsx);


		// But? crear
		crear = new ControlButton(this)
		{
			public void onClick()
			{
				if (PrintJasperPanelXLS.this.isValid()) onGenerar();
			}
		};
		crear.setName("btgenerar");
		crear.setTitle("Generar Excel ...");
		crear.setMnemonic('G');
		crear.setImage("geyce/maefc/images/excel.png");

		addControl(crear);
	}

	public boolean onGenerar()
	{
		return onGenerar (false);
	}

	public boolean onGenerar (boolean background)
	{
		boolean bOk = false;
		if (noEstaAbiertoElFichero (destino.getString(),!background)) {
			try {
				List<ExporterInputItem> jprintlist = new ArrayList<ExporterInputItem>();
				for (int i=0;i<job.vTarea.size();i++) {
					JListado jl = job.vTarea.elementAt(i);
					if(job.isQuery()) jl.generalJRXML();
					VistaPrevia vp = null;
					if (jl.sinDataSource)vp = new VistaPrevia(jl.rutaFicheroJRXML, new JREmptyDataSource(), job.titulo);    		  
					else if  (!jl.isXmlDataSource()) {
						if(jl.getConnection() != null) vp = new VistaPrevia(jl.rutaFicheroJRXML, jl.getConnection() , job.titulo);
						else vp = new VistaPrevia(jl.rutaFicheroJRXML, job.conn , job.titulo);
					}
					else vp = new VistaPrevia(jl.rutaFicheroJRXML, jl.getXmlDataSource() , job.titulo);
					if (jl.paginarExcel ) jl.getParameters().put(JRParameter.IS_IGNORE_PAGINATION,Boolean.TRUE);
					vp.setParameter(jl.getParameters());				
					vp.compile();    	
					jprintlist.add(new SimpleExporterInputItem (vp.getJprint()));
				}				
				if(!csv.getBoolean()) {
					
					/*
					JRExporter exporter = null;
					if (chxlsx.getBoolean()) exporter = new JRXlsxExporter();
					else exporter = new JRXlsExporter();
					exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT_LIST, jprintlist);

					if (job.multiPaginaExcel ) exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
					exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM, output);
					exporter.setParameter(JExcelApiExporterParameter.IS_COLLAPSE_ROW_SPAN, Boolean.TRUE);		
					exporter.setParameter(JRXlsExporterParameter.IGNORE_PAGE_MARGINS, Boolean.TRUE);	

					exporter.exportReport();
					*/

					FileOutputStream out = new FileOutputStream(new File(destino.getString()));
					if (chxlsx.getBoolean()) {
						JRXlsxExporter exporter = new JRXlsxExporter();
						SimpleXlsxReportConfiguration repConfig = new SimpleXlsxReportConfiguration();
						
						exporter.setExporterInput(new SimpleExporterInput(jprintlist));
						exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(out));
						if (job.multiPaginaExcel ) repConfig.setOnePagePerSheet(true);
						repConfig.setCollapseRowSpan(true);
						repConfig.setIgnorePageMargins(true);
						exporter.setConfiguration(repConfig);
						exporter.exportReport();          
						out.close();						
					}
					else {
						JRXlsExporter exporter = new JRXlsExporter();
						SimpleXlsReportConfiguration repConfig = new SimpleXlsReportConfiguration();
						
						exporter.setExporterInput(new SimpleExporterInput(jprintlist));
						exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(out));
						if (job.multiPaginaExcel ) repConfig.setOnePagePerSheet(true);
						repConfig.setCollapseRowSpan(true);
						repConfig.setIgnorePageMargins(true);
						exporter.setConfiguration(repConfig);
						exporter.exportReport();          
						out.close();						
					}
				}
				//exportacio csv
				else {
					/*
					JRAbstractExporter exporter = new JRCsvExporter();
					exporter.setParameter(JRCsvExporterParameter.JASPER_PRINT_LIST, jprintlist);
					exporter.setParameter(JRCsvExporterParameter.FIELD_DELIMITER, ";");				    
					exporter.setParameter(JRCsvExporterParameter.OUTPUT_STREAM, output);
					exporter.exportReport();
					*/
					
		            JRCsvExporter csvExporter = new JRCsvExporter();
		            csvExporter.setExporterInput(new SimpleExporterInput(jprintlist));
		            csvExporter.setExporterOutput(new SimpleWriterExporterOutput(destino.getString()));
		            SimpleCsvExporterConfiguration cfgcsv = new SimpleCsvExporterConfiguration();
		            cfgcsv.setFieldDelimiter(";");
		            csvExporter.setConfiguration(cfgcsv);
		            csvExporter.exportReport();
				}
				
				bOk = true;
				if (!background) job.dialog.exit();
				if (!csv.getBoolean() && job.editarExcelAlFinalizar) job.editXLS (destino.getString(),chxlsx.getBoolean());
				if (!background && abrir.getBoolean()) abrir(destino.getString(),"Microsoft Excel");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bOk;
	}




	protected void seleccionarArchivoSalida()
	{
		JFileChooser chooser = new JFileChooser();

		FileFilter filter = new FileFilter()
		{
			public boolean accept(File file)
			{
				if (file.isDirectory()) return true;
				return file.getName().toUpperCase().endsWith(".XLS");
			}

			public String getDescription()
			{
				return "Archivo XLS";
			}
		};
		chooser.setFileFilter(filter);
		chooser.setDialogTitle("Archivo XLS resultado del listado");
		if (!destino.isNull()) chooser.setSelectedFile(new File(destino.getString()));
		if (chooser.showSaveDialog(geyce.maefc.swing.WSystemView.getFrame()) == JFileChooser.APPROVE_OPTION) {
			destino.setValue(chooser.getSelectedFile().getAbsolutePath());
		}
	}
}
