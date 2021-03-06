package com.java.listenersTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.java.TestNG.FailedCaseScreenshot.FailedCaseScreenshot;

public class MyOwnListernersTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("onTestStart");

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		File src = ((TakesScreenshot) FailedCaseScreenshot.driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(src, new File(                                            //bing.png
					"C:\\Users\\LENOVO\\EclipseWorkSpace\\TestNGTest\\screenshot\\" + result.getName() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("onFinish");
	}

}
