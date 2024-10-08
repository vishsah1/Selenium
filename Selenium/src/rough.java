

import org.openqa.selenium.By;
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
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.support.ui.Select;


public class rough{


	public static void main(String[] args) throws AWTException
	{

		System.setProperty("driver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement e = driver.findElement(By.xpath("//input[@nameA='upfile']"));
		
		
		Actions act = new Actions(driver);
		act.click(e).perform();
		
		
		Robot rb = new Robot();
		rb.delay(500);

		StringSelection ss = new StringSelection("D:\\sampleFile.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V); 
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		

	}

}