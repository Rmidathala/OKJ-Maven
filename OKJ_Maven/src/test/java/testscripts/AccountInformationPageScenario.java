package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class AccountInformationPageScenario  extends TestConfigurations{

	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void myAccountPageValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the My Account page");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
}
