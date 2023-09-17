package Selenium.Zz_SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Actions class is used to perform keyboard and mouse actions on webdriver.
 * Whereas Action is an Interface which represents a single user-interaction action.
 * It contains one of the most widely used methods perform().
 */

public class Topic_ActionsClass {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Actions Class
		Actions action = new Actions(driver);
		
		//1 Right Click on Web Element
		action.contextClick(driver.findElement(By.xpath("//input[@value='Marketplace']"))).perform();
		
		//2 Double Click
		action.doubleClick(driver.findElement(By.xpath("//input[@value='Marketplace']"))).perform();
		
		//3 drag and drop
		WebElement eleOne = driver.findElement(By.id("Username"));
		WebElement eleTwo = driver.findElement(By.id("Password"));
		//Way 1:
		action.dragAndDrop(eleOne, eleTwo).perform();
		//Way 2:
		action.clickAndHold(eleOne)
			.pause(Duration.ofSeconds(2))
			.moveToElement(eleTwo)
			.pause(Duration.ofSeconds(2))
			.release()
			.build()
			.perform();
		
		//4 sendKeys
		action.sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.TAB).perform();
		
		//5 moveToElement
		action.moveToElement(eleTwo).perform();
		
	}

}
