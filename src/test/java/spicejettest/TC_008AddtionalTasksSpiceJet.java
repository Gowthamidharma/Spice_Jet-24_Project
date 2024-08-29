package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;


public class TC_008AddtionalTasksSpiceJet extends PSMethodspicejet {
	
	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_008_AdditonalTasksSpiceJet ";
	  testDescription ="ForgotPassword Functionality And Validate Broken Links";
	  testCategory = "Regression";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="ForgotPasswordData";
	  }

	 
	 @Test(dataProvider = "getdata")
		public void tc_008_A_LoginForgotFunctionalitySpiceJet(String PhoneNo, String Xpath,String ExpMsg) throws Exception {
			  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
			  hp.gotoLogin();
			  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);				  
			  String actMsg= lp.LoginForgotFunctionality(PhoneNo, Xpath);
			  softassert(actMsg, ExpMsg);
			  if(actMsg.equalsIgnoreCase(ExpMsg)) {
				  screenShot("Validating Login ForgotFunctionality - Pass " + testName);
			  }else {
				  screenShot("Validating Login ForgotFunctionality - Fail " + testName);
			  }	
	 }

	 		
			@Test(enabled = false)
			public void tc_008_B_ValidateBrokenLinksofHomePage() throws Exception {
				 HomePageSpiceJet hp= new HomePageSpiceJet(driver);
				 hp.brokenLinkFinder();
				 screenShot("Validate Broken Links of Home Page"+ testName);		
				
			}
			
			
			
			
			
	
}
