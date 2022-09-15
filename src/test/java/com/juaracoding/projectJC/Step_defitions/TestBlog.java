package com.juaracoding.projectJC.Step_defitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.projectJC.pages.Blog;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBlog {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Blog blog = new Blog();
	
	public TestBlog() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	

}
