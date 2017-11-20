package mae.general.jreports;

import geyce.maefc.CheckGroup;
import geyce.maefc.ControlButton;
import geyce.maefc.ControlComboBox;
import geyce.maefc.ControlEdit;
import geyce.maefc.ControlRadioButton;
import geyce.maefc.LayoutHtml;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Maefc;
import geyce.maefc.VisualComponent;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;

public class PrintJasperPanelPrinter extends PrintJasperPanel
{
  public ControlRadioButton vertical;
  public ControlRadioButton horizontal;
  //public ControlComboBox    hoja;
  public ControlEdit        margenSup;
  public ControlEdit        margenInf;
  public ControlEdit        margenIzq;
  public ControlEdit        margenDer;
  public ControlComboBox    tamañoLetra;
  public ControlButton      crear;
  private PrintJasperWork job;

  public PrintJasperPanelPrinter(PrintJasperWork job)
  {
    super();
    this.job = job;
  }
  
  public VisualComponent getComponent()
  {
    setLayout(new LayoutHtml("mae/general/jreports/PrintPanelPrinter.html"));
    creaControls();
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

    // Tamany font
    tamañoLetra = new ControlComboBox(this);
    tamañoLetra.setName("vvletra");
    tamañoLetra.setType(ControlEdit.STRING);
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
        if (PrintJasperPanelPrinter.this.isValid()) onImprimir();
      }
    };
    crear.setName("btimprimir");
    crear.setTitle("Imprimir...");
    crear.setMnemonic('I');
    // crear.setImage("geyce/maefc/images/Print16.gif");
    crear.setImage("geyce/maefc/images/printer.png");

    addControl(crear);
    //addPredeterminar();
  }

  public void onImprimir()
  {
	  
      try {
    	  int startPage = 0;
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
    		  startPage += jp.getPages().size();    		  
    		  Thread th = new Thread(new Print(jp));
    		  th.start();
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
