package mae.easp.general;

public class PerfilAvisos implements java.io.Serializable {
  public int tipo; // 0=No recibe avisos 1=Por e-mail 2=Por SMS 3=Por mail i SMS
  public String mail;
  public String movil;
  public PerfilAvisos(int tipo,String mail,String movil) {
    this.tipo=tipo;
    this.mail=mail;
    this.movil=movil;
    }
  }
 