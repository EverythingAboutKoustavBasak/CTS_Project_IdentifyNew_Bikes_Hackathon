package TestCase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.UsedCars;
import TestBase.BaseClass;


public class TestCase2_UsedCarsDetails extends BaseClass {
	
	@Test(groups= {"regression","master"})
	public void UsedCarDetails() throws InterruptedException, IOException {

		logger.info("**** Starting TC_002_UsedCarDetails ****");
		try {
			logger.info("clicking on  Used Cars and selecting Chennai");
			UsedCars usedCar = new UsedCars(driver);
			
			//Hover and select used cars
			usedCar.selectUsedCars();
			
			//Click on the selected car
			usedCar.clickSelectedCar();

			//Click on the popular models
			usedCar.extractPopularModels();
		} catch (Exception e) {
			logger.info("Failed to click used cars!!!");
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("**** Finished TC_002_UsedCarDetails ****");
	}
}
