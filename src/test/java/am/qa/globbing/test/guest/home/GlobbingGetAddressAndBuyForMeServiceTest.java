package am.qa.globbing.test.guest.home;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.language.localization.LanguageLocalization;
import am.qa.globbing.page.shops.GetAddressAndBuyForMePage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingGetAddressAndBuyForMeServiceTest extends GlobbingBaseTest {

	// Test One
	// 1.1 Press on GetAddress Button, opened a registration page BASIC FLOW
	// Test Two
	// 2.1 Press on BuyForMeService Button, opened a new page
	// 2.2 Paste a false link in text box
	// 2.3 Then press on button Buy for me FAIL FLOW
	// 2.3 Paste a true link in text box
	// 2.5 Then press on button Buy for me BASIC FlOW

	
	// 17
	@Test(dependsOnMethods = { "buyForMeService1" })
	public void buyForMeService() {
		GetAddressAndBuyForMePage buyForMe = new GetAddressAndBuyForMePage(driver);
		buyForMe.buyForMe("https://aliexpress.com");
		
		Assert.assertTrue(GetAddressAndBuyForMePage.plusAtLinkBoxIsDisplayedXpath());
	}

	
	// 18
	@Test
	public void buyForMeService1() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		LanguageLocalization lang = (LanguageLocalization) home.clickOnDropdown();
		
		lang.clickOnFirst();
		home = new GlobbingHomePage(driver);
		home.buyForMeBtn();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		GetAddressAndBuyForMePage buyForMe = new GetAddressAndBuyForMePage(driver);
		buyForMe.buyForMe("sxal");
		
		Assert.assertTrue(GetAddressAndBuyForMePage.isBuyForMeErrorMsgPresent());
	}
}
