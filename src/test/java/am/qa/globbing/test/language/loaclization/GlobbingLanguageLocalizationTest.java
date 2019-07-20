package am.qa.globbing.test.language.loaclization;

import org.testng.annotations.Test;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.language.localization.LanguageLocalization;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingLanguageLocalizationTest extends GlobbingBaseTest {
	
	//Default langugage is Armenian
	//Open Globbing 
	//1.From arm to eng
	//2.From eng to rus
	//3.From rus to arm
	//4.From arm to rus
	//5.From rus to eng
	//6.From eng to arm

	
	// 62
	@Test 
	public void armToEng() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnDropdown();	
		LanguageLocalization firstClick = new LanguageLocalization(driver);
		firstClick.clickOnFirst();
	}
	
	// 61
	@Test
	public void engToRus() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnDropdown();
		LanguageLocalization firstClick = new LanguageLocalization(driver);
		firstClick.clickOnFirst();
		home.clickOnDropdown();	
		LanguageLocalization secondClick = new LanguageLocalization(driver);
		secondClick.clickOnSecond();
	}
	
	// 65
	@Test
	public void rusToArm() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnDropdown();
		LanguageLocalization secondClick = new LanguageLocalization(driver);
		secondClick.clickOnSecond();
		home.clickOnDropdown();
		LanguageLocalization thirdClick = new LanguageLocalization(driver);
		thirdClick.clickOnThird();
	}
	
	// 63
	@Test
	public void armToRus() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnDropdown();
		LanguageLocalization fourthClick = new LanguageLocalization(driver);
		fourthClick.clickOnSecond();
	}
	 
	// 64
	@Test
	public void rusToEng() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnDropdown();
		LanguageLocalization fourthClick = new LanguageLocalization(driver);
		fourthClick.clickOnSecond();
		home.clickOnDropdown(); 
		LanguageLocalization fifthClick = new LanguageLocalization(driver);
		fifthClick.clickOnFirst();
	}
	
	// 60
	@Test
	public void engToArm() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnDropdown();
		LanguageLocalization fifthClick = new LanguageLocalization(driver);
		fifthClick.clickOnFirst();
		home.clickOnDropdown();
		LanguageLocalization sixthClick = new LanguageLocalization(driver);
		sixthClick.clickOnThird();
	}
}
