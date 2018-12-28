package steps;

import java.util.List;
import java.util.Properties;

import implementations.ActionsImplementation;
import implementations.ReusableMethodsImplementation;
import implementations.TestWebDriverMethodImplementations;
import implementations.UploadImage;

import objectsrepository.Plants_Obj;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Plants_Steps
{
	static ExtentReports report;
	static ExtentTest logger;
	static WebDriver driver;
	static Properties prop = new Properties();
	
	public static void validate_Account(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_Account(driver));
	}
	public static void mouseHoverTo_Account(WebDriver driver)
	{
		TestWebDriverMethodImplementations.mouseHoverToElement(driver, Plants_Obj.validate_Account(driver));
	}
	public static void clickOn_LogoutInMyProfile(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_LogoutInMyProfile(driver)};
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_MyProfile(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_MyProfile(driver)};
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Logout(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_Logout(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void validate_Cart(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_Cart(driver));
		
	}
	public static void validate_Currency(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_Currency(driver));
		
	}
	public static void validate_ContactNumber(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_ContactNumber(driver));
		
	}
	public static void validate_More(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_More(driver));
		
	}
	public static void validate_Fnp_Logo(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_Fnp_Logo(driver));
		
	}
	public static void clickOn_Fnp_Logo(WebDriver driver)
	{
		TestWebDriverMethodImplementations.smallSleep(driver);
		String[] val={Plants_Obj.validate_Fnp_Logo(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		
	}
	public static void validate_Searchbox(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_Searchbox(driver));
		
	}
	public static void validate_BirthDayMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_BirthDayMouseHover(driver));
		
	}
	public static void validate_AnniversaryMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_AnniversaryMouseHover(driver));
		
	}
	public static void validate_OccasionsMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_OccasionsMouseHover(driver));
		
	}
	
	public static void validate_FlowersMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_FlowersMouseHover(driver));
	}
	public static void validate_CakesMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_CakesMouseHover(driver));
	}
	public static void validate_PersonalizedMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_PersonalizedMouseHover(driver));
	}
	public static void validate_PlantsMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_PlantsMouseHover(driver));
	}
	public static void validate_OtherGiftMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_OtherGiftMouseHover(driver));
		
	}
	public static void validate_GlobalMouseHover(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.validate_GlobalMouseHover(driver));
		
	}
	public static void mouseHover_Plants(WebDriver driver)
	{
		//implementations.TestWebDriverMethodImplementations.mouseHoverToElement(driver, Cakes_Obj.mouseHover_Plants(driver));
		implementations.TestWebDriverMethodImplementations.mouseHoverAndClickWebElement(driver, Plants_Obj.mouseHover_Plants(driver), Plants_Obj.clickOn_BonsaiPlants(driver));

	}
	
	public static void clickOn_BonsaiPlants(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_BonsaiPlants(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_CakeProduct(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Anniversary Flowers Page", logger, report);
		String[] val={Plants_Obj.clickOn_CakeProduct(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_FlowersProduct(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_FlowersProduct(driver));
	}
	public static void verify_ProductPrice(WebDriver driver)
	{		
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ProductPrice(driver));
	}
	public static void verify_Pincode(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_Pincode(driver));
	}
	
	public static void verify_AddToCart(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_AddToCart(driver));
	}
	public static void verify_BuyNow(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_BuyNow(driver));
	}
	public static void clickOn_BuyNow(WebDriver driver)
	{
		String[] val={Plants_Obj.verify_BuyNow(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_AddToCart(WebDriver driver)
	{
		String[] val={Plants_Obj.verify_AddToCart(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_PncodeErrorInProductDetailsPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.getText(driver, Plants_Obj.verify_PncodeErrorInProductDetailsPage(driver));
	}
	public static void sendKeysTo_Pincode(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Product Details Page", logger, report);
		implementations.TestWebDriverMethodImplementations.verifyWebElementWithTry(driver, Plants_Obj.clickOn_PincodeClearCross(driver));
		implementations.TestWebDriverMethodImplementations.smallSleep(driver);
		String[] val={Plants_Obj.sendKeysTo_Pincode(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, pincode);
	}
	public static void clearText_Pincode(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.clearText(driver, Plants_Obj.sendKeysTo_Pincode(driver));
	}
	public static void clicOn_pincodeSuggestion(WebDriver driver,String pincode)
	{
		String[] val={Plants_Obj.clicOn_pincodeSuggestion(driver, pincode)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Date(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_Date(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_Date(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.clickOn_Date(driver));
	}
	public static void clickOn_SameDayDate(WebDriver driver)
	{
		String[] nextMonth =
			{ Plants_Obj.clickOn_NextMonthOnPdp(driver) };
			implementations.ActionsImplementation.clickOnLocator(driver, "xpath", nextMonth);
			TestWebDriverMethodImplementations.smallSleep(driver);
		String[] val={Plants_Obj.clickOn_SameDayDate(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_NextDate(WebDriver driver)
	{
		String[] nextMonth =
			{ Plants_Obj.clickOn_NextMonth(driver) };
			implementations.ActionsImplementation.clickOnLocator(driver, "xpath", nextMonth);
			TestWebDriverMethodImplementations.smallSleep(driver);
		String[] val={Plants_Obj.clickOn_NextDate(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_SamDateDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_SamDateDeliveryPage(driver));
	}
	public static void clickOn_ShippingMethods(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_ShippingMethods(driver),Plants_Obj.clickOn_ShippingMethods2(driver),Plants_Obj.clickOn_ShippingMethods3(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ShippingTime(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_ShippingTime(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	//=============
	public static void clickOn_ContinueWithoutAddons(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_ContinueWithoutAddons(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ContinueWithAddons(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_ContinueWithAddons(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Cart_AfterAddingProduct(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_Cart_AfterAddingProduct(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ProductInCart(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ProductInCart(driver));
	}
	public static void clickOn_ProductRemoveOption(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_ProductRemoveOption(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);		
	}
	public static void clickOn_AddonProduct(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_AddonProduct(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);		
	}
	public static void verify_MessageAfterRemoveProduct(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_MessageAfterRemoveProduct(driver));
	}
	
	public static void clickOn_PincodeClearCross(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_PincodeClearCross(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void verify_TotalAmount(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_TotalAmount(driver));
	}
	public static void verify_ContinueShopping(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ContinueShopping(driver));
	}
	public static void verify_ProceedToCheckOut(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ProceedToCheckOut(driver));
	}
	public static void verify_MessageAfterProductRemove(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_MessageAfterProductRemove(driver));
	}
	public static void verify_ShippingDetailsInProductDetailsPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ShippingDetailsInProductDetailsPage(driver));
	}
	public static void verify_DeliveryDateOfMonth(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_DeliveryDateOfMonth(driver));
	}
	public static void verify_ShippmentMethod(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ShippmentMethod(driver));
	}
	public static void verify_DeliveryMonth(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_DeliveryMonth(driver));
	}
	public static void verify_ShippingMethod(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ShippingMethod(driver));
	}
	public static void verify_TimeSlot(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_TimeSlot(driver));
	}
	public static void verify_LoginPageAfterAddingProduct(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Navigated to Delivery Details Page", logger, report);
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_LoginPageAfterAddingProduct(driver));
	}
	public static void verify_FacebookLoginOption(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_FacebookLoginOption(driver));
	}
	public static void verify_GoogleLoginOption(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_GoogleLoginOption(driver));
	}
	public static void verify_OrderAndDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_OrderAndDeliveryDetails(driver));
	}
	public static void verify_PaymentOptions(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_PaymentOptions(driver));
	}
	public static void verify_EmailIdFieldInCheckoutPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.SendKeys_EmailId(driver));

	}
	public static void SendKeys_EmailId(WebDriver driver,String emailId)
	{
		String[] val={Plants_Obj.SendKeys_EmailId(driver),Plants_Obj.SendKeys_EmailId2(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, emailId);
	}
	public static void verify_EmailId(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.SendKeys_EmailId(driver));
	}
	public static void clickOn_LoginContinueButton(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_LoginContinueButton(driver)};
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void SendKeys_NameInRegestrationPage(WebDriver driver,String name)
	{
		String[] val={Plants_Obj.SendKeys_NameInRegestrationPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, name);
	}
	public static void SendKeys_MobileNumber(WebDriver driver,String mobileNumber)
	{
		String[] val={Plants_Obj.SendKeys_MobileNumber(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, mobileNumber);
	}
	public static void SendKeys_PasswordClear(WebDriver driver)
	{
		TestWebDriverMethodImplementations.clearText(driver, Plants_Obj.sendKeys_Password(driver));
	}
	public static void SendKeys_Password(WebDriver driver,String password)
	{
		String[] val={Plants_Obj.sendKeys_Password(driver),Plants_Obj.sendKeys_Password2(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, password);
	}
	public static void clickOn_Continue(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_Continue(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_InvalidPasswordError(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_InvalidPasswordError(driver));
	}
	public static void sendKeys_PasswordInProductDeliveryPage(WebDriver driver,String password)
	{
		String[] val={Plants_Obj.sendKeys_PasswordInProductDeliveryPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, password);
	}
	public static void verify_InvalidPasswordErrorInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_InvalidPasswordErrorInProductDeliveryPage(driver));
	}
	public static void verify_ProductNameInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ProductNameInProductDeliveryPage(driver));
	}
	public static void verify_ChangeButtonInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ChangeButtonInProductDeliveryPage(driver));
	}
	public static void clickOn_ChangeButtonInProductDeliveryPage(WebDriver driver)
	{
		String[] val={Plants_Obj.verify_ChangeButtonInProductDeliveryPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ExistingAddressInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ExistingAddressInProductDeliveryPage(driver));
	}
	public static void verify_TotalAmountInProductDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_TotalAmountInProductDeliveryPage(driver));
	}
	public static void clickOn_ShippingTypeOnPrductDeliveryPage(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_ShippingTypeOnPrductDeliveryPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_SelectTimeToDelivery(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_SelectTimeToDelivery(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_DeliveryDate(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_DeliveryDate(driver));
	}
	public static void verify_DeliveryDateInDeliveryDetailsPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_DeliveryDateInDeliveryDetailsPage(driver));
	}
	public static void verify_DeliveryMethodInDeliveryDetailsPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_DeliveryMethodInDeliveryDetailsPage(driver));
	}
	public static void verify_DeliveryMethod(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_DeliveryMethod(driver));
	}
	public static void clickOn_DeleteButtonInDeliveryDtailsPage(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_DeleteButtonInDeliveryDtailsPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_Yes(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_Yes(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_CartIsEmpty(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_CartIsEmpty(driver));
	}
	public static void clickOn_StartShoppingNow(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_StartShoppingNow(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_NameOfProfileInDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_NameOfProfileInDeliveryPage(driver));
	}
	public static void verify_MailInDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_MailInDeliveryPage(driver));
	}
	public static void verify_PhoneNumberInDeliveryPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_PhoneNumberInDeliveryPage(driver));
	}
	public static void VerifyWithBoolean_SelectDeliveryAddress(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.verifyWebElementWithBoolean(driver, Plants_Obj.verify_AddNewAddress(driver));
	}
	public static void verify_ErrorForWithoutEnteringDataInDeliveryAddress(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ErrorForWithoutEnteringDataInDeliveryAddress(driver));
	}
	public static void clickOn_SaveAddressInDeliveryAddress(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_SaveAddressInDeliveryAddress(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_NamePrefixButton(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_NamePrefixButton(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_NamePrefixSuggestion(WebDriver driver,String namePrefix)
	{
		String[] val={Plants_Obj.clickOn_NamePrefixSuggestion(driver, namePrefix)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void sendKeys_NameInDeliveyAddressPage(WebDriver driver,String nameInDeliveyPage)
	{
		String[] val={Plants_Obj.sendKeys_NameInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, nameInDeliveyPage);
	}
	public static void clearText_NameInDeliveyAddressPage(WebDriver driver)
	{
		TestWebDriverMethodImplementations.clearText(driver, Plants_Obj.sendKeys_NameInDeliveyAddressPage(driver));
	}
	public static void verify_NameInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.sendKeys_NameInDeliveyAddressPage(driver));

	}
	public static void sendKeys_RecppientsAddressInDeliveyAddressPage(WebDriver driver,String recepientAddress)
	{
		String[] val={Plants_Obj.sendKeys_RecppientsAddressInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, recepientAddress);
	}
	public static void verify_RecppientsAddressInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.sendKeys_RecppientsAddressInDeliveyAddressPage(driver));
	}
	public static void sendKeys_LandmarkInDeliveyAddressPage(WebDriver driver,String landmark)
	{
		String[] val={Plants_Obj.sendKeys_LandmarkInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, landmark);
	}
	public static void verify_LandmarkInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.sendKeys_LandmarkInDeliveyAddressPage(driver));

	}
	public static void clickOn_AddressTypeInDeliveyAddressPage(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_AddressTypeInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void sendKeys_MobileNumberInDeliveyAddressPage(WebDriver driver,String mobileNnumber)
	{
		String[] val={Plants_Obj.sendKeys_MobileNumberInDeliveyAddressPage(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, mobileNnumber);
	}
	public static void clearText_MobileNumberInDeliveyAddressPage(WebDriver driver)
	{
		TestWebDriverMethodImplementations.clearText(driver, Plants_Obj.sendKeys_MobileNumberInDeliveyAddressPage(driver));
	}
	public static void verify_MobileNumberInDeliveyAddressPage(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.sendKeys_MobileNumberInDeliveyAddressPage(driver));

	}
	public static void verify_AddedAddressInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_AddedAddressInDeliveryDetails(driver));
	}
	public static void verify_ErrorMessageForInvalidMobileNumberInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_ErrorMessageForInvalidMobileNumberInDeliveryDetails(driver));

	}
	public static void sendKeys_OptionalMailidInDeliveryDetails(WebDriver driver,String optionalMailId)
	{
		String[] val={Plants_Obj.sendKeys_OptionalMailidInDeliveryDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, optionalMailId);
	}
	public static void verify_OptionalMailidInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.sendKeys_OptionalMailidInDeliveryDetails(driver));

	}
	public static void clickOn_EditInDeliveryDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_EditInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	//
	public static void clickOn_FreeMessageCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_FreeMessageCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_SelectOcassionInDeliveryDetailsPage(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_SelectOcassionInDeliveryDetailsPage(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_OccationTypeSuggestion(WebDriver driver,String occationType)
	{
		String[] val={Plants_Obj.clickOn_OccationTypeSuggestion(driver, occationType)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_MessageOnCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_MessageOnCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_MessageOnCardSuggestionInDeliveryDetails(WebDriver driver,String messageOnCard)
	{
		String[] val={Plants_Obj.clickOn_MessageOnCardSuggestionInDeliveryDetails(driver, messageOnCard)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_SaveforMessageCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_SaveforMessageCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ErrorMessageForMessageCard(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ErrorMessageForMessageCard(driver));

	}
	public static void clickOn_CancelforMessageCardInDeliveryDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_CancelforMessageCardInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clickOn_ProceedToCheckoutInDeliveryDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_ProceedToCheckoutInDeliveryDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_ErrorforProceedToCheckoutInDeliveryDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_ErrorforProceedToCheckoutInDeliveryDetails(driver));
	}
	public static void clickOn_TermsAndConditions(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_TermsAndConditions(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_CreditCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_CreditCardInPaymentDetails(driver));

	}
	public static void clickOn_CreditCardInPaymentDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.verify_CreditCardInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_DebitCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_DebitCardInPaymentDetails(driver));

	}
	public static void verify_NetBankningInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_NetBankningInPaymentDetails(driver));

	}
	public static void verify_EmiInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_EmiInPaymentDetails(driver));

	}
	public static void verify_UpiInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_UpiInPaymentDetails(driver));

	}
	public static void verify_PayTmInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_PayTmInPaymentDetails(driver));

	}
	public static void verify_PayPalInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_PayPalInPaymentDetails(driver));

	}
	public static void verify_Amex_ezeClickInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_Amex_ezeClickInPaymentDetails(driver));

	}
	//
	public static void verify_CreditCardNumberPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_CreditCardNumberPaymentDetails(driver));

	}
	public static void sendkeys_CreditCardNumberPaymentDetails(WebDriver driver,String creditCardNumber)
	{
		String[] val={Plants_Obj.verify_CreditCardNumberPaymentDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, creditCardNumber);
	}
	public static void verify_CreditCardNameInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_CreditCardNameInPaymentDetails(driver));

	}
	public static void sendKeys_CreditCardNameInPaymentDetails(WebDriver driver,String creditCardName)
	{
		String[] val={Plants_Obj.verify_CreditCardNameInPaymentDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, creditCardName);
	}
	public static void verify_MonthInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_MonthInPaymentDetails(driver));

	}
	public static void clickOn_MonthInPaymentDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.verify_MonthInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void clicOn_DropdownSuggestionInPaymentDetails(WebDriver driver,String value)
	{
		String[] val={Plants_Obj.clicOn_DropdownSuggestionInPaymentDetails(driver, value)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_YearInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_YearInPaymentDetails(driver));

	}
	public static void clickOn_YearInPaymentDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.verify_YearInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void verify_CvvNumberInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_CvvNumberInPaymentDetails(driver));

	}
	public static void sendKeys_CvvNumberInPaymentDetails(WebDriver driver,String cvv)
	{
		String[] val={Plants_Obj.verify_CvvNumberInPaymentDetails(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, cvv);
	}
	public static void verify_SaveThisCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_SaveThisCardInPaymentDetails(driver));

	}
	public static void verify_PayButtonInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_PayButtonInPaymentDetails(driver));
	}
	public static void clickOn_PayButtonInPaymentDetails(WebDriver driver)
	{
		String[] val={Plants_Obj.verify_PayButtonInPaymentDetails(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void verify_ErrorForBlankDataInCreditCardInPaymentDetails(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.verify_ErrorForBlankDataInCreditCardInPaymentDetails(driver));

	}
	public static void verify_FlavourErrorInPdp(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElementWithoutText(driver, Plants_Obj.verify_FlavourErrorInPdp(driver));
	}
	public static void clickOn_SelectFlavour(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_SelectFlavour2(driver),Plants_Obj.clickOn_SelectFlavour(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_FlavourSuggestion(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_FlavourSuggestion2(driver),Plants_Obj.clickOn_FlavourSuggestion(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_WithEggInPdp(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_WithEggInPdp(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_WithEgglessInPdp(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_WithEgglessInPdp(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);	
	}
	public static void clickOn_VarientItem(WebDriver driver)
	{
		String[] val={Plants_Obj.clickOn_VarientItem(driver)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
	public static void mouseHover_MessageOnCake(WebDriver driver)
	{
		TestWebDriverMethodImplementations.mouseHoverAndClickWebElement(driver, Plants_Obj.mouseHover_MessageOnCakeElement(driver), Plants_Obj.mouseHover_MessageOnCakeEdit(driver));
	}
	public static void sendKeys_MessageOnCakeElement(WebDriver driver,String messageOnCake)
	{
		String[] val={Plants_Obj.mouseHover_MessageOnCakeElement(driver)};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, messageOnCake);
	}
	public static void verify_MessageOnCakeElement(WebDriver driver)
	{
		implementations.TestWebDriverMethodImplementations.highlightElement(driver, Plants_Obj.mouseHover_MessageOnCakeElement(driver));
	}
	public static void fnp_Plants_038(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String occationType,String messageOnCard)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		clickOn_AddressTypeInDeliveyAddressPage(driver);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_FreeMessageCardInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SelectOcassionInDeliveryDetailsPage(driver);
		clickOn_OccationTypeSuggestion(driver,occationType);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_MessageOnCardInDeliveryDetails(driver);
		clickOn_MessageOnCardSuggestionInDeliveryDetails(driver,messageOnCard);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SaveforMessageCardInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_TermsAndConditions(driver);
		clickOn_ProceedToCheckoutInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.longSleep(driver);
		verify_PaymentOptions(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	
	}
	public static void fnp_Plants_037(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String occationType,String messageOnCard)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		clickOn_AddressTypeInDeliveyAddressPage(driver);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_FreeMessageCardInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SelectOcassionInDeliveryDetailsPage(driver);
		clickOn_OccationTypeSuggestion(driver,occationType);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_MessageOnCardInDeliveryDetails(driver);
		clickOn_MessageOnCardSuggestionInDeliveryDetails(driver,messageOnCard);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SaveforMessageCardInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ProceedToCheckoutInDeliveryDetails(driver);
		verify_ErrorforProceedToCheckoutInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	
	}
	public static void fnp_Plants_036(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		clickOn_AddressTypeInDeliveyAddressPage(driver);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_FreeMessageCardInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SaveforMessageCardInDeliveryDetails(driver);
		verify_ErrorMessageForMessageCard(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_035(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId,String nameInDeliveyPage2,String mobileNumber2)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		clickOn_AddressTypeInDeliveyAddressPage(driver);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_AddedAddressInDeliveryDetails(driver);
		clickOn_EditInDeliveryDetails(driver);
		clearText_NameInDeliveyAddressPage(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage2);
		clearText_MobileNumberInDeliveyAddressPage(driver);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber2);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_AddedAddressInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_034(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		clickOn_AddressTypeInDeliveyAddressPage(driver);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_AddedAddressInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_033(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		verify_OptionalMailidInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_032(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber,String optionalMailId)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		sendKeys_OptionalMailidInDeliveryDetails(driver, optionalMailId);
		verify_OptionalMailidInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_031(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		verify_ErrorMessageForInvalidMobileNumberInDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_030(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark,String mobileNumber)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		sendKeys_MobileNumberInDeliveyAddressPage(driver,mobileNumber);
		verify_MobileNumberInDeliveyAddressPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_029(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		verify_LandmarkInDeliveyAddressPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_028(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage,String recepientAddress,String landmark)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		sendKeys_RecppientsAddressInDeliveyAddressPage(driver,recepientAddress);
		sendKeys_LandmarkInDeliveyAddressPage(driver,landmark);
		verify_LandmarkInDeliveyAddressPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_027(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		verify_NameInDeliveyAddressPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_026(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		verify_NameInDeliveyAddressPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_025(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password,String namePrefix,String nameInDeliveyPage)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_NamePrefixButton(driver);
		clickOn_NamePrefixSuggestion(driver,namePrefix);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_NameInDeliveyAddressPage(driver,nameInDeliveyPage);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_024(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		VerifyWithBoolean_SelectDeliveryAddress(driver);
		clickOn_SaveAddressInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_ErrorForWithoutEnteringDataInDeliveryAddress(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_023(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_NameOfProfileInDeliveryPage(driver);
		verify_MailInDeliveryPage(driver);
		verify_PhoneNumberInDeliveryPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_022(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		clickOn_DeleteButtonInDeliveryDtailsPage(driver);
		clickOn_Yes(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		try{
		verify_CartIsEmpty(driver);
		clickOn_StartShoppingNow(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		validate_Fnp_Logo(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	catch(Exception e)
	{
		implementations.ReusableMethodsImplementation.testCaseInfo_WithScreenshot(driver, "Products still existing in cart", logger, report);
	}
	}
	public static void fnp_Plants_021(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		clickOn_ChangeButtonInProductDeliveryPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_NextDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingTypeOnPrductDeliveryPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SelectTimeToDelivery(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		verify_DeliveryDateInDeliveryDetailsPage(driver);
		verify_DeliveryMethodInDeliveryDetailsPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_020(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_OrderAndDeliveryDetails(driver);
		verify_ProductNameInProductDeliveryPage(driver);
		verify_ChangeButtonInProductDeliveryPage(driver);
		verify_TotalAmountInProductDeliveryPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_019(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_InvalidPasswordErrorInProductDeliveryPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_018(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String password)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeys_PasswordInProductDeliveryPage(driver, password);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);
		verify_OrderAndDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_017(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		SendKeys_EmailId(driver,emailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_EmailId(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_016(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String emailId,String name,String mobileNumber,String invalidPassword,String validPassword)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		String randomString=ReusableMethodsImplementation.random_Alpha_Numeric(driver);
		String randomEmailId = randomString+emailId;
		SendKeys_EmailId(driver,randomEmailId);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Continue(driver);
		SendKeys_NameInRegestrationPage(driver,name);
		SendKeys_MobileNumber(driver,mobileNumber);
		SendKeys_Password(driver,invalidPassword);
		verify_InvalidPasswordError(driver);
		SendKeys_PasswordClear(driver);
		SendKeys_Password(driver,validPassword);
		clickOn_Continue(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_OrderAndDeliveryDetails(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_015(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		verify_FacebookLoginOption(driver);
		verify_GoogleLoginOption(driver);
		verify_OrderAndDeliveryDetails(driver);
		verify_PaymentOptions(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_014(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_013(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_BuyNow(driver);
		verify_PncodeErrorInProductDetailsPage(driver);
	}
	public static void fnp_Plants_012(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithoutAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_LoginPageAfterAddingProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_011(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		verify_DeliveryDate(driver);
		verify_DeliveryMethod(driver);
		verify_ShippmentMethod(driver);
	}
	public static void fnp_Plants_010(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		implementations.TestWebDriverMethodImplementations.verifyWebElementWithTry(driver, Plants_Obj.clickOn_PincodeClearCross(driver));
		clickOn_BuyNow(driver);
		verify_PncodeErrorInProductDetailsPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_009(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode,String pincode2,String pincode3)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
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
	public static void fnp_Plants_008(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_AddToCart(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Cart_AfterAddingProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ProductRemoveOption(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.alertAccept(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_MessageAfterProductRemove(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_007(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_AddToCart(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Cart_AfterAddingProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_ProductInCart(driver);
		verify_TotalAmount(driver);
		verify_ContinueShopping(driver);
		verify_ProceedToCheckOut(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_006(WebDriver driver, ExtentTest logger, ExtentReports report,String pincode)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		sendKeysTo_Pincode(driver, logger, report, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clicOn_pincodeSuggestion(driver, pincode);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Date(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_SameDayDate(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		/*clickOn_ShippingMethods(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ShippingTime(driver);
		TestWebDriverMethodImplementations.mediumSleep(driver);*/
		clickOn_AddToCart(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddonProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_ContinueWithAddons(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_Cart_AfterAddingProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_ProductInCart(driver);
	}
	public static void fnp_Plants_005(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_AddToCart(driver);
		verify_PncodeErrorInProductDetailsPage(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_004(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_FlowersProduct(driver);
		verify_Pincode(driver);
		//verify_Date(driver);
		verify_AddToCart(driver);
		verify_BuyNow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void fnp_Plants_003(WebDriver driver, ExtentTest logger, ExtentReports report)
	{
		mouseHover_Plants(driver);
		clickOn_BonsaiPlants(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		clickOn_CakeProduct(driver, logger, report);
		TestWebDriverMethodImplementations.smallSleep(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
		verify_FlowersProduct(driver);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	
	public static void fnp_Plants_002(WebDriver driver, ExtentTest logger, ExtentReports report)
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
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e6)
		{
		}
		try
		{
			clickOn_Cart_AfterAddingProduct(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e1)
		{
			System.out.println("Removing products in cart");
		}
		try{
		int size = driver.findElements(By.xpath(Plants_Obj.clickOn_ProductRemoveOption2(driver))).size();
		System.out.println(size);
		if(size!=0)
		{
		for (int i = 0; i<size; i++)
		{
			TestWebDriverMethodImplementations.smallSleep(driver);
			clickOn_ProductRemoveOption(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
			TestWebDriverMethodImplementations.alertAccept(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
			System.out.println("deleted");
		}
		}
		}catch(Exception ew)
		{
			
		}
		try
		{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
			mouseHoverTo_Account(driver);
			clickOn_MyProfile(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
			clickOn_LogoutInMyProfile(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e5)
		{
			
		}
		try{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
		}catch(Exception esd)
		{
			
		}
		throw e;
	}
	
	public static void reusableMethod_WithoutException(WebDriver driver) throws Exception
	{
		try
		{
			clickOn_Fnp_Logo(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e6)
		{
		}
		try
		{
			clickOn_Cart_AfterAddingProduct(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e1)
		{
			System.out.println("Removing products in cart");
		}
		try{
		int size = driver.findElements(By.xpath(Plants_Obj.clickOn_ProductRemoveOption2(driver))).size();
		System.out.println(size);
		if(size!=0)
		{
		for (int i = 0; i<size; i++)
		{
			TestWebDriverMethodImplementations.smallSleep(driver);
			clickOn_ProductRemoveOption(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
			TestWebDriverMethodImplementations.alertAccept(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
			System.out.println("deleted");
		}
		}
		}catch(Exception ew)
		{
			
		}
		try
		{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
			mouseHoverTo_Account(driver);
			clickOn_MyProfile(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
			clickOn_LogoutInMyProfile(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e5)
		{
		}
		try{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
		}catch(Exception esd)
		{
			
		}
		
	}
	public static void reusableMethod_WithoutLogout(WebDriver driver) throws Exception
	{
		try{
			clickOn_Fnp_Logo(driver);
			implementations.TestWebDriverMethodImplementations.smallSleep(driver);
			}catch(Exception e35)
			{
				
			}
		try
		{
			clickOn_Cart_AfterAddingProduct(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
		}
		catch (Exception e1)
		{
			System.out.println("Removing products in cart");
		}
		try{
		int size = driver.findElements(By.xpath(Plants_Obj.clickOn_ProductRemoveOption2(driver))).size();
		System.out.println(size);
		if(size!=0)
		{
		for (int i = 0; i<size; i++)
		{
			TestWebDriverMethodImplementations.smallSleep(driver);
			clickOn_ProductRemoveOption(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
			TestWebDriverMethodImplementations.alertAccept(driver);
			TestWebDriverMethodImplementations.smallSleep(driver);
			System.out.println("deleted");
		}
		}
		}catch(Exception ew)
		{
			
		}
		try{
		clickOn_Fnp_Logo(driver);
		implementations.TestWebDriverMethodImplementations.smallSleep(driver);
		}catch(Exception e37)
		{
			
		}
	}
	

}
