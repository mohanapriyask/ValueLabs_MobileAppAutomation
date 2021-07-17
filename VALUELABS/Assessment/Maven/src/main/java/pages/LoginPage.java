package pages;

import base.AndroidAppSpecificMethods;

public class LoginPage extends AndroidAppSpecificMethods {

	public LoginPage enterUsername() {
		driver.findElementByXPath("(//android.widget.EditText)[1]").sendKeys("standard_user");
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElementByXPath("(//android.widget.EditText)[2]").sendKeys("secret_sauce");
		return this;
	}

	public HomePage clickLoginButton() throws InterruptedException {
		driver.findElementByClassName("android.widget.TextView").click();
		Thread.sleep(2000);
		return new HomePage();
	}
}
