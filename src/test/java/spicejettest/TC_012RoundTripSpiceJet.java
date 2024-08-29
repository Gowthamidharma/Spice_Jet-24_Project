package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.semconv.SemanticAttributes.FaasTriggerValues;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;

public class TC_012RoundTripSpiceJet extends PSMethodspicejet {
	
	@BeforeTest 
	  public void setup() { 
	  testName = "tc_012_RoundTripFlightSpiceJet";
	  testDescription = "Booking RoundTrip Flight Ticket with SpiceJet Website"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName= "RoundTrip";
	  
	  }
	
	@Test(dataProvider = "getdata")
	 public void tc_012_RoundTripFlightSpiceJet(String Phno,String Password,String Date,String date,String ExpMsg) throws Exception {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno,Password);		  
		 String actMsg =lp.RoundTripFunctionality(Date, date);		
		  softassert(actMsg, ExpMsg);
		  if(actMsg.equalsIgnoreCase(ExpMsg)) {
			  screenShot("Valdating RoundTrip Flight Booking - Pass "+ testName);
		  } else {
			  screenShot("Valdating RoundTrip Flight Booking - Fail "+ testName);
			  
		  }
		  

	}
}
