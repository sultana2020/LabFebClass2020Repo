package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class BBCHomePageObj extends Base {

	
	public BBCHomePageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[@id='orb-nav-links']//a[contains(text(),'News')]")
	private WebElement news;
	
	
	public void clickonNews() {
		news.click();
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	
	
	
	
	
	
	
	
}
