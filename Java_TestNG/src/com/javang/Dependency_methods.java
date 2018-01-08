package com.javang;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_methods {
	@Test(priority = 1)
	public void login() {
		System.out.println("This independent method");
		Assert.assertTrue(5 > 6, "Condition is false");

	}

	@Test(priority = 2, dependsOnMethods = { "login" })
	public void AccessPage() {
		System.out.println("This is dependent method on ");
	}

	@Test(priority = 3, dependsOnMethods = { "login", "AccessPage" })
	public void Logout() {
		System.out.println("This is dependent method on ");
	}

}