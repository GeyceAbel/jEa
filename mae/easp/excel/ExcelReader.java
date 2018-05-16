package mae.easp.excel;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import geyce.maefc.Value;

public class ExcelReader implements Closeable{
	private String ruta;
	private FileInputStream fis;
	private Workbook wb;

	public ExcelReader (String ruta) throws ExcelException {
		this.ruta = ruta;
		initWorkBook ();
	}

	private void initWorkBook() throws ExcelException {
		try {
			File f = new File (ruta);
			if (f.exists() && f.isFile()) {			
				fis = new FileInputStream (f);
				wb = WorkbookFactory.create(fis);
			}
		}
		catch (FileNotFoundException e) {
			ExcelException.fileNotFound (ruta);
		} 
		catch (Exception e) {
			ExcelException.excepcionProcesandoExcel ("initWorkBook", ruta, e);
		}	    
	}

	public void close () throws IOException  {
			if (fis != null) fis.close();
	}

	public List<String> getNombreHojas () throws ExcelException {
		List<String> sheetNames = new ArrayList<String>();	
		try {		
			for (int i=0;i<wb.getNumberOfSheets(); i++) sheetNames.add( wb.getSheetName(i) );
		}
		catch (Exception e) {
			ExcelException.excepcionProcesandoExcel ("getNombreHojas",ruta, e);
		}
		return sheetNames;
	}

	public int getNumeroLineas (Sheet s) throws ExcelException {
		int num = 0;
		if (s != null) {
			try {
				num = s.getLastRowNum();
			}
			catch (Exception e) {
				ExcelException.excepcionProcesandoExcel ("getNumeroLineas",ruta, s.getSheetName(), e);
			}
		}
		return num+1;
	}

	public int getNumeroColumnas (Sheet s) throws ExcelException {
		int num = 0;
		if (s != null) {
			int numFilasMaximo = getNumeroLineas(s);		
			try {
				for (int fila=getPrimeraFila(s);fila<=numFilasMaximo;fila++) {
					int numtmp = 0;
					Row r = s.getRow(fila);
					if (r != null) numtmp = r.getLastCellNum();
					if (num< numtmp) num = numtmp;
				}
			}
			catch (Exception e) {
				ExcelException.excepcionProcesandoExcel ("getNumeroColumnas",ruta, s.getSheetName(), -1, e);
			}
		}
		return num;
	}

	public List<Value> getRowValues (Sheet s, int numRow) throws ExcelException {
		List<Value> data = new ArrayList<Value>();
		try {
			Row row = s.getRow(numRow);
			if (row != null) {
				for(int cn=0; cn<row.getLastCellNum(); cn++) {
					Cell cell = row.getCell(cn, MissingCellPolicy.CREATE_NULL_AS_BLANK);
					data.add(initValue(cell));					
				}
			}
		}
		catch (Exception e) {
			ExcelException.excepcionProcesandoExcel ("getRowValues",ruta, e);
		}
		return data;
	}
	
	private Value initValueFormula (Cell cell) {
		Value v = new Value();		
		if (cell.getCachedFormulaResultTypeEnum().equals(CellType.BOOLEAN)) {
			v.setType(Value.BOOLEAN);
			v.setValue(cell.getBooleanCellValue());
		}
		else if (cell.getCachedFormulaResultTypeEnum().equals(CellType.NUMERIC)) {
			if (DateUtil.isCellDateFormatted(cell)) {
				v.setType(Value.DATE);
				v.setValue(cell.getDateCellValue());
			} else {
				v.setType(Value.DOUBLE);
				v.setValue(cell.getNumericCellValue());
			}
		}
		else if (cell.getCachedFormulaResultTypeEnum().equals(CellType.ERROR)) {
			v.setType(Value.STRING);
			v.setValue(cell.getErrorCellValue());			
		}
		else {
			v.setType(Value.STRING);
			v.setValue(cell.getStringCellValue());
		}
		return v;
	}

	private Value initValue(Cell cell) {
		Value v = new Value();
		if (cell.getCellTypeEnum().equals(CellType.BOOLEAN)) {
			v.setType(Value.BOOLEAN);
			v.setValue(cell.getBooleanCellValue());
		}
		else if (cell.getCellTypeEnum().equals(CellType.NUMERIC)) {
			if (DateUtil.isCellDateFormatted(cell)) {
				v.setType(Value.DATE);
				v.setValue(cell.getDateCellValue());
			} else {
				v.setType(Value.DOUBLE);
				v.setValue(cell.getNumericCellValue());
			}
		}
		else if (cell.getCellTypeEnum().equals(CellType.ERROR)) {
			v.setType(Value.STRING);
			v.setValue(cell.getErrorCellValue());
		}
		else if (cell.getCellTypeEnum().equals(CellType.FORMULA)) {
			v = initValueFormula(cell);
		}
		else {
			v.setType(Value.STRING);
			v.setValue(cell.getStringCellValue());
		}
		return v;
	}

	public Sheet getHoja (String nombreHoja) {
		Sheet s = null;
		try {
			s = wb.getSheet(nombreHoja);
		}
		catch (Exception e) {
			s = null;
		}
		return s;
	}

	public int getPrimeraFila(Sheet s) {
		int num = 0;
		//if (s != null) num = s.getTopRow();		
		return num;
	}
}
