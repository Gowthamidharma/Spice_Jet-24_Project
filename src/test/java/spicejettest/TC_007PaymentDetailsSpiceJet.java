package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.AddOnSpicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;
import spicejetpages.OnewayPassengerDetails;
import spicejetpages.PaymentDetails;

public class TC_007PaymentDetailsSpiceJet extends PSMethodspicejet {

	@BeforeTest 
	  public void setup() { 
	  testName = "tc_007_PaymentSpiceJet";
	  testDescription = "Payment Details  For Flight Booking"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="Passenger&PaymentDetails";
	  }
	
	
	
	@Test(dataProvider = "getdata",priority = 4)
	public void tc_007_PaymentDetailsSpiceJet(String Phno,String Password,String date, String PFN2,String PLN2,String expMsg,String cardNo,String CardholderName,String Month,String Year,String CVV,String ExpMsg
			) throws Exception  {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno, Password);
		  lp.OnewayFlightFunctionality(date);
		  OnewayPassengerDetails pd= new OnewayPassengerDetails(driver);
		  pd.passengerDetails(PFN2, PLN2);
		  AddOnSpicejet addOns= new AddOnSpicejet(driver);
		  addOns.MovewithoutAddOns();
		  PaymentDetails PayDet = new PaymentDetails(driver);
		  String actMsg2 = PayDet.PaymentFunctionality(cardNo, CardholderName, Month, Year, CVV);
		  softassert(actMsg2, ExpMsg);
		  	if(actMsg2.equalsIgnoreCase(ExpMsg)) {
			  screenShot("Validating Payment Details with Oneway Flight Booking - Pass"+ testName);
		  	}
		  	else {
			  screenShot(" Validating Payment Details with Oneway Flight Booking - Fail"+ testName);
		  	} 
		  
		
	}

}
