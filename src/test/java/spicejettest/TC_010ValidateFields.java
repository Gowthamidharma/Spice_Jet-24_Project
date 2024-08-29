package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;

public class TC_010ValidateFields extends PSMethodspicejet {
	
	@BeforeTest 
	  public void setup() { 
	  testName = "tc_010_ValidateFieldsInHomePageSpiceJet";
	  testDescription = "Validate Fields in Home Page SpiceJet WebApplication"; 
	  testCategory =  "Sanity";
	  testAuthor = "Gowthami Dharmalingam"; 
	  
	  }
	
	@Test
	public void tc_010_ValidateFieldsInHomePage() throws Exception {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);		 
		  hp.checkIsDisplayedCheckIn();
		  hp.checkIsDisplayedFlightStatus();
		  hp.checkIsDisplayedManageBooking();
		  assertTrue(true,"CheckIn Field Is Displayed");
		  assertTrue(true,"FlightStatus Field Is Displayed");
		  assertTrue(true,"ManageBooking Field Is Displayed");
		  screenShot(" Validating Fields in HomePage "+ testName);
		  
	}

}
