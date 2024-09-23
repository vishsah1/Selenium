package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new HtmlUnitDriver();
		driver.get("https://www.hyrtutorials.com/search/label/Tutorials");
		System.out.println(driver.getTitle());
	}

}
