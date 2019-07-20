package am.qa.globbing.test.my.profile;

import org.testng.annotations.Test;

import am.qa.globbing.my.profile.page.MyShippingAdrress;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingMyShippingAddreessTest extends GlobbingBaseTest {

	// 74
	// Open globbing.com
	// 1.login to globbing
	// 2. Go to MyShippingAddreess menu
	// 3. Click on USA button
	// 4. Click on plane
	// 5. Click on dropdown
	// 6. Click on ship
	// 7. Click on dropdown
	// 8. Click on GreatBritain button
	// 9. Click on plane
	// 10. Click on dropdown
	// 11. Click on Germany button
	// 12. Click on plane
	// 13. Click on China Button
	// 14. Click on plane
	// 15. Click on dropdown
	// 16. Click on ship
	// 17. Click on dropdown
	// 18. Click on Russia Button
	// 19. Click on plane
	// 20. Click on dropdown
	// 21. Click on bus
	// 22. Click on dropdown
	// 23. Click on Dubai button
	// 24. Click on dropdown
	// 25. Click on Italy button
	// 26. Click on plane button
	// 27. Click on dropdown
	@Test
	public void usa() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginDialog();
		loginPage.login("", "");
		Thread.sleep(1000);
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.closeFillMenu();
		MyShippingAdrress ship = new MyShippingAdrress(driver);
		ship.myShippingAddressClick();
		Thread.sleep(2000);
		ship.usaButtonClick();
		Thread.sleep(1000);
		ship.greatBritainButtonClick();
		Thread.sleep(1000);
		ship.germanyButtonClick();
		Thread.sleep(1000);
		ship.chinaButtonClick();
		Thread.sleep(1000);
		ship.russiaButtonClick();
		Thread.sleep(1000);
		ship.dubaiButtonClick();
		Thread.sleep(1000);
		ship.italyButtonClick();
		Thread.sleep(1000);
	}
	
}