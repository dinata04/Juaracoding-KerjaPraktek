package com.juaracoding.projectJC.ModulBlog;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.juaracoding.projectJC.ModulBlog.Hooks;
import com.juaracoding.projectJC.pages.Blog;
import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;

public class TestBlog {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Blog blog = new Blog();
	private Login login = new Login();
	
	public TestBlog() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User go to web JC")
	public void user_go_to_web_JC() {
		driver.get(Constants.URLOne);
		extentTest.log(LogStatus.PASS, "User go to web JC");
	}
	
	@And("User login")
	public void user_input_username_password() {
		Hooks.delay(2);
		login.login("ucen1315@gmail.com", "a");
		login.clickBtnSign();
		extentTest.log(LogStatus.PASS, "User login");
	}
	

//show Menu Blog
	@When("click menu blog")
	public void clickTestimonialmenu() {
		Hooks.delay(2);
		blog.clickMenuBlog();
		extentTest.log(LogStatus.PASS, "click menu blog");
		
	}
	
//	Search by keyword
	@When("input keyword")
	public void inputKeyword() {
		blog.searchBlog("belajar SQA");
		extentTest.log(LogStatus.PASS, "input keyword");
	}
	
	@Then("validation search")
	public void validationKeyword() {
		assertEquals(blog.getTxtSearch(), "Total Search : 3 Data");
		extentTest.log(LogStatus.PASS, "validation keyword");
	}
	
	
//	Add Blog
//	no choose foto
	@When("click button tambah1")
	public void click_button_tambah1() {
		Hooks.delay(1);
		blog.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button tambah1");
	}
	
	@And("no choose foto")
	public void noChooseFoto() {
		Hooks.delay(1);
		blog.inputJudul("Belajar SQA1");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("1");
		Hooks.delay(1);
		blog.inputContentPreview("memahami SQA");
		Hooks.delay(1);
		blog.inputContent("Test SQA");
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "no choose foto");
		
	}
	
	@Then("click button simpan1")
	public void btnSimpan1() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan");
	}
	
	
//	Add Blog
//	No input Judul
	@When("click button tambah2")
	public void click_button_tambah2() {
		blog.clickMenuBlog();
		Hooks.delay(1);
		blog.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button tambah2");
	}
	
	@And("no input judul")
	public void noInputJudul() {
		Hooks.delay(1);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\android.jpg");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("0");
		Hooks.delay(1);
		blog.inputContentPreview("memahami SQA");
		Hooks.delay(1);
		blog.inputContent("Test SQA");
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "no input judul");
		
	}
	
	@And("click button simpan2")
	public void btnSimpan2() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan2");
	}
	
	@Then("validation no input judul")
	public void validationNoInputJudul() {
		assertEquals(blog.viewAlertForm(), "Harap isi judul");
		extentTest.log(LogStatus.PASS, "validation no input judul");
	}
	
	
//	Add vlog
//	No input content preview
	@When("click button tambah3")
	public void click_button_tambah3() {
		blog.clickMenuBlog();
		Hooks.delay(1);
		blog.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button tambah3");
	}
	
	@And("no input content preview")
	public void noInputContentPreview() {
		Hooks.delay(1);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\android.jpg");
		Hooks.delay(1);
		blog.inputJudul("Belajar SQA Baru");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("1");
		Hooks.delay(1);
		blog.inputContent("Test SQA");
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "no input content preview");
		
	}
	
	@And("click button simpan3")
	public void btnSimpan3() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan2");
	}
	
	@Then("validation no input conten preview")
	public void validationNoInputContentPreview() {
		assertEquals(blog.viewAlertForm(), "Harap isi content perview");
		extentTest.log(LogStatus.PASS, "validation no input content preview");
	}
	
	
//	Add Blog
//	no input content
	@When("click button tambah4")
	public void click_button_tambah4() {
		blog.clickMenuBlog();
		Hooks.delay(1);
		blog.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button tambah4");
	}
	
	@And("no input content")
	public void noInputContent() {
		Hooks.delay(1);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\android.jpg");
		Hooks.delay(1);
		blog.inputJudul("Belajar SQA Baru");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("1");
		Hooks.delay(1);
		blog.inputContentPreview("Test SQA");
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "no input content");
		
	}
	
	@And("click button simpan4")
	public void btnSimpan4() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan2");
	}
	
	@Then("validation no input conten")
	public void validationNoInputContent() {
		assertEquals(blog.viewAlertForm(), "Harap isi content blog");
		extentTest.log(LogStatus.PASS, "validation no input content");
	}
	
	
//	Add Blog
//	no input form
	@When("click button tambah5")
	public void click_button_tambah5() {
		blog.clickMenuBlog();
		Hooks.delay(1);
		blog.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button tambah4");
	}
	
	@And("no input form")
	public void noInputFrom() {
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "no input form");
		
	}
	
	@Then("click button simpan5")
	public void btnSimpan5() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan2");
	}
	
//	Edit Blog
//	success edit
	@When("click blog")
	public void clickBlog() {
		blog.clickMenuBlog();
		Hooks.delay(2);
		blog.clickBtnEdit();
		extentTest.log(LogStatus.PASS, "click blog");
	}
	
	@And("edit form blog")
	public void editFormBlog() {
		Hooks.delay(1);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\andesk.png");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("1");
		Hooks.delay(1);
		blog.clearContentPreview();
		blog.inputContentPreview("memahami Basic SQA");
		Hooks.delay(1);
		blog.clearContent();
		blog.inputContent("Test SQA");
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "edit form blog");
		
	}
	
	@And("click button simpan edit")
	public void btnSimpanEdit() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan edit");
	}
	
	@Then("validation success edit")
	public void validationSuccessEdit() {
		assertEquals(blog.getTxtSuccessEdit(), "Belajar SQA1");
		extentTest.log(LogStatus.PASS, "validation success Edit");
	}
	
	
//	Edit blog
//	content preview Null
	@When("click blog1")
	public void clickBlog1() {
		blog.clickMenuBlog();
		Hooks.delay(2);
		blog.clickBtnEdit();
		extentTest.log(LogStatus.PASS, "click blog1");
	}
	
	@And("edit content preview")
	public void editContentPreview() {
		Hooks.delay(1);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\andesk.png");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("1");
		Hooks.delay(1);
		blog.clearContentPreview();
		Hooks.delay(1);
		blog.clearContent();
		blog.inputContent("Test SQA");
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "edit content preview");
		
	}
	
	@And("click button simpan edit1")
	public void btnSimpanEdit1() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan edit");
	}
	
	@Then("validation success edit1")
	public void validationSuccessEdit1() {
		assertEquals(blog.viewAlertForm(), "Harap isi content perview");
		extentTest.log(LogStatus.PASS, "validation success Edit");
	}
	
	
//	Edit Blog
//	content null
	@When("click blog2")
	public void clickBlog2() {
		blog.clickMenuBlog();
		Hooks.delay(2);
		blog.clickBtnEdit();
		extentTest.log(LogStatus.PASS, "click blog2");
	}
	
	@And("edit content")
	public void editContent() {
		Hooks.delay(1);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\andesk.png");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("1");
		Hooks.delay(1);
		blog.clearContentPreview();
		blog.inputContentPreview("memahami Basic SQA");
		Hooks.delay(1);
		blog.clearContent();
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "edit content");
		
	}
	
	@And("click button simpan edit2")
	public void btnSimpanEdit2() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan edit");
	}
	
	@Then("validation success edit2")
	public void validationSuccessEdit2() {
		assertEquals(blog.viewAlertForm(), "Harap isi content blog");
		extentTest.log(LogStatus.PASS, "validation success Edit2");
	}
	
	
//	Add valid blog, success
	
	@When("click button tambah")
	public void click_button_tambah() {
		blog.clickMenuBlog();
		Hooks.delay(2);
		blog.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button tambah");
	}
	
	@And("input form add valid")
	public void formBlog() {
		Hooks.delay(1);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\android.jpg");
		Hooks.delay(1);
		blog.inputJudul("Testing Berhasil Tambah Blog 2");
		Hooks.delay(1);
		blog.selectPublish("1");
		Hooks.delay(1);
		blog.selectSetHome("1");
		Hooks.delay(1);
		blog.inputContentPreview("memahami SQA");
		Hooks.delay(1);
		blog.inputContent("Test SQA");
		Hooks.delay(1);
		extentTest.log(LogStatus.PASS, "input form add valid");
		
	}
	
	@And("click button simpan")
	public void btnSimpan() {
		Hooks.scroll(100);
		WebElement l = driver.findElement(By.xpath("//input[@name='mysubmit']"));
	      //JavaScript Executor to click element
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("arguments[0].click();", l);
		extentTest.log(LogStatus.PASS, "click button simpan");
	}
	
	@Then("validation success add")
	public void validationSuccessAdd() {
		assertEquals(blog.viewAlertSuccess(), "Data berhasil di tambah");
		extentTest.log(LogStatus.PASS, "validation success add");
	}
	
	@When("go to web tamu")
	public void user_go_to_web_tamu() {
		driver.get(Constants.URLTwo);
		extentTest.log(LogStatus.PASS, "User go to web tamu");
	}
	
	@And("click menu blog Tamu")
	public void clickMenuBlogTamu() {
		Hooks.scroll(50);
		blog.clickBtnBlogTamu();
		extentTest.log(LogStatus.PASS, "click menu blog");
	}
	
	@Then("validation data blog")
	public void validationDataBlog() {
		assertEquals(blog.getTxtSuccessAddWebTamu(), "Testing Berhasil Tambah Blog 2");
		extentTest.log(LogStatus.PASS, "validation data blog");
	}
	
}
