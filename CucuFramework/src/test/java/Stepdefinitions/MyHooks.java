package Stepdefinitions;



import java.util.ArrayList;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class MyHooks {
	
	@Before
	
	public void f() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("hio");
		
		
		System.out.println("before scenario");
	}
	
	
	@After
	
	public void g() {
		
		System.out.println("after sceanrio");
	}
	 
	
}
	
	
	
	


