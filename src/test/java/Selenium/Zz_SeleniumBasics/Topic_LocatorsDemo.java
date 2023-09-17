package Selenium.Zz_SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_LocatorsDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		//Types of Locators and Examples
		
		//1. By id
		driver.findElement(By.id("cdensity")).sendKeys("10");
		
		//2. By name
		driver.findElement(By.name("cdensity")).sendKeys("10");
		
		//3. By Class Name
		List<WebElement> byclass = driver.findElements(By.className("smalltext smtb"));
		
		//4. By Tag Name
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		
		//5. By Link Text
		driver.findElement(By.linkText("Volume")).click();
		
		//6. By partial link text
		driver.findElement(By.partialLinkText("Volume")).click();
		
		//7. By CSS Selector
		driver.findElement(By.cssSelector("input.login"));
		
		//8. By XPATH
		driver.findElement(By.xpath(".//*[@id = 'content']"));
	}

}
