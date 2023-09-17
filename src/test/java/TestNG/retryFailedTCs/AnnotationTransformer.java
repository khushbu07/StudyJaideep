package TestNG.retryFailedTCs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		//Setting the Retry Analyzer that we have created
		annotation.setRetryAnalyzer(RetryAnalyzer.class);		
		
	}
	
}

