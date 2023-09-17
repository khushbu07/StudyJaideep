package Selenium.PageObjectModel.MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium.PageObjectModel.MyPages.GoogleSearchPageObjects;

public class Test_PageObjectModel_WithoutPageFactory {

	public static void main(String[] args) {
		
		//Driver setup
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//Create object of Page: GoogleSearchPageObjects
		GoogleSearchPageObjects GoogleSearchPageObjects = new GoogleSearchPageObjects(driver);
		
		//Perform Functionality
		GoogleSearchPageObjects.setSearchText("Selenium");
		GoogleSearchPageObjects.clickGoogleSearch();

		
	}

}
