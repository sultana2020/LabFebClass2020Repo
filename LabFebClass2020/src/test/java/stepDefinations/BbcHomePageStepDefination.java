package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.BBCHomePageObj;

public class BbcHomePageStepDefination extends Base {


	@Given("^User is open BBC Home page$")
	public void user_is_open_BBC_Home_page() throws Throwable {

		System.getProperty("Webdriver.chrome.driver", "c.//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		
		driver.quit();
	}
//	@Then("^User Should be able to see the New page$")
//	public void user_Should_be_able_to_see_the_New_page() throws Throwable {
//		String expectedPageTitle = "BBC";
//		String actualPageTitle = bbcHomePageObj.getPageTitle();
//		Assert.assertEquals(actualPageTitle, expectedPageTitle);
//	}

	 
}
