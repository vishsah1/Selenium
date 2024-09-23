 package crossBrowserTesting;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class crossBrowserTesting {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			driver = null;
			break;
		}
	}
	
	@Test
	public void VerifyTitle()
	{
		driver.get("https://www.google.com/");
		String actual = driver.getTitle();
		String expexted = "Google";
		Assert.assertEquals(actual,expexted);
	}

	@AfterMethod
	public void QuitBrowser()
	{
		driver.quit();
	}

}
