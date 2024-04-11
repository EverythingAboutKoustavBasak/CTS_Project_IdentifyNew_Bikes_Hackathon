package PageObject;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.ExcelUtility;

public class LoginPage extends BasePage {

	ExcelUtility excelUtility = new ExcelUtility();

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// locate the google button	//div[@class='Xb9hP']//input[@type="email"]
	@FindBy(id = "identifierId")
	public WebElement emailInput;

	// Locate the "Next" on the login page	//span[text()="Next"]
	@FindBy(xpath = "//span[normalize-space()='Next']")
	public WebElement nextBtn_loc;

	
	
	
	// locate the error message displayed -- this xpath makes one TC4 fail...
//	@FindBy(xpath = "//div[@class='o6cuMc Jj6Lae']") 
//	public WebElement errorMessage;
	
	

	// locate the error message displayed -- this xpath makes TC4 pass...because the error msg location path is dynamic in nature
	@FindBy(xpath = "//div[contains(@class,'Jj6Lae')]") 
	public WebElement errorMessage;
	
	
	// locate the error message displayed
//		@FindBy(css = "div[class*='Jj6Lae']")
//		public WebElement errorMessage;
	 
		
	
	
	// To write invalid account details
	public void setEmailInput() {
		emailInput.sendKeys(randomString() + "@gmail.com");
	}

	// Click the "Next" button
	public void clickNextBtn() throws InterruptedException {
		nextBtn_loc.click();
		Thread.sleep(5000);
	}

	// Extracting the error message and displaying on the console and storing in the excel file
	public void handleErrorMsg() throws IOException {
		
//		use Explicite Wait for error msg
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		
		
		String errorMsg = errorMessage.getText();
		System.out.println("***********************");
		System.out.println(errorMsg);
		excelUtility.setCellData("LoginPage", 0, 0, errorMsg);
	}

	// Generate a random string to type into email input
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5); //it will take any random 5 char...
		return generatedString;
	}
}
