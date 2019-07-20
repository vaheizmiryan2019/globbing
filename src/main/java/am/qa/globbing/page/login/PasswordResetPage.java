package am.qa.globbing.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.globbing.page.base.PageObject;
import am.qa.globbing.util.DriverUtil;

public class PasswordResetPage extends PageObject{

	public PasswordResetPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//input[contains(@class, 'password-reset--input is--required')]")
	WebElement emailAdrressForForgotPassword;
	
	@FindBy(xpath = "//button[@class='password-reset--link btn is--primary is--center']")
	WebElement submitButtonForForgotPassword;
	

	final String  passwordResetSuccess = "//div[@class='password--success'])";
	@FindBy(xpath = passwordResetSuccess)
	WebElement forgotPasswordRequestSuccess;
	
	final String passwordResetFail = "//input[contains(@class, 'password-reset--input is--required')]";
	@FindBy(xpath = passwordResetFail)
	WebElement forgotPasswordResetFail;
	

	public PageObject executeForgotPassword(String emailValue) {
		emailAdrressForForgotPassword.clear();
		emailAdrressForForgotPassword.sendKeys(emailValue);
		submitButtonForForgotPassword.click();
		return new PageObject(driver);
	}
	

	public boolean forgotPasswordRequestSuccessAssert () {
		try {
			DriverUtil.waitForElementPresent(driver, 5, passwordResetSuccess);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean forgotPasswordResetFailAssert() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, passwordResetFail);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
