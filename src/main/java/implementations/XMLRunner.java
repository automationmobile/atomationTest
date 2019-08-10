package implementations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.collections.Lists;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

 

public class XMLRunner
{
	public static void main(String args[]) throws InterruptedException, IOException
	{

		
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("./testng.xml");
		testng.setTestSuites(suites);
		testng.run();
		
		Thread.sleep(10000);
		MailUtil.sendMailWithAttachement(ReusableMethodsImplementation.count);
	}
}
