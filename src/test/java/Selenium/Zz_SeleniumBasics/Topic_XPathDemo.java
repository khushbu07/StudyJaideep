package Selenium.Zz_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium.PageObjectModel.MyPages.OrangeHRMPageObjects;

public class Topic_XPathDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//Driver setup
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		OrangeHRMPageObjects OrangeHRMPageObjects = new OrangeHRMPageObjects(driver);
		
		//1: Basic Xpath
		//Syntax: //tagname[@attribute = 'value']
		//Example: //input[@title='Login']
		
		//2: Contains() Method
		//Example 1: //input[contains(@name, 'btn')]				btn can be partial or full value of name attribute
		//Example 2: //*[contains(text(),'here')]
		
		//3: Using OR & AND
		//Example 1: //*[@type='submit' or @name='btnReset']
		//Example 2: //input[@type='submit' and @name='btnLogin']
		
		//4:  Starts-with
		//Example: //label[starts-with(@id,'message')]
		
		//5: Text()
		//Example; //td[text()='UserID']
		
		//6: Ancestor:
		//Example: //*[text()='Enterprise Testing']//ancestor::div[1]
		
		//7: Child:
		//Example: //*[@id='java_technologies']//child::li[1]
		
		//8: Preceding:
		//Example: //*[@type='submit']//preceding::input[1]
		
		//9: Following-sibling:
		//Example: //*[@type='submit']//following-sibling::input
		
		//10: Parent:
		//Example: //*[@id='rt-feature']//parent::div

	}

}
