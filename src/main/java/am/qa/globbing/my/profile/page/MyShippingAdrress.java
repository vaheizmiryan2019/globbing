package am.qa.globbing.my.profile.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.globbing.page.base.PageObject;

public class MyShippingAdrress extends PageObject {

	public MyShippingAdrress(WebDriver driver) {
		super(driver);
	}

	final String myShippingAddressXpath = "//li[contains(@class, 'my_address_tab')]";
	@FindBy(xpath = myShippingAddressXpath)
	WebElement myShippingAddress;

	final String usaButtonXpath = "//li[contains(@class, 'f_countryTabus')]";
	@FindBy(xpath = usaButtonXpath)
	WebElement usaButton;
	
	final String greatBritainButtonXpath = "//li[contains(@class, 'f_countryTabgb')]";
	@FindBy(xpath = greatBritainButtonXpath)
	WebElement greatBritainButton;
	
	final String germanyButtonXpath = "//li[contains(@class, 'f_countryTabde')]";
	@FindBy(xpath = germanyButtonXpath)
	WebElement germanyButton;
	
	final String chinaButtonXpath = "//li[contains(@class, 'f_countryTabcn')]";
	@FindBy(xpath = chinaButtonXpath)
	WebElement chinaButton;

	final String russiaButtonXpath = "//li[contains(@class, 'f_countryTabru')]";
	@FindBy(xpath = russiaButtonXpath)
	WebElement russiaButton;
	
	final String dubaiButtonXpath = "//li[contains(@class, 'f_countryTabae')]";
	@FindBy(xpath = dubaiButtonXpath)
	WebElement dubaiButton;
	
	final String italyButtonXpath = "//li[contains(@class, 'f_countryTabit')]";
	@FindBy(xpath = italyButtonXpath)
	WebElement italyButton;
	
	final String dropdownXpath = "//div[contains(@class, 'f_openRecipientShippingAddresses')]";
	@FindBy(xpath = dropdownXpath)
	WebElement dropdown;
	
	final String planeDeliverXpath = "";
	@FindBy(xpath = planeDeliverXpath)
	WebElement plane;
											//avelacnel samalyoti u navi xpath-er@
	final String shipDeliverXpath = "";
	@FindBy(xpath = shipDeliverXpath)
	WebElement ship;

	public PageObject myShippingAddressClick() {
		myShippingAddress.click();
		return new PageObject(driver);
	}
	
	public PageObject usaButtonClick() {
		usaButton.click();
		return new PageObject(driver);
	}
	
	public PageObject greatBritainButtonClick() {
		greatBritainButton.click();
		return new PageObject(driver);
	}
	
	public PageObject germanyButtonClick() {
		germanyButton.click();
		return new PageObject(driver);
	}
	
	public PageObject chinaButtonClick() {
		chinaButton.click();
		return new PageObject(driver);
	}
	
	public PageObject russiaButtonClick() {
		russiaButton.click();
		return new PageObject(driver);
	}
	
	public PageObject dubaiButtonClick() {
		dubaiButton.click();
		return new PageObject(driver);
	}
	
	public PageObject italyButtonClick() {
		italyButton.click();
		return new PageObject(driver);
	}
	
	public PageObject dropdownClick() {
		dropdown.click();
		return new PageObject(driver);
	}
	
	public PageObject planeClick() {
		plane.click();
		return new PageObject(driver);
	}
	
	public PageObject shipClick() {
		ship.click();
		return new PageObject(driver);
	}
}
