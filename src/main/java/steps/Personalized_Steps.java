package steps;

import java.util.List;
import java.util.Properties;

import implementations.ActionsImplementation;
import implementations.ReusableMethodsImplementation;
import implementations.TestWebDriverMethodImplementations;
import implementations.UploadImage;
import objectsrepository.Personalized_Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Personalized_Steps
{
	static ExtentReports report;
	static ExtentTest logger;
	static WebDriver driver;
	static Properties prop = new Properties();
	static Properties Rootprop= new Properties();
	static String Image="C:\\Users\\admin\\Desktop\\bbbWorkspace\\Personalized\\Anniversary\\UploadImages\\Untitled.png";
	static String invalidImage="C:\\Users\\admin\\Desktop\\bbbWorkspace\\Personalized\\Anniversary\\UploadImages\\Roses.jpg";
	
	public static void validate_Account(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_Account(driver));
	}
	public static void mouseHoverTo_Account(WebDriver driver)
	{
		TestWebDriverMethodImplementations.mouseHoverToElement(driver, Personalized_Obj.validate_Account(driver));
	}
	public static void clickOn_LogoutInMyProfile(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_LogoutInMyProfile(driver)};
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_MyProfile(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_MyProfile(driver)};
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Logout(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_Logout(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void validate_Cart(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_Cart(driver));
		
	}
	public static void validate_Currency(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_Currency(driver));
		
	}
	public static void validate_ContactNumber(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_ContactNumber(driver));
		
	}
	public static void validate_More(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_More(driver));
		
	}
	public static void validate_Fnp_Logo(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_Fnp_Logo(driver));
		
	}
	public static void clickOn_Fnp_Logo(WebDriver driver)
	{
		TestWebDriverMethodImplementations.syncSleep(driver);
		String[] val={Personalized_Obj.validate_Fnp_Logo(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		
	}
	public static void validate_Searchbox(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_Searchbox(driver));
		
	}
	public static void validate_BirthDayMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_BirthDayMouseHover(driver));
		
	}
	public static void validate_AnniversaryMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_AnniversaryMouseHover(driver));
		
	}
	public static void validate_OccasionsMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_OccasionsMouseHover(driver));
		
	}
	
	public static void validate_FlowersMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_FlowersMouseHover(driver));
	}
	public static void validate_CakesMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_CakesMouseHover(driver));
	}
	public static void validate_PersonalizedMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_PersonalizedMouseHover(driver));
	}
	public static void validate_PlantsMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_PlantsMouseHover(driver));
	}
	public static void validate_OtherGiftMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_OtherGiftMouseHover(driver));
		
	}
	public static void validate_GlobalMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.validate_GlobalMouseHover(driver));
		
	}
	public static void mouseHover_Personalized(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.mouseHoverAndClickWebElement(driver, Personalized_Obj.mouseHover_Personalized(driver), Personalized_Obj.clickOn_AllPersonalizedGifts(driver));

	}
	
	public static void clickOn_AllPersonalizedGifts(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_AllPersonalizedGifts(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ProductWithUploadImage(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Personalized Page", logger, report);
		String[] val={Personalized_Obj.clickOn_ProductWithUploadImage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ProductWithUploadImageAndMessage(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Personalized Page", logger, report);
		String[] val={Personalized_Obj.clickOn_ProductWithUploadImageAndMessage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ProductWithMessage(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Personalized Page", logger, report);
		String[] val={Personalized_Obj.clickOn_ProductWithMessage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_Product(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_Product(driver));
	}
	public static void verify_ProductPrice(WebDriver driver)
	{		
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ProductPrice(driver));
	}
	public static void verify_Pincode(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_Pincode(driver));
	}
	
	public static void verify_AddToCart(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_AddToCart(driver));
	}
	public static void verify_BuyNow(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_BuyNow(driver));
	}
	public static void clickOn_BuyNow(WebDriver driver)
	{
		String[] val={Personalized_Obj.verify_BuyNow(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_AddToCart(WebDriver driver)
	{
		String[] val={Personalized_Obj.verify_AddToCart(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_PncodeErrorInProductDetailsPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.getText(driver, Personalized_Obj.verify_PncodeErrorInProductDetailsPage(driver));
	}
	public static void sendKeysTo_Pincode(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Product Details Page", logger, report);
		implementations.TestWebDriverMethodImplementations.verifyWebElementWithTry(driver, Personalized_Obj.clickOn_PincodeClearCross(driver));
		implementations.TestWebDriverMethodImplementations.syncSleep(driver);
		String[] val={Personalized_Obj.sendKeysTo_Pincode(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, pincode);
	}
	public static void clearText_Pincode(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.clearText(driver, Personalized_Obj.sendKeysTo_Pincode(driver));
	}
	public static void clicOn_pincodeSuggestion(WebDriver driver,String pincode)
	{
		String[] val={Personalized_Obj.clicOn_pincodeSuggestion(driver, pincode)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Date(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_Date(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_Date(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.clickOn_Date(driver));
	}
	public static void clickOn_SameDayDate(WebDriver driver)
	{
		String[] nextMonth =
			{ Personalized_Obj.clickOn_NextMonthOnPdp(driver) };
			implementations.ActionsImplementation.clickOnLocator(driver, "xpath", nextMonth);
			TestWebDriverMethodImplementations.syncSleep(driver);
		String[] val={Personalized_Obj.clickOn_SameDayDate(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_NextDate(WebDriver driver)
	{
		String[] nextMonth =
			{ Personalized_Obj.clickOn_NextMonth(driver) };
			implementations.ActionsImplementation.clickOnLocator(driver, "xpath", nextMonth);
			TestWebDriverMethodImplementations.syncSleep(driver);
		String[] val={Personalized_Obj.clickOn_NextDate(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_SamDateDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_SamDateDeliveryPage(driver));
	}
	public static void clickOn_ShippingMethods(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_ShippingMethods(driver),Personalized_Obj.clickOn_ShippingMethods2(driver),Personalized_Obj.clickOn_ShippingMethods3(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ShippingTime(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_ShippingTime(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	//=============
	public static void clickOn_ContinueWithoutAddons(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_ContinueWithoutAddons(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ContinueWithAddons(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_ContinueWithAddons(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Cart_AfterAddingProduct(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_Cart_AfterAddingProduct(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ProductInCart(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ProductInCart(driver));
	}
	public static void clickOn_ProductRemoveOption(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_ProductRemoveOption(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);		
	}
	public static void clickOn_AddonProduct(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_AddonProduct(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);		
	}
	public static void verify_AddOnProduct(WebDriver driver,String addOnProductName)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_AddOnProduct(driver, addOnProductName));
		
	}
	public static void verify_MessageAfterRemoveProduct(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_MessageAfterRemoveProduct(driver));
	}
	
	public static void clickOn_PincodeClearCross(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_PincodeClearCross(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void verify_TotalAmount(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_TotalAmount(driver));
	}
	public static void verify_ContinueShopping(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ContinueShopping(driver));
	}
	public static void verify_ProceedToCheckOut(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ProceedToCheckOut(driver));
	}
	public static void verify_MessageAfterProductRemove(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_MessageAfterProductRemove(driver));
	}
	public static void verify_ShippingDetailsInProductDetailsPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ShippingDetailsInProductDetailsPage(driver));
	}
	public static void verify_DeliveryDateOfMonth(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_DeliveryDateOfMonth(driver));
	}
	public static void verify_DeliveryMonth(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_DeliveryMonth(driver));
	}
	public static void verify_ShippingMethod(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ShippingMethod(driver));
	}
	public static void verify_TimeSlot(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_TimeSlot(driver));
	}
	public static void verify_LoginPageAfterAddingProduct(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Delivery Details Page", logger, report);
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_LoginPageAfterAddingProduct(driver));
	}
	public static void verify_FacebookLoginOption(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_FacebookLoginOption(driver));
	}
	public static void verify_GoogleLoginOption(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_GoogleLoginOption(driver));
	}
	public static void verify_OrderAndDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_OrderAndDeliveryDetails(driver));
	}
	public static void verify_PaymentOptions(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_PaymentOptions(driver));
	}
	public static void verify_EmailIdFieldInCheckoutPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.SendKeys_EmailId(driver));

	}
	public static void SendKeys_EmailId(WebDriver driver,String emailId)
	{
		String[] val={Personalized_Obj.SendKeys_EmailId(driver),Personalized_Obj.SendKeys_EmailId2(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, emailId);
	}
	public static void clickOn_LoginContinueButton(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_LoginContinueButton(driver)};
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void SendKeys_NameInRegestrationPage(WebDriver driver,String name)
	{
		String[] val={Personalized_Obj.SendKeys_NameInRegestrationPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, name);
	}
	public static void SendKeys_MobileNumber(WebDriver driver,String mobileNumber)
	{
		String[] val={Personalized_Obj.SendKeys_MobileNumber(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, mobileNumber);
	}
	public static void SendKeys_PasswordClear(WebDriver driver)
	{
		TestWebDriverMethodImplementations.clearText(driver, Personalized_Obj.sendKeys_Password(driver));
	}
	public static void SendKeys_Password(WebDriver driver,String password)
	{
		String[] val={Personalized_Obj.sendKeys_Password(driver),Personalized_Obj.sendKeys_Password2(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, password);
	}
	public static void clickOn_Continue(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_Continue(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_InvalidPasswordError(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_InvalidPasswordError(driver));
	}
	public static void sendKeys_PasswordInProductDeliveryPage(WebDriver driver,String password)
	{
		String[] val={Personalized_Obj.sendKeys_PasswordInProductDeliveryPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, password);
	}
	public static void verify_InvalidPasswordErrorInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_InvalidPasswordErrorInProductDeliveryPage(driver));
	}
	public static void verify_ProductNameInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ProductNameInProductDeliveryPage(driver));
	}
	public static void verify_ChangeButtonInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ChangeButtonInProductDeliveryPage(driver));
	}
	public static void clickOn_ChangeButtonInProductDeliveryPage(WebDriver driver)
	{
		String[] val={Personalized_Obj.verify_ChangeButtonInProductDeliveryPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ExistingAddressInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ExistingAddressInProductDeliveryPage(driver));
	}
	public static void verify_TotalAmountInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_TotalAmountInProductDeliveryPage(driver));
	}
	public static void clickOn_ShippingTypeOnPrductDeliveryPage(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_ShippingTypeOnPrductDeliveryPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_SelectTimeToDelivery(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_SelectTimeToDelivery(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_DeliveryDate(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_DeliveryDate(driver));
	}
	public static void verify_DeliveryMethod(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_DeliveryMethod(driver));
	}
	public static void clickOn_DeleteButtonInDeliveryDtailsPage(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_DeleteButtonInDeliveryDtailsPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Yes(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_Yes(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_CartIsEmpty(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_CartIsEmpty(driver));
	}
	public static void clickOn_StartShoppingNow(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_StartShoppingNow(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_NameOfProfileInDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_NameOfProfileInDeliveryPage(driver));
	}
	public static void verify_MailInDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_MailInDeliveryPage(driver));
	}
	public static void verify_PhoneNumberInDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_PhoneNumberInDeliveryPage(driver));
	}
	public static void VerifyWithBoolean_SelectDeliveryAddress(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.verifyWebElementWithBoolean(driver, Personalized_Obj.verify_AddNewAddress(driver));
	}
	public static void verify_ErrorForWithoutEnteringDataInDeliveryAddress(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ErrorForWithoutEnteringDataInDeliveryAddress(driver));
	}
	public static void clickOn_SaveAddressInDeliveryAddress(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_SaveAddressInDeliveryAddress(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_NamePrefixButton(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_NamePrefixButton(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_NamePrefixSuggestion(WebDriver driver,String namePrefix)
	{
		String[] val={Personalized_Obj.clickOn_NamePrefixSuggestion(driver, namePrefix)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void sendKeys_NameInDeliveyAddressPage(WebDriver driver,String nameInDeliveyPage)
	{
		String[] val={Personalized_Obj.sendKeys_NameInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, nameInDeliveyPage);
	}
	public static void clearText_NameInDeliveyAddressPage(WebDriver driver)
	{
		TestWebDriverMethodImplementations.clearText(driver, Personalized_Obj.sendKeys_NameInDeliveyAddressPage(driver));
	}
	public static void verify_NameInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.sendKeys_NameInDeliveyAddressPage(driver));

	}
	public static void sendKeys_RecppientsAddressInDeliveyAddressPage(WebDriver driver,String recepientAddress)
	{
		String[] val={Personalized_Obj.sendKeys_RecppientsAddressInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, recepientAddress);
	}
	public static void verify_RecppientsAddressInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.sendKeys_RecppientsAddressInDeliveyAddressPage(driver));
	}
	public static void sendKeys_LandmarkInDeliveyAddressPage(WebDriver driver,String landmark)
	{
		String[] val={Personalized_Obj.sendKeys_LandmarkInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, landmark);
	}
	public static void verify_LandmarkInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.sendKeys_LandmarkInDeliveyAddressPage(driver));

	}
	public static void clickOn_AddressTypeInDeliveyAddressPage(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_AddressTypeInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void sendKeys_MobileNumberInDeliveyAddressPage(WebDriver driver,String mobileNnumber)
	{
		String[] val={Personalized_Obj.sendKeys_MobileNumberInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, mobileNnumber);
	}
	public static void clearText_MobileNumberInDeliveyAddressPage(WebDriver driver)
	{
		TestWebDriverMethodImplementations.clearText(driver, Personalized_Obj.sendKeys_MobileNumberInDeliveyAddressPage(driver));
	}
	public static void verify_MobileNumberInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.sendKeys_MobileNumberInDeliveyAddressPage(driver));

	}
	public static void verify_AddedAddressInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_AddedAddressInDeliveryDetails(driver));
	}
	public static void verify_ErrorMessageForInvalidMobileNumberInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_ErrorMessageForInvalidMobileNumberInDeliveryDetails(driver));

	}
	public static void sendKeys_OptionalMailidInDeliveryDetails(WebDriver driver,String optionalMailId)
	{
		String[] val={Personalized_Obj.sendKeys_OptionalMailidInDeliveryDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, optionalMailId);
	}
	public static void verify_OptionalMailidInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.sendKeys_OptionalMailidInDeliveryDetails(driver));

	}
	public static void clickOn_EditInDeliveryDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_EditInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	//
	public static void clickOn_FreeMessageCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_FreeMessageCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_SelectOcassionInDeliveryDetailsPage(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_SelectOcassionInDeliveryDetailsPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_OccationTypeSuggestion(WebDriver driver,String occationType)
	{
		String[] val={Personalized_Obj.clickOn_OccationTypeSuggestion(driver, occationType)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_MessageOnCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_MessageOnCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_MessageOnCardSuggestionInDeliveryDetails(WebDriver driver,String messageOnCard)
	{
		String[] val={Personalized_Obj.clickOn_MessageOnCardSuggestionInDeliveryDetails(driver, messageOnCard)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_SaveforMessageCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_SaveforMessageCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ErrorMessageForMessageCard(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ErrorMessageForMessageCard(driver));

	}
	public static void clickOn_CancelforMessageCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_CancelforMessageCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ProceedToCheckoutInDeliveryDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_ProceedToCheckoutInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ErrorforProceedToCheckoutInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_ErrorforProceedToCheckoutInDeliveryDetails(driver));
	}
	public static void clickOn_TermsAndConditions(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_TermsAndConditions(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_CreditCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_CreditCardInPaymentDetails(driver));

	}
	public static void clickOn_CreditCardInPaymentDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.verify_CreditCardInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_DebitCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_DebitCardInPaymentDetails(driver));

	}
	public static void verify_NetBankningInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_NetBankningInPaymentDetails(driver));

	}
	public static void verify_EmiInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_EmiInPaymentDetails(driver));

	}
	public static void verify_UpiInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_UpiInPaymentDetails(driver));

	}
	public static void verify_PayTmInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_PayTmInPaymentDetails(driver));

	}
	public static void verify_PayPalInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_PayPalInPaymentDetails(driver));

	}
	public static void verify_Amex_ezeClickInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_Amex_ezeClickInPaymentDetails(driver));

	}
	//
	public static void verify_CreditCardNumberPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_CreditCardNumberPaymentDetails(driver));

	}
	public static void sendkeys_CreditCardNumberPaymentDetails(WebDriver driver,String creditCardNumber)
	{
		String[] val={Personalized_Obj.verify_CreditCardNumberPaymentDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, creditCardNumber);
	}
	public static void verify_CreditCardNameInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_CreditCardNameInPaymentDetails(driver));

	}
	public static void sendKeys_CreditCardNameInPaymentDetails(WebDriver driver,String creditCardName)
	{
		String[] val={Personalized_Obj.verify_CreditCardNameInPaymentDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, creditCardName);
	}
	public static void verify_MonthInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_MonthInPaymentDetails(driver));

	}
	public static void clickOn_MonthInPaymentDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.verify_MonthInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clicOn_DropdownSuggestionInPaymentDetails(WebDriver driver,String value)
	{
		String[] val={Personalized_Obj.clicOn_DropdownSuggestionInPaymentDetails(driver, value)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_YearInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_YearInPaymentDetails(driver));

	}
	public static void clickOn_YearInPaymentDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.verify_YearInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_CvvNumberInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_CvvNumberInPaymentDetails(driver));

	}
	public static void sendKeys_CvvNumberInPaymentDetails(WebDriver driver,String cvv)
	{
		String[] val={Personalized_Obj.verify_CvvNumberInPaymentDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, cvv);
	}
	public static void verify_SaveThisCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_SaveThisCardInPaymentDetails(driver));

	}
	public static void verify_PayButtonInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_PayButtonInPaymentDetails(driver));
	}
	public static void clickOn_PayButtonInPaymentDetails(WebDriver driver)
	{
		String[] val={Personalized_Obj.verify_PayButtonInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void verify_ErrorForBlankDataInCreditCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ErrorForBlankDataInCreditCardInPaymentDetails(driver));

	}
	public static void verify_FlavourErrorInPdp(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_FlavourErrorInPdp(driver));
	}
	public static void clickOn_SelectFlavour(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_SelectFlavour2(driver),Personalized_Obj.clickOn_SelectFlavour(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_FlavourSuggestion(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_FlavourSuggestion2(driver),Personalized_Obj.clickOn_FlavourSuggestion(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_WithEggInPdp(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_WithEggInPdp(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_WithEgglessInPdp(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_WithEgglessInPdp(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_VarientItem(WebDriver driver)
	{
		String[] val={Personalized_Obj.clickOn_VarientItem(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void mouseHover_MessageOnCake(WebDriver driver)
	{
		TestWebDriverMethodImplementations.mouseHoverAndClickWebElement(driver, Personalized_Obj.mouseHover_MessageOnCakeElement(driver), Personalized_Obj.mouseHover_MessageOnCakeEdit(driver));
	}
	public static void sendKeys_MessageOnCakeElement(WebDriver driver,String messageOnCake)
	{
		String[] val={Personalized_Obj.mouseHover_MessageOnCakeElement(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, messageOnCake);
	}
	public static void verify_MessageOnCakeElement(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.mouseHover_MessageOnCakeElement(driver));
	}
	public static void sendKeys_MessageInPdp(WebDriver driver,String messageOnProduct)
	{
		String[] val={Personalized_Obj.sendKeys_MessageInPdp(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, messageOnProduct);
	}
	public static void verify_MessageInPdp(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.sendKeys_MessageInPdp(driver));
	}
	public static void verify_sizeOfMessageFieldInPDP(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_sizeOfMessageFieldInPDP(driver));
	}
	public static void clickOn_ImageUploadInPdp(WebDriver driver)
	{
		//implementations.TestWebDriverMethodImplementations.clickWhenElementActive(driver, Personalized_Obj.clickOn_ImageUploadInPdp(driver));
		String[] val={Personalized_Obj.clickOn_ImageUploadInPdp(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ImageUploadInPdp(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.clickOn_ImageUploadInPdp(driver));
	}
	public static void verify_ImageUploadSucessful(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ImageUploadSucessful(driver));
	}
	public static void verify_ChangePhoto(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Personalized_Obj.verify_ChangePhoto(driver));
	}
	public static void verify_ErrorForMessageOnPDP(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Personalized_Obj.verify_ErrorForMessageOnPDP(driver));
	}
	
	public static void fnp_Personalized_024(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String messageOnProduct)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		sendKeys_MessageInPdp(driver, messageOnProduct);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_sizeOfMessageFieldInPDP(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_023(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);		
	}
	public static void fnp_Personalized_022(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ChangePhoto(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);		
	}
	public static void fnp_Personalized_021(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(invalidImage);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);		
	}
	public static void fnp_Personalized_020(WebDriver driver, ExtentTest logger, ExtentReports report)
	{ 
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_BuyNow(driver);
		verify_PncodeErrorInProductDetailsPage(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_019(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String messageOnProduct)
	{ 
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		sendKeys_MessageInPdp(driver, messageOnProduct);
		clickOn_AddToCart(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithoutAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Cart_AfterAddingProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_ProductInCart(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_018(WebDriver driver, ExtentTest logger, ExtentReports report)
	{ 
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddToCart(driver);
		verify_PncodeErrorInProductDetailsPage(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_017(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_Product(driver);
		verify_Pincode(driver);
		verify_Date(driver);
		verify_AddToCart(driver);
		verify_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_016(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImageAndMessage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_Product(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_015(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix
			,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String occationType,String messageOnCard)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		clickOn_AddressTypeInDeliveyAddressPage(driver);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_FreeMessageCardInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SelectOcassionInDeliveryDetailsPage(driver);
		clickOn_OccationTypeSuggestion(driver,occationType);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_MessageOnCardInDeliveryDetails(driver);
		clickOn_MessageOnCardSuggestionInDeliveryDetails(driver,messageOnCard);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SaveforMessageCardInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_TermsAndConditions(driver);
		clickOn_ProceedToCheckoutInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_PaymentOptions(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_014(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_OrderAndDeliveryDetails(driver);
		verify_ProductNameInProductDeliveryPage(driver);
		verify_ChangeButtonInProductDeliveryPage(driver);
		verify_TotalAmountInProductDeliveryPage(driver);
		verify_DeliveryDate(driver);
		verify_DeliveryMethod(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_013(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_OrderAndDeliveryDetails(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_012(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		verify_FacebookLoginOption(driver);
		verify_GoogleLoginOption(driver);
		verify_OrderAndDeliveryDetails(driver);
		verify_PaymentOptions(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_011(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_010(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_BuyNow(driver);
		verify_PncodeErrorInProductDetailsPage(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_009(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String pincode2,String pincode3)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_PincodeClearCross(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode2);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clearText_Pincode(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode3);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode3);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Personalized_008(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		clickOn_AddToCart(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithoutAddons(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Cart_AfterAddingProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_ProductInCart(driver);
		verify_TotalAmount(driver);
		verify_ContinueShopping(driver);
		verify_ProceedToCheckOut(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_007(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(Image);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadSucessful(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddToCart(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Cart_AfterAddingProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ContinueWithoutAddons(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Cart_AfterAddingProduct(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_ProductInCart(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_006(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ImageUploadInPdp(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		UploadImage.upload(invalidImage);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_ImageUploadInPdp(driver);
		clickOn_AddToCart(driver);
	}
	public static void fnp_Personalized_005(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddToCart(driver);
		verify_PncodeErrorInProductDetailsPage(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_004(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_Product(driver);
		verify_Pincode(driver);
		verify_Date(driver);
		verify_AddToCart(driver);
		verify_BuyNow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void fnp_Personalized_003(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Personalized(driver);
		clickOn_AllPersonalizedGifts(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_ProductWithUploadImage(driver, logger, report);
		TestWebDriverMethodImplementations.syncSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		verify_Product(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	
	public static void fnp_Personalized_002(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		validate_Account(driver);
		validate_Cart(driver);
		validate_Currency(driver);
		validate_ContactNumber(driver);
		validate_More(driver);
		validate_Fnp_Logo(driver);
		validate_Searchbox(driver);
		validate_FlowersMouseHover(driver);
		validate_CakesMouseHover(driver);
		validate_PersonalizedMouseHover(driver);
		validate_PlantsMouseHover(driver);
		validate_BirthDayMouseHover(driver);
		validate_AnniversaryMouseHover(driver);
		validate_OccasionsMouseHover(driver);
		validate_OtherGiftMouseHover(driver);
		validate_GlobalMouseHover(driver);
	}
	//This method is to remove products from cart if test case fails.
	//Below methods are used for maintaining continuity from one test case to another test case.
	public static void reusableMethod(WebDriver driver, Exception e) throws Exception
	{
		try
		{
			clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
		}
		catch (Exception e6)
		{
		}
		try
		{
			clickOn_Cart_AfterAddingProduct(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
		}
		catch (Exception e1)
		{
			System.out.println("Removing products in cart");
		}
		try{
		int size = driver.findElements(By.xpath(Personalized_Obj.clickOn_ProductRemoveOption2(driver))).size();
		System.out.println(size);
		if(size!=0)
		{
		for (int i = 0; i<size; i++)
		{
			TestWebDriverMethodImplementations.syncSleep(driver);
			clickOn_ProductRemoveOption(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
			TestWebDriverMethodImplementations.alertAccept(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
			System.out.println("deleted");
		}
		}
		}catch(Exception ew)
		{
			
		}
		try
		{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
			mouseHoverTo_Account(driver);
			clickOn_MyProfile(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
			clickOn_LogoutInMyProfile(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
		}
		catch (Exception e5)
		{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
		}
		throw e;
		
	}
	public static void reusableMethod_WithoutException(WebDriver driver) throws Exception
	{
		try
		{
			clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
		}
		catch (Exception e6)
		{
		}
		try
		{
			clickOn_Cart_AfterAddingProduct(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
		}
		catch (Exception e1)
		{
			System.out.println("Removing products in cart");
		}
		try{
		int size = driver.findElements(By.xpath(Personalized_Obj.clickOn_ProductRemoveOption2(driver))).size();
		System.out.println(size);
		if(size!=0)
		{
		for (int i = 0; i<size; i++)
		{
			TestWebDriverMethodImplementations.syncSleep(driver);
			clickOn_ProductRemoveOption(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
			TestWebDriverMethodImplementations.alertAccept(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
			System.out.println("deleted");
		}
		}
		}catch(Exception ew)
		{
			
		}
		try
		{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
			mouseHoverTo_Account(driver);
			clickOn_MyProfile(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
			clickOn_LogoutInMyProfile(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
		}
		catch (Exception e5)
		{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
		}
		
	}
	public static void reusableMethod_WithoutLogout(WebDriver driver) throws Exception
	{
		try{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.syncSleep(driver);
			}catch(Exception e35)
			{
				
			}
		try
		{
			clickOn_Cart_AfterAddingProduct(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
		}
		catch (Exception e1)
		{
			System.out.println("Removing products in cart");
		}
		try{
		int size = driver.findElements(By.xpath(Personalized_Obj.clickOn_ProductRemoveOption2(driver))).size();
		System.out.println(size);
		if(size!=0)
		{
		for (int i = 0; i<size; i++)
		{
			TestWebDriverMethodImplementations.syncSleep(driver);
			clickOn_ProductRemoveOption(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
			TestWebDriverMethodImplementations.alertAccept(driver);
			TestWebDriverMethodImplementations.syncSleep(driver);
			System.out.println("deleted");
		}
		}
		}catch(Exception ew)
		{
			
		}
		try{
		clickOn_Fnp_Logo(driver);
		implementations.TestWebDriverMethodImplementations.syncSleep(driver);
		}catch(Exception e37)
		{
			
		}
	}
	

}
