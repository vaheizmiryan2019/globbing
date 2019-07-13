package am.qa.globbing.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.page.login.PasswordResetPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingForgotPasswordTest extends GlobbingBaseTest {
	
	@Test
	public void forgotPasswordWithIncorrectCredentials() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.openLoginDialog();
		LoginPage login = new LoginPage(driver);
		PasswordResetPage reset1 =	login.navigateToPasswordRest();
		reset1 = (PasswordResetPage) reset1.executeForgotPassword("sxal");
		Assert.assertTrue(reset1.forgotPasswordResetFailAssert());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods = { "forgotPasswordWithIncorrectCredentials" })
	public void forgotPasswordWithCorrectCredentials() {
		PasswordResetPage reset  = new PasswordResetPage(driver);
	    reset = (PasswordResetPage) reset.executeForgotPassword("user@gmail.com");
		Assert.assertTrue(reset.forgotPasswordRequestSuccessAssert());

	}
}
