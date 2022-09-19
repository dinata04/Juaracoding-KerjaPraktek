package com.juaracoding.projectJC.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class DetailDataContact {

	private WebDriver driver;
	
	public DetailDataContact() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[1]")
	private WebElement txtnama;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]")
	private WebElement txtNumber;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[4]")
	private WebElement txtSubject;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]")
	private WebElement txtMessage;
	
	@FindBy(xpath = "//span[@aria-hidden='true']")
	private WebElement btnNext;
	
	@FindBy(xpath = "//span[normalize-space()='«']")
	private WebElement btnPrev;
	
	public String getTxtName() {
		return txtnama.getText();
	}
	
	public String getTxtEmail() {
		return txtEmail.getText();
	}
	
	public String getTxtNumber() {
		return txtNumber.getText();
	}
	
	public String getTxtSubject() {
		return txtSubject.getText();
	}
	
	public String getTxtMessage() {
		return txtMessage.getText();
	}
	
	public void clickBtnNext() {
		btnNext.click();
	}
	
	public void clickBtnPrev() {
		btnPrev.click();
	}
}
