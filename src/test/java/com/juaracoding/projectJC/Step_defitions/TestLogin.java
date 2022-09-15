package com.juaracoding.projectJC.Step_defitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;

public class TestLogin {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	
	public TestLogin() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	Invalid username password
	
	@When("User go to web JC")
	public void user_go_to_web_JC() {
		driver.get(Constants.URLOne);
		extentTest.log(LogStatus.PASS, "User go to web JC");
	}
	
	@And("User input invalid username password")
	public void user_input_invalid_username_password() {
		Hooks.delay(1);
		login.login("ucen@gmail.com", "abc");
		extentTest.log(LogStatus.PASS, "User input invalid username password");
	}
	
	@And("User click button sign one")
	public void user_click_button_sign_one() {
		Hooks.delay(1);
		login.clickBtnSign();
		extentTest.log(LogStatus.PASS, "user click button sign one");
	}
	
	@Then("User invalid login one")
	public void user_invalid_login_one() {
		assertEquals(login.getTxtInvalid(), "Username Atau Password Salah");
		extentTest.log(LogStatus.PASS, "User invalid login one");
	}
	
	
//	Invalid Username
	
	@When("User input invalid username")
	public void user_input_invalid_username() {
		Hooks.delay(1);
		login.login("ucen@gmail.com", "a");
		extentTest.log(LogStatus.PASS, "User input invalid username");
	}
	
	@And("User click button sign two")
	public void user_click_button_sign_two() {
		Hooks.delay(1);
		login.clickBtnSign();
		extentTest.log(LogStatus.PASS, "User click button sign two");
	}
	
	@Then("User invalid login two")
	public void user_invalid_login_two() {
		assertEquals(login.getTxtInvalid(), "Username Atau Password Salah");
		extentTest.log(LogStatus.PASS, "User invalid login two");
	}
	
	
//	Invalid password
	
	@When("User input invalid password")
	public void user_input_invalid_password() {
		Hooks.delay(1);
		login.login("ucen1315@gmail.com", "abc");
		extentTest.log(LogStatus.PASS, "User input invalid password");
	}
	
	@And("User click button sign three")
	public void user_click_button_sign_three() {
		Hooks.delay(1);
		login.clickBtnSign();
		extentTest.log(LogStatus.PASS, "User click button sign two");
	}
	
	@Then("User invalid login three")
	public void user_invalid_login_three() {
		assertEquals(login.getTxtInvalid(), "Username Atau Password Salah");
		extentTest.log(LogStatus.PASS, "User invalid login three");
	}
	
	
//	Username & Password Null
	
	@When("Username password null")
	public void username_password_null() {
		Hooks.delay(1);
		login.login("", "");
		extentTest.log(LogStatus.PASS, "Username password null");
	}
	
	@And("User click button sign four")
	public void user_click_button_sign_four() {
		Hooks.delay(1);
		login.clickBtnSign();
		extentTest.log(LogStatus.PASS, "User click button sign four");
	}
	
	@Then("User invalid login four")
	public void user_invalid_login_four() {
		Hooks.delay(1);
		assertEquals(login.getTxtAlertLogin(), "username Atau Password Kosong");
		login.clickBtnOk();
		extentTest.log(LogStatus.PASS, "User invalid login four");
	}
	
	
	
//	Valid username password
	
	@When("User input username password")
	public void user_input_username_password() {
		Hooks.delay(1);
		login.login("ucen1315@gmail.com", "a");
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
