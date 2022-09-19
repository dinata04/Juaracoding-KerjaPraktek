package com.juaracoding.projectJC.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class Benefit {
private WebDriver driver;
	
	public Benefit() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='sidebar-link sidebar-title']")
	private WebElement subMenu;
	
	@FindBy(xpath = "//a[normalize-space()='Benefit']")
	private WebElement btnBenefit;
	
	@FindBy(xpath = "//a[@class='btn btn-gradient']")
	private WebElement addBenefit;
	
	@FindBy(xpath = "//input[@id='judul_1']")
	private WebElement inputJudul1;
	
	@FindBy(xpath = "//textarea[@name='deskripsi_1']")
	private WebElement txtDeskripsi1;
	
	@FindBy(xpath = "//input[@id='judul_2']")
	private WebElement inputJudul2;
	
	@FindBy(xpath = "//textarea[@name='deskripsi_2']")
	private WebElement txtDeskripsi2;
	
	@FindBy(xpath = "//input[@id='judul_3']")
	private WebElement inputJudul3;
	
	@FindBy(xpath = "//textarea[@name='deskripsi_3']")
	private WebElement txtDeskripsi3;
	
	@FindBy(xpath = "//input[@id='judul_4']")
	private WebElement inputJudul4;
	
	@FindBy(xpath = "//textarea[@name='deskripsi_4']")
	private WebElement txtDeskripsi4;
	
	@FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
	private WebElement slctPublish;
	
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSimpan;

	@FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]/i[1]")
	private WebElement btnEdit;

	@FindBy(xpath = "//input[@id='judul_1']")
	private WebElement editJudul1;

	@FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
	private WebElement slctPublishedit;
	
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSimpanedit;
	
	@FindBy(xpath = "//a[@class='sidebar-link sidebar-title']")
	private WebElement subMenu1;
	
	@FindBy(xpath = "//a[normalize-space()='Benefit']")
	private WebElement btnBenefit1;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchJudul;

	private Select selectpublishedit;
	
	public void ButtonSubMenu() {
		subMenu.click();
	}
	public void ButtonBenefit() {
		btnBenefit.click();
	}
	public void ButtonAdd() {
		addBenefit.click();
	}
	public void inputJudul1(String judul) {
		inputJudul1.sendKeys(judul);		
	}
	public void inputTxtDeskripsi1(String text) {
		txtDeskripsi1.sendKeys(text);		
	}
	public void inputJudul2(String judul) {
		inputJudul2.sendKeys(judul);		
	}
	public void inputTxtDeskripsi2(String text) {
		txtDeskripsi2.sendKeys(text);		
	}
	public void inputJudul3(String judul) {
		inputJudul3.sendKeys(judul);		
	}
	public void inputTxtDeskripsi3(String text) {
		txtDeskripsi3.sendKeys(text);		
	}
	public void inputJudul4(String judul) {
		inputJudul4.sendKeys(judul);		
	}
	public void inputTxtDeskripsi4(String text) {
		txtDeskripsi4.sendKeys(text);		
	}
	public void selectPublish(int index) {
		Select selectpublish = new Select(slctPublish);
		selectpublish.selectByIndex(index);
	}
	public void ButtonSimpan() {
		btnSimpan.click();		
	}
	public void ButtonEdit() {
		btnEdit.click();
	}
	public void editJudul1(String judul) {
		editJudul1.sendKeys(judul);		
	}
	public void selectPublishedit(int index) {
		Select selectpublish = new Select(slctPublishedit);
		selectpublishedit.selectByIndex(index);
	}	
	public void ButtonSimpanedit() {
		btnSimpanedit.click();		
	}
	public void ButtonSubMenu1() {
		subMenu1.click();
	}
	public void ButtonBenefit1() {
		btnBenefit1.click();
	}
	//public void searchJudul(String judul) {
		//searchJudul.sendKeys(judul,Keys.ENTER);		
	//}
	//public Object JudulBenefit() {
		// TODO Auto-generated method stub
		//return null;
	//}


	

		
	

}
