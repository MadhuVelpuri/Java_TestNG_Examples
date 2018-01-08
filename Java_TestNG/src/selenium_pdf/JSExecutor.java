package selenium_pdf;

import java.awt.AWTException;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class JSExecutor {

	public static void main(String a[]) throws AWTException, InterruptedException {
		WebDriver driver;
		FirefoxProfile fp = new FirefoxProfile();
		fp.setEnableNativeEvents(true);
		File pathToBinary = new File("D:\\Madhu\\ff47\\firefox.exe");

		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		driver = new FirefoxDriver(ffBinary, fp);
		driver.get("https://www.google.co.in");

		/*
		 * // Way1 JavascriptExecutor executor = ((JavascriptExecutor) driver);
		 * executor.executeScript(
		 * "document.getElementByName('q').value='What is the date';",
		 * searchbox);
		 */
		// Way2

		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
		myExecutor.executeScript("arguments[0].value='What is';", searchbox);

		// searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> listItems = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		listItems.get(0).click();
		// driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
		/*
		 * Robot rb = new Robot(); rb.keyPress(KeyEvent.VK_ENTER);
		 * rb.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(2000);
		 */

		/*
		 * Actions builder = new Actions(driver); Action enter =
		 * builder.keyPress(searchbox, Keys.ENTER).keyUp(searchbox,
		 * Keys.ENTER).build(); // Performing the enter action enter.perform();
		 */Thread.sleep(2000);
		driver.quit();
	}
}
