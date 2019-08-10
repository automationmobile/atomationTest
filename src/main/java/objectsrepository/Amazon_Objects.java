package objectsrepository;

import org.openqa.selenium.WebDriver;

public class Amazon_Objects
{
	public static String sendKeys_SearchBox = "//input[@id='twotabsearchtextbox']";
	public static String clickOn_SearchButton="(//input[@type='submit'])[1]";
	//Products list Page
	public static String clickOn_Product(WebDriver driver,String productName)
	{
		String val = "(//span[contains(text(),'"+productName+"')])[3]";
		return val;
	}
	//Product Page
	public static String verify_PriceOfProduct = "//td[text()='Deal of the Day:']/following::span[1]";
	public static String clickOn_AddToCart = "//span[text()='Add to Cart']";
	public static String clickOn_CartButton = "(//a[contains(text(),'Cart')])[1]";
	public static String clickOn_ProceedToPayButton = "(//a[contains(text(),'Proceed to Buy')])[1]";
	//
	public static String verify_PriceOfProductInCart = "//b[text()='Cart subtotal']/following::span[1]";
	//Login page
	public static String sendKeys_Email="//input[@id='ap_email']";
	public static String clickOn_ContinueButton = "//span[@id='continue']";
	public static String sendKeys_Password = "//input[@id='ap_password']";
	public static String clickOn_LoginButton = "//span[@id='auth-signin-button']";
	public static String clickOn_SavedDeliveryAddress = "(//a[contains(text(),'Deliver to this address')])[last()]";
	public static String verify_ProductPriceInCheckoutPage = "//span[@class='a-color-price']";
	public static String clickOn_ChangeQuantitiesOrDeleteButton = "//a[contains(text(),'Change quantities or delete')]";
	public static String clickOn_DeleteButtonForProduct = "//a[contains(text(),'Delete')]";
	
	
}
