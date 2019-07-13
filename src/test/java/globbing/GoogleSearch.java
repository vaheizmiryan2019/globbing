package globbing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch {

	@Test
	public void firstTest() {
		System.out.println("This is my first test!");
		System.setProperty("webdriver.chrome.driver", "D:/Programs/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		
		
		WebElement google = driver.findElement(By.name("q"));// or (By.xpath("//input[@class='gLFyf gsfi']"))
		google.sendKeys("This is a test");
		google.sendKeys(Keys.RETURN);
		
		WebElement imagesIcon = driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-imb']//a[contains(@href, 'tbm=isch')]"));
		imagesIcon.click();
		
		WebElement firstImageClick = driver.findElement(By.xpath("//div[@id='search']//div[@data-ri='0']//img"));
		firstImageClick.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//try-ic sksac nenca anum vor spasi mi qich,heto ani hajord gorcoxutyun@,tvyal depqum 5000 milivarkyan
		 
		WebElement imageNum55Click = driver.findElement(By.xpath("//div[@id='search']//div[@data-ri='14']//img"));
		imageNum55Click.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close(); // pakum a chrome-@
	}
}

//comand prompt-um ashxatacnelu dzev@-->    mvn clean install -Dtestng.xml=testng.xml