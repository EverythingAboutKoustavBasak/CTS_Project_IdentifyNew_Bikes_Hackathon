package Utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import PageObject.BasePage;

public class WindowHandling extends BasePage {
	public WindowHandling(WebDriver driver) {
		super(driver);
	}
	
	//multiple window Handling
	public boolean windowNavigate(String WebsiteTitle) {
		Set<String> window = driver.getWindowHandles();
		for(String id : window) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if(title.equals(WebsiteTitle)) {
				return true;
			}
		}
		return false;
	}
}
