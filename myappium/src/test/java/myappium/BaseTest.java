package myappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	public  AndroidDriver driver;
	
	


	@Test
	public void config() throws MalformedURLException {
		
		URL url = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
		cap.setCapability("appActivity","com.google.android.apps.nexuslauncher.NexusLauncherActivity");
		
	
		driver = new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
	}
}
