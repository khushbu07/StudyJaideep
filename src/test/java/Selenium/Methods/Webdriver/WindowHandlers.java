package Selenium.Methods.Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		System.out.println("Parent Window Title before switching: "+driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window handle before switching: "+parentWindow);
		
		WebElement lnkOne = driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
		WebElement lnkTwo = driver.findElement(By.xpath("//a[@href='http://www.facebook.com']"));
		WebElement lnkThree = driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']"));
		
		lnkOne.click();
		Thread.sleep(2000);		
		driver.switchTo().window(parentWindow);
		
		lnkTwo.click();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		
		lnkThree.click();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		
		Set<String> allWindows = driver.getWindowHandles();
		int totalWindows = allWindows.size();
		
		for(String childWindow : allWindows) {
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Child Window Title: "+driver.getTitle());
				System.out.println("Child Window Handle: "+driver.getWindowHandle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Title after switching: "+driver.getTitle());
		System.out.println("Parent Window handle before switching: "+driver.getWindowHandle());
	}

}
