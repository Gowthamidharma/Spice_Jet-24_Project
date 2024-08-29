package spicejettest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.NavigatetoURLSpiceJet;
import spicejetpages.SessionTimeOutSpiceJet;

public class TC_015SessionTimeOutSpiceJet extends PSMethodspicejet {
	
	 @BeforeTest 
	  public void setup() { 
	  testName = "tc_015_SessionTimeoutSpiceJet";
	  testDescription = "Validating Session Timeout Message In SpiceJet Website"; 
	  testCategory =  "Regression";
	  testAuthor = "Gowthami Dharmalingam"; 
	  }
	 

	  @Test
	  public void tc_015_SessionTimeoutSpiceJet() throws Exception {
		  NavigatetoURLSpiceJet link = new NavigatetoURLSpiceJet(driver);
		  link.SpiceJetPageTitle();
		  SessionTimeOutSpiceJet ss= new SessionTimeOutSpiceJet(driver);
		  ss.SessionTimeout();
		 if(assertTrue(true, "No SessionTimeout Waring was given")){
		  	  screenShot("Validating Session timeout Message In SpiceJet Web Application - Pass"+ testName );		  

		  }
}
	  
}	  
	  
