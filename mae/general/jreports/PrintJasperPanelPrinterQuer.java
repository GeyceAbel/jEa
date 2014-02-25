package mae.general.jreports;

import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.PrinterName;

import mae.easp.general.Easp;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import geyce.maefc.CheckGroup;
import geyce.maefc.ControlButton;
import geyce.maefc.ControlCheck;
import geyce.maefc.ControlComboBox;
import geyce.maefc.ControlEdit;
import geyce.maefc.ControlRadioButton;
import geyce.maefc.LayoutHtml;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Maefc;
import geyce.maefc.Selector;
import geyce.maefc.VisualComponent;


public class PrintJasperPanelPrinterQuer extends PrintJasperPanel {

  public ControlButton      crear;
  public ControlComboBox    destino;
  public ControlEdit	    copia;

  public PrintJasperPanelPrinterQuer(PrintJasperWork job)
  {
    super();
    super.job = job;
  }
  
  public VisualComponent getComponent()
  {
    setLayout(new LayoutHtml("mae/general/jreports/PrintPanelPrinterQuer.html"));
	 creaControls();
	 Selector setRegistrePre = new Selector(Easp.connEA);
	 setRegistrePre.execute("select parvalor from parametros where pardominio = '" + Easp.dominio +"' and parusuario = '" + Easp.usuario + "' and parambito = '" + job.dialog.getProgram().getName() + "' and parvariable = '" + job.vTarea.elementAt(0).getNombreReport() + "'");
	 if(setRegistrePre.next()) { 
	   HashMap<Integer,String> parametros = getParametros(setRegistrePre.getString("parvalor"));
	   if(parametros.get(6)!=null) {
	     vertical.setValue(parametros.get(6).equals("false"));
	     horizontal.setValue(parametros.get(6).equals("true"));
	   }
	   hoja.setValue(parametros.get(0));
	   copia.setValue(1);
	   margenSup.setValue(parametros.get(4));
	   margenInf.setValue(parametros.get(5));
	   margenIzq.setValue(parametros.get(3));
	   margenDer.setValue(parametros.get(2));
	   tamañoLetra.setValue(parametros.get(1));
	   
	   if(parametros.get(7) != null)
	     economico.setValue(parametros.get(7).equals("true"));
	   if(parametros.get(11) != null)
		     destino.setValue(parametros.get(11));
	 }
	 else {
	  vertical.setValue(!job.horizontal);
	  horizontal.setValue(job.horizontal);
	  hoja.setValue("A4");
	  copia.setValue(1);
	  PrintService service = 
              PrintServiceLookup.lookupDefaultPrintService();
	  destino.setValue(service.getName());
	  margenSup.setValue(job.margenSuperior);
	  margenInf.setValue(job.margenInferior);
	  margenIzq.setValue(job.margenIzquierdo);
	  margenDer.setValue(job.margenDerecho);
	  tamañoLetra.setValue(job.tamañoLetra);
	 }
	 return this;
  }

  public VisualComponent getTabComponent()
  {
    VisualComponent control = getComponent();
    LocationTabbed loc = new LocationTabbed();
    loc.setExitIcon(false);
    loc.setTitle("Impresora");
    loc.setIcon(Maefc.getImageIcon("geyce/maefc/images/Print16.gif"));
    control.setLocation(loc);
    return control;
  }

  protected void creaControls()
  {
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
    
    //destino
    destino = new ControlComboBox(this);
    destino.setName("vvdestino");
    destino.setType(ControlEdit.STRING);
    destino.setComboEditable(false);
    destino.setObligate(true);
    destino.setLength(100);
    destino.setViewLength(40);
    addControl(destino);
    
    //num copias
    copia = new ControlEdit(this);
    copia.setName("vvcopia");
    copia.setType(ControlEdit.INTEGER);
    copia.setObligate(true);
    copia.setLength(3);
    addControl(copia);

    // Hoja
    
    hoja = new ControlComboBox(this);
    hoja.setName("vvhoja");
    hoja.setType(ControlEdit.STRING);
    hoja.setComboEditable(false);
    hoja.setObligate(true);
    
    Iterator<Entry<String, int[]>> it = pageSize.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, int[]> pairs = (Map.Entry<String, int[]>)it.next();
        //System.out.println(pairs.getKey() + " = " + pairs.getValue());
        //it.remove(); // avoids a ConcurrentModificationException
       hoja.addItem(pairs.getKey(), centimetres(pairs.getValue()[0], pairs.getValue()[1]));
    }
    addControl(hoja);
    
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

    crear = new ControlButton(this)
    {
      public void onClick()
      {
        if (PrintJasperPanelPrinterQuer.this.isValid()) onImprimir();
      }
    };
    crear.setName("btimprimir");
    crear.setTitle("Imprimir...");
    crear.setMnemonic('I');
    // crear.setImage("geyce/maefc/images/Print16.gif");
    crear.setImage("geyce/maefc/images/printer.png");
    
    //check impresio economica
    economico = new ControlCheck(this);
    economico.setName("vveconomico");
    addControl(economico);

    addControl(crear);
    readPrinterList();
    addPredeterminar();
  }
  
  private String centimetres(int width, int height)
  {
    double relacio = 21D / 595D;
    DecimalFormat dec = new DecimalFormat("##.##");
    return dec.format(Maefc.round(width * relacio, 1)) + "cm x " + dec.format(Maefc.round(height * relacio, 1)) + "cm";
  }

  public void addPredeterminar()
  {
    predeterminar = new ControlButton(this)
    {
      public void onClick()
      {
        if (PrintJasperPanelPrinterQuer.this.isValid())
          onPredeterminar();
      }
    };
    predeterminar.setName("btpredeterminar");
    predeterminar.setTitle("Predeterminar");
    predeterminar.setMnemonic('P');
    //predeterminar.setImage("geyce/maefc/images/predeterminar.png");
    predeterminar.setImage("mae/general/jreports/Saveicon.png");

    addControl(predeterminar);
  }
  
  protected void readPrinterList()
  {
	  
	PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
    for (PrintService printer : printServices) {
          destino.addItem(printer.getName(), "");          
    }    
  }
  
  public void onImprimir()
  {
	  
      try {
    	  int startPage = 0;
    	  JListado jl = job.vTarea.elementAt(0);
    	  
    	  generaJrxml(jl);
    	  for (int i=0;i<job.vTarea.size();i++) {
    		  jl.generalJRXML();
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
    		  startPage += jp.getPages().size();   
    		  
    		  /*
    		  Thread th = new Thread(new 
    		  
    		  Print(jp));
    		  th.start();
    		  */
    		  /*
    		  PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
    		  printRequestAttributeSet.add(MediaSizeName.ISO_A4);

    		  PrintServiceAttributeSet printServiceAttributeSet = new HashPrintServiceAttributeSet();
    		  printServiceAttributeSet.add(new PrinterName(destino.getString(), null));
    		  //printServiceAttributeSet.add(new PrinterName("hp LaserJet 1320 PCL 6", null));
    		  //printServiceAttributeSet.add(new PrinterName("PDFCreator", null));
    		    
    		  JRPrintServiceExporter exporter = new JRPrintServiceExporter();
    		    
    		  exporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
    		  exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
    		  exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printServiceAttributeSet);
    		  exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
    		  exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.TRUE);
    		    
    		  exporter.exportReport();
    		  */
    		  PrinterJob job = PrinterJob.getPrinterJob();
    		  /* Create an array of PrintServices */
    		  PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
    		  int selectedService = 0;
    		  /* Scan found services to see if anyone suits our needs */
    		  for(int z = 0; z < services.length;z++){
    		    if(services[z].getName().toUpperCase().contains(destino.getString().toUpperCase())){
    		    /*If the service is named as what we are querying we select it */
    		      selectedService = z;
    		      break;
    		    }
    		  }
    		  job.setPrintService(services[selectedService]);
    		  PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
    		  //MediaSizeName mediaSizeName = MediaSize.findMedia(4,4,MediaPrintableArea.INCH);
    		  printRequestAttributeSet.add(MediaSizeName.ISO_A4);    		  
    		  printRequestAttributeSet.add(new Copies(copia.getInteger()));
    		  if(horizontal.getBoolean()) printRequestAttributeSet.add(OrientationRequested.LANDSCAPE);
    		  else printRequestAttributeSet.add(OrientationRequested.PORTRAIT);    		  
    		  JRPrintServiceExporter exporter;
    		  exporter = new JRPrintServiceExporter();
    		  exporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
    		  /* We set the selected service and pass it as a paramenter */
    		  exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE, services[selectedService]);
    		  exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, services[selectedService].getAttributes());
    		  exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
    		  exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
    		  exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
    		  exporter.exportReport();    		  
    	  }    	  
    	  
     	  job.dialog.exit();
      }
	  catch (Exception e) {
		  e.printStackTrace();
	  }	  	  
  }
  
  class Print implements Runnable {
	  JasperPrint jp;
	  
	  Print (JasperPrint jp) {
		  this.jp = jp;
	  }

	  public void run() {
		  try {
			  JasperPrintManager.printReport(jp, true);
		  }
		  catch (Exception ex) {
			  ex.printStackTrace();
		  }
	  }	  
  }
  
  
  
  
  
}
