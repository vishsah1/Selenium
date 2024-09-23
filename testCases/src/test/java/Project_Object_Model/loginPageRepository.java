package Project_Object_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPageRepository {
	
	WebDriver driver;
	
	loginPageRepository(WebDriver d )
	{
		driver = d;
	}
	
	By username = By.xpath("//input[@id='user-name'])");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	
	
	public void enterUserName(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginBtn).click();;
	}

}
