package am.qa.globbing.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.globbing.page.base.PageObject;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.util.DriverUtil;

public class LoginPage extends GlobbingHomePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='email' and @type='text'] ")
	WebElement emailTextArea;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextArea;
	
	@FindBy(xpath = "//button[@type='submit'] ")
	WebElement submitButton;
	
	@FindBy(xpath = "//a[@class='sign--up logout--btn mobile-hide f_logout'])")
	WebElement logoutButton;

	
	final String loginErrorMsgXPath="//span[@class='alert_icon icon--cross']";
	@FindBy(xpath = loginErrorMsgXPath)
	WebElement loginErrorMsg;
	

	@FindBy(xpath = "//div[@class='register--login-lostpassword']")
	WebElement forgotPasswordButton;
	
	public boolean isErrorMsgPresent() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, loginErrorMsgXPath) ;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@FindBy(xpath = "//a[@class='register_with_facebook register_with_link']")
	WebElement fbButton;

	public PageObject login(String loginValue, String passwordValue) {
		emailTextArea.clear();
		emailTextArea.sendKeys(loginValue);
		passwordTextArea.clear();
		passwordTextArea.sendKeys(passwordValue);
		submitButton.click();
		return new PageObject(driver); 
	}
	
	public PageObject logout() {
		logoutButton.click();
		return new PageObject(driver);
	}
	
	public PasswordResetPage navigateToPasswordRest() {
		forgotPasswordButton.click();
		return new PasswordResetPage(driver);
	}
	public PageObject fbButtonClick() {
		fbButton.click();
		return new PageObject(driver);
	}
	
	
	
	
	
	
	
	
	
}
