package mae.easp.progesdoc;

public abstract class Element {
	private int id = 0;
	private int parentId = 0;
	private String nom = "";
	private String fechaCrea = "";
	private String usuari = "";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFechaCrea() {
		return fechaCrea;
	}
	public void setFechaCrea(String fechaCrea) {
		this.fechaCrea = fechaCrea;
	}
	public String getUsuari() {
		return usuari;
	}
	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}
	@Override
	public String toString() {
		return "Element [id=" + id + ", nom=" + nom + ", fechaCrea=" + fechaCrea + ", usuari=" + usuari + "]";
	}
}