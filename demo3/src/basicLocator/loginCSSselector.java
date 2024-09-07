package basicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginCSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		//tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//tag.value of class
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//tag.value of class[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		//sub-string tag[attribute ^,$,* = value]
		driver.findElement(By.cssSelector("button[name *= onesie")).click();
		
		
	}

}
