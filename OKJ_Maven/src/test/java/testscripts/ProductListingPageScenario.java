package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class ProductListingPageScenario extends TestConfigurations{

	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void pLPValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Validate the functionality of PLP");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}

}
