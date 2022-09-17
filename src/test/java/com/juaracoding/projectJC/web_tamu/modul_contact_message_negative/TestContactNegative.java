package com.juaracoding.projectJC.web_tamu.modul_contact_message_negative;

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

public class TestContactNegative {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulContactTamu contactTamu = new ModulContactTamu();
	private Login login = new Login();

	public TestContactNegative() {
		driver = HooksContactNegative.driver;
		extentTest = HooksContactNegative.extentTest;
	}

	// 1. case => tidak mengisi nama
	@When("User go to web JC contact tamu two")
	public void user_go_to_web_JC_contact_tamu() {
		driver.get(Constants.URLFOUR);
		System.out.println("Berhasil Buka Web JC Contact Tamu");
		extentTest.log(LogStatus.PASS, "User go to web JC contact tamu two");
	}
	
	@And("User not input name")
	public void user_not_input_name() {
		HooksContactNegative.scroll(350);
		HooksContactNegative.delay(5);
		contactTamu.txtName("");
		HooksContactNegative.delay(5);
		contactTamu.txtEmail("magang@gmail.com");
		HooksContactNegative.delay(5);
		contactTamu.txtNumber("123");
		HooksContactNegative.delay(5);
		contactTamu.txtSubject("Coba");
		HooksContactNegative.delay(5);
		contactTamu.txtMessage("Coba Lagi");
		HooksContactNegative.delay(5);
		System.out.println("Gagal Input Data Contact");
		extentTest.log(LogStatus.PASS, "User not input name");
	}
	
	@And("User clik button send one")
	public void user_clik_button_send_one() {
		HooksContactNegative.delay(5);
		contactTamu.btnSendMessage();
		System.out.println("Gagal Kirim Data Contact");
		extentTest.log(LogStatus.PASS, "User clik button send one");	
	}
	
	@Then("Alert invalid message one")
	public void alert_invalid_message_one() {
		HooksContactNegative.delay(5);
		HooksContactNegative.scroll(200);
		assertEquals(contactTamu.getValidasiNameKosong(),"The name field is required.");
		System.out.println(contactTamu.getValidasiNameKosong());
		HooksContactNegative.delay(5);
		extentTest.log(LogStatus.PASS, "Alert invalid message one");
	}
	
//	// 2. case => mengisi email dengan angka
//	@When("User input email with number")
//	public void user_input_email_with_number() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("magang");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("12345");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("123");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("Coba");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("Coba Lagi");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User input email with number");
//	}
//	
//	@And("User clik button send two")
//	public void user_clik_button_send_two() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send two");	
//	}
//	
//	@Then("Alert invalid message two")
//	public void alert_invalid_message_two() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getValidasiEmailAngka(),"The email field must contain a valid email address");
//		System.out.println(contactTamu.getValidasiEmailAngka());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message two");
//	}
//	
//	// 3. case => tidak mengisi email
//	@When("User not input email")
//	public void user_not_input_email() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("magang");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("123");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("Coba");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("Coba Lagi");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User not input email");
//	}
//	
//	@And("User clik button send three")
//	public void user_clik_button_send_three() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send three");	
//	}
//	
//	@Then("Alert invalid message three")
//	public void alert_invalid_message_three() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getValidasiEmailKosong(),"The email field is required.");
//		System.out.println(contactTamu.getValidasiEmailKosong());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message three");
//	}
//	
//	// 4. case => mengisi phone number dengan huruf
//	@When("User input phone number with letter")
//	public void user_input_phone_number_with_letter() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("kerja");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("kerjag@gmail.com");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("kerja");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("Coba");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("Coba Lagi");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User input phone number with letter");
//	}
//	
//	@And("User clik button send four")
//	public void user_clik_button_send_four() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send four");	
//	}
//	
//	@Then("Alert invalid message four")
//	public void alert_invalid_message_four() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getTxtSuksesSend(),"Thank You for contact us");
//		System.out.println("Thank You for contact us");
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message four");
//	}
//	
//	// 5. case => tidak mengisi phone number
//	@When("User not input phone number")
//	public void user_not_input_phone_number() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("kerja");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("kerjag@gmail.com");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("Coba");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("Coba Lagi");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User not input phone number");
//	}
//	
//	@And("User clik button send five")
//	public void user_clik_button_send_five() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send five");	
//	}
//	
//	@Then("Alert invalid message five")
//	public void alert_invalid_message_five() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getValidasiNomorKosong(),"The phone field is required.");
//		System.out.println(contactTamu.getValidasiNomorKosong());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message five");
//	}
//	
//	// 6. case => tidak mengisi subject
//	@When("User not input subject")
//	public void user_not_input_subject() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("kerja");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("kerjag@gmail.com");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("12345");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("Coba Lagi");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User not input subject");
//	}
//	
//	@And("User clik button send six")
//	public void user_clik_button_send_six() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send six");	
//	}
//	
//	@Then("Alert invalid message six")
//	public void alert_invalid_message_six() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getValidasiSubjectKosong(),"The subject field is required.");
//		System.out.println(contactTamu.getValidasiSubjectKosong());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message six");
//	}
//	
//	// 7. case => tidak mengisi message
//	@When("User not input message")
//	public void user_not_input_message() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("kerja Lagi");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("kerjalagi@gmail.com");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("12345");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("kerja");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User not input subject");
//	}
//	
//	@And("User clik button send seven")
//	public void user_clik_button_send_seven() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send seven");	
//	}
//	
//	@Then("Alert invalid message seven")
//	public void alert_invalid_message_seven() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getTxtSuksesSend(),"Thank You for contact us");
//		System.out.println(contactTamu.getTxtSuksesSend());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message seven");
//	}
//	
//	// 8. case => gagal send message ke contact I
//	@When("User not input one data")
//	public void user_not_input_one_data() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("kerja Lagi");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("kerjalagi@gmail.com");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("12345");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User not input one data");
//	}
//	
//	@And("User clik button send eight")
//	public void user_clik_button_send_eight() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send eight");	
//	}
//	
//	@Then("Alert invalid message eight")
//	public void alert_invalid_message_eight() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getValidasiSubjectKosong(),"The subject field is required.");
//		System.out.println(contactTamu.getValidasiSubjectKosong());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message eight");
//	}
//	
//	// 9. case => gagal send message ke contact II
//	@When("User not input data")
//	public void user_not_input_data() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("");
//		HooksContactNegative.delay(5);
//		System.out.println("Gagal Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User not input data");
//	}
//	
//	@And("User clik button send nine")
//	public void user_clik_button_send_nine() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Gagal Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send nine");	
//	}
//	
//	@Then("Alert invalid message nine")
//	public void alert_invalid_message_nine() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getValidasiNameKosong(),"The name field is required.");
//		System.out.println(contactTamu.getValidasiNameKosong());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message nine");
//	}
//	
//	// 10. case => mengisi nama dengan angka
//	@When("User input name with numbers")
//	public void user_input_name_with_numbers() {
//		HooksContactNegative.scroll(350);
//		HooksContactNegative.delay(5);
//		contactTamu.txtName("1234");
//		HooksContactNegative.delay(5);
//		contactTamu.txtEmail("kerjalagi@gmail.com");
//		HooksContactNegative.delay(5);
//		contactTamu.txtNumber("12345");
//		HooksContactNegative.delay(5);
//		contactTamu.txtSubject("kerja");
//		HooksContactNegative.delay(5);
//		contactTamu.txtMessage("kerja lagi kuy");
//		HooksContactNegative.delay(5);
//		System.out.println("Berhasil Input Data Contact");
//		extentTest.log(LogStatus.PASS, "User not input subject");
//	}
//	
//	@And("User clik button send ten")
//	public void user_clik_button_send_ten() {
//		HooksContactNegative.delay(5);
//		contactTamu.btnSendMessage();
//		System.out.println("Berhasil Kirim Data Contact");
//		extentTest.log(LogStatus.PASS, "User clik button send ten");	
//	}
//	
//	@Then("Alert invalid message ten")
//	public void alert_invalid_message_ten() {
//		HooksContactNegative.delay(5);
//		HooksContactNegative.scroll(200);
//		assertEquals(contactTamu.getTxtSuksesSend(),"Thank You for contact us");
//		System.out.println(contactTamu.getTxtSuksesSend());
//		HooksContactNegative.delay(5);
//		extentTest.log(LogStatus.PASS, "Alert invalid message ten");
//	}
}
