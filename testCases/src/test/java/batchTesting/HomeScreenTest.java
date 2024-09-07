package batchTesting;

import org.testng.annotations.Test;

public class HomeScreenTest {

	@Test
	public void LaunchApp()
	{
		System.out.println("Application has been launched sucessfully");
	}
	
	@Test
	public void VerfyTitle()
	{
		System.out.println("Title has been verfied sucessfully");
	}
	
	@Test
	public void VerifyLogo()
	{
		System.out.println("Logo has been verified sucessfully");
	}
}
