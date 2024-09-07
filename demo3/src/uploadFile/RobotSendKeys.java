package uploadFile;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotSendKeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//send_keys*******************************************************************************
//		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("D:\\sampleFile.jpeg");
		
		//robot class*****************************************************************************
//		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		WebElement button = driver.findElement(By.xpath("//input[@name='upfile']"));
		
		Actions act = new Actions(driver);
//		act.moveToElement(button).click().perform();
		act.click(button).perform();
		
		Robot rb = new Robot();
		rb.delay(500);
		
		//copy-to-clipboard
		StringSelection ss = new StringSelection("D:\\sampleFile.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//paste
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);

	}

}
