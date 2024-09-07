package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String sourceCity = "Delhi";
		String destCity = "Patna";
		String expectedMonth= "September";
		String expectedDate = "29";
		
		//System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		//source-city
		driver.findElement(By.xpath("//p[@class='sc-12foipm-6 erPfRs']")).click();
		driver.findElement(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/input[@type='text']")).sendKeys(sourceCity);
		List<WebElement> listedCity = driver.findElements(By.xpath("//span[@class='autoCompleteTitle ']"));
		System.out.println("Sorce: "+listedCity.size());
		
		for(WebElement s:listedCity)
		{
			String g = s.getText();
			System.out.println(g);

			if(s.getText().contains(sourceCity))
			{
				s.click();
				break;
			}
		}

		//dest-city
//		driver.findElement(By.xpath("//p[@class='sc-12foipm-4 czGBLf fswWidgetTitle']")).click();
		driver.findElement(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/input[@type='text']")).sendKeys(destCity);
		List<WebElement> listCity = driver.findElements(By.xpath("//span[@class='autoCompleteTitle ']"));
		System.out.println("Dest: "+listCity.size());
		
		for(WebElement d:listCity)
		{
			if(d.getText().contains(destCity))
			{
				d.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		//journey-daTE
		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
				
		String calMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		System.out.println(calMonth);

		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains(expectedMonth))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
//		List<WebElement> calDate = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		List<WebElement> calDate = driver.findElements(By.cssSelector("DayPicker-Day"));
		
		for(WebElement e:calDate)
		{
			if(e.getText().equals(expectedDate))
			{
				e.click();
				break;
				
			}
		}

		//click on search button
		driver.findElement(By.xpath("//span[@class='sc-12foipm-72 ezNmSh']")).click();
	}
}
