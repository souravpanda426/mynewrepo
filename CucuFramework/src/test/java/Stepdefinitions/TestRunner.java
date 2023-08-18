package Stepdefinitions;




import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Features",
		glue={"Stepdefinitions"},
		plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"},
		//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/extentreport"},
		monochrome = true,
		dryRun = false,
		tags="@amazon"
		
		
		
		
		)






public class TestRunner {
	
	
	
}
	
	
	
	



