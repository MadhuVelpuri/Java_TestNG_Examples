			package com.pratice;
			
			import java.util.List;
			
			import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
			
			public class FindElement_Search {
			
				/**
				 * @param args
				 */
				public static void main(String[] args) {

					
					     WebDriver driver=new FirefoxDriver(); 
					    driver.get("https://stage.citation-atlas.co.uk/#/users");
			            //driver.get("https://stage.citation-atlas.co.uk/#/site");
						String value="pavan";
				try{
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("Admin@citation.co.uk");
					driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Atlas@2015");
					driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
					Thread.sleep(8000);
					
				
					//String Val="adelehopper@citation.co.uk";   //Pass the Input here
//					driver.findElement(By.id("userSearch")).sendKeys(Val);
					
	                WebElement email= driver.findElement(By.id("userSearch"));
	           Actions builder = new Actions(driver);
	           Actions seriesOfActions = builder.moveToElement(email).click().sendKeys(email, value);
	           seriesOfActions.perform();

					
					
					List<WebElement> rows =  driver.findElements(By.xpath("//div[@class='ngCanvas']/div[contains(@class,'ng-scope ngRow')]"));
					int rowsize=rows.size();
					System.out.println("Rowsize::::::"+rowsize);
					//String Val="searoij@foj.com";
					
					
					for(int i=1;i<=rowsize;i++)
					{
					
				
						
						String sitem1= driver.findElement(By.xpath("//div[contains(@class,'ng-scope ngRow')][" + i + "]")).getText();
						
						
						
						if(sitem1.contains(value))
							
						{
							System.out.println(":::String Found:::");
							driver.findElement(By.xpath("//div[contains(@class,'ng-scope ngRow')][" + i + "]")).click();
							Thread.sleep(5000);
							break;
						}
						else
						{
							System.out.println("Unable to get the value:: "+value);
						}
						
					}
					
				}
				
				catch(Exception e)
				{
				
					e.printStackTrace();
					}
				}
				}
				
					
