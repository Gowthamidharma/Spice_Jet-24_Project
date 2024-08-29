package spicejetutils;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import spicejetbase.PSMethodspicejet;


public class ListenerSpiceJet extends PSMethodspicejet implements ITestListener {	
	 
	
	@Override
	public void onTestStart(ITestResult result) {	
		
			test = extent.createTest(result.getMethod().getMethodName()); 
			
		 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test passed");
		String filepath= testName;
		try {
			filepath = screenShot(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable());
		
		String filepath = null;
		try {
			filepath = screenShot(result.getMethod().getMethodName());			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		try {
			test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {		
		System.out.println("Test skipped");
	}


	@Override
	public void onFinish(ITestContext context) {		
		extent.flush();
	}
	
	
}
