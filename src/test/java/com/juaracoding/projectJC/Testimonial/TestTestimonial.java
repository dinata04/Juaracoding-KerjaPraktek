package com.juaracoding.projectJC.Testimonial;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Testimonial;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTestimonial {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Testimonial testimonial = new Testimonial();
	
	public TestTestimonial() {
			driver = Hooks.driver;
			extentTest = Hooks.extentTest;
		}
	//masuk menu testimonial
	@When("click sub menu")
	public void ClickSubMenu() {
		Hooks.delay(2);
		testimonial.ButtonSubMenu();
		extentTest.log(LogStatus.PASS, "click sub menu");
	}
	@And("click testimonial menu")
	public void ClickTestimonialmenu() {
		testimonial.ButtonTestimonial();
		extentTest.log(LogStatus.PASS, "click testimonial menu");
	}
	
	//add testimonial
	@When("click add")
	public void clidAdd() {
		testimonial.ButtonAdd();
		extentTest.log(LogStatus.PASS, "click add");
	}
	
	@And("input file {string}")
	public void inputFilefoto(String foto) {
		testimonial.inputFile(foto);
		extentTest.log(LogStatus.PASS, "input file");
	}
	
	@And("input name {string}")
	public void inputName(String nama) {
		testimonial.inputNama(nama);
		extentTest.log(LogStatus.PASS, "input name");
	}
	@And("select publish {int}")
	public void SelectPublish(int index) {
		testimonial.selectPublish(index);
		extentTest.log(LogStatus.PASS, "select publish");
	}
	
	@And("input text testimonial {string}")
	public void inputTextTestimonial(String text) {
		testimonial.inputTxtTestimonial(text);
		extentTest.log(LogStatus.PASS, "input text testimonial");
	}
	
	@And("select rating {int}")
	public void SelectRating(int index) {
		testimonial.selectRating(index);
		extentTest.log(LogStatus.PASS, "select rating");
	}
	
	@Then("click save")
	public void ClickSave() {
		testimonial.ButtonSimpan();
		extentTest.log(LogStatus.PASS, "click save");
	}
	
	//Cek Data
	@When("search name {string}")
	public void InputSearchName(String nama) {
		testimonial.SearchNamaPeserta(nama);
		Hooks.delay(1);
		assertEquals(testimonial.NamaPesertaTestimonial(), true);
		extentTest.log(LogStatus.PASS, "search name");
	}
	
}
