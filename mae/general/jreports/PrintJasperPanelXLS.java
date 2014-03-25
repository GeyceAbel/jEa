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

import net.sf.jasperreports.engine.JRAbstractExporter;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JExcelApiExporterParameter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRCsvExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;

public class PrintJasperPanelXLS extends PrintJasperPanel
{
	public ControlEdit     destino;
	public ControlButton   examinarDestino;
	//public ControlComboBox plantilla;
	//public ControlButton   examinarPlantilla;
	//public ControlCheck    archivoCSV;
	//public ControlCheck    archivoCSVcab;
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
		// Fitxer destí
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
					setMessageWarning("La extensión del archivo de salida tiene que ser ."+extensio);
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

		// Butó Examinar
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
				//super.onUserChage();
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
		

		// Butó crear
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

		//addPredeterminar();
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
				List<JasperPrint> jprintlist = new ArrayList<JasperPrint>();
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
					jprintlist.add(vp.getJprint());
				}
				FileOutputStream output = new FileOutputStream(new File(destino.getString()));
				if(!csv.getBoolean()) {
				  JRExporter exporter = null;
				  if (chxlsx.getBoolean()) exporter = new JRXlsxExporter();
				  else exporter = new JRXlsExporter();
				  exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT_LIST, jprintlist);
				  
				  if (job.multiPaginaExcel ) exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
				  exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM, output);
				  exporter.setParameter(JExcelApiExporterParameter.IS_COLLAPSE_ROW_SPAN, Boolean.TRUE);		
				  exporter.setParameter(JRXlsExporterParameter.IGNORE_PAGE_MARGINS, Boolean.TRUE);	
				  
				  exporter.exportReport();				
				  
				}
				//exportacio csv
				else {
					//final JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
				    JRAbstractExporter exporter = new JRCsvExporter();
				    exporter.setParameter(JRCsvExporterParameter.JASPER_PRINT_LIST, jprintlist);
				    exporter.setParameter(JRCsvExporterParameter.FIELD_DELIMITER, ";");				    
				    exporter.setParameter(JRCsvExporterParameter.OUTPUT_STREAM, output);
				    //exporter.setParameter(JRCsvExporterParameter.CHARACTER_ENCODING,"ISO-8859-1");
				    //exporter.setParameter(JRCsvExporterParameter.CHARACTER_ENCODING,"ISO-8859-1");
				    exporter.exportReport();	
				}
				output.close();
				bOk = true;
				if (!background && abrir.getBoolean()) abrir(destino.getString(),"Microsoft Excel");
				if (!background) job.dialog.exit();
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
