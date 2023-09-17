package Selenium.Zz_SeleniumBasics;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Topic_UntrustedCertificate {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver = new ChromeDriver(desiredCapabilities);
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");

	}

}
