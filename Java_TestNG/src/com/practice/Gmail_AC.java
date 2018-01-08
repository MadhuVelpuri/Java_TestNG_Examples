package com.practice;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


    

public class Gmail_AC {
	public static WebDriver driver;
	    @Test
	    public void testSelectBirthMonth() {
	    }
	    @BeforeClass
	    public static void beforeClass() throws Exception {
	        driver = new FirefoxDriver();
	        driver.get("https://accounts.google.com/SignUp");

	        driver.findElement(By.id("FirstName")).sendKeys("Selenium");
	        driver.findElement(By.id("LastName")).sendKeys("Webdriver");
	        driver.findElement(By.id("GmailAddress")).sendKeys("seleniumwebdriver57");
	        driver.findElement(By.id("Passwd")).sendKeys("testingnow");
	        driver.findElement(By.id("PasswdAgain")).sendKeys("testingnow");
	        //Click on the Arrow mark
	        driver.findElement(By.xpath("//label[@id='month-label']/span/div/div")).click();
	        //Select value from the list
	        driver.findElement(By.xpath("//label[@id='month-label']/span/div[2]/div[@id=':6']")).click();
	        driver.findElement(By.id("BirthDay")).sendKeys("16");
	        driver.findElement(By.id("BirthYear")).sendKeys("1978");
	        driver.findElement(By.xpath("//div[@id='Gender']/div/div")).sendKeys("Male");

	    }
}
