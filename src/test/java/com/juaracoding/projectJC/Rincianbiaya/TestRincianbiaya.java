package com.juaracoding.projectJC.Rincianbiaya;

import static org.testng.Assert.assertEquals;

//import java.awt.desktop.AboutEvent;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Rincianbiaya;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;

public class TestRincianbiaya {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Rincianbiaya rincianbiaya = new Rincianbiaya();
	
	public TestRincianbiaya() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//masuk menu rincianbiaya
	@When("click sub menu")
	public void ClickSubmenu() {
		Hooks.delay(3);
		rincianbiaya.ButtonSubMenu();
		extentTest.log(LogStatus.PASS, "click sub menu");
		
	}
	
	@And("click rincianbiaya menu")
	public void ClickRincianbiayamenu () {
		rincianbiaya.ButtonRincianbiaya();
		extentTest.log(LogStatus.PASS, "click rincianbiaya menu");
		
	}

	//add rincian biaya
	@When ("click add")
	public void clickAdd () {
		rincianbiaya.ButtonAdd();
		extentTest.log(LogStatus.PASS, "click add");
	}
	@And("input text nama program {string}")
	public void inputNamaprogram(String namaprogram) {
		rincianbiaya.inputNamaprogram(namaprogram);
		extentTest.log(LogStatus.PASS, "input text nama program");
	}
	
	@And("input text harga normal")
	public void inputHarganormal(String harga) {
		rincianbiaya.inputHarganormal(harga);
		extentTest.log(LogStatus.PASS, "input text harga normal");
	}
	
	@And("click add increase harga")
	public void increaseValueharga(int increasevalueharga) {
		rincianbiaya.increaseValueharga(increasevalueharga);
		extentTest.log(LogStatus.PASS, "click add increase harga");
	}
	
	@And("click add decrease harga")
	public void decreaseValueharga(int decreasevalueharga) {
		rincianbiaya.decreaseValueharga(decreasevalueharga);
		extentTest.log(LogStatus.PASS, "click add decrease harga");
	}
	
	@And("input text diskon")
	public void inputDiskon(String diskon) {
		rincianbiaya.inputNamaprogram(diskon);
		extentTest.log(LogStatus.PASS, "input text diskon");
	}
	
	@And("click add increase diskon")
	public void increaseValuediskon(int increasevaluediskon) {
		rincianbiaya.increaseValuediskon(increasevaluediskon);
		extentTest.log(LogStatus.PASS, "click add increase harga");
	}
	
	@And("click add decrease diskon")
	public void decreaseValuediskon(int decreasevaluediskon) {
		rincianbiaya.decreaseValuediskon(decreasevaluediskon);
		extentTest.log(LogStatus.PASS, "click add decrease harga");
	}
	
	@And("show text harga setelah diskon")
	public void viewTotalharga(String totalharga) {
		rincianbiaya.viewTotalharga(totalharga);
		extentTest.log(LogStatus.PASS, "show text harga setelah diskon");
	}
	
	@And("input text keunggulan1 {string}")
	public void inputTxtkeunggulan1(String keunggulan1) {
		rincianbiaya.inputTxtkeunggulan1(keunggulan1);
		extentTest.log(LogStatus.PASS, "input text keunggulan1");
	}
	
	@And("input text keunggulan2 {string}")
	public void inputTxtkeunggulan2(String keunggulan2) {
		rincianbiaya.inputTxtkeunggulan2(keunggulan2);
		extentTest.log(LogStatus.PASS, "input text keunggulan2");
	}
	
	@And("input text keunggulan3 {string}")
	public void inputTxtkeunggulan3(String keunggulan3) {
		rincianbiaya.inputTxtkeunggulan3(keunggulan3);
		extentTest.log(LogStatus.PASS, "input text keunggulan3");
	}
	
	@And("input text keunggulan4 {string}")
	public void inputTxtkeunggulan4(String keunggulan4) {
		rincianbiaya.inputTxtkeunggulan4(keunggulan4);
		extentTest.log(LogStatus.PASS, "input text keunggulan4");
	}
	
	@And("input text keunggulan5 {string}")
	public void inputTxtkeunggulan5(String keunggulan5) {
		rincianbiaya.inputTxtkeunggulan5(keunggulan5);
		extentTest.log(LogStatus.PASS, "input text keunggulan5");
	}
	
	@And("select publish {int}")
	public void SelectPublish(int index) {
		Hooks.scroll(200);
		rincianbiaya.selectPublish(index);
		extentTest.log(LogStatus.PASS, "select publish");
	}
	
	@Then("click save")
	public void ClickSave() {
	Hooks.delay(2);
		rincianbiaya.ButtonSimpan();
		extentTest.log(LogStatus.PASS, "click save");
	}
	
	//Cek Data
			@When("search name {string}")
			public void InputsearchJudul(String judul) {
				rincianbiaya.searchJudul(judul);
				Hooks.delay(1);
				assertEquals(rincianbiaya.Namaprogram(), true);
				extentTest.log(LogStatus.PASS, "search judul");
			}
}