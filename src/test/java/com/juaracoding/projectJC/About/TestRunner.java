package com.juaracoding.projectJC.About;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/About/01Login.feature"
						,"src/test/resources/features/About/02About.feature"},
				glue = {"com.juaracoding.projectJC.About"},
				plugin = {"pretty", "html:target/cucumber-AboutReports.html"
						,"json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
