package pages;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import base.AndroidAppSpecificMethods;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OrderingPage extends AndroidAppSpecificMethods{

	public SuccessPage clickFinishButton() throws InterruptedException {
		
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
		driver.findElementByAccessibilityId("test-FINISH").click();
		return new SuccessPage();

	}
}
