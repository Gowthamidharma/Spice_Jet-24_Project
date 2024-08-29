package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;


public class TC_003LoginPagePhNoSpiceJet extends PSMethodspicejet {
	
	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_003_LoginPhNoFunctionalitySpiceJet";
	  testDescription = "LoginFunctionality with Ph.No SpiceJet"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="LoginPhNoData";
	  }
	 
	@Test(dataProvider = "getdata")
	public void tc_003_LoginPhNoFunctionalitySpiceJet(String PhoneNo,String	Password, String Xpath,String ExpMsg) throws Exception {
		  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);		 
		  String actMsg= lp.LoginPhNoFunctionality(PhoneNo, Password, Xpath);
		  softassert(actMsg, ExpMsg);
		  if(actMsg.equalsIgnoreCase(ExpMsg)) {			  
			  screenShot("Validating Login Functionality - Pass " + testName);
		  }else {
			  screenShot("Validating Login Functionality - Fail " + testName);
		  }		  
		  
		
	}
	
	
}
