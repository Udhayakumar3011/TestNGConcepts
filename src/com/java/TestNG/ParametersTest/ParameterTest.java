package com.java.TestNG.ParametersTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.java.TestNGTest.Utility;

public class ParameterTest {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();
		}
	}

	@Test
	@Parameters({ "google", "key2" })
	public void google(String str1, String str2) {
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.click();
		search.sendKeys(str1);
		System.err.println("--" + " " + str2 + "" + "----");

	}

	@AfterSuite
	public void tearDown() throws IOException {

		System.out.println("Test Execution Completed");
	}

}
