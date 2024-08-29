package spicejettest;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;

public class TC_004OnewayFlightSpiceJet extends PSMethodspicejet {
	
	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_004_OnewayFlightSpiceJet";
	  testDescription = "Booking OneWay Flight Ticket with SpiceJet Website"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName= "OnewayLoginData";
	  
	  }
	 
	 @Test(dataProvider = "getdata",priority = 1)
	 public void tc_004_OnewayFlightSpiceJet(String Phno,String Password,String Date, String ExpMsg) throws Exception {
		 HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno,Password);
		  String ActMsg=lp.OnewayFlightFunctionality(Date);
		  softassert(ActMsg, ExpMsg);
		  if(ActMsg.equalsIgnoreCase(ExpMsg)) {
			  screenShot("Valdating Oneway Flight Booking - Pass "+ testName);
		  } else {
			  screenShot("Valdating Oneway Flight Booking - Fail "+ testName);
			  
		  }
		  
	 }
	 

}
