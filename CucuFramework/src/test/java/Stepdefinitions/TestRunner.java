package Stepdefinitions;




import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.*;








@Listeners(utility.MyListeners.class)


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Features",
		glue={"Stepdefinitions"},
		plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"},
		//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/extentreport"},
		//monochrome = true,
		dryRun = false,
		tags="@amazon"
		
		
		
		
		)






public class TestRunner {
	
	
	
	
	
	}
	
	
	

	
	
	
	



