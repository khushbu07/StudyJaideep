package Selenium.Zz_SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Zz_Utils.CaptureScreenshot;

//We can implement the method "captureScreenshot" in such a way that
//whenever the test is pass or fail, it takes a screenshot

public class Topic_TakeScreenshotDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {

		CaptureScreenshot CaptureScreenshot = new CaptureScreenshot();

		//Driver setup
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		CaptureScreenshot.captureScreenshot(driver, "Browser Starter");
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("JD");
		CaptureScreenshot.captureScreenshot(driver, "Email Entered");


		//Take Screenshot of a WebElement
		WebElement drpdwn = driver.findElement(By.xpath("//select[@name=’selType’]"));
		// capture screenshot with getScreenshotAs() of the dropdown
		File f = drpdwn.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("screenshots.png"));
		driver.quit();


	}

}
