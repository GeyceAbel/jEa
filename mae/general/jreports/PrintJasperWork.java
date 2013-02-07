package mae.general.jreports;

import java.util.Vector;

import mae.easp.general.Easp;
import mae.modasp.general.Modasp;
import geyce.maefc.DBConnection;
import geyce.maefc.Program;

public class PrintJasperWork {
	public PrintJasperDialog        dialog;
	public DBConnection conn;
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
		destino="listado_"+Easp.getNomPC();
		abrir = true;
		horizontal = false;
		margenSuperior = 2;
		margenInferior = 1;
		margenIzquierdo = 2;
		margenDerecho = 1;
		tamañoLetra = 8;
		modifValores = true;
	}

	public PrintJasperDialog createDialog(Program prog) {
		PrintJasperDialog dialog = new PrintJasperDialog(this, prog);
		return dialog;
	}

	public void addListado (JListado listado) {
		vTarea.addElement(listado);
	}
}
