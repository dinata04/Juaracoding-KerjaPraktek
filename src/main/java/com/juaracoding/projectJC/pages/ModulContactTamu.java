package com.juaracoding.projectJC.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class ModulContactTamu {
	
	private WebDriver driver;
	
	public ModulContactTamu() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Contact']")
	private WebElement btnContact;
	
	//kolom form
	@FindBy(xpath="//h4[@class='fc-gray text-center m-4 text-center']")
	private WebElement txtJudulContact;
	
	@FindBy(xpath="//input[@placeholder='Your Full Name']")
	private WebElement fullname;
	
	@FindBy(xpath="//input[@placeholder='Enter email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Your Mobile Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//input[@placeholder='Your Subject']")
	private WebElement subject;
	
	@FindBy(xpath="//textarea[@placeholder='Your Message']")
	private WebElement message;
	
	@FindBy(xpath="//button[normalize-space()='Send Message']")
	private WebElement btnSendMessage;
	
	
	//text validasi
	@FindBy(xpath="//alert[@class='alert-success']")
	private WebElement txtSuksesSend;
	
	@FindBy(xpath="//div[@class='invalid-feedback'][normalize-space()='The name field is required.']")
	private WebElement txtNamaKosong;
	
	@FindBy(xpath="//div[@class='invalid-feedback'][normalize-space()='The email field is required.']")
	private WebElement txtEmailKosong;
	
	@FindBy(xpath="//div[contains(@class,'invalid-feedback')][normalize-space()='The phone field is required.']")
	private WebElement txtNomorKosong;
	
	@FindBy(xpath="//div[@class='invalid-feedback'][normalize-space()='The subject field is required.']")
	private WebElement txtSubjectKosong;
	
	public void clickBtnContact() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		btnContact.click();
	}
	
	public String getTxtJudulContact() {
		return txtJudulContact.getText();
	}
	
	//TCC.JC.177 => case mengisi nama dengan huruf
	//TCC.JC.180 => case mengisi email dengan huruf
	//TCC.JC.183 => case mengisi phone number dengan angka
	//TCC.JC.186 => case mengisi subject
	//TCC.JC.188 => case mengisi message
	//TCC.JC.190 => case send message ke contact
	public void formFull() {
		this.fullname.sendKeys("erbina");
		this.email.sendKeys("erbinaselviia@gmail.com");
		this.phoneNumber.sendKeys("081260911455");
		this.subject.sendKeys("Test");
		this.message.sendKeys("Mencoba Hal Baru");
	}
	
	public void btnSendMessage() {
		btnContact.click();
	}
	
	public String getTxtSuksesSend() {
		return txtSuksesSend.getText();
	}
	
	//TCC.JC.178 => case mengisi nama dengan angka
	public void formNamaAngka() {
		this.fullname.sendKeys("1234");
		this.email.sendKeys("erbinaselviia@gmail.com");
		this.phoneNumber.sendKeys("081260911455");
		this.subject.sendKeys("Test");
		this.message.sendKeys("Mencoba Hal Baru");
		btnContact.click();
	}

	//TCC.JC.179 => case tidak mengisi nama
	public void formNamaKosong() {
		this.fullname.sendKeys("");
		this.email.sendKeys("erbinaselviia@gmail.com");
		this.phoneNumber.sendKeys("081260911455");
		this.subject.sendKeys("Test");
		this.message.sendKeys("Mencoba Hal Baru");
		btnContact.click();
	}
	
	//validasi nama kosong
	public String getValidasiNameKosong() {
		return txtNamaKosong.getText();
	}
	
	//TCC.JC.181 => case mengisi email dengan angka
	public void formEmailAngka() {
		this.fullname.sendKeys("erbina");
		this.email.sendKeys("123");
		this.phoneNumber.sendKeys("081260911455");
		this.subject.sendKeys("Test");
		this.message.sendKeys("Mencoba Hal Baru");
		btnContact.click();
	}
	
	//TCC.JC.182 => case tidak mengisi email
	public void formEmailKosong() {
		this.fullname.sendKeys("erbina");
		this.email.sendKeys("");
		this.phoneNumber.sendKeys("081260911455");
		this.subject.sendKeys("Test");
		this.message.sendKeys("Mencoba Hal Baru");
		btnContact.click();
	}

	//validasi email kosong
	public String getValidasiEmailKosong() {
		return txtEmailKosong.getText();
	}
	
	//TCC.JC.184 => case mengisi phone number dengan huruf
	public void formNomorHuruf() {
		this.fullname.sendKeys("erbina");
		this.email.sendKeys("binas@gmail.com");
		this.phoneNumber.sendKeys("ABCD");
		this.subject.sendKeys("Test");
		this.message.sendKeys("Mencoba Hal Baru");
		btnContact.click();
	}
	
	//TCC.JC.185 => case tidak mengisi phone number
	public void formNomorKosong() {
		this.fullname.sendKeys("erbina");
		this.email.sendKeys("bina@gmail.com");
		this.phoneNumber.sendKeys("");
		this.subject.sendKeys("Test");
		this.message.sendKeys("Mencoba Hal Baru");
		btnContact.click();
	}
	
	//validasi phone number kosong
	public String getValidasiNomorKosong() {
		return txtNomorKosong.getText();
	}
	
	//TCC.JC.187 => case tidak mengisi subject
	public void formSubjectKosong() {
		this.fullname.sendKeys("erbina");
		this.email.sendKeys("bina@gmail.com");
		this.phoneNumber.sendKeys("123456789");
		this.subject.sendKeys("");
		this.message.sendKeys("Mencoba Hal Baru");
		btnContact.click();
	}
	
	// validasi email kosong
	public String getValidasiSubjectKosong() {
		return txtSubjectKosong.getText();
	}

	//TCC.JC.189 => case tidak mengisi message
	public void formMessageKosong() {
		this.fullname.sendKeys("erbina");
		this.email.sendKeys("bina@gmail.com");
		this.phoneNumber.sendKeys("123456789");
		this.subject.sendKeys("Coba");
		this.message.sendKeys("");
		btnContact.click();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
