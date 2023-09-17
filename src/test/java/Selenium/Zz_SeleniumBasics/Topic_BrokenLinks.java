package Selenium.Zz_SeleniumBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * First, we can store the list of all the elements with the tagname "a" in a single variable using "driver.findElements" method
 * Then using for loop, we can fetch the URL of these elements by simply fetch the "href" attribute
 * Then for each of these URL, we can check the response code by establishing the connection using "HttpURLConnection" class
 * if the response code is 404 or HTTP_NOT_FOUND, then it means that the connection is broken for that particular url
 */


public class Topic_BrokenLinks {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path 
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe"); //Setting the ChromeDriver path
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		//Store all the WebElemnt having tagname "a"
		List<WebElement> eleLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+eleLinks.size());
		
		for(int i=0; i<eleLinks.size(); i++) {
			
			WebElement element = eleLinks.get(i);
			String url = element.getAttribute("href");
			verifyURLActive(url);
		}
		
	}
	
	public static void verifyURLActive(String urlLink) throws IOException {
		
		try {
			
			URL url = new URL(urlLink);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(3000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode() == 200) {
				System.out.println(urlLink+" - "+httpUrlConnection.getResponseMessage());
			}else if (httpUrlConnection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(urlLink+" - "+httpUrlConnection.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
}
