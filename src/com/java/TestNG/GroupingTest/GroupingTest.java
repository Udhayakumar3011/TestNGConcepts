package com.java.TestNG.GroupingTest;

import org.testng.annotations.Test;

public class GroupingTest {

	@Test(priority = 0, groups = { "login" })
	public void login() {
		System.out.println("Login");
	}

	@Test(priority = 1, groups = { "reg","login" })
	public void reg() {
		System.out.println("Registration");
	}

	@Test(priority = 2, groups = { "order" })
	public void order() {
		System.out.println("Order Placed");
	}

	@Test(priority = 3, groups = { "checkout" })
	public void checkout() {
		System.out.println("Checkout");
	}

	@Test(priority = 4, groups = { "signout" })
	public void signout() {
		System.out.println("Signout");
	}
}
