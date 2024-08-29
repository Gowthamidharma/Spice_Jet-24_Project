package spicejetpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicejetbase.PSMethodspicejet;

public class SignUpPageSpiceJet extends PSMethodspicejet {
	
	@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2)")
	WebElement selectTitledropDownKey;	
	@FindBy(id = "first_name")
	WebElement FName;	
	@FindBy(id="last_name")
	WebElement LName;	
	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement selectCountrydropDownKey;	
	@FindBy(xpath = "//label[text()='Date of Birth']")
	WebElement DOBText;	
	@FindBy(css = "img[alt='date']")
	WebElement DOB;	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement Month;	
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement Year;	
	@FindBy(xpath = "//div[@class='react-datepicker__month']")
	WebElement Date;	
	@FindBy(xpath  = "//input[@class=' form-control']")
	WebElement PhoneNumber;	
	@FindBy(id  = "email_id")
	WebElement email;	
	@FindBy(id  = "new-password")
	WebElement newPassword;	
	@FindBy(id  = "c-password")
	WebElement confirmPassword;	
	@FindBy(id  = "defaultCheck1")
	WebElement TermsCheckBox;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement SubmitSignUP;
	@FindBy(xpath="//div[contains(@class,'px-2 mt-40 col-auto align-self-center')]//label[@class='font-14 bold']")
	WebElement altforsubmitscroll;	
	@FindBy(xpath  ="//label[text()='Email ID']")	
	WebElement clickonemailtext;	
	@FindBy(xpath="//body/div[@id='react-root']/div/div/div[@class='container']/div[@class='box-full']/div[@class='row']/div[@class='register-form col-12 col-xl-7 col-lg-8']/div[1]/div[1]/div[1]")
	WebElement AllEmptyField;
	@FindBy(xpath = " mt-40 col-auto align-self-center']")
	WebElement altSubmit;
	
	
	
	
	public SignUpPageSpiceJet(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Validating By Segregating Into Two Parts
	//method to Validating SignIn Functionality Part1	
	public String SignInFunctionalityPart1(String Title,String FName,String LName,String Country, String Month, String Year, String Date, String textXpath) {
	
		selectFromDropDown(selectTitledropDownKey, Title);
		performMouseAction(this.FName, "click");
		pressTab(this.FName,FName);
		performMouseAction(this.LName, "click");
		pressTab(this.LName,LName);
		jsScrollUntillElement(this.email);
		performMouseAction(selectCountrydropDownKey, "click");
		selectFromDropDown(selectCountrydropDownKey, Country);
		performMouseAction(DOB, "click");
		selectFromDropDown(this.Month, Month);
		selectFromDropDown(this.Year, Year);
		clickOn(driver.findElement(By.xpath(""+Date+"")));
		/*
		 * jsScrollUntillElement(this.email); clickOn(this.PhoneNumber);
		 * pressTab(this.PhoneNumber,PhoneNumber); //clickOn(this.email);
		 * waitExplicit(this.email); pressTab(this.email,email);
		 * clickOn(this.newPassword); pressTab(this.newPassword,newPassword);
		 * clickOn(this.confirmPassword);
		 * pressTab(this.confirmPassword,confirmPassword);
		 * performMouseAction(TermsCheckBox, "hover");
		 */
		performMouseAction(TermsCheckBox, "hover");
		clickOn(TermsCheckBox);
		performMouseAction(SubmitSignUP, "hover");
		clickOn(SubmitSignUP);
		String actMsg= driver.findElement(By.xpath(""+textXpath+"")).getText();
		return actMsg;		
		
		
		
	}
	//method to Validate SignIn Functionality Part2
	public String SignInFunctionalityPart2(String PhoneNumber, String email,String newPassword,String confirmPassword, String textXpath) {
		/*
		 * selectFromDropDown(selectTitledropDownKey, Title); clickOn(this.FName);
		 * pressTab(this.FName,FName); pressTab(this.LName,LName);
		 * jsScrollUntillElement(DOBText); performMouseAction(selectCountrydropDownKey,
		 * "click"); selectFromDropDown(selectCountrydropDownKey, Country);
		 * clickOn(DOB); selectFromDropDown(this.Month, Month);
		 * selectFromDropDown(this.Year, Year);
		 * clickOn(driver.findElement(By.xpath(""+Date+"")));
		 */
		jsScrollUntillElement(SubmitSignUP);
		performMouseAction(this.PhoneNumber, "click");
		//jsScrollUntillElement(this.newPassword);
		clickOn(this.PhoneNumber);
		pressTab(this.PhoneNumber,PhoneNumber);
		//clickOn(this.email);
		waitExplicit(this.email);
		pressTab(this.email,email);
		performMouseAction(this.newPassword, "click");
		clickOn(this.newPassword);
		pressTab(this.newPassword,newPassword);
		performMouseAction(this.confirmPassword, "click");
		clickOn(this.confirmPassword);
		pressTab(this.confirmPassword,confirmPassword);	
		performMouseAction(TermsCheckBox, "hover");
		clickOn(TermsCheckBox);
		performMouseAction(SubmitSignUP, "hover");
		clickOn(SubmitSignUP);
		String actMsg= driver.findElement(By.xpath(""+textXpath+"")).getText();
		return actMsg;		
		
	}
	
	
	//method to validate SignIn Functionality with all empty fields 
	public String SignInFunctionalityAllEmptyFields(String textXpath) {
		jsScrollUntillElement(altforsubmitscroll);
		performMouseAction(SubmitSignUP, "hover");
		clickOn(SubmitSignUP);
		jsScrollUntillElement(AllEmptyField);
		String actMsg= driver.findElement(By.xpath(""+textXpath+"")).getText();
		System.out.println(actMsg);
		return actMsg;	
		
	}


	
	
	
	
	
	

}
