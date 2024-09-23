package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {
	
	WebDriver driver;
	
	public myAccount(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email_create")
	WebElement CreateEmailId;
	
	@FindBy(id="SubmitCreate")
	WebElement submitCreate;
	
	public void enterEmailId(String email) {
		CreateEmailId.sendKeys(email);
	}
	
	public void clickonCreateButton() {
		submitCreate.click();
	}
}
