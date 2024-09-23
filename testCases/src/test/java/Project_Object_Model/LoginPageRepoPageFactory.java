package Project_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageRepoPageFactory {
	
	WebDriver driver;
	LoginPageRepoPageFactory(WebDriver d)
	{
		driver = d;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='user-name']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public void enterUserName(String uname) {
		
		username.sendKeys("standard_user");
	}
	
	public void enterPassword(String pwd) {
		
		password.sendKeys("secret_sauce");
	}
	
	public void clickButton() {
		loginBtn.click();
	}
	
}
