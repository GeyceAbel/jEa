package mae.general.jreports;

public class Totalizar { 
  
  public enum Calculation { SUM, COUNT, DISTINCT_COUNT, AVERAGE, LOWEST,HIGHEST,FIRST} ;

  private Calculation tipoTotalizar;  //sum,count,etc...
  private int tipo;
  private String titol;
  private Variable variable;
  private Columna col;
  private String backGroundColor = "#9999FF";
  /*
  public Totalizar (String titulo,String nombreVariable,String expresionVariable,Calculation tipoCalculo) {
	this.titol=titulo;
	Variable v = new Variable(nombreVariable, expresionVariable);
	this.variable = v;
    setTipoTotal(tipoCalculo);	  
  }
  */
  
  public Totalizar (String title,Columna col,Calculation tipoCalculo) {
	this.col = col;
	this.titol = title;
    setTipoTotal(tipoCalculo);	  
  }
  
  private void setTipoTotal(Calculation tipoCalculo) {
	  this.tipoTotalizar = tipoCalculo;
	  tipo = Columna.DOUBLE;
	  if(tipoTotalizar == Calculation.COUNT) tipo = Columna.INTEGER;
	  else if(tipoTotalizar == Calculation.DISTINCT_COUNT) tipo = Columna.INTEGER;
  }
  
  public String getTipoTotal() {
    if(tipoTotalizar == Calculation.SUM) return "Sum";
    else if(tipoTotalizar == Calculation.COUNT) return "Sount";
    else if(tipoTotalizar == Calculation.DISTINCT_COUNT) return "DistinctCount";
    else if(tipoTotalizar == Calculation.AVERAGE) return "Average";
    else if(tipoTotalizar == Calculation.LOWEST) return "Lowest";
    else if(tipoTotalizar == Calculation.HIGHEST) return "Highest";
    else if(tipoTotalizar == Calculation.FIRST) return "First";
    else return "Sum";
  }
  
  public String getTipoClass() {
	  switch(tipo) {
	  case Columna.DOUBLE: return "java.lang.Double";
	  case Columna.INTEGER : return "java.lang.Integer";
	  case Columna.STRING : return "java.lang.String";
	  case Columna.DATE : return "java.util.Date";
	  default: return "java.lang.Double";
	  }
  }
  
  public String getTitol() {
	  return titol;
  }
  
  public Variable getVariable() {
	  return variable;
  } 
  
  public int getTipo() {
	  return tipo;
  }
 
  public Columna getColumna() {
    return col;
  }
  
  public void setBackGroundColor(String color) {
	  this.backGroundColor = color;
  }
  
  public String getBackGroundColor() {
	  return backGroundColor;
  }
	
}

