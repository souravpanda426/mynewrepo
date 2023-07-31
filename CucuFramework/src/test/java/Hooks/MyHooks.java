package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	
	@Before
	public void beforeScenario() {
		
		System.out.println("execution started");
	}
	
	
	@After
	public void afterScenario() {
		
		System.out.println("execution finished");
		
	}
	

}
