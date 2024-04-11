package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		
		//this method will create WebElement. And the driver is applicable for all the elements of the page objects
		PageFactory.initElements(driver, this);
	}
}