package Stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleLaunch {
	
	WebDriver driver;
	
  @Given("^Launch google")
  public void given() throws Throwable {
	  driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	  
	  
  }
  
  @And("^Close browser")
  public void closeBrowser() throws Throwable {
	  
		driver.close();
	  
  }
  
  
  @Given("Click On Gmail")
  public void click_on_gmail() {
      
	  driver.findElement(By.xpath("//a[text()='Gmail']")).click();
  }
  
  
  @And ("Click on Signin")
  public void Click_on_Signin() {
	  WebElement element = driver.findElement(By.xpath("//a[@data-action='sign in']"));
	  element.click();
	  
  }
  
  
  @When("FindTitleOfGoogle")
  public void find_title_of_google() {
     System.out.println(driver.getTitle());
  }
  
  
  @When("verifyTitle")
  public boolean verify_title() {
      String title = driver.getTitle();
      
      return title.equals("Gmail");
  }
  
  
	

}
