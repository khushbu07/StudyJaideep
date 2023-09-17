package Selenium.Methods.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_RowsColumns {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//Driver setup
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Navigate to W3 School
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

		//All Columns (Headers)
		List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		for(WebElement column: allColumns) {
			System.out.println(column.getText());
		}
		System.out.println("----------------------");

		//All Rows (Including Headers Row)
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));

		//All Country names
		List<WebElement> allCountries = driver.findElements(By.xpath("//table[@id='customers']//tr//td[4]"));
		for(WebElement country: allCountries) {
			System.out.println(country.getText());
		}

		//Select the checkbox
		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
		
		Thread.sleep(5000);
		
		//Click on the link
		driver.findElement(By.xpath("//td[text()='USA']//following-sibling::td//a")).click();
		
		Thread.sleep(5000);
		
//		driver.quit();
	}
}
