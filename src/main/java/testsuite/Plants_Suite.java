package testsuite;

import implementations.ReusableMethodsImplementation;
import implementations.TestWebDriverMethodImplementations;
import implementations.UploadImage;
import objectsrepository.Plants_Obj;

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

import steps.Plants_Steps;




import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Plants_Suite
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
	public static void fnp_Plants002() throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the FNP Application");
			Plants_Steps.fnp_Plants_002(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the FNP Application is pass", logger, report);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the FNP Application is fail", logger, report);
		}
	}
	
	@Test(priority = 3, enabled=true)
	public static void fnp_Plants_003() throws Exception
	{
		try
		{
			logger = report.startTest("Verify user able to select the product from the header tool bar");
			Plants_Steps.fnp_Plants_003(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to select the product from the header tool bar is pass", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to select the product from the header tool bar is fail", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
	}
	
	@Test(priority = 4, enabled=true)
	public static void fnp_Plants_004() throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the Gift Booking window");
			Plants_Steps.fnp_Plants_004(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Gift Booking window", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Gift Booking window", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);			
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
	}
	@Test(priority = 5, enabled=true)
	public static void fnp_Plants_005() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_005(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);			
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
	}
	@DataProvider(name = "fnp_Plants_006")
	public Object[][] fnp_Plants006()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_006");
		return arrayObject;
	}
	@Test(priority = 6,dataProvider="fnp_Plants_006", enabled=true)
	public static void fnp_Plants_006(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Plants_Steps.fnp_Plants_006(driver, logger, report,pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_007")
	public Object[][] fnp_Plants007()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_007");
		return arrayObject;
	}
	@Test(priority = 7,dataProvider="fnp_Plants_007", enabled=true)
	public static void fnp_Plants_007(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Plants_Steps.fnp_Plants_007(driver, logger, report,pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_008")
	public Object[][] fnp_Plants008()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_008");
		return arrayObject;
	}
	@Test(priority = 8,dataProvider="fnp_Plants_008", enabled=true)
	public static void fnp_Plants_008(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Plants_Steps.fnp_Plants_008(driver, logger, report,pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_009")
	public Object[][] fnp_Plants009()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_009");
		return arrayObject;
	}
	@Test(priority = 9,dataProvider="fnp_Plants_009", enabled=true)
	public static void fnp_Plants_009(String pincode,String pincode2,String pincode3) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without selecting flavour");
			Plants_Steps.fnp_Plants_009(driver, logger, report, pincode, pincode2, pincode3);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without selecting flavour", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@Test(priority = 10, enabled=true)
	public static void fnp_Plants_010() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_010(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_011")
	public Object[][] fnp_Plants011()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_011");
		return arrayObject;
	}
	@Test(priority = 11,dataProvider="fnp_Plants_011", enabled=true)
	public static void fnp_Plants_011(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_011(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_012")
	public Object[][] fnp_Plants012()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_012");
		return arrayObject;
	}
	@Test(priority = 12,dataProvider="fnp_Plants_012", enabled=true)
	public static void fnp_Plants_012(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_012(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_013")
	public Object[][] fnp_Plants013()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_013");
		return arrayObject;
	}
	@Test(priority = 13,dataProvider="fnp_Plants_013", enabled=true)
	public static void fnp_Plants_013(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_013(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_014")
	public Object[][] fnp_Plants014()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_014");
		return arrayObject;
	}
	@Test(priority = 14,dataProvider="fnp_Plants_014", enabled=true)
	public static void fnp_Plants_014(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_014(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_015")
	public Object[][] fnp_Plants015()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_015");
		return arrayObject;
	}
	@Test(priority = 15,dataProvider="fnp_Plants_015", enabled=true)
	public static void fnp_Plants_015(String pincode) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_015(driver, logger, report, pincode);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_016")
	public Object[][] fnp_Plants016()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_016");
		return arrayObject;
	}
	@Test(priority = 16,dataProvider="fnp_Plants_016", enabled=true)
	public static void fnp_Plants_016(String pincode,String emailId,String name,String mobileNumber,String invalidPassword,String validPassword) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_016(driver, logger, report, pincode, emailId, name, mobileNumber, invalidPassword, validPassword);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_017")
	public Object[][] fnp_Plants017()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_017");
		return arrayObject;
	}
	@Test(priority = 17,dataProvider="fnp_Plants_017", enabled=true)
	public static void fnp_Plants_017(String pincode,String emailId) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_017(driver, logger, report, pincode, emailId);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutLogout(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_018")
	public Object[][] fnp_Plants018()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_018");
		return arrayObject;
	}
	@Test(priority = 18,dataProvider="fnp_Plants_018", enabled=true)
	public static void fnp_Plants_018(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_018(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_019")
	public Object[][] fnp_Plants019()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_019");
		return arrayObject;
	}
	@Test(priority = 19,dataProvider="fnp_Plants_019", enabled=true)
	public static void fnp_Plants_019(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_019(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_020")
	public Object[][] fnp_Plants020()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_020");
		return arrayObject;
	}
	@Test(priority = 20,dataProvider="fnp_Plants_020", enabled=true)
	public static void fnp_Plants_020(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_020(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_021")
	public Object[][] fnp_Plants021()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_021");
		return arrayObject;
	}
	@Test(priority = 21,dataProvider="fnp_Plants_021", enabled=true)
	public static void fnp_Plants_021(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_021(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_022")
	public Object[][] fnp_Plants022()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_022");
		return arrayObject;
	}
	@Test(priority = 22,dataProvider="fnp_Plants_022", enabled=true)
	public static void fnp_Plants_022(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_022(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_023")
	public Object[][] fnp_Plants023()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_023");
		return arrayObject;
	}
	@Test(priority = 23,dataProvider="fnp_Plants_023", enabled=true)
	public static void fnp_Plants_023(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_023(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_024")
	public Object[][] fnp_Plants024()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_024");
		return arrayObject;
	}
	@Test(priority = 24,dataProvider="fnp_Plants_024", enabled=true)
	public static void fnp_Plants_024(String pincode,String emailId,String password) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_024(driver, logger, report, pincode, emailId, password);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_025")
	public Object[][] fnp_Plants025()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_025");
		return arrayObject;
	}
	@Test(priority = 25,dataProvider="fnp_Plants_025", enabled=true)
	public static void fnp_Plants_025(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_025(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	
	@DataProvider(name = "fnp_Plants_026")
	public Object[][] fnp_Plants026()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_026");
		return arrayObject;
	}
	@Test(priority = 26,dataProvider="fnp_Plants_026", enabled=true)
	public static void fnp_Plants_026(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_026(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_027")
	public Object[][] fnp_Plants027()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_027");
		return arrayObject;
	}
	@Test(priority = 27,dataProvider="fnp_Plants_027", enabled=true)
	public static void fnp_Plants_027(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_027(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_028")
	public Object[][] fnp_Plants028()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_028");
		return arrayObject;
	}
	@Test(priority = 28,dataProvider="fnp_Plants_028", enabled=true)
	public static void fnp_Plants_028(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_028(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_029")
	public Object[][] fnp_Plants029()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_029");
		return arrayObject;
	}
	@Test(priority = 29,dataProvider="fnp_Plants_029", enabled=true)
	public static void fnp_Plants_029(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_029(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_030")
	public Object[][] fnp_Plants030()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_030");
		return arrayObject;
	}
	@Test(priority = 30,dataProvider="fnp_Plants_030", enabled=true)
	public static void fnp_Plants_030(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_030(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_031")
	public Object[][] fnp_Plants031()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_031");
		return arrayObject;
	}
	@Test(priority = 31,dataProvider="fnp_Plants_031", enabled=true)
	public static void fnp_Plants_031(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_031(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_032")
	public Object[][] fnp_Plants032()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_032");
		return arrayObject;
	}
	@Test(priority = 32,dataProvider="fnp_Plants_032", enabled=true)
	public static void fnp_Plants_032(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_032(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber,optionalMailId);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_033")
	public Object[][] fnp_Plants033()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_033");
		return arrayObject;
	}
	@Test(priority = 33,dataProvider="fnp_Plants_033", enabled=true)
	public static void fnp_Plants_033(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_033(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber,optionalMailId);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_034")
	public Object[][] fnp_Plants034()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_034");
		return arrayObject;
	}
	@Test(priority = 34,dataProvider="fnp_Plants_034", enabled=true)
	public static void fnp_Plants_034(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_034(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber,optionalMailId);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_035")
	public Object[][] fnp_Plants035()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_035");
		return arrayObject;
	}
	@Test(priority = 35,dataProvider="fnp_Plants_035", enabled=true)
	public static void fnp_Plants_035(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String nameInDeliveyPage2,String mobileNumber2) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_035(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber,optionalMailId,nameInDeliveyPage2,mobileNumber2);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_036")
	public Object[][] fnp_Plants036()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_036");
		return arrayObject;
	}
	@Test(priority = 36,dataProvider="fnp_Plants_036", enabled=true)
	public static void fnp_Plants_036(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_036(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, optionalMailId);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_037")
	public Object[][] fnp_Plants037()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_037");
		return arrayObject;
	}
	@Test(priority = 37,dataProvider="fnp_Plants_037", enabled=true)
	public static void fnp_Plants_037(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_037(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, optionalMailId, occationType,messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	@DataProvider(name = "fnp_Plants_038")
	public Object[][] fnp_Plants038()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Plants_038");
		return arrayObject;
	}
	@Test(priority = 38,dataProvider="fnp_Plants_038", enabled=true)
	public static void fnp_Plants_038(String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String occationType,String messageOnCard) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Add To Cart button without entering data in gift booking window ");
			Plants_Steps.fnp_Plants_038(driver, logger, report, pincode, emailId, password, namePrefix, nameInDeliveyPage, recepientAddress, landmark, mobileNumber, optionalMailId, occationType,messageOnCard);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod_WithoutException(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify the functionality of the Add To Cart button without entering data in gift booking window ", logger, report);
			Plants_Steps.reusableMethod(driver, e);
		}
	}
	
}
