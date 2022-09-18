package com.juaracoding.projectJC.web_admin.step_sosial_media;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Login;
import com.juaracoding.projectJC.pages.SosialMedia;
import com.juaracoding.projectJC.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSosialMedia {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private SosialMedia sosialMedia = new SosialMedia();
	
	public TestSosialMedia() {
		driver = HooksSosialMedia.driver;
		extentTest = HooksSosialMedia.extentTest;
	}

	//	Valid Login
	
	@When("User go to web JC contact admin four")
	public void user_go_to_web_JC_contact_admin_four() {
		driver.get(Constants.URLOne);
		extentTest.log(LogStatus.PASS, "User go to web JC contact admin four");
	}
	
	@And("User sign in")
	public void user_sign_in() {
		HooksSosialMedia.delay(5);
		login.txtUsername("ucen1315@gmail.com");
		HooksSosialMedia.delay(5);
		login.txtPassword("a");
		extentTest.log(LogStatus.PASS, "User sign in");
	}
	
	@And("User clik button sign in")
	public void user_clik_button_sign_in() {
		HooksSosialMedia.delay(5);
		login.clickBtnSign();
		System.out.println("Berhasil Login");
		extentTest.log(LogStatus.PASS, "User clik button sign in");
	}
	
	@And("User get validasi succeed sign in")
	public void user_valid_login() {
		HooksSosialMedia.delay(5);
		assertEquals(login.getTxtDashboard(),"Dashboard");
		System.out.println(login.getTxtDashboard());
		extentTest.log(LogStatus.PASS, "User get validasi succeed sign in");
	}
	
	@And("User go to home jc and click button sosial media")
	public void user_go_to_home_jc_and_click_button_sosial_media() {
		HooksSosialMedia.delay(3);
		sosialMedia.pilihMenu("Sosial Media", 3);
		extentTest.log(LogStatus.PASS, "User go to home jc and click button sosial media");
	}
	
	@Then("User get validasi sosial media")
	public void user_get_validasi_sosial_media() {
		HooksSosialMedia.delay(3);
		assertEquals(sosialMedia.getValidasiSosialMedia(),"Social Media");
		System.out.println(sosialMedia.getValidasiSosialMedia());
		extentTest.log(LogStatus.PASS, "User get validasi sosial media");
	}
	
	//1.failed => tidak masukan link facebook
	
	@When("User not input link facebook")
	public void user_not_input_link_facebook() {
		HooksSosialMedia.delay(3);
		sosialMedia.deleteFacebook();
		sosialMedia.inputFacebook("");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteInstagram();
		sosialMedia.inputInstagram("https://www.instagram.com/juaracoding/");
		HooksSosialMedia.delay(3);
		HooksSosialMedia.scroll(300);
		sosialMedia.deleteYoutube();
		sosialMedia.inputYoutube("https://bit.ly/juaracoding_yt");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteWa();
		sosialMedia.inputWa("081234567890");
		extentTest.log(LogStatus.PASS, "User not input link facebook");
	}
	
	@And("User click save one")
	public void user_click_save_one() {
		HooksSosialMedia.delay(2);
		sosialMedia.clickBtnSave();
		extentTest.log(LogStatus.PASS, "User click save one");
	}

	@Then("User get validasi one")
	public void user_get_validasi_one() {
		HooksSosialMedia.delay(2);
		assertEquals(sosialMedia.getValidasiFb(),"Harap isi facebook");
		System.out.println(sosialMedia.getValidasiFb());
		extentTest.log(LogStatus.PASS, "User get validasi one");
	}
	
	//2.failed => tidak masukan link instagram
	
	@When("User not input link instagram")
	public void user_not_input_link_instagram() {
		HooksSosialMedia.delay(3);
		sosialMedia.inputFacebook("https://www.facebook.com/juaracoding");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteInstagram();
		sosialMedia.inputInstagram("");
		HooksSosialMedia.delay(3);
		HooksSosialMedia.scroll(300);
		sosialMedia.deleteYoutube();
		sosialMedia.inputYoutube("https://bit.ly/juaracoding_yt");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteWa();
		sosialMedia.inputWa("081234567890");
		extentTest.log(LogStatus.PASS, "User not input link instagram");
	}
	
	@And("User click save two")
	public void user_click_save_two() {
		HooksSosialMedia.delay(2);
		sosialMedia.clickBtnSave();
		extentTest.log(LogStatus.PASS, "User click save two");
	}
	
	@Then("User get validasi two")
	public void user_get_validasi_two() {
		HooksSosialMedia.delay(2);
		assertEquals(sosialMedia.getValidasiIg(),"Data berhasil di update");
		System.out.println(sosialMedia.getValidasiIg());
		extentTest.log(LogStatus.PASS, "User get validasi two");
	}
	
	//3.failed => tidak masukkan link youtube
	
	@When("User not input link youtube")
	public void user_not_input_link_youtube() {
		HooksSosialMedia.delay(3);
		HooksSosialMedia.scroll(50);
		sosialMedia.deleteFacebook();
		sosialMedia.inputFacebook("https://www.facebook.com/juaracoding");
		HooksSosialMedia.delay(3);
		sosialMedia.inputInstagram("https://www.instagram.com/juaracoding/");
		HooksSosialMedia.delay(3);
		HooksSosialMedia.scroll(300);
		sosialMedia.deleteYoutube();
		sosialMedia.inputYoutube("");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteWa();
		sosialMedia.inputWa("081234567890");
		extentTest.log(LogStatus.PASS, "User not input link youtube");
	}
	
	@And("User click save three")
	public void user_click_save_three() {
		HooksSosialMedia.delay(2);
		sosialMedia.clickBtnSave();
		extentTest.log(LogStatus.PASS, "User click save three");
	}

	@Then("User get validasi three")
	public void user_get_validasi_three() {
		HooksSosialMedia.delay(2);
		assertEquals(sosialMedia.getValidasiYt(),"Data berhasil di update");
		System.out.println(sosialMedia.getValidasiYt());
		extentTest.log(LogStatus.PASS, "User get validasi three");
	}
				
	//4.failed => tidak masukkan no whatsapp
	
	@When("User not input number whatsapp")
	public void user_not_input_number_whatsapp() {
		HooksSosialMedia.delay(3);
		sosialMedia.deleteFacebook();
		sosialMedia.inputFacebook("https://www.facebook.com/juaracoding");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteInstagram();
		sosialMedia.inputInstagram("https://www.instagram.com/juaracoding/");
		HooksSosialMedia.delay(3);
		HooksSosialMedia.scroll(300);
		sosialMedia.inputYoutube("https://bit.ly/juaracoding_yt");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteWa();
		sosialMedia.inputWa("");
		extentTest.log(LogStatus.PASS, "User not input number whatsapp");
	}
	
	@And("User click save four")
	public void user_click_save_four() {
		HooksSosialMedia.delay(2);
		sosialMedia.clickBtnSave();
		extentTest.log(LogStatus.PASS, "User click save four");
	}

	@Then("User get validasi four")
	public void user_get_validasi_four() {
		HooksSosialMedia.delay(2);
		HooksSosialMedia.scroll(300);
		assertEquals(sosialMedia.getValidasiWa(),"Harap isi wa");
		System.out.println(sosialMedia.getValidasiWa());
		extentTest.log(LogStatus.PASS, "User get validasi four");
	}
	
	//5.failed => masukan no whatsapp dengan huruf
	
	@When("User input whatsapp with letter")
	public void user_input_whatsapp_with_letter() {
		HooksSosialMedia.scroll(-100);
		HooksSosialMedia.delay(3);
		sosialMedia.deleteFacebook();
		sosialMedia.inputFacebook("https://www.facebook.com/juaracoding");
		HooksSosialMedia.delay(3);
		sosialMedia.deleteInstagram();
		sosialMedia.inputInstagram("https://www.instagram.com/juaracoding/");
		HooksSosialMedia.delay(3);
		HooksSosialMedia.scroll(300);
		sosialMedia.deleteYoutube();
		sosialMedia.inputYoutube("https://bit.ly/juaracoding_yt");
		HooksSosialMedia.delay(3);
		sosialMedia.inputWa("AABBCCDD");
		extentTest.log(LogStatus.PASS, "User input whatsapp with letter");
	}
	
	@And("User click save five")
	public void user_click_save_five() {
		HooksSosialMedia.delay(2);
		sosialMedia.clickBtnSave();
		extentTest.log(LogStatus.PASS, "User click save five");
	}
	
	@Then("User get validasi five")
	public void user_get_validasi_five() {
		HooksSosialMedia.delay(2);
		assertEquals(sosialMedia.getValidasiSukses(),"Data berhasil di update");
		System.out.println(sosialMedia.getValidasiSukses());
		extentTest.log(LogStatus.PASS, "User get validasi five");
	}

	//6.failed => gagal simpan data sosial media
	
	//@When User not input one form
	//@And User click save six
	//@Then User get validasi six

	//7.passed => simpan data sosial media	
		//7a.passed => masukan link facebook
		//7b.passed => masukkan link instagram
		//7c.passed => masukkan link youtube
		//7d.passed => masukkan no whatsapp
	
	//@When User input all form
	//@And User click save seven
	//@Then User get validasi seven

	//8.passed => berihasil simpan data sosial media
	
	//@When User input all form with the true data
	//@And User click save eight
	//@Then User get validasi eight
}
