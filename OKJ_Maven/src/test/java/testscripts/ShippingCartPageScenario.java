package testscripts;

import org.testng.annotations.Test;

import com.cognizant.craft.DriverScript;
import com.cognizant.craft.TestConfigurations;
import com.cognizant.framework.selenium.SeleniumTestParameters;

public class ShippingCartPageScenario extends TestConfigurations{

	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void shoppingCartPageValidation(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test To validate the functional aspects of the shopping cart page");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
	@Test(dataProvider = "BrowserStackChrome", dataProviderClass = TestConfigurations.class)
	public void checkOutValidationWithPaypalAsPaymentMethod(SeleniumTestParameters testParameters) {

		testParameters.setCurrentTestDescription("Test to Check Out Validation with Paypal as Payment method");

		DriverScript driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();

		tearDownTestRunner(testParameters, driverScript);
	}
}
