package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.UpcomingBikes;
import PageObject.zigWheelsPage;
import TestBase.BaseClass;

public class TestCase1_UpcomingBikeDetails extends BaseClass {

	@Test(groups= {"smoke","regression","master"})
	public void clickNewBikes() throws InterruptedException {
		logger.info("**** Starting TC_001_UpcomingBike ****");
		try {
			logger.info("clicking on  New Bikes ");
			// Navigate to Zigwheels page
			zigWheelsPage zwg = new zigWheelsPage(driver);
			// click on new bikes
			zwg.clickNewBikes();
			// Click on upcoming bikes under new bikes
			zwg.selectUpcomingBikes();
		} catch (Exception e) {
			logger.info("Failed to click New Bikes");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test( dependsOnMethods = { "clickNewBikes" }, groups= {"smoke","regression","master"})
	public void clickUpcomingBikes() {
		try {
			logger.info("clicking on Upcoming Bikes");
			UpcomingBikes upcomingBike = new UpcomingBikes(driver);
			// Click on Manufacturer
			upcomingBike.clickManufacturer();
			
			// Click on the view more bikes button
			upcomingBike.clickViewMoreButton();
			
			// Displaying the details of the bikes
			upcomingBike.bikeDetails();
		} catch (Exception e) {
			logger.info("Failed to click upcoming bikes");
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("**** Finished TC_002_UpcomingBike ****");
	}

}
