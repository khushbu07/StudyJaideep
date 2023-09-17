package TestNG.Zz_TestNGBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

/*
 * Pass the Browser name as a Parameter to a method which we want to run on different browser.
 * Also add @Parameters annotation to pass the browser name to the method.
 * Convert the class into Testng XML.
 * Then, In the TestNG XML, create a copy of test body for each and every browser.
 * Change the name of the tests - we can keep the test names in xml as ChromeTestCases, FirefoxTestCases etc
 * We can also add "parallel" attribute at Suite level in the XML to run the test cases on different browsers at a same time.
 * Syntax: <suite name="Suite" parallel="tests">
 * 
 * Refer "testngMultipleBrowser.xml"
 */



public class Topic_TestNG_MultipleBrowser {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String Browser) {
		System.out.println("Browser name is: "+Browser);
		System.out.println("Thread ID is: "+Thread.currentThread().getId());
		if(Browser.equalsIgnoreCase("chrome")) {
			//Setting the ChromeDriver path
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();			
		}else if(Browser.equalsIgnoreCase("firefox")) {
			//Setting the FirefoxDriver path
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver(); 
		}else if(Browser.equalsIgnoreCase("ie")) {
			//Setting the IEDriver path
			System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEdriver.exe");
			driver = new InternetExplorerDriver(); 
		}
	}
	
	@Test
	public void maintest() {
		driver.get("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}
