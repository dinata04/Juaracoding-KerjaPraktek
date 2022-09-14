package com.juaracoding.projectJC.About;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.About.Hooks;
import com.juaracoding.projectJC.pages.About;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAbout {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private About about = new About();
	
	public TestAbout() {
			driver = Hooks.driver;
			extentTest = Hooks.extentTest;
		}
	//masuk menu about
	@When("click about menu")
	public void clickTestimonialmenu() {
		Hooks.delay(3);
		about.ButtonAbout();
		extentTest.log(LogStatus.PASS, "click about menu");
	}
	
	//add trainer
	@When("click add")
	public void clickAdd() {
		about.AddTrainer();
		extentTest.log(LogStatus.PASS, "click add");
	}
	
	@And("input file {string}")
	public void inputFile(String foto) {
		about.inputFile(foto);
		extentTest.log(LogStatus.PASS, "input file");
	}
	
	@And("input name {string}")
	public void inputName(String nama) {
		about.inputNama(nama);
		extentTest.log(LogStatus.PASS, "input name");
	}
	
	@And("input jabatan {string}")
	public void inputJabatan(String jabatan) {
		about.inputJabatan(jabatan);
		extentTest.log(LogStatus.PASS, "input jabatan");
	}
	
	@And("input isi profile {string}")
	public void inputIsiProfile(String profile) {
		about.inputTxtProfile(profile);
		extentTest.log(LogStatus.PASS, "input isi profile");
	}
	
	@And("select publish {int}")
	public void selectPublish(int index) {
		about.selectPublish(index);
		extentTest.log(LogStatus.PASS, "select publish");
	}
	
	@Then("click save")
	public void clickSave() {
		about.ButtonSimpan();
		extentTest.log(LogStatus.PASS, "click save");
	}
	
	//cek data
	@When("search name {string}")
	public void searchName(String nama) {
		about.searchNamaTrainer(nama);
		extentTest.log(LogStatus.PASS, "search name");
	}
	
	@And("navigate to jc")
	public void navigateToJc() {
		driver.get(Constants.URLTwo);
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "navigate to jc");
	}
	
	@Then("click about jc")
	public void ClickAboutJc() {
		Hooks.scroll(500);
		Hooks.delay(1);
		about.btnAboutJC();
		extentTest.log(LogStatus.PASS, "click about jc");
	}
	
	@And("click last radio button jc")
	public void lastRadiobtn() {
		Hooks.delay(2);
		Hooks.scroll(1000);
		Hooks.delay(1);
		for(int i =0;i<6;i++) {
			about.radioBtnAboutJc();
		}
		Hooks.delay(1);
		assertEquals(about.profileTrainerJc(), true);
		extentTest.log(LogStatus.PASS, "click last radio button jc");
	}
	
	@Then("back to testimonial menu")
	public void backToMenu() {
		driver.navigate().back();
	}
	
}
