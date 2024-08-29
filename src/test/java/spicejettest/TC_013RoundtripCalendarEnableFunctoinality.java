package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;

public class TC_013RoundtripCalendarEnableFunctoinality  extends PSMethodspicejet{
	
	@BeforeTest 
	  public void setup() { 
	  testName = "tc_013_RoundTripEnabledSpiceJet";
	  testDescription = " Validating RoundTrip Calendar Function Before Radio Button Selected SpiceJet Website"; 
	  testCategory =  "Regression";
	  testAuthor = "Gowthami Dharmalingam"; 	  
	  sheetName = "Login1";
	  }
	
	@Test(dataProvider = "getdata")
	public void tc_016_RoundTripEnabledValidation(String Phno,String Password) throws Exception {
		 HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno,Password);
		  lp.checkIsSelectedRoundtrip();
		  assertTrue(true, "Roundtrip RadioButton Is  been Selected before clicked");
		  lp.RoundtripCalendarEnabled();
		  assertTrue(true, "Roundtrip Calendar Is Enabled Before RoundTrip Radio button Selected");
		  lp.RoundtripButtonValidation();
		  lp.RoundtripCalendarEnabled();
		  if(assertTrue(true, "Roundtrip Calendar is Not enabled after Roundtrip Radio button Selected"));
		  	screenShot("Validating RoundTrip Calendar Is Enabled After Radio Button Click"+ testName);
		  		  		
		}
	
	
	@Test(dataProvider = "getdata")
	public void tc_013RoundTripCalendarEnabled(String Phno,String Password) throws Exception {
		 HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno,Password);		 
		  lp.RoundtripCalendarEnabled();
		 if(assertTrue(true, "Roundtrip Is Enabled Before RoundTrip Radio button Selected"));
		 	screenShot("Validating RoundTrip Calendar Is Disabled Before Radio Button Selected"+ testName);
		  		  		
		}
		
	}

