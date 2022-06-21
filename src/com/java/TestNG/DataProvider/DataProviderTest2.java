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

public class DataProviderTest2 {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		if ((driver == null)) {
			driver = Utility.customBrowser();

		}
	}

	@Test(dataProvider = "DataInput", dataProviderClass = TestDataInput2.class)
	public void testStart(String key, String value) throws InterruptedException {
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement tagsSearch = driver.findElement(By.id("tags"));
		tagsSearch.click();
		tagsSearch.sendKeys(key);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		int size = li.size();
		System.out.println(size);
		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement ele = (WebElement) itr.next();
			if (ele.getText().trim().equalsIgnoreCase(value)) {
				ele.click();

			}
		}

	}

	@AfterSuite
	public void tearDown() {
		System.out.println("Testing is Completed");
	}
}
