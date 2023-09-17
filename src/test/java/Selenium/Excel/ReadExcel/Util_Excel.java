package Selenium.Excel.ReadExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util_Excel {
	
	XSSFWorkbook wb;
	XSSFSheet mySheet;
	
	public Util_Excel(String dataSheet) {
		
		try {
			
			File file = new File(dataSheet);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public String getCellValue(int sheetNum, int row, int col) {
		
		mySheet = wb.getSheetAt(sheetNum);
		String cellValue = mySheet.getRow(row).getCell(col).getStringCellValue();
		return cellValue;
		
	}
	
}
