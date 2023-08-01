package Stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetSteps {
	
	Response request;
	
	@Given("Get Planets Detail by Get Request")
	public void get_planets_detail_by_get_request() {
		RestAssured.baseURI="https://swapi.dev/api/planets/3";
		request = RestAssured.given().header("Content-Type","application/json").request(Method.GET);
		String asString = request.getBody().asString();
	
		
		System.out.println(asString);
		
		
	   
	}
	
	
	
	@Given("Verify the status code")
	public void verify_the_status_code() {
		
		
		int statusCode = request.statusCode();
		System.out.println(statusCode);
		Assert.assertEquals(200, statusCode);
	  
	}
	
	
	

   @Then("Get The Parameters")
    public void get_the_parameters() {
    
	   @SuppressWarnings("unused")
	   JsonPath jsonPath = request.jsonPath();
	   JsonPath given = JsonPath.given(request.getBody().asString());//.get("population");
	   System.out.println(given.get("population").toString());
	   System.out.println(given.get("gravity").toString());
    
    
   }
	
	

}
