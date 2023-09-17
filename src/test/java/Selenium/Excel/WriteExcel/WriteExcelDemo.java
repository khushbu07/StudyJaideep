package Selenium.Excel.WriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\Study\\Selenium\\SeleniumAutomationWorkspace\\SeleniumAutomationFramework\\excel\\data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet mySheet = wb.getSheetAt(0);
		
		mySheet.getRow(0).createCell(2).setCellValue("HI");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		wb.write(fos);
		wb.close();

	}

}
