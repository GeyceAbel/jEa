package mae.easp.progesdoc;

import java.util.ArrayList;

public class DirectoryElement extends Element {
	
	private ArrayList<Element> elements = null;

	public ArrayList<Element> getElements() {
		return elements;
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

	@Override
	public String toString() {
		return super.toString() + " DirectoryElement [elements=" + elements + "]";
	}
}
