package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://play309.atmegame.com/?gad_source=1&gclid=CjwKCAjwlbu2BhA3EiwA3yXyuznpiGz_24qE7J8tC1TZ9uFKC7l-rkwqGuHiwN_RAXO_Hpdl-w3lexoCodgQAvD_BwE");
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	for(WebElement el:links)
	{
		System.out.println( el.getAttribute("href"));
	}
	
	int linkCount = links.size();
	System.out.println(linkCount);
	
	driver.close();
	
		
		
	}

}
