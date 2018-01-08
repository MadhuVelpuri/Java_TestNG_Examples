package guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Src_Update {

	public static void main(String a[]) {

		WebDriver driver;

		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir") + "\\chromedriver.exe");

		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("best places to practice 2015");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String href = driver.findElement(By.xpath("//*[@id='rso']/div/div/div[1]/div/h3/a")).getAttribute("href");
		System.out.println("Href value is : " + href);

		((JavascriptExecutor) driver)
				.executeScript("document.getElementsByTagName('header')[0].style='position: absolute;'");

	}

}
