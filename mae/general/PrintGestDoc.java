package mae.general;

import java.io.File;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import geyce.maefc.Aplication;
import geyce.maefc.CancelException;
import geyce.maefc.ErrorManagerDefault;
import geyce.maefc.PrintExcel;
import geyce.maefc.PrintOutput;
import geyce.maefc.PrintPDF;
import geyce.maefc.PrintPanel;
import geyce.maefc.PrintWork;
import geyce.maefc.Report;
import mae.easp.general.Easp;
import mae.general.jreports.IEtiquetaGD;



public class PrintGestDoc extends PrintOutput {
	
	public ArrayList<GesDocMir> lGesDoc = new ArrayList<GesDocMir>();
	
	public boolean isExcel = true;
	public boolean isPdf = false;
	public PrintPanelGestDoc ppgd;
	public Report informe;	
	public String plantillaExcel;
	public String scriptExcel;
	

	@Override
	public PrintPanel getPanel() {
		// TODO Auto-generated method stub		
		ppgd = new PrintPanelGestDoc(this);
		return ppgd;
	}

	@Override
	public void printjob() {
		// TODO Auto-generated method stub	  
      ProgressBarForm pbf=new ProgressBarForm(Aplication.getAplication().getCurrentProgram(),"Envío Gestión documental",true,false,true) {
        public void job() {	
          int num =1;
		  for(GesDocMir gf : lGesDoc) {			  
			try {
				setStateName("Subiendo ficheros a empresa ["+ num+"/"+lGesDoc.size() + "] :" + gf.getNif() + " " + gf.getNombre());
				
				//check si la emprsa te portal cdp o emir avans d'enviar perque sino pot trigar molt a generar el fitxer.
				if(gf.getDominioAfinity() != null) {			
					String fileUrl="";
					if(ppgd.crb_excel.getBoolean()) {
						fileUrl=gf.getUrlFile()+".xls";
						PrintExcel pmirexcel = new PrintExcel();
						pmirexcel.work = new PrintWork();
						//pmirexcel.work = work;
						pmirexcel.work.setShowPrinting(false);
						pmirexcel.work.setShowFinalMessage(false);
						pmirexcel.script = scriptExcel;
						pmirexcel.abrir = false;
						pmirexcel.plantilla = plantillaExcel;
						pmirexcel.destino = fileUrl;	
						gf.setUrlFile(fileUrl);
						pmirexcel.work.add(gf.getInforme());
						pmirexcel.print();
						
						
					}
					else if (ppgd.crb_pdf.getBoolean()) {
						fileUrl=gf.getUrlFile()+".pdf";
						PrintPDF pmirpdf = new PrintPDF();
						pmirpdf.work = new PrintWork();
						pmirpdf.work.setShowPrinting(false);
						pmirpdf.work.setShowFinalMessage(false);				
						pmirpdf.abrir = false;
						pmirpdf.destino = fileUrl;
						gf.setUrlFile(fileUrl);
						pmirpdf.work.add(gf.getInforme());
						pmirpdf.print();
						//parse("body");
					}
					//send
					if(ppgd.isPortalCdp && gf.isPortalCdp) {
						enviarGesDoc(gf);
										
					}
					else {
						enviarEmir(gf);	
					}
				
				}
		
			}	
			catch(Exception ex) {
		    	  ex.printStackTrace();
		        ErrorManagerDefault.generalEx(ex,"No ha sido posible generar archivo, envío fállido.");
		    }
		    finally {
		      num++;
		      if (work.printingDialog!=null) work.printingDialog.close();
		        work.setPrinting(false);
		    }	
	      }
		  exit();
        }
      };
      pbf.setEnabledCancel(false);
      pbf.setAuto(true);
      pbf.launch();
      
    }
	
	private void enviarEmir(GesDocMir gf) throws Exception {
	  File file=new File(gf.getUrlFile());
      String fichero = file.getAbsolutePath() ;
	  File f = new File(fichero); 	
	  String fechaHoy = Fecha.fechaGregoriana(Fecha.hoy()).substring(6,8)+"-"+Fecha.fechaGregoriana(Fecha.hoy()).substring(4,6)+"-"+Fecha.fechaGregoriana(Fecha.hoy()).substring(0,4);
	  String procedure = "agpi2dp.AgpiAltaPDF";
	    // Azure az = new Azure(procedure , param.toString(),f);
	  Azure az = new Azure(procedure,null ,f);

	  az.addParametroURL("ppupdp",Easp.dominio);
	  az.addParametroURL("ppupiden", new File(gf.getUrlFile()).getName());
	  az.addParametroURL("ppupclientedp", gf.getDominioAfinity());
	  az.addParametroURL("ppupproducto", gf.getAplicacion().name());
	  az.addParametroURL("ppupambito", "");
	  az.addParametroURL("ppuptitulo", gf.getSubtitulo());
	  az.addParametroURL("ppupdesc", "");
	  az.addParametroURL("ppupfechacre", fechaHoy);
	  az.addParametroURL("ppupfechapub", fechaHoy);
	  az.addParametroURL("ppupejer", gf.getEjercicio());
	  az.addParametroURL("ppupperiodo", gf.getPeriodo());
	  az.addParametroURL("ppupusuario","*");
	  
	  
	  if (az.procesar ()) {
	    String contenido = az.getContenido();
	    if (contenido.indexOf("<altapdf />")>0) {
	      gf.setFileSend(true); 	
	    	
	    	
        }
        else
        	throw new Exception ("No ha sido posible enviar el documento");    	  
	  }
	  else  {
		  throw new Exception ("No ha sido posible enviar el documento");
	  }	
	  
	  
	}
	
	private void enviarGesDoc(GesDocMir gf) throws Exception {
		JsonObject jo = creaJson (gf);
		System.out.println(jo);
		Azure az = new Azure ("gesdoc.uploadfile", null, new File(gf.getUrlFile()), jo);
		
		if (!az.procesar()) {
			throw new Exception ("No se ha podido subier el fichero a la GesDoc: "+az.getError());
		}
		gf.setFileSend(true); 
//		else {
//			Maefc.message ("Proceso realizado correctamente.","¡Atención!",Maefc.INFORMATION_MESSAGE);
//			job.dialog.exit();
//		}
	}
	
	
	private JsonObject creaJson (GesDocMir gf) {
		JsonObjectBuilder builder = Json.createObjectBuilder();
		JsonArrayBuilder arrdetBuilder = Json.createArrayBuilder();
		File sendFile = new File(gf.getUrlFile());
		String extension = "";
		int index = sendFile.getName().lastIndexOf('.');
		  if (index > 0) {
			  extension = sendFile.getName().substring(index + 1);
		  }
		
		
		for (IEtiquetaGD e : gf.getEtiquetas()) {
			JsonObjectBuilder detBuilder = Json.createObjectBuilder();
			detBuilder.add("clave", e.getIdentificador().toString());
			detBuilder.add("valor", e.getValor());
			arrdetBuilder.add(detBuilder);
		}
		builder.add("etiquetas", arrdetBuilder);
		builder.add("cdp", gf.getDominioAfinity());
		builder.add("nombrefit", sendFile.getName());
		builder.add("descfit", gf.getDescripciónFichero());
		builder.add("tipofit", extension);
		builder.add("sendmail",ppgd.cc_sendmail.getBoolean());
		builder.add("mail", gf.getMailToSend());
		if (ppgd.ubicacionUsuario != null) builder.add("iddir",ppgd.ubicacionUsuario.getId());
		else builder.add("iddir", 0);
		if( gf.getUbicacionGD() != null) builder.add("ubic", gf.getUbicacionGD());
		else builder.add("ubic", "Emir");
		builder.add("usr", Easp.usuario);
		
		return builder.build();
	}

	@Override
	public int getLinPag() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startAlignment(String alignment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endAlignment() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imagen(String name, String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tab(int pos) throws CancelException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addText(String text) throws CancelException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void br() throws CancelException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fontStyle(String style) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endFontStyle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novaPagina() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void addGesDoc(GesDocMir gd) {
		if(gd != null)
		  lGesDoc.add(gd);		 
	}

}
