package Stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class MyHooks {
	
	@Before
	
	public void f() {
		
		System.out.println("before scenario");
	}
	
	
	@After
	
	public void g() {
		
		System.out.println("after sceanrio");
	}
	 
	
}
	
	
	
	


