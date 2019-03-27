package mae.general;

public interface NewPassListener {
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
