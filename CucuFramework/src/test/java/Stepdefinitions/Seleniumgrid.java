package Stepdefinitions;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Seleniumgrid {

	
	
	@Test
	public void f() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.MAC);
		dc.setBrowserName("safari");
		URL url = new URL("http://192.168.29.150:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://www.google.com");
		driver.close();
		
		
	}
}
