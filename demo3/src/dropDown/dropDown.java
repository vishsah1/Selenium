package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement counrtyList = driver.findElement(By.tagName("select"));
		
		Select dropdown = new Select(counrtyList);
		
		dropdown.selectByVisibleText("Cuba");
//		dropdown.selectByIndex(5);
//		dropdown.selectByValue("BLR");
//		System.out.println(counrtyList.);
		
		if(dropdown.isMultiple()) {
			System.out.println("is multiple");
		}else {
			System.out.println("Not multiple");
		}
		
		List<WebElement> allList = dropdown.getOptions();
		
		for(WebElement el:allList) {
			System.out.println(el.getText());
		}
	}
}
