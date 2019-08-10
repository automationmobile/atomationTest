package steps;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import implementations.ActionsImplementation;
import implementations.ReusableMethodsImplementation;
import implementations.TestWebDriverMethodImplementations;
import implementations.UploadImage;
import objectsrepository.Amazon_Objects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import common.Assert;

public class Amazon_Steps
{
	
	
	
	
	public static void sendKeys_SearchBox(WebDriver driver,String productName)
	{
		String[] val={Amazon_Objects.sendKeys_SearchBox};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, productName);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	
	public static void clickOn_SearchButton(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_SearchButton};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void clickOn_Product(WebDriver driver,String productName)
	{
		String[] val={Amazon_Objects.clickOn_Product(driver, productName)};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void clickOn_AddToCart(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_AddToCart};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void clickOn_CartButton(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_CartButton};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void clickOn_ProceedToPayButton(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_ProceedToPayButton};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void sendKeys_Email(WebDriver driver,String emailIdOrMobileNumber)
	{
		String[] val={Amazon_Objects.sendKeys_Email};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, emailIdOrMobileNumber);
		TestWebDriverMethodImplementations.smallSleep(driver);
	}
	public static void clickOn_ContinueButton(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_ContinueButton};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void sendKeys_Password(WebDriver driver,String password)
	{
		String[] val={Amazon_Objects.sendKeys_Password};
		implementations.ActionsImplementation.sendKeysLocator(driver, "xpath", val, password);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	
	public static void clickOn_LoginButton(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_LoginButton};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void clickOn_SavedDeliveryAddress(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_SavedDeliveryAddress};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	
	public static void clickOn_ChangeQuantitiesOrDeleteButton(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_ChangeQuantitiesOrDeleteButton};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	public static void clickOn_DeleteButtonForProduct(WebDriver driver)
	{
		String[] val={Amazon_Objects.clickOn_DeleteButtonForProduct};
		implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
		TestWebDriverMethodImplementations.syncSleep(driver);
	}
	
	
	
	public static void amazonProductPriceValidation(WebDriver driver,String productName,String emailIdOrMobileNumber,String password) throws Exception
	{
		sendKeys_SearchBox(driver, productName);
		clickOn_SearchButton(driver);
		clickOn_Product(driver, productName);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		TestWebDriverMethodImplementations.syncSleep(driver);
		clickOn_AddToCart(driver);
		clickOn_CartButton(driver);
		String verify_PriceOfProductInCart= TestWebDriverMethodImplementations.getText(driver, Amazon_Objects.verify_PriceOfProductInCart);
		clickOn_ProceedToPayButton(driver);
		sendKeys_Email(driver, emailIdOrMobileNumber);
		clickOn_ContinueButton(driver);
		sendKeys_Password(driver, password);
		clickOn_LoginButton(driver);
		clickOn_SavedDeliveryAddress(driver);
		String verify_PriceOfProductInCheckOut= TestWebDriverMethodImplementations.getText(driver, Amazon_Objects.verify_ProductPriceInCheckoutPage);
		TestWebDriverMethodImplementations.smallSleep(driver);
		System.out.println(verify_PriceOfProductInCart);
		System.out.println(verify_PriceOfProductInCheckOut);
		String prodPriceInCart=verify_PriceOfProductInCart.replace(",", "").replace(".00", "");
		System.out.println(prodPriceInCart);
		String prodPriceInCheckout=verify_PriceOfProductInCart.replace(",", "").replace(".00", "");
		System.out.println(prodPriceInCheckout);
		boolean verify=prodPriceInCart.contains(prodPriceInCheckout);
		if(verify==false)
		{
			throw new Exception();
		}else
		{
			System.out.println("Product price is same in all pages");
		}
	}
	
	
	
	

}
