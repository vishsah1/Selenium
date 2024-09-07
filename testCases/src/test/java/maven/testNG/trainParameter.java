package maven.testNG;

import org.testng.annotations.*;

import org.testng.annotations.Parameters;

public class trainParameter {
	
	@Parameters({"name"})
	@Test
	public void rajdhani(String name)
	{
		System.out.println("Train name is: "+name);
	}
}
