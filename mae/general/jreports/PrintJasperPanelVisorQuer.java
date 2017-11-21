package mae.general.jreports;

import geyce.maefc.Aplication;
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
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.imageio.ImageIO;
import java.util.Vector;
import mae.easp.general.Easp;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class PrintJasperPanelVisorQuer extends PrintJasperPanel
{

  public ControlButton      crear;
  

  public PrintJasperPanelVisorQuer(PrintJasperWork job)
  {
    super();
    super.job = job;
 }

  public VisualComponent getComponent()
  {
	 setLayout(new LayoutHtml("mae/general/jreports/PrintPanelVisorQuer.html"));
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
	   margenSup.setValue(parametros.get(4));
	   margenInf.setValue(parametros.get(5));
	   margenIzq.setValue(parametros.get(3));
	   margenDer.setValue(parametros.get(2));
 	   tamañoLetra.setValue(parametros.get(1)); 	 
 	   if(parametros.get(7) != null)
 	     economico.setValue(parametros.get(7).equals("true"));
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
	 /*
	  vertical.setEnabled(job.modifValores);
	  horizontal.setValue(job.modifValores);
	  hoja.setEnabled(job.modifValores);
	  margenSup.setEnabled(job.modifValores);
	  margenInf.setEnabled(job.modifValores);
	  margenIzq.setEnabled(job.modifValores);
	  margenDer.setEnabled(job.modifValores);
	  tamañoLetra.setEnabled(job.modifValores);
	  */
	  return this;
  }

  public VisualComponent getTabComponent()
  {
    VisualComponent control = getComponent();
    LocationTabbed loc = new LocationTabbed();
    loc.setExitIcon(false);
    loc.setTitle("Vista Previa");
    loc.setIcon(Maefc.getImageIcon("mae/general/jreports/vptab.png"));
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
    
    //check impresio economica
    economico = new ControlCheck(this);
    economico.setName("vveconomico");
    addControl(economico);

    crear = new ControlButton(this)
    {
      public void onClick()
      {
    	  if (PrintJasperPanelVisorQuer.this.isValid()){
    		  onImprimir();
    	  }
      }
    };
    crear.setName("btimprimir");
    crear.setTitle("Vista Previa...");
    crear.setMnemonic('G');
    crear.setImage("mae/general/jreports/vp.png");
    addControl(crear);

    addPredeterminar();
  }
  /*
  public void onPredeterminar()
  {
	 Selector setRegistrePre = new Selector(Easp.connEA);
	 //String sentencia="";
	 String valors=hoja.getString()+"^"+tamañoLetra.getInteger()+"^"+margenDer.getDouble()+"^"+margenIzq.getDouble()+"^"+margenSup.getDouble()+"^"+margenInf.getDouble()+"^"+horizontal.getBoolean()+"^"+economico.getBoolean();
	 setRegistrePre.execute("select parvariable from parametros where pardominio = '" + Easp.dominio +"' and parusuario = '" + Easp.usuario + "' and parambito = '" + job.dialog.getProgram().getName() + "' and parvariable = '" + job.vTarea.elementAt(0).getNombreReport() + "'");
	 if(setRegistrePre.next()) {
	   Update uparametros = new Update(Easp.connEA,"parametros");
	   uparametros.valor("parvalor", valors);
	   uparametros.execute("pardominio = '" + Easp.dominio +"' and parusuario = '" + Easp.usuario + "' and parambito = '" + job.dialog.getProgram().getName() + "' and parvariable = '" + job.vTarea.elementAt(0).getNombreReport() + "'");
	   
       //setRegistrePre.execute("update from parametros set pardesc = '" + valors + "' where pardominio = '" + Easp.dominio +"' and parusuario = '" + Easp.usuario + "' and parambito = '" + job.dialog.getProgram().getName() + "' and parvariable = '" + job.vTarea.elementAt(0).getNombreReport() + "'"); 
	 }
	 else {
         Insert iparametros = new Insert(Easp.connEA,"parametros");
         iparametros.valor("pardominio", Easp.dominio);
         iparametros.valor("parusuario", Easp.usuario);
         iparametros.valor("parambito", job.dialog.getProgram().getName());
         iparametros.valor("parvariable", job.vTarea.elementAt(0).getNombreReport());
         iparametros.valor("parvalor", valors);
         iparametros.execute();
		 
	 }
	 Easp.connEA.commit();
	 Maefc.message("Se han guardado los cambios","Aviso",Maefc.INFORMATION_MESSAGE);
  }
  */
  public void addPredeterminar()
  {
    predeterminar = new ControlButton(this)
    {
      public void onClick()
      {
        if (PrintJasperPanelVisorQuer.this.isValid())
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
	  try {
		  int startPage = 0;
		  Vector <JasperPrint> v = new Vector<JasperPrint>();
		  for (int i=0;i<job.vTarea.size();i++) {
			  JListado jl = job.vTarea.elementAt(i);
			  VistaPrevia vp = null;
			  generaJrxml(jl);

			  int result =Maefc.YES_OPTION;
			  if(totalWidthColumnas(jl)>jl.getColumnWidth()+5) 
				  result = Maefc.message("La configuración del listado excede de los \n márgenes de la hoja. ¿Desea continuar?.","Aviso",Maefc.INFORMATION_MESSAGE,Maefc.YES_NO_OPTION);
			  if(result ==Maefc.YES_OPTION) {

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
				  v.addElement(jp);
				  startPage += jp.getPages().size();     		  
			  }
		  }
		  JasperPrint jp = v.elementAt(0);
		  if (v.size()>1) {
			  for (int i=1;i<v.size();i++) {   
				  JasperPrint jptmp = v.elementAt(i);
				  for (int j = 0; j < jptmp.getPages().size(); j++) {
					  jp.addPage(jptmp.getPages().get(j));
				  }    			  
			  }
		  }

		  if(job.isShowDialeg())job.dialog.exit();
		  Vector <JasperViewer> vjv = new Vector<JasperViewer>();
		  JasperViewer jasperViewer =	new JasperViewer(jp,false);
		  java.io.InputStream iconImage = Easp.obreFitxerDeDinsElJar(Aplication.getAplication().getIcon().getFileName());
		  java.awt.image.BufferedImage imgBuf = ImageIO.read(iconImage);
		  jasperViewer.setIconImage(imgBuf);
		  jasperViewer.setTitle("Listado");
		  jasperViewer.setFitWidthZoomRatio();
		  vjv.addElement(jasperViewer);     	  
		  job.vjv = vjv;
	  }
	  catch (Exception e) {
		  e.printStackTrace();
	  }
  }
  

  
}
