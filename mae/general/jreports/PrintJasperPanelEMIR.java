package mae.general.jreports;

import geyce.maefc.ControlButton;
import geyce.maefc.ControlCombo;
import geyce.maefc.ControlComboBox;
import geyce.maefc.ControlEdit;
import geyce.maefc.LayoutHtml;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import geyce.maefc.VisualComponent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import mae.easp.general.Easp;
import mae.easp.general.Mir;
import mae.general.Numero;
import mae.general.URLExec;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;

public class PrintJasperPanelEMIR extends PrintJasperPanel
{
	public ControlEdit     destino;
	public ControlButton   examinar;
	public ControlButton   crear;
	public ControlCombo    codigoCDP;
	//public ControlComboBox usuario;	

	private PrintJasperWork job;
	private int empresa;
	private String nif;
	private String nom;
	private String cdp;
	private String aplicacio;
	
	public PrintJasperPanelEMIR(PrintJasperWork job)
	{
		super();
		this.job = job;
		this.empresa = job.empresa;
		this.aplicacio = job.aplicacio;
		nif = getNif ();
		nom = Easp.nombreEmpresa(nif);
		cdp = getCDP ();
	}


	public VisualComponent getComponent()
	{
		setLayout(new LayoutHtml("mae/general/jreports/PrintPanelEMIR.html"));
		creaControls();
		destino.setValue(job.destino+".pdf");
		return this;
	}

	public VisualComponent getTabComponent()
	{
		VisualComponent control = getComponent();
		LocationTabbed loc = new LocationTabbed();
		loc.setExitIcon(false);
		loc.setTitle("eMIR");
		loc.setIcon(Maefc.getImageIcon("mae/general/jreports/mirtab.gif"));
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
		codigoCDP = new ControlCombo(this);
		codigoCDP.setName("vvcodigocdp");
		codigoCDP.setType(ControlEdit.STRING);
		codigoCDP.setLength(12);
		codigoCDP.setDescriptionShow(true);
		codigoCDP.setDescriptionLength(40);
		codigoCDP.setObligate(true);
		codigoCDP.setEnabled(false);
		codigoCDP.setValue (cdp+"/"+nom);
		addControl(codigoCDP);

		// Usuari CDP
		/*
		usuario = new ControlComboBox(this);
		usuario.setName("vvusuario");
		usuario.setType(ControlEdit.STRING);
		usuario.setLength(20);
		usuario.setComboEditable(false);
		usuario.setDescriptionShow(true);
		usuario.setDescriptionLength(20);
		usuario.setObligate(true);
		usuario.setRestricted(true);
		usuario.setEnabled(false);
		addControl(usuario);
		 */

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


		crear = new ControlButton(this)
		{
			public void onClick()
			{
				if (PrintJasperPanelEMIR.this.isValid()) onEnviar();
			}
		};
		crear.setName("btenviar");
		crear.setTitle("Enviar eMir ...");
		crear.setMnemonic('G');
		crear.setImage("mae/general/jreports/emirtab.gif");
		addControl(crear);

		//addPredeterminar();
	}


	private String getNif () {
		String sNif = null;
		String sCodiCDP = Easp.dominio.substring(0,6)+Numero.format(empresa,"000000");
		String sCDPtmp;
		Selector selCDP = new Selector (Easp.connEA);
		String sSql = "select cdpnifcif,cdpcdprel from cdp where cdpcodi='" + sCodiCDP + "'";
		selCDP.execute(sSql);
		if (selCDP.next()) {
			sCDPtmp = selCDP.getString("cdpcdprel");
			if (sCDPtmp == null) {
				sNif = selCDP.getString("cdpnifcif");
			}
			else {
				selCDP.close();
				sSql = "select cdpnifcif,cdpcdprel from cdp where cdpcodi='" + sCDPtmp + "'";
				selCDP.execute(sSql);
				if (selCDP.next()) {
					sNif = selCDP.getString("cdpnifcif");
				}
			}
		}
		selCDP.close();
		return sNif;
	}

	public String getCDP () {
		String cdpAfinity = null;
		String sNif = getNif ();
		if (sNif != null) {
			String sDns = "http://afinity.geyce.es/pls/agpi/agpi2dp.";
			String sUrl = sDns+"getCDPfromNif?codiDP="+Easp.dominio.substring(0,6)+"000000&nifcif="+sNif;
			String sCodiCDPOK = URLExec.getContenido(sUrl);
			if ( sCodiCDPOK!= null && sCodiCDPOK.trim().length() == 12 ) cdpAfinity = sCodiCDPOK;
		}
		return cdpAfinity;
	}



	public boolean onEnviar () {
		boolean bOk = false;
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
				Mir envioMir = new Mir(empresa, nif, job.titulo, job.titulo, destino.getString(), aplicacio);
				if (!envioMir.sendandpub()) {
					bOk = false;
					Maefc.message("Error al procesar el envio eMir.\n\n"+envioMir.getErrorEnvio(),"¡Atención!",Maefc.WARNING_MESSAGE);
				}
				else {
					Maefc.message("Envio eMIR procesado correctamente.","¡Envio eMIR!",Maefc.INFORMATION_MESSAGE);
					job.dialog.exit();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bOk;
	}
}
