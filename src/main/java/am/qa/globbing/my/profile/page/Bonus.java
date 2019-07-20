package am.qa.globbing.my.profile.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.globbing.page.base.PageObject;

public class Bonus extends PageObject{

	public Bonus(WebDriver driver) {
		super(driver);
	}

	final String bonusXpath = "//li[contains(@class, 'bonus_tab')]/div[@class='tab_btn']";
	@FindBy(xpath = bonusXpath)
	WebElement bonus;
	
	final String collectedXpath = "//span[contains(@data-value, 'in')]";
	@FindBy(xpath = collectedXpath)
	WebElement collected;
	
	final String usedXpath = "//span[contains(@data-value, 'out')]";
	@FindBy(xpath =  usedXpath)
	WebElement used;
	
	public PageObject bonusClick() {
		bonus.click();
		return new PageObject(driver);
	}
	
	public PageObject collectedClick() {
		collected.click();
		return new PageObject(driver);
	}
	
	public PageObject usedClick() {
		used.click();
		return new PageObject(driver);
	}
}
