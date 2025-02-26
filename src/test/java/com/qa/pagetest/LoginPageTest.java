package com.qa.pagetest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.qa.Basetest.BaseTest;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactpage;
	public LoginPageTest() {
		super();
	}

	
	@BeforeMethod
	public void setup(){
		
		initialization();
		loginpage = new LoginPage();

	}
	
	@Test()
	public void verify_title() {
		
	String	title = loginpage.VerifyTitle();
      Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, and support.");
	}
	@Test
	public void Verify_logo() {
		boolean tag =loginpage.Verifylogo();
		Assert.assertTrue(tag);
	}
	
	@Test
	public void Verify_login() {
	homepage = loginpage.verifylogin(prop.getProperty("username"),prop.getProperty("password"));	
	}
	
	@Test
	public void NavigateContact() {
	contactpage =	loginpage.verfycontact();
		
	}
	
	
@AfterMethod
public void teardown() {
	driver.quit();
}
}
