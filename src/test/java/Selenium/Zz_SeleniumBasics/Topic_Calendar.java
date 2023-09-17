package Selenium.Zz_SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Topic_Calendar {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement calendar = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		calendar.click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		int count = dates.size();
		
		for(int i=0; i<count; i++) {
			WebElement ele = dates.get(i);
			String date = ele.getText();
			
			if(date.equalsIgnoreCase("28")) {
				ele.click();
				break;
			}
			
		}
		
	}

}
