package com.java.TestNGTest;

import org.testng.annotations.Test;

public class TimeOutHandlingTest {

	@Test(invocationTimeOut = 2000)
	public void Yahoo() throws InterruptedException {
		Thread.sleep(3000);
		//1000 Lines of Code--5 mins
		System.out.println("Yahoo");
		
		
	}
	
}
