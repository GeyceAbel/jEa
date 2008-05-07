/** Clase usada en el control de acceso a aplicaciones (LogIn)
 * @author GEYCE S.A.- Eduard Roige
 * @version 1.0, 6/7/2000
 */
package mae.general;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.Keymap;
import geyce.maefc.*;

public class LoginDialog{
  // Componentes formulario
  //private JFrame frame=new JFrame("Login"); 5-1-2001:
  private JDialog frame=new JDialog(new JFrame("Login"),true);
	private JPanel panel0=new JPanel();
	private JPanel panel1=new JPanel();
  private JPanel panel2=new JPanel();
  private JLabel labeltt=new JLabel("<html><font size=1 face=arial color=red>Si no ha configurado su acceso, <p>puede entrar en la aplicaci�n como usuario <i>ADMIN</i>"+
	                "<p>Para configurar usuarios y accesos, <p>entre por <b>Entorno Aplicaciones</b> de Afinity -&gt; Descargas</font></html>");
	private JLabel labeld=new JLabel("Dominio :");
  private JLabel label=new JLabel("Usuario :");
  private JLabel labelp=new JLabel("Password :");

  private JTextField domain=new CampoTexto(15);
	private JComboBox login = new JComboBox() ;
	//private JTextField login=new CampoTexto(15);
  private JPasswordField password=new CampoTextoPassword(15);
  private JButton aceptar = new JButton("logIn ");
  private JButton cancelar = new JButton("Cancel");
  boolean domainVisible=false;

  // Vista formulario
  private GridBagLayout gridbag = new GridBagLayout();
  private GridBagConstraints c = new GridBagConstraints();

  // Eventos Login
  private LoginListener listener=null;

  // Puntero a Aplicaci�n
  private Aplication apl;

  // Mensajes (con valores por defecto)
  private String cmensaje="El dominio y / o el login y / o el password es incorrecto. Int�ntelo de nuevo.";
  private String smensaje="El login y / o el password es incorrecto. Int�ntelo de nuevo.";

  /** Constructor.   */
  LoginDialog(LoginListener listener, Aplication apl){
    this.listener=listener;
    this.apl=apl;
    // Asignamos Eventos
		PkActionListener pkaction=new PkActionListener(listener,this);
		login.setPreferredSize(new Dimension(165, 21));
		login.setBackground(Color.white);
		login.setEditable(true);
		login.addActionListener(pkaction);
		CancelListener cancel=new CancelListener(listener,this);
    AcceptListener accept=new AcceptListener(listener,this);
    LoginWindowAdapter openclose=new LoginWindowAdapter(listener);

    cancelar.addActionListener(cancel);
    frame.getRootPane().registerKeyboardAction(cancel,KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0),JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

     /////////  Temporal: per saltar el login  fer ALT+x ///////
    class A implements ActionListener{
      LoginDialog ld;
      A(LoginDialog ld){
        this.ld=ld;
        }
      public void actionPerformed(ActionEvent e){
        ld.exit();
        //ld.getAplication().run(); 5-1-2001
        }
      }

     frame.getRootPane().registerKeyboardAction(new A(this),KeyStroke.getKeyStroke(KeyEvent.VK_X,Event.ALT_MASK ),JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
     /////////////////////////////////////////////////

    frame.addWindowListener(openclose);
    aceptar.addActionListener(accept);

    frame.setResizable(false);
    }

  /**
   * Devuelve la aplicaci�n.
   *
   * @return   Aplication Aplicacion.
   */
  public Aplication getAplication(){
    return apl;
    }

  /**
   * Devuelve el dominio introducido.
   *
   * @return  String.
   */
  public String getDomain(){
		return domain.getText();
    }

  /**
   * Devuelve el login introducido.
   *
   * @return   String.
   */
  public String getLogin(){
		return (String) login.getSelectedItem();
    }

	public void setUsuarios(String[] v){
		for (int i=0; i < v.length; i++)
			login.addItem(v[i]);
	  }

	public void setUsuario(String usuario){
	  login.setSelectedItem((String) usuario);
	  }


  /**
   * Devuelve el dominio introducido.
   *
   * @return   String.
   */
  public String getPassword(){
		String pw=new String(password.getPassword());
		if (pw!=null && pw.length() > 10) pw=pw.substring(0,10);
		return pw;
    //return password.getText();
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
   * Asigna el nombre de la etiqueta del campo dominio.
   *
   * @param   name   Nombre.
   */
  public void setNameDomain(String name){
    labeld.setText(name);
    }

  /**
   * Asigna el mnem�nico de la etiqueta del campo dominio.
   *
   * @param   c   Letra.
   */
  public void setMnemonicDomain(char c){
    labeld.setDisplayedMnemonic(c);
    }

  /**
   * Asigna el nombre de la etiqueta del campo usuario.
   *
   * @param   name   Nombre.
   */
  public void setNameLogin(String name){
    label.setText(name);
    }

  /**
   * Asigna el mnem�nico de la etiqueta del campo usuario.
   *
   * @param   c   Letra.
   */
  public void setMnemonicLogin(char c){
    label.setDisplayedMnemonic(c);
    }

  /**
   * Asigna el nombre de la etiqueta del campo contrase�a.
   *
   * @param   name   Nombre.
   */
  public void setNamePassword(String name){
    labelp.setText(name);
    }

  /**
   * Asigna el mnem�nico de la etiqueta del campo contrase�a.
   *
   * @param   c   Letra.
   */
  public void setMnemonicPassword(char c){
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
   * Si se le pasa true muestra se pide el dominio. Si no lo oculta.
   *
   * @param   boolean   domainVisible.
   */
  public void setDomainVisible(boolean domainVisible){
    this.domainVisible=domainVisible;
    }

  /**
   * Asigan el mensaje que aparecera cuando se produzca una identificaci�n
   * negativa (caso en que se pide dominio).
   *
   * @param   String  cmensaje.
   */
  public void setMensajeErrorConDominio(String cmensaje){
    this.cmensaje=cmensaje;
    }

  /**
   * Asigan el mensaje que aparecera cuando se produzca una identificaci�n
   * negativa (caso en que no se pide dominio).
   *
   * @param   String  smensaje.
   */
  public void setMensajeErrorSinDominio(String smensaje){
    this.smensaje=smensaje;
    }

  /**
   * Vista del campo dominio.
   */
  private void viewDomain(){
    c.gridx = 0;
    c.gridy = 0;
    gridbag.setConstraints(labeld, c);
    labeld.setLabelFor(domain);
    panel1.add(labeld);

    c.gridx = 1;
    c.gridy = 0;
    c.insets = new Insets(0,15,0,0);
    gridbag.setConstraints(domain, c);
    panel1.add(domain);
    }

  private void viewMensajeAdmin(){
//    c.gridx = 0;
//    c.gridy = 0;
//		c.insets = new Insets(0,0,0,0);
//		//labeltt.setText(htmlTextArea.getText());
//    gridbag.setConstraints(labeltt1, c);

	  labeltt.setLabelFor(null);
		panel0.add(labeltt);
    }

  /**
   * Vista del campo usuario.
   */
  private void viewLogin(int i){
    c.gridx = 0;
    c.gridy = i;
    c.insets = new Insets(5,0,0,0);
    gridbag.setConstraints(label, c);
    label.setLabelFor(login);
    panel1.add(label);

    c.gridx = 1;
    c.gridy = i;
    c.insets = new Insets(5,15,0,0);
    gridbag.setConstraints(login, c);
		Font ff=password.getFont();
		if (ff!=null)
		  login.setFont(ff);
    panel1.add(login);
    }

  /**
   * Vista del campo contrase�a.
   */
  private void viewPassword(int i){
    c.gridx = 0;
    c.gridy = i+1;
    c.insets = new Insets(5,0,0,0);
    gridbag.setConstraints(labelp, c);
    labelp.setLabelFor(password);
    panel1.add(labelp);

    c.gridx = 1;
    c.gridy = i+1;
    c.insets = new Insets(5,15,0,0);
    gridbag.setConstraints(password, c);
    panel1.add(password);
    }

  /**
   * Desactiva el efecto de apretar Enter en los campos.
   */
  private void desactivaEnter(){
    // Desactivar ENTER en TextFIelds
    KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);

    Keymap map = domain.getKeymap();
    map.removeKeyStrokeBinding(enter);

    //map = login.getKeymap();
    //map.removeKeyStrokeBinding(enter);

    map = password.getKeymap();
    map.removeKeyStrokeBinding(enter);
    }

  /**
   * Vista del bot�n de aceptar.
   */
  private void viewAceptar(){
    aceptar.setMnemonic(KeyEvent.VK_A);
    panel2.add(aceptar);
    frame.getRootPane().setDefaultButton(aceptar);
    }

  /**
   * Vista del bot�n de cancelar.
   */
  private void viewCancelar(){
    cancelar.setMnemonic(KeyEvent.VK_C);
    panel2.add(cancelar);
    }

  /**
   * Vista de la ventana.
   */
  private void viewFrame(){
		frame.getContentPane().add(BorderLayout.NORTH, panel0);
		frame.getContentPane().add(BorderLayout.CENTER, panel1);
    frame.getContentPane().add(BorderLayout.SOUTH, panel2);
    frame.pack();
    //if (domainVisible) domain.requestFocus();
    //else login.requestFocus();
		password.requestFocus();

		Maefc.center(frame);
    }

  /**
   * Muestra por pantalla el formulario.
   */
  public void show(){
    int i=1;
    panel1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    panel1.setLayout(gridbag);
    c.anchor=GridBagConstraints.WEST;

		viewMensajeAdmin();
    if (domainVisible){
      viewDomain();
      i=1;
      }
    viewLogin(i);
    viewPassword(i);
    //desactivaEnter();
    viewAceptar();
    viewCancelar();
    viewFrame();
		frame.setVisible(true);
    }

	public void abrir(){
		String textologin=(String) login.getSelectedItem();
		if (textologin!=null && !textologin.equals(""))
		  password.requestFocus();
	  }

  /**
   * Mensaje mostrado al producirse el error en el Login.
   */
  void alert(){
    String mensaje=smensaje;
    if (domainVisible) mensaje=cmensaje;
    JOptionPane.showMessageDialog(null,mensaje,"Acceso",JOptionPane.ERROR_MESSAGE );
    if (domainVisible){
      domain.requestFocus();
      domain.selectAll();
      }
    else{
      login.requestFocus();
      //login.selectAll();
      }
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
 * Clase que extiende la clase JTextField. Le a�ade que al ir cambiando de
 * campo quede marcado el texto.
 */
class CampoTexto extends JTextField implements FocusListener {
  CampoTexto(int size) {
    super(size);
    addFocusListener(this);
    }

  public void focusLost(FocusEvent e) {
    }

  public void focusGained(FocusEvent e) {
    selectAll();
    }
  }

/**
 * Clase que extiende la clase JPasswordField. Le a�ade que al ir cambiando de
 * campo quede marcado el texto.
 */
class CampoTextoPassword extends JPasswordField implements FocusListener {
  CampoTextoPassword(int size) {
    super(size);
    addFocusListener(this);
    }

  public void focusLost(FocusEvent e) {
    }

  public void focusGained(FocusEvent e) {
    selectAll();
    }
  }

class AcceptListener implements ActionListener {
  LoginListener listener;
  LoginDialog ld;

  AcceptListener(LoginListener listener, LoginDialog ld){
    this.listener=listener;
    this.ld=ld;
    }

  public void actionPerformed(ActionEvent e){
    if ((ld.domainVisible && (ld.getDomain()==null || ld.getDomain().equals("")))
         || ld.getLogin()==null || ld.getLogin().equals(""))
      return;
    if (listener.accept()) {
      ld.exit();
      //ld.getAplication().run(); 5-1-2001
      }
    else
      ld.alert();
    }
  }

class CancelListener implements ActionListener {
  LoginListener listener;
  LoginDialog ld;

  CancelListener(LoginListener listener, LoginDialog ld){
    this.listener=listener;
    this.ld=ld;
    }

  public void actionPerformed(ActionEvent e){
    ld.exit();
    listener.cancel();
    }
  }

class PkActionListener implements ActionListener {
  LoginListener listener;
  LoginDialog ld;

  PkActionListener(LoginListener listener, LoginDialog ld){
    this.listener=listener;
    this.ld=ld;
    }

  public void actionPerformed(ActionEvent e){
		//showPopup();
    }
  }


class LoginWindowAdapter extends WindowAdapter{
  LoginListener listener;

  LoginWindowAdapter(LoginListener listener){
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

