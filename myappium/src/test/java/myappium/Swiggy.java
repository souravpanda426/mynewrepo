package myappium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Swiggy extends BaseTest{

	
	@Test
	
	public void execute() {
		
		Actions action = new Actions(driver);
		System.out.println("crossed line 39");//com.google.android.apps.nexuslauncher:id/page_indicator//
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		action.dragAndDrop(driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/page_indicator")),
				driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/clock"))).build().perform();
		
		
		WebElement element = driver.findElements(By.id("com.google.android.apps.nexuslaucher:id/icon")).get(20);
		element.click();
	}
}
