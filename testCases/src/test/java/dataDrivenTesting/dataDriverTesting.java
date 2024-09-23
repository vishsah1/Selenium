package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataDriverTesting {

	public static void main(String[] args) throws IOException, Exception {

		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;

		File file = new File("D:\\Selenium\\SwagLabCredentials.xlsx");

		FileInputStream fis = new FileInputStream(file);

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheetAt(0);

		int ttRow = sheet.getLastRowNum()+1;

		int ttCell = sheet.getRow(0).getLastCellNum();

		for(int currentRow=0; currentRow < ttRow; currentRow++)
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");

			driver.findElement(By.id("user-name")).sendKeys(sheet.getRow(currentRow).getCell(0).toString());
			driver.findElement(By.id("password")).sendKeys(sheet.getRow(currentRow).getCell(1).toString());
			driver.findElement(By.id("login-button")).click();
			//			for(int currentCell=0; currentCell<ttCell; currentCell++)
			//			{
			//				System.out.print(sheet.getRow(currentRow).getCell(currentCell));
			//				System.out.print("/t");
			//			}
			
			Thread.sleep(3000);

//			driver.close();
			try {
				WebElement el = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
				if(el.isDisplayed())
				{
					System.out.println("Logged In Sucessfully");
				}
				else
				{
					System.out.println("Logged In Failed: username- " +sheet.getRow(currentRow).getCell(0));
					System.out.println("Logged In Failed: Password- " +sheet.getRow(currentRow).getCell(1));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			driver.close();
			Thread.sleep(2000);

		}
	}
	
}
