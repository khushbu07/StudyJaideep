package TestNG.Zz_TestNGBasics;

import org.testng.Assert;

/*Types:
 * assertEqual(String actual,String expected)
 * assertEqual(String actual,String expected, String message)
 * assertEquals(boolean actual,boolean expected)
 * assertTrue(condition)
 * assertTrue(condition, message)
 * assertFalse(condition)
 * assertFalse(condition, message)
 */

public class Topic_TestNG_HardAssertions {

	/*
	 * Hard Assert – Hard Assert throws an AssertException immediately
	 * when an assert statement fails and test suite continues with next @Test.
	 * 
	 * The disadvantage of Hard Assert – It marks method as fail if assert condition gets failed 
	 * and the remaining statements inside the method will be aborted.
	 */
	
	public static void main(String[] args) {
		
		Assert.assertEquals(45678, 45678);
		Assert.assertEquals("qababu", "qa b@b@");							//Once it fails at this steps, it will stop the execution
		Assert.assertEquals("qababu@gmail.com", "qababu@yahoo.com");
		
	}

}
