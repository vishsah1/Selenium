package myPackage;

import org.testng.annotations.Test;

public class attributes {
	
//	@Test(description = "running baba")

	@Test(priority = 3)
	public void run() 
	{
		System.out.println("Run");
	}
	
//	@Test(priority = 2)
	@Test(timeOut = 200)
	public void waiT() throws Throwable 
	{
		Thread.sleep(300);
		System.out.println("Wait");
	}
	

//	@Test(priority = 4)
	@Test(dependsOnMethods = {"play","waiT"})
	public void stop() 
	{
		System.out.println("stop");
	}
	
	@Test(description = "Kheliye baba")
	public void play() 
	{
		System.out.println("Play");
	}
	
	

}
