package com.mystore.testcase;

import org.testng.annotations.Test;

import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;

public class myAccountPageTest extends baseClass {
	
	@Test
	public void verifyRegistration()
	{
		driver.get(url);
		
		indexPage pg = new indexPage(driver);
		pg.clickonSignIn();
		
		myAccount ma = new myAccount(driver);
		ma.enterEmailId("test@yopmail.com");
		ma.clickonCreateButton();
	}

}
