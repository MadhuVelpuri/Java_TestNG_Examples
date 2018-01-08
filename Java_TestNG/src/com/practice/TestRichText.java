package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestRichText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new FirefoxDriver(); 
                 //driver.get("https://stage.citation-atlas.co.uk/#/site");
                // driver.get("https://stage.citation-atlas.co.uk/#/employee");
                 //driver.get("https://stage.citation-atlas.co.uk/#/users");
                 //driver.get("https://stage.citation-atlas.co.uk/#/site");
                 driver.get("https://stage.citation-atlas.co.uk/#/block/add");
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 Select sel=null;
		try{
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("Admin@citation.co.uk");
			driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Atlas@2015");
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			Thread.sleep(8000);
			driver.findElement(By.id("title")).sendKeys("Sample12dff");
			
			WebElement ele_Area=driver.findElement(By.id("area"));
		   	sel= new Select(ele_Area);
			sel.selectByVisibleText("Health & Safety");
			
			WebElement ele_Cat=driver.findElement(By.id("category"));
			sel = new Select(ele_Cat);
			sel.selectByVisibleText("Policy");
			
			WebElement ele_type=driver.findElement(By.id("type"));
			sel = new Select(ele_type);
			sel.selectByVisibleText("Rich Text");
			
			
		    driver.findElement(By.xpath("//a[@class='btns-default btn-blue pull-left']")).click();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[@id='cke_2_toolbox']//span[@class='cke_toolgroup']/a")).click(); // Bold Style
			driver.switchTo().frame((driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, editor1']"))));
			
			//System.out.println("Switched into Frame");
			// WebElement body= driver.findElement(By.xpath("//body[@class='HSHandbook cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']/p"));
			 WebElement body= driver.findElement(By.xpath("//body/p"));
		      Actions builder = new Actions(driver);
		      Actions seriesOfActions = builder.moveToElement(body).sendKeys(body,"Hi...Please Die Before I Kill You.");
		      seriesOfActions.perform();
		      System.out.println("Text Entered");
		      driver.switchTo().defaultContent();
		      
		    //  driver.findElement(By.xpath("//body/p")).sendKeys("Hi....");
		      driver.switchTo().frame((driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, editor1']"))));
		      driver.findElement(By.xpath("//body/p")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		      
		      System.out.println("Text Selected");
		      driver.switchTo().defaultContent();
		      
		      /*
		      driver.findElement(By.xpath("//span[@id='cke_2_toolbox']//span[@class='cke_toolgroup']/a")).click();// Bold Style
		      driver.findElement(By.xpath("//span[@id='cke_2_toolbox']//span[@class='cke_toolgroup']/a")).click();// Bold Style
			System.out.println("Style Applied");*/
			
			  driver.findElement(By.xpath("//span[@id='cke_2_toolbox']//span[@class='cke_toolgroup']/a")).click();// Bold Style
			driver.findElement(By.xpath("//span[@id='cke_2_toolbox']//span[@class='cke_toolgroup']/a[2]")).click();// Italic Style
			System.out.println("Italic Style Applied");
			

			  //driver.findElement(By.xpath("//span[@id='cke_2_toolbox']//span[@class='cke_toolgroup']/a")).click();// Bold Style
				driver.findElement(By.xpath("//span[@id='cke_2_toolbox']//span[@class='cke_toolgroup']/a[3]")).click();// Italic Style
				System.out.println("Under line Style Applied");
				
			
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
