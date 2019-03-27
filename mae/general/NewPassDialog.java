package mae.general;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.Keymap;

import geyce.maefc.*;
import mae.easp.general.Easp;

public class NewPassDialog{
	private String rutaLogo=null;
  private String usuario=null;
  private boolean md5=false;
  private JDialog frame=new JDialog(new JFrame("NewPassword"),true);
	private JPanel panel0=new JPanel();
	private JPanel panel1=new JPanel();
	private JPanel panel2=new JPanel();
  private JLabel label=new JLabel("Nueva contraseña :");
  private JLabel labelp=new JLabel("Confirmar contraseña :");

  private JPasswordField password=new CampoTextoPass(20);
  private JPasswordField passwordC=new CampoTextoPass(20);
  private JButton aceptar = new JButton("Guardar ");
	private JButton cancelar = new JButton("Cancel");

	// Vista formulario
	private GridBagLayout gridbag = new GridBagLayout();
	private GridBagConstraints c = new GridBagConstraints();

  // Eventos NewPassword
  private NewPassListener listener=null;

	// Puntero a Aplicación
	private Aplication apl;

	// Mensajes (con valores por defecto)
  private String mensajeError="El login y / o el password es incorrecto. Inténtelo de nuevo.";

	/** Constructor.   */
  NewPassDialog(NewPassListener listener, Aplication apl, String rutaLogo, String usuario, boolean md5) {
		this.rutaLogo = rutaLogo;
		this.listener=listener;
		this.apl=apl;
    this.usuario = usuario;
    this.md5 = md5;
		// Asignamos Eventos
    SalirListener cancel=new SalirListener(listener,this);
    GuardarListener accept=new GuardarListener(listener,this);
		PassWindowAdapter openclose=new PassWindowAdapter(listener);


		cancelar.addActionListener(cancel);
		panel0.setBackground(Color.WHITE);
		panel1.setBackground(Color.WHITE);
		panel2.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getRootPane().registerKeyboardAction(cancel,KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0),JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

		frame.addWindowListener(openclose);
		aceptar.addActionListener(accept);
		frame.setResizable(false);
	}
	public void auditoria(String finestre, String titol) {
    	if (Aplication.getAplication().getAudition() != null) {
			ProcessForm form = new ProcessForm(null);
			form.setName(finestre);
			form.setTitle(finestre);
			ControlButton boto = new ControlButton(form);
			boto.setName(titol);
			boto.setTitle(titol);
			Aplication.getAplication().getAudition().clickButton(boto);
		}
    }
	/**
	 * Devuelve la aplicación.
	 *
	 * @return   Aplication Aplicacion.
	 */
	public Aplication getAplication(){
		return apl;
	}


	public String getPassword(){
		String pw=new String(password.getPassword());
    if (pw!=null && pw.length() > 20) pw=pw.substring(0,20);
		return pw;
	}

  public String getPasswordC(){
    String pw=new String(passwordC.getPassword());
    if (pw!=null && pw.length() > 20) pw=pw.substring(0,20);
		return pw;
	}

	public String getPasswordMD5 () {
		return Login.encryptMD5(new String(password.getPassword()));
	}

	/**
	 * Asigna el nombre que aparece en la parte superior del
	 * formulario de Login.
	 *
	 * @param   name   Nombre.
	 */
	public void setNameFrame(String name){
		frame.setTitle(name);
	}


	/**
	 * Asigna el nombre de la etiqueta del campo contraseña.
	 *
	 * @param   name   Nombre.
	 */
	public void setNamePassword(String name){
    label.setText(name);
	}

	/**
	 * Asigna el mnemónico de la etiqueta del campo contraseña.
	 *
	 * @param   c   Letra.
	 */
	public void setMnemonicPassword(char c){
    label.setDisplayedMnemonic(c);
	}


	/**
   * Asigna el nombre de la etiqueta del campo confirmar contraseña.
	 *
	 * @param   name   Nombre.
	 */
  public void setNamePasswordC(String name){
    labelp.setText(name);
	}

	/**
   * Asigna el mnemónico de la etiqueta del campo confirmar contraseña.
	 *
	 * @param   c   Letra.
	 */
  public void setMnemonicPasswordC(char c){
    labelp.setDisplayedMnemonic(c);
	}

	/**
	 * Asigna la el texto que aparece en el boton de aceptar el Login.
	 *
	 * @param   name   Nombre.
	 */
	public void setNameAccept(String name){
		aceptar.setText(name);
	}

	/**
	 * Asigna la el texto que aparece en el boton de cancelar.
	 *
	 * @param   name   Nombre.
	 */
	public void setNameCancel(String name){
		cancelar.setText(name);
	}
	/**
	 * Asigan el mensaje que aparecera cuando se produzca una identificación
	 * negativa (caso en que no se pide dominio).
	 *
   * @param   String  mensajeError.
	 */
  public void setMensajeError(String mensajeError){
    this.mensajeError=mensajeError;
	}


	/**
	 * Vista del campo contraseña.
	 */
	private void viewPassword(int i){
		c.gridx = 0;
    c.gridy = i;
		c.insets = new Insets(5,0,0,0);
    gridbag.setConstraints(label, c);
    label.setLabelFor(password);
    panel1.add(label);

		c.gridx = 1;
    c.gridy = i;
		c.insets = new Insets(5,15,0,0);
		gridbag.setConstraints(password, c);
		panel1.add(password);
	}

	/**
	 * Vista del campo contraseña.
	 */
  private void viewPasswordC(int i){
		c.gridx = 0;
    c.gridy = i+1;
		c.insets = new Insets(5,0,0,0);
		gridbag.setConstraints(labelp, c);
    labelp.setLabelFor(passwordC);
		panel1.add(labelp);

		c.gridx = 1;
    c.gridy = i+1;
		c.insets = new Insets(5,15,0,0);
    gridbag.setConstraints(passwordC, c);
    panel1.add(passwordC);
	}

	/**
	 * Desactiva el efecto de apretar Enter en los campos.
	 */
	private void desactivaEnter(){
		// Desactivar ENTER en TextFIelds
		KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);

    Keymap map = password.getKeymap();
		map.removeKeyStrokeBinding(enter);

    map = passwordC.getKeymap();
		map.removeKeyStrokeBinding(enter);
	}

	/**
	 * Vista del botón de aceptar.
	 */
	private void viewAceptar(){
		aceptar.setMnemonic(KeyEvent.VK_A);
		panel2.add(aceptar);
		frame.getRootPane().setDefaultButton(aceptar);
	}

	/**
	 * Vista del botón de cancelar.
	 */
	private void viewCancelar(){
		cancelar.setMnemonic(KeyEvent.VK_C);
		panel2.add(cancelar);
	}

	/**
	 * Vista de la ventana.
	 */
	private void viewFrame(){
		try {
      //BufferedImage myPicture = ImageIO.read(Aplication.getAplication().getClass().getClassLoader().getResourceAsStream(rutaLogo));
      //JLabel picLabel = new JLabel(new ImageIcon(myPicture));
      //panel0.add(picLabel);
			panel0.add(new JLabel("    "));
			frame.getContentPane().add(BorderLayout.LINE_START, panel0);
		}
		catch (Exception  e) {

		}
		frame.getContentPane().add(BorderLayout.LINE_END, panel1);
		frame.getContentPane().add(BorderLayout.PAGE_END, panel2);
		frame.pack();
		password.requestFocus();

		Maefc.center(frame);
	}

	/**
	 * Muestra por pantalla el formulario.
	 */
	public void show(){
		int i=1;
		panel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 25, 5));
		panel0.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panel1.setLayout(gridbag);
		c.anchor=GridBagConstraints.WEST;

		viewPassword(i);
    viewPasswordC(i);
		viewAceptar();
		viewCancelar();
		viewFrame();
		frame.setVisible(true);
	}

	public void abrir(){
			password.requestFocus();
	}

	/**
	 * Mensaje mostrado al producirse el error en el Login.
	 */
	void alert(){
    JOptionPane.showMessageDialog(null,mensajeError,"Acceso",JOptionPane.ERROR_MESSAGE );
    password.requestFocus();
		frame.setVisible(true);
	}

	/**
	 * Cierra el formulario.
	 */
	void exit(){
		frame.dispose();
	}

}


/**
 * Clase que extiende la clase JPasswordField. Le añade que al ir cambiando de
 * campo quede marcado el texto.
 */
class CampoTextoPass extends JPasswordField implements FocusListener {
  CampoTextoPass(int size) {
		super(size);
		addFocusListener(this);
	}

	public void focusLost(FocusEvent e) {
	}

	public void focusGained(FocusEvent e) {
		selectAll();
	}
}

class GuardarListener implements ActionListener {
  NewPassListener listener;
  NewPassDialog ld;

  GuardarListener(NewPassListener listener, NewPassDialog ld){
		this.listener=listener;
		this.ld=ld;
	}
    public void actionPerformed(ActionEvent e){
		if (listener.accept()) {
      ld.auditoria("CambiarPassword","Contraseña correcta");
			ld.exit();
		}
		else {
      ld.auditoria("CambiarPassword","Contraseña incorrecta");
			ld.alert();
		}
	}
}

class SalirListener implements ActionListener {
  NewPassListener listener;
  NewPassDialog ld;

  SalirListener(NewPassListener listener, NewPassDialog ld){
		this.listener=listener;
		this.ld=ld;
	}

	public void actionPerformed(ActionEvent e){
    ld.auditoria("CambiarPassword","Cancelar");
		ld.exit();
		listener.cancel();
	}
}


class PassWindowAdapter extends WindowAdapter{
  NewPassListener listener;

  PassWindowAdapter(NewPassListener listener){
		this.listener=listener;
	}

	public void windowClosing(WindowEvent e) {
		listener.cancel();
	}
	public void windowOpened(WindowEvent e) {
		//accions
		listener.open();
	}

}

