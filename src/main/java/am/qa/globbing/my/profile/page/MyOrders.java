package am.qa.globbing.my.profile.page;

import org.openqa.selenium.WebDriver;
import am.qa.globbing.page.base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrders extends PageObject{

	public MyOrders(WebDriver driver) {
		super(driver);
	}

	final String myOrdersXpath = "//li[contains(@class, 'orders_tab')]";
	@FindBy(xpath = myOrdersXpath) 
	WebElement myOrders;
	
	final String enteredXpath = "//span[contains(@class, 'entered_parcels')]";
	@FindBy(xpath = enteredXpath)
	WebElement entered;
	
	final String receivedInWarehouseXpath = "//span[contains(@class, 'received_in_warehouse')]";
	@FindBy(xpath = receivedInWarehouseXpath)
	WebElement receivedInWarehouse;
	
	final String onTheWayToArmeniaXpath = "//span[contains(@class, 'ready_for_shipping')]";
	@FindBy(xpath = onTheWayToArmeniaXpath)
	WebElement onTheWayToArmenia;
	
    final String alreadyInArmeniaXPath="//span[contains(@class, 'delivered')]";
	@FindBy(xpath =  alreadyInArmeniaXPath )
	WebElement alreadyInArmenia;
	
	@FindBy(xpath = "//span[contains(@class, 'destin-kochar')] ") 
	WebElement arabkir; //already in Armenia-i bajin
	
	@FindBy(xpath = "//span[contains(@class, 'destin-mashtots')] ")
	WebElement kentron; //already in Armenia-i bajin
	
	@FindBy(xpath = "//span[contains(@class, 'destin-nzhdeh')] ")
	WebElement shengavit; //already in Armenia-i bajin
	
	@FindBy(xpath = "//span[contains(@class, 'destination-ajapnyak')] ")   
	WebElement ajapnyak; //already in Armenia-i bajin
	
	@FindBy(xpath = "//span[contains(@class, 'destination-malatia')] ")   
	WebElement malatia; //already in Armenia-i bajin
	
	@FindBy(xpath = "//span[contains(@class, 'destination-eliteplaza')] ") 
	WebElement elitePlaza; //already in Armenia-i bajin
	
	@FindBy(xpath = "//span[contains(@class, 'destination-kapan')] ")     
	WebElement kapan; //already in Armenia-i bajin
	
	final String receivedByMeXpath = "//span[contains(@class, 'status-name done')] ";
	@FindBy(xpath = receivedByMeXpath)
	WebElement receivedByMe;
	
	final String homeDeliveryXpath = "//span[contains(@class, 'home_delivery')] ";
	@FindBy(xpath = homeDeliveryXpath)
	WebElement homeDelivery;
	
	final String orderHomeDeliveryXpath = "//span[contains(@class, 'f_orderHomeDelivery')] ";
	@FindBy(xpath = orderHomeDeliveryXpath) // Home Delivery-i bajin
	WebElement orderHomeDelivery;
	
	final String alreadyOrderedParcelsXpath = "//span[contains(@class, 'f_orderedHomeDelivery')] ";
	@FindBy(xpath = alreadyOrderedParcelsXpath) // Home Delivery-i bajin
	WebElement alreadyOrderedParcels;
	
	public PageObject myOrdersClick() {
		myOrders.click();
		return new PageObject(driver);
	}
	
	public PageObject enteredClick() {
		entered.click();
		return new PageObject(driver);
	}
	
	public PageObject receivedInWarehouseClick() {
		receivedInWarehouse.click();
		return new PageObject(driver);
	}
	public PageObject onTheWayToArmeniaClick() {
		onTheWayToArmenia.click();
		return new PageObject(driver);
	}
	
	public PageObject alreadyInArmeniaClick() {
//		DriverUtil.waitForElementPresent(driver, 5, alreadyInArmeniaXPath);
		alreadyInArmenia.click();
		return new PageObject(driver);
	}
	
	public PageObject arabkirClick() {  //already in Armenia-i bajin
		arabkir.click();
		return new PageObject(driver);
	}	
	
	public PageObject kentronClick() { //already in Armenia-i bajin
		kentron.click();
		return new PageObject(driver);
	}
	
	public PageObject shengavitClick() {  //already in Armenia-i bajin
		shengavit.click();
		return new PageObject(driver);
	}	
	
	public PageObject ajapnyanClick() {  //already in Armenia-i bajin
		ajapnyak.click();
		return new PageObject(driver);
	}	
	
	public PageObject malatiaClick() {  //already in Armenia-i bajin
		malatia.click();
		return new PageObject(driver);
	}	
	
	public PageObject elitePlazaClick() {  //already in Armenia-i bajin
		elitePlaza.click();
		return new PageObject(driver);
	}	
	
	public PageObject kapanClick() {  //already in Armenia-i bajin
		kapan.click();
		return new PageObject(driver);
	}	
	
	public PageObject receivedByMeClick() {
		receivedByMe.click();
		return new PageObject(driver);
	}
	
	public PageObject homeDeliveryClick() {
		homeDelivery.click();
		return new PageObject(driver);
	}
	
	public PageObject orderHomeDeliveryClick() { // Home Delivery-i bajin
		orderHomeDelivery.click();
		return new PageObject(driver);
	}
	
	public PageObject alreadyOrderedParcelsClick() { // Home Delivery-i bajin
		alreadyOrderedParcels.click();
		return new PageObject(driver);
	}
	
	
	
}
