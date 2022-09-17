package com.juaracoding.projectJC.web_admin.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	
	public TestLogin() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//	Valid Login
	
	@When("User go to web JC")
	public void user_go_to_web_JC() {
		driver.get(Constants.URLOne);
		extentTest.log(LogStatus.PASS, "User go to web JC");
	}
	
	@And("User input username password")
	public void user_input_username_password() {
		Hooks.delay(1);
		login.txtUsername("ucen1315@gmail.com");
		Hooks.delay(5);
		login.txtPassword("a");
		extentTest.log(LogStatus.PASS, "User input username password");
	}
	
	@And("User clik button sign")
	public void user_clik_button_sign() {
		Hooks.delay(1);
		login.clickBtnSign();
		extentTest.log(LogStatus.PASS, "User clik button sign");
	}
	
	@Then("User Valid login")
	public void user_valid_login() {
		assertEquals(login.getTxtDashboard(),"Dashboard");
		extentTest.log(LogStatus.PASS, "User Valid login");
	}
	

}
