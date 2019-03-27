package mae.easp.general;

import geyce.maefc.*;

import java.text.SimpleDateFormat;
import java.util.*;

import mae.general.Fecha;


public class Seguridad {
	private final int NO_AUTO_COMMIT = 0;
	private final int AUTO_COMMIT = 1;
  private int codigo     ;
  private DBConnection connSeguridad=null;
  private String missatgeError = null;
  private int autoCommit;

  Select sseguridad      ;
  Table tseguridad       ;
  Field segcodigo        ;
  Field segcontroblig    ;
  Field seglongminima    ;
  Field seginclletras    ;
  Field segincnumeros    ;
  Field seginccarespec   ;
  Field segcontrexpira   ;
  Field segreutiliza     ;
  Field seghistorico     ;
  Field segintento       ;
  Field segprimeravez    ;
  Field segsesinactiva   ;
  Field segmaxsesion     ;
  Field segsesionsimul   ;

  public Seguridad (DBConnection db,int codigo) {
    this.codigo = codigo;
    connSeguridad  = db;

    sseguridad      =new Select(connSeguridad);
    tseguridad      =new Table(sseguridad,"SEGURIDAD");
    segcodigo       =new Field(sseguridad,tseguridad,"segcodigo");
    segcontroblig   =new Field(sseguridad,tseguridad,"segcontroblig");
    seglongminima   =new Field(sseguridad,tseguridad,"seglongminima");
    seginclletras   =new Field(sseguridad,tseguridad,"seginclletras");
    segincnumeros   =new Field(sseguridad,tseguridad,"segincnumeros");
    seginccarespec  =new Field(sseguridad,tseguridad,"seginccarespec");
    segcontrexpira  =new Field(sseguridad,tseguridad,"segcontrexpira");
    segreutiliza    =new Field(sseguridad,tseguridad,"segreutiliza");
    seghistorico    =new Field(sseguridad,tseguridad,"seghistorico");
    segintento      =new Field(sseguridad,tseguridad,"segintento");
    segprimeravez   =new Field(sseguridad,tseguridad,"segprimeravez");
    segsesinactiva  =new Field(sseguridad,tseguridad,"segsesinactiva");
    segmaxsesion    =new Field(sseguridad,tseguridad,"segmaxsesion");
    segsesionsimul  =new Field(sseguridad,tseguridad,"segsesionsimul");

    hasSeguridad();
    missatgeError = null;
    autoCommit = AUTO_COMMIT;
  }

  public void setAutoCommit() {
    autoCommit = AUTO_COMMIT;
  }
  public void remAutoCommit() {
    autoCommit = NO_AUTO_COMMIT;
  }
  public boolean isAutoCommit() {
    return (autoCommit == AUTO_COMMIT);
  }

  public boolean hasSeguridad() {
    sseguridad.setWhere("segcodigo="+codigo);
    sseguridad.execute();
    return !sseguridad.isEof();
  }

  public boolean isObligatoria() {
    return "S".equals(segcontroblig.getString());
  }
  public int getLongMinima() {
    return seglongminima.getInteger();
  }
  public boolean caduca() {
    return (segcontrexpira.getInteger()>0);
  }
  public int getDiasCaducidad() {
    return segcontrexpira.getInteger();
  }
  public boolean ctrlSinContrasenya(int codigo, String login) {
	  boolean sinContrasenya = false;
	  missatgeError = "";
	  if (isObligatoria()) {
		  Selector s = new Selector (connSeguridad);
		  s.execute("Select USPASSWD,USMD5 from usuario where uscodcon="+codigo+" and uslogin='"+login+"'");
		  if (s.next()) {
			  String password = s.getString("uspasswd");
			  String passmd5 = s.getString("usmd5");
			  if ((Easp.securityMD5 && (passmd5==null || "".equals(passmd5.trim()))) || (!Easp.securityMD5 && (password==null || "".equals(password.trim())))) {
				  sinContrasenya = true;
				  missatgeError = "Este usuario no tiene contraseña. Deberá introducir una.";
			  }
		  }
	  }
	  return sinContrasenya;
  }
  public boolean ctrlCaducada(int codigo, String login) {
      boolean haCaducado = false;
      missatgeError = "";
      if (caduca()) {
        java.util.Date ultFecha = null;
        int nDias = 0;
        Selector s = new Selector (connSeguridad);
        s.execute("Select uhfecha from USHISTORICO where uhcodcon="+codigo+" and uhlogin='"+login+"' order by uhfecha desc, uhhora desc");
        if (s.next()) ultFecha = s.getDate("uhfecha");
        s.close();
        if (ultFecha!=null) nDias = Fecha.diasDiferencia(ultFecha, Maefc.getDate());
        if (nDias>=getDiasCaducidad()) {
        	haCaducado = true;
        	missatgeError = "La contraseña ha caducado deberá cambiarla.";
        }
      }
      return haCaducado;
  }
  public boolean ctrlPrimeraVez(int codigo, String login) {
	  boolean primeraVez = false;
      missatgeError = "";
	  if (resetIniUsuario()) {
		  Selector s = new Selector (connSeguridad);
	      s.execute("Select UHPRIMERA from USHISTORICO where uhcodcon="+codigo+" and uhlogin='"+login+"' order by uhfecha desc, uhhora desc");
	      if (s.next()) primeraVez = "S".equals(s.getString("UHPRIMERA"));
	      s.close();
	  }
	  if (primeraVez) missatgeError = "Al ser la primera vez que accede a la aplicación deberá cambiar la contraseña.";
	  return primeraVez;
  }
  public boolean isConLetras() {
    return "S".equals(seginclletras.getString());
  }
  public boolean isConNumeros() {
    return "S".equals(segincnumeros.getString());
  }
  public boolean isConCaracteres() {
    return "S".equals(seginccarespec.getString());
  }
  public boolean isReutilizable() {
    return !"N".equals(segreutiliza.getString());
  }
  public boolean permiteUserRepetido() {
    return !"N".equals(segsesionsimul.getString());
  }

  public boolean ctrlExpiraSesion() {
    return (segmaxsesion.getInteger()>0);
  }
  public int getHorasSesion() {
    return segmaxsesion.getInteger();
  }
  public boolean ctrlSesionInactiva() {
    return (segsesinactiva.getInteger()>0);
  }
  public int getMinutosInactiva() {
    return segsesinactiva.getInteger();
  }
  public boolean resetIniUsuario() {
    return "S".equals(segprimeravez.getString());
  }
  public boolean ctrlReIntentos() {
     return (segintento.getInteger()>0);
  }
  public int getIntentos() {
     return segintento.getInteger();
  }
  public int getAntiguedad() {
     return seghistorico.getInteger();
  }
  public String getMissatgeAvis() {
      return missatgeError;
  }
  public boolean usuarioRepetido (String aplicacion, String usuario) {
      boolean repetido = false;
      missatgeError = "";
      Selector s = new Selector (connSeguridad);
      s.execute("Select * from IMPUSER where imuusuario='"+usuario+"' and imuaplicacion='"+aplicacion+"'");
      if (s.next()) {
         repetido = true;
         String maquina = s.getString("imumachine");
         if (maquina!=null) maquina = maquina.trim();
         missatgeError = "Por política de seguridad del despacho no se permite el acceso a la aplicación \n";
         missatgeError += "porque el  mismo usuario está conectado en el ordenador "+maquina+",\nel día ";
         java.util.Date dataUser = s.getDate("imufecha");
         if (dataUser!=null) missatgeError += Fecha.fechaGregoriana(dataUser).substring(6)+"-"+Fecha.fechaGregoriana(dataUser).substring(4,6)+"-"+Fecha.fechaGregoriana(dataUser).substring(0,4);
         missatgeError += " a las "+s.getString("imuhora")+".";

      }
      s.close();

      return repetido;
  }
  public boolean isContrasenyaValida(String novaContrasenya, String contrasenyaMD5, String usuario, boolean esMD5){
     boolean isValid = true;
     missatgeError = null;
     if (isObligatoria()) {
          if (getLongMinima()>0 && (novaContrasenya==null || novaContrasenya.trim().length()<getLongMinima())) {
              isValid = false;
              missatgeError = "La contraseña debe tener una longitud mínima de "+getLongMinima()+" caracteres.";
          }
          else {
        	  if (isConLetras()){
	              isValid = false;
	              for (int i=0;(i < novaContrasenya.length() && !isValid);i++) {
	                char c=novaContrasenya.charAt(i);
	                if ((c>=65 && c<=90) || (c>=97 && c<=122)) isValid = true;
	              }
	              if (!isValid) missatgeError = "La contraseña debe contener alguna letra.";
              }
             if (isValid && isConNumeros()){
	              isValid = false;
	              for (int i=0;(i < novaContrasenya.length() && !isValid);i++) {
	                char c=novaContrasenya.charAt(i);
	                if (c>=48 && c<=57) isValid = true;
	              }
	              if (!isValid) missatgeError = "La contraseña debe contener algún número.";
              }
              if (isValid && isConCaracteres()) {
	              isValid = false;
	              for (int i=0;(i < novaContrasenya.length() && !isValid);i++) {
	                char c=novaContrasenya.charAt(i);
	                if ((c>=33 && c<=47) || (c>=58 && c<=64) || (c>=91 && c<=96) || (c>=123 && c<=126)) isValid = true;
	              }
	              if (!isValid) missatgeError = "La contraseña debe contener algún caracter especial.";
              }
          }
          if (isValid){
             if (!isReutilizable() || getAntiguedad()>0) {
                 String whereContra = "uhpasswd='"+novaContrasenya+"'";
                 if (esMD5) whereContra = "uhmd5='"+contrasenyaMD5+"'";
                 Selector s = new Selector (connSeguridad);
                 s.execute("Select uhfecha from USHISTORICO where uhcodcon="+codigo+" and uhlogin='"+usuario+"' and "+whereContra);
                 if (s.next()) {
                    if (!isReutilizable()) {
                        isValid = false;
                        missatgeError = "La contraseña ya se ha utilizado anteriormente.";
                    }
                    else {
                        s.close();
                        int nVeces = 0;
                        boolean trobada = false;
                        s.execute("Select uhpasswd,uhmd5 from USHISTORICO where uhcodcon="+codigo+" and uhlogin='"+usuario+"' order by uhfecha desc, uhhora desc");
                        while (s.next() && !trobada) {
                            String contrasenya = s.getString("uhpasswd");
                            String contraMD5 = s.getString("uhmd5");
                            if ((esMD5 && contrasenyaMD5.equals(contraMD5)) || (!esMD5 && novaContrasenya.equals(contrasenya))) {
                                trobada = true;
                                if (nVeces<getAntiguedad()) {
                                    isValid = false;
                                    missatgeError = "La contraseña ya se ha utilizado anteriormente.";
                                }
                            }
                            else nVeces++;
                        }
                    }
                 }
                 s.close();
             }
          }
     }
     return isValid;
  }

  public boolean setContrasenya(int codigo, String login, String password, String passmd5, boolean isMD5 ) {
       boolean bOk = true;
       missatgeError = null;
       if ((password!=null && !"".equals(password.trim())) || (passmd5!=null && !"".equals(passmd5.trim()))) {
            Select susuarios=new Select(connSeguridad);
            Table tusuarios=new Table(susuarios,"usuario");
            Field fduscodcon        = new Field(susuarios,tusuarios,"uscodcon");
            Field fduslogin         = new Field(susuarios,tusuarios,"uslogin");
            Field fduspasswd        = new Field(susuarios,tusuarios,"uspasswd");
            Field fdusmd5           = new Field(susuarios,tusuarios,"usmd5");
            susuarios.setWhere("uscodcon="+codigo+" and uslogin='"+login+"'");
            susuarios.execute();
            susuarios.edit();
            if (isMD5) {
                fduspasswd.setNull();
                fdusmd5.setValue(passmd5);
            }
            else {
                fduspasswd.setValue(password);
                fdusmd5.setNull();
            }
            if (!susuarios.update()) {
               missatgeError = "No se ha podido actualizar la contraseña.";
               if (isAutoCommit())  connSeguridad.rollback();
               bOk = false;
            }
            else {
                if (!setHistorico(codigo, login, password, passmd5 )) bOk = false;
                else if (isAutoCommit()) connSeguridad.commit();
            }
       }
       return bOk;
  }
  public boolean setHistorico(int codigo, String login, String password, String passmd5 ) {
       boolean bOk = true;
       missatgeError = null;
       if ((password!=null && !"".equals(password.trim())) || (passmd5!=null && !"".equals(passmd5.trim()))) {
          Select shistorico=new Select(connSeguridad);
          Table thistorico=new Table(shistorico,"USHISTORICO");
          Field fduhcodcon     =new Field(shistorico,thistorico,"uhcodcon");
          Field fduhlogin      =new Field(shistorico,thistorico,"uhlogin");
          Field fduhfecha      =new Field(shistorico,thistorico,"uhfecha");
          Field fduhhora       =new Field(shistorico,thistorico,"uhhora");
          Field fduhpasswd     =new Field(shistorico,thistorico,"uhpasswd");
          Field fduhmd5        =new Field(shistorico,thistorico,"uhmd5");
          Field fduhprimera    =new Field(shistorico,thistorico,"uhprimera");
          String esPrimera = "N";
          if (!Easp.cambiarPassword) {
              shistorico.setWhere("uhcodcon="+codigo+" and uhlogin='"+login+"'");
              shistorico.execute();
              if (shistorico.isEof()) esPrimera = "S";
          }
          shistorico.addNew();
          fduhcodcon  .setValue(codigo);
          fduhlogin   .setValue(login);
          fduhfecha   .setValue(Maefc.getDate());
          fduhhora    .setValue(getTiempo());
          fduhpasswd  .setValue(password);
          fduhmd5     .setValue(passmd5);
          fduhprimera .setValue(esPrimera);
          if (!shistorico.insert()) {
              missatgeError = "No se ha podido guardar la contraseña en la tabla histórico.";
              if (isAutoCommit())  connSeguridad.rollback();
              bOk = false;
          }
          else if (isAutoCommit()) connSeguridad.commit();
       }
       return bOk;
  }
  public boolean eliminarHistorico(int codigo, String login ) {
       boolean bOk = true;
       missatgeError = null;
       try {
         connSeguridad.executeUpdate("delete from ushistorico where uhcodcon="+codigo+" and uhlogin='"+login+"'");
    	   if (isAutoCommit()) connSeguridad.commit();
       }
       catch(Exception e) {
    	   bOk = false;
    	   missatgeError = "No se ha podido eliminar el histórico de contraseñas.";
    	   if (isAutoCommit())  connSeguridad.rollback();
       }
       return bOk;
  }
	private String getTiempo() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(cal.getTime());
	}

}
