package maven.testNG;

import org.testng.annotations.*;

import org.testng.annotations.Parameters;

public class busParameter {
	
	@Test
	@Parameters({"name"})
	public void rajdhani(String name)
	{
		System.out.println("Bus name is: "+name);
	}
}
