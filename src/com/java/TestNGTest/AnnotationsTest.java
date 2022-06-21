package com.java.TestNGTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {

	// Annotations
	// Before Test After
	@BeforeSuite
	public void add2() {
		System.out.println("Before Test");
	}

	@BeforeTest
	public void add1() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	public void add3() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void add10() {
		System.out.println("Before Groups");
	}

	@Test
	public void add4() {
		System.out.println("Test");
	}

	@AfterSuite
	public void add5() {
		System.out.println("After Suite");
	}

	@AfterClass
	public void add6() {
		System.out.println("After Class");
	}

	@AfterMethod
	public void add7() {
		System.out.println("After Method");
	}

	@AfterTest
	public void add8() {
		System.out.println("After Test");
	}

	

	
}
