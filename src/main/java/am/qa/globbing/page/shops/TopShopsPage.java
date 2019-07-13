package am.qa.globbing.page.shops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.util.DriverUtil;

public class TopShopsPage extends GlobbingHomePage{

	public TopShopsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@data-country-code='default']")
	WebElement selectCountryButton;
	
	@FindBy(xpath="//a[contains(@href, 'https://globbing.com/top-shops?f=1')]")
	WebElement usaButton;
	
	final String firstShopXPath="//div[@id='f_countryUS']/div[1]//div[@class='product--overlay-info']//a";
	@FindBy(xpath=firstShopXPath)
	WebElement firstShop;
	
	public TopShopsPage openFirstShopInUSA() {
		selectCountryButton.click();
		usaButton.click();
		DriverUtil.waitForElementPresent(driver, 5, firstShopXPath);	
		 
		firstShop.click();
			return new TopShopsPage(driver);
	}
}





	
