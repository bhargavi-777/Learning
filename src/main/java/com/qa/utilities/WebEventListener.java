package com.qa.utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import com.qa.Basetest.BaseTest;

public class WebEventListener extends BaseTest implements WebDriverListener{
	
	
	public void beforeGet(WebDriver driver, String url) {
		
		System.out.println("before get: " + url +" ");
	}
	  public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
		  
		  System.out.println("before sending keys" + element.toString() +" ");
	  }
	 

	  public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
		  try {
			Utilities.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("after sending keys" + element.toString() +" ");
		  
		  
	  }
	  public void beforeClick(WebElement element) {
		  System.out.println("before click" + element.toString());  
	  }

	  public void afterClick(WebElement element) {
		  System.out.println("after click" + element); 
	  }
	  public void afterGetTitle(WebDriver driver, String result) {
		  System.out.println("after get tile" + result +" "); 
	  }

	  public void beforeFindElement(WebDriver driver, By locator) {
		  System.out.println("before finding element" + locator.toString() +" "); 
	  }
	
	
	 public void beforeGetText(WebElement element) {
		 System.out.println("before getting text" + element.toString() +" ");
		 
	 }
	 public void beforeQuit(WebDriver driver) {
		 System.out.println("before quite");
	 }
	 
	 public void onException(Throwable error,WebDriver driver) throws IOException {
		 Utilities.takescreenshot();
		 System.out.println("Exception occured " +error);
		 
	 }

}
