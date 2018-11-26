package implementations;

import genericinterface.GenericActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class EventListeners implements GenericActions
{
	public void beforeAlertAccept(WebDriver arg0)
	{
	}

	public void afterAlertAccept(WebDriver arg0)
	{
	}

	public void afterAlertDismiss(WebDriver arg0)
	{
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1)
	{
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1)
	{
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2)
	{
	}

	public void afterNavigateBack(WebDriver arg0)
	{
	}

	public void afterNavigateForward(WebDriver arg0)
	{
	}

	public void afterNavigateTo(String arg0, WebDriver arg1)
	{
	}

	public void afterScript(String arg0, WebDriver arg1)
	{
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1)
	{
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1)
	{
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2)
	{
	}

	public void beforeNavigateBack(WebDriver arg0)
	{
	}

	public void beforeNavigateForward(WebDriver arg0)
	{
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1)
	{
	}

	public void beforeScript(String arg0, WebDriver arg1)
	{
	}

	public void onException(Throwable arg0, WebDriver arg1)
	{
	}
}
