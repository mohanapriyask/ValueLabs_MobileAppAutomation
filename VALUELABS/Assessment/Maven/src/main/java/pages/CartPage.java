package pages;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import base.AndroidAppSpecificMethods;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CartPage extends AndroidAppSpecificMethods{

	public CartPage clickCartImage() {
		
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView")
				.click();
		return this;
	}
	
	public CartPage clickRemoveButtonforFirtItem() {
		
		driver.findElementByXPath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])[1]").click();
		return this;

	}
	
	public CustomerDetails clickCheckOutButton() throws InterruptedException {
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		int width = size.getWidth();
		int height = size.getHeight();

		// find the position that we want to touch
		int startX = (int) (width * 0.5);
		int startY = (int) (height * 0.8);

		int endX = (int) (width * 0.5);
		int endY = (int) (height * 0.2);

		new TouchAction<>(driver).press(PointOption.point(startX, startY))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(endX, endY))
				.release().perform();
		Thread.sleep(4000);
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']").click();
		Thread.sleep(2000);
		return new CustomerDetails();
	}
}
