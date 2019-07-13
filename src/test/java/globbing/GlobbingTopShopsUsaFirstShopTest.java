package globbing;

import org.testng.annotations.Test;

import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.shops.TopShopsPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingTopShopsUsaFirstShopTest extends GlobbingBaseTest {

	//Open the Globbing.com
	//1.Click See All Button
	//2.Click on  the dropdown menu
	//3.Click on the flag of USA
	//4.Click on first shop link
	@Test
	public void testUSTopShops() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		TopShopsPage topShop = home.clickSeeAllButton();
		topShop.openFirstShopInUSA();
		
	}
}
