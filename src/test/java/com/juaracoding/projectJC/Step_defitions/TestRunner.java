package com.juaracoding.projectJC.Step_defitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/Login.feature", 
						"src/test/resources/features/Blog.feature"},
				glue = "com.juaracoding.projectJC.Step_defitions",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
