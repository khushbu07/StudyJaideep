package Selenium.Methods.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_BeforeAndAfterXPath {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		//Driver setup
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		//Navigate to W3 School
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Calculate the Total Number of Rows
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rows = list.size();
		System.out.println("Total number of Rows: "+rows);
		
		//Customer to find
		String inputCustomer = "Ernst Handel";
		
		//Store Xpaths
		String beforeXpath = "//*[@id='customers']/tbody/tr[";			//Before xPath of Rows
		String afterXpathCustomer = "]/td[1]";							//After xPath of Customer
		String afterXpathCountry = "]/td[3]";							//After xPath of Country
		
		//Create the Dynamic xPaths of Customer and Country using FOR loop
		for(int i=2; i<=rows; i++) {
			String xPathCustomers = beforeXpath+i+afterXpathCustomer;
			String xPathCountry = beforeXpath+i+afterXpathCountry;
			WebElement customer = driver.findElement(By.xpath(xPathCustomers));
			WebElement country = driver.findElement(By.xpath(xPathCountry));

			if(customer.getText().equals(inputCustomer)) {				
				System.out.println("Customer is: "+inputCustomer+", and Country is: "+country.getText());
				break;				
			}
			
		}

	}

}
