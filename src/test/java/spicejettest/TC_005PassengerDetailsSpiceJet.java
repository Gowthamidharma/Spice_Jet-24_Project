package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;
import spicejetpages.OnewayPassengerDetails;

public class TC_005PassengerDetailsSpiceJet  extends PSMethodspicejet{
	
	@BeforeTest 
	  public void setup() { 
	  testName = "tc_005_PassengerDetailsSpiceJet";
	  testDescription = "Passenger Details"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="Passenger&PaymentDetails";
	  }
	
	
	@Test(dataProvider = "getdata",priority = 2)
	public void tc_005_PassengerDetails(String Phno,String Password, String date, String PFN2,String PLN2,String expMsg,String cardNo,String CardholderName,String Month,String Year,String CVV,String ExpMsg) throws Exception {
		 HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno, Password);
		  lp.OnewayFlightFunctionality(date);
		  OnewayPassengerDetails pd= new OnewayPassengerDetails(driver);
		  pd.passengerDetails(PFN2, PLN2);
		
	}

}
