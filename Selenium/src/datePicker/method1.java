//package datePicker;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class method1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String expectedDate = "29";
//		String expectedMonth = "September";
//		String expectedYear = "2024";
//		
////		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
//		driver.manage().window().maximize();
//		
////		driver.findElement(By.xpath("//input[@id='first_date_picker']")).sendKeys("09/19/2024");
//		
//		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
//		
//		String calMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//		String calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//		
//		while(true) {
//		if(calMonth.equals(expectedMonth) && calYear.equals(expectedYear)) 
//		{
//			
//			List<WebElement> tableDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
//				
//			for(WebElement e:tableDate) 
//			{
//				String calDate = e.getText();
//				
//				if(calDate.equals(expectedDate)) 
//				{
//					e.click();
//					break;
//				}
//			}
//			break;
//			}else {
//				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//			}
//		}
//	}
//}
//
