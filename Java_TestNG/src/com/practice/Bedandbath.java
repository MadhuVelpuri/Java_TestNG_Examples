package com.practice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Bedandbath {
	
	WebDriver driver=null;
	@Test
	
	public void test()
	{
	
		driver = new FirefoxDriver();
		driver.get("http://www.bedbathandbeyond.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id='button']/button")).click();
	    String title=driver.getTitle().toString();
	    System.out.println("Title is: "+title);
		   Actions actions = new Actions(driver);
		   
				 WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'SHOP PRODUCTS')]"));
				 actions.moveToElement(ele).build().perform();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.findElement(By.xpath("//*[@id='collegeBridalArea']/div[1]/div/ul/li[4]/a[contains(text(),'Bath')]")).click();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.findElement(By.id("popularCategory")).click();
					driver.findElement(By.xpath("//*[@id='popularCategory']/div/div[1]/ul[1]/li[2]/a")).click();
					driver.findElement(By.xpath("//*[@id='row1']/li[2]/div[2]/a/img")).click();
					
					WebElement ele1= driver.findElement(By.xpath("//*[@id='collectionForm']/ul/li[1]/fieldset/div[4]/div[3]/div/div/div/a"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele1);
					driver.findElement(By.xpath("//*[@id='collectionForm']/ul/li[2]/fieldset/div[3]/div[3]/div/div/div/a")).click();
					  driver.findElement(By.xpath("//*[@id='collectionForm']/ul/li[2]/fieldset/div[3]/div[3]/div/div/div/ul/li[2]/span/span")).click();
					  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					  
					 /* 
					  if(driver.findElement(By.xpath("//*[@id='themeWrapper']/div[8]/div[3]/div/button")).isEnabled())
					  {
						  driver.findElement(By.xpath("//*[@id='themeWrapper']/div[8]/div[3]/div/button")).click();
						  driver.findElement(By.xpath("//form[@id='collectionForm']/ul/li[1]//input[@type='submit']")).click();  
					  }
					  
					  else*/
						  driver.findElement(By.xpath("//form[@id='collectionForm']/ul/li[1]//input[@type='submit']")).click();

	}
	
	
}
