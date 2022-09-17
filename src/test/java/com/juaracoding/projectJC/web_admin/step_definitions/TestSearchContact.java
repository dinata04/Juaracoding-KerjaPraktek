package com.juaracoding.projectJC.web_admin.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.pages.SearchContact;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearchContact {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private SearchContact search = new SearchContact();
	
	public TestSearchContact() {
		driver = HooksSearchContact.driver;
		extentTest = HooksSearchContact.extentTest;
	}
	
	//	Valid Login
	
	@When("User go to web JC Admin Two")
	public void user_go_to_web_JC() {
		driver.get(Constants.URLOne);
		extentTest.log(LogStatus.PASS, "User go to web JC Admin Two");
	}
	
	@And("User input username password")
	public void user_input_username_password() {
		HooksSearchContact.delay(5);
		login.txtUsername("ucen1315@gmail.com");
		HooksSearchContact.delay(5);
		login.txtPassword("a");
		extentTest.log(LogStatus.PASS, "User input username password");
	}
	
	@And("User clik button sign")
	public void user_clik_button_sign() {
		HooksSearchContact.delay(5);
		login.clickBtnSign();
		System.out.println("Berhasil Login");
		extentTest.log(LogStatus.PASS, "User clik button sign");
	}
	
	@Then("User get valid login")
	public void user_valid_login() {
		HooksSearchContact.delay(5);
		assertEquals(login.getTxtDashboard(),"Dashboard");
		System.out.println(login.getTxtDashboard());
		extentTest.log(LogStatus.PASS, "User Valid login");
	}
	
	//1. Search bye kategori nama dan diisi nama
	
	@When("User go to contact")
	public void user_go_to_contact() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		extentTest.log(LogStatus.PASS, "User go to contact");
	}
	
	@And("User select colom by name")
	public void user_select_colom_by_name() {
		HooksSearchContact.delay(2);
		System.out.println("Kategori Nama");
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by name");
	}
	
	@And("User input colom search with name")
	public void user_input_colom_search_with_name() {
		HooksSearchContact.delay(4);
		search.searchData("kerja");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User input colom search with name");
	}
	
	@Then("User get result one")
	public void user_get_result_one() {
		HooksSearchContact.delay(2);
		assertEquals(search.getResultName(),"kerja");
		System.out.println(search.getResultName());
		extentTest.log(LogStatus.PASS, "User get result one");
	}
	
	//2.Search bye kategori nama dan tidak diisi nama 
	
	@When("User select colom by name two")
	public void user_select_colom_by_name_two() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(2);
		System.out.println("Kategori Nama");
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by name two");
	}
	
	@And("User not input colom one")
	public void user_not_input_colom_one() {
		HooksSearchContact.delay(2);
		search.searchData("");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User not input colom one");
	}
	
	@Then("User get result two")
	public void user_get_result_two() {
		HooksSearchContact.delay(2);
		System.out.println(search.getResultNameTwo());
		HooksSearchContact.delay(6);
		HooksSearchContact.scroll(150);
		assertEquals(search.getResultNameTwo(),"1111");
		extentTest.log(LogStatus.PASS, "User get result two");
	}
	
	//3. Search bye kategori email dan diisi email
	
	@When("User select colom by email")
	public void user_select_colom_by_email() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(5);
		search.pilihKategori("Email",1);
		HooksSearchContact.delay(6);
		
		extentTest.log(LogStatus.PASS, "User select colom by email");
	}
	
	@And("User input colom search with email")
	public void user_input_colom_search_with_email() {
		HooksSearchContact.delay(2);
		search.searchData("magang@gmail.com");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User input colom search with email");
	}
	
	@Then("User get result three")
	public void user_get_result_three() {
		HooksSearchContact.delay(2);
		assertEquals(search.getResultEmail(),"magang@gmail.com");
		System.out.println(search.getResultEmail());
		extentTest.log(LogStatus.PASS, "User get result three");
	}
	
	//4.Search bye kategori email dan tidak diisi email
	
	@When("User select colom by email two")
	public void user_select_colom_by_email_two() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(2);
		search.pilihKategori("Email",1);
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by email two");
	}
	
	@And("User not input colom two")
	public void user_not_input_colom_two() {
		HooksSearchContact.delay(2);
		search.searchData("");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User not input colom two");
	}
	
	@Then("User get result four")
	public void user_get_result_four() {
		HooksSearchContact.delay(2);
		System.out.println(search.getResultNoEmail());
		extentTest.log(LogStatus.PASS, "User get result four");
	}
	
	//5. Search bye kategori phone number dan diisi phone number
	
	@When("User select colom by number")
	public void user_select_colom_by_number() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(2);
		search.pilihKategori("Phone Number", 2);
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by number");
	}
	
	@And("User input colom search with number")
	public void user_input_colom_search_with_number() {
		HooksSearchContact.delay(2);
		search.searchData("123456");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User input colom search with number");
	}
	
	@Then("User get result five")
	public void user_get_result_five() {
		HooksSearchContact.delay(2);
		assertEquals(search.getResultNumber(),"123456");
		System.out.println(search.getResultNumber());
		extentTest.log(LogStatus.PASS, "User get result five");
	}
	
	//6. Search bye kategori phone number dan tidak diisi phone number
	
	@When("User select colom by number two")
	public void user_select_colom_by_number_two() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(2);
		search.pilihKategori("Phone Number", 2);
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by number two");
	}
	
	@And("User not input colom three")
	public void user_not_input_colom_three() {
		HooksSearchContact.delay(2);
		search.searchData("");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User not input colom three");
	}
	
	@Then("User get result six")
	public void user_get_result_six() {
		HooksSearchContact.delay(2);
		System.out.println(search.getResultNoNumber());
		extentTest.log(LogStatus.PASS, "User get result six");
	}
	
	//7. Search bye kategori subject dan diisi subject 
	
	@When("User select colom by subject")
	public void user_select_colom_by_subject() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(2);
		search.pilihKategori("Subject", 3);
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by subject");
	}
	
	@And("User input colom search with subject")
	public void user_input_colom_search_with_subject() {
		HooksSearchContact.delay(2);
		search.searchData("kerja");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User input colom search with subject");
	}
	
	@Then("User get result seven")
	public void user_get_result_seven() {
		HooksSearchContact.delay(2);
		assertEquals(search.getResultSubject(),"kerja");
		System.out.println(search.getResultSubject());
		extentTest.log(LogStatus.PASS, "User get result seven");
	}
	
	//8. Search bye kategori subject dan tidak diisi subject
	
	@When("User select colom by subject two")
	public void user_select_colom_by_subject_two() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(2);
		search.pilihKategori("Subject", 3);
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by subject two");
	}
	
	@And("User not input colom four")
	public void user_not_input_colom_four() {
		HooksSearchContact.delay(2);
		search.searchData("");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User not input colom four");
	}
	
	@Then("User get result eight")
	public void user_get_result_eight() {
		HooksSearchContact.delay(2);
		System.out.println(search.getResultNoSubject());
		extentTest.log(LogStatus.PASS, "User get result eight");
	}
	
	//9. Search bye kategori message
	@When("User select colom by message")
	public void user_select_colom_by_message() {
		HooksSearchContact.delay(6);
		login.clickBtnContact();
		HooksSearchContact.delay(6);
		assertEquals(login.getTxtMenuContact(),"Data Contact Messages");
		System.out.println(login.getTxtMenuContact());
		HooksSearchContact.delay(2);
		search.pilihKategori("Message", 4);
		HooksSearchContact.delay(6);
		extentTest.log(LogStatus.PASS, "User select colom by message");
	}
	
	@And("User input colom search with message")
	public void user_input_colom_search_with_message() {
		HooksSearchContact.delay(2);
		search.searchData("coba");
		HooksSearchContact.delay(2);
		extentTest.log(LogStatus.PASS, "User input colom search with message");
	}
	
	@Then("User get result nine")
	public void user_get_result_nine() {
		HooksSearchContact.delay(2);
		assertEquals(search.getResultMessage(),"Coba dibaca");
		System.out.println(search.getResultMessage());
		extentTest.log(LogStatus.PASS, "User get result nine");
	}
}