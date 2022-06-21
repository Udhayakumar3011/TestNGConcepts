package com.java.TestNG.DataProvider;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.java.TestNGTest.Utility;

public class DataProviderTest {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();
			driver.get("http://djangovinoth.pythonanywhere.com/login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
	}

	@Test(priority = 1, dataProvider =  "DataInput", dataProviderClass = TestDataInput.class)
	public void testStart(String key, String value) throws InterruptedException {

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.clear();
		username.sendKeys(key);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(value);

		WebElement loginButton1 = driver.findElement(By.xpath("//button[@class='btn btn-outline-info']"));

		loginButton1.submit();

	}


	

	@AfterSuite
	public void tearDown() {
		System.out.println("Testing is Completed");
	}
}
