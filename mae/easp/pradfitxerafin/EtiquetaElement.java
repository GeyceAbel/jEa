package mae.easp.pradfitxerafin;

public class EtiquetaElement extends Element {

	private String value = null;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return super.toString() + " EtiquetaElement [value=" + value + "]";
	}
}
