package am.qa.globbing.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.globbing.page.base.PageObject;
import am.qa.globbing.page.language.localization.LanguageLocalization;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.page.register.RegisterPage;
import am.qa.globbing.page.shops.GetAddressAndBuyForMePage;
import am.qa.globbing.page.shops.TopShopsPage;
import am.qa.globbing.util.DriverUtil;

public class GlobbingHomePage extends PageObject {

	public GlobbingHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='sign--up']")
	WebElement registerButton;
	
	public RegisterPage openRegisterDialog() {
		registerButton.click();
		return new RegisterPage(driver);
	}
	
	// ------------------------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = "//a[contains(@href,'/top-shops/')]")
	WebElement seeAllShopsButton;
	
	
	public TopShopsPage clickSeeAllButton() {
		seeAllShopsButton.click();
		return new TopShopsPage(driver);
	}
	
	// ------------------------------------------------------------------------------------------------------------------
	
	final String loginBtnXPath ="//span[@class='signInBtn']";
	@FindBy(xpath = loginBtnXPath)
	WebElement loginBtn;
	
	public LoginPage openLoginDialog() {
		loginBtn.click();
		return new LoginPage(driver);
	}
	
	// ------------------------------------------------------------------------------------------------------------------
	
	final String logoLinkXPath = "//div[@class='logo--shop block mobile-hide']/a[contains(@class, 'logo--link')]";
	@FindBy(xpath = logoLinkXPath)
	WebElement logoLink;
	
	public void clickOnLogo() {
		DriverUtil.waitForElementPresent(driver, 5, logoLinkXPath);
		logoLink.click();
		DriverUtil.waitForElementPresent(driver, 5, loginBtnXPath);
	}
	
	// ------------------------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = "//a[@class='get-address-link']")
	WebElement getAddress;
	
	public GetAddressAndBuyForMePage getAddressButtonClick() {
		getAddress.click();
		return new GetAddressAndBuyForMePage(driver);
	}

	// ------------------------------------------------------------------------------------------------------------------	
	
	@FindBy(xpath = "//p[@class='text-box']/a[contains(@href, 'buy-for-me')]")
	WebElement buyForMe;
	
	public GetAddressAndBuyForMePage buyForMeBtn() {
		buyForMe.click();
		return new GetAddressAndBuyForMePage(driver);
	}
	
	// ------------------------------------------------------------------------------------------------------------------	
	
	@FindBy(xpath = "//nav[@id='f_userDataNav']/div[4]/form/div/div") //xpath-@ selenium-inna vortev chgta mi hatov
	WebElement languageDropdown;   
	
	
	public PageObject clickOnDropdown() {
		languageDropdown.click();
		return new LanguageLocalization(driver); 
	}
	
	// ------------------------------------------------------------------------------------------------------------------	
}
