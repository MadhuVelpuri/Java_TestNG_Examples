package com.javang;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 0)
	public void test_pri0() {
		System.out.println("Priority 0");
	}

	@Test
	public void sample() {
		System.out.println("withour priority");
	}

	@Test(priority = 1)
	public void Login() {
		System.out.println("This is login test");
	}

	@Test(priority = 2)
	public void bookticket() {
		System.out.println("This is bookticket method");
	}

	@Test(priority = 3)
	public void logout() {
		System.out.println("This is Lgout method");
	}
}
