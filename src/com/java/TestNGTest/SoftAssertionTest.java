package com.java.TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	@Test
	public void soft() {
		System.out.println("Execution Started");
		String expected = "Google";
		String actual = "Gogle";

		String expected1 = "Google";
		String actual1 = "Google";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected); // Status-Pass/Fail
		sa.assertEquals(actual1, expected1);
		System.out.println("Execution Two");
		// sa.assertEquals(actual, expected);
		// sa.assertEquals(actual, expected);
		System.err.println("Assert Completed");
		sa.assertAll();
	}
}
