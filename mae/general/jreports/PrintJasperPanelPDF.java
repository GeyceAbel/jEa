package mae.general.jreports;

import geyce.maefc.CheckGroup;
import geyce.maefc.ControlButton;
import geyce.maefc.ControlCheck;
import geyce.maefc.ControlComboBox;
import geyce.maefc.ControlEdit;
import geyce.maefc.ControlRadioButton;
import geyce.maefc.LayoutHtml;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Maefc;
import geyce.maefc.VisualComponent;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import com.jnetdirect.jsql.ab;

import mae.modasp.general.Modasp;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.view.JRSaveContributor;
import net.sf.jasperreports.view.JasperViewer;

public class PrintJasperPanelPDF extends PrintJasperPanel
{
	public ControlEdit        destino;
	public ControlButton      examinar;
	public ControlRadioButton vertical;
	public ControlRadioButton horizontal;
	//public ControlComboBox    hoja;
	public ControlEdit        margenSup;
	public ControlEdit        margenInf;
	public ControlEdit        margenIzq;
	public ControlEdit        margenDer;
	public ControlComboBox    tamañoLetra;
	public ControlCheck       abrir;
	public ControlButton      crear;
	private PrintJasperWork job;

	public PrintJasperPanelPDF(PrintJasperWork job)
	{
		super();
		this.job = job;
	}


	public VisualComponent getComponent()
	{
		setLayout(new LayoutHtml("mae/general/jreports/PrintPanelPDF.html"));
		creaControls();
		destino.setValue(job.destino+".pdf");
		abrir.setValue(job.abrir);
		vertical.setValue(!job.horizontal);
		horizontal.setValue(job.horizontal);
		//hoja.setValue(job.hoja);
		margenSup.setValue(job.margenSuperior);
		margenInf.setValue(job.margenInferior);
		margenIzq.setValue(job.margenIzquierdo);
		margenDer.setValue(job.margenDerecho);
		tamañoLetra.setValue(job.tamañoLetra);

		vertical.setEnabled(job.modifValores);
		horizontal.setValue(job.modifValores);
		//hoja.setEnabled(job.modifValores);
		margenSup.setEnabled(job.modifValores);
		margenInf.setEnabled(job.modifValores);
		margenIzq.setEnabled(job.modifValores);
		margenDer.setEnabled(job.modifValores);
		tamañoLetra.setEnabled(job.modifValores);
		return this;
	}

	public VisualComponent getTabComponent()
	{
		VisualComponent control = getComponent();
		LocationTabbed loc = new LocationTabbed();
		loc.setExitIcon(false);
		loc.setTitle("PDF");
		loc.setIcon(Maefc.getImageIcon("geyce/maefc/images/pdftab.gif"));
		control.setLocation(loc);
		return control;
	}

	protected void seleccionarArchivoSalida()
	{
		JFileChooser chooser = new JFileChooser();

		FileFilter filter = new FileFilter()
		{
			public boolean accept(File file)
			{
				if (file.isDirectory())
					return true;
				return file.getName().endsWith(".pdf");
			}

			public String getDescription()
			{
				return "Fichero PDF";
			}
		};

		chooser.setFileFilter(filter);
		chooser.setDialogTitle("Archivo PDF resultado del listado");
		if (!destino.isNull())
			chooser.setSelectedFile(new File(destino.getString()));
		if (chooser.showSaveDialog(geyce.maefc.swing.WSystemView.getFrame()) == JFileChooser.APPROVE_OPTION)
		{
			destino.setValue(chooser.getSelectedFile().getAbsolutePath());
		}
	}

	protected void creaControls()
	{
		// Fitxer destí
		destino = new ControlEdit(this)
		{
			public boolean valid()
			{
				int punt = destino.getString().lastIndexOf(".");
				if (punt < 0 || !destino.getString().substring(punt + 1).toUpperCase().equals("PDF"))
				{
					setMessageWarning("La extensión del archivo de salida tiene que ser .PDF");
					return false;
				}
				else
					return true;
			}
		};
		destino.setName("vvdestino");
		destino.setType(ControlEdit.STRING);
		destino.setLength(255);
		destino.setViewLength(60);
		destino.setObligate(true);
		addControl(destino);

		// Butó Examinar
		examinar = new ControlButton(this)
		{
			public void onClick()
			{
				seleccionarArchivoSalida();
			}
		};
		examinar.setName("vvexaminar");
		examinar.setTitle("Examinar...");
		examinar.setMnemonic('x');
		addControl(examinar);

		// Orientació
		CheckGroup group = new CheckGroup();

		// Vertical
		vertical = new ControlRadioButton(this);
		vertical.setName("vvvertical");
		vertical.setGroup(group);
		addControl(vertical);

		// Horizontal
		horizontal = new ControlRadioButton(this);
		horizontal.setName("vvhorizontal");
		horizontal.setGroup(group);
		addControl(horizontal);

		// Hoja
		/*
    hoja = new ControlComboBox(this);
    hoja.setName("vvhoja");
    hoja.setType(ControlEdit.STRING);
    hoja.setComboEditable(false);
    hoja.setObligate(true);
    hoja.addItem("LETTER", "");
    addControl(hoja);
		 */
		// Marges
		margenSup = new ControlEdit(this);
		margenSup.setName("vvmargensup");
		margenSup.setType(ControlEdit.DOUBLE);
		margenSup.setMaskInput("##.##");
		margenSup.setObligate(true);
		margenSup.setMax(10);
		addControl(margenSup);

		margenInf = new ControlEdit(this);
		margenInf.setName("vvmargeninf");
		margenInf.setType(ControlEdit.DOUBLE);
		margenInf.setMaskInput("##.##");
		margenInf.setObligate(true);
		margenInf.setMax(10);
		addControl(margenInf);

		margenIzq = new ControlEdit(this);
		margenIzq.setName("vvmargenizq");
		margenIzq.setType(ControlEdit.DOUBLE);
		margenIzq.setMaskInput("##.##");
		margenIzq.setObligate(true);
		margenIzq.setMax(10);
		addControl(margenIzq);

		margenDer = new ControlEdit(this);
		margenDer.setName("vvmargender");
		margenDer.setType(ControlEdit.DOUBLE);
		margenDer.setMaskInput("##.##");
		margenDer.setObligate(true);
		margenDer.setMax(10);
		addControl(margenDer);

		// Tamany font

		tamañoLetra = new ControlComboBox(this);
		tamañoLetra.setName("vvletra");
		tamañoLetra.setType(ControlEdit.INTEGER);
		tamañoLetra.setComboEditable(false);
		tamañoLetra.setDescriptionShow(false);
		tamañoLetra.setLength(20);
		for (int i=4;i<=12;i++) tamañoLetra.addItem(i);
		tamañoLetra.setObligate(true);
		addControl(tamañoLetra);

		// Abrir al finalizar
		abrir = new ControlCheck(this);
		abrir.setName("vvabrir");
		addControl(abrir);

		crear = new ControlButton(this)
		{
			public void onClick()
			{
				if (PrintJasperPanelPDF.this.isValid()) onImprimir();
			}
		};
		crear.setName("btimprimir");
		crear.setTitle("Generar PDF ...");
		crear.setMnemonic('G');
		crear.setImage("geyce/maefc/images/pdf.png");
		addControl(crear);

		addPredeterminar();
	}

	public void onImprimir() {	  
		if (noEstaAbiertoElFichero (destino.getString())) {
			try {    	  
				int startPage = 0;
				List<JasperPrint> jprintlist = new ArrayList<JasperPrint>();
				for (int i=0;i<job.vTarea.size();i++) {
					JListado jl = job.vTarea.elementAt(i);
					VistaPrevia vp = null;
					if (jl.sinDataSource)vp = new VistaPrevia(jl.rutaFicheroJRXML, new JREmptyDataSource(), job.titulo);    		  
					else if  (!jl.isXmlDataSource()) {
						if(jl.getConnection() != null) vp = new VistaPrevia(jl.rutaFicheroJRXML, jl.getConnection() , job.titulo);
						else vp = new VistaPrevia(jl.rutaFicheroJRXML, job.conn , job.titulo);
					}
					else vp = new VistaPrevia(jl.rutaFicheroJRXML, jl.getXmlDataSource() , job.titulo);   
					if (job.parametroPaginaInicial != null) {
						jl.getParameters().put(job.parametroPaginaInicial, new Integer(startPage));
					}
					vp.setParameter(jl.getParameters());
					vp.compile();    	
					JasperPrint jp = vp.getJprint();    		  
					jprintlist.add(jp);
					startPage += jp.getPages().size();
				}
				JRExporter exporter = new JRPdfExporter();
				exporter.setParameter(JRPdfExporterParameter.JASPER_PRINT_LIST, jprintlist);
				FileOutputStream output = new FileOutputStream(new File(destino.getString()));
				exporter.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, output);
				exporter.exportReport();
				output.close();
				if (abrir.getBoolean()) abrir(destino.getString(),"Adobe Reader");
				job.dialog.exit();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
