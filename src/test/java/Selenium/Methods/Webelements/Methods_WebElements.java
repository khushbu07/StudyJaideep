package Selenium.Methods.Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;

public class Methods_WebElements {

	static WebDriver driver = null;

	public static void main(String[] args) {

		//1. clear():
		driver.findElement(By.id("UserName")).clear();
		
		//2. sendKeys():
		WebElement element = driver.findElement(By.id("UserName"));  
		element.sendKeys("JavaTpoint");
		
		//3. click();
		WebElement elementTwo = driver.findElement(By.linkText("ABC"));  
		elementTwo.click();
		
		//4. isDisplayed(): Return true if certain element is present and displayed
		element.isDisplayed();
		
		//5. isSelected(): Return true if selected. Works on - radio buttons, checkboxes, select options, and menu items
		boolean status = driver.findElement(By.id("Sex-Male")).isSelected();
		
		//6. submit():
		driver.findElement(By.id("SubmitButton")).submit();
		
		//7. isEnabled(): Return true if element is enabled.
		WebElement eleEnabled = driver.findElement(By.id("TextBox"));
		eleEnabled.isEnabled();
		
		//8. getText(): To fetch the innertext of a web element.
		String text = driver.findElement(By.id("TextBox")).getText();
		
		//9. getTagName()
		element.getTagName();
		
		//10. getAttribute(): Retrieves the attribute value of a specified element
		WebElement elementThree = driver.findElement(By.id("SubmitButton"));
		String attValue = elementThree.getAttribute("id"); //This will return "SubmitButton"
		
		//11. getSize(): Retrieves the height and width of a specific rendered element
		WebElement elementFour = driver.findElement(By.id("SubmitButton"));
		Dimension dimensions = elementFour.getSize();
		System.out.println("Height :" + dimensions.height + "Width : "+ dimensions.width);
		
		//12. X & Y Coordinates
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
	}
}
