package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class method2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String expectedYear = "2024";
		String expectedMonth = "September";
		String expectedDate = "11";
//		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		 WebElement e = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	      driver.switchTo().frame(e);
	      
		WebElement datePicker =  driver.findElement(By.id("datepicker"));
				datePicker.click();
				
		String calMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		while(true) 
		{
			if(calMonth.equals(expectedMonth) && calYear.equals(expectedYear))
			{
				driver.findElement(By.xpath("//a[@data-date="+expectedDate+"]")).click();
				break;
			}else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				Thread.sleep(500);
			}
		}
		
	}

}
