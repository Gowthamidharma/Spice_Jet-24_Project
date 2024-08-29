package spicejetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicejetbase.PSMethodspicejet;

public class AddOnSpicejet extends PSMethodspicejet {
	
	@FindBy(xpath="//div[@class='at_addon_modal']//div[@class='at_addon_modal_content']")
	WebElement Popup;
	@FindBy(xpath="//div[text()='UNBELIEVABLY LOW PRICES!']")
	WebElement PopUp1;
	@FindBy(xpath="div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-1g94qm0'] div[class='css-1dbjc4n r-18u37iz']")
	WebElement AddOnTripSummary;	
	@FindBy(xpath="//div[@class='at_addon_modal']//div[@class='at_addon_modal_content']//div[@class='at_addon_close']")
	WebElement closePopUp;	
	@FindBy(xpath = "//div[@id='at_addon_close_icon']")
	WebElement closePopUp1;	
	@FindBy(xpath="//div[text()='Choose Your Seat']")
	WebElement chooseSeat;	
	@FindBy(xpath = "(//div[text()='Add'])[2]")
	WebElement AddSeat;	
	@FindBy(xpath="(//*[name()='path'][@fill='#FFF'])[16]")
	WebElement seatthree;	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-k200y r-14lw9ot r-6t5ypu r-kicko2 r-18u37iz r-17s6mgv r-nt9dsb r-1pvhfgn r-wsh07t r-kmv1fd r-bnwqim r-1ki14p2'])[1]")
	WebElement CloseSeatSelect;	
	@FindBy(xpath="//div[text()='Carry More On-board']")
	WebElement CarryMore;
	@FindBy(xpath = "//div[@data-testid='bookingFlow-carrymoreonboard-add-cta']")
	WebElement CarryMoreAdd;	
	@FindBy(xpath="(//div[text()='MAA - DEL'])[1]")
	WebElement viewToAddMore;	
	@FindBy(xpath="(//div[@data-focusable='true'])[29]")
	WebElement ClickonDropDown;
	@FindBy(xpath="//div[text()='Book Your Carry More On-board']")
	WebElement clickOnDropDown;
	@FindBy(xpath=" //div[text()=' 1KG']")
	WebElement AddOnekg;	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickDone;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1777fci r-wk8lta r-1w50u8q r-mhe3cw']")
	WebElement TripSummary;
	@FindBy(xpath="//div[text()='1 Carry More On-board 1 KG']")
	WebElement ValidatingAddOns;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	WebElement continueafterAddons;	
	@FindBy(xpath = "//span[text()='Skip this to skip comfort.']")
	WebElement SkipOffer;
	//(//span[@id='skipfrompopup'])[1]
	@FindBy(xpath="//div[text()='Travel Assistance']")
	WebElement altContinue;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-13awgt0 r-1biggbk']//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement ContinueAddons;
	//1 Carry More On-board 1 KG
	
	
	
	public  AddOnSpicejet(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
		
	}
	
	//method to select Add Ons while Flight Booking
	public String AddonFunctionality() {
		PopUpwaitFluent(Popup,closePopUp);
		performMouseAction(CarryMore, "hover");
		performMouseAction(CarryMoreAdd, "click");
		//performMouseAction(viewToAddMore, "hover");
		performMouseAction(clickOnDropDown, "click");
		performMouseAction(AddOnekg, "click");
		performMouseAction(clickDone, "click");
		performMouseAction(TripSummary, "hover");
		performMouseAction(ValidatingAddOns, "hover");
		String ActMsg= extractText(ValidatingAddOns);
		return ActMsg;		
		
	}

	//method to validate payments fields without add ons to flight booking
	public void MovewithoutAddOns() {
		//PopUpwaitFluent(Popup,closePopUp);
		jsScrollUntillElement(ContinueAddons);		
		clickOn(ContinueAddons);
		//performMouseAction(SkipOffer, "click");
		
	
	}
}
