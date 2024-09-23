
package myPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rough{
	
	public static void main(String[] args)
	{
		
//		System.setProperty("driver.chrome.driver", "");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total No. of available links: "+allLinks.size());
		
		int broken=0;
		for(WebElement el:allLinks)
		{
			String urls = el.getAttribute("href");
			
			try {
				URL url = new URL(urls);
				
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("HEAD");
				con.connect();
				
				int res = con.getResponseCode();
				
				if(res>=400)
				{
					System.err.println("Broken Link: "+ url);
					broken++;
				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.err.println("Total No. of broken Links: "+ broken);
		
		
	

	}

}