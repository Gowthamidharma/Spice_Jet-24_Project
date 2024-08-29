package spicejetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicejetbase.PSMethodspicejet;

public class OnewayPassengerDetails extends PSMethodspicejet{
	
	@FindBy(css ="div[class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement OnewayContinueBooking;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz r-1x0uki6 r-10ahfku']//div[@class='css-1dbjc4n r-76uxam r-zso239 r-khh7iy r-1unwek3']//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj']//input[@type='text']")
	WebElement primaryPassengerFN;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz r-1x0uki6 r-10ahfku']//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj r-l0gwng']//input[@type='text']")
	WebElement primaryPassengerLN;
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy']")
	WebElement primaryPassengerPhNo;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz r-1g94qm0 r-mhe3cw']//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj r-l0gwng']//input[@type='text']")
	WebElement primaryPassengeremail;	
	@FindBy(xpath="(//*[name()='rect'])[2]")
	 WebElement checkbox;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-vlx1xi r-5360zw']//input[@type='text']")
	WebElement PassengerFN1;	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-mvpalk r-5360zw']//input[@type='text']")
	WebElement PassengerLN1;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-156q2ks r-1sp51qo r-d9fdf6 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr']")
	WebElement Passenger1Next;
	@FindBy(css  = "div[class='css-1dbjc4n r-1awozwy r-lfiufh r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'] input[type='text']")
	WebElement PassengerFN2;
	@FindBy(css="div[class='css-1dbjc4n r-mvpalk r-5360zw'] input[type='text']")
	WebElement PassengerLN2;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-156q2ks r-1sp51qo r-d9fdf6 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr']")
	WebElement Passenger2Next;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-19554kt r-184en5c']")
	WebElement PassengerTitle3;
	@FindBy(xpath="//div[text()='Master']")
	WebElement PassengerTitleSelect3;
	@FindBy(css  = "div[class='css-1dbjc4n r-1awozwy r-lfiufh r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'] input[type='text']")
	WebElement PassengerFN3;
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-mvpalk r-5360zw']//input[@type='text']")
	WebElement PassengerLN3;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement PassengerDetailscontinue;
	
	
	
	
	public OnewayPassengerDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//method to Provide Passenger Details for Flight Booking
	public void passengerDetails(String PFN2,String PLN2) {
		clickOn(OnewayContinueBooking);		
		clickOn(checkbox);
		clickOn(Passenger1Next);
		performMouseAction(PassengerLN2, "click");
		type(PassengerFN2, PFN2);
		type(PassengerLN2, PLN2);				
		performMouseAction(PassengerDetailscontinue, "click");
		
	}
	
	
}
