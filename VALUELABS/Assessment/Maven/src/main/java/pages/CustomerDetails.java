package pages;

import base.AndroidAppSpecificMethods;

public class CustomerDetails extends AndroidAppSpecificMethods{

	public CustomerDetails enterFirstName() {
		driver.findElementByAccessibilityId("test-First Name").sendKeys("Mohana");
return this;

	}
	
	public CustomerDetails enterLastName() {
		driver.findElementByAccessibilityId("test-Last Name").sendKeys("Sampathkumar");
		return this;

			}
	
	public CustomerDetails enterPinCode() {
		driver.findElementByAccessibilityId("test-Zip/Postal Code").sendKeys("600051");
		return this;

			}
	public OrderingPage clickContinue() throws InterruptedException {
		driver.findElementByAccessibilityId("test-CONTINUE").click();
		Thread.sleep(2000);
		return new OrderingPage();

			}
}
