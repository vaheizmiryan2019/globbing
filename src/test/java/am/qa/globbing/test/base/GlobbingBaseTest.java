package am.qa.globbing.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GlobbingBaseTest {

	protected WebDriver driver;
	
//	@BeforeClass
//	public void createDriver() {
//		System.setProperty("webdriver.chrome.driver", "D:/Programs/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://globbing.com");
//	}
//
//	@AfterClass 
//	public void tearDown() {
//		driver.quit();
//	}
//	
	@BeforeMethod
	public void createDriverForMethod() {
		System.setProperty("webdriver.chrome.driver", "D:/Programs/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://globbing.com");
	}
	@AfterMethod
	public void tearDownForMethod() {
		driver.quit();
	}
}
