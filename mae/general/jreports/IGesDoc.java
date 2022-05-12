package mae.general.jreports;

import java.util.List;

import geyce.maefc.DBConnection;

public interface IGesDoc {
	
	public static enum APLETI {
		JCONTA,
		JEO,
		JMODELOS,
		JISS,
		JRENTA,
		JNOMINA,
		JGESTION
	};
	public static enum TIPOETI {
		IVA,
		IRPF,
		DIARIO,
		EXTRACTO,
		BALANCESS,
		BALSITEX,
		PCUENTAS,
		MODAEAT,
		OBLIGTRIB,
		RESPAEAT,
		BORRADOR, 
		INFORME, BIENINV, COM347, BIEUSADOS,
		LISTADODIARIO,
		BALANCE,
		CTA415,
		NIF415,
		CTA347,
		NIF347,
		ACUMULADOS, ACUM,
		BIENES, 
		BIENESUS,
		COMPGAST,
		EXTRAC,
		LIBROS,
		PROVISIONES,
		VENTAS
	}
	public static enum ETIQUETAS {
		CDP,
		EJERCICIO,
		APLICACION,
		NIF,
		TIPO,
		SUBTIPO,
		EMPRESA,
		NIFTRAB,
		MODELO,
		PERIODO,
		PERIODOFINAL,
	}
	
	public static enum TIPOPERIODO {
		ENERO,
		FEBRERO,
		MARZO,
		ABRIL,
		MAYO,
		JUNIO,
		JULIO,
		AGOSTO,
		SEPTIEMBRE,
		OCTUBRE,
		NOVIEMBRE,
		DICIEMBRE,
		TRIM1,
		TRIM2,
		TRIM3,
		TRIM4,
		PER1,
		PER2,
		PER3,
		ANUAL, 
		INICIAL,
		FINAL
	}

	public int getEmpresa();
	public int getEjercicio();
	public String getNif();
	public DBConnection getConexionApl();
	public APLETI getAplicacion();
	public List<IEtiquetaGD> getEtiquetas();
	
	public String getCDPAfinity ();
	public String getNombre ();
	
	public boolean esExcel ();
	public String getUbicacionGD();
	public String getNombreFichero();
	
	public String getDescripciónFichero();
	
	public TIPOPERIODO getPeriodoInicial();
	public TIPOPERIODO getPeriodoFinal();
	
	
	
}
