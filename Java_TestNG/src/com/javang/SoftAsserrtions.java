package com.javang;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserrtions {

	SoftAssert sft = new SoftAssert();

	@BeforeTest
	public void bfrtest() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void bfrmthd() {
		System.out.println("Before method...");
	}

	@Test
	public void sample11() {

		Assert.assertEquals(2, 2);
		System.out.println("Executing Norrmal/Hard Assertions...");
	}

	@Test
	public void sample12()

	{
		System.out.println("Executing Soft Assertions...");
		sft.assertEquals(2, 3);
		Assert.assertEquals(2, 2);
		System.out.println("Executing Norrmal/Hard Assertions...");

	}

	@Test
	public void sample13()

	{
		System.out.println("Executing after Soft Assertions...");
		Assert.assertEquals(2, 2);
	}

}
