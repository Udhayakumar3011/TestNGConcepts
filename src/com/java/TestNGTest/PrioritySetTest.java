package com.java.TestNGTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class PrioritySetTest {
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

		System.out.println("Test Execution Completed");
	}

}
