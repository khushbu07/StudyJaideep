package TestNG.iTestListeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(ListenersClass.class)
public class ListenerDemoTwo {
	
	@Test
	public void testFour() {
		System.out.println("Inside fn: testone");
	}
	
	@Test
	public void testFive() {
		System.out.println("Inside fn: testtwo");
	}
	
	@Test
	public void testSix() {
		System.out.println("Inside fn: testthree");
	}
	
	
}
