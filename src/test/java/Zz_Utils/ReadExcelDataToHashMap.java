package Zz_Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelDataToHashMap {


	private String filePath;
	private int sheetIndex;
	
	ReadExcelDataToHashMap(String filePath, int sheetIndex) {
		this.filePath = filePath;
		this.sheetIndex = sheetIndex;
	}
	
	private HSSFSheet getSheet() throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(sheetIndex);
		return sheet;
	}
	public Map<String, Map<String, String>> getExcelAsMap() throws IOException {
		HSSFSheet sheet = getSheet();
		Map<String, Map<String, String>> completeSheetData = new HashMap<String, Map<String, String>>();
		List<String> columnHeader = new ArrayList<String>();
		Row row = sheet.getRow(0);
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			columnHeader.add(cellIterator.next().getStringCellValue());
		}
		int rowCount = row.getLastCellNum();
		int columnCount = row.getLastCellNum();
		for (int i = 1; i <= rowCount; i++) {
			Map<String, String> singleRowData = new HashMap<String, String>();
			Row row1 = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				Cell cell = row1.getCell(j);
				singleRowData.put(columnHeader.get(j), getCellValueAsString(cell));
			}
			completeSheetData.put(String.valueOf(i), singleRowData);
		}
		return completeSheetData;
	}

	public String getSheetName(int index) throws IOException {
		FileInputStream file = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		String sheet = workbook.getSheetName(index);
		return sheet;
	}
	public int getSheetCount() throws IOException {
		FileInputStream file = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		int sheetCount = workbook.getNumberOfSheets();
		return sheetCount;
	}
	public int totolColumnCount() throws IOException {
		HSSFSheet sheet = getSheet();
		Row row = sheet.getRow(0);
		int lastColumnNum = row.getLastCellNum();
		return lastColumnNum;
	}
	public String getCellValueAsString(Cell cell) {
		String cellValue = null;
		switch (cell.getCellType()) {
		case NUMERIC:
			cellValue = String.valueOf(cell.getNumericCellValue());
			break;
		case STRING:
			cellValue = cell.getStringCellValue();
			break;
		case BOOLEAN:
			cellValue = String.valueOf(cell.getBooleanCellValue());
			break;
		case FORMULA:
			cellValue = cell.getCellFormula();
		case BLANK:
			cellValue = "BLANK";
		default:
			cellValue = "DEFAULT";
		}
		return cellValue;
	}


}
