package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import TestBase.BaseClass;
import Utils.WindowHandling;

public class TestCase4_GoogleSignup extends BaseClass {

	@Test(groups= {"regression","master"})
	public void verifyLoginPage() {
		logger.info("**** Starting TC_004_LoginPage ****");
		try {
			logger.info("Verifying loginPage");
			// Implementing window handles
			WindowHandling windowHandel = new WindowHandling(driver);
			windowHandel.windowNavigate("Sign in - Google Accounts");

			LoginPage loginPage = new LoginPage(driver);

			// Click on the email input button
			loginPage.setEmailInput();

			// Click on the next button displayed on the login page
			loginPage.clickNextBtn();

			// Display the error message displayed on the screejn
			loginPage.handleErrorMsg();

			// Taking screenshot
			screenshot("LoginErrorMsg");
		} catch (Exception e) {
			logger.info("LoginPage verification failed!!!");
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("**** Finished TC_004_LoginPage ****");
	}
}
