package com.juaracoding.projectJC.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.projectJC.drivers.DriverSingleton;


public class Testimonial {

	private WebDriver driver;
	
	public Testimonial() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	//Web Admin
	@FindBy(xpath = "//a[@class=\"sidebar-link sidebar-title\"]")
	private WebElement subMenu ;
	@FindBy(xpath = "//a[normalize-space()='Testimonial']")
	private WebElement btnTestimonial;
	@FindBy(xpath = "//a[@class='btn btn-gradient']")
	private WebElement addTestimonial;
	@FindBy(xpath = "//input[@name='uploadedFile']")
	private WebElement inputFile;
	@FindBy(xpath = "//input[@placeholder='Nama Peserta']")
	private WebElement inputNamaPeserta;
	@FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
	private WebElement slctPublish;
	@FindBy(xpath = "//textarea[@name='body']")
	private WebElement txtTestimonial;
	@FindBy(xpath = "//select[@id='rating']")
	private WebElement SlctRating;
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSimpan;
	@FindBy(xpath = "//input[@placeholder='Search Nama Peserta']")
	private WebElement searchNama;
	@FindBy(xpath = "//b[normalize-space()='Total Search : 1 Data']")// ganti nama testernya ke nama
	private WebElement cekPesertaAdd;
	@FindBy(xpath = "//figure[@class='col-xl-3 col-sm-6']")
	private WebElement openPeserta;
	@FindBy(xpath = "//input[@id='filename']")
	private WebElement inputFileUlang;
	@FindBy(xpath = "//input[@id='nama']")
	private WebElement inputNamaUlang;
	@FindBy(xpath = "//textarea[@id='summernote']")
	private WebElement txtTestimonialUlang;
	@FindBy(xpath = "//b[normalize-space()='Total Search : 1 Data']")
	private WebElement cekPesertaEdit;
	@FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
	private WebElement AlertisiTestimonialulang;
	@FindBy(xpath = "//p[normalize-space()='Controller or its method is not found: {0}::{1}']")
	private WebElement AlertFoto;
	//Web JC
	@FindBy(xpath="//p[normalize-space()='ini isi testimonialnya']")
	private WebElement isiTestimonialJc;
	
	
	public void ButtonSubMenu() {
		subMenu.click();
	}
	
	public void ButtonTestimonial() {
		btnTestimonial.click();
	}
	
	public void ButtonAdd() {
		addTestimonial.click();
	}
	
	public void inputFile(String foto) {
		inputFile.sendKeys(foto);
	}
	
	public void inputNama(String nama) {
		inputNamaPeserta.sendKeys(nama);
	}
	
	public void selectPublish(int index) {				//	select edit sama seperti add
		Select selectpublish = new Select(slctPublish);
		selectpublish.selectByIndex(index);
	}
	
	public void inputTxtTestimonial(String isiText) {	//	edit sama seperti add
		txtTestimonial.sendKeys(isiText);
	}

	public void selectRating(int index) {				//	select edit sama seperti add
		Select selectrating = new Select(SlctRating);
		selectrating.selectByIndex(index);
	}
	
	public void ButtonSimpan() {						//	edit sama seperti add
		btnSimpan.click();
	}
	
	public void SearchNamaPeserta(String nama) {
		searchNama.sendKeys(nama,Keys.ENTER);
	}
	
	public boolean NamaPesertaTestimonial() {
		return cekPesertaAdd.isDisplayed();
	}
	
	public void OpenPeserta() {
		openPeserta.click();
	}
	
	public void inputFileUlang(String foto) {
		inputFileUlang.sendKeys(foto);
	}
	
	public void inputNamaUlang(String nama) {
		inputNamaUlang.sendKeys(nama);
	}
	
	public void inputTxtTestimonialUlang(String text) {
		txtTestimonialUlang.sendKeys(text);
	}

	public boolean NamaPesertaEditTestimonial() {
		return cekPesertaEdit.isDisplayed();
	}

	public boolean AlertIsiTestimonialUlang() {			//	ini boolean
		return AlertisiTestimonialulang.isDisplayed();
	}
	
	public boolean AlertFoto() {						//	ini boolean
		return AlertFoto.isDisplayed();
	}
	
	public boolean isiTestimonialJC() {					//	ini boolean
		return isiTestimonialJc.isDisplayed();
	}
	
	public void clearNamaPesertaEdit() {				//	hapus nama edit
		inputNamaUlang.clear();		
	}
	
	public void clearisiTestimonialPesertaEdit() {		//	hapus testimonial edit
		txtTestimonialUlang.clear();
		}
	
	public void clearinputFilePesertaEdit() {			//	hapus foto edit
		inputFileUlang.clear();
		}
	
}
