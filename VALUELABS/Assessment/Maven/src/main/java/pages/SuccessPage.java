package pages;

import base.AndroidAppSpecificMethods;

public class SuccessPage extends AndroidAppSpecificMethods{

	public HomePage clickBacktoHomeButton() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElementByAccessibilityId("test-BACK HOME").click();
		return new HomePage();

	}
}
