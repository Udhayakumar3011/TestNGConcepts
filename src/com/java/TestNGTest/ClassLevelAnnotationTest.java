package com.java.TestNGTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class ClassLevelAnnotationTest {
	WebDriver driver;

	public void abrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();
		}
	}

	public void btest() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	public void Yahoo() {
		driver.get("https://jqueryui.com/autocomplete/");
	}

	public void google() {
		driver.get("https://www.google.com");
	}

	public void bing() {
		driver.get("https://www.bing.com/");
	}

	public void tearDown() throws IOException {

		System.out.println("Test Execution Completed");
	}
}
