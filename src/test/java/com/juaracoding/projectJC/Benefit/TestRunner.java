package com.juaracoding.projectJC.Benefit;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/benefit/01Login.feature"
						,"src/test/resources/features/benefit/02Benefit.feature"},
				glue = {"com.juaracoding.projectJC.Benefit"},
				plugin = {"pretty", "html:target/cucumber-benefitreports.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
