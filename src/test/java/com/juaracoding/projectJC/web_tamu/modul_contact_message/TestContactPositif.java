package com.juaracoding.projectJC.web_tamu.modul_contact_message;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.ModulContactTamu;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestContactPositif {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulContactTamu contactTamu = new ModulContactTamu();
	
	public TestContactPositif() {
			driver = HooksContactPositif.driver;
			extentTest = HooksContactPositif.extentTest;
		}
	
	@When("User go to web JC Contact Tamu")
	public void user_go_to_web_JC_contact_tamu() {
		driver.get(Constants.URLTHREE);
		extentTest.log(LogStatus.PASS, "User go to web JC Contact Tamu");	
	}
	
	@And("User input data contact")
	public void user_input_data_contact() {
		HooksContactPositif.scroll(350);
		contactTamu.formFull();
		extentTest.log(LogStatus.PASS, "User input data contact");
	}
	
	@And("User clik button send message")
	public void user_clik_button_send_message() {
		HooksContactPositif.delay(1);
		contactTamu.btnSendMessage();
		extentTest.log(LogStatus.PASS, "User clik button send message");
	}
	
	@Then("Alert valid message")
	public void alert_valid_message() {
		HooksContactPositif.scroll(350);
		assertEquals(contactTamu.getTxtSuksesSend(),"Thank You for contact us");
		extentTest.log(LogStatus.PASS, "Alert valid message");
	}
}
