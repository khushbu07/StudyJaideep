package TestNG.Zz_TestNGBasics;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/*
 * @Ignore Annotation can also be used at class level
 * And at method level
 */

public class Topic_TestNG_IgnoreAnnotation {

	@Test
	@Ignore
	public void testOne() {
		System.out.println("This is test one");
	}
	
	@Test
	public void testTwo() {
		System.out.println("This is test two");
	}
	
	//package-info.java file is also created to ignore all the tests in this class
}
