package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.Basetest.BaseTest;

public class Utilities extends BaseTest{
	public static long pageload = 30;
	public static long implywait = 40;
	

	
	public static void takescreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
	File file =	screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File(".//Screenshot//"+System.currentTimeMillis()+".jpg"));
	}
}

