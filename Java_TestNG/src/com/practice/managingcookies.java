package com.practice;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class managingcookies {
	private static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
	     
		driver = new ChromeDriver();
		  driver.get("https://gmail.com");
		  Set<Cookie> cookee= driver.manage().getCookies();
		  Iterator<Cookie> it = cookee.iterator() ;
		  while(it.hasNext())
		  {
		   Cookie c= it.next();
		   System.out.println(c.getDomain() + c.getName() );
		  
		  }
		 
		  driver.manage().deleteAllCookies() ;
		 
		 }
}
