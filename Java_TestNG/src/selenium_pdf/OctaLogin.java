package selenium_pdf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OctaLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\ResponsiveFramework\\viewcontent\\viewcontent\\src\\it\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor exec = ((JavascriptExecutor) driver);

		driver.get("http://oditek.in/ikomplianzWeb/client/");
		WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));

		exec.executeScript("arguments[0].value='Madhu.xyz@gmail.com';", name);

		// name.sendKeys("Madhu");

		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));
		// password.sendKeys("Welcome@123");
		exec.executeScript("arguments[0].value='XYZ';", password);

		System.out.println("Username is : " + name.getAttribute("value"));
		System.out.println("Password is : " + password.getAttribute("value"));

		// driver.findElement(By.xpath("//button[@class='btn
		// btn-block']")).click();

		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-block']"));
		Thread.sleep(5000);
		exec.executeScript("arguments[0].click();", login);

		Thread.sleep(5000);
		// driver.quit();

	}

}
