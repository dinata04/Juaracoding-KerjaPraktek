package com.juaracoding.projectJC.Benefit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.juaracoding.projectJC.pages.Benefit;
import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestBenefit {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Benefit benefit = new Benefit();
	
	public TestBenefit() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	//masuk menu benefit
			@When("click sub menu fail")
			public void ClickSubMenufail() {
				Hooks.delay(2);
				benefit.ButtonSubMenu();
				extentTest.log(LogStatus.PASS, "click sub menu fail");
			}
			@And("click benefit menu fail")
			public void ClickBenefitMenufail() {
				benefit.ButtonBenefit();
				extentTest.log(LogStatus.PASS, "click benefit menu fail");
			}

			//add benefit
			@When("click add benefit fail")
			public void clickAddfail() {
				benefit.ButtonAdd();
				extentTest.log(LogStatus.PASS, "click add benefit fail");
			}
			@And("input text judul 1 fail{string}")
			public void inputJudul1fail(String judul) {
				benefit.inputJudul1(judul);
				extentTest.log(LogStatus.PASS, "input judul 1 fail");
			}
			@And("input isi deskripsi 1 fail {string}")
			public void inputTextDeskripsi1fail(String text) {
				benefit.inputTxtDeskripsi1(text);
				extentTest.log(LogStatus.PASS, "input text deskripsi 1 fail");
			}
			@And("select publish fail {int}")
			public void SelectPublishfail(int index) {
				Hooks.scroll(500);
				benefit.selectPublish(index);
				extentTest.log(LogStatus.PASS, "select publish fail");
			}
			@Then("click save fail")
			public void ClickSavefail() {
			Hooks.delay(2);
				//benefit.ButtonSimpan();
				//extentTest.log(LogStatus.PASS, "click save");
				WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
			      //JavaScript Executor to click element
			      JavascriptExecutor j = (JavascriptExecutor) driver;
			      j.executeScript("arguments[0].click();", l);
			      extentTest.log(LogStatus.PASS, "click save fail");
			}
			
	//masuk menu benefit
		@When("click sub menu")
		public void ClickSubMenu() {
			Hooks.delay(2);
			benefit.ButtonSubMenu();
			extentTest.log(LogStatus.PASS, "click sub menu");
		}
		@And("click benefit menu")
		public void ClickBenefitMenu() {
			benefit.ButtonBenefit();
			extentTest.log(LogStatus.PASS, "click benefit menu");
		}

		//add benefit
		@When("click add benefit")
		public void clickAdd() {
			benefit.ButtonAdd();
			extentTest.log(LogStatus.PASS, "click add benefit");
		}
		@And("input text judul 1 {string}")
		public void inputJudul1(String judul) {
			benefit.inputJudul1(judul);
			extentTest.log(LogStatus.PASS, "input judul 1");
		}
		@And("input isi deskripsi 1 {string}")
		public void inputTextDeskripsi1(String text) {
			benefit.inputTxtDeskripsi1(text);
			extentTest.log(LogStatus.PASS, "input text deskripsi 1");
		}
		@And("input text judul 2 {string}")
		public void inputJudul2(String judul) {
			benefit.inputJudul2(judul);
			extentTest.log(LogStatus.PASS, "input judul 2");
		}
		@And("input isi deskripsi 2 {string}")
		public void inputTextDeskripsi2(String text) {
			benefit.inputTxtDeskripsi2(text);
			extentTest.log(LogStatus.PASS, "input text deskripsi 2");
		}
		@And("input text judul 3 {string}")
		public void inputJudul3(String judul) {
			benefit.inputJudul3(judul);
			extentTest.log(LogStatus.PASS, "input judul 3");
		}
		@And("input isi deskripsi 3 {string}")
		public void inputTextDeskripsi3(String text) {
			benefit.inputTxtDeskripsi3(text);
			extentTest.log(LogStatus.PASS, "input text deskripsi 3");
		}
		@And("input text judul 4 {string}")
		public void inputJudul4(String judul) {
			benefit.inputJudul4(judul);
			extentTest.log(LogStatus.PASS, "input judul 4");
		}
		@And("input isi deskripsi 4 {string}")
		public void inputTextDeskripsi4(String text) {
			benefit.inputTxtDeskripsi4(text);
			extentTest.log(LogStatus.PASS, "input text deskripsi 4");
		}
		@And("select publish {int}")
		public void SelectPublish(int index) {
			Hooks.scroll(500);
			benefit.selectPublish(index);
			extentTest.log(LogStatus.PASS, "select publish");
		}
		@Then("click save")
		public void ClickSave() {
		Hooks.delay(2);
			//benefit.ButtonSimpan();
			//extentTest.log(LogStatus.PASS, "click save");
			WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
		      //JavaScript Executor to click element
		      JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("arguments[0].click();", l);
		      extentTest.log(LogStatus.PASS, "click save");
		}
		
		//edit benefit
		@When("click edit")
		public void clickEdit() {
			benefit.ButtonEdit();
			extentTest.log(LogStatus.PASS, "click edit");
		}
		@And("edit text judul 1 {string}")
		public void editJudul1(String judul) {
			benefit.editJudul1(judul);
			extentTest.log(LogStatus.PASS, "input edit judul 1");
		}
		@And("select publish edit {int}")
		public void SelectPublishedit(int index) {
			Hooks.scroll(300);
			benefit.selectPublishedit(index);
			extentTest.log(LogStatus.PASS, "select publish edit");
		}
		@Then("click save edit")
		public void ClickSaveEdit() {
		Hooks.scroll(300);
		Hooks.delay(2);
			//benefit.ButtonSimpan();
			//extentTest.log(LogStatus.PASS, "click save");
			WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
		      //JavaScript Executor to click element
		      JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("arguments[0].click();", l);
		      extentTest.log(LogStatus.PASS, "click save");
		}
		
		//Cek Data
		
	//@When("search judul {string}")
		//public void InputsearchJudul(String judul) {
			//benefit.searchJudul(judul);
			//Hooks.delay(1);
		//	assertEquals(benefit.JudulBenefit(), true);
			//extentTest.log(LogStatus.PASS, "search judul");
	//}
		
}
