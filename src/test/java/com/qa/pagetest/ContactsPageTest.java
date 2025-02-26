package com.qa.pagetest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Basetest.BaseTest;
import com.qa.pages.ContactsPage;
import com.qa.pages.ForgotPage;
import com.qa.pages.LoginPage;

public class ContactsPageTest extends BaseTest{
	
	LoginPage loginpage;
	ContactsPage contactpage;
	ForgotPage forgotpage;
	
	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		contactpage = loginpage.verfycontact();
		
	}
	
	@Test
	
	public void navigate_forgot() {
		forgotpage = contactpage.Verify_forgot();
	}
	
	@Test
	public void verify_contact() {
		String name = contactpage.verify_name();
		Assert.assertEquals(name, "Contact us");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
