package Webdriver_TestNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClassOne {
    //Declared as public static to use same webdriver instance publicly
    public static WebDriver driver=null;

    //@BeforeSuite annotation describes this method has to run before all suites
    @BeforeSuite 
    public void setup() throws Exception { 

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html"); 
    } 
    //@AfterSuite annotation describes this method has to run after execution of all suites
    @AfterSuite
         public void tearDown() throws Exception { 
         driver.quit(); 
    } 
}