package mae.general.jreports;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import net.sf.jasperreports.view.JasperViewer;
import geyce.maefc.ControlButton;
import geyce.maefc.ControlPanel;
import geyce.maefc.ErrorManagerDefault;
import geyce.maefc.Maefc;
import geyce.maefc.VisualComponent;
import geyce.maefc.Windows;

public abstract class PrintJasperPanel extends ControlPanel
{
  public ControlButton predeterminar;

  public PrintJasperPanel() {
  }

  public void onPredeterminar()
  {
  }

  public abstract VisualComponent getComponent();

  public abstract VisualComponent getTabComponent();

  public void addPredeterminar()
  {
    predeterminar = new ControlButton(this)
    {
      public void onClick()
      {
        if (PrintJasperPanel.this.isValid())
          onPredeterminar();
      }
    };
    predeterminar.setName("btpredeterminar");
    predeterminar.setTitle("Predeterminar");
    predeterminar.setMnemonic('P');
    predeterminar.setImage("geyce/maefc/images/predeterminar.png");

    addControl(predeterminar);
  }
  
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
	
}
