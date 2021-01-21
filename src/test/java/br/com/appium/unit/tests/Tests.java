package br.com.appium.unit.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Test;

import br.com.appium.factory.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Tests {

	@Test
	public void testGetDriver() throws MalformedURLException {
		AndroidDriver<MobileElement> driver = DriverFactory.getDriver();
		assertEquals(driver.getCapabilities().getPlatform().name(),"LINUX");
	}
}
