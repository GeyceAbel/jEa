/** Interfaz que define los metodos que se deben implementar para
 * el control de acceso a aplicaciones (LogIn).
 * @author GEYCE S.A.- Eduard Roige
 * @version 1.0, 6/7/2000
 */
package mae.general;

public interface LoginListener {
  /**
   * Debe devolver true si la identificación ha sido positiva y false en
   * caso conrario.
   *
   * @return   boolean
   */
  public boolean accept();

  /**
   * En este método se debe poner aquello que queremos que se haga cuando
   * el usuario cancele el formulario de Login. Por ejemplo: cerrar la
   * base de datos.
   */
  public void cancel();
	public void open();
  }
