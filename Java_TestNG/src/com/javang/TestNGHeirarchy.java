package com.javang;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGHeirarchy {

	@BeforeSuite
	public void test_bfSuite() {
		System.out.println("Before Suite method");
	}

	@BeforeTest
	public void test_bfTest() {
		System.out.println("Before Test method");
	}

	@BeforeClass
	public void test_bfClass() {
		System.out.println("Before Class method");
	}

	@BeforeMethod
	public void test_bfMethod() {
		System.out.println("Before Method method");
	}

	@Test
	public void test_testMethod() {
		System.out.println("Test method");
	}

	@Test
	public void test_testMethod2() {
		System.out.println("Test method2");
	}

	@AfterMethod
	public void test_afMethod() {
		System.out.println("After Method method");
	}

	@AfterClass
	public void test_afClass() {
		System.out.println("After class method");
	}

	@AfterTest
	public void test_afTest() {
		System.out.println("After Test method");
	}

	@AfterSuite
	public void test_afSuite() {
		System.out.println("After Suite method");
	}

}
