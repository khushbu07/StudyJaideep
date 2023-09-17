package TestNG.iTestListeners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(ListenersClass.class)
public class ListenerDemoOne {
	
	@Test
	public void testOne() {
		System.out.println("Inside fn: testone");
		assertEquals(2, 3);
	}
	
	@Test
	public void testTwo() {
		System.out.println("Inside fn: testtwo");
		assertEquals(3, 2);
	}
	
	@Test
	public void testThree() {
		System.out.println("Inside fn: testthree");
		assertEquals(2, 2);
	}
	
	
}
