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
		Hooks.delay(5);
		extentTest.log(LogStatus.PASS, "click about menu");
	}
	
	//add trainer
	@When("click add")
	public void clickAdd() {
		about.AddTrainer();
		Hooks.delay(5);
		extentTest.log(LogStatus.PASS, "click add");
	}
	
	@And("input file {string}")
	public void inputFile(String foto) {
		about.inputFile(foto);
		Hooks.scroll(100);
		extentTest.log(LogStatus.PASS, "input file");
	}
	
	@And("input name {string}")
	public void inputName(String nama) {
		about.inputNama(nama);
		Hooks.scroll(100);
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "input name");
	}
	
	@And("input jabatan {string}")
	public void inputJabatan(String jabatan) {
		about.inputJabatan(jabatan);
		Hooks.scroll(100);
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "input jabatan");
	}
	
	@And("input text profile {string}")
	public void inputIsiProfile(String profile) {
		about.inputTxtProfile(profile);
		Hooks.scroll(100);
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "input text profile");
	}
	
	@And("select publish {int}")
	public void selectPublish(int index) {
		about.selectPublish(index);
		Hooks.scroll(100);
		extentTest.log(LogStatus.PASS, "select publish");
	}
	
	//button simpan
	@Then("click save")
	public void clickSave() {
		Hooks.delay(4);
		about.ButtonSimpan();
		Hooks.delay(4);
		extentTest.log(LogStatus.PASS, "click save");
	}
	
	@Then("try click save")
	public void TryclickSave() {
		Hooks.delay(4);
		try {
			about.ButtonSimpan();
			Hooks.delay(4);
			}catch(Exception e) {
				System.out.println("button tidak bisa di click");
				backToMenu();
			}
		extentTest.log(LogStatus.PASS, "try click save");
	}
	
	//cek data
	@When("search name {string}")
	public void searchName(String nama) {
		about.searchNamaTrainer(nama);
		Hooks.delay(2);
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
		for(int i =0;i<5;i++) {
			about.radioBtnAboutJc();
		}
		Hooks.delay(2);
		assertEquals(about.profileTrainerJc(), true);
		extentTest.log(LogStatus.PASS, "click last radio button jc");
	}
	
	@And("open trainer")
	public void openTrainer() {
		Hooks.delay(1);
		about.openTrainer();
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "open trainer");
	}
	
	//Edit
	@And("delete nama")
	public void ClearNamaEdit() {
		about.ClearNamaEdit();
		extentTest.log(LogStatus.PASS, "delete nama");
	}
	
	@And("delete jabatan")
	public void ClearJabatanEdit() {
		about.ClearJabatanEdit();
		extentTest.log(LogStatus.PASS, "delete jabatan");
	}
	
	@And("delete text profile")
	public void ClearTextProfileEdit() {
		about.ClearTextProfileEdit();
		extentTest.log(LogStatus.PASS, "delete text profile");
	}
	
	@And("input nama ulang {string}")
	public void InputNamaUlangEdit(String nama) {
		Hooks.scroll(100);
		Hooks.delay(1);
		about.inputNamaUlang(nama);
		extentTest.log(LogStatus.PASS, "input nama ulang");
	}
	
	//back page
	@Then("back page")
	public void backToMenu() {
		Hooks.delay(2);
		driver.navigate().back();
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "back page");
	}
	
	//Alert
	@And("cek alert nama")
	public void CekAlertNama() {
		assertEquals(about.attributinputNamaUlang(null), true);
		extentTest.log(LogStatus.PASS, "cek alert nama");
	}
	
	@And("cek alert jabatan")
	public void CekAlertJabatan() {
		assertEquals(about.attributinputJabatan(null), true);
		extentTest.log(LogStatus.PASS, "cek alert jabatan");
	}
	
	@And("cek Alert text profile")
	public void CekAlertTextProfile() {
		assertEquals(about.attributinputTextProfile(null), true);
		extentTest.log(LogStatus.PASS, "cek Alert text profile");
	}
	
	@And("cek alert foto")
	public void CekAlertFoto() {
		assertEquals(about.attributinputFile(null), true);
		extentTest.log(LogStatus.PASS, "cek alert foto");
	}
	
	
}
