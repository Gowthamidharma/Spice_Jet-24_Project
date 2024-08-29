package spicejetpages;



import org.openqa.selenium.WebDriver;
import spicejetbase.PSMethodspicejet;

public class NavigatetoURLSpiceJet  extends PSMethodspicejet{
	
	public NavigatetoURLSpiceJet(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//method to get page Title
	public String SpiceJetPageTitle() throws Exception {
		return getPageTitle();
	}
	
	//method to get response code
	public int urlResponseCode() throws Exception {
		return getResponseCode(readpropfile("url"));
	}
	
	

}
