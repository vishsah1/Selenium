package basicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//single attribute
//		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		
		//contain
//		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		
		//star-withs //input[starts-with(@id,'user')]
		driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("standard_user");
		
		
		
		//multiple attribute
		driver.findElement(By.xpath("//input[@name='password'][@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		
		//OR
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt' or @name='add-to-cart-sauce-labs-bolt-t-shirt']")).click();

	}

}
