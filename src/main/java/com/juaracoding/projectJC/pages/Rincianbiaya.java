package com.juaracoding.projectJC.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class Rincianbiaya {
	
private WebDriver driver;
	
	public Rincianbiaya() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	//web admin
	@FindBy(xpath = "//a[@class='sidebar-link sidebar-title active']")
	private WebElement subMenu;
	
	@FindBy(xpath = "//a[normalize-space()='Rincian Biaya']")
	private WebElement btnRincianbiaya;
	
	@FindBy(xpath = "//a[@class='btn btn-gradient']")
	private WebElement addRicianbiaya;
	
	@FindBy(xpath = "//input[@id='nama']")
	private WebElement inputNamaprogram;
	
	@FindBy(xpath = "//input[@id='harga']")
	private WebElement inputHarganormal;
	@FindBy(xpath = "//input[@id='harga']")
	private WebElement increaseValueharga;
	@FindBy(xpath = "//input[@id='harga']")
	private WebElement decreaseValueharga;
	
	@FindBy(xpath = "//input[@id='diskonid']")
	private WebElement inputDiskon;
	@FindBy(xpath = "//input[@id='diskonid']")
	private WebElement increaseValuediskon;
	@FindBy(xpath = "//input[@id='diskonid']")
	private WebElement decreaseValuediskon;
	
	@FindBy(xpath = "//input[@name='totalharga']")
	private WebElement viewTotalharga;
	
	@FindBy(xpath = "//input[@name='keunggulan1']")
	private WebElement txtKeunggulan1;
	@FindBy(xpath = "//input[@name='keunggulan2']")
	private WebElement txtKeunggulan2;
	@FindBy(xpath = "//input[@name='keunggulan3']")
	private WebElement txtKeunggulan3;
	@FindBy(xpath = "//input[@name='keunggulan4']")
	private WebElement txtKeunggulan4;
	@FindBy(xpath = "//input[@name='keunggulan5']")
	private WebElement txtKeunggulan5;
	
	@FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
	private WebElement slctPublish;
	
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSimpan;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchNama;
	
	public void ButtonSubMenu() {
		subMenu.click();
	}
	
	public void ButtonRincianbiaya() {
		btnRincianbiaya.click();
	}
	public void ButtonAdd() {
		addRicianbiaya.click();
		
	}
	public void inputNamaprogram(String namaprogram) {
		inputNamaprogram.sendKeys(namaprogram);
	}
	
	public void inputHarganormal(String harga) {
		inputHarganormal.sendKeys(harga);
	}
	public void increaseValueharga(int increasevalueharga) {
		increaseValueharga.sendKeys(Keys.ARROW_UP);
	}
	public void decreaseValueharga(int decreasevalueharga) {
		decreaseValueharga.sendKeys(Keys.ARROW_UP);
	}
	
	public void inputDiskon(String diskon) {
		inputDiskon.sendKeys(diskon);
	}
	public void increaseValuediskon(int increasevaluediskon) {
		increaseValuediskon.sendKeys(Keys.ARROW_UP);
	}
	public void decreaseValuediskon(int decreasevaluediskon) {
		decreaseValuediskon.sendKeys(Keys.ARROW_UP);
	}
	
	public void viewTotalharga(String text) {
		viewTotalharga.sendKeys(text);
	}
	
	public void inputTxtkeunggulan1(String text) {
		txtKeunggulan1.sendKeys(text);
	}
	
	public void inputTxtkeunggulan2(String text) {
		txtKeunggulan2.sendKeys(text);
	}
	
	public void inputTxtkeunggulan3(String text) {
		txtKeunggulan3.sendKeys(text);
	}
	
	public void inputTxtkeunggulan4(String text) {
		txtKeunggulan4.sendKeys(text);
	}
	
	public void inputTxtkeunggulan5(String text) {
		txtKeunggulan5.sendKeys(text);
	}
	
	public void selectPublish(int index) {
		Select selectpublish = new Select(slctPublish);
		selectpublish.selectByIndex(index);
	}
	
	public void ButtonSimpan() {
		btnSimpan.click();		
	}
	
	public void searchJudul(String judul) {
		searchNama.click();		
	}

	public Object Namaprogram() {
		// TODO Auto-generated method stub
		return null;
	}
}
