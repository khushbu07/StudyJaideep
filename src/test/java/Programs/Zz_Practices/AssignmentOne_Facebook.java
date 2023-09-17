package Programs.Zz_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AssignmentOne_Facebook {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//String the Username & Password in Variables
		String username = "9404181557";
		String password = "baba@123";
		
		//Chrome Driver Setup
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Enter the Username & Password to Login to Facebook
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id(""));

	}
	
	@BeforeClass
	public void chromeDriverSetup() {
		
	}

}
