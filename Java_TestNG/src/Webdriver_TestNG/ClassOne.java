package Webdriver_TestNG;

import org.testng.annotations.Test;

public class ClassOne extends BaseClassOne {

	// @Test annotation describes this method as a test method
	@Test
	public void testmethodone() throws InterruptedException {
		String title = driver.getTitle();
		System.out.print("\nCurrent page title is : " + title);
		String Workdir = System.getProperty("user.dir");
		String Classpackname = this.getClass().getName();
		System.out
				.print("\n'" + Workdir + " -> " + Classpackname + " -> testmethodone' has been executed successfully");
		Thread.sleep(5000);
	}

	@Test
	public void testmethodtwo() throws InterruptedException {
		System.out.println("In test method two");
		String title = driver.getTitle();
		System.out.print("\nCurrent page title is : " + title);
		String Workdir = System.getProperty("user.dir");
		String Classpackname = this.getClass().getName();
		System.out
				.print("\n'" + Workdir + " -> " + Classpackname + " -> testmethodone' has been executed successfully");
		Thread.sleep(5000);
	}
}