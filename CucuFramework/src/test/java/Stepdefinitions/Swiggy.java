package Stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CheckoutPage;
import pageobjects.ResturantsPage;
import pageobjects.SwiggyHomePage;
import pageobjects.SwiggyMenuPage;

public class Swiggy {



	WebDriver driver;

	ResturantsPage resturantsPage;
	@Given("launch Swiggy")
	public void launch_swiggy() throws EncryptedDocumentException, IOException {

		driver = new FirefoxDriver();
		driver.get(CommonMethods.getDataFromExcel(1, 0));
		
		String[] st = {"location","Mumbai"};
		CommonMethods.updateExistingFile(0, 0, st);
	}

	@Given("Search for food")
	public void search_for_food() throws InterruptedException {

		SwiggyHomePage swiggy = new SwiggyHomePage(driver);
		swiggy.clickOnLocation();

		swiggy.setLocation("Bengaluru, Karnataka, India");
		WebDriverWait ww =  new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.presenceOfElementLocated(swiggy.getOption()));

		swiggy.clickOnOption();
		SwiggyMenuPage menu =  new SwiggyMenuPage(driver);


		ww.until(ExpectedConditions.presenceOfElementLocated(menu.getresturantsForBiriyani()));

		menu.clickOnBiriyaniResturant();

	}

	@Given("add it to cart")
	public void add_it_to_cart() {
      
		resturantsPage = new ResturantsPage(driver);


		WebDriverWait ww =  new WebDriverWait(driver,10);
		System.out.println("adding panner to cart");
		ww.until(ExpectedConditions.presenceOfElementLocated(resturantsPage.AddButton()));

		resturantsPage.clickOnAddbutton();

	}


	@Given("Add first Image")
	public void Add_first_Image() {
		
		resturantsPage = new ResturantsPage(driver);

		WebDriverWait ww =  new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.presenceOfElementLocated(resturantsPage.FirstImage()));



		resturantsPage.clickOnFirstImage();
	}

	@Then("click on View cart")
	public void click_on_view_cart() {
		
		resturantsPage = new ResturantsPage(driver);

		WebDriverWait ww =  new WebDriverWait(driver,(10));
		ww.until(ExpectedConditions.presenceOfElementLocated(resturantsPage.viewCart()));


		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("document.getElementsByClassName('styles_viewCart__32FxP')[0].click()");


	}

	@Then("check the item added")
	public boolean check_the_item_added() {
		CheckoutPage checkout = new CheckoutPage(driver);

		WebDriverWait ww =  new WebDriverWait(driver,(10));
		ww.until(ExpectedConditions.presenceOfElementLocated(checkout.Paneertikka()));



		return checkout.isPannerTikkaDisplayed();
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    
		driver.close();
	}



}
