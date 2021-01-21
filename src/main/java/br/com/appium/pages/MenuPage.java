package br.com.appium.pages;

import br.com.appium.mybasepage.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MenuPage extends BasePage {

	public MenuPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public Boolean verifyTextMenu(String text) {
		return this.verifyText(text);
	}
}
