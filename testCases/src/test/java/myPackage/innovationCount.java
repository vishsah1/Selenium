package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class innovationCount {
	
	@Test(invocationCount = 5)
	public void verifyLogin(ITestContext context)
	{
		int currentContext = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Execute no.: "+currentContext);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		System.out.println("Login Sucessfully");
		
		driver.quit();

	}

}
