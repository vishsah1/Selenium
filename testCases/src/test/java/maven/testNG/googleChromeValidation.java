package maven.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class googleChromeValidation {
	
	@Parameters({"title"})
	@Test
	public void searchBar(String title)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement el = driver.findElement(By.name("q"));
		el.sendKeys(title);
		
		Assert.assertEquals(title, el.getAttribute("value"));
		
		
	}

}
