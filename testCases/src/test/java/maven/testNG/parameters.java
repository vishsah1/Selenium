package maven.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	
	@Test
	@Parameters({"i","j"})
	public void add(int i,int j)
	{
		System.out.println("Add: "+(i+j));
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int i,int j)
	{
		System.out.println("Sub: "+(i-j));
	}
}
