package am.qa.globbing.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtil {

	public static void waitForElementPresent(WebDriver driver,int waitSeconds, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
}


// mi hat metod a vor@ katarum a spaselu gorcoxutyun 
//kancheluc heto spasum a enqan incqan vor tvel enq minchev vor tvyal xpath- i tak gtvox elemnt@ chhaytnvi
// ete mer tvac varkyanneric  heto der chi haytnvel mer tvac element@ apa fail a gnum


//		DriverUtil.waitForElementPresent(driver, 10, "");
// 	kanchum enq senc

