package com.java.TestNGTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ScreenshotAfterTestExecutionTest {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();
		}
	}

	@Test(priority = -1)
	public void amazon() {
		driver.get("https://www.amazon.in");
	}

	@Test(priority = 0)
	public void Yahoo() {
	
		driver.get("https://jqueryui.com/autocomplete/");
		
	}

	@Test(priority = 1)
	public void google() {
		
		driver.get("https://www.google.com");
	}

	@Test(priority = 2)
	public void bing() {
		
		driver.get("https://www.bing.com/");
		
	}

	@AfterSuite
	public void tearDown() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(src, new File("D:\\bingpassed.png"));
		System.out.println("Test Execution Completed");
	}
}
