package com.juaracoding.projectJC.Rincianbiaya;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/RincianBiaya/01Login.feature",
						"src/test/resources/features/RincianBiaya/02Rincianbiaya.feature"},
				glue = "com.juaracoding.projectJC.Rincianbiaya",
				plugin = {"pretty", "html:target/cucumber-RincianbiayaReports.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
