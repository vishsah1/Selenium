package Project_Object_Model;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutPageObjectModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.quit();
		

		}

	

}
