package TestNG.iTestListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * Using ITestListener, we can create a class that implements this interface
 * Which can further be used as Listeners in out test classes.
 * Purpose is to invoke various methods depending upon the events that occurs during test execution
 * For example, it has methods like onTestStart, onTestSuccess, onTestFailure, onTestSkipped
 * Whenever a test is failed, it will automatically invoke the onTestFailure method and execute the code inside this method
 * Likewise, whenever a test is passed, it invokes onTestStart method and execute its code.
 */

public class ListenersClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("LISTENER LOG - Test Started & Test Details are: "+result.getName());		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("LISTENER LOG - Test Success & Test Details are: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("LISTENER LOG - Test Failed & Test Details are: "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("LISTENER LOG - Test Skipped & Test Details are: "+result.getName());
	}
		
}
