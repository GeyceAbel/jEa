package mae.easp.general;

public class PerfilTributario implements java.io.Serializable {
  public String granemp;
  public String alquileres;
  public String intracom;
  public String intrastat;
  public java.util.Date finejer;
  public String regdevmens;

  public PerfilTributario(String granemp,String alquileres,String intracom,String intrastat, java.util.Date finejer, String regdevmens) {
    this.granemp=granemp;
    this.alquileres=alquileres;
    this.intracom=intracom;
    this.intrastat=intrastat;
    this.finejer=finejer;
    this.regdevmens=regdevmens;
  }
}

