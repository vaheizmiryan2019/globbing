package am.qa.globbing.test.my.profile;

import org.testng.annotations.Test;

import am.qa.globbing.my.profile.page.Balance;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingBalanceTest extends GlobbingBaseTest{

	// 75
	//Open Globbing.com
	// 1. Login
	// 2. Go to MyProfile
	// 3.Click on Balance
	@Test
	public void balance() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginDialog();
		loginPage.login("","");
		Thread.sleep(1000);
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.closeFillMenu();
		Balance balance = new Balance(driver);
		balance.balanceClick();
	}
}
