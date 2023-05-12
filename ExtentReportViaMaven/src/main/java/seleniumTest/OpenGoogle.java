package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("report.html");
		ExtentReports extentReports=new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		ExtentTest test=extentReports.createTest("Wedding Sarees");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Red Colour Wedding Sarees");
		driver.findElement(By.name("q")).submit();
		test.pass("Test Passed");
		driver.quit();
		extentReports.flush();
		
	}

}
