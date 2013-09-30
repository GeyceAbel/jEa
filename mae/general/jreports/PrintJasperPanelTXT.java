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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import net.sf.jasperreports.engine.JasperPrint;



public class PrintJasperPanelTXT extends PrintJasperPanel
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
	private BufferedWriter  pw;
    //private LinkedHashMap<Integer, String> formatColumnes = new LinkedHashMap<Integer, String>();
	private Vector<String> formatColumnes = new Vector<String>();
	public PrintJasperPanelTXT(PrintJasperWork job)
	{
		super();
		this.job = job;
	}


	public VisualComponent getComponent()
	{
		setLayout(new LayoutHtml("mae/general/jreports/PrintPanelTXT.html"));
		creaControls();
		destino.setValue(job.destino+".txt");
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
		loc.setTitle("TXT");
		loc.setIcon(Maefc.getImageIcon("geyce/maefc/images/txttab.gif"));
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
				return file.getName().endsWith(".txt");
			}

			public String getDescription()
			{
				return "Fichero TXT";
			}
		};

		chooser.setFileFilter(filter);
		chooser.setDialogTitle("Archivo TXT resultado del listado");
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
				if (punt < 0 || (!destino.getString().substring(punt + 1).toUpperCase().equals("TXT")&&!destino.getString().substring(punt + 1).toUpperCase().equals("TXT")))
				{
					setMessageWarning("La extensión del archivo de salida tiene que ser .TXT");
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
				if (PrintJasperPanelTXT.this.isValid()) onImprimir();
			}
		};
		crear.setName("btimprimir");
		crear.setTitle("Generar TXT ...");
		crear.setMnemonic('G');
		crear.setImage("geyce/maefc/images/texto.png");
		addControl(crear);

		//addPredeterminar();
	}

	public void onImprimir() {	  
		if (noEstaAbiertoElFichero (destino.getString())) {
			try {
				/*
				int startPage = 0;
				List<JasperPrint> jprintlist = new ArrayList<JasperPrint>();				
				for (int i=0;i<job.vTarea.size();i++) {
					JListado jl = job.vTarea.elementAt(i);
					VistaPrevia vp = null;
					if (jl.sinDataSource)vp = new VistaPrevia(jl.rutaFicheroJRXML, new JREmptyDataSource(), job.titulo);    		  
					else if  (!jl.isXmlDataSource()) vp = new VistaPrevia(jl.rutaFicheroJRXML, job.conn , job.titulo);
					else vp = new VistaPrevia(jl.rutaFicheroJRXML, jl.getXmlDataSource() , job.titulo);   
					if (job.parametroPaginaInicial != null) {
						jl.getParameters().put(job.parametroPaginaInicial, new Integer(startPage));
					}
					vp.setParameter(jl.getParameters());
					vp.compile();    	
					JasperPrint jp = vp.getJprint();    		  
					jprintlist.add(jp);
					startPage += jp.getPages().size();
					JRTextExporter exporter = new JRTextExporter();
			        File file = new File(destino.getString());
			        exporter.setParameter(JRTextExporterParameter.JASPER_PRINT, jp);
			        exporter.setParameter(JRTextExporterParameter.OUTPUT_FILE, file);
			        exporter.setParameter(JRTextExporterParameter.PAGE_HEIGHT, new Integer(250));
			        exporter.setParameter(JRTextExporterParameter.PAGE_WIDTH, new Integer(150));
			        //exporter.setParameter(JRTextExporterParameter.CHARACTER_WIDTH, new Integer(4));
			        //exporter.setParameter(JRTextExporterParameter.CHARACTER_HEIGHT, new Integer(8));
			        exporter.exportReport();
				}
				JRExporter exporter = new JRPdfExporter();
				exporter.setParameter(JRPdfExporterParameter.JASPER_PRINT_LIST, jprintlist);
				FileOutputStream output = new FileOutputStream(new File(destino.getString()));
				exporter.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, output);
				exporter.exportReport();
				*/
				File file = new File(destino.getString());
				pw = new BufferedWriter(new OutputStreamWriter (new FileOutputStream(file),"UTF8"));
				String titulo = job.titulo;
				for (int i=0;i<job.vTarea.size();i++) {
					JListado jl = job.vTarea.elementAt(i);
					titulo= jl.getTituloListado();
				}
		        pw.write(titulo.toUpperCase());
		        pw.newLine();
		        pw.newLine();
		        
		        

				Set<Entry<String, String[]>> set = job.fieldsNameLength.entrySet();
				Iterator<Entry<String, String[]>> it = set.iterator();
				//int numCol=1;
				while (it.hasNext()) {
					pw.write("   ");
					Map.Entry<String, String[]> entry = (Entry<String, String[]>) it.next();
					String formatStr = getTipus(entry.getValue());
					formatColumnes.add(formatStr);
					//numCol++;
					//formatStr =formatStr+ "%-"+ entry.getValue()[0] + "s ";
					//pw.write(String.format("%-"+(entry.getValue()[0]+4)+"s", StringUtil.justifyCenter(entry.getKey().toUpperCase(),entry.getValue()[0]+4,' ')));
					pw.write(String.format(formatStr, StringUtil.justifyCenter(entry.getValue()[2].toUpperCase(),Integer.valueOf(entry.getValue()[0]),' ')));
				}
				pw.newLine();
				
				for(int x=0;x<formatColumnes.size();x++) {
				  pw.write("   ");
				  pw.write(String.format(formatColumnes.get(x),"").replace(' ','-'));					  
				  //pw.write(String.format("%-"+(entry.getValue()[0]+4)+"s", StringUtil.justifyCenter("",entry.getValue()[0]+4,' ')));
				}
				pw.newLine();
				//read xmlDataSource.
				//List<JasperPrint> jprintlist = new ArrayList<JasperPrint>();				
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				  Document doc = dBuilder.parse(job.xmlDataSourceFile);
				  doc.getDocumentElement().normalize();
				  
				  NodeList nList = doc.getElementsByTagName("register");
				  for (int temp = 0; temp < nList.getLength(); temp++) {				  
					Node nNode = nList.item(temp);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					  NodeList children = nList.item(temp).getChildNodes();
					  for(int j=0; j<children.getLength();j++){
						Node nNodeChild = nList.item(temp);
						if (nNodeChild.getNodeType() == Node.ELEMENT_NODE) {
							pw.write("   ");
							pw.write(String.format(formatColumnes.get(j),children.item(j).getTextContent()));
						}						
					  }
					}
					pw.newLine();
			      }
				
				
				
				/*
				Set<Entry<Integer, String>> setUnder = formatColumnes.entrySet();
				Iterator<Entry<Integer, String>> itUnder = setUnder.iterator();
				while (itUnder.hasNext()) {
					Map.Entry<Integer, String> entry = (Entry<Integer, String>) itUnder.next();
					pw.write(String.format(formatStr,);
				}
				pw.newLine();
				*/
				//it=set.iterator();
				
				//pw.write(String.format(formatStr, nameColumns.toString()));
				
				pw.close();
				//output.close();
				if (abrir.getBoolean()) abrir(destino.getString(),"Bloc de notas");
				job.dialog.exit();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
			  try  {
				formatColumnes.clear();
				if (pw!=null) pw.close();		
			  }
			  catch (Exception e) {
				e.printStackTrace();
			  }
			}
		}
	}
	private String getTipus(String[] tipus) {
	  int llargada = Integer.valueOf(tipus[0]);
	  switch(Integer.valueOf(tipus[1])) {
	    case Columna.STRING:	return "%-"+llargada+"s";
	    default: return  "%"+llargada+"s";
	  }		
	}
	
	public static class StringUtil {
	  /**
	   * Center the contents of the string. If the supplied string is longer than the desired width, it is truncated to the
	   * specified length. If the supplied string is shorter than the desired width, padding characters are added to the beginning
	   * and end of the string such that the length is that specified; one additional padding character is prepended if required.
	   * All leading and trailing whitespace is removed before centering.
	   * 
	   * @param str the string to be left justified; if null, an empty string is used
	   * @param width the desired width of the string; must be positive
	   * @param padWithChar the character to use for padding, if needed
	   * @return the left justified string
	   * @see #setLength(String, int, char)
	   */
	  public static String justifyCenter( String str,
	                                      final int width,
	                                      char padWithChar ) {
	      // Trim the leading and trailing whitespace ...
	      str = str != null ? str.trim() : "";

	      int addChars = width - str.length();
	      if (addChars < 0) {
	          // truncate
	          return str.subSequence(0, width).toString();
	      }
	      // Write the content ...
	      int prependNumber = addChars / 2;
	      int appendNumber = prependNumber;
	      if ((prependNumber + appendNumber) != addChars) {
	          ++prependNumber;
	      }

	      final StringBuilder sb = new StringBuilder();

	      // Prepend the pad character(s) ...
	      while (prependNumber > 0) {
	          sb.append(padWithChar);
	          --prependNumber;
	      }

	      // Add the actual content
	      sb.append(str);

	      // Append the pad character(s) ...
	      while (appendNumber > 0) {
	          sb.append(padWithChar);
	          --appendNumber;
	      }

	      return sb.toString();
	  }

	}
	
}


