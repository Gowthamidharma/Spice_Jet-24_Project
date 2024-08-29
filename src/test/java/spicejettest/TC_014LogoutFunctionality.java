package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;

public class TC_014LogoutFunctionality  extends PSMethodspicejet{
	

	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_014_LogoutFunctionalitySpiceJet ";
	  testDescription ="Validate Logout Functionality";
	  testCategory = "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="Login";
	  }
	
	
	
	@Test(dataProvider = "getdata")
	public void tc_008_C_LogoutFunctionality(String Phno,String Password,String textpath, String ExpMsg) throws Exception {
		HomePageSpiceJet hp= new HomePageSpiceJet(driver);
		  hp.gotoLogin();
		  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);	
		  lp.Login(Phno, Password);
		  String actMsg= lp.LogoutFuntonality(textpath);		  
		  softassert(actMsg, ExpMsg);
		  if(actMsg.equalsIgnoreCase(ExpMsg)) {
			  screenShot("Validating Logout Functionality - Pass"+ testName);
		  } else {
			  screenShot("Validating Logout Functionality - Fail"+ testName);
		  
		  }
		
	}

}
