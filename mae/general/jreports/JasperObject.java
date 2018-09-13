package mae.general.jreports;

public class JasperObject {

	public int left;
	public int top;
	public int width;
	public int height;
	
	private String foreColor;
	private String backColor;
	
	
	public JasperObject() {
		super();
	}
	
	public String getForeColor() {
		return foreColor;
	}
	public void setForeColor(String foreColor) {
		this.foreColor = foreColor;
	}
	public String getBackColor() {
		return backColor;
	}
	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}
	
	
	
}
