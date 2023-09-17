package TestNG.retryFailedTCs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
 * Using "@Test(retryAnalyzer = selenium_RetryFailedTestCases.RetryAnalyzer.class)"
 * We can reTry a test method but this is not a good practice when we need to rerun multiple tests
 * Because we will have to add this property to all the test methods to try re-run
 * 
 * To Overcome this, We have "IAnnotationTransformer" interface.
 * Remove the "@Test(retryAnalyzer = selenium_RetryFailedTestCases.RetryAnalyzer.class)" property from tests
 * And call/implement the RetryAnalyser in AnnotationTransformer class
 * 
 */

public class RetryAnalyzer implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 2;


	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}

