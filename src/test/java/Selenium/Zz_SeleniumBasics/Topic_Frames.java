package Selenium.Zz_SeleniumBasics;

// NOTE: We cannot switch from one frame to another frame directly.

public class Topic_Frames {

	public static void main(String[] args) {
		
		/*
		 3 Ways to handle frames:
		 
		  1) By Index
		  Examples:
		  		driver.switchTo().frame(0);
		  		driver.switchTo().frame(1);
		  		
		  2) By Name or Id
		  Examples:
		  		driver.switchTo().frame("iframe1");					//By Name
		  		driver.switchTo().frame("IF1");						//By ID
		  		
		  3) By Web Element
		  Examples:
		  		driver.switchTo().frame(WebElement);
		  		
		 Additional:
		 		driver.switchTo().parentFrame();
		 		driver.switchTo().defaultContent();
		 
		 */

	}

}
