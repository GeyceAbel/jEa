package mae.general.jreports;

import geyce.maefc.Form;
import geyce.maefc.LayoutTabbed;
import geyce.maefc.LocationWindow;
import geyce.maefc.Program;

public class PrintJasperDialog extends Form
{
	private PrintJasperWork     job;
	private boolean pPDF;
	private boolean pEXCEL;
	private boolean pVISOR;
	private boolean pImpresora;
	private boolean pDOCX;
	private boolean pTXT;
	private boolean pEMIR;
	private boolean isQuery;
	public PrintJasperDialog (PrintJasperWork job, Program prog,boolean isQuery)
	{
		super(prog);
		this.job = job;
		this.isQuery=isQuery;
		setName("vprint");
		setTitle(job.titulo);
		setLayout(new LayoutTabbed());
		setModal(true);
		setPrintable(false);
		LocationWindow lw = new LocationWindow();
		lw.setModal(true);
		lw.setLocation(LocationWindow.CENTER);
		lw.setWidth(640);
     	lw.setHeight(505);
		setLocation(lw);	
	}
	
	
	
	
	public void setQuery(boolean isQuery) {
	  this.isQuery = isQuery;	
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
	
	public void setpTXT(boolean pTXT) {
		this.pTXT = pTXT;
	}

	public void setpEMIR(boolean pEMIR) {
		this.pEMIR = pEMIR;
	}
	
	public void showDialog()
	{
		creaTabs();
		run();
	}

	protected void creaTabs() {
		if (pVISOR) {
			PrintJasperPanel panel;
			if(!isQuery) {
			  panel = new  PrintJasperPanelVisor(job);
			}
			else panel = new  PrintJasperPanelVisorQuer(job);
			panel.setParent(this);
			addTab(panel);
			job.isVistaPrevia = true;
		}
		if (pPDF) {
			PrintJasperPanel panel;
			if(!isQuery) {
			  panel = new  PrintJasperPanelPDF(job);
			}
			else panel = new  PrintJasperPanelPDFQuer(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pImpresora) {
			PrintJasperPanel panel;
			if(!isQuery) {
			  panel = new  PrintJasperPanelPrinter(job);
			}
			else panel = new  PrintJasperPanelPrinterQuer(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pEXCEL) {
			PrintJasperPanel panel = new  PrintJasperPanelXLS(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pDOCX) {
			PrintJasperPanel panel;
			if(!isQuery) {
			  panel = new  PrintJasperPanelDOC(job);
			}
			else panel = new  PrintJasperPanelDOCQuer(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pTXT) {
			PrintJasperPanel panel = new  PrintJasperPanelTXT(job);
			panel.setParent(this);
			addTab(panel);
		}
		if (pEMIR) {
			PrintJasperPanel panel = new  PrintJasperPanelEMIR(job);
			panel.setParent(this);
			addTab(panel);
		}
		
		if (job.getGD() != null) {
			PrintJasperPanelGesDoc panel = new  PrintJasperPanelGesDoc(job);
			panel.setParent(this);
			addTab(panel);
		}
	}
/*	
	public String getDestinoWord() {
		return destinoWord;
	}
	
	public String getDestinoPdf() {
		return destinoPdf;
	}

	public void setDestinoWord(String destinoWord) {
		this.destinoWord= destinoWord;
	}
	
	public void setDestinoPdf(String destinoPdf) {
		this.destinoPdf= destinoPdf;
	}
*/
	public void addTab(PrintJasperPanel tab) {
		addControl(tab.getTabComponent());
	}
}
