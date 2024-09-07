package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dob {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String expectedDate = "29";
		String expectedMonth = "November";
		String expectedYear = "1990";
		
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		
		Boolean calMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains(expectedMonth);
		Boolean calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().contains(expectedYear);	
		
		while(!calYear && !calMonth)
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
//		Thread.sleep(5000);
//		
//		
//		
//		//List web element method
//		List<WebElement> tableDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
//		for(WebElement e:tableDate) 
//		{
//			String calDate = e.getText();
//			
//			if(calDate.equals(expectedDate)) 
//			{
//				e.click();
//				break;
//			}
//		}
	}
}

