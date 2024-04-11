package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptManager {
	JavascriptExecutor jse;
	//Scroll into an element
	public void scrollIntoView(WebDriver driver, WebElement element) {
		jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Scroll to the top
	public void scrollToTop(WebDriver driver) {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, 0);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

