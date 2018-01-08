package Webdriver_TestNG;

import org.testng.annotations.Test;

public class ClassTwo extends BaseClassOne {
	@Test
	public void testmethodone() throws InterruptedException {
		driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		String title = driver.getTitle();
		System.out.print("\nCurrent page title is : " + title);
		String Workdir = System.getProperty("user.dir");
		String Classpackname = this.getClass().getName();
		System.out
				.print("\n'" + Workdir + " -> " + Classpackname + " -> testmethodone' has been executed successfully");
		Thread.sleep(5000);
	}
}
