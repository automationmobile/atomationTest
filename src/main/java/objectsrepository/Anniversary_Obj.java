package objectsrepository;

import org.openqa.selenium.WebDriver;

public class Anniversary_Obj
{
	public static String validate_Account(WebDriver driver)
	{
		String val="//span[@id='user-name']";
		return val;
	}
	
	public static String validate_Cart(WebDriver driver)
	{
		String val="(//span[@class='cart-icon'])[last()]";
		return val;
	}
	public static String validate_Currency(WebDriver driver)
	{
		String val="//span[text()='Currency']/following::span[1]";
		return val;
	}
	public static String validate_ContactNumber(WebDriver driver)
	{
		String val="//li[@id='enquire']/preceding::a[1]";
		return val;
	}
	public static String validate_More(WebDriver driver)
	{
		String val="//li[@id='enquire']";
		return val;
	}
	public static String validate_Fnp_Logo(WebDriver driver)
	{
		String val="//a[@data-ga-title='Logo']";
		return val;
	}
	
	public static String validate_Searchbox(WebDriver driver)
	{
		String val="//input[@name='qs']";
		return val;
	}
	public static String validate_FlowersMouseHover(WebDriver driver)
	{
		String val="(//a[text()='Flowers'])[1]";
		return val;
	}
	public static String validate_CakesMouseHover(WebDriver driver)
	{
		String val="(//a[text()='Cakes'])[1]";
		return val;
	}
	public static String validate_PersonalizedMouseHover(WebDriver driver)
	{
		String val="(//a[text()='Personalised'])[1]";
		return val;
	}
	public static String validate_PlantsMouseHover(WebDriver driver)
	{
		String val="(//a[text()='Plants'])[1]";
		return val;
	}
	public static String validate_OtherGiftMouseHover(WebDriver driver)
	{
		String val="//a[@href='#othergiftsmenu']";
		return val;
	}
	public static String validate_GlobalMouseHover(WebDriver driver)
	{
		String val="//a[@href='#globalmenu']";
		return val;
	}
	public static String validate_BirthDayMouseHover(WebDriver driver)
	{
		String val="//a[@href='#birthdaymenu']";
		return val;
	}
	public static String validate_AnniversaryMouseHover(WebDriver driver)
	{
		String val="//a[@href='#anniversarymenu']";
		return val;
	}
	public static String validate_OccasionsMouseHover(WebDriver driver)
	{
		String val="(//a[text()='Occasions'])[last()]";
		return val;
	}
	public static String mouseHover_Anniverary(WebDriver driver)
	{
		String val="(//a[text()='Anniversary'])[1]";
		return val;
	}
	public static String clickOn_Flowers(WebDriver driver)
	{
		String val="(//a[text()='Flowers'])[last()]";
		return val;
	}
	public static String clickOn_FlowersProduct(WebDriver driver,String flowerName)
	{
		String val="//span[text()=' "+flowerName+"']";
		return val;
	}
	public static String verify_FlowersProduct(WebDriver driver)
	{
		String val="//div[@itemprop='name']";
		return val;
	}
	public static String verify_ProductPrice(WebDriver driver)
	{
		String val="//span[@class='odometer-price']";
		return val;
	}
	public static String verify_Pincode(WebDriver driver)
	{
		String val="//div[@class='price-crossline']";
		return val;
	}
	
	public static String verify_Date(WebDriver driver)
	{
		String val="//a[@id='datetimelink']";
		return val;
	}
	public static String verify_AddToCart(WebDriver driver)
	{
		String val="//button[@id='addToCart']";
		return val;
	}
	public static String verify_BuyNow(WebDriver driver)
	{
		String val="//button[@data-ga-title='BUY NOW']";
		return val;
	}
	public static String verify_PncodeErrorInProductDetailsPage(WebDriver driver)
	{
		String val="//div[@id='pincodeAlert']";
		return val;
	}
	public static String sendKeysTo_Pincode(WebDriver driver)
	{
		String val="//input[@name='destlookup']";
		return val;
	}
	//==============
	public static String clicOn_pincodeSuggestion(WebDriver driver,String pincode)
	{
		String val="//span[text()='"+pincode+"']";
		return val;
	}
	public static String clickOn_Date(WebDriver driver)
	{
		String val="//a[@title='You can select date and time of delivery after providing valid pincode']";
		return val;
	}
	public static String clickOn_SameDayDate(WebDriver driver)
	{
		String val="(//td[@data-handler='selectDay'])[2]";
		return val;
	}
	public static String clickOn_NextDate(WebDriver driver)
	{
		String val="(//div[@class='DayPicker-Day'])[1]";
		return val;
	}
	public static String clickOn_NextMonth(WebDriver driver)
	{
		String val="//i[text()='arrow_right']";
		return val;
	}
	public static String clickOn_ShippingMethod(WebDriver driver)
	{
		String val="(//span[@class='rdo-span'])[1]";
		return val;
	}
	public static String clickOn_Time(WebDriver driver)
	{
		String val="(//span[@class='rdo-span'])[last()]";
		return val;
	}
	
	public static String verify_SamDateDeliveryPage(WebDriver driver)
	{
		String val="//h1[text()='Same day delivery gifts']";
		return val;
	}
	public static String clickOn_ShippingMethods(WebDriver driver)
	{
		String val="//span[text()='Free']/preceding::span[2]";
		return val;
	}
	public static String clickOn_ShippingMethods2(WebDriver driver)
	{
		String val="(//span[text()='Free']/preceding::span[2])[last()]";
		return val;
	}
	public static String clickOn_ShippingMethods3(WebDriver driver)
	{
		String val="(//span[@class='rdo-span'])[1]";
		return val;
	}
	public static String clickOn_ShippingTime(WebDriver driver)
	{
		String val="(//span[@class='rdo-span'])[last()]";
		return val;
	}
	//============
	public static String clickOn_ContinueWithoutAddons(WebDriver driver)
	{
		String val="//span[text()='Continue without add ons']";
		return val;
	}
	public static String clickOn_ContinueWithAddons(WebDriver driver)
	{
		String val="//span[contains(text(),'Continue with')]";
		return val;
	}
	public static String clickOn_Cart_AfterAddingProduct(WebDriver driver)
	{
		String val="//span[text()='Cart']";
		return val;
	}
	public static String verify_ProductInCart(WebDriver driver,String productName)
	{
		String val="(//span[text()='"+productName+"'])[last()]";
		return val;
	}
	public static String clickOn_ProductRemoveOption(WebDriver driver,String productName)
	{
		String val="(//span[text()='"+productName+"'])[1]/following::span[1]";
		return val;
				
	}
	public static String clickOn_AddonProduct(WebDriver driver,String addOnProductName)
	{
		String val="//span[text()='"+addOnProductName+"']";
		return val;
	}
	public static String verify_AddOnProduct(WebDriver driver,String addOnProductName)
	{
		String val="(//span[text()='"+addOnProductName+"'])[last()-1]";
		return val;
	}
	public static String verify_MessageAfterRemoveProduct(WebDriver driver)
	{
		String val="(//h4[text()='Your Cart']/following::h5[1])[last()-1]";
		return val;
	}	
	public static String clickOn_PincodeClearCross(WebDriver driver)
	{
		String val="//i[@class='material-icons clear-pin']";
		return val;
	}
	public static String verify_TotalAmount(WebDriver driver)
	{
		String val="(//td[text()='Total'])[1]/following::span[2]";
		return val;
	}
	public static String verify_ContinueShopping(WebDriver driver)
	{
		String val="(//button[text()='CONTINUE SHOPPING'])[last()]";
		return val;
	}
	public static String verify_ProceedToCheckOut(WebDriver driver)
	{
		String val="(//button[text()='PROCEED TO CHECKOUT'])[last()]";
		return val;
	}
	public static String verify_MessageAfterProductRemove(WebDriver driver)
	{
		String val="(//h5[@id='cartempty'])[last()]";
		return val;
	}
	public static String verify_ShippingDetailsInProductDetailsPage(WebDriver driver)
	{
		String val="//div[@id='datetimeshipping']";
		return val;
	}
	public static String verify_DeliveryDateOfMonth(WebDriver driver)
	{
		String val="//span[@id='deliverydateofmonth']";
		return val;
	}
	public static String verify_DeliveryMonth(WebDriver driver)
	{
		String val="//span[@id='deliverymonth']";
		return val;
	}
	public static String verify_ShippingMethod(WebDriver driver)
	{
		String val="//span[@id='shippingmethod']";
		return val;
	}
	public static String verify_TimeSlot(WebDriver driver)
	{
		String val="//span[@id='timeslot']";
		return val;
	}
	
	public static String verify_LoginPageAfterAddingProduct(WebDriver driver)
	{
		String val="//h4[text()='Login / Register']";
		return val;
	}
	public static String verify_FacebookLoginOption(WebDriver driver)
	{
		String val="//span[text()='Facebook']";
		return val;
	}
	public static String verify_GoogleLoginOption(WebDriver driver)
	{
		String val="//span[text()='Google']";
		return val;
	}
	public static String verify_OrderAndDeliveryDetails(WebDriver driver)
	{
		String val="//h4[text()='Order & Delivery Details']";
		return val;
	}
	public static String verify_PaymentOptions(WebDriver driver)
	{
		String val="//h4[text()='PAYMENT OPTIONS']";
		return val;
	}
	
	public static String SendKeys_EmailId(WebDriver driver)
	{
		String val="//input[@id='loginformEmailId']";
		return val;
	}
	public static String SendKeys_EmailId2(WebDriver driver)
	{
		String val="//button[text()='CONTINUE']/preceding::input[1]";
		return val;
	}
	public static String clickOn_LoginContinueButton(WebDriver driver)
	{
		String val="//button[@name='loginbtn']";
		return val;
	}
	
	public static String SendKeys_NameInRegestrationPage(WebDriver driver)
	{
		String val="//input[@id='reg_name']";
		return val;
	}
	public static String SendKeys_MobileNumber(WebDriver driver)
	{
		String val="//input[@id='reg_mobile']";
		return val;
	}
	public static String sendKeys_Password(WebDriver driver)
	{
		String val="//input[@id='regPassword']";
		return val;
	}
	public static String sendKeys_Password2(WebDriver driver)
	{
		String val="//input[@name='PASSWORD']";
		return val;
	}
	public static String clickOn_Continue(WebDriver driver)
	{
		String val="//span[text()='Continue']";
		return val;
	}
	public static String verify_InvalidPasswordError(WebDriver driver)
	{
		String val="//p[text()='At least 6 characters']";
		return val;
	}
	public static String clickOn_Logout(WebDriver driver)
	{
		String val="(//a[text()='Logout'])[last()-1]";
		return val;
	}
	public static String clickOn_MyProfile(WebDriver driver)
	{
		String val="//a[text()='My Profile']";
		return val;
	}
	public static String clickOn_LogoutInMyProfile(WebDriver driver)
	{
		String val="(//a[text()='Logout'])[last()]";
		return val;
	}
	public static String sendKeys_PasswordInProductDeliveryPage(WebDriver driver)
	{
		String val="//input[@id='loginPassword']";
		return val;
	}
	public static String verify_InvalidPasswordErrorInProductDeliveryPage(WebDriver driver)
	{
		String val="//span[text()='Invalid Email ID or password.']";
		return val;
	}
	public static String verify_ProductNameInProductDeliveryPage(WebDriver driver,String productName)
	{
		String val="//div[text()='"+productName+"']";
		return val;
	}
	public static String verify_ChangeButtonInProductDeliveryPage(WebDriver driver)
	{
		String val="//span[text()='Change']";
		return val;
	}
	public static String verify_ExistingAddressInProductDeliveryPage(WebDriver driver)
	{
		String val="//li[@title='Select this address']";
		return val;
	}
	public static String verify_TotalAmountInProductDeliveryPage(WebDriver driver)
	{
		String val="//div[text()='Total']";
		return val;
	}
	public static String clickOn_ShippingTypeOnPrductDeliveryPage(WebDriver driver)
	{
		String val="(//div[@class='shippingMethodTitle'])[last()]";
		return val;
	}
	public static String clickOn_SelectTimeToDelivery(WebDriver driver)
	{
		String val="(//span[@class='timeRange'])[last()]";
		return val;
	}
	public static String verify_DeliveryDate(WebDriver driver)
	{
		String val="//div[text()='DELIVERY ON']/following::div[1]";
		return val;
	}
	public static String verify_DeliveryMethod(WebDriver driver)
	{
		String val="//div[@class='delivery-method']";
		return val;
	}
	public static String clickOn_DeleteButtonInDeliveryDtailsPage(WebDriver driver,String flowerName)
	{
		String val="(//div[text()='"+flowerName+"'])[last()]/preceding::span[1]";
		return val;
	}
	public static String clickOn_Yes(WebDriver driver)
	{
		String val="//span[text()='Yes']";
		return val;
	}
	public static String verify_CartIsEmpty(WebDriver driver)
	{
		String val="//p[contains(text(),'Your cart is empty')]";
		return val;
	}
	public static String clickOn_StartShoppingNow(WebDriver driver)
	{
		String val="//span[text()='START SHOPPING NOW']";
		return val;
	}
	public static String verify_NameOfProfileInDeliveryPage(WebDriver driver)
	{
		String val="//h4[@class='mail-title']";
		return val;
	}
	public static String verify_MailInDeliveryPage(WebDriver driver)
	{
		String val="//span[text()='email']/following::span[1]";
		return val;
	}
	public static String verify_PhoneNumberInDeliveryPage(WebDriver driver)
	{
		String val="//span[text()='smartphone']/following::span[1]";
		return val;
	}
	public static String verify_AddNewAddress(WebDriver driver)
	{
		String val="//span[text()='add new address']";
		return val;
	}
	public static String verify_ErrorForWithoutEnteringDataInDeliveryAddress(WebDriver driver)
	{
		String val="//label[text()='* Name']/following::span[@class='errors'][1]";
		return val;
	}
	public static String clickOn_SaveAddressInDeliveryAddress(WebDriver driver)
	{
		String val="//span[text()='Save Address']";
		return val;
	}
	public static String clickOn_NamePrefixButton(WebDriver driver)
	{
		String val="//input[@id='rNameId-1']/preceding::button[1]";
		return val;
	}
	public static String clickOn_NamePrefixSuggestion(WebDriver driver,String namePrefix)
	{
		String val="//li[text()='"+namePrefix+"']";
		return val;
	}
	public static String sendKeys_NameInDeliveyAddressPage(WebDriver driver)
	{
		String val="//input[@id='rNameId-1']";
		return val;
	}
	public static String sendKeys_RecppientsAddressInDeliveyAddressPage(WebDriver driver)
	{
		String val="//input[@id='rAddressId-1']";
		return val;
	}
	public static String sendKeys_LandmarkInDeliveyAddressPage(WebDriver driver)
	{
		String val="//input[@id='rAddress2Id-1']";
		return val;
	}
	public static String clickOn_AddressTypeInDeliveyAddressPage(WebDriver driver)
	{
		String val="//span[text()='other']";
		return val;
	}
	public static String sendKeys_MobileNumberInDeliveyAddressPage(WebDriver driver)
	{
		String val="//input[@id='rMobileId-1']";
		return val;
	}
	public static String verify_AddedAddressInDeliveryDetails(WebDriver driver)
	{
		String val="(//li[@class='saved-address selected'])[last()]";
		return val;
	}
	public static String verify_ErrorMessageForInvalidMobileNumberInDeliveryDetails(WebDriver driver)
	{
		String val="//span[text()='* Recipient’s mobile number is invalid.']";
		return val;
	}
	public static String sendKeys_OptionalMailidInDeliveryDetails(WebDriver driver)
	{
		String val="//input[@id='remailId-1']";
		return val;
	}
	public static String clickOn_EditInDeliveryDetails(WebDriver driver)
	{
		String val="//P[@class='edit-address']";
		return val;
	}
	public static String clickOn_FreeMessageCardInDeliveryDetails(WebDriver driver)
	{
		String val="//h5[text()='Free Message card']/following::span[2]";
		return val;
	}
	public static String clickOn_SelectOcassionInDeliveryDetailsPage(WebDriver driver)
	{
		String val="//div[text()='OCCASION']/following::span[1]";
		return val;
	}
	public static String clickOn_OccationTypeSuggestion(WebDriver driver,String occationType)
	{
		String val="//li[text()='"+occationType+"']";
		return val;
	}
	public static String clickOn_MessageOnCardInDeliveryDetails(WebDriver driver)
	{
		String val="//div[text()='MESSAGE ON CARD']/following::span[1]";
		return val;
	}
	public static String clickOn_MessageOnCardSuggestionInDeliveryDetails(WebDriver driver,String messageOnCard)
	{
		String val="//li[text()='"+messageOnCard+"']";
		return val;
	}
	public static String clickOn_SaveforMessageCardInDeliveryDetails(WebDriver driver)
	{
		String val="//span[text()='Save']";
		return val;
	}
	public static String clickOn_CancelforMessageCardInDeliveryDetails(WebDriver driver)
	{
		String val="//span[text()='Cancel']";
		return val;
	}
	public static String verify_ErrorMessageForMessageCard(WebDriver driver)
	{
		String val="//span[text()='Message Cannot Be Empty']";
		return val;
	}
	public static String clickOn_ProceedToCheckoutInDeliveryDetails(WebDriver driver)
	{
		String val="//span[text()='Proceed To Checkout']";
		return val;
	}
	public static String verify_ErrorforProceedToCheckoutInDeliveryDetails(WebDriver driver)
	{
		String val="//span[text()='Your consent is required']";
		return val;
	}
	public static String clickOn_TermsAndConditions(WebDriver driver)
	{
		String val="//span[text()='I agree to the ']/preceding::input[1]";
		return val;
	}
	public static String verify_CreditCardInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='Credit Card']";
		return val;
	}
	public static String verify_DebitCardInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='Debit Card']";
		return val;
	}
	public static String verify_NetBankningInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='Net Banking']";
		return val;
	}
	public static String verify_EmiInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='EMI']";
		return val;
	}
	public static String verify_UpiInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='UPI']";
		return val;
	}
	public static String verify_PayTmInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='PayTm']";
		return val;
	}
	public static String verify_PayPalInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='PayPal']";
		return val;
	}
	public static String verify_Amex_ezeClickInPaymentDetails(WebDriver driver)
	{
		String val="//p[text()='Amex ezeClick']";
		return val;
	}
	
	public static String verify_CreditCardNumberPaymentDetails(WebDriver driver)
	{
		String val="//input[@id='card-number--cc']";
		return val;
	}
	public static String verify_CreditCardNameInPaymentDetails(WebDriver driver)
	{
		String val="//input[@id='name-on-card--cc']";
		return val;
	}
	public static String verify_MonthInPaymentDetails(WebDriver driver)
	{
		String val="//button[@title='MM']";
		return val;
	}
	public static String verify_YearInPaymentDetails(WebDriver driver)
	{
		String val="//button[@title='YYYY']";
		return val;
	}
	public static String verify_CvvNumberInPaymentDetails(WebDriver driver)
	{
		String val="//input[@id='cvv-number--cc']";
		return val;
	}
	public static String verify_SaveThisCardInPaymentDetails(WebDriver driver)
	{
		String val="//span[text()='Save this card for future transactions.']";
		return val;
	}
	public static String verify_PayButtonInPaymentDetails(WebDriver driver)
	{
		String val="//span[text()='PAY ']";
		return val;
	}
	public static String verify_ErrorForBlankDataInCreditCardInPaymentDetails(WebDriver driver)
	{
		String val="//span[text()='Please enter correct card number.']";
		return val;
	}
	public static String clicOn_DropdownSuggestionInPaymentDetails(WebDriver driver,String value)
	{
		String val="//li[text()='"+value+"']";
		return val;
	}
	
}
