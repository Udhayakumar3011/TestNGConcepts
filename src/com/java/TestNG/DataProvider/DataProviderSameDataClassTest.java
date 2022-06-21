package com.java.TestNG.DataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.java.TestNGTest.Utility;

public class DataProviderSameDataClassTest {
	WebDriver driver;

	@DataProvider(name = "Data")
	public Object[][] getData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "udhay";
		data[0][1] = "123@";

		data[1][0] = "Udhay";
		data[1][1] = "u&d@90";

		data[2][0] = "Udhay";
		data[2][1] = "u&d@904830";

		return data;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();
			driver.get("http://djangovinoth.pythonanywhere.com/login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
	}

	@Test(priority = 1, dataProvider = "Data")
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
