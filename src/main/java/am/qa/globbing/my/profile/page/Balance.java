package am.qa.globbing.my.profile.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.globbing.page.base.PageObject;

public class Balance extends PageObject {

	public Balance(WebDriver driver) {
		super(driver);
	}

	final String balanceXpath = "//li[contains(@class, 'balance_tab')]/div[@class='tab_btn']";
	@FindBy(xpath = balanceXpath)
	WebElement balanceMenu;

	public PageObject balanceClick() {
		balanceMenu.click();
		return new PageObject(driver);
	}
}
