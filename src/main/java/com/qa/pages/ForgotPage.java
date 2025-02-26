package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Basetest.BaseTest;

public class ForgotPage extends BaseTest{
	
	@FindBy(name="ussername")
	WebElement  username;
	
	public ForgotPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void entertest(String un) {
		username.sendKeys(un);
	}

}
