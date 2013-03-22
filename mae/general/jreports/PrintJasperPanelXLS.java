package mae.general.jreports;

import geyce.maefc.ControlButton;
import geyce.maefc.ControlCheck;
import geyce.maefc.ControlEdit;
import geyce.maefc.LayoutHtml;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Maefc;
import geyce.maefc.VisualComponent;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;

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
        String extensio="XLS";
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

    // Butó crear
    crear = new ControlButton(this)
    {
      public void onClick()
      {
    	  if (PrintJasperPanelXLS.this.isValid()) onGenerar();
      }
    };
    crear.setName("btgenerar");
    crear.setTitle("Generar");
    crear.setMnemonic('G');
    crear.setImage("geyce/maefc/images/excel.png");

    addControl(crear);

    addPredeterminar();
  }

  public void onGenerar()
  {
      try {
    	  List<JasperPrint> jprintlist = new ArrayList<JasperPrint>();
    	  for (int i=0;i<job.vTarea.size();i++) {
    		  JListado jl = job.vTarea.elementAt(i);
    		  VistaPrevia vp = null;
    		  if (jl.sinDataSource)vp = new VistaPrevia(jl.rutaFicheroJRXML, new JREmptyDataSource(), job.titulo);
    		  else vp = new VistaPrevia(jl.rutaFicheroJRXML, job.conn , job.titulo);
    		  vp.setParameter(jl.getParameters());
    		  vp.compile();    	
    		  jprintlist.add(vp.getJprint());
    	  
    	  
    	  }
    	  JRExporter exporter = new JRXlsExporter();
    	  exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT_LIST, jprintlist);
    	  FileOutputStream output = new FileOutputStream(new File(destino.getString()));
    	  exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM, output);
    	  if((Boolean)job.EXCEL_WHITE_BACKGROUND !=null)
    	  exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, job.EXCEL_WHITE_BACKGROUND);
    	  if((Boolean)job.EXCEL_EMPTY_SPACE_ROWS !=null)
    	  exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, job.EXCEL_EMPTY_SPACE_ROWS);  
    	  if((Boolean)job.EXCEL_EMPTY_SPACE_COL !=null)
    	  exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS, job.EXCEL_EMPTY_SPACE_COL);
    	  
    	  exporter.exportReport();
    	  output.close();
     	  if (abrir.getBoolean()) abrir(destino.getString(),"Microsoft Excel");
     	  job.dialog.exit();
      }
	  catch (Exception e) {
		  e.printStackTrace();
	  }
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
    chooser.setDialogTitle("Resultado en Excel");
    chooser.setSelectedFile(new File("Listado.xls"));
    if (chooser.showSaveDialog(geyce.maefc.swing.WSystemView.getFrame()) == JFileChooser.APPROVE_OPTION)
    {
      destino.setValue(chooser.getSelectedFile().getAbsolutePath());
    }
  }
}
