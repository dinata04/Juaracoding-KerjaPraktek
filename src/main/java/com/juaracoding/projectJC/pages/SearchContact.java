package com.juaracoding.projectJC.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class SearchContact {

	private WebDriver driver;
	
	public SearchContact() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@name='st']")
	private WebElement listKategori;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement btnSeacrhValue;
	
	// validasi
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[1]")
	private WebElement txtResultNoName;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")
	private WebElement txtResultNameTwo;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[1]")
	private WebElement txtResulName;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]")
	private WebElement txtResultNoEmail;

	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]")
	private WebElement txtResultEmail;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]")
	private WebElement txtResultNoNumber;
	
	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]")
	private WebElement txtResultNumber;

	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[4]")
	private WebElement txtResultNoSubject;

	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[4]")
	private WebElement txtResultSubject;

	@FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]")
	private WebElement txtResultMessage;

	public void pilihKategori(String kategori, int pilihan) {
		Select selectKategori = new Select(listKategori);
		selectKategori.selectByVisibleText(kategori);
		selectKategori.selectByIndex(pilihan);
		listKategori.click();
	}
	
	// seacrh data
	public void searchData(String kata) {
		this.btnSeacrhValue.sendKeys(kata, Keys.ENTER);
	}
	
	public String getResultNoName() {
		return txtResultNoName.getText();
	}
	
	public String getResultName() {
		return txtResulName.getText();
	}
	
	public String getResultNameTwo() {
		return txtResultNameTwo.getText();
	}
	
	public String getResultNoEmail() {
		return txtResultNoEmail.getText();
	}
	
	public String getResultEmail() {
		return txtResultEmail.getText();
	}
	
	public String getResultNoNumber() {
		return txtResultNoNumber.getText();
	}
	
	public String getResultNumber() {
		return txtResultNumber.getText();
	}
	
	public String getResultNoSubject() {
		return txtResultNoSubject.getText();
	}
	
	public String getResultSubject() {
		return txtResultSubject.getText();
	}
	
	public String getResultMessage() {
		return txtResultMessage.getText();
	}
}
