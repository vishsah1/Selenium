import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class talentedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://talentedge.com/");
		WebElement cross = driver.findElement(By.xpath("//img[@src='https://talentedge.com/images/close-custom.png']"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", cross);
		
//		driver.findElement(By.id(""));

//		driver.close();
	}

}
