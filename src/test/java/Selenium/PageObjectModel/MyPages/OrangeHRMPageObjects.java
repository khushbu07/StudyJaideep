package Selenium.PageObjectModel.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * URL: https://opensource-demo.orangehrmlive.com/
 * Username: Admin
 * Password: admin123
 */

public class OrangeHRMPageObjects {
	
	//Variables
	static WebDriver driver;
	
	//Locators
	static By txtUsername = By.id("txtUsername");
	static By txtPassword = By.id("txtPassword");
	static By btnLogin = By.id("btnLogin");
	static By imgOrangeHRMLogo = By.xpath("//img[@alt='OrangeHRM']");
	static By lnkWelcomeUser = By.xpath("//a[@id='welcome']");
	static By lnkLogout = By.xpath("//*[contains(text(),'Logout')]");
		
	//Constructor
	public OrangeHRMPageObjects(WebDriver driver){
		this.driver = driver;
	}
	
	//Methods
	public void loginOrangeHRM() throws Exception {
		driver.findElement(txtUsername).sendKeys("Admin");
		driver.findElement(txtPassword).sendKeys("admin123");
		driver.findElement(btnLogin).click();
		Thread.sleep(3000);
	
		if(driver.findElement(imgOrangeHRMLogo).isDisplayed()){
			System.out.println("Orange HRM: Login successful!");
		}else {
			System.out.println("Orange HRM: Login was not successful!");
		}
	}
	
	public void logoutOrangeHRM() throws Exception {
		driver.findElement(imgOrangeHRMLogo).click();
		Thread.sleep(2000);
		driver.findElement(lnkWelcomeUser).click();
		Thread.sleep(2000);
		driver.findElement(lnkLogout).click();
		
		if(driver.findElement(txtUsername).isDisplayed()) {
			System.out.println("Orange HRM: Logout successful!");
		}else {
			System.out.println("Orange HRM: Logout was not successful!");
		}
		
		driver.close();
		driver.quit();
	}
	
	
}
