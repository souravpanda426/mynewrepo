package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	
	@FindBy(xpath="//div[text()='Paneer Tikka']")
	WebElement pannertikka;
	
	
	public By Paneertikka() {
		
		return By.xpath("//div[text()='Paneer Tikka']");
		
		
	}
	
	public CheckoutPage(WebDriver driver) {



		PageFactory.initElements(driver, this);
	}
	
	public boolean isPannerTikkaDisplayed() {
		
		return pannertikka.isDisplayed();
	}

	
	

}
