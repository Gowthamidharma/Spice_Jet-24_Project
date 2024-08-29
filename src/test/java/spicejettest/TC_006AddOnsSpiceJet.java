package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.AddOnSpicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;
import spicejetpages.OnewayPassengerDetails;

public class TC_006AddOnsSpiceJet  extends PSMethodspicejet{
	

	@BeforeTest 
	  public void setup() { 
	  testName = "tc_006_AddOnsSpiceJet";
	  testDescription = "AddOns with Spicejet Flight Booking WebApplication"; 
	  testCategory =  "Regression";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="Passenger&PaymentDetails";
	  }

	

	@Test(dataProvider = "getdata",priority = 3)
	public void tc_006_AddOns(String Phno,String Password,String date, String PFN2,String PLN2,String expMsg,String cardNo,String CardholderName,String Month,String Year,String CVV,String ExpMsg
) throws Exception {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno, Password);
		  lp.OnewayFlightFunctionality(date);
		  OnewayPassengerDetails pd= new OnewayPassengerDetails(driver);
		  pd.passengerDetails(PFN2, PLN2);
		  AddOnSpicejet addOns= new AddOnSpicejet(driver);
		  String actMsg =addOns.AddonFunctionality();
		  softassert(actMsg, expMsg);
		  if(actMsg.equalsIgnoreCase(expMsg)) {
			  screenShot("Validating AddOns with Oneway Flight Booking - Pass"+ testName);
		  }
		  else {
			  screenShot("Validating AddOns with Oneway Flight Booking - Fail"+ testName);
		  }
		  
		
	}
}
