package am.qa.globbing.test.register;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.register.RegisterPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingRegistrationTest extends GlobbingBaseTest {

	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials" })
	public void testRegWithCorrectCredentials() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("user@gmail.com", "useruser", "useruser", "9876543");
	}

	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials1" })
	public void testRegWithIncorrectCredentials() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("sxal", "vaheizmiryan", "vaheizmiryan", "9876543");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent());
	}

	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials2" })
	public void testRegWithIncorrectCredentials1() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("user1@gmail.com", "sxal", "vaheizmiryan", "9876543");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent1());
	}

	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials3" })
	public void testRegWithIncorrectCredentials2() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("user2@gmail.com", "useruser2", "sxal", "9876543");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent2());
	}

	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials4" })
	public void testRegWithIncorrectCredentials3() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		//Assert.assertTrue(GlobbingHomePage.registerButton);
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("user3@gmail.com", "useruser3", "useruser3", "11");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent3()/*||RegisterPage.isRegErrorMsgPresent5()*/);
	}

	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials5" })
	public void testRegWithIncorrectCredentials4() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUserWithoutChekbox("user4@gmail.com", "useruser4", "useruser4", "9876543");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent4());
	}
	
	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials6" })
	public void testRegWithIncorrectCredentials5() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("sxal5", "sxal5", "useruser5", "9876543");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent());
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent1());
	}
	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials7" })
	public void testRegWithIncorrectCredentials6() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("sxal6", "sxal6", "sxalsxal6", "9876543");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent());
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent1());
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent2());
	}
	
	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials8" })
	public void testRegWithIncorrectCredentials7() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.clickOnLogo();
		RegisterPage register = home.openRegisterDialog();
		register.registerUser("sxal7", "sxal7", "sxalsxal7", "77");
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent());
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent1());
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent2());
		Assert.assertTrue(RegisterPage.isRegErrorMsgPresent3()/*||RegisterPage.isRegErrorMsgPresent5())*/);

	}
	
//	@Test(dependsOnMethods = { "testRegWithIncorrectCredentials9" })
	@Test
	public void testRegWithIncorrectCredentials8() {
	GlobbingHomePage home = new GlobbingHomePage(driver);
	//home.clickOnLogo();
	RegisterPage register = home.openRegisterDialog();
	register.registerUserWithoutChekbox("sxal8", "sxal8", "sxalsxal", "88");
	Assert.assertTrue(RegisterPage.isRegErrorMsgPresent());
	Assert.assertTrue(RegisterPage.isRegErrorMsgPresent1());
	Assert.assertTrue(RegisterPage.isRegErrorMsgPresent2());
	Assert.assertTrue(RegisterPage.isRegErrorMsgPresent3()/*||RegisterPage.isRegErrorMsgPresent5())*/);
	Assert.assertTrue(RegisterPage.isRegErrorMsgPresent4());
	}
}