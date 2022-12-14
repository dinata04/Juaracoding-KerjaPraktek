package com.juaracoding.projectJC.ModulBlog;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.drivers.DriverSingleton;
import com.juaracoding.projectJC.utils.Constants;
import com.juaracoding.projectJC.utils.TestScenarios;
import com.juaracoding.projectJC.utils.TestScenariosBlog;
import com.juaracoding.projectJC.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/extent-reports.html");

		
		@Before
		public void setup() {
			DriverSingleton.getInstance(Constants.CHROME);
			driver = DriverSingleton.getDriver();
			TestScenariosBlog[] tests = TestScenariosBlog.values();
			extentTest = reports.startTest(tests[Utils.testCount].getTestName());
			Utils.testCount++;
		}
		
		@AfterStep
		public void getResultStatus(Scenario scenario) throws IOException {
			if(scenario.isFailed()) {
				String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
				extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
						+extentTest.addScreenCapture(screenshotPath));;
			}
		}
		
		@After
		public static void closeObject() {
			reports.endTest(extentTest);
			reports.flush();
		} 
		
		@AfterAll
		public static void closeBrowser() {
			delay(2);
			DriverSingleton.closeObjectInstance();
		}
		
		static void delay(int seconds) {
			try {
				Thread.sleep(seconds*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		static void scroll(int vertical) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + vertical + ")");
		}


}
