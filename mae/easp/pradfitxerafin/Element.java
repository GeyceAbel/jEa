package mae.easp.pradfitxerafin;

public abstract class Element {
	private int id = 0;
	private String nombre = "";
	private String desc = "";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Element [id=" + id + ", nombre=" + nombre + ", desc=" + desc + "]";
	}
}
