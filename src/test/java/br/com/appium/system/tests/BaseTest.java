package br.com.appium.system.tests;

import org.junit.After;
import org.junit.Before;

import br.com.appium.factory.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	protected AndroidDriver<MobileElement> driver = null;
	
	@Before
	public void starting_driver() {
		driver = DriverFactory.getDriver();
	}
	
	@After
	public void finishing_driver() {
		DriverFactory.killingDriver();
	}
}
