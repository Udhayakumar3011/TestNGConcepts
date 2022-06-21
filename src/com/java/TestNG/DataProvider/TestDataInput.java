package com.java.TestNG.DataProvider;

import org.testng.annotations.DataProvider;

public class TestDataInput {

	@DataProvider(name = "DataInput")
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

}
