package mae.general;

import java.sql.*;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Properties;
import geyce.maefc.*;
import mae.easp.general.Easp;
import mae.easp.db.CatEasp;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;

public class NewPassword implements NewPassListener{
	private DBConnection dbc;
  private NewPassDialog ld=null;
	private String dominio=null;
  private boolean md5;
  private String usuario;
  private static String newContrasenya = null;

  NewPassword(Aplication apl, String rutaLogo, String usuario, boolean md5,DBConnection dbc){
		SystemView.setGui(true);
    this.usuario = usuario;
    this.md5 = md5;
    this.dbc = dbc;

    ld=new NewPassDialog(this,apl, rutaLogo,usuario, md5);
		//Personalizamos el formulario de Login
    ld.setNameFrame("Cambiar contraseña usuario "+usuario);
    ld.setNamePassword("Nueva contraseña :");
    ld.setNamePasswordC("Confirmar contraseña :");
		ld.setMnemonicPassword('o');
    ld.setMnemonicPasswordC('o');
    ld.setNameAccept(" Guardar ");
		ld.setNameCancel("Cancelar");
		ld.show();
	}



  public NewPassDialog getLoginDialogo() {
      return ld;
  }


	/**
	 * Comprueba si el usuario existe en Admon. Si existe devolvemos true, sino false.
	 *
	 * @return   boolean
	 */
  public boolean accept() {
     try {

          if (!ld.getPassword().equals(ld.getPasswordC())) {
            ld.setMensajeError("No coincide las contraseñas. Vuelva a escribirlas.");
            return false;
          }
          else if (ld.getPassword().length()==0) {
            ld.setMensajeError("Debe introducir una contraseña.");
            return false;
          }
          else {
              Statement st=dbc.createStatement();
              String funcio="UPPER";
              if (dbc.getDB().getType().equals("access"))  funcio="UCASE";
              String mylogin=usuario.toUpperCase();
              ResultSet rs=dbc.executeQuery(st,"select USCODCON from USUARIO where "+funcio+"(USLOGIN)='"+mylogin+"'", false);
              if (rs.next()) {
                  int uscodcon = rs.getInt("USCODCON");
                  String contrasenya = null;
                  String contrasenyaMD5 = null;
                  if (md5) contrasenyaMD5 = ld.getPasswordMD5 ();
                  else contrasenya = new String(ld.getPassword());
                  mae.easp.general.Seguridad seguridad = new mae.easp.general.Seguridad(dbc,Easp.sede);
                  seguridad.setAutoCommit();
                  boolean esOk = seguridad.isContrasenyaValida(contrasenya,contrasenyaMD5, usuario,md5);
                  if (esOk) esOk = seguridad.setContrasenya(uscodcon,usuario,contrasenya,contrasenyaMD5,md5);
                  if (!esOk) {
                    ld.setMensajeError(seguridad.getMissatgeAvis());
                    return false;
                  }
                  else {
                    Easp.cambiarPassword = false;
                    newContrasenya = new String(ld.getPassword());
                    return esOk;
                  }
              }
              rs.close();
              return false;
          }

      }
      catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Se ha producido la siguiente excepción:\n"+
            e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        cancel();
        return false;
      }

    }


	/**
	 * Cuando se cancele el formulario cerraremos la conexión a la base de datos
	 * y saldremos al sistema.
	 */
	public void cancel(){
		if (dbc.isConnected()) dbc.disconnect();
		Aplication.getAplication().exit();
	}


	public void open(){
		ld.abrir();
	}


  public static String showNewPass(Aplication apl, String rutaLogo, String usuario, boolean security, DBConnection dbc){
    NewPassword password  = new NewPassword(apl, rutaLogo, usuario, security,dbc);
    return newContrasenya;
	}

	public static String encryptMD5 (String passwd) {
		String md5 = null;
		if (passwd != null && passwd.trim().length()>0) {
			try {
				passwd = passwd.trim().toUpperCase();
				MessageDigest mdEnc = MessageDigest.getInstance("MD5");
				mdEnc.update(passwd.getBytes(), 0, passwd.length());
				md5 = new BigInteger(1, mdEnc.digest()).toString(16).toUpperCase();
			}
			catch (Exception ex) {
				ex.printStackTrace();
				md5 = null;
			}
		}
		return md5;
	}
}
