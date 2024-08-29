package spicejetpages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejetbase.PSMethodspicejet;

public class HomePageSpiceJet extends PSMethodspicejet {
	
	@FindBy(xpath = "//div[text()='Signup']")
	WebElement signupHomePage;	
	@FindBy(xpath="//div[text()='Login']")
	WebElement LoginHomePage;	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement CheckIn;	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement FlightStatus;
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement ManageBooking;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']")
	WebElement OnewayRadio;	
	@FindBy(xpath="//footer//a")
	WebElement links;
	@FindBy(xpath="(//*[name()='circle'])[3]")
	WebElement clickRadio;
	
	
	public  HomePageSpiceJet(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		
	}

	//method for SignIn
	public void gotoSignUp() {
		clickOn(signupHomePage);		
		SwitchWindows();	
			
	}
	
	//method for Login
	public void gotoLogin() {
		clickOn(LoginHomePage);
	}
	
	//method to check, field is present in HomePage
	public boolean checkIsDisplayedCheckIn() {
		return CheckIn.isDisplayed();
	}
	
	//method to check,  field is present in HomePage
	public boolean checkIsDisplayedFlightStatus() {
		return FlightStatus.isDisplayed();
	}
	
	// method to check, field is present in HomePage
	public boolean checkIsDisplayedManageBooking() {
		return ManageBooking.isDisplayed();
	}
	
	//method check if radio button is enabled in default
	public boolean checkIsEnabledOneway() {
		return OnewayRadio.isEnabled();
	}	

	//method to find broken links of a page
	public List<String> brokenLinkFinder() throws Exception {
		jsScrollUntillElement(links);
		waitforLinks();		;
		List<WebElement> elements = driver.findElements(By.xpath("//footer//a"));
		for(WebElement element:elements)
			System.out.println("List of links in Current Page "+ extractText(element));
		int brokenLinkCount = 0;		
		List<String> brokenLinks = new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++) {
			String links = elements.get(i).getAttribute("href");
			int responseCode = getResponseCode(links);
			if (responseCode >= 400) {
				brokenLinkCount++;
				brokenLinks.add(links);
			}
		}
		System.out.println("No.of BrokenLinks In the Current Page is " + brokenLinkCount);
		return brokenLinks;
	}
		
}
