package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyHomePage {
	
	
	WebDriver driver;
	
	
	
	@FindBy(id="location")
	WebElement location;
	
	@FindBy(xpath="//span[text()='Bengaluru, Karnataka, India']")
	WebElement option;
	
	
	
	public void clickOnLocation() {
		
		location.click();
	}
	
	public void setLocation(String username) {
		
		location.sendKeys(username);
		
		location.sendKeys(Keys.ARROW_DOWN);
		 location.sendKeys(Keys.ENTER);
		 
	}
	
	
	
	public SwiggyHomePage(WebDriver driver) {
		
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public By getOption() {
		
	
		By option = By.xpath("//span[text()='Bengaluru, Karnataka, India']");
		
		
		return option;
	}
	
	
	public void clickOnOption() {
		
		
		option.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}


