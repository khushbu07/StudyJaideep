package Selenium.Zz_SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Topic_Alerts {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Text");
	
	}

}
