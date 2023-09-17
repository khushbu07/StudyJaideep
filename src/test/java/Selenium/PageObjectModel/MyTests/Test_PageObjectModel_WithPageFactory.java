package Selenium.PageObjectModel.MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Selenium.PageObjectModel.MyPages.WordPressPageObjects_PageFactory;

public class Test_PageObjectModel_WithPageFactory {
	
	@Test
	public void checkValidUser() {
		
		WebDriver driver = Zz_Utils.BrowserFactory.startBrowser("Chrome", "http://demosite.center/wordpress/wp-login.php");
		
		//Create Page object using Page Factory
		WordPressPageObjects_PageFactory WordPressPageObjects_PageFactory = PageFactory.initElements(driver, WordPressPageObjects_PageFactory.class);
//		WordPressPageObjects_PageFactory WordPressPageObjects_PageFactory = new WordPressPageObjects_PageFactory(driver);
		WordPressPageObjects_PageFactory.loginWordPress("admin", "demo123");
		
	}

}
