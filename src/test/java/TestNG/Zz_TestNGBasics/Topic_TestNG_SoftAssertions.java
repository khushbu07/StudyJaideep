package TestNG.Zz_TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Topic_TestNG_SoftAssertions {
	
	/*
	 * Soft Assert collects errors during @Test.
	 * Soft Assert does not throw an exception when an assert fails
	 * and would continue with the next step after the assert statement. 
	 */
	
	/*Types:
	 * assertEqual(String actual,String expected)
	 * assertEqual(String actual,String expected, String message)
	 * assertEquals(boolean actual,boolean expected)
	 * assertTrue(condition)
	 * assertTrue(condition, message)
	 * assertFalse(condition)
	 * assertFalse(condition, message)
	 */
	
	@Test
	public void softAssert(){
		SoftAssert softAssert= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssert.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	}

}
