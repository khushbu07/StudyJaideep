package Selenium.PageObjectModel.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * URL: https://www.facebook.com
 */
public class FacebookLoginPageObjects {
	
	//Defining Variable(s)
	WebDriver driver;
	
	//Defining Locators
	By txt_EmailID = By.xpath("//input[@id='email']");
	By txt_Password = By.xpath("//input[@id='pass']");
	By btn_LogIn = By.xpath("//button[@name='login']");

	//Defining Constructor
	FacebookLoginPageObjects(WebDriver driver){
		this.driver = driver;
	}

	//Defining Methods
}
