package com.javang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyloc {
	public static void main(String a[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		String loc = "//input[@id='lst-ib']";
		By locator = verify(driver, loc);

		System.out.println("Locator is : " + locator);
	}

	public static By verify(WebDriver driver, String locator) {

		try {
			driver.findElement(By.xpath(locator));
			return By.xpath(locator);
		} catch (Throwable e) {
		}
		return null;
	}
}