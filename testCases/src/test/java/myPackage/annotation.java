package myPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("Before Test Method");
	}
	

	@Test
	public void test()
	{
		System.out.println("First Test Case annotation Class");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Second Test Case annotation Class");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suit");
	}
	
	@AfterSuite
	public void Aftertest()
	{
		System.out.println("After Suit");
	}
}
