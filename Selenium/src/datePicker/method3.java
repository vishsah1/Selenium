package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class method3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String expectedDate = "29";
		String expectedMonth = "Oct";
		String expectedYear = "2024";
		
//		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).sendKeys("09/19/2024");
		
		driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
		
		Thread.sleep(5000);
		
		WebElement calMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sltMonth = new Select(calMonth);
		sltMonth.selectByVisibleText(expectedMonth);
		WebElement calYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sltYear = new Select(calYear);
		sltYear.selectByVisibleText(expectedYear);
		
		//*[text()=9] method
//		driver.findElement(By.xpath("//*[text()="+expectedDate+"] ")).click();
		
		//List web element method
		List<WebElement> tableDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement e:tableDate) 
		{
			String calDate = e.getText();
			
			if(calDate.equals(expectedDate)) 
			{
				e.click();
				break;
			}
		}
	}
}

