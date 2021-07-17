package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidAppSpecificMethods {

	public static AppiumDriver<WebElement> driver;
	@BeforeMethod
	public void launchApp() throws MalformedURLException, InterruptedException
	{
		/* Create and set desired capabilities */
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("appPackage", "com.swaglabsmobileapp");
		dc.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
		dc.setCapability("deviceName", "Samsung Phone");
		dc.setCapability("platformName", "Android");
		
		/* Create object for Android */
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(7000);
	}
}
