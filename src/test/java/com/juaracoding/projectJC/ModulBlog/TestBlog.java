package com.juaracoding.projectJC.ModulBlog;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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
	
	@When("click menu blog")
	public void clickTestimonialmenu() {
		Hooks.delay(2);
		blog.clickMenuBlog();
		extentTest.log(LogStatus.PASS, "click menu blog");
	}
	
	@When("click button tambah")
	public void click_button_tambah() {
		Hooks.delay(2);
		blog.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button tambah");
	}
	
	@And("input form add")
	public void formBlog() {
		Hooks.delay(2);
		blog.chooseFile("E:\\Foto\\android Wallpaper\\android.jpg");
		Hooks.delay(2);
		blog.inputJudul("Belajar SQA");
		Hooks.delay(2);
		blog.selectPublish("1");
		Hooks.delay(2);
		blog.selectSetHome("0");
		Hooks.delay(2);
		blog.inputContentPreview("memahami SQA");
		Hooks.delay(2);
		blog.inputContent("Test SQA");
		Hooks.delay(2);
		extentTest.log(LogStatus.PASS, "input form blog");
		
	}
	
	@And("click button simpan")
	public void btnSimpan() {
		Hooks.scroll(200);
		blog.clickBtnSimpan();
		extentTest.log(LogStatus.PASS, "click button simpan");
	}
	
	
//	static void scroll(int vertical) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0," + vertical + ")");
//	}
}
