package mae.general.jreports;

public class Variable {
	private String nom;
	private String evaluationTime;
	private String Expression;
	
	public Variable(String nom) {
		this.nom = nom;
	}
	public Variable(String nom,String expression) {
		this.nom = nom;
			this.Expression = "![CDATA["+expression+"]]";
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEvaluationTime() {
		return evaluationTime;
	}
	public void setEvaluationTime(String evaluationTime) {
		this.evaluationTime = evaluationTime;
	}

	public String getExpression() {
		return Expression;
	}

	public void setExpression(String expression) {
		Expression = "![CDATA["+expression+"]]";
	}
	
}
