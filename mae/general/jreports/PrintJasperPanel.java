package mae.general.jreports;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Vector;

import mae.easp.general.Easp;
import net.sf.jasperreports.view.JasperViewer;
import geyce.maefc.ControlButton;
import geyce.maefc.ControlCheck;
import geyce.maefc.ControlComboBox;
import geyce.maefc.ControlEdit;
import geyce.maefc.ControlPanel;
import geyce.maefc.ControlRadioButton;
import geyce.maefc.ErrorManagerDefault;
import geyce.maefc.Insert;
import geyce.maefc.Maefc;
import geyce.maefc.PrintPanelPrinter;
import geyce.maefc.Selector;
import geyce.maefc.Update;
import geyce.maefc.VisualComponent;
import geyce.maefc.Windows;

public abstract class PrintJasperPanel extends ControlPanel
{
  public ControlButton predeterminar;
  public ControlRadioButton vertical;
  public ControlRadioButton horizontal;
  public ControlCheck economico;
  public ControlComboBox    hoja;
  public ControlEdit        margenSup;
  public ControlEdit        margenInf;
  public ControlEdit        margenIzq;
  public ControlEdit        margenDer;
  public ControlComboBox    tamañoLetra;
  public ControlCheck       abrir;  
  protected PrintJasperWork job;

  public PrintJasperPanel() {
	  pageSize = new LinkedHashMap<String, int[]>();
	  pageSize.put("LETTER"    , new int[]{612 ,792 });
	  pageSize.put("NOTE"      , new int[]{540 ,720 });
	  pageSize.put("LEGAL"     , new int[]{612 ,1008});
	  pageSize.put("A0"        , new int[]{2384,3370});
	  pageSize.put("A1"        , new int[]{1684,2384});
	  pageSize.put("A2"        , new int[]{1190,1684});
	  pageSize.put("A3"        , new int[]{842 ,1190 });
	  pageSize.put("A4"        , new int[]{595 ,842 });
	  pageSize.put("A5"        , new int[]{421 ,595 });
	  pageSize.put("A6"        , new int[]{297 ,421 });
	  pageSize.put("A7"        , new int[]{210 ,297 });
	  pageSize.put("A8"        , new int[]{148 ,210 });
	  pageSize.put("A9"        , new int[]{105 ,148 });
	  pageSize.put("A10"       , new int[]{74  ,105 });
	  pageSize.put("B0"        , new int[]{2836,4008});
	  pageSize.put("B1"        , new int[]{2004,2836});
	  pageSize.put("B2"        , new int[]{1418,2004});
	  pageSize.put("B3"        , new int[]{1002,1418});
	  pageSize.put("B4"        , new int[]{709 ,1002});
	  pageSize.put("B5"        , new int[]{501 ,709 });
	  pageSize.put("ARCH_E"    , new int[]{2592,3456});
	  pageSize.put("ARCH_D"    , new int[]{1728,2592});
	  pageSize.put("ARCH_C"    , new int[]{1296,1728});
	  pageSize.put("ARCH_B"    , new int[]{864 ,1296});
	  pageSize.put("ARCH_A"    , new int[]{648 ,864 });
	  pageSize.put("FLSA"      , new int[]{612 ,936 });
	  pageSize.put("FLSE"      , new int[]{612 ,936 });
	  pageSize.put("HALFLETTER", new int[]{396 ,612 });
	  pageSize.put("_11X17"    , new int[]{792 ,1224});
	  pageSize.put("LEDGER"    , new int[]{1224,792 });

	  
	  
	  
	  
  }

  public abstract VisualComponent getComponent();

  public static LinkedHashMap<String, int[]> pageSize;
  
  public abstract VisualComponent getTabComponent();


  
  protected void abrir(String destino, String programaAsociado) {
		try {
			int ret = Windows.ShellExecute("open", destino, null, null, Windows.SW_SHOWNORMAL);
			if (ret <= 32) {
		        switch (ret) {
		        	case Windows.ERROR_FILE_NOT_FOUND:
		        		ErrorManagerDefault.generalEx(null, "Archivo " + destino + " no se encuentra");
		        		break;
		        	case Windows.ERROR_PATH_NOT_FOUND:
		        		ErrorManagerDefault.generalEx(null, "Carpeta " + destino + " no se encuentra");
		        		break;
		        	case Windows.SE_ERR_NOASSOC:
		        		Maefc.message(programaAsociado+" no se encuentra instalado en su PC (o no esta asociada la extensión a un visor).\n\nSi desea instalarlo ahora, siga las instrucciones\nde la página web del fabricante.", "Instalación "+programaAsociado, Maefc.WARNING_MESSAGE);
		        		break;
		        }
			}
	    }
	    catch (Exception ex)
	    {
	      ErrorManagerDefault.generalEx(ex, "No ha sido posible abrir archivo PDF");
	    }
	  }
  
	protected boolean noEstaAbiertoElFichero (String destino) {		
		return noEstaAbiertoElFichero (destino,true);
	}
	
	protected boolean noEstaAbiertoElFichero (String destino,boolean mostrarMsg) {
		boolean bOk = destino != null && destino.trim().length()>0;
		if (bOk)  {
			FileOutputStream output = null;
			try {
				output = new FileOutputStream(new File(destino));
			}
			catch (Exception e) {
				bOk = false;
			}
			finally {
				if (output != null) {
					try {
						output.close();
					} 
					catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		if (!bOk && mostrarMsg) {
			Maefc.message("No ha sido posible abrir "+destino+"\n\nAsegurese que no esta abierto por otra aplicación\no revise el nombre y directorio del fichero.","Generar Listado",Maefc.ERROR_MESSAGE);
		}
		return bOk;
		
	}
	
  protected void onPredeterminar()
  {
	 String destinoPdf="";
	 boolean alAbrir =false; 
  	 PrintJasperPanelPDFQuer pjpPdf =  (PrintJasperPanelPDFQuer) job.dialog.getComponents()[1];
  	 for(int z=0;z<pjpPdf.getComponents().length;z++) {
       String name= pjpPdf.getComponents()[z].getName();
  	   if(name.equals("vvdestino")) {
  		 ControlEdit destPdf = (ControlEdit) pjpPdf.getComponents()[z];
  		 destinoPdf =   destPdf.getString();  		 
  	   }
  	   if(name.equals("vvabrir")) {
  		 ControlCheck destPdf = (ControlCheck) pjpPdf.getComponents()[z];
  		 alAbrir =   destPdf.getBoolean();  		 
  	   }
  	 }
	 String destinoWord="";	 
  	 PrintJasperPanelDOCQuer pjpWord =  (PrintJasperPanelDOCQuer) job.dialog.getComponents()[4];
  	 for(int z=0;z<pjpWord.getComponents().length;z++) {
       String name= pjpWord.getComponents()[z].getName();
  	   if(name.equals("vvdestino")) {
  		 ControlEdit destWord = (ControlEdit) pjpWord.getComponents()[z];
  		destinoWord =   destWord.getString();
  		break;
  	   }
  	 }
  	 
	 String destinoImp="";
	 PrintJasperPanelPrinterQuer pjpImpresora =  (PrintJasperPanelPrinterQuer) job.dialog.getComponents()[2];
  	 for(int z=0;z<pjpImpresora.getComponents().length;z++) {
       String name= pjpImpresora.getComponents()[z].getName();
  	   if(name.equals("vvdestino")) {
  		ControlEdit destImp = (ControlEdit) pjpImpresora.getComponents()[z];
  		destinoImp =   destImp.getString();
  		break;
  	   }
  	 }
	  
	  
	 Selector setRegistrePre = new Selector(Easp.connEA);
	 //String sentencia="";
 	 String valors=hoja.getString()
 			 		+"^"+tamañoLetra.getInteger()
 			 		+"^"+margenDer.getDouble()
 			 		+"^"+margenIzq.getDouble()
 			 		+"^"+margenSup.getDouble()
 			 		+"^"+margenInf.getDouble()
 			 		+"^"+horizontal.getBoolean()
 			 		+"^"+economico.getBoolean()
 			 		+"^"+(destinoPdf==null?"":destinoPdf )
 			 		+"^"+(alAbrir)
 			 		+"^"+(destinoWord==null?"":destinoWord)
 			 		+"^"+(destinoImp==null?"^":destinoImp);
 	 
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
	 Maefc.message("Se han guardado los cambios","",Maefc.INFORMATION_MESSAGE);
  }

	  protected void generaJrxml(JListado jl) throws Exception {
		  /** NEW, reeestructuracio fulla!!!**/
		  int tamanyHor = horizontal.getBoolean()?pageSize.get(hoja.getString())[1]: pageSize.get(hoja.getString())[0];
		  int tamanyVer = horizontal.getBoolean()?pageSize.get(hoja.getString())[0]: pageSize.get(hoja.getString())[1];
		  //double rel = (double)tamanyHor / 595D;
		  int posIni = 0;	  
		  jl.bSinColor = economico.getBoolean();
		  jl.setMargin((int)(margenIzq.getDouble()*96/2.54), (int)(margenDer.getDouble()*96/2.54), (int)(margenSup.getDouble()*96/2.54),(int)(margenInf.getDouble()*96/2.54));
		  jl.setPageSize(tamanyHor, tamanyVer);
		  jl.getStTitulo().setWidth((tamanyHor)-jl.getMargender());
		  jl.getStTitulo().setPosInicial(0-jl.getMargenizq());
		  for(int c=0;c<jl.getNumEncabezados();c++) {
		    jl.getEncabezado(c).getTf().setWidth((tamanyHor)-jl.getMargender());
		    jl.getEncabezado(c).setPosIni(0-jl.getMargenizq());
		  }
		  if(tamañoLetra.getInteger()!=jl.getSizeDetalle()) {
			int newPixelHeight = (int) Math.round((jl.getEspacioDetalle()*tamañoLetra.getInteger())/jl.getSizeDetalle());
			jl.setEspacioDetalle(newPixelHeight);
			//jl.setSizeDetalle(tamañoLetra.getInteger());
		    for(int z=0;z<jl.getNumColumnas();z++) {
		      jl.getColumna(z).setPosIni(posIni);
			  jl.getColumna(z).getSt().setSizeFont(tamañoLetra.getInteger());
			  jl.getColumna(z).getTf().setSizeFont(tamañoLetra.getInteger());
			  jl.getColumna(z).getSt().setAmplada(newPixelHeight);
			  jl.getColumna(z).getTf().setAmplada(newPixelHeight);
			  jl.getColumna(z).setOriginalSizePixel((int) Math.round(jl.getColumna(z).getOriginalSizePixel()*(tamañoLetra.getInteger()))/jl.getSizeDetalle());
			  jl.getColumna(z).setAmpladaOptima((int) Math.round(jl.getColumna(z).getAmpladaOptima()*(tamañoLetra.getInteger()))/jl.getSizeDetalle());
			  jl.getColumna(z).setTamany((int) Math.round(jl.getColumna(z).getTamany()*(tamañoLetra.getInteger()))/jl.getSizeDetalle());
			  jl.getColumna(z).getSt().setWidth(jl.getColumna(z).getTamany());    	  
	    	  jl.getColumna(z).getTf().setWidth(jl.getColumna(z).getTamany());  
			  posIni = posIni+jl.getColumna(z).getTamany();
		    }
		    for(int z=0;z<jl.getNumRoturas();z++) {	      
		      //jl.getRotura(z).setAnchura((tamañoLetra.getInteger()*jl.getRotura(z).getAnchura())/jl.getSizeDetalle());
		      //jl.getRotura(z).setHeaderHeight((tamañoLetra.getInteger()*jl.getRotura(z).getHeaderHeight())/jl.getSizeDetalle());
		      jl.getRotura(z).setAnchura(newPixelHeight);
		      jl.getRotura(z).setHeaderHeight(newPixelHeight);
		    }
		    jl.setSizeDetalle(tamañoLetra.getInteger());
		  }
		  resizeColumns(jl); 
		  jl.posActualColumnHeader = jl.getColumnWidth();
	  }

	  
	  protected void resizeColumns(JListado jl) throws Exception {
		HashMap<Integer, Integer> columResize = new HashMap<Integer,Integer>();
	    //int tamanyHor = pageSize.get(hoja.getString())[0];
	    int tamanyHor = jl.getColumnWidth();
	    int sumaTotalSizeCols = 0;
	    //int widthExcedent =0;
	    int i=0;
	    int posIni =0;    
	    sumaTotalSizeCols = totalWidthColumnas(jl);
	    int ultimaColumna = jl.getNumColumnas()-1;
	    if(sumaTotalSizeCols > tamanyHor) {  //s'ha de reestructurar
	      //primer retallem de les columnes que  el seu tamany es mes gran que l'original
	      for(i=0; i<=ultimaColumna;i++) {
	    	jl.getColumna(i).setPosIni(posIni);	    	
	    	if(jl.getColumna(i).getTipo() != Columna.STRING && jl.getColumna(i).getAmpladaOptima() < jl.getColumna(i).getTamany()) {
	    	  jl.getColumna(i).getSt().setWidth(jl.getColumna(i).getAmpladaOptima());    	  
	    	  jl.getColumna(i).getTf().setWidth(jl.getColumna(i).getAmpladaOptima());    	  
	    	  //widthExcedent += jl.getColumna(i).getTamany()-jl.getColumna(i).getAmpladaOptima();    	  
	    	  columResize.put(i,jl.getColumna(i).getTamany()-jl.getColumna(i).getAmpladaOptima());
	    	  posIni = posIni+jl.getColumna(i).getAmpladaOptima();
	    	  jl.getColumna(i).setTamany(jl.getColumna(i).getAmpladaOptima());
	    	}
	    	else {
	    	  posIni = posIni+jl.getColumna(i).getTamany();
	    	}
	      }
	      sumaTotalSizeCols = totalWidthColumnas(jl);
	      
	      //reduim els strings
	      if(sumaTotalSizeCols > tamanyHor) {//tornem a reestructurar,    	  
	        //columnes String >80px;
	        int tamanyMinimCol=100;
	        int restador=5;
	        while(sumaTotalSizeCols > tamanyHor) {
	    	  posIni=0;
	    	  for(i=0; i<=ultimaColumna;i++) {
	    	    jl.getColumna(i).setPosIni(posIni);
	            if(jl.getColumna(i).getTipo() == Columna.STRING && jl.getColumna(i).getTamany()>tamanyMinimCol) {
	        	  jl.getColumna(i).getSt().setWidth(jl.getColumna(i).getTamany()-restador);
	        	  jl.getColumna(i).getTf().setWidth(jl.getColumna(i).getTamany()-restador);        	
	        	  //widthExcedent += jl.getColumna(i).getTamany()-(jl.getColumna(i).getTamany()/2);
	        	  int totalRestat = jl.getColumna(i).getOriginalSizePixel()-(jl.getColumna(i).getTamany()-restador);
	        	  if(columResize.containsKey(i)){
	        		//totalRestat += columResize.get(i)+jl.getColumna(i).getOriginalSizePixel()-(jl.getColumna(i).getTamany()-restador);
	        		columResize.remove(i);
	        	  }
	        	  columResize.put(i,totalRestat); 
	        	  posIni = posIni+(jl.getColumna(i).getTamany()-restador);
	        	  jl.getColumna(i).setTamany(jl.getColumna(i).getTamany()-restador);
	            }
	            else {
	              posIni = posIni+jl.getColumna(i).getTamany();
	            }
	    	  }
	    	  if(sumaTotalSizeCols == totalWidthColumnas(jl)) break;
	    	  sumaTotalSizeCols = totalWidthColumnas(jl);
	        }
	        //reduim els numerics
	        tamanyMinimCol=42;
	        restador=4;
	        while(sumaTotalSizeCols > tamanyHor) {
	     	  posIni=0;
	    	  for(i=0; i<=ultimaColumna;i++) {
	    	    jl.getColumna(i).setPosIni(posIni);
	            if(jl.getColumna(i).getTipo() != Columna.STRING && jl.getColumna(i).getTipo() != Columna.DATE && jl.getColumna(i).getTamany()>tamanyMinimCol) {
	        	  int totalRestar = jl.getColumna(i).getTamany()-restador< tamanyMinimCol?tamanyMinimCol: jl.getColumna(i).getTamany()-restador;       	  
	        	  jl.getColumna(i).getSt().setWidth(totalRestar);
	        	  jl.getColumna(i).getTf().setWidth(totalRestar);  
	        	  int totalRestat = jl.getColumna(i).getOriginalSizePixel()-(totalRestar);
	        	  if(columResize.containsKey(i)){        		
	        		columResize.remove(i);
	        	  }
	        	  columResize.put(i,totalRestat); 
	        	  posIni = posIni+(totalRestar);
	        	  jl.getColumna(i).setTamany(totalRestar);
	            }
	            else {
	               posIni = posIni+jl.getColumna(i).getTamany();
	            }
	    	  }
	    	  if(sumaTotalSizeCols == totalWidthColumnas(jl)) break;
	    	  sumaTotalSizeCols = totalWidthColumnas(jl);
	        }
	        if(sumaTotalSizeCols > tamanyHor) {  //s'ha de reestructurar    	
	      	  int multiplicador =3;
	    	  while(multiplicador!=0) {
	      	    posIni=0;
	            //primer retallem de les columnes que  el seu tamany es mes gran que l'original
	            for(i=0; i<=ultimaColumna;i++) {
	              jl.getColumna(i).setPosIni(posIni);
	              if(jl.getColumna(i).getTipo() == Columna.STRING && (jl.getColumna(i).getAmpladaOptima()*multiplicador) < jl.getColumna(i).getTamany()) {
	        	    jl.getColumna(i).getSt().setWidth(jl.getColumna(i).getAmpladaOptima()*2);
	        	    jl.getColumna(i).getTf().setWidth(jl.getColumna(i).getAmpladaOptima()*2);    	  
	        	    if(columResize.containsKey(i)){
	        		  columResize.remove(i);
	        	    }
	        	    columResize.put(i,jl.getColumna(i).getOriginalSizePixel()-jl.getColumna(i).getAmpladaOptima()*multiplicador);
	        	    posIni = posIni+(jl.getColumna(i).getAmpladaOptima()*multiplicador);
	        	    jl.getColumna(i).setTamany(jl.getColumna(i).getAmpladaOptima()*multiplicador);
	              }
	              else {
	          	    posIni = posIni+jl.getColumna(i).getTamany();
	              }
	            }
	            if(sumaTotalSizeCols < tamanyHor) break;
	            sumaTotalSizeCols = totalWidthColumnas(jl);
	            multiplicador--;
	    	  }
	        }
	        if(sumaTotalSizeCols < tamanyHor) {  //s'ha de reestructurar
	    	  recalculaExtraWidth(jl, tamanyHor-sumaTotalSizeCols,columResize);
	        }
	      } 
	      else if((jl.getRightWidthPosicion()-posIni)>0){//repartim widthExcedent        
	        recalculaExtraWidth(jl, tamanyHor-sumaTotalSizeCols,columResize);    	  
	      }
	    }
	  }
	  
	  protected void reestructuraUltimaColumna(JListado jl,int ultimaColumna, int posIni) throws Exception {
		  jl.getColumna(ultimaColumna).getSt().setWidth((jl.getRightWidthPosicion())-posIni);
	      jl.getColumna(ultimaColumna).getTf().setWidth((jl.getRightWidthPosicion())-posIni);
	      jl.getColumna(ultimaColumna).setTamany((jl.getRightWidthPosicion())-posIni); 
	  }
	  
	  protected int totalWidthColumnas(JListado jl) throws Exception {
	    int sumaTotal=0; 
	    for(int i=0; i<jl.getNumColumnas();i++) {
	      Columna newCol = jl.getColumna(i);
	      sumaTotal += newCol.getTamany();
	    }
	    return sumaTotal;
	  }
	  
	  protected void recalculaExtraWidth(JListado jl, int extraWidth,HashMap<Integer,Integer> columResize) throws Exception{
		  LinkedHashMap<Integer,Integer> sortHashMap = new LinkedHashMap<Integer, Integer>();	  
		  sortHashMap = sortHashMapByValuesD(columResize);
		  List<Integer> mapKeys = new ArrayList<Integer>(sortHashMap.keySet());	 
		  int i=0;
		  while(extraWidth >0 && i<mapKeys.size()) {
		    int col = mapKeys.get(i);
		    double percentColLost =(int) Math.round((100*jl.getColumna(col).getTamany())/ jl.getColumna(col).getOriginalSizePixel());
		    int pixelExtraWidthWin = (int)Maefc.round((extraWidth*percentColLost)/100,1);
		    jl.getColumna(col).getSt().setWidth(jl.getColumna(col).getTamany()+pixelExtraWidthWin);
		    jl.getColumna(col).getTf().setWidth(jl.getColumna(col).getTamany()+pixelExtraWidthWin);
		    jl.getColumna(col).setTamany(jl.getColumna(col).getTamany()+pixelExtraWidthWin);
		    
		    int cont = col+1;
		    while(cont<=jl.getNumColumnas()-1) {
		      jl.getColumna(cont).setPosIni(jl.getColumna(cont).getPosIni()+pixelExtraWidthWin);
		      cont++;
		    }
		    extraWidth -= pixelExtraWidthWin;
		    i++;
		  }
	  }
	  

	  protected LinkedHashMap<Integer,Integer> sortHashMapByValuesD(HashMap<Integer,Integer> passedMap) throws Exception{
	    List<Integer> mapKeys = new ArrayList<Integer>(passedMap.keySet());
		List<Integer> mapValues = new ArrayList<Integer>(passedMap.values());
		Collections.sort(mapValues);
		Collections.sort(mapKeys);

		LinkedHashMap<Integer,Integer> sortedMap = new LinkedHashMap<Integer,Integer>();

		Iterator<Integer> valueIt = mapValues.iterator();
		while (valueIt.hasNext()) {
		  Object val = valueIt.next();
	      Iterator<Integer> keyIt = mapKeys.iterator();

	      while (keyIt.hasNext()) {
	        Object key = keyIt.next();
	        String comp1 = passedMap.get(key).toString();
		    String comp2 = val.toString();

		    if (comp1.equals(comp2)){
	           passedMap.remove(key);
	           mapKeys.remove(key);
	           sortedMap.put((Integer)key, (Integer)val);
	           break;
	        }
	      }
	    }
	    return sortedMap;
	  }
	

	  
	  public HashMap<Integer, String> getParametros(String line) {
			HashMap<Integer,String> cont = new HashMap<Integer,String>();
		    //String contingut[] = new String[8];
		    int tokenNumber=0;
		    java.util.StringTokenizer st = new java.util.StringTokenizer(line, "^");    
		    while(st.hasMoreTokens())
		    {
		    	String contingut = st.nextToken();
		    	//contingut[tokenNumber] = st.nextToken();
		      cont.put(tokenNumber,contingut);
		      tokenNumber++;       
		    }
		    return cont;
		  }  
}
