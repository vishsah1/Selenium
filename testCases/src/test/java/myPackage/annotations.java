package myPackage;

import org.testng.annotations.*;

public class annotations {
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void test()
	{
		System.out.println("First Test Case annotation Class");
	}
	
	@Test
	public void test2()
	{
		System.out.println("");
		System.out.println("Second Test Case annotation Class");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("After Test Method");
	}

}
