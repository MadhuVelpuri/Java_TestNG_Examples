package com.practice;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class focusReports {
	
public static void mouseover(WebDriver driver) throws InterruptedException
{
	Thread.sleep(2000);
	
	//WebElement element= driver.findElement(By.cssSelector("svg .highcharts-markers path[fill='green']:nth-child(1)"));
	List<WebElement> element= driver.findElements(By.cssSelector("svg .highcharts-markers path[fill='green']"));
	System.out.println("Total nodes are: "+ element.size());
	int size=element.size();
	
	for(int i=1;i<=size+1;i++)
	{
		WebElement elementlist=driver.findElement(By.cssSelector("svg .highcharts-markers path[fill='green']:nth-child("+i+")"));		
		//Thread.sleep(10000);
		Actions builder = new Actions(driver);
		Thread.sleep(3000);
		if((i>=6&&i<=16)||i==23)
		{
			builder.moveToElement(elementlist);
			builder.build().perform();
			
		}
		else
		{
		builder.moveToElement(elementlist);
		builder.click().build().perform();
		}
		//Thread.sleep(5000);

		String string =driver.findElement(By.cssSelector(".highcharts-label text")).getText();
		System.out.println("Tooltip text of Node "+i+": "+ string+"\n\n");
		
	}
		}

	 public static void main(String args[])throws Exception {
  WebDriver driver;
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.get("http://54.164.49.250/Focus/login.htm?path=bbdb");
  driver.findElement(By.id("userName")).sendKeys("test");
  driver.findElement(By.id("password")).sendKeys("Venkatesh@1");
  driver.findElement(By.xpath("//button[text()='Login']")).click();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//*[@id='reports']/a")).click();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
  Thread.sleep(5000);
  mouseover(driver);
  Thread.sleep(2000);
  driver.close();
 }
}