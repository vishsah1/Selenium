package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		//ALERT
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
//		//CONFIRM
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		driver.switchTo().alert().accept();
		
		
		//PROMPT
//		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
//		driver.switchTo().alert().sendKeys("vish");
//		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		driver.switchTo().alert().sendKeys("vish");
		driver.switchTo().alert().accept();		
		
		
		

	}

}
