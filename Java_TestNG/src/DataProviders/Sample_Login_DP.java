package DataProviders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample_Login_DP {

	WebDriver driver = null;

	@BeforeTest
	public void setup() throws Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		// driver = new FirefoxDriver();

		System.setProperty("webdriver.ie.driver", "D:\\Madhu\\WebMD\\Projects\\Java_TestNG\\IEDriverServer.exe");
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		driver = new InternetExplorerDriver(capabilities);

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir") + "\\chromedriver.exe"); driver = new
		 * ChromeDriver();
		 */driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

	// This method will return two dimensional array.
	// This method behaves as data provider for LogIn_Test method.
	@DataProvider
	public Object[][] LoginCredentials() {
		// Created two dimensional array with 4 rows and 2 columns.
		// 4 rows represents test has to run 4 times.
		// 2 columns represents 2 data parameters.
		Object[][] Cred = new Object[4][2];

		Cred[0][0] = "UserId1";
		Cred[0][1] = "Pass1";

		Cred[1][0] = "UserId2";
		Cred[1][1] = "Pass2";

		Cred[2][0] = "UserId3";
		Cred[2][1] = "Pass3";

		Cred[3][0] = "UserId4";
		Cred[3][1] = "Pass4";
		return Cred; // Returned Cred
	}

	// Give data provider method name as data provider.
	// Passed 2 string parameters as LoginCredentials() returns 2 parameters In
	// object.
	@Test(dataProvider = "LoginCredentials")
	public void LogIn_Test(String Userid, String Pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='userid']")).clear();
		driver.findElement(By.xpath("//input[@name='pswrd']")).clear();
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys(Userid);
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys(Pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		String alrt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alrt);
	}
}
