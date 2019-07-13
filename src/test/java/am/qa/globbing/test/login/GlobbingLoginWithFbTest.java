package am.qa.globbing.test.login;

import org.testng.annotations.Test;

import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingLoginWithFbTest extends GlobbingBaseTest {
	
	//Open Globbing
	//Login with fb
	
	@Test
	public void loginWithFb() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.openLoginDialog();
		LoginPage loginWithFbAcc = new LoginPage(driver);
		loginWithFbAcc.fbButtonClick();
	}
}
