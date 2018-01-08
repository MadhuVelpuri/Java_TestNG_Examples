package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriver_AutoIt {
	
	
	 WebDriver driver;
	 
	 @Before
	 public void setup() throws Exception {
	  driver =new FirefoxDriver();
	  //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
	     
		//driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
	 }
	 
	 
	 @Test
	 public void testCaseOne_Test_One() throws IOException, InterruptedException {
	  //Click on Download Text File link to download file.
	  driver.findElement(By.xpath("//a[contains(.,'Download Text File')]")).click();
	  //Execute Script To Download File.exe file to run AutoIt script. File location = E:\\AutoIT\\
	  Process res= Runtime.getRuntime().exec("D:\\Madhu\\Autoit_Trng\\Download.exe");
	 
	  
	  BufferedReader input = new BufferedReader(new InputStreamReader(res.getInputStream()));

	  String line;
	  while ((line = input.readLine()) != null) {
	 
		  if(line.equalsIgnoreCase("Opening Testing Text.txt"))
		  {
			  System.out.println("PASS");
			  break;
		  }  
		  else
		  {
			  System.out.println("FAIL");
			  break;
		  }
		  
	  }
	 
	
	 }
	 
	}