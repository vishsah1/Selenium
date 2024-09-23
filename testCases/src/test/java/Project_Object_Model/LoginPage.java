package Project_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		
		loginPageRepository LGP = new loginPageRepository(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		LGP.enterUserName("standard_user");
		LGP.enterPassword("secret_sauce");
		LGP.clickLoginButton();
		
		driver.quit();


	}

}
