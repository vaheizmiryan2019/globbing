package am.qa.globbing.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingLoginTest extends GlobbingBaseTest {

	// Open Globbing.com
	// 1.Press on LogIn Button
	//First Variant
	// 2.Fill the true email in first text box
	// 3.Fill the false password in second text box
	// 4.Click on the button Log In
	//Second Variant
	// 5.Fill the false email in first text box
	// 6.Fill the true password in second text box
	// 7.Click on the button Log In
	//Third Variant
	// 8.Fill the true email in first text box
	// 9.Fill the true password in the second text box
	// 10.Click on the button Log In

	@Test(dependsOnMethods = { "testLoginWithIncorrectCredentials" })
	public void testLoginWithCorrectCredentials() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		LoginPage loginPage = home.openLoginDialog();
		loginPage.login("user@gmail.com", "useruser");	
		
	}

	@Test(dependsOnMethods = { "testLoginWithIncorrectCredentials1" })
	public void testLoginWithIncorrectCredentials() throws InterruptedException {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		LoginPage loginPage = home.openLoginDialog();
		loginPage.login("user@gmail.com", "sxal");
		Assert.assertTrue(loginPage.isErrorMsgPresent());
		
	}
	
	@Test
	public void testLoginWithIncorrectCredentials1() throws InterruptedException {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		LoginPage loginPage = home.openLoginDialog();
		loginPage.login("sadas@gmail.com", "useruser");
		Assert.assertTrue(loginPage.isErrorMsgPresent());
		
	}
}
