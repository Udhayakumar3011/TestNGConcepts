package com.java.TestNGTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FailedTestCaseTest {
	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();
		}
	}

	@Test(priority = -1)
	public void amazon() {
		System.out.println("Amazon");
	}

	@Test(priority = 0)
	public void Yahoo() {
		System.out.println("Yahoo");
	}

	@Test(priority = 1)
	public void google() {
		int a = 1 / 0;
		System.out.println("Google" + " " + a);
	}

	@Test(priority = 2, dependsOnMethods = "google")
	public void bing() {
		System.out.println("Bing");
	}

	@AfterSuite
	public void tearDown() throws IOException {

	}
}
