package testsuite;

import implementations.ReusableMethodsImplementation;
import implementations.TestWebDriverMethodImplementations;
import implementations.UploadImage;
import objectsrepository.Amazon_Objects;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import steps.Amazon_Steps;




import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Amazon_Suite
{
	public static String TimeStamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()).toString();
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;
	static Properties prop = new Properties();
	static Properties Rootprop = new Properties();
	static String reportLocation = prop.getProperty("ExtentReports");
	static String imageLocation = "images/";
	public static int count=0;
	public static String extentReport;
	
	@BeforeTest
	public void Setup() throws Exception
	{
		ReusableMethodsImplementation.breforeTest_PreRequesite_BeforeTestSetup_IndividualModule(driver, prop);
		extentReport=prop.getProperty("ExtentReports") + TimeStamp + ".html";
		report = new ExtentReports(extentReport);
		logger = report.startTest("Verifying Browser Launch");
		logger.log(LogStatus.INFO, "URL in Browser Launched Successfully");
		/*String browserName = ReusableMethodsImplementation.browserSelection_GetParameter("chrome");*/
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriver"));
		driver = ReusableMethodsImplementation.browserSelection_Browser(driver, prop, "chrome");
		long start = System.currentTimeMillis();
		ReusableMethodsImplementation.breforeTest_PreRequesite_PostBrowserLaunch(driver, prop);
		long finish = System.currentTimeMillis();
		long Total_Time = (finish-start)/1000;
		System.out.println("Page Load Time: "+Total_Time+ " Seconds");
		logger.log(LogStatus.INFO, "Application in Browser Launched Successfully");
		if(Total_Time<=3)
		{
			logger.log(LogStatus.INFO, "Application is loading as per expected responce time");
			System.err.println("Application is loading as per expected responce time");
			logger.log(LogStatus.INFO, "Page Load Time: " + Total_Time);
		}
		else
		{
			logger.log(LogStatus.WARNING, "Application is not loading as per expected responce time");
			System.err.println("Application is not loading as per expected responce time");
			logger.log(LogStatus.WARNING, "Page Load Time: " + Total_Time);
		}
		System.out.println("Extent report path: " + extentReport);
		
	}
	@AfterTest
	public void tearDown()
	{
		report.flush();
		driver.quit();
	}
	
	@DataProvider(name = "testData")
	public Object[][] amazonData()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "amazonTestData");
		return arrayObject;
	}
	@Test(priority = 1,dataProvider="testData", enabled=true)
	public static void amazonProductPriceValidation(String productName,String emailIdOrMobileNumber,String password) throws Exception
	{
		try
		{
			logger = report.startTest("DSM Status updating from old to latest");
			Amazon_Steps.amazonProductPriceValidation(driver, productName, emailIdOrMobileNumber, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "DSM Status updating from old to latest", logger, report);
			Amazon_Steps.clickOn_ChangeQuantitiesOrDeleteButton(driver);
			Amazon_Steps.clickOn_DeleteButtonForProduct(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "DSM Status updating from old to latest", logger, report);
			Amazon_Steps.clickOn_ChangeQuantitiesOrDeleteButton(driver);
			Amazon_Steps.clickOn_DeleteButtonForProduct(driver);
			throw e;
		}
	}
	
	
	
}
