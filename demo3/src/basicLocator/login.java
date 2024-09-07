package basicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
//		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		
		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
		driver.findElement(By.id("add-to-cart")).click();
		
//		driver.close();
		
	}

}
