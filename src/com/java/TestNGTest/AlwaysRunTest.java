package com.java.TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunTest {

	@Test
	public void test1() {
		System.out.println("Test1");
		Assert.fail();
	}

	@Test(dependsOnMethods = "test1",alwaysRun = true)
	public void test2() {
		System.out.println("Test2");
	}

	@Test
	public void test3() {
		System.out.println("Test3");
	}
}
