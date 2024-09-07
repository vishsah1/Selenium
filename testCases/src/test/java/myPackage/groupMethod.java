package myPackage;

import org.testng.annotations.Test;

public class groupMethod {
	
	@Test(groups = "cricket")
	public void bat() 
	{
		System.out.println("batting");
	}
	
	@Test(groups = "cricket")
	public void wicket() 
	{
		System.out.println("Wicket");
	}
	
	@Test(groups = "cricket")
	public void ball() 
	{
		System.out.println("balling");
	}
	
	@Test(groups = "football")
	public void net() 
	{
		System.out.println("goal net");
	}
	
	@Test(groups = "football")
	public void plentay() 
	{
		System.out.println("pleanty hit");
	}
	
	@Test(groups = "football")
	public void goal() 
	{
		System.out.println("goal Kipper");
	}

}
