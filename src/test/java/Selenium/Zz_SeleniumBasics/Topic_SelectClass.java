package Selenium.Zz_SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 * Select Class is used to handle the dropdowns in selenium
 */
public class Topic_SelectClass {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Example:
		//Create the object of the Select  class
		Select select = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		
		//Method: selectByIndex
		select.selectByIndex(1);
		
		//Method: selectByValue
		select.selectByValue("6");
		
		//Method: selectByVisibleText
		select.selectByVisibleText("Red");
		
		//Method: isMultiple()
		//If the <select > tag contains multiple attributes, it means that the dropdown allows selecting multiple values.
		boolean result = select.isMultiple();
		
		//Method: getOptions() -  fetch all the options in the dropdown
		List<WebElement> options = select.getOptions();
		
		//Method: getFirstSelectedOption()
		//If it is a single-select dropdown, this method will return the selected value of the dropdown.
		//if it is a multi-select dropdown, this method will return the first selected value of the dropdown.
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		
		//Method: getAllSelectedOptions()
		//If it is a single-select dropdown, this method will return the only selected value of the dropdown.
		//if it is a multi-select dropdown, this method will return all the selected values of the dropdown
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		
		//Methods: Related to deselecting option in dropdown
		/*
		 * deselectAll()
		 * deselectByIndex()
		 * deselectByValue()
		 * deselectByVisibleText()
		 */
		
	}
	
}
