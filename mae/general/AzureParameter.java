package mae.general;

import org.apache.http.NameValuePair;

public class AzureParameter implements NameValuePair {
	private String nombre;
	private String valor;
	
	public AzureParameter (String nombre, String valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getName() {
		return nombre;
	}
	public String getValue() {
//		String v = URLEncoder.encode(valor);
//		try {
//			v = URLEncoder.encode(valor, StandardCharsets.UTF_8.toString());
//		} 
//		catch (UnsupportedEncodingException e) {e.printStackTrace();}
//		return v;
		return valor;
	}
}