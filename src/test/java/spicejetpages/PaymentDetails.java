package spicejetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicejetbase.PSMethodspicejet;

public class PaymentDetails extends PSMethodspicejet {
	
	@FindBy(xpath="//div[text()='UNBELIEVABLY LOW PRICES!']")
	WebElement PopUp1;
	@FindBy(xpath = "//div[@id='at_addon_close_icon']")
	WebElement closePopUp1;	
	@FindBy(xpath= "//iframe[@class='card_number_iframe']")
	WebElement iframe1;	
	@FindBy(xpath = "//input[@id='card_number']")
	WebElement CardNo;	
	@FindBy(xpath="(//div[@class='input_control'])[1]")
	WebElement CardInput;	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement iframe2;
	@FindBy(xpath="//input[@id='name_on_card']")
	WebElement CardName;
	@FindBy(xpath="//div[text()='I have read and understood all the ']")
	WebElement scrollforviewMonth;
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement iframe3;	
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement Month;	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement iframe4;
	@FindBy(xpath = "//input[@id='card_exp_year']")
	WebElement Year;
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement iframe5;
	@FindBy(xpath="//input[@id='security_code']")
	WebElement CVV;	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1xcajam r-1ej1qmr r-1biggbk']")
	WebElement Proceed1;
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement Proceed;	
	@FindBy(xpath = "//div[text()='Invalid Card Details']")
	WebElement InvalidCardDetailsMsg;
	
	public PaymentDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
	}
	
	//method to fill in Payment Details
	public String PaymentFunctionality(String cardNo,String CardholderName,String month,String year,String cvv) {
		switchtoFrame(iframe1);
		clickOn(CardNo);
		type(CardNo, cardNo);
		switchtoDefaultContent();
		switchtoFrame(iframe2);
		clickOn(CardName);
		type(CardName, CardholderName);
		switchtoDefaultContent();
		jsScrollUntillElement(scrollforviewMonth);
		switchtoFrame(iframe3);
		performMouseAction(Month, "click");
		type(Month, month);
		switchtoDefaultContent();
		switchtoFrame(iframe4);
		performMouseAction(Year, "click");
		type(Year, year);
		switchtoDefaultContent();
		switchtoFrame(iframe5);
		performMouseAction(CVV, "click");
		type(CVV,cvv);
		switchtoDefaultContent();
		switchtoParentFrame();
		jsScrollUntillElement(scrollforviewMonth);
		//performMouseAction(Proceed1, "hover");
		performMouseAction(Proceed,"click");
		String actMsg = extractText(InvalidCardDetailsMsg);
		return actMsg;
		
	}
	
	

}
