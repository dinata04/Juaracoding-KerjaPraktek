package com.juaracoding.projectJC.pages;

import org.openqa.selenium.Keys;
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
	
	//masukan username
	public void txtUsername(String username) {
		this.username.sendKeys(username);
	}
	
	//masukan password
	public void txtPassword(String password) {
		this.password.sendKeys(password);
	}
	
	//button sign in
	public void clickBtnSign() {
		btnSign.click();
	}
	
	//validasi berhasil masuk
	public String getTxtDashboard() {
		return txtDashboard.getText();
	}
	
	// menu contact tamu
	@FindBy(xpath = "//span[normalize-space()='Contact Messages']")
	private WebElement btnContact;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[1]")
	private WebElement txtHasilSearch;
	
	//button contact
	public void clickBtnContact() {
		btnContact.click();
	}
	
	//seacrh data
	public void searchData(String kata) {
		this.btnSearch.sendKeys(kata,Keys.ENTER);
	}
	
	public String getTxtHasilSearch() {
		return txtHasilSearch.getText();
	}
}