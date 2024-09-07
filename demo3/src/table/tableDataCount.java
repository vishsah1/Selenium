package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableDataCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/basic_init/multiple_tables.html");
		
//		String data = driver.findElement(By.xpath("//table[@id='DataTables_Table_1']/thead")).getText();
//		String data1 =  driver.findElement(By.xpath("//table[@id='DataTables_Table_1']/tbody/tr")).getText();
//		data1.size();
//		System.out.print(data1);
//		System.out.println("");
//		System.out.print(data1);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']/tbody/tr"));
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']/thead/tr/th "));
		System.out.println( row.size());
		System.out.println( column.size());
		

			for(int c=1;c<=column.size();c++) {
				
				String d = driver.findElement(By.xpath("//table[@id='DataTables_Table_1']/thead/tr[1]/th["+c+"] ")).getText();
				System.out.println(d);	
			}
			for(int r=1;r<=row.size();r++) {
			String data =  driver.findElement(By.xpath("//table[@id='DataTables_Table_1']/tbody/tr["+r+"] ")).getText();
			System.out.println(data);
		}
		
//		driver.close();

	}

}
