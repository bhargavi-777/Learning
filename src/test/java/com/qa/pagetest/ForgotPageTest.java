package com.qa.pagetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Basetest.BaseTest;
import com.qa.pages.ContactsPage;
import com.qa.pages.ForgotPage;
import com.qa.pages.LoginPage;

public class ForgotPageTest extends BaseTest {
	
	LoginPage loginpage;
	ContactsPage contactpage;
	ForgotPage forgotpage;

	public ForgotPageTest() {
		super();

	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage = new LoginPage();
		contactpage = loginpage.verfycontact();
		forgotpage = contactpage.Verify_forgot();
		
		
	}

	
	@Test
	public void Enter_text() {
		forgotpage.entertest(prop.getProperty("username"));
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
