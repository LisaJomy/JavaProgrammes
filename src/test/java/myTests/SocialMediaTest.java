package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SocialMediaTest extends BaseTest {

	@Test
	public void facebookTest() {
		getDriver().get("https://www.facebook.com");
		System.out.println(getDriver().getTitle());
		Assert.assertEquals(getDriver().getTitle(),"Facebook - Log In or Sign Up");
		
	}
	
	

	@Test
	public void googleTest() {
		getDriver().get("https://www.google.com");
		System.out.println(getDriver().getTitle());
		Assert.assertEquals(getDriver().getTitle(),"Google");
		
	}
	
	
	
	

}
