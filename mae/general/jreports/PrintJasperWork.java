package mae.general.jreports;

import java.util.Vector;

import mae.easp.general.Easp;
import mae.modasp.general.Modasp;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class PrintJasperWork {
	public PrintJasperDialog        dialog;
	public DBConnection conn;
	private boolean pestanaPDF;
	private boolean pestanaEXCEL;
	private boolean pestanaVISOR;
	private boolean pestanaImpresora;
	private boolean pestanaDOCX;
	protected Vector <JListado> vTarea;
	protected String destino;
	protected boolean abrir;
	protected boolean horizontal;
	protected double margenSuperior;
	protected double margenInferior;
	protected double margenIzquierdo;
	protected double margenDerecho;
	protected int tamañoLetra;
	protected boolean modifValores;
	protected String titulo;

	

	public void setPestanaPDF(boolean pestanaPDF) {
		this.pestanaPDF = pestanaPDF;
	}

	public void setPestanaEXCEL(boolean pestanaEXCEL) {
		this.pestanaEXCEL = pestanaEXCEL;
	}

	public void setPestanaVISOR(boolean pestanaVISOR) {
		this.pestanaVISOR = pestanaVISOR;
	}

	public void setPestanaImpresora(boolean pestanaImpresora) {
		this.pestanaImpresora = pestanaImpresora;
	}

	public void setPestanaDOCX(boolean pestanaDOCX) {
		this.pestanaDOCX = pestanaDOCX;
	}

	public PrintJasperWork(String titulo,DBConnection conn) {
		vTarea = new Vector<JListado>();
		this.titulo = titulo;
		this.conn = conn;		
	}

	public void dialog (Program program) {
		setDefaults();
		dialog = this.createDialog(program);
		dialog.showDialog();
	}

	private void setDefaults() {
		destino=System.getProperty("user.dir")+"listado_"+Easp.getNomPC();
		abrir = true;
		horizontal = false;
		margenSuperior = 2;
		margenInferior = 1;
		margenIzquierdo = 2;
		margenDerecho = 1;
		tamañoLetra = 8;
		modifValores = true;
		pestanaPDF = true;
		pestanaEXCEL = true;
		pestanaVISOR = true;
		pestanaImpresora = true;
		pestanaDOCX = true;
	}

	public PrintJasperDialog createDialog(Program prog) {
		PrintJasperDialog dialog = new PrintJasperDialog(this, prog);
		dialog.setpPDF(pestanaPDF);
		dialog.setpEXCEL(pestanaEXCEL);
		dialog.setpVISOR(pestanaVISOR);
		dialog.setpImpresora(pestanaImpresora);
		dialog.setpDOCX(pestanaDOCX);
		return dialog;
	}

	public void addListado (JListado listado) {
		vTarea.addElement(listado);
	}
}
