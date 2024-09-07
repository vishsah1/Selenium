package action;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Vish%20Sah/Downloads/Selenium%20Actions_%20Handle%20Double%20&%20Right%20Click%20In%20Selenium.html");
		
		WebElement doubleClick = driver.findElement(By.id("doubleclick"));
		
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).perform();

	}

}
