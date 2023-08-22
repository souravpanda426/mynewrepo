package Stepdefinitions;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class StarShips {
	
	
io.restassured.response.Response request;
	
	@Given("getstarships")
	public void getstarships() {
		RestAssured.baseURI="https://swapi.dev/api/starships/9/";
		request = RestAssured.given().header("Content-Type","application/json").request(Method.GET);
		String asString = request.getBody().asString();
	
		
		System.out.println(asString);
	}
	
	
	@When("Verfiy the status code")
	public void verfiy_the_status_code() {
	   
		int statusCode = request.statusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@When("verfiy the length")
	public void verfiy_the_length() {
	    
		
		JsonPath jsonPath = request.jsonPath();
		 JsonPath given = JsonPath.given(request.getBody().asString());
		 Object object = given.get("length");
		 Assert.assertEquals("120000", object.toString());
	}


}
