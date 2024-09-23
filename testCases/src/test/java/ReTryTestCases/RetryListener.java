package ReTryTestCases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		// TODO Auto-generated method stub
		testAnnotation.setRetryAnalyzer(ReTryAnalyzer.class);
	}

}
