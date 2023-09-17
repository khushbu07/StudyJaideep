package Zz_Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	static String projectPath = System.getProperty("user.dir");
	
	public static WebDriver startBrowser(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
			driver = new ChromeDriver();			
		}else if((browserName.equalsIgnoreCase("Firefox"))) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe"); //Setting the Geckodriver/Firefoxdriver path
			driver = new FirefoxDriver();
		}else if((browserName.equalsIgnoreCase("IE"))) {
			System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe"); //Setting the IE path
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
}
