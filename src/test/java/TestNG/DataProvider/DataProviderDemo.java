package TestNG.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@Test(dataProvider = "WordPressLoginData")
	public void loginWordPress(String username, String password) throws Exception {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(4000);
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User not able to Login");		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="WordPressLoginData")
	public Object[][] passdata(){
		Object[][] data = new Object[2][2];
		
		data[0][0] = "admin";
		data[0][1] = "demo123";
		
		data[1][0] = "admin1";
		data[1][1] = "demo1234";
				
		return data;
	}
	
}
