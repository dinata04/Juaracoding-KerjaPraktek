package com.juaracoding.projectJC.Testimonial;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.Testimonial.Hooks;
import com.juaracoding.projectJC.pages.Testimonial;
import com.juaracoding.projectJC.utils.Constants;
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
		Hooks.delay(1);
		testimonial.ButtonTestimonial();
		extentTest.log(LogStatus.PASS, "click testimonial menu");
	}
	
	//add testimonial
	@When("click add")
	public void clidAdd() {
		Hooks.delay(2);
		testimonial.ButtonAdd();
		Hooks.delay(2);
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
		Hooks.delay(2);
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
	
	@And("navigate to jc")
	public void navigateToJc() {
		driver.get(Constants.URLTwo);
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "navigate to jc");
	}
	
	@Then("cek testimonial jc")
	public void cekTestimonial() {
		Hooks.scroll(3000); // scrollnya sesuaikan
		Hooks.delay(3);
		assertEquals(testimonial.isiTestimonialJC(), true);
		extentTest.log(LogStatus.PASS, "cek testimonial jc");
	}
	
	//back page
	@Then("back page")
	public void backToMenu() {
		driver.navigate().back();
		Hooks.delay(2);
		extentTest.log(LogStatus.PASS, "back page");
	}
	
	//alert add
	@And("cek alert add")
	public void cekAlertAdd() {
		Hooks.delay(3);
		assertEquals(testimonial.AlertFoto(), true);
		extentTest.log(LogStatus.PASS, "cek alert add");
	}
	
	//open peserta
	@Then("open peserta")
	public void openPeserta() {
		Hooks.delay(1);
		testimonial.OpenPeserta();
		Hooks.delay(2);
		Hooks.scroll(200);
		extentTest.log(LogStatus.PASS, "open peserta");
	}
	
	//alert edit
	@And("cek alert edit")
	public void cekAlertEdit() {
		Hooks.delay(3);
		testimonial.AlertIsiTestimonialUlang();
		extentTest.log(LogStatus.PASS, "cek alert edit");
	}
	
	//edit
	@And("clear name edit")
	public void clearNameEdit() {
		testimonial.clearNamaPesertaEdit();
		extentTest.log(LogStatus.PASS, "clear data edit");
	}
	
	@And("clear txt testimonial edit")
	public void clearIsiTestimonialEdit() {
		testimonial.clearisiTestimonialPesertaEdit();
		extentTest.log(LogStatus.PASS, "clear txt testimonial edit");
	}
	
	@And("input file edit {string}")
	public void editInputFile(String foto) {
		testimonial.inputFileUlang(foto);
		extentTest.log(LogStatus.PASS, "input file edit");
	}
	
	@And("input name edit {string}")
	public void editInputName(String nama) {
		testimonial.inputNamaUlang(nama);
		extentTest.log(LogStatus.PASS, "input name edit");
	}
	
	@And("input text testimonila edit {string}")
	public void editInputTextTestimonial(String text) {
		testimonial.inputTxtTestimonialUlang(text);
		extentTest.log(LogStatus.PASS, "input text testimonila edit");
	}
	@And("clear input file edit")
	public void clearInputFileEdit() {
		testimonial.clearinputFilePesertaEdit();
		extentTest.log(LogStatus.PASS, "clear input file edit");
	}
	
	
}
