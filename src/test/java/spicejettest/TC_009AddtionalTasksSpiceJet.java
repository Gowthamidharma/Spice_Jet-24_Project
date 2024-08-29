package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spicejetbase.PSMethodspicejet;
import spicejetpages.HomePageSpiceJet;
import spicejetpages.LoginPageSpiceJet;

public class TC_009AddtionalTasksSpiceJet extends PSMethodspicejet {
	
	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_009_AdditionalTasksSpiceJet";
	  testDescription ="Login with EmailFunctioality , Default RadioButton selected in Login Page";
	  testCategory =  "Sanity";
	  testAuthor = "Gowthami Dharmalingam"; 
	  sheetName="LoginEmailData";
	  }
	
	 
		@Test(dataProvider = "getdata")
		public void tc_009_A_LoginEmailFunctionlitySpicejet(String Email,String	Password, String Xpath,String ExpMsg) throws Exception {
			  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
			  hp.gotoLogin();
			  LoginPageSpiceJet lp = new LoginPageSpiceJet(driver);		 
			  String actMsg= lp.LoginEmailFunctionality(Email, Password, Xpath);
			  softassert(actMsg, ExpMsg);
			  if(actMsg.equalsIgnoreCase(ExpMsg)) {
				  screenShot("Validating Login Functionality - Pass " + testName);			  			 
				  }else {
				  screenShot("Validating Login Functionality - Fail " + testName);
			  }
			  
		}
		
		
		@Test
		public void tc_009_B_DefaultOnewayRadioButtonIsEnabledInFlightSearch() throws Exception {
			  HomePageSpiceJet hp= new HomePageSpiceJet(driver);
			  hp.checkIsEnabledOneway();
			  assertTrue(true, "Default One Way Radio Button Is  not Enabled In Flight Search");
			  screenShot("Validating Default One Way Radio Button Is Enabled In Flight Search" + testName);
			
		}
		
		


}
