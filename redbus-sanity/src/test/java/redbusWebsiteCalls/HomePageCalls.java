package redbusWebsiteCalls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericCalls.GenCalls;
import pageObjects.HomePageObjects;

/*This class is created to consolidate all the test cases for Home Page*/
public class HomePageCalls extends GenCalls {

	HomePageObjects hpo = new HomePageObjects();
	WebElement element;

	/*	This method is to verify clicking on Hotel in HomePage is directing to respective page*/
	@Test(priority = 0)
	public void homePageHotelLinkCheck() {
		driver.get(hpo.baseURL);
		element = driver.findElement(By.xpath(hpo.hotelLink));
		element.click();
		Assert.assertEquals(hpo.hotelURL, driver.getCurrentUrl());
	}

	/*	This method is to verify clicking on Bus Hire in HomePage is directing to respective page*/	
	@Test(priority = 1)
	public void homePageBusHireLinkCheck() {
		driver.get(hpo.baseURL);
		element = driver.findElement(By.xpath(hpo.busHireLink));
		element.click();
		Assert.assertEquals(hpo.busHireURL, driver.getCurrentUrl());
	}

	/*	This method is to verify clicking on Pilgrimage in HomePage is directing to respective page*/		
	@Test(priority = 2)
	public void homePagePilgrimageLinkCheck() {
		driver.get(hpo.baseURL);
		element = driver.findElement(By.xpath(hpo.pilgrimagesLink));
		element.click();
		Assert.assertEquals(hpo.pilgrimageURL, driver.getCurrentUrl());
	}

	/*	This method is to verify clicking on Bus ticket in Pilgrimage Page is directing to Home page*/		
	@Test(priority = 3)
	public void homePageBusTicketLinkCheck() {
		driver.get(hpo.pilgrimageURL);
		element = driver.findElement(By.xpath(hpo.busTicketLink));
		element.click();
		Assert.assertEquals(hpo.baseURL, driver.getCurrentUrl());
	}


	/*	This method is to launch the browser to execute the various test cases*/
	@Parameters("browser")
	@BeforeSuite
	public void before(String browser) { 
		if (browser.equalsIgnoreCase("chrome")) {
			chrome();
		} else if (browser.equalsIgnoreCase("firefox")) {
			firefox();
		}
	}

	/*	This method is to close the browser after the execution is complete*/
	@AfterSuite
	public void after() {
		driver.quit();
	}
}
