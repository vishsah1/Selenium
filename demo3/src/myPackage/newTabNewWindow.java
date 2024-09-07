package myPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.graph.ElementOrder.Type;

public class newTabNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://facebook.com/");
//		System.out.println(driver.getTitle());
//		
//		Set<String> handle= driver.getWindowHandles();
//		List<String> allHandle = new ArrayList<String>();
//		allHandle.addAll(handle);
//		
//		driver.close();
//		
//		driver.switchTo().window(allHandle.get(0));
//		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://flipkart.com");
		System.out.println(driver.getTitle());
		
		Set<String> Windowhandle = driver.getWindowHandles();
		List<String> allHandle = new ArrayList<String>();
		allHandle.addAll(Windowhandle);
		
		driver.close();
		
		driver.switchTo().window(allHandle.get(0));
		System.out.println(driver.getTitle());
	}
}
