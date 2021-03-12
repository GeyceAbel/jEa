package mae.easp.pradfitxerafin;

import java.util.ArrayList;

public class FamiliaElement extends Element {

	private ArrayList<Element> elements = null;
	
	public ArrayList<Element> getElements() {
		return elements;
	}
	
	public boolean hasElements() {
		return elements != null && elements.size() > 0;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
	}
	
	public void addElement(Element e) {
		if (elements == null) elements = new ArrayList<Element>();
		this.elements.add(e);
	}
	
	public void removeElement(Element e) {
		this.elements.remove(e);
	}
	
	public EtiquetaElement buscaEtiqueta(String nomEtiqueta) {
		if (elements == null || elements.size() == 0) return null;
		for (Element element : elements) {
			if (element instanceof EtiquetaElement && nomEtiqueta.equals(element.getNombre()))
				return (EtiquetaElement) element;
		}
		return null;
	}

	@Override
	public String toString() {
		return super.toString() + " FamiliaElement [elements=" + elements + "]";
	}
}