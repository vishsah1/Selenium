package myPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://talentedge.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no. of Links: " +links.size());
		
		int resCode = 200;
		int brokenLink = 0;
		for(WebElement el:links) {
			
			String urlLink = el.getAttribute("href");
			
			try {
				URL url = new URL(urlLink);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("HEAD");
				con.connect();
				
				resCode = con.getResponseCode();
				
				if(resCode >= 400) {
					System.out.println("Broken Link: "+ url);
					brokenLink++;
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Total no. of brokenLink: "+ brokenLink);		
	}
}
