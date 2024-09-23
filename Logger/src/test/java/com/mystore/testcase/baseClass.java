package com.mystore.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import com.mystore.utilities.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	readConfig rConfig =new readConfig();
	
	String url = rConfig.getbaseUrl();
	String browser = rConfig.getBrowser();
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		String browser = "chrome";
		switch(browser.toLowerCase())
		{
		
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
		case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		
		case "safari":
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
		break;
		
		default:
		driver = null;
		break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	

}
