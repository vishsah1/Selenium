package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;



public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		
		Stopwatch watch = null;
		
		try{
			watch = Stopwatch.createStarted();
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Grocery1']")));
			ele.click();
			
		}catch(Exception e) {
			
			watch.stop();
			System.out.println(e);
			System.out.println("Wait Time: "+watch.elapsed(TimeUnit.SECONDS) + " Second");
		}

	}

}
