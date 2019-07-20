package am.qa.globbing.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingLoginTest extends GlobbingBaseTest {

	// Open Globbing.com
	// 1.Press on LogIn Button
	// 2.Fill the true email in first text box
	// 3.Fill the false password in second text box
	// 4.Click on the button Log In
	// 2
	@Test
	public void testLoginWithCorrectCredentials() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		LoginPage loginPage = home.openLoginDialog();
		loginPage.login("user@gmail.com", "useruser");	
		
	}

	// 4
	// Open Globbing.com
	// 1.Press on LogIn Button
	// 2.Fill the false email in first text box
	// 3.Fill the true password in second text box
	// 4.Click on the button Log In
	@Test
	public void testLoginWithIncorrectCredentials() throws InterruptedException {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		LoginPage loginPage = home.openLoginDialog();
		loginPage.login("user@gmail.com", "sxal");
		Assert.assertTrue(loginPage.isErrorMsgPresent());
		
	}
	
	// 3
	// Open Globbing.com
	// 1.Press on LogIn Button
	// 2.Fill the true email in first text box
	// 3.Fill the true password in the second text box
	// 4.Click on the button Log In
	@Test
	public void testLoginWithIncorrectCredentials1() throws InterruptedException {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		LoginPage loginPage = home.openLoginDialog();
		loginPage.login("sadas@gmail.com", "useruser");
		Assert.assertTrue(loginPage.isErrorMsgPresent());
		
	}
}
