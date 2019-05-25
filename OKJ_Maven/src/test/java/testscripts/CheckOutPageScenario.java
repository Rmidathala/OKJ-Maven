package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class CheckOutPageScenario extends TestConfigurations {

	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void guestCheckOutValidationWithVISAcardPayment(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the Guest  user place order successfully with VISA card payment");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void guestCheckOutValidationwithMASTERcardPayment(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the Guest  user place order successfully with MASTER card payment");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void guestCheckOutValidationwithDISCOVERcardPayment(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the Guest  user place order successfully with DISCOVER  card Payment");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void registeredCheckOutValidationwithVISAcardPayment(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the Registered  user place order successfully with VISA card payment");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void registeredCheckOutValidationwithMASTERcardPayment(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test To Validate the Registered  user place order successfully with MASTER card payment");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void registeredCheckOutValidationwithDISCOVERcardPayment(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the Registered  user place order successfully with DISCOVER  card Payment");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
}
