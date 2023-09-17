package TestNG.Zz_TestNGBasics;

import org.testng.annotations.Test;

public class Topic_TestNG_Dependencies {
	
	@Test(dependsOnMethods = {"testB"})
	public void testA() {
		System.out.println("This is test A");
	}
	
	@Test
	public void testB() {
		System.out.println("This is test B");
	}
	
	@Test(dependsOnGroups = {"sanityOne"})
	public void testC() {
		System.out.println("This is test C");
	}
	
	@Test(groups = "sanityOne")
	public void testD() {
		System.out.println("This is test D");
	}

}
