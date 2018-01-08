package java_concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Try_Catch {

	static WebDriver webdriver;

	public static void main(String[] args) {

		try {

			String name = null;
			String value = "madhu;babu";

			List<String> allstyles = new ArrayList<String>();

			if (value.contains(";")) {
				String[] styles = value.split(";");

				for (int i = 0; i < styles.length - 1; i++) {

					int pos = 1;
					while (true) {
						String con = tt.driver.utils.getValue(styles[i] + "" + pos);
						// dt:factory#1 -->
						// <key,value><factory1,value1><factroy2,value2>
						if (con != null && !con.toString().equalsIgnoreCase(styles[i] + "" + pos))

						{
							String s = tt.driver.utils.getValue(styles[i] + "" + pos);
							allstyles.add(s);
							pos++;
							continue;

						}
						break;
					}
					System.out.println(pos);

				}
				int listSize = allstyles.size();

				Random rand = new Random();
				int randVal = rand.nextInt(listSize);

				name = allstyles.get(randVal);

			} else {
				name = tt.driver.utils.getValue(value);
			}
			try {
				WebElement SearchText = webdriver
						.findElement(By.xpath("//h2[text()='Results']/following::input[@type='text']"));
				SearchText.sendKeys(name);
				SearchText.sendKeys(Keys.ENTER);
				webdriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				webdriver.findElement(By.xpath("//div[@class='list X0']/a[1]/span[contains(text(),'" + name + "')]"))
						.click();
				// SearchText.sendKeys(Keys.BACK_SPACE);
				webdriver.findElement(By.xpath("//h2[text()='Results']/following::input[@value='Clear All']")).click();
			} catch (Exception e) {
				webdriver.findElement(By.xpath("//span[contains(text(),'" + name + "')]")).click();

			}

			resultDetails.setFlag(true);
		} catch (Exception ex) {
			resultDetails.setFlag(false);
			ex.printStackTrace();
		}
		break;

	}
}
