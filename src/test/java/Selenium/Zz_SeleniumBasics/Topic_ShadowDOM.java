package Selenium.Zz_SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//URL: http://sandbox-sponsors.pointsville.com/

public class Topic_ShadowDOM {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sandbox-sponsors.pointsville.com/");
		
		//To handle Shadow DOM, We need Javascript executor
		JavascriptExecutor JSE = (JavascriptExecutor) driver;
//		WebElement username = (WebElement) JSE.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in').shadowRoot.querySelector('amplify-form-section > amplify-auth-fields').shadowRoot.querySelector('div > amplify-username-field').shadowRoot.querySelector('amplify-form-field').shadowRoot.querySelector('input')");
		WebElement username = (WebElement) JSE.executeScript("return document.querySelector(\"#root > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-username-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#username\")");
		WebElement password = (WebElement) JSE.executeScript("return document.querySelector(\"#root > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password\")");
		WebElement resetPassword = (WebElement) JSE.executeScript("return document.querySelector(\"#root > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password-hint > div > amplify-button\")");
		
		
		String user = "arguments[0].setAttribute('value', 'Jaideep')";
		String pass = "arguments[0].setAttribute('value', 'Choudhary')";
		((JavascriptExecutor)driver).executeScript(user, username);
		((JavascriptExecutor)driver).executeScript(pass, password);
		((JavascriptExecutor)driver).executeScript("arguments[0].click", resetPassword);
	}

}
