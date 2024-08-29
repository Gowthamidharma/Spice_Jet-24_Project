package spicejetpages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicejetbase.PSMethodspicejet;

public class LoginPageSpiceJet extends PSMethodspicejet {
	
	@FindBy(xpath = "//div[text()='Hi Gowtham']")
	WebElement userElement;	
	@FindBy(xpath="//div[text()='Email']")
	WebElement Emailcheckbox;	
	@FindBy(xpath="	//div[text()='Mobile Number']")
	WebElement Phonenocheckbox;
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement Phnoinputbox;
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	@FindBy(xpath="//div[@class='css-76zvg2 r-c20mna r-1b43r93']")
	WebElement ForgotPassword;
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4']")
	WebElement ForgotPasswordPhNo;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1sp51qo r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73']")
	WebElement SendOTP;
	@FindBy(xpath="//div[text()='Please enter a valid mobile number']")
	WebElement EmptyContactno;	
	@FindBy(xpath = "//div[text()='LOGIN']")
	WebElement LoginPage;
	@FindBy(xpath  = "//div[@class='css-76zvg2 r-jwli3a r-2t9rge r-1b43r93 r-majxgm r-q4m81j']")
	WebElement altLoginPage;
	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	@FindBy(xpath = "//div[@data-testid='to-testID-origin']")
	WebElement OneWayFrom;
	@FindBy(xpath="//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")
	WebElement PlaceFrom;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']//div[@data-testid='to-testID-origin']")
	WebElement PlaceFrom1;	
	@FindBy(xpath ="(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")
	WebElement OnewayFrom1;
	@FindBy(xpath="//input[@value='Select Destination']")
	WebElement OnewayTo;
	@FindBy(css = ".css-1dbjc4n.r-b5h31w.r-95jzfe.css-1dbjc4n.r-b5h31w.r-95jzfe")
	WebElement selectDestination;
	@FindBy(xpath="//div[text()='Select a region and city below']")
	WebElement OnewayDestination;	
	@FindBy(xpath="//div[text()='AMD']")
	WebElement selectAMD;
	@FindBy(xpath="//input[@value='Ahmedabad (AMD)']")
	WebElement selectPlaceAMD;	
	@FindBy(xpath="//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][normalize-space()='From']")
	WebElement selectplaceFrom;	
	@FindBy(xpath="//div[text()='MAA']")
	WebElement selectPlaceFrom;	
	@FindBy(xpath = "//div[text()='DEL']")
	WebElement selectPlaceTo;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']")
	WebElement selectFrom;	
	@FindBy(css =  "div[class='css-1dbjc4n r-18u37iz'] div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'] div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
	WebElement OnewayDepartureInput;	
	@FindBy(css = ".css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu")
	WebElement calendarPage;	
	@FindBy(xpath ="(//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[1]")
	WebElement OnewayDeparture;	
	@FindBy(xpath="(//*[name()='circle'])[5]")
	WebElement OnewayNextCalendar;	
	@FindBy(xpath  = "//div[text()='August ']")
	WebElement oneWayActMonth1;	
	@FindBy(xpath = "//div[text()='November ']")
	WebElement oneWayActMonth2;	
	@FindBy(xpath  = "//div[text()='August ']")
	WebElement ExpMonth1;
	@FindBy(xpath="//div[text()='I Am Here For...']")
	WebElement scrollforview;	
	@FindBy(xpath="//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")
	WebElement OnewayPassengers;	
	@FindBy(css = ".css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu")
	WebElement Novmembercalendar;	
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='November 2024']")
	WebElement ExpMonth2;		
	@FindBy(xpath="(//div[text()='9'])[4]")
	WebElement ExpDate1;	
	@FindBy(xpath = "(//div[text()='11'])[6]")
	WebElement ExpDate;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")
	WebElement OneWayAdult;
	@FindBy(xpath = "//div[@id='react-root']//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']//div[2]//div[2]//div[3]")
	WebElement OnewayChildren;	
	@FindBy(css = "div[class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-u8s1d r-13qz1uu r-8fdsdq'] div[class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']")
	WebElement scrollforDone;	
	@FindBy(css = ".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")
	WebElement OnewayPassengerDone1;	
	@FindBy(xpath = "//div[text()='Done']")
	WebElement OnewayPassengerDone;
	@FindBy(xpath = "//div[text()='Search Flight']")
	WebElement OnewaySearchFlight;	
	@FindBy(css = ".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")
	WebElement OnewaySearchFlight1;	
	@FindBy(xpath = "//div[text()='Destination city cannot be empty']")	
	WebElement ErrorMsgforNoDest;	
	@FindBy(xpath="//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[1]/div[1]/div[1]/div[1]//*[name()='svg']//*[name()='circle' and contains(@cx,'9')")
	WebElement SelectFamilyFriends;	
	@FindBy(xpath="//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1kihuf0 r-13awgt0 r-ometjm']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-14lw9ot r-18u37iz r-1k9zyfm r-1wtj0ep r-15d164r r-1x0uki6']/div[@class='css-1dbjc4n r-1habvwh r-1777fci']/div[@class='css-76zvg2 r-homxoj r-1hfyk0a']/span[1]")
	WebElement OnewayBookingValidation;	
	@FindBy(css = "div[class='css-1dbjc4n r-1habvwh r-1777fci']")
	WebElement OnewayValidation;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73'][@data-testid='round-trip-radio-button']")
	WebElement Roundtrip;	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']")
	WebElement MoveonRoundTrip;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']")
	WebElement altroundtrip;	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73'])[2]")
	WebElement roundTripRadio;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[2]")
	WebElement roundtripcalendarclick;	
	@FindBy(css ="div[class='css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")
	WebElement roundtripCalendar;
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[16]")
	WebElement returnCalendar;	
	@FindBy(xpath = "//div[text()='November ']")
	WebElement RoundTripActMon1;
	@FindBy(xpath = "//div[text()='December ']")
	WebElement RoundTripActMon2;	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-1hfyk0a']//span)[1]")
	WebElement roundtripValidation;	
	@FindBy(css="div[data-testid='undefined-month-December-2024']")
	WebElement DecemberCalendar;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-rs99b7 r-6koalj r-eqz5dr r-1pi2tsx r-pm9dpa r-1knelpx r-13qz1uu']")
	WebElement MoveOnCalendar;	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73'])[1]")
	WebElement Onewayradio;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73'])[2]")
	WebElement Roundtripradio;	
	@FindBy(xpath="(//*[name()='circle'])[3]")
	WebElement clickRadio;
	@FindBy(xpath="//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
	WebElement passengerRoundtrip;	
	@FindBy(xpath="//div[text()='Log Out']")
	WebElement Logout;
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='August 2024']")
	WebElement ActMonth;
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='October 2024']")
	WebElement ExpMonth;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088'])[3]")
	WebElement expMonthDates;
	@FindBy(xpath="(//div[@dir='auto'][normalize-space()='9'])[3]")
	WebElement expDate;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")
	WebElement onewaydate;
	
	
	

	
	public LoginPageSpiceJet(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	//method for Login 
	public void Login(String Phno,String Password) {
		type(Phnoinputbox,Phno);
		type(this.Password, Password);
		performMouseAction(altLoginPage, "click");	
	}
	
	//method for validating Login with PhNo
	public String LoginPhNoFunctionality(String PhoneNo,String Password, String Xpath) {		
		type(Phnoinputbox, PhoneNo);		
		type(this.Password,Password);
		performMouseAction(LoginPage, "click");		
		String actMsg= driver.findElement(By.xpath(""+Xpath+"")).getText();
		return actMsg;
		
		
	}
	//method for validating Login with Email
	public String LoginEmailFunctionality(String email,String Password, String Xpath) {		
		clickOn(Emailcheckbox);
		type(Phnoinputbox, email);		
		type(this.Password,Password);
		performMouseAction(LoginPage, "click");	
		String actMsg= driver.findElement(By.xpath(""+Xpath+"")).getText();
		return actMsg;
		
	}
	
	//method for validating ForgotPassword 
	public String LoginForgotFunctionality(String PhoneNo,String Xpath) {
		performMouseAction(Password, "hover");
		performMouseAction(ForgotPassword, "click");
		waitExplicit(ForgotPasswordPhNo);		
		type(ForgotPasswordPhNo, PhoneNo);
		clickOn(SendOTP);
		String actMsg= driver.findElement(By.xpath(""+Xpath+"")).getText();
		return actMsg;		
		
	}
	
	//method to book Oneway Flight Tickets
	public String OnewayFlightFunctionality(String Date) {
		//waitExplicit(OneWayFrom);
		performMouseAction(OneWayFrom, "click");
		performMouseAction(selectFrom, "hover");
		performMouseAction(selectPlaceFrom, "click");
		performMouseAction(selectDestination,"hover");
		performMouseAction(selectPlaceTo, "click");
		performMouseAction(OnewayDeparture, "click");
		//Calendar(ActMonth1, ExpMonth, Date);		
		Calendar1(Date);		
		clickOn(OnewayPassengers);
		clickOn(OneWayAdult);
		performMouseAction(OnewayPassengers, "click");	
		clickOn(OnewaySearchFlight1);
		String actMsg=extractText(OnewayBookingValidation);
		System.out.println(actMsg);
		return actMsg;
	}
	
	
	//method to book Round trip Flight Tickets
	public String RoundTripFunctionality(String Date,String date) throws Exception {
		performMouseAction(Onewayradio,"click");
		clickOn(Roundtripradio);
		performMouseAction(PlaceFrom, "click");
		performMouseAction(selectFrom, "hover");
		performMouseAction(selectPlaceFrom, "click");
		performMouseAction(selectDestination,"hover");
		performMouseAction(selectPlaceTo, "click");
		performMouseAction(OnewayDeparture, "click");
		//Calendar(ActMonth1, ExpMonth, Date);
		Calendar1(Date);		
		clickOn(roundtripcalendarclick);
		//Calendar(ActMonth1, ExpMonth, Date);
		Calendar1(date);		
		clickOn(OnewayPassengers);
		//clickOn(passengerRoundtrip);
		clickOn(OneWayAdult);
		performMouseAction(OnewayPassengers, "click");	
		clickOn(OnewaySearchFlight1);
		String actMsg=extractText(roundtripValidation);
		System.out.println(actMsg);
		return actMsg;
		
		
	}
	
	//method to Validate Logout Functionality
	public String LogoutFuntonality(String textpath) {
		clickOn(userElement);
		performMouseAction(userElement, "hover");
		clickOn(Logout);
		String actMsg = driver.findElement(By.xpath(""+textpath+"")).getText();
		return actMsg;
		
	}
	
	//method to validate round trip radio button is disabled Before click and Enabled After click of Radio Button and click on Round Trip calendar Field
	public boolean checkIsSelectedRoundtrip() {
		return clickRadio.isSelected();
	}
	
	//method to validate Round Trip calendar is Enabled After  Round Trip Radio Button Click
	public boolean RoundtripCalendarEnabled() {
		return returnCalendar.isEnabled();
		
	}
	
	//method to only click roundTrip Radio Button for Validation of Is selected and is Enabled
	public void RoundtripButtonValidation() {
		performMouseAction(Onewayradio,"click");
		clickOn(Roundtripradio);
		
	}
	
	
	
}

