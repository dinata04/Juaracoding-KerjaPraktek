package com.juaracoding.projectJC.web_admin.step_view_data;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.juaracoding.projectJC.pages.DetailDataContact;
import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.pages.ModulContactTamu;
import com.juaracoding.projectJC.utils.Constants;
import com.juaracoding.projectJC.web_tamu.modul_contact_message.HooksContact;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDetailData {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private ModulContactTamu contactTamu = new ModulContactTamu();
	private DetailDataContact detailData = new DetailDataContact();
	
	public TestDetailData() {
			driver = HooksDetailContact.driver;
			extentTest = HooksDetailContact.extentTest;
		}
	
	@When("User go to web JC contact tamu two")
	public void user_go_to_web_JC_contact_tamu_two() {
		driver.get(Constants.URLTHREE);
		System.out.println("Berhasil Buka Web JC Contact Tamu");
		extentTest.log(LogStatus.PASS, "User go to web JC contact tamu two");	
	}
	
	@And("User input data contact two")
	public void user_input_data_contact_two() {
		HooksDetailContact.scroll(350);
		HooksDetailContact.delay(5);
		contactTamu.txtName("Libur");
		HooksDetailContact.delay(5);
		contactTamu.txtEmail("bryan@gmail.com");
		HooksDetailContact.delay(5);
		contactTamu.txtNumber("081234567891");
		HooksDetailContact.delay(5);
		contactTamu.txtSubject("Kerja Praktek");
		HooksDetailContact.delay(5);
		contactTamu.txtMessage("Hari Ini Sangat Lelah");
		HooksDetailContact.delay(5);
		System.out.println("Berhasil Input Data Contact");
		extentTest.log(LogStatus.PASS, "User input data contact two");
	}
	
	@And("User clik button send message two")
	public void user_clik_button_send_message_two() {
		HooksDetailContact.delay(5);
		contactTamu.btnSendMessage();
		System.out.println("Berhasil Kirim Data Contact");
		extentTest.log(LogStatus.PASS, "User clik button send message two");
	}
	
	@And("User go to web JC Admin three")
	public void user_go_to_web_JC_admin_three() {
		HooksDetailContact.delay(5);
		driver.get(Constants.URLOne);
		System.out.println("Berhasil Masuk Web JC Admin");
		extentTest.log(LogStatus.PASS, "User go to web JC Admin three");
	}
	
	@And("User login two")
	public void user_login_two() {
		HooksDetailContact.delay(5);
		login.txtUsername("ucen1315@gmail.com");
		HooksDetailContact.delay(5);
		login.txtPassword("a");
		login.clickBtnSign();
		System.out.println("Berhasil Login");
		assertEquals(login.getTxtDashboard(),"Dashboard");
		extentTest.log(LogStatus.PASS, "User login two");
	}
	
	@And("User go to menu contact two")
	public void user_go_to_menu_contact_two() {
		HooksDetailContact.delay(5);
		login.clickBtnContact();
		extentTest.log(LogStatus.PASS, "User go to menu contact two");
	}
	
	@And("User view data name in table")
	public void user_view_data_name_in_table() {
		HooksDetailContact.delay(5);
		assertEquals(detailData.getTxtName(),"Libur");
		System.out.println(detailData.getTxtName());
		extentTest.log(LogStatus.PASS, "User view data name in table");
	}
	
	@And("User view data email in table")
	public void user_view_data_email_in_table() {
		assertEquals(detailData.getTxtEmail(),"bryan@gmail.com");
		System.out.println(detailData.getTxtEmail());
		extentTest.log(LogStatus.PASS, "User view data email in table");
	}
	
	@And("User view data phone number in table")
	public void user_view_data_phone_number_in_table() {
		assertEquals(detailData.getTxtNumber(),"081234567891");
		System.out.println(detailData.getTxtNumber());
		extentTest.log(LogStatus.PASS, "User view data phone number in table");
	}
	
	@And("User view data subject in table")
	public void user_view_data_subject_in_table() {
		assertEquals(detailData.getTxtSubject(),"Kerja Praktek");
		System.out.println(detailData.getTxtSubject());
		extentTest.log(LogStatus.PASS, "User view data subject in table");
	}
	
	@And("User view data message in table")
	public void user_view_data_message_in_table() {
		assertEquals(detailData.getTxtMessage(),"Hari Ini Sangat Lelah");
		System.out.println(detailData.getTxtMessage());
		extentTest.log(LogStatus.PASS, "User view data message in table");
	}
	
	@And("User click button next")
	public void user_click_button_next() {
		HooksDetailContact.delay(5);
		login.clickBtnContact();
		HooksDetailContact.delay(3);
		HooksDetailContact.scroll(700);
		HooksDetailContact.delay(5);
		detailData.clickBtnNext();
		System.out.println(detailData.getTxtName());
//		HooksDetailContact.delay(3);
//		detailData.clickBtnNext();
		extentTest.log(LogStatus.PASS, "User click button next");
	}
	
	@And("User click button prev")
	public void user_click_button_prev() {
		HooksDetailContact.delay(5);
		HooksDetailContact.scroll(550);		
		WebElement l = driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[3]/nav/ul/li[1]/a"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
//		detailData.clickBtnPrev();
		System.out.println(detailData.getTxtName());
		extentTest.log(LogStatus.PASS, "User click button prev");
	}
}
