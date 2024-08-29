package spicejettest;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.SignUpPageSpiceJet;

public class TC_011SignInTestCaseAllEmptyFields extends PSMethodspicejet {
	
	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_011_ValidateSigInAllEmptyFields";
	  testDescription = "SignIn with All Empty Fields, SpiceJet Website"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="SignInEmptyFields";
	  }
	
	@Test(dataProvider = "getdata")
	public void tc_011_SignInAllEmptyFieldsSpiceJet(String textpath,String expMsg) throws Exception {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoSignUp();	
		  SignUpPageSpiceJet sp = new SignUpPageSpiceJet(driver);
		  String actMsg = sp.SignInFunctionalityAllEmptyFields(textpath);
		  softassert(actMsg, expMsg);
		  if(actMsg.equalsIgnoreCase(expMsg)) {
			  screenShot("Validating SignUp Functionality With all Empty Fields - Pass " + testName);
		  }else {
			  screenShot("Validating SignUp Functionality With all Empty Fields - Fail " + testName);
		  }
	}
	
	
}
