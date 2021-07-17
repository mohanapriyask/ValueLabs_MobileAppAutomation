package negativescenario;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwagLabInvalidUsername {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		try {
			/* Create and set desired capabilities */
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("appPackage", "com.swaglabsmobileapp");
			dc.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
			dc.setCapability("deviceName", "Samsung Phone");
			dc.setCapability("platformName", "Android");

			/* Create object for Android */
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

			Thread.sleep(7000);
			/* Invalid Username */
			driver.findElementByXPath("(//android.widget.EditText)[1]").sendKeys("user");
			driver.findElementByXPath("(//android.widget.EditText)[2]").sendKeys("secret_sauce");
			driver.findElementByClassName("android.widget.TextView").click();
		} catch (Exception e) {
			System.out.println("Exception is :  " + e);
		}
	}

}
