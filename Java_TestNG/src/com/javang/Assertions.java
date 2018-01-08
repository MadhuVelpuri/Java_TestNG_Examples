package com.javang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions extends Webdriver_TestNG.BaseClassOne {
	String Actualtext;
	WebElement chk1, chk2, txt1, txt2;

	@BeforeClass
	public void load_url() {
		// for assertequal and assretnotequal:
		driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}

	// Method Example For AssertEquals
	@Test
	public void assertequal() {
		Actualtext = driver.findElement(By.xpath("//h2/span")).getText();
		Assert.assertEquals(Actualtext, "Tuesday, 28 January 2014", "");
		System.out.print("\n assertequal() -> Part executed");
		/*
		 * WebDriverWait wait= new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.visibilityOf(h1));
		 */
	}

	// Method Example For AssertNotEquals
	@Test
	public void assertnotequal() {
		Actualtext = driver.findElement(By.xpath("//h2/span")).getText();
		Assert.assertNotEquals(Actualtext, "Tuesday, 28 January 201",
				"Expected and actual match in assertion_method_1");
		System.out.print("\n assertnotequal() -> Part executed");
	}

	@Test
	public void asserttrue() {
		System.out.print("\n" + chk1.isSelected());
		Assert.assertTrue(chk1.isSelected());
		System.out.print("\n asserttrue1 - > Executed - means assertion is pass");
	}

	@Test
	public void assertfalse() {
		System.out.print("\n" + chk1.isSelected());
		Assert.assertFalse(chk1.isSelected());
	}

	@Test
	public void assertnull() {
		System.out.print("\n" + txt1.getAttribute("disabled"));
		Assert.assertNull(txt1.getAttribute("disabled"));
	}

	@Test
	public void assertnotnull() {
		System.out.print("\n" + txt1.getAttribute("disabled"));
		Assert.assertNotNull(txt1.getAttribute("disabled"));
	}

}
