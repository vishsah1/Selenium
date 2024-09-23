package myPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://play309.atmegame.com/?gad_source=1&gclid=CjwKCAjwlbu2BhA3EiwA3yXyuznpiGz_24qE7J8tC1TZ9uFKC7l-rkwqGuHiwN_RAXO_Hpdl-w3lexoCodgQAvD_BwE");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total No. Links: "+allLinks.size());
		
		
		int resCode = 200;
		int brokenLink = 0;
		for(WebElement el:allLinks) {
			
			String url = el.getAttribute("href");
//			System.out.println(url);
			
			try {
				URL urlLink = new URL(url);
				
				HttpURLConnection con = (HttpURLConnection) urlLink.openConnection();
				con.setRequestMethod("HEAD");
				con.connect();
				
				resCode = con.getResponseCode();
				
				if(resCode >= 400) {
					
					System.out.println(urlLink + " -Broken Link");
					brokenLink++;
					
				}
				
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Broken Link Count: "+ brokenLink);
	}
}
