package Selenium.Zz_SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Find the X/Y coordinates
 * If X/Y cooardinates != 0
 * then click
 */

public class Topic_HiddenWebElements {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radioMale = driver.findElements(By.xpath("//input[@id='male']"));
		int count = radioMale.size();
		System.out.println("Total Elements: "+count);
		
		for(int i=0; i<count; i++) {
			WebElement ele = radioMale.get(i);
			int x = ele.getLocation().getX();
			
			if(x != 0) {
				ele.click();
				break;
			}
		}
		
	}

}
