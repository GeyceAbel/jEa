package mae.general.jreports;

import java.util.Vector;

public class Band {
	int height;
	String printWhen;
	Vector <TextField> vtf;
	Vector <StaticText> vst;
	
	
	public Band () {
		vtf = new Vector<TextField>();
		vst = new Vector<StaticText>();
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getPrintWhen() {
		return printWhen;
	}


	public void setPrintWhen(String printWhen) {
		this.printWhen = printWhen;
	}
	
	public void addTextField (TextField tf) {
		vtf.addElement(tf);
	}
	
	public void addStaticText (StaticText st) {
		vst.addElement(st);
	}


	public int getNumStatics() {
		return vst.size();
	}


	public StaticText getStatic(int j) {
		return vst.elementAt(j);
	}


	public int getNumFields() {
		return vtf.size();
	}


	public TextField getFields(int j) {
		return vtf.elementAt(j);
	}
	

}
