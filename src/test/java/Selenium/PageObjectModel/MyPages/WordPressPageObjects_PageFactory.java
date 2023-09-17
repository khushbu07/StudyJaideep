package Selenium.PageObjectModel.MyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
 * URL: http://demosite.center/wordpress/wp-login.php
 * User name: admin
 * Password: demo123
 * 
 * Using Page Factory
 */

public class WordPressPageObjects_PageFactory {
	
	//Variable(s)
	WebDriver driver;
	
	//Constructor
	public WordPressPageObjects_PageFactory(WebDriver driver){
		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}
	
	//Locator(s)
	@FindBy(id = "user_login") WebElement txtUsername;											//Way 1
	@FindBy(how=How.ID, using="user_pass") WebElement txtPassword;								//Way 2
	@FindBy(how=How.XPATH, using="//input[@id='wp-submit']") WebElement btnLogin;				
	@FindBy(how=How.LINK_TEXT, using="Lost your password?") WebElement lnkForgotPassword;
	
	//Method(s)
	public void loginWordPress(String Username, String Password) {
		txtUsername.sendKeys(Username);
		txtPassword.sendKeys(Password);
		btnLogin.click();
	}
	
}
