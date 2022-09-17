package com.juaracoding.projectJC.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class Blog {
	
private WebDriver driver;
	
	public Blog() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Add Blog
	@FindBy(xpath = "//span[normalize-space()='Blog']")
	private WebElement btnBlog;
	
	@FindBy(xpath = "//a[@class='btn btn-gradient']")
	private WebElement btnAdd;
	
	@FindBy(xpath = "//input[@name='uploadedFile']")
	private WebElement chooseFile;
	
	@FindBy(xpath = "//input[@id='judul']")
	private WebElement inputjudul;
	
	@FindBy(xpath = "//*[@id=\"exampleFormControlSelect9\"]")
	private WebElement selectPublish;
	
	@FindBy(xpath = "//*[@id=\"exampleFormControlSelect9\"]")
	private WebElement selectSetHome;
	
	@FindBy(xpath = "//textarea[@name='body_preview']")
	private WebElement contentPreview;
	
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement content;
	
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSimpan;
	
//	Edit Blog
	@FindBy(xpath = "//h4[normalize-space()='Belajar SQA1']")
	private WebElement btnEditBlog;
	
	@FindBy(xpath = "//input[@value='Pilih Gambar Ulang']")
	private WebElement btnPilihGmbrUlang;
	
	@FindBy(xpath = "//textarea[@name='body_preview']")
	private WebElement isiContentPreviewUlang;
	
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement isiContentUlang;
	
//	Search Blog
	@FindBy(xpath = "//input[@placeholder='Search Judul']")
	private WebElement searchBlog;
	
	
//	Alert validation
	@FindBy(xpath = "//alert[@class='alert alert-success']")
	private WebElement alsertSuccess;
	
	@FindBy(xpath = "//b[normalize-space()='Total Search : 2 Data']")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
	private WebElement alertForm;
	
	@FindBy(xpath = "//h4[normalize-space()='Belajar SQA1']")
	private WebElement txtSuccessEdit;
	
//	search blog
	public void searchBlog(String keyword) {
		searchBlog.sendKeys(keyword, Keys.ENTER);
	}
	
	public String getTxtSearch() {
		return txtSearch.getText();
	}
	
//	Add Blog
	public void clickMenuBlog() {
		btnBlog.click();
	}
	
	public void clickBtnAdd() {
		btnAdd.click();
	}
	
	public void chooseFile(String foto) {
		chooseFile.sendKeys(foto);
	}
	
	public void inputJudul(String judul) {
		inputjudul.sendKeys(judul);
	}
	
	public void selectPublish(String value) {
		Select select = new Select(selectPublish);
		select.selectByValue(value);
		
	}
	
	public void selectSetHome(String value) {
		Select select = new Select(selectSetHome);
		select.selectByValue(value);
		
	}
	
	public void inputContentPreview(String contenPreview) {
		contentPreview.sendKeys(contenPreview);
	}
	
	public void inputContent(String isiContent) {
		content.sendKeys(isiContent);
	}
	
	public void clickBtnSimpan() {
		btnSimpan.click();
	}
	
//	edit
	public void clickBtnGmbrUlang() {
		btnPilihGmbrUlang.click();
	}
	
	public void clickBtnEdit() {
		btnEditBlog.click();
	}
	
	public void clearContentPreview() {
		isiContentPreviewUlang.clear();
	}
	
	public void clearContent() {
		isiContentUlang.clear();
	}
	
//	Alert validation
	public String viewAlertSuccess() {
		return alsertSuccess.getText();
	}
	
	public String viewAlertForm() {
		return alertForm.getText();
	}
	
	public String getTxtSuccessEdit() {
		return txtSuccessEdit.getText();
	}
	
	
}
