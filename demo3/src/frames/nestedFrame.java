package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nestedFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		//main_Page
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Main Page");
		
		//Frame_1
		driver.switchTo().frame("frm1");
//		Select slt = new Select(driver.findElement(By.tagName("select")));
		Select slt = new Select(driver.findElement(By.xpath("//select[@id='course']")));
		slt.selectByVisibleText("Java");
		
		Thread.sleep(3000);
		
		//back_to_main
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Return Back to Main Page");
		
		Thread.sleep(3000);
		
		//nested_frame
		driver.switchTo().frame("frm3");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("I am frame 3 Text Box");
		driver.switchTo().frame("frm1");
		Select slt1 = new Select(driver.findElement(By.xpath("//select[@id='course']")));
		slt1.selectByIndex(3);
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("I am Parent Frame 3");
		
		Thread.sleep(3000);
		
		//main_page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Learning is Good");
	}
}
