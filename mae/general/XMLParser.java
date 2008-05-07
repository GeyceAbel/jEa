package mae.general;
import java.io.*;
import java.util.Hashtable;

public class XMLParser {
	XMLListener listener;

	public XMLParser(XMLListener listener) {
		this.listener=listener;
	  }

	public void parse(InputStream inputstream) throws IOException {
		Reader reader = new BufferedReader(new InputStreamReader(inputstream));
		Object[] parentlist = null;
		Object current = null;
		Hashtable attributelist = null;
		StringBuffer text = new StringBuffer();
		listener.startDocument();
		for (int c = reader.read(); c != -1;) {
			if (c == '<') {
				if ((c = reader.read()) == '/') { //endtag
					if (text.length() > 0) {
						if (text.charAt(text.length() - 1) == ' ') {
							text.setLength(text.length() - 1);
						}
					  listener.characters(text.toString());
						text.setLength(0);
					}
					String tagname = (String) parentlist[2]; //getClass(current);
					for (int i = 0; i < tagname.length(); i++) { // current-tag
						if ((c = reader.read()) != tagname.charAt(i)) {
							throw new IllegalArgumentException(tagname);
						}
					}
					while (" \t\n\r".indexOf(c = reader.read()) != -1); // whitespace
					if (c != '>') throw new IllegalArgumentException(); // '>'
					c = reader.read();
					listener.endElement((String)current);
					if (parentlist[0] == null) {
						reader.close();
						listener.endDocument();
						return;
					}
					current = parentlist[0];
					parentlist = (Object[]) parentlist[1];
				}
				else { //start or standalone tag
					boolean instruction = (c == '?'); // Processing Instructions
					if (c == '!') { while ((c = reader.read()) != '>'); continue; } // DOCTYPE
					if (instruction) { c = reader.read(); }
					text.setLength(0);
					boolean iscomment = false;
					while (">/ \t\n\r".indexOf(c) == -1) {
						text.append((char) c);
						if ((text.length() == 3) && (text.charAt(0) == '!') &&
								(text.charAt(1) == '-') && (text.charAt(2) == '-')) {
							int m = 0;
							while (true) {
								c = reader.read();
								if (c == '-') { m++; }
								else if ((c == '>') && (m >= 2)) { break; }
								else { m = 0; }
							}
							iscomment = true;
						}
						c = reader.read();
					}
					if (iscomment) { continue; }
					if (!instruction) {
						String tagname = text.toString();
						parentlist = new Object[] { current, parentlist, tagname };
						current = tagname;
					}
					text.setLength(0);
					while (true) {
						boolean whitespace = false;
						while (" \t\n\r".indexOf(c) != -1) {
							c = reader.read();
							whitespace = true;
						}
						if (c == '>') {
							if (instruction) throw new IllegalArgumentException(); // '?>'
						  listener.startElement((String) current, attributelist); attributelist = null;
							c = reader.read();
							break;
						}
						else if (c == '/') {
							if (instruction) throw new IllegalArgumentException(); // '?>'
							if ((c = reader.read()) != '>') {
								throw new IllegalArgumentException(); // '>'
							}
							listener.startElement((String) current, attributelist); attributelist = null;
							listener.endElement((String)current);
							if (parentlist[0] == null) {
								reader.close();
								listener.endDocument();
								return;
							}
							current = parentlist[0];
							parentlist = (Object[]) parentlist[1];
							c = reader.read();
							break;
						}
						else if (instruction && (c == '?')) {
							if ((c = reader.read()) != '>') {
								throw new IllegalArgumentException(); // '>'
							}
							c = reader.read();
							break;
						}
						else if (whitespace) {
							while ("= \t\n\r".indexOf(c) == -1) {
								text.append((char) c);
								c = reader.read();
							}
							String key = text.toString();
							text.setLength(0);
							while (" \t\n\r".indexOf(c) != -1) c = reader.read();
							if (c != '=') throw new IllegalArgumentException();
							while (" \t\n\r".indexOf(c = reader.read()) != -1);
							char quote = (char) c;
							if ((c != '\"') && (c != '\'')) throw new IllegalArgumentException();
							while (quote != (c = reader.read())) {
								if (c == '&') {
									StringBuffer eb = new StringBuffer();
									while (';' != (c = reader.read())) { eb.append((char) c); }
									String entity = eb.toString();
									if ("lt".equals(entity)) { text.append('<'); }
									else if ("gt".equals(entity)) { text.append('>'); }
									else if ("amp".equals(entity)) { text.append('&'); }
									else if ("quot".equals(entity)) { text.append('"'); }
									else if ("apos".equals(entity)) { text.append('\''); }
									else if (entity.startsWith("#")) {
										text.append((char) Integer.parseInt(entity.substring(1)));
									}
									else throw new IllegalArgumentException("unknown " + "entity " + entity);
								}
								else text.append((char) c);
							}
							if (!instruction) {
								if (attributelist == null) { attributelist = new Hashtable(); }
								attributelist.put(key, text.toString());
							}
							text.setLength(0);
							c = reader.read();
						}
						else throw new IllegalArgumentException();
					}
				}
			}
			else {
				if (" \t\n\r".indexOf(c) != -1) {
					if ((text.length() > 0) && (text.charAt(text.length() - 1) != ' ')) {
						text.append(' ');
					}
				}
				else {
					text.append((char) c);
				}
				c = reader.read();
			}
		}
		throw new IllegalArgumentException();
	}
}

