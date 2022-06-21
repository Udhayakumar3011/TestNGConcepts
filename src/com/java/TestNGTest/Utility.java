package com.java.TestNGTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	static WebDriver driver;

	public static WebDriver LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public static WebDriver customBrowser( ) throws IOException {
		driver = null;
		String browser = getPropertyData("browser");
		// String pname = get_Property("product name");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;

	}

	public static String getPropertyData(String key) throws IOException {
//C:\Users\LENOVO\EclipseWorkSpace\SeleniumBasics\testData.Properties
		String value;
		FileReader fr = new FileReader("C:\\Users\\LENOVO\\EclipseWorkSpace\\SeleniumBasics\\testData.Properties");

		Properties p = new Properties();
		p.load(fr);
		value = p.getProperty(key);

		return value;

	}

	public static WebDriver VcentryApp() throws InterruptedException, IOException {

		driver.get("http://djangovinoth.pythonanywhere.com/login/");
		// Skill Enhancement

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.clear();
		username.sendKeys(getPropertyData("Username"));

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("u&d@904830");

		WebElement loginButton1 = driver.findElement(By.xpath("//button[@class='btn btn-outline-info']"));

		loginButton1.submit();
		driver.findElement(By.linkText("Skill Enhancement")).click();
		driver.findElement(By.linkText("Lab Practice")).click();
		// Element Set1

		// driver.findElement(By.linkText("Element Set1")).click();
		// driver.findElement(By.id("element10")).click();
		return driver;

	}

}
