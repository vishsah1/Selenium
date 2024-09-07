package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HardAndSoftAssertion {
	
	@Test
	public void HardAssertion()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//soft_assertion
		SoftAssert soft = new SoftAssert();
		
		//hard-assertion
//		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		soft.assertEquals(driver.getTitle(), "Swag Labs");
		
		System.out.println("isDisplayedMessage");
		WebElement logo = driver.findElement(By.xpath("//div[@class='app_logo']"));
		soft.assertTrue(logo.isDisplayed());
		
		
		//report all generated exception
		soft.assertAll();

		driver.quit();

	}


}
