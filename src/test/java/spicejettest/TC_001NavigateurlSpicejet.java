package spicejettest;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import spicejetbase.PSMethodspicejet;
import spicejetpages.NavigatetoURLSpiceJet;

public class TC_001NavigateurlSpicejet extends PSMethodspicejet {

	
	  @BeforeTest 
	  public void setup() { 
	  testName = "tc_001_A_navigatToSpiceJet";
	  testDescription = "Navigating to the SpiceJet website and Validating for Broken URL"; 
	  testCategory =  "Smoke";
	  testAuthor = "Gowthami Dharmalingam"; 
	  }
	 

	 
	  @Test
	  public void tc_001_A_navigateToSpiceJet() throws Exception {
		  NavigatetoURLSpiceJet link = new NavigatetoURLSpiceJet(driver);
		  String actTitle = link.SpiceJetPageTitle();
		  String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		  softassert(actTitle, expTitle);
		  if (actTitle.equalsIgnoreCase(expTitle)) {
				screenShot("Validating SpiceJet Page Title -Pass"+ testName);
			} else {
				screenShot("Validating  SpiceJet Page Title - Fail"+ testName);
			}
		  
	  }
	  
				  
		  @Test
		  public void tc_001_B_validatebrokenurlSpieJet() throws Exception { 
			  NavigatetoURLSpiceJet url=new NavigatetoURLSpiceJet(driver); 
			  	if(url.urlResponseCode()==200) {
				  screenShot("Validating SpiceJet page URL is broken or not - Pass"+testName);
			  	} else {
			  	  screenShot("Validating SpiceJet page URL is broken or not - Fail"+testName);
			  	  } 
			  		AssertJUnit.assertTrue(url.urlResponseCode()==200); 
			  	}
		 

}
