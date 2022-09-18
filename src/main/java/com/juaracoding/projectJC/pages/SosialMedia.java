package com.juaracoding.projectJC.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.projectJC.drivers.DriverSingleton;

public class SosialMedia {

	private WebDriver driver;
	
	public SosialMedia() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='sidebar-link sidebar-title active']")
	private WebElement btnListMenu;
	
	@FindBy(xpath = "//*[@id=\"link_fb\"]")
	private WebElement facebook;

	@FindBy(xpath = "//*[@id=\"link_ig\"]")
	private WebElement instagram;
	
	@FindBy(xpath = "//*[@id=\"link_youtube\"]")
	private WebElement youtube;
	
	@FindBy(xpath = "//*[@id=\"link_wa\"]")
	private WebElement whatsapp;
	
	@FindBy(xpath = "//*[@id=\"frmregister\"]/div[3]/input")
	private WebElement btnSave;
	
	// validasi teks
	@FindBy(xpath = "//h3[normalize-space()='Social Media']")
	private WebElement txtSosialMedia;
	
	@FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[1]/div/div[2]")
	private WebElement linkFbEmpaty;
	
	@FindBy(xpath = "//*[@id=\"frmregister\"]/alert")
	private WebElement txtSukses;
	
	@FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[4]/div/div[2]")
	private WebElement linkWaEmpaty;
	
	public void pilihMenu(String menu, int pilihan) {
		Select selectMenu = new Select(btnListMenu);
		selectMenu.selectByVisibleText(menu);
		selectMenu.selectByIndex(pilihan);
		btnListMenu.click();
	}
	
	public String getValidasiSosialMedia() {
		return txtSosialMedia.getText();
	}
	
	public void clickBtnSave() {
		btnSave.click();
	}
	
	//facebook
	public void deleteFacebook() {
		facebook.clear();
	}
	
	public void inputFacebook(String link_fb) {
		this.facebook.sendKeys(link_fb);
	}
	
	//validasi kosong link fb
	public String getValidasiFb() {
		return linkFbEmpaty.getText();
	}
	
	//instagram
	public void deleteInstagram() {
		instagram.clear();
	}
	
	public void inputInstagram(String link_ig) {
		this.instagram.sendKeys(link_ig);
	}
	
	//validasi instrgram
	public String getValidasiIg() {
		return txtSukses.getText();
	}
	
	//youtube
	public void deleteYoutube() {
		youtube.clear();
	}
	
	public void inputYoutube(String link_yt) {
		this.youtube.sendKeys(link_yt);
	}
	
	//validasi youtube
	public String getValidasiYt() {
		return txtSukses.getText();
	}
	
	//whatsapp
	public void deleteWa() {
		whatsapp.clear();
	}
	
	public void inputWa(String wa) {
		this.whatsapp.sendKeys(wa);
	}
	
	//validasi
	public String getValidasiWa() {
		return linkWaEmpaty.getText();
	}
	
	//validasi sukses
	public String getValidasiSukses() {
		return txtSukses.getText();
	}
}
