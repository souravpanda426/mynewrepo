package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResturantsPage {

	@FindBy(xpath="//div[text()='ADD']")
	WebElement addbutton;


	@FindBy(xpath="(//img)[2]/parent::div")
	WebElement firstImage;

	@FindBy(xpath="//span[text()='View Cart']/parent::span")
	WebElement viewcart;


	public void clickOnAddbutton() {

		addbutton.click();
	}


	public ResturantsPage(WebDriver driver) {



		PageFactory.initElements(driver, this);
	}


	public By viewCart() {

		return By.xpath("//span[text()='View Cart']/parent::span");
	}



	public By AddButton() {


		return By.xpath("//div[text()='ADD']");
	}


	public By FirstImage() {

		return By.xpath("(//img)[2]/parent::div");
	}


	public void clickOnFirstImage() {

		firstImage.click();
	}

}
