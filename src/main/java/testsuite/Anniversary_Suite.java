package testsuite;

import implementations.ReusableMethodsImplementation;
import implementations.TestWebDriverMethodImplementations;
import implementations.UploadImage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import steps.Anniversary_Steps;




import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Anniversary_Suite
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
	
	@Test(priority = 2, enabled=true)
	public static void fnp_Anniversary002() throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the FNP Application");
			Anniversary_Steps.fnp_Anniversary_002(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the FNP Application is pass", logger, report);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the FNP Application is fail", logger, report);
		}
	}
	@DataProvider(name = "fnp_Anniversary_003")
	public Object[][] fnp_Anniversary003()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_003");
		return arrayObject;
	}
	@Test(priority = 3,dataProvider="fnp_Anniversary_003", enabled=true)
	public static void fnp_Anniversary_003(String flowerName) throws Exception
	{
		try
		{
			logger = report.startTest("Verify user able to select the product from the header tool bar");
			Anniversary_Steps.fnp_Anniversary_003(driver, logger, report, flowerName);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to select the product from the header tool bar is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to select the product from the header tool bar is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
		}
	}
	@DataProvider(name = "fnp_Anniversary_004")
	public Object[][] fnp_Anniversary004()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_004");
		return arrayObject;
	}
	@Test(priority = 4,dataProvider="fnp_Anniversary_004", enabled=true)
	public static void fnp_Anniversary_004(String flowerName) throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the Gift Booking window");
			Anniversary_Steps.fnp_Anniversary_004(driver, logger, report, flowerName);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Gift Booking window is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Gift Booking window is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_005")
	public Object[][] fnp_Anniversary005()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_005");
		return arrayObject;
	}
	@Test(priority = 5,dataProvider="fnp_Anniversary_005", enabled=true)
	public static void fnp_Anniversary_005(String flowerName) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering a data");
			Anniversary_Steps.fnp_Anniversary_005(driver, logger, report, flowerName);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering a data is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering a data is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_006")
	public Object[][] fnp_Anniversary006()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_006");
		return arrayObject;
	}
	@Test(priority = 6,dataProvider="fnp_Anniversary_006", enabled=true)
	public static void fnp_Anniversary_006(String flowerName,String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify user able to Add the Product To Cart in gift booking window");
			Anniversary_Steps.fnp_Anniversary_006(driver, logger, report, flowerName, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to Add the Product To Cart in gift booking window is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutLogout(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to Add the Product To Cart in gift booking window is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_007")
	public Object[][] fnp_Anniversary007()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_007");
		return arrayObject;
	}
	@Test(priority = 7,dataProvider="fnp_Anniversary_007", enabled=true)
	public static void fnp_Anniversary_007(String flowerName,String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify User able to View the Product in the Cart page.");
			Anniversary_Steps.fnp_Anniversary_007(driver, logger, report, flowerName, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to View the Product in the Cart page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutLogout(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to View the Product in the Cart page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_008")
	public Object[][] fnp_Anniversary008()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_008");
		return arrayObject;
	}
	@Test(priority = 8,dataProvider="fnp_Anniversary_008", enabled=true)
	public static void fnp_Anniversary_008(String flowerName,String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify User able to Remove the Product in the Cart page");
			Anniversary_Steps.fnp_Anniversary_008(driver, logger, report, flowerName, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to Remove the Product in the Cart page is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to Remove the Product in the Cart page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_009")
	public Object[][] fnp_Anniversary009()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_009");
		return arrayObject;
	}
	@Test(priority = 9,dataProvider="fnp_Anniversary_009", enabled=true)
	public static void fnp_Anniversary_009(String flowerName,String pincode,String pincode2,String pincode3) throws Exception
	{
		try
		{
			logger = report.startTest("Verify user able to Edit the pin code in Gift booking window");
			Anniversary_Steps.fnp_Anniversary_009(driver, logger, report, flowerName, pincode, pincode2, pincode3);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to Edit the pin code in Gift booking window is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to Edit the pin code in Gift booking window is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_010")
	public Object[][] fnp_Anniversary010()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_010");
		return arrayObject;
	}
	@Test(priority = 10,dataProvider="fnp_Anniversary_010", enabled=true)
	public static void fnp_Anniversary_010(String flowerName,String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify User able to view the Delivery Date & Time in the gift booking window");
			Anniversary_Steps.fnp_Anniversary_010(driver, logger, report, flowerName, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to view the Delivery Date & Time in the gift booking window is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to view the Delivery Date & Time in the gift booking window is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_011")
	public Object[][] fnp_Anniversary011()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_011");
		return arrayObject;
	}
	@Test(priority = 11,dataProvider="fnp_Anniversary_011", enabled=true)
	public static void fnp_Anniversary_011(String flowerName) throws Exception
	{
		try
		{
			logger = report.startTest("Verify functionality of  Buy Now button without Entering data");
			Anniversary_Steps.fnp_Anniversary_011(driver, logger, report, flowerName);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of  Buy Now button without Entering data is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of  Buy Now button without Entering data is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_012")
	public Object[][] fnp_Anniversary012()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_012");
		return arrayObject;
	}
	@Test(priority = 12,dataProvider="fnp_Anniversary_012", enabled=true)
	public static void fnp_Anniversary_012(String flowerName,String pincode,String addOnProductName) throws Exception
	{
		try
		{
			logger = report.startTest("Verify functionality of  Buy Now button with continue with Add-On ");
			Anniversary_Steps.fnp_Anniversary_012(driver, logger, report, flowerName, pincode, addOnProductName);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of  Buy Now button with continue with Add-On is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutLogout(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of  Buy Now button with continue with Add-On is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_013")
	public Object[][] fnp_Anniversary013()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_013");
		return arrayObject;
	}
	@Test(priority = 13,dataProvider="fnp_Anniversary_013", enabled=true)
	public static void fnp_Anniversary_013(String flowerName,String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify Functionality of the Buy Now button with Invalid Pin/ Area");
			Anniversary_Steps.fnp_Anniversary_013(driver, logger, report, flowerName, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify Functionality of the Buy Now button with Invalid Pin/ Area is pass", logger, report);
			Anniversary_Steps.clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify Functionality of the Buy Now button with Invalid Pin/ Area is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_014")
	public Object[][] fnp_Anniversary014()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_014");
		return arrayObject;
	}
	@Test(priority = 14,dataProvider="fnp_Anniversary_014", enabled=true)
	public static void fnp_Anniversary_014(String flowerName,String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify Functionality of the Buy Now button without Add-on");
			Anniversary_Steps.fnp_Anniversary_014(driver, logger, report, flowerName, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify Functionality of the Buy Now button without Add-on is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutLogout(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify Functionality of the Buy Now button without Add-on is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_015")
	public Object[][] fnp_Anniversary015()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_015");
		return arrayObject;
	}
	@Test(priority = 15,dataProvider="fnp_Anniversary_015", enabled=true)
	public static void fnp_Anniversary_015(String flowerName,String pincode,String addOnProductName) throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the Checkout Login page");
			Anniversary_Steps.fnp_Anniversary_015(driver, logger, report, flowerName, pincode, addOnProductName);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Checkout Login page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutLogout(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Checkout Login page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_016")
	public Object[][] fnp_Anniversary016()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_016");
		return arrayObject;
	}
	@Test(priority = 16,dataProvider="fnp_Anniversary_016", enabled=true)
	public static void fnp_Anniversary_016(String flowerName,String pincode,String addOnProductName,String emailId,String name,String mobileNumber,String invalidPassword,String validPassword) throws Exception
	{
		try
		{
			logger = report.startTest("Verify user able to Register with  unregistered  Email id in the checkout login/ Sign up page");
			Anniversary_Steps.fnp_Anniversary_016(driver, logger, report, flowerName, pincode, addOnProductName, emailId, name, mobileNumber, invalidPassword, validPassword);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to Register with  unregistered  Email id in the checkout login/ Sign up page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to Register with  unregistered  Email id in the checkout login/ Sign up page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_017")
	public Object[][] fnp_Anniversary017()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_017");
		return arrayObject;
	}
	@Test(priority = 17,dataProvider="fnp_Anniversary_017", enabled=true)
	public static void fnp_Anniversary_017(String flowerName,String pincode,String addOnProductName) throws Exception
	{
		try
		{
			logger = report.startTest("Verify 'Continue' button functionality with Invalid mail id  in Checkout log-in page");
			Anniversary_Steps.fnp_Anniversary_017(driver, logger, report, flowerName, pincode, addOnProductName);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify 'Continue' button functionality with Invalid mail id  in Checkout log-in page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutLogout(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify 'Continue' button functionality with Invalid mail id  in Checkout log-in page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_018")
	public Object[][] fnp_Anniversary018()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_018");
		return arrayObject;
	}
	@Test(priority = 18,dataProvider="fnp_Anniversary_018", enabled=true)
	public static void fnp_Anniversary_018(String flowerName,String pincode,String addOnProductName,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify 'Continue' button functionality with Valid mail id  and valid password in Checkout log-in page");
			Anniversary_Steps.fnp_Anniversary_018(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify 'Continue' button functionality with Valid mail id  and valid password in Checkout log-in page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify 'Continue' button functionality with Valid mail id  and valid password in Checkout log-in page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_019")
	public Object[][] fnp_Anniversary019()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_019");
		return arrayObject;
	}
	@Test(priority = 19,dataProvider="fnp_Anniversary_019", enabled=true)
	public static void fnp_Anniversary_019(String flowerName,String pincode,String addOnProductName,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify 'Continue' button functionality with In-valid Password in Checkout log-in page");
			Anniversary_Steps.fnp_Anniversary_019(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify 'Continue' button functionality with In-valid Password in Checkout log-in page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify 'Continue' button functionality with In-valid Password in Checkout log-in page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_020")
	public Object[][] fnp_Anniversary020()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_020");
		return arrayObject;
	}
	@Test(priority = 20,dataProvider="fnp_Anniversary_020", enabled=true)
	public static void fnp_Anniversary_020(String flowerName,String pincode,String addOnProductName,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the Delivery Details page");
			Anniversary_Steps.fnp_Anniversary_020(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Delivery Details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Delivery Details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_021")
	public Object[][] fnp_Anniversary021()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_021");
		return arrayObject;
	}
	@Test(priority = 21,dataProvider="fnp_Anniversary_021", enabled=true)
	public static void fnp_Anniversary_021(String flowerName,String pincode,String addOnProductName,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify functionality of the 'Change' button in delivery details page");
			Anniversary_Steps.fnp_Anniversary_021(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of the 'Change' button in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of the 'Change' button in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_022")
	public Object[][] fnp_Anniversary022()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_022");
		return arrayObject;
	}
	@Test(priority = 22,dataProvider="fnp_Anniversary_022", enabled=true)
	public static void fnp_Anniversary_022(String flowerName,String pincode,String addOnProductName,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify functionality of the 'Delete' button in Delivery details page");
			Anniversary_Steps.fnp_Anniversary_022(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of the 'Delete' button in Delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of the 'Delete' button in Delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
		}
	}
	@DataProvider(name = "fnp_Anniversary_023")
	public Object[][] fnp_Anniversary023()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_023");
		return arrayObject;
	}
	@Test(priority = 23,dataProvider="fnp_Anniversary_023", enabled=true)
	public static void fnp_Anniversary_023(String flowerName,String pincode,String addOnProductName,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify User able to view the sender's details  in the delivery details page");
			Anniversary_Steps.fnp_Anniversary_023(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to view the sender's details  in the delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to view the sender's details  in the delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_024")
	public Object[][] fnp_Anniversary024()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_024");
		return arrayObject;
	}
	@Test(priority = 24,dataProvider="fnp_Anniversary_024", enabled=true)
	public static void fnp_Anniversary_024(String flowerName,String pincode,String addOnProductName,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the 'save address' button without Entering data in Delivery details page");
			Anniversary_Steps.fnp_Anniversary_024(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the 'save address' button without Entering data in Delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the 'save address' button without Entering data in Delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_025")
	public Object[][] fnp_Anniversary025()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_025");
		return arrayObject;
	}
	@Test(priority = 25,dataProvider="fnp_Anniversary_025", enabled=true)
	public static void fnp_Anniversary_025(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage) throws Exception
	{
		try
		{
			logger = report.startTest("verify the BVA of recipients name on delivery details page");
			Anniversary_Steps.fnp_Anniversary_025(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the BVA of recipients name on delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the BVA of recipients name on delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_026")
	public Object[][] fnp_Anniversary026()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_026");
		return arrayObject;
	}
	@Test(priority = 26,dataProvider="fnp_Anniversary_026", enabled=true)
	public static void fnp_Anniversary_026(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of recipients name in delivery details page");
			Anniversary_Steps.fnp_Anniversary_026(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of recipients name in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of recipients name in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_027")
	public Object[][] fnp_Anniversary027()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_027");
		return arrayObject;
	}
	@Test(priority = 27,dataProvider="fnp_Anniversary_027", enabled=true)
	public static void fnp_Anniversary_027(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of recipients name in delivery details page");
			Anniversary_Steps.fnp_Anniversary_027(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of recipients name in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of recipients name in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_028")
	public Object[][] fnp_Anniversary028()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_028");
		return arrayObject;
	}
	@Test(priority = 28,dataProvider="fnp_Anniversary_028", enabled=true)
	public static void fnp_Anniversary_028(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of recipients  Address in delivery details page");
			Anniversary_Steps.fnp_Anniversary_028(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of recipients  Address in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of recipients  Address in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_029")
	public Object[][] fnp_Anniversary029()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_029");
		return arrayObject;
	}
	@Test(priority = 29,dataProvider="fnp_Anniversary_029", enabled=true)
	public static void fnp_Anniversary_029(String flowerName,String pincode,String addOnProductName,String emailId,String password,String recepientAddress) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of recipients  Address in delivery details page");
			Anniversary_Steps.fnp_Anniversary_029(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, recepientAddress);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of recipients  Address in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of recipients  Address in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_030")
	public Object[][] fnp_Anniversary030()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_030");
		return arrayObject;
	}
	@Test(priority = 30,dataProvider="fnp_Anniversary_030", enabled=true)
	public static void fnp_Anniversary_030(String flowerName,String pincode,String addOnProductName,String emailId,String password,String mobileNumber) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of recipients  mobile number in delivery details page");
			Anniversary_Steps.fnp_Anniversary_030(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, mobileNumber);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of recipients  mobile number in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of recipients  mobile number in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_031")
	public Object[][] fnp_Anniversary031()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_031");
		return arrayObject;
	}
	@Test(priority = 31,dataProvider="fnp_Anniversary_031", enabled=true)
	public static void fnp_Anniversary_031(String flowerName,String pincode,String addOnProductName,String emailId,String password,String mobileNumber) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of recipients  mobile number in delivery details page");
			Anniversary_Steps.fnp_Anniversary_031(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, mobileNumber);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of recipients  mobile number in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of recipients  mobile number in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_032")
	public Object[][] fnp_Anniversary032()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_032");
		return arrayObject;
	}
	@Test(priority = 32,dataProvider="fnp_Anniversary_032", enabled=true)
	public static void fnp_Anniversary_032(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of recipient Email field  in delivery details page");
			Anniversary_Steps.fnp_Anniversary_032(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, optionalMailId);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of recipient Email field  in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of recipient Email field  in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_033")
	public Object[][] fnp_Anniversary033()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_033");
		return arrayObject;
	}
	@Test(priority = 33,dataProvider="fnp_Anniversary_033", enabled=true)
	public static void fnp_Anniversary_033(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId) throws Exception
	{
		try
		{
			logger = report.startTest("verify the functionality  of Save Address button by entering Invalid data in delivery details page");
			Anniversary_Steps.fnp_Anniversary_033(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, optionalMailId);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "verify the functionality  of Save Address button by entering Invalid data in delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "verify the functionality  of Save Address button by entering Invalid data in delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_034")
	public Object[][] fnp_Anniversary034()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_034");
		return arrayObject;
	}
	@Test(priority = 34,dataProvider="fnp_Anniversary_034", enabled=true)
	public static void fnp_Anniversary_034(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String nameInDeliveyPage2,String mobileNumber2) throws Exception
	{
		try
		{
			logger = report.startTest("Verify User able to Edit the Address in the Delivery details page");
			Anniversary_Steps.fnp_Anniversary_034(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, nameInDeliveyPage2, mobileNumber2);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to Edit the Address in the Delivery details page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to Edit the Address in the Delivery details page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_035")
	public Object[][] fnp_Anniversary035()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_035");
		return arrayObject;
	}
	@Test(priority = 35,dataProvider="fnp_Anniversary_035", enabled=true)
	public static void fnp_Anniversary_035(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the user able to write the message on card");
			Anniversary_Steps.fnp_Anniversary_035(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the user able to write the message on card is pass", logger, report);
			Anniversary_Steps.clickOn_CancelforMessageCardInDeliveryDetails(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the user able to write the message on card is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_036")
	public Object[][] fnp_Anniversary036()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_036");
		return arrayObject;
	}
	@Test(priority = 36,dataProvider="fnp_Anniversary_036", enabled=true)
	public static void fnp_Anniversary_036(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Proceed To Pay Button in Order summary page");
			Anniversary_Steps.fnp_Anniversary_036(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, occationType, messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Proceed To Pay Button in Order summary page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Proceed To Pay Button in Order summary page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_037")
	public Object[][] fnp_Anniversary037()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_037");
		return arrayObject;
	}
	@Test(priority = 37,dataProvider="fnp_Anniversary_037", enabled=true)
	public static void fnp_Anniversary_037(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Proceed To Pay Button in Order summary page");
			Anniversary_Steps.fnp_Anniversary_037(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, occationType, messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Proceed To Pay Button in Order summary page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Proceed To Pay Button in Order summary page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_038")
	public Object[][] fnp_Anniversary038()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_038");
		return arrayObject;
	}
	@Test(priority = 38,dataProvider="fnp_Anniversary_038", enabled=true)
	public static void fnp_Anniversary_038(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the Payment page");
			Anniversary_Steps.fnp_Anniversary_038(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, occationType, messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Payment page is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Payment page is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_039")
	public Object[][] fnp_Anniversary039()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_039");
		return arrayObject;
	}
	@Test(priority = 39,dataProvider="fnp_Anniversary_039", enabled=true)
	public static void fnp_Anniversary_039(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify User able to select the Credit card");
			Anniversary_Steps.fnp_Anniversary_039(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, occationType, messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to select the Credit card is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to select the Credit card is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_040")
	public Object[][] fnp_Anniversary040()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_040");
		return arrayObject;
	}
	@Test(priority = 40,dataProvider="fnp_Anniversary_040", enabled=true)
	public static void fnp_Anniversary_040(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify functionality of the PAY button without entering data");
			Anniversary_Steps.fnp_Anniversary_040(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, occationType, messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of the PAY button without entering data is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of the PAY button without entering data is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_041")
	public Object[][] fnp_Anniversary041()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_041");
		return arrayObject;
	}
	@Test(priority = 41,dataProvider="fnp_Anniversary_041", enabled=true)
	public static void fnp_Anniversary_041(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String occationType,String messageOnCard,String creditCardNumber
			,String creditCardName,String month,String year,String cvv) throws Exception
	{
		try
		{
			logger = report.startTest("Verify functionality of the PAY button with entering a Invalid  card details");
			Anniversary_Steps.fnp_Anniversary_041(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, occationType, messageOnCard, creditCardNumber, creditCardName, month, year, cvv);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of the PAY button with entering a Invalid  card details is pass", logger, report);
			Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of the PAY button with entering a Invalid  card details is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
			
		}
	}
	@DataProvider(name = "fnp_Anniversary_042")
	public Object[][] fnp_Anniversary042()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_042");
		return arrayObject;
	}
	@Test(priority = 42,dataProvider="fnp_Anniversary_042", enabled=true)
	public static void fnp_Anniversary_042(String flowerName,String pincode,String addOnProductName,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String occationType,String messageOnCard,String creditCardNumber
			,String creditCardName,String month,String year,String cvv) throws Exception
	{
		try
		{
			logger = report.startTest("Verify functionality of the PAY button with entering a Valid  card details");
			Anniversary_Steps.fnp_Anniversary_042(driver, logger, report, flowerName, pincode, addOnProductName, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, occationType, messageOnCard, creditCardNumber, creditCardName, month, year, cvv);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of the PAY button with entering a Valid  card details is pass", logger, report);
			//Anniversary_Steps.reusableMethod_WithoutException(driver, flowerName);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of the PAY button with entering a Valid  card details is fail", logger, report);
			Anniversary_Steps.reusableMethod(driver, e, flowerName);
		}
	}
}
