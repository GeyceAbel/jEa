package mae.general.jreports;

import geyce.maefc.Form;
import geyce.maefc.LayoutTabbed;
import geyce.maefc.LocationWindow;
import geyce.maefc.Program;

import java.util.*;

public class PrintJasperDialog extends Form
{
	private PrintJasperWork     job;
	private boolean pPDF;
	private boolean pEXCEL;
	private boolean pVISOR;
	private boolean pImpresora;
	private boolean pDOCX;

	//private Vector panels   = new Vector();

	public PrintJasperDialog (PrintJasperWork job, Program prog)
	{
		super(prog);
		this.job = job;
		setName("vprint");
		setTitle("Salida...");
		setLayout(new LayoutTabbed());
		setModal(true);
		setPrintable(false);
		LocationWindow lw = new LocationWindow();
		lw.setModal(true);
		lw.setLocation(LocationWindow.CENTER);
		lw.setWidth(600);
		lw.setHeight(500);
		setLocation(lw);
		pPDF = true;
		pEXCEL = true;
		pVISOR = true;
		pImpresora = true;
		pDOCX = true;
	}

	public void setpPDF(boolean pPDF) {
		this.pPDF = pPDF;
	}

	public void setpEXCEL(boolean pEXCEL) {
		this.pEXCEL = pEXCEL;
	}

	public void setpVISOR(boolean pVISOR) {
		this.pVISOR = pVISOR;
	}

	public void setpImpresora(boolean pImpresora) {
		this.pImpresora = pImpresora;
	}

	public void setpDOCX(boolean pDOCX) {
		this.pDOCX = pDOCX;
	}

	public void showDialog()
	{
		creaTabs();
		run();
	}

	protected void creaTabs() {
		if (pVISOR) {
			PrintJasperPanel panel = new  PrintJasperPanelVisor(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pPDF) {
			PrintJasperPanel panel = new  PrintJasperPanelPDF(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pImpresora) {
			PrintJasperPanel panel = new  PrintJasperPanelPrinter(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pEXCEL) {
			PrintJasperPanel panel = new  PrintJasperPanelXLS(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pDOCX) {
			PrintJasperPanel panel = new  PrintJasperPanelDOC(job);
			panel.setParent(this);
			addTab(panel);
		}
		//panels.addElement(panel);
	}


	public void addTab(PrintJasperPanel tab) {
		addControl(tab.getTabComponent());
	}
	/*
  public PrintJasperPanel getPanel(Class clase) {
    for (int i = 0; i < panels.size(); i++) {
      Object obj = panels.elementAt(i);
      if (obj.getClass() == clase)
        return (PrintJasperPanel) obj;
    }
    return null;
  }
	 */
}
