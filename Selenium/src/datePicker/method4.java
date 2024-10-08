package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class method4 {

	public static void main(String[] args) {
		
		String expectedMonth = "March";
		String expectedDate = "29";
//		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	      
		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
				
//		String calYear = driver.findElement(By.xpath("//div[contains(text(),'September 2024')]")).getText();
		String calMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		System.out.println(calMonth);

		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains(expectedMonth))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		List<WebElement> calDate = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		
		for(WebElement e:calDate)
		{
			if(e.getText().contains(expectedDate))
			{
				e.click();
				break;
			}
		}
	}

}
