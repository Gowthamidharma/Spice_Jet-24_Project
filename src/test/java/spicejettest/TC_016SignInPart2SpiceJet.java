package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.SignUpPageSpiceJet;

public class TC_016SignInPart2SpiceJet extends PSMethodspicejet {
	
	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_016_SignInPart2_SpiceJet";
	  testDescription = "SignIn to SpiceJet Website"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="SignInPart2";
	  }
	  
	  @Test(dataProvider = "getdata")
	  public void tc_016_SignInPart2_SpiceJet(String PhoneNumber, String email,String newPassword,String confirmPassword, String textxpath, String expMsg) throws Exception {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoSignUp();	
		  SignUpPageSpiceJet sp = new SignUpPageSpiceJet(driver);
		  String actMsg = sp.SignInFunctionalityPart2(PhoneNumber, email, newPassword, confirmPassword, textxpath);
		  softassert(actMsg,expMsg);
		  if (actMsg.equalsIgnoreCase(expMsg)) {
			  screenShot("Validating SignUp Functionality- Pass" + testName);
		  } else {
			 screenShot("Validating SignUp Functionality- Fail" + testName);	  
		  }
		  
	  }	
	  

}
