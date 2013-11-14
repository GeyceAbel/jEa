package mae.general.jreports;

import java.util.Vector;

public class ExtraBand {
	Vector<Columna> vcol;
	String printWhen;
	
	public ExtraBand () {
		this (null);
	}
	
	public ExtraBand (String printWhen) {
		this.printWhen = printWhen;
		vcol = new Vector<Columna>();
	}
	
	public void addColumn (Columna c) {
		vcol.addElement(c);
	}
	
	public Vector<Columna> getColumnes () {
		return vcol;
	}
	
	public String getPrintWhen() {
		return printWhen;
	}
	
	public void setPrintWhen(String printWhen) {
		this.printWhen = printWhen;
	}
	
	
}
