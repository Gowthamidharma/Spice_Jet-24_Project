package spicejetbase;





import spicejetutils.UtilitySpiceJet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;






public class PSMethodspicejet extends UtilitySpiceJet {

	
	  public static ExtentHtmlReporter reporter; 
	
	// extent report in before suite
	@BeforeSuite
	public void StartAutomation() {
		System.out.println("SpiceJet Automation Started Successfully");				
		String extentreport= "C:\\Users\\Lishanth\\eclipse-workspace\\spicejetproject\\src\\test\\resources\\ExtentReportSpicejet.html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(extentreport);		
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);		
		  
	}
	
	// information to be extended before each class
	  @BeforeClass	  
	  public void testDetails() { 		 
			test = extent.createTest(testName, testDescription);
			test.assignCategory(testCategory);
			test.assignAuthor(testAuthor); 
			
	  }
	  
	// passing the browser in parameter in before method
	@Parameters("browser")
	@BeforeMethod
	public void navigatetoURL(String browser) throws Exception {
		launchbrowser(browser);	
		geturl(readpropfile("url"));		
		
	}		
	
	
	// quit  browser after method
	  @AfterMethod 
	  public void close() { 
		  closebrowser(); 
	  } 
	 
	 
	// providing data to the methods
	@DataProvider (name="getdata")
	public String[][] getdata() throws Exception {
		
		String[][] data= readexcel(sheetName);
		return data;
		
	}	
	
	// message after extent report and we flush report in listener class
	@AfterSuite
	public void EndAutomation() {
		System.out.println("SpiceJet Automation Completed Sucessfully");	
		
	}
	
	
	
	
}



