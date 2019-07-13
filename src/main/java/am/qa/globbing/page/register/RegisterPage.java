package am.qa.globbing.page.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.util.DriverUtil;

public class RegisterPage extends GlobbingHomePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//input[@type='text' and  @name='register[personal][email]']")
	WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@type='password' and  @name='register[personal][password]']")
	WebElement passwordTextBox;
	
	@FindBy(xpath = "//input[@type='password' and  @name='register[personal][passwordConfirmation]']")
	WebElement reenterPasswordTextBox;
	
	@FindBy(xpath = "//input[@autocomplete='section-personal tel']")
	WebElement telephoneTextBox;
	
	@FindBy(xpath = "//span[contains(@class, 'accept-reg-icon')]")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[@class='register--submit btn is--primary ']")
	WebElement finalRegisterButton;
	
	final static String regErrorMsgXpath = "//div[@class='register-validation--error-msg register-validation--error-msg-email']";
	@FindBy(xpath = regErrorMsgXpath)
	WebElement regErrorMsg;
	
	final static String regErrorMsgXpath1 = "//div[@class='register-validation--error-msg register-validation--error-msg-password']";
	@FindBy(xpath = regErrorMsgXpath1)
	WebElement regErrorMsg1;
	
	final static String regErrorMsgXpath2 = "//div[@class='register-validation--error-msg register-validation--error-msg-passwordConfirmation']";
	@FindBy(xpath = regErrorMsgXpath2)
	WebElement regErrorMsg2;
	
	final static String regErrorMsgXpath3 = "//input[@class='phone-field register--field is--glb-required has--error']";
	@FindBy(xpath = regErrorMsgXpath3)
	WebElement regErrorMsg3;
	
	final static String regErrorMsgXpath4 = "//span[@class='accept-reg-icon has--error']";
	@FindBy(xpath = regErrorMsgXpath4)
	WebElement regErrorMsg4;

	final static String regErrorMsgXpath5 = "//input[@class='phone-field register--field is--glb-required']";
	@FindBy(xpath = regErrorMsgXpath5)
	WebElement regErrorMsg5;
	
	final static String regErrorMsgXpath6 = "//span[@class='accept-reg-icon']";
	@FindBy(xpath = regErrorMsgXpath6)
	WebElement regErrorMsg6;
	
	@FindBy(xpath = "//div[5]/ul/li/a")
	WebElement regWithFb;


	
	public void fillCredentials(String usernameValue, String passwordValue) {
		emailTextBox.sendKeys(usernameValue);
		passwordTextBox.sendKeys(passwordValue);
	}
	public RegisterPage registerUser(String usernameValue, String passwordValue, String repasswordValue, String telValue) {
		fillCredentials(usernameValue, passwordValue );
		reenterPasswordTextBox.sendKeys(repasswordValue);
		telephoneTextBox.sendKeys(telValue);
		checkbox.click();
		finalRegisterButton.click();
		return new RegisterPage(driver);
	}
	
	public RegisterPage registerUserWithoutChekbox(String usernameValue, String passwordValue, String repasswordValue, String telValue) {
		fillCredentials(usernameValue, passwordValue );
		reenterPasswordTextBox.sendKeys(repasswordValue);
		telephoneTextBox.sendKeys(telValue);
		finalRegisterButton.click();
		PageFactory.initElements(driver, this);
		return new RegisterPage(driver);
	}	
	public RegisterPage emptyRegister() {
		finalRegisterButton.click();
		return new RegisterPage(driver);
	}
	
	public static boolean isRegErrorMsgPresent() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, regErrorMsgXpath) ;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isRegErrorMsgPresent1() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, regErrorMsgXpath1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isRegErrorMsgPresent2() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, regErrorMsgXpath2);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isRegErrorMsgPresent3() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, regErrorMsgXpath3);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public static boolean isRegErrorMsgPresent4() {
		PageFactory.initElements(driver, RegisterPage.class);
		try {
			DriverUtil.waitForElementPresent(driver, 5, regErrorMsgXpath4);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isRegErrorMsgPresent5() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, regErrorMsgXpath5);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isRegErrorMsgPresent6() {
		try {
			DriverUtil.waitForElementPresent(driver, 5, regErrorMsgXpath6);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public RegisterPage regWithFb() {
		regWithFb.click();
		return new RegisterPage(driver);
	}
}
