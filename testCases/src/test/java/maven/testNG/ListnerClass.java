package maven.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is onTestStart message from listnerClass");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This is onTestSucess message from listnerClass: " + result);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This is ontestFail message from listnerClass: "+result);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This is onTestSkipped message from listnerClass: "+result);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println("This is  message from listnerClass");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is onStart message from listnerClass");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish message from listnerClass");
		
	}
	
	

}
