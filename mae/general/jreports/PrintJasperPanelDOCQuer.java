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
import geyce.maefc.Selector;
import geyce.maefc.VisualComponent;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFileChooser;

import javax.swing.filechooser.FileFilter;

import mae.easp.general.Easp;
import net.sf.jasperreports.engine.JREmptyDataSource;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporterParameter;

public class PrintJasperPanelDOCQuer extends PrintJasperPanel
{

	public ControlButton      examinar;
	public ControlButton      crear;
	public ControlEdit 		destino;

	public PrintJasperPanelDOCQuer(PrintJasperWork job)
	{
	    super();
	    super.job = job;
	}


  public VisualComponent getComponent()
  {
	 setLayout(new LayoutHtml("mae/general/jreports/PrintPanelWordQuer.html"));
	 creaControls();
	 destino.setValue(job.destino+".docx");
	 abrir.setValue(job.abrir);
	 Selector setRegistrePre = new Selector(Easp.connEA);
	 setRegistrePre.execute("select parvalor from parametros where pardominio = '" + Easp.dominio +"' and parusuario = '" + Easp.usuario + "' and parambito = '" + job.dialog.getProgram().getName() + "' and parvariable = '" + job.vTarea.elementAt(0).getNombreReport() + "'");
	 if(setRegistrePre.next()) { 
	   HashMap<Integer,String> parametros = getParametros(setRegistrePre.getString("parvalor"));
	   if(parametros.get(6)!=null) {
	     vertical.setValue(parametros.get(6).equals("false"));
	     horizontal.setValue(parametros.get(6).equals("true"));
	   }
	   hoja.setValue(parametros.get(0));
	   margenSup.setValue(parametros.get(4));
	   margenInf.setValue(parametros.get(5));
	   margenIzq.setValue(parametros.get(3));
	   margenDer.setValue(parametros.get(2));
 	   tamañoLetra.setValue(parametros.get(1)); 	 
 	   if(parametros.get(7) != null)
 	     economico.setValue(parametros.get(7).equals("true"));
  	  if(parametros.get(10) != null) {
   	     destino.setValue(parametros.get(10));
  	  }
 	  if(parametros.get(9) != null)
  	     abrir.setValue(parametros.get(9).equals("true"));
	 }
	 else {
	  vertical.setValue(!job.horizontal);
	  horizontal.setValue(job.horizontal);
	  hoja.setValue("A4");
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
		loc.setTitle("Word");
		loc.setIcon(Maefc.getImageIcon("mae/general/jreports/docxtab.png"));
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
				if (file.isDirectory()) return true;
				return file.getName().endsWith(".docx");
			}

			public String getDescription()
			{
				return "Fichero Word (docx)";
			}
		};

		chooser.setFileFilter(filter);
		chooser.setDialogTitle("Archivo DOCX resultado del listado");
		if (!destino.isNull()) chooser.setSelectedFile(new File(destino.getString()));
		if (chooser.showSaveDialog(geyce.maefc.swing.WSystemView.getFrame()) == JFileChooser.APPROVE_OPTION) {
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
				if (punt < 0 || !destino.getString().substring(punt + 1).toUpperCase().equals("DOCX"))
				{
					setMessageWarning("La extensión del archivo de salida tiene que ser .DOCX");
					return false;
				}
				else 
					return true;
				
					
			}
		};
		destino.setName("vvdestino");
		destino.setType(ControlEdit.STRING);
		destino.setLength(255);
		destino.setViewLength(54);
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
	    for (int i=5;i<=15;i++) tamañoLetra.addItem(i);
	    tamañoLetra.setObligate(true);
	    addControl(tamañoLetra);

		// Abrir al finalizar
		abrir = new ControlCheck(this);
		abrir.setName("vvabrir");
		addControl(abrir);
		
	    //check impresio economica
	    economico = new ControlCheck(this);
	    economico.setName("vveconomico");
	    addControl(economico);

		crear = new ControlButton(this)
		{
			public void onClick()
			{
			  if (PrintJasperPanelDOCQuer.this.isValid()) {
				File f = new File(destino.getString());
				int result =Maefc.YES_OPTION;
				if(f.exists()) {
					result = Maefc.message("El archivo de destino donde se guardará el listado ya existe. \n ¿Desea sobreescribirlo?.","Aviso",Maefc.WARNING_MESSAGE,Maefc.YES_NO_OPTION);	
				}
				if(result ==Maefc.YES_OPTION)	onImprimir();
			  }
			}
		};
		crear.setName("btimprimir");
		crear.setTitle("Generar Word ...");
		crear.setMnemonic('G');
		crear.setImage("mae/general/jreports/word.png");
		addControl(crear);

		addPredeterminar();
	}

  public void addPredeterminar()  {
    predeterminar = new ControlButton(this)
    {
      public void onClick()
      {
        if (PrintJasperPanelDOCQuer.this.isValid())
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
  
  

	  
  private String centimetres(int width, int height)
  {
    double relacio = 21D / 595D;
    DecimalFormat dec = new DecimalFormat("##.##");
    return dec.format(Maefc.round(width * relacio, 1)) + "cm x " + dec.format(Maefc.round(height * relacio, 1)) + "cm";
  }  
	  
	public void onImprimir() {
		if (noEstaAbiertoElFichero (destino.getString())) {
			try {
				int startPage = 0;
				List<JasperPrint> jprintlist = new ArrayList<JasperPrint>();
				JListado jl = job.vTarea.elementAt(0);
				generaJrxml(jl);		    	  
	    		int result =Maefc.YES_OPTION;
	    		if(totalWidthColumnas(jl)>jl.getColumnWidth()+5) 
	    		  result = Maefc.message("La configuración del listado excede de los \n márgenes de la hoja. ¿Desea continuar?.","Aviso",Maefc.INFORMATION_MESSAGE,Maefc.YES_NO_OPTION);
	    		if(result ==Maefc.YES_OPTION) {
	    		  VistaPrevia vp = null;
	    		  jl.generalJRXML();
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
				
				  JRExporter exporter = new JRDocxExporter();
				  exporter.setParameter(JRDocxExporterParameter.JASPER_PRINT_LIST, jprintlist);
				  FileOutputStream output = new FileOutputStream(new File(destino.getString()));
				  exporter.setParameter(JRDocxExporterParameter.OUTPUT_STREAM, output);
				  exporter.exportReport();
				  output.close();
				  if (abrir.getBoolean()) abrir(destino.getString(),"Microsoft Word");
				  job.dialog.exit();
	    		}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
