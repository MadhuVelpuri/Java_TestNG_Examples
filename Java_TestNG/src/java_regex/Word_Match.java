package java_regex;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;

import freemarker.template.TemplateException;

public class Word_Match {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method
	 * stub
	 * 
	 * String regex = "\\w(\\d{3})+"; String mail_regex = "[a-z]@.mail.com";
	 * Pattern pattern = Pattern.compile(regex); String candidate =
	 * "Love you Regex12334567"; String mail =
	 * "madhu velpuri@gmail.com, mvelpuri@gmail.com"; Matcher matcher =
	 * pattern.matcher(candidate);
	 * 
	 * if (matcher.find()) { System.out.println("Regex Result is : " +
	 * matcher.group(1)); }
	 * 
	 * }
	 */

	public static void main(String args[]) throws IOException, TemplateException {

		WebDriver driver = new FirefoxDriver();
		// driver.navigate().to("http://www.spicejet.com//");
		Dimension d = new Dimension(360, 550);
		driver.manage().window().setSize(d);
		
		driver.get("http://reference.qa02.medscape.com/slideshow/carcinoid-tumors-6007675");
		
		driver.findElement(By.xpath("//*[@id='userId']")).sendKeys("kasupada");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("medscape");
		driver.findElement(By.id("loginbtn")).click();
			boolean toast_alert = driver.findElement(By.xpath("//*[@id='slide-show-v2']/div[2]/div[1]/div[2]/div/div/div[1]/figure/figure[1]/span[1]")).isDisplayed();
			System.out.println(toast_alert);
		// .checkLayout(driver,"C:\\GalenFramework\\galenEx\\homed.gspec","desktop");
		LayoutReport layoutReport = Galen.checkLayout(driver, "D:\\Madhu\\WebMD\\Projects\\Java_TestNG\\homed.gspec",
				Arrays.asList("desktop"));

		// Creating a list of tests
		List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

		// Creating an object that will contain the information about the test
		GalenTestInfo test = GalenTestInfo.fromString("Login page on mobile device test");

		// Adding layout report to the test report
		test.getReport().layout(layoutReport, "check layout on mobile device");
		tests.add(test);

		// Exporting all test reports to html
		new HtmlReportBuilder().build(tests, "D:\\Madhu\\WebMD\\Projects\\Java_TestNG\\galen-html-reports");
		if (layoutReport.errors() > 0) {
			System.out.println("error is present");
		}

	}

}
