package com.pratice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement_Pagination {

	public static void main(String[] args) {
		int k=0;
		
        WebDriver driver=new FirefoxDriver(); 
                 //driver.get("https://stage.citation-atlas.co.uk/#/site");
                // driver.get("https://stage.citation-atlas.co.uk/#/employee");
                 //driver.get("https://stage.citation-atlas.co.uk/#/users");
                 //driver.get("https://stage.citation-atlas.co.uk/#/site");
                 driver.get("https://stage.citation-atlas.co.uk/#/block/add");
		try{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("Admin@citation.co.uk");
			driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Atlas@2015");
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			Thread.sleep(8000);
			  
			  List<WebElement> pages =  driver.findElements(By.xpath("//ul[@class='ngPagerControl pagination']/li[contains(@class,'ng-scope')]/a"));
			int pagecount=pages.size();//1
		
			System.out.println("Page count:::::::::"+pagecount);
			
				String BTNEnabled =driver.findElement(By.xpath("//a[@ng-disabled='cantPageForward()']")).getAttribute("disabled");
				System.out.println();
				//boolean BTNEnabled =driver.findElement(By.xpath("//a[@disabled='disabled']"));
				boolean resultmatched = false;
				System.out.println(BTNEnabled);
				while(BTNEnabled==null)
					
				{
		
				
				if(resultmatched)
						{
					       break;
						}
			
				
				driver.findElement(By.xpath("//a[@ng-disabled='cantPageForward()']")).click();
				
				
					try {
						Thread.sleep(4000);
						System.out.println("HI");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				Thread.sleep(3000);
					
				List<WebElement> rows =  driver.findElements(By.xpath("//div[@class='ngCanvas']/div[contains(@class,'ng-scope ngRow')]"));
				int rowsize=rows.size();
				System.out.println("Rowsize::::::"+rowsize);
				//String Val="searoij@foj.com";
				String Val="trest";
				
				for(int i=1;i<=rowsize;i++)
				{
					
					String sitem1= driver.findElement(By.xpath("//div[contains(@class,'ng-scope ngRow')][" + i + "]")).getText();
					
					//System.out.println("LIst Items:   "+sitem1);
					
					
					if(sitem1.contains(Val))
						
					{
						System.out.println(":::String Found:::");
						driver.findElement(By.xpath("//div[contains(@class,'ng-scope ngRow')][" + i + "]")).click();
						Thread.sleep(5000);
						resultmatched = true;
						k++;
						break;
					}
					
				}
				
				
				}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
			}
		




