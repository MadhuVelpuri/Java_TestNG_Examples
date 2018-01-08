package com.javang;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodBeforeTest {

	@BeforeMethod
	public void fff() {
		System.out.println("Before method");
	}

	@BeforeTest
	public void bftest() {
		System.out.println("Before Test");
	}

	@Test
	public void f() {
		System.out.println("Hello-TestNG");
	}

	@Test
	public void ignore() {
		System.out.println("This is ignored method");
	}
}
