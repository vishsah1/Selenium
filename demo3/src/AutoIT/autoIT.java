package AutoIT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoIT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score");
		
		WebElement element = driver.findElement(By.xpath("//span[@class='browse']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
		
		Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C://Users//Vish Sah//OneDrive//Desktop//autoIT//fileUplaod.exe");
	}
}
