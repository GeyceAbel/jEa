package mae.general.jreports;

import geyce.maefc.ControlButton;
import geyce.maefc.ControlCombo;
import geyce.maefc.ControlEdit;
import geyce.maefc.LayoutHtml;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import geyce.maefc.VisualComponent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import mae.easp.general.Easp;
import mae.easp.general.Mir;
import mae.general.Azure;
import mae.general.Numero;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.ExporterInputItem;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleExporterInputItem;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;

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
	private ArrayList<Object> empresaList;
	
	public PrintJasperPanelEMIR(PrintJasperWork job)
	{
		super();
		this.job = job;
		this.empresa = job.empresa;
		this.aplicacio = job.aplicacio;
		if(!job.mirMasivo) {
		  nif = getNif ();
		  nom = Easp.nombreEmpresa(nif);
		  cdp = getCDP ();
		}
		else {
			empresaList=job.relacionEmpresas;	
		}
	}


	public VisualComponent getComponent()
	{
		setLayout(new LayoutHtml("mae/general/jreports/PrintPanelEMIR.html"));
		creaControls();
		if(!job.mirMasivo)
		  destino.setValue(job.destino+".pdf");
		else destino.setValue(System.getProperty("user.dir"));
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
		if(!job.mirMasivo) {
		  chooser.setFileFilter(filter);
		  chooser.setDialogTitle("Archivo PDF resultado del listado");
		}
		else {
			chooser.setDialogTitle("Directori destino ficheros MIR");
		  chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		}
		
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
		codigoCDP.setObligate(!job.mirMasivo);
		codigoCDP.setEnabled(false);
		if(!job.mirMasivo) 
		  codigoCDP.setValue (cdp+"/"+nom);
		else codigoCDP.setNull();
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
				if ((punt < 0 || !destino.getString().substring(punt + 1).toUpperCase().equals("PDF"))&& !job.mirMasivo)
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
				if (PrintJasperPanelEMIR.this.isValid()) {
				  if(!job.mirMasivo)	
					onEnviar();
				  else
					onEnviarMasivo();
				}
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
			String sCodiCDPOK = "";
			Azure az = new Azure ("agpi2dp.getCDPfromNif");
			az.addParametroURL("codiDP", Easp.dominio.substring(0,6)+"000000");
			az.addParametroURL("nifcif", sNif);
			if (az.procesar()) sCodiCDPOK = az.getContenido();
			if ( sCodiCDPOK!= null && sCodiCDPOK.trim().length() == 12 ) cdpAfinity = sCodiCDPOK;
		}
		return cdpAfinity;
	}



	public boolean onEnviar () {
		boolean bOk = false;
		if (noEstaAbiertoElFichero (destino.getString())) {
			try {    	  
				int startPage = 0;
				List<ExporterInputItem> jprintlist = new ArrayList<ExporterInputItem>();
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
					jprintlist.add(new SimpleExporterInputItem (jp));
					startPage += jp.getPages().size();
				}
				/*
				JRExporter exporter = new JRPdfExporter();
				exporter.setParameter(JRPdfExporterParameter.JASPER_PRINT_LIST, jprintlist);
				FileOutputStream output = new FileOutputStream(new File(destino.getString()));
				exporter.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, output);
				exporter.exportReport();
				output.close();
				 */

				JRPdfExporter pdfexporter  = new JRPdfExporter();

				SimplePdfReportConfiguration rc = new SimplePdfReportConfiguration();           
				pdfexporter.setConfiguration(rc);

				ExporterInput inp = new SimpleExporterInput(jprintlist);
				pdfexporter.setExporterInput(inp);

				FileOutputStream out = new FileOutputStream(new File(destino.getString()));		        
				OutputStreamExporterOutput output = new SimpleOutputStreamExporterOutput(out);
				pdfexporter.setExporterOutput(output);

				pdfexporter.exportReport();          
				out.close();


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
	
	public boolean onEnviarMasivo () {
		boolean bOk = false;					
			try {	
			  job.resultEnvioEmir = java.io.File.createTempFile("REMIR", ".txt");
			  for(Object empresaActual:empresaList) {
				int startPage = 0;
				String nif="";
				List<ExporterInputItem> jprintlist = new ArrayList<ExporterInputItem>();
				for (int i=0;i<job.vTarea.size();i++) {					
				  JListado jl = job.vTarea.elementAt(i);
				  int relacio = (Integer)jl.relListadoObj;
				  empresa = (Integer)empresaActual;
				  if(relacio == empresa) {					
					//empresa = (Integer) empresaActual;
					nif = getNif ();
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
					jprintlist.add(new SimpleExporterInputItem (jp));
					startPage += jp.getPages().size();
				  }
				}
				
				
				String aleatori = Numero.format( ((int)(Math.random()*10000)),"0000000") ;
		        String  filename = destino.getString()+"\\"+(job.prefixNomFitxer!=null?job.prefixNomFitxer:"")+nif+aleatori+".pdf";        
		        while ( Easp.existeFichero(filename) ) {
		            aleatori = Numero.format( ((int)(Math.random()*10000)),"0000000") ;
		            filename = destino.getString()+"\\"+(job.prefixNomFitxer!=null?job.prefixNomFitxer:"")+nif+aleatori+".pdf";                	
		          } 
		        
		        
		        JRPdfExporter pdfexporter  = new JRPdfExporter();

				SimplePdfReportConfiguration rc = new SimplePdfReportConfiguration();           
				pdfexporter.setConfiguration(rc);

				ExporterInput inp = new SimpleExporterInput(jprintlist);
				pdfexporter.setExporterInput(inp);

				FileOutputStream out = new FileOutputStream(new File(filename));		        
				OutputStreamExporterOutput output = new SimpleOutputStreamExporterOutput(out);
				pdfexporter.setExporterOutput(output);

				pdfexporter.exportReport();          
				out.close();
		        
				/*
				JRExporter exporter = new JRPdfExporter();
				exporter.setParameter(JRPdfExporterParameter.JASPER_PRINT_LIST, jprintlist);
				FileOutputStream output = new FileOutputStream(new File(filename));
				exporter.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, output);
				exporter.exportReport();
				output.close();
				*/
				
				Mir envioMir = new Mir(empresa, nif, job.titolMir!=null?job.titolMir:"EMIR", job.titolMir!=null?job.titolMir:"EMIR", filename, aplicacio);
				int codiMir = envioMir.registraMir(false);				
				
		        if ( codiMir == 0 ) {		          	
		          //String msg = "Cliente: ["+empresa+"] Con CIF/NIF: ["+nif+"] No encontrado en Afinity o no tiene contratado el producto MIR" ;
		          BufferedWriter bw = new BufferedWriter(new FileWriter(job.resultEnvioEmir,true));
		    	  bw.write(empresa +";"+nif+";"+filename+";"+envioMir.getErrorEnvio());
		    	  bw.newLine();
		    	  bw.close();
		        }
			  }
			  job.dialog.exit();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
		return bOk;
	}
}
