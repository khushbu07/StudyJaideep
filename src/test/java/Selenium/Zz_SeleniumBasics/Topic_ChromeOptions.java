package Selenium.Zz_SeleniumBasics;

import java.io.File;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Topic_ChromeOptions {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setAcceptInsecureCerts(true);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(new File(projectPath+"/chromeExtensions/Alexa.crx"));
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("incognito");
		chromeOptions.addArguments("--verbose");
		chromeOptions.addArguments("--disable-web-security");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--allow-running-insecure-content");
		chromeOptions.addArguments("--allow-insecure-localhost");
		chromeOptions.addArguments("--disable-gpu");
//		chromeOptions.addArguments("--no-sandbox");
//		chromeOptions.setAcceptInsecureCerts(true);
		chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
		chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
		chromeOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		
		chromeOptions.merge(desiredCapabilities);				//Merging chromeOptions & desiredCapabilities
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

	}

}
