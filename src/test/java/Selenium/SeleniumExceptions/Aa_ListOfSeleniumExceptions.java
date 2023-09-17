package Selenium.SeleniumExceptions;

/*
 * List of Common Selenium Exceptions:
 * 		- NoAlertPresentException
 * 			When the script is trying to switch to an Alert which is not yet present.
 * 
 * 		- NoSuchAttributeException
 * 			When attempting to access an attribute that does not exist
 * 			Example: String tempAttribute = element.getAttribute(attribute);
 * 
 * 		- NoSuchElementException
 * 			When the locator is not able to find the element on the Web Page. Either locator defination is wrong or page is different.
 * 
 * 		- NoSuchFrameException
 * 			When the script tries to switch to an invalid frame.
 * 
 * 		- NoSuchWindowException
 * 			When the script tries to switch to an invalid window.
 * 
 * 		- SessionNotCreatedException
 * 			When we are not using the updated browser driver (chromedriver) and the browser is updated.
 * 
 * 		- StaleElementReferenceException
 * 			We face this stale element reference exception when the element we are interacting with is destroyed and then recreated again.
 * 			When this happens the reference of the element in the DOM becomes stale.
 * 			Way to Handle:
 * 			1) Refresh the page.	
				driver.navigate().refresh();
				driver.findElement(By.xpath("xpath here")).click();
			2) Using ExpectedConditions.refreshed	

 * 		- TimeoutException
 * 			Sometimes we use "wait" to avoid "ElementNotVisible" exception
 * 			But when the wait time is over TimeoutException is thrown.
 * 
 * 		- UnknownMethodException
 * 		- WebDriverException
 * 			This takes place when the WebDriver is performing the action right after you close the browser.
 * 
 * 		- ElementNotVisibleException
 * 			when an existing element in DOM has a feature set as hidden.
 * 			In this situation, elements are there, but you can not see and interact with the WebDriver.
 */			

public class Aa_ListOfSeleniumExceptions {

}
