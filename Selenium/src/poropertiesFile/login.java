package poropertiesFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		ReadCofigFile rfc = new ReadCofigFile();
		
		driver.get(rfc.getURL()); 

		//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//		driver.findElement(By.id("password")).sendKeys("standard_user");
		//		driver.findElement(By.id("login-button")).click();

		Actions action = new Actions(driver);
		Action seriesOfAction = action.moveToElement(driver.findElement(By.id("user-name")))
				.click()
				.sendKeys(rfc.getUsername(), Keys.TAB)
				.sendKeys(rfc.getPassword(), Keys.ENTER)
				.build();
		seriesOfAction.perform();
		
		Thread.sleep(3000);

		driver.close();

	}

}
