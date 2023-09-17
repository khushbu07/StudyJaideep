package Selenium.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_ImplicitWait {
	
	/*
	 * Implicitly Wait is always applied globally (that is, it is available for all the elements)
	 * throughout the driver instance.
	 */
	
	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit Wait for pageload
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		
		//Overriding Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
