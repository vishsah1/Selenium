package ReTryTestCases;

import org.testng.Reporter;
import org.testng.annotations.*;
import junit.framework.Assert;

public class ReTestCase {

	@Test
	public void TestCase1()
	{
		Assert.assertTrue(false);
		
	}

	@Test
	public void TestCase2()
	{
		Assert.assertTrue(true);
		Reporter.log("hello java.......................");
	}

	@Test
	public void TestCase3()
	{
		Assert.assertTrue(false);	
	}


}
