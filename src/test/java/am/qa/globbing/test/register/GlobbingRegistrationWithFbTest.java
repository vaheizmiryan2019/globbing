package am.qa.globbing.test.register;

import org.testng.annotations.Test;

import am.qa.globbing.page.home.GlobbingHomePage;
import am.qa.globbing.page.register.RegisterPage;
import am.qa.globbing.test.base.GlobbingBaseTest;

public class GlobbingRegistrationWithFbTest extends GlobbingBaseTest {

	//Open Globbing
	//Register with fb
	
	// 15
	@Test
	public void regWithFbAcc() {
		GlobbingHomePage home = new GlobbingHomePage(driver);
		home.openRegisterDialog();
		RegisterPage fbReg = new RegisterPage(driver);
		fbReg.regWithFb();
	}
}
