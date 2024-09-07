package maven.testNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@Listeners(maven.testNG.ListnerClass.class)
public class ListnerDemo {

	@Test
	public void passMethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		driver.quit();
	}
	
	@Test
	public void skipMethod()
	{
		System.out.println("This is skipped method message box");
		throw new SkipException(null);
	}
	
	@Test
	public void failMethod()
	{
		System.out.println("This is failled method message box");
		Assert.assertTrue(false);
	}
	
}
