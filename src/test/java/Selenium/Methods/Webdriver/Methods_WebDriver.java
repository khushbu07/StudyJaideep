package Selenium.Methods.Webdriver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_WebDriver {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
				
		//1. manage
		driver.manage().window().maximize();									//maximize()
		
		Dimension d=new Dimension(480, 620);
		driver.manage().window().setSize(d);									//setSize();
		
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);			//newWindow()
		newTab.get("https://testproject.io/platform/");
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
	    newWindow.get("https://blog.testproject.io/");
		
		//2. get()
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//3. getCurrentUrl()
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current Url is: " + currentURL);
		
		//4. getTitle()
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
		//5. navigate()
		driver.navigate().to("www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		//6. findElement(): Returns the first matching element with the locator. 
		WebElement element = driver.findElement(By.id("a"));
		
		//7. findElements(): Returns a list of WebElements matching with the locator.
		List<WebElement> elements = driver.findElements(By.name("b"));
		
		//8. getWindowHandle(): Return a handle of the current window in focus (in the form of String)
		String windowHandle = driver.getWindowHandle();
		System.out.println("Window Handle is: " + windowHandle);
		
		//9. getWindowHandles(): Return a set of handles of opened windows by the driver.
		Set<String> setWindowHandles = driver.getWindowHandles();
		System.out.println("Set of window handles is: " + setWindowHandles);
		
	}
}
