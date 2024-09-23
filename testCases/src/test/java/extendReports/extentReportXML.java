package extendReports;

import org.testng.SkipException;
import org.testng.annotations.*;

import junit.framework.Assert;

public class extentReportXML {
	
	@Test
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("this is Test1");
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
		System.out.println("this is Test2");
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(false);
		System.out.println("this is Test3");
	}
	
	@Test
	public void test4() {

		System.out.println("this is Test4");
		throw new SkipException("this is runTime exception");
	}

}
