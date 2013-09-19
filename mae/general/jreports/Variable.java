package mae.general.jreports;

public class Variable {
	private String nom;
	private String evaluationTime;
	private String Expression;
	private String resetType;
	private String resetGroup;
	private String initialValue;
	private int tipo;

	public Variable(String nom) {
		this.nom = nom;
		tipo = Columna.DOUBLE;
	}
	public Variable(String nom,String expression) {
		this.nom = nom;
		this.Expression = "![CDATA["+expression+"]]";
		tipo = Columna.DOUBLE;
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
	public String getResetType() {
		return resetType;
	}
	public void setResetType(String resetType) {
		this.resetType = resetType;
	}
	public String getResetGroup() {
		return resetGroup;
	}
	public void setResetGroup(String resetGroup) {
		this.resetGroup = resetGroup;
	}
	public String getInitialValue() {
		return initialValue;
	}
	public void setInitialValue(String initialValue) {
		this.initialValue = initialValue;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
