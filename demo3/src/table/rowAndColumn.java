package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Vish Sah\\Downloads\\table.html");
		
		String data1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(data1);
		
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/th"));
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr/td"));
//		System.out.println(row.size());
		
		for(int r = 2; r<= row.size();r++) {
			
			for(int c=1;c<= column.size();c++) {
			
				String data = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data);
			}
		}
	}
}
