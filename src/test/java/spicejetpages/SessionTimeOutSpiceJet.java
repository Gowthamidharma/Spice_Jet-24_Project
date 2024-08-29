package spicejetpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import spicejetbase.PSMethodspicejet;



public class SessionTimeOutSpiceJet extends PSMethodspicejet {
	
	//div[@class='css-1dbjc4n r-1awozwy r-drfeu3 r-13awgt0 r-1777fci']//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1dedoh8 r-nsbfu8 r-qiwf3y r-1rttkqs']//div[text()='Your session has timed out']
	//Your session has timed out
	//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-13qz1uu']//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-13awgt0 r-1777fci r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73']			
	//div[@class='css-1dbjc4n r-1awozwy r-drfeu3 r-13awgt0 r-1777fci']//div[text()='Your session is about to expire']
	//div[@class='css-1dbjc4n r-1awozwy r-drfeu3 r-13awgt0 r-1777fci']//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1dedoh8 r-nsbfu8 r-qiwf3y r-1rttkqs']
	
	@FindBy(xpath="	//div[@class='css-1dbjc4n r-1awozwy r-drfeu3 r-13awgt0 r-1777fci']//div[text()='Your session is about to expire']")
	WebElement sessionTimeoutmsg;	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-drfeu3 r-13awgt0 r-1777fci']//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-1777fci r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73']")
	WebElement StartSession;
	
	
	
	public SessionTimeOutSpiceJet(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void SessionTimeout() throws Exception {
		Thread.sleep(760000);
		PopUpwaitFluent(sessionTimeoutmsg, StartSession);
		waitPageLoad();
		waitImplicit();		
		String actTitle = driver.getTitle();
		String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		  hardassert(actTitle, expTitle);		  
		  if (actTitle.equalsIgnoreCase(expTitle)) {
				screenShot("Validating SpiceJet Page Title After Session Timout Message -Pass"+ testName);
			} else {
				screenShot("Validating  SpiceJet Page Title After Session Timout Message - Fail"+ testName);
			}
		
		
		
	}

}

