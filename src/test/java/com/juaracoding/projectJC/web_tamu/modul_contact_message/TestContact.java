package com.juaracoding.projectJC.web_tamu.modul_contact_message;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.pages.ModulContactTamu;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestContact {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulContactTamu contactTamu = new ModulContactTamu();
	private Login login = new Login();
	
	public TestContact() {
			driver = HooksContact.driver;
			extentTest = HooksContact.extentTest;
		}
	
	@When("User go to web JC contact tamu")
	public void user_go_to_web_JC_contact_tamu() {
		driver.get(Constants.URLTHREE);
		System.out.println("Berhasil Buka Web JC Contact Tamu");
		extentTest.log(LogStatus.PASS, "User go to web JC contact tamu");	
	}
	
	@And("User input data contact")
	public void user_input_data_contact() {
		HooksContact.scroll(350);
		HooksContact.delay(5);
		contactTamu.txtName("magang");
		HooksContact.delay(5);
		contactTamu.txtEmail("magang@gmail.com");
		HooksContact.delay(5);
		contactTamu.txtNumber("123");
		HooksContact.delay(5);
		contactTamu.txtSubject("Coba");
		HooksContact.delay(5);
		contactTamu.txtMessage("Coba Lagi");
		HooksContact.delay(5);
		System.out.println("Berhasil Input Data Contact");
		extentTest.log(LogStatus.PASS, "User input data contact");
	}
	
	@And("User clik button send message")
	public void user_clik_button_send_message() {
		HooksContact.delay(5);
		contactTamu.btnSendMessage();
		System.out.println("Berhasil Kirim Data Contact");
		extentTest.log(LogStatus.PASS, "User clik button send message");
	}
	
	@And("User go to web JC Admin")
	public void user_go_to_web_JC_admin() {
		HooksContact.delay(5);
		driver.get(Constants.URLOne);
		System.out.println("Berhasil Masuk Web JC Admin");
		extentTest.log(LogStatus.PASS, "User go to web JC Admin");
	}
	
	@And("User login")
	public void user_login() {
		HooksContact.delay(5);
		login.txtUsername("ucen1315@gmail.com");
		HooksContact.delay(5);
		login.txtPassword("a");
		login.clickBtnSign();
		System.out.println("Berhasil Login");
		assertEquals(login.getTxtDashboard(),"Dashboard");
		extentTest.log(LogStatus.PASS, "User login");
	}
	
	@And("User go to menu contact")
	public void user_go_to_menu_contact() {
		HooksContact.delay(5);
		login.clickBtnContact();
		extentTest.log(LogStatus.PASS, "User go to menu contact");
	}
	
	@Then("User search data")
	public void user_search_data() {
		HooksContact.delay(5);
		login.searchData("magang");
		HooksContact.delay(5);
		assertEquals(login.getTxtHasilSearch(),"magang");
		System.out.println(login.getTxtHasilSearch());
		HooksContact.delay(5);
		extentTest.log(LogStatus.PASS, "User search data");
	}
}
