package pages;

import base.AndroidAppSpecificMethods;

public class HomePage extends AndroidAppSpecificMethods{

	public HomePage clickAddtoCartButtonforFirstItem() {
		
		 driver.findElementByXPath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]").click();
		 return this;

	}
	
	public CartPage clickAddtoCartButtonforSecondItem() {
		
		 driver.findElementByXPath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]").click();
		 return new CartPage();

	}
}
