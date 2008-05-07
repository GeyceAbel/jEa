package mae.general;
import java.util.Hashtable;

public interface XMLListener {
	void startDocument();
	void endDocument();
	void startElement(String elem, Hashtable attributelist);
	void endElement(String elem);
	void characters(String chars);
  }
