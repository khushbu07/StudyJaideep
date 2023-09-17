package TestNG.retryFailedTCs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClassTwo {
	
	@Test
	public void testFour() {
		System.out.println("This is test four");
		Assert.assertTrue(75<57);
	}
	
	@Test
	public void testfive() {
		System.out.println("This is test five");
		Assert.assertTrue(10>5);
	}
	
//	@Test(retryAnalyzer = selenium_RetryFailedTestCases.RetryAnalyzer.class)
//	public void testSix() {
//		System.out.println("This is test Six");
//		Assert.assertTrue(10<5);
//	}
	
}
