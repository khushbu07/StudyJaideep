package Selenium.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Zz_Utils.PropertyFileReader;

public class BaseClass {
	
	static WebDriver driver;
			
	@BeforeMethod
	public void setupApplication() {
		
		Reporter.log("======= Browser Session Started =======", true);
		PropertyFileReader PropertyFileReader = new PropertyFileReader();
		System.setProperty("webdriver.chrome.driver", PropertyFileReader.getChromeDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@AfterMethod
	public void closeApplication() {
		driver.quit();
		Reporter.log("======= Browser Session Ended =======", true);
	}
	
}
