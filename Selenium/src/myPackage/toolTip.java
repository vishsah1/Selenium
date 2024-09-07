package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String actual = "Search for Products, Brands and More";
		String expected = driver.findElement(By.xpath("//input[@name='q']")).getAttribute("title");
		
		if(expected.equals(actual)) {
			System.out.println("Test Pass");
		}
	}
}
