package Stepdefinitions;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class Amazon {
	
	WebDriver driver;
	
	@Given("launch Amazon")
	public void launch_amazon() {
	    
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	
	
	}

	@Given("Search for iphone")
	public void search_for_iphone() {
	   
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
	}

	@Given("select i phone")
	public void select_i_phone() {
	   WebDriverWait ww =  new WebDriverWait(driver,Duration.ofSeconds(10));
	   ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='s-image']")));
	   
		
		WebElement mobileImage = driver.findElement(By.xpath("//img[@class='s-image']"));
		mobileImage.click();
	}

	@Given("add to cart")
	public void add_to_cart() throws InterruptedException {
	    System.out.println("adding to cart");
	    
	    driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
	
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0,600)");
	    WebDriverWait ww =  new WebDriverWait(driver,Duration.ofSeconds(10));
		ww.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-button")));
	    
	    WebElement element = driver.findElement(By.id("add-to-cart-button"));
	    element.click();
	    
	   
	 
	    
	}


}
