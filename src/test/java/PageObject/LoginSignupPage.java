package PageObject;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSignupPage extends BasePage{
	public LoginSignupPage(WebDriver driver) {
		super(driver);
	}

	//Zigwheels link/ Zigwheels LOGO
	@FindBy(xpath="//a[@class='zw i-b mt-10 pt-2 zw-srch-logo']")
	public WebElement zigwheels;
	
	//Login/SignUp Button Element
	@FindBy(xpath = "//div[@id='des_lIcon']")
	public WebElement loginSignUpButton;
	
	//Login with google Button	//div[@class='fo-nw-step1']//div[@data-track-label="Popup_Login/Register_with_Google"]
	@FindBy(xpath="//div[@class='lgn-sc c-p txt-l pl-30 pr-30 googleSignIn']")
	public WebElement loginWithGoogleButton;
	
	//Click on Zigwheels
	public void clickZigwheels() {
		zigwheels.click();
	}
	
	//Click on Login/SignUp button 
	public void clickLoginSignUp() {
		loginSignUpButton.click();
	}
	
	//Click on Sign in with Google
	public void selectGoogleButton() {
		loginWithGoogleButton.click();
	}
	
}
