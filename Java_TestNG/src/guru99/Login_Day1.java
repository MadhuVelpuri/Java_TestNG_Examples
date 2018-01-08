package guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String uname = "mngr54395";
		String pwd = "pejAvuv";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login(driver, uname, pwd);
		Thread.sleep(3000);
		driver.quit();

	}

	private static void login(WebDriver driver, String uname, String pwd) {
		// TODO Auto-generated method stub
		driver.findElement(By.name("uid")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String welcome_text = driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
		if (welcome_text.equalsIgnoreCase("Home"))
			System.out.println("Login is successful");
		else
			System.out.println("Login is not successful");

	}

}
