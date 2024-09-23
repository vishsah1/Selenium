package Project_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		LoginPageRepoPageFactory LPRPF = new LoginPageRepoPageFactory(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		LPRPF.enterUserName("standard_user");
		LPRPF.enterPassword("secret_sauce");
		LPRPF.clickButton();
		
		driver.quit();
	}
}
