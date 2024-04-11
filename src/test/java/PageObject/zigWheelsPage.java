package PageObject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import TestBase.BaseClass;
//import Utils.JavaScriptManager;

public class zigWheelsPage extends BasePage {

//	JavaScriptManager javaScriptManager = new JavaScriptManager();
	
	
	public zigWheelsPage(WebDriver driver) {
		super(driver);
	}

	//New Bikes Element		//ul[contains(@class,'fnt-16')]//li//a[text()="New Bikes"]
	@FindBy(xpath = "//a[normalize-space()='New Bikes']")
	public WebElement NewBikesElement;

	//Upcoming Bikes element	//span[text()='Upcoming Bikes']
	@FindBy(xpath = "//span[normalize-space()='Upcoming Bikes']")
	public WebElement upcomingBikes;

	
	//Hover to new bikes element and perform action on the target element
	public void clickNewBikes() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(NewBikesElement).perform();
		Thread.sleep(3000);
	}
	
	//Click on upcoming Bikes
	public void selectUpcomingBikes() throws IOException {
		//hover
		Actions actions = new Actions(driver);
		actions.moveToElement(upcomingBikes).perform();
		
		new BaseClass().screenshot("UpcomingBike");
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", upcomingBikes);  
	}
}
