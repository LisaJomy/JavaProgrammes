package mukeshOtwaniGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Griddemo2 {
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps= new 	DesiredCapabilities();
		
		caps.setBrowserName(BrowserType.FIREFOX);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.67:4444/wd/hub"), caps);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Learn Automation");
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	

}
