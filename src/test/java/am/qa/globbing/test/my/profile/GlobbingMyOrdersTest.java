package am.qa.globbing.test.my.profile;

import org.testng.annotations.Test;

import am.qa.globbing.my.profile.page.MyOrders;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.login.LoginPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingMyOrdersTest extends GlobbingBaseTest {


	
	
	// 68
	//Open Globbing.com
	// 1. login
	// 2. Go to MyOrders menu
	// 3. Click on entered button
	@Test
	public void entered() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginDialog();
		loginPage.login("", "");
		Thread.sleep(2000);
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.closeFillMenu();
		MyOrders orders = new MyOrders(driver);
		orders.enteredClick();
		Thread.sleep(2000);
	}

	// 69
	// 1. Click on ReceivedInWarehouseClick button
	@Test(dependsOnMethods = { "entered" })
	public void receivedInWarehouse() throws InterruptedException {
		MyOrders orders = new MyOrders(driver);
		orders.receivedInWarehouseClick();
		Thread.sleep(2000);

	}

	// 70
	// 1. Click on onTheWayToArmenia button
	@Test(dependsOnMethods = { "receivedInWarehouse" })
	public void onTheWayToArmeniaClick() throws InterruptedException {
		MyOrders orders = new MyOrders(driver);
		orders.onTheWayToArmeniaClick();
		Thread.sleep(2000);

	}

	// 71
	// 1. Click on alreadyInArmenia button
	// 2. Click on arabkir
	// 3. Click on kentron
	// 4. Click on shengavit
	// 5. Click on ajapnyak
	// 6. Click on malatia
	// 7. Click on elitePlaza 
	// 8. Click on kapan
	@Test(dependsOnMethods = { "onTheWayToArmeniaClick" })
	public void alreadyInArmenia() throws InterruptedException {
		MyOrders orders = new MyOrders(driver);
		orders.alreadyInArmeniaClick();
		Thread.sleep(2000);
		orders.arabkirClick();
		Thread.sleep(1000);
		orders.kentronClick();
		Thread.sleep(1000);
		orders.shengavitClick();
		Thread.sleep(1000);
		orders.ajapnyanClick();
		Thread.sleep(1000);
		orders.malatiaClick();
		Thread.sleep(1000);
		orders.elitePlazaClick();
		Thread.sleep(1000);
		orders.kapanClick();
		Thread.sleep(1000);
	}

	// 72
	// 1. Click on ReceiveByMeClick
	@Test(dependsOnMethods = { "alreadyInArmenia" })
	public void receivedByMe() throws InterruptedException {
		MyOrders orders = new MyOrders(driver);
		orders.receivedByMeClick();
		Thread.sleep(2000);
	}

	// 73 
	// 1. Click on HomeDelivery
	// 2. Click on OrderHomeDelivery
	// 3. Clikc on AlreadyOrderedParcelsClick
	@Test(dependsOnMethods = { "receivedByMe" })
	public void homeDelivery() throws InterruptedException {
		MyOrders orders = new MyOrders(driver);
		orders.homeDeliveryClick();
		Thread.sleep(2000);
		orders.orderHomeDeliveryClick();
		Thread.sleep(2000);
		orders.alreadyOrderedParcelsClick();
		Thread.sleep(2000);
	}
}


