package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class HomePageScenario extends TestConfigurations {

	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void validateOKJHomepage(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the OKJ Home page");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void headerNavigationValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test for Validation of the header link navigation");
		
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void footerNavigationValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to validate the functional aspects of the footer section");
		
		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void categoryLandingPageValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test validate functionality of Category landing pagee");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void subCategoryLandingPageValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to validate functionality of Sub Category landing page");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void searchFunctionalityValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to validate the Search Functionality is working");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

}
