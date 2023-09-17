package Selenium.Excel.ReadExcel;

public class ReadExcelDemo {

	public static void main(String[] args) {
		
		Util_Excel obj = new Util_Excel("D:\\Study\\Selenium\\SeleniumAutomationWorkspace\\SeleniumAutomationFramework\\excel\\data.xlsx");
		System.out.println(obj.getCellValue(0, 0, 0));
	
	}

}
