package com.juaracoding.projectJC.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class Login {
	
	private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSign;
	
	@FindBy(xpath = "//li[contains(text(),'Dashboard')]")
	private WebElement txtDashboard;
	
	@FindBy(xpath = "//div[@id='swal2-html-container'] ")	
	private WebElement alertLogin;
	
	@FindBy(xpath = "//p[@class='alert alert-warning']")
	private WebElement txtInvalid;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement btnOK;
	
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtnSign() {
		btnSign.click();
	}
	
	public void clickBtnOk() {
		btnOK.click();
	}
	
	public String getTxtDashboard() {
		return txtDashboard.getText();
	}
	
	public String getTxtInvalid() {
		return txtInvalid.getText();
	}
	
	public String getTxtAlertLogin() {
		return alertLogin.getText();
	}

}
