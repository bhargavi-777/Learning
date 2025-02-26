package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Basetest.BaseTest;

public class ContactsPage extends BaseTest{
	
	@FindBy(xpath="//h1[text()='Contact us']")
	WebElement contacttext;
	//a[contains(.,'Forgot Password?')].will test whether the second text node of a contains "Forgot password"—and this expression will return the a element
	@FindBy(xpath="//p[@class='text-right']//a")
	WebElement Forgotpassword;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
public String verify_name() {
	return contacttext.getText();

}
	
public ForgotPage Verify_forgot() {
	Forgotpassword.click();
	return new ForgotPage();
}

}
