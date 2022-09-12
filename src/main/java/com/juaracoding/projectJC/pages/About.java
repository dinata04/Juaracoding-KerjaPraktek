package com.juaracoding.projectJC.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class About {
	
private WebDriver driver;
	
	public About() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='About']")
	private WebElement btnAbout;
	@FindBy(xpath = "//a[@class='btn btn-gradient']")
	private WebElement btnAddAbout;
	@FindBy(xpath = "//input[@name='uploadedFile']")
	private WebElement inputFile;
	@FindBy(xpath = "//input[@placeholder='Nama Trainer']")
	private WebElement inputNama;
	@FindBy(xpath = "//input[@placeholder='Jabatan']")
	private WebElement inputJabatan;
	@FindBy(xpath = "//textarea[@name='isi_profil']")
	private WebElement txtProfile;
	@FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
	private WebElement slctPublish;
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSimpan;
	@FindBy(xpath = "//input[@placeholder='Search Nama Peserta']")
	private WebElement searchNama;
	@FindBy(xpath = "//b[normalize-space()='Total Search : 1 Data']")
	private WebElement cekAddtrainer;
	@FindBy(xpath = "//figure[2]//a[1]//img[1]")
	private WebElement openTrainer;
	@FindBy(xpath = "//input[@id='filename']")
	private WebElement inputFileUlang;
	@FindBy(xpath = "//input[@placeholder='Nama Trainer']")
	private WebElement inputNamaUlang;
	@FindBy(xpath = "//b[normalize-space()='Total Search : 1 Data']")
	private WebElement cekTrainerEdit;
	@FindBy(xpath = "//alert[@class='alert alert-success']")// edit sama seperti add
	private WebElement AlertSuccesstrainer;
	
	
	public void ButtonAbout() {
		btnAbout.click();
	}
	
	public void AddTrainer() {
		btnAddAbout.click();
	}
	
	public void inputFile(String foto) {
		inputFile.sendKeys(foto);
	}
	
	public void inputNama(String nama) {
		inputNama.sendKeys(nama);
	}
	
	public void inputJabatan(String jabatan) {	//edit sama seperti add
		inputJabatan.sendKeys(jabatan);
	}
	
	public void inputTxtProfile(String text) {
		txtProfile.sendKeys(text);
	}
	
	public void selectPublish(int index) {		//edit sama seperti add
		Select selectpublish = new Select(slctPublish);
		selectpublish.selectByIndex(index);
	}
	
	public void ButtonSimpan() {				//edit sama seperti add
		btnSimpan.click();
	}
	
	public void searchNamaTrainer(String nama) {
		searchNama.sendKeys(nama,Keys.ENTER);	
	}
	
	public boolean cekAddTrainer() {
		return cekAddtrainer.isDisplayed();
	}
	
	public void openTrainer() {
		openTrainer.click();
	}
	
	public void inputFileUlang(String foto) {
		inputFileUlang.sendKeys(foto);
	}
	
	public void inputNamaUlang(String nama) {
		inputNamaUlang.sendKeys(nama);
	}
	
	public boolean cekTrainerEdit() {
		return cekTrainerEdit.isDisplayed();
	}
	
	public boolean alertSuccessTrainer() {
		return AlertSuccesstrainer.isDisplayed();
	}
	
}
