package myPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		//Full Screen SS
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Section SS
		WebElement section = driver.findElement(By.xpath("//div[@class='header-outer']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		
		
		
		File dest = new File("C:\\Users\\Vish Sah\\eclipse-workspace\\demo3\\src\\ScreenShot\\SectionSS.png");
		FileUtils.copyFile(src, dest);

	}

}
