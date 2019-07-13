package am.qa.globbing.page.language.localization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.globbing.page.base.PageObject;
import am.qa.globbing.page.home.GlobbingHomePage;

public class LanguageLocalization extends GlobbingHomePage {

	public LanguageLocalization(WebDriver driver) {
		super(driver);
	}


	//xpath-er@ selenium-inna vortev chgta mi hatov
	
	@FindBy(xpath = "//nav[@id='f_userDataNav']/div[4]/form/div/ul/li/label")
	WebElement engLanguage;
	
	@FindBy(xpath = "//nav[@id='f_userDataNav']/div[4]/form/div/ul/li[3]/label")
	WebElement rusLanguage;
	
	@FindBy(xpath = "//nav[@id='f_userDataNav']/div[4]/form/div/ul/li[2]/label")
	WebElement armLanguage;
	
	
	
	public PageObject clickOnFirst() {
		engLanguage.click();
		return new PageObject(driver);
	}
	
	public PageObject clickOnSecond() {
		rusLanguage.click();
		return new PageObject(driver);
	}
	
	public PageObject clickOnThird() {
		armLanguage.click();
		return new PageObject(driver);
	}
}
