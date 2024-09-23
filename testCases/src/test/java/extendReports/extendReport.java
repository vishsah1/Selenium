package extendReports;


import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.SuiteHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;


public class extendReport {
	
	ExtentSparkReporter hmtlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void startTest()
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.pdf");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
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
	
	@Test
	public void Test01()
	{
		test = reports.createTest("Verify Test01");
		Assert.assertTrue(true);
	}
	
	@Test
	public void Test02()
	{
		test = reports.createTest("Verify Test02");
		Assert.assertTrue(false);
	}
	
	@Test
	public void Test03()
	{
		test = reports.createTest("Verify Test01");
		throw new SkipException("This is skip msg");
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAIL", ExtentColor.RED));
			test.fail(result.getThrowable());
			test.fail(result.getInstanceName());
			
		}else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASS", ExtentColor.GREEN));
			
		}else if(result.getStatus() == ITestResult.SKIP)
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIP", ExtentColor.ORANGE));
		}	
	}
	
	@AfterMethod
	public void disolve()
	{
		reports.flush();
	}
}
