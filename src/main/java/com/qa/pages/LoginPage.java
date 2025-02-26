package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Basetest.BaseTest;

public class LoginPage extends BaseTest {
	

	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div/input")
	WebElement loginbutton;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")
	WebElement crmlogo;
	
	@FindBy(xpath="//a[text()='Contact']")
	WebElement Contact;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String VerifyTitle() {
		return driver.getTitle();
		
	}
	
	public boolean Verifylogo() {
	return	crmlogo.isDisplayed();
	}
	
	public HomePage verifylogin(String us, String pwd) {
		username.sendKeys(us);
		password.sendKeys(pwd);
		loginbutton.click();
		return new HomePage();
	}
	
public ContactsPage verfycontact() {
	Contact.click();
	return new ContactsPage();
			
}
}
