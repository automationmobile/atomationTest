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

import steps.Personalized_Steps;




import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Personalized_Suite
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
	
	@Test(priority = 2, enabled=false)
	public static void fnp_Personalized002() throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the FNP Application");
			Personalized_Steps.fnp_Personalized_002(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the FNP Application is pass", logger, report);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the FNP Application is fail", logger, report);
		}
	}
	
	@Test(priority = 3, enabled=false)
	public static void fnp_Personalized_003() throws Exception
	{
		try
		{
			logger = report.startTest("Verify user able to select the product from the header tool bar");
			Personalized_Steps.fnp_Personalized_003(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to select the product from the header tool bar is pass", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to select the product from the header tool bar is fail", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
	}
	
	@Test(priority = 4, enabled=false)
	public static void fnp_Personalized_004() throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the Gift Booking window");
			Personalized_Steps.fnp_Personalized_004(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Gift Booking window", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Gift Booking window", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);			
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
	}
	@Test(priority = 5, enabled=false)
	public static void fnp_Personalized_005() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Personalized_Steps.fnp_Personalized_005(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);			
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
	}
	@DataProvider(name = "fnp_Personalized_006")
	public Object[][] fnp_Personalized006()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_006");
		return arrayObject;
	}
	@Test(priority = 6,dataProvider="fnp_Personalized_006", enabled=false)
	public static void fnp_Personalized_006(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_006(driver, logger, report,pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);			
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
	}
	@DataProvider(name = "fnp_Personalized_007")
	public Object[][] fnp_Personalized007()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_007");
		return arrayObject;
	}
	@Test(priority = 7,dataProvider="fnp_Personalized_007", enabled=false)
	public static void fnp_Personalized_007(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_007(driver, logger, report,pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);			
		}
	}
	@DataProvider(name = "fnp_Personalized_008")
	public Object[][] fnp_Personalized008()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_008");
		return arrayObject;
	}
	@Test(priority = 8,dataProvider="fnp_Personalized_008", enabled=false)
	public static void fnp_Personalized_008(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_008(driver, logger, report,pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_009")
	public Object[][] fnp_Personalized009()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_009");
		return arrayObject;
	}
	@Test(priority = 9,dataProvider="fnp_Personalized_009", enabled=false)
	public static void fnp_Personalized_009(String pincode,String pincode2,String pincode3) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_009(driver, logger, report, pincode, pincode2, pincode3);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	
	@Test(priority = 10, enabled=false)
	public static void fnp_Personalized_010() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_010(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_011")
	public Object[][] fnp_Personalized011()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_011");
		return arrayObject;
	}
	@Test(priority = 11,dataProvider="fnp_Personalized_011", enabled=false)
	public static void fnp_Personalized_011(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_011(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_012")
	public Object[][] fnp_Personalized012()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_012");
		return arrayObject;
	}
	@Test(priority = 12,dataProvider="fnp_Personalized_012", enabled=false)
	public static void fnp_Personalized_012(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_012(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_013")
	public Object[][] fnp_Personalized013()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_013");
		return arrayObject;
	}
	@Test(priority = 13,dataProvider="fnp_Personalized_013", enabled=false)
	public static void fnp_Personalized_013(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_013(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_014")
	public Object[][] fnp_Personalized014()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_014");
		return arrayObject;
	}
	@Test(priority = 14,dataProvider="fnp_Personalized_014", enabled=false)
	public static void fnp_Personalized_014(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_014(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_015")
	public Object[][] fnp_Personalized015()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_015");
		return arrayObject;
	}
	@Test(priority = 15,dataProvider="fnp_Personalized_015", enabled=false)
	public static void fnp_Personalized_015(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_015(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, optionalMailId, occationType, messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@Test(priority = 16, enabled=false)
	public static void fnp_Personalized_016() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_016(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@Test(priority = 17, enabled=false)
	public static void fnp_Personalized_017() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_017(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@Test(priority = 18, enabled=false)
	public static void fnp_Personalized_018() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_018(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_019")
	public Object[][] fnp_Personalized019()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_019");
		return arrayObject;
	}
	@Test(priority = 19,dataProvider="fnp_Personalized_019", enabled=false)
	public static void fnp_Personalized_019(String pincode,String messageOnProduct) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_019(driver, logger, report, pincode, messageOnProduct);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@Test(priority = 20, enabled=false)
	public static void fnp_Personalized_020() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_020(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_021")
	public Object[][] fnp_Personalized021()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_021");
		return arrayObject;
	}
	@Test(priority = 21,dataProvider="fnp_Personalized_021", enabled=false)
	public static void fnp_Personalized_021(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_021(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_022")
	public Object[][] fnp_Personalized022()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_022");
		return arrayObject;
	}
	@Test(priority = 22,dataProvider="fnp_Personalized_022", enabled=false)
	public static void fnp_Personalized_022(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_022(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_023")
	public Object[][] fnp_Personalized023()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_023");
		return arrayObject;
	}
	@Test(priority = 23,dataProvider="fnp_Personalized_023", enabled=false)
	public static void fnp_Personalized_023(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_023(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Personalized_024")
	public Object[][] fnp_Personalized024()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Personalized_024");
		return arrayObject;
	}
	@Test(priority = 24,dataProvider="fnp_Personalized_024", enabled=false)
	public static void fnp_Personalized_024(String pincode,String messageOnProduct) throws Exception
	{
		try 
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Personalized_Steps.fnp_Personalized_024(driver, logger, report, pincode,messageOnProduct);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Personalized_Steps.reusableMethod(driver, e);
		}
	}
	
}
