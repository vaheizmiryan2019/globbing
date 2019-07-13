package am.qa.globbing.page.shops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.globbing.page.base.PageObject;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.util.DriverUtil;

public class GetAddressAndBuyForMePage extends GlobbingHomePage {

	public GetAddressAndBuyForMePage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//div[@class='product_links']//input[@placeholder='Insert the link here' and @type='text']")
	WebElement insertLink;
	
	@FindBy(xpath = "//button[@id='f_shoppingAssistanceFormButton']")
	WebElement buyForMeBtn;
	
	final static String buyForMeErrorMsgXpath = "//div[@class='f_disabledShopMessage disabledShopMessage']";
	@FindBy(xpath = buyForMeErrorMsgXpath)
	WebElement buyForMeRegErrorMsg;
	
	final static String plusAtLinkBoxXpath = "//a[@class='add_field f_addField' and @style='display: inline-block;' ]";
	@FindBy(xpath = plusAtLinkBoxXpath)
	WebElement plusAtLinkBoxIsDisplayed;
			
	
	public PageObject buyForMe(String UrlValue) {
		insertLink.clear();
		insertLink.sendKeys(UrlValue);
		buyForMeBtn.click();
		return new PageObject(driver);
	}
	
	public static boolean isBuyForMeErrorMsgPresent() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, buyForMeErrorMsgXpath);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean plusAtLinkBoxIsDisplayedXpath() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, plusAtLinkBoxXpath);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
