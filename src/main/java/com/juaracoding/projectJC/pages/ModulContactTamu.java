package com.juaracoding.projectJC.pages;

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
	
	@FindBy(xpath = "//input[@placeholder='Your Full Name']")
	private WebElement fullname;
	
	@FindBy(xpath = "//input[@placeholder='Enter email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Your Mobile Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//input[@placeholder='Your Subject']")
	private WebElement subject;
	
	@FindBy(xpath = "//textarea[@placeholder='Your Message']")
	private WebElement message;
	
	@FindBy(xpath = "//button[normalize-space()='Send Message']")
	private WebElement btnSendMessage;
	
	//text validasi	
	@FindBy(xpath = "//alert[@class='alert-success']")
	private WebElement txtSuksesSend;
	
	@FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='The name field is required.']")
	private WebElement txtNamaKosong;
	
	
	@FindBy(xpath = "//section[contains(@class,'')]//div[2]//div[1]")
	private WebElement txtEmailAngka;
	
	@FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='The email field is required.']")
	private WebElement txtEmailKosong;
	
	@FindBy(xpath = "//div[contains(@class,'invalid-feedback')][normalize-space()='The phone field is required.']")
	private WebElement txtNomorKosong;
	
	@FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='The subject field is required.']")
	private WebElement txtSubjectKosong;
	
	//mengisi nama
	public void txtName(String name) {
		this.fullname.sendKeys(name);
	}
	
	//mengisi email
	public void txtEmail(String emails) {
		this.email.sendKeys(emails);
	}
	
	//mengisi phone number
	public void txtNumber(String numbers) {
		this.phoneNumber.sendKeys(numbers);
	}
	
	//mengisi subject
	public void txtSubject(String subjects) {
		this.subject.sendKeys(subjects);
	}
	
	//mengisi message
	public void txtMessage(String messages) {
		this.message.sendKeys(messages);
	}
	
	//send message ke contact
	public void btnSendMessage() {
		btnSendMessage.click();
	}
	
	//validasi sukses send message
	public String getTxtSuksesSend() {
		return txtSuksesSend.getText();
	}
	
	//validasi nama kosong
	public String getValidasiNameKosong() {
		return txtNamaKosong.getText();
	}
	
	//validasi email angka
	public String getValidasiEmailAngka() {
		return txtEmailAngka.getText();
	}
	//validasi email kosong
	public String getValidasiEmailKosong() {
		return txtEmailKosong.getText();
	}
	
	//validasi phone number kosong
	public String getValidasiNomorKosong() {
		return txtNomorKosong.getText();
	}
	
	// validasi email kosong
	public String getValidasiSubjectKosong() {
		return txtSubjectKosong.getText();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}