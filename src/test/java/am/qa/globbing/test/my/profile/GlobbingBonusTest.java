package am.qa.globbing.test.my.profile;

import org.testng.annotations.Test;

import am.qa.globbing.my.profile.page.Bonus;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingBonusTest extends GlobbingBaseTest {
	//Open globbing.com
	// 1. login
	// 2. Go to balance menu from my profile page
	// 3. click on used
	// 4. click on collected
	@Test
	public void bonus() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginDialog();
		loginPage.login("","");
		Thread.sleep(1000);
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.closeFillMenu();
		Bonus bonus = new Bonus(driver);
		bonus.bonusClick();
		Thread.sleep(1000);
		bonus.usedClick();
		Thread.sleep(1000);
		bonus.collectedClick();
		Thread.sleep(1000);
	}
}
