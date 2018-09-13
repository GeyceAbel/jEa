package mae.general.jreports;

import java.util.ArrayList;
import java.util.Vector;

public class Band {
	public enum SplitType { DEFAULT,STRETCH, PREVENT, IMMEDIATE} ;
	int height = 15;
	String printWhen;
	Vector <TextField> vtf;
	Vector <StaticText> vst;
	ArrayList<JasperObject> jasperObject;
	SplitType splitType = SplitType.STRETCH; 
	
	
	public String getSplitType() {
		switch(splitType) {
		case DEFAULT: return "Default";
		case STRETCH: return "Stretch";
		case PREVENT: return "Prevent";
		case IMMEDIATE: return "Immediate";
		default: return "Default";
		}
	}

	public void setSplitType(SplitType splitType) {
		this.splitType = splitType;
	}

	
	public Band () {
		vtf = new Vector<TextField>();
		vst = new Vector<StaticText>();
		jasperObject = new ArrayList<JasperObject>();
	}

	public ArrayList<JasperObject> getJasperObject() {
		return jasperObject;
	}


	public void addJasperObject(JasperObject jo) {
	  jasperObject.add(jo);	
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
	
	public Vector <TextField> getTextFields () {
		return vtf;
	}
	

}
