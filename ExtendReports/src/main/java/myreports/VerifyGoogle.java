package myreports;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class VerifyGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumInstallations\\\\drivers\\\\chromedriver1.exe");
		
		ExtentReports extent=new ExtentReports();
		
		ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("Reports1.html");
		
		ExtentTest testCase;
		
		extent.attachReporter(htmlReport);
		
		
		ChromeDriver driver=new ChromeDriver();
		
		testCase=extent.createTest("testCase");
		
		testCase.log(Status.INFO, "lanch the browser");
		
		driver.get("http://www.google.co.in");
		
		testCase.log(Status.INFO, "get the title");
		
		String title=driver.getTitle();
		
		testCase.log(Status.INFO, "verify the title");
		
		if(title.equals("google")) {
			
			testCase.log(Status.PASS, "testCase is passed");
			
			
		}
		
		else {
			
			testCase.log(Status.FAIL, "testCase is failed");
		}
		
		driver.quit();
		
		extent.flush();

	}

}
