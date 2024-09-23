package myPackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=0pA10Fdr7yM&ab_channel=T-SeriesBhaktiSagar");
		
		//getCookies
		Set<Cookie> cookie = driver.manage().getCookies();
		System.out.println("No. Of Cookie: "+cookie.size());
		
		for(Cookie c:cookie)
		{
			System.out.println("Cookie Nmae: " +c.getName() +"Value: "+c.getValue()+ "  Expiry: "+c.getExpiry());
		}
		
		//add Cookie
		Cookie addCookie = new Cookie("Vish" , "JobLess");
		driver.manage().addCookie(addCookie);
		
		Set<Cookie> cookieadd = driver.manage().getCookies();
		System.out.println("No. Of CookieAfter Add: "+cookieadd.size());
		
		driver.manage().getCookieNamed("Vish");
		driver.manage().deleteCookieNamed("Vish");
		
		Set<Cookie> cookiedlt = driver.manage().getCookies();
		System.out.println("No. Of CookieAfter Dlt: "+cookiedlt.size());
		
//		driver.manage().deleteAllCookies();
		
		driver.close();


	}

}
