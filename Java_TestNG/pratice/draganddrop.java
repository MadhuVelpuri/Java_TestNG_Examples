package com.pratice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class draganddrop {
		 
	 WebDriver driver;
	 
	/* @BeforeTest
	 public void start(){
	  FirefoxProfile profile = new FirefoxProfile();
	  profile.setEnableNativeEvents(true);
	  System.setProperty("webdriver.firefox.bin", "C:\\Users\\mvelpuri\\AppData\\Local\\Mozilla Firefox\\firefox.exe");  
	  //driver = new FirefoxDriver();
	  driver = new FirefoxDriver(profile);
	 }

	 @Test
	 public void start1(){
	  driver.get("http://jqueryui.com/droppable/");
	  driver.switchTo().frame(0);  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebElement dragElement=driver.findElement(By.id("draggable"));
	  WebElement dropElement=driver.findElement(By.id("droppable"));
	    
	  Actions builder = new Actions(driver);  // Configure the Action
	  Action dragAndDrop = builder.clickAndHold(dragElement)
	    .moveToElement(dropElement)
	    .release(dropElement)
	    .build();  // Get the action
	    dragAndDrop.perform(); // Execute the Action
	 }*/
	 
	 @Test
	 public void e_SearchBook() {
		 
		 WebDriver driver  = new FirefoxDriver();

		 driver.get("http://www.amazon.in/");
		    WebElement element;
		    element = driver.findElement(By.id("twotabsearchtextbox"));
		    element.clear();
		    element.sendKeys("Model-based testing");
		    try {
		    	driver.findElement(By.xpath("//*[@class='nav-search-submit nav-sprite']/input")).click();
		    	//driver.findElement(By.className("nav-input")).click();
		    } catch (NoSuchElementException e) {
		      //driver.findElement(By.xpath("//*[@class='nav-search-submit nav-sprite']/input")).click();
		    }
		  }
	 
	 /*
	 @Test
	 public void mouseover() throws InterruptedException
	 {

		  
		  WebDriver driver  = new FirefoxDriver();

		 driver.get("http://www.amazon.in/");
		 
		 Actions actions = new Actions(driver);
		 WebElement ele = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]"));
		 actions.moveToElement(ele).build().perform();
		 
		 driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
	 }*/
	}