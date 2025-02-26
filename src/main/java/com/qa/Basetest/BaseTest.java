package com.qa.Basetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.google.common.util.concurrent.Service.Listener;
import com.qa.utilities.Utilities;
import com.qa.utilities.WebEventListener;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public BaseTest() {
	 prop = new Properties();
		try {
			FileInputStream fi =new FileInputStream("C:\\Users\\Public\\Bhargavi\\New\\Pom\\src\\main\\java\\com\\qa\\configuration\\config.properties");
			try {
				prop.load(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
	}
	
	public void initialization() {
		String browsername = prop.getProperty("browser");
	if(browsername.equals("chrome")) {
			driver = new ChromeDriver();
			
		}
	else if(browsername.equals("chrome")) {
		driver = new FirefoxDriver();
	}
	WebDriverListener listener = new WebEventListener();//Create instance of Listener Class
	WebDriver e_driver = new EventFiringDecorator<>(listener).decorate(driver);
	driver=e_driver;
   
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.pageload));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.implywait));
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	}
	
}
