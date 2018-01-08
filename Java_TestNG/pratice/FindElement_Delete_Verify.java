package com.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElement_Delete_Verify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver(); 
				    //driver.get("https://stage.citation-atlas.co.uk/#/users");
				    driver.get("https://stage.citation-atlas.co.uk/#/employee");
		            //driver.get("https://stage.citation-atlas.co.uk/#/site");
			try{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("Admin@citation.co.uk");
				driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Atlas@2015");
				driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
				Thread.sleep(8000);
				
				String value="Martha";                      // Pass the Input here
				//driver.findElement(By.id("userSearch")).sendKeys("pavan");
				driver.findElement(By.id("employee-name")).sendKeys(value);
				
			/*	
                WebElement email= driver.findElement(By.id("userSearch"));
           Actions builder = new Actions(driver);
           Actions seriesOfActions = builder.moveToElement(email).click().sendKeys(email, value);
           seriesOfActions.perform();
*/
				
				
				List<WebElement> rows =  driver.findElements(By.xpath("//div[@class='ngCanvas']/div[contains(@class,'ng-scope ngRow')]"));
				System.out.println("Hi");
				int rowsize=rows.size();
				System.out.println("Rowsize::::::"+rowsize);
				//String Val="searoij@foj.com";
				
				
				
				if(rowsize==0)
				{
					System.out.println("pavan is removed from the list");
					System.out.println("PASS");
					// resultsetflag
				}
				else
				{
				/*	System.out.println(" pavan is not removed from the list.");
                    System.out.println("FAIL");					
				*/	// resultsetflag
								
				for(int i=1;i<=rowsize;i++)
				{
				
			
					
					String sitem1= driver.findElement(By.xpath("//div[contains(@class,'ng-scope ngRow')][" + i + "]")).getText();
					
					System.out.println("LIst Items:   "+sitem1);
					
					
					if(sitem1.contains(value))
						
					{
						System.out.println(":::String Found:::");
						//driver.findElement(By.xpath("//div[contains(@class,'ng-scope ngRow')][" + i + "]")).click();
						Thread.sleep(5000);
						System.out.println("Fail");
						
					//	resultDetails.setFlag(false);
						
						
						break;
					}
					
					else
					{
						System.out.println("Pass");
					}
					
				//	driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-trash']")).click();
					
				}
				
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				}

	}

}
