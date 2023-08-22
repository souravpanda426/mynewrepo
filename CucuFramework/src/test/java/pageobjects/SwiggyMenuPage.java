package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyMenuPage {
	
	
	@FindBy(xpath="//img[@alt='restaurants curated for biryani']")
	WebElement biriyaniresturant;

	
	
	
	public void clickOnBiriyaniResturant() {
		
		biriyaniresturant.click();
	}
	
	
   public SwiggyMenuPage(WebDriver driver) {
		
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public By getresturantsForBiriyani() {
		
		By biriyaniresturant = By.xpath("//img[@alt='restaurants curated for biryani']");
		
		
		return biriyaniresturant;
		
	}
}
