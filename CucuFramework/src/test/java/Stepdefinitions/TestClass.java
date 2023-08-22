package Stepdefinitions;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobjects.SwiggyHomePage;
import pageobjects.SwiggyMenuPage;

public class TestClass {
	
	
	
	
	
	@Test
	public void f() throws EncryptedDocumentException, IOException {
		WebDriver driver =  new FirefoxDriver();
		driver.get(CommonMethods.getDataFromExcel(1, 0));
		SwiggyHomePage swiggy = new SwiggyHomePage(driver);
		swiggy.clickOnLocation();

		swiggy.setLocation("Bengaluru, Karnataka, India");
		WebDriverWait ww =  new WebDriverWait(driver,Duration.ofSeconds(10));
		ww.until(ExpectedConditions.presenceOfElementLocated(swiggy.getOption()));

		swiggy.clickOnOption();
		SwiggyMenuPage menu =  new SwiggyMenuPage(driver);


		ww.until(ExpectedConditions.presenceOfElementLocated(menu.getresturantsForBiriyani()));

		menu.clickOnBiriyaniResturant();
		
	}

}
