package br.com.appium.factory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver = null;
	
	public static AndroidDriver<MobileElement> getDriver() {
		if(driver == null) {
			instaceDriver();
		}
		return driver;
	}
	
	private static void instaceDriver() {
		File file = new File("C:\\Users\\Usuario\\eclipse-workspace\\appium-tests\\src\\main\\resources\\alura_esporte.apk");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		
		URL url = null;
		try {
			url = new URL("http://localhost:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver = new AndroidDriver(url,desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void killingDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
		
	}
}