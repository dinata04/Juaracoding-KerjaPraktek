package com.juaracoding.projectJC.Testimonial;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/Testimonial/01Login.feature"
						,"src/test/resources/features/Testimonial/02Testimonial.feature"},
				glue = {"com.juaracoding.projectJC.Testimonial"},
				plugin = {"pretty", "html:target/cucumber-TestimonialReports.html"
						,"json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
