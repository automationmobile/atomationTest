package implementations;

import genericinterface.GenericActions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import steps.Personalized_Steps;

public abstract class LogGenerator implements GenericActions
{
	public static Logger logReport(WebDriver driver, String classname, String logFilePath)
	{
		org.apache.log4j.Logger logger = LogManager.getLogger(Personalized_Steps.class.getName());
		DOMConfigurator.configure(logFilePath);
		return logger;
	}
}
