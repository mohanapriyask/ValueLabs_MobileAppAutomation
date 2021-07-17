package testcases;

import org.testng.annotations.Test;

import base.AndroidAppSpecificMethods;
import pages.LoginPage;

public class SwagLabOrderingItem extends AndroidAppSpecificMethods{
	
	@Test
	public void runSwagLabApp() throws InterruptedException{
		
		LoginPage login = new LoginPage();
		login.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickAddtoCartButtonforFirstItem()
		.clickAddtoCartButtonforSecondItem()
		.clickCartImage()
		.clickCartImage()
		.clickRemoveButtonforFirtItem()
		.clickCheckOutButton()
		.enterFirstName()
		.enterLastName()
		.enterPinCode()
		.clickContinue()
		.clickFinishButton()
		.clickBacktoHomeButton();
		
	}

}
