package com.java.TestNG.FailedCaseScreenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.java.TestNGTest.Utility;
import com.java.listenersTest.MyOwnListernersTest;

@Listeners(MyOwnListernersTest.class)
public class FailedCaseScreenshot {

	public static WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();

		}
	}

	@Test(priority = 0)
	public void google() {
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.click();
		search.sendKeys("Today News" + Keys.ENTER);

	}

	@Test(priority = 1)
	public void bing() {

		driver.get("https://www.bing.com");

		WebElement search = driver.findElement(By.xpath("q"));
		search.click();
		search.sendKeys("Today News" + Keys.ENTER);

	}

	@AfterSuite
	public void tearDown() throws IOException {
		System.out.println("____________");

	}
}
