package extendReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportListner implements ITestListener {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void onReportGenerate()
	{
		htmlReporter = new ExtentSparkReporter("extentReportViaXML.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//env-setup
		//env-details
		reports.setSystemInfo("Machine", "Bhare Ka");
		reports.setSystemInfo("OS", "Kabare Ka");
		reports.setSystemInfo("Browser", "haare Ka");
		reports.setSystemInfo("Engg.", "Saru Ka");
		
		//configure-look-feel
		htmlReporter.config().setDocumentTitle("Extent Reports");
		htmlReporter.config().setReportName("Test Reports");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEE, MMM dd, YYY, hh:mm a'('zzz')' ");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		onReportGenerate();
		
//		ITestListener.super.onTestStart(result);
		System.out.println("This is onTestStart message from listnerClass");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Sucess from listner: "+ result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ " PASS", ExtentColor.GREEN));
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ " Fail", ExtentColor.RED));
		test.fail(result.getThrowable());
		String h = result.getHost();
		test.fail(h);
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test=reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ " Skip", ExtentColor.YELLOW));
		test.skip((Throwable) result.getTestContext());
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		
		reports.flush();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
