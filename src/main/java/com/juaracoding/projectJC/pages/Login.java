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
	
	@FindBy(xpath = "//a[@class='sidebar-link sidebar-title active']")
	private WebElement homejc;
	
	@FindBy(xpath = "//a[normalize-space()='Benefit']")
	private WebElement benefit;
	
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtnSign() {
		btnSign.click();
	}
	
	public String getTxtDashboard() {
		return txtDashboard.getText();
	}

}
