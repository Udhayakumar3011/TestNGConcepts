package com.java.TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest {
	@Test
	public void hard() {
		System.out.println("Execution Started");
		String expected = "Google";
		String actual = "Gogle";

		Assert.assertEquals(actual, expected);
	//	Assert.assertEquals(button.get, "button");
		System.err.println("Assert Completed");
		
	}
}
