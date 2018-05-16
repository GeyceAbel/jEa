package mae.easp.excel;

public class ExcelException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ExcelException (String msg) {
		super(msg);
	}
	
	public static Exception notFile (String ruta) throws ExcelException {
		throw new ExcelException ("La ruta "+ruta+" no coincide con un fichero, seguramente sea un directorio");
	}

	public static Exception fileNotFound(String ruta) throws ExcelException { 
		throw new ExcelException ("No se ha encontrado el fichero "+ruta+".");
	}

	private static String getMsgException (Exception e) {
		String msg = e.getMessage();
		if (msg == null || msg.trim().length() == 0) msg = e.getLocalizedMessage();
		if (msg == null || msg.trim().length() == 0) msg = ""+e;
		return msg;
	}

	public static void excepcionProcesandoExcel(String proceso, String ruta, Exception e) throws ExcelException {
		excepcionProcesandoExcel(proceso, ruta, null, -1, e);
	}

	public static void excepcionProcesandoExcel(String proceso, String ruta, String hoja, Exception e) throws ExcelException {
		excepcionProcesandoExcel(proceso, ruta, hoja, -1, e);
	}


	public static void excepcionProcesandoExcel(String proceso, String ruta, String hoja, int fila, Exception e) throws ExcelException {
		String ubic = "Excel: "+ruta;
		if (hoja != null) ubic+="  Hoja: "+hoja;
		if (fila >= 0) ubic+="  Fila: "+fila;
		e.printStackTrace();
		throw new ExcelException ("Proceso "+proceso+ ": "+getMsgException(e)+"\n"+ubic);
	}

	public static void noExisteHojaExcel(String ruta, String hoja) throws ExcelException {
		throw new ExcelException ("No existe la hoja "+hoja+" en el Excel: "+ruta);
	}
	
	public static void rowNotFoun (String ruta, String hoja, int row) throws ExcelException {
		throw new ExcelException ("No existe la fila "+row+" del fichero:\n\nRuta: "+ruta+"\nHoja: "+hoja);
	}

	public static void grabandoTablaImportacion(String tabla) throws ExcelException {
		throw new ExcelException ("Error al generar el resultado previo de importacion. TABLA: "+tabla);
	}

	public static void actualizandoErrorDescuadre (String tabla) throws ExcelException {
		throw new ExcelException ("Error al actualizar error y/o descuadre. TABLA: "+tabla);
	}
	
	public static void grabandoTablaDefinicion (Exception e) throws ExcelException {
		throw new ExcelException ("Error al grabar la tabla de Definición.\nERROR:"+getMsgException(e));
	}

	public static void comprobandoCuentasInexistentes(String cta, String scta) throws ExcelException {
		throw new ExcelException ("Error al comprobando cuentas inexistentes. CUENTA: "+cta+"."+scta);
	}

	public static void comprobandoDescuadreAsiento(int numAsto) throws ExcelException {
		throw new ExcelException ("Error al comprobando asientos descuadrados. ASIENTO: "+numAsto);
	}

	public static void eliminandoResultadoAnterior (Exception e) throws ExcelException {
		throw new ExcelException ("Error eliminando los datos de una importación anterior.\n\n"+e);
	}

	public static void eliminandoTablaDefinicion (Exception e) throws ExcelException {
		throw new ExcelException ("Error eliminando los datos de una importación anterior.\n\n"+e);
	}
}