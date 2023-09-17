package Selenium.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_JavaScriptExecutor {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		//JavaScriptExecutor (It is an interface used to prompt alert messages etc)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//prompt Alert popup
		js.executeScript("alert('Welcome to Selenium!')");
		
		//scrollIntoView()
		WebElement element = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//click()
		js.executeScript("arguments[0].click();", element);
		
		//mouseOver
		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover')";
		js.executeScript(mouseOverScript, element);
		
		
	}

}
