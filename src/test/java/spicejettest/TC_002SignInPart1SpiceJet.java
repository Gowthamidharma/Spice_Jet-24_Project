package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.SignUpPageSpiceJet;

public class TC_002SignInPart1SpiceJet extends PSMethodspicejet {
	
	  @BeforeTest 
	  public void setup() { 
	  testName = "tc_002_SignInSpiceJet";
	  testDescription = "SignIn to SpiceJet Website"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="SignInPart1";
	  }
	  
	  @Test(dataProvider = "getdata")
	  public void tc_002_SignInSpiceJet(String Title,String FName,String LName,String Country, String Month, String Year, String Date, String textxpath, String expMsg) throws Exception {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoSignUp();	
		  SignUpPageSpiceJet sp = new SignUpPageSpiceJet(driver);
		  String actMsg = sp.SignInFunctionalityPart1(Title,FName,LName,Country,Month,Year,Date,textxpath);
		  softassert(actMsg,expMsg);
		  if (actMsg.equalsIgnoreCase(expMsg)) {
			  screenShot("Validating SignUp Functionality- Pass" + testName);
		  } else {
			 screenShot("Validating SignUp Functionality- Fail" + testName);	  
		  }
		  
	  }	
	  
	  
}

		  
		  
		  
	  


