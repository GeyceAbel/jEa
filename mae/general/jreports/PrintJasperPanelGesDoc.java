package mae.general.jreports;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import geyce.maefc.ControlButton;
import geyce.maefc.ControlCheck;
import geyce.maefc.ControlEdit;
import geyce.maefc.ControlEditPane;
import geyce.maefc.ControlImage;
import geyce.maefc.ControlRadioButton;
import geyce.maefc.Fieldset;
import geyce.maefc.LayoutFieldset;
import geyce.maefc.LocationTabbed;
import geyce.maefc.LookComponent;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import geyce.maefc.Value;
import geyce.maefc.VisualComponent;
import mae.easp.general.Easp;
import mae.easp.prgdubicacion.ProgPrgdubicacion;
import mae.general.Azure;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.ExporterInputItem;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleExporterInputItem;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

public class PrintJasperPanelGesDoc extends PrintJasperPanel
{
	public ControlEdit     ce_cdpafinity;
	public ControlEdit     ce_nombre;
	public ControlEdit     ce_nombrefichero;
	public ControlRadioButton crb_pdf;
	public ControlRadioButton crb_excel;
	public ControlEdit     ce_ubicaciongd;
	public ControlEdit     ce_desc;	
	public ControlButton   cb_examinar;
	public ControlEditPane cep_etiqgyc; 
	public ControlCheck    cc_sendmail;
	public ControlEdit     ce_mail;	
	public ControlButton   cb_enviar;

	private PrintJasperWork job;
	private IGesDoc oGD;
	private UbicacionGD ubicacionUsuario;

	public PrintJasperPanelGesDoc(PrintJasperWork job)
	{
		super();
		this.job = job;
		this.oGD = job.getGD();
	}

	public VisualComponent getComponent()
	{
		setLayout(new LayoutFieldset(this));
		creaControls();
		return this;
	}

	public VisualComponent getTabComponent()
	{
		VisualComponent control = getComponent();
		LocationTabbed loc = new LocationTabbed();
		loc.setExitIcon(false);
		loc.setTitle("GesDoc");
		loc.setIcon(Maefc.getImageIcon("mae/general/jreports/gesdoc.png"));
		control.setLocation(loc);
		return control;
	}

	private void creaControls()
	{
		crearClientePortal ();
		crearFicheroDestino ();
		crearFormato();
		crearEtiquetas ();
		crearUbicacionGD ();
		crearMail();
		creaEnviar();

		valoresControl();
	}

	private void creaEnviar() {
		cb_enviar = new ControlButton(this)
		{
			public void onClick()
			{
				try {
					onEnviar();
				} 
				catch (Exception e) {
					e.printStackTrace();
					Maefc.message(""+e,"¡Atención!");
				}
			}
		};
		cb_enviar.setName("cb_enviar");
		cb_enviar.setTitle("Subir   Fichero");
		cb_enviar.setMnemonic('G');
		cb_enviar.setImage("mae/general/jreports/gesdoc32.png");
		addControl(cb_enviar);

		Fieldset fs = new Fieldset(this);
		fs.getWebProperties().setAnchoColumnas(6);
		fs.getWebProperties().setSizeLineaSup(15);
		fs.addControl(cb_enviar);
		addFieldset(fs);

	}

	private void valoresControl() {
		ce_cdpafinity.setValue(oGD.getCDPAfinity());
		ce_nombre.setValue(oGD.getNombre());
		if (oGD.esExcel()) crb_excel.setValue(true);
		else  crb_pdf.setValue(true);
		asignarNombreFichero();
		ce_ubicaciongd.setValue(oGD.getUbicacionGD());
		ce_desc.setValue(oGD.getDescripciónFichero());
		String val = null;
		for (IEtiquetaGD e: oGD.getEtiquetas()) {
			if (val == null) val = "";
			else val += "\n";
			val += e.getIdentificador().toString()+": "+e.getValor();
		}
		cep_etiqgyc.setValue(val);
		cc_sendmail.setValue(!ce_mail.isNull());
		asignarMail();
	}



	private void crearMail() {
		ce_mail = new ControlEdit(this);
		ce_mail.setName("ce_mail");
		ce_mail.setType(ControlEdit.STRING);
		ce_mail.setLength(100);
		ce_mail.setViewLength(60);
		ce_mail.setEnabled(true);		
		addControl(ce_mail);

		cc_sendmail = new ControlCheck(this);

		Fieldset fs = new Fieldset(this, "Notificar por email",cc_sendmail);
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(ce_mail);

		addFieldset(fs);

	}

	private void asignarMail() {
		ce_mail.setNull();
		if (cc_sendmail.getBoolean()) {
			Selector s = new Selector (Easp.connEA);
			s.execute("select datemail from NIFES where danifcif='"+oGD.getNif()+"'");
			if (s.next()) ce_mail.setValue(s.getString("datemail"));
			s.close();
		}
	}

	private void crearClientePortal() {
		ce_cdpafinity = new ControlEdit(this);
		ce_cdpafinity.setName("ce_cdpafinity");
		ce_cdpafinity.setType(ControlEdit.STRING);
		ce_cdpafinity.setLength(12);
		ce_cdpafinity.setObligate(true);
		ce_cdpafinity.setEnabled(false);
		addControl(ce_cdpafinity);

		ce_nombre = new ControlEdit(this);
		ce_nombre.setName("ce_nombreportal");
		ce_nombre.setType(ControlEdit.STRING);
		ce_nombre.setLength(80);
		ce_nombre.setViewLength(50);
		ce_nombre.setObligate(true);
		ce_nombre.setEnabled(false);
		ce_nombre.setTitle("-");
		addControl(ce_nombre);


		Fieldset fs = new Fieldset(this, "Cliente portal");
		fs.getWebProperties().setNumCols(2);
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(ce_cdpafinity);
		fs.addControl(ce_nombre);
		addFieldset(fs);


		ControlImage ci = new ControlImage(this);
		ci.setImage("mae/general/jreports/gesdoc64.png");
		addControl(ci);

		Fieldset fsi = new Fieldset(this);
		fsi.getWebProperties().setAnchoColumnas(6);
		fsi.addControl(ci);		
		addFieldset(fsi);
	}

	private void crearFicheroDestino() {
		ce_nombrefichero = new ControlEdit(this);
		ce_nombrefichero.setTitle("Nombre");
		ce_nombrefichero.setName("ce_nombrefichero");
		ce_nombrefichero.setType(ControlEdit.STRING);
		ce_nombrefichero.setLength(30);
		ce_nombrefichero.setObligate(true);
		ce_nombrefichero.setEnabled(false);		
		addControl(ce_nombrefichero);

		ce_desc = new ControlEdit(this);
		ce_desc.setTitle("Descripción");
		ce_desc.setName("ce_desc");
		ce_desc.setType(ControlEdit.STRING);
		ce_desc.setLength(100);
		ce_desc.setViewLength(50);
		ce_desc.setEnabled(false);		
		addControl(ce_desc);

		Fieldset fs = new Fieldset(this, "Listado");
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(ce_nombrefichero);
		fs.addControl(ce_desc);

		addFieldset(fs);
	}


	private void crearFormato() {
		crb_pdf = new ControlRadioButton(this) {
			public void userChange (Value v) {
				super.userChange(v);
				crb_excel.setValue(!getBoolean());
				asignarNombreFichero();
			}
		};
		crb_pdf.setName("crb_pdf");
		crb_pdf.setTitle("PDF");
		addControl(crb_pdf);

		crb_excel = new ControlRadioButton(this) {
			public void userChange (Value v) {
				super.userChange(v);
				crb_pdf.setValue(!getBoolean());
				asignarNombreFichero();
			}
		};
		crb_excel.setName("crb_excel");
		crb_excel.setTitle("EXCEL");
		addControl(crb_excel);


		Fieldset fs = new Fieldset(this, "Formato");
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(crb_pdf);
		fs.addControl(crb_excel);

		addFieldset(fs);
	}


	private void asignarNombreFichero() {
		if (crb_pdf.getBoolean()) ce_nombrefichero.setValue(oGD.getNombreFichero()+".pdf");
		else ce_nombrefichero.setValue(oGD.getNombreFichero()+".xlsx");
	}

	private void crearUbicacionGD() {
		ce_ubicaciongd = new ControlEdit(this);
		ce_ubicaciongd.setName("ce_ubicaciongd");
		ce_ubicaciongd.setType(ControlEdit.STRING);
		ce_ubicaciongd.setLength(37);
		ce_ubicaciongd.setObligate(true);
		ce_ubicaciongd.setEnabled(false);
		addControl(ce_ubicaciongd);

		cb_examinar = new ControlButton(this) {
			public void onClick () {
				super.onClick();
				onEtiquetas();
			}
		};
		cb_examinar.setName("cb_examinar");
		cb_examinar.setTitle("Examinar ...");
		addControl(cb_examinar);

		Fieldset fs = new Fieldset(this, "Ubicación remota");
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(ce_ubicaciongd);
		fs.addControl(cb_examinar);

		addFieldset(fs);
	}

	private void crearEtiquetas() {
		LookComponent lc = new LookComponent();
		lc.setLength(20);
		lc.setHeight(6);

		cep_etiqgyc = new ControlEditPane(this);
		cep_etiqgyc.setName("cep_etiqgyc");
		cep_etiqgyc.setType(ControlEdit.STRING);
		cep_etiqgyc.setLength(2000);
		cep_etiqgyc.setLook(lc);
		cep_etiqgyc.setObligate(true);
		cep_etiqgyc.setEnabled(false);
		addControl(cep_etiqgyc);

		Fieldset fs = new Fieldset(this, "Etiquetas");
		fs.getWebProperties().setAnchoColumnas(6);
		fs.addControl(cep_etiqgyc);

		addFieldset(fs);
	}

	private void onEtiquetas () {
		ProgPrgdubicacion pr = new ProgPrgdubicacion();
		pr.cdp = ce_cdpafinity.getString();
		pr.run();
		if (pr.ubicSelec != null) {
			ubicacionUsuario = pr.ubicSelec;
			ce_ubicaciongd.setValue(ubicacionUsuario.getNombre());
		}
	}

	private void onEnviar () throws Exception {
		if (validarFormulario()) {					
			File f = File.createTempFile("Gesdoc", crb_excel.getBoolean()?"xlsx":"pdf");
			
			int startPage = 0;
			List<ExporterInputItem> jprintlist = new ArrayList<ExporterInputItem>();
			for (int i=0;i<job.vTarea.size();i++) {
				JListado jl = job.vTarea.elementAt(i);
				VistaPrevia vp = null;
				if (jl.sinDataSource) vp = new VistaPrevia(jl.rutaFicheroJRXML, new JREmptyDataSource(), job.titulo);    		  
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
				jprintlist.add(new SimpleExporterInputItem (jp));
				startPage += jp.getPages().size();
			}
			
			if (crb_excel.getBoolean()) crearFicheroXLSX(f, jprintlist);
			else crearFicheroPDF (f, jprintlist);
			
			GesDoc.send(ce_cdpafinity.getString(), ce_nombrefichero.getString(), ce_desc.getString(), crb_excel.getBoolean()?"xlsx":"pdf", cc_sendmail.getBoolean(), 
						ce_mail.getString(), ce_ubicaciongd.getString(), ubicacionUsuario != null ? ubicacionUsuario.getId() : 0, oGD.getEtiquetas(), f);
			Maefc.message ("Proceso realizado correctamente.","¡Atención!",Maefc.INFORMATION_MESSAGE);
			job.dialog.exit();
		}
	}
	private void crearFicheroPDF (File f, List<ExporterInputItem> jprintlist) throws Exception {

		JRPdfExporter pdfexporter  = new JRPdfExporter();

		SimplePdfReportConfiguration rc = new SimplePdfReportConfiguration();           
		pdfexporter.setConfiguration(rc);

		ExporterInput inp = new SimpleExporterInput(jprintlist);
		pdfexporter.setExporterInput(inp);

		FileOutputStream out = new FileOutputStream(f);		        
		OutputStreamExporterOutput output = new SimpleOutputStreamExporterOutput(out);
		pdfexporter.setExporterOutput(output);

		pdfexporter.exportReport();          
		out.close();				
	}

	private void crearFicheroXLSX(File f, List<ExporterInputItem> jprintlist) throws Exception {

		JRXlsxExporter exporter = new JRXlsxExporter();
		SimpleXlsxReportConfiguration repConfig = new SimpleXlsxReportConfiguration();
		
		FileOutputStream out = new FileOutputStream(f);
		exporter.setExporterInput(new SimpleExporterInput(jprintlist));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(out));
		if (job.multiPaginaExcel ) repConfig.setOnePagePerSheet(true);
		repConfig.setCollapseRowSpan(true);
		repConfig.setIgnorePageMargins(true);
		exporter.setConfiguration(repConfig);
		exporter.exportReport();          
		out.close();						


	}

	private boolean validarFormulario() {
		return true;
	}
}
