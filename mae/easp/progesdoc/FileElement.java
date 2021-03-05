package mae.easp.progesdoc;

public class FileElement extends Element {

	private String desc = "";
	private String tipus = "";
	private long size = 0;
	private String flectura = "";
	private String idStorage = "";
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getFlectura() {
		return flectura;
	}
	public void setFlectura(String flectura) {
		this.flectura = flectura;
	}
	public String getIdStorage() {
		return idStorage;
	}
	public void setIdStorage(String idStorage) {
		this.idStorage = idStorage;
	}
	@Override
	public String toString() {
		return super.toString() + " FileElement [desc=" + desc + ", tipus=" + tipus + ", size=" + size
				+ ", flectura=" + flectura + ", idStorage=" + idStorage + "]";
	}
}
