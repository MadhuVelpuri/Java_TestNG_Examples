package com.pratice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	/*


	//*[@id='ng-app']/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[9]/div[1]/div[2]/div/span

	//*[@id='ng-app']/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[10]/div[1]/div[2]/div/span

	//*[@id='ng-app']/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[12]/div[1]/div[2]/div/span


	 */
	public class DynamicWebtablesTest {

		public static WebDriver driver;
		
		
		public void findElement() throws InterruptedException{

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://stage.citation-atlas.co.uk/");
			driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("Admin@citation.co.uk");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Atlas@2015");
			driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[4]/ul/li[3]/a")).click();
			driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[4]/ul/li[3]/ul/li[6]/a")).click();

			String Prefix = "//*[@id='ng-app']/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div";
			String Suffix = "/div[1]/div[2]/div/span";

			int i = 1; 
			String ExpectedEmail = "adamcolaiuda@citation.co.uk";
			String Email = driver.findElement(By.xpath(Prefix+"["+i+"]"+Suffix)).getText();

			while(isElementPresent(Prefix+"["+i+"]"+Suffix)){
				

				if(Email.equalsIgnoreCase(ExpectedEmail)){
					System.out.println("its matching"+Email);
					break;
				}
			}
				i = i+1;

		}

		public boolean isElementPresent(String eleXpath){

			int count= 	driver.findElements(By.xpath(eleXpath)).size();

			if (count==0){
				return false;
			}
			else {
				return true;
			}

		}

		public static void main(String[] args) throws InterruptedException {

			DynamicWebtablesTest t =  new DynamicWebtablesTest();
			t.findElement();
		}

	}
