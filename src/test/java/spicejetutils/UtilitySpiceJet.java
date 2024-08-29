package spicejetutils;

import java.io.File;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilitySpiceJet {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String sheetName;
	public String testName;
	public String testDescription;
	public String testCategory;
	public String testAuthor;

	public static String readpropfile(String key) throws Exception {
		// read file
		FileReader file = new FileReader("C:\\Users\\Lishanth\\eclipse-workspace\\spicejetproject\\src\\test\\resources\\Spicejet.properties");
		prop = new Properties();
		prop.load(file);
		return prop.get(key).toString();
	}

	public static void geturl(String url) throws Exception {
		driver.get(url);

	}

	public static int getResponseCode(String url) throws Exception, Exception {
		URL link = new URL(url);
		HttpURLConnection connect = (HttpURLConnection) link.openConnection();
		int responseCode = connect.getResponseCode();
		return responseCode;
	}

	public static void launchbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--disable-notifications");
			driver = new EdgeDriver(options);
		} else {
			System.out.println("Opening Chrome browser as Default browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		waitPageLoad();
		driver.manage().window().maximize();		
		waitImplicit();

	}
	
	public static void waitforLinks() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));		
	}
	
	public static void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));	
	}
	
	public static void waitPageLoad() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
	}

	public static void waitExplicit(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(35));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public static void waitExplicitUntillTitle(String titleToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(titleToWait));
	}
	
	public static void waitExplicitforclickable(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(35));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitExplicitString(By Locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}
	
	 public static void pressTab(WebElement element, String text) {
		 	waitExplicit(element);
		 	element.sendKeys(text);
		 	element.sendKeys(Keys.TAB);
		 	
	    }

	public static void type(WebElement element, String text) {
		waitExplicit(element);
		element.clear();
		element.sendKeys(text);
	}
	
	public static void clickOn(WebElement element) {
		waitExplicit(element);
		element.click();
	}
	
	public static String clickon(String visibleText) {
		return clickon(visibleText);
	}
	
				
	public static String extractText(WebElement element) {
		waitExplicit(element);
		return element.getText();
	}
	

	public static void selectFromDropDown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public static void jsScrollUntillElement(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void jsscrollUntilInput(By Locator) {
		waitExplicitString(Locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Locator);

	}

	public static void jsClickOn(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	public static String getPageTitle() {
		waitExplicitUntillTitle(driver.getTitle());
		return driver.getTitle();
	}
	
	
	public void SwitchWindows() {
		
		Set<String> windowHandleSet = driver.getWindowHandles();
		List<String> windowHandlesList =new ArrayList<String>(windowHandleSet);
		for(int i=1;i<windowHandlesList.size() ;i++) {
			waitPageLoad();
			waitImplicit();
			driver.switchTo().window(windowHandlesList.get(i));
		}

	}
	
	public static void PopUpwaitFluent(WebElement element1,WebElement element2) {
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100));
		 try {
			 if(wait1.until(ExpectedConditions.visibilityOf(element1))!= null);
			 String actmsg =extractText(element1);
			 System.out.println(actmsg);
			 performMouseAction(element2,"click");
			
		  	  
		    } catch (Exception e) {
		    				     
		 
		    }
		 
		 
	}
	
	 public static void performMouseAction(WebElement element, String actionType) {
	        Actions actions = new Actions(driver);
	        switch (actionType) {
	            case "hover":
	            	waitExplicit(element);
	                actions.moveToElement(element).perform();
	                break;
	            case "click":
	            	waitExplicit(element);
	                actions.click(element).perform();
	                break;
	            case "doubleClick":
	            	waitExplicit(element);
	                actions.doubleClick(element).perform();
	                break;
	            case "rightClick":
	            	waitExplicit(element);
	                actions.contextClick(element).perform();
	                break;	           
	            default:
	                System.out.println("Invalid action type");
	        }
	 }
	 
	 public static void Calendar1( String Date) {		
		 clickOn(driver.findElement(By.xpath(""+Date+"")));
	 }
	 
	 public static void Calendarjs( WebElement element, String date) {
		 ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value','"+date+"');",element);
	 }
	 
	 public  static void Calendar(String ActMonth1, String ExpMonth,String Date) {
		 while(true) {
			 
			 String actmonth1 = driver.findElement(By.xpath(""+ActMonth1+"")).getText();
			 System.out.println(actmonth1);				
			  String expmonth = driver.findElement(By.xpath(""+ExpMonth+"")).getText();
			  System.out.println(expmonth);
				 
			 if(expmonth.equalsIgnoreCase(actmonth1)) {
				 break;
				 
			 	}else {

			 			driver.findElement(By.xpath("(//*[name()='circle'])[5]")).click();
					
			 		}
			
			 			driver.findElement(By.xpath(""+Date+"")).click();
			 	}
		 
		 
		 }
	 
	 
	 public static void switchtoFrame(WebElement element) {
		 driver.switchTo().frame(element);
	 }
	 
	 
	 public static void switchtoDefaultContent() {
		 driver.switchTo().defaultContent();
	 }
	 
	 public static void switchtoParentFrame() {
		 driver.switchTo().parentFrame();
	 }
	 
	
	
	 public static void alertwait(WebElement element) {
		waitExplicit(element);
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			dismissalert();
			
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present");
			
		}
	}

	public static String getalertmessage() {
		
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		return alertmsg;
	}

	public static void acceptalert() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public static void dismissalert() {
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public static String screenShot(String testName) throws Exception {

		String filepath = "C:\\Users\\Lishanth\\eclipse-workspace\\spicejetproject\\screenShotSpiceJet " +testName+ ".png";
		File src = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des = new File(filepath);
		FileUtils.copyFile(src, des);
		return filepath;
	}

	public static String[][] readexcel(String sheetName) throws Exception {

		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Lishanth\\eclipse-workspace\\spicejetproject\\src\\test\\resources\\SpiceJetData.xlsx");

		XSSFSheet sheet = book.getSheet(sheetName);

		int rowcount = sheet.getLastRowNum();

		short coloumncount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowcount][coloumncount];

		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < coloumncount; j++) {
				XSSFCell cell = row.getCell(j);
				// System.out.println("Read Excel "+ cell.getStringCellValue());

				data[i - 1][j] = cell.getStringCellValue();

			}

		}
		book.close();
		return data;

	}

	public static void titleAssertion(String expTitle) {
		Assert.assertEquals(getPageTitle(), expTitle);
	}

	public static void hardassert(String acttext, String exptext) {
		Assert.assertEquals(acttext, exptext);
	}

	public static void softassert(String actText, String expText) {

		SoftAssert assertObj = new SoftAssert();
		assertObj.assertEquals(actText, expText);
		assertObj.assertAll();

	}
	
	public static boolean assertTrue(boolean condition ,String message) {
		if(!condition) {
			throw new AssertionError(message);
			
		}
		return condition;
	}
	
	public static void assertFalse(boolean condition, String message) {
		if(condition) {
			throw new AssertionError(message);
		}
	}
	
	public static void closebrowser() {
		driver.close();
		driver.quit();
		
	}
	
	

}	