package mae.general.jreports;

public class Parametro {
  private String nom;
  private String type;
  private String expression;
  private boolean isImport;
  
  
  public Parametro(String nom,String expression,String tipus,boolean isImport) {
	this.nom = nom;
	this.expression = "![CDATA["+expression+"]]";
	this.type = tipus;
	this.isImport = isImport;
  }
  
  public boolean isImport() {
    return isImport;
  }
  
  public String getTipus() {
	return type;
  }
  
  public String getExpression() {
    return expression;
  }
  
  public String getName() {
	return nom;
  }
  
}
