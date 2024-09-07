package maven.testNG;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@Test(dataProvider="searchKey")
	public void dataReceiver(String firstKey, String secondKey)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement searhbox = driver.findElement(By.name("q"));
		searhbox.sendKeys(firstKey +"  "+ secondKey);
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']")).submit();
	}
	
	@DataProvider(name="searchKey")
	public Object[][] DataProviderFxn()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "India";
		obj[0][1] = "RedFort";
		obj[1][0] = "Egypt";
		obj[1][1] = "Pyramid";
		obj[2][0] = "Nepal";
		obj[2][1] = "Everest";
		
		return obj;
	}
}
