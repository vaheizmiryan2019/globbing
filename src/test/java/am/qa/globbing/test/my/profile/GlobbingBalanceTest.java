package am.qa.globbing.test.my.profile;

import org.testng.annotations.Test;

import am.qa.globbing.my.profile.page.Balance;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;
import am.qa.globbing.util.ReadFromFileUtil;

public class GlobbingBalanceTest extends GlobbingBaseTest{

	// 75
	//Open Globbing.com
	// 1. Login
	// 2. Go to MyProfile
	// 3.Click on Balance
	@Test
	public void balance() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginDialog();
		String user = ReadFromFileUtil.readPropertiesByName("user");
		String pass = ReadFromFileUtil.readPropertiesByName("password");
		loginPage.login(user,pass);
		
		Thread.sleep(1000);
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.closeFillMenu();
		Balance balance = new Balance(driver);
		balance.balanceClick();
	}
}
