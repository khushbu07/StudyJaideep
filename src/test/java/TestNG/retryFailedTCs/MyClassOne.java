package TestNG.retryFailedTCs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClassOne {
	
	@Test
	public void testOne() {
		System.out.println("This is test one");
		Assert.assertTrue(89>34);
	}
	
	@Test
	public void testTwo() {
		System.out.println("This is test two");
		Assert.assertTrue(34>55);
	}
		
}
